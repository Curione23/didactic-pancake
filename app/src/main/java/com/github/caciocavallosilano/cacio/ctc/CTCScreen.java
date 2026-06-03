package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCScreen.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCScreen.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCScreen.class */
public class CTCScreen implements com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen {
    private java.awt.image.BufferedImage screenBuffer;
    private static com.github.caciocavallosilano.cacio.ctc.CTCScreen instance;
    private static int[] dataBufAux;

    static com.github.caciocavallosilano.cacio.ctc.CTCScreen getInstance() {
            com.github.caciocavallosilano.cacio.ctc.CTCScreen r0 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.instance
            if (r0 != 0) goto L10
            com.github.caciocavallosilano.cacio.ctc.CTCScreen r0 = new com.github.caciocavallosilano.cacio.ctc.CTCScreen
            r1 = r0
            r1.<init>()
            com.github.caciocavallosilano.cacio.ctc.CTCScreen.instance = r0
        L10:
            com.github.caciocavallosilano.cacio.ctc.CTCScreen r0 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.instance
            return r0
    }

    private CTCScreen() {
            r7 = this;
            r0 = r7
            r0.<init>()
            java.awt.Dimension r0 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            r8 = r0
            r0 = r7
            java.awt.image.BufferedImage r1 = new java.awt.image.BufferedImage
            r2 = r1
            r3 = r8
            int r3 = r3.width
            r4 = r8
            int r4 = r4.height
            r5 = 2
            r2.<init>(r3, r4, r5)
            r0.screenBuffer = r1
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public java.awt.image.ColorModel getColorModel() {
            r2 = this;
            r0 = r2
            java.awt.image.BufferedImage r0 = r0.screenBuffer
            java.awt.image.ColorModel r0 = r0.getColorModel()
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public java.awt.GraphicsConfiguration getGraphicsConfiguration() {
            r2 = this;
            java.awt.GraphicsEnvironment r0 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()
            java.awt.GraphicsDevice r0 = r0.getDefaultScreenDevice()
            java.awt.GraphicsConfiguration r0 = r0.getDefaultConfiguration()
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public java.awt.Rectangle getBounds() {
            r7 = this;
            java.awt.Dimension r0 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            r8 = r0
            java.awt.Rectangle r0 = new java.awt.Rectangle
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = r8
            int r4 = r4.width
            r5 = r8
            int r5 = r5.height
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.managed.PlatformScreen
    public java.awt.Graphics2D getClippedGraphics(java.awt.Color r6, java.awt.Color r7, java.awt.Font r8, java.util.List<java.awt.Rectangle> r9) {
            r5 = this;
            r0 = r5
            java.awt.image.BufferedImage r0 = r0.screenBuffer
            java.awt.Graphics r0 = r0.getGraphics()
            java.awt.Graphics2D r0 = (java.awt.Graphics2D) r0
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L65
            r0 = r9
            int r0 = r0.size()
            if (r0 <= 0) goto L65
            java.awt.geom.Area r0 = new java.awt.geom.Area
            r1 = r0
            r2 = r5
            java.awt.Rectangle r2 = r2.getBounds()
            r1.<init>(r2)
            r11 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L31:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L58
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.awt.Rectangle r0 = (java.awt.Rectangle) r0
            r13 = r0
            r0 = r11
            java.awt.geom.Area r1 = new java.awt.geom.Area
            r2 = r1
            r3 = r13
            r2.<init>(r3)
            r0.subtract(r1)
            goto L31
        L58:
            com.github.caciocavallosilano.cacio.peer.WindowClippedGraphics r0 = new com.github.caciocavallosilano.cacio.peer.WindowClippedGraphics
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)
            r10 = r0
        L65:
            r0 = r10
            return r0
    }

    int[] getRGBPixels(java.awt.Rectangle r10) {
            r9 = this;
            r0 = r9
            java.awt.image.BufferedImage r0 = r0.screenBuffer
            r1 = r10
            int r1 = r1.x
            r2 = r10
            int r2 = r2.y
            r3 = r10
            int r3 = r3.width
            r4 = r10
            int r4 = r4.height
            r5 = 0
            r6 = 0
            r7 = r10
            int r7 = r7.width
            int[] r0 = r0.getRGB(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static int[] getCurrentScreenRGB() {
            com.github.caciocavallosilano.cacio.ctc.CTCScreen r0 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.instance
            java.awt.image.BufferedImage r0 = r0.screenBuffer
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            int[] r0 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.dataBufAux
            if (r0 != 0) goto L25
            java.awt.Dimension r0 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            double r0 = r0.getWidth()
            int r0 = (int) r0
            java.awt.Dimension r1 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            double r1 = r1.getHeight()
            int r1 = (int) r1
            int r0 = r0 * r1
            int[] r0 = new int[r0]
            com.github.caciocavallosilano.cacio.ctc.CTCScreen.dataBufAux = r0
        L25:
            com.github.caciocavallosilano.cacio.ctc.CTCScreen r0 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.instance
            java.awt.image.BufferedImage r0 = r0.screenBuffer
            java.awt.image.WritableRaster r0 = r0.getRaster()
            r1 = 0
            r2 = 0
            java.awt.Dimension r3 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            double r3 = r3.getWidth()
            int r3 = (int) r3
            java.awt.Dimension r4 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            double r4 = r4.getHeight()
            int r4 = (int) r4
            int[] r5 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.dataBufAux
            java.lang.Object r0 = r0.getDataElements(r1, r2, r3, r4, r5)
            int[] r0 = com.github.caciocavallosilano.cacio.ctc.CTCScreen.dataBufAux
            return r0
    }

    static {
            java.lang.String r0 = "LD_LIBRARY_PATH"
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L4b
            r6 = r0
            r0 = r6
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4b
            r7 = r0
            r0 = 0
            r8 = r0
        L10:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L48
            r0 = r6
            r1 = r8
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L4b
            r9 = r0
            r0 = r9
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L25
            goto L42
        L25:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4b
            r1 = r0
            r2 = r9
            java.lang.String r3 = "libpojavexec_awt.so"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4b
            r5 = r0
            r0 = r5
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L42
            r0 = r5
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L4b
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L4b
            goto L48
        L42:
            int r8 = r8 + 1
            goto L10
        L48:
            goto L50
        L4b:
            r5 = move-exception
            r0 = r5
            r0.printStackTrace()
        L50:
            return
    }
}
