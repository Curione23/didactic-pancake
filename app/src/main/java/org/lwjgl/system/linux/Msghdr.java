package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Msghdr.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Msghdr.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Msghdr.class */
@org.lwjgl.system.NativeType("struct msghdr")
public class Msghdr extends org.lwjgl.system.Struct<org.lwjgl.system.linux.Msghdr> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int MSG_NAME = 0;
    public static final int MSG_NAMELEN = 0;
    public static final int MSG_IOV = 0;
    public static final int MSG_IOVLEN = 0;
    public static final int MSG_CONTROL = 0;
    public static final int MSG_CONTROLLEN = 0;
    public static final int MSG_FLAGS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Msghdr$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Msghdr$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Msghdr$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.Msghdr, org.lwjgl.system.linux.Msghdr.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.Msghdr ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.Msghdr.SIZEOF
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
        protected org.lwjgl.system.linux.Msghdr.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.Msghdr getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.Msghdr r0 = org.lwjgl.system.linux.Msghdr.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer msg_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.linux.Msghdr.nmsg_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("socklen_t")
        public int msg_namelen() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Msghdr.nmsg_namelen(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct iovec *")
        public org.lwjgl.system.linux.IOVec.Buffer msg_iov() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.IOVec$Buffer r0 = org.lwjgl.system.linux.Msghdr.nmsg_iov(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long msg_iovlen() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Msghdr.nmsg_iovlen(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer msg_control() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.linux.Msghdr.nmsg_control(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long msg_controllen() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Msghdr.nmsg_controllen(r0)
                return r0
        }

        public int msg_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Msghdr.nmsg_flags(r0)
                return r0
        }

        public org.lwjgl.system.linux.Msghdr.Buffer msg_name(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Msghdr.nmsg_name(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Msghdr.Buffer msg_iov(@org.lwjgl.system.NativeType("struct iovec *") org.lwjgl.system.linux.IOVec.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Msghdr.nmsg_iov(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Msghdr.Buffer msg_control(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Msghdr.nmsg_control(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Msghdr.Buffer msg_flags(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Msghdr.nmsg_flags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.Msghdr r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.Msghdr$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.Msghdr r0 = org.lwjgl.system.linux.Msghdr.create(r0)
                org.lwjgl.system.linux.Msghdr.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected Msghdr(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.Msghdr create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public Msghdr(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.Msghdr.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.Msghdr.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public java.nio.ByteBuffer msg_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nmsg_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("socklen_t")
    public int msg_namelen() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsg_namelen(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct iovec *")
    public org.lwjgl.system.linux.IOVec.Buffer msg_iov() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.IOVec$Buffer r0 = nmsg_iov(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long msg_iovlen() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmsg_iovlen(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public java.nio.ByteBuffer msg_control() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nmsg_control(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long msg_controllen() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmsg_controllen(r0)
            return r0
    }

    public int msg_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsg_flags(r0)
            return r0
    }

    public org.lwjgl.system.linux.Msghdr msg_name(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsg_name(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Msghdr msg_iov(@org.lwjgl.system.NativeType("struct iovec *") org.lwjgl.system.linux.IOVec.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsg_iov(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Msghdr msg_control(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsg_control(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Msghdr msg_flags(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsg_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Msghdr set(java.nio.ByteBuffer r4, org.lwjgl.system.linux.IOVec.Buffer r5, java.nio.ByteBuffer r6, int r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.Msghdr r0 = r0.msg_name(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.Msghdr r0 = r0.msg_iov(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.Msghdr r0 = r0.msg_control(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.Msghdr r0 = r0.msg_flags(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.Msghdr set(org.lwjgl.system.linux.Msghdr r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.Msghdr.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr malloc() {
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            int r2 = org.lwjgl.system.linux.Msghdr.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr calloc() {
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.Msghdr.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr create() {
            int r0 = org.lwjgl.system.linux.Msghdr.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr create(long r6) {
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.Msghdr createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr.Buffer malloc(int r6) {
            org.lwjgl.system.linux.Msghdr$Buffer r0 = new org.lwjgl.system.linux.Msghdr$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.Msghdr.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr.Buffer calloc(int r7) {
            org.lwjgl.system.linux.Msghdr$Buffer r0 = new org.lwjgl.system.linux.Msghdr$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.Msghdr.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.Msghdr.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.Msghdr$Buffer r0 = new org.lwjgl.system.linux.Msghdr$Buffer
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

    public static org.lwjgl.system.linux.Msghdr.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.Msghdr$Buffer r0 = new org.lwjgl.system.linux.Msghdr$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.Msghdr.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.Msghdr$Buffer r0 = new org.lwjgl.system.linux.Msghdr$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.Msghdr.ALIGNOF
            int r4 = org.lwjgl.system.linux.Msghdr.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.Msghdr r0 = new org.lwjgl.system.linux.Msghdr
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Msghdr.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.Msghdr.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.Msghdr$Buffer r0 = new org.lwjgl.system.linux.Msghdr$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.Msghdr.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.Msghdr.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Msghdr.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.Msghdr$Buffer r0 = new org.lwjgl.system.linux.Msghdr$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.Msghdr.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.Msghdr.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer nmsg_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nmsg_namelen(r1)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static int nmsg_namelen(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Msghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Msghdr.MSG_NAMELEN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.linux.IOVec.Buffer nmsg_iov(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_IOV
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nmsg_iovlen(r1)
            int r1 = (int) r1
            org.lwjgl.system.linux.IOVec$Buffer r0 = org.lwjgl.system.linux.IOVec.create(r0, r1)
            return r0
    }

    public static long nmsg_iovlen(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_IOVLEN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer nmsg_control(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_CONTROL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nmsg_controllen(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static long nmsg_controllen(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_CONTROLLEN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmsg_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Msghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Msghdr.MSG_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nmsg_name(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nmsg_namelen(r0, r1)
            return
    }

    public static void nmsg_namelen(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Msghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Msghdr.MSG_NAMELEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmsg_iov(long r5, org.lwjgl.system.linux.IOVec.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_IOV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            nmsg_iovlen(r0, r1)
            return
    }

    public static void nmsg_iovlen(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_IOVLEN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmsg_control(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_CONTROL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            nmsg_controllen(r0, r1)
            return
    }

    public static void nmsg_controllen(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_CONTROLLEN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmsg_flags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Msghdr.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Msghdr.MSG_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_IOV
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.linux.Msghdr.MSG_CONTROL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.Msghdr r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.Msghdr.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.linux.Msghdr.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.Msghdr.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.Msghdr.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.Msghdr.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.Msghdr.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.Msghdr.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Msghdr.MSG_NAME = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Msghdr.MSG_NAMELEN = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Msghdr.MSG_IOV = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Msghdr.MSG_IOVLEN = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Msghdr.MSG_CONTROL = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Msghdr.MSG_CONTROLLEN = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Msghdr.MSG_FLAGS = r0
            return
    }
}
