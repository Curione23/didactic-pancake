package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo.class */
public class VkQueryPoolCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkQueryPoolCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int QUERYTYPE = 0;
    public static final int QUERYCOUNT = 0;
    public static final int PIPELINESTATISTICS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkQueryPoolCreateInfo, org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkQueryPoolCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkQueryPoolCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkQueryPoolCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkQueryType")
        public int queryType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.nqueryType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queryCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.nqueryCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags")
        public int pipelineStatistics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.npipelineStatistics(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueryPoolCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 11
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkQueryPoolCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkQueryPoolCreateInfoINTEL r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkQueryPoolCreateInfoINTEL r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkQueryPoolVideoEncodeFeedbackCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkQueryPoolVideoEncodeFeedbackCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoDecodeH264ProfileInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoDecodeH264ProfileInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoDecodeH265ProfileInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoDecodeH265ProfileInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoDecodeUsageInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoDecodeUsageInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoEncodeH264ProfileInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoEncodeH264ProfileInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoEncodeH265ProfileInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoEncodeH265ProfileInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoEncodeUsageInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoEncodeUsageInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoProfileInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoProfileInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkQueryPoolCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueryPoolCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer queryType(@org.lwjgl.system.NativeType("VkQueryType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueryPoolCreateInfo.nqueryType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer queryCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueryPoolCreateInfo.nqueryCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer pipelineStatistics(@org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkQueryPoolCreateInfo.npipelineStatistics(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.create(r0)
                org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkQueryPoolCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkQueryPoolCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkQueryPoolCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkQueryPoolCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkQueryType")
    public int queryType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueryType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int queryCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueryCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags")
    public int pipelineStatistics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npipelineStatistics(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 11
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkQueryPoolCreateInfoINTEL r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkQueryPoolCreateInfoINTEL r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkQueryPoolPerformanceCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkQueryPoolVideoEncodeFeedbackCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkQueryPoolVideoEncodeFeedbackCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkVideoDecodeH264ProfileInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoDecodeH264ProfileInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkVideoDecodeH265ProfileInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoDecodeH265ProfileInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkVideoDecodeUsageInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoDecodeUsageInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkVideoEncodeH264ProfileInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoEncodeH264ProfileInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkVideoEncodeH265ProfileInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoEncodeH265ProfileInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkVideoEncodeUsageInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoEncodeUsageInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pNext(org.lwjgl.vulkan.VkVideoProfileInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoProfileInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo flags(@org.lwjgl.system.NativeType("VkQueryPoolCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo queryType(@org.lwjgl.system.NativeType("VkQueryType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueryType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo queryCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueryCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo pipelineStatistics(@org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npipelineStatistics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo set(int r5, long r6, int r8, int r9, int r10, int r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.queryType(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.queryCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.pipelineStatistics(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkQueryPoolCreateInfo set(org.lwjgl.vulkan.VkQueryPoolCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo malloc() {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo calloc() {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkQueryPoolCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkQueryPoolCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueryType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueryCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npipelineStatistics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.PIPELINESTATISTICS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nqueryType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nqueryCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npipelineStatistics(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.PIPELINESTATISTICS
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
            org.lwjgl.vulkan.VkQueryPoolCreateInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkQueryPoolCreateInfo.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYTYPE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.QUERYCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkQueryPoolCreateInfo.PIPELINESTATISTICS = r0
            return
    }
}
