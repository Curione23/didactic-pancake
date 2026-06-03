package androidx.tracing;

/* JADX INFO: loaded from: classes.dex */
public final class Trace {
    static final java.lang.String TAG = "Trace";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    private Trace() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.beginAsyncSection(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            beginAsyncSectionFallback(r1, r2)
            return
    }

    private static void beginAsyncSectionFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceBegin"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L20
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L35
            androidx.tracing.Trace.sAsyncTraceBeginMethod = r1     // Catch: java.lang.Exception -> L35
        L20:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L35
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L35
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5, r6}     // Catch: java.lang.Exception -> L35
            r6 = 0
            r1.invoke(r6, r5)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r5 = move-exception
            handleException(r0, r5)
        L39:
            return
    }

    public static void beginSection(java.lang.String r0) {
            androidx.tracing.TraceApi18Impl.beginSection(r0)
            return
    }

    public static void endAsyncSection(java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.endAsyncSection(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            endAsyncSectionFallback(r1, r2)
            return
    }

    private static void endAsyncSectionFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceEnd"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L20
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L35
            androidx.tracing.Trace.sAsyncTraceEndMethod = r1     // Catch: java.lang.Exception -> L35
        L20:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L35
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L35
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5, r6}     // Catch: java.lang.Exception -> L35
            r6 = 0
            r1.invoke(r6, r5)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r5 = move-exception
            handleException(r0, r5)
        L39:
            return
    }

    public static void endSection() {
            androidx.tracing.TraceApi18Impl.endSection()
            return
    }

    private static void handleException(java.lang.String r2, java.lang.Exception r3) {
            boolean r0 = r3 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L15
            java.lang.Throwable r2 = r3.getCause()
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 == 0) goto Lf
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        Lf:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to call "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " via reflection"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Trace"
            android.util.Log.v(r0, r2, r3)
            return
    }

    public static boolean isEnabled() {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L9
            boolean r0 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            boolean r0 = isEnabledFallback()
            return r0
    }

    private static boolean isEnabledFallback() {
            java.lang.String r0 = "isTagEnabled"
            r1 = 0
            java.lang.reflect.Method r2 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3c
            r3 = 0
            if (r2 != 0) goto L25
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.String r4 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r2.getField(r4)     // Catch: java.lang.Exception -> L3c
            long r4 = r2.getLong(r3)     // Catch: java.lang.Exception -> L3c
            androidx.tracing.Trace.sTraceTagApp = r4     // Catch: java.lang.Exception -> L3c
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            r4 = 1
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L3c
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L3c
            r4[r1] = r5     // Catch: java.lang.Exception -> L3c
            java.lang.reflect.Method r2 = r2.getMethod(r0, r4)     // Catch: java.lang.Exception -> L3c
            androidx.tracing.Trace.sIsTagEnabledMethod = r2     // Catch: java.lang.Exception -> L3c
        L25:
            java.lang.reflect.Method r2 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3c
            long r4 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L3c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L3c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L3c
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Exception -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L3c
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L3c
            return r0
        L3c:
            r2 = move-exception
            handleException(r0, r2)
            return r1
    }

    public static void setCounter(java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.setCounter(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            setCounterFallback(r1, r2)
            return
    }

    private static void setCounterFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "traceCounter"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L20
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L35
            androidx.tracing.Trace.sTraceCounterMethod = r1     // Catch: java.lang.Exception -> L35
        L20:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L35
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L35
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5, r6}     // Catch: java.lang.Exception -> L35
            r6 = 0
            r1.invoke(r6, r5)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r5 = move-exception
            handleException(r0, r5)
        L39:
            return
    }
}
