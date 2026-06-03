package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersAddInfoEXT.class */
public class VkVideoEncodeH264SessionParametersAddInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int STDSPSCOUNT = 0;
    public static final int PSTDSPSS = 0;
    public static final int STDPPSCOUNT = 0;
    public static final int PSTDPPSS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT, org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int stdSPSCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.nstdSPSCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSet const *")
        public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pStdSPSs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.npStdSPSs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int stdPPSCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.nstdPPSCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("StdVideoH264PictureParameterSet const *")
        public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer pStdPPSs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.npStdPPSs(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000038002(0x3b9b5e72, float:0.0047414834)
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer stdSPSCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.nstdSPSCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pStdSPSs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSet const *") org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.npStdSPSs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer stdPPSCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.nstdPPSCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pStdPPSs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("StdVideoH264PictureParameterSet const *") org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.npStdPPSs(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.create(r0)
                org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkVideoEncodeH264SessionParametersAddInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkVideoEncodeH264SessionParametersAddInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkStructureType")
    public int sType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int stdSPSCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstdSPSCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSet const *")
    public org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer pStdSPSs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = npStdSPSs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int stdPPSCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstdPPSCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("StdVideoH264PictureParameterSet const *")
    public org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer pStdPPSs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = npStdPPSs(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000038002(0x3b9b5e72, float:0.0047414834)
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT stdSPSCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstdSPSCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT pStdSPSs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("StdVideoH264SequenceParameterSet const *") org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStdSPSs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT stdPPSCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstdPPSCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT pStdPPSs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("StdVideoH264PictureParameterSet const *") org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStdPPSs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT set(int r5, long r6, int r8, @javax.annotation.Nullable org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer r9, int r10, @javax.annotation.Nullable org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.stdSPSCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.pStdSPSs(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.stdPPSCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.pStdPPSs(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT set(org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT malloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT calloc() {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nstdSPSCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STDSPSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer npStdSPSs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDSPSS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nstdSPSCount(r1)
            org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet$Buffer r0 = org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.createSafe(r0, r1)
            return r0
    }

    public static int nstdPPSCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STDPPSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer npStdPPSs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDPPSS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nstdPPSCount(r1)
            org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet$Buffer r0 = org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.createSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nstdSPSCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STDSPSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npStdSPSs(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDSPSS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nstdSPSCount(r0, r1)
        L19:
            return
    }

    public static void nstdPPSCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STDPPSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npStdPPSs(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDPPSS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nstdPPSCount(r0, r1)
        L19:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STDSPSCOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDSPSS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.STDPPSCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDPPSS = r0
            return
    }
}
