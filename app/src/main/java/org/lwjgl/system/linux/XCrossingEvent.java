package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XCrossingEvent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XCrossingEvent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XCrossingEvent.class */
public class XCrossingEvent extends org.lwjgl.system.Struct<org.lwjgl.system.linux.XCrossingEvent> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int SERIAL = 0;
    public static final int SEND_EVENT = 0;
    public static final int DISPLAY = 0;
    public static final int WINDOW = 0;
    public static final int ROOT = 0;
    public static final int SUBWINDOW = 0;
    public static final int TIME = 0;
    public static final int X = 0;
    public static final int Y = 0;
    public static final int X_ROOT = 0;
    public static final int Y_ROOT = 0;
    public static final int MODE = 0;
    public static final int DETAIL = 0;
    public static final int SAME_SCREEN = 0;
    public static final int FOCUS = 0;
    public static final int STATE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XCrossingEvent$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XCrossingEvent$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XCrossingEvent$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.XCrossingEvent, org.lwjgl.system.linux.XCrossingEvent.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.XCrossingEvent ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
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
        protected org.lwjgl.system.linux.XCrossingEvent.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.XCrossingEvent getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.XCrossingEvent r0 = org.lwjgl.system.linux.XCrossingEvent.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long serial() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XCrossingEvent.nserial(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean send_event() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.nsend_event(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("Display *")
        public long display() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XCrossingEvent.ndisplay(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Window")
        public long window() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XCrossingEvent.nwindow(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Window")
        public long root() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XCrossingEvent.nroot(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Window")
        public long subwindow() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XCrossingEvent.nsubwindow(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Time")
        public long time() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XCrossingEvent.ntime(r0)
                return r0
        }

        public int x() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.nx(r0)
                return r0
        }

        public int y() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.ny(r0)
                return r0
        }

        public int x_root() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.nx_root(r0)
                return r0
        }

        public int y_root() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.ny_root(r0)
                return r0
        }

        public int mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.nmode(r0)
                return r0
        }

        public int detail() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.ndetail(r0)
                return r0
        }

        public int same_screen() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.nsame_screen(r0)
                return r0
        }

        public int focus() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.nfocus(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int state() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XCrossingEvent.nstate(r0)
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer type(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XCrossingEvent.nserial(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
                org.lwjgl.system.linux.XCrossingEvent.nsend_event(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer display(@org.lwjgl.system.NativeType("Display *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XCrossingEvent.ndisplay(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer window(@org.lwjgl.system.NativeType("Window") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XCrossingEvent.nwindow(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer root(@org.lwjgl.system.NativeType("Window") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XCrossingEvent.nroot(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer subwindow(@org.lwjgl.system.NativeType("Window") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XCrossingEvent.nsubwindow(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer time(@org.lwjgl.system.NativeType("Time") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XCrossingEvent.ntime(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer x(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.nx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer y(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.ny(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer x_root(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.nx_root(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer y_root(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.ny_root(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer mode(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.nmode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer detail(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.ndetail(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer same_screen(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.nsame_screen(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer focus(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.nfocus(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XCrossingEvent.Buffer state(@org.lwjgl.system.NativeType("unsigned int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XCrossingEvent.nstate(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XCrossingEvent r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.XCrossingEvent r0 = org.lwjgl.system.linux.XCrossingEvent.create(r0)
                org.lwjgl.system.linux.XCrossingEvent.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected XCrossingEvent(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.XCrossingEvent create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public XCrossingEvent(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            return r0
    }

    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long serial() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nserial(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public boolean send_event() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsend_event(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("Display *")
    public long display() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndisplay(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Window")
    public long window() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nwindow(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Window")
    public long root() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nroot(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Window")
    public long subwindow() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsubwindow(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Time")
    public long time() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntime(r0)
            return r0
    }

    public int x() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nx(r0)
            return r0
    }

    public int y() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ny(r0)
            return r0
    }

    public int x_root() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nx_root(r0)
            return r0
    }

    public int y_root() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ny_root(r0)
            return r0
    }

    public int mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmode(r0)
            return r0
    }

    public int detail() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndetail(r0)
            return r0
    }

    public int same_screen() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsame_screen(r0)
            return r0
    }

    public int focus() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfocus(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int state() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstate(r0)
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent type(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nserial(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
            nsend_event(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent display(@org.lwjgl.system.NativeType("Display *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplay(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent window(@org.lwjgl.system.NativeType("Window") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nwindow(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent root(@org.lwjgl.system.NativeType("Window") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nroot(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent subwindow(@org.lwjgl.system.NativeType("Window") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsubwindow(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent time(@org.lwjgl.system.NativeType("Time") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntime(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent x(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent y(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ny(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent x_root(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nx_root(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent y_root(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ny_root(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent mode(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent detail(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndetail(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent same_screen(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsame_screen(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent focus(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfocus(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent state(@org.lwjgl.system.NativeType("unsigned int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstate(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent set(int r5, long r6, boolean r8, long r9, long r11, long r13, long r15, long r17, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.type(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.serial(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.send_event(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.display(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.window(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.root(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.subwindow(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.time(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.x(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.y(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.x_root(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.y_root(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.mode(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.detail(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.same_screen(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.focus(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.state(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XCrossingEvent set(org.lwjgl.system.linux.XCrossingEvent r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent malloc() {
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            int r2 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent calloc() {
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent create() {
            int r0 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent create(long r6) {
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XCrossingEvent createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent.Buffer malloc(int r6) {
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = new org.lwjgl.system.linux.XCrossingEvent$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent.Buffer calloc(int r7) {
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = new org.lwjgl.system.linux.XCrossingEvent$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = new org.lwjgl.system.linux.XCrossingEvent$Buffer
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

    public static org.lwjgl.system.linux.XCrossingEvent.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = new org.lwjgl.system.linux.XCrossingEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XCrossingEvent.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = new org.lwjgl.system.linux.XCrossingEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XCrossingEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XCrossingEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XCrossingEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XCrossingEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XCrossingEvent.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XCrossingEvent.ALIGNOF
            int r4 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.XCrossingEvent r0 = new org.lwjgl.system.linux.XCrossingEvent
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = new org.lwjgl.system.linux.XCrossingEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XCrossingEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XCrossingEvent.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XCrossingEvent$Buffer r0 = new org.lwjgl.system.linux.XCrossingEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XCrossingEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XCrossingEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nserial(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nsend_event(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndisplay(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nwindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nroot(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.ROOT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nsubwindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.SUBWINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ntime(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.TIME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.X
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ny(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nx_root(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.X_ROOT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ny_root(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.Y_ROOT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndetail(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.DETAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsame_screen(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SAME_SCREEN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfocus(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.FOCUS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstate(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.STATE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nserial(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nsend_event(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisplay(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwindow(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nroot(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.ROOT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nsubwindow(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.SUBWINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void ntime(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.TIME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nx(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.X
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ny(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nx_root(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.X_ROOT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ny_root(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.Y_ROOT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndetail(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.DETAIL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsame_screen(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.SAME_SCREEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfocus(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.FOCUS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstate(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XCrossingEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.STATE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XCrossingEvent.DISPLAY
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
            org.lwjgl.system.linux.XCrossingEvent r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 17
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XCrossingEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.XCrossingEvent.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.XCrossingEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.XCrossingEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.linux.XCrossingEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.system.linux.XCrossingEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.XCrossingEvent.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.XCrossingEvent.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.TYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.SERIAL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.SEND_EVENT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.DISPLAY = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.WINDOW = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.ROOT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.SUBWINDOW = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.TIME = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.X = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.Y = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.X_ROOT = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.Y_ROOT = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.MODE = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.DETAIL = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.SAME_SCREEN = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.FOCUS = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XCrossingEvent.STATE = r0
            return
    }
}
