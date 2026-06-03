package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR.class */
public class VkVideoEncodeRateControlInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int RATECONTROLMODE = 0;
    public static final int LAYERCOUNT = 0;
    public static final int PLAYERS = 0;
    public static final int VIRTUALBUFFERSIZEINMS = 0;
    public static final int INITIALVIRTUALBUFFERSIZEINMS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeRateControlInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR, org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeRateControlFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
        public int rateControlMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nrateControlMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int layerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nlayerCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
        public org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR$Buffer r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.npLayers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int virtualBufferSizeInMs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int initialVirtualBufferSizeInMs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.ninitialVirtualBufferSizeInMs(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000299001(0x3b9f59f9, float:0.0048630205)
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkVideoEncodeRateControlFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer rateControlMode(@org.lwjgl.system.NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nrateControlMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer pLayers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.npLayers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer virtualBufferSizeInMs(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.nvirtualBufferSizeInMs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer initialVirtualBufferSizeInMs(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.ninitialVirtualBufferSizeInMs(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeRateControlInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeRateControlInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoEncodeRateControlFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
    public int rateControlMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrateControlMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int layerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlayerCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkVideoEncodeRateControlLayerInfoKHR const *")
    public org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.Buffer pLayers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR$Buffer r0 = npLayers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int virtualBufferSizeInMs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvirtualBufferSizeInMs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int initialVirtualBufferSizeInMs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninitialVirtualBufferSizeInMs(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000299001(0x3b9f59f9, float:0.0048630205)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR flags(@org.lwjgl.system.NativeType("VkVideoEncodeRateControlFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR rateControlMode(@org.lwjgl.system.NativeType("VkVideoEncodeRateControlModeFlagBitsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrateControlMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR pLayers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoEncodeRateControlLayerInfoKHR const *") org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLayers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvirtualBufferSizeInMs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMs(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninitialVirtualBufferSizeInMs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR set(int r5, long r6, int r8, int r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.Buffer r10, int r11, int r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.rateControlMode(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.pLayers(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.virtualBufferSizeInMs(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.initialVirtualBufferSizeInMs(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR set(org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR malloc() {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR calloc() {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrateControlMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.RATECONTROLMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.Buffer npLayers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.PLAYERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nlayerCount(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR$Buffer r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.createSafe(r0, r1)
            return r0
    }

    public static int nvirtualBufferSizeInMs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.VIRTUALBUFFERSIZEINMS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ninitialVirtualBufferSizeInMs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.INITIALVIRTUALBUFFERSIZEINMS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nrateControlMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.RATECONTROLMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlayerCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npLayers(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkVideoEncodeRateControlLayerInfoKHR.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.PLAYERS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nlayerCount(r0, r1)
            return
    }

    public static void nvirtualBufferSizeInMs(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.VIRTUALBUFFERSIZEINMS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ninitialVirtualBufferSizeInMs(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.INITIALVIRTUALBUFFERSIZEINMS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nlayerCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.PLAYERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.RATECONTROLMODE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.LAYERCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.PLAYERS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.VIRTUALBUFFERSIZEINMS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeRateControlInfoKHR.INITIALVIRTUALBUFFERSIZEINMS = r0
            return
    }
}
