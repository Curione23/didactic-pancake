package net.java.openjdk.cacio.ctc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsConfiguration.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsConfiguration.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCGraphicsConfiguration.class */
public class CTCGraphicsConfiguration extends java.awt.GraphicsConfiguration {
    private net.java.openjdk.cacio.ctc.CTCGraphicsDevice device;

    CTCGraphicsConfiguration(net.java.openjdk.cacio.ctc.CTCGraphicsDevice r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.device = r1
            return
    }

    public java.awt.GraphicsDevice getDevice() {
            r2 = this;
            r0 = r2
            net.java.openjdk.cacio.ctc.CTCGraphicsDevice r0 = r0.device
            return r0
    }

    public java.awt.image.ColorModel getColorModel() {
            r2 = this;
            java.awt.image.ColorModel r0 = java.awt.image.ColorModel.getRGBdefault()
            return r0
    }

    public java.awt.image.ColorModel getColorModel(int r9) {
            r8 = this;
            r0 = r9
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L2d;
                case 3: goto L40;
                default: goto L44;
            }
        L1c:
            java.awt.image.DirectColorModel r0 = new java.awt.image.DirectColorModel
            r1 = r0
            r2 = 24
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = 65280(0xff00, float:9.1477E-41)
            r5 = 255(0xff, float:3.57E-43)
            r1.<init>(r2, r3, r4, r5)
            return r0
        L2d:
            java.awt.image.DirectColorModel r0 = new java.awt.image.DirectColorModel
            r1 = r0
            r2 = 25
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = 65280(0xff00, float:9.1477E-41)
            r5 = 255(0xff, float:3.57E-43)
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L40:
            java.awt.image.ColorModel r0 = java.awt.image.ColorModel.getRGBdefault()
            return r0
        L44:
            r0 = 0
            return r0
    }

    public java.awt.geom.AffineTransform getDefaultTransform() {
            r3 = this;
            java.awt.geom.AffineTransform r0 = new java.awt.geom.AffineTransform
            r1 = r0
            r1.<init>()
            return r0
    }

    public java.awt.geom.AffineTransform getNormalizingTransform() {
            r3 = this;
            java.awt.geom.AffineTransform r0 = new java.awt.geom.AffineTransform
            r1 = r0
            r1.<init>()
            return r0
    }

    public java.awt.Rectangle getBounds() {
            r7 = this;
            java.awt.Dimension r0 = sun.awt.peer.cacio.managed.FullScreenWindowFactory.getScreenDimension()
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

    public final boolean isTranslucencyCapable() {
            r2 = this;
            r0 = 1
            return r0
    }
}
