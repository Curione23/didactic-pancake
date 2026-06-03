package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfoFlags.class */
public class StdVideoDecodeVP9PictureInfoFlags extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;
    public static final int BITFIELD1 = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeVP9PictureInfoFlags$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags, org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean error_resilient_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nerror_resilient_mode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean intra_only() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nintra_only(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean allow_high_precision_mv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nallow_high_precision_mv(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean refresh_frame_context() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nrefresh_frame_context(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean frame_parallel_decoding_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nframe_parallel_decoding_mode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean segmentation_enabled() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nsegmentation_enabled(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean show_frame() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nshow_frame(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean UsePrevFrameMvs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nUsePrevFrameMvs(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer error_resilient_mode(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nerror_resilient_mode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer intra_only(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nintra_only(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer allow_high_precision_mv(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nallow_high_precision_mv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer refresh_frame_context(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nrefresh_frame_context(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer frame_parallel_decoding_mode(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nframe_parallel_decoding_mode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer segmentation_enabled(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nsegmentation_enabled(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer show_frame(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nshow_frame(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer UsePrevFrameMvs(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.nUsePrevFrameMvs(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7419create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.create(r0)
                org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoDecodeVP9PictureInfoFlags(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoDecodeVP9PictureInfoFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean error_resilient_mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nerror_resilient_mode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean intra_only() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintra_only(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean allow_high_precision_mv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nallow_high_precision_mv(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean refresh_frame_context() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrefresh_frame_context(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean frame_parallel_decoding_mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_parallel_decoding_mode(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean segmentation_enabled() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsegmentation_enabled(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean show_frame() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshow_frame(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean UsePrevFrameMvs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nUsePrevFrameMvs(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags error_resilient_mode(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nerror_resilient_mode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags intra_only(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nintra_only(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags allow_high_precision_mv(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nallow_high_precision_mv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags refresh_frame_context(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nrefresh_frame_context(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags frame_parallel_decoding_mode(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nframe_parallel_decoding_mode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags segmentation_enabled(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsegmentation_enabled(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags show_frame(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nshow_frame(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags UsePrevFrameMvs(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nUsePrevFrameMvs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.error_resilient_mode(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.intra_only(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.allow_high_precision_mv(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.refresh_frame_context(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.frame_parallel_decoding_mode(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.segmentation_enabled(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.show_frame(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.UsePrevFrameMvs(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags set(org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags malloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags calloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags create(long r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nerror_resilient_mode(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1
            r0 = r0 & r1
            return r0
    }

    public static int nintra_only(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
    }

    public static int nallow_high_precision_mv(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4
            r0 = r0 & r1
            r1 = 2
            int r0 = r0 >>> r1
            return r0
    }

    public static int nrefresh_frame_context(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8
            r0 = r0 & r1
            r1 = 3
            int r0 = r0 >>> r1
            return r0
    }

    public static int nframe_parallel_decoding_mode(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsegmentation_enabled(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32
            r0 = r0 & r1
            r1 = 5
            int r0 = r0 >>> r1
            return r0
    }

    public static int nshow_frame(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 64
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 >>> r1
            return r0
    }

    public static int nUsePrevFrameMvs(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            r1 = 7
            int r0 = r0 >>> r1
            return r0
    }

    public static int nbitfield1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.BITFIELD1
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nreserved(long r3) {
            r0 = r3
            int r0 = nbitfield1(r0)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    public static void nbitfield0(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nerror_resilient_mode(long r6, int r8) {
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

    public static void nintra_only(long r6, int r8) {
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

    public static void nallow_high_precision_mv(long r6, int r8) {
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

    public static void nrefresh_frame_context(long r6, int r8) {
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

    public static void nframe_parallel_decoding_mode(long r6, int r8) {
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

    public static void nsegmentation_enabled(long r6, int r8) {
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

    public static void nshow_frame(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 6
            int r1 = r1 << r2
            r2 = 64
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -65
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nUsePrevFrameMvs(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 7
            int r1 = r1 << r2
            r2 = 128(0x80, float:1.8E-43)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -129(0xffffffffffffff7f, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nbitfield1(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.BITFIELD1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nreserved(long r6, int r8) {
            r0 = r6
            r1 = r6
            int r1 = nbitfield1(r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r2
            r2 = r8
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield1(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.BITFIELD0 = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeVP9PictureInfoFlags.BITFIELD1 = r0
            return
    }
}
