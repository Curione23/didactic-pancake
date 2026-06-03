package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1PictureInfo.class */
public class StdVideoDecodeAV1PictureInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int FRAME_TYPE = 0;
    public static final int CURRENT_FRAME_ID = 0;
    public static final int ORDERHINT = 0;
    public static final int PRIMARY_REF_FRAME = 0;
    public static final int REFRESH_FRAME_FLAGS = 0;
    public static final int RESERVED1 = 0;
    public static final int INTERPOLATION_FILTER = 0;
    public static final int TXMODE = 0;
    public static final int DELTA_Q_RES = 0;
    public static final int DELTA_LF_RES = 0;
    public static final int SKIPMODEFRAME = 0;
    public static final int CODED_DENOM = 0;
    public static final int RESERVED2 = 0;
    public static final int ORDERHINTS = 0;
    public static final int EXPECTEDFRAMEID = 0;
    public static final int PTILEINFO = 0;
    public static final int PQUANTIZATION = 0;
    public static final int PSEGMENTATION = 0;
    public static final int PLOOPFILTER = 0;
    public static final int PCDEF = 0;
    public static final int PLOOPRESTORATION = 0;
    public static final int PGLOBALMOTION = 0;
    public static final int PFILMGRAIN = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1PictureInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo, org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1FrameType")
        public int frame_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nframe_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int current_frame_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ncurrent_frame_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte OrderHint() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nOrderHint(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte primary_ref_frame() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nprimary_ref_frame(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte refresh_frame_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nrefresh_frame_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1InterpolationFilter")
        public int interpolation_filter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ninterpolation_filter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1TxMode")
        public int TxMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nTxMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte delta_q_res() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ndelta_q_res(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte delta_lf_res() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ndelta_lf_res(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]")
        public java.nio.ByteBuffer SkipModeFrame() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nSkipModeFrame(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte SkipModeFrame(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nSkipModeFrame(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte coded_denom() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ncoded_denom(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public java.nio.ByteBuffer OrderHints() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nOrderHints(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte OrderHints(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nOrderHints(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public java.nio.IntBuffer expectedFrameId() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nexpectedFrameId(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int expectedFrameId(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nexpectedFrameId(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1TileInfo const *")
        public org.lwjgl.vulkan.video.StdVideoAV1TileInfo pTileInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npTileInfo(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1Quantization const *")
        public org.lwjgl.vulkan.video.StdVideoAV1Quantization pQuantization() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1Quantization r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npQuantization(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1Segmentation const *")
        public org.lwjgl.vulkan.video.StdVideoAV1Segmentation pSegmentation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1Segmentation r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npSegmentation(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1LoopFilter const *")
        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter pLoopFilter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npLoopFilter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1CDEF const *")
        public org.lwjgl.vulkan.video.StdVideoAV1CDEF pCDEF() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npCDEF(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1LoopRestoration const *")
        public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration pLoopRestoration() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npLoopRestoration(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1GlobalMotion const *")
        public org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion pGlobalMotion() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npGlobalMotion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1FilmGrain const *")
        public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain pFilmGrain() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npFilmGrain(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer flags(org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer frame_type(@org.lwjgl.system.NativeType("StdVideoAV1FrameType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nframe_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer current_frame_id(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ncurrent_frame_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer OrderHint(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nOrderHint(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer primary_ref_frame(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nprimary_ref_frame(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer refresh_frame_flags(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nrefresh_frame_flags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer interpolation_filter(@org.lwjgl.system.NativeType("StdVideoAV1InterpolationFilter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ninterpolation_filter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer TxMode(@org.lwjgl.system.NativeType("StdVideoAV1TxMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nTxMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer delta_q_res(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ndelta_q_res(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer delta_lf_res(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ndelta_lf_res(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer SkipModeFrame(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nSkipModeFrame(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer SkipModeFrame(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nSkipModeFrame(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer coded_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ncoded_denom(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer OrderHints(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nOrderHints(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer OrderHints(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nOrderHints(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer expectedFrameId(@org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nexpectedFrameId(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer expectedFrameId(int r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.nexpectedFrameId(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pTileInfo(@org.lwjgl.system.NativeType("StdVideoAV1TileInfo const *") org.lwjgl.vulkan.video.StdVideoAV1TileInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npTileInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pQuantization(@org.lwjgl.system.NativeType("StdVideoAV1Quantization const *") org.lwjgl.vulkan.video.StdVideoAV1Quantization r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npQuantization(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pSegmentation(@org.lwjgl.system.NativeType("StdVideoAV1Segmentation const *") org.lwjgl.vulkan.video.StdVideoAV1Segmentation r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npSegmentation(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pLoopFilter(@org.lwjgl.system.NativeType("StdVideoAV1LoopFilter const *") org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npLoopFilter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pCDEF(@org.lwjgl.system.NativeType("StdVideoAV1CDEF const *") org.lwjgl.vulkan.video.StdVideoAV1CDEF r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npCDEF(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pLoopRestoration(@org.lwjgl.system.NativeType("StdVideoAV1LoopRestoration const *") org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npLoopRestoration(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pGlobalMotion(@org.lwjgl.system.NativeType("StdVideoAV1GlobalMotion const *") org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npGlobalMotion(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer pFilmGrain(@org.lwjgl.system.NativeType("StdVideoAV1FilmGrain const *") org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.npFilmGrain(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7388create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.create(r0)
                org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoDecodeAV1PictureInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoDecodeAV1PictureInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1FrameType")
    public int frame_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nframe_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int current_frame_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncurrent_frame_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte OrderHint() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nOrderHint(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte primary_ref_frame() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nprimary_ref_frame(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte refresh_frame_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nrefresh_frame_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1InterpolationFilter")
    public int interpolation_filter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninterpolation_filter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1TxMode")
    public int TxMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nTxMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte delta_q_res() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_q_res(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte delta_lf_res() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ndelta_lf_res(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]")
    public java.nio.ByteBuffer SkipModeFrame() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nSkipModeFrame(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte SkipModeFrame(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nSkipModeFrame(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte coded_denom() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ncoded_denom(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public java.nio.ByteBuffer OrderHints() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nOrderHints(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte OrderHints(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nOrderHints(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public java.nio.IntBuffer expectedFrameId() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nexpectedFrameId(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int expectedFrameId(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nexpectedFrameId(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1TileInfo const *")
    public org.lwjgl.vulkan.video.StdVideoAV1TileInfo pTileInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = npTileInfo(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1Quantization const *")
    public org.lwjgl.vulkan.video.StdVideoAV1Quantization pQuantization() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1Quantization r0 = npQuantization(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1Segmentation const *")
    public org.lwjgl.vulkan.video.StdVideoAV1Segmentation pSegmentation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1Segmentation r0 = npSegmentation(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1LoopFilter const *")
    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter pLoopFilter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = npLoopFilter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1CDEF const *")
    public org.lwjgl.vulkan.video.StdVideoAV1CDEF pCDEF() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = npCDEF(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1LoopRestoration const *")
    public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration pLoopRestoration() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = npLoopRestoration(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1GlobalMotion const *")
    public org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion pGlobalMotion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion r0 = npGlobalMotion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1FilmGrain const *")
    public org.lwjgl.vulkan.video.StdVideoAV1FilmGrain pFilmGrain() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = npFilmGrain(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo flags(org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo frame_type(@org.lwjgl.system.NativeType("StdVideoAV1FrameType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nframe_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo current_frame_id(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncurrent_frame_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo OrderHint(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nOrderHint(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo primary_ref_frame(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nprimary_ref_frame(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo refresh_frame_flags(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrefresh_frame_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo interpolation_filter(@org.lwjgl.system.NativeType("StdVideoAV1InterpolationFilter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninterpolation_filter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo TxMode(@org.lwjgl.system.NativeType("StdVideoAV1TxMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nTxMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo delta_q_res(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_q_res(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo delta_lf_res(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndelta_lf_res(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo SkipModeFrame(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nSkipModeFrame(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo SkipModeFrame(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nSkipModeFrame(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo coded_denom(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncoded_denom(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo OrderHints(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nOrderHints(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo OrderHints(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nOrderHints(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo expectedFrameId(@org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nexpectedFrameId(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo expectedFrameId(int r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nexpectedFrameId(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pTileInfo(@org.lwjgl.system.NativeType("StdVideoAV1TileInfo const *") org.lwjgl.vulkan.video.StdVideoAV1TileInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTileInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pQuantization(@org.lwjgl.system.NativeType("StdVideoAV1Quantization const *") org.lwjgl.vulkan.video.StdVideoAV1Quantization r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npQuantization(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pSegmentation(@org.lwjgl.system.NativeType("StdVideoAV1Segmentation const *") org.lwjgl.vulkan.video.StdVideoAV1Segmentation r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSegmentation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pLoopFilter(@org.lwjgl.system.NativeType("StdVideoAV1LoopFilter const *") org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLoopFilter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pCDEF(@org.lwjgl.system.NativeType("StdVideoAV1CDEF const *") org.lwjgl.vulkan.video.StdVideoAV1CDEF r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npCDEF(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pLoopRestoration(@org.lwjgl.system.NativeType("StdVideoAV1LoopRestoration const *") org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npLoopRestoration(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pGlobalMotion(@org.lwjgl.system.NativeType("StdVideoAV1GlobalMotion const *") org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npGlobalMotion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo pFilmGrain(@org.lwjgl.system.NativeType("StdVideoAV1FilmGrain const *") org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npFilmGrain(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo set(org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r4, int r5, int r6, byte r7, byte r8, byte r9, int r10, int r11, byte r12, byte r13, java.nio.ByteBuffer r14, byte r15, java.nio.ByteBuffer r16, java.nio.IntBuffer r17, org.lwjgl.vulkan.video.StdVideoAV1TileInfo r18, org.lwjgl.vulkan.video.StdVideoAV1Quantization r19, org.lwjgl.vulkan.video.StdVideoAV1Segmentation r20, org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r21, org.lwjgl.vulkan.video.StdVideoAV1CDEF r22, org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r23, org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion r24, org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r25) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.frame_type(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.current_frame_id(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.OrderHint(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.primary_ref_frame(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.refresh_frame_flags(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.interpolation_filter(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.TxMode(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.delta_q_res(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.delta_lf_res(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.SkipModeFrame(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.coded_denom(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.OrderHints(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.expectedFrameId(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pTileInfo(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pQuantization(r1)
            r0 = r3
            r1 = r20
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pSegmentation(r1)
            r0 = r3
            r1 = r21
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pLoopFilter(r1)
            r0 = r3
            r1 = r22
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pCDEF(r1)
            r0 = r3
            r1 = r23
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pLoopRestoration(r1)
            r0 = r3
            r1 = r24
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pGlobalMotion(r1)
            r0 = r3
            r1 = r25
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.pFilmGrain(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo set(org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo malloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo calloc() {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo create(long r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r0 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.create(r0)
            return r0
    }

    public static int nframe_type(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.FRAME_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ncurrent_frame_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.CURRENT_FRAME_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static byte nOrderHint(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINT
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nprimary_ref_frame(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PRIMARY_REF_FRAME
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nrefresh_frame_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.REFRESH_FRAME_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nreserved1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static int ninterpolation_filter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.INTERPOLATION_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nTxMode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.TXMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static byte ndelta_q_res(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.DELTA_Q_RES
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ndelta_lf_res(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.DELTA_LF_RES
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nSkipModeFrame(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nSkipModeFrame(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte ncoded_denom(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.CODED_DENOM
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nreserved2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nreserved2(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nOrderHints(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nOrderHints(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.IntBuffer nexpectedFrameId(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nexpectedFrameId(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1TileInfo npTileInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PTILEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo r0 = org.lwjgl.vulkan.video.StdVideoAV1TileInfo.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1Quantization npQuantization(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PQUANTIZATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1Quantization r0 = org.lwjgl.vulkan.video.StdVideoAV1Quantization.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1Segmentation npSegmentation(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PSEGMENTATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1Segmentation r0 = org.lwjgl.vulkan.video.StdVideoAV1Segmentation.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter npLoopFilter(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPFILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1CDEF npCDEF(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PCDEF
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1CDEF r0 = org.lwjgl.vulkan.video.StdVideoAV1CDEF.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration npLoopRestoration(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPRESTORATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion npGlobalMotion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PGLOBALMOTION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion r0 = org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1FilmGrain npFilmGrain(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PFILMGRAIN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r0 = org.lwjgl.vulkan.video.StdVideoAV1FilmGrain.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nframe_type(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.FRAME_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncurrent_frame_id(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.CURRENT_FRAME_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nOrderHint(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nprimary_ref_frame(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PRIMARY_REF_FRAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nrefresh_frame_flags(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.REFRESH_FRAME_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nreserved1(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED1
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ninterpolation_filter(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.INTERPOLATION_FILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nTxMode(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.TXMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndelta_q_res(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.DELTA_Q_RES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ndelta_lf_res(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.DELTA_LF_RES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nSkipModeFrame(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME
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

    public static void nSkipModeFrame(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void ncoded_denom(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.CODED_DENOM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nreserved2(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED2
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

    public static void nreserved2(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nOrderHints(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINTS
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

    public static void nOrderHints(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nexpectedFrameId(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nexpectedFrameId(long r7, int r9, int r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 8
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npTileInfo(long r5, org.lwjgl.vulkan.video.StdVideoAV1TileInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PTILEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npQuantization(long r5, org.lwjgl.vulkan.video.StdVideoAV1Quantization r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PQUANTIZATION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npSegmentation(long r5, org.lwjgl.vulkan.video.StdVideoAV1Segmentation r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PSEGMENTATION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npLoopFilter(long r5, org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPFILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npCDEF(long r5, org.lwjgl.vulkan.video.StdVideoAV1CDEF r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PCDEF
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npLoopRestoration(long r5, org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPRESTORATION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npGlobalMotion(long r5, org.lwjgl.vulkan.video.StdVideoAV1GlobalMotion r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PGLOBALMOTION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npFilmGrain(long r5, org.lwjgl.vulkan.video.StdVideoAV1FilmGrain r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PFILMGRAIN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PTILEINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoAV1TileInfo.validate(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PQUANTIZATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PSEGMENTATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPFILTER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PCDEF
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPRESTORATION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PGLOBALMOTION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PFILMGRAIN
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
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 24
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfoFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
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
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            int r3 = org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.FRAME_TYPE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.CURRENT_FRAME_ID = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PRIMARY_REF_FRAME = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.REFRESH_FRAME_FLAGS = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED1 = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.INTERPOLATION_FILTER = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.TXMODE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.DELTA_Q_RES = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.DELTA_LF_RES = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.CODED_DENOM = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.RESERVED2 = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.ORDERHINTS = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PTILEINFO = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PQUANTIZATION = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PSEGMENTATION = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPFILTER = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PCDEF = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PLOOPRESTORATION = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PGLOBALMOTION = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoDecodeAV1PictureInfo.PFILMGRAIN = r0
            return
    }
}
