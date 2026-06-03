package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryBarrierAccessFlags3KHR.class */
public class VkMemoryBarrierAccessFlags3KHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SRCACCESSMASK3 = 0;
    public static final int DSTACCESSMASK3 = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryBarrierAccessFlags3KHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR, org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccessFlags3KHR")
        public long srcAccessMask3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.nsrcAccessMask3(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccessFlags3KHR")
        public long dstAccessMask3() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.ndstAccessMask3(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000574002(0x3ba38c32, float:0.004991078)
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer srcAccessMask3(@org.lwjgl.system.NativeType("VkAccessFlags3KHR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.nsrcAccessMask3(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer dstAccessMask3(@org.lwjgl.system.NativeType("VkAccessFlags3KHR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.ndstAccessMask3(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4998create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.create(r0)
                org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkMemoryBarrierAccessFlags3KHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkMemoryBarrierAccessFlags3KHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkAccessFlags3KHR")
    public long srcAccessMask3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcAccessMask3(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAccessFlags3KHR")
    public long dstAccessMask3() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstAccessMask3(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000574002(0x3ba38c32, float:0.004991078)
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR srcAccessMask3(@org.lwjgl.system.NativeType("VkAccessFlags3KHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcAccessMask3(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR dstAccessMask3(@org.lwjgl.system.NativeType("VkAccessFlags3KHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstAccessMask3(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR set(int r5, long r6, long r8, long r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = r0.srcAccessMask3(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = r0.dstAccessMask3(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR set(org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR malloc() {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR calloc() {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR create() {
            int r0 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR create(long r6) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
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

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer r0 = new org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nsrcAccessMask3(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SRCACCESSMASK3
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ndstAccessMask3(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.DSTACCESSMASK3
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsrcAccessMask3(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SRCACCESSMASK3
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void ndstAccessMask3(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.DSTACCESSMASK3
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.SRCACCESSMASK3 = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryBarrierAccessFlags3KHR.DSTACCESSMASK3 = r0
            return
    }
}
