package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslVertexAttribute.class */
@org.lwjgl.system.NativeType("struct spvc_msl_vertex_attribute")
public class SpvcMslVertexAttribute extends org.lwjgl.system.Struct<org.lwjgl.util.spvc.SpvcMslVertexAttribute> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int LOCATION = 0;
    public static final int MSL_BUFFER = 0;
    public static final int MSL_OFFSET = 0;
    public static final int MSL_STRIDE = 0;
    public static final int PER_INSTANCE = 0;
    public static final int FORMAT = 0;
    public static final int BUILTIN = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslVertexAttribute$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.spvc.SpvcMslVertexAttribute, org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.spvc.SpvcMslVertexAttribute ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
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
        protected org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
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
        protected org.lwjgl.util.spvc.SpvcMslVertexAttribute getElementFactory() {
                r2 = this;
                org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int location() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.nlocation(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int msl_buffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.nmsl_buffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int msl_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.nmsl_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int msl_stride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.nmsl_stride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_bool")
        public boolean per_instance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.nper_instance(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_vertex_format")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.nformat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("SpvBuiltIn")
        public int builtin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.nbuiltin(r0)
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer location(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.nlocation(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer msl_buffer(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.nmsl_buffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer msl_offset(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.nmsl_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer msl_stride(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.nmsl_stride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer per_instance(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.nper_instance(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer format(@org.lwjgl.system.NativeType("spvc_msl_vertex_format") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.nformat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer builtin(@org.lwjgl.system.NativeType("SpvBuiltIn") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.nbuiltin(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3772create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.create(r0)
                org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SpvcMslVertexAttribute(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.spvc.SpvcMslVertexAttribute create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SpvcMslVertexAttribute(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int location() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlocation(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int msl_buffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsl_buffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int msl_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsl_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int msl_stride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmsl_stride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_bool")
    public boolean per_instance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nper_instance(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spvc_msl_vertex_format")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("SpvBuiltIn")
    public int builtin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbuiltin(r0)
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute location(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlocation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute msl_buffer(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsl_buffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute msl_offset(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsl_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute msl_stride(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmsl_stride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute per_instance(@org.lwjgl.system.NativeType("spvc_bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nper_instance(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute format(@org.lwjgl.system.NativeType("spvc_msl_vertex_format") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute builtin(@org.lwjgl.system.NativeType("SpvBuiltIn") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbuiltin(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute set(int r4, int r5, int r6, int r7, boolean r8, int r9, int r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.location(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.msl_buffer(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.msl_offset(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.msl_stride(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.per_instance(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.format(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.builtin(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslVertexAttribute set(org.lwjgl.util.spvc.SpvcMslVertexAttribute r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute malloc() {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            int r2 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute calloc() {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute create() {
            int r0 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute create(long r6) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer malloc(int r6) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer calloc(int r7) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
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

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer create(long r6, int r8) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.ALIGNOF
            int r4 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslVertexAttribute.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslVertexAttribute$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nlocation(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.LOCATION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmsl_buffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_BUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmsl_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmsl_stride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_STRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static boolean nper_instance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.PER_INSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static int nformat(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.FORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbuiltin(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.BUILTIN
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nlocation(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.LOCATION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmsl_buffer(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_BUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmsl_offset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmsl_stride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_STRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nper_instance(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.PER_INSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nformat(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.FORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbuiltin(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslVertexAttribute.BUILTIN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.spvc.SpvcMslVertexAttribute r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
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
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.LOCATION = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_BUFFER = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_OFFSET = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.MSL_STRIDE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.PER_INSTANCE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.FORMAT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslVertexAttribute.BUILTIN = r0
            return
    }
}
