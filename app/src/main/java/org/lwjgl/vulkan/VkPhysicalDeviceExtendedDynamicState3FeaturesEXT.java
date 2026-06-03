package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.class */
public class VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN = 0;
    public static final int EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3POLYGONMODE = 0;
    public static final int EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES = 0;
    public static final int EXTENDEDDYNAMICSTATE3SAMPLEMASK = 0;
    public static final int EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3LOGICOPENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COLORBLENDENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION = 0;
    public static final int EXTENDEDDYNAMICSTATE3COLORWRITEMASK = 0;
    public static final int EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM = 0;
    public static final int EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE = 0;
    public static final int EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE = 0;
    public static final int EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED = 0;
    public static final int EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE = 0;
    public static final int EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE = 0;
    public static final int EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE = 0;
    public static final int EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION = 0;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE = 0;
    public static final int EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE = 0;
    public static final int EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT, org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3TessellationDomainOrigin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3TessellationDomainOrigin(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClampEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClampEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3PolygonMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3PolygonMode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3RasterizationSamples() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationSamples(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3SampleMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleMask(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3AlphaToCoverageEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToCoverageEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3AlphaToOneEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToOneEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3LogicOpEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LogicOpEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendEquation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEquation(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ColorWriteMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorWriteMask(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3RasterizationStream() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationStream(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ConservativeRasterizationMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ConservativeRasterizationMode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ExtraPrimitiveOverestimationSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ExtraPrimitiveOverestimationSize(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClipEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3SampleLocationsEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleLocationsEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendAdvanced() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendAdvanced(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ProvokingVertexMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ProvokingVertexMode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3LineRasterizationMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineRasterizationMode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3LineStippleEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineStippleEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClipNegativeOneToOne() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipNegativeOneToOne(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ViewportWScalingEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportWScalingEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ViewportSwizzle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportSwizzle(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageToColorEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageToColorLocation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorLocation(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationMode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationTableEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTableEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationTable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageReductionMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageReductionMode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3RepresentativeFragmentTestEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RepresentativeFragmentTestEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean extendedDynamicState3ShadingRateImageEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ShadingRateImageEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000455000(0x3ba1bb58, float:0.004935663)
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3TessellationDomainOrigin(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3TessellationDomainOrigin(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3DepthClampEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClampEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3PolygonMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3PolygonMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3RasterizationSamples(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationSamples(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3SampleMask(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3AlphaToCoverageEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToCoverageEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3AlphaToOneEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToOneEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3LogicOpEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LogicOpEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorBlendEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorBlendEquation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEquation(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorWriteMask(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorWriteMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3RasterizationStream(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationStream(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ConservativeRasterizationMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ConservativeRasterizationMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ExtraPrimitiveOverestimationSize(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ExtraPrimitiveOverestimationSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3DepthClipEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3SampleLocationsEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleLocationsEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorBlendAdvanced(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendAdvanced(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ProvokingVertexMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ProvokingVertexMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3LineRasterizationMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineRasterizationMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3LineStippleEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineStippleEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3DepthClipNegativeOneToOne(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipNegativeOneToOne(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ViewportWScalingEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportWScalingEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ViewportSwizzle(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportSwizzle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageToColorEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageToColorLocation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorLocation(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageModulationMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageModulationTableEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTableEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageModulationTable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageReductionMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageReductionMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3RepresentativeFragmentTestEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RepresentativeFragmentTestEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ShadingRateImageEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ShadingRateImageEnable(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
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
    public boolean extendedDynamicState3TessellationDomainOrigin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3TessellationDomainOrigin(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClampEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3DepthClampEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3PolygonMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3PolygonMode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3RasterizationSamples() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3RasterizationSamples(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3SampleMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3SampleMask(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3AlphaToCoverageEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3AlphaToCoverageEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3AlphaToOneEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3AlphaToOneEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3LogicOpEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3LogicOpEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ColorBlendEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendEquation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ColorBlendEquation(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ColorWriteMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ColorWriteMask(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3RasterizationStream() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3RasterizationStream(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ConservativeRasterizationMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ConservativeRasterizationMode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ExtraPrimitiveOverestimationSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ExtraPrimitiveOverestimationSize(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClipEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3DepthClipEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3SampleLocationsEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3SampleLocationsEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendAdvanced() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ColorBlendAdvanced(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ProvokingVertexMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ProvokingVertexMode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3LineRasterizationMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3LineRasterizationMode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3LineStippleEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3LineStippleEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClipNegativeOneToOne() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3DepthClipNegativeOneToOne(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ViewportWScalingEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ViewportWScalingEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ViewportSwizzle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ViewportSwizzle(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageToColorEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3CoverageToColorEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageToColorLocation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3CoverageToColorLocation(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3CoverageModulationMode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationTableEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3CoverageModulationTableEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationTable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3CoverageModulationTable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageReductionMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3CoverageReductionMode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3RepresentativeFragmentTestEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3RepresentativeFragmentTestEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean extendedDynamicState3ShadingRateImageEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextendedDynamicState3ShadingRateImageEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000455000(0x3ba1bb58, float:0.004935663)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOrigin(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3TessellationDomainOrigin(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3DepthClampEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3PolygonMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamples(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3RasterizationSamples(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMask(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3SampleMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3AlphaToCoverageEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3AlphaToOneEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3LogicOpEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ColorBlendEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ColorBlendEquation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMask(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ColorWriteMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStream(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3RasterizationStream(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ConservativeRasterizationMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSize(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ExtraPrimitiveOverestimationSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3DepthClipEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3SampleLocationsEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvanced(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ColorBlendAdvanced(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ProvokingVertexMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3LineRasterizationMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3LineStippleEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOne(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3DepthClipNegativeOneToOne(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ViewportWScalingEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzle(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ViewportSwizzle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3CoverageToColorEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3CoverageToColorLocation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3CoverageModulationMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3CoverageModulationTableEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3CoverageModulationTable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionMode(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3CoverageReductionMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3RepresentativeFragmentTestEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nextendedDynamicState3ShadingRateImageEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3TessellationDomainOrigin(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3DepthClampEnable(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3PolygonMode(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3RasterizationSamples(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3SampleMask(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3AlphaToCoverageEnable(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3AlphaToOneEnable(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3LogicOpEnable(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ColorBlendEnable(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ColorBlendEquation(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ColorWriteMask(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3RasterizationStream(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ConservativeRasterizationMode(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ExtraPrimitiveOverestimationSize(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3DepthClipEnable(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3SampleLocationsEnable(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ColorBlendAdvanced(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ProvokingVertexMode(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3LineRasterizationMode(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3LineStippleEnable(r1)
            r0 = r4
            r1 = r28
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3DepthClipNegativeOneToOne(r1)
            r0 = r4
            r1 = r29
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ViewportWScalingEnable(r1)
            r0 = r4
            r1 = r30
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ViewportSwizzle(r1)
            r0 = r4
            r1 = r31
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3CoverageToColorEnable(r1)
            r0 = r4
            r1 = r32
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3CoverageToColorLocation(r1)
            r0 = r4
            r1 = r33
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3CoverageModulationMode(r1)
            r0 = r4
            r1 = r34
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3CoverageModulationTableEnable(r1)
            r0 = r4
            r1 = r35
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3CoverageModulationTable(r1)
            r0 = r4
            r1 = r36
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3CoverageReductionMode(r1)
            r0 = r4
            r1 = r37
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3RepresentativeFragmentTestEnable(r1)
            r0 = r4
            r1 = r38
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.extendedDynamicState3ShadingRateImageEnable(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nextendedDynamicState3TessellationDomainOrigin(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3DepthClampEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3PolygonMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3POLYGONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3RasterizationSamples(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3SampleMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3AlphaToCoverageEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3AlphaToOneEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3LogicOpEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LOGICOPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ColorBlendEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ColorBlendEquation(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ColorWriteMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORWRITEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3RasterizationStream(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ConservativeRasterizationMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ExtraPrimitiveOverestimationSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3DepthClipEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3SampleLocationsEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ColorBlendAdvanced(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ProvokingVertexMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3LineRasterizationMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3LineStippleEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3DepthClipNegativeOneToOne(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ViewportWScalingEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ViewportSwizzle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3CoverageToColorEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3CoverageToColorLocation(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3CoverageModulationMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3CoverageModulationTableEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3CoverageModulationTable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3CoverageReductionMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3RepresentativeFragmentTestEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nextendedDynamicState3ShadingRateImageEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nextendedDynamicState3TessellationDomainOrigin(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3DepthClampEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3PolygonMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3POLYGONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3RasterizationSamples(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3SampleMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3AlphaToCoverageEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3AlphaToOneEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3LogicOpEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LOGICOPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ColorBlendEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ColorBlendEquation(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ColorWriteMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORWRITEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3RasterizationStream(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ConservativeRasterizationMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ExtraPrimitiveOverestimationSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3DepthClipEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3SampleLocationsEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ColorBlendAdvanced(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ProvokingVertexMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3LineRasterizationMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3LineStippleEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3DepthClipNegativeOneToOne(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ViewportWScalingEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ViewportSwizzle(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3CoverageToColorEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3CoverageToColorLocation(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3CoverageModulationMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3CoverageModulationTableEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3CoverageModulationTable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3CoverageReductionMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3RepresentativeFragmentTestEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextendedDynamicState3ShadingRateImageEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE
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
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 33
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3POLYGONMODE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLEMASK = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LOGICOPENABLE = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDENABLE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORWRITEMASK = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE = r0
            r0 = r5
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE = r0
            r0 = r5
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION = r0
            r0 = r5
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE = r0
            r0 = r5
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE = r0
            r0 = r5
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE = r0
            r0 = r5
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE = r0
            r0 = r5
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE = r0
            r0 = r5
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE = r0
            return
    }
}
