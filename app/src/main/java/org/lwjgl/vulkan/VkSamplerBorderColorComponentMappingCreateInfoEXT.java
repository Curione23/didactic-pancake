package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT.class */
public class VkSamplerBorderColorComponentMappingCreateInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int COMPONENTS = 0;
    public static final int SRGB = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT, org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.npNext(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkComponentMapping components() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkComponentMapping r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.ncomponents(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean srgb() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.nsrgb(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000411001(0x3ba10f79, float:0.0049151746)
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer components(org.lwjgl.vulkan.VkComponentMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.ncomponents(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer srgb(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.nsrgb(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.create(r0)
                org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSamplerBorderColorComponentMappingCreateInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSamplerBorderColorComponentMappingCreateInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
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

    public org.lwjgl.vulkan.VkComponentMapping components() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkComponentMapping r0 = ncomponents(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean srgb() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrgb(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000411001(0x3ba10f79, float:0.0049151746)
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT components(org.lwjgl.vulkan.VkComponentMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncomponents(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT srgb(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nsrgb(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT set(int r5, long r6, org.lwjgl.vulkan.VkComponentMapping r8, boolean r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = r0.components(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = r0.srgb(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT set(org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT malloc() {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT calloc() {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkComponentMapping ncomponents(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.COMPONENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkComponentMapping r0 = org.lwjgl.vulkan.VkComponentMapping.create(r0)
            return r0
    }

    public static int nsrgb(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SRGB
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncomponents(long r7, org.lwjgl.vulkan.VkComponentMapping r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.COMPONENTS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkComponentMapping.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrgb(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SRGB
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
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkComponentMapping.SIZEOF
            int r4 = org.lwjgl.vulkan.VkComponentMapping.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.COMPONENTS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerBorderColorComponentMappingCreateInfoEXT.SRGB = r0
            return
    }
}
