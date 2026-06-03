package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBDXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBDXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBDXT.class */
public class STBDXT {
    public static final int STB_DXT_NORMAL = 0;
    public static final int STB_DXT_DITHER = 1;
    public static final int STB_DXT_HIGHQUAL = 2;

    protected STBDXT() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nstb_compress_dxt_block(long r0, long r2, int r4, int r5);

    public static void stb_compress_dxt_block(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("int") boolean r9, int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r7
            r1 = r9
            if (r1 == 0) goto L10
            r1 = 16
            goto L12
        L10:
            r1 = 8
        L12:
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = 64
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            if (r2 == 0) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r3 = r10
            nstb_compress_dxt_block(r0, r1, r2, r3)
            return
    }

    public static native void nstb_compress_bc4_block(long r0, long r2);

    public static void stb_compress_bc4_block(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            r1 = 8
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nstb_compress_bc4_block(r0, r1)
            return
    }

    public static native void nstb_compress_bc5_block(long r0, long r2);

    public static void stb_compress_bc5_block(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 32
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nstb_compress_bc5_block(r0, r1)
            return
    }

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
