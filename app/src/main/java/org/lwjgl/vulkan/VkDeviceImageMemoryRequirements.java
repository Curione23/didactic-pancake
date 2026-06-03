package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements.class */
public class VkDeviceImageMemoryRequirements extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDeviceImageMemoryRequirements> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PCREATEINFO = 0;
    public static final int PLANEASPECT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDeviceImageMemoryRequirements, org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDeviceImageMemoryRequirements ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
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
        protected org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDeviceImageMemoryRequirements getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageCreateInfo const *")
        public org.lwjgl.vulkan.VkImageCreateInfo pCreateInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageCreateInfo r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.npCreateInfo(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageAspectFlagBits")
        public int planeAspect() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.nplaneAspect(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000413003(0x3ba1174b, float:0.004916107)
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer pCreateInfo(@org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.npCreateInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer planeAspect(@org.lwjgl.system.NativeType("VkImageAspectFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.nplaneAspect(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.create(r0)
                org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDeviceImageMemoryRequirements(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDeviceImageMemoryRequirements create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDeviceImageMemoryRequirements(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
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

    @org.lwjgl.system.NativeType("VkImageCreateInfo const *")
    public org.lwjgl.vulkan.VkImageCreateInfo pCreateInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = npCreateInfo(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageAspectFlagBits")
    public int planeAspect() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nplaneAspect(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000413003(0x3ba1174b, float:0.004916107)
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements pCreateInfo(@org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npCreateInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements planeAspect(@org.lwjgl.system.NativeType("VkImageAspectFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nplaneAspect(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements set(int r5, long r6, org.lwjgl.vulkan.VkImageCreateInfo r8, int r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = r0.pCreateInfo(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = r0.planeAspect(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceImageMemoryRequirements set(org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements malloc() {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements calloc() {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements create() {
            int r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements create(long r6) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer
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

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer r0 = new org.lwjgl.vulkan.VkDeviceImageMemoryRequirements$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo npCreateInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PCREATEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkImageCreateInfo r0 = org.lwjgl.vulkan.VkImageCreateInfo.create(r0)
            return r0
    }

    public static int nplaneAspect(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PLANEASPECT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npCreateInfo(long r5, org.lwjgl.vulkan.VkImageCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PCREATEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nplaneAspect(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PLANEASPECT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PCREATEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PCREATEINFO = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.PLANEASPECT = r0
            return
    }
}
