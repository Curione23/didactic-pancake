package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XClientMessageEvent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XClientMessageEvent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XClientMessageEvent.class */
public class XClientMessageEvent extends org.lwjgl.system.Struct<org.lwjgl.system.linux.XClientMessageEvent> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int SERIAL = 0;
    public static final int SEND_EVENT = 0;
    public static final int DISPLAY = 0;
    public static final int WINDOW = 0;
    public static final int MESSAGE_TYPE = 0;
    public static final int FORMAT = 0;
    public static final int DATA = 0;
    public static final int DATA_B = 0;
    public static final int DATA_S = 0;
    public static final int DATA_L = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XClientMessageEvent$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XClientMessageEvent$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XClientMessageEvent$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.XClientMessageEvent, org.lwjgl.system.linux.XClientMessageEvent.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.XClientMessageEvent ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
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
        protected org.lwjgl.system.linux.XClientMessageEvent.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.XClientMessageEvent getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.XClientMessageEvent r0 = org.lwjgl.system.linux.XClientMessageEvent.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XClientMessageEvent.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long serial() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XClientMessageEvent.nserial(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean send_event() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XClientMessageEvent.nsend_event(r0)
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
                long r0 = org.lwjgl.system.linux.XClientMessageEvent.ndisplay(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Window")
        public long window() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XClientMessageEvent.nwindow(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Atom")
        public long message_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XClientMessageEvent.nmessage_type(r0)
                return r0
        }

        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XClientMessageEvent.nformat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[20]")
        public java.nio.ByteBuffer data_b() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.system.linux.XClientMessageEvent.ndata_b(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte data_b(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.system.linux.XClientMessageEvent.ndata_b(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("short[10]")
        public java.nio.ShortBuffer data_s() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.system.linux.XClientMessageEvent.ndata_s(r0)
                return r0
        }

        public short data_s(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.system.linux.XClientMessageEvent.ndata_s(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("long[5]")
        public org.lwjgl.CLongBuffer data_l() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.CLongBuffer r0 = org.lwjgl.system.linux.XClientMessageEvent.ndata_l(r0)
                return r0
        }

        public long data_l(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                long r0 = org.lwjgl.system.linux.XClientMessageEvent.ndata_l(r0, r1)
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer type(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XClientMessageEvent.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XClientMessageEvent.nserial(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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
                org.lwjgl.system.linux.XClientMessageEvent.nsend_event(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer display(@org.lwjgl.system.NativeType("Display *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XClientMessageEvent.ndisplay(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer window(@org.lwjgl.system.NativeType("Window") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XClientMessageEvent.nwindow(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer message_type(@org.lwjgl.system.NativeType("Atom") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XClientMessageEvent.nmessage_type(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer format(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XClientMessageEvent.nformat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer data_b(@org.lwjgl.system.NativeType("char[20]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XClientMessageEvent.ndata_b(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer data_b(int r6, @org.lwjgl.system.NativeType("char") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.XClientMessageEvent.ndata_b(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer data_s(@org.lwjgl.system.NativeType("short[10]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XClientMessageEvent.ndata_s(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer data_s(int r6, short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.XClientMessageEvent.ndata_s(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer data_l(@org.lwjgl.system.NativeType("long[5]") org.lwjgl.CLongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XClientMessageEvent.ndata_l(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XClientMessageEvent.Buffer data_l(int r7, long r8) {
                r6 = this;
                r0 = r6
                long r0 = r0.address()
                r1 = r7
                r2 = r8
                org.lwjgl.system.linux.XClientMessageEvent.ndata_l(r0, r1, r2)
                r0 = r6
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XClientMessageEvent r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.XClientMessageEvent r0 = org.lwjgl.system.linux.XClientMessageEvent.create(r0)
                org.lwjgl.system.linux.XClientMessageEvent.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected XClientMessageEvent(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.XClientMessageEvent create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public XClientMessageEvent(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
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

    @org.lwjgl.system.NativeType("Atom")
    public long message_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmessage_type(r0)
            return r0
    }

    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[20]")
    public java.nio.ByteBuffer data_b() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndata_b(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char")
    public byte data_b(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = ndata_b(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("short[10]")
    public java.nio.ShortBuffer data_s() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = ndata_s(r0)
            return r0
    }

    public short data_s(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = ndata_s(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("long[5]")
    public org.lwjgl.CLongBuffer data_l() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.CLongBuffer r0 = ndata_l(r0)
            return r0
    }

    public long data_l(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = ndata_l(r0, r1)
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent type(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nserial(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
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

    public org.lwjgl.system.linux.XClientMessageEvent display(@org.lwjgl.system.NativeType("Display *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplay(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent window(@org.lwjgl.system.NativeType("Window") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nwindow(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent message_type(@org.lwjgl.system.NativeType("Atom") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmessage_type(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent format(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent data_b(@org.lwjgl.system.NativeType("char[20]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndata_b(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent data_b(int r6, @org.lwjgl.system.NativeType("char") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndata_b(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent data_s(@org.lwjgl.system.NativeType("short[10]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndata_s(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent data_s(int r6, short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndata_s(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent data_l(@org.lwjgl.system.NativeType("long[5]") org.lwjgl.CLongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndata_l(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent data_l(int r7, long r8) {
            r6 = this;
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            ndata_l(r0, r1, r2)
            r0 = r6
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent set(int r5, long r6, boolean r8, long r9, long r11, long r13, int r15, java.nio.ByteBuffer r16, java.nio.ShortBuffer r17, org.lwjgl.CLongBuffer r18) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.type(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.serial(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.send_event(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.display(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.window(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.message_type(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.format(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.data_b(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.data_s(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.data_l(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XClientMessageEvent set(org.lwjgl.system.linux.XClientMessageEvent r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent malloc() {
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            int r2 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent calloc() {
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent create() {
            int r0 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent create(long r6) {
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XClientMessageEvent createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer malloc(int r6) {
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = new org.lwjgl.system.linux.XClientMessageEvent$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer calloc(int r7) {
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = new org.lwjgl.system.linux.XClientMessageEvent$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = new org.lwjgl.system.linux.XClientMessageEvent$Buffer
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

    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = new org.lwjgl.system.linux.XClientMessageEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = new org.lwjgl.system.linux.XClientMessageEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XClientMessageEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XClientMessageEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XClientMessageEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XClientMessageEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.ALIGNOF
            int r4 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.XClientMessageEvent r0 = new org.lwjgl.system.linux.XClientMessageEvent
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = new org.lwjgl.system.linux.XClientMessageEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XClientMessageEvent.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XClientMessageEvent$Buffer r0 = new org.lwjgl.system.linux.XClientMessageEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XClientMessageEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nserial(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nsend_event(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndisplay(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nwindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nmessage_type(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.MESSAGE_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer ndata_b(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DATA_B
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 20
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte ndata_b(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.DATA_B
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 20
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer ndata_s(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DATA_S
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short ndata_s(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.DATA_S
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 10
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.CLongBuffer ndata_l(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DATA_L
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 5
            org.lwjgl.CLongBuffer r0 = org.lwjgl.system.MemoryUtil.memCLongBuffer(r0, r1)
            return r0
    }

    public static long ndata_l(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DATA_L
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 5
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.system.linux.XClientMessageEvent.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nserial(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nsend_event(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisplay(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwindow(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nmessage_type(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.MESSAGE_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nformat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndata_b(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 20
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.XClientMessageEvent.DATA_B
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndata_b(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.DATA_B
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 20
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ndata_s(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 10
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.XClientMessageEvent.DATA_S
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndata_s(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XClientMessageEvent.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.DATA_S
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 10
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ndata_l(long r7, org.lwjgl.CLongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 5
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.XClientMessageEvent.DATA_L
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.CLONG_SIZE
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndata_l(long r7, int r9, long r10) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DATA_L
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 5
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.system.linux.XClientMessageEvent.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XClientMessageEvent.DISPLAY
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
            org.lwjgl.system.linux.XClientMessageEvent r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.XClientMessageEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 3
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 1
            r7 = 20
            org.lwjgl.system.Struct$Member r6 = __array(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 2
            r7 = 10
            org.lwjgl.system.Struct$Member r6 = __array(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            int r6 = org.lwjgl.system.linux.XClientMessageEvent.CLONG_SIZE
            r7 = 5
            org.lwjgl.system.Struct$Member r6 = __array(r6, r7)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __struct(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r9 = r0
            r0 = r9
            int r0 = r0.getSize()
            org.lwjgl.system.linux.XClientMessageEvent.SIZEOF = r0
            r0 = r9
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.XClientMessageEvent.ALIGNOF = r0
            r0 = r9
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.TYPE = r0
            r0 = r9
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.SERIAL = r0
            r0 = r9
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.SEND_EVENT = r0
            r0 = r9
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.DISPLAY = r0
            r0 = r9
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.WINDOW = r0
            r0 = r9
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.MESSAGE_TYPE = r0
            r0 = r9
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.FORMAT = r0
            r0 = r9
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.DATA = r0
            r0 = r9
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.DATA_B = r0
            r0 = r9
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.DATA_S = r0
            r0 = r9
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XClientMessageEvent.DATA_L = r0
            return
    }
}
