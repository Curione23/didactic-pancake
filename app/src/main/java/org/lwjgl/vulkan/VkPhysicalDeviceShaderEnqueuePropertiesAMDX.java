package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX.class */
public class VkPhysicalDeviceShaderEnqueuePropertiesAMDX extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MAXEXECUTIONGRAPHDEPTH = 0;
    public static final int MAXEXECUTIONGRAPHSHADEROUTPUTNODES = 0;
    public static final int MAXEXECUTIONGRAPHSHADERPAYLOADSIZE = 0;
    public static final int MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT = 0;
    public static final int EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX, org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxExecutionGraphDepth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphDepth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxExecutionGraphShaderOutputNodes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderOutputNodes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int executionGraphDispatchAddressAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nexecutionGraphDispatchAddressAlignment(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000134001(0x3b9cd571, float:0.0047861864)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphDepth(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphDepth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphShaderOutputNodes(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderOutputNodes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphShaderPayloadSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphShaderPayloadCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer executionGraphDispatchAddressAlignment(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nexecutionGraphDispatchAddressAlignment(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceShaderEnqueuePropertiesAMDX(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
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

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxExecutionGraphDepth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxExecutionGraphDepth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxExecutionGraphShaderOutputNodes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxExecutionGraphShaderOutputNodes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxExecutionGraphShaderPayloadSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxExecutionGraphShaderPayloadCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int executionGraphDispatchAddressAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nexecutionGraphDispatchAddressAlignment(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000134001(0x3b9cd571, float:0.0047861864)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphDepth(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxExecutionGraphDepth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderOutputNodes(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxExecutionGraphShaderOutputNodes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxExecutionGraphShaderPayloadSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxExecutionGraphShaderPayloadCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX executionGraphDispatchAddressAlignment(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nexecutionGraphDispatchAddressAlignment(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX set(int r5, long r6, int r8, int r9, int r10, int r11, int r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.maxExecutionGraphDepth(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.maxExecutionGraphShaderOutputNodes(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.maxExecutionGraphShaderPayloadSize(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.maxExecutionGraphShaderPayloadCount(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.executionGraphDispatchAddressAlignment(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX set(org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmaxExecutionGraphDepth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHDEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxExecutionGraphShaderOutputNodes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADEROUTPUTNODES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxExecutionGraphShaderPayloadSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxExecutionGraphShaderPayloadCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nexecutionGraphDispatchAddressAlignment(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmaxExecutionGraphDepth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHDEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxExecutionGraphShaderOutputNodes(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADEROUTPUTNODES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxExecutionGraphShaderPayloadSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmaxExecutionGraphShaderPayloadCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nexecutionGraphDispatchAddressAlignment(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHDEPTH = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADEROUTPUTNODES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADSIZE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX.EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT = r0
            return
    }
}
