package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XSetWindowAttributes.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XSetWindowAttributes.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XSetWindowAttributes.class */
public class XSetWindowAttributes extends org.lwjgl.system.Struct<org.lwjgl.system.linux.XSetWindowAttributes> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BACKGROUND_PIXMAP = 0;
    public static final int BACKGROUND_PIXEL = 0;
    public static final int BORDER_PIXMAP = 0;
    public static final int BORDER_PIXEL = 0;
    public static final int BIT_GRAVITY = 0;
    public static final int WIN_GRAVITY = 0;
    public static final int BACKING_STORE = 0;
    public static final int BACKING_PLANES = 0;
    public static final int BACKING_PIXEL = 0;
    public static final int SAVE_UNDER = 0;
    public static final int EVENT_MASK = 0;
    public static final int DO_NOT_PROPAGATE_MASK = 0;
    public static final int OVERRIDE_REDIRECT = 0;
    public static final int COLORMAP = 0;
    public static final int CURSOR = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XSetWindowAttributes$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XSetWindowAttributes$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XSetWindowAttributes$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.XSetWindowAttributes, org.lwjgl.system.linux.XSetWindowAttributes.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.XSetWindowAttributes ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
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
        protected org.lwjgl.system.linux.XSetWindowAttributes.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.XSetWindowAttributes getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.XSetWindowAttributes r0 = org.lwjgl.system.linux.XSetWindowAttributes.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("Pixmap")
        public long background_pixmap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.nbackground_pixmap(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long background_pixel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.nbackground_pixel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Pixmap")
        public long border_pixmap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.nborder_pixmap(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long border_pixel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.nborder_pixel(r0)
                return r0
        }

        public int bit_gravity() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XSetWindowAttributes.nbit_gravity(r0)
                return r0
        }

        public int win_gravity() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XSetWindowAttributes.nwin_gravity(r0)
                return r0
        }

        public int backing_store() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XSetWindowAttributes.nbacking_store(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long backing_planes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.nbacking_planes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long backing_pixel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.nbacking_pixel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean save_under() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XSetWindowAttributes.nsave_under(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public long event_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.nevent_mask(r0)
                return r0
        }

        public long do_not_propagate_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.ndo_not_propagate_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean override_redirect() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XSetWindowAttributes.noverride_redirect(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("Colormap")
        public long colormap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.ncolormap(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Cursor")
        public long cursor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XSetWindowAttributes.ncursor(r0)
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer background_pixmap(@org.lwjgl.system.NativeType("Pixmap") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.nbackground_pixmap(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer background_pixel(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.nbackground_pixel(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer border_pixmap(@org.lwjgl.system.NativeType("Pixmap") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.nborder_pixmap(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer border_pixel(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.nborder_pixel(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer bit_gravity(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XSetWindowAttributes.nbit_gravity(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer win_gravity(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XSetWindowAttributes.nwin_gravity(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer backing_store(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XSetWindowAttributes.nbacking_store(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer backing_planes(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.nbacking_planes(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer backing_pixel(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.nbacking_pixel(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer save_under(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
                org.lwjgl.system.linux.XSetWindowAttributes.nsave_under(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer event_mask(long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.nevent_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer do_not_propagate_mask(long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.ndo_not_propagate_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer override_redirect(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
                org.lwjgl.system.linux.XSetWindowAttributes.noverride_redirect(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer colormap(@org.lwjgl.system.NativeType("Colormap") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.ncolormap(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XSetWindowAttributes.Buffer cursor(@org.lwjgl.system.NativeType("Cursor") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XSetWindowAttributes.ncursor(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.XSetWindowAttributes r0 = org.lwjgl.system.linux.XSetWindowAttributes.create(r0)
                org.lwjgl.system.linux.XSetWindowAttributes.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected XSetWindowAttributes(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.XSetWindowAttributes create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public XSetWindowAttributes(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("Pixmap")
    public long background_pixmap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbackground_pixmap(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long background_pixel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbackground_pixel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Pixmap")
    public long border_pixmap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nborder_pixmap(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long border_pixel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nborder_pixel(r0)
            return r0
    }

    public int bit_gravity() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbit_gravity(r0)
            return r0
    }

    public int win_gravity() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwin_gravity(r0)
            return r0
    }

    public int backing_store() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbacking_store(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long backing_planes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbacking_planes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long backing_pixel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbacking_pixel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public boolean save_under() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsave_under(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public long event_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nevent_mask(r0)
            return r0
    }

    public long do_not_propagate_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndo_not_propagate_mask(r0)
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

    @org.lwjgl.system.NativeType("Colormap")
    public long colormap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncolormap(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Cursor")
    public long cursor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncursor(r0)
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes background_pixmap(@org.lwjgl.system.NativeType("Pixmap") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbackground_pixmap(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes background_pixel(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbackground_pixel(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes border_pixmap(@org.lwjgl.system.NativeType("Pixmap") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nborder_pixmap(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes border_pixel(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nborder_pixel(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes bit_gravity(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbit_gravity(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes win_gravity(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwin_gravity(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes backing_store(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbacking_store(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes backing_planes(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbacking_planes(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes backing_pixel(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbacking_pixel(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes save_under(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
            nsave_under(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes event_mask(long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nevent_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes do_not_propagate_mask(long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndo_not_propagate_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes override_redirect(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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

    public org.lwjgl.system.linux.XSetWindowAttributes colormap(@org.lwjgl.system.NativeType("Colormap") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ncolormap(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes cursor(@org.lwjgl.system.NativeType("Cursor") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ncursor(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes set(long r5, long r7, long r9, long r11, int r13, int r14, int r15, long r16, long r18, boolean r20, long r21, long r23, boolean r25, long r26, long r28) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.background_pixmap(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.background_pixel(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.border_pixmap(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.border_pixel(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.bit_gravity(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.win_gravity(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.backing_store(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.backing_planes(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.backing_pixel(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.save_under(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.event_mask(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.do_not_propagate_mask(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.override_redirect(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.colormap(r1)
            r0 = r4
            r1 = r28
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.cursor(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XSetWindowAttributes set(org.lwjgl.system.linux.XSetWindowAttributes r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes malloc() {
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            int r2 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes calloc() {
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes create() {
            int r0 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes create(long r6) {
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XSetWindowAttributes createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer malloc(int r6) {
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = new org.lwjgl.system.linux.XSetWindowAttributes$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer calloc(int r7) {
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = new org.lwjgl.system.linux.XSetWindowAttributes$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = new org.lwjgl.system.linux.XSetWindowAttributes$Buffer
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

    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = new org.lwjgl.system.linux.XSetWindowAttributes$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = new org.lwjgl.system.linux.XSetWindowAttributes$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XSetWindowAttributes r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XSetWindowAttributes r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XSetWindowAttributes r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XSetWindowAttributes r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.ALIGNOF
            int r4 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.XSetWindowAttributes r0 = new org.lwjgl.system.linux.XSetWindowAttributes
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = new org.lwjgl.system.linux.XSetWindowAttributes$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XSetWindowAttributes.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XSetWindowAttributes$Buffer r0 = new org.lwjgl.system.linux.XSetWindowAttributes$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nbackground_pixmap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKGROUND_PIXMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nbackground_pixel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKGROUND_PIXEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nborder_pixmap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BORDER_PIXMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nborder_pixel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BORDER_PIXEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nbit_gravity(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.BIT_GRAVITY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nwin_gravity(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.WIN_GRAVITY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbacking_store(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.BACKING_STORE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nbacking_planes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKING_PLANES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nbacking_pixel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKING_PIXEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nsave_under(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.SAVE_UNDER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nevent_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.EVENT_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ndo_not_propagate_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.DO_NOT_PROPAGATE_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int noverride_redirect(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.OVERRIDE_REDIRECT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ncolormap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.COLORMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ncursor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.CURSOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static void nbackground_pixmap(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKGROUND_PIXMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nbackground_pixel(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKGROUND_PIXEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nborder_pixmap(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BORDER_PIXMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nborder_pixel(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BORDER_PIXEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nbit_gravity(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.BIT_GRAVITY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nwin_gravity(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.WIN_GRAVITY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbacking_store(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.BACKING_STORE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbacking_planes(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKING_PLANES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nbacking_pixel(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.BACKING_PIXEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nsave_under(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.SAVE_UNDER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nevent_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.EVENT_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void ndo_not_propagate_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.DO_NOT_PROPAGATE_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void noverride_redirect(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XSetWindowAttributes.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.OVERRIDE_REDIRECT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncolormap(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.COLORMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void ncursor(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XSetWindowAttributes.CURSOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.XSetWindowAttributes r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
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
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.system.linux.XSetWindowAttributes.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.XSetWindowAttributes.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.XSetWindowAttributes.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BACKGROUND_PIXMAP = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BACKGROUND_PIXEL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BORDER_PIXMAP = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BORDER_PIXEL = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BIT_GRAVITY = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.WIN_GRAVITY = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BACKING_STORE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BACKING_PLANES = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.BACKING_PIXEL = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.SAVE_UNDER = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.EVENT_MASK = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.DO_NOT_PROPAGATE_MASK = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.OVERRIDE_REDIRECT = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.COLORMAP = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XSetWindowAttributes.CURSOR = r0
            return
    }
}
