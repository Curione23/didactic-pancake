package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT.class */
public class VkPipelineDiscardRectangleStateCreateInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int DISCARDRECTANGLEMODE = 0;
    public static final int DISCARDRECTANGLECOUNT = 0;
    public static final int PDISCARDRECTANGLES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT, org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDiscardRectangleModeEXT")
        public int discardRectangleMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int discardRectangleCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkRect2D const *")
        public org.lwjgl.vulkan.VkRect2D.Buffer pDiscardRectangles() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRect2D$Buffer r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000099001(0x3b9c4cb9, float:0.0047698882)
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer flags(@org.lwjgl.system.NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleMode(@org.lwjgl.system.NativeType("VkDiscardRectangleModeEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pDiscardRectangles(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.create(r0)
                org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineDiscardRectangleStateCreateInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDiscardRectangleModeEXT")
    public int discardRectangleMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndiscardRectangleMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int discardRectangleCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndiscardRectangleCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkRect2D const *")
    public org.lwjgl.vulkan.VkRect2D.Buffer pDiscardRectangles() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRect2D$Buffer r0 = npDiscardRectangles(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000099001(0x3b9c4cb9, float:0.0047698882)
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT flags(@org.lwjgl.system.NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(@org.lwjgl.system.NativeType("VkDiscardRectangleModeEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndiscardRectangleMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndiscardRectangleCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDiscardRectangles(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT set(int r5, long r6, int r8, int r9, int r10, @javax.annotation.Nullable org.lwjgl.vulkan.VkRect2D.Buffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.discardRectangleMode(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.discardRectangleCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.pDiscardRectangles(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT set(org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT malloc() {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT calloc() {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndiscardRectangleMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndiscardRectangleCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRect2D.Buffer npDiscardRectangles(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndiscardRectangleCount(r1)
            org.lwjgl.vulkan.VkRect2D$Buffer r0 = org.lwjgl.vulkan.VkRect2D.createSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndiscardRectangleMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndiscardRectangleCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npDiscardRectangles(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkRect2D.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES
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
            ndiscardRectangleCount(r0, r1)
        L19:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES = r0
            return
    }
}
