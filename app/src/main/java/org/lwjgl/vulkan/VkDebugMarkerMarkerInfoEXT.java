package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT.class */
public class VkDebugMarkerMarkerInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PMARKERNAME = 0;
    public static final int COLOR = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT, org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer pMarkerName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.npMarkerName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String pMarkerNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.npMarkerNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("float[4]")
        public java.nio.FloatBuffer color() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ncolor(r0)
                return r0
        }

        public float color(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ncolor(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000022002(0x3b9b1ff2, float:0.004734033)
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer pMarkerName(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.npMarkerName(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer color(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ncolor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer color(int r6, float r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ncolor(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.create(r0)
                org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDebugMarkerMarkerInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDebugMarkerMarkerInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer pMarkerName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npMarkerName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String pMarkerNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npMarkerNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("float[4]")
    public java.nio.FloatBuffer color() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = ncolor(r0)
            return r0
    }

    public float color(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = ncolor(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000022002(0x3b9b1ff2, float:0.004734033)
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT pMarkerName(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMarkerName(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT color(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT color(int r6, float r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ncolor(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT set(int r5, long r6, java.nio.ByteBuffer r8, java.nio.FloatBuffer r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = r0.pMarkerName(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = r0.color(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT set(org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT malloc() {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT calloc() {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer npMarkerName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PMARKERNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String npMarkerNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PMARKERNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.FloatBuffer ncolor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.COLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float ncolor(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.COLOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npMarkerName(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PMARKERNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncolor(long r7, java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.COLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncolor(long r9, int r11, float r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.COLOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PMARKERNAME
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
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.PMARKERNAME = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugMarkerMarkerInfoEXT.COLOR = r0
            return
    }
}
