package com.github.caciocavallosilano.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsConfiguration.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsConfiguration.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCGraphicsConfiguration.class */
public class CTCGraphicsConfiguration extends java.awt.GraphicsConfiguration {
    private final java.awt.image.ColorModel model;
    private final java.awt.image.Raster raster;
    private com.github.caciocavallosilano.cacio.ctc.CTCGraphicsDevice device;

    CTCGraphicsConfiguration(com.github.caciocavallosilano.cacio.ctc.CTCGraphicsDevice r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            java.awt.image.BufferedImage r0 = new java.awt.image.BufferedImage
            r1 = r0
            java.awt.Dimension r2 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            int r2 = r2.width
            java.awt.Dimension r3 = com.github.caciocavallosilano.cacio.peer.managed.FullScreenWindowFactory.getScreenDimension()
            int r3 = r3.height
            r4 = 2
            r1.<init>(r2, r3, r4)
            r8 = r0
            r0 = r6
            r1 = r7
            r0.device = r1
            r0 = r6
            r1 = r8
            java.awt.image.ColorModel r1 = r1.getColorModel()
            r0.model = r1
            r0 = r6
            r1 = r8
            java.awt.image.WritableRaster r1 = r1.getRaster()
            r2 = 1
            r3 = 1
            java.awt.image.WritableRaster r1 = r1.createCompatibleWritableRaster(r2, r3)
            r0.raster = r1
            return
    }

    public java.awt.GraphicsDevice getDevice() {
            r2 = this;
            r0 = r2
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsDevice r0 = r0.device
            return r0
    }

    public java.awt.image.ColorModel getColorModel() {
            r2 = this;
            java.awt.image.ColorModel r0 = java.awt.image.ColorModel.getRGBdefault()
            return r0
    }

    public java.awt.image.ColorModel getColorModel(int r3) {
            r2 = this;
            java.awt.image.ColorModel r0 = java.awt.image.ColorModel.getRGBdefault()
            return r0
    }

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

    public java.awt.image.BufferedImage createCompatibleImage(int r8, int r9) {
            r7 = this;
            r0 = r7
            java.awt.image.Raster r0 = r0.raster
            r1 = r8
            r2 = r9
            java.awt.image.WritableRaster r0 = r0.createCompatibleWritableRaster(r1, r2)
            r10 = r0
            java.awt.image.BufferedImage r0 = new java.awt.image.BufferedImage
            r1 = r0
            r2 = r7
            java.awt.image.ColorModel r2 = r2.model
            r3 = r10
            r4 = r7
            java.awt.image.ColorModel r4 = r4.model
            boolean r4 = r4.isAlphaPremultiplied()
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public java.awt.geom.AffineTransform getDefaultTransform() {
            r5 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.awt.geom.AffineTransform r0 = java.awt.geom.AffineTransform.getScaleInstance(r0, r1)
            return r0
    }

    public java.awt.geom.AffineTransform getNormalizingTransform() {
            r3 = this;
            java.awt.geom.AffineTransform r0 = new java.awt.geom.AffineTransform
            r1 = r0
            r1.<init>()
            return r0
    }
}
