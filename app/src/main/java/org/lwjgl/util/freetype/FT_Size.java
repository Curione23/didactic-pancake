package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size.class */
@org.lwjgl.system.NativeType("struct FT_SizeRec")
public class FT_Size extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Size> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FACE = 0;
    public static final int GENERIC = 0;
    public static final int METRICS = 0;
    public static final int INTERNAL = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Size, org.lwjgl.util.freetype.FT_Size.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Size ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Size.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Size.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Size getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Size r0 = org.lwjgl.util.freetype.FT_Size.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.util.freetype.FT_Face face() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Size.nface(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Generic generic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Size.ngeneric(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size_Metrics metrics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Size_Metrics r0 = org.lwjgl.util.freetype.FT_Size.nmetrics(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size.Buffer face(org.lwjgl.util.freetype.FT_Face r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Size.nface(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size.Buffer generic(org.lwjgl.util.freetype.FT_Generic r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Size.ngeneric(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size.Buffer generic(java.util.function.Consumer<org.lwjgl.util.freetype.FT_Generic> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.freetype.FT_Generic r1 = r1.generic()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size.Buffer metrics(org.lwjgl.util.freetype.FT_Size_Metrics r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Size.nmetrics(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Size r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Size$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Size r0 = org.lwjgl.util.freetype.FT_Size.create(r0)
                org.lwjgl.util.freetype.FT_Size.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Size(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Size create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Size(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            return r0
    }

    public org.lwjgl.util.freetype.FT_Face face() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Face r0 = nface(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic generic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Generic r0 = ngeneric(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Metrics metrics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = nmetrics(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size face(org.lwjgl.util.freetype.FT_Face r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nface(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size generic(org.lwjgl.util.freetype.FT_Generic r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneric(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size generic(java.util.function.Consumer<org.lwjgl.util.freetype.FT_Generic> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.freetype.FT_Generic r1 = r1.generic()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size metrics(org.lwjgl.util.freetype.FT_Size_Metrics r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmetrics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size set(org.lwjgl.util.freetype.FT_Face r4, org.lwjgl.util.freetype.FT_Generic r5, org.lwjgl.util.freetype.FT_Size_Metrics r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.freetype.FT_Size r0 = r0.face(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.freetype.FT_Size r0 = r0.generic(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.freetype.FT_Size r0 = r0.metrics(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size set(org.lwjgl.util.freetype.FT_Size r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size malloc() {
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size calloc() {
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size create() {
            int r0 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size create(long r6) {
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Size createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Size$Buffer r0 = new org.lwjgl.util.freetype.FT_Size$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Size$Buffer r0 = new org.lwjgl.util.freetype.FT_Size$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Size$Buffer r0 = new org.lwjgl.util.freetype.FT_Size$Buffer
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

    public static org.lwjgl.util.freetype.FT_Size.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Size$Buffer r0 = new org.lwjgl.util.freetype.FT_Size$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Size.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Size$Buffer r0 = new org.lwjgl.util.freetype.FT_Size$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Size.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Size r0 = new org.lwjgl.util.freetype.FT_Size
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Size$Buffer r0 = new org.lwjgl.util.freetype.FT_Size$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Size.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Size$Buffer r0 = new org.lwjgl.util.freetype.FT_Size$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Size.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Size.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Face nface(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.FACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Face.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic ngeneric(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.GENERIC
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Generic.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Metrics nmetrics(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.METRICS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = org.lwjgl.util.freetype.FT_Size_Metrics.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Internal ninternal(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.INTERNAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Size_Internal r0 = org.lwjgl.util.freetype.FT_Size_Internal.create(r0)
            return r0
    }

    public static void nface(long r5, org.lwjgl.util.freetype.FT_Face r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.FACE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ngeneric(long r7, org.lwjgl.util.freetype.FT_Generic r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.freetype.FT_Size.GENERIC
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nmetrics(long r7, org.lwjgl.util.freetype.FT_Size_Metrics r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.freetype.FT_Size.METRICS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.freetype.FT_Size_Metrics.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ninternal(long r5, org.lwjgl.util.freetype.FT_Size_Internal r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.INTERNAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.FACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size.GENERIC
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Generic.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Size r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Size.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Size_Metrics.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Size.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Size.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Size.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size.FACE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size.GENERIC = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size.METRICS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size.INTERNAL = r0
            return
    }
}
