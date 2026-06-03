package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersion.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersion.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersion.class */
public class VkConformanceVersion extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkConformanceVersion> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int MAJOR = 0;
    public static final int MINOR = 0;
    public static final int SUBMINOR = 0;
    public static final int PATCH = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersion$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersion$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConformanceVersion$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkConformanceVersion, org.lwjgl.vulkan.VkConformanceVersion.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkConformanceVersion ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
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
        protected org.lwjgl.vulkan.VkConformanceVersion.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkConformanceVersion getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkConformanceVersion r0 = org.lwjgl.vulkan.VkConformanceVersion.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte major() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.VkConformanceVersion.nmajor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte minor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.VkConformanceVersion.nminor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte subminor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.VkConformanceVersion.nsubminor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte patch() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.vulkan.VkConformanceVersion.npatch(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkConformanceVersion.Buffer major(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersion.nmajor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConformanceVersion.Buffer minor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersion.nminor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConformanceVersion.Buffer subminor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersion.nsubminor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConformanceVersion.Buffer patch(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConformanceVersion.npatch(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConformanceVersion r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkConformanceVersion r0 = org.lwjgl.vulkan.VkConformanceVersion.create(r0)
                org.lwjgl.vulkan.VkConformanceVersion.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkConformanceVersion(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkConformanceVersion create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkConformanceVersion(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte major() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmajor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte minor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nminor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte subminor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsubminor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte patch() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npatch(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersion major(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmajor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersion minor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersion subminor(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubminor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersion patch(@org.lwjgl.system.NativeType("uint8_t") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npatch(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersion set(byte r4, byte r5, byte r6, byte r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkConformanceVersion r0 = r0.major(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkConformanceVersion r0 = r0.minor(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkConformanceVersion r0 = r0.subminor(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkConformanceVersion r0 = r0.patch(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkConformanceVersion set(org.lwjgl.vulkan.VkConformanceVersion r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion malloc() {
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion calloc() {
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion create() {
            int r0 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion create(long r6) {
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkConformanceVersion createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersion$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersion$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersion$Buffer
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

    public static org.lwjgl.vulkan.VkConformanceVersion.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersion$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkConformanceVersion.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersion$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkConformanceVersion r0 = new org.lwjgl.vulkan.VkConformanceVersion
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersion$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConformanceVersion.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkConformanceVersion$Buffer r0 = new org.lwjgl.vulkan.VkConformanceVersion$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkConformanceVersion.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte nmajor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.MAJOR
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nminor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.MINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsubminor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.SUBMINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npatch(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.PATCH
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void nmajor(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.MAJOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nminor(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.MINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsubminor(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.SUBMINOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void npatch(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkConformanceVersion.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConformanceVersion.PATCH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkConformanceVersion r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkConformanceVersion.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkConformanceVersion.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConformanceVersion.MAJOR = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConformanceVersion.MINOR = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConformanceVersion.SUBMINOR = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConformanceVersion.PATCH = r0
            return
    }
}
