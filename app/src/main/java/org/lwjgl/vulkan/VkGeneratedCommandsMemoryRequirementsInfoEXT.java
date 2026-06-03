package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoEXT.class */
public class VkGeneratedCommandsMemoryRequirementsInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int INDIRECTEXECUTIONSET = 0;
    public static final int INDIRECTCOMMANDSLAYOUT = 0;
    public static final int MAXSEQUENCECOUNT = 0;
    public static final int MAXDRAWCOUNT = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT, org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
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
        protected org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT")
        public long indirectExecutionSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectExecutionSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT")
        public long indirectCommandsLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectCommandsLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSequenceCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxSequenceCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDrawCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxDrawCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000572002(0x3ba38462, float:0.0049901465)
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer pNext(org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer pNext(org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer indirectExecutionSet(@org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectExecutionSet(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer indirectCommandsLayout(@org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectCommandsLayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer maxSequenceCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxSequenceCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer maxDrawCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxDrawCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4727create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.create(r0)
                org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkGeneratedCommandsMemoryRequirementsInfoEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT")
    public long indirectExecutionSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindirectExecutionSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT")
    public long indirectCommandsLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindirectCommandsLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSequenceCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSequenceCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDrawCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDrawCount(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000572002(0x3ba38462, float:0.0049901465)
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkGeneratedCommandsPipelineInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkGeneratedCommandsShaderInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSet(@org.lwjgl.system.NativeType("VkIndirectExecutionSetEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindirectExecutionSet(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayout(@org.lwjgl.system.NativeType("VkIndirectCommandsLayoutEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindirectCommandsLayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxSequenceCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxDrawCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT set(int r5, long r6, long r8, long r10, int r12, int r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.indirectExecutionSet(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.indirectCommandsLayout(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.maxSequenceCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.maxDrawCount(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT set(org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT malloc() {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT calloc() {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nindirectExecutionSet(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTEXECUTIONSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nindirectCommandsLayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTCOMMANDSLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nmaxSequenceCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXSEQUENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxDrawCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXDRAWCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nindirectExecutionSet(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTEXECUTIONSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nindirectCommandsLayout(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTCOMMANDSLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nmaxSequenceCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXSEQUENCECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaxDrawCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXDRAWCOUNT
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
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
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
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTEXECUTIONSET = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTCOMMANDSLAYOUT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXSEQUENCECOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXDRAWCOUNT = r0
            return
    }
}
