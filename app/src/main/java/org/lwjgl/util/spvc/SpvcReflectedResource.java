package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcReflectedResource.class */
@org.lwjgl.system.NativeType("struct spvc_reflected_resource")
public class SpvcReflectedResource extends org.lwjgl.system.Struct<org.lwjgl.util.spvc.SpvcReflectedResource> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ID = 0;
    public static final int BASE_TYPE_ID = 0;
    public static final int TYPE_ID = 0;
    public static final int NAME = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcReflectedResource$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.spvc.SpvcReflectedResource, org.lwjgl.util.spvc.SpvcReflectedResource.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.spvc.SpvcReflectedResource ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.util.spvc.SpvcReflectedResource.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.spvc.SpvcReflectedResource.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.spvc.SpvcReflectedResource getElementFactory() {
                r2 = this;
                org.lwjgl.util.spvc.SpvcReflectedResource r0 = org.lwjgl.util.spvc.SpvcReflectedResource.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_variable_id")
        public int id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcReflectedResource.nid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_type_id")
        public int base_type_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcReflectedResource.nbase_type_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_type_id")
        public int type_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcReflectedResource.ntype_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.spvc.SpvcReflectedResource.nname(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.spvc.SpvcReflectedResource.nnameString(r0)
                return r0
        }

        public org.lwjgl.util.spvc.SpvcReflectedResource.Buffer id(@org.lwjgl.system.NativeType("spvc_variable_id") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcReflectedResource.nid(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcReflectedResource.Buffer base_type_id(@org.lwjgl.system.NativeType("spvc_type_id") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcReflectedResource.nbase_type_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcReflectedResource.Buffer type_id(@org.lwjgl.system.NativeType("spvc_type_id") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcReflectedResource.ntype_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcReflectedResource.Buffer name(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcReflectedResource.nname(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcReflectedResource r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3778create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.spvc.SpvcReflectedResource r0 = org.lwjgl.util.spvc.SpvcReflectedResource.create(r0)
                org.lwjgl.util.spvc.SpvcReflectedResource.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SpvcReflectedResource(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.spvc.SpvcReflectedResource create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SpvcReflectedResource(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_variable_id")
    public int id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_type_id")
    public int base_type_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbase_type_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_type_id")
    public int type_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nname(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nnameString(r0)
            return r0
    }

    public org.lwjgl.util.spvc.SpvcReflectedResource id(@org.lwjgl.system.NativeType("spvc_variable_id") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nid(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcReflectedResource base_type_id(@org.lwjgl.system.NativeType("spvc_type_id") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbase_type_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcReflectedResource type_id(@org.lwjgl.system.NativeType("spvc_type_id") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcReflectedResource name(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nname(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcReflectedResource set(int r4, int r5, int r6, java.nio.ByteBuffer r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = r0.id(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = r0.base_type_id(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = r0.type_id(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = r0.name(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcReflectedResource set(org.lwjgl.util.spvc.SpvcReflectedResource r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource malloc() {
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            int r2 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource calloc() {
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource create() {
            int r0 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource create(long r6) {
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource.Buffer malloc(int r6) {
            org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource.Buffer calloc(int r7) {
            org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
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

    public static org.lwjgl.util.spvc.SpvcReflectedResource.Buffer create(long r6, int r8) {
            org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.ALIGNOF
            int r4 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = new org.lwjgl.util.spvc.SpvcReflectedResource
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcReflectedResource.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcReflectedResource$Buffer r0 = new org.lwjgl.util.spvc.SpvcReflectedResource$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nid(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbase_type_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.BASE_TYPE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ntype_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.TYPE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.ByteBuffer nname(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nnameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static void nid(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbase_type_id(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.BASE_TYPE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ntype_id(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.TYPE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nname(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcReflectedResource.NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.spvc.SpvcReflectedResource r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.util.spvc.SpvcReflectedResource.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.spvc.SpvcReflectedResource.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.spvc.SpvcReflectedResource.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcReflectedResource.ID = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcReflectedResource.BASE_TYPE_ID = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcReflectedResource.TYPE_ID = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcReflectedResource.NAME = r0
            return
    }
}
