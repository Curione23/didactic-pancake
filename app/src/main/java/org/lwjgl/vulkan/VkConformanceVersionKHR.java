package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersionKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersionKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersionKHR.class */
public class VkConformanceVersionKHR extends org.lwjgl.vulkan.VkConformanceVersion {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersionKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersionKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersionKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkConformanceVersion.Buffer {
        private static final org.lwjgl.vulkan.VkConformanceVersionKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkConformanceVersionKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkConformanceVersionKHR r0 = org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer major(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersionKHR.nmajor(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer minor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersionKHR.nminor(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer subminor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersionKHR.nsubminor(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer patch(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersionKHR.npatch(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion.Buffer patch(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = r0.patch(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion.Buffer subminor(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = r0.subminor(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion.Buffer minor(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = r0.minor(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion.Buffer major(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = r0.major(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkConformanceVersionKHR r0 = org.lwjgl.vulkan.VkConformanceVersionKHR.create(r0)
                org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkConformanceVersionKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkConformanceVersionKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkConformanceVersionKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public org.lwjgl.vulkan.VkConformanceVersionKHR major(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmajor(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public org.lwjgl.vulkan.VkConformanceVersionKHR minor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminor(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public org.lwjgl.vulkan.VkConformanceVersionKHR subminor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubminor(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public org.lwjgl.vulkan.VkConformanceVersionKHR patch(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npatch(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public org.lwjgl.vulkan.VkConformanceVersionKHR set(byte r4, byte r5, byte r6, byte r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.major(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.minor(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.subminor(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.patch(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersionKHR set(org.lwjgl.vulkan.VkConformanceVersionKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR malloc() {
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR calloc() {
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR create() {
            int r0 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR create(long r6) {
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkConformanceVersionKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer
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

    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkConformanceVersionKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersionKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkConformanceVersionKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersionKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersionKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkConformanceVersionKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkConformanceVersionKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion set(byte r7, byte r8, byte r9, byte r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.set(r1, r2, r3, r4)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion patch(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.patch(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion subminor(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.subminor(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion minor(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.minor(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion major(@org.lwjgl.system.NativeType("uint8_t") byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.major(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkConformanceVersion create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkConformanceVersionKHR r0 = r0.create(r1, r2)
            return r0
    }
}
