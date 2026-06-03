package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public final class AppendableJoiner<T> {
    private final org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> appender;
    private final java.lang.CharSequence delimiter;
    private final java.lang.CharSequence prefix;
    private final java.lang.CharSequence suffix;

    /* JADX INFO: renamed from: org.apache.commons.lang3.AppendableJoiner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder<T> implements java.util.function.Supplier<org.apache.commons.lang3.AppendableJoiner<T>> {
        private org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> appender;
        private java.lang.CharSequence delimiter;
        private java.lang.CharSequence prefix;
        private java.lang.CharSequence suffix;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.function.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                org.apache.commons.lang3.AppendableJoiner r0 = r1.get()
                return r0
        }

        @Override // java.util.function.Supplier
        public org.apache.commons.lang3.AppendableJoiner<T> get() {
                r7 = this;
                org.apache.commons.lang3.AppendableJoiner r6 = new org.apache.commons.lang3.AppendableJoiner
                java.lang.CharSequence r1 = r7.prefix
                java.lang.CharSequence r2 = r7.suffix
                java.lang.CharSequence r3 = r7.delimiter
                org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4 = r7.appender
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public org.apache.commons.lang3.AppendableJoiner.Builder<T> setDelimiter(java.lang.CharSequence r1) {
                r0 = this;
                r0.delimiter = r1
                return r0
        }

        public org.apache.commons.lang3.AppendableJoiner.Builder<T> setElementAppender(org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r1) {
                r0 = this;
                r0.appender = r1
                return r0
        }

        public org.apache.commons.lang3.AppendableJoiner.Builder<T> setPrefix(java.lang.CharSequence r1) {
                r0 = this;
                r0.prefix = r1
                return r0
        }

        public org.apache.commons.lang3.AppendableJoiner.Builder<T> setSuffix(java.lang.CharSequence r1) {
                r0 = this;
                r0.suffix = r1
                return r0
        }
    }

    private AppendableJoiner(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4) {
            r0 = this;
            r0.<init>()
            java.lang.CharSequence r1 = nonNull(r1)
            r0.prefix = r1
            java.lang.CharSequence r1 = nonNull(r2)
            r0.suffix = r1
            java.lang.CharSequence r1 = nonNull(r3)
            r0.delimiter = r1
            if (r4 == 0) goto L18
            goto L1d
        L18:
            org.apache.commons.lang3.AppendableJoiner$$ExternalSyntheticLambda0 r4 = new org.apache.commons.lang3.AppendableJoiner$$ExternalSyntheticLambda0
            r4.<init>()
        L1d:
            r0.appender = r4
            return
    }

    /* synthetic */ AppendableJoiner(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, org.apache.commons.lang3.function.FailableBiConsumer r4, org.apache.commons.lang3.AppendableJoiner.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static <T> org.apache.commons.lang3.AppendableJoiner.Builder<T> builder() {
            org.apache.commons.lang3.AppendableJoiner$Builder r0 = new org.apache.commons.lang3.AppendableJoiner$Builder
            r0.<init>()
            return r0
    }

    @java.lang.SafeVarargs
    static <A extends java.lang.Appendable, T> A joinA(A r0, java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4, T... r5) throws java.io.IOException {
            java.lang.Appendable r0 = joinArray(r0, r1, r2, r3, r4, r5)
            return r0
    }

    private static <A extends java.lang.Appendable, T> A joinArray(A r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r5, T[] r6) throws java.io.IOException {
            r1.append(r2)
            if (r6 == 0) goto L1d
            int r2 = r6.length
            if (r2 <= 0) goto Le
            r2 = 0
            r2 = r6[r2]
            r5.accept(r1, r2)
        Le:
            r2 = 1
        Lf:
            int r0 = r6.length
            if (r2 >= r0) goto L1d
            r1.append(r4)
            r0 = r6[r2]
            r5.accept(r1, r0)
            int r2 = r2 + 1
            goto Lf
        L1d:
            r1.append(r3)
            return r1
    }

    static <T> java.lang.StringBuilder joinI(java.lang.StringBuilder r0, java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4, java.lang.Iterable<T> r5) {
            java.lang.Appendable r0 = joinIterable(r0, r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L7
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            org.apache.commons.lang3.exception.UncheckedException r1 = new org.apache.commons.lang3.exception.UncheckedException
            r1.<init>(r0)
            throw r1
    }

    private static <A extends java.lang.Appendable, T> A joinIterable(A r0, java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4, java.lang.Iterable<T> r5) throws java.io.IOException {
            r0.append(r1)
            if (r5 == 0) goto L27
            java.util.Iterator r1 = r5.iterator()
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L16
            java.lang.Object r5 = r1.next()
            r4.accept(r0, r5)
        L16:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L27
            r0.append(r3)
            java.lang.Object r5 = r1.next()
            r4.accept(r0, r5)
            goto L16
        L27:
            r0.append(r2)
            return r0
    }

    @java.lang.SafeVarargs
    static <T> java.lang.StringBuilder joinSB(java.lang.StringBuilder r0, java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4, T... r5) {
            java.lang.Appendable r0 = joinArray(r0, r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L7
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            org.apache.commons.lang3.exception.UncheckedException r1 = new org.apache.commons.lang3.exception.UncheckedException
            r1.<init>(r0)
            throw r1
    }

    static /* synthetic */ void lambda$new$0(java.lang.Appendable r0, java.lang.Object r1) throws java.io.IOException {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            return
    }

    private static java.lang.CharSequence nonNull(java.lang.CharSequence r0) {
            if (r0 == 0) goto L3
            goto L5
        L3:
            java.lang.String r0 = ""
        L5:
            return r0
    }

    public java.lang.StringBuilder join(java.lang.StringBuilder r7, java.lang.Iterable<T> r8) {
            r6 = this;
            java.lang.CharSequence r1 = r6.prefix
            java.lang.CharSequence r2 = r6.suffix
            java.lang.CharSequence r3 = r6.delimiter
            org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4 = r6.appender
            r0 = r7
            r5 = r8
            java.lang.StringBuilder r7 = joinI(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public java.lang.StringBuilder join(java.lang.StringBuilder r7, T... r8) {
            r6 = this;
            java.lang.CharSequence r1 = r6.prefix
            java.lang.CharSequence r2 = r6.suffix
            java.lang.CharSequence r3 = r6.delimiter
            org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4 = r6.appender
            r0 = r7
            r5 = r8
            java.lang.StringBuilder r7 = joinSB(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public <A extends java.lang.Appendable> A joinA(A r7, java.lang.Iterable<T> r8) throws java.io.IOException {
            r6 = this;
            java.lang.CharSequence r1 = r6.prefix
            java.lang.CharSequence r2 = r6.suffix
            java.lang.CharSequence r3 = r6.delimiter
            org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4 = r6.appender
            r0 = r7
            r5 = r8
            java.lang.Appendable r7 = joinIterable(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public <A extends java.lang.Appendable> A joinA(A r7, T... r8) throws java.io.IOException {
            r6 = this;
            java.lang.CharSequence r1 = r6.prefix
            java.lang.CharSequence r2 = r6.suffix
            java.lang.CharSequence r3 = r6.delimiter
            org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Appendable, T, java.io.IOException> r4 = r6.appender
            r0 = r7
            r5 = r8
            java.lang.Appendable r7 = joinA(r0, r1, r2, r3, r4, r5)
            return r7
    }
}
