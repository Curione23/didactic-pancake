package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkApplicationInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkApplicationInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkApplicationInfo.class */
public class VkApplicationInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkApplicationInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PAPPLICATIONNAME = 0;
    public static final int APPLICATIONVERSION = 0;
    public static final int PENGINENAME = 0;
    public static final int ENGINEVERSION = 0;
    public static final int APIVERSION = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkApplicationInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkApplicationInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkApplicationInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkApplicationInfo, org.lwjgl.vulkan.VkApplicationInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkApplicationInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkApplicationInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkApplicationInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkApplicationInfo r0 = org.lwjgl.vulkan.VkApplicationInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkApplicationInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkApplicationInfo.npNext(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer pApplicationName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkApplicationInfo.npApplicationName(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String pApplicationNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkApplicationInfo.npApplicationNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int applicationVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkApplicationInfo.napplicationVersion(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer pEngineName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkApplicationInfo.npEngineName(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String pEngineNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkApplicationInfo.npEngineNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int engineVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkApplicationInfo.nengineVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int apiVersion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkApplicationInfo.napiVersion(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkApplicationInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 0
                org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkApplicationInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer pApplicationName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkApplicationInfo.npApplicationName(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer applicationVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkApplicationInfo.napplicationVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer pEngineName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkApplicationInfo.npEngineName(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer engineVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkApplicationInfo.nengineVersion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkApplicationInfo.Buffer apiVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkApplicationInfo.napiVersion(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkApplicationInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkApplicationInfo r0 = org.lwjgl.vulkan.VkApplicationInfo.create(r0)
                org.lwjgl.vulkan.VkApplicationInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkApplicationInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkApplicationInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkApplicationInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
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

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer pApplicationName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npApplicationName(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String pApplicationNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npApplicationNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int applicationVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = napplicationVersion(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer pEngineName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npEngineName(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String pEngineNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npEngineNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int engineVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nengineVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int apiVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = napiVersion(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 0
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo pApplicationName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npApplicationName(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo applicationVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            napplicationVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo pEngineName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npEngineName(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo engineVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nengineVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo apiVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            napiVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo set(int r5, long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8, int r9, @javax.annotation.Nullable java.nio.ByteBuffer r10, int r11, int r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.pApplicationName(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.applicationVersion(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.pEngineName(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.engineVersion(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.apiVersion(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkApplicationInfo set(org.lwjgl.vulkan.VkApplicationInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo malloc() {
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo calloc() {
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo create() {
            int r0 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo create(long r6) {
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkApplicationInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = new org.lwjgl.vulkan.VkApplicationInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = new org.lwjgl.vulkan.VkApplicationInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = new org.lwjgl.vulkan.VkApplicationInfo$Buffer
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

    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = new org.lwjgl.vulkan.VkApplicationInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = new org.lwjgl.vulkan.VkApplicationInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkApplicationInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkApplicationInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkApplicationInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkApplicationInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkApplicationInfo r0 = new org.lwjgl.vulkan.VkApplicationInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = new org.lwjgl.vulkan.VkApplicationInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkApplicationInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkApplicationInfo$Buffer r0 = new org.lwjgl.vulkan.VkApplicationInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkApplicationInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer npApplicationName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PAPPLICATIONNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String npApplicationNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PAPPLICATIONNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int napplicationVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.APPLICATIONVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer npEngineName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PENGINENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String npEngineNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PENGINENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int nengineVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.ENGINEVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int napiVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.APIVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npApplicationName(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PAPPLICATIONNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void napplicationVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.APPLICATIONVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npEngineName(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkApplicationInfo.PENGINENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nengineVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.ENGINEVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void napiVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkApplicationInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.APIVERSION
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
            org.lwjgl.vulkan.VkApplicationInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkApplicationInfo.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkApplicationInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkApplicationInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkApplicationInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkApplicationInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkApplicationInfo.PAPPLICATIONNAME = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkApplicationInfo.APPLICATIONVERSION = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkApplicationInfo.PENGINENAME = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkApplicationInfo.ENGINEVERSION = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkApplicationInfo.APIVERSION = r0
            return
    }
}
