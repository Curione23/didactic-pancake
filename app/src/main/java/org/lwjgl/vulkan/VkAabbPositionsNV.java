package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsNV.class */
public class VkAabbPositionsNV extends org.lwjgl.vulkan.VkAabbPositionsKHR {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsNV$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer {
        private static final org.lwjgl.vulkan.VkAabbPositionsNV ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkAabbPositionsNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAabbPositionsNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAabbPositionsNV r0 = org.lwjgl.vulkan.VkAabbPositionsNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public org.lwjgl.vulkan.VkAabbPositionsNV.Buffer minX(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsNV.nminX(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public org.lwjgl.vulkan.VkAabbPositionsNV.Buffer minY(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsNV.nminY(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public org.lwjgl.vulkan.VkAabbPositionsNV.Buffer minZ(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsNV.nminZ(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public org.lwjgl.vulkan.VkAabbPositionsNV.Buffer maxX(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsNV.nmaxX(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public org.lwjgl.vulkan.VkAabbPositionsNV.Buffer maxY(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsNV.nmaxY(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public org.lwjgl.vulkan.VkAabbPositionsNV.Buffer maxZ(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsNV.nmaxZ(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer maxZ(float r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.maxZ(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer maxY(float r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.maxY(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer maxX(float r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.maxX(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer minZ(float r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.minZ(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer minY(float r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.minY(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer minX(float r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.minX(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAabbPositionsNV r0 = org.lwjgl.vulkan.VkAabbPositionsNV.create(r0)
                org.lwjgl.vulkan.VkAabbPositionsNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAabbPositionsNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAabbPositionsNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAabbPositionsNV(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public org.lwjgl.vulkan.VkAabbPositionsNV minX(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminX(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public org.lwjgl.vulkan.VkAabbPositionsNV minY(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminY(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public org.lwjgl.vulkan.VkAabbPositionsNV minZ(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminZ(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public org.lwjgl.vulkan.VkAabbPositionsNV maxX(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxX(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public org.lwjgl.vulkan.VkAabbPositionsNV maxY(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxY(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public org.lwjgl.vulkan.VkAabbPositionsNV maxZ(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxZ(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public org.lwjgl.vulkan.VkAabbPositionsNV set(float r4, float r5, float r6, float r7, float r8, float r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.minX(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.minY(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.minZ(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.maxX(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.maxY(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.maxZ(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsNV set(org.lwjgl.vulkan.VkAabbPositionsNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV malloc() {
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV calloc() {
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV create() {
            int r0 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV create(long r6) {
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAabbPositionsNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsNV$Buffer
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

    public static org.lwjgl.vulkan.VkAabbPositionsNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAabbPositionsNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAabbPositionsNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = new org.lwjgl.vulkan.VkAabbPositionsNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAabbPositionsNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAabbPositionsNV$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAabbPositionsNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAabbPositionsNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR set(float r9, float r10, float r11, float r12, float r13, float r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR maxZ(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.maxZ(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR maxY(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.maxY(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR maxX(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.maxX(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR minZ(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.minZ(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR minY(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.minY(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR minX(float r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.minX(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAabbPositionsKHR create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAabbPositionsNV r0 = r0.create(r1, r2)
            return r0
    }
}
