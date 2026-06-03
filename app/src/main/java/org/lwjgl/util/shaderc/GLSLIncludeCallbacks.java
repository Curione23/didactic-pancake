package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLIncludeCallbacks.class */
@org.lwjgl.system.NativeType("struct glsl_include_callbacks_t")
public class GLSLIncludeCallbacks extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.GLSLIncludeCallbacks> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int INCLUDE_SYSTEM = 0;
    public static final int INCLUDE_LOCAL = 0;
    public static final int FREE_INCLUDE_RESULT = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/GLSLIncludeCallbacks$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.GLSLIncludeCallbacks, org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.GLSLIncludeCallbacks ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
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
        protected org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
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
        protected org.lwjgl.util.shaderc.GLSLIncludeCallbacks getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("glsl_include_system_func")
        public org.lwjgl.util.shaderc.GLSLIncludeSystemFunc include_system() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.shaderc.GLSLIncludeSystemFunc r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ninclude_system(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glsl_include_local_func")
        public org.lwjgl.util.shaderc.GLSLIncludeLocalFunc include_local() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.shaderc.GLSLIncludeLocalFunc r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ninclude_local(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("glsl_free_include_result_func")
        public org.lwjgl.util.shaderc.GLSLFreeIncludeResultFunc free_include_result() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.shaderc.GLSLFreeIncludeResultFunc r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.nfree_include_result(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer include_system(@org.lwjgl.system.NativeType("glsl_include_system_func") org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ninclude_system(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer include_local(@org.lwjgl.system.NativeType("glsl_include_local_func") org.lwjgl.util.shaderc.GLSLIncludeLocalFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ninclude_local(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer free_include_result(@org.lwjgl.system.NativeType("glsl_free_include_result_func") org.lwjgl.util.shaderc.GLSLFreeIncludeResultFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks.nfree_include_result(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3665create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.create(r0)
                org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLSLIncludeCallbacks(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.GLSLIncludeCallbacks create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLSLIncludeCallbacks(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("glsl_include_system_func")
    public org.lwjgl.util.shaderc.GLSLIncludeSystemFunc include_system() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.shaderc.GLSLIncludeSystemFunc r0 = ninclude_system(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glsl_include_local_func")
    public org.lwjgl.util.shaderc.GLSLIncludeLocalFunc include_local() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.shaderc.GLSLIncludeLocalFunc r0 = ninclude_local(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("glsl_free_include_result_func")
    public org.lwjgl.util.shaderc.GLSLFreeIncludeResultFunc free_include_result() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.shaderc.GLSLFreeIncludeResultFunc r0 = nfree_include_result(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeCallbacks include_system(@org.lwjgl.system.NativeType("glsl_include_system_func") org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninclude_system(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeCallbacks include_local(@org.lwjgl.system.NativeType("glsl_include_local_func") org.lwjgl.util.shaderc.GLSLIncludeLocalFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninclude_local(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeCallbacks free_include_result(@org.lwjgl.system.NativeType("glsl_free_include_result_func") org.lwjgl.util.shaderc.GLSLFreeIncludeResultFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfree_include_result(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeCallbacks set(org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r4, org.lwjgl.util.shaderc.GLSLIncludeLocalFuncI r5, org.lwjgl.util.shaderc.GLSLFreeIncludeResultFuncI r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = r0.include_system(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = r0.include_local(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = r0.free_include_result(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.shaderc.GLSLIncludeCallbacks set(org.lwjgl.util.shaderc.GLSLIncludeCallbacks r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks malloc() {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks calloc() {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks create() {
            int r0 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks create(long r6) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
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

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeCallbacks.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer r0 = new org.lwjgl.util.shaderc.GLSLIncludeCallbacks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeSystemFunc ninclude_system(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.INCLUDE_SYSTEM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.shaderc.GLSLIncludeSystemFunc r0 = org.lwjgl.util.shaderc.GLSLIncludeSystemFunc.createSafe(r0)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLIncludeLocalFunc ninclude_local(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.INCLUDE_LOCAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.shaderc.GLSLIncludeLocalFunc r0 = org.lwjgl.util.shaderc.GLSLIncludeLocalFunc.createSafe(r0)
            return r0
    }

    public static org.lwjgl.util.shaderc.GLSLFreeIncludeResultFunc nfree_include_result(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.FREE_INCLUDE_RESULT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.shaderc.GLSLFreeIncludeResultFunc r0 = org.lwjgl.util.shaderc.GLSLFreeIncludeResultFunc.createSafe(r0)
            return r0
    }

    public static void ninclude_system(long r5, org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.INCLUDE_SYSTEM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ninclude_local(long r5, org.lwjgl.util.shaderc.GLSLIncludeLocalFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.INCLUDE_LOCAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nfree_include_result(long r5, org.lwjgl.util.shaderc.GLSLFreeIncludeResultFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.FREE_INCLUDE_RESULT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.shaderc.GLSLIncludeCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks.INCLUDE_SYSTEM = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks.INCLUDE_LOCAL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.GLSLIncludeCallbacks.FREE_INCLUDE_RESULT = r0
            return
    }
}
