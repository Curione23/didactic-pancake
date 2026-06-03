package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Glyph.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Glyph.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Glyph.class */
@org.lwjgl.system.NativeType("struct FT_GlyphRec")
public class FT_Glyph extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Glyph> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int LIBRARY = 0;
    public static final int CLAZZ = 0;
    public static final int FORMAT = 0;
    public static final int ADVANCE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Glyph$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Glyph$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Glyph$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Glyph, org.lwjgl.util.freetype.FT_Glyph.Buffer> {
        private static final org.lwjgl.util.freetype.FT_Glyph ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Glyph.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Glyph.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Glyph getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Glyph r0 = org.lwjgl.util.freetype.FT_Glyph.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Library")
        public long library() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Glyph.nlibrary(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Glyph_Format")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Glyph.nformat(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Vector advance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Glyph.nadvance(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Glyph r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Glyph$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Glyph r0 = org.lwjgl.util.freetype.FT_Glyph.create(r0)
                org.lwjgl.util.freetype.FT_Glyph.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Glyph(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Glyph create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Glyph r0 = new org.lwjgl.util.freetype.FT_Glyph
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Glyph(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Glyph.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Glyph.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Library")
    public long library() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlibrary(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Glyph_Format")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Vector advance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector r0 = nadvance(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Glyph create(long r6) {
            org.lwjgl.util.freetype.FT_Glyph r0 = new org.lwjgl.util.freetype.FT_Glyph
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Glyph createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Glyph r0 = new org.lwjgl.util.freetype.FT_Glyph
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Glyph.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Glyph$Buffer r0 = new org.lwjgl.util.freetype.FT_Glyph$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Glyph.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Glyph$Buffer r0 = new org.lwjgl.util.freetype.FT_Glyph$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nlibrary(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Glyph.LIBRARY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nclazz(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Glyph.CLAZZ
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Glyph.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Glyph.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector nadvance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Glyph.ADVANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Vector.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Glyph r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Glyph.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Glyph.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Vector.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Vector.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Glyph.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Glyph.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Glyph.LIBRARY = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Glyph.CLAZZ = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Glyph.FORMAT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Glyph.ADVANCE = r0
            return
    }
}
