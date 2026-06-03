package kotlinx.coroutines.android;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "_preHandler", "", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "preHandler", "Ljava/lang/reflect/Method;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidExceptionPreHandler extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    private volatile java.lang.Object _preHandler;

    public AndroidExceptionPreHandler() {
            r1 = this;
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    private final java.lang.reflect.Method preHandler() {
            r4 = this;
            java.lang.Object r0 = r4._preHandler
            if (r0 == r4) goto L7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L7:
            r0 = 0
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L29
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L29
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2c
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L29
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2c
            r0 = r1
            goto L2c
        L29:
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
        L2c:
            r4._preHandler = r0
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(kotlin.coroutines.CoroutineContext r3, java.lang.Throwable r4) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 >= r0) goto L26
            java.lang.reflect.Method r3 = r2.preHandler()
            r0 = 0
            if (r3 == 0) goto L15
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r3.invoke(r0, r1)
            goto L16
        L15:
            r3 = r0
        L16:
            boolean r1 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L1d
            r0 = r3
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L1d:
            if (r0 == 0) goto L26
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0.uncaughtException(r3, r4)
        L26:
            return
    }
}
