package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE.class */
public class VkPresentTimeGOOGLE extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPresentTimeGOOGLE> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PRESENTID = 0;
    public static final int DESIREDPRESENTTIME = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPresentTimeGOOGLE, org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPresentTimeGOOGLE ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
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
        protected org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPresentTimeGOOGLE getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int presentID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.npresentID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long desiredPresentTime() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.ndesiredPresentTime(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer presentID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPresentTimeGOOGLE.npresentID(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer desiredPresentTime(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPresentTimeGOOGLE.ndesiredPresentTime(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.create(r0)
                org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPresentTimeGOOGLE(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPresentTimeGOOGLE create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPresentTimeGOOGLE(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int presentID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npresentID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long desiredPresentTime() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndesiredPresentTime(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentTimeGOOGLE presentID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npresentID(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentTimeGOOGLE desiredPresentTime(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndesiredPresentTime(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPresentTimeGOOGLE set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = r0.presentID(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = r0.desiredPresentTime(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentTimeGOOGLE set(org.lwjgl.vulkan.VkPresentTimeGOOGLE r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE malloc() {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE calloc() {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE create() {
            int r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE create(long r6) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer
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

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentTimeGOOGLE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer r0 = new org.lwjgl.vulkan.VkPresentTimeGOOGLE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int npresentID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.PRESENTID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndesiredPresentTime(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.DESIREDPRESENTTIME
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void npresentID(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.PRESENTID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndesiredPresentTime(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentTimeGOOGLE.DESIREDPRESENTTIME
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPresentTimeGOOGLE r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPresentTimeGOOGLE.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPresentTimeGOOGLE.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentTimeGOOGLE.PRESENTID = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentTimeGOOGLE.DESIREDPRESENTTIME = r0
            return
    }
}
