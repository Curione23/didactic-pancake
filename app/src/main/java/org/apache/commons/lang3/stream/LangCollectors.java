package org.apache.commons.lang3.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class LangCollectors {
    private static final java.util.Set<java.util.stream.Collector.Characteristics> CH_NOID = null;

    /* JADX INFO: renamed from: org.apache.commons.lang3.stream.LangCollectors$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class SimpleCollector<T, A, R> implements java.util.stream.Collector<T, A, R> {
        private final java.util.function.BiConsumer<A, T> accumulator;
        private final java.util.Set<java.util.stream.Collector.Characteristics> characteristics;
        private final java.util.function.BinaryOperator<A> combiner;
        private final java.util.function.Function<A, R> finisher;
        private final java.util.function.Supplier<A> supplier;

        private SimpleCollector(java.util.function.Supplier<A> r1, java.util.function.BiConsumer<A, T> r2, java.util.function.BinaryOperator<A> r3, java.util.function.Function<A, R> r4, java.util.Set<java.util.stream.Collector.Characteristics> r5) {
                r0 = this;
                r0.<init>()
                r0.supplier = r1
                r0.accumulator = r2
                r0.combiner = r3
                r0.finisher = r4
                r0.characteristics = r5
                return
        }

        /* synthetic */ SimpleCollector(java.util.function.Supplier r1, java.util.function.BiConsumer r2, java.util.function.BinaryOperator r3, java.util.function.Function r4, java.util.Set r5, org.apache.commons.lang3.stream.LangCollectors.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // java.util.stream.Collector
        public java.util.function.BiConsumer<A, T> accumulator() {
                r1 = this;
                java.util.function.BiConsumer<A, T> r0 = r1.accumulator
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.Set<java.util.stream.Collector.Characteristics> characteristics() {
                r1 = this;
                java.util.Set<java.util.stream.Collector$Characteristics> r0 = r1.characteristics
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.BinaryOperator<A> combiner() {
                r1 = this;
                java.util.function.BinaryOperator<A> r0 = r1.combiner
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.Function<A, R> finisher() {
                r1 = this;
                java.util.function.Function<A, R> r0 = r1.finisher
                return r0
        }

        @Override // java.util.stream.Collector
        public java.util.function.Supplier<A> supplier() {
                r1 = this;
                java.util.function.Supplier<A> r0 = r1.supplier
                return r0
        }
    }

    public static /* synthetic */ java.lang.StringBuilder $r8$lambda$9qn3NN9X9dxyoDq4Dykq_ahOit4(java.lang.StringBuilder r0, java.lang.Object r1) {
            java.lang.StringBuilder r0 = r0.append(r1)
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$H6Oy0BHoZhDAlEAplH3IpKO3xOc(java.util.StringJoiner r0) {
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static /* synthetic */ java.lang.StringBuilder $r8$lambda$S6aA5w2fxS7Rb4LqItGBv8mBxPY(java.lang.StringBuilder r0, java.lang.CharSequence r1) {
            java.lang.StringBuilder r0 = r0.append(r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$V_uu1X1UKpbECUj-5gbjPr-ONSE, reason: not valid java name */
    public static /* synthetic */ java.lang.StringBuilder m2671$r8$lambda$V_uu1X1UKpbECUj5gbjPrONSE() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$bEK12JPJND67JDB1iFKO0s8n4NA(java.lang.Object r0) {
            java.lang.String r0 = java.util.Objects.toString(r0)
            return r0
    }

    public static /* synthetic */ java.util.StringJoiner $r8$lambda$dE4psNc2M_4Zgo3FI7XRZGtK84A(java.util.StringJoiner r0, java.util.StringJoiner r1) {
            java.util.StringJoiner r0 = r0.merge(r1)
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$hXlGjjCEa8blGX6fSZBIUPgjRGY(java.lang.StringBuilder r0) {
            java.lang.String r0 = r0.toString()
            return r0
    }

    static {
            java.util.Set r0 = java.util.Collections.emptySet()
            org.apache.commons.lang3.stream.LangCollectors.CH_NOID = r0
            return
    }

    private LangCollectors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T, R, A> R collect(java.util.stream.Collector<? super T, A, R> r0, T... r1) {
            java.util.stream.Stream r1 = java.util.Arrays.stream(r1)
            java.lang.Object r0 = r1.collect(r0)
            return r0
    }

    public static java.util.stream.Collector<java.lang.Object, ?, java.lang.String> joining() {
            org.apache.commons.lang3.stream.LangCollectors$SimpleCollector r7 = new org.apache.commons.lang3.stream.LangCollectors$SimpleCollector
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda0
            r1.<init>()
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda1 r2 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda1
            r2.<init>()
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda2 r3 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda2
            r3.<init>()
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda3 r4 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda3
            r4.<init>()
            java.util.Set<java.util.stream.Collector$Characteristics> r5 = org.apache.commons.lang3.stream.LangCollectors.CH_NOID
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.util.stream.Collector<java.lang.Object, ?, java.lang.String> joining(java.lang.CharSequence r1) {
            java.lang.String r0 = ""
            java.util.stream.Collector r1 = joining(r1, r0, r0)
            return r1
    }

    public static java.util.stream.Collector<java.lang.Object, ?, java.lang.String> joining(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3) {
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda8 r0 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda8
            r0.<init>()
            java.util.stream.Collector r1 = joining(r1, r2, r3, r0)
            return r1
    }

    public static java.util.stream.Collector<java.lang.Object, ?, java.lang.String> joining(java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, java.util.function.Function<java.lang.Object, java.lang.String> r11) {
            org.apache.commons.lang3.stream.LangCollectors$SimpleCollector r7 = new org.apache.commons.lang3.stream.LangCollectors$SimpleCollector
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda4 r1 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda4
            r1.<init>(r8, r9, r10)
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda5 r2 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda5
            r2.<init>(r11)
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda6 r3 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda6
            r3.<init>()
            org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda7 r4 = new org.apache.commons.lang3.stream.LangCollectors$$ExternalSyntheticLambda7
            r4.<init>()
            java.util.Set<java.util.stream.Collector$Characteristics> r5 = org.apache.commons.lang3.stream.LangCollectors.CH_NOID
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    static /* synthetic */ java.util.StringJoiner lambda$joining$0(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3) {
            java.util.StringJoiner r0 = new java.util.StringJoiner
            r0.<init>(r1, r2, r3)
            return r0
    }

    static /* synthetic */ void lambda$joining$1(java.util.function.Function r0, java.util.StringJoiner r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.apply(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.add(r0)
            return
    }
}
