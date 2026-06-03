package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX.class */
public class NanoVGBGFX {
    public static final int NVG_IMAGE_NODELETE = 65536;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX$BGFX.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX$BGFX.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX$BGFX.class */
    private static class BGFX {
        private static final org.lwjgl.system.SharedLibrary library = null;

        private BGFX() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static org.lwjgl.system.SharedLibrary getLibrary() {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.library
                return r0
        }

        static {
                java.lang.String r0 = "org.lwjgl.bgfx.BGFX"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
                java.lang.String r1 = "getLibrary"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1f
                r1 = 0
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1f
                org.lwjgl.system.SharedLibrary r0 = (org.lwjgl.system.SharedLibrary) r0     // Catch: java.lang.Exception -> L1f
                org.lwjgl.nanovg.NanoVGBGFX.BGFX.library = r0     // Catch: java.lang.Exception -> L1f
                goto L29
            L1f:
                r4 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                throw r0
            L29:
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NanoVGBGFX$Functions.class */
    public static final class Functions {
        public static final long Create = 0;
        public static final long Delete = 0;
        public static final long SetViewId = 0;
        public static final long GetViewId = 0;
        public static final long luCreateFramebuffer = 0;
        public static final long luBindFramebuffer = 0;
        public static final long luDeleteFramebuffer = 0;
        public static final long luSetViewFramebuffer = 0;
        public static final long CreateBgfxTexture = 0;
        public static final long org_lwjgl_nanovg_setup = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.Create = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgDelete"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.Delete = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgSetViewId"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.SetViewId = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgGetViewId"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.GetViewId = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgluCreateFramebuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.luCreateFramebuffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgluBindFramebuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.luBindFramebuffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgluDeleteFramebuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.luDeleteFramebuffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgluSetViewFramebuffer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.luSetViewFramebuffer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "nvgCreateBgfxTexture"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.CreateBgfxTexture = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.nanovg.NanoVGBGFX.BGFX.getLibrary()
                java.lang.String r1 = "org_lwjgl_nanovg_setup"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.nanovg.NanoVGBGFX.Functions.org_lwjgl_nanovg_setup = r0
                return
        }
    }

    protected NanoVGBGFX() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nnvgCreate(int r7, short r8, long r9) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.Create
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            long r0 = org.lwjgl.system.JNI.invokeCPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcontext *")
    public static long nvgCreate(@org.lwjgl.system.NativeType("int32_t") boolean r5, @org.lwjgl.system.NativeType("bgfx_view_id_t") int r6, @org.lwjgl.system.NativeType("bgfx_allocator_interface_t *") long r7) {
            r0 = r5
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r1 = r6
            short r1 = (short) r1
            r2 = r7
            long r0 = nnvgCreate(r0, r1, r2)
            return r0
    }

    public static void nvgDelete(@org.lwjgl.system.NativeType("NVGcontext *") long r5) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.Delete
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nnvgSetViewId(long r6, short r8) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.SetViewId
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.system.JNI.invokePCV(r0, r1, r2)
            return
    }

    public static void nvgSetViewId(@org.lwjgl.system.NativeType("NVGcontext *") long r4, @org.lwjgl.system.NativeType("bgfx_view_id_t") int r6) {
            r0 = r4
            r1 = r6
            short r1 = (short) r1
            nnvgSetViewId(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public static short nvgGetViewId(@org.lwjgl.system.NativeType("NVGcontext *") long r5) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.GetViewId
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            short r0 = org.lwjgl.system.JNI.invokePC(r0, r1)
            return r0
    }

    public static long nnvgluCreateFramebuffer(long r8, int r10, int r11, int r12) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.luCreateFramebuffer
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("NVGLUframebuffer *")
    public static org.lwjgl.nanovg.NVGLUFramebufferBGFX nvgluCreateFramebuffer(@org.lwjgl.system.NativeType("NVGcontext *") long r6, @org.lwjgl.system.NativeType("int32_t") int r8, @org.lwjgl.system.NativeType("int32_t") int r9, @org.lwjgl.system.NativeType("int32_t") int r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            long r0 = nnvgluCreateFramebuffer(r0, r1, r2, r3)
            r11 = r0
            r0 = r11
            org.lwjgl.nanovg.NVGLUFramebufferBGFX r0 = org.lwjgl.nanovg.NVGLUFramebufferBGFX.createSafe(r0)
            return r0
    }

    public static void nnvgluBindFramebuffer(long r5) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.luBindFramebuffer
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nvgluBindFramebuffer(@javax.annotation.Nullable @org.lwjgl.system.NativeType("NVGLUframebuffer *") org.lwjgl.nanovg.NVGLUFramebufferBGFX r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nnvgluBindFramebuffer(r0)
            return
    }

    public static void nnvgluDeleteFramebuffer(long r5) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.luDeleteFramebuffer
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nvgluDeleteFramebuffer(@org.lwjgl.system.NativeType("NVGLUframebuffer *") org.lwjgl.nanovg.NVGLUFramebufferBGFX r3) {
            r0 = r3
            long r0 = r0.address()
            nnvgluDeleteFramebuffer(r0)
            return
    }

    public static void nnvgluSetViewFramebuffer(short r6, long r7) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.luSetViewFramebuffer
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokeCPV(r0, r1, r2)
            return
    }

    public static void nvgluSetViewFramebuffer(@org.lwjgl.system.NativeType("bgfx_view_id_t") int r4, @org.lwjgl.system.NativeType("NVGLUframebuffer *") org.lwjgl.nanovg.NVGLUFramebufferBGFX r5) {
            r0 = r4
            short r0 = (short) r0
            r1 = r5
            long r1 = r1.address()
            nnvgluSetViewFramebuffer(r0, r1)
            return
    }

    public static void nvgCreateBgfxTexture(@org.lwjgl.system.NativeType("NVGcontext *") long r9, @org.lwjgl.system.NativeType("bgfx_texture_handle_t") short r11, int r12, int r13, int r14) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.CreateBgfxTexture
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.invokePCV(r0, r1, r2, r3, r4, r5)
            return
    }

    private static void org_lwjgl_nanovg_setup(@org.lwjgl.system.NativeType("void *") long r13, @org.lwjgl.system.NativeType("void *") long r15, @org.lwjgl.system.NativeType("void *") long r17, @org.lwjgl.system.NativeType("void *") long r19, @org.lwjgl.system.NativeType("void *") long r21) {
            long r0 = org.lwjgl.nanovg.NanoVGBGFX.Functions.org_lwjgl_nanovg_setup
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L27
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L27:
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            org.lwjgl.system.JNI.invokePPPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator(r0)
            r11 = r0
            r0 = r11
            long r0 = r0.getRealloc()
            r1 = r11
            long r1 = r1.getFree()
            long r2 = org.lwjgl.nanovg.NanoVG.nvgCreateInternal
            long r3 = org.lwjgl.nanovg.NanoVG.nvgInternalParams
            long r4 = org.lwjgl.nanovg.NanoVG.nvgDeleteInternal
            org_lwjgl_nanovg_setup(r0, r1, r2, r3, r4)
            return
    }
}
