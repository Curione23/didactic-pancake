package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionInfoCompat {

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getProtection(android.content.pm.PermissionInfo r0) {
                int r0 = r0.getProtection()
                return r0
        }

        static int getProtectionFlags(android.content.pm.PermissionInfo r0) {
                int r0 = r0.getProtectionFlags()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Protection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getProtection(android.content.pm.PermissionInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.content.pm.PermissionInfoCompat.Api28Impl.getProtection(r2)
            return r2
        Lb:
            int r2 = r2.protectionLevel
            r2 = r2 & 15
            return r2
    }

    public static int getProtectionFlags(android.content.pm.PermissionInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.content.pm.PermissionInfoCompat.Api28Impl.getProtectionFlags(r2)
            return r2
        Lb:
            int r2 = r2.protectionLevel
            r2 = r2 & (-16)
            return r2
    }
}
