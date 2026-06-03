package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV.class */
public class VkAccelerationStructureMotionInstanceDataNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STATICINSTANCE = 0;
    public static final int MATRIXMOTIONINSTANCE = 0;
    public static final int SRTMOTIONINSTANCE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV, org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR staticInstance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.nstaticInstance(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.nmatrixMotionInstance(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.nsrtMotionInstance(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer staticInstance(org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.nstaticInstance(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer staticInstance(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r1 = r1.staticInstance()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer matrixMotionInstance(org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.nmatrixMotionInstance(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer matrixMotionInstance(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r1 = r1.matrixMotionInstance()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer srtMotionInstance(org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.nsrtMotionInstance(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer srtMotionInstance(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r1 = r1.srtMotionInstance()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureMotionInstanceDataNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureMotionInstanceDataNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR staticInstance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r0 = nstaticInstance(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r0 = nmatrixMotionInstance(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = nsrtMotionInstance(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV staticInstance(org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstaticInstance(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV staticInstance(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r1 = r1.staticInstance()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmatrixMotionInstance(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r1 = r1.matrixMotionInstance()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrtMotionInstance(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r1 = r1.srtMotionInstance()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV set(org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR nstaticInstance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.STATICINSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV nmatrixMotionInstance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.MATRIXMOTIONINSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV nsrtMotionInstance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SRTMOTIONINSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r0 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.create(r0)
            return r0
    }

    public static void nstaticInstance(long r7, org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.STATICINSTANCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nmatrixMotionInstance(long r7, org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.MATRIXMOTIONINSTANCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrtMotionInstance(long r7, org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SRTMOTIONINSTANCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
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
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureMatrixMotionInstanceNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.STATICINSTANCE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.MATRIXMOTIONINSTANCE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureMotionInstanceDataNV.SRTMOTIONINSTANCE = r0
            return
    }
}
