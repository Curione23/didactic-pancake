package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR.class */
public class VkVideoSessionCreateInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int QUEUEFAMILYINDEX = 0;
    public static final int FLAGS = 0;
    public static final int PVIDEOPROFILE = 0;
    public static final int PICTUREFORMAT = 0;
    public static final int MAXCODEDEXTENT = 0;
    public static final int REFERENCEPICTUREFORMAT = 0;
    public static final int MAXDPBSLOTS = 0;
    public static final int MAXACTIVEREFERENCEPICTURES = 0;
    public static final int PSTDHEADERVERSION = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR, org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueFamilyIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoSessionCreateFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVideoProfileInfoKHR const *")
        public org.lwjgl.vulkan.VkVideoProfileInfoKHR pVideoProfile() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVideoProfileInfoKHR r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npVideoProfile(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int pictureFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npictureFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxCodedExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nmaxCodedExtent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int referencePictureFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nreferencePictureFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDpbSlots() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nmaxDpbSlots(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxActiveReferencePictures() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkExtensionProperties const *")
        public org.lwjgl.vulkan.VkExtensionProperties pStdHeaderVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtensionProperties r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npStdHeaderVersion(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000023005(0x3b9b23dd, float:0.0047345)
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkVideoEncodeH264SessionCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoEncodeH264SessionCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkVideoEncodeH265SessionCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoEncodeH265SessionCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer queueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkVideoSessionCreateFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer pVideoProfile(@org.lwjgl.system.NativeType("VkVideoProfileInfoKHR const *") org.lwjgl.vulkan.VkVideoProfileInfoKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npVideoProfile(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer pictureFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npictureFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(org.lwjgl.vulkan.VkExtent2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nmaxCodedExtent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent2D r1 = r1.maxCodedExtent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer referencePictureFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nreferencePictureFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer maxDpbSlots(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nmaxDpbSlots(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer maxActiveReferencePictures(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer pStdHeaderVersion(@org.lwjgl.system.NativeType("VkExtensionProperties const *") org.lwjgl.vulkan.VkExtensionProperties r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.npStdHeaderVersion(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoSessionCreateInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoSessionCreateInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int queueFamilyIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueueFamilyIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoSessionCreateFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVideoProfileInfoKHR const *")
    public org.lwjgl.vulkan.VkVideoProfileInfoKHR pVideoProfile() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVideoProfileInfoKHR r0 = npVideoProfile(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int pictureFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npictureFormat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxCodedExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxCodedExtent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int referencePictureFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nreferencePictureFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDpbSlots() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDpbSlots(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxActiveReferencePictures() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxActiveReferencePictures(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkExtensionProperties const *")
    public org.lwjgl.vulkan.VkExtensionProperties pStdHeaderVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtensionProperties r0 = npStdHeaderVersion(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000023005(0x3b9b23dd, float:0.0047345)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR pNext(org.lwjgl.vulkan.VkVideoEncodeH264SessionCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoEncodeH264SessionCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR pNext(org.lwjgl.vulkan.VkVideoEncodeH265SessionCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoEncodeH265SessionCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR queueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueueFamilyIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR flags(@org.lwjgl.system.NativeType("VkVideoSessionCreateFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR pVideoProfile(@org.lwjgl.system.NativeType("VkVideoProfileInfoKHR const *") org.lwjgl.vulkan.VkVideoProfileInfoKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npVideoProfile(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR pictureFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npictureFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR maxCodedExtent(org.lwjgl.vulkan.VkExtent2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxCodedExtent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR maxCodedExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent2D r1 = r1.maxCodedExtent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR referencePictureFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreferencePictureFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR maxDpbSlots(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxDpbSlots(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR maxActiveReferencePictures(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxActiveReferencePictures(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR pStdHeaderVersion(@org.lwjgl.system.NativeType("VkExtensionProperties const *") org.lwjgl.vulkan.VkExtensionProperties r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStdHeaderVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR set(int r5, long r6, int r8, int r9, org.lwjgl.vulkan.VkVideoProfileInfoKHR r10, int r11, org.lwjgl.vulkan.VkExtent2D r12, int r13, int r14, int r15, org.lwjgl.vulkan.VkExtensionProperties r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.queueFamilyIndex(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.pVideoProfile(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.pictureFormat(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.maxCodedExtent(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.referencePictureFormat(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.maxDpbSlots(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.maxActiveReferencePictures(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.pStdHeaderVersion(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR set(org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nqueueFamilyIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoProfileInfoKHR npVideoProfile(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PVIDEOPROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkVideoProfileInfoKHR r0 = org.lwjgl.vulkan.VkVideoProfileInfoKHR.create(r0)
            return r0
    }

    public static int npictureFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PICTUREFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxCodedExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static int nreferencePictureFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.REFERENCEPICTUREFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDpbSlots(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXDPBSLOTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxActiveReferencePictures(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXACTIVEREFERENCEPICTURES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtensionProperties npStdHeaderVersion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkExtensionProperties r0 = org.lwjgl.vulkan.VkExtensionProperties.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nqueueFamilyIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npVideoProfile(long r5, org.lwjgl.vulkan.VkVideoProfileInfoKHR r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PVIDEOPROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npictureFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PICTUREFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxCodedExtent(long r7, org.lwjgl.vulkan.VkExtent2D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nreferencePictureFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.REFERENCEPICTUREFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxDpbSlots(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXDPBSLOTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxActiveReferencePictures(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXACTIVEREFERENCEPICTURES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npStdHeaderVersion(long r5, org.lwjgl.vulkan.VkExtensionProperties r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PVIDEOPROFILE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            int r3 = org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PVIDEOPROFILE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PICTUREFORMAT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.REFERENCEPICTUREFORMAT = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXDPBSLOTS = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.MAXACTIVEREFERENCEPICTURES = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION = r0
            return
    }
}
