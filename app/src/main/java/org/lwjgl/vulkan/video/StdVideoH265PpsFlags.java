package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags.class */
public class StdVideoH265PpsFlags extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265PpsFlags> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265PpsFlags$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265PpsFlags, org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265PpsFlags ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265PpsFlags getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean dependent_slice_segments_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ndependent_slice_segments_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean output_flag_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.noutput_flag_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean sign_data_hiding_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nsign_data_hiding_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean cabac_init_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ncabac_init_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean constrained_intra_pred_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nconstrained_intra_pred_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean transform_skip_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ntransform_skip_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean cu_qp_delta_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ncu_qp_delta_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_slice_chroma_qp_offsets_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_slice_chroma_qp_offsets_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean weighted_pred_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nweighted_pred_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean weighted_bipred_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nweighted_bipred_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean transquant_bypass_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ntransquant_bypass_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean tiles_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ntiles_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean entropy_coding_sync_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nentropy_coding_sync_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean uniform_spacing_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nuniform_spacing_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean loop_filter_across_tiles_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nloop_filter_across_tiles_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_loop_filter_across_slices_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_loop_filter_across_slices_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean deblocking_filter_control_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ndeblocking_filter_control_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean deblocking_filter_override_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ndeblocking_filter_override_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_deblocking_filter_disabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_deblocking_filter_disabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_scaling_list_data_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_scaling_list_data_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean lists_modification_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nlists_modification_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean slice_segment_header_extension_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nslice_segment_header_extension_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_extension_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_extension_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean cross_component_prediction_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ncross_component_prediction_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean chroma_qp_offset_list_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nchroma_qp_offset_list_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_curr_pic_ref_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_curr_pic_ref_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean residual_adaptive_colour_transform_enabled_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nresidual_adaptive_colour_transform_enabled_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_slice_act_qp_offsets_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_slice_act_qp_offsets_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_palette_predictor_initializers_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_palette_predictor_initializers_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean monochrome_palette_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nmonochrome_palette_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean pps_range_extension_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_range_extension_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer dependent_slice_segments_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ndependent_slice_segments_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer output_flag_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.noutput_flag_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer sign_data_hiding_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nsign_data_hiding_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer cabac_init_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ncabac_init_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer constrained_intra_pred_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nconstrained_intra_pred_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer transform_skip_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ntransform_skip_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer cu_qp_delta_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ncu_qp_delta_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_slice_chroma_qp_offsets_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_slice_chroma_qp_offsets_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer weighted_pred_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nweighted_pred_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer weighted_bipred_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nweighted_bipred_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer transquant_bypass_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ntransquant_bypass_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer tiles_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ntiles_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer entropy_coding_sync_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nentropy_coding_sync_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer uniform_spacing_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nuniform_spacing_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer loop_filter_across_tiles_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nloop_filter_across_tiles_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_loop_filter_across_slices_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_loop_filter_across_slices_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer deblocking_filter_control_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ndeblocking_filter_control_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer deblocking_filter_override_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ndeblocking_filter_override_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_deblocking_filter_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_deblocking_filter_disabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_scaling_list_data_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_scaling_list_data_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer lists_modification_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nlists_modification_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer slice_segment_header_extension_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nslice_segment_header_extension_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_extension_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_extension_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer cross_component_prediction_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ncross_component_prediction_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer chroma_qp_offset_list_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nchroma_qp_offset_list_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_curr_pic_ref_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_curr_pic_ref_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer residual_adaptive_colour_transform_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nresidual_adaptive_colour_transform_enabled_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_slice_act_qp_offsets_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_slice_act_qp_offsets_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_palette_predictor_initializers_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_palette_predictor_initializers_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer monochrome_palette_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.nmonochrome_palette_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer pps_range_extension_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.npps_range_extension_flag(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265PpsFlags(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265PpsFlags create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265PpsFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean dependent_slice_segments_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndependent_slice_segments_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean output_flag_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_flag_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean sign_data_hiding_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsign_data_hiding_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean cabac_init_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncabac_init_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean constrained_intra_pred_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nconstrained_intra_pred_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean transform_skip_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntransform_skip_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean cu_qp_delta_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncu_qp_delta_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_slice_chroma_qp_offsets_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_slice_chroma_qp_offsets_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean weighted_pred_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nweighted_pred_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean weighted_bipred_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nweighted_bipred_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean transquant_bypass_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntransquant_bypass_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean tiles_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntiles_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean entropy_coding_sync_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nentropy_coding_sync_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean uniform_spacing_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuniform_spacing_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean loop_filter_across_tiles_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nloop_filter_across_tiles_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_loop_filter_across_slices_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_loop_filter_across_slices_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean deblocking_filter_control_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndeblocking_filter_control_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean deblocking_filter_override_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndeblocking_filter_override_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_deblocking_filter_disabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_deblocking_filter_disabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_scaling_list_data_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_scaling_list_data_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean lists_modification_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlists_modification_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean slice_segment_header_extension_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nslice_segment_header_extension_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_extension_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_extension_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean cross_component_prediction_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncross_component_prediction_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean chroma_qp_offset_list_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nchroma_qp_offset_list_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_curr_pic_ref_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_curr_pic_ref_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean residual_adaptive_colour_transform_enabled_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresidual_adaptive_colour_transform_enabled_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_slice_act_qp_offsets_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_slice_act_qp_offsets_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_palette_predictor_initializers_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_palette_predictor_initializers_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean monochrome_palette_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmonochrome_palette_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean pps_range_extension_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npps_range_extension_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags dependent_slice_segments_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndependent_slice_segments_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags output_flag_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            noutput_flag_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags sign_data_hiding_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nsign_data_hiding_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags cabac_init_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ncabac_init_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags constrained_intra_pred_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nconstrained_intra_pred_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags transform_skip_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ntransform_skip_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags cu_qp_delta_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ncu_qp_delta_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_slice_chroma_qp_offsets_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_slice_chroma_qp_offsets_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags weighted_pred_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nweighted_pred_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags weighted_bipred_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nweighted_bipred_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags transquant_bypass_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ntransquant_bypass_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags tiles_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ntiles_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags entropy_coding_sync_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nentropy_coding_sync_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags uniform_spacing_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nuniform_spacing_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags loop_filter_across_tiles_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nloop_filter_across_tiles_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_loop_filter_across_slices_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_loop_filter_across_slices_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags deblocking_filter_control_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndeblocking_filter_control_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags deblocking_filter_override_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ndeblocking_filter_override_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_deblocking_filter_disabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_deblocking_filter_disabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_scaling_list_data_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_scaling_list_data_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags lists_modification_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nlists_modification_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags slice_segment_header_extension_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nslice_segment_header_extension_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_extension_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_extension_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags cross_component_prediction_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ncross_component_prediction_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags chroma_qp_offset_list_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nchroma_qp_offset_list_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_curr_pic_ref_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_curr_pic_ref_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags residual_adaptive_colour_transform_enabled_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nresidual_adaptive_colour_transform_enabled_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_slice_act_qp_offsets_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_slice_act_qp_offsets_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_palette_predictor_initializers_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_palette_predictor_initializers_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags monochrome_palette_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nmonochrome_palette_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags pps_range_extension_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            npps_range_extension_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.dependent_slice_segments_enabled_flag(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.output_flag_present_flag(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.sign_data_hiding_enabled_flag(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.cabac_init_present_flag(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.constrained_intra_pred_flag(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.transform_skip_enabled_flag(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.cu_qp_delta_enabled_flag(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_slice_chroma_qp_offsets_present_flag(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.weighted_pred_flag(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.weighted_bipred_flag(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.transquant_bypass_enabled_flag(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.tiles_enabled_flag(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.entropy_coding_sync_enabled_flag(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.uniform_spacing_flag(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.loop_filter_across_tiles_enabled_flag(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_loop_filter_across_slices_enabled_flag(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.deblocking_filter_control_present_flag(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.deblocking_filter_override_enabled_flag(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_deblocking_filter_disabled_flag(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_scaling_list_data_present_flag(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.lists_modification_present_flag(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.slice_segment_header_extension_present_flag(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_extension_present_flag(r1)
            r0 = r3
            r1 = r27
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.cross_component_prediction_enabled_flag(r1)
            r0 = r3
            r1 = r28
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.chroma_qp_offset_list_enabled_flag(r1)
            r0 = r3
            r1 = r29
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_curr_pic_ref_enabled_flag(r1)
            r0 = r3
            r1 = r30
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.residual_adaptive_colour_transform_enabled_flag(r1)
            r0 = r3
            r1 = r31
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_slice_act_qp_offsets_present_flag(r1)
            r0 = r3
            r1 = r32
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_palette_predictor_initializers_present_flag(r1)
            r0 = r3
            r1 = r33
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.monochrome_palette_flag(r1)
            r0 = r3
            r1 = r34
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.pps_range_extension_flag(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265PpsFlags set(org.lwjgl.vulkan.video.StdVideoH265PpsFlags r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags malloc() {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags calloc() {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265PpsFlags.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265PpsFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndependent_slice_segments_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1
            r0 = r0 & r1
            return r0
    }

    public static int noutput_flag_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
    }

    public static int nsign_data_hiding_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4
            r0 = r0 & r1
            r1 = 2
            int r0 = r0 >>> r1
            return r0
    }

    public static int ncabac_init_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8
            r0 = r0 & r1
            r1 = 3
            int r0 = r0 >>> r1
            return r0
    }

    public static int nconstrained_intra_pred_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 >>> r1
            return r0
    }

    public static int ntransform_skip_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32
            r0 = r0 & r1
            r1 = 5
            int r0 = r0 >>> r1
            return r0
    }

    public static int ncu_qp_delta_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 64
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_slice_chroma_qp_offsets_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            r1 = 7
            int r0 = r0 >>> r1
            return r0
    }

    public static int nweighted_pred_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >>> r1
            return r0
    }

    public static int nweighted_bipred_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            r1 = 9
            int r0 = r0 >>> r1
            return r0
    }

    public static int ntransquant_bypass_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            r1 = 10
            int r0 = r0 >>> r1
            return r0
    }

    public static int ntiles_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            r1 = 11
            int r0 = r0 >>> r1
            return r0
    }

    public static int nentropy_coding_sync_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            r1 = 12
            int r0 = r0 >>> r1
            return r0
    }

    public static int nuniform_spacing_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8192(0x2000, float:1.148E-41)
            r0 = r0 & r1
            r1 = 13
            int r0 = r0 >>> r1
            return r0
    }

    public static int nloop_filter_across_tiles_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            r1 = 14
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_loop_filter_across_slices_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            r1 = 15
            int r0 = r0 >>> r1
            return r0
    }

    public static int ndeblocking_filter_control_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >>> r1
            return r0
    }

    public static int ndeblocking_filter_override_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 17
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_deblocking_filter_disabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            r1 = 18
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_scaling_list_data_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            r1 = 19
            int r0 = r0 >>> r1
            return r0
    }

    public static int nlists_modification_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            r1 = 20
            int r0 = r0 >>> r1
            return r0
    }

    public static int nslice_segment_header_extension_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            r1 = 21
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_extension_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            r1 = 22
            int r0 = r0 >>> r1
            return r0
    }

    public static int ncross_component_prediction_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r1
            r1 = 23
            int r0 = r0 >>> r1
            return r0
    }

    public static int nchroma_qp_offset_list_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_curr_pic_ref_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r1
            r1 = 25
            int r0 = r0 >>> r1
            return r0
    }

    public static int nresidual_adaptive_colour_transform_enabled_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r1
            r1 = 26
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_slice_act_qp_offsets_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            r1 = 27
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_palette_predictor_initializers_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r0 & r1
            r1 = 28
            int r0 = r0 >>> r1
            return r0
    }

    public static int nmonochrome_palette_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            r1 = 29
            int r0 = r0 >>> r1
            return r0
    }

    public static int npps_range_extension_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r1
            r1 = 30
            int r0 = r0 >>> r1
            return r0
    }

    public static void nbitfield0(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265PpsFlags.BITFIELD0
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndependent_slice_segments_enabled_flag(long r6, int r8) {
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

    public static void noutput_flag_present_flag(long r6, int r8) {
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

    public static void nsign_data_hiding_enabled_flag(long r6, int r8) {
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

    public static void ncabac_init_present_flag(long r6, int r8) {
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

    public static void nconstrained_intra_pred_flag(long r6, int r8) {
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

    public static void ntransform_skip_enabled_flag(long r6, int r8) {
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

    public static void ncu_qp_delta_enabled_flag(long r6, int r8) {
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

    public static void npps_slice_chroma_qp_offsets_present_flag(long r6, int r8) {
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

    public static void nweighted_pred_flag(long r6, int r8) {
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

    public static void nweighted_bipred_flag(long r6, int r8) {
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

    public static void ntransquant_bypass_enabled_flag(long r6, int r8) {
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

    public static void ntiles_enabled_flag(long r6, int r8) {
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

    public static void nentropy_coding_sync_enabled_flag(long r6, int r8) {
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

    public static void nuniform_spacing_flag(long r6, int r8) {
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

    public static void nloop_filter_across_tiles_enabled_flag(long r6, int r8) {
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

    public static void npps_loop_filter_across_slices_enabled_flag(long r6, int r8) {
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

    public static void ndeblocking_filter_control_present_flag(long r6, int r8) {
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

    public static void ndeblocking_filter_override_enabled_flag(long r6, int r8) {
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

    public static void npps_deblocking_filter_disabled_flag(long r6, int r8) {
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

    public static void npps_scaling_list_data_present_flag(long r6, int r8) {
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

    public static void nlists_modification_present_flag(long r6, int r8) {
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

    public static void nslice_segment_header_extension_present_flag(long r6, int r8) {
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

    public static void npps_extension_present_flag(long r6, int r8) {
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

    public static void ncross_component_prediction_enabled_flag(long r6, int r8) {
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

    public static void nchroma_qp_offset_list_enabled_flag(long r6, int r8) {
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

    public static void npps_curr_pic_ref_enabled_flag(long r6, int r8) {
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

    public static void nresidual_adaptive_colour_transform_enabled_flag(long r6, int r8) {
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

    public static void npps_slice_act_qp_offsets_present_flag(long r6, int r8) {
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

    public static void npps_palette_predictor_initializers_present_flag(long r6, int r8) {
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

    public static void nmonochrome_palette_flag(long r6, int r8) {
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

    public static void npps_range_extension_flag(long r6, int r8) {
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
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags r0 = r0.create(r1, r2)
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
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265PpsFlags.BITFIELD0 = r0
            return
    }
}
