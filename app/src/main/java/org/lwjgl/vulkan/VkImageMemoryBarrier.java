package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier.class */
public class VkImageMemoryBarrier extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkImageMemoryBarrier> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SRCACCESSMASK = 0;
    public static final int DSTACCESSMASK = 0;
    public static final int OLDLAYOUT = 0;
    public static final int NEWLAYOUT = 0;
    public static final int SRCQUEUEFAMILYINDEX = 0;
    public static final int DSTQUEUEFAMILYINDEX = 0;
    public static final int IMAGE = 0;
    public static final int SUBRESOURCERANGE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkImageMemoryBarrier, org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkImageMemoryBarrier ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
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
        protected org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageMemoryBarrier getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageMemoryBarrier r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccessFlags")
        public int srcAccessMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.nsrcAccessMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccessFlags")
        public int dstAccessMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.ndstAccessMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int oldLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.noldLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int newLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.nnewLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int srcQueueFamilyIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.nsrcQueueFamilyIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int dstQueueFamilyIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.ndstQueueFamilyIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImage")
        public long image() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.nimage(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange subresourceRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.nsubresourceRange(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 45
                org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer pNext(org.lwjgl.vulkan.VkExternalMemoryAcquireUnmodifiedEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalMemoryAcquireUnmodifiedEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer pNext(org.lwjgl.vulkan.VkSampleLocationsInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSampleLocationsInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.nsrcAccessMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.ndstAccessMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.noldLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.nnewLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer srcQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.nsrcQueueFamilyIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer dstQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.ndstQueueFamilyIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer image(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier.nimage(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier.nsubresourceRange(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageMemoryBarrier r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.create(r0)
                org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageMemoryBarrier(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageMemoryBarrier create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageMemoryBarrier(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
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

    @org.lwjgl.system.NativeType("VkAccessFlags")
    public int srcAccessMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcAccessMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAccessFlags")
    public int dstAccessMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstAccessMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int oldLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noldLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int newLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnewLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int srcQueueFamilyIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcQueueFamilyIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int dstQueueFamilyIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstQueueFamilyIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImage")
    public long image() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimage(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange subresourceRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = nsubresourceRange(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 45
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier pNext(org.lwjgl.vulkan.VkExternalMemoryAcquireUnmodifiedEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalMemoryAcquireUnmodifiedEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier pNext(org.lwjgl.vulkan.VkSampleLocationsInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSampleLocationsInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcAccessMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstAccessMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noldLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnewLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier srcQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcQueueFamilyIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier dstQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstQueueFamilyIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier image(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nimage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubresourceRange(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, int r13, long r14, org.lwjgl.vulkan.VkImageSubresourceRange r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.srcAccessMask(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.dstAccessMask(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.oldLayout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.newLayout(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.srcQueueFamilyIndex(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.dstQueueFamilyIndex(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.image(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.subresourceRange(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier set(org.lwjgl.vulkan.VkImageMemoryBarrier r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier malloc() {
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier calloc() {
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier create() {
            int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier create(long r6) {
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageMemoryBarrier createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer
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

    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageMemoryBarrier.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nsrcAccessMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SRCACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndstAccessMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.DSTACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int noldLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.OLDLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnewLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.NEWLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsrcQueueFamilyIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndstQueueFamilyIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nimage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.IMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange nsubresourceRange(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageMemoryBarrier.SUBRESOURCERANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkImageSubresourceRange.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageMemoryBarrier.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsrcAccessMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SRCACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstAccessMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.DSTACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noldLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.OLDLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nnewLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.NEWLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcQueueFamilyIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstQueueFamilyIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimage(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageMemoryBarrier.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.IMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsubresourceRange(long r7, org.lwjgl.vulkan.VkImageSubresourceRange r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageMemoryBarrier.SUBRESOURCERANGE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
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
            org.lwjgl.vulkan.VkImageMemoryBarrier r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkImageMemoryBarrier.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkImageMemoryBarrier.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.SRCACCESSMASK = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.DSTACCESSMASK = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.OLDLAYOUT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.NEWLAYOUT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.IMAGE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier.SUBRESOURCERANGE = r0
            return
    }
}
