package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGEventTapInformation.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGEventTapInformation.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGEventTapInformation.class */
public class CGEventTapInformation extends org.lwjgl.system.Struct<org.lwjgl.system.macosx.CGEventTapInformation> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int EVENTTAPID = 0;
    public static final int TAPPOINT = 0;
    public static final int OPTIONS = 0;
    public static final int EVENTSOFINTEREST = 0;
    public static final int TAPPINGPROCESS = 0;
    public static final int PROCESSBEINGTAPPED = 0;
    public static final int ENABLED = 0;
    public static final int MINUSECLATENCY = 0;
    public static final int AVGUSECLATENCY = 0;
    public static final int MAXUSECLATENCY = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGEventTapInformation$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGEventTapInformation$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGEventTapInformation$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.macosx.CGEventTapInformation, org.lwjgl.system.macosx.CGEventTapInformation.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.macosx.CGEventTapInformation ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
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
        protected org.lwjgl.system.macosx.CGEventTapInformation.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.macosx.CGEventTapInformation getElementFactory() {
                r2 = this;
                org.lwjgl.system.macosx.CGEventTapInformation r0 = org.lwjgl.system.macosx.CGEventTapInformation.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int eventTapID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.macosx.CGEventTapInformation.neventTapID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CGEventTapLocation")
        public int tapPoint() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.macosx.CGEventTapInformation.ntapPoint(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CGEventTapOptions")
        public int options() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.macosx.CGEventTapInformation.noptions(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CGEventMask")
        public long eventsOfInterest() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.macosx.CGEventTapInformation.neventsOfInterest(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("pid_t")
        public long tappingProcess() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.macosx.CGEventTapInformation.ntappingProcess(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("pid_t")
        public long processBeingTapped() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.macosx.CGEventTapInformation.nprocessBeingTapped(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("bool")
        public boolean enabled() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.system.macosx.CGEventTapInformation.nenabled(r0)
                return r0
        }

        public float minUsecLatency() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.system.macosx.CGEventTapInformation.nminUsecLatency(r0)
                return r0
        }

        public float avgUsecLatency() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.system.macosx.CGEventTapInformation.navgUsecLatency(r0)
                return r0
        }

        public float maxUsecLatency() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.system.macosx.CGEventTapInformation.nmaxUsecLatency(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.macosx.CGEventTapInformation r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.macosx.CGEventTapInformation r0 = org.lwjgl.system.macosx.CGEventTapInformation.create(r0)
                org.lwjgl.system.macosx.CGEventTapInformation.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected CGEventTapInformation(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.macosx.CGEventTapInformation create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public CGEventTapInformation(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int eventTapID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = neventTapID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventTapLocation")
    public int tapPoint() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntapPoint(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventTapOptions")
    public int options() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noptions(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventMask")
    public long eventsOfInterest() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = neventsOfInterest(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("pid_t")
    public long tappingProcess() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntappingProcess(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("pid_t")
    public long processBeingTapped() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nprocessBeingTapped(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public boolean enabled() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nenabled(r0)
            return r0
    }

    public float minUsecLatency() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nminUsecLatency(r0)
            return r0
    }

    public float avgUsecLatency() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = navgUsecLatency(r0)
            return r0
    }

    public float maxUsecLatency() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nmaxUsecLatency(r0)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation malloc() {
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            int r2 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation calloc() {
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation create() {
            int r0 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation create(long r6) {
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.macosx.CGEventTapInformation createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer malloc(int r6) {
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = new org.lwjgl.system.macosx.CGEventTapInformation$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer calloc(int r7) {
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = new org.lwjgl.system.macosx.CGEventTapInformation$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = new org.lwjgl.system.macosx.CGEventTapInformation$Buffer
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

    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer create(long r6, int r8) {
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = new org.lwjgl.system.macosx.CGEventTapInformation$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = new org.lwjgl.system.macosx.CGEventTapInformation$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGEventTapInformation r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGEventTapInformation r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.macosx.CGEventTapInformation r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.macosx.CGEventTapInformation r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.ALIGNOF
            int r4 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.macosx.CGEventTapInformation r0 = new org.lwjgl.system.macosx.CGEventTapInformation
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = new org.lwjgl.system.macosx.CGEventTapInformation$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGEventTapInformation.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.macosx.CGEventTapInformation$Buffer r0 = new org.lwjgl.system.macosx.CGEventTapInformation$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int neventTapID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.EVENTTAPID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntapPoint(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.TAPPOINT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int noptions(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.OPTIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long neventsOfInterest(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.EVENTSOFINTEREST
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ntappingProcess(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.macosx.CGEventTapInformation.TAPPINGPROCESS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nprocessBeingTapped(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.macosx.CGEventTapInformation.PROCESSBEINGTAPPED
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static boolean nenabled(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.ENABLED
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public static float nminUsecLatency(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.MINUSECLATENCY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float navgUsecLatency(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.AVGUSECLATENCY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nmaxUsecLatency(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGEventTapInformation.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.MAXUSECLATENCY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.macosx.CGEventTapInformation r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.system.macosx.CGEventTapInformation.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.macosx.CGEventTapInformation.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.macosx.CGEventTapInformation.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.EVENTTAPID = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.TAPPOINT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.OPTIONS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.EVENTSOFINTEREST = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.TAPPINGPROCESS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.PROCESSBEINGTAPPED = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.ENABLED = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.MINUSECLATENCY = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.AVGUSECLATENCY = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGEventTapInformation.MAXUSECLATENCY = r0
            return
    }
}
