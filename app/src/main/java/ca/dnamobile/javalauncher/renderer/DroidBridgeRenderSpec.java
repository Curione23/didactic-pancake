package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeRenderSpec {
    private static final java.lang.String TAG = "DroidBridgeRenderSpec";

    private DroidBridgeRenderSpec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean configureForMesa(android.content.Context r10, ca.dnamobile.javalauncher.renderer.RendererInterface r11) {
            java.lang.String r0 = "DroidBridgeRenderSpec"
            java.lang.String r1 = " egl=libEGL_mesa.so namespacePath="
            java.lang.String r2 = "Configured fallback RenderSpec result="
            java.lang.String r3 = "Configured namespace RenderSpec result="
            boolean r4 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r11)
            r5 = 0
            if (r4 != 0) goto L10
            return r5
        L10:
            java.io.File r4 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.resolveMesaNativeDir(r10)
            java.io.File r6 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.prepareMesaLibraryAliases(r10, r11)
            java.lang.String r10 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.buildMesaNamespacePath(r10, r11)
            java.io.File r11 = new java.io.File
            java.lang.String r7 = "libEGL_mesa.so"
            r11.<init>(r4, r7)
            r8 = 1
            boolean r7 = nativeConfigure(r7, r10, r8, r5, r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r3 = r9.append(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r10 = r1.append(r10)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = " nativeDir="
            java.lang.StringBuilder r10 = r10.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r10 = r10.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = " aliasDir="
            java.lang.StringBuilder r10 = r10.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r10 = r10.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5f
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r10)     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L65
            return r8
        L5f:
            r10 = move-exception
            java.lang.String r1 = "Namespace RenderSpec configure failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r10)
        L65:
            java.lang.String r10 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = ""
            boolean r10 = nativeConfigure(r10, r1, r5, r5, r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = " egl="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r11 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r11 = r1.append(r11)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L8e
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r11)     // Catch: java.lang.Throwable -> L8e
            return r10
        L8e:
            r10 = move-exception
            java.lang.String r11 = "Fallback RenderSpec configure failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r11, r10)
            return r5
    }

    private static native boolean nativeConfigure(java.lang.String r0, java.lang.String r1, boolean r2, boolean r3, int r4);
}
