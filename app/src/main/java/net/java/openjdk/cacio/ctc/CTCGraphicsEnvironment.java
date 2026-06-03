package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsEnvironment.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsEnvironment.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsEnvironment.class */
public class CTCGraphicsEnvironment extends sun.java2d.SunGraphicsEnvironment {
    private static void drawStringTest() {
            java.awt.image.BufferedImage r0 = new java.awt.image.BufferedImage
            r1 = r0
            r2 = 10
            r3 = 10
            r4 = 1
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r6
            java.awt.Graphics2D r0 = r0.createGraphics()
            r7 = r0
            r0 = r7
            java.awt.Color r1 = java.awt.Color.WHITE
            r0.setPaint(r1)
            r0 = r7
            java.lang.String r1 = "Test"
            r2 = 0
            r3 = 4
            r0.drawString(r1, r2, r3)
            r0 = r7
            r0.dispose()
            r0 = 0
            r6 = r0
            return
    }

    public CTCGraphicsEnvironment() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = 0
            r6 = r0
            sun.java2d.SurfaceManagerFactory r0 = sun.java2d.SurfaceManagerFactory.getInstance()     // Catch: java.lang.IllegalStateException -> Ld
            r6 = r0
            goto L18
        Ld:
            r7 = move-exception
            net.java.openjdk.cacio.ctc.CTCSurfaceManagerFactory r0 = new net.java.openjdk.cacio.ctc.CTCSurfaceManagerFactory
            r1 = r0
            r1.<init>()
            sun.java2d.SurfaceManagerFactory.setInstance(r0)
        L18:
            r0 = r6
            if (r0 == 0) goto L4f
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class<net.java.openjdk.cacio.ctc.CTCSurfaceManagerFactory> r1 = net.java.openjdk.cacio.ctc.CTCSurfaceManagerFactory.class
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "The surface manager factory is already initialized to "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L4f:
            return
    }

    protected int getNumScreens() {
            r2 = this;
            r0 = 1
            return r0
    }

    protected java.awt.GraphicsDevice makeScreenDevice(int r4) {
            r3 = this;
            net.java.openjdk.cacio.ctc.CTCGraphicsDevice r0 = new net.java.openjdk.cacio.ctc.CTCGraphicsDevice
            r1 = r0
            r1.<init>()
            return r0
    }

    public boolean isDisplayLocal() {
            r2 = this;
            r0 = 1
            return r0
    }

    static {
            java.lang.String r0 = "cacio.font.fontmanager"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto Le
            r0 = r5
            net.java.openjdk.cacio.ctc.FontManagerUtil.setFontManager(r0)
        Le:
            java.lang.String r0 = "cacio.font.fontscaler"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L86
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1c
            r0 = r6
            net.java.openjdk.cacio.ctc.FontManagerUtil.setFontScaler(r0)     // Catch: java.lang.Throwable -> L86
        L1c:
            java.lang.String r0 = "java.awt.headless"
            java.lang.String r1 = "true"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)     // Catch: java.lang.Throwable -> L86
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L83
            java.lang.String r0 = "java.awt.Toolkit"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L86
            drawStringTest()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "java.awt.headless"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)     // Catch: java.lang.Throwable -> L86
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "headless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L86
            r7 = r0
            r0 = r7
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L86
            r0 = r7
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L86
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "defaultHeadless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L86
            r8 = r0
            r0 = r8
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L86
            r0 = r8
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L86
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L86
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "localEnv"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L86
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L86
            r0 = r9
            r1 = 0
            net.java.openjdk.cacio.ctc.CTCGraphicsEnvironment r2 = new net.java.openjdk.cacio.ctc.CTCGraphicsEnvironment     // Catch: java.lang.Throwable -> L86
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L86
            drawStringTest()     // Catch: java.lang.Throwable -> L86
        L83:
            goto L8b
        L86:
            r6 = move-exception
            r0 = r6
            r0.printStackTrace()
        L8b:
            return
    }
}
