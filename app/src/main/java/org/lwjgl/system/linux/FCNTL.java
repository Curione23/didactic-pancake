package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/FCNTL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/FCNTL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/FCNTL.class */
public class FCNTL {
    public static final int O_ACCMODE = 3;
    public static final int O_RDONLY = 0;
    public static final int O_WRONLY = 1;
    public static final int O_RDWR = 2;
    public static final int O_APPEND = 1024;
    public static final int O_ASYNC = 8192;
    public static final int O_CLOEXEC = 524288;
    public static final int O_CREAT = 64;
    public static final int O_DIRECT = 16384;
    public static final int O_DIRECTORY = 65536;
    public static final int O_DSYNC = 4096;
    public static final int O_EXCL = 128;
    public static final int O_LARGEFILE = 32768;
    public static final int O_NOATIME = 262144;
    public static final int O_NOCTTY = 256;
    public static final int O_NOFOLLOW = 131072;
    public static final int O_NONBLOCK = 2048;
    public static final int O_NDELAY = 2048;
    public static final int O_PATH = 2097152;
    public static final int O_SYNC = 1052672;
    public static final int O_TMPFILE = 4259840;
    public static final int O_TRUNC = 512;
    public static final int S_IFMT = 61440;
    public static final int S_IFBLK = 24576;
    public static final int S_IFCHR = 8192;
    public static final int S_IFIFO = 4096;
    public static final int S_IFREG = 32768;
    public static final int S_IFDIR = 16384;
    public static final int S_IFLNK = 40960;
    public static final int S_IFSOCK = 49152;
    public static final int S_IRWXU = 448;
    public static final int S_IRUSR = 256;
    public static final int S_IWUSR = 128;
    public static final int S_IXUSR = 64;
    public static final int S_IRWXG = 56;
    public static final int S_IRGRP = 32;
    public static final int S_IWGRP = 16;
    public static final int S_IXGRP = 8;
    public static final int S_IRWXO = 7;
    public static final int S_IROTH = 4;
    public static final int S_IWOTH = 2;
    public static final int S_IXOTH = 1;
    public static final int S_ISUID = 2048;
    public static final int S_ISGID = 1024;
    public static final int S_ISVTX = 512;
    public static final int F_DUPFD = 0;
    public static final int F_GETFD = 1;
    public static final int F_SETFD = 2;
    public static final int F_GETFL = 3;
    public static final int F_SETFL = 4;
    public static final int F_GETLK = 5;
    public static final int F_SETLK = 8;
    public static final int F_SETLKW = 7;
    public static final int F_SETOWN = 8;
    public static final int F_GETOWN = 9;
    public static final int F_SETSIG = 10;
    public static final int F_GETSIG = 11;
    public static final int F_SETOWN_EX = 15;
    public static final int F_GETOWN_EX = 16;
    public static final int F_OFD_GETLK = 36;
    public static final int F_OFD_SETLK = 37;
    public static final int F_OFD_SETLKW = 38;
    public static final int F_SETLEASE = 1024;
    public static final int F_GETLEASE = 1025;
    public static final int F_NOTIFY = 1026;
    public static final int F_SETPIPE_SZ = 1031;
    public static final int F_GETPIPE_SZ = 1032;
    public static final int F_ADD_SEALS = 1033;
    public static final int F_GET_SEALS = 1034;
    public static final int F_GET_RW_HINT = 1035;
    public static final int F_SET_RW_HINT = 1036;
    public static final int F_GET_FILE_RW_HINT = 1037;
    public static final int F_SET_FILE_RW_HINT = 1038;
    public static final int F_DUPFD_CLOEXEC = 1030;
    public static final int FD_CLOEXEC = 1;
    public static final int F_RDLCK = 0;
    public static final int F_WRLCK = 1;
    public static final int F_UNLCK = 2;
    public static final int F_EXLCK = 4;
    public static final int F_SHLCK = 8;
    public static final int F_OWNER_TID = 0;
    public static final int F_OWNER_PID = 1;
    public static final int F_OWNER_PGRP = 2;
    public static final int LOCK_SH = 1;
    public static final int LOCK_EX = 2;
    public static final int LOCK_NB = 4;
    public static final int LOCK_UN = 8;
    public static final int LOCK_MAND = 32;
    public static final int LOCK_READ = 64;
    public static final int LOCK_WRITE = 128;
    public static final int LOCK_RW = 192;
    public static final int DN_ACCESS = 1;
    public static final int DN_MODIFY = 2;
    public static final int DN_CREATE = 4;
    public static final int DN_DELETE = 8;
    public static final int DN_RENAME = 16;
    public static final int DN_ATTRIB = 32;
    public static final int DN_MULTISHOT = Integer.MIN_VALUE;
    public static final int F_SEAL_SEAL = 1;
    public static final int F_SEAL_SHRINK = 2;
    public static final int F_SEAL_GROW = 4;
    public static final int F_SEAL_WRITE = 8;
    public static final int F_SEAL_FUTURE_WRITE = 16;
    public static final int RWH_WRITE_LIFE_NOT_SET = 0;
    public static final int RWH_WRITE_LIFE_NONE = 1;
    public static final int RWH_WRITE_LIFE_SHORT = 2;
    public static final int RWH_WRITE_LIFE_MEDIUM = 3;
    public static final int RWH_WRITE_LIFE_LONG = 4;
    public static final int RWH_WRITE_LIFE_EXTREME = 5;

    protected FCNTL() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nopen(long r0, int r2, int r3);

    public static int open(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5, int r6, @org.lwjgl.system.NativeType("mode_t") int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            r2 = r7
            int r0 = nopen(r0, r1, r2)
            return r0
    }

    public static int open(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5, int r6, @org.lwjgl.system.NativeType("mode_t") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r5
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L29
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L29
            r10 = r0
            r0 = r10
            r1 = r6
            r2 = r7
            int r0 = nopen(r0, r1, r2)     // Catch: java.lang.Throwable -> L29
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L29:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native int nopenat(int r0, long r1, int r3, int r4);

    public static int openat(int r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, int r8, @org.lwjgl.system.NativeType("mode_t") int r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            r3 = r9
            int r0 = nopenat(r0, r1, r2, r3)
            return r0
    }

    public static int openat(int r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, int r8, @org.lwjgl.system.NativeType("mode_t") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2f
            r12 = r0
            r0 = r6
            r1 = r12
            r2 = r8
            r3 = r9
            int r0 = nopenat(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2f
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L2f:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native int ncreat(long r0, int r2);

    public static int creat(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r4, @org.lwjgl.system.NativeType("mode_t") int r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r4
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            int r0 = ncreat(r0, r1)
            return r0
    }

    public static int creat(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4, @org.lwjgl.system.NativeType("mode_t") int r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r8
            r1 = r5
            int r0 = ncreat(r0, r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L26:
            r11 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native int fcntl(int r0, int r1);

    public static native int nfcntli(int r0, int r1, int r2);

    public static int fcntli(int r4, int r5, int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = nfcntli(r0, r1, r2)
            return r0
    }

    public static native int nfcntlp(int r0, int r1, long r2);

    public static int fcntlp(int r5, int r6, @org.lwjgl.system.NativeType("void *") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = nfcntlp(r0, r1, r2)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
