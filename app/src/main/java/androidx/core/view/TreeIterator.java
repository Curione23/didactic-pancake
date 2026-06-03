package androidx.core.view;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0011R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/core/view/TreeIterator;", "T", "", "rootIterator", "getChildIterator", "Lkotlin/Function1;", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "iterator", "stack", "", "hasNext", "", "next", "()Ljava/lang/Object;", "prepareNextIterator", "", "item", "(Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TreeIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private final kotlin.jvm.functions.Function1<T, java.util.Iterator<T>> getChildIterator;
    private java.util.Iterator<? extends T> iterator;
    private final java.util.List<java.util.Iterator<T>> stack;

    public TreeIterator(java.util.Iterator<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.getChildIterator = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            r0.stack = r2
            r0.iterator = r1
            return
    }

    private final void prepareNextIterator(T r3) {
            r2 = this;
            kotlin.jvm.functions.Function1<T, java.util.Iterator<T>> r0 = r2.getChildIterator
            java.lang.Object r3 = r0.invoke(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            if (r3 == 0) goto L1a
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.util.List<java.util.Iterator<T>> r0 = r2.stack
            java.util.Iterator<? extends T> r1 = r2.iterator
            r0.add(r1)
            r2.iterator = r3
            goto L3c
        L1a:
            java.util.Iterator<? extends T> r3 = r2.iterator
            boolean r3 = r3.hasNext()
            if (r3 != 0) goto L3c
            java.util.List<java.util.Iterator<T>> r3 = r2.stack
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L3c
            java.util.List<java.util.Iterator<T>> r3 = r2.stack
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            r2.iterator = r3
            java.util.List<java.util.Iterator<T>> r3 = r2.stack
            kotlin.collections.CollectionsKt.removeLast(r3)
            goto L1a
        L3c:
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            r1.prepareNextIterator(r0)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
