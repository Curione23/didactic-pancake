package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WINDOWPLACEMENT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WINDOWPLACEMENT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WINDOWPLACEMENT.class */
public class WINDOWPLACEMENT extends org.lwjgl.system.Struct<org.lwjgl.system.windows.WINDOWPLACEMENT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int LENGTH = 0;
    public static final int FLAGS = 0;
    public static final int SHOWCMD = 0;
    public static final int PTMINPOSITION = 0;
    public static final int PTMAXPOSITION = 0;
    public static final int RCNORMALPOSITION = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WINDOWPLACEMENT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WINDOWPLACEMENT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WINDOWPLACEMENT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.WINDOWPLACEMENT, org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.WINDOWPLACEMENT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
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
        protected org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.WINDOWPLACEMENT getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.WINDOWPLACEMENT r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("UINT")
        public int length() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.nlength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("UINT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("UINT")
        public int showCmd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.nshowCmd(r0)
                return r0
        }

        public org.lwjgl.system.windows.POINT ptMinPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.POINT r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.nptMinPosition(r0)
                return r0
        }

        public org.lwjgl.system.windows.POINT ptMaxPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.POINT r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.nptMaxPosition(r0)
                return r0
        }

        public org.lwjgl.system.windows.RECT rcNormalPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.RECT r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.nrcNormalPosition(r0)
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer length(@org.lwjgl.system.NativeType("UINT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WINDOWPLACEMENT.nlength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer flags(@org.lwjgl.system.NativeType("UINT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WINDOWPLACEMENT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer showCmd(@org.lwjgl.system.NativeType("UINT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WINDOWPLACEMENT.nshowCmd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer ptMinPosition(org.lwjgl.system.windows.POINT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WINDOWPLACEMENT.nptMinPosition(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer ptMinPosition(java.util.function.Consumer<org.lwjgl.system.windows.POINT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.windows.POINT r1 = r1.ptMinPosition()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer ptMaxPosition(org.lwjgl.system.windows.POINT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WINDOWPLACEMENT.nptMaxPosition(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer ptMaxPosition(java.util.function.Consumer<org.lwjgl.system.windows.POINT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.windows.POINT r1 = r1.ptMaxPosition()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer rcNormalPosition(org.lwjgl.system.windows.RECT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WINDOWPLACEMENT.nrcNormalPosition(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer rcNormalPosition(java.util.function.Consumer<org.lwjgl.system.windows.RECT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.windows.RECT r1 = r1.rcNormalPosition()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.WINDOWPLACEMENT r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.create(r0)
                org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected WINDOWPLACEMENT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.WINDOWPLACEMENT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public WINDOWPLACEMENT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public int length() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public int showCmd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshowCmd(r0)
            return r0
    }

    public org.lwjgl.system.windows.POINT ptMinPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.POINT r0 = nptMinPosition(r0)
            return r0
    }

    public org.lwjgl.system.windows.POINT ptMaxPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.POINT r0 = nptMaxPosition(r0)
            return r0
    }

    public org.lwjgl.system.windows.RECT rcNormalPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.RECT r0 = nrcNormalPosition(r0)
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT length(@org.lwjgl.system.NativeType("UINT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT flags(@org.lwjgl.system.NativeType("UINT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT showCmd(@org.lwjgl.system.NativeType("UINT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshowCmd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT ptMinPosition(org.lwjgl.system.windows.POINT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nptMinPosition(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT ptMinPosition(java.util.function.Consumer<org.lwjgl.system.windows.POINT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.windows.POINT r1 = r1.ptMinPosition()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT ptMaxPosition(org.lwjgl.system.windows.POINT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nptMaxPosition(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT ptMaxPosition(java.util.function.Consumer<org.lwjgl.system.windows.POINT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.windows.POINT r1 = r1.ptMaxPosition()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT rcNormalPosition(org.lwjgl.system.windows.RECT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrcNormalPosition(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT rcNormalPosition(java.util.function.Consumer<org.lwjgl.system.windows.RECT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.windows.RECT r1 = r1.rcNormalPosition()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT set(int r4, int r5, int r6, org.lwjgl.system.windows.POINT r7, org.lwjgl.system.windows.POINT r8, org.lwjgl.system.windows.RECT r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.length(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.flags(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.showCmd(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.ptMinPosition(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.ptMaxPosition(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.rcNormalPosition(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.WINDOWPLACEMENT set(org.lwjgl.system.windows.WINDOWPLACEMENT r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT malloc() {
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            int r2 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT calloc() {
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT create() {
            int r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT create(long r6) {
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.WINDOWPLACEMENT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer malloc(int r6) {
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer calloc(int r7) {
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer
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

    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.ALIGNOF
            int r4 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WINDOWPLACEMENT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer r0 = new org.lwjgl.system.windows.WINDOWPLACEMENT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nlength(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.LENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshowCmd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.SHOWCMD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.windows.POINT nptMinPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WINDOWPLACEMENT.PTMINPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.POINT r0 = org.lwjgl.system.windows.POINT.create(r0)
            return r0
    }

    public static org.lwjgl.system.windows.POINT nptMaxPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WINDOWPLACEMENT.PTMAXPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.POINT r0 = org.lwjgl.system.windows.POINT.create(r0)
            return r0
    }

    public static org.lwjgl.system.windows.RECT nrcNormalPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WINDOWPLACEMENT.RCNORMALPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.RECT r0 = org.lwjgl.system.windows.RECT.create(r0)
            return r0
    }

    public static void nlength(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.LENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshowCmd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WINDOWPLACEMENT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WINDOWPLACEMENT.SHOWCMD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nptMinPosition(long r7, org.lwjgl.system.windows.POINT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.windows.WINDOWPLACEMENT.PTMINPOSITION
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.windows.POINT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nptMaxPosition(long r7, org.lwjgl.system.windows.POINT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.windows.WINDOWPLACEMENT.PTMAXPOSITION
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.windows.POINT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nrcNormalPosition(long r7, org.lwjgl.system.windows.RECT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.windows.WINDOWPLACEMENT.RCNORMALPOSITION
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.windows.RECT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.WINDOWPLACEMENT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.windows.POINT.SIZEOF
            int r4 = org.lwjgl.system.windows.POINT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.windows.POINT.SIZEOF
            int r4 = org.lwjgl.system.windows.POINT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.windows.RECT.SIZEOF
            int r4 = org.lwjgl.system.windows.RECT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.windows.WINDOWPLACEMENT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.WINDOWPLACEMENT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WINDOWPLACEMENT.LENGTH = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WINDOWPLACEMENT.FLAGS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WINDOWPLACEMENT.SHOWCMD = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WINDOWPLACEMENT.PTMINPOSITION = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WINDOWPLACEMENT.PTMAXPOSITION = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WINDOWPLACEMENT.RCNORMALPOSITION = r0
            return
    }
}
