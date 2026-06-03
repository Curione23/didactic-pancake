package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLIncludeResult.class */
@org.lwjgl.system.NativeType("struct glsl_include_result_t")
public class GLSLIncludeResult extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.GLSLIncludeResult> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int HEADER_NAME = 0;
    public static final int HEADER_DATA = 0;
    public static final int HEADER_LENGTH = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLIncludeResult$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.GLSLIncludeResult, org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.GLSLIncludeResult ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
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
        protected org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
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
        protected org.lwjgl.util.shaderc.GLSLIncludeResult getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.GLSLIncludeResult r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer header_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.nheader_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String header_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.nheader_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer header_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.nheader_data(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long header_length() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.nheader_length(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer header_name(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLIncludeResult.nheader_name(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer header_data(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLIncludeResult.nheader_data(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer header_length(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.shaderc.GLSLIncludeResult.nheader_length(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLIncludeResult r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3669create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.GLSLIncludeResult r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.create(r0)
                org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLSLIncludeResult(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.GLSLIncludeResult create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLSLIncludeResult(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer header_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nheader_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String header_nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nheader_nameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer header_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nheader_data(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long header_length() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nheader_length(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeResult header_name(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheader_name(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeResult header_data(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheader_data(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeResult header_length(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nheader_length(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeResult set(java.nio.ByteBuffer r5, java.nio.ByteBuffer r6, long r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = r0.header_name(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = r0.header_data(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = r0.header_length(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeResult set(org.lwjgl.util.shaderc.GLSLIncludeResult r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult malloc() {
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult calloc() {
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult create() {
            int r0 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult create(long r6) {
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
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

    public static org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeResult.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeResult$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer nheader_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    public static java.lang.String nheader_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static java.nio.ByteBuffer nheader_data(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nheader_length(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nheader_length(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_LENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nheader_name(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nheader_data(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1b
        L16:
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
        L1b:
            nheader_length(r0, r1)
            return
    }

    public static void nheader_length(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_LENGTH
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
            org.lwjgl.util.shaderc.GLSLIncludeResult r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.GLSLIncludeResult.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.GLSLIncludeResult.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_NAME = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_DATA = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLIncludeResult.HEADER_LENGTH = r0
            return
    }
}
