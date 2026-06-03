package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR.class */
public class VkPhysicalDeviceMaintenance4PropertiesKHR extends org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000413001(0x3ba11749, float:0.004916106)
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceMaintenance4PropertiesKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceMaintenance4PropertiesKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000413001(0x3ba11749, float:0.004916106)
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR set(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties set(int r6, long r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.set(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r0 = r0.create(r1, r2)
            return r0
    }
}
