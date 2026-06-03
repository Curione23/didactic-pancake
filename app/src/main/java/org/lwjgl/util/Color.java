package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Color.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/Color.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Color.class */
public final class Color implements org.lwjgl.util.ReadableColor, java.io.Serializable, org.lwjgl.util.WritableColor {
    static final long serialVersionUID = 1;
    private byte red;
    private byte green;
    private byte blue;
    private byte alpha;

    public Color() {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 255(0xff, float:3.57E-43)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public Color(int r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 255(0xff, float:3.57E-43)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public Color(byte r7, byte r8, byte r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = -1
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public Color(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.set(r1, r2, r3, r4)
            return
    }

    public Color(byte r7, byte r8, byte r9, byte r10) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.set(r1, r2, r3, r4)
            return
    }

    public Color(org.lwjgl.util.ReadableColor r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.setColor(r1)
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void set(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = (byte) r1
            r0.red = r1
            r0 = r3
            r1 = r5
            byte r1 = (byte) r1
            r0.green = r1
            r0 = r3
            r1 = r6
            byte r1 = (byte) r1
            r0.blue = r1
            r0 = r3
            r1 = r7
            byte r1 = (byte) r1
            r0.alpha = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void set(byte r4, byte r5, byte r6, byte r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.red = r1
            r0 = r3
            r1 = r5
            r0.green = r1
            r0 = r3
            r1 = r6
            r0.blue = r1
            r0 = r3
            r1 = r7
            r0.alpha = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void set(int r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 255(0xff, float:3.57E-43)
            r0.set(r1, r2, r3, r4)
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void set(byte r7, byte r8, byte r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = -1
            r0.set(r1, r2, r3, r4)
            return
    }

    @Override // org.lwjgl.util.ReadableColor
    public int getRed() {
            r3 = this;
            r0 = r3
            byte r0 = r0.red
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public int getGreen() {
            r3 = this;
            r0 = r3
            byte r0 = r0.green
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public int getBlue() {
            r3 = this;
            r0 = r3
            byte r0 = r0.blue
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public int getAlpha() {
            r3 = this;
            r0 = r3
            byte r0 = r0.alpha
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    @Override // org.lwjgl.util.WritableColor
    public void setRed(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = (byte) r1
            r0.red = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setGreen(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = (byte) r1
            r0.green = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setBlue(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = (byte) r1
            r0.blue = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setAlpha(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = (byte) r1
            r0.alpha = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setRed(byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.red = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setGreen(byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.green = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setBlue(byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.blue = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setAlpha(byte r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.alpha = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Color ["
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.getRed()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.getGreen()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.getBlue()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.getAlpha()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L4f
            r0 = r4
            boolean r0 = r0 instanceof org.lwjgl.util.ReadableColor
            if (r0 == 0) goto L4f
            r0 = r4
            org.lwjgl.util.ReadableColor r0 = (org.lwjgl.util.ReadableColor) r0
            int r0 = r0.getRed()
            r1 = r3
            int r1 = r1.getRed()
            if (r0 != r1) goto L4f
            r0 = r4
            org.lwjgl.util.ReadableColor r0 = (org.lwjgl.util.ReadableColor) r0
            int r0 = r0.getGreen()
            r1 = r3
            int r1 = r1.getGreen()
            if (r0 != r1) goto L4f
            r0 = r4
            org.lwjgl.util.ReadableColor r0 = (org.lwjgl.util.ReadableColor) r0
            int r0 = r0.getBlue()
            r1 = r3
            int r1 = r1.getBlue()
            if (r0 != r1) goto L4f
            r0 = r4
            org.lwjgl.util.ReadableColor r0 = (org.lwjgl.util.ReadableColor) r0
            int r0 = r0.getAlpha()
            r1 = r3
            int r1 = r1.getAlpha()
            if (r0 != r1) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = r4
            byte r0 = r0.red
            r1 = 24
            int r0 = r0 << r1
            r1 = r4
            byte r1 = r1.green
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r4
            byte r1 = r1.blue
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r4
            byte r1 = r1.alpha
            r0 = r0 | r1
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public byte getAlphaByte() {
            r2 = this;
            r0 = r2
            byte r0 = r0.alpha
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public byte getBlueByte() {
            r2 = this;
            r0 = r2
            byte r0 = r0.blue
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public byte getGreenByte() {
            r2 = this;
            r0 = r2
            byte r0 = r0.green
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public byte getRedByte() {
            r2 = this;
            r0 = r2
            byte r0 = r0.red
            return r0
    }

    @Override // org.lwjgl.util.ReadableColor
    public void writeRGBA(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            byte r1 = r1.red
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.green
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.blue
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.alpha
            java.nio.ByteBuffer r0 = r0.put(r1)
            return
    }

    @Override // org.lwjgl.util.ReadableColor
    public void writeRGB(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            byte r1 = r1.red
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.green
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.blue
            java.nio.ByteBuffer r0 = r0.put(r1)
            return
    }

    @Override // org.lwjgl.util.ReadableColor
    public void writeABGR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            byte r1 = r1.alpha
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.blue
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.green
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.red
            java.nio.ByteBuffer r0 = r0.put(r1)
            return
    }

    @Override // org.lwjgl.util.ReadableColor
    public void writeARGB(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            byte r1 = r1.alpha
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.red
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.green
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.blue
            java.nio.ByteBuffer r0 = r0.put(r1)
            return
    }

    @Override // org.lwjgl.util.ReadableColor
    public void writeBGR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            byte r1 = r1.blue
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.green
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.red
            java.nio.ByteBuffer r0 = r0.put(r1)
            return
    }

    @Override // org.lwjgl.util.ReadableColor
    public void writeBGRA(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            byte r1 = r1.blue
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.green
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.red
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r3
            byte r1 = r1.alpha
            java.nio.ByteBuffer r0 = r0.put(r1)
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void readRGBA(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.red = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.green = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.blue = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.alpha = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void readRGB(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.red = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.green = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.blue = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void readARGB(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.alpha = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.red = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.green = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.blue = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void readBGRA(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.blue = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.green = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.red = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.alpha = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void readBGR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.blue = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.green = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.red = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void readABGR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.alpha = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.blue = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.green = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.get()
            r0.red = r1
            return
    }

    @Override // org.lwjgl.util.WritableColor
    public void setColor(org.lwjgl.util.ReadableColor r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            byte r1 = r1.getRedByte()
            r0.red = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.getGreenByte()
            r0.green = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.getBlueByte()
            r0.blue = r1
            r0 = r3
            r1 = r4
            byte r1 = r1.getAlphaByte()
            r0.alpha = r1
            return
    }

    public void fromHSB(float r7, float r8, float r9) {
            r6 = this;
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            r0 = r6
            r1 = r6
            r2 = r6
            r3 = r9
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            byte r3 = (byte) r3
            r4 = r3; r3 = r2; r2 = r4; 
            r3.blue = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.green = r3
            r0.red = r1
            goto L185
        L20:
            r0 = r7
            r1 = r7
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            float r1 = (float) r1
            float r0 = r0 - r1
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 * r1
            r10 = r0
            r0 = r10
            r1 = r10
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            float r1 = (float) r1
            float r0 = r0 - r1
            r11 = r0
            r0 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = r8
            float r1 = r1 - r2
            float r0 = r0 * r1
            r12 = r0
            r0 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = r8
            r3 = r11
            float r2 = r2 * r3
            float r1 = r1 - r2
            float r0 = r0 * r1
            r13 = r0
            r0 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = r8
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = r11
            float r3 = r3 - r4
            float r2 = r2 * r3
            float r1 = r1 - r2
            float r0 = r0 * r1
            r14 = r0
            r0 = r10
            int r0 = (int) r0
            switch(r0) {
                case 0: goto L80;
                case 1: goto Lac;
                case 2: goto Ld8;
                case 3: goto L104;
                case 4: goto L130;
                case 5: goto L15c;
                default: goto L185;
            }
        L80:
            r0 = r6
            r1 = r9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.red = r1
            r0 = r6
            r1 = r14
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.green = r1
            r0 = r6
            r1 = r12
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.blue = r1
            goto L185
        Lac:
            r0 = r6
            r1 = r13
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.red = r1
            r0 = r6
            r1 = r9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.green = r1
            r0 = r6
            r1 = r12
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.blue = r1
            goto L185
        Ld8:
            r0 = r6
            r1 = r12
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.red = r1
            r0 = r6
            r1 = r9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.green = r1
            r0 = r6
            r1 = r14
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.blue = r1
            goto L185
        L104:
            r0 = r6
            r1 = r12
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.red = r1
            r0 = r6
            r1 = r13
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.green = r1
            r0 = r6
            r1 = r9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.blue = r1
            goto L185
        L130:
            r0 = r6
            r1 = r14
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.red = r1
            r0 = r6
            r1 = r12
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.green = r1
            r0 = r6
            r1 = r9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.blue = r1
            goto L185
        L15c:
            r0 = r6
            r1 = r9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.red = r1
            r0 = r6
            r1 = r12
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.green = r1
            r0 = r6
            r1 = r13
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            byte r1 = (byte) r1
            r0.blue = r1
        L185:
            return
    }

    public float[] toHSB(float[] r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.getRed()
            r6 = r0
            r0 = r4
            int r0 = r0.getGreen()
            r7 = r0
            r0 = r4
            int r0 = r0.getBlue()
            r8 = r0
            r0 = r5
            if (r0 != 0) goto L18
            r0 = 3
            float[] r0 = new float[r0]
            r5 = r0
        L18:
            r0 = r6
            r1 = r7
            if (r0 > r1) goto L21
            r0 = r7
            goto L22
        L21:
            r0 = r6
        L22:
            r9 = r0
            r0 = r8
            r1 = r9
            if (r0 <= r1) goto L2f
            r0 = r8
            r9 = r0
        L2f:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L38
            r0 = r7
            goto L39
        L38:
            r0 = r6
        L39:
            r10 = r0
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto L46
            r0 = r8
            r10 = r0
        L46:
            r0 = r9
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L62
            r0 = r9
            r1 = r10
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = r9
            float r1 = (float) r1
            float r0 = r0 / r1
            r12 = r0
            goto L65
        L62:
            r0 = 0
            r12 = r0
        L65:
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L72
            r0 = 0
            r13 = r0
            goto Ldd
        L72:
            r0 = r9
            r1 = r6
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = r9
            r2 = r10
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            r14 = r0
            r0 = r9
            r1 = r7
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = r9
            r2 = r10
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            r15 = r0
            r0 = r9
            r1 = r8
            int r0 = r0 - r1
            float r0 = (float) r0
            r1 = r9
            r2 = r10
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            r16 = r0
            r0 = r6
            r1 = r9
            if (r0 != r1) goto Lad
            r0 = r16
            r1 = r15
            float r0 = r0 - r1
            r13 = r0
            goto Lc9
        Lad:
            r0 = r7
            r1 = r9
            if (r0 != r1) goto Lbf
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r14
            float r0 = r0 + r1
            r1 = r16
            float r0 = r0 - r1
            r13 = r0
            goto Lc9
        Lbf:
            r0 = 1082130432(0x40800000, float:4.0)
            r1 = r15
            float r0 = r0 + r1
            r1 = r14
            float r0 = r0 - r1
            r13 = r0
        Lc9:
            r0 = r13
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 / r1
            r13 = r0
            r0 = r13
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Ldd
            r0 = r13
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            r13 = r0
        Ldd:
            r0 = r5
            r1 = 0
            r2 = r13
            r0[r1] = r2
            r0 = r5
            r1 = 1
            r2 = r12
            r0[r1] = r2
            r0 = r5
            r1 = 2
            r2 = r11
            r0[r1] = r2
            r0 = r5
            return r0
    }
}
