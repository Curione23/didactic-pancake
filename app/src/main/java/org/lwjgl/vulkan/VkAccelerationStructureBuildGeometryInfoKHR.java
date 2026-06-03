package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR.class */
public class VkAccelerationStructureBuildGeometryInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int TYPE = 0;
    public static final int FLAGS = 0;
    public static final int MODE = 0;
    public static final int SRCACCELERATIONSTRUCTURE = 0;
    public static final int DSTACCELERATIONSTRUCTURE = 0;
    public static final int GEOMETRYCOUNT = 0;
    public static final int PGEOMETRIES = 0;
    public static final int PPGEOMETRIES = 0;
    public static final int SCRATCHDATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR, org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccelerationStructureTypeKHR")
        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuildAccelerationStructureModeKHR")
        public int mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nmode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccelerationStructureKHR")
        public long srcAccelerationStructure() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccelerationStructureKHR")
        public long dstAccelerationStructure() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int geometryCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const *")
        public org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.Buffer pGeometries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR$Buffer r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const * const *")
        public org.lwjgl.PointerBuffer ppGeometries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressKHR scratchData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000150000(0x3b9d13f0, float:0.0047936365)
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer type(@org.lwjgl.system.NativeType("VkAccelerationStructureTypeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer mode(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureModeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nmode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer srcAccelerationStructure(@org.lwjgl.system.NativeType("VkAccelerationStructureKHR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer dstAccelerationStructure(@org.lwjgl.system.NativeType("VkAccelerationStructureKHR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer geometryCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer pGeometries(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const *") org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer ppGeometries(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer scratchData(org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer scratchData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r1 = r1.scratchData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureBuildGeometryInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureBuildGeometryInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkAccelerationStructureTypeKHR")
    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuildAccelerationStructureModeKHR")
    public int mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAccelerationStructureKHR")
    public long srcAccelerationStructure() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcAccelerationStructure(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAccelerationStructureKHR")
    public long dstAccelerationStructure() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstAccelerationStructure(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int geometryCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngeometryCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const *")
    public org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.Buffer pGeometries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR$Buffer r0 = npGeometries(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const * const *")
    public org.lwjgl.PointerBuffer ppGeometries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppGeometries(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressKHR scratchData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = nscratchData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000150000(0x3b9d13f0, float:0.0047936365)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR type(@org.lwjgl.system.NativeType("VkAccelerationStructureTypeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR flags(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR mode(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureModeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(@org.lwjgl.system.NativeType("VkAccelerationStructureKHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcAccelerationStructure(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(@org.lwjgl.system.NativeType("VkAccelerationStructureKHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstAccelerationStructure(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR geometryCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeometryCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR pGeometries(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const *") org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npGeometries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAccelerationStructureGeometryKHR const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppGeometries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR scratchData(org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nscratchData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR scratchData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r1 = r1.scratchData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR set(int r5, long r6, int r8, int r9, int r10, long r11, long r13, int r15, @javax.annotation.Nullable org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.Buffer r16, @javax.annotation.Nullable org.lwjgl.PointerBuffer r17, org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r18) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.type(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.mode(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.srcAccelerationStructure(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.dstAccelerationStructure(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.geometryCount(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.pGeometries(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.ppGeometries(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.scratchData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR set(org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsrcAccelerationStructure(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SRCACCELERATIONSTRUCTURE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ndstAccelerationStructure(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.DSTACCELERATIONSTRUCTURE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int ngeometryCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.GEOMETRYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.Buffer npGeometries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PGEOMETRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ngeometryCount(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR$Buffer r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppGeometries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PPGEOMETRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ngeometryCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressKHR nscratchData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SCRATCHDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcAccelerationStructure(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SRCACCELERATIONSTRUCTURE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ndstAccelerationStructure(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.DSTACCELERATIONSTRUCTURE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ngeometryCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.GEOMETRYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npGeometries(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PGEOMETRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nppGeometries(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PPGEOMETRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nscratchData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SCRATCHDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.SIZEOF
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
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.POINTER_SIZE
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.TYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.MODE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SRCACCELERATIONSTRUCTURE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.DSTACCELERATIONSTRUCTURE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.GEOMETRYCOUNT = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PGEOMETRIES = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.PPGEOMETRIES = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureBuildGeometryInfoKHR.SCRATCHDATA = r0
            return
    }
}
