package androidx.core.telephony;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionManagerCompat {
    private static java.lang.reflect.Method sGetSlotIndexMethod;

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getSlotIndex(int r0) {
                int r0 = android.telephony.SubscriptionManager.getSlotIndex(r0)
                return r0
        }
    }

    private SubscriptionManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSlotIndex(int r7) {
            r0 = -1
            if (r7 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lf
            int r7 = androidx.core.telephony.SubscriptionManagerCompat.Api29Impl.getSlotIndex(r7)
            return r7
        Lf:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L28
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r2 = "getSlotIndex"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L40
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L40
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L40
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.Throwable -> L40
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L40
        L28:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L40
            r2 = 0
            java.lang.Object r7 = r1.invoke(r2, r7)     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L40
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L40
            return r7
        L40:
            return r0
    }
}
