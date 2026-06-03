package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV.class */
public class VkAccelerationStructureInstanceNV extends org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer {
        private static final org.lwjgl.vulkan.VkAccelerationStructureInstanceNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureInstanceNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer transform(org.lwjgl.vulkan.VkTransformMatrixKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.ntransform(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer transform(java.util.function.Consumer<org.lwjgl.vulkan.VkTransformMatrixKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkTransformMatrixKHR r1 = r1.transform()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer instanceCustomIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.ninstanceCustomIndex(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer mask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.nmask(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer instanceShaderBindingTableRecordOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.ninstanceShaderBindingTableRecordOffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer flags(@org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer accelerationStructureReference(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.naccelerationStructureReference(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer accelerationStructureReference(@org.lwjgl.system.NativeType("uint64_t") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.accelerationStructureReference(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer flags(@org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.flags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer instanceShaderBindingTableRecordOffset(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.instanceShaderBindingTableRecordOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer mask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.mask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer instanceCustomIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.instanceCustomIndex(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer transform(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.transform(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer transform(org.lwjgl.vulkan.VkTransformMatrixKHR r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.transform(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureInstanceNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureInstanceNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureInstanceNV(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV transform(org.lwjgl.vulkan.VkTransformMatrixKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransform(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV transform(java.util.function.Consumer<org.lwjgl.vulkan.VkTransformMatrixKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkTransformMatrixKHR r1 = r1.transform()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV instanceCustomIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninstanceCustomIndex(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV mask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmask(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV instanceShaderBindingTableRecordOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninstanceShaderBindingTableRecordOffset(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV flags(@org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV accelerationStructureReference(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naccelerationStructureReference(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV set(org.lwjgl.vulkan.VkTransformMatrixKHR r5, int r6, int r7, int r8, int r9, long r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.transform(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.instanceCustomIndex(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.mask(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.instanceShaderBindingTableRecordOffset(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.flags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.accelerationStructureReference(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureInstanceNV set(org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureInstanceNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureInstanceNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR set(org.lwjgl.vulkan.VkTransformMatrixKHR r10, int r11, int r12, int r13, int r14, long r15) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR accelerationStructureReference(@org.lwjgl.system.NativeType("uint64_t") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.accelerationStructureReference(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR flags(@org.lwjgl.system.NativeType("VkGeometryInstanceFlagsKHR") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.flags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR instanceShaderBindingTableRecordOffset(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.instanceShaderBindingTableRecordOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR mask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.mask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR instanceCustomIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.instanceCustomIndex(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR transform(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.transform(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR transform(org.lwjgl.vulkan.VkTransformMatrixKHR r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.transform(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAccelerationStructureInstanceNV r0 = r0.create(r1, r2)
            return r0
    }
}
