package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags.class */
public class StdVideoH264SpsVuiFlags extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH264SpsVuiFlags$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags, org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean aspect_ratio_info_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.naspect_ratio_info_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean overscan_info_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.noverscan_info_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean overscan_appropriate_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.noverscan_appropriate_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean video_signal_type_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nvideo_signal_type_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean video_full_range_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nvideo_full_range_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean color_description_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ncolor_description_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean chroma_loc_info_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nchroma_loc_info_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean timing_info_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ntiming_info_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean fixed_frame_rate_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nfixed_frame_rate_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean bitstream_restriction_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nbitstream_restriction_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean nal_hrd_parameters_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nnal_hrd_parameters_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean vcl_hrd_parameters_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nvcl_hrd_parameters_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer aspect_ratio_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.naspect_ratio_info_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer overscan_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.noverscan_info_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer overscan_appropriate_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.noverscan_appropriate_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer video_signal_type_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nvideo_signal_type_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer video_full_range_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nvideo_full_range_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer color_description_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ncolor_description_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer chroma_loc_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nchroma_loc_info_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer timing_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ntiming_info_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer fixed_frame_rate_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nfixed_frame_rate_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer bitstream_restriction_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nbitstream_restriction_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer nal_hrd_parameters_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nnal_hrd_parameters_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer vcl_hrd_parameters_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.nvcl_hrd_parameters_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.create(r0)
                org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH264SpsVuiFlags(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH264SpsVuiFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean aspect_ratio_info_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naspect_ratio_info_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean overscan_info_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noverscan_info_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean overscan_appropriate_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noverscan_appropriate_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean video_signal_type_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvideo_signal_type_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean video_full_range_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvideo_full_range_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean color_description_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncolor_description_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean chroma_loc_info_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nchroma_loc_info_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean timing_info_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntiming_info_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean fixed_frame_rate_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfixed_frame_rate_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean bitstream_restriction_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbitstream_restriction_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean nal_hrd_parameters_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnal_hrd_parameters_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean vcl_hrd_parameters_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvcl_hrd_parameters_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags aspect_ratio_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            naspect_ratio_info_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags overscan_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            noverscan_info_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags overscan_appropriate_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            noverscan_appropriate_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags video_signal_type_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nvideo_signal_type_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags video_full_range_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nvideo_full_range_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags color_description_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ncolor_description_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags chroma_loc_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nchroma_loc_info_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags timing_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ntiming_info_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags fixed_frame_rate_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nfixed_frame_rate_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags bitstream_restriction_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nbitstream_restriction_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags nal_hrd_parameters_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nnal_hrd_parameters_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags vcl_hrd_parameters_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nvcl_hrd_parameters_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.aspect_ratio_info_present_flag(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.overscan_info_present_flag(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.overscan_appropriate_flag(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.video_signal_type_present_flag(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.video_full_range_flag(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.color_description_present_flag(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.chroma_loc_info_present_flag(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.timing_info_present_flag(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.fixed_frame_rate_flag(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.bitstream_restriction_flag(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.nal_hrd_parameters_present_flag(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.vcl_hrd_parameters_present_flag(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags set(org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags malloc() {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags calloc() {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int naspect_ratio_info_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1
            r0 = r0 & r1
            return r0
    }

    public static int noverscan_info_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
    }

    public static int noverscan_appropriate_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4
            r0 = r0 & r1
            r1 = 2
            int r0 = r0 >>> r1
            return r0
    }

    public static int nvideo_signal_type_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8
            r0 = r0 & r1
            r1 = 3
            int r0 = r0 >>> r1
            return r0
    }

    public static int nvideo_full_range_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 >>> r1
            return r0
    }

    public static int ncolor_description_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32
            r0 = r0 & r1
            r1 = 5
            int r0 = r0 >>> r1
            return r0
    }

    public static int nchroma_loc_info_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 64
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 >>> r1
            return r0
    }

    public static int ntiming_info_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            r1 = 7
            int r0 = r0 >>> r1
            return r0
    }

    public static int nfixed_frame_rate_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >>> r1
            return r0
    }

    public static int nbitstream_restriction_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            r1 = 9
            int r0 = r0 >>> r1
            return r0
    }

    public static int nnal_hrd_parameters_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            r1 = 10
            int r0 = r0 >>> r1
            return r0
    }

    public static int nvcl_hrd_parameters_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            r1 = 11
            int r0 = r0 >>> r1
            return r0
    }

    public static void nbitfield0(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void naspect_ratio_info_present_flag(long r6, int r8) {
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

    public static void noverscan_info_present_flag(long r6, int r8) {
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

    public static void noverscan_appropriate_flag(long r6, int r8) {
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

    public static void nvideo_signal_type_present_flag(long r6, int r8) {
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

    public static void nvideo_full_range_flag(long r6, int r8) {
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

    public static void ncolor_description_present_flag(long r6, int r8) {
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

    public static void nchroma_loc_info_present_flag(long r6, int r8) {
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

    public static void ntiming_info_present_flag(long r6, int r8) {
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

    public static void nfixed_frame_rate_flag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 8
            int r1 = r1 << r2
            r2 = 256(0x100, float:3.59E-43)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -257(0xfffffffffffffeff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nbitstream_restriction_flag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 9
            int r1 = r1 << r2
            r2 = 512(0x200, float:7.17E-43)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -513(0xfffffffffffffdff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nnal_hrd_parameters_present_flag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 10
            int r1 = r1 << r2
            r2 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -1025(0xfffffffffffffbff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nvcl_hrd_parameters_present_flag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 11
            int r1 = r1 << r2
            r2 = 2048(0x800, float:2.87E-42)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -2049(0xfffffffffffff7ff, float:NaN)
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
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags r0 = r0.create(r1, r2)
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
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH264SpsVuiFlags.BITFIELD0 = r0
            return
    }
}
