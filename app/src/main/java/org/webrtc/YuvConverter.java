package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/YuvConverter.class */
public final class YuvConverter {
    private static final java.lang.String TAG = "YuvConverter";
    private static final java.lang.String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private final org.webrtc.ThreadUtils.ThreadChecker threadChecker;
    private final org.webrtc.GlTextureFrameBuffer i420TextureFrameBuffer;
    private final org.webrtc.YuvConverter.ShaderCallbacks shaderCallbacks;
    private final org.webrtc.GlGenericDrawer drawer;
    private final org.webrtc.VideoFrameDrawer videoFrameDrawer;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/YuvConverter$ShaderCallbacks.class */
    private static class ShaderCallbacks implements org.webrtc.GlGenericDrawer.ShaderCallbacks {
        private static final float[] yCoeffs = null;
        private static final float[] uCoeffs = null;
        private static final float[] vCoeffs = null;
        private int xUnitLoc;
        private int coeffsLoc;
        private float[] coeffs;
        private float stepSize;

        private ShaderCallbacks() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public void setPlaneY() {
                r3 = this;
                r0 = r3
                float[] r1 = org.webrtc.YuvConverter.ShaderCallbacks.yCoeffs
                r0.coeffs = r1
                r0 = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.stepSize = r1
                return
        }

        public void setPlaneU() {
                r3 = this;
                r0 = r3
                float[] r1 = org.webrtc.YuvConverter.ShaderCallbacks.uCoeffs
                r0.coeffs = r1
                r0 = r3
                r1 = 1073741824(0x40000000, float:2.0)
                r0.stepSize = r1
                return
        }

        public void setPlaneV() {
                r3 = this;
                r0 = r3
                float[] r1 = org.webrtc.YuvConverter.ShaderCallbacks.vCoeffs
                r0.coeffs = r1
                r0 = r3
                r1 = 1073741824(0x40000000, float:2.0)
                r0.stepSize = r1
                return
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(org.webrtc.GlShader r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                java.lang.String r2 = "xUnit"
                int r1 = r1.getUniformLocation(r2)
                r0.xUnitLoc = r1
                r0 = r4
                r1 = r5
                java.lang.String r2 = "coeffs"
                int r1 = r1.getUniformLocation(r2)
                r0.coeffsLoc = r1
                return
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(org.webrtc.GlShader r7, float[] r8, int r9, int r10, int r11, int r12) {
                r6 = this;
                r0 = r6
                int r0 = r0.coeffsLoc
                r1 = 1
                r2 = r6
                float[] r2 = r2.coeffs
                r3 = 0
                android.opengl.GLES20.glUniform4fv(r0, r1, r2, r3)
                r0 = r6
                int r0 = r0.xUnitLoc
                r1 = r6
                float r1 = r1.stepSize
                r2 = r8
                r3 = 0
                r2 = r2[r3]
                float r1 = r1 * r2
                r2 = r9
                float r2 = (float) r2
                float r1 = r1 / r2
                r2 = r6
                float r2 = r2.stepSize
                r3 = r8
                r4 = 1
                r3 = r3[r4]
                float r2 = r2 * r3
                r3 = r9
                float r3 = (float) r3
                float r2 = r2 / r3
                android.opengl.GLES20.glUniform2f(r0, r1, r2)
                return
        }

        static {
                r0 = 4
                float[] r0 = new float[r0]
                r1 = r0
                r2 = 0
                r3 = 1048803767(0x3e8379b7, float:0.256788)
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = 1057033881(0x3f010e99, float:0.504129)
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = 1036550883(0x3dc882e3, float:0.0979059)
                r1[r2] = r3
                r1 = r0
                r2 = 3
                r3 = 1031831681(0x3d808081, float:0.0627451)
                r1[r2] = r3
                org.webrtc.YuvConverter.ShaderCallbacks.yCoeffs = r0
                r0 = 4
                float[] r0 = new float[r0]
                r1 = r0
                r2 = 0
                r3 = -1105737787(0xffffffffbe17c7c5, float:-0.148223)
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = -1097532151(0xffffffffbe94fd09, float:-0.290993)
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = 1054925035(0x3ee0e0eb, float:0.439216)
                r1[r2] = r3
                r1 = r0
                r2 = 3
                r3 = 1056997508(0x3f008084, float:0.501961)
                r1[r2] = r3
                org.webrtc.YuvConverter.ShaderCallbacks.uCoeffs = r0
                r0 = 4
                float[] r0 = new float[r0]
                r1 = r0
                r2 = 0
                r3 = 1054925035(0x3ee0e0eb, float:0.439216)
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = -1094955339(0xffffffffbebc4eb5, float:-0.367788)
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = -1114486649(0xffffffffbd924887, float:-0.0714274)
                r1[r2] = r3
                r1 = r0
                r2 = 3
                r3 = 1056997508(0x3f008084, float:0.501961)
                r1[r2] = r3
                org.webrtc.YuvConverter.ShaderCallbacks.vCoeffs = r0
                return
        }
    }

    public YuvConverter() {
            r4 = this;
            r0 = r4
            org.webrtc.VideoFrameDrawer r1 = new org.webrtc.VideoFrameDrawer
            r2 = r1
            r2.<init>()
            r0.<init>(r1)
            return
    }

    public YuvConverter(org.webrtc.VideoFrameDrawer r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r1 = new org.webrtc.ThreadUtils$ThreadChecker
            r2 = r1
            r2.<init>()
            r0.threadChecker = r1
            r0 = r6
            org.webrtc.GlTextureFrameBuffer r1 = new org.webrtc.GlTextureFrameBuffer
            r2 = r1
            r3 = 6408(0x1908, float:8.98E-42)
            r2.<init>(r3)
            r0.i420TextureFrameBuffer = r1
            r0 = r6
            org.webrtc.YuvConverter$ShaderCallbacks r1 = new org.webrtc.YuvConverter$ShaderCallbacks
            r2 = r1
            r2.<init>()
            r0.shaderCallbacks = r1
            r0 = r6
            org.webrtc.GlGenericDrawer r1 = new org.webrtc.GlGenericDrawer
            r2 = r1
            java.lang.String r3 = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n"
            r4 = r6
            org.webrtc.YuvConverter$ShaderCallbacks r4 = r4.shaderCallbacks
            r2.<init>(r3, r4)
            r0.drawer = r1
            r0 = r6
            r1 = r7
            r0.videoFrameDrawer = r1
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.detachThread()
            return
    }

    @androidx.annotation.Nullable
    public org.webrtc.VideoFrame.I420Buffer convert(org.webrtc.VideoFrame.TextureBuffer r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.webrtc.VideoFrame$I420Buffer r0 = r0.convertInternal(r1)     // Catch: android.opengl.GLException -> L6
            return r0
        L6:
            r6 = move-exception
            java.lang.String r0 = "YuvConverter"
            java.lang.String r1 = "Failed to convert TextureBuffer"
            r2 = r6
            org.webrtc.Logging.w(r0, r1, r2)
            r0 = 0
            return r0
    }

    private org.webrtc.VideoFrame.I420Buffer convertInternal(org.webrtc.VideoFrame.TextureBuffer r11) {
            r10 = this;
            r0 = r10
            org.webrtc.VideoFrameDrawer r0 = r0.videoFrameDrawer
            r1 = r11
            r2 = r11
            int r2 = r2.getWidth()
            r3 = r11
            int r3 = r3.getHeight()
            org.webrtc.VideoFrame$Buffer r0 = r0.prepareBufferForViewportSize(r1, r2, r3)
            org.webrtc.VideoFrame$TextureBuffer r0 = (org.webrtc.VideoFrame.TextureBuffer) r0
            r12 = r0
            r0 = r12
            int r0 = r0.getWidth()
            r13 = r0
            r0 = r12
            int r0 = r0.getHeight()
            r14 = r0
            r0 = r13
            r1 = 7
            int r0 = r0 + r1
            r1 = 8
            int r0 = r0 / r1
            r1 = 8
            int r0 = r0 * r1
            r15 = r0
            r0 = r14
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r16 = r0
            r0 = r14
            r1 = r16
            int r0 = r0 + r1
            r17 = r0
            r0 = r15
            r1 = r17
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = org.webrtc.JniCommon.nativeAllocateByteBuffer(r0)
            r18 = r0
            r0 = r15
            r1 = 4
            int r0 = r0 / r1
            r19 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1056964608(0x3f000000, float:0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r20
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            boolean r0 = r0.preScale(r1, r2)
            r0 = r20
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r10
            org.webrtc.GlTextureFrameBuffer r0 = r0.i420TextureFrameBuffer
            r1 = r19
            r2 = r17
            r0.setSize(r1, r2)
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = r10
            org.webrtc.GlTextureFrameBuffer r1 = r1.i420TextureFrameBuffer
            int r1 = r1.getFrameBufferId()
            android.opengl.GLES20.glBindFramebuffer(r0, r1)
            java.lang.String r0 = "glBindFramebuffer"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            r0 = r10
            org.webrtc.YuvConverter$ShaderCallbacks r0 = r0.shaderCallbacks
            r0.setPlaneY()
            r0 = r10
            org.webrtc.GlGenericDrawer r0 = r0.drawer
            r1 = r12
            r2 = r20
            r3 = r13
            r4 = r14
            r5 = 0
            r6 = 0
            r7 = r19
            r8 = r14
            org.webrtc.VideoFrameDrawer.drawTexture(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r10
            org.webrtc.YuvConverter$ShaderCallbacks r0 = r0.shaderCallbacks
            r0.setPlaneU()
            r0 = r10
            org.webrtc.GlGenericDrawer r0 = r0.drawer
            r1 = r12
            r2 = r20
            r3 = r13
            r4 = r14
            r5 = 0
            r6 = r14
            r7 = r19
            r8 = 2
            int r7 = r7 / r8
            r8 = r16
            org.webrtc.VideoFrameDrawer.drawTexture(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r10
            org.webrtc.YuvConverter$ShaderCallbacks r0 = r0.shaderCallbacks
            r0.setPlaneV()
            r0 = r10
            org.webrtc.GlGenericDrawer r0 = r0.drawer
            r1 = r12
            r2 = r20
            r3 = r13
            r4 = r14
            r5 = r19
            r6 = 2
            int r5 = r5 / r6
            r6 = r14
            r7 = r19
            r8 = 2
            int r7 = r7 / r8
            r8 = r16
            org.webrtc.VideoFrameDrawer.drawTexture(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            r2 = r10
            org.webrtc.GlTextureFrameBuffer r2 = r2.i420TextureFrameBuffer
            int r2 = r2.getWidth()
            r3 = r10
            org.webrtc.GlTextureFrameBuffer r3 = r3.i420TextureFrameBuffer
            int r3 = r3.getHeight()
            r4 = 6408(0x1908, float:8.98E-42)
            r5 = 5121(0x1401, float:7.176E-42)
            r6 = r18
            android.opengl.GLES20.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "YuvConverter.convert"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = 0
            android.opengl.GLES20.glBindFramebuffer(r0, r1)
            r0 = 0
            r21 = r0
            r0 = 0
            r1 = r15
            r2 = r14
            int r1 = r1 * r2
            int r0 = r0 + r1
            r22 = r0
            r0 = r22
            r1 = r15
            r2 = 2
            int r1 = r1 / r2
            int r0 = r0 + r1
            r23 = r0
            r0 = r18
            r1 = 0
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r18
            r1 = 0
            r2 = r15
            r3 = r14
            int r2 = r2 * r3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r18
            java.nio.ByteBuffer r0 = r0.slice()
            r24 = r0
            r0 = r18
            r1 = r22
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r15
            r1 = r16
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0 * r1
            r1 = r15
            r2 = 2
            int r1 = r1 / r2
            int r0 = r0 + r1
            r25 = r0
            r0 = r18
            r1 = r22
            r2 = r25
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r18
            java.nio.ByteBuffer r0 = r0.slice()
            r26 = r0
            r0 = r18
            r1 = r23
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r18
            r1 = r23
            r2 = r25
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r18
            java.nio.ByteBuffer r0 = r0.slice()
            r27 = r0
            r0 = r12
            r0.release()
            r0 = r13
            r1 = r14
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r15
            r6 = r27
            r7 = r15
            r8 = r18
            org.webrtc.VideoFrame$I420Buffer r8 = () -> { // java.lang.Runnable.run():void
                lambda$convertInternal$0(r8);
            }
            org.webrtc.JavaI420Buffer r0 = org.webrtc.JavaI420Buffer.wrap(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public void release() {
            r2 = this;
            r0 = r2
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.checkIsOnValidThread()
            r0 = r2
            org.webrtc.GlGenericDrawer r0 = r0.drawer
            r0.release()
            r0 = r2
            org.webrtc.GlTextureFrameBuffer r0 = r0.i420TextureFrameBuffer
            r0.release()
            r0 = r2
            org.webrtc.VideoFrameDrawer r0 = r0.videoFrameDrawer
            r0.release()
            r0 = r2
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.detachThread()
            return
    }

    private static /* synthetic */ void lambda$convertInternal$0(java.nio.ByteBuffer r2) {
            r0 = r2
            org.webrtc.JniCommon.nativeFreeByteBuffer(r0)
            return
    }
}
