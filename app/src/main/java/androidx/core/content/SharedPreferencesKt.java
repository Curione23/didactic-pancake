package androidx.core.content;

/* JADX INFO: compiled from: SharedPreferences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\b¨\u0006\t"}, d2 = {"edit", "", "Landroid/content/SharedPreferences;", "commit", "", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesKt {
    public static final void edit(android.content.SharedPreferences r0, boolean r1, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> r2) {
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2.invoke(r0)
            if (r1 == 0) goto Ld
            r0.commit()
            goto L10
        Ld:
            r0.apply()
        L10:
            return
    }

    public static /* synthetic */ void edit$default(android.content.SharedPreferences r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2.invoke(r0)
            if (r1 == 0) goto L12
            r0.commit()
            goto L15
        L12:
            r0.apply()
        L15:
            return
    }
}
