package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class IntentCompat {
    public static final java.lang.String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final java.lang.String EXTRA_TIME = "android.intent.extra.TIME";

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T[] getParcelableArrayExtra(android.content.Intent r0, java.lang.String r1, java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.getParcelableArrayExtra(r1, r2)
                return r0
        }

        static <T> java.util.ArrayList<T> getParcelableArrayListExtra(android.content.Intent r0, java.lang.String r1, java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1, r2)
                return r0
        }

        static <T> T getParcelableExtra(android.content.Intent r0, java.lang.String r1, java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.getParcelableExtra(r1, r2)
                return r0
        }

        static <T extends java.io.Serializable> T getSerializableExtra(android.content.Intent r0, java.lang.String r1, java.lang.Class<T> r2) {
                java.io.Serializable r0 = r0.getSerializableExtra(r1, r2)
                return r0
        }
    }

    private IntentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Intent createManageUnusedAppRestrictionsIntent(android.content.Context r4, java.lang.String r5) {
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            boolean r0 = androidx.core.content.PackageManagerCompat.areUnusedAppRestrictionsAvailable(r0)
            if (r0 == 0) goto L4c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            java.lang.String r3 = "package"
            if (r0 < r1) goto L23
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r4.<init>(r0)
            android.net.Uri r5 = android.net.Uri.fromParts(r3, r5, r2)
            android.content.Intent r4 = r4.setData(r5)
            return r4
        L23:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r0.<init>(r1)
            android.net.Uri r5 = android.net.Uri.fromParts(r3, r5, r2)
            android.content.Intent r5 = r0.setData(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L39
            return r5
        L39:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r4 = androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(r4)
            java.lang.Object r4 = androidx.core.util.Preconditions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r4 = r5.setPackage(r4)
            return r4
        L4c:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Unused App Restriction features are not available on this device"
            r4.<init>(r5)
            throw r4
    }

    public static android.os.Parcelable[] getParcelableArrayExtra(android.content.Intent r2, java.lang.String r3, java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = androidx.core.content.IntentCompat.Api33Impl.getParcelableArrayExtra(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.getParcelableArrayExtra(r3)
            return r2
    }

    public static <T> java.util.ArrayList<T> getParcelableArrayListExtra(android.content.Intent r2, java.lang.String r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = androidx.core.content.IntentCompat.Api33Impl.getParcelableArrayListExtra(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.getParcelableArrayListExtra(r3)
            return r2
    }

    public static <T> T getParcelableExtra(android.content.Intent r2, java.lang.String r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r2 = androidx.core.content.IntentCompat.Api33Impl.getParcelableExtra(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static <T extends java.io.Serializable> T getSerializableExtra(android.content.Intent r2, java.lang.String r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = androidx.core.content.IntentCompat.Api33Impl.getSerializableExtra(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.getSerializableExtra(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static android.content.Intent makeMainSelectorActivity(java.lang.String r0, java.lang.String r1) {
            android.content.Intent r0 = android.content.Intent.makeMainSelectorActivity(r0, r1)
            return r0
    }
}
