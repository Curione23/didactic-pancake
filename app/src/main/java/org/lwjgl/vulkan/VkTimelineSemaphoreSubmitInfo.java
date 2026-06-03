package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo.class */
public class VkTimelineSemaphoreSubmitInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int WAITSEMAPHOREVALUECOUNT = 0;
    public static final int PWAITSEMAPHOREVALUES = 0;
    public static final int SIGNALSEMAPHOREVALUECOUNT = 0;
    public static final int PSIGNALSEMAPHOREVALUES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTimelineSemaphoreSubmitInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo, org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int waitSemaphoreValueCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint64_t const *")
        public java.nio.LongBuffer pWaitSemaphoreValues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int signalSemaphoreValueCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint64_t const *")
        public java.nio.LongBuffer pSignalSemaphoreValues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000207003(0x3b9df29b, float:0.0048201806)
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer waitSemaphoreValueCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.nwaitSemaphoreValueCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer pWaitSemaphoreValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.npWaitSemaphoreValues(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer signalSemaphoreValueCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.nsignalSemaphoreValueCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer pSignalSemaphoreValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.npSignalSemaphoreValues(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.create(r0)
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkTimelineSemaphoreSubmitInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkTimelineSemaphoreSubmitInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int waitSemaphoreValueCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwaitSemaphoreValueCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint64_t const *")
    public java.nio.LongBuffer pWaitSemaphoreValues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npWaitSemaphoreValues(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int signalSemaphoreValueCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsignalSemaphoreValueCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint64_t const *")
    public java.nio.LongBuffer pSignalSemaphoreValues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npSignalSemaphoreValues(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000207003(0x3b9df29b, float:0.0048201806)
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwaitSemaphoreValueCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWaitSemaphoreValues(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsignalSemaphoreValueCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSignalSemaphoreValues(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo set(int r5, long r6, int r8, @javax.annotation.Nullable java.nio.LongBuffer r9, int r10, @javax.annotation.Nullable java.nio.LongBuffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.waitSemaphoreValueCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.pWaitSemaphoreValues(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.signalSemaphoreValueCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.pSignalSemaphoreValues(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo set(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo malloc() {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo calloc() {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo create() {
            int r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo create(long r6) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer
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

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nwaitSemaphoreValueCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npWaitSemaphoreValues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nwaitSemaphoreValueCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static int nsignalSemaphoreValueCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npSignalSemaphoreValues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsignalSemaphoreValueCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwaitSemaphoreValueCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npWaitSemaphoreValues(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nwaitSemaphoreValueCount(r0, r1)
        L19:
            return
    }

    public static void nsignalSemaphoreValueCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npSignalSemaphoreValues(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nsignalSemaphoreValueCount(r0, r1)
        L19:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.WAITSEMAPHOREVALUECOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PWAITSEMAPHOREVALUES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.SIGNALSEMAPHOREVALUECOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo.PSIGNALSEMAPHOREVALUES = r0
            return
    }
}
