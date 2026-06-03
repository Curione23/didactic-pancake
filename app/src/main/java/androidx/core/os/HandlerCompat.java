package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerCompat {
    private static final java.lang.String TAG = "HandlerCompat";

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler createAsync(android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }

        public static android.os.Handler createAsync(android.os.Looper r0, android.os.Handler.Callback r1) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0, r1)
                return r0
        }

        public static boolean postDelayed(android.os.Handler r0, java.lang.Runnable r1, java.lang.Object r2, long r3) {
                boolean r0 = r0.postDelayed(r1, r2, r3)
                return r0
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean hasCallbacks(android.os.Handler r0, java.lang.Runnable r1) {
                boolean r0 = r0.hasCallbacks(r1)
                return r0
        }
    }

    private HandlerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Handler createAsync(android.os.Looper r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r5 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r5)
            return r5
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            java.lang.Class<android.os.Looper> r2 = android.os.Looper.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            r4 = 2
            r1[r4] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r2, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4c java.lang.InstantiationException -> L4e java.lang.IllegalAccessException -> L50
            return r0
        L33:
            r5 = move-exception
            java.lang.Throwable r5 = r5.getCause()
            boolean r0 = r5 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L49
            boolean r0 = r5 instanceof java.lang.Error
            if (r0 == 0) goto L43
            java.lang.Error r5 = (java.lang.Error) r5
            throw r5
        L43:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L49:
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
        L4c:
            r0 = move-exception
            goto L51
        L4e:
            r0 = move-exception
            goto L51
        L50:
            r0 = move-exception
        L51:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r5)
            return r0
    }

    public static android.os.Handler createAsync(android.os.Looper r5, android.os.Handler.Callback r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r5 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r5, r6)
            return r5
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            java.lang.Class<android.os.Looper> r2 = android.os.Looper.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            r4 = 2
            r1[r4] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r6, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4b java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L4f
            return r0
        L32:
            r5 = move-exception
            java.lang.Throwable r5 = r5.getCause()
            boolean r6 = r5 instanceof java.lang.RuntimeException
            if (r6 != 0) goto L48
            boolean r6 = r5 instanceof java.lang.Error
            if (r6 == 0) goto L42
            java.lang.Error r5 = (java.lang.Error) r5
            throw r5
        L42:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L48:
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
        L4b:
            r0 = move-exception
            goto L50
        L4d:
            r0 = move-exception
            goto L50
        L4f:
            r0 = move-exception
        L50:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r5, r6)
            return r0
    }

    public static boolean hasCallbacks(android.os.Handler r5, java.lang.Runnable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r5 = androidx.core.os.HandlerCompat.Api29Impl.hasCallbacks(r5, r6)
            return r5
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.String r1 = "hasCallbacks"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Class<java.lang.Runnable> r3 = java.lang.Runnable.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Object r5 = r0.invoke(r5, r6)     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            boolean r5 = r5.booleanValue()     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            return r5
        L2a:
            r5 = move-exception
            goto L2f
        L2c:
            r5 = move-exception
            goto L2f
        L2e:
            r5 = move-exception
        L2f:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception."
            r6.<init>(r0, r5)
            throw r6
        L37:
            r5 = move-exception
            java.lang.Throwable r5 = r5.getCause()
            boolean r6 = r5 instanceof java.lang.RuntimeException
            if (r6 != 0) goto L4d
            boolean r6 = r5 instanceof java.lang.Error
            if (r6 == 0) goto L47
            java.lang.Error r5 = (java.lang.Error) r5
            throw r5
        L47:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L4d:
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            throw r5
    }

    public static boolean postDelayed(android.os.Handler r2, java.lang.Runnable r3, java.lang.Object r4, long r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.os.HandlerCompat.Api28Impl.postDelayed(r2, r3, r4, r5)
            return r2
        Lb:
            android.os.Message r3 = android.os.Message.obtain(r2, r3)
            r3.obj = r4
            boolean r2 = r2.sendMessageDelayed(r3, r5)
            return r2
    }
}
