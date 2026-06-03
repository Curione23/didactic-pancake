package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0007H\u0001J\b\u0010\u0015\u001a\u00020\nH\u0017J\b\u0010\u0016\u001a\u00020\nH'J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\b\u0010\u001b\u001a\u00020\nH\u0007J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0007H\u0001R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0004¨\u0006\u001d"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "enabled", "", "(Z)V", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/activity/Cancellable;", "enabledChangedCallback", "Lkotlin/Function0;", "", "getEnabledChangedCallback$activity_release", "()Lkotlin/jvm/functions/Function0;", "setEnabledChangedCallback$activity_release", "(Lkotlin/jvm/functions/Function0;)V", "value", "isEnabled", "()Z", "setEnabled", "addCancellable", "cancellable", "handleOnBackCancelled", "handleOnBackPressed", "handleOnBackProgressed", "backEvent", "Landroidx/activity/BackEventCompat;", "handleOnBackStarted", "remove", "removeCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OnBackPressedCallback {
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> cancellables;
    private kotlin.jvm.functions.Function0<kotlin.Unit> enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.isEnabled = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.cancellables = r1
            return
    }

    public final void addCancellable(androidx.activity.Cancellable r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.cancellables
            r0.add(r2)
            return
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getEnabledChangedCallback$activity_release() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.enabledChangedCallback
            return r0
    }

    public void handleOnBackCancelled() {
            r0 = this;
            return
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    public void handleOnBackStarted(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.isEnabled
            return r0
    }

    public final void remove() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r2.cancellables
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
            r1.cancel()
            goto L8
        L18:
            return
    }

    public final void removeCancellable(androidx.activity.Cancellable r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.cancellables
            r0.remove(r2)
            return
    }

    public final void setEnabled(boolean r1) {
            r0 = this;
            r0.isEnabled = r1
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r0.enabledChangedCallback
            if (r1 == 0) goto L9
            r1.invoke()
        L9:
            return
    }

    public final void setEnabledChangedCallback$activity_release(kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            r0 = this;
            r0.enabledChangedCallback = r1
            return
    }
}
