package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR.class */
public class VkDisplaySurfaceCreateInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int DISPLAYMODE = 0;
    public static final int PLANEINDEX = 0;
    public static final int PLANESTACKINDEX = 0;
    public static final int TRANSFORM = 0;
    public static final int GLOBALALPHA = 0;
    public static final int ALPHAMODE = 0;
    public static final int IMAGEEXTENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR, org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDisplaySurfaceCreateFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDisplayModeKHR")
        public long displayMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ndisplayMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int planeIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nplaneIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int planeStackIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ntransform(r0)
                return r0
        }

        public float globalAlpha() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
        public int alphaMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nalphaMode(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D imageExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nimageExtent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000002001(0x3b9ad1d1, float:0.004724719)
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkDisplaySurfaceCreateFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer displayMode(@org.lwjgl.system.NativeType("VkDisplayModeKHR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ndisplayMode(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer planeIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nplaneIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer planeStackIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer transform(@org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ntransform(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer globalAlpha(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer alphaMode(@org.lwjgl.system.NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nalphaMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer imageExtent(org.lwjgl.vulkan.VkExtent2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.nimageExtent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent2D r1 = r1.imageExtent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDisplaySurfaceCreateInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDisplaySurfaceCreateInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDisplaySurfaceCreateFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDisplayModeKHR")
    public long displayMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndisplayMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int planeIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nplaneIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int planeStackIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nplaneStackIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntransform(r0)
            return r0
    }

    public float globalAlpha() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nglobalAlpha(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
    public int alphaMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nalphaMode(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D imageExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nimageExtent(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000002001(0x3b9ad1d1, float:0.004724719)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR flags(@org.lwjgl.system.NativeType("VkDisplaySurfaceCreateFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR displayMode(@org.lwjgl.system.NativeType("VkDisplayModeKHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplayMode(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR planeIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nplaneIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR planeStackIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nplaneStackIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR transform(@org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransform(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR globalAlpha(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nglobalAlpha(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR alphaMode(@org.lwjgl.system.NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nalphaMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR imageExtent(org.lwjgl.vulkan.VkExtent2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageExtent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent2D r1 = r1.imageExtent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR set(int r5, long r6, int r8, long r9, int r11, int r12, int r13, float r14, int r15, org.lwjgl.vulkan.VkExtent2D r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.displayMode(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.planeIndex(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.planeStackIndex(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.transform(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.globalAlpha(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.alphaMode(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.imageExtent(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR set(org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndisplayMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nplaneIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PLANEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nplaneStackIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntransform(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.TRANSFORM
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static float nglobalAlpha(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static int nalphaMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALPHAMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nimageExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisplayMode(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nplaneIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PLANEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nplaneStackIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntransform(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.TRANSFORM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nglobalAlpha(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nalphaMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALPHAMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageExtent(long r7, org.lwjgl.vulkan.VkExtent2D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
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
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PLANEINDEX = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.TRANSFORM = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.ALPHAMODE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT = r0
            return
    }
}
