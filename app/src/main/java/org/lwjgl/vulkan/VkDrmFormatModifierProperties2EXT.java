package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT.class */
public class VkDrmFormatModifierProperties2EXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int DRMFORMATMODIFIER = 0;
    public static final int DRMFORMATMODIFIERPLANECOUNT = 0;
    public static final int DRMFORMATMODIFIERTILINGFEATURES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT, org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.Buffer> {
        private static final org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t")
        public long drmFormatModifier() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.ndrmFormatModifier(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.ndrmFormatModifierPlaneCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormatFeatureFlags2")
        public long drmFormatModifierTilingFeatures() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.ndrmFormatModifierTilingFeatures(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.create(r0)
                org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDrmFormatModifierProperties2EXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT r0 = new org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDrmFormatModifierProperties2EXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t")
    public long drmFormatModifier() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndrmFormatModifier(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndrmFormatModifierPlaneCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormatFeatureFlags2")
    public long drmFormatModifierTilingFeatures() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndrmFormatModifierTilingFeatures(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT create(long r6) {
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT r0 = new org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT r0 = new org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT$Buffer r0 = new org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT$Buffer r0 = new org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long ndrmFormatModifier(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIER
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int ndrmFormatModifierPlaneCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERPLANECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndrmFormatModifierTilingFeatures(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERTILINGFEATURES
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
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
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIER = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERPLANECOUNT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT.DRMFORMATMODIFIERTILINGFEATURES = r0
            return
    }
}
