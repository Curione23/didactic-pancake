package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD.class */
public class VkShaderStatisticsInfoAMD extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkShaderStatisticsInfoAMD> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SHADERSTAGEMASK = 0;
    public static final int RESOURCEUSAGE = 0;
    public static final int NUMPHYSICALVGPRS = 0;
    public static final int NUMPHYSICALSGPRS = 0;
    public static final int NUMAVAILABLEVGPRS = 0;
    public static final int NUMAVAILABLESGPRS = 0;
    public static final int COMPUTEWORKGROUPSIZE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkShaderStatisticsInfoAMD, org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.Buffer> {
        private static final org.lwjgl.vulkan.VkShaderStatisticsInfoAMD ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.SIZEOF
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
        protected org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkShaderStatisticsInfoAMD getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkShaderStatisticsInfoAMD r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int shaderStageMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.nshaderStageMask(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkShaderResourceUsageAMD resourceUsage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkShaderResourceUsageAMD r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.nresourceUsage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numPhysicalVgprs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.nnumPhysicalVgprs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numPhysicalSgprs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.nnumPhysicalSgprs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numAvailableVgprs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.nnumAvailableVgprs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numAvailableSgprs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.nnumAvailableSgprs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[3]")
        public java.nio.IntBuffer computeWorkGroupSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int computeWorkGroupSize(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkShaderStatisticsInfoAMD r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkShaderStatisticsInfoAMD$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkShaderStatisticsInfoAMD r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.create(r0)
                org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkShaderStatisticsInfoAMD(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkShaderStatisticsInfoAMD create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD r0 = new org.lwjgl.vulkan.VkShaderStatisticsInfoAMD
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkShaderStatisticsInfoAMD(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int shaderStageMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStageMask(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkShaderResourceUsageAMD resourceUsage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkShaderResourceUsageAMD r0 = nresourceUsage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numPhysicalVgprs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumPhysicalVgprs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numPhysicalSgprs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumPhysicalSgprs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numAvailableVgprs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumAvailableVgprs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numAvailableSgprs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumAvailableSgprs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[3]")
    public java.nio.IntBuffer computeWorkGroupSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = ncomputeWorkGroupSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int computeWorkGroupSize(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = ncomputeWorkGroupSize(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderStatisticsInfoAMD create(long r6) {
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD r0 = new org.lwjgl.vulkan.VkShaderStatisticsInfoAMD
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkShaderStatisticsInfoAMD createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD r0 = new org.lwjgl.vulkan.VkShaderStatisticsInfoAMD
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD$Buffer r0 = new org.lwjgl.vulkan.VkShaderStatisticsInfoAMD$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD$Buffer r0 = new org.lwjgl.vulkan.VkShaderStatisticsInfoAMD$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static int nshaderStageMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.SHADERSTAGEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkShaderResourceUsageAMD nresourceUsage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.RESOURCEUSAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkShaderResourceUsageAMD r0 = org.lwjgl.vulkan.VkShaderResourceUsageAMD.create(r0)
            return r0
    }

    public static int nnumPhysicalVgprs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMPHYSICALVGPRS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnumPhysicalSgprs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMPHYSICALSGPRS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnumAvailableVgprs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMAVAILABLEVGPRS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnumAvailableSgprs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMAVAILABLESGPRS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer ncomputeWorkGroupSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.COMPUTEWORKGROUPSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int ncomputeWorkGroupSize(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.COMPUTEWORKGROUPSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkShaderResourceUsageAMD.SIZEOF
            int r4 = org.lwjgl.vulkan.VkShaderResourceUsageAMD.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.SHADERSTAGEMASK = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.RESOURCEUSAGE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMPHYSICALVGPRS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMPHYSICALSGPRS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMAVAILABLEVGPRS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.NUMAVAILABLESGPRS = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkShaderStatisticsInfoAMD.COMPUTEWORKGROUPSIZE = r0
            return
    }
}
