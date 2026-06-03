package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT.class */
public class VkDeviceFaultInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDeviceFaultInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DESCRIPTION = 0;
    public static final int PADDRESSINFOS = 0;
    public static final int PVENDORINFOS = 0;
    public static final int PVENDORBINARYDATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDeviceFaultInfoEXT, org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDeviceFaultInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDeviceFaultInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public java.nio.ByteBuffer description() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ndescription(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public java.lang.String descriptionString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ndescriptionString(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDeviceFaultAddressInfoEXT *")
        public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT pAddressInfos() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npAddressInfos(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDeviceFaultVendorInfoEXT *")
        public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT pVendorInfos() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npVendorInfos(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pVendorBinaryData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npVendorBinaryData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000341002(0x3b9ffe0a, float:0.0048825787)
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer description(@org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ndescription(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer pAddressInfos(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceFaultAddressInfoEXT *") org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npAddressInfos(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer pVendorInfos(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceFaultVendorInfoEXT *") org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npVendorInfos(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer pVendorBinaryData(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT.npVendorBinaryData(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.create(r0)
                org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDeviceFaultInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDeviceFaultInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDeviceFaultInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
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

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDeviceFaultAddressInfoEXT *")
    public org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT pAddressInfos() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = npAddressInfos(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDeviceFaultVendorInfoEXT *")
    public org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT pVendorInfos() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = npVendorInfos(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pVendorBinaryData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npVendorBinaryData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000341002(0x3b9ffe0a, float:0.0048825787)
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT description(@org.lwjgl.system.NativeType("char[VK_MAX_DESCRIPTION_SIZE]") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescription(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT pAddressInfos(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceFaultAddressInfoEXT *") org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npAddressInfos(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT pVendorInfos(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceFaultVendorInfoEXT *") org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npVendorInfos(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT pVendorBinaryData(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npVendorBinaryData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT set(int r5, long r6, java.nio.ByteBuffer r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r10, long r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.description(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.pAddressInfos(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.pVendorInfos(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.pVendorBinaryData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceFaultInfoEXT set(org.lwjgl.vulkan.VkDeviceFaultInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT malloc() {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT calloc() {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceFaultInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkDeviceFaultInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer ndescription(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.DESCRIPTION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 256(0x100, float:3.59E-43)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String ndescriptionString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.DESCRIPTION
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT npAddressInfos(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PADDRESSINFOS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT npVendorInfos(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PVENDORINFOS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r0 = org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT.createSafe(r0)
            return r0
    }

    public static long npVendorBinaryData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PVENDORBINARYDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
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
            int r2 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.DESCRIPTION
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npAddressInfos(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDeviceFaultAddressInfoEXT r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PADDRESSINFOS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npVendorInfos(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDeviceFaultVendorInfoEXT r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PVENDORINFOS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npVendorBinaryData(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PVENDORBINARYDATA
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
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r4 = 256(0x100, float:3.59E-43)
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkDeviceFaultInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.DESCRIPTION = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PADDRESSINFOS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PVENDORINFOS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceFaultInfoEXT.PVENDORBINARYDATA = r0
            return
    }
}
