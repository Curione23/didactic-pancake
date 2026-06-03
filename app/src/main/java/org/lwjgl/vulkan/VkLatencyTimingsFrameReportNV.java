package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkLatencyTimingsFrameReportNV.class */
public class VkLatencyTimingsFrameReportNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PRESENTID = 0;
    public static final int INPUTSAMPLETIMEUS = 0;
    public static final int SIMSTARTTIMEUS = 0;
    public static final int SIMENDTIMEUS = 0;
    public static final int RENDERSUBMITSTARTTIMEUS = 0;
    public static final int RENDERSUBMITENDTIMEUS = 0;
    public static final int PRESENTSTARTTIMEUS = 0;
    public static final int PRESENTENDTIMEUS = 0;
    public static final int DRIVERSTARTTIMEUS = 0;
    public static final int DRIVERENDTIMEUS = 0;
    public static final int OSRENDERQUEUESTARTTIMEUS = 0;
    public static final int OSRENDERQUEUEENDTIMEUS = 0;
    public static final int GPURENDERSTARTTIMEUS = 0;
    public static final int GPURENDERENDTIMEUS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkLatencyTimingsFrameReportNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV, org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
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
        protected org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long presentID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.npresentID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long inputSampleTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ninputSampleTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long simStartTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nsimStartTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long simEndTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nsimEndTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long renderSubmitStartTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nrenderSubmitStartTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long renderSubmitEndTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nrenderSubmitEndTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long presentStartTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.npresentStartTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long presentEndTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.npresentEndTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long driverStartTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ndriverStartTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long driverEndTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ndriverEndTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long osRenderQueueStartTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nosRenderQueueStartTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long osRenderQueueEndTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nosRenderQueueEndTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long gpuRenderStartTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ngpuRenderStartTimeUs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long gpuRenderEndTimeUs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ngpuRenderEndTimeUs(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000505004(0x3ba27eac, float:0.004958948)
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4973create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.create(r0)
                org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkLatencyTimingsFrameReportNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkLatencyTimingsFrameReportNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
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

    @org.lwjgl.system.NativeType("uint64_t")
    public long presentID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npresentID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long inputSampleTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ninputSampleTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long simStartTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsimStartTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long simEndTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsimEndTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long renderSubmitStartTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrenderSubmitStartTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long renderSubmitEndTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrenderSubmitEndTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long presentStartTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npresentStartTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long presentEndTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npresentEndTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long driverStartTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndriverStartTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long driverEndTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndriverEndTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long osRenderQueueStartTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nosRenderQueueStartTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long osRenderQueueEndTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nosRenderQueueEndTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long gpuRenderStartTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ngpuRenderStartTimeUs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long gpuRenderEndTimeUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ngpuRenderEndTimeUs(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000505004(0x3ba27eac, float:0.004958948)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV set(org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV malloc() {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV calloc() {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV create() {
            int r0 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV create(long r6) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
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

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer r0 = new org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long npresentID(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PRESENTID
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ninputSampleTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.INPUTSAMPLETIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nsimStartTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIMSTARTTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nsimEndTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIMENDTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nrenderSubmitStartTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.RENDERSUBMITSTARTTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nrenderSubmitEndTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.RENDERSUBMITENDTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long npresentStartTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PRESENTSTARTTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long npresentEndTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PRESENTENDTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ndriverStartTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.DRIVERSTARTTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ndriverEndTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.DRIVERENDTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nosRenderQueueStartTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.OSRENDERQUEUESTARTTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nosRenderQueueEndTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.OSRENDERQUEUEENDTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ngpuRenderStartTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.GPURENDERSTARTTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ngpuRenderEndTimeUs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.GPURENDERENDTIMEUS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PNEXT
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
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 16
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PRESENTID = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.INPUTSAMPLETIMEUS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIMSTARTTIMEUS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.SIMENDTIMEUS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.RENDERSUBMITSTARTTIMEUS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.RENDERSUBMITENDTIMEUS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PRESENTSTARTTIMEUS = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.PRESENTENDTIMEUS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.DRIVERSTARTTIMEUS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.DRIVERENDTIMEUS = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.OSRENDERQUEUESTARTTIMEUS = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.OSRENDERQUEUEENDTIMEUS = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.GPURENDERSTARTTIMEUS = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkLatencyTimingsFrameReportNV.GPURENDERENDTIMEUS = r0
            return
    }
}
