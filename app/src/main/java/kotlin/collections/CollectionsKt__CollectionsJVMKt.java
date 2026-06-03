package kotlin.collections;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0001\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0081\b\u001a\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0081\b\u001a\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0081\b¢\u0006\u0002\u0010\u0015\u001a4\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011\"\u0004\b\u0000\u0010\u00162\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011H\u0081\b¢\u0006\u0002\u0010\u0018\u001a\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002H\u0001\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001b\u001a\u0002H\u0016¢\u0006\u0002\u0010\u001c\u001a1\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\b\u0000\u0010\u0016*\n\u0012\u0006\b\u0001\u0012\u0002H\u00160\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\u0010 \u001a\u001e\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\"H\u0007\u001a&\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\"2\u0006\u0010#\u001a\u00020$H\u0007\u001a\u001f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160&H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"build", "", "E", "builder", "", "buildListInternal", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "checkCountOverflow", "count", "checkIndexOverflow", "index", "copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "createListBuilder", "listOf", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "shuffled", "", "random", "Ljava/util/Random;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsJVMKt {
    public CollectionsKt__CollectionsJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <E> java.util.List<E> build(java.util.List<E> r1) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.builders.ListBuilder r1 = (kotlin.collections.builders.ListBuilder) r1
            java.util.List r1 = r1.build()
            return r1
    }

    private static final <E> java.util.List<E> buildListInternal(int r1, kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder(r1)
            r2.invoke(r1)
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r1)
            return r1
    }

    private static final <E> java.util.List<E> buildListInternal(kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            r1.invoke(r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r0)
            return r1
    }

    private static final int checkCountOverflow(int r3) {
            if (r3 >= 0) goto L17
            r0 = 3
            r1 = 0
            r2 = 1
            boolean r0 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r0, r1)
            if (r0 == 0) goto Lf
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L17
        Lf:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r0 = "Count overflow has happened."
            r3.<init>(r0)
            throw r3
        L17:
            return r3
    }

    private static final int checkIndexOverflow(int r3) {
            if (r3 >= 0) goto L17
            r0 = 3
            r1 = 0
            r2 = 1
            boolean r0 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r0, r1)
            if (r0 == 0) goto Lf
            kotlin.collections.CollectionsKt.throwIndexOverflow()
            goto L17
        Lf:
            java.lang.ArithmeticException r3 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r3.<init>(r0)
            throw r3
        L17:
            return r3
    }

    private static final java.lang.Object[] copyToArrayImpl(java.util.Collection<?> r1) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object[] r1 = kotlin.jvm.internal.CollectionToArray.toArray(r1)
            return r1
    }

    private static final <T> T[] copyToArrayImpl(java.util.Collection<?> r1, T[] r2) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object[] r1 = kotlin.jvm.internal.CollectionToArray.toArray(r1, r2)
            return r1
    }

    public static final <T> java.lang.Object[] copyToArrayOfAny(T[] r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L14
            java.lang.Class r2 = r1.getClass()
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 == 0) goto L14
            goto L20
        L14:
            int r2 = r1.length
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2, r0)
            java.lang.String r2 = "copyOf(this, this.size, Array<Any?>::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L20:
            return r1
    }

    public static final <E> java.util.List<E> createListBuilder() {
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final <E> java.util.List<E> createListBuilder(int r1) {
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final <T> java.util.List<T> listOf(T r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(element)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final <T> java.util.List<T> shuffled(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)
            java.util.Collections.shuffle(r1)
            return r1
    }

    public static final <T> java.util.List<T> shuffled(java.lang.Iterable<? extends T> r1, java.util.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)
            java.util.Collections.shuffle(r1, r2)
            return r1
    }

    private static final <T> java.util.List<T> toList(java.util.Enumeration<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.ArrayList r1 = java.util.Collections.list(r1)
            java.lang.String r0 = "list(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }
}
