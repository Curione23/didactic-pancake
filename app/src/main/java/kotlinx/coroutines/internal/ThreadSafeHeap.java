package kotlinx.coroutines.internal;

import java.lang.Comparable;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\u0018\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000605j\u0002`6B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0005J2\u0010\u0015\u001a\u0004\u0018\u00018\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"J&\u0010#\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b$\u0010\u0018J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001fH\u0082\u0010¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001fH\u0082\u0010¢\u0006\u0004\b(\u0010'J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+R \u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R$\u00103\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u0010'¨\u00064"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "<init>", "()V", "node", "", "addImpl", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "Lkotlin/Function1;", "", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "Lkotlin/ParameterName;", "name", "value", "predicate", "find", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "", "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "i", "siftDownFrom", "(I)V", "siftUpFrom", "j", "swap", "(II)V", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "()Z", "getSize", "()I", "setSize", "size", "kotlinx-coroutines-core", "", "Lkotlinx/coroutines/internal/SynchronizedObject;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ThreadSafeHeap<T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>> {
    private volatile /* synthetic */ int _size;
    private T[] a;

    public ThreadSafeHeap() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._size = r0
            return
    }

    private final T[] realloc() {
            r3 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.a
            if (r0 != 0) goto La
            r0 = 4
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = new kotlinx.coroutines.internal.ThreadSafeHeapNode[r0]
            r3.a = r0
            goto L24
        La:
            int r1 = r3.getSize()
            int r2 = r0.length
            if (r1 < r2) goto L24
            int r1 = r3.getSize()
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = (kotlinx.coroutines.internal.ThreadSafeHeapNode[]) r0
            r3.a = r0
        L24:
            return r0
    }

    private final void setSize(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    private final void siftDownFrom(int r6) {
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r2 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.swap(r6, r0)
            r6 = r0
            goto L0
    }

    private final void siftUpFrom(int r4) {
            r3 = this;
        L0:
            if (r4 > 0) goto L3
            return
        L3:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r4 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r0 = r0[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r2.compareTo(r0)
            if (r0 > 0) goto L1f
            return
        L1f:
            r3.swap(r4, r1)
            r4 = r1
            goto L0
    }

    private final void swap(int r4, int r5) {
            r3 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0[r5]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = r0[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.setIndex(r4)
            r2.setIndex(r5)
            return
    }

    public final void addImpl(T r4) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            kotlinx.coroutines.internal.ThreadSafeHeap r0 = r4.getHeap()
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L13:
            r4.setHeap(r3)
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = r3.realloc()
            int r1 = r3.getSize()
            int r2 = r1 + 1
            r3.setSize(r2)
            r0[r1] = r4
            r4.setIndex(r1)
            r3.siftUpFrom(r1)
            return
    }

    public final void addLast(T r1) {
            r0 = this;
            monitor-enter(r0)
            r0.addImpl(r1)     // Catch: java.lang.Throwable -> L8
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean addLastIf(T r3, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r2.firstImpl()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L17
            r2.addImpl(r3)     // Catch: java.lang.Throwable -> L20
            r3 = r0
            goto L18
        L17:
            r3 = 0
        L18:
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            monitor-exit(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r3
        L20:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            monitor-exit(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r3
    }

    public final void clear() {
            r6 = this;
            monitor-enter(r6)
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r6.a     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Ld
            r4 = 6
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            kotlin.collections.ArraysKt.fill$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L14
        Ld:
            r0 = 0
            r6._size = r0     // Catch: java.lang.Throwable -> L14
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L14
            monitor-exit(r6)
            return
        L14:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    public final T find(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.getSize()     // Catch: java.lang.Throwable -> L24
            r1 = 0
        L6:
            r2 = 0
            if (r1 >= r0) goto L22
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r3 = r4.a     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto Lf
            r2 = r3[r1]     // Catch: java.lang.Throwable -> L24
        Lf:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r5.invoke(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L24
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L1f
            goto L22
        L1f:
            int r1 = r1 + 1
            goto L6
        L22:
            monitor-exit(r4)
            return r2
        L24:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final T firstImpl() {
            r2 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r2.a
            if (r0 == 0) goto L8
            r1 = 0
            r0 = r0[r1]
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.getSize()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final T peek() {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r1.firstImpl()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean remove(T r2) {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.internal.ThreadSafeHeap r0 = r2.getHeap()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L9
            r2 = 0
            goto L20
        L9:
            int r2 = r2.getIndex()     // Catch: java.lang.Throwable -> L22
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1c
            if (r2 < 0) goto L16
            goto L1c
        L16:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L1c:
            r1.removeAtImpl(r2)     // Catch: java.lang.Throwable -> L22
            r2 = 1
        L20:
            monitor-exit(r1)
            return r2
        L22:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final T removeAtImpl(int r6) {
            r5 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            int r0 = r5.getSize()
            if (r0 <= 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L13:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r5.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5.getSize()
            r2 = -1
            int r1 = r1 + r2
            r5.setSize(r1)
            int r1 = r5.getSize()
            if (r6 >= r1) goto L50
            int r1 = r5.getSize()
            r5.swap(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L4d
            r3 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L4d
            r5.swap(r6, r1)
            r5.siftUpFrom(r1)
            goto L50
        L4d:
            r5.siftDownFrom(r6)
        L50:
            int r6 = r5.getSize()
            r6 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L6c
            kotlinx.coroutines.internal.ThreadSafeHeap r1 = r6.getHeap()
            if (r1 != r5) goto L66
            goto L6c
        L66:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L6c:
            r1 = 0
            r6.setHeap(r1)
            r6.setIndex(r2)
            int r2 = r5.getSize()
            r0[r2] = r1
            return r6
    }

    public final T removeFirstIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r3.firstImpl()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            if (r1 != 0) goto L12
            r4 = 2
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            monitor-exit(r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r2
        L12:
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L24
            r4 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = r3.removeAtImpl(r4)     // Catch: java.lang.Throwable -> L2f
            goto L27
        L24:
            r4 = r2
            kotlinx.coroutines.internal.ThreadSafeHeapNode r4 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r4     // Catch: java.lang.Throwable -> L2f
        L27:
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            monitor-exit(r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r2
        L2f:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            monitor-exit(r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r4
    }

    public final T removeFirstOrNull() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.getSize()     // Catch: java.lang.Throwable -> L13
            if (r0 <= 0) goto Ld
            r0 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r2.removeAtImpl(r0)     // Catch: java.lang.Throwable -> L13
            goto L11
        Ld:
            r0 = 0
            r1 = r0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r1     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
