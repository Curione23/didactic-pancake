package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangLimits.class */
@org.lwjgl.system.NativeType("struct glslang_limits_t")
public class GLSLangLimits extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.GLSLangLimits> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NON_INDUCTIVE_FOR_LOOPS = 0;
    public static final int WHILE_LOOPS = 0;
    public static final int DO_WHILE_LOOPS = 0;
    public static final int GENERAL_UNIFORM_INDEXING = 0;
    public static final int GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING = 0;
    public static final int GENERAL_VARYING_INDEXING = 0;
    public static final int GENERAL_SAMPLER_INDEXING = 0;
    public static final int GENERAL_VARIABLE_INDEXING = 0;
    public static final int GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangLimits$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.GLSLangLimits, org.lwjgl.util.shaderc.GLSLangLimits.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.GLSLangLimits ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
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
        protected org.lwjgl.util.shaderc.GLSLangLimits.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.GLSLangLimits.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
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
        protected org.lwjgl.util.shaderc.GLSLangLimits getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.GLSLangLimits r0 = org.lwjgl.util.shaderc.GLSLangLimits.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean non_inductive_for_loops() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.nnon_inductive_for_loops(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean while_loops() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.nwhile_loops(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean do_while_loops() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.ndo_while_loops(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean general_uniform_indexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_uniform_indexing(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean general_attribute_matrix_vector_indexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_attribute_matrix_vector_indexing(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean general_varying_indexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_varying_indexing(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean general_sampler_indexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_sampler_indexing(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean general_variable_indexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_variable_indexing(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean general_constant_matrix_vector_indexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_constant_matrix_vector_indexing(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer non_inductive_for_loops(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.nnon_inductive_for_loops(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer while_loops(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.nwhile_loops(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer do_while_loops(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.ndo_while_loops(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer general_uniform_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_uniform_indexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer general_attribute_matrix_vector_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_attribute_matrix_vector_indexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer general_varying_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_varying_indexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer general_sampler_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_sampler_indexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer general_variable_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_variable_indexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangLimits.Buffer general_constant_matrix_vector_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangLimits.ngeneral_constant_matrix_vector_indexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3678create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.GLSLangLimits r0 = org.lwjgl.util.shaderc.GLSLangLimits.create(r0)
                org.lwjgl.util.shaderc.GLSLangLimits.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLSLangLimits(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.GLSLangLimits create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLSLangLimits(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean non_inductive_for_loops() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nnon_inductive_for_loops(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean while_loops() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nwhile_loops(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean do_while_loops() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ndo_while_loops(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean general_uniform_indexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ngeneral_uniform_indexing(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean general_attribute_matrix_vector_indexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ngeneral_attribute_matrix_vector_indexing(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean general_varying_indexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ngeneral_varying_indexing(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean general_sampler_indexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ngeneral_sampler_indexing(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean general_variable_indexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ngeneral_variable_indexing(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean general_constant_matrix_vector_indexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ngeneral_constant_matrix_vector_indexing(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits non_inductive_for_loops(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnon_inductive_for_loops(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits while_loops(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwhile_loops(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits do_while_loops(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndo_while_loops(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits general_uniform_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneral_uniform_indexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits general_attribute_matrix_vector_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneral_attribute_matrix_vector_indexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits general_varying_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneral_varying_indexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits general_sampler_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneral_sampler_indexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits general_variable_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneral_variable_indexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits general_constant_matrix_vector_indexing(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneral_constant_matrix_vector_indexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.non_inductive_for_loops(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.while_loops(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.do_while_loops(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.general_uniform_indexing(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.general_attribute_matrix_vector_indexing(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.general_varying_indexing(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.general_sampler_indexing(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.general_variable_indexing(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.general_constant_matrix_vector_indexing(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangLimits set(org.lwjgl.util.shaderc.GLSLangLimits r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits malloc() {
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits calloc() {
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits create() {
            int r0 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits create(long r6) {
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
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

    public static org.lwjgl.util.shaderc.GLSLangLimits.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.GLSLangLimits r0 = new org.lwjgl.util.shaderc.GLSLangLimits
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangLimits.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLangLimits$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangLimits$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLangLimits.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static boolean nnon_inductive_for_loops(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.NON_INDUCTIVE_FOR_LOOPS
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

    public static boolean nwhile_loops(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.WHILE_LOOPS
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

    public static boolean ndo_while_loops(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.DO_WHILE_LOOPS
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

    public static boolean ngeneral_uniform_indexing(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_UNIFORM_INDEXING
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

    public static boolean ngeneral_attribute_matrix_vector_indexing(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING
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

    public static boolean ngeneral_varying_indexing(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_VARYING_INDEXING
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

    public static boolean ngeneral_sampler_indexing(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_SAMPLER_INDEXING
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

    public static boolean ngeneral_variable_indexing(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_VARIABLE_INDEXING
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

    public static boolean ngeneral_constant_matrix_vector_indexing(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING
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

    public static void nnon_inductive_for_loops(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.NON_INDUCTIVE_FOR_LOOPS
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

    public static void nwhile_loops(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.WHILE_LOOPS
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

    public static void ndo_while_loops(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.DO_WHILE_LOOPS
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

    public static void ngeneral_uniform_indexing(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_UNIFORM_INDEXING
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

    public static void ngeneral_attribute_matrix_vector_indexing(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING
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

    public static void ngeneral_varying_indexing(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_VARYING_INDEXING
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

    public static void ngeneral_sampler_indexing(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_SAMPLER_INDEXING
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

    public static void ngeneral_variable_indexing(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_VARIABLE_INDEXING
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

    public static void ngeneral_constant_matrix_vector_indexing(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING
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

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.shaderc.GLSLangLimits r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.GLSLangLimits.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.GLSLangLimits.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.NON_INDUCTIVE_FOR_LOOPS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.WHILE_LOOPS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.DO_WHILE_LOOPS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_UNIFORM_INDEXING = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_ATTRIBUTE_MATRIX_VECTOR_INDEXING = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_VARYING_INDEXING = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_SAMPLER_INDEXING = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_VARIABLE_INDEXING = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangLimits.GENERAL_CONSTANT_MATRIX_VECTOR_INDEXING = r0
            return
    }
}
