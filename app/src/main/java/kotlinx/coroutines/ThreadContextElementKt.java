package kotlinx.coroutines;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0003H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0019\u0010\t\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u0003H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"asContextElement", "Lkotlinx/coroutines/ThreadContextElement;", "T", "Ljava/lang/ThreadLocal;", "value", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/ThreadContextElement;", "ensurePresent", "", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPresent", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ThreadContextElementKt {
    public static final <T> kotlinx.coroutines.ThreadContextElement<T> asContextElement(java.lang.ThreadLocal<T> r1, T r2) {
            kotlinx.coroutines.internal.ThreadLocalElement r0 = new kotlinx.coroutines.internal.ThreadLocalElement
            r0.<init>(r2, r1)
            kotlinx.coroutines.ThreadContextElement r0 = (kotlinx.coroutines.ThreadContextElement) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.ThreadContextElement asContextElement$default(java.lang.ThreadLocal r0, java.lang.Object r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            java.lang.Object r1 = r0.get()
        L8:
            kotlinx.coroutines.ThreadContextElement r0 = asContextElement(r0, r1)
            return r0
    }

    public static final java.lang.Object ensurePresent(java.lang.ThreadLocal<?> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.internal.ThreadLocalKey r1 = new kotlinx.coroutines.internal.ThreadLocalKey
            r1.<init>(r2)
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            if (r0 == 0) goto L14
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ThreadLocal "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " is missing from context "
            java.lang.StringBuilder r2 = r2.append(r0)
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private static final java.lang.Object ensurePresent$$forInline(java.lang.ThreadLocal<?> r0, kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            r0 = 3
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r0 = 0
            r0.getContext()
            throw r0
    }

    public static final java.lang.Object isPresent(java.lang.ThreadLocal<?> r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            kotlinx.coroutines.internal.ThreadLocalKey r0 = new kotlinx.coroutines.internal.ThreadLocalKey
            r0.<init>(r1)
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r1 = r2.get(r0)
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r1
    }

    private static final java.lang.Object isPresent$$forInline(java.lang.ThreadLocal<?> r0, kotlin.coroutines.Continuation<? super java.lang.Boolean> r1) {
            r0 = 3
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r0 = 0
            r0.getContext()
            throw r0
    }
}
