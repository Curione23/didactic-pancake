package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescription2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescription2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescription2.class */
public class VkAttachmentDescription2 extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAttachmentDescription2> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int FORMAT = 0;
    public static final int SAMPLES = 0;
    public static final int LOADOP = 0;
    public static final int STOREOP = 0;
    public static final int STENCILLOADOP = 0;
    public static final int STENCILSTOREOP = 0;
    public static final int INITIALLAYOUT = 0;
    public static final int FINALLAYOUT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescription2$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescription2$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescription2$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAttachmentDescription2, org.lwjgl.vulkan.VkAttachmentDescription2.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAttachmentDescription2 ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
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
        protected org.lwjgl.vulkan.VkAttachmentDescription2.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAttachmentDescription2 getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAttachmentDescription2 r0 = org.lwjgl.vulkan.VkAttachmentDescription2.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAttachmentDescription2.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAttachmentDescriptionFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nformat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSampleCountFlagBits")
        public int samples() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nsamples(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAttachmentLoadOp")
        public int loadOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nloadOp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAttachmentStoreOp")
        public int storeOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nstoreOp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAttachmentLoadOp")
        public int stencilLoadOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nstencilLoadOp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAttachmentStoreOp")
        public int stencilStoreOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nstencilStoreOp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int initialLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.ninitialLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int finalLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.nfinalLayout(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000109000(0x3b9c73c8, float:0.0047745444)
                org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAttachmentDescription2.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer pNext(org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer pNext(org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer flags(@org.lwjgl.system.NativeType("VkAttachmentDescriptionFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nformat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer samples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nsamples(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nloadOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nstoreOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer stencilLoadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nstencilLoadOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer stencilStoreOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nstencilStoreOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer initialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.ninitialLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer finalLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescription2.nfinalLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAttachmentDescription2 r0 = org.lwjgl.vulkan.VkAttachmentDescription2.create(r0)
                org.lwjgl.vulkan.VkAttachmentDescription2.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAttachmentDescription2(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAttachmentDescription2 create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAttachmentDescription2(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
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

    @org.lwjgl.system.NativeType("VkAttachmentDescriptionFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSampleCountFlagBits")
    public int samples() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamples(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAttachmentLoadOp")
    public int loadOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nloadOp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAttachmentStoreOp")
    public int storeOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstoreOp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAttachmentLoadOp")
    public int stencilLoadOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstencilLoadOp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAttachmentStoreOp")
    public int stencilStoreOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstencilStoreOp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int initialLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninitialLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int finalLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfinalLayout(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000109000(0x3b9c73c8, float:0.0047745444)
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 pNext(org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 pNext(org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 flags(@org.lwjgl.system.NativeType("VkAttachmentDescriptionFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 samples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamples(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nloadOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstoreOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 stencilLoadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstencilLoadOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 stencilStoreOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstencilStoreOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 initialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninitialLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 finalLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfinalLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.format(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.samples(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.loadOp(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.storeOp(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.stencilLoadOp(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.stencilStoreOp(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.initialLayout(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.finalLayout(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescription2 set(org.lwjgl.vulkan.VkAttachmentDescription2 r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2 malloc() {
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2 calloc() {
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2 create() {
            int r0 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2 create(long r6) {
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentDescription2 createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescription2$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescription2$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescription2$Buffer
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

    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescription2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescription2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2 malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2 calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = new org.lwjgl.vulkan.VkAttachmentDescription2
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescription2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescription2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAttachmentDescription2.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsamples(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nloadOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.LOADOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstoreOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STOREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstencilLoadOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STENCILLOADOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstencilStoreOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STENCILSTOREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ninitialLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.INITIALLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfinalLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.FINALLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAttachmentDescription2.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nformat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsamples(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nloadOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.LOADOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstoreOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STOREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstencilLoadOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STENCILLOADOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstencilStoreOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.STENCILSTOREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ninitialLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.INITIALLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfinalLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAttachmentDescription2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.FINALLAYOUT
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
            org.lwjgl.vulkan.VkAttachmentDescription2 r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkAttachmentDescription2.POINTER_SIZE
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
            org.lwjgl.vulkan.VkAttachmentDescription2.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAttachmentDescription2.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.FORMAT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.SAMPLES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.LOADOP = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.STOREOP = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.STENCILLOADOP = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.STENCILSTOREOP = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.INITIALLAYOUT = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2.FINALLAYOUT = r0
            return
    }
}
