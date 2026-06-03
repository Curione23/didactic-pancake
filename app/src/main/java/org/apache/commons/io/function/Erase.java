package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
public final class Erase {
    private Erase() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T, U> void accept(org.apache.commons.io.function.IOBiConsumer<T, U> r0, T r1, U r2) {
            r0.accept(r1, r2)     // Catch: java.io.IOException -> L4
            goto L8
        L4:
            r0 = move-exception
            rethrow(r0)
        L8:
            return
    }

    static <T> void accept(org.apache.commons.io.function.IOConsumer<T> r0, T r1) {
            r0.accept(r1)     // Catch: java.io.IOException -> L4
            goto L8
        L4:
            r0 = move-exception
            rethrow(r0)
        L8:
            return
    }

    static <T, U, R> R apply(org.apache.commons.io.function.IOBiFunction<? super T, ? super U, ? extends R> r0, T r1, U r2) {
            java.lang.Object r0 = r0.apply(r1, r2)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    static <T, R> R apply(org.apache.commons.io.function.IOFunction<? super T, ? extends R> r0, T r1) {
            java.lang.Object r0 = r0.apply(r1)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    static <T> int compare(org.apache.commons.io.function.IOComparator<? super T> r0, T r1, T r2) {
            int r0 = r0.compare(r1, r2)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    static <T> T get(org.apache.commons.io.function.IOSupplier<T> r0) {
            java.lang.Object r0 = r0.get()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <T extends java.lang.Throwable> java.lang.RuntimeException rethrow(java.lang.Throwable r0) throws java.lang.Throwable {
            throw r0
    }

    static void run(org.apache.commons.io.function.IORunnable r0) {
            r0.run()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    static <T> boolean test(org.apache.commons.io.function.IOPredicate<? super T> r0, T r1) {
            boolean r0 = r0.test(r1)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }
}
