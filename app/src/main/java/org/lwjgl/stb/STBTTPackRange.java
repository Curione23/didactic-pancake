package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackRange.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackRange.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackRange.class */
@org.lwjgl.system.NativeType("struct stbtt_pack_range")
public class STBTTPackRange extends org.lwjgl.system.Struct<org.lwjgl.stb.STBTTPackRange> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FONT_SIZE = 0;
    public static final int FIRST_UNICODE_CODEPOINT_IN_RANGE = 0;
    public static final int ARRAY_OF_UNICODE_CODEPOINTS = 0;
    public static final int NUM_CHARS = 0;
    public static final int CHARDATA_FOR_RANGE = 0;
    public static final int H_OVERSAMPLE = 0;
    public static final int V_OVERSAMPLE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackRange$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackRange$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackRange$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBTTPackRange, org.lwjgl.stb.STBTTPackRange.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBTTPackRange ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBTTPackRange.SIZEOF
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
        protected org.lwjgl.stb.STBTTPackRange.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.stb.STBTTPackRange getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBTTPackRange r0 = org.lwjgl.stb.STBTTPackRange.Buffer.ELEMENT_FACTORY
                return r0
        }

        public float font_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.stb.STBTTPackRange.nfont_size(r0)
                return r0
        }

        public int first_unicode_codepoint_in_range() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackRange.nfirst_unicode_codepoint_in_range(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("int *")
        public java.nio.IntBuffer array_of_unicode_codepoints() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.stb.STBTTPackRange.narray_of_unicode_codepoints(r0)
                return r0
        }

        public int num_chars() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackRange.nnum_chars(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbtt_packedchar *")
        public org.lwjgl.stb.STBTTPackedchar.Buffer chardata_for_range() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBTTPackedchar$Buffer r0 = org.lwjgl.stb.STBTTPackRange.nchardata_for_range(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char")
        public byte h_oversample() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.stb.STBTTPackRange.nh_oversample(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char")
        public byte v_oversample() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.stb.STBTTPackRange.nv_oversample(r0)
                return r0
        }

        public org.lwjgl.stb.STBTTPackRange.Buffer font_size(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBTTPackRange.nfont_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBTTPackRange.Buffer first_unicode_codepoint_in_range(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBTTPackRange.nfirst_unicode_codepoint_in_range(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBTTPackRange.Buffer array_of_unicode_codepoints(@javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBTTPackRange.narray_of_unicode_codepoints(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBTTPackRange.Buffer num_chars(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBTTPackRange.nnum_chars(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBTTPackRange.Buffer chardata_for_range(@org.lwjgl.system.NativeType("stbtt_packedchar *") org.lwjgl.stb.STBTTPackedchar.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBTTPackRange.nchardata_for_range(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBTTPackRange.Buffer h_oversample(@org.lwjgl.system.NativeType("unsigned char") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBTTPackRange.nh_oversample(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBTTPackRange.Buffer v_oversample(@org.lwjgl.system.NativeType("unsigned char") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBTTPackRange.nv_oversample(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTPackRange r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTPackRange$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBTTPackRange r0 = org.lwjgl.stb.STBTTPackRange.create(r0)
                org.lwjgl.stb.STBTTPackRange.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected STBTTPackRange(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBTTPackRange create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBTTPackRange(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            return r0
    }

    public float font_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nfont_size(r0)
            return r0
    }

    public int first_unicode_codepoint_in_range() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfirst_unicode_codepoint_in_range(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("int *")
    public java.nio.IntBuffer array_of_unicode_codepoints() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = narray_of_unicode_codepoints(r0)
            return r0
    }

    public int num_chars() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_chars(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbtt_packedchar *")
    public org.lwjgl.stb.STBTTPackedchar.Buffer chardata_for_range() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBTTPackedchar$Buffer r0 = nchardata_for_range(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char")
    public byte h_oversample() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nh_oversample(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char")
    public byte v_oversample() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nv_oversample(r0)
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange font_size(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfont_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange first_unicode_codepoint_in_range(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfirst_unicode_codepoint_in_range(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange array_of_unicode_codepoints(@javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            narray_of_unicode_codepoints(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange num_chars(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_chars(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange chardata_for_range(@org.lwjgl.system.NativeType("stbtt_packedchar *") org.lwjgl.stb.STBTTPackedchar.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchardata_for_range(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange h_oversample(@org.lwjgl.system.NativeType("unsigned char") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nh_oversample(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange v_oversample(@org.lwjgl.system.NativeType("unsigned char") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nv_oversample(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange set(float r4, int r5, @javax.annotation.Nullable java.nio.IntBuffer r6, int r7, org.lwjgl.stb.STBTTPackedchar.Buffer r8, byte r9, byte r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBTTPackRange r0 = r0.font_size(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.stb.STBTTPackRange r0 = r0.first_unicode_codepoint_in_range(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.stb.STBTTPackRange r0 = r0.array_of_unicode_codepoints(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.stb.STBTTPackRange r0 = r0.num_chars(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.stb.STBTTPackRange r0 = r0.chardata_for_range(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.stb.STBTTPackRange r0 = r0.h_oversample(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.stb.STBTTPackRange r0 = r0.v_oversample(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.stb.STBTTPackRange set(org.lwjgl.stb.STBTTPackRange r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange malloc() {
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            int r2 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange calloc() {
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange create() {
            int r0 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange create(long r6) {
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTPackRange createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange.Buffer malloc(int r6) {
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = new org.lwjgl.stb.STBTTPackRange$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange.Buffer calloc(int r7) {
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = new org.lwjgl.stb.STBTTPackRange$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = new org.lwjgl.stb.STBTTPackRange$Buffer
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

    public static org.lwjgl.stb.STBTTPackRange.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = new org.lwjgl.stb.STBTTPackRange$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTPackRange.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = new org.lwjgl.stb.STBTTPackRange$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackRange r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackRange r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBTTPackRange r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBTTPackRange r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackRange.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTPackRange.ALIGNOF
            int r4 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBTTPackRange r0 = new org.lwjgl.stb.STBTTPackRange
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = new org.lwjgl.stb.STBTTPackRange$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTPackRange.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackRange.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTPackRange$Buffer r0 = new org.lwjgl.stb.STBTTPackRange$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTPackRange.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTPackRange.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static float nfont_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.FONT_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static int nfirst_unicode_codepoint_in_range(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer narray_of_unicode_codepoints(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nnum_chars(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static int nnum_chars(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.NUM_CHARS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackedchar.Buffer nchardata_for_range(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackRange.CHARDATA_FOR_RANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nnum_chars(r1)
            org.lwjgl.stb.STBTTPackedchar$Buffer r0 = org.lwjgl.stb.STBTTPackedchar.create(r0, r1)
            return r0
    }

    public static byte nh_oversample(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.H_OVERSAMPLE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nv_oversample(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.V_OVERSAMPLE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void nfont_size(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.FONT_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nfirst_unicode_codepoint_in_range(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void narray_of_unicode_codepoints(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nnum_chars(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.NUM_CHARS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nchardata_for_range(long r5, org.lwjgl.stb.STBTTPackedchar.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackRange.CHARDATA_FOR_RANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nh_oversample(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.H_OVERSAMPLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nv_oversample(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackRange.V_OVERSAMPLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackRange.CHARDATA_FOR_RANGE
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
            org.lwjgl.stb.STBTTPackRange r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
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
            int r3 = org.lwjgl.stb.STBTTPackRange.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.stb.STBTTPackRange.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.stb.STBTTPackRange.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.stb.STBTTPackRange.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackRange.FONT_SIZE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackRange.NUM_CHARS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackRange.CHARDATA_FOR_RANGE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackRange.H_OVERSAMPLE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackRange.V_OVERSAMPLE = r0
            return
    }
}
