package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlGenericDrawer.class */
class GlGenericDrawer implements org.webrtc.RendererCommon.GlDrawer {
    private static final java.lang.String INPUT_VERTEX_COORDINATE_NAME = "in_pos";
    private static final java.lang.String INPUT_TEXTURE_COORDINATE_NAME = "in_tc";
    private static final java.lang.String TEXTURE_MATRIX_NAME = "tex_mat";
    private static final java.lang.String DEFAULT_VERTEX_SHADER_STRING = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final java.nio.FloatBuffer FULL_RECTANGLE_BUFFER = null;
    private static final java.nio.FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = null;
    private final java.lang.String genericFragmentSource;
    private final java.lang.String vertexShader;
    private final org.webrtc.GlGenericDrawer.ShaderCallbacks shaderCallbacks;

    @androidx.annotation.Nullable
    private org.webrtc.GlGenericDrawer.ShaderType currentShaderType;

    @androidx.annotation.Nullable
    private org.webrtc.GlShader currentShader;
    private int inPosLocation;
    private int inTcLocation;
    private int texMatrixLocation;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlGenericDrawer$ShaderCallbacks.class */
    public interface ShaderCallbacks {
        void onNewShader(org.webrtc.GlShader r1);

        void onPrepareShader(org.webrtc.GlShader r1, float[] r2, int r3, int r4, int r5, int r6);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlGenericDrawer$ShaderType.class */
    public enum ShaderType extends java.lang.Enum<org.webrtc.GlGenericDrawer.ShaderType> {
        public static final org.webrtc.GlGenericDrawer.ShaderType OES = null;
        public static final org.webrtc.GlGenericDrawer.ShaderType RGB = null;
        public static final org.webrtc.GlGenericDrawer.ShaderType YUV = null;
        private static final /* synthetic */ org.webrtc.GlGenericDrawer.ShaderType[] $VALUES = null;

        public static org.webrtc.GlGenericDrawer.ShaderType[] values() {
                org.webrtc.GlGenericDrawer$ShaderType[] r0 = org.webrtc.GlGenericDrawer.ShaderType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.GlGenericDrawer$ShaderType[] r0 = (org.webrtc.GlGenericDrawer.ShaderType[]) r0
                return r0
        }

        public static org.webrtc.GlGenericDrawer.ShaderType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.GlGenericDrawer$ShaderType> r0 = org.webrtc.GlGenericDrawer.ShaderType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.GlGenericDrawer$ShaderType r0 = (org.webrtc.GlGenericDrawer.ShaderType) r0
                return r0
        }

        ShaderType(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.GlGenericDrawer.ShaderType[] $values() {
                r0 = 3
                org.webrtc.GlGenericDrawer$ShaderType[] r0 = new org.webrtc.GlGenericDrawer.ShaderType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.GlGenericDrawer$ShaderType r3 = org.webrtc.GlGenericDrawer.ShaderType.OES
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.GlGenericDrawer$ShaderType r3 = org.webrtc.GlGenericDrawer.ShaderType.RGB
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.GlGenericDrawer$ShaderType r3 = org.webrtc.GlGenericDrawer.ShaderType.YUV
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.GlGenericDrawer$ShaderType r0 = new org.webrtc.GlGenericDrawer$ShaderType
                r1 = r0
                java.lang.String r2 = "OES"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.GlGenericDrawer.ShaderType.OES = r0
                org.webrtc.GlGenericDrawer$ShaderType r0 = new org.webrtc.GlGenericDrawer$ShaderType
                r1 = r0
                java.lang.String r2 = "RGB"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.GlGenericDrawer.ShaderType.RGB = r0
                org.webrtc.GlGenericDrawer$ShaderType r0 = new org.webrtc.GlGenericDrawer$ShaderType
                r1 = r0
                java.lang.String r2 = "YUV"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.GlGenericDrawer.ShaderType.YUV = r0
                org.webrtc.GlGenericDrawer$ShaderType[] r0 = $values()
                org.webrtc.GlGenericDrawer.ShaderType.$VALUES = r0
                return
        }
    }

    static java.lang.String createFragmentShaderString(java.lang.String r5, org.webrtc.GlGenericDrawer.ShaderType r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            org.webrtc.GlGenericDrawer$ShaderType r1 = org.webrtc.GlGenericDrawer.ShaderType.OES
            if (r0 != r1) goto L16
            r0 = r7
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        L16:
            r0 = r7
            java.lang.String r1 = "precision mediump float;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "varying vec2 tc;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            org.webrtc.GlGenericDrawer$ShaderType r1 = org.webrtc.GlGenericDrawer.ShaderType.YUV
            if (r0 != r1) goto L81
            r0 = r7
            java.lang.String r1 = "uniform sampler2D y_tex;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "uniform sampler2D u_tex;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "uniform sampler2D v_tex;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "vec4 sample(vec2 p) {\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "  float y = texture2D(y_tex, p).r * 1.16438;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "  float u = texture2D(u_tex, p).r;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "  float v = texture2D(v_tex, p).r;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "  return vec4(y + 1.59603 * v - 0.874202,\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "    y - 0.391762 * u - 0.812968 * v + 0.531668,\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "    y + 2.01723 * u - 1.08563, 1);\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "}\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lad
        L81:
            r0 = r6
            org.webrtc.GlGenericDrawer$ShaderType r1 = org.webrtc.GlGenericDrawer.ShaderType.OES
            if (r0 != r1) goto L8d
            java.lang.String r0 = "samplerExternalOES"
            goto L8f
        L8d:
            java.lang.String r0 = "sampler2D"
        L8f:
            r8 = r0
            r0 = r7
            java.lang.String r1 = "uniform "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " tex;\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r5
            java.lang.String r2 = "sample("
            java.lang.String r3 = "texture2D(tex, "
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
        Lad:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    public GlGenericDrawer(java.lang.String r6, org.webrtc.GlGenericDrawer.ShaderCallbacks r7) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n"
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    public GlGenericDrawer(java.lang.String r4, java.lang.String r5, org.webrtc.GlGenericDrawer.ShaderCallbacks r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.vertexShader = r1
            r0 = r3
            r1 = r5
            r0.genericFragmentSource = r1
            r0 = r3
            r1 = r6
            r0.shaderCallbacks = r1
            return
    }

    org.webrtc.GlShader createShader(org.webrtc.GlGenericDrawer.ShaderType r7) {
            r6 = this;
            org.webrtc.GlShader r0 = new org.webrtc.GlShader
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.vertexShader
            r3 = r6
            java.lang.String r3 = r3.genericFragmentSource
            r4 = r7
            java.lang.String r3 = createFragmentShaderString(r3, r4)
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawOes(int r9, float[] r10, int r11, int r12, int r13, int r14, int r15, int r16) {
            r8 = this;
            r0 = r8
            org.webrtc.GlGenericDrawer$ShaderType r1 = org.webrtc.GlGenericDrawer.ShaderType.OES
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r15
            r6 = r16
            r0.prepareShader(r1, r2, r3, r4, r5, r6)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            r0 = 36197(0x8d65, float:5.0723E-41)
            r1 = r9
            android.opengl.GLES20.glBindTexture(r0, r1)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            android.opengl.GLES20.glViewport(r0, r1, r2, r3)
            r0 = 5
            r1 = 0
            r2 = 4
            android.opengl.GLES20.glDrawArrays(r0, r1, r2)
            r0 = 36197(0x8d65, float:5.0723E-41)
            r1 = 0
            android.opengl.GLES20.glBindTexture(r0, r1)
            return
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int r9, float[] r10, int r11, int r12, int r13, int r14, int r15, int r16) {
            r8 = this;
            r0 = r8
            org.webrtc.GlGenericDrawer$ShaderType r1 = org.webrtc.GlGenericDrawer.ShaderType.RGB
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r15
            r6 = r16
            r0.prepareShader(r1, r2, r3, r4, r5, r6)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = r9
            android.opengl.GLES20.glBindTexture(r0, r1)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            android.opengl.GLES20.glViewport(r0, r1, r2, r3)
            r0 = 5
            r1 = 0
            r2 = 4
            android.opengl.GLES20.glDrawArrays(r0, r1, r2)
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = 0
            android.opengl.GLES20.glBindTexture(r0, r1)
            return
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] r9, float[] r10, int r11, int r12, int r13, int r14, int r15, int r16) {
            r8 = this;
            r0 = r8
            org.webrtc.GlGenericDrawer$ShaderType r1 = org.webrtc.GlGenericDrawer.ShaderType.YUV
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r15
            r6 = r16
            r0.prepareShader(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r17 = r0
        L12:
            r0 = r17
            r1 = 3
            if (r0 >= r1) goto L30
            r0 = 33984(0x84c0, float:4.7622E-41)
            r1 = r17
            int r0 = r0 + r1
            android.opengl.GLES20.glActiveTexture(r0)
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = r9
            r2 = r17
            r1 = r1[r2]
            android.opengl.GLES20.glBindTexture(r0, r1)
            int r17 = r17 + 1
            goto L12
        L30:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            android.opengl.GLES20.glViewport(r0, r1, r2, r3)
            r0 = 5
            r1 = 0
            r2 = 4
            android.opengl.GLES20.glDrawArrays(r0, r1, r2)
            r0 = 0
            r17 = r0
        L44:
            r0 = r17
            r1 = 3
            if (r0 >= r1) goto L5f
            r0 = 33984(0x84c0, float:4.7622E-41)
            r1 = r17
            int r0 = r0 + r1
            android.opengl.GLES20.glActiveTexture(r0)
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = 0
            android.opengl.GLES20.glBindTexture(r0, r1)
            int r17 = r17 + 1
            goto L44
        L5f:
            return
    }

    private void prepareShader(org.webrtc.GlGenericDrawer.ShaderType r9, float[] r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r0 = r9
            r1 = r8
            org.webrtc.GlGenericDrawer$ShaderType r1 = r1.currentShaderType
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            r0 = r8
            org.webrtc.GlShader r0 = r0.currentShader
            r15 = r0
            goto Laa
        L14:
            r0 = r8
            r1 = 0
            r0.currentShaderType = r1
            r0 = r8
            org.webrtc.GlShader r0 = r0.currentShader
            if (r0 == 0) goto L2c
            r0 = r8
            org.webrtc.GlShader r0 = r0.currentShader
            r0.release()
            r0 = r8
            r1 = 0
            r0.currentShader = r1
        L2c:
            r0 = r8
            r1 = r9
            org.webrtc.GlShader r0 = r0.createShader(r1)
            r15 = r0
            r0 = r8
            r1 = r9
            r0.currentShaderType = r1
            r0 = r8
            r1 = r15
            r0.currentShader = r1
            r0 = r15
            r0.useProgram()
            r0 = r9
            org.webrtc.GlGenericDrawer$ShaderType r1 = org.webrtc.GlGenericDrawer.ShaderType.YUV
            if (r0 != r1) goto L6e
            r0 = r15
            java.lang.String r1 = "y_tex"
            int r0 = r0.getUniformLocation(r1)
            r1 = 0
            android.opengl.GLES20.glUniform1i(r0, r1)
            r0 = r15
            java.lang.String r1 = "u_tex"
            int r0 = r0.getUniformLocation(r1)
            r1 = 1
            android.opengl.GLES20.glUniform1i(r0, r1)
            r0 = r15
            java.lang.String r1 = "v_tex"
            int r0 = r0.getUniformLocation(r1)
            r1 = 2
            android.opengl.GLES20.glUniform1i(r0, r1)
            goto L79
        L6e:
            r0 = r15
            java.lang.String r1 = "tex"
            int r0 = r0.getUniformLocation(r1)
            r1 = 0
            android.opengl.GLES20.glUniform1i(r0, r1)
        L79:
            java.lang.String r0 = "Create shader"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            r0 = r8
            org.webrtc.GlGenericDrawer$ShaderCallbacks r0 = r0.shaderCallbacks
            r1 = r15
            r0.onNewShader(r1)
            r0 = r8
            r1 = r15
            java.lang.String r2 = "tex_mat"
            int r1 = r1.getUniformLocation(r2)
            r0.texMatrixLocation = r1
            r0 = r8
            r1 = r15
            java.lang.String r2 = "in_pos"
            int r1 = r1.getAttribLocation(r2)
            r0.inPosLocation = r1
            r0 = r8
            r1 = r15
            java.lang.String r2 = "in_tc"
            int r1 = r1.getAttribLocation(r2)
            r0.inTcLocation = r1
        Laa:
            r0 = r15
            r0.useProgram()
            r0 = r8
            int r0 = r0.inPosLocation
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            r0 = r8
            int r0 = r0.inPosLocation
            r1 = 2
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            java.nio.FloatBuffer r5 = org.webrtc.GlGenericDrawer.FULL_RECTANGLE_BUFFER
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            r0 = r8
            int r0 = r0.inTcLocation
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            r0 = r8
            int r0 = r0.inTcLocation
            r1 = 2
            r2 = 5126(0x1406, float:7.183E-42)
            r3 = 0
            r4 = 0
            java.nio.FloatBuffer r5 = org.webrtc.GlGenericDrawer.FULL_RECTANGLE_TEXTURE_BUFFER
            android.opengl.GLES20.glVertexAttribPointer(r0, r1, r2, r3, r4, r5)
            r0 = r8
            int r0 = r0.texMatrixLocation
            r1 = 1
            r2 = 0
            r3 = r10
            r4 = 0
            android.opengl.GLES20.glUniformMatrix4fv(r0, r1, r2, r3, r4)
            r0 = r8
            org.webrtc.GlGenericDrawer$ShaderCallbacks r0 = r0.shaderCallbacks
            r1 = r15
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.onPrepareShader(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "Prepare shader"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            return
    }

    @Override // org.webrtc.RendererCommon.GlDrawer
    public void release() {
            r3 = this;
            r0 = r3
            org.webrtc.GlShader r0 = r0.currentShader
            if (r0 == 0) goto L18
            r0 = r3
            org.webrtc.GlShader r0 = r0.currentShader
            r0.release()
            r0 = r3
            r1 = 0
            r0.currentShader = r1
            r0 = r3
            r1 = 0
            r0.currentShaderType = r1
        L18:
            return
    }

    static {
            r0 = 8
            float[] r0 = new float[r0]
            r1 = r0
            r2 = 0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            java.nio.FloatBuffer r0 = org.webrtc.GlUtil.createFloatBuffer(r0)
            org.webrtc.GlGenericDrawer.FULL_RECTANGLE_BUFFER = r0
            r0 = 8
            float[] r0 = new float[r0]
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            java.nio.FloatBuffer r0 = org.webrtc.GlUtil.createFloatBuffer(r0)
            org.webrtc.GlGenericDrawer.FULL_RECTANGLE_TEXTURE_BUFFER = r0
            return
    }
}
