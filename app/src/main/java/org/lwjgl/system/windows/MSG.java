package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/MSG.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/MSG.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/MSG.class */
public class MSG extends org.lwjgl.system.Struct<org.lwjgl.system.windows.MSG> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int HWND = 0;
    public static final int MESSAGE = 0;
    public static final int WPARAM = 0;
    public static final int LPARAM = 0;
    public static final int TIME = 0;
    public static final int PT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/MSG$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/MSG$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/MSG$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.MSG, org.lwjgl.system.windows.MSG.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.MSG ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.MSG.SIZEOF
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
        protected org.lwjgl.system.windows.MSG.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.MSG getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.MSG r0 = org.lwjgl.system.windows.MSG.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("HWND")
        public long hwnd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.MSG.nhwnd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("UINT")
        public int message() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.MSG.nmessage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WPARAM")
        public long wParam() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.MSG.nwParam(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("LPARAM")
        public long lParam() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.MSG.nlParam(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int time() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.MSG.ntime(r0)
                return r0
        }

        public org.lwjgl.system.windows.POINT pt() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.POINT r0 = org.lwjgl.system.windows.MSG.npt(r0)
                return r0
        }

        public org.lwjgl.system.windows.MSG.Buffer hwnd(@org.lwjgl.system.NativeType("HWND") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.MSG.nhwnd(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.MSG.Buffer message(@org.lwjgl.system.NativeType("UINT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.MSG.nmessage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.MSG.Buffer wParam(@org.lwjgl.system.NativeType("WPARAM") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.MSG.nwParam(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.MSG.Buffer lParam(@org.lwjgl.system.NativeType("LPARAM") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.MSG.nlParam(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.MSG.Buffer time(@org.lwjgl.system.NativeType("DWORD") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.MSG.ntime(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.MSG.Buffer pt(org.lwjgl.system.windows.POINT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.MSG.npt(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.MSG.Buffer pt(java.util.function.Consumer<org.lwjgl.system.windows.POINT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.windows.POINT r1 = r1.pt()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.MSG r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.MSG$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.MSG r0 = org.lwjgl.system.windows.MSG.create(r0)
                org.lwjgl.system.windows.MSG.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected MSG(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.MSG create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public MSG(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.MSG.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.MSG.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("HWND")
    public long hwnd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhwnd(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public int message() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmessage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WPARAM")
    public long wParam() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nwParam(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LPARAM")
    public long lParam() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlParam(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int time() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntime(r0)
            return r0
    }

    public org.lwjgl.system.windows.POINT pt() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.POINT r0 = npt(r0)
            return r0
    }

    public org.lwjgl.system.windows.MSG hwnd(@org.lwjgl.system.NativeType("HWND") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhwnd(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.MSG message(@org.lwjgl.system.NativeType("UINT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmessage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.MSG wParam(@org.lwjgl.system.NativeType("WPARAM") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nwParam(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.MSG lParam(@org.lwjgl.system.NativeType("LPARAM") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlParam(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.MSG time(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntime(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.MSG pt(org.lwjgl.system.windows.POINT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npt(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.MSG pt(java.util.function.Consumer<org.lwjgl.system.windows.POINT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.windows.POINT r1 = r1.pt()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.windows.MSG set(long r5, int r7, long r8, long r10, int r12, org.lwjgl.system.windows.POINT r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.windows.MSG r0 = r0.hwnd(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.windows.MSG r0 = r0.message(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.windows.MSG r0 = r0.wParam(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.windows.MSG r0 = r0.lParam(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.system.windows.MSG r0 = r0.time(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.windows.MSG r0 = r0.pt(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.MSG set(org.lwjgl.system.windows.MSG r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.MSG.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.MSG malloc() {
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            int r2 = org.lwjgl.system.windows.MSG.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG calloc() {
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.MSG.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG create() {
            int r0 = org.lwjgl.system.windows.MSG.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG create(long r6) {
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.MSG createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.MSG.Buffer malloc(int r6) {
            org.lwjgl.system.windows.MSG$Buffer r0 = new org.lwjgl.system.windows.MSG$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.MSG.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG.Buffer calloc(int r7) {
            org.lwjgl.system.windows.MSG$Buffer r0 = new org.lwjgl.system.windows.MSG$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.MSG.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.MSG.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.MSG$Buffer r0 = new org.lwjgl.system.windows.MSG$Buffer
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

    public static org.lwjgl.system.windows.MSG.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.MSG$Buffer r0 = new org.lwjgl.system.windows.MSG$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.MSG.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.MSG$Buffer r0 = new org.lwjgl.system.windows.MSG$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.MSG r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.MSG r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.MSG r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.MSG r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.MSG$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.MSG$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.MSG$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.MSG.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.MSG$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.MSG malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.MSG.ALIGNOF
            int r4 = org.lwjgl.system.windows.MSG.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.MSG r0 = new org.lwjgl.system.windows.MSG
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.MSG.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.MSG.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.MSG$Buffer r0 = new org.lwjgl.system.windows.MSG$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.MSG.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.MSG.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.MSG.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.MSG$Buffer r0 = new org.lwjgl.system.windows.MSG$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.MSG.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.MSG.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nhwnd(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.MSG.HWND
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmessage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.MSG.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.MSG.MESSAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nwParam(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.MSG.WPARAM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nlParam(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.MSG.LPARAM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ntime(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.MSG.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.MSG.TIME
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.windows.POINT npt(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.MSG.PT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.POINT r0 = org.lwjgl.system.windows.POINT.create(r0)
            return r0
    }

    public static void nhwnd(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.MSG.HWND
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmessage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.MSG.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.MSG.MESSAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nwParam(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.MSG.WPARAM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlParam(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.MSG.LPARAM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntime(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.MSG.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.MSG.TIME
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npt(long r7, org.lwjgl.system.windows.POINT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.windows.MSG.PT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.windows.POINT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.MSG r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.windows.MSG.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.windows.MSG.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.windows.MSG.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.windows.POINT.SIZEOF
            int r4 = org.lwjgl.system.windows.POINT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.windows.MSG.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.MSG.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.MSG.HWND = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.MSG.MESSAGE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.MSG.WPARAM = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.MSG.LPARAM = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.MSG.TIME = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.MSG.PT = r0
            return
    }
}
