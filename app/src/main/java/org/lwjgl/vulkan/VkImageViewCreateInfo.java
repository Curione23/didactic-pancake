package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewCreateInfo.class */
public class VkImageViewCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkImageViewCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int IMAGE = 0;
    public static final int VIEWTYPE = 0;
    public static final int FORMAT = 0;
    public static final int COMPONENTS = 0;
    public static final int SUBRESOURCERANGE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkImageViewCreateInfo, org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkImageViewCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageViewCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageViewCreateInfo r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageViewCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImage")
        public long image() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.nimage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageViewType")
        public int viewType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.nviewType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.nformat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkComponentMapping components() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkComponentMapping r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.ncomponents(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange subresourceRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.nsubresourceRange(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 15
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageViewCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageViewASTCDecodeModeEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageViewASTCDecodeModeEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageViewMinLodCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageViewMinLodCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageViewSlicedCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageViewSlicedCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageViewUsageCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageViewUsageCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageViewUsageCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageViewUsageCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkImageViewCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer image(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageViewCreateInfo.nimage(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer viewType(@org.lwjgl.system.NativeType("VkImageViewType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewCreateInfo.nviewType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewCreateInfo.nformat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer components(org.lwjgl.vulkan.VkComponentMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewCreateInfo.ncomponents(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewCreateInfo.nsubresourceRange(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageViewCreateInfo r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.create(r0)
                org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageViewCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageViewCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageViewCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkImageViewCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImage")
    public long image() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageViewType")
    public int viewType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nviewType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkComponentMapping components() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkComponentMapping r0 = ncomponents(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange subresourceRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = nsubresourceRange(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 15
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkImageViewASTCDecodeModeEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageViewASTCDecodeModeEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkImageViewMinLodCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageViewMinLodCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkImageViewSlicedCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageViewSlicedCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkImageViewUsageCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageViewUsageCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkImageViewUsageCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageViewUsageCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo flags(@org.lwjgl.system.NativeType("VkImageViewCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo image(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nimage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo viewType(@org.lwjgl.system.NativeType("VkImageViewType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nviewType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo components(org.lwjgl.vulkan.VkComponentMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncomponents(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubresourceRange(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo set(int r5, long r6, int r8, long r9, int r11, int r12, org.lwjgl.vulkan.VkComponentMapping r13, org.lwjgl.vulkan.VkImageSubresourceRange r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.image(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.viewType(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.format(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.components(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.subresourceRange(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewCreateInfo set(org.lwjgl.vulkan.VkImageViewCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo malloc() {
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo calloc() {
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageViewCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageViewCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nimage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.IMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nviewType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.VIEWTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkComponentMapping ncomponents(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewCreateInfo.COMPONENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkComponentMapping r0 = org.lwjgl.vulkan.VkComponentMapping.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange nsubresourceRange(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewCreateInfo.SUBRESOURCERANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkImageSubresourceRange.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimage(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.IMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nviewType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.VIEWTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nformat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncomponents(long r7, org.lwjgl.vulkan.VkComponentMapping r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageViewCreateInfo.COMPONENTS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkComponentMapping.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsubresourceRange(long r7, org.lwjgl.vulkan.VkImageSubresourceRange r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageViewCreateInfo.SUBRESOURCERANGE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
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
            org.lwjgl.vulkan.VkImageViewCreateInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkImageViewCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkComponentMapping.SIZEOF
            int r4 = org.lwjgl.vulkan.VkComponentMapping.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkImageViewCreateInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkImageViewCreateInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.IMAGE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.VIEWTYPE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.FORMAT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.COMPONENTS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewCreateInfo.SUBRESOURCERANGE = r0
            return
    }
}
