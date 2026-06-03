package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Quadric.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Quadric.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/Quadric.class */
public class Quadric {
    protected int drawStyle;
    protected int orientation;
    protected boolean textureFlag;
    protected int normals;

    public Quadric() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 100012(0x186ac, float:1.40147E-40)
            r0.drawStyle = r1
            r0 = r3
            r1 = 100020(0x186b4, float:1.40158E-40)
            r0.orientation = r1
            r0 = r3
            r1 = 0
            r0.textureFlag = r1
            r0 = r3
            r1 = 100000(0x186a0, float:1.4013E-40)
            r0.normals = r1
            return
    }

    protected void normal3f(float r5, float r6, float r7) {
            r4 = this;
            r0 = r5
            r1 = r5
            float r0 = r0 * r1
            r1 = r6
            r2 = r6
            float r1 = r1 * r2
            float r0 = r0 + r1
            r1 = r7
            r2 = r7
            float r1 = r1 * r2
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r8 = r0
            r0 = r8
            r1 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L29
            r0 = r5
            r1 = r8
            float r0 = r0 / r1
            r5 = r0
            r0 = r6
            r1 = r8
            float r0 = r0 / r1
            r6 = r0
            r0 = r7
            r1 = r8
            float r0 = r0 / r1
            r7 = r0
        L29:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL11.glNormal3f(r0, r1, r2)
            return
    }

    public void setDrawStyle(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.drawStyle = r1
            return
    }

    public void setNormals(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.normals = r1
            return
    }

    public void setOrientation(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.orientation = r1
            return
    }

    public void setTextureFlag(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.textureFlag = r1
            return
    }

    public int getDrawStyle() {
            r2 = this;
            r0 = r2
            int r0 = r0.drawStyle
            return r0
    }

    public int getNormals() {
            r2 = this;
            r0 = r2
            int r0 = r0.normals
            return r0
    }

    public int getOrientation() {
            r2 = this;
            r0 = r2
            int r0 = r0.orientation
            return r0
    }

    public boolean getTextureFlag() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.textureFlag
            return r0
    }

    protected void TXTR_COORD(float r4, float r5) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.textureFlag
            if (r0 == 0) goto Lc
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL11.glTexCoord2f(r0, r1)
        Lc:
            return
    }

    protected float sin(float r4) {
            r3 = this;
            r0 = r4
            double r0 = (double) r0
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            return r0
    }

    protected float cos(float r4) {
            r3 = this;
            r0 = r4
            double r0 = (double) r0
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            return r0
    }
}
