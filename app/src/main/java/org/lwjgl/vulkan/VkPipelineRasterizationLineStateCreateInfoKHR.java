package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoKHR.class */
public class VkPipelineRasterizationLineStateCreateInfoKHR extends org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer {
        private static final org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
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

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000259001(0x3b9ebdb9, float:0.004844394)
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineRasterizationMode(@org.lwjgl.system.NativeType("VkLineRasterizationMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.nlineRasterizationMode(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer stippledLineEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.nstippledLineEnable(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineStippleFactor(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.nlineStippleFactor(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineStipplePattern(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.nlineStipplePattern(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer lineStipplePattern(@org.lwjgl.system.NativeType("uint16_t") short r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.lineStipplePattern(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer lineStippleFactor(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.lineStippleFactor(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer stippledLineEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.stippledLineEnable(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer lineRasterizationMode(@org.lwjgl.system.NativeType("VkLineRasterizationMode") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.lineRasterizationMode(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        /* JADX INFO: renamed from: create */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6333create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineRasterizationLineStateCreateInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineRasterizationLineStateCreateInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000259001(0x3b9ebdb9, float:0.004844394)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR lineRasterizationMode(@org.lwjgl.system.NativeType("VkLineRasterizationMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlineRasterizationMode(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR stippledLineEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledLineEnable(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR lineStippleFactor(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlineStippleFactor(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR lineStipplePattern(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlineStipplePattern(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR set(int r5, long r6, int r8, boolean r9, int r10, short r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.lineRasterizationMode(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.stippledLineEnable(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.lineStippleFactor(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.lineStipplePattern(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR set(org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo set(int r10, long r11, int r13, boolean r14, int r15, short r16) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(@org.lwjgl.system.NativeType("uint16_t") short r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.lineStipplePattern(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.lineStippleFactor(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.stippledLineEnable(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(@org.lwjgl.system.NativeType("VkLineRasterizationMode") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.lineRasterizationMode(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
