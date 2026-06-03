package org.lwjgl.util.tinyfd;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/tinyfd/TinyFileDialogs.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/tinyfd/TinyFileDialogs.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/tinyfd/TinyFileDialogs.class */
public class TinyFileDialogs {
    public static final java.lang.String tinyfd_version = "tinyfd_version";
    public static final java.lang.String tinyfd_needs = "tinyfd_needs";
    public static final java.lang.String tinyfd_response = "tinyfd_response";
    public static final java.lang.String tinyfd_verbose = "tinyfd_verbose";
    public static final java.lang.String tinyfd_silent = "tinyfd_silent";
    public static final java.lang.String tinyfd_allowCursesDialogs = "tinyfd_allowCursesDialogs";
    public static final java.lang.String tinyfd_forceConsole = "tinyfd_forceConsole";
    public static final java.lang.String tinyfd_assumeGraphicDisplay = "tinyfd_assumeGraphicDisplay";
    public static final java.lang.String tinyfd_winUtf8 = "tinyfd_winUtf8";

    protected TinyFileDialogs() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long ntinyfd_getGlobalChar(long r0);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_getGlobalChar(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = ntinyfd_getGlobalChar(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_getGlobalChar(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2a
            r7 = r0
            r0 = r7
            long r0 = ntinyfd_getGlobalChar(r0)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r9
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)     // Catch: java.lang.Throwable -> L2a
            r11 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2a:
            r12 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native int ntinyfd_getGlobalInt(long r0);

    public static int tinyfd_getGlobalInt(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = ntinyfd_getGlobalInt(r0)
            return r0
    }

    public static int tinyfd_getGlobalInt(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4) {
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
            int r0 = ntinyfd_getGlobalInt(r0)     // Catch: java.lang.Throwable -> L23
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

    public static native int ntinyfd_setGlobalInt(long r0, int r2);

    public static int tinyfd_setGlobalInt(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r4, int r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r4
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            int r0 = ntinyfd_setGlobalInt(r0, r1)
            return r0
    }

    public static int tinyfd_setGlobalInt(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r4, int r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r4
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r8
            r1 = r5
            int r0 = ntinyfd_setGlobalInt(r0, r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L26:
            r11 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void tinyfd_beep();

    public static native int ntinyfd_notifyPopup(long r0, long r2, long r4);

    public static int tinyfd_notifyPopup(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r8
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNT1(r0)
        L12:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = ntinyfd_notifyPopup(r0, r1, r2)
            return r0
    }

    public static int tinyfd_notifyPopup(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L55
            r0 = r7
            if (r0 != 0) goto L19
            r0 = 0
            goto L1d
        L19:
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L55
        L1d:
            r12 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L55
            r0 = r8
            if (r0 != 0) goto L2e
            r0 = 0
            goto L32
        L2e:
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L55
        L32:
            r14 = r0
            r0 = r10
            r1 = r9
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L55
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L55
            r16 = r0
            r0 = r12
            r1 = r14
            r2 = r16
            int r0 = ntinyfd_notifyPopup(r0, r1, r2)     // Catch: java.lang.Throwable -> L55
            r18 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r18
            return r0
        L55:
            r19 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r19
            throw r0
    }

    public static native int ntinyfd_messageBox(long r0, long r2, long r4, long r6, int r8);

    @org.lwjgl.system.NativeType("int")
    public static boolean tinyfd_messageBox(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("int") boolean r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r10
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r13
            org.lwjgl.system.Checks.checkNT1(r0)
        L16:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r14
            if (r4 == 0) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            int r0 = ntinyfd_messageBox(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean tinyfd_messageBox(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13, @org.lwjgl.system.NativeType("int") boolean r14) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L81
            r0 = r10
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L81
        L21:
            r17 = r0
            r0 = r15
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L81
            r0 = r11
            if (r0 != 0) goto L33
            r0 = 0
            goto L38
        L33:
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L81
        L38:
            r19 = r0
            r0 = r15
            r1 = r12
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L81
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L81
            r21 = r0
            r0 = r15
            r1 = r13
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L81
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L81
            r23 = r0
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r23
            r4 = r14
            if (r4 == 0) goto L69
            r4 = 1
            goto L6a
        L69:
            r4 = 0
        L6a:
            int r0 = ntinyfd_messageBox(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L74
            r0 = 1
            goto L75
        L74:
            r0 = 0
        L75:
            r25 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r25
            return r0
        L81:
            r26 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r26
            throw r0
    }

    public static native long ntinyfd_inputBox(long r0, long r2, long r4);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_inputBox(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r8
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        L12:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            long r0 = ntinyfd_inputBox(r0, r1, r2)
            r10 = r0
            r0 = r10
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_inputBox(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L64
            r0 = r7
            if (r0 != 0) goto L19
            r0 = 0
            goto L1d
        L19:
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L64
        L1d:
            r12 = r0
            r0 = r10
            r1 = r8
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L64
            r0 = r8
            if (r0 != 0) goto L2e
            r0 = 0
            goto L32
        L2e:
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L64
        L32:
            r14 = r0
            r0 = r10
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L64
            r0 = r9
            if (r0 != 0) goto L43
            r0 = 0
            goto L47
        L43:
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L64
        L47:
            r16 = r0
            r0 = r12
            r1 = r14
            r2 = r16
            long r0 = ntinyfd_inputBox(r0, r1, r2)     // Catch: java.lang.Throwable -> L64
            r18 = r0
            r0 = r18
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L64
            r20 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r20
            return r0
        L64:
            r21 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }

    public static native long ntinyfd_saveFileDialog(long r0, long r2, int r4, long r5, long r7);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_saveFileDialog(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r13
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        L12:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r12
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            long r0 = ntinyfd_saveFileDialog(r0, r1, r2, r3, r4)
            r14 = r0
            r0 = r14
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_saveFileDialog(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r13) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r14 = r0
            r0 = r14
            int r0 = r0.getPointer()
            r15 = r0
            r0 = r14
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L75
            r0 = r10
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L75
        L21:
            r16 = r0
            r0 = r14
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L75
            r0 = r11
            if (r0 != 0) goto L33
            r0 = 0
            goto L38
        L33:
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L75
        L38:
            r18 = r0
            r0 = r14
            r1 = r13
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L75
            r0 = r13
            if (r0 != 0) goto L4a
            r0 = 0
            goto L4f
        L4a:
            r0 = r14
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L75
        L4f:
            r20 = r0
            r0 = r16
            r1 = r18
            r2 = r12
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)     // Catch: java.lang.Throwable -> L75
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L75
            r4 = r20
            long r0 = ntinyfd_saveFileDialog(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L75
            r22 = r0
            r0 = r22
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L75
            r24 = r0
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r24
            return r0
        L75:
            r25 = move-exception
            r0 = r14
            r1 = r15
            r0.setPointer(r1)
            r0 = r25
            throw r0
    }

    public static native long ntinyfd_openFileDialog(long r0, long r2, int r4, long r5, long r7, int r9);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_openFileDialog(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r14, @org.lwjgl.system.NativeType("int") boolean r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r14
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        L12:
            r0 = r11
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r13
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r15
            if (r5 == 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            long r0 = ntinyfd_openFileDialog(r0, r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_openFileDialog(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r14, @org.lwjgl.system.NativeType("int") boolean r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r16 = r0
            r0 = r16
            int r0 = r0.getPointer()
            r17 = r0
            r0 = r16
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L7f
            r0 = r11
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L7f
        L21:
            r18 = r0
            r0 = r16
            r1 = r12
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L7f
            r0 = r12
            if (r0 != 0) goto L33
            r0 = 0
            goto L38
        L33:
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L7f
        L38:
            r20 = r0
            r0 = r16
            r1 = r14
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L7f
            r0 = r14
            if (r0 != 0) goto L4a
            r0 = 0
            goto L4f
        L4a:
            r0 = r16
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L7f
        L4f:
            r22 = r0
            r0 = r18
            r1 = r20
            r2 = r13
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)     // Catch: java.lang.Throwable -> L7f
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L7f
            r4 = r22
            r5 = r15
            if (r5 == 0) goto L68
            r5 = 1
            goto L69
        L68:
            r5 = 0
        L69:
            long r0 = ntinyfd_openFileDialog(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L7f
            r24 = r0
            r0 = r24
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L7f
            r26 = r0
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r26
            return r0
        L7f:
            r27 = move-exception
            r0 = r16
            r1 = r17
            r0.setPointer(r1)
            r0 = r27
            throw r0
    }

    public static native long ntinyfd_selectFolderDialog(long r0, long r2);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_selectFolderDialog(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r5
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r6
            org.lwjgl.system.Checks.checkNT1(r0)
        Le:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = ntinyfd_selectFolderDialog(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_selectFolderDialog(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r5
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r5
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
        L1c:
            r9 = r0
            r0 = r7
            r1 = r6
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L43
            r0 = r7
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L43
            r11 = r0
            r0 = r9
            r1 = r11
            long r0 = ntinyfd_selectFolderDialog(r0, r1)     // Catch: java.lang.Throwable -> L43
            r13 = r0
            r0 = r13
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L43
            r15 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r15
            return r0
        L43:
            r16 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static native long ntinyfd_colorChooser(long r0, long r2, long r4, long r6);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_colorChooser(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r9
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1Safe(r0)
            r0 = r11
            r1 = 3
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            long r0 = ntinyfd_colorChooser(r0, r1, r2, r3)
            r13 = r0
            r0 = r13
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String tinyfd_colorChooser(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            r1 = 3
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r9
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r9
            if (r0 != 0) goto L2c
            r0 = 0
            goto L31
        L2c:
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L6c
        L31:
            r15 = r0
            r0 = r13
            r1 = r10
            r2 = 1
            int r0 = r0.nASCIISafe(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r0 = r10
            if (r0 != 0) goto L43
            r0 = 0
            goto L48
        L43:
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L6c
        L48:
            r17 = r0
            r0 = r15
            r1 = r17
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L6c
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L6c
            long r0 = ntinyfd_colorChooser(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L6c
            r19 = r0
            r0 = r19
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L6c
            r21 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r21
            return r0
        L6c:
            r22 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    static {
            void r0 = java.lang.System::load
            void r1 = java.lang.System::loadLibrary
            java.lang.Class<org.lwjgl.util.tinyfd.TinyFileDialogs> r2 = org.lwjgl.util.tinyfd.TinyFileDialogs.class
            java.lang.String r3 = "org.lwjgl.tinyfd"
            java.lang.String r4 = "lwjgl_tinyfd"
            java.lang.String r4 = org.lwjgl.system.Platform.mapLibraryNameBundled(r4)
            org.lwjgl.system.Library.loadSystem(r0, r1, r2, r3, r4)
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS
            if (r0 != r1) goto L26
            java.lang.String r0 = "tinyfd_winUtf8"
            r1 = 1
            int r0 = tinyfd_setGlobalInt(r0, r1)
        L26:
            return
    }
}
