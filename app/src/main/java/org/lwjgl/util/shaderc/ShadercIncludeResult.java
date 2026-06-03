package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/ShadercIncludeResult.class */
@org.lwjgl.system.NativeType("struct shaderc_include_result")
public class ShadercIncludeResult extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.ShadercIncludeResult> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SOURCE_NAME = 0;
    public static final int SOURCE_NAME_LENGTH = 0;
    public static final int CONTENT = 0;
    public static final int CONTENT_LENGTH = 0;
    public static final int USER_DATA = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/ShadercIncludeResult$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.ShadercIncludeResult, org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.ShadercIncludeResult ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
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
        protected org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
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
        protected org.lwjgl.util.shaderc.ShadercIncludeResult getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.ShadercIncludeResult r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer source_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.nsource_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String source_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.nsource_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long source_name_length() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.nsource_name_length(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer content() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.ncontent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String contentString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.ncontentString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long content_length() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.ncontent_length(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long user_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.nuser_data(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer source_name(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.ShadercIncludeResult.nsource_name(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer content(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.ShadercIncludeResult.ncontent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer user_data(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.shaderc.ShadercIncludeResult.nuser_data(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.ShadercIncludeResult r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3723create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.ShadercIncludeResult r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.create(r0)
                org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected ShadercIncludeResult(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.ShadercIncludeResult create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public ShadercIncludeResult(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer source_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nsource_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String source_nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nsource_nameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long source_name_length() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsource_name_length(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer content() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncontent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String contentString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ncontentString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long content_length() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncontent_length(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long user_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser_data(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.ShadercIncludeResult source_name(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsource_name(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.ShadercIncludeResult content(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncontent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.ShadercIncludeResult user_data(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nuser_data(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.shaderc.ShadercIncludeResult set(java.nio.ByteBuffer r5, java.nio.ByteBuffer r6, long r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = r0.source_name(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = r0.content(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = r0.user_data(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.ShadercIncludeResult set(org.lwjgl.util.shaderc.ShadercIncludeResult r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult malloc() {
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult calloc() {
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult create() {
            int r0 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult create(long r6) {
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
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

    public static org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.ShadercIncludeResult.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer r0 = new org.lwjgl.util.shaderc.ShadercIncludeResult$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer nsource_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nsource_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static long nsource_name_length(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME_LENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer ncontent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String ncontentString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static long ncontent_length(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT_LENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nuser_data(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.USER_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nsource_name(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            nsource_name_length(r0, r1)
            return
    }

    public static void nsource_name_length(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME_LENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncontent(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            ncontent_length(r0, r1)
            return
    }

    public static void ncontent_length(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT_LENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nuser_data(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.USER_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT
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
            org.lwjgl.util.shaderc.ShadercIncludeResult r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.shaderc.ShadercIncludeResult.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.ShadercIncludeResult.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.ShadercIncludeResult.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.ShadercIncludeResult.SOURCE_NAME_LENGTH = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.ShadercIncludeResult.CONTENT_LENGTH = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.ShadercIncludeResult.USER_DATA = r0
            return
    }
}
