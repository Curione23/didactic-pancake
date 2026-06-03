package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GPU_DEVICE.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GPU_DEVICE.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GPU_DEVICE.class */
public class GPU_DEVICE extends org.lwjgl.system.Struct<org.lwjgl.opengl.GPU_DEVICE> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CB = 0;
    public static final int DEVICENAME = 0;
    public static final int DEVICESTRING = 0;
    public static final int FLAGS = 0;
    public static final int RCVIRTUALSCREEN = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GPU_DEVICE$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GPU_DEVICE$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GPU_DEVICE$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.opengl.GPU_DEVICE, org.lwjgl.opengl.GPU_DEVICE.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.opengl.GPU_DEVICE ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
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
        protected org.lwjgl.opengl.GPU_DEVICE.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.opengl.GPU_DEVICE getElementFactory() {
                r2 = this;
                org.lwjgl.opengl.GPU_DEVICE r0 = org.lwjgl.opengl.GPU_DEVICE.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int cb() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.opengl.GPU_DEVICE.ncb(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CHAR[32]")
        public java.nio.ByteBuffer DeviceName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.opengl.GPU_DEVICE.nDeviceName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CHAR[32]")
        public java.lang.String DeviceNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.opengl.GPU_DEVICE.nDeviceNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CHAR[128]")
        public java.nio.ByteBuffer DeviceString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.opengl.GPU_DEVICE.nDeviceString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CHAR[128]")
        public java.lang.String DeviceStringString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.opengl.GPU_DEVICE.nDeviceStringString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int Flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.opengl.GPU_DEVICE.nFlags(r0)
                return r0
        }

        public org.lwjgl.system.windows.RECT rcVirtualScreen() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.windows.RECT r0 = org.lwjgl.opengl.GPU_DEVICE.nrcVirtualScreen(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.opengl.GPU_DEVICE r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.opengl.GPU_DEVICE r0 = org.lwjgl.opengl.GPU_DEVICE.create(r0)
                org.lwjgl.opengl.GPU_DEVICE.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GPU_DEVICE(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.opengl.GPU_DEVICE create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GPU_DEVICE(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int cb() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncb(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CHAR[32]")
    public java.nio.ByteBuffer DeviceName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nDeviceName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CHAR[32]")
    public java.lang.String DeviceNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nDeviceNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CHAR[128]")
    public java.nio.ByteBuffer DeviceString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nDeviceString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CHAR[128]")
    public java.lang.String DeviceStringString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nDeviceStringString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int Flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nFlags(r0)
            return r0
    }

    public org.lwjgl.system.windows.RECT rcVirtualScreen() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.windows.RECT r0 = nrcVirtualScreen(r0)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE malloc() {
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            int r2 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE calloc() {
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE create() {
            int r0 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE create(long r6) {
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.opengl.GPU_DEVICE createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE.Buffer malloc(int r6) {
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = new org.lwjgl.opengl.GPU_DEVICE$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE.Buffer calloc(int r7) {
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = new org.lwjgl.opengl.GPU_DEVICE$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = new org.lwjgl.opengl.GPU_DEVICE$Buffer
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

    public static org.lwjgl.opengl.GPU_DEVICE.Buffer create(long r6, int r8) {
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = new org.lwjgl.opengl.GPU_DEVICE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.opengl.GPU_DEVICE.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = new org.lwjgl.opengl.GPU_DEVICE$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.opengl.GPU_DEVICE r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.opengl.GPU_DEVICE r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.opengl.GPU_DEVICE r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.opengl.GPU_DEVICE r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.opengl.GPU_DEVICE.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.opengl.GPU_DEVICE.ALIGNOF
            int r4 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.opengl.GPU_DEVICE r0 = new org.lwjgl.opengl.GPU_DEVICE
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.opengl.GPU_DEVICE.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = new org.lwjgl.opengl.GPU_DEVICE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.opengl.GPU_DEVICE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GPU_DEVICE.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.opengl.GPU_DEVICE$Buffer r0 = new org.lwjgl.opengl.GPU_DEVICE$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.opengl.GPU_DEVICE.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.opengl.GPU_DEVICE.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ncb(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.opengl.GPU_DEVICE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.opengl.GPU_DEVICE.CB
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nDeviceName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GPU_DEVICE.DEVICENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 32
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String nDeviceNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GPU_DEVICE.DEVICENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public static java.nio.ByteBuffer nDeviceString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GPU_DEVICE.DEVICESTRING
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 128(0x80, float:1.8E-43)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.lang.String nDeviceStringString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GPU_DEVICE.DEVICESTRING
            long r1 = (long) r1
            long r0 = r0 + r1
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }

    public static int nFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.opengl.GPU_DEVICE.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.opengl.GPU_DEVICE.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.windows.RECT nrcVirtualScreen(long r5) {
            r0 = r5
            int r1 = org.lwjgl.opengl.GPU_DEVICE.RCVIRTUALSCREEN
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.windows.RECT r0 = org.lwjgl.system.windows.RECT.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GPU_DEVICE r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            r4 = 32
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r4 = 128(0x80, float:1.8E-43)
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.windows.RECT.SIZEOF
            int r4 = org.lwjgl.system.windows.RECT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.opengl.GPU_DEVICE.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.opengl.GPU_DEVICE.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GPU_DEVICE.CB = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GPU_DEVICE.DEVICENAME = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GPU_DEVICE.DEVICESTRING = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GPU_DEVICE.FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.opengl.GPU_DEVICE.RCVIRTUALSCREEN = r0
            return
    }
}
