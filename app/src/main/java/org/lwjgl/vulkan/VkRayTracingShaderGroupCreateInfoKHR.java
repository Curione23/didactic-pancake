package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR.class */
public class VkRayTracingShaderGroupCreateInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int TYPE = 0;
    public static final int GENERALSHADER = 0;
    public static final int CLOSESTHITSHADER = 0;
    public static final int ANYHITSHADER = 0;
    public static final int INTERSECTIONSHADER = 0;
    public static final int PSHADERGROUPCAPTUREREPLAYHANDLE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR, org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRayTracingShaderGroupTypeKHR")
        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int generalShader() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int closestHitShader() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int anyHitShader() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int intersectionShader() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pShaderGroupCaptureReplayHandle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000150016(0x3b9d1400, float:0.004793644)
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer type(@org.lwjgl.system.NativeType("VkRayTracingShaderGroupTypeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer generalShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer closestHitShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer anyHitShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer intersectionShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer pShaderGroupCaptureReplayHandle(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRayTracingShaderGroupCreateInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRayTracingShaderGroupCreateInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkRayTracingShaderGroupTypeKHR")
    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int generalShader() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngeneralShader(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int closestHitShader() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclosestHitShader(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int anyHitShader() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nanyHitShader(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int intersectionShader() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintersectionShader(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public long pShaderGroupCaptureReplayHandle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npShaderGroupCaptureReplayHandle(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000150016(0x3b9d1400, float:0.004793644)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR type(@org.lwjgl.system.NativeType("VkRayTracingShaderGroupTypeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR generalShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeneralShader(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR closestHitShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclosestHitShader(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR anyHitShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nanyHitShader(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR intersectionShader(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nintersectionShader(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandle(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npShaderGroupCaptureReplayHandle(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, long r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.type(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.generalShader(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.closestHitShader(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.anyHitShader(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.intersectionShader(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.pShaderGroupCaptureReplayHandle(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR set(org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ngeneralShader(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.GENERALSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nclosestHitShader(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.CLOSESTHITSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nanyHitShader(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ANYHITSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintersectionShader(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.INTERSECTIONSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npShaderGroupCaptureReplayHandle(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.PSHADERGROUPCAPTUREREPLAYHANDLE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ngeneralShader(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.GENERALSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nclosestHitShader(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.CLOSESTHITSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nanyHitShader(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ANYHITSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nintersectionShader(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.INTERSECTIONSHADER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npShaderGroupCaptureReplayHandle(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.PSHADERGROUPCAPTUREREPLAYHANDLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.POINTER_SIZE
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
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.TYPE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.GENERALSHADER = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.CLOSESTHITSHADER = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.ANYHITSHADER = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.INTERSECTIONSHADER = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR.PSHADERGROUPCAPTUREREPLAYHANDLE = r0
            return
    }
}
