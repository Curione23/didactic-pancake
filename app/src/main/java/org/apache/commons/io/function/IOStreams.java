package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
final class IOStreams {
    static final java.lang.Object NONE = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            org.apache.commons.io.function.IOStreams.NONE = r0
            return
    }

    private IOStreams() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> void forAll(java.util.stream.Stream<T> r1, org.apache.commons.io.function.IOConsumer<T> r2) throws org.apache.commons.io.IOExceptionList {
            org.apache.commons.io.function.IOStreams$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.function.IOStreams$$ExternalSyntheticLambda1
            r0.<init>()
            forAll(r1, r2, r0)
            return
    }

    static <T> void forAll(java.util.stream.Stream<T> r0, org.apache.commons.io.function.IOConsumer<T> r1, java.util.function.BiFunction<java.lang.Integer, java.io.IOException, java.io.IOException> r2) throws org.apache.commons.io.IOExceptionList {
            org.apache.commons.io.function.IOStream r0 = org.apache.commons.io.function.IOStream.adapt(r0)
            org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda1 r2 = new org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda1
            r2.<init>()
            r0.forAll(r1, r2)
            return
    }

    static <T> void forEach(java.util.stream.Stream<T> r1, org.apache.commons.io.function.IOConsumer<T> r2) throws java.io.IOException {
            org.apache.commons.io.function.IOConsumer r2 = toIOConsumer(r2)
            java.util.stream.Stream r1 = of(r1)
            org.apache.commons.io.function.IOStreams$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.function.IOStreams$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.forEach(r0)
            return
    }

    static /* synthetic */ java.io.IOException lambda$forAll$0(java.lang.Integer r0, java.io.IOException r1) {
            return r1
    }

    static /* synthetic */ void lambda$forEach$1(org.apache.commons.io.function.IOConsumer r0, java.lang.Object r1) {
            org.apache.commons.io.function.Erase.accept(r0, r1)
            return
    }

    static <T> java.util.stream.Stream<T> of(java.lang.Iterable<T> r1) {
            if (r1 != 0) goto L7
            java.util.stream.Stream r1 = java.util.stream.Stream.empty()
            goto L10
        L7:
            java.util.Spliterator r1 = r1.spliterator()
            r0 = 0
            java.util.stream.Stream r1 = java.util.stream.StreamSupport.stream(r1, r0)
        L10:
            return r1
    }

    static <T> java.util.stream.Stream<T> of(java.util.stream.Stream<T> r0) {
            if (r0 != 0) goto L6
            java.util.stream.Stream r0 = java.util.stream.Stream.empty()
        L6:
            return r0
    }

    @java.lang.SafeVarargs
    static <T> java.util.stream.Stream<T> of(T... r0) {
            if (r0 != 0) goto L7
            java.util.stream.Stream r0 = java.util.stream.Stream.empty()
            goto Lb
        L7:
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
        Lb:
            return r0
    }

    static <T> org.apache.commons.io.function.IOConsumer<T> toIOConsumer(org.apache.commons.io.function.IOConsumer<T> r0) {
            if (r0 == 0) goto L3
            goto L7
        L3:
            org.apache.commons.io.function.IOConsumer r0 = org.apache.commons.io.function.IOConsumer.noop()
        L7:
            return r0
    }
}
