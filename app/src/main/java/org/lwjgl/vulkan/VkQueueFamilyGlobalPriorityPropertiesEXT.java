package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityPropertiesEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityPropertiesEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityPropertiesEXT.class */
public class VkQueueFamilyGlobalPriorityPropertiesEXT extends org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer {
        private static final org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000388001(0x3ba0b5a1, float:0.0049044644)
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorityCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.npriorityCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorities(@org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorities(int r6, @org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer priorities(int r5, @org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR") int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.priorities(r1, r2)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer priorities(@org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]") java.nio.IntBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.priorities(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer priorityCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.priorityCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.create(r0)
                org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkQueueFamilyGlobalPriorityPropertiesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkQueueFamilyGlobalPriorityPropertiesEXT(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000388001(0x3ba0b5a1, float:0.0049044644)
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT priorityCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npriorityCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT priorities(@org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npriorities(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT priorities(int r6, @org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npriorities(r0, r1, r2)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT set(int r5, long r6, int r8, java.nio.IntBuffer r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.priorityCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.priorities(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT set(org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT malloc() {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT calloc() {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT create(long r6) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR set(int r8, long r9, int r11, java.nio.IntBuffer r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.set(r1, r2, r3, r4)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR priorities(int r5, @org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR") int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.priorities(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR priorities(@org.lwjgl.system.NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]") java.nio.IntBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.priorities(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR priorityCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.priorityCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesKHR, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkQueueFamilyGlobalPriorityPropertiesEXT r0 = r0.create(r1, r2)
            return r0
    }
}
