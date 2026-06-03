package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentUtils {

    static final class ConstantFuture<T> implements java.util.concurrent.Future<T> {
        private final T value;

        ConstantFuture(T r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // java.util.concurrent.Future
        public T get() {
                r1 = this;
                T r0 = r1.value
                return r0
        }

        @Override // java.util.concurrent.Future
        public T get(long r1, java.util.concurrent.TimeUnit r3) {
                r0 = this;
                T r1 = r0.value
                return r1
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    private ConcurrentUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.Throwable checkedException(java.lang.Throwable r3) {
            boolean r0 = org.apache.commons.lang3.exception.ExceptionUtils.isChecked(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not a checked exception: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r1, r2)
            return r3
    }

    public static <T> java.util.concurrent.Future<T> constantFuture(T r1) {
            org.apache.commons.lang3.concurrent.ConcurrentUtils$ConstantFuture r0 = new org.apache.commons.lang3.concurrent.ConcurrentUtils$ConstantFuture
            r0.<init>(r1)
            return r0
    }

    public static <K, V> V createIfAbsent(java.util.concurrent.ConcurrentMap<K, V> r1, K r2, org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> r3) throws org.apache.commons.lang3.concurrent.ConcurrentException {
            if (r1 == 0) goto L15
            if (r3 != 0) goto L5
            goto L15
        L5:
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L14
            java.lang.Object r3 = r3.get()
            java.lang.Object r1 = putIfAbsent(r1, r2, r3)
            return r1
        L14:
            return r0
        L15:
            r1 = 0
            return r1
    }

    public static <K, V> V createIfAbsentUnchecked(java.util.concurrent.ConcurrentMap<K, V> r0, K r1, org.apache.commons.lang3.concurrent.ConcurrentInitializer<V> r2) {
            java.lang.Object r0 = createIfAbsent(r0, r1, r2)     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L5
            return r0
        L5:
            r0 = move-exception
            org.apache.commons.lang3.concurrent.ConcurrentRuntimeException r1 = new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentException extractCause(java.util.concurrent.ExecutionException r2) {
            if (r2 == 0) goto L1e
            java.lang.Throwable r0 = r2.getCause()
            if (r0 != 0) goto L9
            goto L1e
        L9:
            java.lang.Throwable r0 = r2.getCause()
            org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(r0)
            org.apache.commons.lang3.concurrent.ConcurrentException r0 = new org.apache.commons.lang3.concurrent.ConcurrentException
            java.lang.String r1 = r2.getMessage()
            java.lang.Throwable r2 = r2.getCause()
            r0.<init>(r1, r2)
            return r0
        L1e:
            r2 = 0
            return r2
    }

    public static org.apache.commons.lang3.concurrent.ConcurrentRuntimeException extractCauseUnchecked(java.util.concurrent.ExecutionException r2) {
            if (r2 == 0) goto L1e
            java.lang.Throwable r0 = r2.getCause()
            if (r0 != 0) goto L9
            goto L1e
        L9:
            java.lang.Throwable r0 = r2.getCause()
            org.apache.commons.lang3.exception.ExceptionUtils.throwUnchecked(r0)
            org.apache.commons.lang3.concurrent.ConcurrentRuntimeException r0 = new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException
            java.lang.String r1 = r2.getMessage()
            java.lang.Throwable r2 = r2.getCause()
            r0.<init>(r1, r2)
            return r0
        L1e:
            r2 = 0
            return r2
    }

    public static void handleCause(java.util.concurrent.ExecutionException r0) throws org.apache.commons.lang3.concurrent.ConcurrentException {
            org.apache.commons.lang3.concurrent.ConcurrentException r0 = extractCause(r0)
            if (r0 != 0) goto L7
            return
        L7:
            throw r0
    }

    public static void handleCauseUnchecked(java.util.concurrent.ExecutionException r0) {
            org.apache.commons.lang3.concurrent.ConcurrentRuntimeException r0 = extractCauseUnchecked(r0)
            if (r0 != 0) goto L7
            return
        L7:
            throw r0
    }

    public static <T> T initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> r0) throws org.apache.commons.lang3.concurrent.ConcurrentException {
            if (r0 == 0) goto L7
            java.lang.Object r0 = r0.get()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static <T> T initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> r1) {
            java.lang.Object r1 = initialize(r1)     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L5
            return r1
        L5:
            r1 = move-exception
            org.apache.commons.lang3.concurrent.ConcurrentRuntimeException r0 = new org.apache.commons.lang3.concurrent.ConcurrentRuntimeException
            java.lang.Throwable r1 = r1.getCause()
            r0.<init>(r1)
            throw r0
    }

    public static <K, V> V putIfAbsent(java.util.concurrent.ConcurrentMap<K, V> r0, K r1, V r2) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            if (r0 == 0) goto Lb
            r2 = r0
        Lb:
            return r2
    }
}
