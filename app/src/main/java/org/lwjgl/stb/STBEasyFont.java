package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBEasyFont.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBEasyFont.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBEasyFont.class */
public class STBEasyFont {
    protected STBEasyFont() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nstb_easy_font_width(long r0);

    public static int stb_easy_font_width(@org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nstb_easy_font_width(r0)
            return r0
    }

    public static int stb_easy_font_width(@org.lwjgl.system.NativeType("char *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            int r0 = nstb_easy_font_width(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static native int nstb_easy_font_height(long r0);

    public static int stb_easy_font_height(@org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nstb_easy_font_height(r0)
            return r0
    }

    public static int stb_easy_font_height(@org.lwjgl.system.NativeType("char *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            int r0 = nstb_easy_font_height(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static native int nstb_easy_font_print(float r0, float r1, long r2, long r4, long r6, int r8);

    public static int stb_easy_font_print(float r10, float r11, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r13
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lf:
            r0 = r10
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r14
            int r5 = r5.remaining()
            int r0 = nstb_easy_font_print(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int stb_easy_font_print(float r10, float r11, @org.lwjgl.system.NativeType("char *") java.lang.CharSequence r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            r1 = 4
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r12
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L47
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L47
            r17 = r0
            r0 = r10
            r1 = r11
            r2 = r17
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L47
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L47
            r5 = r14
            int r5 = r5.remaining()     // Catch: java.lang.Throwable -> L47
            int r0 = nstb_easy_font_print(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L47
            r19 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            return r0
        L47:
            r20 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static native void stb_easy_font_spacing(float r0);

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
