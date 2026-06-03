package androidx.core.os;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b\u001a1\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\b¨\u0006\f"}, d2 = {"postAtTime", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "uptimeMillis", "", "token", "", "action", "Lkotlin/Function0;", "", "postDelayed", "delayInMillis", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HandlerKt {
    public static final java.lang.Runnable postAtTime(android.os.Handler r1, long r2, java.lang.Object r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r0 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r0.<init>(r5)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.postAtTime(r0, r4, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Runnable postAtTime$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            androidx.core.os.HandlerKt$postAtTime$runnable$1 r5 = new androidx.core.os.HandlerKt$postAtTime$runnable$1
            r5.<init>(r4)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r0.postAtTime(r5, r3, r1)
            return r5
    }

    public static final java.lang.Runnable postDelayed(android.os.Handler r1, long r2, java.lang.Object r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r0 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r0.<init>(r5)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r4 != 0) goto Ld
            r1.postDelayed(r0, r2)
            goto L10
        Ld:
            androidx.core.os.HandlerCompat.postDelayed(r1, r0, r4, r2)
        L10:
            return r0
    }

    public static /* synthetic */ java.lang.Runnable postDelayed$default(android.os.Handler r0, long r1, java.lang.Object r3, kotlin.jvm.functions.Function0 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            androidx.core.os.HandlerKt$postDelayed$runnable$1 r5 = new androidx.core.os.HandlerKt$postDelayed$runnable$1
            r5.<init>(r4)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            if (r3 != 0) goto L12
            r0.postDelayed(r5, r1)
            goto L15
        L12:
            androidx.core.os.HandlerCompat.postDelayed(r0, r5, r3, r1)
        L15:
            return r5
    }
}
