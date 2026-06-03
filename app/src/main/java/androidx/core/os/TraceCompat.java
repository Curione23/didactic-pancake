package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class TraceCompat {
    private static final java.lang.String TAG = "TraceCompat";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void beginAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.beginAsyncSection(r0, r1)
                return
        }

        static void endAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.endAsyncSection(r0, r1)
                return
        }

        static boolean isEnabled() {
                boolean r0 = android.os.Trace.isEnabled()
                return r0
        }

        static void setCounter(java.lang.String r0, long r1) {
                android.os.Trace.setCounter(r0, r1)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L7a
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "TRACE_TAG_APP"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L72
            r1 = 0
            long r0 = r0.getLong(r1)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sTraceTagApp = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "isTagEnabled"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L72
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sIsTagEnabledMethod = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "asyncTraceBegin"
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r4[r5] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r2] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r7 = 2
            r4[r7] = r6     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sAsyncTraceBeginMethod = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "asyncTraceEnd"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r4[r5] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r2] = r6     // Catch: java.lang.Exception -> L72
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r4[r7] = r6     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sAsyncTraceEndMethod = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "traceCounter"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r3[r5] = r4     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r2] = r4     // Catch: java.lang.Exception -> L72
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r3[r7] = r2     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sTraceCounterMethod = r0     // Catch: java.lang.Exception -> L72
            goto L7a
        L72:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L7a:
            return
    }

    private TraceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.beginAsyncSection(r3, r4)
            goto L26
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L1f
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L1f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}     // Catch: java.lang.Exception -> L1f
            r4 = 0
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L1f
            goto L26
        L1f:
            java.lang.String r3 = "TraceCompat"
            java.lang.String r4 = "Unable to invoke asyncTraceBegin() via reflection."
            android.util.Log.v(r3, r4)
        L26:
            return
    }

    public static void beginSection(java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    public static void endAsyncSection(java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.endAsyncSection(r3, r4)
            goto L26
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L1f
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L1f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}     // Catch: java.lang.Exception -> L1f
            r4 = 0
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L1f
            goto L26
        L1f:
            java.lang.String r3 = "TraceCompat"
            java.lang.String r4 = "Unable to invoke endAsyncSection() via reflection."
            android.util.Log.v(r3, r4)
        L26:
            return
    }

    public static void endSection() {
            android.os.Trace.endSection()
            return
    }

    public static boolean isEnabled() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.os.TraceCompat.Api29Impl.isEnabled()
            return r0
        Lb:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L23
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L23
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L23
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L23
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L23
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L23
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L23
            return r0
        L23:
            java.lang.String r0 = "TraceCompat"
            java.lang.String r1 = "Unable to invoke isTagEnabled() via reflection."
            android.util.Log.v(r0, r1)
            r0 = 0
            return r0
    }

    public static void setCounter(java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            long r0 = (long) r4
            androidx.core.os.TraceCompat.Api29Impl.setCounter(r3, r0)
            goto L27
        Lb:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sTraceCounterMethod     // Catch: java.lang.Exception -> L20
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L20
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L20
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L20
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}     // Catch: java.lang.Exception -> L20
            r4 = 0
            r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L20
            goto L27
        L20:
            java.lang.String r3 = "TraceCompat"
            java.lang.String r4 = "Unable to invoke traceCounter() via reflection."
            android.util.Log.v(r3, r4)
        L27:
            return
    }
}
