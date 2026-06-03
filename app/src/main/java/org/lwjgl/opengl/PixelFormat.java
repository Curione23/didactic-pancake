package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PixelFormat.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PixelFormat.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PixelFormat.class */
public final class PixelFormat implements org.lwjgl.opengl.PixelFormatLWJGL {
    private int bpp;
    private int alpha;
    private int depth;
    private int stencil;
    private int samples;
    private int colorSamples;
    private int num_aux_buffers;
    private int accum_bpp;
    private int accum_alpha;
    private boolean stereo;
    private boolean floating_point;
    private boolean floating_point_packed;
    private boolean sRGB;

    public PixelFormat() {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = 8
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public PixelFormat(int r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public PixelFormat(int r8, int r9, int r10, int r11) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public PixelFormat(int r12, int r13, int r14, int r15, int r16) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public PixelFormat(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public PixelFormat(int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, boolean r12, boolean r13) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.bpp = r1
            r0 = r3
            r1 = r5
            r0.alpha = r1
            r0 = r3
            r1 = r6
            r0.depth = r1
            r0 = r3
            r1 = r7
            r0.stencil = r1
            r0 = r3
            r1 = r8
            r0.samples = r1
            r0 = r3
            r1 = r9
            r0.num_aux_buffers = r1
            r0 = r3
            r1 = r10
            r0.accum_bpp = r1
            r0 = r3
            r1 = r11
            r0.accum_alpha = r1
            r0 = r3
            r1 = r12
            r0.stereo = r1
            r0 = r3
            r1 = r13
            r0.floating_point = r1
            r0 = r3
            r1 = 0
            r0.floating_point_packed = r1
            r0 = r3
            r1 = 0
            r0.sRGB = r1
            return
    }

    private PixelFormat(org.lwjgl.opengl.PixelFormat r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            int r1 = r1.bpp
            r0.bpp = r1
            r0 = r3
            r1 = r4
            int r1 = r1.alpha
            r0.alpha = r1
            r0 = r3
            r1 = r4
            int r1 = r1.depth
            r0.depth = r1
            r0 = r3
            r1 = r4
            int r1 = r1.stencil
            r0.stencil = r1
            r0 = r3
            r1 = r4
            int r1 = r1.samples
            r0.samples = r1
            r0 = r3
            r1 = r4
            int r1 = r1.colorSamples
            r0.colorSamples = r1
            r0 = r3
            r1 = r4
            int r1 = r1.num_aux_buffers
            r0.num_aux_buffers = r1
            r0 = r3
            r1 = r4
            int r1 = r1.accum_bpp
            r0.accum_bpp = r1
            r0 = r3
            r1 = r4
            int r1 = r1.accum_alpha
            r0.accum_alpha = r1
            r0 = r3
            r1 = r4
            boolean r1 = r1.stereo
            r0.stereo = r1
            r0 = r3
            r1 = r4
            boolean r1 = r1.floating_point
            r0.floating_point = r1
            r0 = r3
            r1 = r4
            boolean r1 = r1.floating_point_packed
            r0.floating_point_packed = r1
            r0 = r3
            r1 = r4
            boolean r1 = r1.sRGB
            r0.sRGB = r1
            return
    }

    public int getBitsPerPixel() {
            r2 = this;
            r0 = r2
            int r0 = r0.bpp
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withBitsPerPixel(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of bits per pixel specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.bpp = r1
            r0 = r7
            return r0
    }

    public int getAlphaBits() {
            r2 = this;
            r0 = r2
            int r0 = r0.alpha
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withAlphaBits(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of alpha bits specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.alpha = r1
            r0 = r7
            return r0
    }

    public int getDepthBits() {
            r2 = this;
            r0 = r2
            int r0 = r0.depth
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withDepthBits(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of depth bits specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.depth = r1
            r0 = r7
            return r0
    }

    public int getStencilBits() {
            r2 = this;
            r0 = r2
            int r0 = r0.stencil
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withStencilBits(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of stencil bits specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.stencil = r1
            r0 = r7
            return r0
    }

    public int getSamples() {
            r2 = this;
            r0 = r2
            int r0 = r0.samples
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withSamples(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of samples specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.samples = r1
            r0 = r7
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withCoverageSamples(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            int r2 = r2.samples
            org.lwjgl.opengl.PixelFormat r0 = r0.withCoverageSamples(r1, r2)
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withCoverageSamples(int r6, int r7) {
            r5 = this;
            r0 = r7
            if (r0 < 0) goto L16
            r0 = r6
            if (r0 < 0) goto L16
            r0 = r7
            if (r0 != 0) goto L11
            r0 = 0
            r1 = r6
            if (r0 < r1) goto L16
        L11:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L3a
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of coverage samples specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " - "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3a:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r7
            r0.samples = r1
            r0 = r8
            r1 = r6
            r0.colorSamples = r1
            r0 = r8
            return r0
    }

    public int getAuxBuffers() {
            r2 = this;
            r0 = r2
            int r0 = r0.num_aux_buffers
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withAuxBuffers(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of auxiliary buffers specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.num_aux_buffers = r1
            r0 = r7
            return r0
    }

    public int getAccumulationBitsPerPixel() {
            r2 = this;
            r0 = r2
            int r0 = r0.accum_bpp
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withAccumulationBitsPerPixel(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of bits per pixel in the accumulation buffer specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.accum_bpp = r1
            r0 = r7
            return r0
    }

    public int getAccumulationAlpha() {
            r2 = this;
            r0 = r2
            int r0 = r0.accum_alpha
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withAccumulationAlpha(int r6) {
            r5 = this;
            r0 = r6
            if (r0 >= 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid number of alpha bits in the accumulation buffer specified: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1f:
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            r0.accum_alpha = r1
            r0 = r7
            return r0
    }

    public boolean isStereo() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.stereo
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withStereo(boolean r5) {
            r4 = this;
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.stereo = r1
            r0 = r6
            return r0
    }

    public boolean isFloatingPoint() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.floating_point
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withFloatingPoint(boolean r5) {
            r4 = this;
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.floating_point = r1
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r6
            r1 = 0
            r0.floating_point_packed = r1
        L17:
            r0 = r6
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withFloatingPointPacked(boolean r5) {
            r4 = this;
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.floating_point_packed = r1
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r6
            r1 = 0
            r0.floating_point = r1
        L17:
            r0 = r6
            return r0
    }

    public boolean isSRGB() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.sRGB
            return r0
    }

    public org.lwjgl.opengl.PixelFormat withSRGB(boolean r5) {
            r4 = this;
            org.lwjgl.opengl.PixelFormat r0 = new org.lwjgl.opengl.PixelFormat
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.sRGB = r1
            r0 = r6
            return r0
    }
}
