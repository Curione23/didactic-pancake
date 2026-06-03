package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Statx.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Statx.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Statx.class */
@org.lwjgl.system.NativeType("struct statx")
public class Statx extends org.lwjgl.system.Struct<org.lwjgl.system.linux.Statx> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STX_MASK = 0;
    public static final int STX_BLKSIZE = 0;
    public static final int STX_ATTRIBUTES = 0;
    public static final int STX_NLINK = 0;
    public static final int STX_UID = 0;
    public static final int STX_GID = 0;
    public static final int STX_MODE = 0;
    public static final int __SPARE0 = 0;
    public static final int STX_INO = 0;
    public static final int STX_SIZE = 0;
    public static final int STX_BLOCKS = 0;
    public static final int STX_ATTRIBUTES_MASK = 0;
    public static final int STX_ATIME = 0;
    public static final int STX_BTIME = 0;
    public static final int STX_CTIME = 0;
    public static final int STX_MTIME = 0;
    public static final int STX_RDEV_MAJOR = 0;
    public static final int STX_RDEV_MINOR = 0;
    public static final int STX_DEV_MAJOR = 0;
    public static final int STX_DEV_MINOR = 0;
    public static final int STX_MNT_ID = 0;
    public static final int __SPARE2 = 0;
    public static final int __SPARE3 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Statx$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Statx$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Statx$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.Statx, org.lwjgl.system.linux.Statx.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.Statx ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.Statx.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.system.linux.Statx.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.Statx getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.Statx r0 = org.lwjgl.system.linux.Statx.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_blksize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_blksize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long stx_attributes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Statx.nstx_attributes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_nlink() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_nlink(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_uid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_uid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_gid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_gid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short stx_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.Statx.nstx_mode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long stx_ino() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Statx.nstx_ino(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long stx_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Statx.nstx_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long stx_blocks() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Statx.nstx_blocks(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long stx_attributes_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Statx.nstx_attributes_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct statx_timestamp")
        public org.lwjgl.system.linux.StatxTimestamp stx_atime() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.Statx.nstx_atime(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct statx_timestamp")
        public org.lwjgl.system.linux.StatxTimestamp stx_btime() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.Statx.nstx_btime(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct statx_timestamp")
        public org.lwjgl.system.linux.StatxTimestamp stx_ctime() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.Statx.nstx_ctime(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct statx_timestamp")
        public org.lwjgl.system.linux.StatxTimestamp stx_mtime() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.Statx.nstx_mtime(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_rdev_major() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_rdev_major(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_rdev_minor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_rdev_minor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_dev_major() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_dev_major(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int stx_dev_minor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Statx.nstx_dev_minor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long stx_mnt_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Statx.nstx_mnt_id(r0)
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_mask(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_mask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_blksize(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_blksize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_attributes(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Statx.nstx_attributes(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_nlink(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_nlink(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_uid(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_uid(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_gid(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_gid(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_mode(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_mode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_ino(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Statx.nstx_ino(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_size(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Statx.nstx_size(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_blocks(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Statx.nstx_blocks(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_attributes_mask(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Statx.nstx_attributes_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_atime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_atime(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_atime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_atime()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_btime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_btime(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_btime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_btime()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_ctime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_ctime(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_ctime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_ctime()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_mtime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_mtime(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_mtime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_mtime()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_rdev_major(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_rdev_major(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_rdev_minor(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_rdev_minor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_dev_major(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_dev_major(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_dev_minor(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Statx.nstx_dev_minor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Statx.Buffer stx_mnt_id(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Statx.nstx_mnt_id(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.Statx r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.Statx$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.Statx r0 = org.lwjgl.system.linux.Statx.create(r0)
                org.lwjgl.system.linux.Statx.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected Statx(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.Statx create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public Statx(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.Statx.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_mask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_blksize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_blksize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long stx_attributes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstx_attributes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_nlink() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_nlink(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_uid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_uid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_gid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_gid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short stx_mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nstx_mode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long stx_ino() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstx_ino(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long stx_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstx_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long stx_blocks() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstx_blocks(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long stx_attributes_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstx_attributes_mask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct statx_timestamp")
    public org.lwjgl.system.linux.StatxTimestamp stx_atime() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.StatxTimestamp r0 = nstx_atime(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct statx_timestamp")
    public org.lwjgl.system.linux.StatxTimestamp stx_btime() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.StatxTimestamp r0 = nstx_btime(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct statx_timestamp")
    public org.lwjgl.system.linux.StatxTimestamp stx_ctime() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.StatxTimestamp r0 = nstx_ctime(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct statx_timestamp")
    public org.lwjgl.system.linux.StatxTimestamp stx_mtime() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.StatxTimestamp r0 = nstx_mtime(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_rdev_major() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_rdev_major(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_rdev_minor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_rdev_minor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_dev_major() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_dev_major(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int stx_dev_minor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstx_dev_minor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long stx_mnt_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstx_mnt_id(r0)
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_mask(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_mask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_blksize(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_blksize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_attributes(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstx_attributes(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_nlink(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_nlink(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_uid(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_uid(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_gid(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_gid(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_mode(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_mode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_ino(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstx_ino(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_size(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstx_size(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_blocks(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstx_blocks(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_attributes_mask(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstx_attributes_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_atime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_atime(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_atime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_atime()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_btime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_btime(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_btime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_btime()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_ctime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_ctime(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_ctime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_ctime()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_mtime(@org.lwjgl.system.NativeType("struct statx_timestamp") org.lwjgl.system.linux.StatxTimestamp r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_mtime(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_mtime(java.util.function.Consumer<org.lwjgl.system.linux.StatxTimestamp> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.StatxTimestamp r1 = r1.stx_mtime()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_rdev_major(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_rdev_major(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_rdev_minor(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_rdev_minor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_dev_major(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_dev_major(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_dev_minor(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstx_dev_minor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx stx_mnt_id(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstx_mnt_id(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Statx set(int r5, int r6, long r7, int r9, int r10, int r11, short r12, long r13, long r15, long r17, long r19, org.lwjgl.system.linux.StatxTimestamp r21, org.lwjgl.system.linux.StatxTimestamp r22, org.lwjgl.system.linux.StatxTimestamp r23, org.lwjgl.system.linux.StatxTimestamp r24, int r25, int r26, int r27, int r28, long r29) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.Statx r0 = r0.stx_mask(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.Statx r0 = r0.stx_blksize(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.Statx r0 = r0.stx_attributes(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.Statx r0 = r0.stx_nlink(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.linux.Statx r0 = r0.stx_uid(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.Statx r0 = r0.stx_gid(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.system.linux.Statx r0 = r0.stx_mode(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.Statx r0 = r0.stx_ino(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.system.linux.Statx r0 = r0.stx_size(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.system.linux.Statx r0 = r0.stx_blocks(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.system.linux.Statx r0 = r0.stx_attributes_mask(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.system.linux.Statx r0 = r0.stx_atime(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.system.linux.Statx r0 = r0.stx_btime(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.system.linux.Statx r0 = r0.stx_ctime(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.system.linux.Statx r0 = r0.stx_mtime(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.system.linux.Statx r0 = r0.stx_rdev_major(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.system.linux.Statx r0 = r0.stx_rdev_minor(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.system.linux.Statx r0 = r0.stx_dev_major(r1)
            r0 = r4
            r1 = r28
            org.lwjgl.system.linux.Statx r0 = r0.stx_dev_minor(r1)
            r0 = r4
            r1 = r29
            org.lwjgl.system.linux.Statx r0 = r0.stx_mnt_id(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Statx set(org.lwjgl.system.linux.Statx r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.Statx.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.Statx malloc() {
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            int r2 = org.lwjgl.system.linux.Statx.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx calloc() {
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.Statx.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx create() {
            int r0 = org.lwjgl.system.linux.Statx.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx create(long r6) {
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.Statx createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.Statx.Buffer malloc(int r6) {
            org.lwjgl.system.linux.Statx$Buffer r0 = new org.lwjgl.system.linux.Statx$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.Statx.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx.Buffer calloc(int r7) {
            org.lwjgl.system.linux.Statx$Buffer r0 = new org.lwjgl.system.linux.Statx$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.Statx.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.Statx.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.Statx$Buffer r0 = new org.lwjgl.system.linux.Statx$Buffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.system.linux.Statx.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.Statx$Buffer r0 = new org.lwjgl.system.linux.Statx$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.Statx.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.Statx$Buffer r0 = new org.lwjgl.system.linux.Statx$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.Statx malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.Statx.ALIGNOF
            int r4 = org.lwjgl.system.linux.Statx.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.Statx r0 = new org.lwjgl.system.linux.Statx
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.Statx.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.Statx$Buffer r0 = new org.lwjgl.system.linux.Statx$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.Statx.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.Statx.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Statx.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.Statx$Buffer r0 = new org.lwjgl.system.linux.Statx$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.Statx.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.Statx.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nstx_mask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstx_blksize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_BLKSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nstx_attributes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_ATTRIBUTES
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nstx_nlink(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_NLINK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstx_uid(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_UID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstx_gid(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_GID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static short nstx_mode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer n__spare0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Statx.__SPARE0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 1
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short n__spare0(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.Statx.__SPARE0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static long nstx_ino(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_INO
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nstx_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nstx_blocks(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_BLOCKS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nstx_attributes_mask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_ATTRIBUTES_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static org.lwjgl.system.linux.StatxTimestamp nstx_atime(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Statx.STX_ATIME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.StatxTimestamp.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.StatxTimestamp nstx_btime(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Statx.STX_BTIME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.StatxTimestamp.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.StatxTimestamp nstx_ctime(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Statx.STX_CTIME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.StatxTimestamp.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.StatxTimestamp nstx_mtime(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Statx.STX_MTIME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.StatxTimestamp r0 = org.lwjgl.system.linux.StatxTimestamp.create(r0)
            return r0
    }

    public static int nstx_rdev_major(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_RDEV_MAJOR
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstx_rdev_minor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_RDEV_MINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstx_dev_major(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_DEV_MAJOR
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstx_dev_minor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_DEV_MINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nstx_mnt_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_MNT_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long n__spare2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.__SPARE2
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static java.nio.LongBuffer n__spare3(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Statx.__SPARE3
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 12
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static long n__spare3(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.Statx.__SPARE3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 12
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 8
            long r3 = r3 * r4
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nstx_mask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_blksize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_BLKSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_attributes(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_ATTRIBUTES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nstx_nlink(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_NLINK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_uid(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_UID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_gid(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_GID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_mode(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void n__spare0(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.Statx.__SPARE0
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void n__spare0(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.Statx.__SPARE0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nstx_ino(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_INO
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nstx_size(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nstx_blocks(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_BLOCKS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nstx_attributes_mask(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_ATTRIBUTES_MASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nstx_atime(long r7, org.lwjgl.system.linux.StatxTimestamp r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.Statx.STX_ATIME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nstx_btime(long r7, org.lwjgl.system.linux.StatxTimestamp r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.Statx.STX_BTIME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nstx_ctime(long r7, org.lwjgl.system.linux.StatxTimestamp r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.Statx.STX_CTIME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nstx_mtime(long r7, org.lwjgl.system.linux.StatxTimestamp r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.Statx.STX_MTIME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nstx_rdev_major(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_RDEV_MAJOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_rdev_minor(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_RDEV_MINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_dev_major(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_DEV_MAJOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_dev_minor(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_DEV_MINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstx_mnt_id(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.STX_MNT_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void n__spare2(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Statx.__SPARE2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void n__spare3(long r7, java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 12
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.Statx.__SPARE3
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 8
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void n__spare3(long r9, int r11, long r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Statx.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.Statx.__SPARE3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 12
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 8
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.Statx r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 23
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            r4 = 1
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            int r4 = org.lwjgl.system.linux.StatxTimestamp.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            int r4 = org.lwjgl.system.linux.StatxTimestamp.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            int r4 = org.lwjgl.system.linux.StatxTimestamp.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.system.linux.StatxTimestamp.SIZEOF
            int r4 = org.lwjgl.system.linux.StatxTimestamp.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 8
            r4 = 12
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.Statx.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.Statx.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_MASK = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_BLKSIZE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_ATTRIBUTES = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_NLINK = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_UID = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_GID = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_MODE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.__SPARE0 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_INO = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_SIZE = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_BLOCKS = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_ATTRIBUTES_MASK = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_ATIME = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_BTIME = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_CTIME = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_MTIME = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_RDEV_MAJOR = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_RDEV_MINOR = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_DEV_MAJOR = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_DEV_MINOR = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.STX_MNT_ID = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.__SPARE2 = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Statx.__SPARE3 = r0
            return
    }
}
