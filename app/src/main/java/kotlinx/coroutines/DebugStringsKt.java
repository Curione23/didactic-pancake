package kotlinx.coroutines;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DebugStringsKt {
    public static final java.lang.String getClassSimpleName(java.lang.Object r0) {
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public static final java.lang.String getHexAddress(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    public static final java.lang.String toDebugString(kotlin.coroutines.Continuation<?> r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L9
            java.lang.String r3 = r3.toString()
            goto L61
        L9:
            r0 = 64
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = getHexAddress(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = kotlin.Result.m767constructorimpl(r1)     // Catch: java.lang.Throwable -> L2b
            goto L36
        L2b:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m767constructorimpl(r1)
        L36:
            java.lang.Throwable r2 = kotlin.Result.m770exceptionOrNullimpl(r1)
            if (r2 != 0) goto L3d
            goto L5e
        L3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r3 = getHexAddress(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r1 = r3.toString()
        L5e:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L61:
            return r3
    }
}
