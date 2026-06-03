package androidx.core.content;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001aN\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\b\u001a8\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\b¨\u0006\u0013"}, d2 = {"getSystemService", "T", "", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "withStyledAttributes", "", "set", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "defStyleRes", "block", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ExtensionFunctionType;", "resourceId", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(android.content.Context r2) {
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r2 = androidx.core.content.ContextCompat.getSystemService(r2, r0)
            return r2
    }

    public static final void withStyledAttributes(android.content.Context r0, int r1, int[] r2, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> r3) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2)
            r3.invoke(r0)
            r0.recycle()
            return
    }

    public static final void withStyledAttributes(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, kotlin.jvm.functions.Function1<? super android.content.res.TypedArray, kotlin.Unit> r5) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r5.invoke(r0)
            r0.recycle()
            return
    }

    public static /* synthetic */ void withStyledAttributes$default(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto Lb
            r4 = r0
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            r5 = r0
        L10:
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6.invoke(r1)
            r1.recycle()
            return
    }
}
