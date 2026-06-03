package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/UndispatchedMarker;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "()V", "key", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class UndispatchedMarker implements kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.UndispatchedMarker> {
    public static final kotlinx.coroutines.UndispatchedMarker INSTANCE = null;

    static {
            kotlinx.coroutines.UndispatchedMarker r0 = new kotlinx.coroutines.UndispatchedMarker
            r0.<init>()
            kotlinx.coroutines.UndispatchedMarker.INSTANCE = r0
            return
    }

    private UndispatchedMarker() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r1, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext$Element r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            r0 = r1
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r0, r1)
            return r1
    }
}
