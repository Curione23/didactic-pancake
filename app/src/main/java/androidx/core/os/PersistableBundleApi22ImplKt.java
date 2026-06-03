package androidx.core.os;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Landroidx/core/os/PersistableBundleApi22ImplKt;", "", "()V", "putBoolean", "", "persistableBundle", "Landroid/os/PersistableBundle;", "key", "", "value", "", "putBooleanArray", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PersistableBundleApi22ImplKt {
    public static final androidx.core.os.PersistableBundleApi22ImplKt INSTANCE = null;

    static {
            androidx.core.os.PersistableBundleApi22ImplKt r0 = new androidx.core.os.PersistableBundleApi22ImplKt
            r0.<init>()
            androidx.core.os.PersistableBundleApi22ImplKt.INSTANCE = r0
            return
    }

    private PersistableBundleApi22ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void putBoolean(android.os.PersistableBundle r0, java.lang.String r1, boolean r2) {
            r0.putBoolean(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void putBooleanArray(android.os.PersistableBundle r0, java.lang.String r1, boolean[] r2) {
            r0.putBooleanArray(r1, r2)
            return
    }
}
