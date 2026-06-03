package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264QualityLevelPropertiesEXT.class */
public class VkVideoEncodeH264QualityLevelPropertiesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT> implements org.lwjgl.system.NativeResource {
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

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT, org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeH264RateControlFlagsEXT")
        public int preferredRateControlFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredRateControlFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredGopFrameCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredGopFrameCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredIdrPeriod() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredIdrPeriod(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredConsecutiveBFrameCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredConsecutiveBFrameCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredTemporalLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredTemporalLayerCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QpEXT preferredConstantQp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredConstantQp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredMaxL0ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredMaxL0ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int preferredMaxL1ReferenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredMaxL1ReferenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean preferredStdEntropyCodingModeFlag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npreferredStdEntropyCodingModeFlag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000038011(0x3b9b5e7b, float:0.0047414876)
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeH264QualityLevelPropertiesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeH264QualityLevelPropertiesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeH264RateControlFlagsEXT")
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

    public org.lwjgl.vulkan.VkVideoEncodeH264QpEXT preferredConstantQp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = npreferredConstantQp(r0)
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

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000038011(0x3b9b5e7b, float:0.0047414876)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT set(org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT malloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT calloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int npreferredRateControlFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDRATECONTROLFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npreferredGopFrameCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDGOPFRAMECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npreferredIdrPeriod(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDIDRPERIOD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npreferredConsecutiveBFrameCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDCONSECUTIVEBFRAMECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npreferredTemporalLayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDTEMPORALLAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264QpEXT npreferredConstantQp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDCONSTANTQP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoEncodeH264QpEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.create(r0)
            return r0
    }

    public static int npreferredMaxL0ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDMAXL0REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npreferredMaxL1ReferenceCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDMAXL1REFERENCECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npreferredStdEntropyCodingModeFlag(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDSTDENTROPYCODINGMODEFLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264QpEXT.ALIGNOF
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
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDRATECONTROLFLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDGOPFRAMECOUNT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDIDRPERIOD = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDCONSECUTIVEBFRAMECOUNT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDTEMPORALLAYERCOUNT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDCONSTANTQP = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDMAXL0REFERENCECOUNT = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDMAXL1REFERENCECOUNT = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264QualityLevelPropertiesEXT.PREFERREDSTDENTROPYCODINGMODEFLAG = r0
            return
    }
}
