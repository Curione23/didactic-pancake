package net.kdt.pojavlaunch;

/* JADX INFO: loaded from: classes2.dex */
public final class Architecture {
    public static final int ARCH_ARM = 0;
    public static final int ARCH_ARM64 = 1;
    public static final int ARCH_UNKNOWN = -1;
    public static final int ARCH_X86 = 2;
    public static final int ARCH_X86_64 = 3;

    private Architecture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String androidAbiAsString(int r1) {
            if (r1 == 0) goto L17
            r0 = 1
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 3
            if (r1 == r0) goto Le
            java.lang.String r1 = "unknown"
            return r1
        Le:
            java.lang.String r1 = "x86_64"
            return r1
        L11:
            java.lang.String r1 = "x86"
            return r1
        L14:
            java.lang.String r1 = "arm64-v8a"
            return r1
        L17:
            java.lang.String r1 = "armeabi-v7a"
            return r1
    }

    public static java.lang.String archAsString(int r1) {
            if (r1 == 0) goto L17
            r0 = 1
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 3
            if (r1 == r0) goto Le
            java.lang.String r1 = "unknown"
            return r1
        Le:
            java.lang.String r1 = "x86_64"
            return r1
        L11:
            java.lang.String r1 = "x86"
            return r1
        L14:
            java.lang.String r1 = "arm64"
            return r1
        L17:
            java.lang.String r1 = "arm"
            return r1
    }

    public static int getDeviceArchitecture() {
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            int r0 = r0.length
            if (r0 <= 0) goto Lf
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            r0 = r0[r1]
            goto L11
        Lf:
            java.lang.String r0 = android.os.Build.CPU_ABI
        L11:
            r2 = -1
            if (r0 != 0) goto L15
            return r2
        L15:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r3)
            r0.hashCode()
            int r3 = r0.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -806050265: goto L56;
                case -738963905: goto L4b;
                case 117110: goto L40;
                case 145444210: goto L35;
                case 1431565292: goto L2a;
                default: goto L28;
            }
        L28:
            r0 = r2
            goto L60
        L2a:
            java.lang.String r3 = "arm64-v8a"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L33
            goto L28
        L33:
            r0 = 4
            goto L60
        L35:
            java.lang.String r3 = "armeabi-v7a"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3e
            goto L28
        L3e:
            r0 = r4
            goto L60
        L40:
            java.lang.String r3 = "x86"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L49
            goto L28
        L49:
            r0 = r5
            goto L60
        L4b:
            java.lang.String r3 = "armeabi"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L54
            goto L28
        L54:
            r0 = r6
            goto L60
        L56:
            java.lang.String r3 = "x86_64"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L5f
            goto L28
        L5f:
            r0 = r1
        L60:
            switch(r0) {
                case 0: goto L67;
                case 1: goto L66;
                case 2: goto L65;
                case 3: goto L66;
                case 4: goto L64;
                default: goto L63;
            }
        L63:
            return r2
        L64:
            return r6
        L65:
            return r5
        L66:
            return r1
        L67:
            return r4
    }
}
