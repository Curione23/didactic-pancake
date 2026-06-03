package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangInput.class */
@org.lwjgl.system.NativeType("struct glslang_input_t")
public class GLSLangInput extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.GLSLangInput> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int LANGUAGE = 0;
    public static final int STAGE = 0;
    public static final int CLIENT = 0;
    public static final int CLIENT_VERSION = 0;
    public static final int TARGET_LANGUAGE = 0;
    public static final int TARGET_LANGUAGE_VERSION = 0;
    public static final int CODE = 0;
    public static final int DEFAULT_VERSION = 0;
    public static final int DEFAULT_PROFILE = 0;
    public static final int FORCE_DEFAULT_VERSION_AND_PROFILE = 0;
    public static final int FORWARD_COMPATIBLE = 0;
    public static final int MESSAGES = 0;
    public static final int RESOURCE = 0;
    public static final int CALLBACKS = 0;
    public static final int CALLBACKS_CTX = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLangInput$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.GLSLangInput, org.lwjgl.util.shaderc.GLSLangInput.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.GLSLangInput ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
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
        protected org.lwjgl.util.shaderc.GLSLangInput.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.GLSLangInput.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
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
        protected org.lwjgl.util.shaderc.GLSLangInput getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.GLSLangInput r0 = org.lwjgl.util.shaderc.GLSLangInput.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_source_t")
        public int language() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.nlanguage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_stage_t")
        public int stage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.nstage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_client_t")
        public int client() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.nclient(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_target_client_version_t")
        public int client_version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.nclient_version(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_target_language_t")
        public int target_language() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.ntarget_language(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_target_language_version_t")
        public int target_language_version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.ntarget_language_version(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer code() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.shaderc.GLSLangInput.ncode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String codeString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.shaderc.GLSLangInput.ncodeString(r0)
                return r0
        }

        public int default_version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.ndefault_version(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_profile_t")
        public int default_profile() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.ndefault_profile(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int")
        public boolean force_default_version_and_profile() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.nforce_default_version_and_profile(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("int")
        public boolean forward_compatible() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.nforward_compatible(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_messages_t")
        public int messages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.GLSLangInput.nmessages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glslang_resource_t const *")
        public org.lwjgl.util.shaderc.GLSLangResource resource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.shaderc.GLSLangResource r0 = org.lwjgl.util.shaderc.GLSLangInput.nresource(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glsl_include_callbacks_t")
        public org.lwjgl.util.shaderc.GLSLIncludeCallbacks callbacks() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = org.lwjgl.util.shaderc.GLSLangInput.ncallbacks(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long callbacks_ctx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.shaderc.GLSLangInput.ncallbacks_ctx(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer language(@org.lwjgl.system.NativeType("glslang_source_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.nlanguage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer stage(@org.lwjgl.system.NativeType("glslang_stage_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.nstage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer client(@org.lwjgl.system.NativeType("glslang_client_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.nclient(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer client_version(@org.lwjgl.system.NativeType("glslang_target_client_version_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.nclient_version(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer target_language(@org.lwjgl.system.NativeType("glslang_target_language_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.ntarget_language(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer target_language_version(@org.lwjgl.system.NativeType("glslang_target_language_version_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.ntarget_language_version(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer code(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.ncode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer default_version(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.ndefault_version(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer default_profile(@org.lwjgl.system.NativeType("glslang_profile_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.ndefault_profile(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer force_default_version_and_profile(@org.lwjgl.system.NativeType("int") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.util.shaderc.GLSLangInput.nforce_default_version_and_profile(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer forward_compatible(@org.lwjgl.system.NativeType("int") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.util.shaderc.GLSLangInput.nforward_compatible(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer messages(@org.lwjgl.system.NativeType("glslang_messages_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.nmessages(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer resource(@org.lwjgl.system.NativeType("glslang_resource_t const *") org.lwjgl.util.shaderc.GLSLangResource r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.nresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer callbacks(@org.lwjgl.system.NativeType("glsl_include_callbacks_t") org.lwjgl.util.shaderc.GLSLIncludeCallbacks r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLangInput.ncallbacks(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer callbacks(java.util.function.Consumer<org.lwjgl.util.shaderc.GLSLIncludeCallbacks> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks r1 = r1.callbacks()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLangInput.Buffer callbacks_ctx(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.shaderc.GLSLangInput.ncallbacks_ctx(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLangInput r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3675create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.GLSLangInput r0 = org.lwjgl.util.shaderc.GLSLangInput.create(r0)
                org.lwjgl.util.shaderc.GLSLangInput.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLSLangInput(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.GLSLangInput create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLSLangInput(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_source_t")
    public int language() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlanguage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_stage_t")
    public int stage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_client_t")
    public int client() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclient(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_target_client_version_t")
    public int client_version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclient_version(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_target_language_t")
    public int target_language() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntarget_language(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_target_language_version_t")
    public int target_language_version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntarget_language_version(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer code() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String codeString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ncodeString(r0)
            return r0
    }

    public int default_version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndefault_version(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_profile_t")
    public int default_profile() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndefault_profile(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public boolean force_default_version_and_profile() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nforce_default_version_and_profile(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public boolean forward_compatible() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nforward_compatible(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_messages_t")
    public int messages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmessages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glslang_resource_t const *")
    public org.lwjgl.util.shaderc.GLSLangResource resource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.shaderc.GLSLangResource r0 = nresource(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glsl_include_callbacks_t")
    public org.lwjgl.util.shaderc.GLSLIncludeCallbacks callbacks() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = ncallbacks(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long callbacks_ctx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncallbacks_ctx(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput language(@org.lwjgl.system.NativeType("glslang_source_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlanguage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput stage(@org.lwjgl.system.NativeType("glslang_stage_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput client(@org.lwjgl.system.NativeType("glslang_client_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclient(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput client_version(@org.lwjgl.system.NativeType("glslang_target_client_version_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclient_version(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput target_language(@org.lwjgl.system.NativeType("glslang_target_language_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntarget_language(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput target_language_version(@org.lwjgl.system.NativeType("glslang_target_language_version_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntarget_language_version(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput code(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput default_version(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndefault_version(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput default_profile(@org.lwjgl.system.NativeType("glslang_profile_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndefault_profile(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput force_default_version_and_profile(@org.lwjgl.system.NativeType("int") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nforce_default_version_and_profile(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput forward_compatible(@org.lwjgl.system.NativeType("int") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nforward_compatible(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput messages(@org.lwjgl.system.NativeType("glslang_messages_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmessages(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput resource(@org.lwjgl.system.NativeType("glslang_resource_t const *") org.lwjgl.util.shaderc.GLSLangResource r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput callbacks(@org.lwjgl.system.NativeType("glsl_include_callbacks_t") org.lwjgl.util.shaderc.GLSLIncludeCallbacks r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncallbacks(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput callbacks(java.util.function.Consumer<org.lwjgl.util.shaderc.GLSLIncludeCallbacks> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r1 = r1.callbacks()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput callbacks_ctx(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ncallbacks_ctx(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput set(int r5, int r6, int r7, int r8, int r9, int r10, java.nio.ByteBuffer r11, int r12, int r13, boolean r14, boolean r15, int r16, org.lwjgl.util.shaderc.GLSLangResource r17, org.lwjgl.util.shaderc.GLSLIncludeCallbacks r18, long r19) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.language(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.stage(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.client(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.client_version(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.target_language(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.target_language_version(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.code(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.default_version(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.default_profile(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.force_default_version_and_profile(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.forward_compatible(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.messages(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.resource(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.callbacks(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.callbacks_ctx(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLangInput set(org.lwjgl.util.shaderc.GLSLangInput r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput malloc() {
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput calloc() {
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput create() {
            int r0 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput create(long r6) {
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
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

    public static org.lwjgl.util.shaderc.GLSLangInput.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.GLSLangInput r0 = new org.lwjgl.util.shaderc.GLSLangInput
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangInput.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLangInput$Buffer r0 = new org.lwjgl.util.shaderc.GLSLangInput$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLangInput.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nlanguage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.LANGUAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nstage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nclient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CLIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nclient_version(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CLIENT_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ntarget_language(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.TARGET_LANGUAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ntarget_language_version(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.TARGET_LANGUAGE_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.ByteBuffer ncode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CODE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    public static java.lang.String ncodeString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CODE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int ndefault_version(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.DEFAULT_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndefault_profile(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.DEFAULT_PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nforce_default_version_and_profile(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.FORCE_DEFAULT_VERSION_AND_PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nforward_compatible(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.FORWARD_COMPATIBLE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmessages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.MESSAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLangResource nresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.RESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.shaderc.GLSLangResource r0 = org.lwjgl.util.shaderc.GLSLangResource.createSafe(r0)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks ncallbacks(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CALLBACKS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.create(r0)
            return r0
    }

    public static long ncallbacks_ctx(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CALLBACKS_CTX
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nlanguage(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.LANGUAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nstage(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.STAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nclient(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CLIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nclient_version(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CLIENT_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ntarget_language(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.TARGET_LANGUAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ntarget_language_version(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.TARGET_LANGUAGE_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncode(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndefault_version(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.DEFAULT_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndefault_profile(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.DEFAULT_PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nforce_default_version_and_profile(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.FORCE_DEFAULT_VERSION_AND_PROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nforward_compatible(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.FORWARD_COMPATIBLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmessages(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.MESSAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nresource(long r5, org.lwjgl.util.shaderc.GLSLangResource r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.RESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncallbacks(long r7, org.lwjgl.util.shaderc.GLSLIncludeCallbacks r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.shaderc.GLSLangInput.CALLBACKS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncallbacks_ctx(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLangInput.CALLBACKS_CTX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.shaderc.GLSLangInput r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
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
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            int r4 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.util.shaderc.GLSLangInput.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.GLSLangInput.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.GLSLangInput.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.LANGUAGE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.STAGE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.CLIENT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.CLIENT_VERSION = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.TARGET_LANGUAGE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.TARGET_LANGUAGE_VERSION = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.CODE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.DEFAULT_VERSION = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.DEFAULT_PROFILE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.FORCE_DEFAULT_VERSION_AND_PROFILE = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.FORWARD_COMPATIBLE = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.MESSAGES = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.RESOURCE = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.CALLBACKS = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLangInput.CALLBACKS_CTX = r0
            return
    }
}
