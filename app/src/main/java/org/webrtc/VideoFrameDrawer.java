package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrameDrawer.class */
public class VideoFrameDrawer {
    public static final java.lang.String TAG = "VideoFrameDrawer";
    static final float[] srcPoints = null;
    private final float[] dstPoints;
    private final android.graphics.Point renderSize;
    private int renderWidth;
    private int renderHeight;
    private final org.webrtc.VideoFrameDrawer.YuvUploader yuvUploader;

    @androidx.annotation.Nullable
    private org.webrtc.VideoFrame lastI420Frame;
    private final android.graphics.Matrix renderMatrix;

    /* JADX INFO: renamed from: org.webrtc.VideoFrameDrawer$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrameDrawer$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = null;

        static {
                org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = org.webrtc.VideoFrame.TextureBuffer.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.VideoFrameDrawer.AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = r0
                int[] r0 = org.webrtc.VideoFrameDrawer.AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type     // Catch: java.lang.NoSuchFieldError -> L17
                org.webrtc.VideoFrame$TextureBuffer$Type r1 = org.webrtc.VideoFrame.TextureBuffer.Type.OES     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.webrtc.VideoFrameDrawer.AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type     // Catch: java.lang.NoSuchFieldError -> L26
                org.webrtc.VideoFrame$TextureBuffer$Type r1 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrameDrawer$YuvUploader.class */
    private static class YuvUploader {

        @androidx.annotation.Nullable
        private java.nio.ByteBuffer copyBuffer;

        @androidx.annotation.Nullable
        private int[] yuvTextures;

        private YuvUploader() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public int[] uploadYuvData(int r11, int r12, int[] r13, java.nio.ByteBuffer[] r14) {
                r10 = this;
                r0 = 3
                int[] r0 = new int[r0]
                r1 = r0
                r2 = 0
                r3 = r11
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = r11
                r4 = 2
                int r3 = r3 / r4
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = r11
                r4 = 2
                int r3 = r3 / r4
                r1[r2] = r3
                r15 = r0
                r0 = 3
                int[] r0 = new int[r0]
                r1 = r0
                r2 = 0
                r3 = r12
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = r12
                r4 = 2
                int r3 = r3 / r4
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = r12
                r4 = 2
                int r3 = r3 / r4
                r1[r2] = r3
                r16 = r0
                r0 = 0
                r17 = r0
                r0 = 0
                r18 = r0
            L30:
                r0 = r18
                r1 = 3
                if (r0 >= r1) goto L5a
                r0 = r13
                r1 = r18
                r0 = r0[r1]
                r1 = r15
                r2 = r18
                r1 = r1[r2]
                if (r0 <= r1) goto L54
                r0 = r17
                r1 = r15
                r2 = r18
                r1 = r1[r2]
                r2 = r16
                r3 = r18
                r2 = r2[r3]
                int r1 = r1 * r2
                int r0 = java.lang.Math.max(r0, r1)
                r17 = r0
            L54:
                int r18 = r18 + 1
                goto L30
            L5a:
                r0 = r17
                if (r0 <= 0) goto L7b
                r0 = r10
                java.nio.ByteBuffer r0 = r0.copyBuffer
                if (r0 == 0) goto L72
                r0 = r10
                java.nio.ByteBuffer r0 = r0.copyBuffer
                int r0 = r0.capacity()
                r1 = r17
                if (r0 >= r1) goto L7b
            L72:
                r0 = r10
                r1 = r17
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
                r0.copyBuffer = r1
            L7b:
                r0 = r10
                int[] r0 = r0.yuvTextures
                if (r0 != 0) goto La5
                r0 = r10
                r1 = 3
                int[] r1 = new int[r1]
                r0.yuvTextures = r1
                r0 = 0
                r18 = r0
            L8c:
                r0 = r18
                r1 = 3
                if (r0 >= r1) goto La5
                r0 = r10
                int[] r0 = r0.yuvTextures
                r1 = r18
                r2 = 3553(0xde1, float:4.979E-42)
                int r2 = org.webrtc.GlUtil.generateTexture(r2)
                r0[r1] = r2
                int r18 = r18 + 1
                goto L8c
            La5:
                r0 = 0
                r18 = r0
            La8:
                r0 = r18
                r1 = 3
                if (r0 >= r1) goto L121
                r0 = 33984(0x84c0, float:4.7622E-41)
                r1 = r18
                int r0 = r0 + r1
                android.opengl.GLES20.glActiveTexture(r0)
                r0 = 3553(0xde1, float:4.979E-42)
                r1 = r10
                int[] r1 = r1.yuvTextures
                r2 = r18
                r1 = r1[r2]
                android.opengl.GLES20.glBindTexture(r0, r1)
                r0 = r13
                r1 = r18
                r0 = r0[r1]
                r1 = r15
                r2 = r18
                r1 = r1[r2]
                if (r0 != r1) goto Ld9
                r0 = r14
                r1 = r18
                r0 = r0[r1]
                r19 = r0
                goto Lfe
            Ld9:
                r0 = r14
                r1 = r18
                r0 = r0[r1]
                r1 = r13
                r2 = r18
                r1 = r1[r2]
                r2 = r10
                java.nio.ByteBuffer r2 = r2.copyBuffer
                r3 = r15
                r4 = r18
                r3 = r3[r4]
                r4 = r15
                r5 = r18
                r4 = r4[r5]
                r5 = r16
                r6 = r18
                r5 = r5[r6]
                org.webrtc.YuvHelper.copyPlane(r0, r1, r2, r3, r4, r5)
                r0 = r10
                java.nio.ByteBuffer r0 = r0.copyBuffer
                r19 = r0
            Lfe:
                r0 = 3553(0xde1, float:4.979E-42)
                r1 = 0
                r2 = 6409(0x1909, float:8.981E-42)
                r3 = r15
                r4 = r18
                r3 = r3[r4]
                r4 = r16
                r5 = r18
                r4 = r4[r5]
                r5 = 0
                r6 = 6409(0x1909, float:8.981E-42)
                r7 = 5121(0x1401, float:7.176E-42)
                r8 = r19
                android.opengl.GLES20.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                int r18 = r18 + 1
                goto La8
            L121:
                r0 = r10
                int[] r0 = r0.yuvTextures
                return r0
        }

        @androidx.annotation.Nullable
        public int[] uploadFromBuffer(org.webrtc.VideoFrame.I420Buffer r7) {
                r6 = this;
                r0 = 3
                int[] r0 = new int[r0]
                r1 = r0
                r2 = 0
                r3 = r7
                int r3 = r3.getStrideY()
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = r7
                int r3 = r3.getStrideU()
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = r7
                int r3 = r3.getStrideV()
                r1[r2] = r3
                r8 = r0
                r0 = 3
                java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]
                r1 = r0
                r2 = 0
                r3 = r7
                java.nio.ByteBuffer r3 = r3.getDataY()
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = r7
                java.nio.ByteBuffer r3 = r3.getDataU()
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = r7
                java.nio.ByteBuffer r3 = r3.getDataV()
                r1[r2] = r3
                r9 = r0
                r0 = r6
                r1 = r7
                int r1 = r1.getWidth()
                r2 = r7
                int r2 = r2.getHeight()
                r3 = r8
                r4 = r9
                int[] r0 = r0.uploadYuvData(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.Nullable
        public int[] getYuvTextures() {
                r2 = this;
                r0 = r2
                int[] r0 = r0.yuvTextures
                return r0
        }

        public void release() {
                r4 = this;
                r0 = r4
                r1 = 0
                r0.copyBuffer = r1
                r0 = r4
                int[] r0 = r0.yuvTextures
                if (r0 == 0) goto L1a
                r0 = 3
                r1 = r4
                int[] r1 = r1.yuvTextures
                r2 = 0
                android.opengl.GLES20.glDeleteTextures(r0, r1, r2)
                r0 = r4
                r1 = 0
                r0.yuvTextures = r1
            L1a:
                return
        }
    }

    public VideoFrameDrawer() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 6
            float[] r1 = new float[r1]
            r0.dstPoints = r1
            r0 = r4
            android.graphics.Point r1 = new android.graphics.Point
            r2 = r1
            r2.<init>()
            r0.renderSize = r1
            r0 = r4
            org.webrtc.VideoFrameDrawer$YuvUploader r1 = new org.webrtc.VideoFrameDrawer$YuvUploader
            r2 = r1
            r2.<init>()
            r0.yuvUploader = r1
            r0 = r4
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r2 = r1
            r2.<init>()
            r0.renderMatrix = r1
            return
    }

    public static void drawTexture(org.webrtc.RendererCommon.GlDrawer r10, org.webrtc.VideoFrame.TextureBuffer r11, android.graphics.Matrix r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r1 = r0
            r2 = r11
            android.graphics.Matrix r2 = r2.getTransformMatrix()
            r1.<init>(r2)
            r19 = r0
            r0 = r19
            r1 = r12
            boolean r0 = r0.preConcat(r1)
            r0 = r19
            float[] r0 = org.webrtc.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(r0)
            r20 = r0
            int[] r0 = org.webrtc.VideoFrameDrawer.AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type
            r1 = r11
            org.webrtc.VideoFrame$TextureBuffer$Type r1 = r1.getType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L44;
                case 2: goto L60;
                default: goto L7c;
            }
        L44:
            r0 = r10
            r1 = r11
            int r1 = r1.getTextureId()
            r2 = r20
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r0.drawOes(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L86
        L60:
            r0 = r10
            r1 = r11
            int r1 = r1.getTextureId()
            r2 = r20
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r0.drawRgb(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L86
        L7c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unknown texture type."
            r1.<init>(r2)
            throw r0
        L86:
            return
    }

    private static int distance(float r5, float r6, float r7, float r8) {
            r0 = r7
            r1 = r5
            float r0 = r0 - r1
            double r0 = (double) r0
            r1 = r8
            r2 = r6
            float r1 = r1 - r2
            double r1 = (double) r1
            double r0 = java.lang.Math.hypot(r0, r1)
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            return r0
    }

    private void calculateTransformedRenderSize(int r8, int r9, @androidx.annotation.Nullable android.graphics.Matrix r10) {
            r7 = this;
            r0 = r10
            if (r0 != 0) goto Lf
            r0 = r7
            r1 = r8
            r0.renderWidth = r1
            r0 = r7
            r1 = r9
            r0.renderHeight = r1
            return
        Lf:
            r0 = r10
            r1 = r7
            float[] r1 = r1.dstPoints
            float[] r2 = org.webrtc.VideoFrameDrawer.srcPoints
            r0.mapPoints(r1, r2)
            r0 = 0
            r11 = r0
        L1d:
            r0 = r11
            r1 = 3
            if (r0 >= r1) goto L49
            r0 = r7
            float[] r0 = r0.dstPoints
            r1 = r11
            r2 = 2
            int r1 = r1 * r2
            r2 = 0
            int r1 = r1 + r2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r8
            float r3 = (float) r3
            float r2 = r2 * r3
            r0[r1] = r2
            r0 = r7
            float[] r0 = r0.dstPoints
            r1 = r11
            r2 = 2
            int r1 = r1 * r2
            r2 = 1
            int r1 = r1 + r2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r9
            float r3 = (float) r3
            float r2 = r2 * r3
            r0[r1] = r2
            int r11 = r11 + 1
            goto L1d
        L49:
            r0 = r7
            r1 = r7
            float[] r1 = r1.dstPoints
            r2 = 0
            r1 = r1[r2]
            r2 = r7
            float[] r2 = r2.dstPoints
            r3 = 1
            r2 = r2[r3]
            r3 = r7
            float[] r3 = r3.dstPoints
            r4 = 2
            r3 = r3[r4]
            r4 = r7
            float[] r4 = r4.dstPoints
            r5 = 3
            r4 = r4[r5]
            int r1 = distance(r1, r2, r3, r4)
            r0.renderWidth = r1
            r0 = r7
            r1 = r7
            float[] r1 = r1.dstPoints
            r2 = 0
            r1 = r1[r2]
            r2 = r7
            float[] r2 = r2.dstPoints
            r3 = 1
            r2 = r2[r3]
            r3 = r7
            float[] r3 = r3.dstPoints
            r4 = 4
            r3 = r3[r4]
            r4 = r7
            float[] r4 = r4.dstPoints
            r5 = 5
            r4 = r4[r5]
            int r1 = distance(r1, r2, r3, r4)
            r0.renderHeight = r1
            return
    }

    public void drawFrame(org.webrtc.VideoFrame r6, org.webrtc.RendererCommon.GlDrawer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            r0.drawFrame(r1, r2, r3)
            return
    }

    public void drawFrame(org.webrtc.VideoFrame r10, org.webrtc.RendererCommon.GlDrawer r11, android.graphics.Matrix r12) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = 0
            r5 = 0
            r6 = r10
            int r6 = r6.getRotatedWidth()
            r7 = r10
            int r7 = r7.getRotatedHeight()
            r0.drawFrame(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void drawFrame(org.webrtc.VideoFrame r11, org.webrtc.RendererCommon.GlDrawer r12, @androidx.annotation.Nullable android.graphics.Matrix r13, int r14, int r15, int r16, int r17) {
            r10 = this;
            r0 = r11
            int r0 = r0.getRotatedWidth()
            r18 = r0
            r0 = r11
            int r0 = r0.getRotatedHeight()
            r19 = r0
            r0 = r10
            r1 = r18
            r2 = r19
            r3 = r13
            r0.calculateTransformedRenderSize(r1, r2, r3)
            r0 = r10
            int r0 = r0.renderWidth
            if (r0 <= 0) goto L23
            r0 = r10
            int r0 = r0.renderHeight
            if (r0 > 0) goto L36
        L23:
            java.lang.String r0 = "VideoFrameDrawer"
            r1 = r10
            int r1 = r1.renderWidth
            r2 = r10
            int r2 = r2.renderHeight
            java.lang.String r1 = "Illegal frame size: " + r1 + "x" + r2
            org.webrtc.Logging.w(r0, r1)
            return
        L36:
            r0 = r11
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            boolean r0 = r0 instanceof org.webrtc.VideoFrame.TextureBuffer
            r20 = r0
            r0 = r10
            android.graphics.Matrix r0 = r0.renderMatrix
            r0.reset()
            r0 = r10
            android.graphics.Matrix r0 = r0.renderMatrix
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1056964608(0x3f000000, float:0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r20
            if (r0 != 0) goto L62
            r0 = r10
            android.graphics.Matrix r0 = r0.renderMatrix
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            boolean r0 = r0.preScale(r1, r2)
        L62:
            r0 = r10
            android.graphics.Matrix r0 = r0.renderMatrix
            r1 = r11
            int r1 = r1.getRotation()
            float r1 = (float) r1
            boolean r0 = r0.preRotate(r1)
            r0 = r10
            android.graphics.Matrix r0 = r0.renderMatrix
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r13
            if (r0 == 0) goto L88
            r0 = r10
            android.graphics.Matrix r0 = r0.renderMatrix
            r1 = r13
            boolean r0 = r0.preConcat(r1)
        L88:
            r0 = r20
            if (r0 == 0) goto Lb4
            r0 = r10
            r1 = 0
            r0.lastI420Frame = r1
            r0 = r12
            r1 = r11
            org.webrtc.VideoFrame$Buffer r1 = r1.getBuffer()
            org.webrtc.VideoFrame$TextureBuffer r1 = (org.webrtc.VideoFrame.TextureBuffer) r1
            r2 = r10
            android.graphics.Matrix r2 = r2.renderMatrix
            r3 = r10
            int r3 = r3.renderWidth
            r4 = r10
            int r4 = r4.renderHeight
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            drawTexture(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L101
        Lb4:
            r0 = r11
            r1 = r10
            org.webrtc.VideoFrame r1 = r1.lastI420Frame
            if (r0 == r1) goto Ldd
            r0 = r10
            r1 = r11
            r0.lastI420Frame = r1
            r0 = r11
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            org.webrtc.VideoFrame$I420Buffer r0 = r0.toI420()
            r21 = r0
            r0 = r10
            org.webrtc.VideoFrameDrawer$YuvUploader r0 = r0.yuvUploader
            r1 = r21
            int[] r0 = r0.uploadFromBuffer(r1)
            r0 = r21
            r0.release()
        Ldd:
            r0 = r12
            r1 = r10
            org.webrtc.VideoFrameDrawer$YuvUploader r1 = r1.yuvUploader
            int[] r1 = r1.getYuvTextures()
            r2 = r10
            android.graphics.Matrix r2 = r2.renderMatrix
            float[] r2 = org.webrtc.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(r2)
            r3 = r10
            int r3 = r3.renderWidth
            r4 = r10
            int r4 = r4.renderHeight
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.drawYuv(r1, r2, r3, r4, r5, r6, r7, r8)
        L101:
            return
    }

    public org.webrtc.VideoFrame.Buffer prepareBufferForViewportSize(org.webrtc.VideoFrame.Buffer r3, int r4, int r5) {
            r2 = this;
            r0 = r3
            r0.retain()
            r0 = r3
            return r0
    }

    public void release() {
            r3 = this;
            r0 = r3
            org.webrtc.VideoFrameDrawer$YuvUploader r0 = r0.yuvUploader
            r0.release()
            r0 = r3
            r1 = 0
            r0.lastI420Frame = r1
            return
    }

    static {
            r0 = 6
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
            org.webrtc.VideoFrameDrawer.srcPoints = r0
            return
    }
}
