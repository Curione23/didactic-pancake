package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeOpenGlProxyArgs {
    public static final java.lang.String OPENGL_PROXY_SONAME = "libGLDroidBridge.so";
    private static final java.lang.String TAG = "DroidBridgeGLProxy";

    private DroidBridgeOpenGlProxyArgs() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void appendLog(java.lang.String r1) {
            if (r1 != 0) goto L3
            return
        L3:
            net.kdt.pojavlaunch.Logger.appendToLog(r1)     // Catch: java.lang.Throwable -> L6
        L6:
            java.lang.String r0 = "DroidBridgeGLProxy"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    public static ca.dnamobile.javalauncher.launcher.LaunchPlan applyIfNeeded(ca.dnamobile.javalauncher.launcher.LaunchPlan r3, ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            boolean r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isMesaZinkTurnipRenderer(r4)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DroidBridgeGLProxy: skipped for Vulkan Zink rollback path renderer="
            r0.<init>(r1)
            java.lang.String r4 = r4.getRendererId()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            appendLog(r4)
            return r3
        L1d:
            boolean r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r4)
            if (r0 != 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DroidBridgeGLProxy: skipped for renderer="
            r0.<init>(r1)
            java.lang.String r4 = r4.getRendererId()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            appendLog(r4)
            return r3
        L3a:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.getJvmArgs()
            r0.<init>(r1)
            java.lang.String r1 = "-Dorg.lwjgl.opengl.libname="
            removeManagedArg(r0, r1)
            java.lang.String r1 = "-Dorg.lwjgl.opengles.libname="
            removeManagedArg(r0, r1)
            java.lang.String r1 = "-Dorg.lwjgl.opengl.contextAPI="
            removeManagedArg(r0, r1)
            java.lang.String r1 = "-Dorg.lwjgl.opengles.contextAPI="
            removeManagedArg(r0, r1)
            java.lang.String r1 = "-Dorg.lwjgl.util.Debug="
            removeManagedArg(r0, r1)
            java.lang.String r1 = "-Dorg.lwjgl.util.DebugLoader="
            removeManagedArg(r0, r1)
            r1 = 0
            java.lang.String r2 = "-Dorg.lwjgl.util.Debug=true"
            r0.add(r1, r2)
            r1 = 1
            java.lang.String r2 = "-Dorg.lwjgl.util.DebugLoader=true"
            r0.add(r1, r2)
            r1 = 2
            java.lang.String r2 = "-Dorg.lwjgl.opengl.libname=libGLDroidBridge.so"
            r0.add(r1, r2)
            r1 = 3
            java.lang.String r2 = "-Dorg.lwjgl.opengles.libname=libGLDroidBridge.so"
            r0.add(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridgeGLProxy: enabled DroidBridge Mesa LWJGL OpenGL proxy=libGLDroidBridge.so renderer="
            r1.<init>(r2)
            java.lang.String r4 = r4.getRendererId()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            appendLog(r4)
            java.lang.String r4 = "DroidBridgeGLProxy: expecting native hook line containing 'DroidBridge RenderSpec request'"
            appendLog(r4)
            ca.dnamobile.javalauncher.launcher.LaunchPlan r3 = r3.copyWithJvmArgs(r0)
            return r3
    }

    private static void removeManagedArg(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            int r0 = r3.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L28
            java.lang.Object r1 = r3.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L25
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L25
            r3.remove(r0)
        L25:
            int r0 = r0 + (-1)
            goto Lc
        L28:
            return
    }
}
