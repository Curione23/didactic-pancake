package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGGLES3.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGGLES3.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGGLES3.class */
public class NanoVGGLES3 {
    public static final int NVG_ANTIALIAS = 1;
    public static final int NVG_STENCIL_STROKES = 2;
    public static final int NVG_DEBUG = 4;
    public static final int NVG_IMAGE_NODELETE = 65536;

    protected NanoVGGLES3() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nnvglCreateImageFromHandle(long r0, int r2, int r3, int r4, int r5);

    public static int nvglCreateImageFromHandle(@org.lwjgl.system.NativeType("NVGcontext *") long r7, @org.lwjgl.system.NativeType("GLuint") int r9, int r10, int r11, int r12) {
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
            int r0 = nnvglCreateImageFromHandle(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nnvglImageHandle(long r0, int r2);

    @org.lwjgl.system.NativeType("GLuint")
    public static int nvglImageHandle(@org.lwjgl.system.NativeType("NVGcontext *") long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            int r0 = nnvglImageHandle(r0, r1)
            return r0
    }

    public static native long nnvgCreate(int r0);

    @org.lwjgl.system.NativeType("NVGcontext *")
    public static long nvgCreate(int r3) {
            r0 = r3
            long r0 = nnvgCreate(r0)
            return r0
    }

    public static native void nnvgDelete(long r0);

    public static void nvgDelete(@org.lwjgl.system.NativeType("NVGcontext *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nnvgDelete(r0)
            return
    }

    public static native long nnvgluCreateFramebuffer(long r0, int r2, int r3, int r4);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("NVGLUframebuffer *")
    public static org.lwjgl.nanovg.NVGLUFramebuffer nvgluCreateFramebuffer(@org.lwjgl.system.NativeType("NVGcontext *") long r6, int r8, int r9, int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            long r0 = nnvgluCreateFramebuffer(r0, r1, r2, r3)
            r11 = r0
            r0 = r11
            org.lwjgl.nanovg.NVGLUFramebuffer r0 = org.lwjgl.nanovg.NVGLUFramebuffer.createSafe(r0)
            return r0
    }

    public static native void nnvgluBindFramebuffer(long r0, long r2);

    public static void nvgluBindFramebuffer(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("NVGLUframebuffer *") org.lwjgl.nanovg.NVGLUFramebuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nnvgluBindFramebuffer(r0, r1)
            return
    }

    public static native void nnvgluDeleteFramebuffer(long r0, long r2);

    public static void nvgluDeleteFramebuffer(@org.lwjgl.system.NativeType("NVGcontext *") long r5, @org.lwjgl.system.NativeType("NVGLUframebuffer *") org.lwjgl.nanovg.NVGLUFramebuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nnvgluDeleteFramebuffer(r0, r1)
            return
    }

    static {
            org.lwjgl.nanovg.LibNanoVG.initialize()
            return
    }
}
