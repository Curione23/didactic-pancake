package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT.class */
public class VkDeviceFaultAddressInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ADDRESSTYPE = 0;
    public static final int REPORTEDADDRESS = 0;
    public static final int ADDRESSPRECISION = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultAddressInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT, org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceFaultAddressTypeEXT")
        public int addressType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.naddressType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long reportedAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.nreportedAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long addressPrecision() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.naddressPrecision(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer addressType(@org.lwjgl.system.NativeType("VkDeviceFaultAddressTypeEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.naddressType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer reportedAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.nreportedAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer addressPrecision(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.naddressPrecision(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.create(r0)
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDeviceFaultAddressInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDeviceFaultAddressInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceFaultAddressTypeEXT")
    public int addressType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naddressType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long reportedAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nreportedAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long addressPrecision() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naddressPrecision(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT addressType(@org.lwjgl.system.NativeType("VkDeviceFaultAddressTypeEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naddressType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT reportedAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nreportedAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT addressPrecision(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            naddressPrecision(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT set(int r5, long r6, long r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = r0.addressType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = r0.reportedAddress(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = r0.addressPrecision(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT set(org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT malloc() {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT calloc() {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int naddressType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ADDRESSTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nreportedAddress(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.REPORTEDADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long naddressPrecision(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ADDRESSPRECISION
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void naddressType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ADDRESSTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nreportedAddress(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.REPORTEDADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void naddressPrecision(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ADDRESSPRECISION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ADDRESSTYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.REPORTEDADDRESS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.ADDRESSPRECISION = r0
            return
    }
}
