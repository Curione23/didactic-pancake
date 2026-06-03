package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Display.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/Display.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Display.class */
public final class Display {
    private static final boolean DEBUG = false;
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Display$1FieldAccessor.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/Display$1FieldAccessor.class
     */
    /* JADX INFO: renamed from: org.lwjgl.util.Display$1FieldAccessor, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Display$1FieldAccessor.class */
    class C1FieldAccessor {
        final java.lang.String fieldName;
        final int order;
        final int preferred;
        final boolean usePreferred;

        C1FieldAccessor(java.lang.String r4, int r5, int r6, boolean r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.fieldName = r1
                r0 = r3
                r1 = r5
                r0.order = r1
                r0 = r3
                r1 = r6
                r0.preferred = r1
                r0 = r3
                r1 = r7
                r0.usePreferred = r1
                return
        }

        int getInt(org.lwjgl.opengl.DisplayMode r6) {
                r5 = this;
                java.lang.String r0 = "width"
                r1 = r5
                java.lang.String r1 = r1.fieldName
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L11
                r0 = r6
                int r0 = r0.getWidth()
                return r0
            L11:
                java.lang.String r0 = "height"
                r1 = r5
                java.lang.String r1 = r1.fieldName
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L22
                r0 = r6
                int r0 = r0.getHeight()
                return r0
            L22:
                java.lang.String r0 = "freq"
                r1 = r5
                java.lang.String r1 = r1.fieldName
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L33
                r0 = r6
                int r0 = r0.getFrequency()
                return r0
            L33:
                java.lang.String r0 = "bpp"
                r1 = r5
                java.lang.String r1 = r1.fieldName
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L44
                r0 = r6
                int r0 = r0.getBitsPerPixel()
                return r0
            L44:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "Unknown field "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r5
                java.lang.String r3 = r3.fieldName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }
    }


    public Display() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.lwjgl.opengl.DisplayMode[] getAvailableDisplayModes(int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) throws org.lwjgl.LWJGLException {
            org.lwjgl.opengl.DisplayMode[] r0 = org.lwjgl.opengl.Display.getAvailableDisplayModes()
            r13 = r0
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 != 0) goto Le
            goto L3e
        Le:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Available screen modes:"
            r0.println(r1)
            r0 = r13
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r16 = r0
        L22:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L3e
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r17
            r0.println(r1)
            int r16 = r16 + 1
            goto L22
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r13
            int r2 = r2.length
            r1.<init>(r2)
            r14 = r0
            r0 = 0
            r15 = r0
        L4d:
            r0 = r15
            r1 = r13
            int r1 = r1.length
            if (r0 >= r1) goto L14e
            boolean r0 = org.lwjgl.util.Display.$assertionsDisabled
            if (r0 != 0) goto L8a
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            if (r0 != 0) goto L8a
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = ""
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r15
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r13
            int r3 = r3.length
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L8a:
            r0 = r5
            r1 = -1
            if (r0 == r1) goto L9e
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getWidth()
            r1 = r5
            if (r0 >= r1) goto L9e
            goto L148
        L9e:
            r0 = r7
            r1 = -1
            if (r0 == r1) goto Lb2
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getWidth()
            r1 = r7
            if (r0 <= r1) goto Lb2
            goto L148
        Lb2:
            r0 = r6
            r1 = -1
            if (r0 == r1) goto Lc6
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getHeight()
            r1 = r6
            if (r0 >= r1) goto Lc6
            goto L148
        Lc6:
            r0 = r8
            r1 = -1
            if (r0 == r1) goto Lda
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getHeight()
            r1 = r8
            if (r0 <= r1) goto Lda
            goto L148
        Lda:
            r0 = r9
            r1 = -1
            if (r0 == r1) goto Lf0
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getBitsPerPixel()
            r1 = r9
            if (r0 >= r1) goto Lf0
            goto L148
        Lf0:
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L106
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getBitsPerPixel()
            r1 = r10
            if (r0 <= r1) goto L106
            goto L148
        L106:
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getFrequency()
            if (r0 == 0) goto L13d
            r0 = r11
            r1 = -1
            if (r0 == r1) goto L127
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getFrequency()
            r1 = r11
            if (r0 >= r1) goto L127
            goto L148
        L127:
            r0 = r12
            r1 = -1
            if (r0 == r1) goto L13d
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            int r0 = r0.getFrequency()
            r1 = r12
            if (r0 <= r1) goto L13d
            goto L148
        L13d:
            r0 = r14
            r1 = r13
            r2 = r15
            r1 = r1[r2]
            boolean r0 = r0.add(r1)
        L148:
            int r15 = r15 + 1
            goto L4d
        L14e:
            r0 = r14
            int r0 = r0.size()
            org.lwjgl.opengl.DisplayMode[] r0 = new org.lwjgl.opengl.DisplayMode[r0]
            r15 = r0
            r0 = r14
            r1 = r15
            java.lang.Object[] r0 = r0.toArray(r1)
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 == 0) goto L166
        L166:
            r0 = r15
            return r0
    }

    public static org.lwjgl.opengl.DisplayMode setDisplayMode(org.lwjgl.opengl.DisplayMode[] r5, java.lang.String[] r6) throws java.lang.Exception {
            r0 = r5
            org.lwjgl.util.Display$1Sorter r1 = new org.lwjgl.util.Display$1Sorter
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            java.util.Arrays.sort(r0, r1)
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 != 0) goto L15
            goto L3f
        L15:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Sorted display modes:"
            r0.println(r1)
            r0 = r5
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L25:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L3f
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            java.io.PrintStream r0 = java.lang.System.out
            r1 = r10
            r0.println(r1)
            int r9 = r9 + 1
            goto L25
        L3f:
            r0 = r5
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L47:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto Lae
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L5c
            goto L76
        L5c:
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e
            r2 = r1
            r2.<init>()     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = "Attempting to set displaymode: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L7e
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L7e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7e
            r0.println(r1)     // Catch: java.lang.Exception -> L7e
        L76:
            r0 = r10
            org.lwjgl.opengl.Display.setDisplayMode(r0)     // Catch: java.lang.Exception -> L7e
            r0 = r10
            return r0
        L7e:
            r11 = move-exception
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 != 0) goto L89
            goto La8
        L89:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Failed to set display mode to "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r11
            r0.printStackTrace()
        La8:
            int r9 = r9 + 1
            goto L47
        Lae:
            java.lang.Exception r0 = new java.lang.Exception
            r1 = r0
            java.lang.String r2 = "Failed to set display mode."
            r1.<init>(r2)
            throw r0
    }

    static {
            java.lang.Class<org.lwjgl.util.Display> r0 = org.lwjgl.util.Display.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.lwjgl.util.Display.$assertionsDisabled = r0
            return
    }
}
