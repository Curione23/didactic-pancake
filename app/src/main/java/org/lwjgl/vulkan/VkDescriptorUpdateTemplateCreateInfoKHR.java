package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR.class */
public class VkDescriptorUpdateTemplateCreateInfoKHR extends org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer {
        private static final org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000085000(0x3b9c1608, float:0.0047633685)
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pDescriptorUpdateEntries(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.npDescriptorUpdateEntries(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer templateType(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.ntemplateType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer descriptorSetLayout(@org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.ndescriptorSetLayout(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.npipelineBindPoint(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.npipelineLayout(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.nset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer set(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.set(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.pipelineLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.pipelineBindPoint(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer descriptorSetLayout(@org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.descriptorSetLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer templateType(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.templateType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pDescriptorUpdateEntries(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.pDescriptorUpdateEntries(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.flags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorUpdateTemplateCreateInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorUpdateTemplateCreateInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000085000(0x3b9c1608, float:0.0047633685)
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR flags(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR pDescriptorUpdateEntries(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescriptorUpdateEntries(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR templateType(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntemplateType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR descriptorSetLayout(@org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndescriptorSetLayout(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npipelineBindPoint(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR pipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npipelineLayout(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nset(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR set(int r5, long r6, int r8, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r9, int r10, long r11, int r13, long r14, int r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pDescriptorUpdateEntries(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.templateType(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.descriptorSetLayout(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pipelineBindPoint(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pipelineLayout(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.set(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR set(org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo set(int r15, long r16, int r18, org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r19, int r20, long r21, int r23, long r24, int r26) {
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            r9 = r26
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo set(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.set(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pipelineLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pipelineBindPoint(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(@org.lwjgl.system.NativeType("VkDescriptorSetLayout") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.descriptorSetLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo templateType(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.templateType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateEntry const *") org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pDescriptorUpdateEntries(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo flags(@org.lwjgl.system.NativeType("VkDescriptorUpdateTemplateCreateFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.flags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
