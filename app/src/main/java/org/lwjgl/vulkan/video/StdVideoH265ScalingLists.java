package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists.class */
public class StdVideoH265ScalingLists extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265ScalingLists> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SCALINGLIST4X4 = 0;
    public static final int SCALINGLIST8X8 = 0;
    public static final int SCALINGLIST16X16 = 0;
    public static final int SCALINGLIST32X32 = 0;
    public static final int SCALINGLISTDCCOEF16X16 = 0;
    public static final int SCALINGLISTDCCOEF32X32 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265ScalingLists$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265ScalingLists, org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265ScalingLists ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265ScalingLists getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]")
        public java.nio.ByteBuffer ScalingList4x4() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList4x4(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ScalingList4x4(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList4x4(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]")
        public java.nio.ByteBuffer ScalingList8x8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList8x8(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ScalingList8x8(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList8x8(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]")
        public java.nio.ByteBuffer ScalingList16x16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList16x16(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ScalingList16x16(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList16x16(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]")
        public java.nio.ByteBuffer ScalingList32x32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList32x32(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ScalingList32x32(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList32x32(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]")
        public java.nio.ByteBuffer ScalingListDCCoef16x16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef16x16(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ScalingListDCCoef16x16(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef16x16(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]")
        public java.nio.ByteBuffer ScalingListDCCoef32x32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef32x32(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte ScalingListDCCoef32x32(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef32x32(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList4x4(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList4x4(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList4x4(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList4x4(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList8x8(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList8x8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList8x8(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList8x8(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList16x16(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList16x16(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList16x16(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList16x16(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList32x32(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList32x32(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingList32x32(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingList32x32(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingListDCCoef16x16(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef16x16(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingListDCCoef16x16(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef16x16(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingListDCCoef32x32(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef32x32(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer ScalingListDCCoef32x32(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.nScalingListDCCoef32x32(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265ScalingLists(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265ScalingLists create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265ScalingLists(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]")
    public java.nio.ByteBuffer ScalingList4x4() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nScalingList4x4(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ScalingList4x4(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nScalingList4x4(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]")
    public java.nio.ByteBuffer ScalingList8x8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nScalingList8x8(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ScalingList8x8(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nScalingList8x8(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]")
    public java.nio.ByteBuffer ScalingList16x16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nScalingList16x16(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ScalingList16x16(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nScalingList16x16(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]")
    public java.nio.ByteBuffer ScalingList32x32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nScalingList32x32(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ScalingList32x32(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nScalingList32x32(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]")
    public java.nio.ByteBuffer ScalingListDCCoef16x16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nScalingListDCCoef16x16(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ScalingListDCCoef16x16(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nScalingListDCCoef16x16(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]")
    public java.nio.ByteBuffer ScalingListDCCoef32x32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nScalingListDCCoef32x32(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte ScalingListDCCoef32x32(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nScalingListDCCoef32x32(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList4x4(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nScalingList4x4(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList4x4(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nScalingList4x4(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList8x8(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nScalingList8x8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList8x8(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nScalingList8x8(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList16x16(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nScalingList16x16(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList16x16(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nScalingList16x16(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList32x32(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nScalingList32x32(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingList32x32(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nScalingList32x32(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingListDCCoef16x16(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nScalingListDCCoef16x16(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingListDCCoef16x16(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nScalingListDCCoef16x16(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingListDCCoef32x32(@org.lwjgl.system.NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nScalingListDCCoef32x32(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists ScalingListDCCoef32x32(int r6, @org.lwjgl.system.NativeType("uint8_t") byte r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nScalingListDCCoef32x32(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists set(java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, java.nio.ByteBuffer r8, java.nio.ByteBuffer r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.ScalingList4x4(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.ScalingList8x8(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.ScalingList16x16(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.ScalingList32x32(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.ScalingListDCCoef16x16(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.ScalingListDCCoef32x32(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265ScalingLists set(org.lwjgl.vulkan.video.StdVideoH265ScalingLists r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists malloc() {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists calloc() {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265ScalingLists.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265ScalingLists$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer nScalingList4x4(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST4X4
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nScalingList4x4(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST4X4
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nScalingList8x8(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST8X8
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nScalingList8x8(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST8X8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 64
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nScalingList16x16(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST16X16
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nScalingList16x16(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST16X16
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 64
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nScalingList32x32(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST32X32
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 64
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nScalingList32x32(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST32X32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 64
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nScalingListDCCoef16x16(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nScalingListDCCoef16x16(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nScalingListDCCoef32x32(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nScalingListDCCoef32x32(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void nScalingList4x4(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 16
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST4X4
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

    public static void nScalingList4x4(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST4X4
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nScalingList8x8(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 64
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST8X8
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

    public static void nScalingList8x8(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST8X8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 64
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nScalingList16x16(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 64
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST16X16
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

    public static void nScalingList16x16(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST16X16
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 64
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nScalingList32x32(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 64
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST32X32
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

    public static void nScalingList32x32(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST32X32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 64
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nScalingListDCCoef16x16(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 6
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16
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

    public static void nScalingListDCCoef16x16(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nScalingListDCCoef32x32(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32
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

    public static void nScalingListDCCoef32x32(long r9, int r11, byte r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            r4 = 64
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r4 = 64
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r4 = 64
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST4X4 = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST8X8 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST16X16 = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLIST32X32 = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16 = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32 = r0
            return
    }
}
