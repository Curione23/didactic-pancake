package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Stat.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Stat.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Stat.class */
public class Stat {
    protected Stat() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nstat(long r0, long r2);

    public static int stat(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("struct stat *") long r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r0 = nstat(r0, r1)
            return r0
    }

    public static int stat(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5, @org.lwjgl.system.NativeType("struct stat *") long r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r5
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L33
            r10 = r0
            r0 = r10
            r1 = r6
            int r0 = nstat(r0, r1)     // Catch: java.lang.Throwable -> L33
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L33:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native int nfstat(int r0, long r1);

    public static int fstat(int r4, @org.lwjgl.system.NativeType("struct stat *") long r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r5
            int r0 = nfstat(r0, r1)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
