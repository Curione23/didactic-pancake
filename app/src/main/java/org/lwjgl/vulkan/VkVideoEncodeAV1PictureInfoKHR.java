package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeAV1PictureInfoKHR.class */
public class VkVideoEncodeAV1PictureInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PREDICTIONMODE = 0;
    public static final int RATECONTROLGROUP = 0;
    public static final int CONSTANTQINDEX = 0;
    public static final int PSTDPICTUREINFO = 0;
    public static final int REFERENCENAMESLOTINDICES = 0;
    public static final int PRIMARYREFERENCECDFONLY = 0;
    public static final int GENERATEOBUEXTENSIONHEADER = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeAV1PictureInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR, org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
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
        protected org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeAV1PredictionModeKHR")
        public int predictionMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.npredictionMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeAV1RateControlGroupKHR")
        public int rateControlGroup() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int constantQIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoEncodeAV1PictureInfo const *")
        public org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo pStdPictureInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public java.nio.IntBuffer referenceNameSlotIndices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int referenceNameSlotIndices(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean primaryReferenceCdfOnly() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean generateObuExtensionHeader() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000513002(0x3ba29dea, float:0.0049626725)
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer predictionMode(@org.lwjgl.system.NativeType("VkVideoEncodeAV1PredictionModeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.npredictionMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer rateControlGroup(@org.lwjgl.system.NativeType("VkVideoEncodeAV1RateControlGroupKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nrateControlGroup(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer constantQIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nconstantQIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer pStdPictureInfo(@org.lwjgl.system.NativeType("StdVideoEncodeAV1PictureInfo const *") org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.npStdPictureInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(@org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nreferenceNameSlotIndices(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer primaryReferenceCdfOnly(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.nprimaryReferenceCdfOnly(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer generateObuExtensionHeader(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.ngenerateObuExtensionHeader(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7016create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeAV1PictureInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeAV1PictureInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeAV1PredictionModeKHR")
    public int predictionMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npredictionMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeAV1RateControlGroupKHR")
    public int rateControlGroup() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrateControlGroup(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int constantQIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconstantQIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoEncodeAV1PictureInfo const *")
    public org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo pStdPictureInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo r0 = npStdPictureInfo(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
    public java.nio.IntBuffer referenceNameSlotIndices() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nreferenceNameSlotIndices(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int referenceNameSlotIndices(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nreferenceNameSlotIndices(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean primaryReferenceCdfOnly() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprimaryReferenceCdfOnly(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean generateObuExtensionHeader() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngenerateObuExtensionHeader(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000513002(0x3ba29dea, float:0.0049626725)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR predictionMode(@org.lwjgl.system.NativeType("VkVideoEncodeAV1PredictionModeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npredictionMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR rateControlGroup(@org.lwjgl.system.NativeType("VkVideoEncodeAV1RateControlGroupKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrateControlGroup(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR constantQIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nconstantQIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(@org.lwjgl.system.NativeType("StdVideoEncodeAV1PictureInfo const *") org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStdPictureInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(@org.lwjgl.system.NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreferenceNameSlotIndices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nreferenceNameSlotIndices(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nprimaryReferenceCdfOnly(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ngenerateObuExtensionHeader(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR set(int r5, long r6, int r8, int r9, int r10, org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo r11, java.nio.IntBuffer r12, boolean r13, boolean r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.predictionMode(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.rateControlGroup(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.constantQIndex(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.pStdPictureInfo(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.referenceNameSlotIndices(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.primaryReferenceCdfOnly(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.generateObuExtensionHeader(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR set(org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR malloc() {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR calloc() {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int npredictionMode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PREDICTIONMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nrateControlGroup(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.RATECONTROLGROUP
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nconstantQIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.CONSTANTQINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo npStdPictureInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo.create(r0)
            return r0
    }

    public static java.nio.IntBuffer nreferenceNameSlotIndices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nreferenceNameSlotIndices(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nprimaryReferenceCdfOnly(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PRIMARYREFERENCECDFONLY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ngenerateObuExtensionHeader(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.GENERATEOBUEXTENSIONHEADER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npredictionMode(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PREDICTIONMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nrateControlGroup(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.RATECONTROLGROUP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nconstantQIndex(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.CONSTANTQINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npStdPictureInfo(long r5, org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nreferenceNameSlotIndices(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 7
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nreferenceNameSlotIndices(long r7, int r9, int r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 7
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nprimaryReferenceCdfOnly(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PRIMARYREFERENCECDFONLY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ngenerateObuExtensionHeader(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.GENERATEOBUEXTENSIONHEADER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoEncodeAV1PictureInfo.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            r4 = 7
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PREDICTIONMODE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.RATECONTROLGROUP = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.CONSTANTQINDEX = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PSTDPICTUREINFO = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.PRIMARYREFERENCECDFONLY = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeAV1PictureInfoKHR.GENERATEOBUEXTENSIONHEADER = r0
            return
    }
}
