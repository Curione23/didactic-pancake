package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.class */
public class VkDescriptorSetLayoutBindingFlagsCreateInfoEXT extends org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer {
        private static final org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000161000(0x3b9d3ee8, float:0.004798759)
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer bindingCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nbindingCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer pBindingFlags(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorBindingFlags const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npBindingFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer pBindingFlags(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorBindingFlags const *") java.nio.IntBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.pBindingFlags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer bindingCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.bindingCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.create(r0)
                org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000161000(0x3b9d3ee8, float:0.004798759)
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT bindingCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbindingCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pBindingFlags(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorBindingFlags const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npBindingFlags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(int r5, long r6, int r8, @javax.annotation.Nullable java.nio.IntBuffer r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.bindingCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.pBindingFlags(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT malloc() {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT calloc() {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo set(int r8, long r9, int r11, @javax.annotation.Nullable java.nio.IntBuffer r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.set(r1, r2, r3, r4)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlags(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorBindingFlags const *") java.nio.IntBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.pBindingFlags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.bindingCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorSetLayoutBindingFlagsCreateInfoEXT r0 = r0.create(r1, r2)
            return r0
    }
}
