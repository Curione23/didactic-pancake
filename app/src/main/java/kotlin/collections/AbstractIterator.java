package kotlin.collections;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\tH\u0004J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "()V", "nextValue", "Ljava/lang/Object;", "state", "Lkotlin/collections/State;", "computeNext", "", "done", "hasNext", "", "next", "()Ljava/lang/Object;", "setNext", "value", "(Ljava/lang/Object;)V", "tryToComputeNext", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private T nextValue;
    private kotlin.collections.State state;

    /* JADX INFO: compiled from: AbstractIterator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.collections.State[] r0 = kotlin.collections.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.collections.State r1 = kotlin.collections.State.Done     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.collections.State r1 = kotlin.collections.State.Ready     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.collections.AbstractIterator.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public AbstractIterator() {
            r1 = this;
            r1.<init>()
            kotlin.collections.State r0 = kotlin.collections.State.NotReady
            r1.state = r0
            return
    }

    private final boolean tryToComputeNext() {
            r2 = this;
            kotlin.collections.State r0 = kotlin.collections.State.Failed
            r2.state = r0
            r2.computeNext()
            kotlin.collections.State r0 = r2.state
            kotlin.collections.State r1 = kotlin.collections.State.Ready
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    protected abstract void computeNext();

    protected final void done() {
            r1 = this;
            kotlin.collections.State r0 = kotlin.collections.State.Done
            r1.state = r0
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r3 = this;
            kotlin.collections.State r0 = r3.state
            kotlin.collections.State r1 = kotlin.collections.State.Failed
            if (r0 == r1) goto L1d
            kotlin.collections.State r0 = r3.state
            int[] r1 = kotlin.collections.AbstractIterator.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L1b
            r2 = 2
            if (r0 == r2) goto L1c
            boolean r1 = r3.tryToComputeNext()
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public T next() {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld
            kotlin.collections.State r0 = kotlin.collections.State.NotReady
            r1.state = r0
            T r0 = r1.nextValue
            return r0
        Ld:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    protected final void setNext(T r1) {
            r0 = this;
            r0.nextValue = r1
            kotlin.collections.State r1 = kotlin.collections.State.Ready
            r0.state = r1
            return
    }
}
