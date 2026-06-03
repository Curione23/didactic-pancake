package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyDescriptorSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyDescriptorSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyDescriptorSet.class */
public class VkCopyDescriptorSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCopyDescriptorSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SRCSET = 0;
    public static final int SRCBINDING = 0;
    public static final int SRCARRAYELEMENT = 0;
    public static final int DSTSET = 0;
    public static final int DSTBINDING = 0;
    public static final int DSTARRAYELEMENT = 0;
    public static final int DESCRIPTORCOUNT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyDescriptorSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyDescriptorSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyDescriptorSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCopyDescriptorSet, org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCopyDescriptorSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
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
        protected org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCopyDescriptorSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCopyDescriptorSet r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorSet")
        public long srcSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.nsrcSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int srcBinding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.nsrcBinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int srcArrayElement() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.nsrcArrayElement(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorSet")
        public long dstSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.ndstSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int dstBinding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.ndstBinding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int dstArrayElement() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.ndstArrayElement(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int descriptorCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.ndescriptorCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyDescriptorSet.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 36
                org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyDescriptorSet.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer srcSet(@org.lwjgl.system.NativeType("VkDescriptorSet") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyDescriptorSet.nsrcSet(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer srcBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyDescriptorSet.nsrcBinding(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer srcArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyDescriptorSet.nsrcArrayElement(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer dstSet(@org.lwjgl.system.NativeType("VkDescriptorSet") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyDescriptorSet.ndstSet(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyDescriptorSet.ndstBinding(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyDescriptorSet.ndstArrayElement(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyDescriptorSet.ndescriptorCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCopyDescriptorSet r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.create(r0)
                org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCopyDescriptorSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCopyDescriptorSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCopyDescriptorSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
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
    public long srcSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int srcBinding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcBinding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int srcArrayElement() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcArrayElement(r0)
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

    public org.lwjgl.vulkan.VkCopyDescriptorSet sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 36
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet srcSet(@org.lwjgl.system.NativeType("VkDescriptorSet") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcSet(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet srcBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcBinding(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet srcArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcArrayElement(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet dstSet(@org.lwjgl.system.NativeType("VkDescriptorSet") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstSet(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstBinding(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstArrayElement(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescriptorCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet set(int r5, long r6, long r8, int r10, int r11, long r12, int r14, int r15, int r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.srcSet(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.srcBinding(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.srcArrayElement(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.dstSet(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.dstBinding(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.dstArrayElement(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.descriptorCount(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyDescriptorSet set(org.lwjgl.vulkan.VkCopyDescriptorSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet malloc() {
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet calloc() {
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet create() {
            int r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet create(long r6) {
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyDescriptorSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer
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

    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyDescriptorSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer r0 = new org.lwjgl.vulkan.VkCopyDescriptorSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyDescriptorSet.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nsrcSet(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SRCSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nsrcBinding(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SRCBINDING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsrcArrayElement(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SRCARRAYELEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndstSet(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DSTSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int ndstBinding(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DSTBINDING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndstArrayElement(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DSTARRAYELEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DESCRIPTORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyDescriptorSet.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsrcSet(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SRCSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsrcBinding(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SRCBINDING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcArrayElement(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.SRCARRAYELEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstSet(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DSTSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ndstBinding(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DSTBINDING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstArrayElement(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DSTARRAYELEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyDescriptorSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.DESCRIPTORCOUNT
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
            org.lwjgl.vulkan.VkCopyDescriptorSet r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyDescriptorSet.POINTER_SIZE
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
            r3 = 8
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCopyDescriptorSet.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCopyDescriptorSet.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.SRCSET = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.SRCBINDING = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.SRCARRAYELEMENT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.DSTSET = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.DSTBINDING = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.DSTARRAYELEMENT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyDescriptorSet.DESCRIPTORCOUNT = r0
            return
    }
}
