package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH265RateControlLayerInfoKHR.class */
public class VkVideoEncodeH265RateControlLayerInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int USEMINQP = 0;
    public static final int MINQP = 0;
    public static final int USEMAXQP = 0;
    public static final int MAXQP = 0;
    public static final int USEMAXFRAMESIZE = 0;
    public static final int MAXFRAMESIZE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH265RateControlLayerInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR, org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
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
        protected org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useMinQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nuseMinQp(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265QpKHR minQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nminQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useMaxQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxQp(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265QpKHR maxQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nmaxQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useMaxFrameSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxFrameSize(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR maxFrameSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nmaxFrameSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000039010(0x3b9b6262, float:0.0047419528)
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer useMinQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nuseMinQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer minQp(org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nminQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer minQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH265QpKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r1 = r1.minQp()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer useMaxQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxQp(org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nmaxQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH265QpKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r1 = r1.maxQp()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer useMaxFrameSize(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nuseMaxFrameSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxFrameSize(org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.nmaxFrameSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer maxFrameSize(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r1 = r1.maxFrameSize()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7183create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeH265RateControlLayerInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeH265RateControlLayerInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean useMinQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuseMinQp(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265QpKHR minQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r0 = nminQp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean useMaxQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuseMaxQp(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265QpKHR maxQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r0 = nmaxQp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean useMaxFrameSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuseMaxFrameSize(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR maxFrameSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r0 = nmaxFrameSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000039010(0x3b9b6262, float:0.0047419528)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR useMinQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nuseMinQp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR minQp(org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminQp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR minQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH265QpKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r1 = r1.minQp()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR useMaxQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nuseMaxQp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR maxQp(org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxQp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR maxQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH265QpKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r1 = r1.maxQp()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR useMaxFrameSize(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nuseMaxFrameSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR maxFrameSize(org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxFrameSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR maxFrameSize(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r1 = r1.maxFrameSize()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR set(int r5, long r6, boolean r8, org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r9, boolean r10, org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r11, boolean r12, org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.useMinQp(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.minQp(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.useMaxQp(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.maxQp(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.useMaxFrameSize(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.maxFrameSize(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR set(org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR malloc() {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR calloc() {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nuseMinQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMINQP
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265QpKHR nminQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MINQP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.create(r0)
            return r0
    }

    public static int nuseMaxQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXQP
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265QpKHR nmaxQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MAXQP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.create(r0)
            return r0
    }

    public static int nuseMaxFrameSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXFRAMESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR nmaxFrameSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MAXFRAMESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR.create(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nuseMinQp(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMINQP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nminQp(long r7, org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MINQP
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nuseMaxQp(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXQP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaxQp(long r7, org.lwjgl.vulkan.VkVideoEncodeH265QpKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MAXQP
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nuseMaxFrameSize(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXFRAMESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaxFrameSize(long r7, org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MAXFRAMESIZE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH265QpKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH265FrameSizeKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMINQP = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MINQP = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXQP = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MAXQP = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.USEMAXFRAMESIZE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH265RateControlLayerInfoKHR.MAXFRAMESIZE = r0
            return
    }
}
