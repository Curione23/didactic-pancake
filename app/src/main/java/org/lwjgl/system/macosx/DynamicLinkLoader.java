package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/DynamicLinkLoader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/DynamicLinkLoader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/DynamicLinkLoader.class */
public class DynamicLinkLoader {
    public static final int RTLD_LAZY = 1;
    public static final int RTLD_NOW = 2;
    public static final int RTLD_LOCAL = 4;
    public static final int RTLD_GLOBAL = 8;
    public static final long RTLD_NEXT = -1;
    public static final long RTLD_DEFAULT = -2;
    public static final long RTLD_SELF = -3;
    public static final long RTLD_MAIN_ONLY = -5;

    protected DynamicLinkLoader() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long ndlopen(long r0, int r2);

    @org.lwjgl.system.NativeType("void *")
    public static long dlopen(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r4, int r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r4
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r5
            long r0 = ndlopen(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long dlopen(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4, int r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r0 = r4
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2e
        L1c:
            r8 = r0
            r0 = r8
            r1 = r5
            long r0 = ndlopen(r0, r1)     // Catch: java.lang.Throwable -> L2e
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2e:
            r12 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native long ndlerror();

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String dlerror() {
            long r0 = ndlerror()
            r3 = r0
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static native long ndlsym(long r0, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long dlsym(@org.lwjgl.system.NativeType("void *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = ndlsym(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long dlsym(@org.lwjgl.system.NativeType("void *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L33
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = ndlsym(r0, r1)     // Catch: java.lang.Throwable -> L33
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L33:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native int ndlclose(long r0);

    public static int dlclose(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = ndlclose(r0)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
