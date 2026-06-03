package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorDataEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorDataEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorDataEXT.class */
public class VkDescriptorDataEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDescriptorDataEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PSAMPLER = 0;
    public static final int PCOMBINEDIMAGESAMPLER = 0;
    public static final int PINPUTATTACHMENTIMAGE = 0;
    public static final int PSAMPLEDIMAGE = 0;
    public static final int PSTORAGEIMAGE = 0;
    public static final int PUNIFORMTEXELBUFFER = 0;
    public static final int PSTORAGETEXELBUFFER = 0;
    public static final int PUNIFORMBUFFER = 0;
    public static final int PSTORAGEBUFFER = 0;
    public static final int ACCELERATIONSTRUCTURE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorDataEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorDataEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorDataEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDescriptorDataEXT, org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDescriptorDataEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDescriptorDataEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorDataEXT r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkSampler const *")
        public java.nio.LongBuffer pSampler(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npSampler(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
        public org.lwjgl.vulkan.VkDescriptorImageInfo pCombinedImageSampler() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npCombinedImageSampler(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
        public org.lwjgl.vulkan.VkDescriptorImageInfo pInputAttachmentImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npInputAttachmentImage(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
        public org.lwjgl.vulkan.VkDescriptorImageInfo pSampledImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npSampledImage(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
        public org.lwjgl.vulkan.VkDescriptorImageInfo pStorageImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npStorageImage(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
        public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npUniformTexelBuffer(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
        public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npStorageTexelBuffer(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
        public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pUniformBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npUniformBuffer(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
        public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pStorageBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.npStorageBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long accelerationStructure() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.naccelerationStructure(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pSampler(@org.lwjgl.system.NativeType("VkSampler const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npSampler(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pCombinedImageSampler(@org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npCombinedImageSampler(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pInputAttachmentImage(@org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npInputAttachmentImage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pSampledImage(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npSampledImage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pStorageImage(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npStorageImage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pUniformTexelBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npUniformTexelBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pStorageTexelBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npStorageTexelBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pUniformBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npUniformBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer pStorageBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorDataEXT.npStorageBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer accelerationStructure(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorDataEXT.naccelerationStructure(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorDataEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorDataEXT r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.create(r0)
                org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorDataEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorDataEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorDataEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkSampler const *")
    public java.nio.LongBuffer pSampler(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.LongBuffer r0 = npSampler(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
    public org.lwjgl.vulkan.VkDescriptorImageInfo pCombinedImageSampler() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = npCombinedImageSampler(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
    public org.lwjgl.vulkan.VkDescriptorImageInfo pInputAttachmentImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = npInputAttachmentImage(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
    public org.lwjgl.vulkan.VkDescriptorImageInfo pSampledImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = npSampledImage(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
    public org.lwjgl.vulkan.VkDescriptorImageInfo pStorageImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = npStorageImage(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
    public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = npUniformTexelBuffer(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
    public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = npStorageTexelBuffer(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
    public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pUniformBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = npUniformBuffer(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *")
    public org.lwjgl.vulkan.VkDescriptorAddressInfoEXT pStorageBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = npStorageBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long accelerationStructure() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naccelerationStructure(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pSampler(@org.lwjgl.system.NativeType("VkSampler const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSampler(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pCombinedImageSampler(@org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npCombinedImageSampler(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pInputAttachmentImage(@org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npInputAttachmentImage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pSampledImage(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSampledImage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pStorageImage(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStorageImage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pUniformTexelBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npUniformTexelBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pStorageTexelBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStorageTexelBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pUniformBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npUniformBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT pStorageBuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorAddressInfoEXT const *") org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStorageBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT accelerationStructure(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naccelerationStructure(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorDataEXT set(org.lwjgl.vulkan.VkDescriptorDataEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT malloc() {
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT calloc() {
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT create(long r6) {
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorDataEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorDataEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorDataEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.LongBuffer npSampler(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorImageInfo npCombinedImageSampler(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PCOMBINEDIMAGESAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorImageInfo.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorImageInfo npInputAttachmentImage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PINPUTATTACHMENTIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorImageInfo.create(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorImageInfo npSampledImage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSAMPLEDIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorImageInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorImageInfo npStorageImage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGEIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorImageInfo r0 = org.lwjgl.vulkan.VkDescriptorImageInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorAddressInfoEXT npUniformTexelBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PUNIFORMTEXELBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorAddressInfoEXT.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorAddressInfoEXT npStorageTexelBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGETEXELBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorAddressInfoEXT.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorAddressInfoEXT npUniformBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PUNIFORMBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorAddressInfoEXT.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorAddressInfoEXT npStorageBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGEBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorAddressInfoEXT.createSafe(r0)
            return r0
    }

    public static long naccelerationStructure(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.ACCELERATIONSTRUCTURE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void npSampler(long r5, java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npCombinedImageSampler(long r5, org.lwjgl.vulkan.VkDescriptorImageInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PCOMBINEDIMAGESAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npInputAttachmentImage(long r5, org.lwjgl.vulkan.VkDescriptorImageInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PINPUTATTACHMENTIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npSampledImage(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorImageInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSAMPLEDIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npStorageImage(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorImageInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGEIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npUniformTexelBuffer(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PUNIFORMTEXELBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npStorageTexelBuffer(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGETEXELBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npUniformBuffer(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PUNIFORMBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npStorageBuffer(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorAddressInfoEXT r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGEBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void naccelerationStructure(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.ACCELERATIONSTRUCTURE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorDataEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkDescriptorDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDescriptorDataEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDescriptorDataEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PSAMPLER = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PCOMBINEDIMAGESAMPLER = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PINPUTATTACHMENTIMAGE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PSAMPLEDIMAGE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGEIMAGE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PUNIFORMTEXELBUFFER = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGETEXELBUFFER = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PUNIFORMBUFFER = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.PSTORAGEBUFFER = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorDataEXT.ACCELERATIONSTRUCTURE = r0
            return
    }
}
