package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
public final class Uncheck {
    private Uncheck() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T, U> void accept(org.apache.commons.io.function.IOBiConsumer<T, U> r0, T r1, U r2) {
            r0.accept(r1, r2)     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T> void accept(org.apache.commons.io.function.IOConsumer<T> r0, T r1) {
            r0.accept(r1)     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T, U, V> void accept(org.apache.commons.io.function.IOTriConsumer<T, U, V> r0, T r1, U r2, V r3) {
            r0.accept(r1, r2, r3)     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T, U, R> R apply(org.apache.commons.io.function.IOBiFunction<T, U, R> r0, T r1, U r2) {
            java.lang.Object r0 = r0.apply(r1, r2)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T, R> R apply(org.apache.commons.io.function.IOFunction<T, R> r0, T r1) {
            java.lang.Object r0 = r0.apply(r1)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T, U, V, W, R> R apply(org.apache.commons.io.function.IOQuadFunction<T, U, V, W, R> r0, T r1, U r2, V r3, W r4) {
            java.lang.Object r0 = r0.apply(r1, r2, r3, r4)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T, U, V, R> R apply(org.apache.commons.io.function.IOTriFunction<T, U, V, R> r0, T r1, U r2, V r3) {
            java.lang.Object r0 = r0.apply(r1, r2, r3)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T> int compare(org.apache.commons.io.function.IOComparator<T> r0, T r1, T r2) {
            int r0 = r0.compare(r1, r2)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T> T get(org.apache.commons.io.function.IOSupplier<T> r0) {
            java.lang.Object r0 = r0.get()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static <T> T get(org.apache.commons.io.function.IOSupplier<T> r0, java.util.function.Supplier<java.lang.String> r1) {
            java.lang.Object r0 = r0.get()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0, r1)
            throw r0
    }

    public static int getAsInt(org.apache.commons.io.function.IOIntSupplier r0) {
            int r0 = r0.getAsInt()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static int getAsInt(org.apache.commons.io.function.IOIntSupplier r0, java.util.function.Supplier<java.lang.String> r1) {
            int r0 = r0.getAsInt()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0, r1)
            throw r0
    }

    public static long getAsLong(org.apache.commons.io.function.IOLongSupplier r2) {
            long r0 = r2.getAsLong()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r2 = move-exception
            java.io.UncheckedIOException r2 = wrap(r2)
            throw r2
    }

    public static long getAsLong(org.apache.commons.io.function.IOLongSupplier r0, java.util.function.Supplier<java.lang.String> r1) {
            long r0 = r0.getAsLong()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0, r1)
            throw r0
    }

    public static void run(org.apache.commons.io.function.IORunnable r0) {
            r0.run()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    public static void run(org.apache.commons.io.function.IORunnable r0, java.util.function.Supplier<java.lang.String> r1) {
            r0.run()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0, r1)
            throw r0
    }

    public static <T> boolean test(org.apache.commons.io.function.IOPredicate<T> r0, T r1) {
            boolean r0 = r0.test(r1)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.io.UncheckedIOException r0 = wrap(r0)
            throw r0
    }

    private static java.io.UncheckedIOException wrap(java.io.IOException r1) {
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r1)
            return r0
    }

    private static java.io.UncheckedIOException wrap(java.io.IOException r1, java.util.function.Supplier<java.lang.String> r2) {
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r2, r1)
            return r0
    }
}
