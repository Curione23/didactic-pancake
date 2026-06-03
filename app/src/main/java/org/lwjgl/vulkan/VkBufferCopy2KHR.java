package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCopy2KHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCopy2KHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCopy2KHR.class */
public class VkBufferCopy2KHR extends org.lwjgl.vulkan.VkBufferCopy2 {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCopy2KHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCopy2KHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCopy2KHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkBufferCopy2.Buffer {
        private static final org.lwjgl.vulkan.VkBufferCopy2KHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkBufferCopy2KHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkBufferCopy2KHR r0 = org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferCopy2KHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000337006(0x3b9fee6e, float:0.004880718)
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferCopy2KHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer srcOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferCopy2KHR.nsrcOffset(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer dstOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferCopy2KHR.ndstOffset(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer size(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferCopy2KHR.nsize(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2.Buffer size(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.size(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2.Buffer dstOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.dstOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2.Buffer srcOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.srcOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferCopy2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkBufferCopy2KHR r0 = org.lwjgl.vulkan.VkBufferCopy2KHR.create(r0)
                org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkBufferCopy2KHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkBufferCopy2KHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkBufferCopy2KHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public org.lwjgl.vulkan.VkBufferCopy2KHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public org.lwjgl.vulkan.VkBufferCopy2KHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000337006(0x3b9fee6e, float:0.004880718)
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public org.lwjgl.vulkan.VkBufferCopy2KHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public org.lwjgl.vulkan.VkBufferCopy2KHR srcOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcOffset(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public org.lwjgl.vulkan.VkBufferCopy2KHR dstOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstOffset(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public org.lwjgl.vulkan.VkBufferCopy2KHR size(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsize(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public org.lwjgl.vulkan.VkBufferCopy2KHR set(int r5, long r6, long r8, long r10, long r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.srcOffset(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.dstOffset(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.size(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCopy2KHR set(org.lwjgl.vulkan.VkBufferCopy2KHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR malloc() {
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR calloc() {
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR create() {
            int r0 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR create(long r6) {
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferCopy2KHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer
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

    public static org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferCopy2KHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCopy2KHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferCopy2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCopy2KHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferCopy2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferCopy2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferCopy2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 set(int r12, long r13, long r15, long r17, long r19) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.set(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 size(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.size(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 dstOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.dstOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 srcOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.srcOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferCopy2 create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferCopy2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBufferCopy2KHR r0 = r0.create(r1, r2)
            return r0
    }
}
