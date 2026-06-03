package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT.class */
public class VkMultiDrawIndexedInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FIRSTINDEX = 0;
    public static final int INDEXCOUNT = 0;
    public static final int VERTEXOFFSET = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT, org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int firstIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.nfirstIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int indexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.nindexCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int vertexOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.nvertexOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer firstIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.nfirstIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer indexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.nindexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer vertexOffset(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.nvertexOffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.create(r0)
                org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkMultiDrawIndexedInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkMultiDrawIndexedInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int firstIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfirstIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int indexCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int vertexOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT firstIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfirstIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT indexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT vertexOffset(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT set(int r4, int r5, int r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = r0.firstIndex(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = r0.indexCount(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = r0.vertexOffset(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT set(org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT malloc() {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT calloc() {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nfirstIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.FIRSTINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nindexCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.INDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvertexOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.VERTEXOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nfirstIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.FIRSTINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.INDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvertexOffset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.VERTEXOFFSET
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
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.FIRSTINDEX = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.INDEXCOUNT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMultiDrawIndexedInfoEXT.VERTEXOFFSET = r0
            return
    }
}
