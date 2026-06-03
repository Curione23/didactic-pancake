package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet.class */
public class StdVideoH265VideoParameterSet extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int VPS_VIDEO_PARAMETER_SET_ID = 0;
    public static final int VPS_MAX_SUB_LAYERS_MINUS1 = 0;
    public static final int RESERVED1 = 0;
    public static final int RESERVED2 = 0;
    public static final int VPS_NUM_UNITS_IN_TICK = 0;
    public static final int VPS_TIME_SCALE = 0;
    public static final int VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1 = 0;
    public static final int RESERVED3 = 0;
    public static final int PDECPICBUFMGR = 0;
    public static final int PHRDPARAMETERS = 0;
    public static final int PPROFILETIERLEVEL = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265VideoParameterSet$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet, org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VpsFlags flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265VpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte vps_video_parameter_set_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_video_parameter_set_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte vps_max_sub_layers_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_max_sub_layers_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vps_num_units_in_tick() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_num_units_in_tick(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vps_time_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_time_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vps_num_ticks_poc_diff_one_minus1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_num_ticks_poc_diff_one_minus1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *")
        public org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr pDecPicBufMgr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.npDecPicBufMgr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *")
        public org.lwjgl.vulkan.video.StdVideoH265HrdParameters pHrdParameters() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.npHrdParameters(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *")
        public org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel pProfileTierLevel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.npProfileTierLevel(r0)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer flags(org.lwjgl.vulkan.video.StdVideoH265VpsFlags r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265VpsFlags> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.video.StdVideoH265VpsFlags r1 = r1.flags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer vps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_video_parameter_set_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer vps_max_sub_layers_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_max_sub_layers_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer vps_num_units_in_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_num_units_in_tick(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer vps_time_scale(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_time_scale(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer vps_num_ticks_poc_diff_one_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.nvps_num_ticks_poc_diff_one_minus1(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer pDecPicBufMgr(@org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *") org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.npDecPicBufMgr(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer pHrdParameters(@org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265HrdParameters r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.npHrdParameters(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer pProfileTierLevel(@org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *") org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.npProfileTierLevel(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265VideoParameterSet(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265VideoParameterSet(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VpsFlags flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265VpsFlags r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte vps_video_parameter_set_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nvps_video_parameter_set_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte vps_max_sub_layers_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nvps_max_sub_layers_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vps_num_units_in_tick() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvps_num_units_in_tick(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vps_time_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvps_time_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vps_num_ticks_poc_diff_one_minus1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvps_num_ticks_poc_diff_one_minus1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *")
    public org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr pDecPicBufMgr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r0 = npDecPicBufMgr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *")
    public org.lwjgl.vulkan.video.StdVideoH265HrdParameters pHrdParameters() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = npHrdParameters(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *")
    public org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel pProfileTierLevel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r0 = npProfileTierLevel(r0)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet flags(org.lwjgl.vulkan.video.StdVideoH265VpsFlags r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet flags(java.util.function.Consumer<org.lwjgl.vulkan.video.StdVideoH265VpsFlags> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.video.StdVideoH265VpsFlags r1 = r1.flags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet vps_video_parameter_set_id(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvps_video_parameter_set_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet vps_max_sub_layers_minus1(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvps_max_sub_layers_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet vps_num_units_in_tick(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvps_num_units_in_tick(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet vps_time_scale(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvps_time_scale(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvps_num_ticks_poc_diff_one_minus1(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet pDecPicBufMgr(@org.lwjgl.system.NativeType("StdVideoH265DecPicBufMgr const *") org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDecPicBufMgr(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet pHrdParameters(@org.lwjgl.system.NativeType("StdVideoH265HrdParameters const *") org.lwjgl.vulkan.video.StdVideoH265HrdParameters r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npHrdParameters(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet pProfileTierLevel(@org.lwjgl.system.NativeType("StdVideoH265ProfileTierLevel const *") org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npProfileTierLevel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet set(org.lwjgl.vulkan.video.StdVideoH265VpsFlags r4, byte r5, byte r6, int r7, int r8, int r9, org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r10, org.lwjgl.vulkan.video.StdVideoH265HrdParameters r11, org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.flags(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.vps_video_parameter_set_id(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.vps_max_sub_layers_minus1(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.vps_num_units_in_tick(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.vps_time_scale(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.vps_num_ticks_poc_diff_one_minus1(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.pDecPicBufMgr(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.pHrdParameters(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.pProfileTierLevel(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet set(org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet malloc() {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet calloc() {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265VpsFlags nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.video.StdVideoH265VpsFlags r0 = org.lwjgl.vulkan.video.StdVideoH265VpsFlags.create(r0)
            return r0
    }

    public static byte nvps_video_parameter_set_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nvps_max_sub_layers_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_MAX_SUB_LAYERS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nreserved2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static int nvps_num_units_in_tick(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_NUM_UNITS_IN_TICK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvps_time_scale(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_TIME_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvps_num_ticks_poc_diff_one_minus1(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nreserved3(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr npDecPicBufMgr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PDECPICBUFMGR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r0 = org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265HrdParameters npHrdParameters(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters r0 = org.lwjgl.vulkan.video.StdVideoH265HrdParameters.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel npProfileTierLevel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PPROFILETIERLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r0 = org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel.create(r0)
            return r0
    }

    public static void nflags(long r7, org.lwjgl.vulkan.video.StdVideoH265VpsFlags r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.FLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.video.StdVideoH265VpsFlags.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nvps_video_parameter_set_id(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_VIDEO_PARAMETER_SET_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nvps_max_sub_layers_minus1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_MAX_SUB_LAYERS_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved1(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nreserved2(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nvps_num_units_in_tick(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_NUM_UNITS_IN_TICK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvps_time_scale(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_TIME_SCALE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvps_num_ticks_poc_diff_one_minus1(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nreserved3(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED3
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npDecPicBufMgr(long r5, org.lwjgl.vulkan.video.StdVideoH265DecPicBufMgr r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PDECPICBUFMGR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npHrdParameters(long r5, org.lwjgl.vulkan.video.StdVideoH265HrdParameters r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npProfileTierLevel(long r5, org.lwjgl.vulkan.video.StdVideoH265ProfileTierLevel r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PPROFILETIERLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PDECPICBUFMGR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PHRDPARAMETERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.video.StdVideoH265HrdParameters.validate(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PPROFILETIERLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VpsFlags.SIZEOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265VpsFlags.ALIGNOF
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
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
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.FLAGS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_VIDEO_PARAMETER_SET_ID = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_MAX_SUB_LAYERS_MINUS1 = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED1 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED2 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_NUM_UNITS_IN_TICK = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_TIME_SCALE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1 = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.RESERVED3 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PDECPICBUFMGR = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PHRDPARAMETERS = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet.PPROFILETIERLEVEL = r0
            return
    }
}
