package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.class */
public class VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR extends org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
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

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000416000(0x3ba12300, float:0.0049175024)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer shaderSubgroupRotate(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotate(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer shaderSubgroupRotateClustered(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotateClustered(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer shaderSubgroupRotateClustered(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.shaderSubgroupRotateClustered(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer shaderSubgroupRotate(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.shaderSubgroupRotate(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer
        /* JADX INFO: renamed from: create */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6049create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000416000(0x3ba12300, float:0.0049175024)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotate(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotateClustered(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(int r5, long r6, boolean r8, boolean r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.shaderSubgroupRotate(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.shaderSubgroupRotateClustered(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures set(int r8, long r9, boolean r11, boolean r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.set(r1, r2, r3, r4)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateClustered(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.shaderSubgroupRotateClustered(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotate(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.shaderSubgroupRotate(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR r0 = r0.create(r1, r2)
            return r0
    }
}
