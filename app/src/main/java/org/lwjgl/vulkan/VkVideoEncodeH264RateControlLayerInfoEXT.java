package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlLayerInfoEXT.class */
public class VkVideoEncodeH264RateControlLayerInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT> implements org.lwjgl.system.NativeResource {
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

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264RateControlLayerInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT, org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
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

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useMinQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nuseMinQp(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QpEXT minQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nminQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useMaxQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxQp(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QpEXT maxQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nmaxQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useMaxFrameSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxFrameSize(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT maxFrameSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nmaxFrameSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000038009(0x3b9b5e79, float:0.0047414866)
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer useMinQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nuseMinQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer minQp(org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nminQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer minQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH264QpEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r1 = r1.minQp()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer useMaxQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxQp(org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nmaxQp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH264QpEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r1 = r1.maxQp()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer useMaxFrameSize(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nuseMaxFrameSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxFrameSize(org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.nmaxFrameSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer maxFrameSize(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r1 = r1.maxFrameSize()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeH264RateControlLayerInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeH264RateControlLayerInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
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

    public org.lwjgl.vulkan.VkVideoEncodeH264QpEXT minQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = nminQp(r0)
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

    public org.lwjgl.vulkan.VkVideoEncodeH264QpEXT maxQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = nmaxQp(r0)
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

    public org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT maxFrameSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r0 = nmaxFrameSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000038009(0x3b9b5e79, float:0.0047414866)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT useMinQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT minQp(org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminQp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT minQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH264QpEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r1 = r1.minQp()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT useMaxQp(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT maxQp(org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxQp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT maxQp(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH264QpEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r1 = r1.maxQp()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT useMaxFrameSize(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT maxFrameSize(org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxFrameSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT maxFrameSize(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r1 = r1.maxFrameSize()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT set(int r5, long r6, boolean r8, org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r9, boolean r10, org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r11, boolean r12, org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.useMinQp(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.minQp(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.useMaxQp(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.maxQp(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.useMaxFrameSize(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.maxFrameSize(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT set(org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT malloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT calloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nuseMinQp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMINQP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QpEXT nminQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MINQP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.create(r0)
            return r0
    }

    public static int nuseMaxQp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXQP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QpEXT nmaxQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MAXQP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.create(r0)
            return r0
    }

    public static int nuseMaxFrameSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXFRAMESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT nmaxFrameSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MAXFRAMESIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nuseMinQp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMINQP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nminQp(long r7, org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MINQP
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nuseMaxQp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXQP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxQp(long r7, org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MAXQP
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nuseMaxFrameSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXFRAMESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxFrameSize(long r7, org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MAXFRAMESIZE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264FrameSizeEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMINQP = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MINQP = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXQP = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MAXQP = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.USEMAXFRAMESIZE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264RateControlLayerInfoEXT.MAXFRAMESIZE = r0
            return
    }
}
