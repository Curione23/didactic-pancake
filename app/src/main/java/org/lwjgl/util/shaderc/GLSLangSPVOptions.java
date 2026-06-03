package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangSPVOptions.class */
@org.lwjgl.system.NativeType("struct glslang_spv_options_t")
public class GLSLangSPVOptions extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.GLSLangSPVOptions> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int GENERATE_DEBUG_INFO = 0;
    public static final int STRIP_DEBUG_INFO = 0;
    public static final int DISABLE_OPTIMIZER = 0;
    public static final int OPTIMIZE_SIZE = 0;
    public static final int DISASSEMBLE = 0;
    public static final int VALIDATE = 0;
    public static final int EMIT_NONSEMANTIC_SHADER_DEBUG_INFO = 0;
    public static final int EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE = 0;
    public static final int COMPILE_ONLY = 0;
    public static final int OPTIMIZE_ALLOW_EXPANDED_ID_BOUND = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangSPVOptions$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.GLSLangSPVOptions, org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.GLSLangSPVOptions ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
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
        protected org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
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
        protected org.lwjgl.util.shaderc.GLSLangSPVOptions getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean generate_debug_info() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ngenerate_debug_info(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean strip_debug_info() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.nstrip_debug_info(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean disable_optimizer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ndisable_optimizer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean optimize_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.noptimize_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean disassemble() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ndisassemble(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean validate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.nvalidate(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean emit_nonsemantic_shader_debug_info() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.nemit_nonsemantic_shader_debug_info(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean emit_nonsemantic_shader_debug_source() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.nemit_nonsemantic_shader_debug_source(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean compile_only() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ncompile_only(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean optimize_allow_expanded_id_bound() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.noptimize_allow_expanded_id_bound(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer generate_debug_info(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.ngenerate_debug_info(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer strip_debug_info(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.nstrip_debug_info(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer disable_optimizer(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.ndisable_optimizer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer optimize_size(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.noptimize_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer disassemble(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.ndisassemble(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer validate(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.nvalidate(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer emit_nonsemantic_shader_debug_info(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.nemit_nonsemantic_shader_debug_info(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer emit_nonsemantic_shader_debug_source(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.nemit_nonsemantic_shader_debug_source(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer compile_only(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.ncompile_only(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer optimize_allow_expanded_id_bound(@org.lwjgl.system.NativeType("bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangSPVOptions.noptimize_allow_expanded_id_bound(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3686create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.create(r0)
                org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLSLangSPVOptions(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.GLSLangSPVOptions create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLSLangSPVOptions(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean generate_debug_info() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ngenerate_debug_info(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean strip_debug_info() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nstrip_debug_info(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean disable_optimizer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ndisable_optimizer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean optimize_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = noptimize_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean disassemble() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ndisassemble(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean validate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nvalidate(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean emit_nonsemantic_shader_debug_info() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nemit_nonsemantic_shader_debug_info(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean emit_nonsemantic_shader_debug_source() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nemit_nonsemantic_shader_debug_source(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean compile_only() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = ncompile_only(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean optimize_allow_expanded_id_bound() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = noptimize_allow_expanded_id_bound(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions generate_debug_info(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngenerate_debug_info(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions strip_debug_info(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstrip_debug_info(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions disable_optimizer(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisable_optimizer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions optimize_size(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noptimize_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions disassemble(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisassemble(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions validate(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvalidate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions emit_nonsemantic_shader_debug_info(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nemit_nonsemantic_shader_debug_info(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions emit_nonsemantic_shader_debug_source(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nemit_nonsemantic_shader_debug_source(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions compile_only(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncompile_only(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions optimize_allow_expanded_id_bound(@org.lwjgl.system.NativeType("bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noptimize_allow_expanded_id_bound(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.generate_debug_info(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.strip_debug_info(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.disable_optimizer(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.optimize_size(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.disassemble(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.validate(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.emit_nonsemantic_shader_debug_info(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.emit_nonsemantic_shader_debug_source(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.compile_only(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.optimize_allow_expanded_id_bound(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangSPVOptions set(org.lwjgl.util.shaderc.GLSLangSPVOptions r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions malloc() {
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions calloc() {
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions create() {
            int r0 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions create(long r6) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
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

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangSPVOptions.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangSPVOptions$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLangSPVOptions.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static boolean ngenerate_debug_info(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.GENERATE_DEBUG_INFO
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

    public static boolean nstrip_debug_info(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.STRIP_DEBUG_INFO
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

    public static boolean ndisable_optimizer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.DISABLE_OPTIMIZER
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

    public static boolean noptimize_size(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.OPTIMIZE_SIZE
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

    public static boolean ndisassemble(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.DISASSEMBLE
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

    public static boolean nvalidate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.VALIDATE
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

    public static boolean nemit_nonsemantic_shader_debug_info(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_INFO
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

    public static boolean nemit_nonsemantic_shader_debug_source(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE
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

    public static boolean ncompile_only(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.COMPILE_ONLY
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

    public static boolean noptimize_allow_expanded_id_bound(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.OPTIMIZE_ALLOW_EXPANDED_ID_BOUND
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

    public static void ngenerate_debug_info(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.GENERATE_DEBUG_INFO
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

    public static void nstrip_debug_info(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.STRIP_DEBUG_INFO
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

    public static void ndisable_optimizer(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.DISABLE_OPTIMIZER
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

    public static void noptimize_size(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.OPTIMIZE_SIZE
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

    public static void ndisassemble(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.DISASSEMBLE
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

    public static void nvalidate(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.VALIDATE
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

    public static void nemit_nonsemantic_shader_debug_info(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_INFO
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

    public static void nemit_nonsemantic_shader_debug_source(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE
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

    public static void ncompile_only(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.COMPILE_ONLY
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

    public static void noptimize_allow_expanded_id_bound(long r5, boolean r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangSPVOptions.OPTIMIZE_ALLOW_EXPANDED_ID_BOUND
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
            org.lwjgl.util.shaderc.GLSLangSPVOptions r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
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
            r1 = r0
            r2 = 9
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.GLSLangSPVOptions.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.GLSLangSPVOptions.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.GENERATE_DEBUG_INFO = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.STRIP_DEBUG_INFO = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.DISABLE_OPTIMIZER = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.OPTIMIZE_SIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.DISASSEMBLE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.VALIDATE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_INFO = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.EMIT_NONSEMANTIC_SHADER_DEBUG_SOURCE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.COMPILE_ONLY = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangSPVOptions.OPTIMIZE_ALLOW_EXPANDED_ID_BOUND = r0
            return
    }
}
