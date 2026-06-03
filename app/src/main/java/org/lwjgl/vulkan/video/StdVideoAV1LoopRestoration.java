package org.lwjgl.vulkan.video;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopRestoration.class */
public class StdVideoAV1LoopRestoration extends org.lwjgl.system.Struct<org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FRAMERESTORATIONTYPE = 0;
    public static final int LOOPRESTORATIONSIZE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopRestoration$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration, org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
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
        protected org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
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
        protected org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]")
        public java.nio.IntBuffer FrameRestorationType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nFrameRestorationType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType")
        public int FrameRestorationType(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nFrameRestorationType(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]")
        public java.nio.ShortBuffer LoopRestorationSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nLoopRestorationSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short LoopRestorationSize(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nLoopRestorationSize(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer FrameRestorationType(@org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nFrameRestorationType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer FrameRestorationType(int r6, @org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nFrameRestorationType(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer LoopRestorationSize(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]") java.nio.ShortBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nLoopRestorationSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer LoopRestorationSize(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.nLoopRestorationSize(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m7358create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.create(r0)
                org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected StdVideoAV1LoopRestoration(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public StdVideoAV1LoopRestoration(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]")
    public java.nio.IntBuffer FrameRestorationType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nFrameRestorationType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType")
    public int FrameRestorationType(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nFrameRestorationType(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]")
    public java.nio.ShortBuffer LoopRestorationSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nLoopRestorationSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short LoopRestorationSize(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nLoopRestorationSize(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration FrameRestorationType(@org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nFrameRestorationType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration FrameRestorationType(int r6, @org.lwjgl.system.NativeType("StdVideoAV1FrameRestorationType") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nFrameRestorationType(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration LoopRestorationSize(@org.lwjgl.system.NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]") java.nio.ShortBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nLoopRestorationSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration LoopRestorationSize(int r6, @org.lwjgl.system.NativeType("uint16_t") short r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nLoopRestorationSize(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration set(java.nio.IntBuffer r4, java.nio.ShortBuffer r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = r0.FrameRestorationType(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = r0.LoopRestorationSize(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration set(org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration malloc() {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration calloc() {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration create() {
            int r0 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration create(long r6) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer malloc(int r6) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer calloc(int r7) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
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

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.ALIGNOF
            int r4 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer r0 = new org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.IntBuffer nFrameRestorationType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nFrameRestorationType(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.ShortBuffer nLoopRestorationSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nLoopRestorationSize(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 2
            long r1 = r1 * r2
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static void nFrameRestorationType(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE
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

    public static void nFrameRestorationType(long r7, int r9, int r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 4
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nLoopRestorationSize(long r7, java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nLoopRestorationSize(long r7, int r9, short r10) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 2
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.video.StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE = r0
            return
    }
}
