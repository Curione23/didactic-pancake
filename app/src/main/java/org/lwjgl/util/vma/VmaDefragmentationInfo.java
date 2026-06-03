package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDefragmentationInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDefragmentationInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDefragmentationInfo.class */
public class VmaDefragmentationInfo extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaDefragmentationInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int POOL = 0;
    public static final int MAXBYTESPERPASS = 0;
    public static final int MAXALLOCATIONSPERPASS = 0;
    public static final int PFNBREAKCALLBACK = 0;
    public static final int PBREAKCALLBACKUSERDATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDefragmentationInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDefragmentationInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDefragmentationInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.vma.VmaDefragmentationInfo, org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.vma.VmaDefragmentationInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
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
        protected org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.vma.VmaDefragmentationInfo getElementFactory() {
                r2 = this;
                org.lwjgl.util.vma.VmaDefragmentationInfo r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VmaDefragmentationFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VmaPool")
        public long pool() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.npool(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long maxBytesPerPass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.nmaxBytesPerPass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxAllocationsPerPass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.nmaxAllocationsPerPass(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("PFN_vmaCheckDefragmentationBreakFunction")
        public org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunction pfnBreakCallback() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunction r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.npfnBreakCallback(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pBreakCallbackUserData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.npBreakCallbackUserData(r0)
                return r0
        }

        public org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer flags(@org.lwjgl.system.NativeType("VmaDefragmentationFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaDefragmentationInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer pool(@org.lwjgl.system.NativeType("VmaPool") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaDefragmentationInfo.npool(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer maxBytesPerPass(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaDefragmentationInfo.nmaxBytesPerPass(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer maxAllocationsPerPass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaDefragmentationInfo.nmaxAllocationsPerPass(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer pfnBreakCallback(@javax.annotation.Nullable @org.lwjgl.system.NativeType("PFN_vmaCheckDefragmentationBreakFunction") org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunctionI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaDefragmentationInfo.npfnBreakCallback(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer pBreakCallbackUserData(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaDefragmentationInfo.npBreakCallbackUserData(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.vma.VmaDefragmentationInfo r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.create(r0)
                org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VmaDefragmentationInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaDefragmentationInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaDefragmentationInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VmaDefragmentationFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VmaPool")
    public long pool() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npool(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long maxBytesPerPass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxBytesPerPass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxAllocationsPerPass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxAllocationsPerPass(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("PFN_vmaCheckDefragmentationBreakFunction")
    public org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunction pfnBreakCallback() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunction r0 = npfnBreakCallback(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pBreakCallbackUserData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npBreakCallbackUserData(r0)
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo flags(@org.lwjgl.system.NativeType("VmaDefragmentationFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo pool(@org.lwjgl.system.NativeType("VmaPool") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npool(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo maxBytesPerPass(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmaxBytesPerPass(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo maxAllocationsPerPass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxAllocationsPerPass(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo pfnBreakCallback(@javax.annotation.Nullable @org.lwjgl.system.NativeType("PFN_vmaCheckDefragmentationBreakFunction") org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunctionI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npfnBreakCallback(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo pBreakCallbackUserData(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npBreakCallbackUserData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo set(int r5, long r6, long r8, int r10, org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunctionI r11, long r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.pool(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.maxBytesPerPass(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.maxAllocationsPerPass(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.pfnBreakCallback(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.pBreakCallbackUserData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaDefragmentationInfo set(org.lwjgl.util.vma.VmaDefragmentationInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo malloc() {
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo calloc() {
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo create() {
            int r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo create(long r6) {
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaDefragmentationInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer malloc(int r6) {
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer calloc(int r7) {
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer
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

    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer create(long r6, int r8) {
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDefragmentationInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer r0 = new org.lwjgl.util.vma.VmaDefragmentationInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npool(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDefragmentationInfo.POOL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nmaxBytesPerPass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.MAXBYTESPERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nmaxAllocationsPerPass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.MAXALLOCATIONSPERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunction npfnBreakCallback(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDefragmentationInfo.PFNBREAKCALLBACK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunction r0 = org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunction.createSafe(r0)
            return r0
    }

    public static long npBreakCallbackUserData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDefragmentationInfo.PBREAKCALLBACKUSERDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npool(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDefragmentationInfo.POOL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmaxBytesPerPass(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.MAXBYTESPERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nmaxAllocationsPerPass(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDefragmentationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.MAXALLOCATIONSPERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npfnBreakCallback(long r5, @javax.annotation.Nullable org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunctionI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDefragmentationInfo.PFNBREAKCALLBACK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npBreakCallbackUserData(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDefragmentationInfo.PBREAKCALLBACKUSERDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.vma.VmaDefragmentationInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.vma.VmaDefragmentationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaDefragmentationInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaDefragmentationInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDefragmentationInfo.FLAGS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDefragmentationInfo.POOL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDefragmentationInfo.MAXBYTESPERPASS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDefragmentationInfo.MAXALLOCATIONSPERPASS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDefragmentationInfo.PFNBREAKCALLBACK = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDefragmentationInfo.PBREAKCALLBACKUSERDATA = r0
            return
    }
}
