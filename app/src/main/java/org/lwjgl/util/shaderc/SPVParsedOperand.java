package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedOperand.class */
@org.lwjgl.system.NativeType("struct spv_parsed_operand_t")
public class SPVParsedOperand extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.SPVParsedOperand> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int OFFSET = 0;
    public static final int NUM_WORDS = 0;
    public static final int TYPE = 0;
    public static final int NUMBER_KIND = 0;
    public static final int NUMBER_BIT_WIDTH = 0;
    public static final int FP_ENCODING = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedOperand$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.SPVParsedOperand, org.lwjgl.util.shaderc.SPVParsedOperand.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.SPVParsedOperand ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
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
        protected org.lwjgl.util.shaderc.SPVParsedOperand.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.SPVParsedOperand.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
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
        protected org.lwjgl.util.shaderc.SPVParsedOperand getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.SPVParsedOperand r0 = org.lwjgl.util.shaderc.SPVParsedOperand.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.shaderc.SPVParsedOperand.noffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short num_words() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.shaderc.SPVParsedOperand.nnum_words(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spv_operand_type_t")
        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedOperand.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spv_number_kind_t")
        public int number_kind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedOperand.nnumber_kind(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int number_bit_width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedOperand.nnumber_bit_width(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spv_fp_encoding_t")
        public int fp_encoding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedOperand.nfp_encoding(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedOperand.noffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer num_words(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedOperand.nnum_words(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer type(@org.lwjgl.system.NativeType("spv_operand_type_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedOperand.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer number_kind(@org.lwjgl.system.NativeType("spv_number_kind_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedOperand.nnumber_kind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer number_bit_width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedOperand.nnumber_bit_width(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer fp_encoding(@org.lwjgl.system.NativeType("spv_fp_encoding_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedOperand.nfp_encoding(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3711create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.SPVParsedOperand r0 = org.lwjgl.util.shaderc.SPVParsedOperand.create(r0)
                org.lwjgl.util.shaderc.SPVParsedOperand.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SPVParsedOperand(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.SPVParsedOperand create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SPVParsedOperand(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = noffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short num_words() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nnum_words(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_operand_type_t")
    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_number_kind_t")
    public int number_kind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumber_kind(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int number_bit_width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumber_bit_width(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_fp_encoding_t")
    public int fp_encoding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfp_encoding(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand offset(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand num_words(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_words(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand type(@org.lwjgl.system.NativeType("spv_operand_type_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand number_kind(@org.lwjgl.system.NativeType("spv_number_kind_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumber_kind(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand number_bit_width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumber_bit_width(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand fp_encoding(@org.lwjgl.system.NativeType("spv_fp_encoding_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfp_encoding(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand set(short r4, short r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.offset(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.num_words(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.type(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.number_kind(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.number_bit_width(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.fp_encoding(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedOperand set(org.lwjgl.util.shaderc.SPVParsedOperand r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand malloc() {
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand calloc() {
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand create() {
            int r0 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand create(long r6) {
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
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

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = new org.lwjgl.util.shaderc.SPVParsedOperand
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedOperand$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.SPVParsedOperand.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static short noffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static short nnum_words(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.NUM_WORDS
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static int ntype(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnumber_kind(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.NUMBER_KIND
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnumber_bit_width(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.NUMBER_BIT_WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nfp_encoding(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.FP_ENCODING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void noffset(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nnum_words(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.NUM_WORDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void ntype(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnumber_kind(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.NUMBER_KIND
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnumber_bit_width(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.NUMBER_BIT_WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nfp_encoding(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedOperand.FP_ENCODING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.shaderc.SPVParsedOperand r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.SPVParsedOperand.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.SPVParsedOperand.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedOperand.OFFSET = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedOperand.NUM_WORDS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedOperand.TYPE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedOperand.NUMBER_KIND = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedOperand.NUMBER_BIT_WIDTH = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedOperand.FP_ENCODING = r0
            return
    }
}
