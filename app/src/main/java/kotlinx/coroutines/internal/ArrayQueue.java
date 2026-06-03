package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ArrayQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u000eH\u0002J\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0014R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/internal/ArrayQueue;", "T", "", "()V", "elements", "", "[Ljava/lang/Object;", "head", "", "isEmpty", "", "()Z", "tail", "addLast", "", "element", "(Ljava/lang/Object;)V", "clear", "ensureCapacity", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ArrayQueue<T> {
    private java.lang.Object[] elements;
    private int head;
    private int tail;

    public ArrayQueue() {
            r1 = this;
            r1.<init>()
            r0 = 16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.elements = r0
            return
    }

    private final void ensureCapacity() {
            r16 = this;
            r0 = r16
            java.lang.Object[] r1 = r0.elements
            int r8 = r1.length
            int r2 = r8 << 1
            java.lang.Object[] r15 = new java.lang.Object[r2]
            int r4 = r0.head
            r6 = 10
            r7 = 0
            r3 = 0
            r5 = 0
            r2 = r15
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r9 = r0.elements
            int r1 = r9.length
            int r13 = r0.head
            int r11 = r1 - r13
            r14 = 4
            r1 = 0
            r12 = 0
            r10 = r15
            r15 = r1
            kotlin.collections.ArraysKt.copyInto$default(r9, r10, r11, r12, r13, r14, r15)
            r0.elements = r2
            r1 = 0
            r0.head = r1
            r0.tail = r8
            return
    }

    public final void addLast(T r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.elements
            int r1 = r2.tail
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r0.length
            int r3 = r3 + (-1)
            r3 = r3 & r1
            r2.tail = r3
            int r0 = r2.head
            if (r3 != r0) goto L15
            r2.ensureCapacity()
        L15:
            return
    }

    public final void clear() {
            r1 = this;
            r0 = 0
            r1.head = r0
            r1.tail = r0
            java.lang.Object[] r0 = r1.elements
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.elements = r0
            return
    }

    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.head
            int r1 = r2.tail
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final T removeFirstOrNull() {
            r4 = this;
            int r0 = r4.head
            int r1 = r4.tail
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            java.lang.Object[] r1 = r4.elements
            r3 = r1[r0]
            r1[r0] = r2
            int r0 = r0 + 1
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0 & r1
            r4.head = r0
            if (r3 == 0) goto L19
            return r3
        L19:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
    }
}
