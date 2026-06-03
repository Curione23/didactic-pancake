package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags.class */
public class StdVideoH265SpsFlags extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265SpsFlags> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265SpsFlags$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265SpsFlags, org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265SpsFlags ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265SpsFlags getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_temporal_id_nesting_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_temporal_id_nesting_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean separate_colour_plane_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nseparate_colour_plane_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean conformance_window_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nconformance_window_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_sub_layer_ordering_info_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_sub_layer_ordering_info_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean scaling_list_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nscaling_list_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_scaling_list_data_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_scaling_list_data_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean amp_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.namp_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sample_adaptive_offset_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsample_adaptive_offset_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pcm_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npcm_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pcm_loop_filter_disabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npcm_loop_filter_disabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean long_term_ref_pics_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nlong_term_ref_pics_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_temporal_mvp_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_temporal_mvp_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean strong_intra_smoothing_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nstrong_intra_smoothing_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean vui_parameters_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nvui_parameters_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_extension_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_extension_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_range_extension_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_range_extension_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean transform_skip_rotation_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ntransform_skip_rotation_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean transform_skip_context_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ntransform_skip_context_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean implicit_rdpcm_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nimplicit_rdpcm_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean explicit_rdpcm_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nexplicit_rdpcm_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean extended_precision_processing_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nextended_precision_processing_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean intra_smoothing_disabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nintra_smoothing_disabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean high_precision_offsets_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nhigh_precision_offsets_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean persistent_rice_adaptation_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npersistent_rice_adaptation_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean cabac_bypass_alignment_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ncabac_bypass_alignment_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_scc_extension_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_scc_extension_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_curr_pic_ref_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_curr_pic_ref_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean palette_mode_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npalette_mode_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_palette_predictor_initializers_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_palette_predictor_initializers_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sps_palette_predictor_initializer_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_palette_predictor_initializer_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean intra_boundary_filtering_disabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nintra_boundary_filtering_disabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_temporal_id_nesting_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_temporal_id_nesting_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer separate_colour_plane_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nseparate_colour_plane_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer conformance_window_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nconformance_window_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_sub_layer_ordering_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_sub_layer_ordering_info_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer scaling_list_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nscaling_list_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_scaling_list_data_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_scaling_list_data_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer amp_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.namp_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sample_adaptive_offset_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsample_adaptive_offset_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer pcm_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npcm_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer pcm_loop_filter_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npcm_loop_filter_disabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer long_term_ref_pics_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nlong_term_ref_pics_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_temporal_mvp_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_temporal_mvp_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer strong_intra_smoothing_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nstrong_intra_smoothing_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer vui_parameters_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nvui_parameters_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_extension_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_extension_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_range_extension_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_range_extension_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer transform_skip_rotation_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ntransform_skip_rotation_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer transform_skip_context_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ntransform_skip_context_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer implicit_rdpcm_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nimplicit_rdpcm_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer explicit_rdpcm_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nexplicit_rdpcm_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer extended_precision_processing_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nextended_precision_processing_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer intra_smoothing_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nintra_smoothing_disabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer high_precision_offsets_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nhigh_precision_offsets_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer persistent_rice_adaptation_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npersistent_rice_adaptation_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer cabac_bypass_alignment_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ncabac_bypass_alignment_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_scc_extension_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_scc_extension_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_curr_pic_ref_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_curr_pic_ref_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer palette_mode_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.npalette_mode_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_palette_predictor_initializers_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_palette_predictor_initializers_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer sps_palette_predictor_initializer_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nsps_palette_predictor_initializer_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer intra_boundary_filtering_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.nintra_boundary_filtering_disabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265SpsFlags(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265SpsFlags create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265SpsFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_temporal_id_nesting_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_temporal_id_nesting_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean separate_colour_plane_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nseparate_colour_plane_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean conformance_window_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconformance_window_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_sub_layer_ordering_info_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_sub_layer_ordering_info_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean scaling_list_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nscaling_list_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_scaling_list_data_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_scaling_list_data_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean amp_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = namp_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sample_adaptive_offset_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsample_adaptive_offset_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pcm_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npcm_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pcm_loop_filter_disabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npcm_loop_filter_disabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean long_term_ref_pics_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlong_term_ref_pics_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_temporal_mvp_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_temporal_mvp_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean strong_intra_smoothing_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstrong_intra_smoothing_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean vui_parameters_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvui_parameters_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_extension_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_extension_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_range_extension_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_range_extension_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean transform_skip_rotation_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntransform_skip_rotation_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean transform_skip_context_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntransform_skip_context_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean implicit_rdpcm_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimplicit_rdpcm_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean explicit_rdpcm_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nexplicit_rdpcm_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean extended_precision_processing_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nextended_precision_processing_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean intra_smoothing_disabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintra_smoothing_disabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean high_precision_offsets_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhigh_precision_offsets_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean persistent_rice_adaptation_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npersistent_rice_adaptation_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean cabac_bypass_alignment_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncabac_bypass_alignment_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_scc_extension_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_scc_extension_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_curr_pic_ref_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_curr_pic_ref_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean palette_mode_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npalette_mode_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_palette_predictor_initializers_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_palette_predictor_initializers_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sps_palette_predictor_initializer_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsps_palette_predictor_initializer_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean intra_boundary_filtering_disabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintra_boundary_filtering_disabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_temporal_id_nesting_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_temporal_id_nesting_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags separate_colour_plane_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nseparate_colour_plane_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags conformance_window_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nconformance_window_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_sub_layer_ordering_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_sub_layer_ordering_info_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags scaling_list_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nscaling_list_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_scaling_list_data_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_scaling_list_data_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags amp_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            namp_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sample_adaptive_offset_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsample_adaptive_offset_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags pcm_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npcm_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags pcm_loop_filter_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npcm_loop_filter_disabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags long_term_ref_pics_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nlong_term_ref_pics_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_temporal_mvp_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_temporal_mvp_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags strong_intra_smoothing_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nstrong_intra_smoothing_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags vui_parameters_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nvui_parameters_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_extension_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_extension_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_range_extension_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_range_extension_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags transform_skip_rotation_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ntransform_skip_rotation_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags transform_skip_context_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ntransform_skip_context_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags implicit_rdpcm_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nimplicit_rdpcm_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags explicit_rdpcm_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nexplicit_rdpcm_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags extended_precision_processing_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nextended_precision_processing_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags intra_smoothing_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nintra_smoothing_disabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags high_precision_offsets_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nhigh_precision_offsets_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags persistent_rice_adaptation_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npersistent_rice_adaptation_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags cabac_bypass_alignment_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ncabac_bypass_alignment_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_scc_extension_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_scc_extension_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_curr_pic_ref_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_curr_pic_ref_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags palette_mode_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npalette_mode_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_palette_predictor_initializers_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_palette_predictor_initializers_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags sps_palette_predictor_initializer_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsps_palette_predictor_initializer_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags intra_boundary_filtering_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nintra_boundary_filtering_disabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_temporal_id_nesting_flag(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.separate_colour_plane_flag(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.conformance_window_flag(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_sub_layer_ordering_info_present_flag(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.scaling_list_enabled_flag(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_scaling_list_data_present_flag(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.amp_enabled_flag(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sample_adaptive_offset_enabled_flag(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.pcm_enabled_flag(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.pcm_loop_filter_disabled_flag(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.long_term_ref_pics_present_flag(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_temporal_mvp_enabled_flag(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.strong_intra_smoothing_enabled_flag(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.vui_parameters_present_flag(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_extension_present_flag(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_range_extension_flag(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.transform_skip_rotation_enabled_flag(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.transform_skip_context_enabled_flag(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.implicit_rdpcm_enabled_flag(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.explicit_rdpcm_enabled_flag(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.extended_precision_processing_flag(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.intra_smoothing_disabled_flag(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.high_precision_offsets_enabled_flag(r1)
            r0 = r3
            r1 = r27
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.persistent_rice_adaptation_enabled_flag(r1)
            r0 = r3
            r1 = r28
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.cabac_bypass_alignment_enabled_flag(r1)
            r0 = r3
            r1 = r29
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_scc_extension_flag(r1)
            r0 = r3
            r1 = r30
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_curr_pic_ref_enabled_flag(r1)
            r0 = r3
            r1 = r31
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.palette_mode_enabled_flag(r1)
            r0 = r3
            r1 = r32
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_palette_predictor_initializers_present_flag(r1)
            r0 = r3
            r1 = r33
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.sps_palette_predictor_initializer_present_flag(r1)
            r0 = r3
            r1 = r34
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.intra_boundary_filtering_disabled_flag(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265SpsFlags set(org.lwjgl.vulkan.video.StdVideoH265SpsFlags r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags malloc() {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags calloc() {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265SpsFlags.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265SpsFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsps_temporal_id_nesting_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1
            r0 = r0 & r1
            return r0
    }

    public static int nseparate_colour_plane_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
    }

    public static int nconformance_window_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4
            r0 = r0 & r1
            r1 = 2
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_sub_layer_ordering_info_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8
            r0 = r0 & r1
            r1 = 3
            int r0 = r0 >>> r1
            return r0
    }

    public static int nscaling_list_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_scaling_list_data_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32
            r0 = r0 & r1
            r1 = 5
            int r0 = r0 >>> r1
            return r0
    }

    public static int namp_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 64
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsample_adaptive_offset_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            r1 = 7
            int r0 = r0 >>> r1
            return r0
    }

    public static int npcm_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >>> r1
            return r0
    }

    public static int npcm_loop_filter_disabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            r1 = 9
            int r0 = r0 >>> r1
            return r0
    }

    public static int nlong_term_ref_pics_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            r1 = 10
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_temporal_mvp_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            r1 = 11
            int r0 = r0 >>> r1
            return r0
    }

    public static int nstrong_intra_smoothing_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            r1 = 12
            int r0 = r0 >>> r1
            return r0
    }

    public static int nvui_parameters_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8192(0x2000, float:1.148E-41)
            r0 = r0 & r1
            r1 = 13
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_extension_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            r1 = 14
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_range_extension_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            r1 = 15
            int r0 = r0 >>> r1
            return r0
    }

    public static int ntransform_skip_rotation_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >>> r1
            return r0
    }

    public static int ntransform_skip_context_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 17
            int r0 = r0 >>> r1
            return r0
    }

    public static int nimplicit_rdpcm_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            r1 = 18
            int r0 = r0 >>> r1
            return r0
    }

    public static int nexplicit_rdpcm_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            r1 = 19
            int r0 = r0 >>> r1
            return r0
    }

    public static int nextended_precision_processing_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            r1 = 20
            int r0 = r0 >>> r1
            return r0
    }

    public static int nintra_smoothing_disabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            r1 = 21
            int r0 = r0 >>> r1
            return r0
    }

    public static int nhigh_precision_offsets_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            r1 = 22
            int r0 = r0 >>> r1
            return r0
    }

    public static int npersistent_rice_adaptation_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r1
            r1 = 23
            int r0 = r0 >>> r1
            return r0
    }

    public static int ncabac_bypass_alignment_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_scc_extension_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r1
            r1 = 25
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_curr_pic_ref_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r1
            r1 = 26
            int r0 = r0 >>> r1
            return r0
    }

    public static int npalette_mode_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            r1 = 27
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_palette_predictor_initializers_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r0 & r1
            r1 = 28
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsps_palette_predictor_initializer_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            r1 = 29
            int r0 = r0 >>> r1
            return r0
    }

    public static int nintra_boundary_filtering_disabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r1
            r1 = 30
            int r0 = r0 >>> r1
            return r0
    }

    public static void nbitfield0(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265SpsFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsps_temporal_id_nesting_flag(long r6, int r8) {
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

    public static void nseparate_colour_plane_flag(long r6, int r8) {
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

    public static void nconformance_window_flag(long r6, int r8) {
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

    public static void nsps_sub_layer_ordering_info_present_flag(long r6, int r8) {
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

    public static void nscaling_list_enabled_flag(long r6, int r8) {
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

    public static void nsps_scaling_list_data_present_flag(long r6, int r8) {
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

    public static void namp_enabled_flag(long r6, int r8) {
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

    public static void nsample_adaptive_offset_enabled_flag(long r6, int r8) {
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

    public static void npcm_enabled_flag(long r6, int r8) {
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

    public static void npcm_loop_filter_disabled_flag(long r6, int r8) {
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

    public static void nlong_term_ref_pics_present_flag(long r6, int r8) {
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

    public static void nsps_temporal_mvp_enabled_flag(long r6, int r8) {
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

    public static void nstrong_intra_smoothing_enabled_flag(long r6, int r8) {
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

    public static void nvui_parameters_present_flag(long r6, int r8) {
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

    public static void nsps_extension_present_flag(long r6, int r8) {
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

    public static void nsps_range_extension_flag(long r6, int r8) {
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

    public static void ntransform_skip_rotation_enabled_flag(long r6, int r8) {
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

    public static void ntransform_skip_context_enabled_flag(long r6, int r8) {
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

    public static void nimplicit_rdpcm_enabled_flag(long r6, int r8) {
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

    public static void nexplicit_rdpcm_enabled_flag(long r6, int r8) {
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

    public static void nextended_precision_processing_flag(long r6, int r8) {
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

    public static void nintra_smoothing_disabled_flag(long r6, int r8) {
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

    public static void nhigh_precision_offsets_enabled_flag(long r6, int r8) {
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

    public static void npersistent_rice_adaptation_enabled_flag(long r6, int r8) {
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

    public static void ncabac_bypass_alignment_enabled_flag(long r6, int r8) {
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

    public static void nsps_scc_extension_flag(long r6, int r8) {
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

    public static void nsps_curr_pic_ref_enabled_flag(long r6, int r8) {
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

    public static void npalette_mode_enabled_flag(long r6, int r8) {
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

    public static void nsps_palette_predictor_initializers_present_flag(long r6, int r8) {
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

    public static void nsps_palette_predictor_initializer_present_flag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 29
            int r1 = r1 << r2
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nintra_boundary_filtering_disabled_flag(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 30
            int r1 = r1 << r2
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
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
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags r0 = r0.create(r1, r2)
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
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265SpsFlags.BITFIELD0 = r0
            return
    }
}
