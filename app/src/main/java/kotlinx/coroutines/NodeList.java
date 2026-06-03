package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "list", "getList", "()Lkotlinx/coroutines/NodeList;", "getString", "", "state", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NodeList extends kotlinx.coroutines.internal.LockFreeLinkedListHead implements kotlinx.coroutines.Incomplete {
    public NodeList() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.Incomplete
    public kotlinx.coroutines.NodeList getList() {
            r0 = this;
            return r0
    }

    public final java.lang.String getString(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "List{"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "}["
            r0.append(r6)
            r6 = r5
            kotlinx.coroutines.internal.LockFreeLinkedListHead r6 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r6
            java.lang.Object r1 = r6.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 1
        L19:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r3 != 0) goto L37
            boolean r3 = r1 instanceof kotlinx.coroutines.JobNode
            if (r3 == 0) goto L32
            r3 = r1
            kotlinx.coroutines.JobNode r3 = (kotlinx.coroutines.JobNode) r3
            if (r2 == 0) goto L2a
            r2 = 0
            goto L2f
        L2a:
            java.lang.String r4 = ", "
            r0.append(r4)
        L2f:
            r0.append(r3)
        L32:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
            goto L19
        L37:
            java.lang.String r6 = "]"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getDEBUG()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "Active"
            java.lang.String r0 = r1.getString(r0)
            goto L11
        Ld:
            java.lang.String r0 = super.toString()
        L11:
            return r0
    }
}
