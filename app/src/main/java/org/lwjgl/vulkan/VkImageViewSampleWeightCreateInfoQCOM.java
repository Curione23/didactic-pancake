package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM.class */
public class VkImageViewSampleWeightCreateInfoQCOM extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FILTERCENTER = 0;
    public static final int FILTERSIZE = 0;
    public static final int NUMPHASES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageViewSampleWeightCreateInfoQCOM$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM, org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
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
        protected org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.npNext(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset2D filterCenter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nfilterCenter(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D filterSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nfilterSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numPhases() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nnumPhases(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000440002(0x3ba180c2, float:0.004928679)
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer filterCenter(org.lwjgl.vulkan.VkOffset2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nfilterCenter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer filterCenter(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset2D r1 = r1.filterCenter()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer filterSize(org.lwjgl.vulkan.VkExtent2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nfilterSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer filterSize(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent2D r1 = r1.filterSize()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer numPhases(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.nnumPhases(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.create(r0)
                org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageViewSampleWeightCreateInfoQCOM(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageViewSampleWeightCreateInfoQCOM(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
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

    public org.lwjgl.vulkan.VkOffset2D filterCenter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset2D r0 = nfilterCenter(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D filterSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nfilterSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numPhases() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumPhases(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000440002(0x3ba180c2, float:0.004928679)
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM filterCenter(org.lwjgl.vulkan.VkOffset2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfilterCenter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM filterCenter(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset2D r1 = r1.filterCenter()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM filterSize(org.lwjgl.vulkan.VkExtent2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfilterSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM filterSize(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent2D r1 = r1.filterSize()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM numPhases(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumPhases(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM set(int r5, long r6, org.lwjgl.vulkan.VkOffset2D r8, org.lwjgl.vulkan.VkExtent2D r9, int r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.filterCenter(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.filterSize(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.numPhases(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM set(org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM malloc() {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM calloc() {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM create() {
            int r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM create(long r6) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer
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

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer r0 = new org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset2D nfilterCenter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.FILTERCENTER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkOffset2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nfilterSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.FILTERSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static int nnumPhases(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.NUMPHASES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nfilterCenter(long r7, org.lwjgl.vulkan.VkOffset2D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.FILTERCENTER
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkOffset2D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nfilterSize(long r7, org.lwjgl.vulkan.VkExtent2D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.FILTERSIZE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nnumPhases(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.NUMPHASES
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
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkOffset2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.FILTERCENTER = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.FILTERSIZE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageViewSampleWeightCreateInfoQCOM.NUMPHASES = r0
            return
    }
}
