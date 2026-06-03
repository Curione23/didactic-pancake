package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLChecks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLChecks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLChecks.class */
final class GLChecks {
    private GLChecks() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static int typeToBytes(int r5) {
            r0 = r5
            switch(r0) {
                case 5120: goto L50;
                case 5121: goto L50;
                case 5122: goto L52;
                case 5123: goto L52;
                case 5124: goto L56;
                case 5125: goto L56;
                case 5126: goto L56;
                case 5127: goto L52;
                case 5128: goto L54;
                case 5129: goto L56;
                case 5130: goto L58;
                case 5131: goto L52;
                case 5132: goto L56;
                case 5133: goto L5b;
                case 5134: goto L58;
                case 5135: goto L58;
                default: goto L5b;
            }
        L50:
            r0 = 1
            return r0
        L52:
            r0 = 2
            return r0
        L54:
            r0 = 3
            return r0
        L56:
            r0 = 4
            return r0
        L58:
            r0 = 8
            return r0
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unsupported OpenGL type"
            r3 = r5
            java.lang.String r2 = org.lwjgl.system.APIUtil.apiUnknownToken(r2, r3)
            r1.<init>(r2)
            throw r0
    }

    static int typeToByteShift(int r5) {
            r0 = r5
            switch(r0) {
                case 5120: goto L50;
                case 5121: goto L50;
                case 5122: goto L52;
                case 5123: goto L52;
                case 5124: goto L54;
                case 5125: goto L54;
                case 5126: goto L54;
                case 5127: goto L52;
                case 5128: goto L58;
                case 5129: goto L54;
                case 5130: goto L56;
                case 5131: goto L52;
                case 5132: goto L54;
                case 5133: goto L58;
                case 5134: goto L56;
                case 5135: goto L56;
                default: goto L58;
            }
        L50:
            r0 = 0
            return r0
        L52:
            r0 = 1
            return r0
        L54:
            r0 = 2
            return r0
        L56:
            r0 = 3
            return r0
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unsupported OpenGL type"
            r3 = r5
            java.lang.String r2 = org.lwjgl.system.APIUtil.apiUnknownToken(r2, r3)
            r1.<init>(r2)
            throw r0
    }

    static int getTexLevelParameteri(int r5, int r6, int r7, int r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilities()
            r9 = r0
            r0 = r9
            boolean r0 = r0.OpenGL45
            if (r0 == 0) goto L14
            r0 = r5
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.opengl.GL45.glGetTextureLevelParameteri(r0, r1, r2)
            return r0
        L14:
            r0 = r9
            boolean r0 = r0.GL_ARB_direct_state_access
            if (r0 == 0) goto L23
            r0 = r5
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.opengl.ARBDirectStateAccess.glGetTextureLevelParameteri(r0, r1, r2)
            return r0
        L23:
            r0 = r9
            boolean r0 = r0.GL_EXT_direct_state_access
            if (r0 == 0) goto L33
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = org.lwjgl.opengl.EXTDirectStateAccess.glGetTextureLevelParameteriEXT(r0, r1, r2, r3)
            return r0
        L33:
            r0 = r6
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.opengl.GL41.glGetTexLevelParameteri(r0, r1, r2)
            return r0
    }
}
