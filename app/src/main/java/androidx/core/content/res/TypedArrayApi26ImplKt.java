package androidx.core.content.res;

/* JADX INFO: compiled from: TypedArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/core/content/res/TypedArrayApi26ImplKt;", "", "()V", "getFont", "Landroid/graphics/Typeface;", "typedArray", "Landroid/content/res/TypedArray;", "index", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TypedArrayApi26ImplKt {
    public static final androidx.core.content.res.TypedArrayApi26ImplKt INSTANCE = null;

    static {
            androidx.core.content.res.TypedArrayApi26ImplKt r0 = new androidx.core.content.res.TypedArrayApi26ImplKt
            r0.<init>()
            androidx.core.content.res.TypedArrayApi26ImplKt.INSTANCE = r0
            return
    }

    private TypedArrayApi26ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final android.graphics.Typeface getFont(android.content.res.TypedArray r0, int r1) {
            android.graphics.Typeface r0 = r0.getFont(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }
}
