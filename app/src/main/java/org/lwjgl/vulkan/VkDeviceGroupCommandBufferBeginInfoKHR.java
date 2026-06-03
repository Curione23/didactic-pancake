package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR.class */
public class VkDeviceGroupCommandBufferBeginInfoKHR extends org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer {
        private static final org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000060004(0x3b9bb464, float:0.004751729)
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer deviceMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.ndeviceMask(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer deviceMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = r0.deviceMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.create(r0)
                org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDeviceGroupCommandBufferBeginInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDeviceGroupCommandBufferBeginInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000060004(0x3b9bb464, float:0.004751729)
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR deviceMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndeviceMask(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR set(int r5, long r6, int r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.deviceMask(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR set(org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR malloc() {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR calloc() {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo set(int r7, long r8, int r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.set(r1, r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo deviceMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.deviceMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDeviceGroupCommandBufferBeginInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
