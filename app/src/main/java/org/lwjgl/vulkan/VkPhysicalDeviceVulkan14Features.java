package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Features.class */
public class VkPhysicalDeviceVulkan14Features extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int GLOBALPRIORITYQUERY = 0;
    public static final int SHADERSUBGROUPROTATE = 0;
    public static final int SHADERSUBGROUPROTATECLUSTERED = 0;
    public static final int SHADERFLOATCONTROLS2 = 0;
    public static final int SHADEREXPECTASSUME = 0;
    public static final int RECTANGULARLINES = 0;
    public static final int BRESENHAMLINES = 0;
    public static final int SMOOTHLINES = 0;
    public static final int STIPPLEDRECTANGULARLINES = 0;
    public static final int STIPPLEDBRESENHAMLINES = 0;
    public static final int STIPPLEDSMOOTHLINES = 0;
    public static final int VERTEXATTRIBUTEINSTANCERATEDIVISOR = 0;
    public static final int VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = 0;
    public static final int INDEXTYPEUINT8 = 0;
    public static final int DYNAMICRENDERINGLOCALREAD = 0;
    public static final int MAINTENANCE5 = 0;
    public static final int MAINTENANCE6 = 0;
    public static final int PIPELINEPROTECTEDACCESS = 0;
    public static final int PIPELINEROBUSTNESS = 0;
    public static final int HOSTIMAGECOPY = 0;
    public static final int PUSHDESCRIPTOR = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Features$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean globalPriorityQuery() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSubgroupRotate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSubgroupRotateClustered() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderFloatControls2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderExpectAssume() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean rectangularLines() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nrectangularLines(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean bresenhamLines() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nbresenhamLines(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean smoothLines() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nsmoothLines(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean stippledRectangularLines() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean stippledBresenhamLines() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean stippledSmoothLines() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateDivisor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateZeroDivisor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean indexTypeUint8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nindexTypeUint8(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean dynamicRenderingLocalRead() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean maintenance5() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nmaintenance5(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean maintenance6() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nmaintenance6(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean pipelineProtectedAccess() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean pipelineRobustness() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npipelineRobustness(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean hostImageCopy() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nhostImageCopy(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean pushDescriptor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npushDescriptor(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 55
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer globalPriorityQuery(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer shaderSubgroupRotate(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer shaderSubgroupRotateClustered(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer shaderFloatControls2(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer shaderExpectAssume(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer rectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nrectangularLines(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer bresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nbresenhamLines(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer smoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nsmoothLines(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer stippledRectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer stippledBresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer stippledSmoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer vertexAttributeInstanceRateDivisor(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer vertexAttributeInstanceRateZeroDivisor(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer indexTypeUint8(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nindexTypeUint8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer dynamicRenderingLocalRead(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer maintenance5(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nmaintenance5(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer maintenance6(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nmaintenance6(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer pipelineProtectedAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer pipelineRobustness(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npipelineRobustness(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer hostImageCopy(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.nhostImageCopy(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer pushDescriptor(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.npushDescriptor(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m6210create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceVulkan14Features(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceVulkan14Features(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
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
    public boolean globalPriorityQuery() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nglobalPriorityQuery(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSubgroupRotate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSubgroupRotate(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSubgroupRotateClustered() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSubgroupRotateClustered(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderFloatControls2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderFloatControls2(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderExpectAssume() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderExpectAssume(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean rectangularLines() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrectangularLines(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean bresenhamLines() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbresenhamLines(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean smoothLines() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsmoothLines(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean stippledRectangularLines() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstippledRectangularLines(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean stippledBresenhamLines() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstippledBresenhamLines(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean stippledSmoothLines() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstippledSmoothLines(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateDivisor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexAttributeInstanceRateDivisor(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateZeroDivisor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexAttributeInstanceRateZeroDivisor(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean indexTypeUint8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexTypeUint8(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean dynamicRenderingLocalRead() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndynamicRenderingLocalRead(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean maintenance5() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaintenance5(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean maintenance6() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaintenance6(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean pipelineProtectedAccess() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npipelineProtectedAccess(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean pipelineRobustness() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npipelineRobustness(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean hostImageCopy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhostImageCopy(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean pushDescriptor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushDescriptor(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 55
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features globalPriorityQuery(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nglobalPriorityQuery(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSubgroupRotate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSubgroupRotateClustered(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features shaderFloatControls2(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderFloatControls2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features shaderExpectAssume(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderExpectAssume(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features rectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nrectangularLines(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features bresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbresenhamLines(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features smoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsmoothLines(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features stippledRectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledRectangularLines(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features stippledBresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledBresenhamLines(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features stippledSmoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledSmoothLines(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nvertexAttributeInstanceRateDivisor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nvertexAttributeInstanceRateZeroDivisor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features indexTypeUint8(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nindexTypeUint8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndynamicRenderingLocalRead(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features maintenance5(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nmaintenance5(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features maintenance6(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nmaintenance6(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            npipelineProtectedAccess(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features pipelineRobustness(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            npipelineRobustness(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features hostImageCopy(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nhostImageCopy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features pushDescriptor(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            npushDescriptor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.globalPriorityQuery(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.shaderSubgroupRotate(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.shaderSubgroupRotateClustered(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.shaderFloatControls2(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.shaderExpectAssume(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.rectangularLines(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.bresenhamLines(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.smoothLines(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.stippledRectangularLines(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.stippledBresenhamLines(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.stippledSmoothLines(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.vertexAttributeInstanceRateDivisor(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.vertexAttributeInstanceRateZeroDivisor(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.indexTypeUint8(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.dynamicRenderingLocalRead(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.maintenance5(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.maintenance6(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.pipelineProtectedAccess(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.pipelineRobustness(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.hostImageCopy(r1)
            r0 = r4
            r1 = r28
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.pushDescriptor(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features set(org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nglobalPriorityQuery(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nshaderSubgroupRotate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nshaderSubgroupRotateClustered(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nshaderFloatControls2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nshaderExpectAssume(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nrectangularLines(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.RECTANGULARLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbresenhamLines(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.BRESENHAMLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsmoothLines(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SMOOTHLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nstippledRectangularLines(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nstippledBresenhamLines(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nstippledSmoothLines(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nvertexAttributeInstanceRateDivisor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nvertexAttributeInstanceRateZeroDivisor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nindexTypeUint8(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndynamicRenderingLocalRead(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaintenance5(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE5
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaintenance6(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE6
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npipelineProtectedAccess(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npipelineRobustness(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nhostImageCopy(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npushDescriptor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nglobalPriorityQuery(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nshaderSubgroupRotate(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nshaderSubgroupRotateClustered(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nshaderFloatControls2(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nshaderExpectAssume(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nrectangularLines(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.RECTANGULARLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbresenhamLines(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.BRESENHAMLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsmoothLines(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SMOOTHLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nstippledRectangularLines(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nstippledBresenhamLines(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nstippledSmoothLines(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nvertexAttributeInstanceRateDivisor(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nvertexAttributeInstanceRateZeroDivisor(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nindexTypeUint8(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndynamicRenderingLocalRead(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaintenance5(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE5
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaintenance6(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE6
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npipelineProtectedAccess(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npipelineRobustness(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nhostImageCopy(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npushDescriptor(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 23
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2 = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.RECTANGULARLINES = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.BRESENHAMLINES = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.SMOOTHLINES = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8 = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE5 = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.MAINTENANCE6 = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR = r0
            return
    }
}
