package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSRTDataNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSRTDataNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSRTDataNV.class */
public class VkSRTDataNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSRTDataNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SX = 0;
    public static final int A = 0;
    public static final int B = 0;
    public static final int PVX = 0;
    public static final int SY = 0;
    public static final int C = 0;
    public static final int PVY = 0;
    public static final int SZ = 0;
    public static final int PVZ = 0;
    public static final int QX = 0;
    public static final int QY = 0;
    public static final int QZ = 0;
    public static final int QW = 0;
    public static final int TX = 0;
    public static final int TY = 0;
    public static final int TZ = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSRTDataNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSRTDataNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSRTDataNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSRTDataNV, org.lwjgl.vulkan.VkSRTDataNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSRTDataNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkSRTDataNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSRTDataNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSRTDataNV r0 = org.lwjgl.vulkan.VkSRTDataNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        public float sx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nsx(r0)
                return r0
        }

        public float a() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.na(r0)
                return r0
        }

        public float b() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nb(r0)
                return r0
        }

        public float pvx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.npvx(r0)
                return r0
        }

        public float sy() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nsy(r0)
                return r0
        }

        public float c() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nc(r0)
                return r0
        }

        public float pvy() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.npvy(r0)
                return r0
        }

        public float sz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nsz(r0)
                return r0
        }

        public float pvz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.npvz(r0)
                return r0
        }

        public float qx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nqx(r0)
                return r0
        }

        public float qy() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nqy(r0)
                return r0
        }

        public float qz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nqz(r0)
                return r0
        }

        public float qw() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nqw(r0)
                return r0
        }

        public float tx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.ntx(r0)
                return r0
        }

        public float ty() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.nty(r0)
                return r0
        }

        public float tz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkSRTDataNV.ntz(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer sx(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nsx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer a(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.na(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer b(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nb(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer pvx(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.npvx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer sy(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nsy(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer c(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer pvy(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.npvy(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer sz(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nsz(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer pvz(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.npvz(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer qx(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nqx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer qy(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nqy(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer qz(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nqz(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer qw(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nqw(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer tx(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.ntx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer ty(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.nty(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSRTDataNV.Buffer tz(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSRTDataNV.ntz(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSRTDataNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSRTDataNV r0 = org.lwjgl.vulkan.VkSRTDataNV.create(r0)
                org.lwjgl.vulkan.VkSRTDataNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSRTDataNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSRTDataNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSRTDataNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            return r0
    }

    public float sx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nsx(r0)
            return r0
    }

    public float a() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = na(r0)
            return r0
    }

    public float b() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nb(r0)
            return r0
    }

    public float pvx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = npvx(r0)
            return r0
    }

    public float sy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nsy(r0)
            return r0
    }

    public float c() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nc(r0)
            return r0
    }

    public float pvy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = npvy(r0)
            return r0
    }

    public float sz() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nsz(r0)
            return r0
    }

    public float pvz() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = npvz(r0)
            return r0
    }

    public float qx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nqx(r0)
            return r0
    }

    public float qy() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nqy(r0)
            return r0
    }

    public float qz() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nqz(r0)
            return r0
    }

    public float qw() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nqw(r0)
            return r0
    }

    public float tx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = ntx(r0)
            return r0
    }

    public float ty() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nty(r0)
            return r0
    }

    public float tz() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = ntz(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV sx(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV a(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            na(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV b(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nb(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV pvx(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npvx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV sy(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV c(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV pvy(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npvy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV sz(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsz(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV pvz(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npvz(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV qx(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV qy(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqy(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV qz(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqz(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV qw(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqw(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV tx(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV ty(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nty(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV tz(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntz(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV set(float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, float r19) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.sx(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.a(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.b(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.pvx(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.sy(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.c(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.pvy(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.sz(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.pvz(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.qx(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.qy(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.qz(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.qw(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.tx(r1)
            r0 = r3
            r1 = r18
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.ty(r1)
            r0 = r3
            r1 = r19
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.tz(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkSRTDataNV set(org.lwjgl.vulkan.VkSRTDataNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV malloc() {
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV calloc() {
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV create() {
            int r0 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV create(long r6) {
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSRTDataNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = new org.lwjgl.vulkan.VkSRTDataNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = new org.lwjgl.vulkan.VkSRTDataNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = new org.lwjgl.vulkan.VkSRTDataNV$Buffer
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

    public static org.lwjgl.vulkan.VkSRTDataNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = new org.lwjgl.vulkan.VkSRTDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSRTDataNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = new org.lwjgl.vulkan.VkSRTDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSRTDataNV r0 = new org.lwjgl.vulkan.VkSRTDataNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = new org.lwjgl.vulkan.VkSRTDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSRTDataNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSRTDataNV$Buffer r0 = new org.lwjgl.vulkan.VkSRTDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSRTDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static float nsx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SX
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float na(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.A
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nb(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.B
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float npvx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.PVX
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nsy(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nc(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.C
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float npvy(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.PVY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nsz(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SZ
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float npvz(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.PVZ
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nqx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QX
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nqy(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nqz(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QZ
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nqw(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QW
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float ntx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.TX
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nty(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.TY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float ntz(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.TZ
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nsx(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void na(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.A
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nb(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.B
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void npvx(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.PVX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nsy(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nc(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.C
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void npvy(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.PVY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nsz(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.SZ
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void npvz(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.PVZ
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nqx(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nqy(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nqz(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QZ
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nqw(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.QW
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void ntx(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.TX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nty(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.TY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void ntz(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSRTDataNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSRTDataNV.TZ
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
            org.lwjgl.vulkan.VkSRTDataNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 16
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
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSRTDataNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSRTDataNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.SX = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.A = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.B = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.PVX = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.SY = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.C = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.PVY = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.SZ = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.PVZ = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.QX = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.QY = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.QZ = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.QW = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.TX = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.TY = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSRTDataNV.TZ = r0
            return
    }
}
