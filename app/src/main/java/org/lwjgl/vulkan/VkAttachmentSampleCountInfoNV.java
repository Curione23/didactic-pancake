package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV.class */
public class VkAttachmentSampleCountInfoNV extends org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer {
        private static final org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000044008(0x3b9b75e8, float:0.00474428)
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.ncolorAttachmentCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer pColorAttachmentSamples(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSampleCountFlagBits const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.npColorAttachmentSamples(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer depthStencilAttachmentSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.ndepthStencilAttachmentSamples(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer depthStencilAttachmentSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.depthStencilAttachmentSamples(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer pColorAttachmentSamples(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSampleCountFlagBits const *") java.nio.IntBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.pColorAttachmentSamples(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.colorAttachmentCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.create(r0)
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAttachmentSampleCountInfoNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAttachmentSampleCountInfoNV(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000044008(0x3b9b75e8, float:0.00474428)
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolorAttachmentCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV pColorAttachmentSamples(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSampleCountFlagBits const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorAttachmentSamples(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV depthStencilAttachmentSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthStencilAttachmentSamples(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV set(int r5, long r6, int r8, @javax.annotation.Nullable java.nio.IntBuffer r9, int r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.colorAttachmentCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.pColorAttachmentSamples(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.depthStencilAttachmentSamples(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV set(org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV malloc() {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV calloc() {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV create(long r6) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD set(int r9, long r10, int r12, @javax.annotation.Nullable java.nio.IntBuffer r13, int r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.set(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD depthStencilAttachmentSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.depthStencilAttachmentSamples(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD pColorAttachmentSamples(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSampleCountFlagBits const *") java.nio.IntBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.pColorAttachmentSamples(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.colorAttachmentCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r0 = r0.create(r1, r2)
            return r0
    }
}
