package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0007\u001a\u00020\b\"\u000e\b\u0000\u0010\t\u0018\u0001*\u00060\u0001j\u0002`\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\b0\fH\u0086\bJ\u0010\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "()V", "isEmpty", "", "()Z", "isRemoved", "forEach", "", "T", "Lkotlinx/coroutines/internal/Node;", "block", "Lkotlin/Function1;", "nextIfRemoved", "remove", "", "validate", "validate$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class LockFreeLinkedListHead extends kotlinx.coroutines.internal.LockFreeLinkedListNode {
    public LockFreeLinkedListHead() {
            r0 = this;
            r0.<init>()
            return
    }

    public final /* synthetic */ <T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> void forEach(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r4) {
            r3 = this;
            java.lang.Object r0 = r3.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        L6:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r1 != 0) goto L1e
            r1 = 3
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r1 == 0) goto L19
            r4.invoke(r0)
        L19:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L6
        L1e:
            return
    }

    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean isRemoved() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    protected kotlinx.coroutines.internal.LockFreeLinkedListNode nextIfRemoved() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.Void remove() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "head cannot be removed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo2317remove() {
            r1 = this;
            java.lang.Void r0 = r1.remove()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void validate$kotlinx_coroutines_core() {
            r4 = this;
            r0 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            java.lang.Object r1 = r4.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r3 = r1
            r1 = r0
            r0 = r3
        Lc:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r2 != 0) goto L1c
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.getNextNode()
            r0.validateNode$kotlinx_coroutines_core(r1, r2)
            r1 = r0
            r0 = r2
            goto Lc
        L1c:
            java.lang.Object r0 = r4.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r4.validateNode$kotlinx_coroutines_core(r1, r0)
            return
    }
}
