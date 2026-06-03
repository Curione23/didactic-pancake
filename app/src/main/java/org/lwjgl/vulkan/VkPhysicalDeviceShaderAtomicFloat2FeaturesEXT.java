package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class */
public class VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SHADERBUFFERFLOAT16ATOMICS = 0;
    public static final int SHADERBUFFERFLOAT16ATOMICADD = 0;
    public static final int SHADERBUFFERFLOAT16ATOMICMINMAX = 0;
    public static final int SHADERBUFFERFLOAT32ATOMICMINMAX = 0;
    public static final int SHADERBUFFERFLOAT64ATOMICMINMAX = 0;
    public static final int SHADERSHAREDFLOAT16ATOMICS = 0;
    public static final int SHADERSHAREDFLOAT16ATOMICADD = 0;
    public static final int SHADERSHAREDFLOAT16ATOMICMINMAX = 0;
    public static final int SHADERSHAREDFLOAT32ATOMICMINMAX = 0;
    public static final int SHADERSHAREDFLOAT64ATOMICMINMAX = 0;
    public static final int SHADERIMAGEFLOAT32ATOMICMINMAX = 0;
    public static final int SPARSEIMAGEFLOAT32ATOMICMINMAX = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT, org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderBufferFloat16Atomics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16Atomics(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderBufferFloat16AtomicAdd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicAdd(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderBufferFloat16AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderBufferFloat32AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat32AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderBufferFloat64AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat64AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSharedFloat16Atomics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16Atomics(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSharedFloat16AtomicAdd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicAdd(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSharedFloat16AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSharedFloat32AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat32AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSharedFloat64AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat64AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderImageFloat32AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderImageFloat32AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean sparseImageFloat32AtomicMinMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsparseImageFloat32AtomicMinMax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000273000(0x3b9ef468, float:0.004850913)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat16Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16Atomics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat16AtomicAdd(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicAdd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat16AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat32AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderBufferFloat64AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat64AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat16Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16Atomics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat16AtomicAdd(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicAdd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat16AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat32AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderSharedFloat64AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat64AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer shaderImageFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderImageFloat32AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer sparseImageFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsparseImageFloat32AtomicMinMax(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
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
    public boolean shaderBufferFloat16Atomics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderBufferFloat16Atomics(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderBufferFloat16AtomicAdd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderBufferFloat16AtomicAdd(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderBufferFloat16AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderBufferFloat16AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderBufferFloat32AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderBufferFloat32AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderBufferFloat64AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderBufferFloat64AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSharedFloat16Atomics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSharedFloat16Atomics(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSharedFloat16AtomicAdd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSharedFloat16AtomicAdd(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSharedFloat16AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSharedFloat16AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSharedFloat32AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSharedFloat32AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSharedFloat64AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSharedFloat64AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderImageFloat32AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderImageFloat32AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean sparseImageFloat32AtomicMinMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsparseImageFloat32AtomicMinMax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000273000(0x3b9ef468, float:0.004850913)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderBufferFloat16Atomics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAdd(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderBufferFloat16AtomicAdd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderBufferFloat16AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderBufferFloat32AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderBufferFloat64AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSharedFloat16Atomics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAdd(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSharedFloat16AtomicAdd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSharedFloat16AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSharedFloat32AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSharedFloat64AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderImageFloat32AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsparseImageFloat32AtomicMinMax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderBufferFloat16Atomics(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderBufferFloat16AtomicAdd(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderBufferFloat16AtomicMinMax(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderBufferFloat32AtomicMinMax(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderBufferFloat64AtomicMinMax(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderSharedFloat16Atomics(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderSharedFloat16AtomicAdd(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderSharedFloat16AtomicMinMax(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderSharedFloat32AtomicMinMax(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderSharedFloat64AtomicMinMax(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.shaderImageFloat32AtomicMinMax(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.sparseImageFloat32AtomicMinMax(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nshaderBufferFloat16Atomics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderBufferFloat16AtomicAdd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICADD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderBufferFloat16AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderBufferFloat32AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT32ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderBufferFloat64AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT64ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSharedFloat16Atomics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSharedFloat16AtomicAdd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICADD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSharedFloat16AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSharedFloat32AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT32ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSharedFloat64AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT64ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderImageFloat32AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERIMAGEFLOAT32ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsparseImageFloat32AtomicMinMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SPARSEIMAGEFLOAT32ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nshaderBufferFloat16Atomics(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderBufferFloat16AtomicAdd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICADD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderBufferFloat16AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderBufferFloat32AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT32ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderBufferFloat64AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT64ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSharedFloat16Atomics(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSharedFloat16AtomicAdd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICADD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSharedFloat16AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSharedFloat32AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT32ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSharedFloat64AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT64ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderImageFloat32AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERIMAGEFLOAT32ATOMICMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsparseImageFloat32AtomicMinMax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SPARSEIMAGEFLOAT32ATOMICMINMAX
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
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICADD = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT16ATOMICMINMAX = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT32ATOMICMINMAX = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERBUFFERFLOAT64ATOMICMINMAX = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICADD = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT16ATOMICMINMAX = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT32ATOMICMINMAX = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERSHAREDFLOAT64ATOMICMINMAX = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SHADERIMAGEFLOAT32ATOMICMINMAX = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SPARSEIMAGEFLOAT32ATOMICMINMAX = r0
            return
    }
}
