package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV.class */
public class VkOpticalFlowSessionCreateInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int IMAGEFORMAT = 0;
    public static final int FLOWVECTORFORMAT = 0;
    public static final int COSTFORMAT = 0;
    public static final int OUTPUTGRIDSIZE = 0;
    public static final int HINTGRIDSIZE = 0;
    public static final int PERFORMANCELEVEL = 0;
    public static final int FLAGS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV, org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nwidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int imageFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nimageFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int flowVectorFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nflowVectorFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int costFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.ncostFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int outputGridSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.noutputGridSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int hintGridSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nhintGridSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkOpticalFlowPerformanceLevelNV")
        public int performanceLevel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nperformanceLevel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkOpticalFlowSessionCreateFlagsNV")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nflags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000464004(0x3ba1de84, float:0.004939856)
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer pNext(org.lwjgl.vulkan.VkOpticalFlowSessionCreatePrivateDataInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpticalFlowSessionCreatePrivateDataInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nwidth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer height(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nheight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer imageFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nimageFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer flowVectorFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nflowVectorFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer costFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.ncostFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer outputGridSize(@org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.noutputGridSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer hintGridSize(@org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nhintGridSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer performanceLevel(@org.lwjgl.system.NativeType("VkOpticalFlowPerformanceLevelNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nperformanceLevel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer flags(@org.lwjgl.system.NativeType("VkOpticalFlowSessionCreateFlagsNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.create(r0)
                org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkOpticalFlowSessionCreateInfoNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkOpticalFlowSessionCreateInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
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

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int imageFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int flowVectorFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflowVectorFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int costFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncostFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int outputGridSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutputGridSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int hintGridSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhintGridSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkOpticalFlowPerformanceLevelNV")
    public int performanceLevel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nperformanceLevel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkOpticalFlowSessionCreateFlagsNV")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000464004(0x3ba1de84, float:0.004939856)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV pNext(org.lwjgl.vulkan.VkOpticalFlowSessionCreatePrivateDataInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpticalFlowSessionCreatePrivateDataInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwidth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV height(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV imageFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV flowVectorFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflowVectorFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV costFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncostFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV outputGridSize(@org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutputGridSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV hintGridSize(@org.lwjgl.system.NativeType("VkOpticalFlowGridSizeFlagsNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhintGridSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV performanceLevel(@org.lwjgl.system.NativeType("VkOpticalFlowPerformanceLevelNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nperformanceLevel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV flags(@org.lwjgl.system.NativeType("VkOpticalFlowSessionCreateFlagsNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.width(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.height(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.imageFormat(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.flowVectorFormat(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.costFormat(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.outputGridSize(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.hintGridSize(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.performanceLevel(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.flags(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV set(org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV malloc() {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV calloc() {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV create(long r6) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.IMAGEFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflowVectorFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.FLOWVECTORFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncostFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.COSTFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int noutputGridSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.OUTPUTGRIDSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nhintGridSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.HINTGRIDSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nperformanceLevel(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.PERFORMANCELEVEL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwidth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nheight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.IMAGEFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflowVectorFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.FLOWVECTORFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncostFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.COSTFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noutputGridSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.OUTPUTGRIDSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nhintGridSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.HINTGRIDSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nperformanceLevel(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.PERFORMANCELEVEL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.FLAGS
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
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.WIDTH = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.HEIGHT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.IMAGEFORMAT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.FLOWVECTORFORMAT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.COSTFORMAT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.OUTPUTGRIDSIZE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.HINTGRIDSIZE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.PERFORMANCELEVEL = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkOpticalFlowSessionCreateInfoNV.FLAGS = r0
            return
    }
}
