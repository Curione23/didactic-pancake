package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlUtil.class */
public class GlUtil {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/GlUtil$GlOutOfMemoryException.class */
    public static class GlOutOfMemoryException extends android.opengl.GLException {
        public GlOutOfMemoryException(int r5, java.lang.String r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }
    }

    private GlUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void checkNoGLES2Error(java.lang.String r6) {
            int r0 = android.opengl.GLES20.glGetError()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2b
            r0 = r7
            r1 = 1285(0x505, float:1.8E-42)
            if (r0 != r1) goto L1b
            org.webrtc.GlUtil$GlOutOfMemoryException r0 = new org.webrtc.GlUtil$GlOutOfMemoryException
            r1 = r0
            r2 = r7
            r3 = r6
            r1.<init>(r2, r3)
            goto L2a
        L1b:
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = r7
            java.lang.String r3 = r3 + ": GLES20 error: " + r4
            r1.<init>(r2, r3)
        L2a:
            throw r0
        L2b:
            return
    }

    public static java.nio.FloatBuffer createFloatBuffer(float[] r3) {
            r0 = r3
            int r0 = r0.length
            r1 = 4
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r4 = r0
            r0 = r4
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            r0 = r4
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            r5 = r0
            r0 = r5
            r1 = r3
            java.nio.FloatBuffer r0 = r0.put(r1)
            r0 = r5
            r1 = 0
            java.nio.FloatBuffer r0 = r0.position(r1)
            r0 = r5
            return r0
    }

    public static int generateTexture(int r4) {
            r0 = 1
            int[] r0 = new int[r0]
            r5 = r0
            r0 = 1
            r1 = r5
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            r0 = r5
            r1 = 0
            r0 = r0[r1]
            r6 = r0
            r0 = r4
            r1 = r6
            android.opengl.GLES20.glBindTexture(r0, r1)
            r0 = r4
            r1 = 10241(0x2801, float:1.435E-41)
            r2 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r0, r1, r2)
            r0 = r4
            r1 = 10240(0x2800, float:1.4349E-41)
            r2 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r0, r1, r2)
            r0 = r4
            r1 = 10242(0x2802, float:1.4352E-41)
            r2 = 1191259904(0x47012f00, float:33071.0)
            android.opengl.GLES20.glTexParameterf(r0, r1, r2)
            r0 = r4
            r1 = 10243(0x2803, float:1.4354E-41)
            r2 = 1191259904(0x47012f00, float:33071.0)
            android.opengl.GLES20.glTexParameterf(r0, r1, r2)
            java.lang.String r0 = "generateTexture"
            checkNoGLES2Error(r0)
            r0 = r6
            return r0
    }
}
