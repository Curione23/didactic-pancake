package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/MacOSXLibraryBundle.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/MacOSXLibraryBundle.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/MacOSXLibraryBundle.class */
public class MacOSXLibraryBundle extends org.lwjgl.system.macosx.MacOSXLibrary {
    public MacOSXLibraryBundle(java.lang.String r6, long r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            return
    }

    public static org.lwjgl.system.macosx.MacOSXLibraryBundle getWithIdentifier(java.lang.String r6) {
            r0 = 0
            r7 = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()     // Catch: java.lang.Throwable -> La9
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            r1 = r6
            java.nio.ByteBuffer r0 = r0.UTF8(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r1 = 134217984(0x8000100, float:3.8519774E-34)
            long r0 = CString2CFString(r0, r1)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.macosx.CoreFoundation.CFBundleGetBundleWithIdentifier(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r11 = r0
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            java.lang.String r3 = "Failed to retrieve bundle with identifier: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            throw r0     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
        L3c:
            r0 = r11
            long r0 = org.lwjgl.system.macosx.CoreFoundation.CFRetain(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            org.lwjgl.system.macosx.MacOSXLibraryBundle r0 = new org.lwjgl.system.macosx.MacOSXLibraryBundle     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r1 = r0
            r2 = r6
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Throwable -> L84 java.lang.Throwable -> La9
            r13 = r0
            r0 = r9
            if (r0 == 0) goto L6e
            r0 = r10
            if (r0 == 0) goto L6a
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> La9
            goto L6e
        L5e:
            r14 = move-exception
            r0 = r10
            r1 = r14
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> La9
            goto L6e
        L6a:
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> La9
        L6e:
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L78
            r0 = r7
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
        L78:
            r0 = r13
            return r0
        L7b:
            r11 = move-exception
            r0 = r11
            r10 = r0
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L84 java.lang.Throwable -> La9
        L84:
            r15 = move-exception
            r0 = r9
            if (r0 == 0) goto La6
            r0 = r10
            if (r0 == 0) goto La2
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L96 java.lang.Throwable -> La9
            goto La6
        L96:
            r16 = move-exception
            r0 = r10
            r1 = r16
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> La9
            goto La6
        La2:
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> La9
        La6:
            r0 = r15
            throw r0     // Catch: java.lang.Throwable -> La9
        La9:
            r17 = move-exception
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb5
            r0 = r7
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
        Lb5:
            r0 = r17
            throw r0
    }

    public static org.lwjgl.system.macosx.MacOSXLibraryBundle create(java.lang.String r8) {
            r0 = 0
            r9 = r0
            r0 = 0
            r11 = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()     // Catch: java.lang.Throwable -> Lc3
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r13
            r1 = r8
            java.nio.ByteBuffer r0 = r0.UTF8(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r1 = 134217984(0x8000100, float:3.8519774E-34)
            long r0 = CString2CFString(r0, r1)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r9 = r0
            r0 = 0
            r1 = r9
            r2 = 0
            r3 = 1
            long r0 = org.lwjgl.system.macosx.CoreFoundation.CFURLCreateWithFileSystemPath(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            long r0 = org.lwjgl.system.Checks.check(r0)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r11 = r0
            r0 = 0
            r1 = r11
            long r0 = org.lwjgl.system.macosx.CoreFoundation.CFBundleCreate(r0, r1)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r15 = r0
            r0 = r15
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4c
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            java.lang.String r3 = "Failed to create bundle: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            throw r0     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
        L4c:
            org.lwjgl.system.macosx.MacOSXLibraryBundle r0 = new org.lwjgl.system.macosx.MacOSXLibraryBundle     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r1 = r0
            r2 = r8
            r3 = r15
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L92 java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
            r17 = r0
            r0 = r13
            if (r0 == 0) goto L7b
            r0 = r14
            if (r0 == 0) goto L76
            r0 = r13
            r0.close()     // Catch: java.lang.Throwable -> L6a java.lang.Throwable -> Lc3
            goto L7b
        L6a:
            r18 = move-exception
            r0 = r14
            r1 = r18
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> Lc3
            goto L7b
        L76:
            r0 = r13
            r0.close()     // Catch: java.lang.Throwable -> Lc3
        L7b:
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L85
            r0 = r11
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
        L85:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L8f
            r0 = r9
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
        L8f:
            r0 = r17
            return r0
        L92:
            r15 = move-exception
            r0 = r15
            r14 = r0
            r0 = r15
            throw r0     // Catch: java.lang.Throwable -> L9b java.lang.Throwable -> Lc3
        L9b:
            r19 = move-exception
            r0 = r13
            if (r0 == 0) goto Lc0
            r0 = r14
            if (r0 == 0) goto Lbb
            r0 = r13
            r0.close()     // Catch: java.lang.Throwable -> Laf java.lang.Throwable -> Lc3
            goto Lc0
        Laf:
            r20 = move-exception
            r0 = r14
            r1 = r20
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> Lc3
            goto Lc0
        Lbb:
            r0 = r13
            r0.close()     // Catch: java.lang.Throwable -> Lc3
        Lc0:
            r0 = r19
            throw r0     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r21 = move-exception
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lcf
            r0 = r11
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
        Lcf:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ld9
            r0 = r9
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
        Ld9:
            r0 = r21
            throw r0
    }

    @Override // org.lwjgl.system.SharedLibrary
    @javax.annotation.Nullable
    public java.lang.String getPath() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.system.FunctionProvider
    public long getFunctionAddress(java.nio.ByteBuffer r6) {
            r5 = this;
            r0 = r6
            r1 = 1536(0x600, float:2.152E-42)
            long r0 = CString2CFString(r0, r1)
            r7 = r0
            r0 = r5
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L19
            r1 = r7
            long r0 = org.lwjgl.system.macosx.CoreFoundation.CFBundleGetFunctionPointerForName(r0, r1)     // Catch: java.lang.Throwable -> L19
            r9 = r0
            r0 = r7
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
            r0 = r9
            return r0
        L19:
            r11 = move-exception
            r0 = r7
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
            r0 = r11
            throw r0
    }

    private static long CString2CFString(java.nio.ByteBuffer r7, int r8) {
            r0 = 0
            r1 = r7
            r2 = r8
            long r3 = org.lwjgl.system.macosx.CoreFoundation.kCFAllocatorNull
            long r0 = org.lwjgl.system.macosx.CoreFoundation.CFStringCreateWithCStringNoCopy(r0, r1, r2, r3)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return r0
    }

    @Override // org.lwjgl.system.NativeResource
    public void free() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.macosx.CoreFoundation.CFRelease(r0)
            return
    }
}
