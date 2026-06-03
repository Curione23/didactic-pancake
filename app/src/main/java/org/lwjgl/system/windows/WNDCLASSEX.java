package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WNDCLASSEX.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WNDCLASSEX.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WNDCLASSEX.class */
public class WNDCLASSEX extends org.lwjgl.system.Struct<org.lwjgl.system.windows.WNDCLASSEX> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CBSIZE = 0;
    public static final int STYLE = 0;
    public static final int LPFNWNDPROC = 0;
    public static final int CBCLSEXTRA = 0;
    public static final int CBWNDEXTRA = 0;
    public static final int HINSTANCE = 0;
    public static final int HICON = 0;
    public static final int HCURSOR = 0;
    public static final int HBRBACKGROUND = 0;
    public static final int LPSZMENUNAME = 0;
    public static final int LPSZCLASSNAME = 0;
    public static final int HICONSM = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WNDCLASSEX$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WNDCLASSEX$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WNDCLASSEX$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.WNDCLASSEX, org.lwjgl.system.windows.WNDCLASSEX.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.WNDCLASSEX ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
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
        protected org.lwjgl.system.windows.WNDCLASSEX.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.WNDCLASSEX getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.WNDCLASSEX r0 = org.lwjgl.system.windows.WNDCLASSEX.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("UINT")
        public int cbSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.WNDCLASSEX.ncbSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("UINT")
        public int style() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.WNDCLASSEX.nstyle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("WNDPROC")
        public org.lwjgl.system.windows.WindowProc lpfnWndProc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.WindowProc r0 = org.lwjgl.system.windows.WNDCLASSEX.nlpfnWndProc(r0)
                return r0
        }

        public int cbClsExtra() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.WNDCLASSEX.ncbClsExtra(r0)
                return r0
        }

        public int cbWndExtra() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.WNDCLASSEX.ncbWndExtra(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("HINSTANCE")
        public long hInstance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.WNDCLASSEX.nhInstance(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("HICON")
        public long hIcon() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.WNDCLASSEX.nhIcon(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("HCURSOR")
        public long hCursor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.WNDCLASSEX.nhCursor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("HBRUSH")
        public long hbrBackground() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.WNDCLASSEX.nhbrBackground(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("LPCTSTR")
        public java.nio.ByteBuffer lpszMenuName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.windows.WNDCLASSEX.nlpszMenuName(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("LPCTSTR")
        public java.lang.String lpszMenuNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.system.windows.WNDCLASSEX.nlpszMenuNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("LPCTSTR")
        public java.nio.ByteBuffer lpszClassName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.windows.WNDCLASSEX.nlpszClassName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("LPCTSTR")
        public java.lang.String lpszClassNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.system.windows.WNDCLASSEX.nlpszClassNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("HICON")
        public long hIconSm() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.WNDCLASSEX.nhIconSm(r0)
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer cbSize(@org.lwjgl.system.NativeType("UINT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WNDCLASSEX.ncbSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer style(@org.lwjgl.system.NativeType("UINT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WNDCLASSEX.nstyle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer lpfnWndProc(@org.lwjgl.system.NativeType("WNDPROC") org.lwjgl.system.windows.WindowProcI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WNDCLASSEX.nlpfnWndProc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer cbClsExtra(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WNDCLASSEX.ncbClsExtra(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer cbWndExtra(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WNDCLASSEX.ncbWndExtra(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer hInstance(@org.lwjgl.system.NativeType("HINSTANCE") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.WNDCLASSEX.nhInstance(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer hIcon(@org.lwjgl.system.NativeType("HICON") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.WNDCLASSEX.nhIcon(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer hCursor(@org.lwjgl.system.NativeType("HCURSOR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.WNDCLASSEX.nhCursor(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer hbrBackground(@org.lwjgl.system.NativeType("HBRUSH") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.WNDCLASSEX.nhbrBackground(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer lpszMenuName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WNDCLASSEX.nlpszMenuName(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer lpszClassName(@org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.windows.WNDCLASSEX.nlpszClassName(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.windows.WNDCLASSEX.Buffer hIconSm(@org.lwjgl.system.NativeType("HICON") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.windows.WNDCLASSEX.nhIconSm(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.WNDCLASSEX r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.WNDCLASSEX r0 = org.lwjgl.system.windows.WNDCLASSEX.create(r0)
                org.lwjgl.system.windows.WNDCLASSEX.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected WNDCLASSEX(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.WNDCLASSEX create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public WNDCLASSEX(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public int cbSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncbSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public int style() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstyle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("WNDPROC")
    public org.lwjgl.system.windows.WindowProc lpfnWndProc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.WindowProc r0 = nlpfnWndProc(r0)
            return r0
    }

    public int cbClsExtra() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncbClsExtra(r0)
            return r0
    }

    public int cbWndExtra() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncbWndExtra(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HINSTANCE")
    public long hInstance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhInstance(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HICON")
    public long hIcon() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhIcon(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HCURSOR")
    public long hCursor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhCursor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HBRUSH")
    public long hbrBackground() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhbrBackground(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("LPCTSTR")
    public java.nio.ByteBuffer lpszMenuName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nlpszMenuName(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("LPCTSTR")
    public java.lang.String lpszMenuNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nlpszMenuNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LPCTSTR")
    public java.nio.ByteBuffer lpszClassName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nlpszClassName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LPCTSTR")
    public java.lang.String lpszClassNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nlpszClassNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HICON")
    public long hIconSm() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhIconSm(r0)
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX cbSize(@org.lwjgl.system.NativeType("UINT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncbSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX style(@org.lwjgl.system.NativeType("UINT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstyle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX lpfnWndProc(@org.lwjgl.system.NativeType("WNDPROC") org.lwjgl.system.windows.WindowProcI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlpfnWndProc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX cbClsExtra(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncbClsExtra(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX cbWndExtra(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncbWndExtra(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX hInstance(@org.lwjgl.system.NativeType("HINSTANCE") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhInstance(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX hIcon(@org.lwjgl.system.NativeType("HICON") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhIcon(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX hCursor(@org.lwjgl.system.NativeType("HCURSOR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhCursor(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX hbrBackground(@org.lwjgl.system.NativeType("HBRUSH") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhbrBackground(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX lpszMenuName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlpszMenuName(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX lpszClassName(@org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlpszClassName(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX hIconSm(@org.lwjgl.system.NativeType("HICON") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhIconSm(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX set(int r5, int r6, org.lwjgl.system.windows.WindowProcI r7, int r8, int r9, long r10, long r12, long r14, long r16, @javax.annotation.Nullable java.nio.ByteBuffer r18, java.nio.ByteBuffer r19, long r20) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.cbSize(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.style(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.lpfnWndProc(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.cbClsExtra(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.cbWndExtra(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.hInstance(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.hIcon(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.hCursor(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.hbrBackground(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.lpszMenuName(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.lpszClassName(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.hIconSm(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.WNDCLASSEX set(org.lwjgl.system.windows.WNDCLASSEX r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX malloc() {
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            int r2 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX calloc() {
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX create() {
            int r0 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX create(long r6) {
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.WNDCLASSEX createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer malloc(int r6) {
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = new org.lwjgl.system.windows.WNDCLASSEX$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer calloc(int r7) {
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = new org.lwjgl.system.windows.WNDCLASSEX$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = new org.lwjgl.system.windows.WNDCLASSEX$Buffer
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

    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = new org.lwjgl.system.windows.WNDCLASSEX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = new org.lwjgl.system.windows.WNDCLASSEX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WNDCLASSEX r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WNDCLASSEX r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.WNDCLASSEX r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.WNDCLASSEX r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.ALIGNOF
            int r4 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.WNDCLASSEX r0 = new org.lwjgl.system.windows.WNDCLASSEX
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = new org.lwjgl.system.windows.WNDCLASSEX$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.WNDCLASSEX.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.WNDCLASSEX$Buffer r0 = new org.lwjgl.system.windows.WNDCLASSEX$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ncbSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.CBSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstyle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.STYLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.windows.WindowProc nlpfnWndProc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPFNWNDPROC
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.windows.WindowProc r0 = org.lwjgl.system.windows.WindowProc.create(r0)
            return r0
    }

    public static int ncbClsExtra(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.CBCLSEXTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncbWndExtra(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.CBWNDEXTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nhInstance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HINSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nhIcon(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HICON
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nhCursor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HCURSOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nhbrBackground(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HBRBACKGROUND
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nlpszMenuName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPSZMENUNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT2Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String nlpszMenuNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPSZMENUNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16Safe(r0)
            return r0
    }

    public static java.nio.ByteBuffer nlpszClassName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPSZCLASSNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT2(r0)
            return r0
    }

    public static java.lang.String nlpszClassNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPSZCLASSNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    public static long nhIconSm(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HICONSM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void ncbSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.CBSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstyle(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.STYLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlpfnWndProc(long r5, org.lwjgl.system.windows.WindowProcI r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPFNWNDPROC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncbClsExtra(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.CBCLSEXTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncbWndExtra(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.WNDCLASSEX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.CBWNDEXTRA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nhInstance(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HINSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nhIcon(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HICON
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nhCursor(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HCURSOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nhbrBackground(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HBRBACKGROUND
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlpszMenuName(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPSZMENUNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlpszClassName(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPSZCLASSNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nhIconSm(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.HICONSM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPFNWNDPROC
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPSZCLASSNAME
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
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
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
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.system.windows.WNDCLASSEX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.windows.WNDCLASSEX.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.WNDCLASSEX.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.CBSIZE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.STYLE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.LPFNWNDPROC = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.CBCLSEXTRA = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.CBWNDEXTRA = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.HINSTANCE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.HICON = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.HCURSOR = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.HBRBACKGROUND = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.LPSZMENUNAME = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.LPSZCLASSNAME = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.WNDCLASSEX.HICONSM = r0
            return
    }
}
