package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV.class */
public class VkAccelerationStructureTrianglesDisplacementMicromapNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DISPLACEMENTBIASANDSCALEFORMAT = 0;
    public static final int DISPLACEMENTVECTORFORMAT = 0;
    public static final int DISPLACEMENTBIASANDSCALEBUFFER = 0;
    public static final int DISPLACEMENTBIASANDSCALESTRIDE = 0;
    public static final int DISPLACEMENTVECTORBUFFER = 0;
    public static final int DISPLACEMENTVECTORSTRIDE = 0;
    public static final int DISPLACEDMICROMAPPRIMITIVEFLAGS = 0;
    public static final int DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE = 0;
    public static final int INDEXTYPE = 0;
    public static final int INDEXBUFFER = 0;
    public static final int INDEXSTRIDE = 0;
    public static final int BASETRIANGLE = 0;
    public static final int USAGECOUNTSCOUNT = 0;
    public static final int PUSAGECOUNTS = 0;
    public static final int PPUSAGECOUNTS = 0;
    public static final int MICROMAP = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV, org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int displacementBiasAndScaleFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int displacementVectorFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long displacementBiasAndScaleStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleStride(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR displacementVectorBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long displacementVectorStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorStride(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long displacedMicromapPrimitiveFlagsStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlagsStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndexType")
        public int indexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexType(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long indexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int baseTriangle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nbaseTriangle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int usageCountsCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nusageCountsCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *")
        public org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer pUsageCounts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.npUsageCounts(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *")
        public org.lwjgl.PointerBuffer ppUsageCounts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nppUsageCounts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkMicromapEXT")
        public long micromap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nmicromap(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000397002(0x3ba0d8ca, float:0.004908656)
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.displacementBiasAndScaleBuffer()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementBiasAndScaleStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.displacementVectorBuffer()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacementVectorStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacedMicromapPrimitiveFlags(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacedMicromapPrimitiveFlags(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.displacedMicromapPrimitiveFlags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer displacedMicromapPrimitiveFlagsStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlagsStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexBuffer()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer baseTriangle(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nbaseTriangle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer usageCountsCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nusageCountsCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer pUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *") org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.npUsageCounts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer ppUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nppUsageCounts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer micromap(@org.lwjgl.system.NativeType("VkMicromapEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.nmicromap(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureTrianglesDisplacementMicromapNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
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

    @org.lwjgl.system.NativeType("VkFormat")
    public int displacementBiasAndScaleFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndisplacementBiasAndScaleFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int displacementVectorFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndisplacementVectorFormat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = ndisplacementBiasAndScaleBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long displacementBiasAndScaleStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndisplacementBiasAndScaleStride(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR displacementVectorBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = ndisplacementVectorBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long displacementVectorStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndisplacementVectorStride(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = ndisplacedMicromapPrimitiveFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long displacedMicromapPrimitiveFlagsStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndisplacedMicromapPrimitiveFlagsStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndexType")
    public int indexType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexType(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = nindexBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long indexStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindexStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int baseTriangle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbaseTriangle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int usageCountsCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nusageCountsCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *")
    public org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer pUsageCounts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = npUsageCounts(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *")
    public org.lwjgl.PointerBuffer ppUsageCounts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppUsageCounts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkMicromapEXT")
    public long micromap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmicromap(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000397002(0x3ba0d8ca, float:0.004908656)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisplacementBiasAndScaleFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisplacementVectorFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisplacementBiasAndScaleBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.displacementBiasAndScaleBuffer()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplacementBiasAndScaleStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisplacementVectorBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.displacementVectorBuffer()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplacementVectorStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndisplacedMicromapPrimitiveFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.displacedMicromapPrimitiveFlags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlagsStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplacedMicromapPrimitiveFlagsStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexBuffer()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV baseTriangle(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbaseTriangle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV usageCountsCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nusageCountsCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV pUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *") org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npUsageCounts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV ppUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppUsageCounts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV micromap(@org.lwjgl.system.NativeType("VkMicromapEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmicromap(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV set(int r5, long r6, int r8, int r9, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r10, long r11, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r13, long r14, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r16, long r17, int r19, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r20, long r21, int r23, int r24, @javax.annotation.Nullable org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r25, @javax.annotation.Nullable org.lwjgl.PointerBuffer r26, long r27) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacementBiasAndScaleFormat(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacementVectorFormat(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacementBiasAndScaleBuffer(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacementBiasAndScaleStride(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacementVectorBuffer(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacementVectorStride(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacedMicromapPrimitiveFlags(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.displacedMicromapPrimitiveFlagsStride(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.indexType(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.indexBuffer(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.indexStride(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.baseTriangle(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.usageCountsCount(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.pUsageCounts(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.ppUsageCounts(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.micromap(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV set(org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndisplacementBiasAndScaleFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndisplacementVectorFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR ndisplacementBiasAndScaleBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long ndisplacementBiasAndScaleStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR ndisplacementVectorBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long ndisplacementVectorStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR ndisplacedMicromapPrimitiveFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long ndisplacedMicromapPrimitiveFlagsStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nindexType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nindexBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nindexStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nbaseTriangle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.BASETRIANGLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nusageCountsCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.USAGECOUNTSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer npUsageCounts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nusageCountsCount(r1)
            org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = org.lwjgl.vulkan.VkMicromapUsageEXT.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppUsageCounts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PPUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nusageCountsCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static long nmicromap(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.MICROMAP
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndisplacementBiasAndScaleFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisplacementVectorFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisplacementBiasAndScaleBuffer(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEBUFFER
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndisplacementBiasAndScaleStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ndisplacementVectorBuffer(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORBUFFER
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndisplacementVectorStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ndisplacedMicromapPrimitiveFlags(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndisplacedMicromapPrimitiveFlagsStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nindexType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexBuffer(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXBUFFER
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nindexStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbaseTriangle(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.BASETRIANGLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nusageCountsCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.USAGECOUNTSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npUsageCounts(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nppUsageCounts(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PPUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmicromap(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.MICROMAP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEFORMAT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORFORMAT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALEBUFFER = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTBIASANDSCALESTRIDE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORBUFFER = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEMENTVECTORSTRIDE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGS = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXTYPE = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXBUFFER = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.INDEXSTRIDE = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.BASETRIANGLE = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.USAGECOUNTSCOUNT = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PUSAGECOUNTS = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.PPUSAGECOUNTS = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV.MICROMAP = r0
            return
    }
}
