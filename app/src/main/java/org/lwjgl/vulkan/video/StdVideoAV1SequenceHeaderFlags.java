package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeaderFlags.class */
public class StdVideoAV1SequenceHeaderFlags extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;
    public static final int BITFIELD1 = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1SequenceHeaderFlags$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags, org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean still_picture() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nstill_picture(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean reduced_still_picture_header() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nreduced_still_picture_header(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean use_128x128_superblock() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nuse_128x128_superblock(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_filter_intra() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_filter_intra(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_intra_edge_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_intra_edge_filter(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_interintra_compound() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_interintra_compound(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_masked_compound() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_masked_compound(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_warped_motion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_warped_motion(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_dual_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_dual_filter(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_order_hint() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_order_hint(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_jnt_comp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_jnt_comp(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_ref_frame_mvs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_ref_frame_mvs(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean frame_id_numbers_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nframe_id_numbers_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_superres() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_superres(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_cdef() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_cdef(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean enable_restoration() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_restoration(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean film_grain_params_present() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nfilm_grain_params_present(r0)
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
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ntiming_info_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public boolean initial_display_delay_present_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ninitial_display_delay_present_flag(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer still_picture(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nstill_picture(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer reduced_still_picture_header(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nreduced_still_picture_header(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer use_128x128_superblock(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nuse_128x128_superblock(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_filter_intra(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_filter_intra(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_intra_edge_filter(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_intra_edge_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_interintra_compound(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_interintra_compound(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_masked_compound(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_masked_compound(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_warped_motion(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_warped_motion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_dual_filter(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_dual_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_order_hint(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_order_hint(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_jnt_comp(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_jnt_comp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_ref_frame_mvs(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_ref_frame_mvs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer frame_id_numbers_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nframe_id_numbers_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_superres(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_superres(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_cdef(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_cdef(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer enable_restoration(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nenable_restoration(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer film_grain_params_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.nfilm_grain_params_present(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer timing_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ntiming_info_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer initial_display_delay_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ninitial_display_delay_present_flag(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7373create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1SequenceHeaderFlags(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1SequenceHeaderFlags(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean still_picture() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstill_picture(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean reduced_still_picture_header() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nreduced_still_picture_header(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean use_128x128_superblock() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuse_128x128_superblock(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_filter_intra() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_filter_intra(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_intra_edge_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_intra_edge_filter(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_interintra_compound() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_interintra_compound(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_masked_compound() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_masked_compound(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_warped_motion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_warped_motion(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_dual_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_dual_filter(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_order_hint() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_order_hint(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_jnt_comp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_jnt_comp(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_ref_frame_mvs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_ref_frame_mvs(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean frame_id_numbers_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_id_numbers_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_superres() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_superres(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_cdef() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_cdef(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean enable_restoration() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenable_restoration(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public boolean film_grain_params_present() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfilm_grain_params_present(r0)
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
    public boolean initial_display_delay_present_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninitial_display_delay_present_flag(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags still_picture(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nstill_picture(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags reduced_still_picture_header(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nreduced_still_picture_header(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags use_128x128_superblock(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nuse_128x128_superblock(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_filter_intra(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_filter_intra(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_intra_edge_filter(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_intra_edge_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_interintra_compound(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_interintra_compound(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_masked_compound(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_masked_compound(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_warped_motion(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_warped_motion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_dual_filter(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_dual_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_order_hint(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_order_hint(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_jnt_comp(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_jnt_comp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_ref_frame_mvs(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_ref_frame_mvs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags frame_id_numbers_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nframe_id_numbers_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_superres(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_superres(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_cdef(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_cdef(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags enable_restoration(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nenable_restoration(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags film_grain_params_present(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            nfilm_grain_params_present(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags timing_info_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags initial_display_delay_present_flag(@org.lwjgl.system.NativeType("uint32_t") boolean r5) {
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
            ninitial_display_delay_present_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags set(boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.still_picture(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.reduced_still_picture_header(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.use_128x128_superblock(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_filter_intra(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_intra_edge_filter(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_interintra_compound(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_masked_compound(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_warped_motion(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_dual_filter(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_order_hint(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_jnt_comp(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_ref_frame_mvs(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.frame_id_numbers_present_flag(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_superres(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_cdef(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.enable_restoration(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.film_grain_params_present(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.timing_info_present_flag(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.initial_display_delay_present_flag(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags set(org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nstill_picture(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1
            r0 = r0 & r1
            return r0
    }

    public static int nreduced_still_picture_header(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
    }

    public static int nuse_128x128_superblock(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4
            r0 = r0 & r1
            r1 = 2
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_filter_intra(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8
            r0 = r0 & r1
            r1 = 3
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_intra_edge_filter(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_interintra_compound(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32
            r0 = r0 & r1
            r1 = 5
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_masked_compound(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 64
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_warped_motion(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            r1 = 7
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_dual_filter(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_order_hint(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            r1 = 9
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_jnt_comp(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            r1 = 10
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_ref_frame_mvs(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            r1 = 11
            int r0 = r0 >>> r1
            return r0
    }

    public static int nframe_id_numbers_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            r1 = 12
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_superres(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 8192(0x2000, float:1.148E-41)
            r0 = r0 & r1
            r1 = 13
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_cdef(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            r1 = 14
            int r0 = r0 >>> r1
            return r0
    }

    public static int nenable_restoration(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            r1 = 15
            int r0 = r0 >>> r1
            return r0
    }

    public static int nfilm_grain_params_present(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >>> r1
            return r0
    }

    public static int ntiming_info_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 17
            int r0 = r0 >>> r1
            return r0
    }

    public static int ninitial_display_delay_present_flag(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            r1 = 18
            int r0 = r0 >>> r1
            return r0
    }

    public static int nbitfield1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.BITFIELD1
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nreserved(long r3) {
            r0 = r3
            int r0 = nbitfield1(r0)
            r1 = 8191(0x1fff, float:1.1478E-41)
            r0 = r0 & r1
            return r0
    }

    public static void nbitfield0(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nstill_picture(long r6, int r8) {
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

    public static void nreduced_still_picture_header(long r6, int r8) {
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

    public static void nuse_128x128_superblock(long r6, int r8) {
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

    public static void nenable_filter_intra(long r6, int r8) {
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

    public static void nenable_intra_edge_filter(long r6, int r8) {
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

    public static void nenable_interintra_compound(long r6, int r8) {
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

    public static void nenable_masked_compound(long r6, int r8) {
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

    public static void nenable_warped_motion(long r6, int r8) {
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

    public static void nenable_dual_filter(long r6, int r8) {
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

    public static void nenable_order_hint(long r6, int r8) {
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

    public static void nenable_jnt_comp(long r6, int r8) {
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

    public static void nenable_ref_frame_mvs(long r6, int r8) {
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

    public static void nframe_id_numbers_present_flag(long r6, int r8) {
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

    public static void nenable_superres(long r6, int r8) {
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

    public static void nenable_cdef(long r6, int r8) {
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

    public static void nenable_restoration(long r6, int r8) {
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

    public static void nfilm_grain_params_present(long r6, int r8) {
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

    public static void ntiming_info_present_flag(long r6, int r8) {
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

    public static void ninitial_display_delay_present_flag(long r6, int r8) {
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

    public static void nbitfield1(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.BITFIELD1
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
            r2 = -8192(0xffffffffffffe000, float:NaN)
            r1 = r1 & r2
            r2 = r8
            r3 = 8191(0x1fff, float:1.1478E-41)
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
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags r0 = r0.create(r1, r2)
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
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.BITFIELD0 = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1SequenceHeaderFlags.BITFIELD1 = r0
            return
    }
}
