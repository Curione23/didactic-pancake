package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks.class */
public class VmaDeviceMemoryCallbacks extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaDeviceMemoryCallbacks> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PFNALLOCATE = 0;
    public static final int PFNFREE = 0;
    public static final int PUSERDATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaDeviceMemoryCallbacks$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.vma.VmaDeviceMemoryCallbacks, org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.vma.VmaDeviceMemoryCallbacks ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
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
        protected org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.vma.VmaDeviceMemoryCallbacks getElementFactory() {
                r2 = this;
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer.ELEMENT_FACTORY
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("PFN_vmaAllocateDeviceMemoryFunction")
        public org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunction pfnAllocate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunction r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.npfnAllocate(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("PFN_vmaFreeDeviceMemoryFunction")
        public org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction pfnFree() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.npfnFree(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pUserData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.npUserData(r0)
                return r0
        }

        public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer pfnAllocate(@javax.annotation.Nullable @org.lwjgl.system.NativeType("PFN_vmaAllocateDeviceMemoryFunction") org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunctionI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.npfnAllocate(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer pfnFree(@javax.annotation.Nullable @org.lwjgl.system.NativeType("PFN_vmaFreeDeviceMemoryFunction") org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.npfnFree(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer pUserData(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.npUserData(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.create(r0)
                org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VmaDeviceMemoryCallbacks(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaDeviceMemoryCallbacks create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaDeviceMemoryCallbacks(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("PFN_vmaAllocateDeviceMemoryFunction")
    public org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunction pfnAllocate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunction r0 = npfnAllocate(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("PFN_vmaFreeDeviceMemoryFunction")
    public org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction pfnFree() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction r0 = npfnFree(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pUserData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npUserData(r0)
            return r0
    }

    public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks pfnAllocate(@javax.annotation.Nullable @org.lwjgl.system.NativeType("PFN_vmaAllocateDeviceMemoryFunction") org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunctionI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npfnAllocate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks pfnFree(@javax.annotation.Nullable @org.lwjgl.system.NativeType("PFN_vmaFreeDeviceMemoryFunction") org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npfnFree(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks pUserData(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npUserData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks set(org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunctionI r5, org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r6, long r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = r0.pfnAllocate(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = r0.pfnFree(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = r0.pUserData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks set(org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks malloc() {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks calloc() {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks create() {
            int r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks create(long r6) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer malloc(int r6) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer calloc(int r7) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer
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

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer create(long r6, int r8) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer r0 = new org.lwjgl.util.vma.VmaDeviceMemoryCallbacks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunction npfnAllocate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PFNALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunction r0 = org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunction.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction npfnFree(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PFNFREE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction r0 = org.lwjgl.util.vma.VmaFreeDeviceMemoryFunction.createSafe(r0)
            return r0
    }

    public static long npUserData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PUSERDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void npfnAllocate(long r5, @javax.annotation.Nullable org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunctionI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PFNALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npfnFree(long r5, @javax.annotation.Nullable org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PFNFREE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npUserData(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PUSERDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PFNALLOCATE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PFNFREE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.PUSERDATA = r0
            return
    }
}
