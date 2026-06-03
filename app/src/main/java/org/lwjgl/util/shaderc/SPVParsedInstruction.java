package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedInstruction.class */
@org.lwjgl.system.NativeType("struct spv_parsed_instruction_t")
public class SPVParsedInstruction extends org.lwjgl.system.Struct<org.lwjgl.util.shaderc.SPVParsedInstruction> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int WORDS = 0;
    public static final int NUM_WORDS = 0;
    public static final int OPCODE = 0;
    public static final int EXT_INST_TYPE = 0;
    public static final int TYPE_ID = 0;
    public static final int RESULT_ID = 0;
    public static final int OPERANDS = 0;
    public static final int NUM_OPERANDS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVParsedInstruction$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.shaderc.SPVParsedInstruction, org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.shaderc.SPVParsedInstruction ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
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
        protected org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
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
        protected org.lwjgl.util.shaderc.SPVParsedInstruction getElementFactory() {
                r2 = this;
                org.lwjgl.util.shaderc.SPVParsedInstruction r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer words() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.nwords(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short num_words() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.nnum_words(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short opcode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.nopcode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spv_ext_inst_type_t")
        public int ext_inst_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.next_inst_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int type_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.ntype_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int result_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.nresult_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("spv_parsed_operand_t const *")
        public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer operands() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.noperands(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short num_operands() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.nnum_operands(r0)
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer words(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedInstruction.nwords(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer opcode(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedInstruction.nopcode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer ext_inst_type(@org.lwjgl.system.NativeType("spv_ext_inst_type_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedInstruction.next_inst_type(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer type_id(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedInstruction.ntype_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer result_id(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedInstruction.nresult_id(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer operands(@org.lwjgl.system.NativeType("spv_parsed_operand_t const *") org.lwjgl.util.shaderc.SPVParsedOperand.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.shaderc.SPVParsedInstruction.noperands(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3707create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.shaderc.SPVParsedInstruction r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.create(r0)
                org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected SPVParsedInstruction(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.shaderc.SPVParsedInstruction create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public SPVParsedInstruction(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer words() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nwords(r0)
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

    @org.lwjgl.system.NativeType("uint16_t")
    public short opcode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nopcode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_ext_inst_type_t")
    public int ext_inst_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = next_inst_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int type_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int result_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresult_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_parsed_operand_t const *")
    public org.lwjgl.util.shaderc.SPVParsedOperand.Buffer operands() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = noperands(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short num_operands() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nnum_operands(r0)
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction words(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwords(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction opcode(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopcode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction ext_inst_type(@org.lwjgl.system.NativeType("spv_ext_inst_type_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            next_inst_type(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction type_id(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction result_id(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresult_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction operands(@org.lwjgl.system.NativeType("spv_parsed_operand_t const *") org.lwjgl.util.shaderc.SPVParsedOperand.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noperands(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction set(java.nio.IntBuffer r4, short r5, int r6, int r7, int r8, org.lwjgl.util.shaderc.SPVParsedOperand.Buffer r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.words(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.opcode(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.ext_inst_type(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.type_id(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.result_id(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.operands(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.shaderc.SPVParsedInstruction set(org.lwjgl.util.shaderc.SPVParsedInstruction r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction malloc() {
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            int r2 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction calloc() {
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction create() {
            int r0 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction create(long r6) {
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer malloc(int r6) {
            org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer calloc(int r7) {
            org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
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

    public static org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer create(long r6, int r8) {
            org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.ALIGNOF
            int r4 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedInstruction.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer r0 = new org.lwjgl.util.shaderc.SPVParsedInstruction$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.IntBuffer nwords(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.WORDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            short r1 = nnum_words(r1)
            int r1 = java.lang.Short.toUnsignedInt(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static short nnum_words(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.NUM_WORDS
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static short nopcode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.OPCODE
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static int next_inst_type(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.EXT_INST_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ntype_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.TYPE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nresult_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.RESULT_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.util.shaderc.SPVParsedOperand.Buffer noperands(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.OPERANDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            short r1 = nnum_operands(r1)
            int r1 = java.lang.Short.toUnsignedInt(r1)
            org.lwjgl.util.shaderc.SPVParsedOperand$Buffer r0 = org.lwjgl.util.shaderc.SPVParsedOperand.create(r0, r1)
            return r0
    }

    public static short nnum_operands(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.NUM_OPERANDS
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static void nwords(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.WORDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            short r1 = (short) r1
            nnum_words(r0, r1)
            return
    }

    public static void nnum_words(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.NUM_WORDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nopcode(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.OPCODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void next_inst_type(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.EXT_INST_TYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ntype_id(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.TYPE_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nresult_id(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.RESULT_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noperands(long r5, org.lwjgl.util.shaderc.SPVParsedOperand.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.OPERANDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            short r1 = (short) r1
            nnum_operands(r0, r1)
            return
    }

    public static void nnum_operands(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.NUM_OPERANDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.WORDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.shaderc.SPVParsedInstruction.OPERANDS
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
            org.lwjgl.util.shaderc.SPVParsedInstruction r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
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
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.shaderc.SPVParsedInstruction.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.shaderc.SPVParsedInstruction.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.shaderc.SPVParsedInstruction.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.WORDS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.NUM_WORDS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.OPCODE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.EXT_INST_TYPE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.TYPE_ID = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.RESULT_ID = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.OPERANDS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.shaderc.SPVParsedInstruction.NUM_OPERANDS = r0
            return
    }
}
