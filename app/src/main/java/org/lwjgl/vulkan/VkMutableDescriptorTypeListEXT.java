package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT.class */
public class VkMutableDescriptorTypeListEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int DESCRIPTORTYPECOUNT = 0;
    public static final int PDESCRIPTORTYPES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT, org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int descriptorTypeCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.ndescriptorTypeCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorType const *")
        public java.nio.IntBuffer pDescriptorTypes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.npDescriptorTypes(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer pDescriptorTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorType const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.npDescriptorTypes(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.create(r0)
                org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkMutableDescriptorTypeListEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkMutableDescriptorTypeListEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int descriptorTypeCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorTypeCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorType const *")
    public java.nio.IntBuffer pDescriptorTypes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npDescriptorTypes(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT pDescriptorTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorType const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescriptorTypes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT set(org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT malloc() {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT calloc() {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT create() {
            int r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT create(long r6) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer
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

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ndescriptorTypeCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.DESCRIPTORTYPECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npDescriptorTypes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.PDESCRIPTORTYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndescriptorTypeCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void ndescriptorTypeCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.DESCRIPTORTYPECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npDescriptorTypes(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.PDESCRIPTORTYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            ndescriptorTypeCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = ndescriptorTypeCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.PDESCRIPTORTYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.DESCRIPTORTYPECOUNT = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.PDESCRIPTORTYPES = r0
            return
    }
}
