package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslShaderInterfaceVar.class */
@org.lwjgl.system.NativeType("struct spvc_msl_shader_interface_var")
public class SpvcMslShaderInterfaceVar extends org.lwjgl.system.Struct<org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int LOCATION = 0;
    public static final int FORMAT = 0;
    public static final int BUILTIN = 0;
    public static final int VECSIZE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcMslShaderInterfaceVar$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar, org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
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
        protected org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
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
        protected org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar getElementFactory() {
                r2 = this;
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int location() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nlocation(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spvc_msl_vertex_format")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nformat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("SpvBuiltIn")
        public int builtin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nbuiltin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int vecsize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nvecsize(r0)
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer location(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nlocation(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer format(@org.lwjgl.system.NativeType("spvc_msl_vertex_format") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nformat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer builtin(@org.lwjgl.system.NativeType("SpvBuiltIn") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nbuiltin(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer vecsize(@org.lwjgl.system.NativeType("unsigned") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.nvecsize(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3766create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.create(r0)
                org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SpvcMslShaderInterfaceVar(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SpvcMslShaderInterfaceVar(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int location() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlocation(r0)
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

    @org.lwjgl.system.NativeType("unsigned")
    public int vecsize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvecsize(r0)
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar location(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlocation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar format(@org.lwjgl.system.NativeType("spvc_msl_vertex_format") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar builtin(@org.lwjgl.system.NativeType("SpvBuiltIn") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbuiltin(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar vecsize(@org.lwjgl.system.NativeType("unsigned") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvecsize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar set(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = r0.location(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = r0.format(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = r0.builtin(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = r0.vecsize(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar set(org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar malloc() {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            int r2 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar calloc() {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar create() {
            int r0 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar create(long r6) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer malloc(int r6) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer calloc(int r7) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
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

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer create(long r6, int r8) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.ALIGNOF
            int r4 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer r0 = new org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nlocation(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.LOCATION
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nformat(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.FORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbuiltin(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.BUILTIN
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nvecsize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.VECSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nlocation(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.LOCATION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nformat(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.FORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbuiltin(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.BUILTIN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nvecsize(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.VECSIZE
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
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar r0 = r0.create(r1, r2)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.LOCATION = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.FORMAT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.BUILTIN = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.spvc.SpvcMslShaderInterfaceVar.VECSIZE = r0
            return
    }
}
