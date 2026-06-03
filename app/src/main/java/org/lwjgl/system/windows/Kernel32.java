package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Kernel32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Kernel32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Kernel32.class */
public class Kernel32 {
    private static final org.lwjgl.system.SharedLibrary KERNEL32 = null;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Kernel32$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Kernel32$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/Kernel32$Functions.class */
    public static final class Functions {
        public static final long GetCurrentProcess = 0;
        public static final long GetCurrentProcessId = 0;
        public static final long GetProcessId = 0;
        public static final long GetCurrentThread = 0;
        public static final long GetCurrentThreadId = 0;
        public static final long GetThreadId = 0;
        public static final long GetProcessIdOfThread = 0;
        public static final long GetCurrentProcessorNumber = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetCurrentProcess"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetCurrentProcess = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetCurrentProcessId"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetCurrentProcessId = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetProcessId"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetProcessId = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetCurrentThread"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetCurrentThread = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetCurrentThreadId"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetCurrentThreadId = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetThreadId"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetThreadId = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetProcessIdOfThread"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetProcessIdOfThread = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.access$000()
                java.lang.String r1 = "GetCurrentProcessorNumber"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.Kernel32.Functions.GetCurrentProcessorNumber = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.KERNEL32
            return r0
    }

    protected Kernel32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("HANDLE")
    public static long GetCurrentProcess() {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetCurrentProcess
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static int GetCurrentProcessId() {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetCurrentProcessId
            r3 = r0
            r0 = r3
            int r0 = org.lwjgl.system.JNI.callI(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static int GetProcessId(@org.lwjgl.system.NativeType("HANDLE") long r5) {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetProcessId
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("HANDLE")
    public static long GetCurrentThread() {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetCurrentThread
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static int GetCurrentThreadId() {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetCurrentThreadId
            r3 = r0
            r0 = r3
            int r0 = org.lwjgl.system.JNI.callI(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static int GetThreadId(@org.lwjgl.system.NativeType("HANDLE") long r5) {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetThreadId
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static int GetProcessIdOfThread(@org.lwjgl.system.NativeType("HANDLE") long r5) {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetProcessIdOfThread
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static int GetCurrentProcessorNumber() {
            long r0 = org.lwjgl.system.windows.Kernel32.Functions.GetCurrentProcessorNumber
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r3
            int r0 = org.lwjgl.system.JNI.callI(r0)
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.Kernel32.KERNEL32
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.system.windows.Kernel32> r0 = org.lwjgl.system.windows.Kernel32.class
            java.lang.String r1 = "org.lwjgl"
            java.lang.String r2 = "kernel32"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            org.lwjgl.system.windows.Kernel32.KERNEL32 = r0
            return
    }
}
