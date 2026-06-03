package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV.class */
public class VkAccelerationStructureSRTMotionInstanceNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TRANSFORMT0 = 0;
    public static final int TRANSFORMT1 = 0;
    public static final int BITFIELD0 = 0;
    public static final int BITFIELD1 = 0;
    public static final int ACCELERATIONSTRUCTUREREFERENCE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV, org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV transformT0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSRTDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ntransformT0(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV transformT1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSRTDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ntransformT1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int instanceCustomIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ninstanceCustomIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.nmask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int instanceShaderBindingTableRecordOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long accelerationStructureReference() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.naccelerationStructureReference(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT0(org.lwjgl.vulkan.VkSRTDataNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ntransformT0(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT0(java.util.function.Consumer<org.lwjgl.vulkan.VkSRTDataNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkSRTDataNV r1 = r1.transformT0()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT1(org.lwjgl.vulkan.VkSRTDataNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ntransformT1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT1(java.util.function.Consumer<org.lwjgl.vulkan.VkSRTDataNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkSRTDataNV r1 = r1.transformT1()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer instanceCustomIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ninstanceCustomIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer mask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.nmask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer instanceShaderBindingTableRecordOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer flags(@org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer accelerationStructureReference(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.naccelerationStructureReference(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureSRTMotionInstanceNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureSRTMotionInstanceNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV transformT0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSRTDataNV r0 = ntransformT0(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV transformT1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSRTDataNV r0 = ntransformT1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int instanceCustomIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninstanceCustomIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int instanceShaderBindingTableRecordOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninstanceShaderBindingTableRecordOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long accelerationStructureReference() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naccelerationStructureReference(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV transformT0(org.lwjgl.vulkan.VkSRTDataNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransformT0(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV transformT0(java.util.function.Consumer<org.lwjgl.vulkan.VkSRTDataNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkSRTDataNV r1 = r1.transformT0()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV transformT1(org.lwjgl.vulkan.VkSRTDataNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransformT1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV transformT1(java.util.function.Consumer<org.lwjgl.vulkan.VkSRTDataNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkSRTDataNV r1 = r1.transformT1()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV instanceCustomIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninstanceCustomIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV mask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV instanceShaderBindingTableRecordOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninstanceShaderBindingTableRecordOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV flags(@org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV accelerationStructureReference(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naccelerationStructureReference(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV set(org.lwjgl.vulkan.VkSRTDataNV r5, org.lwjgl.vulkan.VkSRTDataNV r6, int r7, int r8, int r9, int r10, long r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.transformT0(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.transformT1(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.instanceCustomIndex(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.mask(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.instanceShaderBindingTableRecordOffset(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.flags(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.accelerationStructureReference(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV set(org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV ntransformT0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT0
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkSRTDataNV r0 = org.lwjgl.vulkan.VkSRTDataNV.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV ntransformT1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT1
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkSRTDataNV r0 = org.lwjgl.vulkan.VkSRTDataNV.create(r0)
            return r0
    }

    public static int nbitfield0(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ninstanceCustomIndex(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    public static int nmask(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static int nbitfield1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.BITFIELD1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ninstanceShaderBindingTableRecordOffset(long r3) {
            r0 = r3
            int r0 = nbitfield1(r0)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    public static int nflags(long r3) {
            r0 = r3
            int r0 = nbitfield1(r0)
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static long naccelerationStructureReference(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ACCELERATIONSTRUCTUREREFERENCE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void ntransformT0(long r7, org.lwjgl.vulkan.VkSRTDataNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT0
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntransformT1(long r7, org.lwjgl.vulkan.VkSRTDataNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT1
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nbitfield0(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ninstanceCustomIndex(long r6, int r8) {
            r0 = r6
            r1 = r6
            int r1 = nbitfield0(r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r2
            r2 = r8
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nmask(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 24
            int r1 = r1 << r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nbitfield1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.BITFIELD1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ninstanceShaderBindingTableRecordOffset(long r6, int r8) {
            r0 = r6
            r1 = r6
            int r1 = nbitfield1(r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r2
            r2 = r8
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield1(r0, r1)
            return
    }

    public static void nflags(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 24
            int r1 = r1 << r2
            r2 = r6
            int r2 = nbitfield1(r2)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield1(r0, r1)
            return
    }

    public static void naccelerationStructureReference(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ACCELERATIONSTRUCTUREREFERENCE
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
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkSRTDataNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkSRTDataNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT0 = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT1 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.BITFIELD0 = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.BITFIELD1 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ACCELERATIONSTRUCTUREREFERENCE = r0
            return
    }
}
