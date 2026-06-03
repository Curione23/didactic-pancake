package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Visual.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Visual.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Visual.class */
public class Visual extends org.lwjgl.system.Struct<org.lwjgl.system.linux.Visual> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int EXT_DATA = 0;
    public static final int VISUALID = 0;
    public static final int CLASS = 0;
    public static final int RED_MASK = 0;
    public static final int GREEN_MASK = 0;
    public static final int BLUE_MASK = 0;
    public static final int BITS_PER_RGB = 0;
    public static final int MAP_ENTRIES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Visual$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Visual$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/Visual$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.Visual, org.lwjgl.system.linux.Visual.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.Visual ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.Visual.SIZEOF
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
        protected org.lwjgl.system.linux.Visual.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.Visual getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.Visual r0 = org.lwjgl.system.linux.Visual.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long ext_data() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Visual.next_data(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VisualID")
        public long visualid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Visual.nvisualid(r0)
                return r0
        }

        public int class$() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Visual.nclass$(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long red_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Visual.nred_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long green_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Visual.ngreen_mask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long blue_mask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.Visual.nblue_mask(r0)
                return r0
        }

        public int bits_per_rgb() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Visual.nbits_per_rgb(r0)
                return r0
        }

        public int map_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.Visual.nmap_entries(r0)
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer ext_data(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Visual.next_data(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer visualid(@org.lwjgl.system.NativeType("VisualID") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Visual.nvisualid(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer class$(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Visual.nclass$(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer red_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Visual.nred_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer green_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Visual.ngreen_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer blue_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.Visual.nblue_mask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer bits_per_rgb(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Visual.nbits_per_rgb(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.Visual.Buffer map_entries(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.Visual.nmap_entries(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.Visual r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.Visual$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.Visual r0 = org.lwjgl.system.linux.Visual.create(r0)
                org.lwjgl.system.linux.Visual.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected Visual(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.Visual create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public Visual(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.Visual.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long ext_data() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = next_data(r0)
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

    public int bits_per_rgb() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbits_per_rgb(r0)
            return r0
    }

    public int map_entries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmap_entries(r0)
            return r0
    }

    public org.lwjgl.system.linux.Visual ext_data(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            next_data(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Visual visualid(@org.lwjgl.system.NativeType("VisualID") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvisualid(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Visual class$(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclass$(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Visual red_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nred_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Visual green_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ngreen_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Visual blue_mask(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nblue_mask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.Visual bits_per_rgb(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbits_per_rgb(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Visual map_entries(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmap_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Visual set(long r5, long r7, int r9, long r10, long r12, long r14, int r16, int r17) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.Visual r0 = r0.ext_data(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.Visual r0 = r0.visualid(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.Visual r0 = r0.class$(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.system.linux.Visual r0 = r0.red_mask(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.system.linux.Visual r0 = r0.green_mask(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.system.linux.Visual r0 = r0.blue_mask(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.system.linux.Visual r0 = r0.bits_per_rgb(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.system.linux.Visual r0 = r0.map_entries(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.Visual set(org.lwjgl.system.linux.Visual r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.Visual.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.Visual malloc() {
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            int r2 = org.lwjgl.system.linux.Visual.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual calloc() {
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.Visual.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual create() {
            int r0 = org.lwjgl.system.linux.Visual.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual create(long r6) {
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.Visual createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.Visual.Buffer malloc(int r6) {
            org.lwjgl.system.linux.Visual$Buffer r0 = new org.lwjgl.system.linux.Visual$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.Visual.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual.Buffer calloc(int r7) {
            org.lwjgl.system.linux.Visual$Buffer r0 = new org.lwjgl.system.linux.Visual$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.Visual.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.Visual.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.Visual$Buffer r0 = new org.lwjgl.system.linux.Visual$Buffer
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

    public static org.lwjgl.system.linux.Visual.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.Visual$Buffer r0 = new org.lwjgl.system.linux.Visual$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.Visual.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.Visual$Buffer r0 = new org.lwjgl.system.linux.Visual$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.Visual r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.Visual r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.Visual r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.Visual r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.Visual$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.Visual$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.Visual$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.Visual.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.Visual$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.Visual malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.Visual.ALIGNOF
            int r4 = org.lwjgl.system.linux.Visual.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.Visual r0 = new org.lwjgl.system.linux.Visual
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.Visual.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.Visual$Buffer r0 = new org.lwjgl.system.linux.Visual$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.Visual.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.Visual.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.Visual.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.Visual$Buffer r0 = new org.lwjgl.system.linux.Visual$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.Visual.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.Visual.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long next_data(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.EXT_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvisualid(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.VISUALID
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nclass$(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Visual.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.CLASS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nred_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.RED_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ngreen_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.GREEN_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nblue_mask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.BLUE_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nbits_per_rgb(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Visual.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.BITS_PER_RGB
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmap_entries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Visual.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.MAP_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void next_data(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.EXT_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvisualid(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.VISUALID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nclass$(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Visual.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.CLASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nred_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.RED_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void ngreen_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.GREEN_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nblue_mask(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.Visual.BLUE_MASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nbits_per_rgb(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Visual.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.BITS_PER_RGB
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmap_entries(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.Visual.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.Visual.MAP_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.Visual r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.linux.Visual.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.Visual.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.Visual.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.Visual.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.linux.Visual.CLONG_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.Visual.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.Visual.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.EXT_DATA = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.VISUALID = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.CLASS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.RED_MASK = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.GREEN_MASK = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.BLUE_MASK = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.BITS_PER_RGB = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.Visual.MAP_ENTRIES = r0
            return
    }
}
