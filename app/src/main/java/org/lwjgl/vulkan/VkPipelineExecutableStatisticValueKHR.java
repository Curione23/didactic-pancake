package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR.class */
public class VkPipelineExecutableStatisticValueKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int B32 = 0;
    public static final int I64 = 0;
    public static final int U64 = 0;
    public static final int F64 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR, org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.Buffer> {
        private static final org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean b32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.nb32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("int64_t")
        public long i64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.ni64(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long u64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.nu64(r0)
                return r0
        }

        public double f64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                double r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.nf64(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.create(r0)
                org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineExecutableStatisticValueKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR r0 = new org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineExecutableStatisticValueKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean b32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nb32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("int64_t")
    public long i64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ni64(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long u64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nu64(r0)
            return r0
    }

    public double f64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            double r0 = nf64(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR create(long r6) {
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR r0 = new org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR r0 = new org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR$Buffer r0 = new org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static int nb32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.B32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ni64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.I64
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nu64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.U64
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static double nf64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.F64
            long r3 = (long) r3
            long r2 = r2 + r3
            double r0 = r0.getDouble(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
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
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.B32 = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.I64 = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.U64 = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineExecutableStatisticValueKHR.F64 = r0
            return
    }
}
