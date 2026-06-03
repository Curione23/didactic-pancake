package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlTextureFrameBuffer.class */
public class GlTextureFrameBuffer {
    private final int pixelFormat;
    private int frameBufferId;
    private int textureId;
    private int width;
    private int height;

    public GlTextureFrameBuffer(int r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            switch(r0) {
                case 6407: goto L20;
                case 6408: goto L20;
                case 6409: goto L20;
                default: goto L28;
            }
        L20:
            r0 = r4
            r1 = r5
            r0.pixelFormat = r1
            goto L36
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r5
            java.lang.String r2 = "Invalid pixel format: " + r2
            r1.<init>(r2)
            throw r0
        L36:
            r0 = r4
            r1 = 0
            r0.width = r1
            r0 = r4
            r1 = 0
            r0.height = r1
            return
    }

    public void setSize(int r11, int r12) {
            r10 = this;
            r0 = r11
            if (r0 <= 0) goto L8
            r0 = r12
            if (r0 > 0) goto L17
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r11
            r3 = r12
            java.lang.String r2 = "Invalid size: " + r2 + "x" + r3
            r1.<init>(r2)
            throw r0
        L17:
            r0 = r11
            r1 = r10
            int r1 = r1.width
            if (r0 != r1) goto L28
            r0 = r12
            r1 = r10
            int r1 = r1.height
            if (r0 != r1) goto L28
            return
        L28:
            r0 = r10
            r1 = r11
            r0.width = r1
            r0 = r10
            r1 = r12
            r0.height = r1
            r0 = r10
            int r0 = r0.textureId
            if (r0 != 0) goto L43
            r0 = r10
            r1 = 3553(0xde1, float:4.979E-42)
            int r1 = org.webrtc.GlUtil.generateTexture(r1)
            r0.textureId = r1
        L43:
            r0 = r10
            int r0 = r0.frameBufferId
            if (r0 != 0) goto L5b
            r0 = 1
            int[] r0 = new int[r0]
            r13 = r0
            r0 = 1
            r1 = r13
            r2 = 0
            android.opengl.GLES20.glGenFramebuffers(r0, r1, r2)
            r0 = r10
            r1 = r13
            r2 = 0
            r1 = r1[r2]
            r0.frameBufferId = r1
        L5b:
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = r10
            int r1 = r1.textureId
            android.opengl.GLES20.glBindTexture(r0, r1)
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = 0
            r2 = r10
            int r2 = r2.pixelFormat
            r3 = r11
            r4 = r12
            r5 = 0
            r6 = r10
            int r6 = r6.pixelFormat
            r7 = 5121(0x1401, float:7.176E-42)
            r8 = 0
            android.opengl.GLES20.glTexImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 3553(0xde1, float:4.979E-42)
            r1 = 0
            android.opengl.GLES20.glBindTexture(r0, r1)
            java.lang.String r0 = "GlTextureFrameBuffer setSize"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = r10
            int r1 = r1.frameBufferId
            android.opengl.GLES20.glBindFramebuffer(r0, r1)
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = 36064(0x8ce0, float:5.0536E-41)
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = r10
            int r3 = r3.textureId
            r4 = 0
            android.opengl.GLES20.glFramebufferTexture2D(r0, r1, r2, r3, r4)
            r0 = 36160(0x8d40, float:5.0671E-41)
            int r0 = android.opengl.GLES20.glCheckFramebufferStatus(r0)
            r13 = r0
            r0 = r13
            r1 = 36053(0x8cd5, float:5.0521E-41)
            if (r0 == r1) goto Lbe
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r13
            java.lang.String r2 = "Framebuffer not complete, status: " + r2
            r1.<init>(r2)
            throw r0
        Lbe:
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = 0
            android.opengl.GLES20.glBindFramebuffer(r0, r1)
            return
    }

    public int getWidth() {
            r2 = this;
            r0 = r2
            int r0 = r0.width
            return r0
    }

    public int getHeight() {
            r2 = this;
            r0 = r2
            int r0 = r0.height
            return r0
    }

    public int getFrameBufferId() {
            r2 = this;
            r0 = r2
            int r0 = r0.frameBufferId
            return r0
    }

    public int getTextureId() {
            r2 = this;
            r0 = r2
            int r0 = r0.textureId
            return r0
    }

    public void release() {
            r6 = this;
            r0 = 1
            r1 = 1
            int[] r1 = new int[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            int r4 = r4.textureId
            r2[r3] = r4
            r2 = 0
            android.opengl.GLES20.glDeleteTextures(r0, r1, r2)
            r0 = r6
            r1 = 0
            r0.textureId = r1
            r0 = 1
            r1 = 1
            int[] r1 = new int[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            int r4 = r4.frameBufferId
            r2[r3] = r4
            r2 = 0
            android.opengl.GLES20.glDeleteFramebuffers(r0, r1, r2)
            r0 = r6
            r1 = 0
            r0.frameBufferId = r1
            r0 = r6
            r1 = 0
            r0.width = r1
            r0 = r6
            r1 = 0
            r0.height = r1
            return
    }
}
