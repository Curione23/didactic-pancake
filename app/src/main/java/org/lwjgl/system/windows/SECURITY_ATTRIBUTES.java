package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES.class */
public class SECURITY_ATTRIBUTES extends org.lwjgl.system.Struct<org.lwjgl.system.windows.SECURITY_ATTRIBUTES> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NLENGTH = 0;
    public static final int LPSECURITYDESCRIPTOR = 0;
    public static final int BINHERITHANDLE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/SECURITY_ATTRIBUTES$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.SECURITY_ATTRIBUTES, org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.SECURITY_ATTRIBUTES ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
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
        protected org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.SECURITY_ATTRIBUTES getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int nLength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.nnLength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("LPVOID")
        public long lpSecurityDescriptor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.nlpSecurityDescriptor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("BOOL")
        public boolean bInheritHandle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.nbInheritHandle(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer nLength(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES.nnLength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer lpSecurityDescriptor(@org.lwjgl.system.NativeType("LPVOID") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES.nlpSecurityDescriptor(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer bInheritHandle(@org.lwjgl.system.NativeType("BOOL") boolean r5) {
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
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES.nbInheritHandle(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.create(r0)
                org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SECURITY_ATTRIBUTES(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.SECURITY_ATTRIBUTES create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SECURITY_ATTRIBUTES(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int nLength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnLength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LPVOID")
    public long lpSecurityDescriptor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlpSecurityDescriptor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public boolean bInheritHandle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbInheritHandle(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.system.windows.SECURITY_ATTRIBUTES nLength(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnLength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.SECURITY_ATTRIBUTES lpSecurityDescriptor(@org.lwjgl.system.NativeType("LPVOID") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlpSecurityDescriptor(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.SECURITY_ATTRIBUTES bInheritHandle(@org.lwjgl.system.NativeType("BOOL") boolean r5) {
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
            nbInheritHandle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.SECURITY_ATTRIBUTES set(int r5, long r6, boolean r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = r0.nLength(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = r0.lpSecurityDescriptor(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = r0.bInheritHandle(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.SECURITY_ATTRIBUTES set(org.lwjgl.system.windows.SECURITY_ATTRIBUTES r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES malloc() {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            int r2 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES calloc() {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES create() {
            int r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES create(long r6) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer malloc(int r6) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer calloc(int r7) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer
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

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.ALIGNOF
            int r4 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.SECURITY_ATTRIBUTES.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer r0 = new org.lwjgl.system.windows.SECURITY_ATTRIBUTES$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nnLength(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.NLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nlpSecurityDescriptor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.LPSECURITYDESCRIPTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nbInheritHandle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.BINHERITHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nnLength(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.NLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlpSecurityDescriptor(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.LPSECURITYDESCRIPTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nbInheritHandle(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.BINHERITHANDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.LPSECURITYDESCRIPTOR
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
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.system.windows.SECURITY_ATTRIBUTES.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES.NLENGTH = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES.LPSECURITYDESCRIPTOR = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.SECURITY_ATTRIBUTES.BINHERITHANDLE = r0
            return
    }
}
