package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1PictureInfoFlags.class */
public class StdVideoDecodeAV1PictureInfoFlags extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;
    public static final int BITFIELD1 = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1PictureInfoFlags$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags, org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean error_resilient_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nerror_resilient_mode(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean disable_cdf_update() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndisable_cdf_update(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean use_superres() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nuse_superres(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean render_and_frame_size_different() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nrender_and_frame_size_different(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean allow_screen_content_tools() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_screen_content_tools(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean is_filter_switchable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nis_filter_switchable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean force_integer_mv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nforce_integer_mv(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean frame_size_override_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nframe_size_override_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean buffer_removal_time_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nbuffer_removal_time_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean allow_intrabc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_intrabc(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean frame_refs_short_signaling() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nframe_refs_short_signaling(r0)
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
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_high_precision_mv(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean is_motion_mode_switchable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nis_motion_mode_switchable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean use_ref_frame_mvs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nuse_ref_frame_mvs(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean disable_frame_end_update_cdf() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndisable_frame_end_update_cdf(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean allow_warped_motion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_warped_motion(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean reduced_tx_set() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nreduced_tx_set(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean reference_select() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nreference_select(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean skip_mode_present() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nskip_mode_present(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean delta_q_present() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndelta_q_present(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean delta_lf_present() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_present(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean delta_lf_multi() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_multi(r0)
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
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_enabled(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean segmentation_update_map() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_map(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean segmentation_temporal_update() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_temporal_update(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean segmentation_update_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_data(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean UsesLr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nUsesLr(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean usesChromaLr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nusesChromaLr(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean apply_grain() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.napply_grain(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer error_resilient_mode(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nerror_resilient_mode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer disable_cdf_update(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndisable_cdf_update(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer use_superres(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nuse_superres(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer render_and_frame_size_different(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nrender_and_frame_size_different(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer allow_screen_content_tools(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_screen_content_tools(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer is_filter_switchable(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nis_filter_switchable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer force_integer_mv(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nforce_integer_mv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer frame_size_override_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nframe_size_override_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer buffer_removal_time_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nbuffer_removal_time_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer allow_intrabc(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_intrabc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer frame_refs_short_signaling(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nframe_refs_short_signaling(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer allow_high_precision_mv(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_high_precision_mv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer is_motion_mode_switchable(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nis_motion_mode_switchable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer use_ref_frame_mvs(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nuse_ref_frame_mvs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer disable_frame_end_update_cdf(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndisable_frame_end_update_cdf(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer allow_warped_motion(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nallow_warped_motion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer reduced_tx_set(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nreduced_tx_set(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer reference_select(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nreference_select(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer skip_mode_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nskip_mode_present(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer delta_q_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndelta_q_present(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer delta_lf_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_present(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer delta_lf_multi(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_multi(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_enabled(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_enabled(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_update_map(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_map(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_temporal_update(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_temporal_update(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_update_data(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_data(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer UsesLr(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nUsesLr(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer usesChromaLr(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.nusesChromaLr(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer apply_grain(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.napply_grain(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7391create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.create(r0)
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoDecodeAV1PictureInfoFlags(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoDecodeAV1PictureInfoFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
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
    public boolean disable_cdf_update() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndisable_cdf_update(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean use_superres() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuse_superres(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean render_and_frame_size_different() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrender_and_frame_size_different(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean allow_screen_content_tools() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nallow_screen_content_tools(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean is_filter_switchable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nis_filter_switchable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean force_integer_mv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nforce_integer_mv(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean frame_size_override_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_size_override_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean buffer_removal_time_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbuffer_removal_time_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean allow_intrabc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nallow_intrabc(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean frame_refs_short_signaling() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_refs_short_signaling(r0)
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
    public boolean is_motion_mode_switchable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nis_motion_mode_switchable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean use_ref_frame_mvs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuse_ref_frame_mvs(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean disable_frame_end_update_cdf() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndisable_frame_end_update_cdf(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean allow_warped_motion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nallow_warped_motion(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean reduced_tx_set() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nreduced_tx_set(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean reference_select() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nreference_select(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean skip_mode_present() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nskip_mode_present(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean delta_q_present() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndelta_q_present(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean delta_lf_present() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndelta_lf_present(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean delta_lf_multi() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndelta_lf_multi(r0)
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
    public boolean segmentation_update_map() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsegmentation_update_map(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean segmentation_temporal_update() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsegmentation_temporal_update(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean segmentation_update_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsegmentation_update_data(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean UsesLr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nUsesLr(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean usesChromaLr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nusesChromaLr(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean apply_grain() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = napply_grain(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags error_resilient_mode(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags disable_cdf_update(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndisable_cdf_update(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags use_superres(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nuse_superres(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags render_and_frame_size_different(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nrender_and_frame_size_different(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags allow_screen_content_tools(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nallow_screen_content_tools(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags is_filter_switchable(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nis_filter_switchable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags force_integer_mv(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nforce_integer_mv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags frame_size_override_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nframe_size_override_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags buffer_removal_time_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nbuffer_removal_time_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags allow_intrabc(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nallow_intrabc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags frame_refs_short_signaling(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nframe_refs_short_signaling(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags allow_high_precision_mv(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags is_motion_mode_switchable(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nis_motion_mode_switchable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags use_ref_frame_mvs(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nuse_ref_frame_mvs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags disable_frame_end_update_cdf(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndisable_frame_end_update_cdf(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags allow_warped_motion(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nallow_warped_motion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags reduced_tx_set(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nreduced_tx_set(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags reference_select(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nreference_select(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags skip_mode_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nskip_mode_present(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags delta_q_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndelta_q_present(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags delta_lf_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndelta_lf_present(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags delta_lf_multi(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndelta_lf_multi(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags segmentation_enabled(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags segmentation_update_map(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsegmentation_update_map(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags segmentation_temporal_update(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsegmentation_temporal_update(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags segmentation_update_data(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsegmentation_update_data(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags UsesLr(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nUsesLr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags usesChromaLr(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nusesChromaLr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags apply_grain(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            napply_grain(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.error_resilient_mode(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.disable_cdf_update(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.use_superres(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.render_and_frame_size_different(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.allow_screen_content_tools(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.is_filter_switchable(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.force_integer_mv(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.frame_size_override_flag(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.buffer_removal_time_present_flag(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.allow_intrabc(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.frame_refs_short_signaling(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.allow_high_precision_mv(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.is_motion_mode_switchable(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.use_ref_frame_mvs(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.disable_frame_end_update_cdf(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.allow_warped_motion(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.reduced_tx_set(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.reference_select(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.skip_mode_present(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.delta_q_present(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.delta_lf_present(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.delta_lf_multi(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.segmentation_enabled(r1)
            r0 = r3
            r1 = r27
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.segmentation_update_map(r1)
            r0 = r3
            r1 = r28
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.segmentation_temporal_update(r1)
            r0 = r3
            r1 = r29
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.segmentation_update_data(r1)
            r0 = r3
            r1 = r30
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.UsesLr(r1)
            r0 = r3
            r1 = r31
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.usesChromaLr(r1)
            r0 = r3
            r1 = r32
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.apply_grain(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags set(org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags malloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags calloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags create(long r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.BITFIELD0
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

    public static int ndisable_cdf_update(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
    }

    public static int nuse_superres(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4
            r0 = r0 & r1
            r1 = 2
            int r0 = r0 >>> r1
            return r0
    }

    public static int nrender_and_frame_size_different(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8
            r0 = r0 & r1
            r1 = 3
            int r0 = r0 >>> r1
            return r0
    }

    public static int nallow_screen_content_tools(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 >>> r1
            return r0
    }

    public static int nis_filter_switchable(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32
            r0 = r0 & r1
            r1 = 5
            int r0 = r0 >>> r1
            return r0
    }

    public static int nforce_integer_mv(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 64
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 >>> r1
            return r0
    }

    public static int nframe_size_override_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            r1 = 7
            int r0 = r0 >>> r1
            return r0
    }

    public static int nbuffer_removal_time_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >>> r1
            return r0
    }

    public static int nallow_intrabc(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            r1 = 9
            int r0 = r0 >>> r1
            return r0
    }

    public static int nframe_refs_short_signaling(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            r1 = 10
            int r0 = r0 >>> r1
            return r0
    }

    public static int nallow_high_precision_mv(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            r1 = 11
            int r0 = r0 >>> r1
            return r0
    }

    public static int nis_motion_mode_switchable(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            r1 = 12
            int r0 = r0 >>> r1
            return r0
    }

    public static int nuse_ref_frame_mvs(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8192(0x2000, float:1.148E-41)
            r0 = r0 & r1
            r1 = 13
            int r0 = r0 >>> r1
            return r0
    }

    public static int ndisable_frame_end_update_cdf(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            r1 = 14
            int r0 = r0 >>> r1
            return r0
    }

    public static int nallow_warped_motion(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            r1 = 15
            int r0 = r0 >>> r1
            return r0
    }

    public static int nreduced_tx_set(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >>> r1
            return r0
    }

    public static int nreference_select(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 17
            int r0 = r0 >>> r1
            return r0
    }

    public static int nskip_mode_present(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            r1 = 18
            int r0 = r0 >>> r1
            return r0
    }

    public static int ndelta_q_present(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            r1 = 19
            int r0 = r0 >>> r1
            return r0
    }

    public static int ndelta_lf_present(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            r1 = 20
            int r0 = r0 >>> r1
            return r0
    }

    public static int ndelta_lf_multi(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            r1 = 21
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsegmentation_enabled(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            r1 = 22
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsegmentation_update_map(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r1
            r1 = 23
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsegmentation_temporal_update(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsegmentation_update_data(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r1
            r1 = 25
            int r0 = r0 >>> r1
            return r0
    }

    public static int nUsesLr(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r1
            r1 = 26
            int r0 = r0 >>> r1
            return r0
    }

    public static int nusesChromaLr(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            r1 = 27
            int r0 = r0 >>> r1
            return r0
    }

    public static int napply_grain(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r0 & r1
            r1 = 28
            int r0 = r0 >>> r1
            return r0
    }

    public static int nbitfield1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.BITFIELD1
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nreserved(long r3) {
            r0 = r3
            int r0 = nbitfield1(r0)
            r1 = 7
            r0 = r0 & r1
            return r0
    }

    public static void nbitfield0(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.BITFIELD0
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

    public static void ndisable_cdf_update(long r6, int r8) {
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

    public static void nuse_superres(long r6, int r8) {
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

    public static void nrender_and_frame_size_different(long r6, int r8) {
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

    public static void nallow_screen_content_tools(long r6, int r8) {
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

    public static void nis_filter_switchable(long r6, int r8) {
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

    public static void nforce_integer_mv(long r6, int r8) {
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

    public static void nframe_size_override_flag(long r6, int r8) {
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

    public static void nbuffer_removal_time_present_flag(long r6, int r8) {
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

    public static void nallow_intrabc(long r6, int r8) {
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

    public static void nframe_refs_short_signaling(long r6, int r8) {
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

    public static void nallow_high_precision_mv(long r6, int r8) {
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

    public static void nis_motion_mode_switchable(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 12
            int r1 = r1 << r2
            r2 = 4096(0x1000, float:5.74E-42)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -4097(0xffffffffffffefff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nuse_ref_frame_mvs(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 13
            int r1 = r1 << r2
            r2 = 8192(0x2000, float:1.148E-41)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -8193(0xffffffffffffdfff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void ndisable_frame_end_update_cdf(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 14
            int r1 = r1 << r2
            r2 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -16385(0xffffffffffffbfff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nallow_warped_motion(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 15
            int r1 = r1 << r2
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -32769(0xffffffffffff7fff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nreduced_tx_set(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 16
            int r1 = r1 << r2
            r2 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nreference_select(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 17
            int r1 = r1 << r2
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -131073(0xfffffffffffdffff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nskip_mode_present(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 18
            int r1 = r1 << r2
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -262145(0xfffffffffffbffff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void ndelta_q_present(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 19
            int r1 = r1 << r2
            r2 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -524289(0xfffffffffff7ffff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void ndelta_lf_present(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 20
            int r1 = r1 << r2
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -1048577(0xffffffffffefffff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void ndelta_lf_multi(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 21
            int r1 = r1 << r2
            r2 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -2097153(0xffffffffffdfffff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nsegmentation_enabled(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 22
            int r1 = r1 << r2
            r2 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -4194305(0xffffffffffbfffff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nsegmentation_update_map(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 23
            int r1 = r1 << r2
            r2 = 8388608(0x800000, float:1.1754944E-38)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nsegmentation_temporal_update(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 24
            int r1 = r1 << r2
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nsegmentation_update_data(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 25
            int r1 = r1 << r2
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nUsesLr(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 26
            int r1 = r1 << r2
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nusesChromaLr(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 27
            int r1 = r1 << r2
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void napply_grain(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 28
            int r1 = r1 << r2
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nbitfield1(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.BITFIELD1
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
            r2 = -8
            r1 = r1 & r2
            r2 = r8
            r3 = 7
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
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = r0.create(r1, r2)
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
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.BITFIELD0 = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.BITFIELD1 = r0
            return
    }
}
