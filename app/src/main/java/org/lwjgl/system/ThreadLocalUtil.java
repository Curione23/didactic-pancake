package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/ThreadLocalUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/ThreadLocalUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/ThreadLocalUtil.class */
public final class ThreadLocalUtil {
    private static final long JNI_NATIVE_INTERFACE = 0;
    private static final int JNI_NATIVE_INTERFACE_FUNCTION_COUNT = 0;
    private static final long FUNCTION_MISSING_ABORT = 0;
    private static long FUNCTION_MISSING_ABORT_TABLE;
    private static final int CAPABILITIES_OFFSET = 0;

    private ThreadLocalUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static native long getThreadJNIEnv();

    private static native long getFunctionMissingAbort();

    private static native long nsetupEnvData(int r0);

    public static long setupEnvData() {
            int r0 = org.lwjgl.system.ThreadLocalUtil.JNI_NATIVE_INTERFACE_FUNCTION_COUNT
            long r0 = nsetupEnvData(r0)
            return r0
    }

    public static void setCapabilities(long r5) {
            long r0 = getThreadJNIEnv()
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L29
            r0 = r9
            long r1 = org.lwjgl.system.ThreadLocalUtil.JNI_NATIVE_INTERFACE
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            r0 = r9
            int r1 = org.lwjgl.system.ThreadLocalUtil.CAPABILITIES_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r1 = org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT_TABLE
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            goto L47
        L29:
            r0 = r9
            long r1 = org.lwjgl.system.ThreadLocalUtil.JNI_NATIVE_INTERFACE
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            long r0 = setupEnvData()
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
        L3c:
            r0 = r9
            int r1 = org.lwjgl.system.ThreadLocalUtil.CAPABILITIES_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r5
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
        L47:
            return
    }

    public static void setFunctionMissingAddresses(int r7) {
            long r0 = org.lwjgl.system.ThreadLocalUtil.JNI_NATIVE_INTERFACE
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r8 = r0
            long r0 = org.lwjgl.system.ThreadLocalUtil.JNI_NATIVE_INTERFACE
            int r1 = org.lwjgl.system.ThreadLocalUtil.CAPABILITIES_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r10 = r0
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r12 = r0
            r0 = r7
            if (r0 != 0) goto L37
            r0 = r12
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L8e
            r0 = 0
            org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT_TABLE = r0
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            r1 = r12
            r0.free(r1)
            r0 = r10
            r1 = 0
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            goto L8e
        L37:
            r0 = r12
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L48
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "setFunctionMissingAddresses has been called already"
            r1.<init>(r2)
            throw r0
        L48:
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L50
            return
        L50:
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.getAllocator()
            r1 = r7
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.system.Pointer.POINTER_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0.malloc(r1)
            org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT_TABLE = r0
            r0 = 0
            r14 = r0
        L67:
            r0 = r14
            r1 = r7
            if (r0 >= r1) goto L87
            long r0 = org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT_TABLE
            r1 = r14
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.system.Pointer.POINTER_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r1 = org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            int r14 = r14 + 1
            goto L67
        L87:
            r0 = r10
            long r1 = org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT_TABLE
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
        L8e:
            return
    }

    public static org.lwjgl.PointerBuffer setupAddressBuffer(org.lwjgl.PointerBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            r6 = r0
        L5:
            r0 = r6
            r1 = r5
            int r1 = r1.limit()
            if (r0 >= r1) goto L26
            r0 = r5
            r1 = r6
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            r0 = r5
            r1 = r6
            long r2 = org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT
            org.lwjgl.PointerBuffer r0 = r0.put(r1, r2)
        L20:
            int r6 = r6 + 1
            goto L5
        L26:
            r0 = r5
            return r0
    }

    public static boolean areCapabilitiesDifferent(org.lwjgl.PointerBuffer r5, org.lwjgl.PointerBuffer r6) {
            r0 = 0
            r7 = r0
        L2:
            r0 = r7
            r1 = r5
            int r1 = r1.remaining()
            if (r0 >= r1) goto L2a
            r0 = r5
            r1 = r7
            long r0 = r0.get(r1)
            r1 = r6
            r2 = r7
            long r1 = r1.get(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = r6
            r1 = r7
            long r0 = r0.get(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            int r7 = r7 + 1
            goto L2
        L2a:
            r0 = 0
            return r0
    }

    static {
            long r0 = getThreadJNIEnv()
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.ThreadLocalUtil.JNI_NATIVE_INTERFACE = r0
            long r0 = getFunctionMissingAbort()
            org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT = r0
            r0 = 0
            org.lwjgl.system.ThreadLocalUtil.FUNCTION_MISSING_ABORT_TABLE = r0
            r0 = 3
            int r1 = org.lwjgl.system.Pointer.POINTER_SIZE
            int r0 = r0 * r1
            org.lwjgl.system.ThreadLocalUtil.CAPABILITIES_OFFSET = r0
            int r0 = org.lwjgl.system.jni.JNINativeInterface.GetVersion()
            r4 = r0
            r0 = r4
            switch(r0) {
                case 65537: goto L34;
                default: goto L3a;
            }
        L34:
            r0 = 12
            r5 = r0
            goto L3c
        L3a:
            r0 = 4
            r5 = r0
        L3c:
            r0 = r4
            switch(r0) {
                case 65537: goto L98;
                case 65538: goto L9f;
                case 65540: goto La6;
                case 65542: goto Lad;
                case 65544: goto Lad;
                case 589824: goto Lb4;
                case 655360: goto Lb4;
                case 1245184: goto Lbb;
                case 1310720: goto Lbb;
                case 1376256: goto Lc2;
                default: goto Lc9;
            }
        L98:
            r0 = 208(0xd0, float:2.91E-43)
            r6 = r0
            goto Ld5
        L9f:
            r0 = 225(0xe1, float:3.15E-43)
            r6 = r0
            goto Ld5
        La6:
            r0 = 228(0xe4, float:3.2E-43)
            r6 = r0
            goto Ld5
        Lad:
            r0 = 229(0xe5, float:3.21E-43)
            r6 = r0
            goto Ld5
        Lb4:
            r0 = 230(0xe6, float:3.22E-43)
            r6 = r0
            goto Ld5
        Lbb:
            r0 = 231(0xe7, float:3.24E-43)
            r6 = r0
            goto Ld5
        Lc2:
            r0 = 232(0xe8, float:3.25E-43)
            r6 = r0
            goto Ld5
        Lc9:
            r0 = 232(0xe8, float:3.25E-43)
            r6 = r0
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.String r1 = "[LWJGL] [ThreadLocalUtil] Unsupported JNI version detected, this may result in a crash. Please inform LWJGL developers."
            r0.println(r1)
        Ld5:
            r0 = r5
            org.lwjgl.system.Configuration<java.lang.Integer> r1 = org.lwjgl.system.Configuration.JNI_NATIVE_INTERFACE_FUNCTION_COUNT
            r2 = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r0 = r0 + r1
            org.lwjgl.system.ThreadLocalUtil.JNI_NATIVE_INTERFACE_FUNCTION_COUNT = r0
            return
    }
}
