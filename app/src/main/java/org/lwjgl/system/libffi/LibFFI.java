package org.lwjgl.system.libffi;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/LibFFI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/LibFFI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/LibFFI.class */
public class LibFFI {
    public static final short FFI_TYPE_VOID = 0;
    public static final short FFI_TYPE_INT = 1;
    public static final short FFI_TYPE_FLOAT = 2;
    public static final short FFI_TYPE_DOUBLE = 3;
    public static final short FFI_TYPE_LONGDOUBLE = 0;
    public static final short FFI_TYPE_UINT8 = 5;
    public static final short FFI_TYPE_SINT8 = 6;
    public static final short FFI_TYPE_UINT16 = 7;
    public static final short FFI_TYPE_SINT16 = 8;
    public static final short FFI_TYPE_UINT32 = 9;
    public static final short FFI_TYPE_SINT32 = 10;
    public static final short FFI_TYPE_UINT64 = 11;
    public static final short FFI_TYPE_SINT64 = 12;
    public static final short FFI_TYPE_STRUCT = 13;
    public static final short FFI_TYPE_POINTER = 14;
    public static final int FFI_FIRST_ABI = 0;
    public static final int FFI_WIN64 = 0;
    public static final int FFI_GNUW64 = 0;
    public static final int FFI_UNIX64 = 0;
    public static final int FFI_EFI64 = 0;
    public static final int FFI_SYSV = 0;
    public static final int FFI_STDCALL = 0;
    public static final int FFI_THISCALL = 0;
    public static final int FFI_FASTCALL = 0;
    public static final int FFI_MS_CDECL = 0;
    public static final int FFI_PASCAL = 0;
    public static final int FFI_REGISTER = 0;
    public static final int FFI_VFP = 0;
    public static final int FFI_LAST_ABI = 0;
    public static final int FFI_DEFAULT_ABI = 0;
    public static final int FFI_OK = 0;
    public static final int FFI_BAD_TYPEDEF = 1;
    public static final int FFI_BAD_ABI = 2;
    public static final int FFI_BAD_ARGTYPE = 3;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_void = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_uint8 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_sint8 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_uint16 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_sint16 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_uint32 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_sint32 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_uint64 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_sint64 = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_uchar = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_schar = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_ushort = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_sshort = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_uint = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_sint = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_ulong = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_slong = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_float = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_double = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_longdouble = null;
    public static final org.lwjgl.system.libffi.FFIType ffi_type_pointer = null;

    protected LibFFI() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    private static native short FFI_TYPE_DOUBLE();

    private static native int FFI_WIN64();

    private static native int FFI_GNUW64();

    private static native int FFI_UNIX64();

    private static native int FFI_EFI64();

    private static native int FFI_SYSV();

    private static native int FFI_STDCALL();

    private static native int FFI_THISCALL();

    private static native int FFI_FASTCALL();

    private static native int FFI_MS_CDECL();

    private static native int FFI_PASCAL();

    private static native int FFI_REGISTER();

    private static native int FFI_VFP();

    private static native int FFI_FIRST_ABI();

    private static native int FFI_LAST_ABI();

    private static native int FFI_DEFAULT_ABI();

    private static native long nffi_type_void();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_void() {
            long r0 = nffi_type_void()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_uint8();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_uint8() {
            long r0 = nffi_type_uint8()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_sint8();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_sint8() {
            long r0 = nffi_type_sint8()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_uint16();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_uint16() {
            long r0 = nffi_type_uint16()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_sint16();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_sint16() {
            long r0 = nffi_type_sint16()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_uint32();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_uint32() {
            long r0 = nffi_type_uint32()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_sint32();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_sint32() {
            long r0 = nffi_type_sint32()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_uint64();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_uint64() {
            long r0 = nffi_type_uint64()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_sint64();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_sint64() {
            long r0 = nffi_type_sint64()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_uchar();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_uchar() {
            long r0 = nffi_type_uchar()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_schar();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_schar() {
            long r0 = nffi_type_schar()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_ushort();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_ushort() {
            long r0 = nffi_type_ushort()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_sshort();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_sshort() {
            long r0 = nffi_type_sshort()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_uint();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_uint() {
            long r0 = nffi_type_uint()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_sint();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_sint() {
            long r0 = nffi_type_sint()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_ulong();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_ulong() {
            long r0 = nffi_type_ulong()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_slong();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_slong() {
            long r0 = nffi_type_slong()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_float();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_float() {
            long r0 = nffi_type_float()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_double();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_double() {
            long r0 = nffi_type_double()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_longdouble();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_longdouble() {
            long r0 = nffi_type_longdouble()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    private static native long nffi_type_pointer();

    @org.lwjgl.system.NativeType("ffi_type *")
    private static org.lwjgl.system.libffi.FFIType ffi_type_pointer() {
            long r0 = nffi_type_pointer()
            r3 = r0
            r0 = r3
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    public static native int nffi_prep_cif(long r0, int r2, int r3, long r4, long r6);

    @org.lwjgl.system.NativeType("ffi_status")
    public static int ffi_prep_cif(@org.lwjgl.system.NativeType("ffi_cif *") org.lwjgl.system.libffi.FFICIF r9, @org.lwjgl.system.NativeType("ffi_abi") int r10, @org.lwjgl.system.NativeType("ffi_type *") org.lwjgl.system.libffi.FFIType r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ffi_type **") org.lwjgl.PointerBuffer r12) {
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r11
            long r3 = r3.address()
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nffi_prep_cif(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nffi_prep_cif_var(long r0, int r2, int r3, int r4, long r5, long r7);

    @org.lwjgl.system.NativeType("ffi_status")
    public static int ffi_prep_cif_var(@org.lwjgl.system.NativeType("ffi_cif *") org.lwjgl.system.libffi.FFICIF r10, @org.lwjgl.system.NativeType("ffi_abi") int r11, @org.lwjgl.system.NativeType("unsigned int") int r12, @org.lwjgl.system.NativeType("ffi_type *") org.lwjgl.system.libffi.FFIType r13, @org.lwjgl.system.NativeType("ffi_type **") org.lwjgl.PointerBuffer r14) {
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r12
            r3 = r14
            int r3 = r3.remaining()
            r4 = r13
            long r4 = r4.address()
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            int r0 = nffi_prep_cif_var(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native void nffi_call(long r0, long r2, long r4, long r6);

    public static void ffi_call(@org.lwjgl.system.NativeType("ffi_cif *") org.lwjgl.system.libffi.FFICIF r9, @org.lwjgl.system.NativeType("FFI_FN_TYPE") long r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r10
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nffi_call(r0, r1, r2, r3)
            return
    }

    public static native int nffi_get_struct_offsets(int r0, long r1, long r3);

    @org.lwjgl.system.NativeType("ffi_status")
    public static int ffi_get_struct_offsets(@org.lwjgl.system.NativeType("ffi_abi") int r6, @org.lwjgl.system.NativeType("ffi_type *") org.lwjgl.system.libffi.FFIType r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r8) {
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nffi_get_struct_offsets(r0, r1, r2)
            return r0
    }

    public static native long nffi_closure_alloc(long r0, long r2);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("ffi_closure *")
    public static org.lwjgl.system.libffi.FFIClosure ffi_closure_alloc(@org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nffi_closure_alloc(r0, r1)
            r8 = r0
            r0 = r8
            org.lwjgl.system.libffi.FFIClosure r0 = org.lwjgl.system.libffi.FFIClosure.createSafe(r0)
            return r0
    }

    public static native void nffi_closure_free(long r0);

    public static void ffi_closure_free(@org.lwjgl.system.NativeType("ffi_closure *") org.lwjgl.system.libffi.FFIClosure r3) {
            r0 = r3
            long r0 = r0.address()
            nffi_closure_free(r0)
            return
    }

    public static native int nffi_prep_closure_loc(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("ffi_status")
    public static int ffi_prep_closure_loc(@org.lwjgl.system.NativeType("ffi_closure *") org.lwjgl.system.libffi.FFIClosure r11, @org.lwjgl.system.NativeType("ffi_cif *") org.lwjgl.system.libffi.FFICIF r12, @org.lwjgl.system.NativeType("FFI_CLOSURE_FUN") long r13, @org.lwjgl.system.NativeType("void *") long r15, @org.lwjgl.system.NativeType("void *") long r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L11:
            r0 = r11
            long r0 = r0.address()
            r1 = r12
            long r1 = r1.address()
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = nffi_prep_closure_loc(r0, r1, r2, r3, r4)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            short r0 = FFI_TYPE_DOUBLE()
            org.lwjgl.system.libffi.LibFFI.FFI_TYPE_LONGDOUBLE = r0
            int r0 = FFI_FIRST_ABI()
            org.lwjgl.system.libffi.LibFFI.FFI_FIRST_ABI = r0
            int r0 = FFI_WIN64()
            org.lwjgl.system.libffi.LibFFI.FFI_WIN64 = r0
            int r0 = FFI_GNUW64()
            org.lwjgl.system.libffi.LibFFI.FFI_GNUW64 = r0
            int r0 = FFI_UNIX64()
            org.lwjgl.system.libffi.LibFFI.FFI_UNIX64 = r0
            int r0 = FFI_EFI64()
            org.lwjgl.system.libffi.LibFFI.FFI_EFI64 = r0
            int r0 = FFI_SYSV()
            org.lwjgl.system.libffi.LibFFI.FFI_SYSV = r0
            int r0 = FFI_STDCALL()
            org.lwjgl.system.libffi.LibFFI.FFI_STDCALL = r0
            int r0 = FFI_THISCALL()
            org.lwjgl.system.libffi.LibFFI.FFI_THISCALL = r0
            int r0 = FFI_FASTCALL()
            org.lwjgl.system.libffi.LibFFI.FFI_FASTCALL = r0
            int r0 = FFI_MS_CDECL()
            org.lwjgl.system.libffi.LibFFI.FFI_MS_CDECL = r0
            int r0 = FFI_PASCAL()
            org.lwjgl.system.libffi.LibFFI.FFI_PASCAL = r0
            int r0 = FFI_REGISTER()
            org.lwjgl.system.libffi.LibFFI.FFI_REGISTER = r0
            int r0 = FFI_VFP()
            org.lwjgl.system.libffi.LibFFI.FFI_VFP = r0
            int r0 = FFI_LAST_ABI()
            org.lwjgl.system.libffi.LibFFI.FFI_LAST_ABI = r0
            int r0 = FFI_DEFAULT_ABI()
            org.lwjgl.system.libffi.LibFFI.FFI_DEFAULT_ABI = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_void()
            org.lwjgl.system.libffi.LibFFI.ffi_type_void = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_uint8()
            org.lwjgl.system.libffi.LibFFI.ffi_type_uint8 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_sint8()
            org.lwjgl.system.libffi.LibFFI.ffi_type_sint8 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_uint16()
            org.lwjgl.system.libffi.LibFFI.ffi_type_uint16 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_sint16()
            org.lwjgl.system.libffi.LibFFI.ffi_type_sint16 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_uint32()
            org.lwjgl.system.libffi.LibFFI.ffi_type_uint32 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_sint32()
            org.lwjgl.system.libffi.LibFFI.ffi_type_sint32 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_uint64()
            org.lwjgl.system.libffi.LibFFI.ffi_type_uint64 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_sint64()
            org.lwjgl.system.libffi.LibFFI.ffi_type_sint64 = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_uchar()
            org.lwjgl.system.libffi.LibFFI.ffi_type_uchar = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_schar()
            org.lwjgl.system.libffi.LibFFI.ffi_type_schar = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_ushort()
            org.lwjgl.system.libffi.LibFFI.ffi_type_ushort = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_sshort()
            org.lwjgl.system.libffi.LibFFI.ffi_type_sshort = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_uint()
            org.lwjgl.system.libffi.LibFFI.ffi_type_uint = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_sint()
            org.lwjgl.system.libffi.LibFFI.ffi_type_sint = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_ulong()
            org.lwjgl.system.libffi.LibFFI.ffi_type_ulong = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_slong()
            org.lwjgl.system.libffi.LibFFI.ffi_type_slong = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_float()
            org.lwjgl.system.libffi.LibFFI.ffi_type_float = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_double()
            org.lwjgl.system.libffi.LibFFI.ffi_type_double = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_longdouble()
            org.lwjgl.system.libffi.LibFFI.ffi_type_longdouble = r0
            org.lwjgl.system.libffi.FFIType r0 = ffi_type_pointer()
            org.lwjgl.system.libffi.LibFFI.ffi_type_pointer = r0
            return
    }
}
