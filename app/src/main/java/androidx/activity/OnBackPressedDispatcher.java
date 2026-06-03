package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0004)*+,B\u0013\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\fH\u0001¢\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\u0014H\u0007J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010 \u001a\u00020\u0014H\u0003J\b\u0010!\u001a\u00020\u0014H\u0007J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000eH\u0007J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0007H\u0003J\b\u0010(\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "fallbackOnBackPressed", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "onHasEnabledCallbacksChanged", "Landroidx/core/util/Consumer;", "", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "inProgressCallback", "Landroidx/activity/OnBackPressedCallback;", "invokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackPressedCallbacks", "Lkotlin/collections/ArrayDeque;", "addCallback", "", "onBackPressedCallback", "owner", "Landroidx/lifecycle/LifecycleOwner;", "addCancellableCallback", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "dispatchOnBackCancelled", "dispatchOnBackProgressed", "backEvent", "Landroidx/activity/BackEventCompat;", "dispatchOnBackStarted", "onBackCancelled", "onBackPressed", "onBackProgressed", "onBackStarted", "setOnBackInvokedDispatcher", "invoker", "updateBackInvokedCallbackState", "shouldBeRegistered", "updateEnabledCallbacks", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final java.lang.Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private androidx.activity.OnBackPressedCallback inProgressCallback;
    private android.window.OnBackInvokedDispatcher invokedDispatcher;
    private android.window.OnBackInvokedCallback onBackInvokedCallback;
    private final kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> onBackPressedCallbacks;
    private final androidx.core.util.Consumer<java.lang.Boolean> onHasEnabledCallbacksChanged;






    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "()V", "createOnBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackInvoked", "Lkotlin/Function0;", "", "registerOnBackInvokedCallback", "dispatcher", "priority", "", "callback", "unregisterOnBackInvokedCallback", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        public static final androidx.activity.OnBackPressedDispatcher.Api33Impl INSTANCE = null;

        public static /* synthetic */ void $r8$lambda$uALQStkfKNo5swuEpG7lymZRBFs(kotlin.jvm.functions.Function0 r0) {
                createOnBackInvokedCallback$lambda$0(r0)
                return
        }

        static {
                androidx.activity.OnBackPressedDispatcher$Api33Impl r0 = new androidx.activity.OnBackPressedDispatcher$Api33Impl
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE = r0
                return
        }

        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        private static final void createOnBackInvokedCallback$lambda$0(kotlin.jvm.functions.Function0 r1) {
                java.lang.String r0 = "$onBackInvoked"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                r1.invoke()
                return
        }

        public final android.window.OnBackInvokedCallback createOnBackInvokedCallback(kotlin.jvm.functions.Function0<kotlin.Unit> r2) {
                r1 = this;
                java.lang.String r0 = "onBackInvoked"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0 r0 = new androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                r0.<init>(r2)
                return r0
        }

        public final void registerOnBackInvokedCallback(java.lang.Object r2, int r3, java.lang.Object r4) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r4 = (android.window.OnBackInvokedCallback) r4
                r2.registerOnBackInvokedCallback(r3, r4)
                return
        }

        public final void unregisterOnBackInvokedCallback(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.window.OnBackInvokedDispatcher r2 = (android.window.OnBackInvokedDispatcher) r2
                android.window.OnBackInvokedCallback r3 = (android.window.OnBackInvokedCallback) r3
                r2.unregisterOnBackInvokedCallback(r3)
                return
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jj\u0010\u0003\u001a\u00020\u00042!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0007¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "()V", "createOnBackAnimationCallback", "Landroid/window/OnBackInvokedCallback;", "onBackStarted", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", "name", "backEvent", "", "onBackProgressed", "onBackInvoked", "Lkotlin/Function0;", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        public static final androidx.activity.OnBackPressedDispatcher.Api34Impl INSTANCE = null;

        static {
                androidx.activity.OnBackPressedDispatcher$Api34Impl r0 = new androidx.activity.OnBackPressedDispatcher$Api34Impl
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.Api34Impl.INSTANCE = r0
                return
        }

        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final android.window.OnBackInvokedCallback createOnBackAnimationCallback(kotlin.jvm.functions.Function1<? super androidx.activity.BackEventCompat, kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super androidx.activity.BackEventCompat, kotlin.Unit> r3, kotlin.jvm.functions.Function0<kotlin.Unit> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
                r1 = this;
                java.lang.String r0 = "onBackStarted"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "onBackProgressed"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "onBackInvoked"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "onBackCancelled"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1 r0 = new androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                r0.<init>(r2, r3, r4, r5)
                android.window.OnBackInvokedCallback r0 = (android.window.OnBackInvokedCallback) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/OnBackPressedCallback;)V", "currentCancellable", "cancel", "", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {
        private androidx.activity.Cancellable currentCancellable;
        private final androidx.lifecycle.Lifecycle lifecycle;
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r2, androidx.lifecycle.Lifecycle r3, androidx.activity.OnBackPressedCallback r4) {
                r1 = this;
                java.lang.String r0 = "lifecycle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "onBackPressedCallback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.lifecycle = r3
                r1.onBackPressedCallback = r4
                r2 = r1
                androidx.lifecycle.LifecycleObserver r2 = (androidx.lifecycle.LifecycleObserver) r2
                r3.addObserver(r2)
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.lifecycle
                r1 = r2
                androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                r0.removeObserver(r1)
                androidx.activity.OnBackPressedCallback r0 = r2.onBackPressedCallback
                r1 = r2
                androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
                r0.removeCancellable(r1)
                androidx.activity.Cancellable r0 = r2.currentCancellable
                if (r0 == 0) goto L17
                r0.cancel()
            L17:
                r0 = 0
                r2.currentCancellable = r0
                return
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
                if (r3 != r2) goto L19
                androidx.activity.OnBackPressedDispatcher r2 = r1.this$0
                androidx.activity.OnBackPressedCallback r3 = r1.onBackPressedCallback
                androidx.activity.Cancellable r2 = r2.addCancellableCallback$activity_release(r3)
                r1.currentCancellable = r2
                goto L2c
            L19:
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                if (r3 != r2) goto L25
                androidx.activity.Cancellable r2 = r1.currentCancellable
                if (r2 == 0) goto L2c
                r2.cancel()
                goto L2c
            L25:
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                if (r3 != r2) goto L2c
                r1.cancel()
            L2c:
                return
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/OnBackPressedCallback;)V", "cancel", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class OnBackPressedCancellable implements androidx.activity.Cancellable {
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r2, androidx.activity.OnBackPressedCallback r3) {
                r1 = this;
                java.lang.String r0 = "onBackPressedCallback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.onBackPressedCallback = r3
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r3 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r3.this$0
                kotlin.collections.ArrayDeque r0 = androidx.activity.OnBackPressedDispatcher.access$getOnBackPressedCallbacks$p(r0)
                androidx.activity.OnBackPressedCallback r1 = r3.onBackPressedCallback
                r0.remove(r1)
                androidx.activity.OnBackPressedDispatcher r0 = r3.this$0
                androidx.activity.OnBackPressedCallback r0 = androidx.activity.OnBackPressedDispatcher.access$getInProgressCallback$p(r0)
                androidx.activity.OnBackPressedCallback r1 = r3.onBackPressedCallback
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                r1 = 0
                if (r0 == 0) goto L24
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                r0.handleOnBackCancelled()
                androidx.activity.OnBackPressedDispatcher r0 = r3.this$0
                androidx.activity.OnBackPressedDispatcher.access$setInProgressCallback$p(r0, r1)
            L24:
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                r2 = r3
                androidx.activity.Cancellable r2 = (androidx.activity.Cancellable) r2
                r0.removeCancellable(r2)
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                kotlin.jvm.functions.Function0 r0 = r0.getEnabledChangedCallback$activity_release()
                if (r0 == 0) goto L37
                r0.invoke()
            L37:
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                r0.setEnabledChangedCallback$activity_release(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C00291 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        C00291(java.lang.Object r8) {
                r7 = this;
                java.lang.Class<androidx.activity.OnBackPressedDispatcher> r3 = androidx.activity.OnBackPressedDispatcher.class
                java.lang.String r5 = "updateEnabledCallbacks()V"
                r6 = 0
                r1 = 0
                java.lang.String r4 = "updateEnabledCallbacks"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                r1 = this;
                r1.invoke2()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                java.lang.Object r0 = r1.receiver
                androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
                androidx.activity.OnBackPressedDispatcher.access$updateEnabledCallbacks(r0)
                return
        }
    }

    public OnBackPressedDispatcher() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public OnBackPressedDispatcher(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ OnBackPressedDispatcher(java.lang.Runnable r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public OnBackPressedDispatcher(java.lang.Runnable r4, androidx.core.util.Consumer<java.lang.Boolean> r5) {
            r3 = this;
            r3.<init>()
            r3.fallbackOnBackPressed = r4
            r3.onHasEnabledCallbacksChanged = r5
            kotlin.collections.ArrayDeque r4 = new kotlin.collections.ArrayDeque
            r4.<init>()
            r3.onBackPressedCallbacks = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4c
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 < r5) goto L3d
            androidx.activity.OnBackPressedDispatcher$Api34Impl r4 = androidx.activity.OnBackPressedDispatcher.Api34Impl.INSTANCE
            androidx.activity.OnBackPressedDispatcher$1 r5 = new androidx.activity.OnBackPressedDispatcher$1
            r5.<init>(r3)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.activity.OnBackPressedDispatcher$2 r0 = new androidx.activity.OnBackPressedDispatcher$2
            r0.<init>(r3)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.activity.OnBackPressedDispatcher$3 r1 = new androidx.activity.OnBackPressedDispatcher$3
            r1.<init>(r3)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            androidx.activity.OnBackPressedDispatcher$4 r2 = new androidx.activity.OnBackPressedDispatcher$4
            r2.<init>(r3)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            android.window.OnBackInvokedCallback r4 = r4.createOnBackAnimationCallback(r5, r0, r1, r2)
            goto L4a
        L3d:
            androidx.activity.OnBackPressedDispatcher$Api33Impl r4 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            androidx.activity.OnBackPressedDispatcher$5 r5 = new androidx.activity.OnBackPressedDispatcher$5
            r5.<init>(r3)
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            android.window.OnBackInvokedCallback r4 = r4.createOnBackInvokedCallback(r5)
        L4a:
            r3.onBackInvokedCallback = r4
        L4c:
            return
    }

    public static final /* synthetic */ androidx.activity.OnBackPressedCallback access$getInProgressCallback$p(androidx.activity.OnBackPressedDispatcher r0) {
            androidx.activity.OnBackPressedCallback r0 = r0.inProgressCallback
            return r0
    }

    public static final /* synthetic */ kotlin.collections.ArrayDeque access$getOnBackPressedCallbacks$p(androidx.activity.OnBackPressedDispatcher r0) {
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r0.onBackPressedCallbacks
            return r0
    }

    public static final /* synthetic */ void access$onBackCancelled(androidx.activity.OnBackPressedDispatcher r0) {
            r0.onBackCancelled()
            return
    }

    public static final /* synthetic */ void access$onBackProgressed(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.BackEventCompat r1) {
            r0.onBackProgressed(r1)
            return
    }

    public static final /* synthetic */ void access$onBackStarted(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.BackEventCompat r1) {
            r0.onBackStarted(r1)
            return
    }

    public static final /* synthetic */ void access$setInProgressCallback$p(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.OnBackPressedCallback r1) {
            r0.inProgressCallback = r1
            return
    }

    public static final /* synthetic */ void access$updateEnabledCallbacks(androidx.activity.OnBackPressedDispatcher r0) {
            r0.updateEnabledCallbacks()
            return
    }

    private final void onBackCancelled() {
            r4 = this;
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r4.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        Lc:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.previous()
            r3 = r1
            androidx.activity.OnBackPressedCallback r3 = (androidx.activity.OnBackPressedCallback) r3
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto Lc
            goto L22
        L21:
            r1 = r2
        L22:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r4.inProgressCallback = r2
            if (r1 == 0) goto L2b
            r1.handleOnBackCancelled()
        L2b:
            return
    }

    private final void onBackProgressed(androidx.activity.BackEventCompat r4) {
            r3 = this;
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r3.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        Lc:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto Lc
            goto L21
        L20:
            r1 = 0
        L21:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            if (r1 == 0) goto L28
            r1.handleOnBackProgressed(r4)
        L28:
            return
    }

    private final void onBackStarted(androidx.activity.BackEventCompat r4) {
            r3 = this;
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r3.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        Lc:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto Lc
            goto L21
        L20:
            r1 = 0
        L21:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r3.inProgressCallback = r1
            if (r1 == 0) goto L2a
            r1.handleOnBackStarted(r4)
        L2a:
            return
    }

    private final void updateBackInvokedCallbackState(boolean r5) {
            r4 = this;
            android.window.OnBackInvokedDispatcher r0 = r4.invokedDispatcher
            android.window.OnBackInvokedCallback r1 = r4.onBackInvokedCallback
            if (r0 == 0) goto L25
            if (r1 == 0) goto L25
            r2 = 0
            if (r5 == 0) goto L18
            boolean r3 = r4.backInvokedCallbackRegistered
            if (r3 != 0) goto L18
            androidx.activity.OnBackPressedDispatcher$Api33Impl r5 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            r5.registerOnBackInvokedCallback(r0, r2, r1)
            r5 = 1
            r4.backInvokedCallbackRegistered = r5
            goto L25
        L18:
            if (r5 != 0) goto L25
            boolean r5 = r4.backInvokedCallbackRegistered
            if (r5 == 0) goto L25
            androidx.activity.OnBackPressedDispatcher$Api33Impl r5 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            r5.unregisterOnBackInvokedCallback(r0, r1)
            r4.backInvokedCallbackRegistered = r2
        L25:
            return
    }

    private final void updateEnabledCallbacks() {
            r4 = this;
            boolean r0 = r4.hasEnabledCallbacks
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r1 = r4.onBackPressedCallbacks
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L15
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L15
            goto L2c
        L15:
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L19
            r3 = 1
        L2c:
            r4.hasEnabledCallbacks = r3
            if (r3 == r0) goto L44
            androidx.core.util.Consumer<java.lang.Boolean> r0 = r4.onHasEnabledCallbacksChanged
            if (r0 == 0) goto L3b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.accept(r1)
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L44
            r4.updateBackInvokedCallbackState(r3)
        L44:
            return
    }

    public final void addCallback(androidx.activity.OnBackPressedCallback r2) {
            r1 = this;
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addCancellableCallback$activity_release(r2)
            return
    }

    public final void addCallback(androidx.lifecycle.LifecycleOwner r3, androidx.activity.OnBackPressedCallback r4) {
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L17
            return
        L17:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            androidx.activity.Cancellable r0 = (androidx.activity.Cancellable) r0
            r4.addCancellable(r0)
            r2.updateEnabledCallbacks()
            androidx.activity.OnBackPressedDispatcher$addCallback$1 r3 = new androidx.activity.OnBackPressedDispatcher$addCallback$1
            r3.<init>(r2)
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r4.setEnabledChangedCallback$activity_release(r3)
            return
    }

    public final androidx.activity.Cancellable addCancellableCallback$activity_release(androidx.activity.OnBackPressedCallback r3) {
            r2 = this;
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r2.onBackPressedCallbacks
            r0.add(r3)
            androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable
            r0.<init>(r2, r3)
            androidx.activity.Cancellable r0 = (androidx.activity.Cancellable) r0
            r3.addCancellable(r0)
            r2.updateEnabledCallbacks()
            androidx.activity.OnBackPressedDispatcher$addCancellableCallback$1 r1 = new androidx.activity.OnBackPressedDispatcher$addCancellableCallback$1
            r1.<init>(r2)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r3.setEnabledChangedCallback$activity_release(r1)
            return r0
    }

    public final void dispatchOnBackCancelled() {
            r0 = this;
            r0.onBackCancelled()
            return
    }

    public final void dispatchOnBackProgressed(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.onBackProgressed(r2)
            return
    }

    public final void dispatchOnBackStarted(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.onBackStarted(r2)
            return
    }

    public final boolean hasEnabledCallbacks() {
            r1 = this;
            boolean r0 = r1.hasEnabledCallbacks
            return r0
    }

    public final void onBackPressed() {
            r4 = this;
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r4.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        Lc:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.previous()
            r3 = r1
            androidx.activity.OnBackPressedCallback r3 = (androidx.activity.OnBackPressedCallback) r3
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto Lc
            goto L22
        L21:
            r1 = r2
        L22:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            r4.inProgressCallback = r2
            if (r1 == 0) goto L2c
            r1.handleOnBackPressed()
            return
        L2c:
            java.lang.Runnable r0 = r4.fallbackOnBackPressed
            if (r0 == 0) goto L33
            r0.run()
        L33:
            return
    }

    public final void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r2) {
            r1 = this;
            java.lang.String r0 = "invoker"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.invokedDispatcher = r2
            boolean r2 = r1.hasEnabledCallbacks
            r1.updateBackInvokedCallbackState(r2)
            return
    }
}
