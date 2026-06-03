package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderModuleValidationCacheCreateInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderModuleValidationCacheCreateInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderModuleValidationCacheCreateInfoEXT.class */
public class VkShaderModuleValidationCacheCreateInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int VALIDATIONCACHE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderModuleValidationCacheCreateInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderModuleValidationCacheCreateInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderModuleValidationCacheCreateInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT, org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkValidationCacheEXT")
        public long validationCache() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.nvalidationCache(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000160001(0x3b9d3b01, float:0.0047982936)
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer validationCache(@org.lwjgl.system.NativeType("VkValidationCacheEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.nvalidationCache(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.create(r0)
                org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkShaderModuleValidationCacheCreateInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkShaderModuleValidationCacheCreateInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkValidationCacheEXT")
    public long validationCache() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvalidationCache(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000160001(0x3b9d3b01, float:0.0047982936)
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT validationCache(@org.lwjgl.system.NativeType("VkValidationCacheEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvalidationCache(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT set(int r5, long r6, long r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = r0.validationCache(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT set(org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT malloc() {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT calloc() {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvalidationCache(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.VALIDATIONCACHE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvalidationCache(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.VALIDATIONCACHE
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
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderModuleValidationCacheCreateInfoEXT.VALIDATIONCACHE = r0
            return
    }
}
