package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsKHR.class */
public class VkAabbPositionsKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAabbPositionsKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int MINX = 0;
    public static final int MINY = 0;
    public static final int MINZ = 0;
    public static final int MAXX = 0;
    public static final int MAXY = 0;
    public static final int MAXZ = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAabbPositionsKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAabbPositionsKHR, org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAabbPositionsKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAabbPositionsKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAabbPositionsKHR r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        public float minX() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.nminX(r0)
                return r0
        }

        public float minY() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.nminY(r0)
                return r0
        }

        public float minZ() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.nminZ(r0)
                return r0
        }

        public float maxX() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.nmaxX(r0)
                return r0
        }

        public float maxY() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.nmaxY(r0)
                return r0
        }

        public float maxZ() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.nmaxZ(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer minX(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsKHR.nminX(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer minY(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsKHR.nminY(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer minZ(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsKHR.nminZ(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer maxX(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsKHR.nmaxX(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer maxY(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsKHR.nmaxY(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer maxZ(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAabbPositionsKHR.nmaxZ(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAabbPositionsKHR r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.create(r0)
                org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAabbPositionsKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAabbPositionsKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAabbPositionsKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            return r0
    }

    public float minX() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nminX(r0)
            return r0
    }

    public float minY() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nminY(r0)
            return r0
    }

    public float minZ() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nminZ(r0)
            return r0
    }

    public float maxX() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmaxX(r0)
            return r0
    }

    public float maxY() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmaxY(r0)
            return r0
    }

    public float maxZ() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmaxZ(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR minX(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminX(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR minY(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminY(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR minZ(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminZ(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR maxX(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxX(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR maxY(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxY(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR maxZ(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxZ(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR set(float r4, float r5, float r6, float r7, float r8, float r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.minX(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.minY(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.minZ(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.maxX(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.maxY(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.maxZ(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAabbPositionsKHR set(org.lwjgl.vulkan.VkAabbPositionsKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR malloc() {
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR calloc() {
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR create() {
            int r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR create(long r6) {
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAabbPositionsKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer
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

    public static org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer r0 = new org.lwjgl.vulkan.VkAabbPositionsKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static float nminX(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MINX
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nminY(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MINY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nminZ(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MINZ
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nmaxX(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MAXX
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nmaxY(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MAXY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nmaxZ(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MAXZ
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nminX(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MINX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nminY(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MINY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nminZ(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MINZ
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nmaxX(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MAXX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nmaxY(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MAXY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nmaxZ(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAabbPositionsKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAabbPositionsKHR.MAXZ
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAabbPositionsKHR r0 = r0.create(r1, r2)
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
            r3 = 4
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
            org.lwjgl.vulkan.VkAabbPositionsKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAabbPositionsKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAabbPositionsKHR.MINX = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAabbPositionsKHR.MINY = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAabbPositionsKHR.MINZ = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAabbPositionsKHR.MAXX = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAabbPositionsKHR.MAXY = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAabbPositionsKHR.MAXZ = r0
            return
    }
}
