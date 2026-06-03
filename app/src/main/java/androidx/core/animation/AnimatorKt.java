package androidx.core.animation;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a¡\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001aT\u0010\f\u001a\u00020\r*\u00020\u00022#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a-\u0010\u0013\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a2\u0010\u0014\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a-\u0010\u0015\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a2\u0010\u0016\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b¨\u0006\u0017"}, d2 = {"addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "", "onStart", "onCancel", "onRepeat", "addPauseListener", "Landroid/animation/Animator$AnimatorPauseListener;", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnRepeat", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimatorKt {







    public static final android.animation.Animator.AnimatorListener addListener(android.animation.Animator r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r3, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r4, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r5) {
            androidx.core.animation.AnimatorKt$addListener$listener$1 r0 = new androidx.core.animation.AnimatorKt$addListener$listener$1
            r0.<init>(r5, r2, r4, r3)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r1.addListener(r0)
            return r0
    }

    public static /* synthetic */ android.animation.Animator.AnimatorListener addListener$default(android.animation.Animator r0, kotlin.jvm.functions.Function1 r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function1 r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            androidx.core.animation.AnimatorKt$addListener$1 r1 = androidx.core.animation.AnimatorKt.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            androidx.core.animation.AnimatorKt$addListener$2 r2 = androidx.core.animation.AnimatorKt.AnonymousClass2.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            androidx.core.animation.AnimatorKt$addListener$3 r3 = androidx.core.animation.AnimatorKt.AnonymousClass3.INSTANCE
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            androidx.core.animation.AnimatorKt$addListener$4 r4 = androidx.core.animation.AnimatorKt.AnonymousClass4.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
        L20:
            androidx.core.animation.AnimatorKt$addListener$listener$1 r5 = new androidx.core.animation.AnimatorKt$addListener$listener$1
            r5.<init>(r4, r1, r3, r2)
            android.animation.Animator$AnimatorListener r5 = (android.animation.Animator.AnimatorListener) r5
            r0.addListener(r5)
            return r5
    }

    public static final android.animation.Animator.AnimatorPauseListener addPauseListener(android.animation.Animator r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r3) {
            androidx.core.animation.AnimatorKt$addPauseListener$listener$1 r0 = new androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            r0.<init>(r3, r2)
            android.animation.Animator$AnimatorPauseListener r0 = (android.animation.Animator.AnimatorPauseListener) r0
            r1.addPauseListener(r0)
            return r0
    }

    public static /* synthetic */ android.animation.Animator.AnimatorPauseListener addPauseListener$default(android.animation.Animator r0, kotlin.jvm.functions.Function1 r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L8
            androidx.core.animation.AnimatorKt$addPauseListener$1 r1 = androidx.core.animation.AnimatorKt.C00301.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
        L8:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            androidx.core.animation.AnimatorKt$addPauseListener$2 r2 = androidx.core.animation.AnimatorKt.C00312.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        L10:
            android.animation.Animator$AnimatorPauseListener r0 = addPauseListener(r0, r1, r2)
            return r0
    }

    public static final android.animation.Animator.AnimatorListener doOnCancel(android.animation.Animator r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r2) {
            androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            r0.<init>(r2)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r1.addListener(r0)
            return r0
    }

    public static final android.animation.Animator.AnimatorListener doOnEnd(android.animation.Animator r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r2) {
            androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            r0.<init>(r2)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r1.addListener(r0)
            return r0
    }

    public static final android.animation.Animator.AnimatorPauseListener doOnPause(android.animation.Animator r2, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r3) {
            r0 = 0
            r1 = 1
            android.animation.Animator$AnimatorPauseListener r2 = addPauseListener$default(r2, r0, r3, r1, r0)
            return r2
    }

    public static final android.animation.Animator.AnimatorListener doOnRepeat(android.animation.Animator r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r2) {
            androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            r0.<init>(r2)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r1.addListener(r0)
            return r0
    }

    public static final android.animation.Animator.AnimatorPauseListener doOnResume(android.animation.Animator r2, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r3) {
            r0 = 0
            r1 = 2
            android.animation.Animator$AnimatorPauseListener r2 = addPauseListener$default(r2, r3, r0, r1, r0)
            return r2
    }

    public static final android.animation.Animator.AnimatorListener doOnStart(android.animation.Animator r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r2) {
            androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1 r0 = new androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            r0.<init>(r2)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r1.addListener(r0)
            return r0
    }
}
