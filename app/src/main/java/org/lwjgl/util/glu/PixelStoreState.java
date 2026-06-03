package org.lwjgl.util.glu;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/PixelStoreState.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/PixelStoreState.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/glu/PixelStoreState.class */
class PixelStoreState extends org.lwjgl.util.glu.Util {
    public int unpackRowLength;
    public int unpackAlignment;
    public int unpackSkipRows;
    public int unpackSkipPixels;
    public int packRowLength;
    public int packAlignment;
    public int packSkipRows;
    public int packSkipPixels;

    PixelStoreState() {
            r2 = this;
            r0 = r2
            r0.<init>()
            r0 = r2
            r0.load()
            return
    }

    public void load() {
            r3 = this;
            r0 = r3
            r1 = 3314(0xcf2, float:4.644E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.unpackRowLength = r1
            r0 = r3
            r1 = 3317(0xcf5, float:4.648E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.unpackAlignment = r1
            r0 = r3
            r1 = 3315(0xcf3, float:4.645E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.unpackSkipRows = r1
            r0 = r3
            r1 = 3316(0xcf4, float:4.647E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.unpackSkipPixels = r1
            r0 = r3
            r1 = 3330(0xd02, float:4.666E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.packRowLength = r1
            r0 = r3
            r1 = 3333(0xd05, float:4.67E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.packAlignment = r1
            r0 = r3
            r1 = 3331(0xd03, float:4.668E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.packSkipRows = r1
            r0 = r3
            r1 = 3332(0xd04, float:4.669E-42)
            int r1 = org.lwjgl.opengl.GL11.glGetInteger(r1)
            r0.packSkipPixels = r1
            return
    }

    public void save() {
            r3 = this;
            r0 = 3314(0xcf2, float:4.644E-42)
            r1 = r3
            int r1 = r1.unpackRowLength
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3317(0xcf5, float:4.648E-42)
            r1 = r3
            int r1 = r1.unpackAlignment
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3315(0xcf3, float:4.645E-42)
            r1 = r3
            int r1 = r1.unpackSkipRows
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3316(0xcf4, float:4.647E-42)
            r1 = r3
            int r1 = r1.unpackSkipPixels
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3330(0xd02, float:4.666E-42)
            r1 = r3
            int r1 = r1.packRowLength
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3333(0xd05, float:4.67E-42)
            r1 = r3
            int r1 = r1.packAlignment
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3331(0xd03, float:4.668E-42)
            r1 = r3
            int r1 = r1.packSkipRows
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            r0 = 3332(0xd04, float:4.669E-42)
            r1 = r3
            int r1 = r1.packSkipPixels
            org.lwjgl.opengl.GL11.glPixelStorei(r0, r1)
            return
    }
}
