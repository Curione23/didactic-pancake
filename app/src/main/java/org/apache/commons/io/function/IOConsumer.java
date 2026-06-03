package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface IOConsumer<T> {
    public static final org.apache.commons.io.function.IOConsumer<?> NOOP_IO_CONSUMER = null;

    static {
            org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda3
            r0.<init>()
            org.apache.commons.io.function.IOConsumer.NOOP_IO_CONSUMER = r0
            return
    }

    static <T> void forAll(org.apache.commons.io.function.IOConsumer<T> r0, java.lang.Iterable<T> r1) throws org.apache.commons.io.IOExceptionList {
            java.util.stream.Stream r1 = org.apache.commons.io.function.IOStreams.of(r1)
            org.apache.commons.io.function.IOStreams.forAll(r1, r0)
            return
    }

    static <T> void forAll(org.apache.commons.io.function.IOConsumer<T> r1, java.util.stream.Stream<T> r2) throws org.apache.commons.io.IOExceptionList {
            org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda1
            r0.<init>()
            org.apache.commons.io.function.IOStreams.forAll(r2, r1, r0)
            return
    }

    @java.lang.SafeVarargs
    static <T> void forAll(org.apache.commons.io.function.IOConsumer<T> r0, T... r1) throws org.apache.commons.io.IOExceptionList {
            java.util.stream.Stream r1 = org.apache.commons.io.function.IOStreams.of(r1)
            org.apache.commons.io.function.IOStreams.forAll(r1, r0)
            return
    }

    static <T> void forEach(java.lang.Iterable<T> r0, org.apache.commons.io.function.IOConsumer<T> r1) throws java.io.IOException {
            java.util.stream.Stream r0 = org.apache.commons.io.function.IOStreams.of(r0)
            org.apache.commons.io.function.IOStreams.forEach(r0, r1)
            return
    }

    static <T> void forEach(java.util.stream.Stream<T> r0, org.apache.commons.io.function.IOConsumer<T> r1) throws java.io.IOException {
            org.apache.commons.io.function.IOStreams.forEach(r0, r1)
            return
    }

    static <T> void forEach(T[] r0, org.apache.commons.io.function.IOConsumer<T> r1) throws java.io.IOException {
            java.util.stream.Stream r0 = org.apache.commons.io.function.IOStreams.of(r0)
            org.apache.commons.io.function.IOStreams.forEach(r0, r1)
            return
    }

    static /* synthetic */ void lambda$andThen$1(org.apache.commons.io.function.IOConsumer r0, org.apache.commons.io.function.IOConsumer r1, java.lang.Object r2) throws java.io.IOException {
            r0.accept(r2)
            r1.accept(r2)
            return
    }

    static /* synthetic */ void lambda$asConsumer$2(org.apache.commons.io.function.IOConsumer r0, java.lang.Object r1) {
            org.apache.commons.io.function.Uncheck.accept(r0, r1)
            return
    }

    static /* synthetic */ void lambda$static$0(java.lang.Object r0) throws java.io.IOException {
            return
    }

    static <T> org.apache.commons.io.function.IOConsumer<T> noop() {
            org.apache.commons.io.function.IOConsumer<?> r0 = org.apache.commons.io.function.IOConsumer.NOOP_IO_CONSUMER
            return r0
    }

    void accept(T r1) throws java.io.IOException;

    default org.apache.commons.io.function.IOConsumer<T> andThen(org.apache.commons.io.function.IOConsumer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "after"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda2
            r0.<init>(r1, r2)
            return r0
    }

    default java.util.function.Consumer<T> asConsumer() {
            r1 = this;
            org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }
}
