package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDetailedStatistics.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDetailedStatistics.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDetailedStatistics.class */
public class VmaDetailedStatistics extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaDetailedStatistics> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STATISTICS = 0;
    public static final int UNUSEDRANGECOUNT = 0;
    public static final int ALLOCATIONSIZEMIN = 0;
    public static final int ALLOCATIONSIZEMAX = 0;
    public static final int UNUSEDRANGESIZEMIN = 0;
    public static final int UNUSEDRANGESIZEMAX = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDetailedStatistics$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDetailedStatistics$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDetailedStatistics$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.vma.VmaDetailedStatistics, org.lwjgl.util.vma.VmaDetailedStatistics.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.vma.VmaDetailedStatistics ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
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
        protected org.lwjgl.util.vma.VmaDetailedStatistics.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.vma.VmaDetailedStatistics getElementFactory() {
                r2 = this;
                org.lwjgl.util.vma.VmaDetailedStatistics r0 = org.lwjgl.util.vma.VmaDetailedStatistics.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.util.vma.VmaStatistics statistics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.vma.VmaStatistics r0 = org.lwjgl.util.vma.VmaDetailedStatistics.nstatistics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int unusedRangeCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaDetailedStatistics.nunusedRangeCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long allocationSizeMin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDetailedStatistics.nallocationSizeMin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long allocationSizeMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDetailedStatistics.nallocationSizeMax(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long unusedRangeSizeMin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDetailedStatistics.nunusedRangeSizeMin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long unusedRangeSizeMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDetailedStatistics.nunusedRangeSizeMax(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaDetailedStatistics r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.vma.VmaDetailedStatistics r0 = org.lwjgl.util.vma.VmaDetailedStatistics.create(r0)
                org.lwjgl.util.vma.VmaDetailedStatistics.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VmaDetailedStatistics(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaDetailedStatistics create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaDetailedStatistics(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            return r0
    }

    public org.lwjgl.util.vma.VmaStatistics statistics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.vma.VmaStatistics r0 = nstatistics(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int unusedRangeCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nunusedRangeCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long allocationSizeMin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nallocationSizeMin(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long allocationSizeMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nallocationSizeMax(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long unusedRangeSizeMin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nunusedRangeSizeMin(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long unusedRangeSizeMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nunusedRangeSizeMax(r0)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics malloc() {
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics calloc() {
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics create() {
            int r0 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics create(long r6) {
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaDetailedStatistics createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics.Buffer malloc(int r6) {
            org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = new org.lwjgl.util.vma.VmaDetailedStatistics$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics.Buffer calloc(int r7) {
            org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = new org.lwjgl.util.vma.VmaDetailedStatistics$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = new org.lwjgl.util.vma.VmaDetailedStatistics$Buffer
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

    public static org.lwjgl.util.vma.VmaDetailedStatistics.Buffer create(long r6, int r8) {
            org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = new org.lwjgl.util.vma.VmaDetailedStatistics$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaDetailedStatistics.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = new org.lwjgl.util.vma.VmaDetailedStatistics$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = new org.lwjgl.util.vma.VmaDetailedStatistics
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = new org.lwjgl.util.vma.VmaDetailedStatistics$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDetailedStatistics.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaDetailedStatistics$Buffer r0 = new org.lwjgl.util.vma.VmaDetailedStatistics$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaStatistics nstatistics(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDetailedStatistics.STATISTICS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.vma.VmaStatistics r0 = org.lwjgl.util.vma.VmaStatistics.create(r0)
            return r0
    }

    public static int nunusedRangeCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDetailedStatistics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.UNUSEDRANGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nallocationSizeMin(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDetailedStatistics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.ALLOCATIONSIZEMIN
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nallocationSizeMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDetailedStatistics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.ALLOCATIONSIZEMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nunusedRangeSizeMin(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDetailedStatistics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.UNUSEDRANGESIZEMIN
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nunusedRangeSizeMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaDetailedStatistics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDetailedStatistics.UNUSEDRANGESIZEMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.vma.VmaDetailedStatistics r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.vma.VmaStatistics.SIZEOF
            int r4 = org.lwjgl.util.vma.VmaStatistics.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaDetailedStatistics.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaDetailedStatistics.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDetailedStatistics.STATISTICS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDetailedStatistics.UNUSEDRANGECOUNT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDetailedStatistics.ALLOCATIONSIZEMIN = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDetailedStatistics.ALLOCATIONSIZEMAX = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDetailedStatistics.UNUSEDRANGESIZEMIN = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDetailedStatistics.UNUSEDRANGESIZEMAX = r0
            return
    }
}
