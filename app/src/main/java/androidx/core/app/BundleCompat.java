package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class BundleCompat {
    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.IBinder getBinder(android.os.Bundle r0, java.lang.String r1) {
            android.os.IBinder r0 = r0.getBinder(r1)
            return r0
    }

    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
