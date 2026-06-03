package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc.class */
public abstract class FT_Outline_LineToFunc extends org.lwjgl.system.Callback implements org.lwjgl.util.freetype.FT_Outline_LineToFuncI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline_LineToFunc$Container.class */
    private static final class Container extends org.lwjgl.util.freetype.FT_Outline_LineToFunc {
        private final org.lwjgl.util.freetype.FT_Outline_LineToFuncI delegate;

        Container(long r5, org.lwjgl.util.freetype.FT_Outline_LineToFuncI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.util.freetype.FT_Outline_LineToFuncI
        public int invoke(long r7, long r9) {
                r6 = this;
                r0 = r6
                org.lwjgl.util.freetype.FT_Outline_LineToFuncI r0 = r0.delegate
                r1 = r7
                r2 = r9
                int r0 = r0.invoke(r1, r2)
                return r0
        }
    }

    public static org.lwjgl.util.freetype.FT_Outline_LineToFunc create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.util.freetype.FT_Outline_LineToFuncI r0 = (org.lwjgl.util.freetype.FT_Outline_LineToFuncI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.util.freetype.FT_Outline_LineToFunc
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.util.freetype.FT_Outline_LineToFunc r0 = (org.lwjgl.util.freetype.FT_Outline_LineToFunc) r0
            goto L1f
        L16:
            org.lwjgl.util.freetype.FT_Outline_LineToFunc$Container r0 = new org.lwjgl.util.freetype.FT_Outline_LineToFunc$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Outline_LineToFunc createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.util.freetype.FT_Outline_LineToFunc r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline_LineToFunc create(org.lwjgl.util.freetype.FT_Outline_LineToFuncI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.util.freetype.FT_Outline_LineToFunc
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.util.freetype.FT_Outline_LineToFunc r0 = (org.lwjgl.util.freetype.FT_Outline_LineToFunc) r0
            goto L1c
        Le:
            org.lwjgl.util.freetype.FT_Outline_LineToFunc$Container r0 = new org.lwjgl.util.freetype.FT_Outline_LineToFunc$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected FT_Outline_LineToFunc() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.util.freetype.FT_Outline_LineToFunc.CIF
            r0.<init>(r1)
            return
    }

    FT_Outline_LineToFunc(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
