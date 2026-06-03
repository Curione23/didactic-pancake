package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: InlineList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", "", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "forEachReversed", "", "action", "Lkotlin/Function1;", "forEachReversed-impl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "plus", "element", "plus-FjFbRPM", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class InlineList<E> {
    private final java.lang.Object holder;

    private /* synthetic */ InlineList(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.holder = r1
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.internal.InlineList m2307boximpl(java.lang.Object r1) {
            kotlinx.coroutines.internal.InlineList r0 = new kotlinx.coroutines.internal.InlineList
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <E> java.lang.Object m2308constructorimpl(java.lang.Object r0) {
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m2309constructorimpl$default(java.lang.Object r0, int r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            java.lang.Object r0 = m2308constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2310equalsimpl(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.InlineList
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.internal.InlineList r3 = (kotlinx.coroutines.internal.InlineList) r3
            java.lang.Object r3 = r3.m2316unboximpl()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2311equalsimpl0(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m2312forEachReversedimpl(java.lang.Object r2, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r3) {
            if (r2 != 0) goto L3
            return
        L3:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto Lb
            r3.invoke(r2)
            goto L22
        Lb:
            if (r2 == 0) goto L23
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L15:
            r1 = -1
            if (r1 >= r0) goto L22
            java.lang.Object r1 = r2.get(r0)
            r3.invoke(r1)
            int r0 = r0 + (-1)
            goto L15
        L22:
            return
        L23:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2313hashCodeimpl(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            return r0
    }

    /* JADX INFO: renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final java.lang.Object m2314plusFjFbRPM(java.lang.Object r2, E r3) {
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L11
            boolean r0 = r3 instanceof java.util.List
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L11:
            if (r2 != 0) goto L18
            java.lang.Object r2 = m2308constructorimpl(r3)
            goto L41
        L18:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto L31
            if (r2 == 0) goto L29
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
            java.lang.Object r2 = m2308constructorimpl(r2)
            goto L41
        L29:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r2.<init>(r3)
            throw r2
        L31:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            java.lang.Object r2 = m2308constructorimpl(r0)
        L41:
            return r2
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2315toStringimpl(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InlineList(holder="
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 41
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.holder
            boolean r2 = m2310equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            int r0 = m2313hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            java.lang.String r0 = m2315toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.Object m2316unboximpl() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            return r0
    }
}
