package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/CRYPTPROTECT_PROMPTSTRUCT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/CRYPTPROTECT_PROMPTSTRUCT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/CRYPTPROTECT_PROMPTSTRUCT.class */
public class CRYPTPROTECT_PROMPTSTRUCT extends org.lwjgl.system.Struct<org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CBSIZE = 0;
    public static final int DWPROMPTFLAGS = 0;
    public static final int HWNDAPP = 0;
    public static final int SZPROMPT = 0;

    protected CRYPTPROTECT_PROMPTSTRUCT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public CRYPTPROTECT_PROMPTSTRUCT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int cbSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncbSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwPromptFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwPromptFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HWND")
    public long hwndApp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhwndApp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LPCWSTR")
    public java.nio.ByteBuffer szPrompt() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nszPrompt(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LPCWSTR")
    public java.lang.String szPromptString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nszPromptString(r0)
            return r0
    }

    public org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT cbSize(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncbSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT cbSize$Default() {
            r3 = this;
            r0 = r3
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = r0.cbSize(r1)
            return r0
    }

    public org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT dwPromptFlags(@org.lwjgl.system.NativeType("DWORD") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndwPromptFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT hwndApp(@org.lwjgl.system.NativeType("HWND") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nhwndApp(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT szPrompt(@org.lwjgl.system.NativeType("LPCWSTR") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nszPrompt(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT set(int r5, int r6, long r7, java.nio.ByteBuffer r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = r0.cbSize(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = r0.dwPromptFlags(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = r0.hwndApp(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = r0.szPrompt(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT set(org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT malloc() {
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            int r2 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT calloc() {
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT create() {
            int r0 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT create(long r6) {
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.ALIGNOF
            int r4 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = new org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static int ncbSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.CBSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndwPromptFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.DWPROMPTFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nhwndApp(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.HWNDAPP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static java.nio.ByteBuffer nszPrompt(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT2(r0)
            return r0
    }

    public static java.lang.String nszPromptString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0)
            return r0
    }

    public static void ncbSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.CBSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndwPromptFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.DWPROMPTFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nhwndApp(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.HWNDAPP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nszPrompt(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.HWNDAPP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.CBSIZE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.DWPROMPTFLAGS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.HWNDAPP = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT = r0
            return
    }
}
