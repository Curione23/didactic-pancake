package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo.class */
public class VmaAllocationCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaAllocationCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int USAGE = 0;
    public static final int REQUIREDFLAGS = 0;
    public static final int PREFERREDFLAGS = 0;
    public static final int MEMORYTYPEBITS = 0;
    public static final int POOL = 0;
    public static final int PUSERDATA = 0;
    public static final int PRIORITY = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocationCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.vma.VmaAllocationCreateInfo, org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.vma.VmaAllocationCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
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
        protected org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.vma.VmaAllocationCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VmaAllocationCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VmaMemoryUsage")
        public int usage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.nusage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkMemoryPropertyFlags")
        public int requiredFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.nrequiredFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkMemoryPropertyFlags")
        public int preferredFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.npreferredFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int memoryTypeBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.nmemoryTypeBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VmaPool")
        public long pool() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.npool(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pUserData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.npUserData(r0)
                return r0
        }

        public float priority() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.npriority(r0)
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VmaAllocationCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaAllocationCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer usage(@org.lwjgl.system.NativeType("VmaMemoryUsage") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaAllocationCreateInfo.nusage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer requiredFlags(@org.lwjgl.system.NativeType("VkMemoryPropertyFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaAllocationCreateInfo.nrequiredFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer preferredFlags(@org.lwjgl.system.NativeType("VkMemoryPropertyFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaAllocationCreateInfo.npreferredFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer memoryTypeBits(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaAllocationCreateInfo.nmemoryTypeBits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer pool(@org.lwjgl.system.NativeType("VmaPool") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaAllocationCreateInfo.npool(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer pUserData(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaAllocationCreateInfo.npUserData(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer priority(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaAllocationCreateInfo.npriority(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.create(r0)
                org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VmaAllocationCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaAllocationCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaAllocationCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VmaAllocationCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VmaMemoryUsage")
    public int usage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nusage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkMemoryPropertyFlags")
    public int requiredFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrequiredFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkMemoryPropertyFlags")
    public int preferredFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreferredFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int memoryTypeBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmemoryTypeBits(r0)
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

    @org.lwjgl.system.NativeType("void *")
    public long pUserData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npUserData(r0)
            return r0
    }

    public float priority() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = npriority(r0)
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo flags(@org.lwjgl.system.NativeType("VmaAllocationCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo usage(@org.lwjgl.system.NativeType("VmaMemoryUsage") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nusage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo requiredFlags(@org.lwjgl.system.NativeType("VkMemoryPropertyFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrequiredFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo preferredFlags(@org.lwjgl.system.NativeType("VkMemoryPropertyFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npreferredFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo memoryTypeBits(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmemoryTypeBits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo pool(@org.lwjgl.system.NativeType("VmaPool") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npool(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo pUserData(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npUserData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo priority(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npriority(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo set(int r5, int r6, int r7, int r8, int r9, long r10, long r12, float r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.usage(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.requiredFlags(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.preferredFlags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.memoryTypeBits(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.pool(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.pUserData(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.priority(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocationCreateInfo set(org.lwjgl.util.vma.VmaAllocationCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo malloc() {
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo calloc() {
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo create() {
            int r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo create(long r6) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer
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

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocationCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaAllocationCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nusage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrequiredFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.REQUIREDFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npreferredFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.PREFERREDFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmemoryTypeBits(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.MEMORYTYPEBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npool(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationCreateInfo.POOL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long npUserData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationCreateInfo.PUSERDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static float npriority(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.PRIORITY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nusage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nrequiredFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.REQUIREDFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npreferredFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.PREFERREDFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmemoryTypeBits(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.MEMORYTYPEBITS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npool(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationCreateInfo.POOL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npUserData(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocationCreateInfo.PUSERDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npriority(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocationCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.PRIORITY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.vma.VmaAllocationCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
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
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.vma.VmaAllocationCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaAllocationCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaAllocationCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.USAGE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.REQUIREDFLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.PREFERREDFLAGS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.MEMORYTYPEBITS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.POOL = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.PUSERDATA = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocationCreateInfo.PRIORITY = r0
            return
    }
}
