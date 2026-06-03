package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToBufferInfo2KHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToBufferInfo2KHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToBufferInfo2KHR.class */
public class VkCopyImageToBufferInfo2KHR extends org.lwjgl.vulkan.VkCopyImageToBufferInfo2 {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToBufferInfo2KHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToBufferInfo2KHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToBufferInfo2KHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer {
        private static final org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000337003(0x3b9fee6b, float:0.0048807166)
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer srcImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.nsrcImage(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.nsrcImageLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer dstBuffer(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.ndstBuffer(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer pRegions(@org.lwjgl.system.NativeType("VkBufferImageCopy2 const *") org.lwjgl.vulkan.VkBufferImageCopy2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.npRegions(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer pRegions(@org.lwjgl.system.NativeType("VkBufferImageCopy2 const *") org.lwjgl.vulkan.VkBufferImageCopy2.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.pRegions(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer dstBuffer(@org.lwjgl.system.NativeType("VkBuffer") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.dstBuffer(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.srcImageLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer srcImage(@org.lwjgl.system.NativeType("VkImage") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.srcImage(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.create(r0)
                org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCopyImageToBufferInfo2KHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCopyImageToBufferInfo2KHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000337003(0x3b9fee6b, float:0.0048807166)
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR srcImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcImage(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcImageLayout(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR dstBuffer(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstBuffer(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR pRegions(@org.lwjgl.system.NativeType("VkBufferImageCopy2 const *") org.lwjgl.vulkan.VkBufferImageCopy2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npRegions(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR set(int r5, long r6, long r8, int r10, long r11, org.lwjgl.vulkan.VkBufferImageCopy2.Buffer r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.srcImage(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.srcImageLayout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.dstBuffer(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.pRegions(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR set(org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR malloc() {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR calloc() {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR create() {
            int r0 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR create(long r6) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer
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

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 set(int r12, long r13, long r15, int r17, long r18, org.lwjgl.vulkan.VkBufferImageCopy2.Buffer r20) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r20
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 pRegions(@org.lwjgl.system.NativeType("VkBufferImageCopy2 const *") org.lwjgl.vulkan.VkBufferImageCopy2.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.pRegions(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 dstBuffer(@org.lwjgl.system.NativeType("VkBuffer") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.dstBuffer(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.srcImageLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 srcImage(@org.lwjgl.system.NativeType("VkImage") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.srcImage(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCopyImageToBufferInfo2 create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCopyImageToBufferInfo2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCopyImageToBufferInfo2KHR r0 = r0.create(r1, r2)
            return r0
    }
}
