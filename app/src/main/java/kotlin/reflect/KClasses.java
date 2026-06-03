package kotlin.reflect;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"cast", "T", "", "Lkotlin/reflect/KClass;", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class KClasses {
    public static final <T> T cast(kotlin.reflect.KClass<T> r2, java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isInstance(r3)
            if (r0 == 0) goto L11
            java.lang.String r2 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r2)
            return r3
        L11:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Value cannot be cast to "
            r0.<init>(r1)
            java.lang.String r2 = r2.getQualifiedName()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final <T> T safeCast(kotlin.reflect.KClass<T> r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = r1.isInstance(r2)
            if (r1 == 0) goto L11
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r1)
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }
}
