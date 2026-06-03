package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCPreloadClassLoader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCPreloadClassLoader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCPreloadClassLoader.class */
public class CTCPreloadClassLoader extends java.net.URLClassLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public CTCPreloadClassLoader(java.lang.ClassLoader r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            java.net.URL[] r1 = new java.net.URL[r1]
            r2 = r5
            r0.<init>(r1, r2)
            return
    }

    @Override // java.net.URLClassLoader
    public void addURL(java.net.URL r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            super.addURL(r1)
            java.lang.String r0 = "java.class.path"
            java.lang.String r1 = "java.class.path"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.net.URISyntaxException -> L26
            java.io.File r2 = new java.io.File     // Catch: java.net.URISyntaxException -> L26
            r3 = r2
            r4 = r7
            java.net.URI r4 = r4.toURI()     // Catch: java.net.URISyntaxException -> L26
            r3.<init>(r4)     // Catch: java.net.URISyntaxException -> L26
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.net.URISyntaxException -> L26
            java.lang.String r1 = r1 + ":" + r2     // Catch: java.net.URISyntaxException -> L26
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)     // Catch: java.net.URISyntaxException -> L26
            goto L2b
        L26:
            r8 = move-exception
            r0 = r8
            r0.printStackTrace()
        L2b:
            return
    }

    static java.net.URL getFileURL(java.io.File r4) {
            r0 = r4
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L8
            r4 = r0
            goto L9
        L8:
            r5 = move-exception
        L9:
            r0 = r4
            java.net.URL r0 = r0.toURL()     // Catch: java.net.MalformedURLException -> Le
            return r0
        Le:
            r5 = move-exception
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    private void appendToClassPathForInstrumentation(java.lang.String r6) {
            r5 = this;
            boolean r0 = com.github.caciocavallosilano.cacio.ctc.CTCPreloadClassLoader.$assertionsDisabled
            if (r0 != 0) goto L15
            r0 = r5
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 != 0) goto L15
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L15:
            r0 = r5
            java.io.File r1 = new java.io.File
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.net.URL r1 = getFileURL(r1)
            super.addURL(r1)
            return
    }

    public static void setFinalStatic(java.lang.reflect.Field r6, java.lang.Object r7) throws java.lang.Exception {
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.String r1 = "theUnsafe"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r8 = r0
            r0 = r8
            r1 = 1
            r0.setAccessible(r1)
            r0 = r8
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            r9 = r0
            r0 = r9
            r1 = r6
            java.lang.Object r0 = r0.staticFieldBase(r1)
            r10 = r0
            r0 = r9
            r1 = r6
            long r0 = r0.staticFieldOffset(r1)
            r11 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r7
            r0.putObject(r1, r2, r3)
            return
    }

    static {
            java.lang.Class<com.github.caciocavallosilano.cacio.ctc.CTCPreloadClassLoader> r0 = com.github.caciocavallosilano.cacio.ctc.CTCPreloadClassLoader.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.github.caciocavallosilano.cacio.ctc.CTCPreloadClassLoader.$assertionsDisabled = r0
            java.lang.Class<java.awt.Toolkit> r0 = java.awt.Toolkit.class
            java.lang.String r1 = "toolkit"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lb4
            r5 = r0
            r0 = r5
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lb4
            r0 = r5
            r1 = 0
            com.github.caciocavallosilano.cacio.ctc.CTCToolkit r2 = new com.github.caciocavallosilano.cacio.ctc.CTCToolkit     // Catch: java.lang.Exception -> Lb4
            r3 = r2
            r3.<init>()     // Catch: java.lang.Exception -> Lb4
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "defaultHeadless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lb4
            r6 = r0
            r0 = r6
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lb4
            r0 = r6
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lb4
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "headless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lb4
            r7 = r0
            r0 = r7
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lb4
            r0 = r7
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lb4
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "java.awt.GraphicsEnvironment$LocalGE"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lb4
            r8 = r0
            r0 = r8
            java.lang.String r1 = "INSTANCE"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lb4
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lb4
            r0 = r6
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lb4
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lb4
            r0 = r7
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lb4
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "sun.java2d.SurfaceManagerFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lb4
            r10 = r0
            r0 = r10
            java.lang.String r1 = "instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lb4
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lb4
            r0 = r11
            r1 = 0
            r2 = 0
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lb4
            r0 = r9
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment r1 = new com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment     // Catch: java.lang.Exception -> Lb4
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> Lb4
            setFinalStatic(r0, r1)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = "cacio.font.fontmanager"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> Lb4
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Lb1
            r0 = r12
            com.github.caciocavallosilano.cacio.ctc.FontManagerUtil.setFontManager(r0)     // Catch: java.lang.Exception -> Lb4
        Lb1:
            goto Lb9
        Lb4:
            r5 = move-exception
            r0 = r5
            r0.printStackTrace()
        Lb9:
            java.lang.String r0 = "swing.defaultlaf"
            java.lang.Class<javax.swing.plaf.nimbus.NimbusLookAndFeel> r1 = javax.swing.plaf.nimbus.NimbusLookAndFeel.class
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)
            return
    }
}
