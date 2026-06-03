package net.kdt.pojavlaunch;

/* JADX INFO: loaded from: classes2.dex */
public class CriticalNativeTest {
    public CriticalNativeTest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void invokeTest() {
            r0 = 0
            testCriticalNative(r0, r0)
            return
    }

    @dalvik.annotation.optimization.CriticalNative
    public static native void testCriticalNative(int r0, int r1);
}
