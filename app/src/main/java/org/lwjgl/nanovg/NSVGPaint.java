package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPaint.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPaint.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPaint.class */
@org.lwjgl.system.NativeType("struct NSVGpaint")
public class NSVGPaint extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NSVGPaint> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int COLOR = 0;
    public static final int GRADIENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPaint$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPaint$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPaint$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NSVGPaint, org.lwjgl.nanovg.NSVGPaint.Buffer> {
        private static final org.lwjgl.nanovg.NSVGPaint ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NSVGPaint.SIZEOF
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
        protected org.lwjgl.nanovg.NSVGPaint.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NSVGPaint getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NSVGPaint r0 = org.lwjgl.nanovg.NSVGPaint.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("signed char")
        public byte type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGPaint.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int color() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.NSVGPaint.ncolor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGgradient *")
        public org.lwjgl.nanovg.NSVGGradient gradient() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGGradient r0 = org.lwjgl.nanovg.NSVGPaint.ngradient(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGPaint r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGPaint$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NSVGPaint r0 = org.lwjgl.nanovg.NSVGPaint.create(r0)
                org.lwjgl.nanovg.NSVGPaint.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NSVGPaint(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NSVGPaint create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NSVGPaint r0 = new org.lwjgl.nanovg.NSVGPaint
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NSVGPaint(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGPaint.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NSVGPaint.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("signed char")
    public byte type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int color() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncolor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGgradient *")
    public org.lwjgl.nanovg.NSVGGradient gradient() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGGradient r0 = ngradient(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGPaint create(long r6) {
            org.lwjgl.nanovg.NSVGPaint r0 = new org.lwjgl.nanovg.NSVGPaint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGPaint createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGPaint r0 = new org.lwjgl.nanovg.NSVGPaint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NSVGPaint.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NSVGPaint$Buffer r0 = new org.lwjgl.nanovg.NSVGPaint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGPaint.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGPaint$Buffer r0 = new org.lwjgl.nanovg.NSVGPaint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static byte ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGPaint.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int ncolor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGPaint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGPaint.COLOR
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGGradient ngradient(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGPaint.GRADIENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.nanovg.NSVGGradient r0 = org.lwjgl.nanovg.NSVGGradient.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NSVGPaint r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 4
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            int r6 = org.lwjgl.nanovg.NSVGPaint.POINTER_SIZE
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r8 = r0
            r0 = r8
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NSVGPaint.SIZEOF = r0
            r0 = r8
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NSVGPaint.ALIGNOF = r0
            r0 = r8
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPaint.TYPE = r0
            r0 = r8
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPaint.COLOR = r0
            r0 = r8
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPaint.GRADIENT = r0
            return
    }
}
