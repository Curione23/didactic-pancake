package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties.class */
public class VkPhysicalDeviceVulkan12Properties extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DRIVERID = 0;
    public static final int DRIVERNAME = 0;
    public static final int DRIVERINFO = 0;
    public static final int CONFORMANCEVERSION = 0;
    public static final int DENORMBEHAVIORINDEPENDENCE = 0;
    public static final int ROUNDINGMODEINDEPENDENCE = 0;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = 0;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = 0;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = 0;
    public static final int SHADERDENORMPRESERVEFLOAT16 = 0;
    public static final int SHADERDENORMPRESERVEFLOAT32 = 0;
    public static final int SHADERDENORMPRESERVEFLOAT64 = 0;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT16 = 0;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT32 = 0;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT64 = 0;
    public static final int SHADERROUNDINGMODERTEFLOAT16 = 0;
    public static final int SHADERROUNDINGMODERTEFLOAT32 = 0;
    public static final int SHADERROUNDINGMODERTEFLOAT64 = 0;
    public static final int SHADERROUNDINGMODERTZFLOAT16 = 0;
    public static final int SHADERROUNDINGMODERTZFLOAT32 = 0;
    public static final int SHADERROUNDINGMODERTZFLOAT64 = 0;
    public static final int MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = 0;
    public static final int SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int ROBUSTBUFFERACCESSUPDATEAFTERBIND = 0;
    public static final int QUADDIVERGENTIMPLICITLOD = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = 0;
    public static final int MAXPERSTAGEUPDATEAFTERBINDRESOURCES = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = 0;
    public static final int SUPPORTEDDEPTHRESOLVEMODES = 0;
    public static final int SUPPORTEDSTENCILRESOLVEMODES = 0;
    public static final int INDEPENDENTRESOLVENONE = 0;
    public static final int INDEPENDENTRESOLVE = 0;
    public static final int FILTERMINMAXSINGLECOMPONENTFORMATS = 0;
    public static final int FILTERMINMAXIMAGECOMPONENTMAPPING = 0;
    public static final int MAXTIMELINESEMAPHOREVALUEDIFFERENCE = 0;
    public static final int FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Properties$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDriverId")
        public int driverID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ndriverID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public java.nio.ByteBuffer driverName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ndriverName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public java.lang.String driverNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ndriverNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public java.nio.ByteBuffer driverInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ndriverInfo(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public java.lang.String driverInfoString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ndriverInfoString(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkConformanceVersion conformanceVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkConformanceVersion r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nconformanceVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
        public int denormBehaviorIndependence() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ndenormBehaviorIndependence(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
        public int roundingModeIndependence() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nroundingModeIndependence(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderSignedZeroInfNanPreserveFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderDenormPreserveFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderDenormFlushToZeroFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTEFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderRoundingModeRTZFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxUpdateAfterBindDescriptorsInAllPools() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxUpdateAfterBindDescriptorsInAllPools(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderUniformBufferArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderSampledImageArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderStorageBufferArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderStorageImageArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nshaderInputAttachmentArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean robustBufferAccessUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nrobustBufferAccessUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean quadDivergentImplicitLod() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nquadDivergentImplicitLod(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSamplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindSamplers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindSampledImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindStorageImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxPerStageDescriptorUpdateAfterBindInputAttachments(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageUpdateAfterBindResources() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxPerStageUpdateAfterBindResources(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSamplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindSamplers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindUniformBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSampledImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindSampledImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindStorageImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInputAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxDescriptorSetUpdateAfterBindInputAttachments(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkResolveModeFlags")
        public int supportedDepthResolveModes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nsupportedDepthResolveModes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkResolveModeFlags")
        public int supportedStencilResolveModes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nsupportedStencilResolveModes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean independentResolveNone() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nindependentResolveNone(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean independentResolve() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nindependentResolve(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean filterMinmaxSingleComponentFormats() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nfilterMinmaxSingleComponentFormats(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean filterMinmaxImageComponentMapping() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nfilterMinmaxImageComponentMapping(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long maxTimelineSemaphoreValueDifference() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nmaxTimelineSemaphoreValueDifference(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSampleCountFlags")
        public int framebufferIntegerColorSampleCounts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nframebufferIntegerColorSampleCounts(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 52
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceVulkan12Properties(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceVulkan12Properties(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDriverId")
    public int driverID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndriverID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public java.nio.ByteBuffer driverName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndriverName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public java.lang.String driverNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ndriverNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public java.nio.ByteBuffer driverInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndriverInfo(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public java.lang.String driverInfoString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ndriverInfoString(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersion conformanceVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkConformanceVersion r0 = nconformanceVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
    public int denormBehaviorIndependence() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndenormBehaviorIndependence(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
    public int roundingModeIndependence() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nroundingModeIndependence(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSignedZeroInfNanPreserveFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSignedZeroInfNanPreserveFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSignedZeroInfNanPreserveFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormPreserveFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormPreserveFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormPreserveFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormFlushToZeroFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormFlushToZeroFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormFlushToZeroFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTEFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTEFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTEFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTZFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTZFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTZFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxUpdateAfterBindDescriptorsInAllPools() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxUpdateAfterBindDescriptorsInAllPools(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderUniformBufferArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSampledImageArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageBufferArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageImageArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderInputAttachmentArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean robustBufferAccessUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrobustBufferAccessUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean quadDivergentImplicitLod() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nquadDivergentImplicitLod(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSamplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindSamplers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindSampledImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindStorageImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindInputAttachments(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageUpdateAfterBindResources() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageUpdateAfterBindResources(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSamplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindSamplers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindUniformBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindStorageBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSampledImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindSampledImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindStorageImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInputAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindInputAttachments(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResolveModeFlags")
    public int supportedDepthResolveModes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportedDepthResolveModes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResolveModeFlags")
    public int supportedStencilResolveModes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportedStencilResolveModes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean independentResolveNone() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindependentResolveNone(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean independentResolve() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindependentResolve(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean filterMinmaxSingleComponentFormats() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfilterMinmaxSingleComponentFormats(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean filterMinmaxImageComponentMapping() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfilterMinmaxImageComponentMapping(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long maxTimelineSemaphoreValueDifference() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxTimelineSemaphoreValueDifference(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSampleCountFlags")
    public int framebufferIntegerColorSampleCounts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframebufferIntegerColorSampleCounts(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 52
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties set(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndriverID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndriverName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 256(0x100, float:3.59E-43)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String ndriverNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer ndriverInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 256(0x100, float:3.59E-43)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String ndriverInfoString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion nconformanceVersion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.CONFORMANCEVERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkConformanceVersion r0 = org.lwjgl.vulkan.VkConformanceVersion.create(r0)
            return r0
    }

    public static int ndenormBehaviorIndependence(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DENORMBEHAVIORINDEPENDENCE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nroundingModeIndependence(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ROUNDINGMODEINDEPENDENCE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSignedZeroInfNanPreserveFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSignedZeroInfNanPreserveFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSignedZeroInfNanPreserveFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormPreserveFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormPreserveFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormPreserveFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormFlushToZeroFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormFlushToZeroFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormFlushToZeroFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTEFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTEFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTEFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTZFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTZFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTZFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxUpdateAfterBindDescriptorsInAllPools(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformBufferArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSampledImageArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageBufferArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageImageArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrobustBufferAccessUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ROBUSTBUFFERACCESSUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nquadDivergentImplicitLod(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.QUADDIVERGENTIMPLICITLOD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSamplers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSampledImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindInputAttachments(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageUpdateAfterBindResources(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindSamplers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindSampledImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindInputAttachments(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsupportedDepthResolveModes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SUPPORTEDDEPTHRESOLVEMODES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsupportedStencilResolveModes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SUPPORTEDSTENCILRESOLVEMODES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nindependentResolveNone(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVENONE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nindependentResolve(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfilterMinmaxSingleComponentFormats(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FILTERMINMAXSINGLECOMPONENTFORMATS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfilterMinmaxImageComponentMapping(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FILTERMINMAXIMAGECOMPONENTMAPPING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nmaxTimelineSemaphoreValueDifference(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXTIMELINESEMAPHOREVALUEDIFFERENCE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nframebufferIntegerColorSampleCounts(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 54
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r4 = 256(0x100, float:3.59E-43)
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            r4 = 256(0x100, float:3.59E-43)
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            int r4 = org.lwjgl.vulkan.VkConformanceVersion.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 35
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 36
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 37
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 38
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 39
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 40
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 41
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 42
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 43
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 44
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 45
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 46
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 47
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 48
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 49
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 50
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 51
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 52
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 53
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERNAME = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DRIVERINFO = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.CONFORMANCEVERSION = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.DENORMBEHAVIORINDEPENDENCE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ROUNDINGMODEINDEPENDENCE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT16 = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT32 = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMPRESERVEFLOAT64 = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT16 = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT32 = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERDENORMFLUSHTOZEROFLOAT64 = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT16 = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT32 = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTEFLOAT64 = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT16 = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT32 = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERROUNDINGMODERTZFLOAT64 = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r6
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r6
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r6
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r6
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.ROBUSTBUFFERACCESSUPDATEAFTERBIND = r0
            r0 = r6
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.QUADDIVERGENTIMPLICITLOD = r0
            r0 = r6
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = r0
            r0 = r6
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = r0
            r0 = r6
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = r0
            r0 = r6
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = r0
            r0 = r6
            r1 = 35
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = r0
            r0 = r6
            r1 = 36
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = r0
            r0 = r6
            r1 = 37
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES = r0
            r0 = r6
            r1 = 38
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = r0
            r0 = r6
            r1 = 39
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = r0
            r0 = r6
            r1 = 40
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = r0
            r0 = r6
            r1 = 41
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = r0
            r0 = r6
            r1 = 42
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = r0
            r0 = r6
            r1 = 43
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = r0
            r0 = r6
            r1 = 44
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = r0
            r0 = r6
            r1 = 45
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = r0
            r0 = r6
            r1 = 46
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SUPPORTEDDEPTHRESOLVEMODES = r0
            r0 = r6
            r1 = 47
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.SUPPORTEDSTENCILRESOLVEMODES = r0
            r0 = r6
            r1 = 48
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVENONE = r0
            r0 = r6
            r1 = 49
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.INDEPENDENTRESOLVE = r0
            r0 = r6
            r1 = 50
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FILTERMINMAXSINGLECOMPONENTFORMATS = r0
            r0 = r6
            r1 = 51
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FILTERMINMAXIMAGECOMPONENTMAPPING = r0
            r0 = r6
            r1 = 52
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.MAXTIMELINESEMAPHOREVALUEDIFFERENCE = r0
            r0 = r6
            r1 = 53
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties.FRAMEBUFFERINTEGERCOLORSAMPLECOUNTS = r0
            return
    }
}
