package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWAllocator.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWAllocator.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWAllocator.class */
@org.lwjgl.system.NativeType("struct GLFWallocator")
public class GLFWAllocator extends org.lwjgl.system.Struct<org.lwjgl.glfw.GLFWAllocator> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ALLOCATE = 0;
    public static final int REALLOCATE = 0;
    public static final int DEALLOCATE = 0;
    public static final int USER = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWAllocator$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWAllocator$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWAllocator$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.glfw.GLFWAllocator, org.lwjgl.glfw.GLFWAllocator.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.glfw.GLFWAllocator ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
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
        protected org.lwjgl.glfw.GLFWAllocator.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.glfw.GLFWAllocator getElementFactory() {
                r2 = this;
                org.lwjgl.glfw.GLFWAllocator r0 = org.lwjgl.glfw.GLFWAllocator.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("GLFWallocatefun")
        public org.lwjgl.glfw.GLFWAllocateCallback allocate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.glfw.GLFWAllocateCallback r0 = org.lwjgl.glfw.GLFWAllocator.nallocate(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("GLFWreallocatefun")
        public org.lwjgl.glfw.GLFWReallocateCallback reallocate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.glfw.GLFWReallocateCallback r0 = org.lwjgl.glfw.GLFWAllocator.nreallocate(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("GLFWdeallocatefun")
        public org.lwjgl.glfw.GLFWDeallocateCallback deallocate() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.glfw.GLFWDeallocateCallback r0 = org.lwjgl.glfw.GLFWAllocator.ndeallocate(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long user() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.glfw.GLFWAllocator.nuser(r0)
                return r0
        }

        public org.lwjgl.glfw.GLFWAllocator.Buffer allocate(@org.lwjgl.system.NativeType("GLFWallocatefun") org.lwjgl.glfw.GLFWAllocateCallbackI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWAllocator.nallocate(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.glfw.GLFWAllocator.Buffer reallocate(@org.lwjgl.system.NativeType("GLFWreallocatefun") org.lwjgl.glfw.GLFWReallocateCallbackI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWAllocator.nreallocate(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.glfw.GLFWAllocator.Buffer deallocate(@org.lwjgl.system.NativeType("GLFWdeallocatefun") org.lwjgl.glfw.GLFWDeallocateCallbackI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWAllocator.ndeallocate(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.glfw.GLFWAllocator.Buffer user(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.glfw.GLFWAllocator.nuser(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.glfw.GLFWAllocator r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.glfw.GLFWAllocator$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.glfw.GLFWAllocator r0 = org.lwjgl.glfw.GLFWAllocator.create(r0)
                org.lwjgl.glfw.GLFWAllocator.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLFWAllocator(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.glfw.GLFWAllocator create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLFWAllocator(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("GLFWallocatefun")
    public org.lwjgl.glfw.GLFWAllocateCallback allocate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWAllocateCallback r0 = nallocate(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLFWreallocatefun")
    public org.lwjgl.glfw.GLFWReallocateCallback reallocate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWReallocateCallback r0 = nreallocate(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLFWdeallocatefun")
    public org.lwjgl.glfw.GLFWDeallocateCallback deallocate() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWDeallocateCallback r0 = ndeallocate(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long user() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser(r0)
            return r0
    }

    public org.lwjgl.glfw.GLFWAllocator allocate(@org.lwjgl.system.NativeType("GLFWallocatefun") org.lwjgl.glfw.GLFWAllocateCallbackI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nallocate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWAllocator reallocate(@org.lwjgl.system.NativeType("GLFWreallocatefun") org.lwjgl.glfw.GLFWReallocateCallbackI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreallocate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWAllocator deallocate(@org.lwjgl.system.NativeType("GLFWdeallocatefun") org.lwjgl.glfw.GLFWDeallocateCallbackI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndeallocate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWAllocator user(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nuser(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.glfw.GLFWAllocator set(org.lwjgl.glfw.GLFWAllocateCallbackI r5, org.lwjgl.glfw.GLFWReallocateCallbackI r6, org.lwjgl.glfw.GLFWDeallocateCallbackI r7, long r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.glfw.GLFWAllocator r0 = r0.allocate(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.glfw.GLFWAllocator r0 = r0.reallocate(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.glfw.GLFWAllocator r0 = r0.deallocate(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.glfw.GLFWAllocator r0 = r0.user(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWAllocator set(org.lwjgl.glfw.GLFWAllocator r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator malloc() {
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            int r2 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator calloc() {
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator create() {
            int r0 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator create(long r6) {
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWAllocator createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator.Buffer malloc(int r6) {
            org.lwjgl.glfw.GLFWAllocator$Buffer r0 = new org.lwjgl.glfw.GLFWAllocator$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator.Buffer calloc(int r7) {
            org.lwjgl.glfw.GLFWAllocator$Buffer r0 = new org.lwjgl.glfw.GLFWAllocator$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.glfw.GLFWAllocator$Buffer r0 = new org.lwjgl.glfw.GLFWAllocator$Buffer
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

    public static org.lwjgl.glfw.GLFWAllocator.Buffer create(long r6, int r8) {
            org.lwjgl.glfw.GLFWAllocator$Buffer r0 = new org.lwjgl.glfw.GLFWAllocator$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWAllocator.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.glfw.GLFWAllocator$Buffer r0 = new org.lwjgl.glfw.GLFWAllocator$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.glfw.GLFWAllocator.ALIGNOF
            int r4 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.glfw.GLFWAllocator r0 = new org.lwjgl.glfw.GLFWAllocator
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWAllocator.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.glfw.GLFWAllocator$Buffer r0 = new org.lwjgl.glfw.GLFWAllocator$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.glfw.GLFWAllocator.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocator.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.glfw.GLFWAllocator$Buffer r0 = new org.lwjgl.glfw.GLFWAllocator$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.glfw.GLFWAllocator.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.glfw.GLFWAllocator.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWAllocateCallback nallocate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.ALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.glfw.GLFWAllocateCallback r0 = org.lwjgl.glfw.GLFWAllocateCallback.create(r0)
            return r0
    }

    public static org.lwjgl.glfw.GLFWReallocateCallback nreallocate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.REALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.glfw.GLFWReallocateCallback r0 = org.lwjgl.glfw.GLFWReallocateCallback.create(r0)
            return r0
    }

    public static org.lwjgl.glfw.GLFWDeallocateCallback ndeallocate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.DEALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.glfw.GLFWDeallocateCallback r0 = org.lwjgl.glfw.GLFWDeallocateCallback.create(r0)
            return r0
    }

    public static long nuser(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.USER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nallocate(long r5, org.lwjgl.glfw.GLFWAllocateCallbackI r7) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.ALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nreallocate(long r5, org.lwjgl.glfw.GLFWReallocateCallbackI r7) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.REALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndeallocate(long r5, org.lwjgl.glfw.GLFWDeallocateCallbackI r7) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.DEALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nuser(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.USER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.ALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.REALLOCATE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWAllocator.DEALLOCATE
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
            org.lwjgl.glfw.GLFWAllocator r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.glfw.GLFWAllocator.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.glfw.GLFWAllocator.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.glfw.GLFWAllocator.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.glfw.GLFWAllocator.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.glfw.GLFWAllocator.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.glfw.GLFWAllocator.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWAllocator.ALLOCATE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWAllocator.REALLOCATE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWAllocator.DEALLOCATE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWAllocator.USER = r0
            return
    }
}
