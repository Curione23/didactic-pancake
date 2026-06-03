package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Crypt32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Crypt32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Crypt32.class */
public class Crypt32 {
    private static final org.lwjgl.system.SharedLibrary CRYPT32 = null;
    public static final int CRYPTPROTECT_UI_FORBIDDEN = 1;
    public static final int CRYPTPROTECT_LOCAL_MACHINE = 4;
    public static final int CRYPTPROTECT_AUDIT = 16;
    public static final int CRYPTPROTECT_VERIFY_PROTECTION = 64;
    public static final int CRYPTPROTECTMEMORY_SAME_PROCESS = 0;
    public static final int CRYPTPROTECTMEMORY_CROSS_PROCESS = 1;
    public static final int CRYPTPROTECTMEMORY_SAME_LOGON = 2;
    public static final int CRYPTPROTECT_PROMPT_ON_UNPROTECT = 1;
    public static final int CRYPTPROTECT_PROMPT_ON_PROTECT = 2;
    public static final int CRYPTPROTECTMEMORY_BLOCK_SIZE = 16;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Crypt32$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Crypt32$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Crypt32$Functions.class */
    public static final class Functions {
        public static final long CryptProtectData = 0;
        public static final long CryptProtectMemory = 0;
        public static final long CryptUnprotectData = 0;
        public static final long CryptUnprotectMemory = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Crypt32.access$000()
                java.lang.String r1 = "CryptProtectData"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.Crypt32.Functions.CryptProtectData = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Crypt32.access$000()
                java.lang.String r1 = "CryptProtectMemory"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.Crypt32.Functions.CryptProtectMemory = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Crypt32.access$000()
                java.lang.String r1 = "CryptUnprotectData"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.Crypt32.Functions.CryptUnprotectData = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Crypt32.access$000()
                java.lang.String r1 = "CryptUnprotectMemory"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.Crypt32.Functions.CryptUnprotectMemory = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Crypt32.CRYPT32
            return r0
    }

    protected Crypt32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nCryptProtectData(long r0, long r2, long r4, long r6, long r8, int r10, long r11, long r13);

    public static int nCryptProtectData(long r16, long r18, long r20, long r22, long r24, int r26, long r27) {
            long r0 = org.lwjgl.system.windows.Crypt32.Functions.CryptProtectData
            r29 = r0
            r0 = r16
            r1 = r18
            r2 = r20
            r3 = r22
            r4 = r24
            r5 = r26
            r6 = r27
            r7 = r29
            int r0 = nCryptProtectData(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean CryptProtectData(@org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCWSTR") java.nio.ByteBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r16, @org.lwjgl.system.NativeType("PVOID") long r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("CRYPTPROTECT_PROMPTSTRUCT *") org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r19, @org.lwjgl.system.NativeType("DWORD") int r20, @org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r15
            org.lwjgl.system.Checks.checkNT2Safe(r0)
        La:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r17
            r4 = r19
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r20
            r6 = r21
            long r6 = r6.address()
            int r0 = nCryptProtectData(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean CryptProtectData(@org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCWSTR") java.lang.CharSequence r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r16, @org.lwjgl.system.NativeType("PVOID") long r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("CRYPTPROTECT_PROMPTSTRUCT *") org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r19, @org.lwjgl.system.NativeType("DWORD") int r20, @org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r21) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r22 = r0
            r0 = r22
            int r0 = r0.getPointer()
            r23 = r0
            r0 = r22
            r1 = r15
            r2 = 1
            int r0 = r0.nUTF16Safe(r1, r2)     // Catch: java.lang.Throwable -> L51
            r0 = r15
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r22
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L51
        L21:
            r24 = r0
            r0 = r14
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L51
            r1 = r24
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L51
            r3 = r17
            r4 = r19
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)     // Catch: java.lang.Throwable -> L51
            r5 = r20
            r6 = r21
            long r6 = r6.address()     // Catch: java.lang.Throwable -> L51
            int r0 = nCryptProtectData(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r26 = r0
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r26
            return r0
        L51:
            r27 = move-exception
            r0 = r22
            r1 = r23
            r0.setPointer(r1)
            r0 = r27
            throw r0
    }

    public static native int nCryptProtectMemory(long r0, int r2, int r3, long r4);

    public static int nCryptProtectMemory(long r7, int r9, int r10) {
            long r0 = org.lwjgl.system.windows.Crypt32.Functions.CryptProtectMemory
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L11:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = nCryptProtectMemory(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean CryptProtectMemory(@org.lwjgl.system.NativeType("LPVOID") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("DWORD") int r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            int r1 = r1.remaining()
            r2 = r6
            int r0 = nCryptProtectMemory(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public static native int nCryptUnprotectData(long r0, long r2, long r4, long r6, long r8, int r10, long r11, long r13);

    public static int nCryptUnprotectData(long r16, long r18, long r20, long r22, long r24, int r26, long r27) {
            long r0 = org.lwjgl.system.windows.Crypt32.Functions.CryptUnprotectData
            r29 = r0
            r0 = r16
            r1 = r18
            r2 = r20
            r3 = r22
            r4 = r24
            r5 = r26
            r6 = r27
            r7 = r29
            int r0 = nCryptUnprotectData(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean CryptUnprotectData(@org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPWSTR *") org.lwjgl.PointerBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r16, @org.lwjgl.system.NativeType("PVOID") long r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("CRYPTPROTECT_PROMPTSTRUCT *") org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r19, @org.lwjgl.system.NativeType("DWORD") int r20, @org.lwjgl.system.NativeType("DATA_BLOB *") org.lwjgl.system.windows.DATA_BLOB r21) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r14
            long r0 = r0.address()
            r1 = r15
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r16
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r17
            r4 = r19
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r20
            r6 = r21
            long r6 = r6.address()
            int r0 = nCryptUnprotectData(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    public static native int nCryptUnprotectMemory(long r0, int r2, int r3, long r4);

    public static int nCryptUnprotectMemory(long r7, int r9, int r10) {
            long r0 = org.lwjgl.system.windows.Crypt32.Functions.CryptUnprotectMemory
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L11:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = nCryptUnprotectMemory(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean CryptUnprotectMemory(@org.lwjgl.system.NativeType("LPVOID") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("DWORD") int r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            int r1 = r1.remaining()
            r2 = r6
            int r0 = nCryptUnprotectMemory(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Crypt32.CRYPT32
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.system.windows.Crypt32> r0 = org.lwjgl.system.windows.Crypt32.class
            java.lang.String r1 = "org.lwjgl"
            java.lang.String r2 = "crypt32"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            org.lwjgl.system.windows.Crypt32.CRYPT32 = r0
            return
    }
}
