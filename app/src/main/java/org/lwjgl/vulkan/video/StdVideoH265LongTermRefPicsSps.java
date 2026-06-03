package org.lwjgl.vulkan.video;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps.class */
public class StdVideoH265LongTermRefPicsSps extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int USED_BY_CURR_PIC_LT_SPS_FLAG = 0;
    public static final int LT_REF_PIC_POC_LSB_SPS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoH265LongTermRefPicsSps$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps, org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int used_by_curr_pic_lt_sps_flag() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.nused_by_curr_pic_lt_sps_flag(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
        public java.nio.IntBuffer lt_ref_pic_poc_lsb_sps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int lt_ref_pic_poc_lsb_sps(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer used_by_curr_pic_lt_sps_flag(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.nused_by_curr_pic_lt_sps_flag(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer lt_ref_pic_poc_lsb_sps(@org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer lt_ref_pic_poc_lsb_sps(int r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.create(r0)
                org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoH265LongTermRefPicsSps(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoH265LongTermRefPicsSps(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int used_by_curr_pic_lt_sps_flag() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nused_by_curr_pic_lt_sps_flag(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
    public java.nio.IntBuffer lt_ref_pic_poc_lsb_sps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nlt_ref_pic_poc_lsb_sps(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int lt_ref_pic_poc_lsb_sps(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nlt_ref_pic_poc_lsb_sps(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flag(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nused_by_curr_pic_lt_sps_flag(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(@org.lwjgl.system.NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlt_ref_pic_poc_lsb_sps(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(int r6, @org.lwjgl.system.NativeType("uint32_t") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nlt_ref_pic_poc_lsb_sps(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps set(int r4, java.nio.IntBuffer r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = r0.used_by_curr_pic_lt_sps_flag(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = r0.lt_ref_pic_poc_lsb_sps(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps set(org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps malloc() {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps calloc() {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps create(long r6) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nused_by_curr_pic_lt_sps_flag(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.USED_BY_CURR_PIC_LT_SPS_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nlt_ref_pic_poc_lsb_sps(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 32
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nlt_ref_pic_poc_lsb_sps(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 32
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nused_by_curr_pic_lt_sps_flag(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.USED_BY_CURR_PIC_LT_SPS_FLAG
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlt_ref_pic_poc_lsb_sps(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = 32
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lc:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS
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

    public static void nlt_ref_pic_poc_lsb_sps(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 32
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps r0 = r0.create(r1, r2)
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
            r4 = 32
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.USED_BY_CURR_PIC_LT_SPS_FLAG = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS = r0
            return
    }
}
