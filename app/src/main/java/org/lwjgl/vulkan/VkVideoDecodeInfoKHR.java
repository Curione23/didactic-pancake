package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR.class */
public class VkVideoDecodeInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoDecodeInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int SRCBUFFER = 0;
    public static final int SRCBUFFEROFFSET = 0;
    public static final int SRCBUFFERRANGE = 0;
    public static final int DSTPICTURERESOURCE = 0;
    public static final int PSETUPREFERENCESLOT = 0;
    public static final int REFERENCESLOTCOUNT = 0;
    public static final int PREFERENCESLOTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoDecodeInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoDecodeInfoKHR, org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoDecodeInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoDecodeInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoDecodeFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuffer")
        public long srcBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsrcBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long srcBufferOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsrcBufferOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long srcBufferRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsrcBufferRange(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR dstPictureResource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.ndstPictureResource(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *")
        public org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.npSetupReferenceSlot(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int referenceSlotCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nreferenceSlotCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *")
        public org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR$Buffer r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.npReferenceSlots(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000024000(0x3b9b27c0, float:0.004734963)
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkVideoDecodeH264PictureInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoDecodeH264PictureInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkVideoDecodeH265PictureInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoDecodeH265PictureInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkVideoDecodeFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer srcBuffer(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsrcBuffer(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer srcBufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsrcBufferOffset(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer srcBufferRange(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.nsrcBufferRange(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer dstPictureResource(org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.ndstPictureResource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer dstPictureResource(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r1 = r1.dstPictureResource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer pSetupReferenceSlot(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *") org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.npSetupReferenceSlot(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer pReferenceSlots(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *") org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.npReferenceSlots(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.create(r0)
                org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoDecodeInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoDecodeInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoDecodeInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkVideoDecodeFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuffer")
    public long srcBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long srcBufferOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcBufferOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long srcBufferRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcBufferRange(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR dstPictureResource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r0 = ndstPictureResource(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *")
    public org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR r0 = npSetupReferenceSlot(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int referenceSlotCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nreferenceSlotCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *")
    public org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR$Buffer r0 = npReferenceSlots(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000024000(0x3b9b27c0, float:0.004734963)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR pNext(org.lwjgl.vulkan.VkVideoDecodeH264PictureInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoDecodeH264PictureInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR pNext(org.lwjgl.vulkan.VkVideoDecodeH265PictureInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoDecodeH265PictureInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR flags(@org.lwjgl.system.NativeType("VkVideoDecodeFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR srcBuffer(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR srcBufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcBufferOffset(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR srcBufferRange(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcBufferRange(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR dstPictureResource(org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstPictureResource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR dstPictureResource(java.util.function.Consumer<org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r1 = r1.dstPictureResource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR pSetupReferenceSlot(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *") org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSetupReferenceSlot(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR pReferenceSlots(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkVideoReferenceSlotInfoKHR const *") org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npReferenceSlots(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR set(int r5, long r6, int r8, long r9, long r11, long r13, org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r15, @javax.annotation.Nullable org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR r16, @javax.annotation.Nullable org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.Buffer r17) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.srcBuffer(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.srcBufferOffset(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.srcBufferRange(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.dstPictureResource(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.pSetupReferenceSlot(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.pReferenceSlots(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoDecodeInfoKHR set(org.lwjgl.vulkan.VkVideoDecodeInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR malloc() {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR calloc() {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoDecodeInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoDecodeInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsrcBuffer(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nsrcBufferOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFEROFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nsrcBufferRange(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFERRANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR ndstPictureResource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.DSTPICTURERESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r0 = org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR.create(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR npSetupReferenceSlot(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR r0 = org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.createSafe(r0)
            return r0
    }

    public static int nreferenceSlotCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.REFERENCESLOTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.Buffer npReferenceSlots(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PREFERENCESLOTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nreferenceSlotCount(r1)
            org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR$Buffer r0 = org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.createSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcBuffer(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsrcBufferOffset(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFEROFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsrcBufferRange(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFERRANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ndstPictureResource(long r7, org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.DSTPICTURERESOURCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npSetupReferenceSlot(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nreferenceSlotCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.REFERENCESLOTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npReferenceSlots(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkVideoReferenceSlotInfoKHR.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PREFERENCESLOTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nreferenceSlotCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nreferenceSlotCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PREFERENCESLOTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.POINTER_SIZE
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkVideoPictureResourceInfoKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkVideoDecodeInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFER = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFEROFFSET = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.SRCBUFFERRANGE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.DSTPICTURERESOURCE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.REFERENCESLOTCOUNT = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoDecodeInfoKHR.PREFERENCESLOTS = r0
            return
    }
}
