package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo.class */
public class VkPipelineColorBlendStateCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int LOGICOPENABLE = 0;
    public static final int LOGICOP = 0;
    public static final int ATTACHMENTCOUNT = 0;
    public static final int PATTACHMENTS = 0;
    public static final int BLENDCONSTANTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo, org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean logicOpEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkLogicOp")
        public int logicOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nlogicOp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int attachmentCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nattachmentCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineColorBlendAttachmentState const *")
        public org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer pAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState$Buffer r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.npAttachments(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("float[4]")
        public java.nio.FloatBuffer blendConstants() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nblendConstants(r0)
                return r0
        }

        public float blendConstants(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nblendConstants(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 26
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineColorBlendAdvancedStateCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineColorBlendAdvancedStateCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineColorWriteCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineColorWriteCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer logicOpEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer logicOp(@org.lwjgl.system.NativeType("VkLogicOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nlogicOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer attachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nattachmentCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer pAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineColorBlendAttachmentState const *") org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.npAttachments(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer blendConstants(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nblendConstants(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer blendConstants(int r6, float r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.nblendConstants(r0, r1, r2)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.create(r0)
                org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineColorBlendStateCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineColorBlendStateCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean logicOpEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlogicOpEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkLogicOp")
    public int logicOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlogicOp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int attachmentCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nattachmentCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineColorBlendAttachmentState const *")
    public org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer pAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState$Buffer r0 = npAttachments(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("float[4]")
    public java.nio.FloatBuffer blendConstants() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nblendConstants(r0)
            return r0
    }

    public float blendConstants(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nblendConstants(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 26
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineColorBlendAdvancedStateCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineColorBlendAdvancedStateCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineColorWriteCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineColorWriteCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo flags(@org.lwjgl.system.NativeType("VkPipelineColorBlendStateCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo logicOpEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nlogicOpEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo logicOp(@org.lwjgl.system.NativeType("VkLogicOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlogicOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo attachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nattachmentCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo pAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineColorBlendAttachmentState const *") org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npAttachments(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo blendConstants(@org.lwjgl.system.NativeType("float[4]") java.nio.FloatBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nblendConstants(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo blendConstants(int r6, float r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nblendConstants(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo set(int r5, long r6, int r8, boolean r9, int r10, int r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer r12, java.nio.FloatBuffer r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.logicOpEnable(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.logicOp(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.attachmentCount(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.pAttachments(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.blendConstants(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo set(org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo malloc() {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo calloc() {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlogicOpEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlogicOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nattachmentCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer npAttachments(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nattachmentCount(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState$Buffer r0 = org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.createSafe(r0, r1)
            return r0
    }

    public static java.nio.FloatBuffer nblendConstants(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nblendConstants(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlogicOpEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlogicOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nattachmentCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npAttachments(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PATTACHMENTS
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
            nattachmentCount(r0, r1)
        L19:
            return
    }

    public static void nblendConstants(long r7, java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 4
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS
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

    public static void nblendConstants(long r9, int r11, float r12) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putFloat(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.POINTER_SIZE
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
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOPENABLE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.LOGICOP = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.ATTACHMENTCOUNT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.PATTACHMENTS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineColorBlendStateCreateInfo.BLENDCONSTANTS = r0
            return
    }
}
