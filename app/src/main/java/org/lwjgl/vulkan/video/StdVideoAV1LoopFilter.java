package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopFilter.class */
public class StdVideoAV1LoopFilter extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1LoopFilter> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int LOOP_FILTER_LEVEL = 0;
    public static final int LOOP_FILTER_SHARPNESS = 0;
    public static final int UPDATE_REF_DELTA = 0;
    public static final int LOOP_FILTER_REF_DELTAS = 0;
    public static final int UPDATE_MODE_DELTA = 0;
    public static final int LOOP_FILTER_MODE_DELTAS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopFilter$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1LoopFilter, org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1LoopFilter ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1LoopFilter getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]")
        public java.nio.ByteBuffer loop_filter_level() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_level(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte loop_filter_level(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_level(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte loop_filter_sharpness() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_sharpness(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte update_ref_delta() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nupdate_ref_delta(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]")
        public java.nio.ByteBuffer loop_filter_ref_deltas() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_ref_deltas(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte loop_filter_ref_deltas(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_ref_deltas(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte update_mode_delta() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nupdate_mode_delta(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]")
        public java.nio.ByteBuffer loop_filter_mode_deltas() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_mode_deltas(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int8_t")
        public byte loop_filter_mode_deltas(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_mode_deltas(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer flags(org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer loop_filter_level(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_level(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer loop_filter_level(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_level(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer loop_filter_sharpness(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_sharpness(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer update_ref_delta(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nupdate_ref_delta(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer loop_filter_ref_deltas(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_ref_deltas(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer loop_filter_ref_deltas(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_ref_deltas(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer update_mode_delta(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nupdate_mode_delta(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer loop_filter_mode_deltas(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_mode_deltas(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer loop_filter_mode_deltas(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.nloop_filter_mode_deltas(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7352create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1LoopFilter(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1LoopFilter create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1LoopFilter(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]")
    public java.nio.ByteBuffer loop_filter_level() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nloop_filter_level(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte loop_filter_level(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nloop_filter_level(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte loop_filter_sharpness() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nloop_filter_sharpness(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte update_ref_delta() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nupdate_ref_delta(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]")
    public java.nio.ByteBuffer loop_filter_ref_deltas() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nloop_filter_ref_deltas(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte loop_filter_ref_deltas(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nloop_filter_ref_deltas(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte update_mode_delta() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nupdate_mode_delta(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]")
    public java.nio.ByteBuffer loop_filter_mode_deltas() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nloop_filter_mode_deltas(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int8_t")
    public byte loop_filter_mode_deltas(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nloop_filter_mode_deltas(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter flags(org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter loop_filter_level(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nloop_filter_level(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter loop_filter_level(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nloop_filter_level(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter loop_filter_sharpness(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nloop_filter_sharpness(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter update_ref_delta(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nupdate_ref_delta(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter loop_filter_ref_deltas(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nloop_filter_ref_deltas(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter loop_filter_ref_deltas(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nloop_filter_ref_deltas(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter update_mode_delta(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nupdate_mode_delta(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter loop_filter_mode_deltas(@org.lwjgl.system.NativeType("int8_t[STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nloop_filter_mode_deltas(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter loop_filter_mode_deltas(int r6, @org.lwjgl.system.NativeType("int8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nloop_filter_mode_deltas(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter set(org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r4, java.nio.ByteBuffer r5, byte r6, byte r7, java.nio.ByteBuffer r8, byte r9, java.nio.ByteBuffer r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.loop_filter_level(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.loop_filter_sharpness(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.update_ref_delta(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.loop_filter_ref_deltas(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.update_mode_delta(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.loop_filter_mode_deltas(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopFilter set(org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopFilter$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags.create(r0)
            return r0
    }

    public static java.nio.ByteBuffer nloop_filter_level(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nloop_filter_level(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nloop_filter_sharpness(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_SHARPNESS
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static byte nupdate_ref_delta(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.UPDATE_REF_DELTA
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nloop_filter_ref_deltas(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nloop_filter_ref_deltas(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS
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

    public static byte nupdate_mode_delta(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.UPDATE_MODE_DELTA
            long r1 = (long) r1
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static java.nio.ByteBuffer nloop_filter_mode_deltas(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nloop_filter_mode_deltas(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS
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

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nloop_filter_level(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL
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

    public static void nloop_filter_level(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 4
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nloop_filter_sharpness(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_SHARPNESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nupdate_ref_delta(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.UPDATE_REF_DELTA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nloop_filter_ref_deltas(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 8
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS
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

    public static void nloop_filter_ref_deltas(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS
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

    public static void nupdate_mode_delta(long r5, byte r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.UPDATE_MODE_DELTA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutByte(r0, r1)
            return
    }

    public static void nloop_filter_mode_deltas(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS
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

    public static void nloop_filter_mode_deltas(long r7, int r9, byte r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS
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

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1LoopFilterFlags.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_LEVEL = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_SHARPNESS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.UPDATE_REF_DELTA = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_REF_DELTAS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.UPDATE_MODE_DELTA = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopFilter.LOOP_FILTER_MODE_DELTAS = r0
            return
    }
}
