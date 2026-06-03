package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class */
public class VkPhysicalDeviceBufferDeviceAddressFeaturesKHR extends org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000257000(0x3b9eb5e8, float:0.0048434623)
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer bufferDeviceAddress(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddress(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer bufferDeviceAddressCaptureReplay(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddressCaptureReplay(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer bufferDeviceAddressMultiDevice(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddressMultiDevice(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddressMultiDevice(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.bufferDeviceAddressMultiDevice(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddressCaptureReplay(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.bufferDeviceAddressCaptureReplay(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddress(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.bufferDeviceAddress(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000257000(0x3b9eb5e8, float:0.0048434623)
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddress(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbufferDeviceAddress(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddressCaptureReplay(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbufferDeviceAddressCaptureReplay(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddressMultiDevice(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbufferDeviceAddressMultiDevice(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR set(int r5, long r6, boolean r8, boolean r9, boolean r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.bufferDeviceAddress(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.bufferDeviceAddressCaptureReplay(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.bufferDeviceAddressMultiDevice(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR set(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures set(int r9, long r10, boolean r12, boolean r13, boolean r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.set(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressMultiDevice(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.bufferDeviceAddressMultiDevice(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplay(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.bufferDeviceAddressCaptureReplay(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddress(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.bufferDeviceAddress(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r0 = r0.create(r1, r2)
            return r0
    }
}
