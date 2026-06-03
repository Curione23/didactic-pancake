package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR.class */
public class VkSemaphoreSubmitInfoKHR extends org.lwjgl.vulkan.VkSemaphoreSubmitInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreSubmitInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer {
        private static final org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000314005(0x3b9f9495, float:0.0048700073)
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer semaphore(@org.lwjgl.system.NativeType("VkSemaphore") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.nsemaphore(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer value(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.nvalue(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer stageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.nstageMask(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer deviceIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.ndeviceIndex(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer deviceIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.deviceIndex(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer stageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.stageMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer value(@org.lwjgl.system.NativeType("uint64_t") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.value(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer semaphore(@org.lwjgl.system.NativeType("VkSemaphore") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.semaphore(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.create(r0)
                org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSemaphoreSubmitInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSemaphoreSubmitInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000314005(0x3b9f9495, float:0.0048700073)
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR semaphore(@org.lwjgl.system.NativeType("VkSemaphore") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsemaphore(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR value(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvalue(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR stageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstageMask(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR deviceIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndeviceIndex(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR set(int r5, long r6, long r8, long r10, long r12, int r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.semaphore(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.value(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.stageMask(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.deviceIndex(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR set(org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR malloc() {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR calloc() {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo set(int r13, long r14, long r16, long r18, long r20, int r22) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r20
            r6 = r22
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo deviceIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.deviceIndex(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo stageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.stageMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo value(@org.lwjgl.system.NativeType("uint64_t") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.value(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo semaphore(@org.lwjgl.system.NativeType("VkSemaphore") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.semaphore(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreSubmitInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreSubmitInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSemaphoreSubmitInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
