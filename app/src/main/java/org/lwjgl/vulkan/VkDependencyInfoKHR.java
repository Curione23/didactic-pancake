package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfoKHR.class */
public class VkDependencyInfoKHR extends org.lwjgl.vulkan.VkDependencyInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkDependencyInfo.Buffer {
        private static final org.lwjgl.vulkan.VkDependencyInfoKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDependencyInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDependencyInfoKHR r0 = org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000314003(0x3b9f9493, float:0.0048700063)
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDependencyInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfoKHR.ndependencyFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer pMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *") org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfoKHR.npMemoryBarriers(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer pBufferMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *") org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfoKHR.npBufferMemoryBarriers(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer pImageMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *") org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfoKHR.npImageMemoryBarriers(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer pImageMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *") org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.pImageMemoryBarriers(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer pBufferMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *") org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.pBufferMemoryBarriers(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer pMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *") org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.pMemoryBarriers(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.dependencyFlags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDependencyInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDependencyInfoKHR r0 = org.lwjgl.vulkan.VkDependencyInfoKHR.create(r0)
                org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDependencyInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDependencyInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDependencyInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000314003(0x3b9f9493, float:0.0048700063)
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndependencyFlags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR pMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *") org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMemoryBarriers(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR pBufferMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *") org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npBufferMemoryBarriers(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR pImageMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *") org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npImageMemoryBarriers(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public org.lwjgl.vulkan.VkDependencyInfoKHR set(int r5, long r6, int r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r10, @javax.annotation.Nullable org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.dependencyFlags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pMemoryBarriers(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pBufferMemoryBarriers(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pImageMemoryBarriers(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfoKHR set(org.lwjgl.vulkan.VkDependencyInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR malloc() {
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR calloc() {
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDependencyInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDependencyInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDependencyInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDependencyInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDependencyInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo set(int r10, long r11, int r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r14, @javax.annotation.Nullable org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r15, @javax.annotation.Nullable org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r16) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo pImageMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *") org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pImageMemoryBarriers(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo pBufferMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *") org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pBufferMemoryBarriers(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo pMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *") org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pMemoryBarriers(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.dependencyFlags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDependencyInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDependencyInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDependencyInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
