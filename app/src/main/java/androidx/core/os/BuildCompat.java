package androidx.core.os;

/* JADX INFO: compiled from: BuildCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "()V", "AD_SERVICES_EXTENSION_INT", "", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", "isAtLeastN", "", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastPreReleaseCodename", "codename", "", "buildCodename", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "Api30Impl", "PrereleaseSdkCheck", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT = 0;
    public static final androidx.core.os.BuildCompat INSTANCE = null;
    public static final int R_EXTENSION_INT = 0;
    public static final int S_EXTENSION_INT = 0;
    public static final int T_EXTENSION_INT = 0;

    /* JADX INFO: compiled from: BuildCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "()V", "getExtensionVersion", "", "extension", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api30Impl {
        public static final androidx.core.os.BuildCompat.Api30Impl INSTANCE = null;

        static {
                androidx.core.os.BuildCompat$Api30Impl r0 = new androidx.core.os.BuildCompat$Api30Impl
                r0.<init>()
                androidx.core.os.BuildCompat.Api30Impl.INSTANCE = r0
                return
        }

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int getExtensionVersion(int r1) {
                r0 = this;
                int r1 = android.os.ext.SdkExtensions.getExtensionVersion(r1)
                return r1
        }
    }

    /* JADX INFO: compiled from: BuildCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    static {
            androidx.core.os.BuildCompat r0 = new androidx.core.os.BuildCompat
            r0.<init>()
            androidx.core.os.BuildCompat.INSTANCE = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 30
            if (r0 < r2) goto L15
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            int r0 = r0.getExtensionVersion(r2)
            goto L16
        L15:
            r0 = r1
        L16:
            androidx.core.os.BuildCompat.R_EXTENSION_INT = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L25
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r3 = 31
            int r0 = r0.getExtensionVersion(r3)
            goto L26
        L25:
            r0 = r1
        L26:
            androidx.core.os.BuildCompat.S_EXTENSION_INT = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L35
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r3 = 33
            int r0 = r0.getExtensionVersion(r3)
            goto L36
        L35:
            r0 = r1
        L36:
            androidx.core.os.BuildCompat.T_EXTENSION_INT = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L45
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r0.getExtensionVersion(r1)
        L45:
            androidx.core.os.BuildCompat.AD_SERVICES_EXTENSION_INT = r1
            return
    }

    private BuildCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastN() {
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastNMR1() {
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastO() {
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastOMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastPreReleaseCodename(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "codename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "buildCodename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "REL"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toUpperCase(r0)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            int r3 = r4.compareTo(r3)
            if (r3 < 0) goto L2f
            r1 = 1
        L2f:
            return r1
    }

    @kotlin.Deprecated(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "S"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastSv2() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Sv2"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Tiramisu"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastU() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "UpsideDownCake"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastV() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L17
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "VanillaIceCream"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }
}
