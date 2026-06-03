package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearColorValue.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearColorValue.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearColorValue.class */
public class VkClearColorValue extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClearColorValue> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLOAT32 = 0;
    public static final int INT32 = 0;
    public static final int UINT32 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearColorValue$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearColorValue$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClearColorValue$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClearColorValue, org.lwjgl.vulkan.VkClearColorValue.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClearColorValue ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
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
        protected org.lwjgl.vulkan.VkClearColorValue.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkClearColorValue getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClearColorValue r0 = org.lwjgl.vulkan.VkClearColorValue.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("float[4]")
        public java.nio.FloatBuffer float32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.vulkan.VkClearColorValue.nfloat32(r0)
                return r0
        }

        public float float32(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.vulkan.VkClearColorValue.nfloat32(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t[4]")
        public java.nio.IntBuffer int32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkClearColorValue.nint32(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int int32(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkClearColorValue.nint32(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[4]")
        public java.nio.IntBuffer uint32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkClearColorValue.nuint32(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int uint32(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkClearColorValue.nuint32(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkClearColorValue.Buffer float32(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClearColorValue.nfloat32(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClearColorValue.Buffer float32(int r6, float r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkClearColorValue.nfloat32(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClearColorValue.Buffer int32(@org.lwjgl.system.NativeType("int32_t[4]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClearColorValue.nint32(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClearColorValue.Buffer int32(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkClearColorValue.nint32(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClearColorValue.Buffer uint32(@org.lwjgl.system.NativeType("uint32_t[4]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClearColorValue.nuint32(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClearColorValue.Buffer uint32(int r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkClearColorValue.nuint32(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClearColorValue r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClearColorValue r0 = org.lwjgl.vulkan.VkClearColorValue.create(r0)
                org.lwjgl.vulkan.VkClearColorValue.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClearColorValue(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClearColorValue create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClearColorValue(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("float[4]")
    public java.nio.FloatBuffer float32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nfloat32(r0)
            return r0
    }

    public float float32(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nfloat32(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t[4]")
    public java.nio.IntBuffer int32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nint32(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int int32(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nint32(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[4]")
    public java.nio.IntBuffer uint32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nuint32(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int uint32(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nuint32(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue float32(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfloat32(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue float32(int r6, float r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nfloat32(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue int32(@org.lwjgl.system.NativeType("int32_t[4]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nint32(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue int32(int r6, @org.lwjgl.system.NativeType("int32_t") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nint32(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue uint32(@org.lwjgl.system.NativeType("uint32_t[4]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nuint32(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue uint32(int r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nuint32(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClearColorValue set(org.lwjgl.vulkan.VkClearColorValue r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue malloc() {
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue calloc() {
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue create() {
            int r0 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue create(long r6) {
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkClearColorValue createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = new org.lwjgl.vulkan.VkClearColorValue$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = new org.lwjgl.vulkan.VkClearColorValue$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = new org.lwjgl.vulkan.VkClearColorValue$Buffer
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

    public static org.lwjgl.vulkan.VkClearColorValue.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = new org.lwjgl.vulkan.VkClearColorValue$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkClearColorValue.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = new org.lwjgl.vulkan.VkClearColorValue$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearColorValue r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearColorValue r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkClearColorValue r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkClearColorValue r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkClearColorValue.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClearColorValue.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClearColorValue r0 = new org.lwjgl.vulkan.VkClearColorValue
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClearColorValue.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = new org.lwjgl.vulkan.VkClearColorValue$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClearColorValue.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearColorValue.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClearColorValue$Buffer r0 = new org.lwjgl.vulkan.VkClearColorValue$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClearColorValue.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClearColorValue.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.FloatBuffer nfloat32(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClearColorValue.FLOAT32
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nfloat32(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkClearColorValue.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkClearColorValue.FLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nint32(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClearColorValue.INT32
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nint32(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkClearColorValue.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkClearColorValue.INT32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nuint32(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClearColorValue.UINT32
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nuint32(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkClearColorValue.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkClearColorValue.UINT32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nfloat32(long r7, java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClearColorValue.FLOAT32
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nfloat32(long r9, int r11, float r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkClearColorValue.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkClearColorValue.FLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nint32(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClearColorValue.INT32
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nint32(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkClearColorValue.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkClearColorValue.INT32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nuint32(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClearColorValue.UINT32
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nuint32(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkClearColorValue.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkClearColorValue.UINT32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkClearColorValue r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClearColorValue.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClearColorValue.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClearColorValue.FLOAT32 = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClearColorValue.INT32 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClearColorValue.UINT32 = r0
            return
    }
}
