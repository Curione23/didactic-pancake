package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XConfigureEvent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XConfigureEvent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XConfigureEvent.class */
public class XConfigureEvent extends org.lwjgl.system.Struct<org.lwjgl.system.linux.XConfigureEvent> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int SERIAL = 0;
    public static final int SEND_EVENT = 0;
    public static final int DISPLAY = 0;
    public static final int WINDOW = 0;
    public static final int X = 0;
    public static final int Y = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int BORDER_WIDTH = 0;
    public static final int ABOVE = 0;
    public static final int OVERRIDE_REDIRECT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XConfigureEvent$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XConfigureEvent$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XConfigureEvent$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.XConfigureEvent, org.lwjgl.system.linux.XConfigureEvent.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.XConfigureEvent ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
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
        protected org.lwjgl.system.linux.XConfigureEvent.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.XConfigureEvent getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.XConfigureEvent r0 = org.lwjgl.system.linux.XConfigureEvent.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long serial() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XConfigureEvent.nserial(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean send_event() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.nsend_event(r0)
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
                long r0 = org.lwjgl.system.linux.XConfigureEvent.ndisplay(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Window")
        public long window() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XConfigureEvent.nwindow(r0)
                return r0
        }

        public int x() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.nx(r0)
                return r0
        }

        public int y() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.ny(r0)
                return r0
        }

        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.nwidth(r0)
                return r0
        }

        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.nheight(r0)
                return r0
        }

        public int border_width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.nborder_width(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Window")
        public long above() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XConfigureEvent.nabove(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean override_redirect() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XConfigureEvent.noverride_redirect(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer type(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XConfigureEvent.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XConfigureEvent.nserial(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
                org.lwjgl.system.linux.XConfigureEvent.nsend_event(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer display(@org.lwjgl.system.NativeType("Display *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XConfigureEvent.ndisplay(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer window(@org.lwjgl.system.NativeType("Window") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XConfigureEvent.nwindow(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer x(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XConfigureEvent.nx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer y(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XConfigureEvent.ny(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer width(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XConfigureEvent.nwidth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer height(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XConfigureEvent.nheight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer border_width(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XConfigureEvent.nborder_width(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer above(@org.lwjgl.system.NativeType("Window") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XConfigureEvent.nabove(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XConfigureEvent.Buffer override_redirect(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
                org.lwjgl.system.linux.XConfigureEvent.noverride_redirect(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XConfigureEvent r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.XConfigureEvent r0 = org.lwjgl.system.linux.XConfigureEvent.create(r0)
                org.lwjgl.system.linux.XConfigureEvent.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected XConfigureEvent(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.XConfigureEvent create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public XConfigureEvent(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
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

    public int width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwidth(r0)
            return r0
    }

    public int height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheight(r0)
            return r0
    }

    public int border_width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nborder_width(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Window")
    public long above() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nabove(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public boolean override_redirect() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noverride_redirect(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent type(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nserial(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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

    public org.lwjgl.system.linux.XConfigureEvent display(@org.lwjgl.system.NativeType("Display *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplay(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent window(@org.lwjgl.system.NativeType("Window") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nwindow(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent x(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent y(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ny(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent width(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwidth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent height(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent border_width(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nborder_width(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent above(@org.lwjgl.system.NativeType("Window") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nabove(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent override_redirect(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
            noverride_redirect(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent set(int r5, long r6, boolean r8, long r9, long r11, int r13, int r14, int r15, int r16, int r17, long r18, boolean r20) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.type(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.serial(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.send_event(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.display(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.window(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.x(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.y(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.width(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.height(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.border_width(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.above(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.override_redirect(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XConfigureEvent set(org.lwjgl.system.linux.XConfigureEvent r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent malloc() {
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            int r2 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent calloc() {
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent create() {
            int r0 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent create(long r6) {
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XConfigureEvent createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent.Buffer malloc(int r6) {
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = new org.lwjgl.system.linux.XConfigureEvent$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent.Buffer calloc(int r7) {
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = new org.lwjgl.system.linux.XConfigureEvent$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = new org.lwjgl.system.linux.XConfigureEvent$Buffer
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

    public static org.lwjgl.system.linux.XConfigureEvent.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = new org.lwjgl.system.linux.XConfigureEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XConfigureEvent.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = new org.lwjgl.system.linux.XConfigureEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XConfigureEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XConfigureEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XConfigureEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XConfigureEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XConfigureEvent.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XConfigureEvent.ALIGNOF
            int r4 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.XConfigureEvent r0 = new org.lwjgl.system.linux.XConfigureEvent
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = new org.lwjgl.system.linux.XConfigureEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XConfigureEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XConfigureEvent.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XConfigureEvent$Buffer r0 = new org.lwjgl.system.linux.XConfigureEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XConfigureEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XConfigureEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nserial(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nsend_event(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndisplay(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nwindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.X
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ny(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nborder_width(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.BORDER_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nabove(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.ABOVE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int noverride_redirect(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.OVERRIDE_REDIRECT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nserial(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nsend_event(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisplay(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwindow(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nx(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.X
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ny(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nwidth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nheight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nborder_width(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.BORDER_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nabove(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.ABOVE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void noverride_redirect(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XConfigureEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XConfigureEvent.OVERRIDE_REDIRECT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XConfigureEvent.DISPLAY
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
            org.lwjgl.system.linux.XConfigureEvent r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.system.linux.XConfigureEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.XConfigureEvent.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.XConfigureEvent.CLONG_SIZE
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
            r1 = r0
            r2 = 7
            r3 = 4
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
            int r3 = org.lwjgl.system.linux.XConfigureEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.XConfigureEvent.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.XConfigureEvent.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.TYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.SERIAL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.SEND_EVENT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.DISPLAY = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.WINDOW = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.X = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.Y = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.WIDTH = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.HEIGHT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.BORDER_WIDTH = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.ABOVE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XConfigureEvent.OVERRIDE_REDIRECT = r0
            return
    }
}
