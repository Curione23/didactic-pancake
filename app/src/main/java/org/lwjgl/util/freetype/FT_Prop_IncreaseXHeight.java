package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_IncreaseXHeight.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_IncreaseXHeight.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_IncreaseXHeight.class */
public class FT_Prop_IncreaseXHeight extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FACE = 0;
    public static final int LIMIT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_IncreaseXHeight$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_IncreaseXHeight$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Prop_IncreaseXHeight$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight, org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.Buffer> {
        private static final org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight r0 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.util.freetype.FT_Face face() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.nface(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int limit$() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.nlimit$(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight r0 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.create(r0)
                org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Prop_IncreaseXHeight(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight r0 = new org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Prop_IncreaseXHeight(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.SIZEOF
            return r0
    }

    public org.lwjgl.util.freetype.FT_Face face() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Face r0 = nface(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int limit$() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlimit$(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight create(long r6) {
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight r0 = new org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight r0 = new org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight$Buffer r0 = new org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight$Buffer r0 = new org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Face nface(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.FACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Face.create(r0)
            return r0
    }

    public static int nlimit$(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.LIMIT
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
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.FACE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Prop_IncreaseXHeight.LIMIT = r0
            return
    }
}
