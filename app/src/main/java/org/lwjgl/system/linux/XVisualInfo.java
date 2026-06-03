package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XVisualInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XVisualInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XVisualInfo.class */
public class XVisualInfo extends org.lwjgl.system.Struct<org.lwjgl.system.linux.XVisualInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VISUAL = 0;
    public static final int VISUALID = 0;
    public static final int SCREEN = 0;
    public static final int DEPTH = 0;
    public static final int CLASS = 0;
    public static final int RED_MASK = 0;
    public static final int GREEN_MASK = 0;
    public static final int BLUE_MASK = 0;
    public static final int COLORMAP_SIZE = 0;
    public static final int BITS_PER_RGB = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XVisualInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XVisualInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XVisualInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.XVisualInfo, org.lwjgl.system.linux.XVisualInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.XVisualInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
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
        protected org.lwjgl.system.linux.XVisualInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.XVisualInfo getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.XVisualInfo r0 = org.lwjgl.system.linux.XVisualInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("Visual *")
        public org.lwjgl.system.linux.Visual visual() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.Visual r0 = org.lwjgl.system.linux.XVisualInfo.nvisual(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VisualID")
        public long visualid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XVisualInfo.nvisualid(r0)
                return r0
        }

        public int screen() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XVisualInfo.nscreen(r0)
                return r0
        }

        public int depth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XVisualInfo.ndepth(r0)
                return r0
        }

        public int class$() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XVisualInfo.nclass$(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long red_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XVisualInfo.nred_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long green_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XVisualInfo.ngreen_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long blue_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XVisualInfo.nblue_mask(r0)
                return r0
        }

        public int colormap_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XVisualInfo.ncolormap_size(r0)
                return r0
        }

        public int bits_per_rgb() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XVisualInfo.nbits_per_rgb(r0)
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer visual(@org.lwjgl.system.NativeType("Visual *") org.lwjgl.system.linux.Visual r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XVisualInfo.nvisual(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer visualid(@org.lwjgl.system.NativeType("VisualID") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XVisualInfo.nvisualid(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer screen(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XVisualInfo.nscreen(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer depth(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XVisualInfo.ndepth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer class$(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XVisualInfo.nclass$(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer red_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XVisualInfo.nred_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer green_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XVisualInfo.ngreen_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer blue_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XVisualInfo.nblue_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer colormap_size(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XVisualInfo.ncolormap_size(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XVisualInfo.Buffer bits_per_rgb(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XVisualInfo.nbits_per_rgb(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XVisualInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XVisualInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.XVisualInfo r0 = org.lwjgl.system.linux.XVisualInfo.create(r0)
                org.lwjgl.system.linux.XVisualInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected XVisualInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.XVisualInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public XVisualInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("Visual *")
    public org.lwjgl.system.linux.Visual visual() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.Visual r0 = nvisual(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VisualID")
    public long visualid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvisualid(r0)
            return r0
    }

    public int screen() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nscreen(r0)
            return r0
    }

    public int depth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndepth(r0)
            return r0
    }

    public int class$() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclass$(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long red_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nred_mask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long green_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ngreen_mask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long blue_mask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nblue_mask(r0)
            return r0
    }

    public int colormap_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncolormap_size(r0)
            return r0
    }

    public int bits_per_rgb() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbits_per_rgb(r0)
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo visual(@org.lwjgl.system.NativeType("Visual *") org.lwjgl.system.linux.Visual r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvisual(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo visualid(@org.lwjgl.system.NativeType("VisualID") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvisualid(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo screen(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nscreen(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo depth(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo class$(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclass$(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo red_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nred_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo green_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ngreen_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo blue_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nblue_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo colormap_size(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolormap_size(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo bits_per_rgb(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbits_per_rgb(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo set(org.lwjgl.system.linux.Visual r5, long r6, int r8, int r9, int r10, long r11, long r13, long r15, int r17, int r18) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.XVisualInfo r0 = r0.visual(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.XVisualInfo r0 = r0.visualid(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.XVisualInfo r0 = r0.screen(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.XVisualInfo r0 = r0.depth(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.linux.XVisualInfo r0 = r0.class$(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.XVisualInfo r0 = r0.red_mask(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.XVisualInfo r0 = r0.green_mask(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.system.linux.XVisualInfo r0 = r0.blue_mask(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.system.linux.XVisualInfo r0 = r0.colormap_size(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.system.linux.XVisualInfo r0 = r0.bits_per_rgb(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XVisualInfo set(org.lwjgl.system.linux.XVisualInfo r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo malloc() {
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            int r2 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo calloc() {
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo create() {
            int r0 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo create(long r6) {
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XVisualInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo.Buffer malloc(int r6) {
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = new org.lwjgl.system.linux.XVisualInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo.Buffer calloc(int r7) {
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = new org.lwjgl.system.linux.XVisualInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = new org.lwjgl.system.linux.XVisualInfo$Buffer
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

    public static org.lwjgl.system.linux.XVisualInfo.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = new org.lwjgl.system.linux.XVisualInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XVisualInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = new org.lwjgl.system.linux.XVisualInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XVisualInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XVisualInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XVisualInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XVisualInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XVisualInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XVisualInfo.ALIGNOF
            int r4 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.XVisualInfo r0 = new org.lwjgl.system.linux.XVisualInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = new org.lwjgl.system.linux.XVisualInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XVisualInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XVisualInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XVisualInfo$Buffer r0 = new org.lwjgl.system.linux.XVisualInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XVisualInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XVisualInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual nvisual(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.VISUAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.linux.Visual r0 = org.lwjgl.system.linux.Visual.create(r0)
            return r0
    }

    public static long nvisualid(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.VISUALID
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nscreen(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.SCREEN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndepth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.DEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nclass$(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.CLASS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nred_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.RED_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ngreen_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.GREEN_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nblue_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.BLUE_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int ncolormap_size(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.COLORMAP_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbits_per_rgb(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.BITS_PER_RGB
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nvisual(long r5, org.lwjgl.system.linux.Visual r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.VISUAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvisualid(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.VISUALID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nscreen(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.SCREEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndepth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.DEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nclass$(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.CLASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nred_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.RED_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void ngreen_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.GREEN_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nblue_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.BLUE_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void ncolormap_size(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.COLORMAP_SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbits_per_rgb(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XVisualInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XVisualInfo.BITS_PER_RGB
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XVisualInfo.VISUAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.XVisualInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.XVisualInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XVisualInfo.CLONG_SIZE
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
            int r3 = org.lwjgl.system.linux.XVisualInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.linux.XVisualInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.system.linux.XVisualInfo.CLONG_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.XVisualInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.XVisualInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.VISUAL = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.VISUALID = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.SCREEN = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.DEPTH = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.CLASS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.RED_MASK = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.GREEN_MASK = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.BLUE_MASK = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.COLORMAP_SIZE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XVisualInfo.BITS_PER_RGB = r0
            return
    }
}
