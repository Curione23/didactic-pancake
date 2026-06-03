package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags.class */
public class StdVideoDecodeH264PictureInfoFlags extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfoFlags$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags, org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean field_pic_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nfield_pic_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean is_intra() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nis_intra(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean IdrPicFlag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nIdrPicFlag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean bottom_field_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nbottom_field_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean is_reference() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nis_reference(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean complementary_field_pair() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.ncomplementary_field_pair(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer field_pic_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nfield_pic_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer is_intra(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nis_intra(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer IdrPicFlag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nIdrPicFlag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer bottom_field_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nbottom_field_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer is_reference(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.nis_reference(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer complementary_field_pair(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.ncomplementary_field_pair(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.create(r0)
                org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoDecodeH264PictureInfoFlags(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoDecodeH264PictureInfoFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean field_pic_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfield_pic_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean is_intra() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nis_intra(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean IdrPicFlag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nIdrPicFlag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean bottom_field_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbottom_field_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean is_reference() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nis_reference(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean complementary_field_pair() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncomplementary_field_pair(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags field_pic_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nfield_pic_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags is_intra(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nis_intra(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags IdrPicFlag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nIdrPicFlag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags bottom_field_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nbottom_field_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags is_reference(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nis_reference(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags complementary_field_pair(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            ncomplementary_field_pair(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.field_pic_flag(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.is_intra(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.IdrPicFlag(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.bottom_field_flag(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.is_reference(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.complementary_field_pair(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags set(org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags malloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags calloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags create(long r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfield_pic_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1
            r0 = r0 & r1
            return r0
    }

    public static int nis_intra(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
    }

    public static int nIdrPicFlag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4
            r0 = r0 & r1
            r1 = 2
            int r0 = r0 >>> r1
            return r0
    }

    public static int nbottom_field_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8
            r0 = r0 & r1
            r1 = 3
            int r0 = r0 >>> r1
            return r0
    }

    public static int nis_reference(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 >>> r1
            return r0
    }

    public static int ncomplementary_field_pair(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32
            r0 = r0 & r1
            r1 = 5
            int r0 = r0 >>> r1
            return r0
    }

    public static void nbitfield0(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfield_pic_flag(long r6, int r8) {
            r0 = r6
            r1 = r6
            int r1 = nbitfield0(r1)
            r2 = -2
            r1 = r1 & r2
            r2 = r8
            r3 = 1
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nis_intra(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 << r2
            r2 = 2
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -3
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nIdrPicFlag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 2
            int r1 = r1 << r2
            r2 = 4
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -5
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nbottom_field_flag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 3
            int r1 = r1 << r2
            r2 = 8
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -9
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nis_reference(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 4
            int r1 = r1 << r2
            r2 = 16
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -17
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void ncomplementary_field_pair(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 5
            int r1 = r1 << r2
            r2 = 32
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -33
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 1
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeH264PictureInfoFlags.BITFIELD0 = r0
            return
    }
}
