package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOFunction<T, R> {
    static <T> org.apache.commons.io.function.IOFunction<T, T> identity() {
            org.apache.commons.io.function.IOFunction r0 = org.apache.commons.io.function.Constants.IO_FUNCTION_ID
            return r0
    }

    static /* synthetic */ void lambda$andThen$0(org.apache.commons.io.function.IOFunction r0, java.util.function.Consumer r1, java.lang.Object r2) throws java.io.IOException {
            java.lang.Object r2 = r0.apply(r2)
            r1.accept(r2)
            return
    }

    static /* synthetic */ java.lang.Object lambda$andThen$1(org.apache.commons.io.function.IOFunction r0, java.util.function.Function r1, java.lang.Object r2) throws java.io.IOException {
            java.lang.Object r2 = r0.apply(r2)
            java.lang.Object r1 = r1.apply(r2)
            return r1
    }

    static /* synthetic */ void lambda$andThen$2(org.apache.commons.io.function.IOFunction r0, org.apache.commons.io.function.IOConsumer r1, java.lang.Object r2) throws java.io.IOException {
            java.lang.Object r2 = r0.apply(r2)
            r1.accept(r2)
            return
    }

    static /* synthetic */ java.lang.Object lambda$andThen$3(org.apache.commons.io.function.IOFunction r0, org.apache.commons.io.function.IOFunction r1, java.lang.Object r2) throws java.io.IOException {
            java.lang.Object r2 = r0.apply(r2)
            java.lang.Object r1 = r1.apply(r2)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$asFunction$4(org.apache.commons.io.function.IOFunction r0, java.lang.Object r1) {
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$compose$5(org.apache.commons.io.function.IOFunction r0, java.util.function.Function r1, java.lang.Object r2) throws java.io.IOException {
            java.lang.Object r1 = r1.apply(r2)
            java.lang.Object r1 = r0.apply(r1)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$compose$6(org.apache.commons.io.function.IOFunction r0, org.apache.commons.io.function.IOFunction r1, java.lang.Object r2) throws java.io.IOException {
            java.lang.Object r1 = r1.apply(r2)
            java.lang.Object r1 = r0.apply(r1)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$compose$7(org.apache.commons.io.function.IOFunction r0, org.apache.commons.io.function.IOSupplier r1) throws java.io.IOException {
            java.lang.Object r1 = r1.get()
            java.lang.Object r1 = r0.apply(r1)
            return r1
    }

    static /* synthetic */ java.lang.Object lambda$compose$8(org.apache.commons.io.function.IOFunction r0, java.util.function.Supplier r1) throws java.io.IOException {
            java.lang.Object r1 = r1.get()
            java.lang.Object r1 = r0.apply(r1)
            return r1
    }

    default org.apache.commons.io.function.IOConsumer<T> andThen(java.util.function.Consumer<? super R> r2) {
            r1 = this;
            java.lang.String r0 = "after"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda5
            r0.<init>(r1, r2)
            return r0
    }

    default org.apache.commons.io.function.IOConsumer<T> andThen(org.apache.commons.io.function.IOConsumer<? super R> r2) {
            r1 = this;
            java.lang.String r0 = "after"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda3
            r0.<init>(r1, r2)
            return r0
    }

    default <V> org.apache.commons.io.function.IOFunction<T, V> andThen(java.util.function.Function<? super R, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "after"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda4
            r0.<init>(r1, r2)
            return r0
    }

    default <V> org.apache.commons.io.function.IOFunction<T, V> andThen(org.apache.commons.io.function.IOFunction<? super R, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "after"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            return r0
    }

    R apply(T r1) throws java.io.IOException;

    default java.util.function.Function<T, R> asFunction() {
            r1 = this;
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    default <V> org.apache.commons.io.function.IOFunction<V, R> compose(java.util.function.Function<? super V, ? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "before"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }

    default <V> org.apache.commons.io.function.IOFunction<V, R> compose(org.apache.commons.io.function.IOFunction<? super V, ? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "before"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda7 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda7
            r0.<init>(r1, r2)
            return r0
    }

    default org.apache.commons.io.function.IOSupplier<R> compose(java.util.function.Supplier<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "before"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda8 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda8
            r0.<init>(r1, r2)
            return r0
    }

    default org.apache.commons.io.function.IOSupplier<R> compose(org.apache.commons.io.function.IOSupplier<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "before"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.function.IOFunction$$ExternalSyntheticLambda6
            r0.<init>(r1, r2)
            return r0
    }
}
