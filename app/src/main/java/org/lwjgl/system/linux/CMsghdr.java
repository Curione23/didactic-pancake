package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/CMsghdr.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/CMsghdr.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/CMsghdr.class */
@org.lwjgl.system.NativeType("struct cmsghdr")
public class CMsghdr extends org.lwjgl.system.Struct<org.lwjgl.system.linux.CMsghdr> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CMSG_LEN = 0;
    public static final int CMSG_LEVEL = 0;
    public static final int CMSG_TYPE = 0;
    public static final int CMSG_DATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/CMsghdr$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/CMsghdr$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/CMsghdr$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.CMsghdr, org.lwjgl.system.linux.CMsghdr.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.CMsghdr ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.CMsghdr.SIZEOF
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
        protected org.lwjgl.system.linux.CMsghdr.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.CMsghdr getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.CMsghdr r0 = org.lwjgl.system.linux.CMsghdr.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("socklen_t")
        public int cmsg_len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.CMsghdr.ncmsg_len(r0)
                return r0
        }

        public int cmsg_level() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.CMsghdr.ncmsg_level(r0)
                return r0
        }

        public int cmsg_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.CMsghdr.ncmsg_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[0]")
        public java.nio.ByteBuffer cmsg_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.linux.CMsghdr.ncmsg_data(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte cmsg_data(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.system.linux.CMsghdr.ncmsg_data(r0, r1)
                return r0
        }

        public org.lwjgl.system.linux.CMsghdr.Buffer cmsg_len(@org.lwjgl.system.NativeType("socklen_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.CMsghdr.ncmsg_len(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.CMsghdr.Buffer cmsg_level(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.CMsghdr.ncmsg_level(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.CMsghdr.Buffer cmsg_type(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.CMsghdr.ncmsg_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.CMsghdr.Buffer cmsg_data(@org.lwjgl.system.NativeType("char[0]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.CMsghdr.ncmsg_data(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.CMsghdr.Buffer cmsg_data(int r6, @org.lwjgl.system.NativeType("char") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.CMsghdr.ncmsg_data(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.CMsghdr r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.CMsghdr$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.CMsghdr r0 = org.lwjgl.system.linux.CMsghdr.create(r0)
                org.lwjgl.system.linux.CMsghdr.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected CMsghdr(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.CMsghdr create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public CMsghdr(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("socklen_t")
    public int cmsg_len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncmsg_len(r0)
            return r0
    }

    public int cmsg_level() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncmsg_level(r0)
            return r0
    }

    public int cmsg_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncmsg_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[0]")
    public java.nio.ByteBuffer cmsg_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncmsg_data(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char")
    public byte cmsg_data(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ncmsg_data(r0, r1)
            return r0
    }

    public org.lwjgl.system.linux.CMsghdr cmsg_len(@org.lwjgl.system.NativeType("socklen_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncmsg_len(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.CMsghdr cmsg_level(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncmsg_level(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.CMsghdr cmsg_type(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncmsg_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.CMsghdr cmsg_data(@org.lwjgl.system.NativeType("char[0]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncmsg_data(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.CMsghdr cmsg_data(int r6, @org.lwjgl.system.NativeType("char") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncmsg_data(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.CMsghdr set(int r4, int r5, int r6, java.nio.ByteBuffer r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.CMsghdr r0 = r0.cmsg_len(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.CMsghdr r0 = r0.cmsg_level(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.CMsghdr r0 = r0.cmsg_type(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.CMsghdr r0 = r0.cmsg_data(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.CMsghdr set(org.lwjgl.system.linux.CMsghdr r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr malloc() {
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            int r2 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr calloc() {
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr create() {
            int r0 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr create(long r6) {
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.CMsghdr createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr.Buffer malloc(int r6) {
            org.lwjgl.system.linux.CMsghdr$Buffer r0 = new org.lwjgl.system.linux.CMsghdr$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr.Buffer calloc(int r7) {
            org.lwjgl.system.linux.CMsghdr$Buffer r0 = new org.lwjgl.system.linux.CMsghdr$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.CMsghdr$Buffer r0 = new org.lwjgl.system.linux.CMsghdr$Buffer
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

    public static org.lwjgl.system.linux.CMsghdr.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.CMsghdr$Buffer r0 = new org.lwjgl.system.linux.CMsghdr$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.CMsghdr.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.CMsghdr$Buffer r0 = new org.lwjgl.system.linux.CMsghdr$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.CMsghdr.ALIGNOF
            int r4 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.CMsghdr r0 = new org.lwjgl.system.linux.CMsghdr
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.CMsghdr$Buffer r0 = new org.lwjgl.system.linux.CMsghdr$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.CMsghdr.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.CMsghdr.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.CMsghdr$Buffer r0 = new org.lwjgl.system.linux.CMsghdr$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.CMsghdr.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.CMsghdr.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ncmsg_len(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncmsg_level(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_LEVEL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncmsg_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ncmsg_data(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.CMsghdr.CMSG_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 0
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ncmsg_data(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_DATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 0
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void ncmsg_len(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncmsg_level(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_LEVEL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncmsg_type(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncmsg_data(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 0
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.CMsghdr.CMSG_DATA
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncmsg_data(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.CMsghdr.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.CMsghdr.CMSG_DATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 0
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.CMsghdr r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r4 = 0
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.CMsghdr.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.CMsghdr.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.CMsghdr.CMSG_LEN = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.CMsghdr.CMSG_LEVEL = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.CMsghdr.CMSG_TYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.CMsghdr.CMSG_DATA = r0
            return
    }
}
