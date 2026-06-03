package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class */
public class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM extends org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000342000(0x3ba001f0, float:0.0048830435)
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderColorAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderColorAttachmentAccess(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderDepthAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderDepthAttachmentAccess(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderStencilAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderStencilAttachmentAccess(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer rasterizationOrderStencilAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.rasterizationOrderStencilAttachmentAccess(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer rasterizationOrderDepthAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.rasterizationOrderDepthAttachmentAccess(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer rasterizationOrderColorAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.rasterizationOrderColorAttachmentAccess(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000342000(0x3ba001f0, float:0.0048830435)
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nrasterizationOrderColorAttachmentAccess(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nrasterizationOrderDepthAttachmentAccess(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nrasterizationOrderStencilAttachmentAccess(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(int r5, long r6, boolean r8, boolean r9, boolean r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.rasterizationOrderColorAttachmentAccess(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.rasterizationOrderDepthAttachmentAccess(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.rasterizationOrderStencilAttachmentAccess(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT set(int r9, long r10, boolean r12, boolean r13, boolean r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.set(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderStencilAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.rasterizationOrderStencilAttachmentAccess(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderDepthAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.rasterizationOrderDepthAttachmentAccess(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderColorAttachmentAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.rasterizationOrderColorAttachmentAccess(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r0 = r0.create(r1, r2)
            return r0
    }
}
