package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264QualityLevelPropertiesKHR.class */
public class VkVideoEncodeH264QualityLevelPropertiesKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PREFERREDRATECONTROLFLAGS = 0;
    public static final int PREFERREDGOPFRAMECOUNT = 0;
    public static final int PREFERREDIDRPERIOD = 0;
    public static final int PREFERREDCONSECUTIVEBFRAMECOUNT = 0;
    public static final int PREFERREDTEMPORALLAYERCOUNT = 0;
    public static final int PREFERREDCONSTANTQP = 0;
    public static final int PREFERREDMAXL0REFERENCECOUNT = 0;
    public static final int PREFERREDMAXL1REFERENCECOUNT = 0;
    public static final int PREFERREDSTDENTROPYCODINGMODEFLAG = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR, org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
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
        protected org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH264RateControlFlagsKHR")
        public int preferredRateControlFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredRateControlFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredGopFrameCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredGopFrameCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredIdrPeriod() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredIdrPeriod(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredConsecutiveBFrameCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredConsecutiveBFrameCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredTemporalLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredTemporalLayerCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QpKHR preferredConstantQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH264QpKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredConstantQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredMaxL0ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredMaxL0ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredMaxL1ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredMaxL1ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean preferredStdEntropyCodingModeFlag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npreferredStdEntropyCodingModeFlag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000038011(0x3b9b5e7b, float:0.0047414876)
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7087create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeH264QualityLevelPropertiesKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeH264QualityLevelPropertiesKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeH264RateControlFlagsKHR")
    public int preferredRateControlFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredRateControlFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int preferredGopFrameCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredGopFrameCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int preferredIdrPeriod() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredIdrPeriod(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int preferredConsecutiveBFrameCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredConsecutiveBFrameCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int preferredTemporalLayerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredTemporalLayerCount(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QpKHR preferredConstantQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH264QpKHR r0 = npreferredConstantQp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int preferredMaxL0ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredMaxL0ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int preferredMaxL1ReferenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredMaxL1ReferenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean preferredStdEntropyCodingModeFlag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredStdEntropyCodingModeFlag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000038011(0x3b9b5e7b, float:0.0047414876)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR set(org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR malloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR calloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int npreferredRateControlFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDRATECONTROLFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npreferredGopFrameCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDGOPFRAMECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npreferredIdrPeriod(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDIDRPERIOD
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npreferredConsecutiveBFrameCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDCONSECUTIVEBFRAMECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npreferredTemporalLayerCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDTEMPORALLAYERCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QpKHR npreferredConstantQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDCONSTANTQP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH264QpKHR r0 = org.lwjgl.vulkan.VkVideoEncodeH264QpKHR.create(r0)
            return r0
    }

    public static int npreferredMaxL0ReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDMAXL0REFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npreferredMaxL1ReferenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDMAXL1REFERENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npreferredStdEntropyCodingModeFlag(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDSTDENTROPYCODINGMODEFLAG
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PNEXT
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
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QpKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264QpKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDRATECONTROLFLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDGOPFRAMECOUNT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDIDRPERIOD = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDCONSECUTIVEBFRAMECOUNT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDTEMPORALLAYERCOUNT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDCONSTANTQP = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDMAXL0REFERENCECOUNT = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDMAXL1REFERENCECOUNT = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesKHR.PREFERREDSTDENTROPYCODINGMODEFLAG = r0
            return
    }
}
