package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR.class */
public class VkPhysicalDevicePortabilitySubsetFeaturesKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int CONSTANTALPHACOLORBLENDFACTORS = 0;
    public static final int EVENTS = 0;
    public static final int IMAGEVIEWFORMATREINTERPRETATION = 0;
    public static final int IMAGEVIEWFORMATSWIZZLE = 0;
    public static final int IMAGEVIEW2DON3DIMAGE = 0;
    public static final int MULTISAMPLEARRAYIMAGE = 0;
    public static final int MUTABLECOMPARISONSAMPLERS = 0;
    public static final int POINTPOLYGONS = 0;
    public static final int SAMPLERMIPLODBIAS = 0;
    public static final int SEPARATESTENCILMASKREF = 0;
    public static final int SHADERSAMPLERATEINTERPOLATIONFUNCTIONS = 0;
    public static final int TESSELLATIONISOLINES = 0;
    public static final int TESSELLATIONPOINTMODE = 0;
    public static final int TRIANGLEFANS = 0;
    public static final int VERTEXATTRIBUTEACCESSBEYONDSTRIDE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR, org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean constantAlphaColorBlendFactors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nconstantAlphaColorBlendFactors(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean events() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nevents(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean imageViewFormatReinterpretation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatReinterpretation(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean imageViewFormatSwizzle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatSwizzle(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean imageView2DOn3DImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageView2DOn3DImage(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean multisampleArrayImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmultisampleArrayImage(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean mutableComparisonSamplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmutableComparisonSamplers(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean pointPolygons() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.npointPolygons(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean samplerMipLodBias() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsamplerMipLodBias(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean separateStencilMaskRef() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nseparateStencilMaskRef(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSampleRateInterpolationFunctions() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nshaderSampleRateInterpolationFunctions(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean tessellationIsolines() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationIsolines(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean tessellationPointMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationPointMode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean triangleFans() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntriangleFans(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean vertexAttributeAccessBeyondStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nvertexAttributeAccessBeyondStride(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000163000(0x3b9d46b8, float:0.00479969)
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer constantAlphaColorBlendFactors(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nconstantAlphaColorBlendFactors(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer events(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nevents(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer imageViewFormatReinterpretation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatReinterpretation(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer imageViewFormatSwizzle(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatSwizzle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer imageView2DOn3DImage(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageView2DOn3DImage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer multisampleArrayImage(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmultisampleArrayImage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer mutableComparisonSamplers(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmutableComparisonSamplers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer pointPolygons(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.npointPolygons(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer samplerMipLodBias(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsamplerMipLodBias(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer separateStencilMaskRef(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nseparateStencilMaskRef(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer shaderSampleRateInterpolationFunctions(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nshaderSampleRateInterpolationFunctions(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer tessellationIsolines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationIsolines(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer tessellationPointMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationPointMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer triangleFans(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntriangleFans(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer vertexAttributeAccessBeyondStride(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.nvertexAttributeAccessBeyondStride(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.create(r0)
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDevicePortabilitySubsetFeaturesKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean constantAlphaColorBlendFactors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconstantAlphaColorBlendFactors(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean events() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nevents(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean imageViewFormatReinterpretation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageViewFormatReinterpretation(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean imageViewFormatSwizzle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageViewFormatSwizzle(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean imageView2DOn3DImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageView2DOn3DImage(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean multisampleArrayImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmultisampleArrayImage(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean mutableComparisonSamplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmutableComparisonSamplers(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean pointPolygons() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npointPolygons(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean samplerMipLodBias() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerMipLodBias(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean separateStencilMaskRef() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nseparateStencilMaskRef(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSampleRateInterpolationFunctions() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSampleRateInterpolationFunctions(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean tessellationIsolines() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntessellationIsolines(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean tessellationPointMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntessellationPointMode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean triangleFans() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntriangleFans(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean vertexAttributeAccessBeyondStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexAttributeAccessBeyondStride(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000163000(0x3b9d46b8, float:0.00479969)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactors(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nconstantAlphaColorBlendFactors(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR events(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nevents(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nimageViewFormatReinterpretation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzle(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nimageViewFormatSwizzle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImage(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nimageView2DOn3DImage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImage(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nmultisampleArrayImage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplers(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nmutableComparisonSamplers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygons(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            npointPolygons(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBias(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsamplerMipLodBias(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRef(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nseparateStencilMaskRef(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctions(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSampleRateInterpolationFunctions(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ntessellationIsolines(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ntessellationPointMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFans(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ntriangleFans(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStride(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nvertexAttributeAccessBeyondStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.constantAlphaColorBlendFactors(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.events(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.imageViewFormatReinterpretation(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.imageViewFormatSwizzle(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.imageView2DOn3DImage(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.multisampleArrayImage(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.mutableComparisonSamplers(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.pointPolygons(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.samplerMipLodBias(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.separateStencilMaskRef(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.shaderSampleRateInterpolationFunctions(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.tessellationIsolines(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.tessellationPointMode(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.triangleFans(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.vertexAttributeAccessBeyondStride(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR set(org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR malloc() {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR calloc() {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nconstantAlphaColorBlendFactors(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.CONSTANTALPHACOLORBLENDFACTORS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nevents(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.EVENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageViewFormatReinterpretation(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATREINTERPRETATION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageViewFormatSwizzle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATSWIZZLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageView2DOn3DImage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEW2DON3DIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmultisampleArrayImage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.MULTISAMPLEARRAYIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmutableComparisonSamplers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.MUTABLECOMPARISONSAMPLERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npointPolygons(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.POINTPOLYGONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsamplerMipLodBias(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SAMPLERMIPLODBIAS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nseparateStencilMaskRef(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SEPARATESTENCILMASKREF
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSampleRateInterpolationFunctions(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SHADERSAMPLERATEINTERPOLATIONFUNCTIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntessellationIsolines(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONISOLINES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntessellationPointMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONPOINTMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntriangleFans(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TRIANGLEFANS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvertexAttributeAccessBeyondStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.VERTEXATTRIBUTEACCESSBEYONDSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nconstantAlphaColorBlendFactors(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.CONSTANTALPHACOLORBLENDFACTORS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nevents(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.EVENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageViewFormatReinterpretation(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATREINTERPRETATION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageViewFormatSwizzle(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATSWIZZLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageView2DOn3DImage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEW2DON3DIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmultisampleArrayImage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.MULTISAMPLEARRAYIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmutableComparisonSamplers(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.MUTABLECOMPARISONSAMPLERS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npointPolygons(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.POINTPOLYGONS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsamplerMipLodBias(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SAMPLERMIPLODBIAS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nseparateStencilMaskRef(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SEPARATESTENCILMASKREF
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSampleRateInterpolationFunctions(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SHADERSAMPLERATEINTERPOLATIONFUNCTIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntessellationIsolines(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONISOLINES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntessellationPointMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONPOINTMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntriangleFans(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TRIANGLEFANS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvertexAttributeAccessBeyondStride(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.VERTEXATTRIBUTEACCESSBEYONDSTRIDE
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
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 17
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.CONSTANTALPHACOLORBLENDFACTORS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.EVENTS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATREINTERPRETATION = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATSWIZZLE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEW2DON3DIMAGE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.MULTISAMPLEARRAYIMAGE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.MUTABLECOMPARISONSAMPLERS = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.POINTPOLYGONS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SAMPLERMIPLODBIAS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SEPARATESTENCILMASKREF = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.SHADERSAMPLERATEINTERPOLATIONFUNCTIONS = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONISOLINES = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONPOINTMODE = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.TRIANGLEFANS = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR.VERTEXATTRIBUTEACCESSBEYONDSTRIDE = r0
            return
    }
}
