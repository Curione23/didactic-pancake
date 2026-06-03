package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/UIO.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/UIO.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/UIO.class */
public class UIO {
    public static final int UIO_FASTIOV = 8;
    public static final int UIO_MAXIOV = 1024;
    public static final int RWF_HIPRI = 1;
    public static final int RWF_DSYNC = 2;
    public static final int RWF_SYNC = 4;
    public static final int RWF_NOWAIT = 8;
    public static final int RWF_APPEND = 16;

    protected UIO() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nreadv(int r0, long r1, int r3);

    @org.lwjgl.system.NativeType("ssize_t")
    public static long readv(int r5, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r6, int r7) {
            r0 = r5
            r1 = r6
            long r1 = r1.address()
            r2 = r7
            long r0 = nreadv(r0, r1, r2)
            return r0
    }

    public static native long nwritev(int r0, long r1, int r3);

    @org.lwjgl.system.NativeType("ssize_t")
    public static long writev(int r5, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r6, int r7) {
            r0 = r5
            r1 = r6
            long r1 = r1.address()
            r2 = r7
            long r0 = nwritev(r0, r1, r2)
            return r0
    }

    public static native long npreadv(int r0, long r1, int r3, long r4);

    @org.lwjgl.system.NativeType("ssize_t")
    public static long preadv(int r7, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r8, int r9, @org.lwjgl.system.NativeType("off_t") long r10) {
            r0 = r7
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            r3 = r10
            long r0 = npreadv(r0, r1, r2, r3)
            return r0
    }

    public static native long npwritev(int r0, long r1, int r3, long r4);

    @org.lwjgl.system.NativeType("ssize_t")
    public static long pwritev(int r7, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r8, int r9, @org.lwjgl.system.NativeType("off_t") long r10) {
            r0 = r7
            r1 = r8
            long r1 = r1.address()
            r2 = r9
            r3 = r10
            long r0 = npwritev(r0, r1, r2, r3)
            return r0
    }

    public static native long nprocess_vm_readv(int r0, long r1, long r3, long r5, long r7, long r9);

    @org.lwjgl.system.NativeType("ssize_t")
    public static long process_vm_readv(@org.lwjgl.system.NativeType("pid_t") int r12, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r13, @org.lwjgl.system.NativeType("unsigned long int") long r14, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r16, @org.lwjgl.system.NativeType("unsigned long int") long r17, @org.lwjgl.system.NativeType("unsigned long int") long r19) {
            r0 = r12
            r1 = r13
            long r1 = r1.address()
            r2 = r14
            r3 = r16
            long r3 = r3.address()
            r4 = r17
            r5 = r19
            long r0 = nprocess_vm_readv(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native long nprocess_vm_writev(int r0, long r1, long r3, long r5, long r7, long r9);

    @org.lwjgl.system.NativeType("ssize_t")
    public static long process_vm_writev(@org.lwjgl.system.NativeType("pid_t") int r12, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r13, @org.lwjgl.system.NativeType("unsigned long int") long r14, @org.lwjgl.system.NativeType("struct iovec const *") org.lwjgl.system.linux.IOVec r16, @org.lwjgl.system.NativeType("unsigned long int") long r17, @org.lwjgl.system.NativeType("unsigned long int") long r19) {
            r0 = r12
            r1 = r13
            long r1 = r1.address()
            r2 = r14
            r3 = r16
            long r3 = r3.address()
            r4 = r17
            r5 = r19
            long r0 = nprocess_vm_writev(r0, r1, r2, r3, r4, r5)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
