package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListVALVE.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListVALVE.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListVALVE.class */
public class VkMutableDescriptorTypeListVALVE extends org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListVALVE$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListVALVE$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListVALVE$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer {
        private static final org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer
        public org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer pDescriptorTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorType const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.npDescriptorTypes(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer pDescriptorTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorType const *") java.nio.IntBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = r0.pDescriptorTypes(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.create(r0)
                org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkMutableDescriptorTypeListVALVE(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkMutableDescriptorTypeListVALVE(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
    public org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE pDescriptorTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorType const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescriptorTypes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE set(org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE malloc() {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE calloc() {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE create() {
            int r0 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE create(long r6) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer
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

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer r0 = new org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT pDescriptorTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDescriptorType const *") java.nio.IntBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = r0.pDescriptorTypes(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkMutableDescriptorTypeListVALVE r0 = r0.create(r1, r2)
            return r0
    }
}
