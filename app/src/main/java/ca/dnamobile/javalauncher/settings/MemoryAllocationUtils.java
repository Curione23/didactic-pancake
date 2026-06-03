package ca.dnamobile.javalauncher.settings;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryAllocationUtils {
    private static final int ABSOLUTE_MIN_MEMORY_MB = 512;
    public static final int RAM_DEFAULT_ROUND_MB = 2048;
    public static final int RAM_STEP_MB = 256;

    private MemoryAllocationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int clampToAllowedRam(android.content.Context r2, int r3) {
            int r2 = getMaxAllocatableMemoryMb(r2)
            int r0 = getMinimumMemoryMb(r2)
            r1 = 256(0x100, float:3.59E-43)
            int r3 = roundToNearestStep(r3, r1)
            if (r3 >= r0) goto L11
            return r0
        L11:
            if (r3 <= r2) goto L14
            return r2
        L14:
            return r3
    }

    public static int getAvailableMemoryMb(android.content.Context r4) {
            android.app.ActivityManager$MemoryInfo r4 = readMemoryInfo(r4)
            long r0 = r4.availMem
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            long r0 = r0 / r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r2, r0)
            r2 = 512(0x200, double:2.53E-321)
            long r0 = java.lang.Math.max(r2, r0)
            int r4 = (int) r0
            return r4
    }

    public static int getDefaultAllocatedMemoryMb(android.content.Context r3) {
            int r0 = getMaxAllocatableMemoryMb(r3)
            r1 = 2048(0x800, float:2.87E-42)
            int r1 = roundDownToStep(r0, r1)
            r2 = 512(0x200, float:7.17E-43)
            if (r1 >= r2) goto Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            int r3 = clampToAllowedRam(r3, r0)
            return r3
    }

    public static int getMaxAllocatableMemoryMb(android.content.Context r1) {
            int r1 = getAvailableMemoryMb(r1)
            r0 = 256(0x100, float:3.59E-43)
            int r1 = roundDownToStep(r1, r0)
            r0 = 512(0x200, float:7.17E-43)
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    public static int getMinimumMemoryMb(int r1) {
            r0 = 256(0x100, float:3.59E-43)
            int r1 = java.lang.Math.max(r0, r1)
            r0 = 512(0x200, float:7.17E-43)
            int r1 = java.lang.Math.min(r0, r1)
            return r1
    }

    public static int getTotalMemoryMb(android.content.Context r4) {
            android.app.ActivityManager$MemoryInfo r4 = readMemoryInfo(r4)
            long r0 = r4.totalMem
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r2
            long r0 = r0 / r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r2, r0)
            r2 = 512(0x200, double:2.53E-321)
            long r0 = java.lang.Math.max(r2, r0)
            int r4 = (int) r0
            return r4
    }

    private static android.app.ActivityManager.MemoryInfo readMemoryInfo(android.content.Context r2) {
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r1 = "activity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            if (r2 == 0) goto L16
            r2.getMemoryInfo(r0)
        L16:
            return r0
    }

    public static int resolveAllocatedMemoryMb(android.content.Context r2) {
            int r0 = getDefaultAllocatedMemoryMb(r2)
            int r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getAllocatedMemoryMb(r2, r0)
            int r1 = clampToAllowedRam(r2, r0)
            if (r0 == r1) goto L11
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setAllocatedMemoryMb(r2, r1)
        L11:
            return r1
    }

    private static int roundDownToStep(int r0, int r1) {
            if (r1 > 0) goto L3
            return r0
        L3:
            int r0 = r0 / r1
            int r0 = r0 * r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static int roundToNearestStep(int r1, int r2) {
            if (r2 > 0) goto L3
            return r1
        L3:
            float r1 = (float) r1
            float r0 = (float) r2
            float r1 = r1 / r0
            int r1 = java.lang.Math.round(r1)
            int r1 = r1 * r2
            return r1
    }
}
