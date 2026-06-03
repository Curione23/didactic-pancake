package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_MaxProfile.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_MaxProfile.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_MaxProfile.class */
public class TT_MaxProfile extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.TT_MaxProfile> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VERSION = 0;
    public static final int NUMGLYPHS = 0;
    public static final int MAXPOINTS = 0;
    public static final int MAXCONTOURS = 0;
    public static final int MAXCOMPOSITEPOINTS = 0;
    public static final int MAXCOMPOSITECONTOURS = 0;
    public static final int MAXZONES = 0;
    public static final int MAXTWILIGHTPOINTS = 0;
    public static final int MAXSTORAGE = 0;
    public static final int MAXFUNCTIONDEFS = 0;
    public static final int MAXINSTRUCTIONDEFS = 0;
    public static final int MAXSTACKELEMENTS = 0;
    public static final int MAXSIZEOFINSTRUCTIONS = 0;
    public static final int MAXCOMPONENTELEMENTS = 0;
    public static final int MAXCOMPONENTDEPTH = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_MaxProfile$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_MaxProfile$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_MaxProfile$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.TT_MaxProfile, org.lwjgl.util.freetype.TT_MaxProfile.Buffer> {
        private static final org.lwjgl.util.freetype.TT_MaxProfile ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.TT_MaxProfile.SIZEOF
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
        protected org.lwjgl.util.freetype.TT_MaxProfile.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.TT_MaxProfile getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.TT_MaxProfile r0 = org.lwjgl.util.freetype.TT_MaxProfile.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_MaxProfile.nversion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short numGlyphs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nnumGlyphs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxPoints() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxPoints(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxContours() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxContours(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxCompositePoints() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxCompositePoints(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxCompositeContours() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxCompositeContours(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxZones() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxZones(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxTwilightPoints() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxTwilightPoints(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxStorage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxStorage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxFunctionDefs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxFunctionDefs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxInstructionDefs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxInstructionDefs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxStackElements() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxStackElements(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxSizeOfInstructions() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxSizeOfInstructions(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxComponentElements() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxComponentElements(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short maxComponentDepth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_MaxProfile.nmaxComponentDepth(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_MaxProfile r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_MaxProfile$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.TT_MaxProfile r0 = org.lwjgl.util.freetype.TT_MaxProfile.create(r0)
                org.lwjgl.util.freetype.TT_MaxProfile.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected TT_MaxProfile(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.TT_MaxProfile create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.TT_MaxProfile r0 = new org.lwjgl.util.freetype.TT_MaxProfile
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public TT_MaxProfile(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.TT_MaxProfile.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nversion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short numGlyphs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nnumGlyphs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxPoints() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxPoints(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxContours() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxContours(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxCompositePoints() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxCompositePoints(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxCompositeContours() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxCompositeContours(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxZones() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxZones(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxTwilightPoints() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxTwilightPoints(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxStorage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxStorage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxFunctionDefs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxFunctionDefs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxInstructionDefs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxInstructionDefs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxStackElements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxStackElements(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxSizeOfInstructions() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxSizeOfInstructions(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxComponentElements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxComponentElements(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short maxComponentDepth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmaxComponentDepth(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.TT_MaxProfile create(long r6) {
            org.lwjgl.util.freetype.TT_MaxProfile r0 = new org.lwjgl.util.freetype.TT_MaxProfile
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_MaxProfile createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_MaxProfile r0 = new org.lwjgl.util.freetype.TT_MaxProfile
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.TT_MaxProfile.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.TT_MaxProfile$Buffer r0 = new org.lwjgl.util.freetype.TT_MaxProfile$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_MaxProfile.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_MaxProfile$Buffer r0 = new org.lwjgl.util.freetype.TT_MaxProfile$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nversion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_MaxProfile.VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static short nnumGlyphs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.NUMGLYPHS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxPoints(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXPOINTS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxContours(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXCONTOURS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxCompositePoints(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPOSITEPOINTS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxCompositeContours(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPOSITECONTOURS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxZones(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXZONES
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxTwilightPoints(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXTWILIGHTPOINTS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxStorage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXSTORAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxFunctionDefs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXFUNCTIONDEFS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxInstructionDefs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXINSTRUCTIONDEFS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxStackElements(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXSTACKELEMENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxSizeOfInstructions(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXSIZEOFINSTRUCTIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxComponentElements(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPONENTELEMENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmaxComponentDepth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_MaxProfile.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPONENTDEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.TT_MaxProfile r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.TT_MaxProfile.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.TT_MaxProfile.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.TT_MaxProfile.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.VERSION = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.NUMGLYPHS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXPOINTS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXCONTOURS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPOSITEPOINTS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPOSITECONTOURS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXZONES = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXTWILIGHTPOINTS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXSTORAGE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXFUNCTIONDEFS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXINSTRUCTIONDEFS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXSTACKELEMENTS = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXSIZEOFINSTRUCTIONS = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPONENTELEMENTS = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_MaxProfile.MAXCOMPONENTDEPTH = r0
            return
    }
}
