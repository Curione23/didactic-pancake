package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT.class */
public class VkFrameBoundaryEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkFrameBoundaryEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int FRAMEID = 0;
    public static final int IMAGECOUNT = 0;
    public static final int PIMAGES = 0;
    public static final int BUFFERCOUNT = 0;
    public static final int PBUFFERS = 0;
    public static final int TAGNAME = 0;
    public static final int TAGSIZE = 0;
    public static final int PTAG = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkFrameBoundaryEXT, org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkFrameBoundaryEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkFrameBoundaryEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFrameBoundaryFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long frameID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.nframeID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int imageCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.nimageCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkImage const *")
        public java.nio.LongBuffer pImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.npImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bufferCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.nbufferCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkBuffer const *")
        public java.nio.LongBuffer pBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.npBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long tagName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.ntagName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long tagSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.ntagSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pTag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.npTag(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFrameBoundaryEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000375001(0x3ba082d9, float:0.0048984108)
                org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkFrameBoundaryEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer flags(@org.lwjgl.system.NativeType("VkFrameBoundaryFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFrameBoundaryEXT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer frameID(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkFrameBoundaryEXT.nframeID(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer imageCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFrameBoundaryEXT.nimageCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer pImages(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImage const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFrameBoundaryEXT.npImages(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer bufferCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFrameBoundaryEXT.nbufferCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer pBuffers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFrameBoundaryEXT.npBuffers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer tagName(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkFrameBoundaryEXT.ntagName(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer tagSize(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkFrameBoundaryEXT.ntagSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer pTag(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkFrameBoundaryEXT.npTag(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.create(r0)
                org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkFrameBoundaryEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkFrameBoundaryEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkFrameBoundaryEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkFrameBoundaryFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long frameID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nframeID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int imageCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkImage const *")
    public java.nio.LongBuffer pImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bufferCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkBuffer const *")
    public java.nio.LongBuffer pBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long tagName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntagName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long tagSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntagSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public long pTag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npTag(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000375001(0x3ba082d9, float:0.0048984108)
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT flags(@org.lwjgl.system.NativeType("VkFrameBoundaryFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT frameID(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nframeID(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT imageCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT pImages(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImage const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npImages(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT bufferCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufferCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT pBuffers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBuffer const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npBuffers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT tagName(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntagName(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT tagSize(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntagSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT pTag(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npTag(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT set(int r5, long r6, int r8, long r9, int r11, @javax.annotation.Nullable java.nio.LongBuffer r12, int r13, @javax.annotation.Nullable java.nio.LongBuffer r14, long r15, long r17, long r19) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.frameID(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.imageCount(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.pImages(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.bufferCount(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.pBuffers(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.tagName(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.tagSize(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.pTag(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFrameBoundaryEXT set(org.lwjgl.vulkan.VkFrameBoundaryEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT malloc() {
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT calloc() {
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT create() {
            int r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT create(long r6) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkFrameBoundaryEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer
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

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFrameBoundaryEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer r0 = new org.lwjgl.vulkan.VkFrameBoundaryEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nframeID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.FRAMEID
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nimageCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.IMAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npImages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PIMAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nimageCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static int nbufferCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.BUFFERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npBuffers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PBUFFERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nbufferCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static long ntagName(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.TAGNAME
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ntagSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.TAGSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long npTag(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PTAG
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nframeID(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.FRAMEID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nimageCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.IMAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npImages(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PIMAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nimageCount(r0, r1)
        L19:
            return
    }

    public static void nbufferCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.BUFFERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npBuffers(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PBUFFERS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nbufferCount(r0, r1)
        L19:
            return
    }

    public static void ntagName(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFrameBoundaryEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.TAGNAME
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ntagSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.TAGSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npTag(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFrameBoundaryEXT.PTAG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkFrameBoundaryEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.VkFrameBoundaryEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkFrameBoundaryEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkFrameBoundaryEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.FRAMEID = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.IMAGECOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.PIMAGES = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.BUFFERCOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.PBUFFERS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.TAGNAME = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.TAGSIZE = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFrameBoundaryEXT.PTAG = r0
            return
    }
}
