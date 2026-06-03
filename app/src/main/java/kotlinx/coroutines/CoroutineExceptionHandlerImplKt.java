package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"handlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleCoroutineExceptionImpl", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CoroutineExceptionHandlerImplKt {
    private static final java.util.List<kotlinx.coroutines.CoroutineExceptionHandler> handlers = null;

    static {
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r1 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
            kotlinx.coroutines.CoroutineExceptionHandlerImplKt.handlers = r0
            return
    }

    public static final void handleCoroutineExceptionImpl(kotlin.coroutines.CoroutineContext r4, java.lang.Throwable r5) {
            java.util.List<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandlerImplKt.handlers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            r1.handleException(r4, r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r2.getUncaughtExceptionHandler()
            java.lang.Throwable r1 = kotlinx.coroutines.CoroutineExceptionHandlerKt.handlerException(r5, r1)
            r3.uncaughtException(r2, r1)
            goto L6
        L27:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3d
            kotlinx.coroutines.DiagnosticCoroutineContextException r1 = new kotlinx.coroutines.DiagnosticCoroutineContextException     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L3d
            kotlin.ExceptionsKt.addSuppressed(r5, r1)     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
            kotlin.Result.m767constructorimpl(r4)     // Catch: java.lang.Throwable -> L3d
            goto L47
        L3d:
            r4 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            kotlin.Result.m767constructorimpl(r4)
        L47:
            java.lang.Thread$UncaughtExceptionHandler r4 = r0.getUncaughtExceptionHandler()
            r4.uncaughtException(r0, r5)
            return
    }
}
