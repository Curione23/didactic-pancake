package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWriteDescriptorSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWriteDescriptorSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWriteDescriptorSet.class */
public class VkWriteDescriptorSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkWriteDescriptorSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DSTSET = 0;
    public static final int DSTBINDING = 0;
    public static final int DSTARRAYELEMENT = 0;
    public static final int DESCRIPTORCOUNT = 0;
    public static final int DESCRIPTORTYPE = 0;
    public static final int PIMAGEINFO = 0;
    public static final int PBUFFERINFO = 0;
    public static final int PTEXELBUFFERVIEW = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWriteDescriptorSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWriteDescriptorSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWriteDescriptorSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkWriteDescriptorSet, org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkWriteDescriptorSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
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
        protected org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkWriteDescriptorSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkWriteDescriptorSet r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorSet")
        public long dstSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.ndstSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int dstBinding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.ndstBinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int dstArrayElement() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.ndstArrayElement(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int descriptorCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.ndescriptorCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorType")
        public int descriptorType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.ndescriptorType(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
        public org.lwjgl.vulkan.VkDescriptorImageInfo.Buffer pImageInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorImageInfo$Buffer r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.npImageInfo(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDescriptorBufferInfo const *")
        public org.lwjgl.vulkan.VkDescriptorBufferInfo.Buffer pBufferInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorBufferInfo$Buffer r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.npBufferInfo(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkBufferView const *")
        public java.nio.LongBuffer pTexelBufferView() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.npTexelBufferView(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 35
                org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkWriteDescriptorSet.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pNext(org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pNext(org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pNext(org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pNext(org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlockEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlockEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer dstSet(@org.lwjgl.system.NativeType("VkDescriptorSet") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkWriteDescriptorSet.ndstSet(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.ndstBinding(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.ndstArrayElement(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.ndescriptorCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer descriptorType(@org.lwjgl.system.NativeType("VkDescriptorType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.ndescriptorType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pImageInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.npImageInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pBufferInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorBufferInfo const *") org.lwjgl.vulkan.VkDescriptorBufferInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.npBufferInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pTexelBufferView(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferView const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWriteDescriptorSet.npTexelBufferView(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkWriteDescriptorSet r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.create(r0)
                org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkWriteDescriptorSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkWriteDescriptorSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkWriteDescriptorSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDescriptorSet")
    public long dstSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int dstBinding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstBinding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int dstArrayElement() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstArrayElement(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int descriptorCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDescriptorType")
    public int descriptorType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorType(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *")
    public org.lwjgl.vulkan.VkDescriptorImageInfo.Buffer pImageInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorImageInfo$Buffer r0 = npImageInfo(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDescriptorBufferInfo const *")
    public org.lwjgl.vulkan.VkDescriptorBufferInfo.Buffer pBufferInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorBufferInfo$Buffer r0 = npBufferInfo(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkBufferView const *")
    public java.nio.LongBuffer pTexelBufferView() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npTexelBufferView(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 35
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pNext(org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pNext(org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkWriteDescriptorSetAccelerationStructureNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pNext(org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlock r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pNext(org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlockEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkWriteDescriptorSetInlineUniformBlockEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet dstSet(@org.lwjgl.system.NativeType("VkDescriptorSet") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstSet(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstBinding(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstArrayElement(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescriptorCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet descriptorType(@org.lwjgl.system.NativeType("VkDescriptorType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescriptorType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pImageInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorImageInfo const *") org.lwjgl.vulkan.VkDescriptorImageInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npImageInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pBufferInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorBufferInfo const *") org.lwjgl.vulkan.VkDescriptorBufferInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npBufferInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet pTexelBufferView(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferView const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTexelBufferView(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet set(int r5, long r6, long r8, int r10, int r11, int r12, int r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorImageInfo.Buffer r14, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorBufferInfo.Buffer r15, @javax.annotation.Nullable java.nio.LongBuffer r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.dstSet(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.dstBinding(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.dstArrayElement(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.descriptorCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.descriptorType(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pImageInfo(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pBufferInfo(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.pTexelBufferView(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWriteDescriptorSet set(org.lwjgl.vulkan.VkWriteDescriptorSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet malloc() {
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet calloc() {
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet create() {
            int r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet create(long r6) {
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkWriteDescriptorSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer
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

    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ndstSet(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DSTSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int ndstBinding(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DSTBINDING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndstArrayElement(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DSTARRAYELEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorImageInfo.Buffer npImageInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PIMAGEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndescriptorCount(r1)
            org.lwjgl.vulkan.VkDescriptorImageInfo$Buffer r0 = org.lwjgl.vulkan.VkDescriptorImageInfo.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorBufferInfo.Buffer npBufferInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PBUFFERINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndescriptorCount(r1)
            org.lwjgl.vulkan.VkDescriptorBufferInfo$Buffer r0 = org.lwjgl.vulkan.VkDescriptorBufferInfo.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npTexelBufferView(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PTEXELBUFFERVIEW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndescriptorCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndstSet(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DSTSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ndstBinding(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DSTBINDING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstArrayElement(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DSTARRAYELEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npImageInfo(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorImageInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PIMAGEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npBufferInfo(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDescriptorBufferInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PBUFFERINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npTexelBufferView(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWriteDescriptorSet.PTEXELBUFFERVIEW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkWriteDescriptorSet r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkWriteDescriptorSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkWriteDescriptorSet.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkWriteDescriptorSet.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.DSTSET = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.DSTBINDING = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.DSTARRAYELEMENT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.DESCRIPTORTYPE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.PIMAGEINFO = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.PBUFFERINFO = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet.PTEXELBUFFERVIEW = r0
            return
    }
}
