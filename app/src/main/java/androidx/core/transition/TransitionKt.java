package androidx.core.transition;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001aÆ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\r\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u000f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0011\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b¨\u0006\u0013"}, d2 = {"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "onStart", "onCancel", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransitionKt {






    public static final android.transition.Transition.TransitionListener addListener(android.transition.Transition r7, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r8, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r9, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r10, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r11, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r12) {
            androidx.core.transition.TransitionKt$addListener$listener$1 r6 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r0 = r6
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r10
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            android.transition.Transition$TransitionListener r6 = (android.transition.Transition.TransitionListener) r6
            r7.addListener(r6)
            return r6
    }

    public static /* synthetic */ android.transition.Transition.TransitionListener addListener$default(android.transition.Transition r2, kotlin.jvm.functions.Function1 r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L8
            androidx.core.transition.TransitionKt$addListener$1 r3 = androidx.core.transition.TransitionKt.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
        L8:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            androidx.core.transition.TransitionKt$addListener$2 r4 = androidx.core.transition.TransitionKt.AnonymousClass2.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
        L10:
            r9 = r4
            r4 = r8 & 4
            if (r4 == 0) goto L1a
            androidx.core.transition.TransitionKt$addListener$3 r4 = androidx.core.transition.TransitionKt.AnonymousClass3.INSTANCE
            r5 = r4
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
        L1a:
            r0 = r5
            r4 = r8 & 8
            if (r4 == 0) goto L24
            androidx.core.transition.TransitionKt$addListener$4 r4 = androidx.core.transition.TransitionKt.AnonymousClass4.INSTANCE
            r6 = r4
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
        L24:
            r4 = r8 & 16
            if (r4 == 0) goto L2d
            androidx.core.transition.TransitionKt$addListener$5 r4 = androidx.core.transition.TransitionKt.AnonymousClass5.INSTANCE
            r7 = r4
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
        L2d:
            androidx.core.transition.TransitionKt$addListener$listener$1 r1 = new androidx.core.transition.TransitionKt$addListener$listener$1
            r4 = r1
            r5 = r3
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            android.transition.Transition$TransitionListener r1 = (android.transition.Transition.TransitionListener) r1
            r2.addListener(r1)
            return r1
    }

    public static final android.transition.Transition.TransitionListener doOnCancel(android.transition.Transition r1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            r0.<init>(r2)
            android.transition.Transition$TransitionListener r0 = (android.transition.Transition.TransitionListener) r0
            r1.addListener(r0)
            return r0
    }

    public static final android.transition.Transition.TransitionListener doOnEnd(android.transition.Transition r1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            r0.<init>(r2)
            android.transition.Transition$TransitionListener r0 = (android.transition.Transition.TransitionListener) r0
            r1.addListener(r0)
            return r0
    }

    public static final android.transition.Transition.TransitionListener doOnPause(android.transition.Transition r1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            r0.<init>(r2)
            android.transition.Transition$TransitionListener r0 = (android.transition.Transition.TransitionListener) r0
            r1.addListener(r0)
            return r0
    }

    public static final android.transition.Transition.TransitionListener doOnResume(android.transition.Transition r1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            r0.<init>(r2)
            android.transition.Transition$TransitionListener r0 = (android.transition.Transition.TransitionListener) r0
            r1.addListener(r0)
            return r0
    }

    public static final android.transition.Transition.TransitionListener doOnStart(android.transition.Transition r1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> r2) {
            androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1 r0 = new androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            r0.<init>(r2)
            android.transition.Transition$TransitionListener r0 = (android.transition.Transition.TransitionListener) r0
            r1.addListener(r0)
            return r0
    }
}
