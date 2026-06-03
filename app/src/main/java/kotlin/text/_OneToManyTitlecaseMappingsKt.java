package kotlin.text;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _OneToManyTitlecaseMappingsKt {
    public static final java.lang.String titlecaseImpl(char r4) {
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.length()
            r3 = 1
            if (r2 <= r3) goto L51
            r2 = 329(0x149, float:4.61E-43)
            if (r4 != r2) goto L20
            goto L50
        L20:
            r4 = 0
            char r4 = r0.charAt(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = r4.toString()
        L50:
            return r0
        L51:
            char r4 = java.lang.Character.toTitleCase(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
    }
}
