package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: FlowExceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "fillInStackTrace", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AbortFlowException extends java.util.concurrent.CancellationException {
    public final transient kotlinx.coroutines.flow.FlowCollector<?> owner;

    public AbortFlowException(kotlinx.coroutines.flow.FlowCollector<?> r2) {
            r1 = this;
            java.lang.String r0 = "Flow was aborted, no more elements needed"
            r1.<init>(r0)
            r1.owner = r2
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getDEBUG()
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = super.fillInStackTrace()
            return r0
        Lb:
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            r1.setStackTrace(r0)
            r0 = r1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }
}
