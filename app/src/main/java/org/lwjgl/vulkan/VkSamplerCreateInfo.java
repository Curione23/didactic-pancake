package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerCreateInfo.class */
public class VkSamplerCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSamplerCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int MAGFILTER = 0;
    public static final int MINFILTER = 0;
    public static final int MIPMAPMODE = 0;
    public static final int ADDRESSMODEU = 0;
    public static final int ADDRESSMODEV = 0;
    public static final int ADDRESSMODEW = 0;
    public static final int MIPLODBIAS = 0;
    public static final int ANISOTROPYENABLE = 0;
    public static final int MAXANISOTROPY = 0;
    public static final int COMPAREENABLE = 0;
    public static final int COMPAREOP = 0;
    public static final int MINLOD = 0;
    public static final int MAXLOD = 0;
    public static final int BORDERCOLOR = 0;
    public static final int UNNORMALIZEDCOORDINATES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSamplerCreateInfo, org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSamplerCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSamplerCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSamplerCreateInfo r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFilter")
        public int magFilter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nmagFilter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFilter")
        public int minFilter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nminFilter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerMipmapMode")
        public int mipmapMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nmipmapMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerAddressMode")
        public int addressModeU() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.naddressModeU(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerAddressMode")
        public int addressModeV() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.naddressModeV(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerAddressMode")
        public int addressModeW() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.naddressModeW(r0)
                return r0
        }

        public float mipLodBias() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nmipLodBias(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean anisotropyEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nanisotropyEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public float maxAnisotropy() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nmaxAnisotropy(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean compareEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.ncompareEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkCompareOp")
        public int compareOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.ncompareOp(r0)
                return r0
        }

        public float minLod() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nminLod(r0)
                return r0
        }

        public float maxLod() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nmaxLod(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBorderColor")
        public int borderColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nborderColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean unnormalizedCoordinates() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.nunnormalizedCoordinates(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 31
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSamplerCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerBlockMatchWindowCreateInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerBlockMatchWindowCreateInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerCubicWeightsCreateInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerCubicWeightsCreateInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerCustomBorderColorCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerCustomBorderColorCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerReductionModeCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerReductionModeCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkSamplerCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer magFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nmagFilter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer minFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nminFilter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer mipmapMode(@org.lwjgl.system.NativeType("VkSamplerMipmapMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nmipmapMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer addressModeU(@org.lwjgl.system.NativeType("VkSamplerAddressMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.naddressModeU(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer addressModeV(@org.lwjgl.system.NativeType("VkSamplerAddressMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.naddressModeV(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer addressModeW(@org.lwjgl.system.NativeType("VkSamplerAddressMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.naddressModeW(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer mipLodBias(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nmipLodBias(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer anisotropyEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkSamplerCreateInfo.nanisotropyEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer maxAnisotropy(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nmaxAnisotropy(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer compareEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkSamplerCreateInfo.ncompareEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer compareOp(@org.lwjgl.system.NativeType("VkCompareOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.ncompareOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer minLod(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nminLod(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer maxLod(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nmaxLod(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer borderColor(@org.lwjgl.system.NativeType("VkBorderColor") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerCreateInfo.nborderColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer unnormalizedCoordinates(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkSamplerCreateInfo.nunnormalizedCoordinates(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSamplerCreateInfo r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.create(r0)
                org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSamplerCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSamplerCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSamplerCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkSamplerCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFilter")
    public int magFilter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmagFilter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFilter")
    public int minFilter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nminFilter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSamplerMipmapMode")
    public int mipmapMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmipmapMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSamplerAddressMode")
    public int addressModeU() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naddressModeU(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSamplerAddressMode")
    public int addressModeV() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naddressModeV(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSamplerAddressMode")
    public int addressModeW() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naddressModeW(r0)
            return r0
    }

    public float mipLodBias() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmipLodBias(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean anisotropyEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nanisotropyEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public float maxAnisotropy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmaxAnisotropy(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean compareEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncompareEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkCompareOp")
    public int compareOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncompareOp(r0)
            return r0
    }

    public float minLod() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nminLod(r0)
            return r0
    }

    public float maxLod() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmaxLod(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBorderColor")
    public int borderColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nborderColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean unnormalizedCoordinates() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nunnormalizedCoordinates(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 31
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerBlockMatchWindowCreateInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerBlockMatchWindowCreateInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerCubicWeightsCreateInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerCubicWeightsCreateInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerCustomBorderColorCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerCustomBorderColorCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerReductionModeCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerReductionModeCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo flags(@org.lwjgl.system.NativeType("VkSamplerCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo magFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmagFilter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo minFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminFilter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo mipmapMode(@org.lwjgl.system.NativeType("VkSamplerMipmapMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmipmapMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo addressModeU(@org.lwjgl.system.NativeType("VkSamplerAddressMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naddressModeU(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo addressModeV(@org.lwjgl.system.NativeType("VkSamplerAddressMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naddressModeV(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo addressModeW(@org.lwjgl.system.NativeType("VkSamplerAddressMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naddressModeW(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo mipLodBias(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmipLodBias(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo anisotropyEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nanisotropyEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo maxAnisotropy(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxAnisotropy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo compareEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ncompareEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo compareOp(@org.lwjgl.system.NativeType("VkCompareOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncompareOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo minLod(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminLod(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo maxLod(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxLod(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo borderColor(@org.lwjgl.system.NativeType("VkBorderColor") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nborderColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo unnormalizedCoordinates(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nunnormalizedCoordinates(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, int r13, int r14, float r15, boolean r16, float r17, boolean r18, int r19, float r20, float r21, int r22, boolean r23) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.magFilter(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.minFilter(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.mipmapMode(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.addressModeU(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.addressModeV(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.addressModeW(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.mipLodBias(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.anisotropyEnable(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.maxAnisotropy(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.compareEnable(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.compareOp(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.minLod(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.maxLod(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.borderColor(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.unnormalizedCoordinates(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerCreateInfo set(org.lwjgl.vulkan.VkSamplerCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo malloc() {
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo calloc() {
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmagFilter(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MAGFILTER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nminFilter(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MINFILTER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmipmapMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MIPMAPMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int naddressModeU(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEU
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int naddressModeV(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEV
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int naddressModeW(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEW
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static float nmipLodBias(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MIPLODBIAS
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static int nanisotropyEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ANISOTROPYENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static float nmaxAnisotropy(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MAXANISOTROPY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static int ncompareEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncompareOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static float nminLod(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MINLOD
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nmaxLod(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MAXLOD
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static int nborderColor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.BORDERCOLOR
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nunnormalizedCoordinates(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmagFilter(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MAGFILTER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nminFilter(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MINFILTER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmipmapMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MIPMAPMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void naddressModeU(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEU
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void naddressModeV(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEV
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void naddressModeW(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEW
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmipLodBias(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MIPLODBIAS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nanisotropyEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.ANISOTROPYENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxAnisotropy(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MAXANISOTROPY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void ncompareEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncompareOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nminLod(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MINLOD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nmaxLod(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.MAXLOD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nborderColor(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.BORDERCOLOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nunnormalizedCoordinates(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 18
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSamplerCreateInfo.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSamplerCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSamplerCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.MAGFILTER = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.MINFILTER = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.MIPMAPMODE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEU = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEV = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.ADDRESSMODEW = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.MIPLODBIAS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.ANISOTROPYENABLE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.MAXANISOTROPY = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREENABLE = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.COMPAREOP = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.MINLOD = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.MAXLOD = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.BORDERCOLOR = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES = r0
            return
    }
}
