package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT.class */
public class VkDeviceFaultVendorInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int DESCRIPTION = 0;
    public static final int VENDORFAULTCODE = 0;
    public static final int VENDORFAULTDATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT, org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public java.nio.ByteBuffer description() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ndescription(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public java.lang.String descriptionString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ndescriptionString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long vendorFaultCode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.nvendorFaultCode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long vendorFaultData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.nvendorFaultData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer description(@org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ndescription(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer vendorFaultCode(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.nvendorFaultCode(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer vendorFaultData(@org.lwjgl.system.NativeType("uint64_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.nvendorFaultData(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.create(r0)
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDeviceFaultVendorInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDeviceFaultVendorInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public java.nio.ByteBuffer description() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ndescription(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public java.lang.String descriptionString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ndescriptionString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long vendorFaultCode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvendorFaultCode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long vendorFaultData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvendorFaultData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT description(@org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescription(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT vendorFaultCode(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvendorFaultCode(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT vendorFaultData(@org.lwjgl.system.NativeType("uint64_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvendorFaultData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT set(java.nio.ByteBuffer r5, long r6, long r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = r0.description(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = r0.vendorFaultCode(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = r0.vendorFaultData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT set(org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT malloc() {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT calloc() {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.ByteBuffer ndescription(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.DESCRIPTION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 256(0x100, float:3.59E-43)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String ndescriptionString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.DESCRIPTION
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static long nvendorFaultCode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.VENDORFAULTCODE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nvendorFaultData(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.VENDORFAULTDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void ndescription(long r7, java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r9
            r1 = 256(0x100, float:3.59E-43)
            org.lwjgl.system.Checks.checkGT(r0, r1)
        L11:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.DESCRIPTION
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nvendorFaultCode(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.VENDORFAULTCODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nvendorFaultData(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.VENDORFAULTDATA
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
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            r4 = 256(0x100, float:3.59E-43)
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.DESCRIPTION = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.VENDORFAULTCODE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.VENDORFAULTDATA = r0
            return
    }
}
