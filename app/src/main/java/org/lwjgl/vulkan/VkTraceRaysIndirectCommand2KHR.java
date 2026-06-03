package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR.class */
public class VkTraceRaysIndirectCommand2KHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int RAYGENSHADERRECORDADDRESS = 0;
    public static final int RAYGENSHADERRECORDSIZE = 0;
    public static final int MISSSHADERBINDINGTABLEADDRESS = 0;
    public static final int MISSSHADERBINDINGTABLESIZE = 0;
    public static final int MISSSHADERBINDINGTABLESTRIDE = 0;
    public static final int HITSHADERBINDINGTABLEADDRESS = 0;
    public static final int HITSHADERBINDINGTABLESIZE = 0;
    public static final int HITSHADERBINDINGTABLESTRIDE = 0;
    public static final int CALLABLESHADERBINDINGTABLEADDRESS = 0;
    public static final int CALLABLESHADERBINDINGTABLESIZE = 0;
    public static final int CALLABLESHADERBINDINGTABLESTRIDE = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int DEPTH = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTraceRaysIndirectCommand2KHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR, org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long raygenShaderRecordAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long raygenShaderRecordSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long missShaderBindingTableAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long missShaderBindingTableSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long missShaderBindingTableStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long hitShaderBindingTableAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long hitShaderBindingTableSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long hitShaderBindingTableStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long callableShaderBindingTableAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long callableShaderBindingTableSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long callableShaderBindingTableStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nwidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int depth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ndepth(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer raygenShaderRecordAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer raygenShaderRecordSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer missShaderBindingTableAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer missShaderBindingTableSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer missShaderBindingTableStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer hitShaderBindingTableAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer hitShaderBindingTableSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer hitShaderBindingTableStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer callableShaderBindingTableAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer callableShaderBindingTableSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer callableShaderBindingTableStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nwidth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer height(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.nheight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer depth(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ndepth(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.create(r0)
                org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkTraceRaysIndirectCommand2KHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkTraceRaysIndirectCommand2KHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long raygenShaderRecordAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nraygenShaderRecordAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long raygenShaderRecordSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nraygenShaderRecordSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long missShaderBindingTableAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmissShaderBindingTableAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long missShaderBindingTableSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmissShaderBindingTableSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long missShaderBindingTableStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmissShaderBindingTableStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long hitShaderBindingTableAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhitShaderBindingTableAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long hitShaderBindingTableSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhitShaderBindingTableSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long hitShaderBindingTableStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhitShaderBindingTableStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long callableShaderBindingTableAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncallableShaderBindingTableAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long callableShaderBindingTableSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncallableShaderBindingTableSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long callableShaderBindingTableStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncallableShaderBindingTableStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int depth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndepth(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nraygenShaderRecordAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR raygenShaderRecordSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nraygenShaderRecordSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmissShaderBindingTableAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR missShaderBindingTableSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmissShaderBindingTableSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR missShaderBindingTableStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmissShaderBindingTableStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhitShaderBindingTableAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhitShaderBindingTableSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhitShaderBindingTableStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ncallableShaderBindingTableAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ncallableShaderBindingTableSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ncallableShaderBindingTableStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwidth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR height(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR depth(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR set(long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, int r27, int r28, int r29) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.raygenShaderRecordAddress(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.raygenShaderRecordSize(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.missShaderBindingTableAddress(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.missShaderBindingTableSize(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.missShaderBindingTableStride(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.hitShaderBindingTableAddress(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.hitShaderBindingTableSize(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.hitShaderBindingTableStride(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.callableShaderBindingTableAddress(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.callableShaderBindingTableSize(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.callableShaderBindingTableStride(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.width(r1)
            r0 = r4
            r1 = r28
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.height(r1)
            r0 = r4
            r1 = r29
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.depth(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR set(org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR malloc() {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR calloc() {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR create() {
            int r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR create(long r6) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer
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

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer r0 = new org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nraygenShaderRecordAddress(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nraygenShaderRecordSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nmissShaderBindingTableAddress(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nmissShaderBindingTableSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nmissShaderBindingTableStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nhitShaderBindingTableAddress(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nhitShaderBindingTableSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nhitShaderBindingTableStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ncallableShaderBindingTableAddress(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ncallableShaderBindingTableSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ncallableShaderBindingTableStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndepth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.DEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nraygenShaderRecordAddress(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nraygenShaderRecordSize(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nmissShaderBindingTableAddress(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nmissShaderBindingTableSize(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nmissShaderBindingTableStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nhitShaderBindingTableAddress(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nhitShaderBindingTableSize(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nhitShaderBindingTableStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ncallableShaderBindingTableAddress(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ncallableShaderBindingTableSize(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ncallableShaderBindingTableStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nwidth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nheight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndepth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.DEPTH
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
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 8
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDADDRESS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDSIZE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLEADDRESS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESTRIDE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLEADDRESS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESIZE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESTRIDE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLEADDRESS = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESIZE = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESTRIDE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.WIDTH = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.HEIGHT = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTraceRaysIndirectCommand2KHR.DEPTH = r0
            return
    }
}
