package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries.class */
public class StdVideoH265PredictorPaletteEntries extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PREDICTORPALETTEENTRIES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PredictorPaletteEntries$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries, org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]")
        public java.nio.ShortBuffer PredictorPaletteEntries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short PredictorPaletteEntries(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer PredictorPaletteEntries(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer PredictorPaletteEntries(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265PredictorPaletteEntries(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265PredictorPaletteEntries(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]")
    public java.nio.ShortBuffer PredictorPaletteEntries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nPredictorPaletteEntries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short PredictorPaletteEntries(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nPredictorPaletteEntries(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nPredictorPaletteEntries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nPredictorPaletteEntries(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries set(org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries malloc() {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries calloc() {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ShortBuffer nPredictorPaletteEntries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 128(0x80, float:1.8E-43)
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nPredictorPaletteEntries(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 128(0x80, float:1.8E-43)
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static void nPredictorPaletteEntries(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Ld
            r0 = r9
            r1 = 128(0x80, float:1.8E-43)
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Ld:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nPredictorPaletteEntries(long r9, int r11, short r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 128(0x80, float:1.8E-43)
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putShort(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 1
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            r4 = 128(0x80, float:1.8E-43)
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES = r0
            return
    }
}
