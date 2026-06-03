package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportWScalingNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportWScalingNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportWScalingNV.class */
public class VkViewportWScalingNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkViewportWScalingNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int XCOEFF = 0;
    public static final int YCOEFF = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportWScalingNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportWScalingNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportWScalingNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkViewportWScalingNV, org.lwjgl.vulkan.VkViewportWScalingNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkViewportWScalingNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkViewportWScalingNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkViewportWScalingNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkViewportWScalingNV r0 = org.lwjgl.vulkan.VkViewportWScalingNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        public float xcoeff() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkViewportWScalingNV.nxcoeff(r0)
                return r0
        }

        public float ycoeff() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkViewportWScalingNV.nycoeff(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkViewportWScalingNV.Buffer xcoeff(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkViewportWScalingNV.nxcoeff(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkViewportWScalingNV.Buffer ycoeff(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkViewportWScalingNV.nycoeff(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkViewportWScalingNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkViewportWScalingNV r0 = org.lwjgl.vulkan.VkViewportWScalingNV.create(r0)
                org.lwjgl.vulkan.VkViewportWScalingNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkViewportWScalingNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkViewportWScalingNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkViewportWScalingNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            return r0
    }

    public float xcoeff() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nxcoeff(r0)
            return r0
    }

    public float ycoeff() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nycoeff(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkViewportWScalingNV xcoeff(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nxcoeff(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkViewportWScalingNV ycoeff(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nycoeff(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkViewportWScalingNV set(float r4, float r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = r0.xcoeff(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = r0.ycoeff(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkViewportWScalingNV set(org.lwjgl.vulkan.VkViewportWScalingNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV malloc() {
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV calloc() {
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV create() {
            int r0 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV create(long r6) {
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkViewportWScalingNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportWScalingNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportWScalingNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportWScalingNV$Buffer
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

    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportWScalingNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportWScalingNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = new org.lwjgl.vulkan.VkViewportWScalingNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportWScalingNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportWScalingNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkViewportWScalingNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportWScalingNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static float nxcoeff(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportWScalingNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.XCOEFF
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nycoeff(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportWScalingNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.YCOEFF
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nxcoeff(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportWScalingNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.XCOEFF
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nycoeff(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportWScalingNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportWScalingNV.YCOEFF
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
            org.lwjgl.vulkan.VkViewportWScalingNV r0 = r0.create(r1, r2)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkViewportWScalingNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkViewportWScalingNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkViewportWScalingNV.XCOEFF = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkViewportWScalingNV.YCOEFF = r0
            return
    }
}
