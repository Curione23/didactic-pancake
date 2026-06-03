package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1FilmGrain.class */
public class StdVideoAV1FilmGrain extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1FilmGrain> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int GRAIN_SCALING_MINUS_8 = 0;
    public static final int AR_COEFF_LAG = 0;
    public static final int AR_COEFF_SHIFT_MINUS_6 = 0;
    public static final int GRAIN_SCALE_SHIFT = 0;
    public static final int GRAIN_SEED = 0;
    public static final int FILM_GRAIN_PARAMS_REF_IDX = 0;
    public static final int NUM_Y_POINTS = 0;
    public static final int POINT_Y_VALUE = 0;
    public static final int POINT_Y_SCALING = 0;
    public static final int NUM_CB_POINTS = 0;
    public static final int POINT_CB_VALUE = 0;
    public static final int POINT_CB_SCALING = 0;
    public static final int NUM_CR_POINTS = 0;
    public static final int POINT_CR_VALUE = 0;
    public static final int POINT_CR_SCALING = 0;
    public static final int AR_COEFFS_Y_PLUS_128 = 0;
    public static final int AR_COEFFS_CB_PLUS_128 = 0;
    public static final int AR_COEFFS_CR_PLUS_128 = 0;
    public static final int CB_MULT = 0;
    public static final int CB_LUMA_MULT = 0;
    public static final int CB_OFFSET = 0;
    public static final int CR_MULT = 0;
    public static final int CR_LUMA_MULT = 0;
    public static final int CR_OFFSET = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1FilmGrain$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1FilmGrain, org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1FilmGrain getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte grain_scaling_minus_8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ngrain_scaling_minus_8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ar_coeff_lag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeff_lag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ar_coeff_shift_minus_6() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeff_shift_minus_6(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte grain_scale_shift() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ngrain_scale_shift(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short grain_seed() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ngrain_seed(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte film_grain_params_ref_idx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nfilm_grain_params_ref_idx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_y_points() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nnum_y_points(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
        public java.nio.ByteBuffer point_y_value() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_value(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte point_y_value(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_value(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
        public java.nio.ByteBuffer point_y_scaling() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_scaling(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte point_y_scaling(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_scaling(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_cb_points() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nnum_cb_points(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
        public java.nio.ByteBuffer point_cb_value() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_value(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte point_cb_value(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_value(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
        public java.nio.ByteBuffer point_cb_scaling() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_scaling(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte point_cb_scaling(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_scaling(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte num_cr_points() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nnum_cr_points(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
        public java.nio.ByteBuffer point_cr_value() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_value(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte point_cr_value(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_value(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
        public java.nio.ByteBuffer point_cr_scaling() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_scaling(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte point_cr_scaling(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_scaling(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]")
        public java.nio.ByteBuffer ar_coeffs_y_plus_128() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte ar_coeffs_y_plus_128(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
        public java.nio.ByteBuffer ar_coeffs_cb_plus_128() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte ar_coeffs_cb_plus_128(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
        public java.nio.ByteBuffer ar_coeffs_cr_plus_128() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte ar_coeffs_cr_plus_128(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cb_mult() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncb_mult(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cb_luma_mult() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncb_luma_mult(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short cb_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncb_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cr_mult() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncr_mult(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte cr_luma_mult() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncr_luma_mult(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short cr_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncr_offset(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer flags(org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer grain_scaling_minus_8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ngrain_scaling_minus_8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeff_lag(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeff_lag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeff_shift_minus_6(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeff_shift_minus_6(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer grain_scale_shift(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ngrain_scale_shift(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer grain_seed(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ngrain_seed(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer film_grain_params_ref_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nfilm_grain_params_ref_idx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer num_y_points(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nnum_y_points(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_y_value(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_value(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_y_value(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_value(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_y_scaling(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_scaling(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_y_scaling(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_y_scaling(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer num_cb_points(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nnum_cb_points(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cb_value(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_value(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cb_value(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_value(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cb_scaling(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_scaling(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cb_scaling(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cb_scaling(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer num_cr_points(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nnum_cr_points(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cr_value(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_value(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cr_value(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_value(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cr_scaling(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_scaling(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer point_cr_scaling(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.npoint_cr_scaling(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeffs_y_plus_128(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeffs_y_plus_128(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_y_plus_128(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeffs_cb_plus_128(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeffs_cb_plus_128(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cb_plus_128(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeffs_cr_plus_128(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer ar_coeffs_cr_plus_128(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.nar_coeffs_cr_plus_128(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer cb_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncb_mult(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer cb_luma_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncb_luma_mult(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer cb_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncb_offset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer cr_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncr_mult(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer cr_luma_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncr_luma_mult(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer cr_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ncr_offset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7343create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1FilmGrain(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1FilmGrain create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1FilmGrain(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte grain_scaling_minus_8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ngrain_scaling_minus_8(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ar_coeff_lag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nar_coeff_lag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ar_coeff_shift_minus_6() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nar_coeff_shift_minus_6(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte grain_scale_shift() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ngrain_scale_shift(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short grain_seed() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ngrain_seed(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte film_grain_params_ref_idx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nfilm_grain_params_ref_idx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_y_points() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_y_points(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
    public java.nio.ByteBuffer point_y_value() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npoint_y_value(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte point_y_value(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npoint_y_value(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]")
    public java.nio.ByteBuffer point_y_scaling() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npoint_y_scaling(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte point_y_scaling(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npoint_y_scaling(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_cb_points() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_cb_points(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
    public java.nio.ByteBuffer point_cb_value() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npoint_cb_value(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte point_cb_value(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npoint_cb_value(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]")
    public java.nio.ByteBuffer point_cb_scaling() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npoint_cb_scaling(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte point_cb_scaling(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npoint_cb_scaling(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte num_cr_points() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_cr_points(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
    public java.nio.ByteBuffer point_cr_value() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npoint_cr_value(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte point_cr_value(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npoint_cr_value(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]")
    public java.nio.ByteBuffer point_cr_scaling() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npoint_cr_scaling(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte point_cr_scaling(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = npoint_cr_scaling(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]")
    public java.nio.ByteBuffer ar_coeffs_y_plus_128() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nar_coeffs_y_plus_128(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte ar_coeffs_y_plus_128(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nar_coeffs_y_plus_128(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
    public java.nio.ByteBuffer ar_coeffs_cb_plus_128() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nar_coeffs_cb_plus_128(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte ar_coeffs_cb_plus_128(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nar_coeffs_cb_plus_128(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]")
    public java.nio.ByteBuffer ar_coeffs_cr_plus_128() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nar_coeffs_cr_plus_128(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte ar_coeffs_cr_plus_128(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nar_coeffs_cr_plus_128(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cb_mult() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncb_mult(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cb_luma_mult() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncb_luma_mult(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short cb_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ncb_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cr_mult() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncr_mult(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte cr_luma_mult() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncr_luma_mult(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short cr_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ncr_offset(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain flags(org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain grain_scaling_minus_8(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngrain_scaling_minus_8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeff_lag(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nar_coeff_lag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeff_shift_minus_6(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nar_coeff_shift_minus_6(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain grain_scale_shift(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngrain_scale_shift(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain grain_seed(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngrain_seed(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain film_grain_params_ref_idx(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfilm_grain_params_ref_idx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain num_y_points(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_y_points(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_y_value(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoint_y_value(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_y_value(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npoint_y_value(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_y_scaling(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_Y_POINTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoint_y_scaling(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_y_scaling(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npoint_y_scaling(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain num_cb_points(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_cb_points(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cb_value(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoint_cb_value(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cb_value(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npoint_cb_value(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cb_scaling(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CB_POINTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoint_cb_scaling(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cb_scaling(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npoint_cb_scaling(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain num_cr_points(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_cr_points(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cr_value(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoint_cr_value(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cr_value(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npoint_cr_value(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cr_scaling(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_NUM_CR_POINTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npoint_cr_scaling(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain point_cr_scaling(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            npoint_cr_scaling(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeffs_y_plus_128(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_LUMA]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nar_coeffs_y_plus_128(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeffs_y_plus_128(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nar_coeffs_y_plus_128(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nar_coeffs_cb_plus_128(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nar_coeffs_cb_plus_128(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_MAX_NUM_POS_CHROMA]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nar_coeffs_cr_plus_128(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nar_coeffs_cr_plus_128(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain cb_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncb_mult(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain cb_luma_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncb_luma_mult(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain cb_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncb_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain cr_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncr_mult(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain cr_luma_mult(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncr_luma_mult(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain cr_offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncr_offset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain set(org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r4, byte r5, byte r6, byte r7, byte r8, short r9, byte r10, byte r11, java.nio.ByteBuffer r12, java.nio.ByteBuffer r13, byte r14, java.nio.ByteBuffer r15, java.nio.ByteBuffer r16, byte r17, java.nio.ByteBuffer r18, java.nio.ByteBuffer r19, java.nio.ByteBuffer r20, java.nio.ByteBuffer r21, java.nio.ByteBuffer r22, byte r23, byte r24, short r25, byte r26, byte r27, short r28) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.grain_scaling_minus_8(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.ar_coeff_lag(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.ar_coeff_shift_minus_6(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.grain_scale_shift(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.grain_seed(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.film_grain_params_ref_idx(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.num_y_points(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.point_y_value(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.point_y_scaling(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.num_cb_points(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.point_cb_value(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.point_cb_scaling(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.num_cr_points(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.point_cr_value(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.point_cr_scaling(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.ar_coeffs_y_plus_128(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.ar_coeffs_cb_plus_128(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.ar_coeffs_cr_plus_128(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.cb_mult(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.cb_luma_mult(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.cb_offset(r1)
            r0 = r3
            r1 = r26
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.cr_mult(r1)
            r0 = r3
            r1 = r27
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.cr_luma_mult(r1)
            r0 = r3
            r1 = r28
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.cr_offset(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain set(org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1FilmGrain$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags.create(r0)
            return r0
    }

    public static byte ngrain_scaling_minus_8(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SCALING_MINUS_8
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nar_coeff_lag(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFF_LAG
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nar_coeff_shift_minus_6(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFF_SHIFT_MINUS_6
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ngrain_scale_shift(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SCALE_SHIFT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static short ngrain_seed(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SEED
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static byte nfilm_grain_params_ref_idx(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.FILM_GRAIN_PARAMS_REF_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nnum_y_points(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_Y_POINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer npoint_y_value(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 14
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npoint_y_value(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 14
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer npoint_y_scaling(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 14
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npoint_y_scaling(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 14
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nnum_cb_points(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_CB_POINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer npoint_cb_value(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npoint_cb_value(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer npoint_cb_scaling(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npoint_cb_scaling(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nnum_cr_points(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_CR_POINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer npoint_cr_value(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npoint_cr_value(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer npoint_cr_scaling(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte npoint_cr_scaling(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nar_coeffs_y_plus_128(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 24
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nar_coeffs_y_plus_128(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 24
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nar_coeffs_cb_plus_128(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 25
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nar_coeffs_cb_plus_128(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 25
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nar_coeffs_cr_plus_128(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 25
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nar_coeffs_cr_plus_128(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 25
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ncb_mult(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ncb_luma_mult(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_LUMA_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static short ncb_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static byte ncr_mult(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ncr_luma_mult(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_LUMA_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static short ncr_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ngrain_scaling_minus_8(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SCALING_MINUS_8
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nar_coeff_lag(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFF_LAG
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nar_coeff_shift_minus_6(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFF_SHIFT_MINUS_6
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ngrain_scale_shift(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SCALE_SHIFT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ngrain_seed(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SEED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nfilm_grain_params_ref_idx(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.FILM_GRAIN_PARAMS_REF_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nnum_y_points(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_Y_POINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npoint_y_value(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 14
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_VALUE
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npoint_y_value(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 14
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npoint_y_scaling(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 14
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_SCALING
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npoint_y_scaling(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 14
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nnum_cb_points(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_CB_POINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npoint_cb_value(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 10
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_VALUE
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npoint_cb_value(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npoint_cb_scaling(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 10
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_SCALING
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npoint_cb_scaling(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nnum_cr_points(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_CR_POINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npoint_cr_value(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 10
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_VALUE
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npoint_cr_value(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_VALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void npoint_cr_scaling(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 10
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_SCALING
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npoint_cr_scaling(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_SCALING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 10
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nar_coeffs_y_plus_128(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 24
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nar_coeffs_y_plus_128(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 24
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nar_coeffs_cb_plus_128(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 25
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nar_coeffs_cb_plus_128(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 25
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nar_coeffs_cr_plus_128(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 25
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nar_coeffs_cr_plus_128(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 25
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncb_mult(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncb_luma_mult(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_LUMA_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncb_offset(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void ncr_mult(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncr_luma_mult(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_LUMA_MULT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncr_offset(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 25
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrainFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            r4 = 14
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            r4 = 14
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            r4 = 10
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            r4 = 10
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            r4 = 10
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 1
            r4 = 10
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 1
            r4 = 24
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 1
            r4 = 25
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 1
            r4 = 25
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SCALING_MINUS_8 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFF_LAG = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFF_SHIFT_MINUS_6 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SCALE_SHIFT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.GRAIN_SEED = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.FILM_GRAIN_PARAMS_REF_IDX = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_Y_POINTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_VALUE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_Y_SCALING = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_CB_POINTS = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_VALUE = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CB_SCALING = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.NUM_CR_POINTS = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_VALUE = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.POINT_CR_SCALING = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_Y_PLUS_128 = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CB_PLUS_128 = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.AR_COEFFS_CR_PLUS_128 = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_MULT = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_LUMA_MULT = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CB_OFFSET = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_MULT = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_LUMA_MULT = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.CR_OFFSET = r0
            return
    }
}
