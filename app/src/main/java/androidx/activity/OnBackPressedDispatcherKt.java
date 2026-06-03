package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"addCallback", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/activity/OnBackPressedDispatcher;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "enabled", "", "onBackPressed", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcherKt {
    public static final androidx.activity.OnBackPressedCallback addCallback(androidx.activity.OnBackPressedDispatcher r1, androidx.lifecycle.LifecycleOwner r2, boolean r3, kotlin.jvm.functions.Function1<? super androidx.activity.OnBackPressedCallback, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onBackPressed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1 r0 = new androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            r0.<init>(r3, r4)
            if (r2 == 0) goto L18
            r3 = r0
            androidx.activity.OnBackPressedCallback r3 = (androidx.activity.OnBackPressedCallback) r3
            r1.addCallback(r2, r3)
            goto L1e
        L18:
            r2 = r0
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            r1.addCallback(r2)
        L1e:
            androidx.activity.OnBackPressedCallback r0 = (androidx.activity.OnBackPressedCallback) r0
            return r0
    }

    public static /* synthetic */ androidx.activity.OnBackPressedCallback addCallback$default(androidx.activity.OnBackPressedDispatcher r0, androidx.lifecycle.LifecycleOwner r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r2 = 1
        La:
            androidx.activity.OnBackPressedCallback r0 = addCallback(r0, r1, r2, r3)
            return r0
    }
}
