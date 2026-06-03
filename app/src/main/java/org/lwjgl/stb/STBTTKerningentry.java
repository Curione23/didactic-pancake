package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTKerningentry.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTKerningentry.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTKerningentry.class */
@org.lwjgl.system.NativeType("struct stbtt_kerningentry")
public class STBTTKerningentry extends org.lwjgl.system.Struct<org.lwjgl.stb.STBTTKerningentry> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int GLYPH1 = 0;
    public static final int GLYPH2 = 0;
    public static final int ADVANCE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTKerningentry$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTKerningentry$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTKerningentry$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBTTKerningentry, org.lwjgl.stb.STBTTKerningentry.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBTTKerningentry ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
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
        protected org.lwjgl.stb.STBTTKerningentry.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.stb.STBTTKerningentry getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBTTKerningentry r0 = org.lwjgl.stb.STBTTKerningentry.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int glyph1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTKerningentry.nglyph1(r0)
                return r0
        }

        public int glyph2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTKerningentry.nglyph2(r0)
                return r0
        }

        public int advance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTKerningentry.nadvance(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTKerningentry r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTKerningentry$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBTTKerningentry r0 = org.lwjgl.stb.STBTTKerningentry.create(r0)
                org.lwjgl.stb.STBTTKerningentry.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected STBTTKerningentry(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBTTKerningentry create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBTTKerningentry(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            return r0
    }

    public int glyph1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nglyph1(r0)
            return r0
    }

    public int glyph2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nglyph2(r0)
            return r0
    }

    public int advance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nadvance(r0)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry malloc() {
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            int r2 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry calloc() {
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry create() {
            int r0 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry create(long r6) {
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTKerningentry createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry.Buffer malloc(int r6) {
            org.lwjgl.stb.STBTTKerningentry$Buffer r0 = new org.lwjgl.stb.STBTTKerningentry$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry.Buffer calloc(int r7) {
            org.lwjgl.stb.STBTTKerningentry$Buffer r0 = new org.lwjgl.stb.STBTTKerningentry$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBTTKerningentry$Buffer r0 = new org.lwjgl.stb.STBTTKerningentry$Buffer
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

    public static org.lwjgl.stb.STBTTKerningentry.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBTTKerningentry$Buffer r0 = new org.lwjgl.stb.STBTTKerningentry$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTKerningentry.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTKerningentry$Buffer r0 = new org.lwjgl.stb.STBTTKerningentry$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTKerningentry.ALIGNOF
            int r4 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBTTKerningentry r0 = new org.lwjgl.stb.STBTTKerningentry
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTKerningentry.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTKerningentry$Buffer r0 = new org.lwjgl.stb.STBTTKerningentry$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTKerningentry.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTKerningentry.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTKerningentry$Buffer r0 = new org.lwjgl.stb.STBTTKerningentry$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTKerningentry.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTKerningentry.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nglyph1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTKerningentry.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTKerningentry.GLYPH1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nglyph2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTKerningentry.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTKerningentry.GLYPH2
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nadvance(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTKerningentry.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTKerningentry.ADVANCE
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
            org.lwjgl.stb.STBTTKerningentry r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.stb.STBTTKerningentry.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.stb.STBTTKerningentry.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTKerningentry.GLYPH1 = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTKerningentry.GLYPH2 = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTKerningentry.ADVANCE = r0
            return
    }
}
