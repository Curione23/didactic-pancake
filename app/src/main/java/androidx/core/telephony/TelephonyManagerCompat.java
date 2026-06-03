package androidx.core.telephony;

/* JADX INFO: loaded from: classes.dex */
public class TelephonyManagerCompat {
    private static java.lang.reflect.Method sGetDeviceIdMethod;
    private static java.lang.reflect.Method sGetSubIdMethod;

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getDeviceId(android.telephony.TelephonyManager r0, int r1) {
                java.lang.String r0 = r0.getDeviceId(r1)
                return r0
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getImei(android.telephony.TelephonyManager r0) {
                java.lang.String r0 = r0.getImei()
                return r0
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getSubscriptionId(android.telephony.TelephonyManager r0) {
                int r0 = r0.getSubscriptionId()
                return r0
        }
    }

    private TelephonyManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getImei(android.telephony.TelephonyManager r0) {
            java.lang.String r0 = androidx.core.telephony.TelephonyManagerCompat.Api26Impl.getImei(r0)
            return r0
    }

    public static int getSubscriptionId(android.telephony.TelephonyManager r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            int r4 = androidx.core.telephony.TelephonyManagerCompat.Api30Impl.getSubscriptionId(r4)
            return r4
        Lb:
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod     // Catch: java.lang.Throwable -> L38
            r1 = 0
            if (r0 != 0) goto L20
            java.lang.Class<android.telephony.TelephonyManager> r0 = android.telephony.TelephonyManager.class
            java.lang.String r2 = "getSubId"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L38
            androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod = r0     // Catch: java.lang.Throwable -> L38
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L38
        L20:
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L38
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L38
            r1 = -1
            if (r0 == r1) goto L38
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L38
            return r4
        L38:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
    }
}
