package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT.class */
public class GLXStereoNotifyEventEXT extends org.lwjgl.system.Struct<org.lwjgl.opengl.GLXStereoNotifyEventEXT> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int SERIAL = 0;
    public static final int SEND_EVENT = 0;
    public static final int DISPLAY = 0;
    public static final int EXTENSION = 0;
    public static final int EVTYPE = 0;
    public static final int WINDOW = 0;
    public static final int STEREO_TREE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXStereoNotifyEventEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.opengl.GLXStereoNotifyEventEXT, org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer> {
        private static final org.lwjgl.opengl.GLXStereoNotifyEventEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.SIZEOF
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
        protected org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.opengl.GLXStereoNotifyEventEXT getElementFactory() {
                r2 = this;
                org.lwjgl.opengl.GLXStereoNotifyEventEXT r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long serial() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.nserial(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean send_event() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.nsend_event(r0)
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
                long r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.ndisplay(r0)
                return r0
        }

        public int extension() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.nextension(r0)
                return r0
        }

        public int evtype() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.nevtype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("GLXDrawable")
        public long window() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.nwindow(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean stereo_tree() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.nstereo_tree(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.opengl.GLXStereoNotifyEventEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.opengl.GLXStereoNotifyEventEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.opengl.GLXStereoNotifyEventEXT r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.create(r0)
                org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLXStereoNotifyEventEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.opengl.GLXStereoNotifyEventEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.opengl.GLXStereoNotifyEventEXT r0 = new org.lwjgl.opengl.GLXStereoNotifyEventEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLXStereoNotifyEventEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.SIZEOF
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

    public int extension() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextension(r0)
            return r0
    }

    public int evtype() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nevtype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXDrawable")
    public long window() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nwindow(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public boolean stereo_tree() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstereo_tree(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static org.lwjgl.opengl.GLXStereoNotifyEventEXT create(long r6) {
            org.lwjgl.opengl.GLXStereoNotifyEventEXT r0 = new org.lwjgl.opengl.GLXStereoNotifyEventEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.opengl.GLXStereoNotifyEventEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.opengl.GLXStereoNotifyEventEXT r0 = new org.lwjgl.opengl.GLXStereoNotifyEventEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer create(long r6, int r8) {
            org.lwjgl.opengl.GLXStereoNotifyEventEXT$Buffer r0 = new org.lwjgl.opengl.GLXStereoNotifyEventEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.opengl.GLXStereoNotifyEventEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.opengl.GLXStereoNotifyEventEXT$Buffer r0 = new org.lwjgl.opengl.GLXStereoNotifyEventEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nserial(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nsend_event(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndisplay(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nextension(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.EXTENSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nevtype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.EVTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nwindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nstereo_tree(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.STEREO_TREE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GLXStereoNotifyEventEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.POINTER_SIZE
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
            int r3 = org.lwjgl.opengl.GLXStereoNotifyEventEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.TYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.SERIAL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.SEND_EVENT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.DISPLAY = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.EXTENSION = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.EVTYPE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.WINDOW = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GLXStereoNotifyEventEXT.STEREO_TREE = r0
            return
    }
}
