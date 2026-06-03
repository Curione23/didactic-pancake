package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVG.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVG.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVG.class */
public class NanoVG {
    public static final float NVG_PI = 3.1415927f;
    public static final int NVG_CCW = 1;
    public static final int NVG_CW = 2;
    public static final int NVG_SOLID = 1;
    public static final int NVG_HOLE = 2;
    public static final int NVG_BUTT = 0;
    public static final int NVG_ROUND = 1;
    public static final int NVG_SQUARE = 2;
    public static final int NVG_BEVEL = 3;
    public static final int NVG_MITER = 4;
    public static final int NVG_ALIGN_LEFT = 1;
    public static final int NVG_ALIGN_CENTER = 2;
    public static final int NVG_ALIGN_RIGHT = 4;
    public static final int NVG_ALIGN_TOP = 8;
    public static final int NVG_ALIGN_MIDDLE = 16;
    public static final int NVG_ALIGN_BOTTOM = 32;
    public static final int NVG_ALIGN_BASELINE = 64;
    public static final int NVG_ZERO = 1;
    public static final int NVG_ONE = 2;
    public static final int NVG_SRC_COLOR = 4;
    public static final int NVG_ONE_MINUS_SRC_COLOR = 8;
    public static final int NVG_DST_COLOR = 16;
    public static final int NVG_ONE_MINUS_DST_COLOR = 32;
    public static final int NVG_SRC_ALPHA = 64;
    public static final int NVG_ONE_MINUS_SRC_ALPHA = 128;
    public static final int NVG_DST_ALPHA = 256;
    public static final int NVG_ONE_MINUS_DST_ALPHA = 512;
    public static final int NVG_SRC_ALPHA_SATURATE = 1024;
    public static final int NVG_SOURCE_OVER = 0;
    public static final int NVG_SOURCE_IN = 1;
    public static final int NVG_SOURCE_OUT = 2;
    public static final int NVG_ATOP = 3;
    public static final int NVG_DESTINATION_OVER = 4;
    public static final int NVG_DESTINATION_IN = 5;
    public static final int NVG_DESTINATION_OUT = 6;
    public static final int NVG_DESTINATION_ATOP = 7;
    public static final int NVG_LIGHTER = 8;
    public static final int NVG_COPY = 9;
    public static final int NVG_XOR = 10;
    public static final int NVG_IMAGE_GENERATE_MIPMAPS = 1;
    public static final int NVG_IMAGE_REPEATX = 2;
    public static final int NVG_IMAGE_REPEATY = 4;
    public static final int NVG_IMAGE_FLIPY = 8;
    public static final int NVG_IMAGE_PREMULTIPLIED = 16;
    public static final int NVG_IMAGE_NEAREST = 32;
    static final long nvgCreateInternal = 0;
    static final long nvgInternalParams = 0;
    static final long nvgDeleteInternal = 0;

    protected NanoVG() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nnvgBeginFrame(long r0, float r2, float r3, float r4);

    public static void nvgBeginFrame(@org.lwjgl.system.NativeType("NVGcontext *") long r6, float r8, float r9, float r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            nnvgBeginFrame(r0, r1, r2, r3)
            return
    }

    public static native void nnvgCancelFrame(long r0);

    public static void nvgCancelFrame(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgCancelFrame(r0)
            return
    }

    public static native void nnvgEndFrame(long r0);

    public static void nvgEndFrame(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgEndFrame(r0)
            return
    }

    public static native void nnvgGlobalCompositeOperation(long r0, int r2);

    public static void nvgGlobalCompositeOperation(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgGlobalCompositeOperation(r0, r1)
            return
    }

    public static native void nnvgGlobalCompositeBlendFunc(long r0, int r2, int r3);

    public static void nvgGlobalCompositeBlendFunc(@org.lwjgl.system.NativeType("NVGcontext *") long r5, int r7, int r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            r2 = r8
            nnvgGlobalCompositeBlendFunc(r0, r1, r2)
            return
    }

    public static native void nnvgGlobalCompositeBlendFuncSeparate(long r0, int r2, int r3, int r4, int r5);

    public static void nvgGlobalCompositeBlendFuncSeparate(@org.lwjgl.system.NativeType("NVGcontext *") long r7, int r9, int r10, int r11, int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            nnvgGlobalCompositeBlendFuncSeparate(r0, r1, r2, r3, r4)
            return
    }

    public static native void nnvgRGB(byte r0, byte r1, byte r2, long r3);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgRGB(@org.lwjgl.system.NativeType("unsigned char") byte r6, @org.lwjgl.system.NativeType("unsigned char") byte r7, @org.lwjgl.system.NativeType("unsigned char") byte r8, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = r3.address()
            nnvgRGB(r0, r1, r2, r3)
            r0 = r9
            return r0
    }

    public static native void nnvgRGBf(float r0, float r1, float r2, long r3);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgRGBf(float r6, float r7, float r8, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = r3.address()
            nnvgRGBf(r0, r1, r2, r3)
            r0 = r9
            return r0
    }

    public static native void nnvgRGBA(byte r0, byte r1, byte r2, byte r3, long r4);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgRGBA(@org.lwjgl.system.NativeType("unsigned char") byte r7, @org.lwjgl.system.NativeType("unsigned char") byte r8, @org.lwjgl.system.NativeType("unsigned char") byte r9, @org.lwjgl.system.NativeType("unsigned char") byte r10, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = r4.address()
            nnvgRGBA(r0, r1, r2, r3, r4)
            r0 = r11
            return r0
    }

    public static native void nnvgRGBAf(float r0, float r1, float r2, float r3, long r4);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgRGBAf(float r7, float r8, float r9, float r10, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = r4.address()
            nnvgRGBAf(r0, r1, r2, r3, r4)
            r0 = r11
            return r0
    }

    public static native void nnvgLerpRGBA(long r0, long r2, float r4, long r5);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgLerpRGBA(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r8, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r9, float r10, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r11) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            nnvgLerpRGBA(r0, r1, r2, r3)
            r0 = r11
            return r0
    }

    public static native void nnvgTransRGBA(long r0, byte r2, long r3);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgTransRGBA(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r6, @org.lwjgl.system.NativeType("unsigned char") byte r7, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = r2.address()
            nnvgTransRGBA(r0, r1, r2)
            r0 = r8
            return r0
    }

    public static native void nnvgTransRGBAf(long r0, float r2, long r3);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgTransRGBAf(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r6, float r7, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r8) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            long r2 = r2.address()
            nnvgTransRGBAf(r0, r1, r2)
            r0 = r8
            return r0
    }

    public static native void nnvgHSL(float r0, float r1, float r2, long r3);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgHSL(float r6, float r7, float r8, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = r3.address()
            nnvgHSL(r0, r1, r2, r3)
            r0 = r9
            return r0
    }

    public static native void nnvgHSLA(float r0, float r1, float r2, byte r3, long r4);

    @org.lwjgl.system.NativeType("NVGcolor")
    public static org.lwjgl.nanovg.NVGColor nvgHSLA(float r7, float r8, float r9, @org.lwjgl.system.NativeType("unsigned char") byte r10, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = r4.address()
            nnvgHSLA(r0, r1, r2, r3, r4)
            r0 = r11
            return r0
    }

    public static native void nnvgSave(long r0);

    public static void nvgSave(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgSave(r0)
            return
    }

    public static native void nnvgRestore(long r0);

    public static void nvgRestore(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgRestore(r0)
            return
    }

    public static native void nnvgReset(long r0);

    public static void nvgReset(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgReset(r0)
            return
    }

    public static native void nnvgShapeAntiAlias(long r0, int r2);

    public static void nvgShapeAntiAlias(@org.lwjgl.system.NativeType("NVGcontext *") long r4, @org.lwjgl.system.NativeType("int") boolean r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            nnvgShapeAntiAlias(r0, r1)
            return
    }

    public static native void nnvgStrokeColor(long r0, long r2);

    public static void nvgStrokeColor(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nnvgStrokeColor(r0, r1)
            return
    }

    public static native void nnvgStrokePaint(long r0, long r2);

    public static void nvgStrokePaint(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("NVGpaint") org.lwjgl.nanovg.NVGPaint r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nnvgStrokePaint(r0, r1)
            return
    }

    public static native void nnvgFillColor(long r0, long r2);

    public static void nvgFillColor(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nnvgFillColor(r0, r1)
            return
    }

    public static native void nnvgFillPaint(long r0, long r2);

    public static void nvgFillPaint(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("NVGpaint") org.lwjgl.nanovg.NVGPaint r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nnvgFillPaint(r0, r1)
            return
    }

    public static native void nnvgMiterLimit(long r0, float r2);

    public static void nvgMiterLimit(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgMiterLimit(r0, r1)
            return
    }

    public static native void nnvgStrokeWidth(long r0, float r2);

    public static void nvgStrokeWidth(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgStrokeWidth(r0, r1)
            return
    }

    public static native void nnvgLineCap(long r0, int r2);

    public static void nvgLineCap(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgLineCap(r0, r1)
            return
    }

    public static native void nnvgLineJoin(long r0, int r2);

    public static void nvgLineJoin(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgLineJoin(r0, r1)
            return
    }

    public static native void nnvgGlobalAlpha(long r0, float r2);

    public static void nvgGlobalAlpha(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgGlobalAlpha(r0, r1)
            return
    }

    public static native void nnvgResetTransform(long r0);

    public static void nvgResetTransform(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgResetTransform(r0)
            return
    }

    public static native void nnvgTransform(long r0, float r2, float r3, float r4, float r5, float r6, float r7);

    public static void nvgTransform(@org.lwjgl.system.NativeType("NVGcontext *") long r9, float r11, float r12, float r13, float r14, float r15, float r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            nnvgTransform(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nnvgTranslate(long r0, float r2, float r3);

    public static void nvgTranslate(@org.lwjgl.system.NativeType("NVGcontext *") long r5, float r7, float r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            r2 = r8
            nnvgTranslate(r0, r1, r2)
            return
    }

    public static native void nnvgRotate(long r0, float r2);

    public static void nvgRotate(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgRotate(r0, r1)
            return
    }

    public static native void nnvgSkewX(long r0, float r2);

    public static void nvgSkewX(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgSkewX(r0, r1)
            return
    }

    public static native void nnvgSkewY(long r0, float r2);

    public static void nvgSkewY(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgSkewY(r0, r1)
            return
    }

    public static native void nnvgScale(long r0, float r2, float r3);

    public static void nvgScale(@org.lwjgl.system.NativeType("NVGcontext *") long r5, float r7, float r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            r2 = r8
            nnvgScale(r0, r1, r2)
            return
    }

    public static native void nnvgCurrentTransform(long r0, long r2);

    public static void nvgCurrentTransform(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nnvgCurrentTransform(r0, r1)
            return
    }

    public static native void nnvgTransformIdentity(long r0);

    public static void nvgTransformIdentity(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nnvgTransformIdentity(r0)
            return
    }

    public static native void nnvgTransformTranslate(long r0, float r2, float r3);

    public static void nvgTransformTranslate(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r5, float r6, float r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            r2 = r7
            nnvgTransformTranslate(r0, r1, r2)
            return
    }

    public static native void nnvgTransformScale(long r0, float r2, float r3);

    public static void nvgTransformScale(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r5, float r6, float r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r5
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            r2 = r7
            nnvgTransformScale(r0, r1, r2)
            return
    }

    public static native void nnvgTransformRotate(long r0, float r2);

    public static void nvgTransformRotate(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r4, float r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nnvgTransformRotate(r0, r1)
            return
    }

    public static native void nnvgTransformSkewX(long r0, float r2);

    public static void nvgTransformSkewX(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r4, float r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nnvgTransformSkewX(r0, r1)
            return
    }

    public static native void nnvgTransformSkewY(long r0, float r2);

    public static void nvgTransformSkewY(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r4, float r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nnvgTransformSkewY(r0, r1)
            return
    }

    public static native void nnvgTransformMultiply(long r0, long r2);

    public static void nvgTransformMultiply(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nnvgTransformMultiply(r0, r1)
            return
    }

    public static native void nnvgTransformPremultiply(long r0, long r2);

    public static void nvgTransformPremultiply(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nnvgTransformPremultiply(r0, r1)
            return
    }

    public static native int nnvgTransformInverse(long r0, long r2);

    @org.lwjgl.system.NativeType("int")
    public static boolean nvgTransformInverse(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r6
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nnvgTransformInverse(r0, r1)
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    public static native void nnvgTransformPoint(long r0, long r2, long r4, float r6, float r7);

    public static void nvgTransformPoint(@org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r9, @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r10, @org.lwjgl.system.NativeType("float const *") java.nio.FloatBuffer r11, float r12, float r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r13
            nnvgTransformPoint(r0, r1, r2, r3, r4)
            return
    }

    public static native float nvgDegToRad(float r0);

    public static native float nvgRadToDeg(float r0);

    public static native int nnvgCreateImage(long r0, long r2, int r4);

    public static int nvgCreateImage(@org.lwjgl.system.NativeType("NVGcontext *") long r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, int r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r0 = nnvgCreateImage(r0, r1, r2)
            return r0
    }

    public static int nvgCreateImage(@org.lwjgl.system.NativeType("NVGcontext *") long r6, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, int r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L39
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L39
            r12 = r0
            r0 = r6
            r1 = r12
            r2 = r9
            int r0 = nnvgCreateImage(r0, r1, r2)     // Catch: java.lang.Throwable -> L39
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L39:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native int nnvgCreateImageMem(long r0, int r2, long r3, int r5);

    public static int nvgCreateImageMem(@org.lwjgl.system.NativeType("NVGcontext *") long r7, int r9, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            int r3 = r3.remaining()
            int r0 = nnvgCreateImageMem(r0, r1, r2, r3)
            return r0
    }

    public static native int nnvgCreateImageRGBA(long r0, int r2, int r3, int r4, long r5);

    public static int nvgCreateImageRGBA(@org.lwjgl.system.NativeType("NVGcontext *") long r8, int r10, int r11, int r12, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = r10
            r2 = r11
            int r1 = r1 * r2
            r2 = 4
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nnvgCreateImageRGBA(r0, r1, r2, r3, r4)
            return r0
    }

    public static native void nnvgUpdateImage(long r0, int r2, long r3);

    public static void nvgUpdateImage(@org.lwjgl.system.NativeType("NVGcontext *") long r6, int r8, @org.lwjgl.system.NativeType("unsigned char const *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nnvgUpdateImage(r0, r1, r2)
            return
    }

    public static native void nnvgImageSize(long r0, int r2, long r3, long r5);

    public static void nvgImageSize(@org.lwjgl.system.NativeType("NVGcontext *") long r8, int r10, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nnvgImageSize(r0, r1, r2, r3)
            return
    }

    public static native void nnvgDeleteImage(long r0, int r2);

    public static void nvgDeleteImage(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgDeleteImage(r0, r1)
            return
    }

    public static native void nnvgLinearGradient(long r0, float r2, float r3, float r4, float r5, long r6, long r8, long r10);

    @org.lwjgl.system.NativeType("NVGpaint")
    public static org.lwjgl.nanovg.NVGPaint nvgLinearGradient(@org.lwjgl.system.NativeType("NVGcontext *") long r13, float r15, float r16, float r17, float r18, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r19, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r20, @org.lwjgl.system.NativeType("NVGpaint") org.lwjgl.nanovg.NVGPaint r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            long r5 = r5.address()
            r6 = r20
            long r6 = r6.address()
            r7 = r21
            long r7 = r7.address()
            nnvgLinearGradient(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = r21
            return r0
    }

    public static native void nnvgBoxGradient(long r0, float r2, float r3, float r4, float r5, float r6, float r7, long r8, long r10, long r12);

    @org.lwjgl.system.NativeType("NVGpaint")
    public static org.lwjgl.nanovg.NVGPaint nvgBoxGradient(@org.lwjgl.system.NativeType("NVGcontext *") long r15, float r17, float r18, float r19, float r20, float r21, float r22, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r23, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r24, @org.lwjgl.system.NativeType("NVGpaint") org.lwjgl.nanovg.NVGPaint r25) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            long r7 = r7.address()
            r8 = r24
            long r8 = r8.address()
            r9 = r25
            long r9 = r9.address()
            nnvgBoxGradient(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r25
            return r0
    }

    public static native void nnvgRadialGradient(long r0, float r2, float r3, float r4, float r5, long r6, long r8, long r10);

    @org.lwjgl.system.NativeType("NVGpaint")
    public static org.lwjgl.nanovg.NVGPaint nvgRadialGradient(@org.lwjgl.system.NativeType("NVGcontext *") long r13, float r15, float r16, float r17, float r18, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r19, @org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r20, @org.lwjgl.system.NativeType("NVGpaint") org.lwjgl.nanovg.NVGPaint r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            long r5 = r5.address()
            r6 = r20
            long r6 = r6.address()
            r7 = r21
            long r7 = r7.address()
            nnvgRadialGradient(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = r21
            return r0
    }

    public static native void nnvgImagePattern(long r0, float r2, float r3, float r4, float r5, float r6, int r7, float r8, long r9);

    @org.lwjgl.system.NativeType("NVGpaint")
    public static org.lwjgl.nanovg.NVGPaint nvgImagePattern(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, float r16, float r17, float r18, int r19, float r20, @org.lwjgl.system.NativeType("NVGpaint") org.lwjgl.nanovg.NVGPaint r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            long r8 = r8.address()
            nnvgImagePattern(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r21
            return r0
    }

    public static native void nnvgScissor(long r0, float r2, float r3, float r4, float r5);

    public static void nvgScissor(@org.lwjgl.system.NativeType("NVGcontext *") long r7, float r9, float r10, float r11, float r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            nnvgScissor(r0, r1, r2, r3, r4)
            return
    }

    public static native void nnvgIntersectScissor(long r0, float r2, float r3, float r4, float r5);

    public static void nvgIntersectScissor(@org.lwjgl.system.NativeType("NVGcontext *") long r7, float r9, float r10, float r11, float r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            nnvgIntersectScissor(r0, r1, r2, r3, r4)
            return
    }

    public static native void nnvgResetScissor(long r0);

    public static void nvgResetScissor(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgResetScissor(r0)
            return
    }

    public static native void nnvgBeginPath(long r0);

    public static void nvgBeginPath(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgBeginPath(r0)
            return
    }

    public static native void nnvgMoveTo(long r0, float r2, float r3);

    public static void nvgMoveTo(@org.lwjgl.system.NativeType("NVGcontext *") long r5, float r7, float r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            r2 = r8
            nnvgMoveTo(r0, r1, r2)
            return
    }

    public static native void nnvgLineTo(long r0, float r2, float r3);

    public static void nvgLineTo(@org.lwjgl.system.NativeType("NVGcontext *") long r5, float r7, float r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            r2 = r8
            nnvgLineTo(r0, r1, r2)
            return
    }

    public static native void nnvgBezierTo(long r0, float r2, float r3, float r4, float r5, float r6, float r7);

    public static void nvgBezierTo(@org.lwjgl.system.NativeType("NVGcontext *") long r9, float r11, float r12, float r13, float r14, float r15, float r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            nnvgBezierTo(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nnvgQuadTo(long r0, float r2, float r3, float r4, float r5);

    public static void nvgQuadTo(@org.lwjgl.system.NativeType("NVGcontext *") long r7, float r9, float r10, float r11, float r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            nnvgQuadTo(r0, r1, r2, r3, r4)
            return
    }

    public static native void nnvgArcTo(long r0, float r2, float r3, float r4, float r5, float r6);

    public static void nvgArcTo(@org.lwjgl.system.NativeType("NVGcontext *") long r8, float r10, float r11, float r12, float r13, float r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            nnvgArcTo(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nnvgClosePath(long r0);

    public static void nvgClosePath(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgClosePath(r0)
            return
    }

    public static native void nnvgPathWinding(long r0, int r2);

    public static void nvgPathWinding(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgPathWinding(r0, r1)
            return
    }

    public static native void nnvgArc(long r0, float r2, float r3, float r4, float r5, float r6, int r7);

    public static void nvgArc(@org.lwjgl.system.NativeType("NVGcontext *") long r9, float r11, float r12, float r13, float r14, float r15, int r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            nnvgArc(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nnvgRect(long r0, float r2, float r3, float r4, float r5);

    public static void nvgRect(@org.lwjgl.system.NativeType("NVGcontext *") long r7, float r9, float r10, float r11, float r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            nnvgRect(r0, r1, r2, r3, r4)
            return
    }

    public static native void nnvgRoundedRect(long r0, float r2, float r3, float r4, float r5, float r6);

    public static void nvgRoundedRect(@org.lwjgl.system.NativeType("NVGcontext *") long r8, float r10, float r11, float r12, float r13, float r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            nnvgRoundedRect(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nnvgRoundedRectVarying(long r0, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9);

    public static void nvgRoundedRectVarying(@org.lwjgl.system.NativeType("NVGcontext *") long r11, float r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            nnvgRoundedRectVarying(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static native void nnvgEllipse(long r0, float r2, float r3, float r4, float r5);

    public static void nvgEllipse(@org.lwjgl.system.NativeType("NVGcontext *") long r7, float r9, float r10, float r11, float r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            nnvgEllipse(r0, r1, r2, r3, r4)
            return
    }

    public static native void nnvgCircle(long r0, float r2, float r3, float r4);

    public static void nvgCircle(@org.lwjgl.system.NativeType("NVGcontext *") long r6, float r8, float r9, float r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            nnvgCircle(r0, r1, r2, r3)
            return
    }

    public static native void nnvgFill(long r0);

    public static void nvgFill(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgFill(r0)
            return
    }

    public static native void nnvgStroke(long r0);

    public static void nvgStroke(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgStroke(r0)
            return
    }

    public static native int nnvgCreateFont(long r0, long r2, long r4);

    public static int nvgCreateFont(@org.lwjgl.system.NativeType("NVGcontext *") long r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
        L13:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nnvgCreateFont(r0, r1, r2)
            return r0
    }

    public static int nvgCreateFont(@org.lwjgl.system.NativeType("NVGcontext *") long r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r13 = r0
            r0 = r11
            r1 = r10
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r15 = r0
            r0 = r7
            r1 = r13
            r2 = r15
            int r0 = nnvgCreateFont(r0, r1, r2)     // Catch: java.lang.Throwable -> L49
            r17 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r17
            return r0
        L49:
            r18 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native int nnvgCreateFontAtIndex(long r0, long r2, long r4, int r6);

    public static int nvgCreateFontAtIndex(@org.lwjgl.system.NativeType("NVGcontext *") long r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        L13:
            r0 = r8
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r0 = nnvgCreateFontAtIndex(r0, r1, r2, r3)
            return r0
    }

    public static int nvgCreateFontAtIndex(@org.lwjgl.system.NativeType("NVGcontext *") long r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, int r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r10
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L4b
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4b
            r15 = r0
            r0 = r13
            r1 = r11
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L4b
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4b
            r17 = r0
            r0 = r8
            r1 = r15
            r2 = r17
            r3 = r12
            int r0 = nnvgCreateFontAtIndex(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4b
            r19 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r19
            return r0
        L4b:
            r20 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static native int nnvgCreateFontMem(long r0, long r2, long r4, int r6, int r7);

    public static int nvgCreateFontMem(@org.lwjgl.system.NativeType("NVGcontext *") long r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("int") boolean r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            r4 = r13
            if (r4 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            int r0 = nnvgCreateFontMem(r0, r1, r2, r3, r4)
            return r0
    }

    public static int nvgCreateFontMem(@org.lwjgl.system.NativeType("NVGcontext *") long r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("int") boolean r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L4a
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4a
            r16 = r0
            r0 = r9
            r1 = r16
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L4a
            r3 = r12
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L4a
            r4 = r13
            if (r4 == 0) goto L3a
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            int r0 = nnvgCreateFontMem(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4a
            r18 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r18
            return r0
        L4a:
            r19 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }

    public static native int nnvgCreateFontMemAtIndex(long r0, long r2, long r4, int r6, int r7, int r8);

    public static int nvgCreateFontMemAtIndex(@org.lwjgl.system.NativeType("NVGcontext *") long r10, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("int") boolean r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r10
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            int r3 = r3.remaining()
            r4 = r14
            if (r4 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            r5 = r15
            int r0 = nnvgCreateFontMemAtIndex(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvgCreateFontMemAtIndex(@org.lwjgl.system.NativeType("NVGcontext *") long r10, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("int") boolean r14, int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r12
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r18 = r0
            r0 = r10
            r1 = r18
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L4c
            r3 = r13
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L4c
            r4 = r14
            if (r4 == 0) goto L3a
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            r5 = r15
            int r0 = nnvgCreateFontMemAtIndex(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4c
            r20 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r20
            return r0
        L4c:
            r21 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }

    public static native int nnvgFindFont(long r0, long r2);

    public static int nvgFindFont(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nnvgFindFont(r0, r1)
            return r0
    }

    public static int nvgFindFont(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L33
            r10 = r0
            r0 = r5
            r1 = r10
            int r0 = nnvgFindFont(r0, r1)     // Catch: java.lang.Throwable -> L33
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L33:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native int nnvgAddFallbackFontId(long r0, int r2, int r3);

    public static int nvgAddFallbackFontId(@org.lwjgl.system.NativeType("NVGcontext *") long r5, int r7, int r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            r2 = r8
            int r0 = nnvgAddFallbackFontId(r0, r1, r2)
            return r0
    }

    public static native int nnvgAddFallbackFont(long r0, long r2, long r4);

    public static int nvgAddFallbackFont(@org.lwjgl.system.NativeType("NVGcontext *") long r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
        L13:
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nnvgAddFallbackFont(r0, r1, r2)
            return r0
    }

    public static int nvgAddFallbackFont(@org.lwjgl.system.NativeType("NVGcontext *") long r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r13 = r0
            r0 = r11
            r1 = r10
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r15 = r0
            r0 = r7
            r1 = r13
            r2 = r15
            int r0 = nnvgAddFallbackFont(r0, r1, r2)     // Catch: java.lang.Throwable -> L49
            r17 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r17
            return r0
        L49:
            r18 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    public static native void nnvgResetFallbackFontsId(long r0, int r2);

    public static void nvgResetFallbackFontsId(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgResetFallbackFontsId(r0, r1)
            return
    }

    public static native void nnvgResetFallbackFonts(long r0, long r2);

    public static void nvgResetFallbackFonts(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nnvgResetFallbackFonts(r0, r1)
            return
    }

    public static void nvgResetFallbackFonts(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L31
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r10 = r0
            r0 = r5
            r1 = r10
            nnvgResetFallbackFonts(r0, r1)     // Catch: java.lang.Throwable -> L31
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L3c
        L31:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L3c:
            return
    }

    public static native void nnvgFontSize(long r0, float r2);

    public static void nvgFontSize(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgFontSize(r0, r1)
            return
    }

    public static native void nnvgFontBlur(long r0, float r2);

    public static void nvgFontBlur(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgFontBlur(r0, r1)
            return
    }

    public static native void nnvgTextLetterSpacing(long r0, float r2);

    public static void nvgTextLetterSpacing(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgTextLetterSpacing(r0, r1)
            return
    }

    public static native void nnvgTextLineHeight(long r0, float r2);

    public static void nvgTextLineHeight(@org.lwjgl.system.NativeType("NVGcontext *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgTextLineHeight(r0, r1)
            return
    }

    public static native void nnvgTextAlign(long r0, int r2);

    public static void nvgTextAlign(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgTextAlign(r0, r1)
            return
    }

    public static native void nnvgFontFaceId(long r0, int r2);

    public static void nvgFontFaceId(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nnvgFontFaceId(r0, r1)
            return
    }

    public static native void nnvgFontFace(long r0, long r2);

    public static void nvgFontFace(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nnvgFontFace(r0, r1)
            return
    }

    public static void nvgFontFace(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L31
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r10 = r0
            r0 = r5
            r1 = r10
            nnvgFontFace(r0, r1)     // Catch: java.lang.Throwable -> L31
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L3c
        L31:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L3c:
            return
    }

    public static native float nnvgText(long r0, float r2, float r3, long r4, long r6);

    public static float nvgText(@org.lwjgl.system.NativeType("NVGcontext *") long r11, float r13, float r14, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            int r5 = r5.remaining()
            long r5 = (long) r5
            long r4 = r4 + r5
            float r0 = nnvgText(r0, r1, r2, r3, r4)
            return r0
    }

    public static float nvgText(@org.lwjgl.system.NativeType("NVGcontext *") long r11, float r13, float r14, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r15
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L42
            r18 = r0
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L42
            r19 = r0
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r19
            r4 = r19
            r5 = r18
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L42
            long r4 = r4 + r5
            float r0 = nnvgText(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L42
            r21 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r21
            return r0
        L42:
            r22 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    public static native void nnvgTextBox(long r0, float r2, float r3, float r4, long r5, long r7);

    public static void nvgTextBox(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, float r16, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            int r6 = r6.remaining()
            long r6 = (long) r6
            long r5 = r5 + r6
            nnvgTextBox(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nvgTextBox(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, float r16, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r18 = r0
            r0 = r18
            int r0 = r0.getPointer()
            r19 = r0
            r0 = r18
            r1 = r17
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L42
            r20 = r0
            r0 = r18
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L42
            r21 = r0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r21
            r5 = r21
            r6 = r20
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L42
            long r5 = r5 + r6
            nnvgTextBox(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L42
            r0 = r18
            r1 = r19
            r0.setPointer(r1)
            goto L4e
        L42:
            r23 = move-exception
            r0 = r18
            r1 = r19
            r0.setPointer(r1)
            r0 = r23
            throw r0
        L4e:
            return
    }

    public static native float nnvgTextBounds(long r0, float r2, float r3, long r4, long r6, long r8);

    public static float nvgTextBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r11, float r13, float r14, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            int r5 = r5.remaining()
            long r5 = (long) r5
            long r4 = r4 + r5
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            float r0 = nnvgTextBounds(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static float nvgTextBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r11, float r13, float r14, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = r15
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4d
            r19 = r0
            r0 = r17
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4d
            r20 = r0
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r20
            r4 = r20
            r5 = r19
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L4d
            long r4 = r4 + r5
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)     // Catch: java.lang.Throwable -> L4d
            float r0 = nnvgTextBounds(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4d
            r22 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r22
            return r0
        L4d:
            r23 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r23
            throw r0
    }

    public static native void nnvgTextBoxBounds(long r0, float r2, float r3, float r4, long r5, long r7, long r9);

    public static void nvgTextBoxBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, float r16, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            int r6 = r6.remaining()
            long r6 = (long) r6
            long r5 = r5 + r6
            r6 = r18
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nnvgTextBoxBounds(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nvgTextBoxBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, float r16, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r19 = r0
            r0 = r19
            int r0 = r0.getPointer()
            r20 = r0
            r0 = r19
            r1 = r17
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4d
            r21 = r0
            r0 = r19
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4d
            r22 = r0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r22
            r5 = r22
            r6 = r21
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L4d
            long r5 = r5 + r6
            r6 = r18
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)     // Catch: java.lang.Throwable -> L4d
            nnvgTextBoxBounds(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0 = r19
            r1 = r20
            r0.setPointer(r1)
            goto L59
        L4d:
            r24 = move-exception
            r0 = r19
            r1 = r20
            r0.setPointer(r1)
            r0 = r24
            throw r0
        L59:
            return
    }

    public static native int nnvgTextGlyphPositions(long r0, float r2, float r3, long r4, long r6, long r8, int r10);

    public static int nvgTextGlyphPositions(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r16, @org.lwjgl.system.NativeType("NVGglyphPosition *") org.lwjgl.nanovg.NVGGlyphPosition.Buffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            int r5 = r5.remaining()
            long r5 = (long) r5
            long r4 = r4 + r5
            r5 = r17
            long r5 = r5.address()
            r6 = r17
            int r6 = r6.remaining()
            int r0 = nnvgTextGlyphPositions(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static int nvgTextGlyphPositions(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r16, @org.lwjgl.system.NativeType("NVGglyphPosition *") org.lwjgl.nanovg.NVGGlyphPosition.Buffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r18 = r0
            r0 = r18
            int r0 = r0.getPointer()
            r19 = r0
            r0 = r18
            r1 = r16
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4c
            r20 = r0
            r0 = r18
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4c
            r21 = r0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r21
            r4 = r21
            r5 = r20
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L4c
            long r4 = r4 + r5
            r5 = r17
            long r5 = r5.address()     // Catch: java.lang.Throwable -> L4c
            r6 = r17
            int r6 = r6.remaining()     // Catch: java.lang.Throwable -> L4c
            int r0 = nnvgTextGlyphPositions(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            r23 = r0
            r0 = r18
            r1 = r19
            r0.setPointer(r1)
            r0 = r23
            return r0
        L4c:
            r24 = move-exception
            r0 = r18
            r1 = r19
            r0.setPointer(r1)
            r0 = r24
            throw r0
    }

    public static native void nnvgTextMetrics(long r0, long r2, long r4, long r6);

    public static void nvgTextMetrics(@org.lwjgl.system.NativeType("NVGcontext *") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r9
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nnvgTextMetrics(r0, r1, r2, r3)
            return
    }

    public static native int nnvgTextBreakLines(long r0, long r2, long r4, float r6, long r7, int r9);

    public static int nvgTextBreakLines(@org.lwjgl.system.NativeType("NVGcontext *") long r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, float r14, @org.lwjgl.system.NativeType("NVGtextRow *") org.lwjgl.nanovg.NVGTextRow.Buffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r11
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            int r3 = r3.remaining()
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r14
            r4 = r15
            long r4 = r4.address()
            r5 = r15
            int r5 = r5.remaining()
            int r0 = nnvgTextBreakLines(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int nvgTextBreakLines(@org.lwjgl.system.NativeType("NVGcontext *") long r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13, float r14, @org.lwjgl.system.NativeType("NVGtextRow *") org.lwjgl.nanovg.NVGTextRow.Buffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r13
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4a
            r18 = r0
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4a
            r19 = r0
            r0 = r11
            r1 = r19
            r2 = r19
            r3 = r18
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4a
            long r2 = r2 + r3
            r3 = r14
            r4 = r15
            long r4 = r4.address()     // Catch: java.lang.Throwable -> L4a
            r5 = r15
            int r5 = r5.remaining()     // Catch: java.lang.Throwable -> L4a
            int r0 = nnvgTextBreakLines(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4a
            r21 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r21
            return r0
        L4a:
            r22 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    @org.lwjgl.system.NativeType("void *")
    private static native long nvgCreateInternal();

    @org.lwjgl.system.NativeType("void *")
    private static native long nvgInternalParams();

    @org.lwjgl.system.NativeType("void *")
    private static native long nvgDeleteInternal();

    public static native void nnvgCurrentTransform(long r0, float[] r2);

    public static void nvgCurrentTransform(@org.lwjgl.system.NativeType("NVGcontext *") long r4, @org.lwjgl.system.NativeType("float *") float[] r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r4
            r1 = r6
            nnvgCurrentTransform(r0, r1)
            return
    }

    public static native void nnvgTransformIdentity(float[] r0);

    public static void nvgTransformIdentity(@org.lwjgl.system.NativeType("float *") float[] r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            nnvgTransformIdentity(r0)
            return
    }

    public static native void nnvgTransformTranslate(float[] r0, float r1, float r2);

    public static void nvgTransformTranslate(@org.lwjgl.system.NativeType("float *") float[] r4, float r5, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            r2 = r6
            nnvgTransformTranslate(r0, r1, r2)
            return
    }

    public static native void nnvgTransformScale(float[] r0, float r1, float r2);

    public static void nvgTransformScale(@org.lwjgl.system.NativeType("float *") float[] r4, float r5, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r4
            r1 = r5
            r2 = r6
            nnvgTransformScale(r0, r1, r2)
            return
    }

    public static native void nnvgTransformRotate(float[] r0, float r1);

    public static void nvgTransformRotate(@org.lwjgl.system.NativeType("float *") float[] r3, float r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            r1 = r4
            nnvgTransformRotate(r0, r1)
            return
    }

    public static native void nnvgTransformSkewX(float[] r0, float r1);

    public static void nvgTransformSkewX(@org.lwjgl.system.NativeType("float *") float[] r3, float r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            r1 = r4
            nnvgTransformSkewX(r0, r1)
            return
    }

    public static native void nnvgTransformSkewY(float[] r0, float r1);

    public static void nvgTransformSkewY(@org.lwjgl.system.NativeType("float *") float[] r3, float r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            r1 = r4
            nnvgTransformSkewY(r0, r1)
            return
    }

    public static native void nnvgTransformMultiply(float[] r0, float[] r1);

    public static void nvgTransformMultiply(@org.lwjgl.system.NativeType("float *") float[] r3, @org.lwjgl.system.NativeType("float const *") float[] r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r3
            r1 = r4
            nnvgTransformMultiply(r0, r1)
            return
    }

    public static native void nnvgTransformPremultiply(float[] r0, float[] r1);

    public static void nvgTransformPremultiply(@org.lwjgl.system.NativeType("float *") float[] r3, @org.lwjgl.system.NativeType("float const *") float[] r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r3
            r1 = r4
            nnvgTransformPremultiply(r0, r1)
            return
    }

    public static native int nnvgTransformInverse(float[] r0, float[] r1);

    @org.lwjgl.system.NativeType("int")
    public static boolean nvgTransformInverse(@org.lwjgl.system.NativeType("float *") float[] r3, @org.lwjgl.system.NativeType("float const *") float[] r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r4
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r3
            r1 = r4
            int r0 = nnvgTransformInverse(r0, r1)
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    public static native void nnvgTransformPoint(float[] r0, float[] r1, float[] r2, float r3, float r4);

    public static void nvgTransformPoint(@org.lwjgl.system.NativeType("float *") float[] r6, @org.lwjgl.system.NativeType("float *") float[] r7, @org.lwjgl.system.NativeType("float const *") float[] r8, float r9, float r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = 6
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            nnvgTransformPoint(r0, r1, r2, r3, r4)
            return
    }

    public static native void nnvgImageSize(long r0, int r2, int[] r3, int[] r4);

    public static void nvgImageSize(@org.lwjgl.system.NativeType("NVGcontext *") long r6, int r8, @org.lwjgl.system.NativeType("int *") int[] r9, @org.lwjgl.system.NativeType("int *") int[] r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            nnvgImageSize(r0, r1, r2, r3)
            return
    }

    public static native float nnvgTextBounds(long r0, float r2, float r3, long r4, long r6, float[] r8);

    public static float nvgTextBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r11, float r13, float r14, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            int r5 = r5.remaining()
            long r5 = (long) r5
            long r4 = r4 + r5
            r5 = r16
            float r0 = nnvgTextBounds(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static float nvgTextBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r11, float r13, float r14, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = r15
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4a
            r19 = r0
            r0 = r17
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4a
            r20 = r0
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r20
            r4 = r20
            r5 = r19
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L4a
            long r4 = r4 + r5
            r5 = r16
            float r0 = nnvgTextBounds(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4a
            r22 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r22
            return r0
        L4a:
            r23 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r23
            throw r0
    }

    public static native void nnvgTextBoxBounds(long r0, float r2, float r3, float r4, long r5, long r7, float[] r9);

    public static void nvgTextBoxBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, float r16, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            int r6 = r6.remaining()
            long r6 = (long) r6
            long r5 = r5 + r6
            r6 = r18
            nnvgTextBoxBounds(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nvgTextBoxBounds(@org.lwjgl.system.NativeType("NVGcontext *") long r12, float r14, float r15, float r16, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r19 = r0
            r0 = r19
            int r0 = r0.getPointer()
            r20 = r0
            r0 = r19
            r1 = r17
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4a
            r21 = r0
            r0 = r19
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4a
            r22 = r0
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r22
            r5 = r22
            r6 = r21
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L4a
            long r5 = r5 + r6
            r6 = r18
            nnvgTextBoxBounds(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4a
            r0 = r19
            r1 = r20
            r0.setPointer(r1)
            goto L56
        L4a:
            r24 = move-exception
            r0 = r19
            r1 = r20
            r0.setPointer(r1)
            r0 = r24
            throw r0
        L56:
            return
    }

    public static native void nnvgTextMetrics(long r0, float[] r2, float[] r3, float[] r4);

    public static void nvgTextMetrics(@org.lwjgl.system.NativeType("NVGcontext *") long r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1b:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            nnvgTextMetrics(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.nanovg.LibNanoVG.initialize()
            long r0 = nvgCreateInternal()
            org.lwjgl.nanovg.NanoVG.nvgCreateInternal = r0
            long r0 = nvgInternalParams()
            org.lwjgl.nanovg.NanoVG.nvgInternalParams = r0
            long r0 = nvgDeleteInternal()
            org.lwjgl.nanovg.NanoVG.nvgDeleteInternal = r0
            return
    }
}
