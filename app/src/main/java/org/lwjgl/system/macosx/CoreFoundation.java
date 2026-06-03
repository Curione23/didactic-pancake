package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreFoundation.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreFoundation.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreFoundation.class */
public class CoreFoundation {
    public static final byte TRUE = 1;
    public static final byte FALSE = 0;
    public static final int kCFStringEncodingMacRoman = 0;
    public static final int kCFStringEncodingWindowsLatin1 = 1280;
    public static final int kCFStringEncodingISOLatin1 = 513;
    public static final int kCFStringEncodingNextStepLatin = 2817;
    public static final int kCFStringEncodingASCII = 1536;
    public static final int kCFStringEncodingUnicode = 256;
    public static final int kCFStringEncodingUTF8 = 134217984;
    public static final int kCFStringEncodingNonLossyASCII = 3071;
    public static final int kCFStringEncodingUTF16 = 256;
    public static final int kCFStringEncodingUTF16BE = 268435712;
    public static final int kCFStringEncodingUTF16LE = 335544576;
    public static final int kCFStringEncodingUTF32 = 201326848;
    public static final int kCFStringEncodingUTF32BE = 402653440;
    public static final int kCFStringEncodingUTF32LE = 469762304;
    public static final int kCFURLPOSIXPathStyle = 0;
    public static final int kCFURLHFSPathStyle = 1;
    public static final int kCFURLWindowsPathStyle = 2;
    public static final long kCFAllocatorDefault = 0;
    public static final long kCFAllocatorSystemDefault = 0;
    public static final long kCFAllocatorMalloc = 0;
    public static final long kCFAllocatorMallocZone = 0;
    public static final long kCFAllocatorNull = 0;
    public static final long kCFAllocatorUseContext = 0;

    protected CoreFoundation() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("CFAllocatorRef")
    private static native long kCFAllocatorDefault();

    @org.lwjgl.system.NativeType("CFAllocatorRef")
    private static native long kCFAllocatorSystemDefault();

    @org.lwjgl.system.NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMalloc();

    @org.lwjgl.system.NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMallocZone();

    @org.lwjgl.system.NativeType("CFAllocatorRef")
    private static native long kCFAllocatorNull();

    @org.lwjgl.system.NativeType("CFAllocatorRef")
    private static native long kCFAllocatorUseContext();

    public static native long nCFRetain(long r0);

    @org.lwjgl.system.NativeType("CFTypeRef")
    public static long CFRetain(@org.lwjgl.system.NativeType("CFTypeRef") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            long r0 = nCFRetain(r0)
            return r0
    }

    public static native void nCFRelease(long r0);

    public static void CFRelease(@org.lwjgl.system.NativeType("CFTypeRef") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nCFRelease(r0)
            return
    }

    public static native long nCFBundleCreate(long r0, long r2);

    @org.lwjgl.system.NativeType("CFBundleRef")
    public static long CFBundleCreate(@org.lwjgl.system.NativeType("CFAllocatorRef") long r5, @org.lwjgl.system.NativeType("CFURLRef") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r0 = nCFBundleCreate(r0, r1)
            return r0
    }

    public static native long nCFBundleGetBundleWithIdentifier(long r0);

    @org.lwjgl.system.NativeType("CFBundleRef")
    public static long CFBundleGetBundleWithIdentifier(@org.lwjgl.system.NativeType("CFStringRef") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            long r0 = nCFBundleGetBundleWithIdentifier(r0)
            return r0
    }

    public static native long nCFBundleGetFunctionPointerForName(long r0, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long CFBundleGetFunctionPointerForName(@org.lwjgl.system.NativeType("CFBundleRef") long r5, @org.lwjgl.system.NativeType("CFStringRef") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r5
            r1 = r7
            long r0 = nCFBundleGetFunctionPointerForName(r0, r1)
            return r0
    }

    public static native long nCFStringCreateWithCString(long r0, long r2, int r4);

    @org.lwjgl.system.NativeType("CFStringRef")
    public static long CFStringCreateWithCString(@org.lwjgl.system.NativeType("CFAllocatorRef") long r6, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("CFStringEncoding") int r9) {
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r0 = nCFStringCreateWithCString(r0, r1, r2)
            return r0
    }

    public static native long nCFStringCreateWithCStringNoCopy(long r0, long r2, int r4, long r5);

    @org.lwjgl.system.NativeType("CFStringRef")
    public static long CFStringCreateWithCStringNoCopy(@org.lwjgl.system.NativeType("CFAllocatorRef") long r8, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("CFStringEncoding") int r11, @org.lwjgl.system.NativeType("CFAllocatorRef") long r12) {
            r0 = r8
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            r3 = r12
            long r0 = nCFStringCreateWithCStringNoCopy(r0, r1, r2, r3)
            return r0
    }

    public static native long nCFURLCreateWithFileSystemPath(long r0, long r2, long r4, boolean r6);

    @org.lwjgl.system.NativeType("CFURLRef")
    public static long CFURLCreateWithFileSystemPath(@org.lwjgl.system.NativeType("CFAllocatorRef") long r8, @org.lwjgl.system.NativeType("CFStringRef") long r10, @org.lwjgl.system.NativeType("CFURLPathStyle") long r12, @org.lwjgl.system.NativeType("Boolean") boolean r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r14
            long r0 = nCFURLCreateWithFileSystemPath(r0, r1, r2, r3)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            long r0 = kCFAllocatorDefault()
            org.lwjgl.system.macosx.CoreFoundation.kCFAllocatorDefault = r0
            long r0 = kCFAllocatorSystemDefault()
            org.lwjgl.system.macosx.CoreFoundation.kCFAllocatorSystemDefault = r0
            long r0 = kCFAllocatorMalloc()
            org.lwjgl.system.macosx.CoreFoundation.kCFAllocatorMalloc = r0
            long r0 = kCFAllocatorMallocZone()
            org.lwjgl.system.macosx.CoreFoundation.kCFAllocatorMallocZone = r0
            long r0 = kCFAllocatorNull()
            org.lwjgl.system.macosx.CoreFoundation.kCFAllocatorNull = r0
            long r0 = kCFAllocatorUseContext()
            org.lwjgl.system.macosx.CoreFoundation.kCFAllocatorUseContext = r0
            return
    }
}
