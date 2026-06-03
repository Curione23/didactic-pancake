package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo.class */
public class VkDescriptorUpdateTemplateCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int DESCRIPTORUPDATEENTRYCOUNT = 0;
    public static final int PDESCRIPTORUPDATEENTRIES = 0;
    public static final int TEMPLATETYPE = 0;
    public static final int DESCRIPTORSETLAYOUT = 0;
    public static final int PIPELINEBINDPOINT = 0;
    public static final int PIPELINELAYOUT = 0;
    public static final int SET = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo, org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int descriptorUpdateEntryCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ndescriptorUpdateEntryCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *")
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry$Buffer r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npDescriptorUpdateEntries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType")
        public int templateType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ntemplateType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDescriptorSetLayout")
        public long descriptorSetLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ndescriptorSetLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npipelineBindPoint(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineLayout")
        public long pipelineLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npipelineLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int set() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.nset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000085000(0x3b9c1608, float:0.0047633685)
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pDescriptorUpdateEntries(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npDescriptorUpdateEntries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer templateType(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ntemplateType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer descriptorSetLayout(@org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ndescriptorSetLayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npipelineBindPoint(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.npipelineLayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.nset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.create(r0)
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorUpdateTemplateCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorUpdateTemplateCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int descriptorUpdateEntryCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorUpdateEntryCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *")
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry$Buffer r0 = npDescriptorUpdateEntries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType")
    public int templateType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntemplateType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDescriptorSetLayout")
    public long descriptorSetLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndescriptorSetLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npipelineBindPoint(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineLayout")
    public long pipelineLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npipelineLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int set() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000085000(0x3b9c1608, float:0.0047633685)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo flags(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescriptorUpdateEntries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo templateType(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntemplateType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(@org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndescriptorSetLayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npipelineBindPoint(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npipelineLayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo set(int r5, long r6, int r8, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r9, int r10, long r11, int r13, long r14, int r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.pDescriptorUpdateEntries(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.templateType(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.descriptorSetLayout(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.pipelineBindPoint(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.pipelineLayout(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.set(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo set(org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo malloc() {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo calloc() {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorUpdateEntryCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORUPDATEENTRYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer npDescriptorUpdateEntries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndescriptorUpdateEntryCount(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry$Buffer r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.create(r0, r1)
            return r0
    }

    public static int ntemplateType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.TEMPLATETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndescriptorSetLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORSETLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int npipelineBindPoint(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINEBINDPOINT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npipelineLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorUpdateEntryCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORUPDATEENTRYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npDescriptorUpdateEntries(long r5, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            ndescriptorUpdateEntryCount(r0, r1)
            return
    }

    public static void ntemplateType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.TEMPLATETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorSetLayout(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORSETLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void npipelineBindPoint(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINEBINDPOINT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npipelineLayout(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES
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
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORUPDATEENTRYCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.TEMPLATETYPE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORSETLAYOUT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINEBINDPOINT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.PIPELINELAYOUT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.SET = r0
            return
    }
}
