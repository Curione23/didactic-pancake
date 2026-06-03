package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearValue.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearValue.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearValue.class */
public class VkClearValue extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClearValue> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int COLOR = 0;
    public static final int DEPTHSTENCIL = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearValue$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearValue$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearValue$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClearValue, org.lwjgl.vulkan.VkClearValue.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClearValue ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClearValue.SIZEOF
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
        protected org.lwjgl.vulkan.VkClearValue.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkClearValue getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClearValue r0 = org.lwjgl.vulkan.VkClearValue.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkClearColorValue color() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClearColorValue r0 = org.lwjgl.vulkan.VkClearValue.ncolor(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClearDepthStencilValue depthStencil() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClearDepthStencilValue r0 = org.lwjgl.vulkan.VkClearValue.ndepthStencil(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClearValue.Buffer color(org.lwjgl.vulkan.VkClearColorValue r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClearValue.ncolor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClearValue.Buffer color(java.util.function.Consumer<org.lwjgl.vulkan.VkClearColorValue> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkClearColorValue r1 = r1.color()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkClearValue.Buffer depthStencil(org.lwjgl.vulkan.VkClearDepthStencilValue r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClearValue.ndepthStencil(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClearValue.Buffer depthStencil(java.util.function.Consumer<org.lwjgl.vulkan.VkClearDepthStencilValue> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkClearDepthStencilValue r1 = r1.depthStencil()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClearValue r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClearValue$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClearValue r0 = org.lwjgl.vulkan.VkClearValue.create(r0)
                org.lwjgl.vulkan.VkClearValue.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClearValue(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClearValue create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClearValue(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue color() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClearColorValue r0 = ncolor(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClearDepthStencilValue depthStencil() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClearDepthStencilValue r0 = ndepthStencil(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClearValue color(org.lwjgl.vulkan.VkClearColorValue r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClearValue color(java.util.function.Consumer<org.lwjgl.vulkan.VkClearColorValue> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkClearColorValue r1 = r1.color()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClearValue depthStencil(org.lwjgl.vulkan.VkClearDepthStencilValue r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthStencil(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClearValue depthStencil(java.util.function.Consumer<org.lwjgl.vulkan.VkClearDepthStencilValue> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkClearDepthStencilValue r1 = r1.depthStencil()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClearValue set(org.lwjgl.vulkan.VkClearValue r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue malloc() {
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue calloc() {
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue create() {
            int r0 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue create(long r6) {
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkClearValue createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = new org.lwjgl.vulkan.VkClearValue$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = new org.lwjgl.vulkan.VkClearValue$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = new org.lwjgl.vulkan.VkClearValue$Buffer
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

    public static org.lwjgl.vulkan.VkClearValue.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = new org.lwjgl.vulkan.VkClearValue$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkClearValue.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = new org.lwjgl.vulkan.VkClearValue$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearValue r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearValue r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkClearValue r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkClearValue r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearValue.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClearValue.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClearValue r0 = new org.lwjgl.vulkan.VkClearValue
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClearValue.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = new org.lwjgl.vulkan.VkClearValue$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClearValue.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = new org.lwjgl.vulkan.VkClearValue$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClearValue.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue ncolor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClearValue.COLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkClearColorValue r0 = org.lwjgl.vulkan.VkClearColorValue.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearDepthStencilValue ndepthStencil(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClearValue.DEPTHSTENCIL
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkClearDepthStencilValue r0 = org.lwjgl.vulkan.VkClearDepthStencilValue.create(r0)
            return r0
    }

    public static void ncolor(long r7, org.lwjgl.vulkan.VkClearColorValue r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClearValue.COLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndepthStencil(long r7, org.lwjgl.vulkan.VkClearDepthStencilValue r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClearValue.DEPTHSTENCIL
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkClearDepthStencilValue.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkClearValue r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            int r4 = org.lwjgl.vulkan.VkClearColorValue.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClearDepthStencilValue.SIZEOF
            int r4 = org.lwjgl.vulkan.VkClearDepthStencilValue.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClearValue.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClearValue.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClearValue.COLOR = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClearValue.DEPTHSTENCIL = r0
            return
    }
}
