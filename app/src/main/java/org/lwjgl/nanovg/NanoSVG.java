package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoSVG.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoSVG.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoSVG.class */
public class NanoSVG {
    public static final int NSVG_PAINT_UNDEF = -1;
    public static final int NSVG_PAINT_NONE = 0;
    public static final int NSVG_PAINT_COLOR = 1;
    public static final int NSVG_PAINT_LINEAR_GRADIENT = 2;
    public static final int NSVG_PAINT_RADIAL_GRADIENT = 3;
    public static final int NSVG_SPREAD_PAD = 0;
    public static final int NSVG_SPREAD_REFLECT = 1;
    public static final int NSVG_SPREAD_REPEAT = 2;
    public static final int NSVG_JOIN_MITER = 0;
    public static final int NSVG_JOIN_ROUND = 1;
    public static final int NSVG_JOIN_BEVEL = 2;
    public static final int NSVG_CAP_BUTT = 0;
    public static final int NSVG_CAP_ROUND = 1;
    public static final int NSVG_CAP_SQUARE = 2;
    public static final int NSVG_FILLRULE_NONZERO = 0;
    public static final int NSVG_FILLRULE_EVENODD = 1;
    public static final int NSVG_FLAGS_VISIBLE = 1;

    protected NanoSVG() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nnsvgParseFromFile(long r0, long r2, float r4);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("NSVGimage *")
    public static org.lwjgl.nanovg.NSVGImage nsvgParseFromFile(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, float r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r0 = nnsvgParseFromFile(r0, r1, r2)
            r9 = r0
            r0 = r9
            org.lwjgl.nanovg.NSVGImage r0 = org.lwjgl.nanovg.NSVGImage.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("NSVGimage *")
    public static org.lwjgl.nanovg.NSVGImage nsvgParseFromFile(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, float r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r6
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3e
            r11 = r0
            r0 = r9
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3e
            r13 = r0
            r0 = r11
            r1 = r13
            r2 = r8
            long r0 = nnsvgParseFromFile(r0, r1, r2)     // Catch: java.lang.Throwable -> L3e
            r15 = r0
            r0 = r15
            org.lwjgl.nanovg.NSVGImage r0 = org.lwjgl.nanovg.NSVGImage.createSafe(r0)     // Catch: java.lang.Throwable -> L3e
            r17 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r17
            return r0
        L3e:
            r18 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native long nnsvgParse(long r0, long r2, float r4);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("NSVGimage *")
    public static org.lwjgl.nanovg.NSVGImage nsvgParse(@org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, float r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            long r0 = nnsvgParse(r0, r1, r2)
            r9 = r0
            r0 = r9
            org.lwjgl.nanovg.NSVGImage r0 = org.lwjgl.nanovg.NSVGImage.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("NSVGimage *")
    public static org.lwjgl.nanovg.NSVGImage nsvgParse(@org.lwjgl.system.NativeType("char *") java.lang.CharSequence r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, float r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r6
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3e
            r11 = r0
            r0 = r9
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3e
            r13 = r0
            r0 = r11
            r1 = r13
            r2 = r8
            long r0 = nnsvgParse(r0, r1, r2)     // Catch: java.lang.Throwable -> L3e
            r15 = r0
            r0 = r15
            org.lwjgl.nanovg.NSVGImage r0 = org.lwjgl.nanovg.NSVGImage.createSafe(r0)     // Catch: java.lang.Throwable -> L3e
            r17 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r17
            return r0
        L3e:
            r18 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native long nnsvgDuplicatePath(long r0);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("NSVGpath *")
    public static org.lwjgl.nanovg.NSVGPath nsvgDuplicatePath(@org.lwjgl.system.NativeType("NSVGpath *") org.lwjgl.nanovg.NSVGPath r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nnsvgDuplicatePath(r0)
            r4 = r0
            r0 = r4
            org.lwjgl.nanovg.NSVGPath r0 = org.lwjgl.nanovg.NSVGPath.createSafe(r0)
            return r0
    }

    public static native void nnsvgDelete(long r0);

    public static void nsvgDelete(@org.lwjgl.system.NativeType("NSVGimage *") org.lwjgl.nanovg.NSVGImage r3) {
            r0 = r3
            long r0 = r0.address()
            nnsvgDelete(r0)
            return
    }

    @org.lwjgl.system.NativeType("NSVGrasterizer *")
    public static native long nsvgCreateRasterizer();

    public static native void nnsvgRasterize(long r0, long r2, float r4, float r5, float r6, long r7, int r9, int r10, int r11);

    public static void nsvgRasterize(@org.lwjgl.system.NativeType("NSVGrasterizer *") long r13, @org.lwjgl.system.NativeType("NSVGimage *") org.lwjgl.nanovg.NSVGImage r15, float r16, float r17, float r18, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r19, int r20, int r21, int r22) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r19
            r1 = r21
            r2 = r22
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r13
            r1 = r15
            long r1 = r1.address()
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r20
            r7 = r21
            r8 = r22
            nnsvgRasterize(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nnsvgDeleteRasterizer(long r0);

    public static void nsvgDeleteRasterizer(@org.lwjgl.system.NativeType("NSVGrasterizer *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnsvgDeleteRasterizer(r0)
            return
    }

    static {
            org.lwjgl.nanovg.LibNanoVG.initialize()
            return
    }
}
