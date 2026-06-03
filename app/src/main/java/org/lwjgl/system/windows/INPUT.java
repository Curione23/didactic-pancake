package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/INPUT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/INPUT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/INPUT.class */
public class INPUT extends org.lwjgl.system.Struct<org.lwjgl.system.windows.INPUT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int DUMMYUNIONNAME = 0;
    public static final int DUMMYUNIONNAME_MI = 0;
    public static final int DUMMYUNIONNAME_KI = 0;
    public static final int DUMMYUNIONNAME_HI = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/INPUT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/INPUT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/INPUT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.INPUT, org.lwjgl.system.windows.INPUT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.INPUT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.INPUT.SIZEOF
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
        protected org.lwjgl.system.windows.INPUT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.INPUT getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.INPUT r0 = org.lwjgl.system.windows.INPUT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.INPUT.ntype(r0)
                return r0
        }

        public org.lwjgl.system.windows.MOUSEINPUT DUMMYUNIONNAME_mi() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.MOUSEINPUT r0 = org.lwjgl.system.windows.INPUT.nDUMMYUNIONNAME_mi(r0)
                return r0
        }

        public org.lwjgl.system.windows.KEYBDINPUT DUMMYUNIONNAME_ki() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.KEYBDINPUT r0 = org.lwjgl.system.windows.INPUT.nDUMMYUNIONNAME_ki(r0)
                return r0
        }

        public org.lwjgl.system.windows.HARDWAREINPUT DUMMYUNIONNAME_hi() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.HARDWAREINPUT r0 = org.lwjgl.system.windows.INPUT.nDUMMYUNIONNAME_hi(r0)
                return r0
        }

        public org.lwjgl.system.windows.INPUT.Buffer type(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.INPUT.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.INPUT.Buffer DUMMYUNIONNAME_mi(org.lwjgl.system.windows.MOUSEINPUT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.INPUT.nDUMMYUNIONNAME_mi(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.INPUT.Buffer DUMMYUNIONNAME_mi(java.util.function.Consumer<org.lwjgl.system.windows.MOUSEINPUT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.windows.MOUSEINPUT r1 = r1.DUMMYUNIONNAME_mi()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.windows.INPUT.Buffer DUMMYUNIONNAME_ki(org.lwjgl.system.windows.KEYBDINPUT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.INPUT.nDUMMYUNIONNAME_ki(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.INPUT.Buffer DUMMYUNIONNAME_ki(java.util.function.Consumer<org.lwjgl.system.windows.KEYBDINPUT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.windows.KEYBDINPUT r1 = r1.DUMMYUNIONNAME_ki()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.windows.INPUT.Buffer DUMMYUNIONNAME_hi(org.lwjgl.system.windows.HARDWAREINPUT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.INPUT.nDUMMYUNIONNAME_hi(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.INPUT.Buffer DUMMYUNIONNAME_hi(java.util.function.Consumer<org.lwjgl.system.windows.HARDWAREINPUT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.windows.HARDWAREINPUT r1 = r1.DUMMYUNIONNAME_hi()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.INPUT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.INPUT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.INPUT r0 = org.lwjgl.system.windows.INPUT.create(r0)
                org.lwjgl.system.windows.INPUT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected INPUT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.INPUT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public INPUT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.INPUT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.INPUT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    public org.lwjgl.system.windows.MOUSEINPUT DUMMYUNIONNAME_mi() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.MOUSEINPUT r0 = nDUMMYUNIONNAME_mi(r0)
            return r0
    }

    public org.lwjgl.system.windows.KEYBDINPUT DUMMYUNIONNAME_ki() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.KEYBDINPUT r0 = nDUMMYUNIONNAME_ki(r0)
            return r0
    }

    public org.lwjgl.system.windows.HARDWAREINPUT DUMMYUNIONNAME_hi() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.HARDWAREINPUT r0 = nDUMMYUNIONNAME_hi(r0)
            return r0
    }

    public org.lwjgl.system.windows.INPUT type(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.INPUT DUMMYUNIONNAME_mi(org.lwjgl.system.windows.MOUSEINPUT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nDUMMYUNIONNAME_mi(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.INPUT DUMMYUNIONNAME_mi(java.util.function.Consumer<org.lwjgl.system.windows.MOUSEINPUT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.windows.MOUSEINPUT r1 = r1.DUMMYUNIONNAME_mi()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.INPUT DUMMYUNIONNAME_ki(org.lwjgl.system.windows.KEYBDINPUT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nDUMMYUNIONNAME_ki(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.INPUT DUMMYUNIONNAME_ki(java.util.function.Consumer<org.lwjgl.system.windows.KEYBDINPUT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.windows.KEYBDINPUT r1 = r1.DUMMYUNIONNAME_ki()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.INPUT DUMMYUNIONNAME_hi(org.lwjgl.system.windows.HARDWAREINPUT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nDUMMYUNIONNAME_hi(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.INPUT DUMMYUNIONNAME_hi(java.util.function.Consumer<org.lwjgl.system.windows.HARDWAREINPUT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.windows.HARDWAREINPUT r1 = r1.DUMMYUNIONNAME_hi()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.INPUT set(org.lwjgl.system.windows.INPUT r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.INPUT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.INPUT malloc() {
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            int r2 = org.lwjgl.system.windows.INPUT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT calloc() {
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.INPUT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT create() {
            int r0 = org.lwjgl.system.windows.INPUT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT create(long r6) {
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.INPUT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.INPUT.Buffer malloc(int r6) {
            org.lwjgl.system.windows.INPUT$Buffer r0 = new org.lwjgl.system.windows.INPUT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.INPUT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT.Buffer calloc(int r7) {
            org.lwjgl.system.windows.INPUT$Buffer r0 = new org.lwjgl.system.windows.INPUT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.INPUT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.INPUT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.INPUT$Buffer r0 = new org.lwjgl.system.windows.INPUT$Buffer
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

    public static org.lwjgl.system.windows.INPUT.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.INPUT$Buffer r0 = new org.lwjgl.system.windows.INPUT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.INPUT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.INPUT$Buffer r0 = new org.lwjgl.system.windows.INPUT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.INPUT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.INPUT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.INPUT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.INPUT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.INPUT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.INPUT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.INPUT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.INPUT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.INPUT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.INPUT.ALIGNOF
            int r4 = org.lwjgl.system.windows.INPUT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.INPUT r0 = new org.lwjgl.system.windows.INPUT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.INPUT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.INPUT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.INPUT$Buffer r0 = new org.lwjgl.system.windows.INPUT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.INPUT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.INPUT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.INPUT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.INPUT$Buffer r0 = new org.lwjgl.system.windows.INPUT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.INPUT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.INPUT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.INPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.INPUT.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.windows.MOUSEINPUT nDUMMYUNIONNAME_mi(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_MI
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.MOUSEINPUT r0 = org.lwjgl.system.windows.MOUSEINPUT.create(r0)
            return r0
    }

    public static org.lwjgl.system.windows.KEYBDINPUT nDUMMYUNIONNAME_ki(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_KI
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.KEYBDINPUT r0 = org.lwjgl.system.windows.KEYBDINPUT.create(r0)
            return r0
    }

    public static org.lwjgl.system.windows.HARDWAREINPUT nDUMMYUNIONNAME_hi(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_HI
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.HARDWAREINPUT r0 = org.lwjgl.system.windows.HARDWAREINPUT.create(r0)
            return r0
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.INPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.INPUT.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nDUMMYUNIONNAME_mi(long r7, org.lwjgl.system.windows.MOUSEINPUT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_MI
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.windows.MOUSEINPUT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nDUMMYUNIONNAME_ki(long r7, org.lwjgl.system.windows.KEYBDINPUT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_KI
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.windows.KEYBDINPUT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nDUMMYUNIONNAME_hi(long r7, org.lwjgl.system.windows.HARDWAREINPUT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_HI
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.windows.HARDWAREINPUT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.INPUT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 3
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            int r6 = org.lwjgl.system.windows.MOUSEINPUT.SIZEOF
            int r7 = org.lwjgl.system.windows.MOUSEINPUT.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            int r6 = org.lwjgl.system.windows.KEYBDINPUT.SIZEOF
            int r7 = org.lwjgl.system.windows.KEYBDINPUT.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            int r6 = org.lwjgl.system.windows.HARDWAREINPUT.SIZEOF
            int r7 = org.lwjgl.system.windows.HARDWAREINPUT.ALIGNOF
            org.lwjgl.system.Struct$Member r6 = __member(r6, r7)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r9 = r0
            r0 = r9
            int r0 = r0.getSize()
            org.lwjgl.system.windows.INPUT.SIZEOF = r0
            r0 = r9
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.INPUT.ALIGNOF = r0
            r0 = r9
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.INPUT.TYPE = r0
            r0 = r9
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME = r0
            r0 = r9
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_MI = r0
            r0 = r9
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_KI = r0
            r0 = r9
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.INPUT.DUMMYUNIONNAME_HI = r0
            return
    }
}
