package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap.class */
public class FT_Prop_GlyphToScriptMap extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FACE = 0;
    public static final int MAP = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_GlyphToScriptMap$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap, org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.Buffer> {
        private static final org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap r0 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.util.freetype.FT_Face face() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.nface(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("FT_UShort *")
        public java.nio.ShortBuffer map(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.nmap(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap r0 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.create(r0)
                org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Prop_GlyphToScriptMap(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap r0 = new org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Prop_GlyphToScriptMap(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.SIZEOF
            return r0
    }

    public org.lwjgl.util.freetype.FT_Face face() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Face r0 = nface(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("FT_UShort *")
    public java.nio.ShortBuffer map(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ShortBuffer r0 = nmap(r0, r1)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap create(long r6) {
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap r0 = new org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap r0 = new org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap$Buffer r0 = new org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap$Buffer r0 = new org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Face nface(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.FACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Face.create(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ShortBuffer nmap(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.MAP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.FACE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Prop_GlyphToScriptMap.MAP = r0
            return
    }
}
