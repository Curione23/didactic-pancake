package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR.class */
public class VkDisplayPlaneCapabilitiesKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SUPPORTEDALPHA = 0;
    public static final int MINSRCPOSITION = 0;
    public static final int MAXSRCPOSITION = 0;
    public static final int MINSRCEXTENT = 0;
    public static final int MAXSRCEXTENT = 0;
    public static final int MINDSTPOSITION = 0;
    public static final int MAXDSTPOSITION = 0;
    public static final int MINDSTEXTENT = 0;
    public static final int MAXDSTEXTENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR, org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkDisplayPlaneAlphaFlagsKHR")
        public int supportedAlpha() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nsupportedAlpha(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset2D minSrcPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nminSrcPosition(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset2D maxSrcPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nmaxSrcPosition(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D minSrcExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nminSrcExtent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxSrcExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nmaxSrcExtent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset2D minDstPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nminDstPosition(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset2D maxDstPosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nmaxDstPosition(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D minDstExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nminDstExtent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxDstExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.nmaxDstExtent(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.create(r0)
                org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDisplayPlaneCapabilitiesKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDisplayPlaneCapabilitiesKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkDisplayPlaneAlphaFlagsKHR")
    public int supportedAlpha() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportedAlpha(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset2D minSrcPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset2D r0 = nminSrcPosition(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset2D maxSrcPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset2D r0 = nmaxSrcPosition(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D minSrcExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nminSrcExtent(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxSrcExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxSrcExtent(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset2D minDstPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset2D r0 = nminDstPosition(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset2D maxDstPosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset2D r0 = nmaxDstPosition(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D minDstExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nminDstExtent(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxDstExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxDstExtent(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR malloc() {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR calloc() {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR create() {
            int r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR create(long r6) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsupportedAlpha(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SUPPORTEDALPHA
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset2D nminSrcPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINSRCPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkOffset2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset2D nmaxSrcPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXSRCPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkOffset2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nminSrcExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINSRCEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxSrcExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXSRCEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset2D nminDstPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINDSTPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkOffset2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset2D nmaxDstPosition(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXDSTPOSITION
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset2D r0 = org.lwjgl.vulkan.VkOffset2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nminDstExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINDSTEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxDstExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXDSTEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkOffset2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkOffset2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkOffset2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkOffset2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.SUPPORTEDALPHA = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINSRCPOSITION = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXSRCPOSITION = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINSRCEXTENT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXSRCEXTENT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINDSTPOSITION = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXDSTPOSITION = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MINDSTEXTENT = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDisplayPlaneCapabilitiesKHR.MAXDSTEXTENT = r0
            return
    }
}
