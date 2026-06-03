package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR.class */
public class VkDescriptorUpdateTemplateEntryKHR extends org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateEntryKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer {
        private static final org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ndstBinding(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ndstArrayElement(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ndescriptorCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer descriptorType(@org.lwjgl.system.NativeType("VkDescriptorType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ndescriptorType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer offset(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.noffset(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer stride(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.nstride(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer stride(@org.lwjgl.system.NativeType("size_t") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.stride(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer offset(@org.lwjgl.system.NativeType("size_t") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.offset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer descriptorType(@org.lwjgl.system.NativeType("VkDescriptorType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.descriptorType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.descriptorCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.dstArrayElement(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.dstBinding(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.create(r0)
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorUpdateTemplateEntryKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorUpdateTemplateEntryKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstBinding(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstArrayElement(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescriptorCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR descriptorType(@org.lwjgl.system.NativeType("VkDescriptorType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescriptorType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR offset(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            noffset(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR stride(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nstride(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR set(int r5, int r6, int r7, int r8, long r9, long r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.dstBinding(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.dstArrayElement(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.descriptorCount(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.descriptorType(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.offset(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.stride(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR set(org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR malloc() {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR calloc() {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR create(long r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry set(int r11, int r12, int r13, int r14, long r15, long r17) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r17
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry stride(@org.lwjgl.system.NativeType("size_t") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.stride(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry offset(@org.lwjgl.system.NativeType("size_t") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.offset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry descriptorType(@org.lwjgl.system.NativeType("VkDescriptorType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.descriptorType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry descriptorCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.descriptorCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry dstArrayElement(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.dstArrayElement(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry dstBinding(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.dstBinding(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntryKHR r0 = r0.create(r1, r2)
            return r0
    }
}
