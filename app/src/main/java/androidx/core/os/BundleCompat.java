package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class BundleCompat {

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T getParcelable(android.os.Bundle r0, java.lang.String r1, java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.getParcelable(r1, r2)
                return r0
        }

        static <T> T[] getParcelableArray(android.os.Bundle r0, java.lang.String r1, java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.getParcelableArray(r1, r2)
                return r0
        }

        static <T> java.util.ArrayList<T> getParcelableArrayList(android.os.Bundle r0, java.lang.String r1, java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.getParcelableArrayList(r1, r2)
                return r0
        }

        static <T extends java.io.Serializable> T getSerializable(android.os.Bundle r0, java.lang.String r1, java.lang.Class<T> r2) {
                java.io.Serializable r0 = r0.getSerializable(r1, r2)
                return r0
        }

        static <T> android.util.SparseArray<T> getSparseParcelableArray(android.os.Bundle r0, java.lang.String r1, java.lang.Class<? extends T> r2) {
                android.util.SparseArray r0 = r0.getSparseParcelableArray(r1, r2)
                return r0
        }
    }

    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static android.os.IBinder getBinder(android.os.Bundle r0, java.lang.String r1) {
            android.os.IBinder r0 = r0.getBinder(r1)
            return r0
    }

    public static <T> T getParcelable(android.os.Bundle r2, java.lang.String r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r2 = androidx.core.os.BundleCompat.Api33Impl.getParcelable(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.getParcelable(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static android.os.Parcelable[] getParcelableArray(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArray(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.getParcelableArray(r3)
            return r2
    }

    public static <T> java.util.ArrayList<T> getParcelableArrayList(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = androidx.core.os.BundleCompat.Api33Impl.getParcelableArrayList(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
            return r2
    }

    public static <T extends java.io.Serializable> T getSerializable(android.os.Bundle r2, java.lang.String r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = androidx.core.os.BundleCompat.Api33Impl.getSerializable(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.getSerializable(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static <T> android.util.SparseArray<T> getSparseParcelableArray(android.os.Bundle r2, java.lang.String r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r2 = androidx.core.os.BundleCompat.Api33Impl.getSparseParcelableArray(r2, r3, r4)
            return r2
        Lb:
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r3)
            return r2
    }

    @java.lang.Deprecated
    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
