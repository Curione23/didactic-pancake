package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class */
public class VkPipelineFragmentShadingRateEnumStateCreateInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SHADINGRATETYPE = 0;
    public static final int SHADINGRATE = 0;
    public static final int COMBINEROPS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV, org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFragmentShadingRateTypeNV")
        public int shadingRateType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRateType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFragmentShadingRateNV")
        public int shadingRate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRate(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
        public java.nio.IntBuffer combinerOps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR")
        public int combinerOps(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000326002(0x3b9fc372, float:0.004875594)
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer shadingRateType(@org.lwjgl.system.NativeType("VkFragmentShadingRateTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRateType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer shadingRate(@org.lwjgl.system.NativeType("VkFragmentShadingRateNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRate(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer combinerOps(@org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR[2]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer combinerOps(int r6, @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.create(r0)
                org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineFragmentShadingRateEnumStateCreateInfoNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
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

    @org.lwjgl.system.NativeType("VkFragmentShadingRateTypeNV")
    public int shadingRateType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshadingRateType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFragmentShadingRateNV")
    public int shadingRate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshadingRate(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
    public java.nio.IntBuffer combinerOps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = ncombinerOps(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR")
    public int combinerOps(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = ncombinerOps(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000326002(0x3b9fc372, float:0.004875594)
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateType(@org.lwjgl.system.NativeType("VkFragmentShadingRateTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshadingRateType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRate(@org.lwjgl.system.NativeType("VkFragmentShadingRateNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshadingRate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(@org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR[2]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncombinerOps(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(int r6, @org.lwjgl.system.NativeType("VkFragmentShadingRateCombinerOpKHR") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncombinerOps(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(int r5, long r6, int r8, int r9, java.nio.IntBuffer r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.shadingRateType(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.shadingRate(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.combinerOps(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV malloc() {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV calloc() {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV create(long r6) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nshadingRateType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshadingRate(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer ncombinerOps(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int ncombinerOps(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nshadingRateType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshadingRate(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncombinerOps(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncombinerOps(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.POINTER_SIZE
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
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATETYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SHADINGRATE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineFragmentShadingRateEnumStateCreateInfoNV.COMBINEROPS = r0
            return
    }
}
