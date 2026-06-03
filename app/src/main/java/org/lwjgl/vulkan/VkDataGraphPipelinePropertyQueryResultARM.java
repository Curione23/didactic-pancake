package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDataGraphPipelinePropertyQueryResultARM.class */
public class VkDataGraphPipelinePropertyQueryResultARM extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PROPERTY = 0;
    public static final int ISTEXT = 0;
    public static final int DATASIZE = 0;
    public static final int PDATA = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDataGraphPipelinePropertyQueryResultARM$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM, org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
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
        protected org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
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
        protected org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDataGraphPipelinePropertyARM")
        public int property() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.nproperty(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean isText() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.nisText(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long dataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ndataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer pData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.npData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000507008(0x3ba28680, float:0.0049598813)
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer property(@org.lwjgl.system.NativeType("VkDataGraphPipelinePropertyARM") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.nproperty(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer isText(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.nisText(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer dataSize(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ndataSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer pData(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.npData(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4287create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.create(r0)
                org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDataGraphPipelinePropertyQueryResultARM(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDataGraphPipelinePropertyQueryResultARM(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkStructureType")
    public int sType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDataGraphPipelinePropertyARM")
    public int property() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nproperty(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean isText() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nisText(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long dataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public java.nio.ByteBuffer pData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000507008(0x3ba28680, float:0.0049598813)
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM property(@org.lwjgl.system.NativeType("VkDataGraphPipelinePropertyARM") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nproperty(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM isText(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nisText(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM dataSize(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndataSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM pData(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM set(int r5, long r6, int r8, boolean r9, long r10, java.nio.ByteBuffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.property(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.isText(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.dataSize(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.pData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM set(org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM malloc() {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM calloc() {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM create() {
            int r0 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM create(long r6) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
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

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer r0 = new org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nproperty(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PROPERTY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nisText(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ISTEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long ndataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.DATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer npData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = ndataSize(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nproperty(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PROPERTY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nisText(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ISTEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndataSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.DATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npData(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L1a
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            ndataSize(r0, r1)
        L1a:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PROPERTY = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.ISTEXT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.DATASIZE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDataGraphPipelinePropertyQueryResultARM.PDATA = r0
            return
    }
}
