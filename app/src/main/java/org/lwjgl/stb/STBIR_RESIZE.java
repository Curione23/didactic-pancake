package org.lwjgl.stb;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIR_RESIZE.class */
public class STBIR_RESIZE extends org.lwjgl.system.Struct<org.lwjgl.stb.STBIR_RESIZE> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int USER_DATA = 0;
    public static final int INPUT_PIXELS = 0;
    public static final int INPUT_W = 0;
    public static final int INPUT_H = 0;
    public static final int INPUT_S0 = 0;
    public static final int INPUT_T0 = 0;
    public static final int INPUT_S1 = 0;
    public static final int INPUT_T1 = 0;
    public static final int INPUT_CB = 0;
    public static final int OUTPUT_PIXELS = 0;
    public static final int OUTPUT_W = 0;
    public static final int OUTPUT_H = 0;
    public static final int OUTPUT_SUBX = 0;
    public static final int OUTPUT_SUBY = 0;
    public static final int OUTPUT_SUBW = 0;
    public static final int OUTPUT_SUBH = 0;
    public static final int OUTPUT_CB = 0;
    public static final int INPUT_STRIDE_IN_BYTES = 0;
    public static final int OUTPUT_STRIDE_IN_BYTES = 0;
    public static final int SPLITS = 0;
    public static final int FAST_ALPHA = 0;
    public static final int NEEDS_REBUILD = 0;
    public static final int CALLED_ALLOC = 0;
    public static final int INPUT_PIXEL_LAYOUT_PUBLIC = 0;
    public static final int OUTPUT_PIXEL_LAYOUT_PUBLIC = 0;
    public static final int INPUT_DATA_TYPE = 0;
    public static final int OUTPUT_DATA_TYPE = 0;
    public static final int HORIZONTAL_FILTER = 0;
    public static final int VERTICAL_FILTER = 0;
    public static final int HORIZONTAL_EDGE = 0;
    public static final int VERTICAL_EDGE = 0;
    public static final int HORIZONTAL_FILTER_KERNEL = 0;
    public static final int HORIZONTAL_FILTER_SUPPORT = 0;
    public static final int VERTICAL_FILTER_KERNEL = 0;
    public static final int VERTICAL_FILTER_SUPPORT = 0;
    public static final int SAMPLERS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIR_RESIZE$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBIR_RESIZE, org.lwjgl.stb.STBIR_RESIZE.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBIR_RESIZE ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
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
        protected org.lwjgl.stb.STBIR_RESIZE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.stb.STBIR_RESIZE.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
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
        protected org.lwjgl.stb.STBIR_RESIZE getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBIR_RESIZE r0 = org.lwjgl.stb.STBIR_RESIZE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long user_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.stb.STBIR_RESIZE.nuser_data(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public java.nio.ByteBuffer input_pixels(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_pixels(r0, r1)
                return r0
        }

        public int input_w() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_w(r0)
                return r0
        }

        public int input_h() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_h(r0)
                return r0
        }

        public double input_s0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                double r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_s0(r0)
                return r0
        }

        public double input_t0() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                double r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_t0(r0)
                return r0
        }

        public double input_s1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                double r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_s1(r0)
                return r0
        }

        public double input_t1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                double r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_t1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_input_callback **")
        public org.lwjgl.PointerBuffer input_cb(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_cb(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer output_pixels(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_pixels(r0, r1)
                return r0
        }

        public int output_w() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_w(r0)
                return r0
        }

        public int output_h() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_h(r0)
                return r0
        }

        public int output_subx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_subx(r0)
                return r0
        }

        public int output_suby() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_suby(r0)
                return r0
        }

        public int output_subw() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_subw(r0)
                return r0
        }

        public int output_subh() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_subh(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_output_callback **")
        public org.lwjgl.PointerBuffer output_cb(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_cb(r0, r1)
                return r0
        }

        public int input_stride_in_bytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_stride_in_bytes(r0)
                return r0
        }

        public int output_stride_in_bytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_stride_in_bytes(r0)
                return r0
        }

        public int splits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.nsplits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int")
        public boolean fast_alpha() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.nfast_alpha(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("int")
        public boolean needs_rebuild() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.nneeds_rebuild(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("int")
        public boolean called_alloc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.ncalled_alloc(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_pixel_layout")
        public int input_pixel_layout_public() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_pixel_layout_public(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_pixel_layout")
        public int output_pixel_layout_public() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_pixel_layout_public(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_datatype")
        public int input_data_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.ninput_data_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_datatype")
        public int output_data_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.noutput_data_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_filter")
        public int horizontal_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.nhorizontal_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_filter")
        public int vertical_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.nvertical_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_edge")
        public int horizontal_edge() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.nhorizontal_edge(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir_edge")
        public int vertical_edge() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBIR_RESIZE.nvertical_edge(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir__kernel_callback **")
        public org.lwjgl.PointerBuffer horizontal_filter_kernel(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.nhorizontal_filter_kernel(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir__support_callback **")
        public org.lwjgl.PointerBuffer horizontal_filter_support(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.nhorizontal_filter_support(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir__kernel_callback **")
        public org.lwjgl.PointerBuffer vertical_filter_kernel(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.nvertical_filter_kernel(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir__support_callback **")
        public org.lwjgl.PointerBuffer vertical_filter_support(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.stb.STBIR_RESIZE.nvertical_filter_support(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("stbir__info *")
        public long samplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.stb.STBIR_RESIZE.nsamplers(r0)
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer user_data(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.stb.STBIR_RESIZE.nuser_data(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_pixels(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.ninput_pixels(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_w(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.ninput_w(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_h(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.ninput_h(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_s0(double r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.stb.STBIR_RESIZE.ninput_s0(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_t0(double r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.stb.STBIR_RESIZE.ninput_t0(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_s1(double r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.stb.STBIR_RESIZE.ninput_s1(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_t1(double r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.stb.STBIR_RESIZE.ninput_t1(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_cb(@org.lwjgl.system.NativeType("stbir_input_callback **") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.ninput_cb(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_pixels(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_pixels(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_w(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_w(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_h(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_h(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_subx(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_subx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_suby(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_suby(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_subw(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_subw(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_subh(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_subh(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_cb(@org.lwjgl.system.NativeType("stbir_output_callback **") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_cb(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_stride_in_bytes(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.ninput_stride_in_bytes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_stride_in_bytes(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_stride_in_bytes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer splits(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nsplits(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer fast_alpha(@org.lwjgl.system.NativeType("int") boolean r5) {
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
                org.lwjgl.stb.STBIR_RESIZE.nfast_alpha(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer needs_rebuild(@org.lwjgl.system.NativeType("int") boolean r5) {
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
                org.lwjgl.stb.STBIR_RESIZE.nneeds_rebuild(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer called_alloc(@org.lwjgl.system.NativeType("int") boolean r5) {
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
                org.lwjgl.stb.STBIR_RESIZE.ncalled_alloc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_pixel_layout_public(@org.lwjgl.system.NativeType("stbir_pixel_layout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.ninput_pixel_layout_public(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_pixel_layout_public(@org.lwjgl.system.NativeType("stbir_pixel_layout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_pixel_layout_public(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer input_data_type(@org.lwjgl.system.NativeType("stbir_datatype") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.ninput_data_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer output_data_type(@org.lwjgl.system.NativeType("stbir_datatype") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.noutput_data_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer horizontal_filter(@org.lwjgl.system.NativeType("stbir_filter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nhorizontal_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer vertical_filter(@org.lwjgl.system.NativeType("stbir_filter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nvertical_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer horizontal_edge(@org.lwjgl.system.NativeType("stbir_edge") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nhorizontal_edge(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer vertical_edge(@org.lwjgl.system.NativeType("stbir_edge") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nvertical_edge(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer horizontal_filter_kernel(@org.lwjgl.system.NativeType("stbir__kernel_callback **") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nhorizontal_filter_kernel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer horizontal_filter_support(@org.lwjgl.system.NativeType("stbir__support_callback **") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nhorizontal_filter_support(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer vertical_filter_kernel(@org.lwjgl.system.NativeType("stbir__kernel_callback **") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nvertical_filter_kernel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer vertical_filter_support(@org.lwjgl.system.NativeType("stbir__support_callback **") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIR_RESIZE.nvertical_filter_support(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIR_RESIZE.Buffer samplers(@org.lwjgl.system.NativeType("stbir__info *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.stb.STBIR_RESIZE.nsamplers(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBIR_RESIZE r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3077create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBIR_RESIZE r0 = org.lwjgl.stb.STBIR_RESIZE.create(r0)
                org.lwjgl.stb.STBIR_RESIZE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected STBIR_RESIZE(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBIR_RESIZE create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBIR_RESIZE(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long user_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser_data(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public java.nio.ByteBuffer input_pixels(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = ninput_pixels(r0, r1)
            return r0
    }

    public int input_w() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninput_w(r0)
            return r0
    }

    public int input_h() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninput_h(r0)
            return r0
    }

    public double input_s0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            double r0 = ninput_s0(r0)
            return r0
    }

    public double input_t0() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            double r0 = ninput_t0(r0)
            return r0
    }

    public double input_s1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            double r0 = ninput_s1(r0)
            return r0
    }

    public double input_t1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            double r0 = ninput_t1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_input_callback **")
    public org.lwjgl.PointerBuffer input_cb(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = ninput_cb(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public java.nio.ByteBuffer output_pixels(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = noutput_pixels(r0, r1)
            return r0
    }

    public int output_w() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_w(r0)
            return r0
    }

    public int output_h() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_h(r0)
            return r0
    }

    public int output_subx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_subx(r0)
            return r0
    }

    public int output_suby() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_suby(r0)
            return r0
    }

    public int output_subw() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_subw(r0)
            return r0
    }

    public int output_subh() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_subh(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_output_callback **")
    public org.lwjgl.PointerBuffer output_cb(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = noutput_cb(r0, r1)
            return r0
    }

    public int input_stride_in_bytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninput_stride_in_bytes(r0)
            return r0
    }

    public int output_stride_in_bytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_stride_in_bytes(r0)
            return r0
    }

    public int splits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsplits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public boolean fast_alpha() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfast_alpha(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public boolean needs_rebuild() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nneeds_rebuild(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public boolean called_alloc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncalled_alloc(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_pixel_layout")
    public int input_pixel_layout_public() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninput_pixel_layout_public(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_pixel_layout")
    public int output_pixel_layout_public() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_pixel_layout_public(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_datatype")
    public int input_data_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninput_data_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_datatype")
    public int output_data_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noutput_data_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_filter")
    public int horizontal_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhorizontal_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_filter")
    public int vertical_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertical_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_edge")
    public int horizontal_edge() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhorizontal_edge(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir_edge")
    public int vertical_edge() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertical_edge(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir__kernel_callback **")
    public org.lwjgl.PointerBuffer horizontal_filter_kernel(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = nhorizontal_filter_kernel(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir__support_callback **")
    public org.lwjgl.PointerBuffer horizontal_filter_support(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = nhorizontal_filter_support(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir__kernel_callback **")
    public org.lwjgl.PointerBuffer vertical_filter_kernel(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = nvertical_filter_kernel(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir__support_callback **")
    public org.lwjgl.PointerBuffer vertical_filter_support(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = nvertical_filter_support(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("stbir__info *")
    public long samplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsamplers(r0)
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE user_data(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nuser_data(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_pixels(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput_pixels(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_w(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput_w(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_h(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput_h(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_s0(double r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ninput_s0(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_t0(double r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ninput_t0(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_s1(double r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ninput_s1(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_t1(double r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ninput_t1(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_cb(@org.lwjgl.system.NativeType("stbir_input_callback **") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput_cb(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_pixels(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_pixels(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_w(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_w(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_h(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_h(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_subx(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_subx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_suby(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_suby(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_subw(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_subw(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_subh(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_subh(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_cb(@org.lwjgl.system.NativeType("stbir_output_callback **") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_cb(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_stride_in_bytes(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput_stride_in_bytes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_stride_in_bytes(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_stride_in_bytes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE splits(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsplits(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE fast_alpha(@org.lwjgl.system.NativeType("int") boolean r5) {
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
            nfast_alpha(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE needs_rebuild(@org.lwjgl.system.NativeType("int") boolean r5) {
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
            nneeds_rebuild(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE called_alloc(@org.lwjgl.system.NativeType("int") boolean r5) {
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
            ncalled_alloc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_pixel_layout_public(@org.lwjgl.system.NativeType("stbir_pixel_layout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput_pixel_layout_public(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_pixel_layout_public(@org.lwjgl.system.NativeType("stbir_pixel_layout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_pixel_layout_public(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE input_data_type(@org.lwjgl.system.NativeType("stbir_datatype") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninput_data_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE output_data_type(@org.lwjgl.system.NativeType("stbir_datatype") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutput_data_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE horizontal_filter(@org.lwjgl.system.NativeType("stbir_filter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhorizontal_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE vertical_filter(@org.lwjgl.system.NativeType("stbir_filter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertical_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE horizontal_edge(@org.lwjgl.system.NativeType("stbir_edge") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhorizontal_edge(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE vertical_edge(@org.lwjgl.system.NativeType("stbir_edge") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertical_edge(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE horizontal_filter_kernel(@org.lwjgl.system.NativeType("stbir__kernel_callback **") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhorizontal_filter_kernel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE horizontal_filter_support(@org.lwjgl.system.NativeType("stbir__support_callback **") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhorizontal_filter_support(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE vertical_filter_kernel(@org.lwjgl.system.NativeType("stbir__kernel_callback **") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertical_filter_kernel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE vertical_filter_support(@org.lwjgl.system.NativeType("stbir__support_callback **") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertical_filter_support(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE samplers(@org.lwjgl.system.NativeType("stbir__info *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsamplers(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE set(long r5, java.nio.ByteBuffer r7, int r8, int r9, double r10, double r12, double r14, double r16, org.lwjgl.PointerBuffer r18, java.nio.ByteBuffer r19, int r20, int r21, int r22, int r23, int r24, int r25, org.lwjgl.PointerBuffer r26, int r27, int r28, int r29, boolean r30, boolean r31, boolean r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, org.lwjgl.PointerBuffer r41, org.lwjgl.PointerBuffer r42, org.lwjgl.PointerBuffer r43, org.lwjgl.PointerBuffer r44, long r45) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.user_data(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_pixels(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_w(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_h(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_s0(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_t0(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_s1(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_t1(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_cb(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_pixels(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_w(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_h(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_subx(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_suby(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_subw(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_subh(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_cb(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_stride_in_bytes(r1)
            r0 = r4
            r1 = r28
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_stride_in_bytes(r1)
            r0 = r4
            r1 = r29
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.splits(r1)
            r0 = r4
            r1 = r30
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.fast_alpha(r1)
            r0 = r4
            r1 = r31
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.needs_rebuild(r1)
            r0 = r4
            r1 = r32
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.called_alloc(r1)
            r0 = r4
            r1 = r33
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_pixel_layout_public(r1)
            r0 = r4
            r1 = r34
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_pixel_layout_public(r1)
            r0 = r4
            r1 = r35
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.input_data_type(r1)
            r0 = r4
            r1 = r36
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.output_data_type(r1)
            r0 = r4
            r1 = r37
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.horizontal_filter(r1)
            r0 = r4
            r1 = r38
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.vertical_filter(r1)
            r0 = r4
            r1 = r39
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.horizontal_edge(r1)
            r0 = r4
            r1 = r40
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.vertical_edge(r1)
            r0 = r4
            r1 = r41
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.horizontal_filter_kernel(r1)
            r0 = r4
            r1 = r42
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.horizontal_filter_support(r1)
            r0 = r4
            r1 = r43
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.vertical_filter_kernel(r1)
            r0 = r4
            r1 = r44
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.vertical_filter_support(r1)
            r0 = r4
            r1 = r45
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.samplers(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIR_RESIZE set(org.lwjgl.stb.STBIR_RESIZE r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE malloc() {
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            int r2 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE calloc() {
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE create() {
            int r0 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE create(long r6) {
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE.Buffer malloc(int r6) {
            org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE.Buffer calloc(int r7) {
            org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
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

    public static org.lwjgl.stb.STBIR_RESIZE.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBIR_RESIZE.ALIGNOF
            int r4 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBIR_RESIZE r0 = new org.lwjgl.stb.STBIR_RESIZE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBIR_RESIZE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBIR_RESIZE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIR_RESIZE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBIR_RESIZE$Buffer r0 = new org.lwjgl.stb.STBIR_RESIZE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBIR_RESIZE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBIR_RESIZE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nuser_data(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.USER_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer ninput_pixels(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static int ninput_w(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_W
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ninput_h(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_H
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static double ninput_s0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_S0
            long r1 = (long) r1
            long r0 = r0 + r1
            double r0 = org.lwjgl.system.MemoryUtil.memGetDouble(r0)
            return r0
    }

    public static double ninput_t0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_T0
            long r1 = (long) r1
            long r0 = r0 + r1
            double r0 = org.lwjgl.system.MemoryUtil.memGetDouble(r0)
            return r0
    }

    public static double ninput_s1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_S1
            long r1 = (long) r1
            long r0 = r0 + r1
            double r0 = org.lwjgl.system.MemoryUtil.memGetDouble(r0)
            return r0
    }

    public static double ninput_t1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_T1
            long r1 = (long) r1
            long r0 = r0 + r1
            double r0 = org.lwjgl.system.MemoryUtil.memGetDouble(r0)
            return r0
    }

    public static org.lwjgl.PointerBuffer ninput_cb(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_CB
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer noutput_pixels(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static int noutput_w(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_W
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_h(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_H
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_subx(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_suby(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_subw(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBW
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_subh(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBH
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.PointerBuffer noutput_cb(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_CB
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static int ninput_stride_in_bytes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_STRIDE_IN_BYTES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_stride_in_bytes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_STRIDE_IN_BYTES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsplits(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.SPLITS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nfast_alpha(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.FAST_ALPHA
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nneeds_rebuild(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.NEEDS_REBUILD
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ncalled_alloc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.CALLED_ALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ninput_pixel_layout_public(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_PIXEL_LAYOUT_PUBLIC
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_pixel_layout_public(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_PIXEL_LAYOUT_PUBLIC
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ninput_data_type(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_DATA_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noutput_data_type(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_DATA_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nhorizontal_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nvertical_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nhorizontal_edge(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_EDGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nvertical_edge(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_EDGE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.PointerBuffer nhorizontal_filter_kernel(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER_KERNEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer nhorizontal_filter_support(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER_SUPPORT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer nvertical_filter_kernel(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER_KERNEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.PointerBuffer nvertical_filter_support(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER_SUPPORT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static long nsamplers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.SAMPLERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nuser_data(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.USER_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ninput_pixels(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ninput_w(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_W
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ninput_h(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_H
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ninput_s0(long r5, double r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_S0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutDouble(r0, r1)
            return
    }

    public static void ninput_t0(long r5, double r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_T0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutDouble(r0, r1)
            return
    }

    public static void ninput_s1(long r5, double r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_S1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutDouble(r0, r1)
            return
    }

    public static void ninput_t1(long r5, double r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_T1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutDouble(r0, r1)
            return
    }

    public static void ninput_cb(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_CB
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void noutput_pixels(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void noutput_w(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_W
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_h(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_H
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_subx(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_suby(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_subw(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_subh(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_cb(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_CB
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ninput_stride_in_bytes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_STRIDE_IN_BYTES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_stride_in_bytes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_STRIDE_IN_BYTES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsplits(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.SPLITS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nfast_alpha(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.FAST_ALPHA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nneeds_rebuild(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.NEEDS_REBUILD
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncalled_alloc(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.CALLED_ALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ninput_pixel_layout_public(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_PIXEL_LAYOUT_PUBLIC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_pixel_layout_public(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_PIXEL_LAYOUT_PUBLIC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ninput_data_type(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_DATA_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noutput_data_type(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.OUTPUT_DATA_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nhorizontal_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nvertical_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nhorizontal_edge(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_EDGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nvertical_edge(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_EDGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nhorizontal_filter_kernel(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER_KERNEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nhorizontal_filter_support(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER_SUPPORT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvertical_filter_kernel(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER_KERNEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvertical_filter_support(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER_SUPPORT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsamplers(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.SAMPLERS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.INPUT_PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.stb.STBIR_RESIZE.SAMPLERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.stb.STBIR_RESIZE r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 36
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 35
            int r3 = org.lwjgl.stb.STBIR_RESIZE.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.stb.STBIR_RESIZE.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.stb.STBIR_RESIZE.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.USER_DATA = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_PIXELS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_W = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_H = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_S0 = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_T0 = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_S1 = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_T1 = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_CB = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_PIXELS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_W = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_H = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBX = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBY = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBW = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_SUBH = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_CB = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_STRIDE_IN_BYTES = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_STRIDE_IN_BYTES = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.SPLITS = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.FAST_ALPHA = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.NEEDS_REBUILD = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.CALLED_ALLOC = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_PIXEL_LAYOUT_PUBLIC = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_PIXEL_LAYOUT_PUBLIC = r0
            r0 = r5
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.INPUT_DATA_TYPE = r0
            r0 = r5
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.OUTPUT_DATA_TYPE = r0
            r0 = r5
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER = r0
            r0 = r5
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER = r0
            r0 = r5
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_EDGE = r0
            r0 = r5
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.VERTICAL_EDGE = r0
            r0 = r5
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER_KERNEL = r0
            r0 = r5
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.HORIZONTAL_FILTER_SUPPORT = r0
            r0 = r5
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER_KERNEL = r0
            r0 = r5
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.VERTICAL_FILTER_SUPPORT = r0
            r0 = r5
            r1 = 35
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIR_RESIZE.SAMPLERS = r0
            return
    }
}
