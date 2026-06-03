package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SfntLangTag.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SfntLangTag.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SfntLangTag.class */
public class FT_SfntLangTag extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_SfntLangTag> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STRING = 0;
    public static final int STRING_LEN = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SfntLangTag$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SfntLangTag$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SfntLangTag$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_SfntLangTag, org.lwjgl.util.freetype.FT_SfntLangTag.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_SfntLangTag ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_SfntLangTag.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_SfntLangTag getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_SfntLangTag r0 = org.lwjgl.util.freetype.FT_SfntLangTag.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte *")
        public java.nio.ByteBuffer string() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_SfntLangTag.nstring(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int string_len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_SfntLangTag.nstring_len(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_SfntLangTag r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_SfntLangTag r0 = org.lwjgl.util.freetype.FT_SfntLangTag.create(r0)
                org.lwjgl.util.freetype.FT_SfntLangTag.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_SfntLangTag(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_SfntLangTag create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_SfntLangTag(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte *")
    public java.nio.ByteBuffer string() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nstring(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int string_len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstring_len(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag malloc() {
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag calloc() {
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag create() {
            int r0 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag create(long r6) {
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_SfntLangTag createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = new org.lwjgl.util.freetype.FT_SfntLangTag$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = new org.lwjgl.util.freetype.FT_SfntLangTag$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = new org.lwjgl.util.freetype.FT_SfntLangTag$Buffer
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

    public static org.lwjgl.util.freetype.FT_SfntLangTag.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = new org.lwjgl.util.freetype.FT_SfntLangTag$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_SfntLangTag.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = new org.lwjgl.util.freetype.FT_SfntLangTag$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = new org.lwjgl.util.freetype.FT_SfntLangTag
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = new org.lwjgl.util.freetype.FT_SfntLangTag$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SfntLangTag.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_SfntLangTag$Buffer r0 = new org.lwjgl.util.freetype.FT_SfntLangTag$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer nstring(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_SfntLangTag.STRING
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nstring_len(r1)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static int nstring_len(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_SfntLangTag.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.STRING_LEN
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
            org.lwjgl.util.freetype.FT_SfntLangTag r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_SfntLangTag.POINTER_SIZE
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
            org.lwjgl.util.freetype.FT_SfntLangTag.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_SfntLangTag.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SfntLangTag.STRING = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SfntLangTag.STRING_LEN = r0
            return
    }
}
