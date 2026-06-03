package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class JwtValidator {
    private static final java.time.Duration MAX_CLOCK_SKEW = null;
    private final boolean allowMissingExpiration;
    private final java.time.Clock clock;
    private final java.time.Duration clockSkew;
    private final boolean expectIssuedInThePast;
    private final java.util.Optional<java.lang.String> expectedAudience;
    private final java.util.Optional<java.lang.String> expectedIssuer;
    private final java.util.Optional<java.lang.String> expectedTypeHeader;
    private final boolean ignoreAudiences;
    private final boolean ignoreIssuer;
    private final boolean ignoreTypeHeader;

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtValidator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean allowMissingExpiration;
        private java.time.Clock clock;
        private java.time.Duration clockSkew;
        private boolean expectIssuedInThePast;
        private java.util.Optional<java.lang.String> expectedAudience;
        private java.util.Optional<java.lang.String> expectedIssuer;
        private java.util.Optional<java.lang.String> expectedTypeHeader;
        private boolean ignoreAudiences;
        private boolean ignoreIssuer;
        private boolean ignoreTypeHeader;

        private Builder() {
                r2 = this;
                r2.<init>()
                java.time.Clock r0 = java.time.Clock.systemUTC()
                r2.clock = r0
                java.time.Duration r0 = java.time.Duration.ZERO
                r2.clockSkew = r0
                java.util.Optional r0 = java.util.Optional.empty()
                r2.expectedTypeHeader = r0
                r0 = 0
                r2.ignoreTypeHeader = r0
                java.util.Optional r1 = java.util.Optional.empty()
                r2.expectedIssuer = r1
                r2.ignoreIssuer = r0
                java.util.Optional r1 = java.util.Optional.empty()
                r2.expectedAudience = r1
                r2.ignoreAudiences = r0
                r2.allowMissingExpiration = r0
                r2.expectIssuedInThePast = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.jwt.JwtValidator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.Optional access$000(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                java.util.Optional<java.lang.String> r0 = r0.expectedTypeHeader
                return r0
        }

        static /* synthetic */ boolean access$100(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                boolean r0 = r0.ignoreTypeHeader
                return r0
        }

        static /* synthetic */ java.util.Optional access$200(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                java.util.Optional<java.lang.String> r0 = r0.expectedIssuer
                return r0
        }

        static /* synthetic */ boolean access$300(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                boolean r0 = r0.ignoreIssuer
                return r0
        }

        static /* synthetic */ java.util.Optional access$400(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                java.util.Optional<java.lang.String> r0 = r0.expectedAudience
                return r0
        }

        static /* synthetic */ boolean access$500(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                boolean r0 = r0.ignoreAudiences
                return r0
        }

        static /* synthetic */ boolean access$600(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                boolean r0 = r0.allowMissingExpiration
                return r0
        }

        static /* synthetic */ boolean access$700(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                boolean r0 = r0.expectIssuedInThePast
                return r0
        }

        static /* synthetic */ java.time.Clock access$800(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                java.time.Clock r0 = r0.clock
                return r0
        }

        static /* synthetic */ java.time.Duration access$900(com.google.crypto.tink.jwt.JwtValidator.Builder r0) {
                java.time.Duration r0 = r0.clockSkew
                return r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder allowMissingExpiration() {
                r1 = this;
                r0 = 1
                r1.allowMissingExpiration = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator build() {
                r2 = this;
                boolean r0 = r2.ignoreTypeHeader
                if (r0 == 0) goto L15
                java.util.Optional<java.lang.String> r0 = r2.expectedTypeHeader
                boolean r0 = r0.isPresent()
                if (r0 != 0) goto Ld
                goto L15
            Ld:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "ignoreTypeHeader() and expectedTypeHeader() cannot be used together."
                r0.<init>(r1)
                throw r0
            L15:
                boolean r0 = r2.ignoreIssuer
                if (r0 == 0) goto L2a
                java.util.Optional<java.lang.String> r0 = r2.expectedIssuer
                boolean r0 = r0.isPresent()
                if (r0 != 0) goto L22
                goto L2a
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "ignoreIssuer() and expectedIssuer() cannot be used together."
                r0.<init>(r1)
                throw r0
            L2a:
                boolean r0 = r2.ignoreAudiences
                if (r0 == 0) goto L3f
                java.util.Optional<java.lang.String> r0 = r2.expectedAudience
                boolean r0 = r0.isPresent()
                if (r0 != 0) goto L37
                goto L3f
            L37:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "ignoreAudiences() and expectedAudience() cannot be used together."
                r0.<init>(r1)
                throw r0
            L3f:
                com.google.crypto.tink.jwt.JwtValidator r0 = new com.google.crypto.tink.jwt.JwtValidator
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectAudience(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L9
                java.util.Optional r2 = java.util.Optional.of(r2)
                r1.expectedAudience = r2
                return r1
            L9:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "audience cannot be null"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectIssuedInThePast() {
                r1 = this;
                r0 = 1
                r1.expectIssuedInThePast = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectIssuer(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L9
                java.util.Optional r2 = java.util.Optional.of(r2)
                r1.expectedIssuer = r2
                return r1
            L9:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "issuer cannot be null"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectTypeHeader(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L9
                java.util.Optional r2 = java.util.Optional.of(r2)
                r1.expectedTypeHeader = r2
                return r1
            L9:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "typ header cannot be null"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder ignoreAudiences() {
                r1 = this;
                r0 = 1
                r1.ignoreAudiences = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder ignoreIssuer() {
                r1 = this;
                r0 = 1
                r1.ignoreIssuer = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder ignoreTypeHeader() {
                r1 = this;
                r0 = 1
                r1.ignoreTypeHeader = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder setClock(java.time.Clock r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.clock = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "clock cannot be null"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder setClockSkew(java.time.Duration r2) {
                r1 = this;
                java.time.Duration r0 = com.google.crypto.tink.jwt.JwtValidator.access$1100()
                int r0 = r2.compareTo(r0)
                if (r0 > 0) goto Ld
                r1.clockSkew = r2
                return r1
            Ld:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Clock skew too large, max is 10 minutes"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            r0 = 10
            java.time.Duration r0 = java.time.Duration.ofMinutes(r0)
            com.google.crypto.tink.jwt.JwtValidator.MAX_CLOCK_SKEW = r0
            return
    }

    private JwtValidator(com.google.crypto.tink.jwt.JwtValidator.Builder r2) {
            r1 = this;
            r1.<init>()
            java.util.Optional r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$000(r2)
            r1.expectedTypeHeader = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$100(r2)
            r1.ignoreTypeHeader = r0
            java.util.Optional r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$200(r2)
            r1.expectedIssuer = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$300(r2)
            r1.ignoreIssuer = r0
            java.util.Optional r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$400(r2)
            r1.expectedAudience = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$500(r2)
            r1.ignoreAudiences = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$600(r2)
            r1.allowMissingExpiration = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$700(r2)
            r1.expectIssuedInThePast = r0
            java.time.Clock r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$800(r2)
            r1.clock = r0
            java.time.Duration r2 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$900(r2)
            r1.clockSkew = r2
            return
    }

    /* synthetic */ JwtValidator(com.google.crypto.tink.jwt.JwtValidator.Builder r1, com.google.crypto.tink.jwt.JwtValidator.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.time.Duration access$1100() {
            java.time.Duration r0 = com.google.crypto.tink.jwt.JwtValidator.MAX_CLOCK_SKEW
            return r0
    }

    public static com.google.crypto.tink.jwt.JwtValidator.Builder newBuilder() {
            com.google.crypto.tink.jwt.JwtValidator$Builder r0 = new com.google.crypto.tink.jwt.JwtValidator$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private void validateAudiences(com.google.crypto.tink.jwt.RawJwt r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r2 = this;
            java.util.Optional<java.lang.String> r0 = r2.expectedAudience
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L35
            boolean r0 = r3.hasAudiences()
            if (r0 == 0) goto L1f
            java.util.List r3 = r3.getAudiences()
            java.util.Optional<java.lang.String> r0 = r2.expectedAudience
            java.lang.Object r0 = r0.get()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1f
            goto L48
        L1f:
            com.google.crypto.tink.jwt.JwtInvalidException r3 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r0 = r2.expectedAudience
            java.lang.Object r0 = r0.get()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "invalid JWT; missing expected audience %s."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        L35:
            boolean r3 = r3.hasAudiences()
            if (r3 == 0) goto L48
            boolean r3 = r2.ignoreAudiences
            if (r3 == 0) goto L40
            goto L48
        L40:
            com.google.crypto.tink.jwt.JwtInvalidException r3 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r0 = "invalid JWT; token has audience set, but validator not."
            r3.<init>(r0)
            throw r3
        L48:
            return
    }

    private void validateIssuer(com.google.crypto.tink.jwt.RawJwt r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r2 = this;
            java.util.Optional<java.lang.String> r0 = r2.expectedIssuer
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L4f
            boolean r0 = r3.hasIssuer()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.getIssuer()
            java.util.Optional<java.lang.String> r1 = r2.expectedIssuer
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L62
        L1f:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r1 = r2.expectedIssuer
            java.lang.Object r1 = r1.get()
            java.lang.String r3 = r3.getIssuer()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r1 = "invalid JWT; expected issuer %s, but got %s"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3)
            throw r0
        L39:
            com.google.crypto.tink.jwt.JwtInvalidException r3 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r0 = r2.expectedIssuer
            java.lang.Object r0 = r0.get()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "invalid JWT; missing expected issuer %s."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        L4f:
            boolean r3 = r3.hasIssuer()
            if (r3 == 0) goto L62
            boolean r3 = r2.ignoreIssuer
            if (r3 == 0) goto L5a
            goto L62
        L5a:
            com.google.crypto.tink.jwt.JwtInvalidException r3 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r0 = "invalid JWT; token has issuer set, but validator not."
            r3.<init>(r0)
            throw r3
        L62:
            return
    }

    private void validateTimestampClaims(com.google.crypto.tink.jwt.RawJwt r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            java.time.Clock r0 = r3.clock
            java.time.Instant r0 = r0.instant()
            boolean r1 = r4.hasExpiration()
            if (r1 != 0) goto L19
            boolean r1 = r3.allowMissingExpiration
            if (r1 == 0) goto L11
            goto L19
        L11:
            com.google.crypto.tink.jwt.JwtInvalidException r4 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r0 = "token does not have an expiration set"
            r4.<init>(r0)
            throw r4
        L19:
            boolean r1 = r4.hasExpiration()
            if (r1 == 0) goto L49
            java.time.Instant r1 = r4.getExpiration()
            java.time.Duration r2 = r3.clockSkew
            java.time.Instant r2 = r0.minus(r2)
            boolean r1 = r1.isAfter(r2)
            if (r1 == 0) goto L30
            goto L49
        L30:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "token has expired since "
            r1.<init>(r2)
            java.time.Instant r4 = r4.getExpiration()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L49:
            boolean r1 = r4.hasNotBefore()
            if (r1 == 0) goto L79
            java.time.Instant r1 = r4.getNotBefore()
            java.time.Duration r2 = r3.clockSkew
            java.time.Instant r2 = r0.plus(r2)
            boolean r1 = r1.isAfter(r2)
            if (r1 != 0) goto L60
            goto L79
        L60:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "token cannot be used before "
            r1.<init>(r2)
            java.time.Instant r4 = r4.getNotBefore()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L79:
            boolean r1 = r3.expectIssuedInThePast
            if (r1 == 0) goto Lb5
            boolean r1 = r4.hasIssuedAt()
            if (r1 == 0) goto Lad
            java.time.Instant r1 = r4.getIssuedAt()
            java.time.Duration r2 = r3.clockSkew
            java.time.Instant r0 = r0.plus(r2)
            boolean r0 = r1.isAfter(r0)
            if (r0 != 0) goto L94
            goto Lb5
        L94:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "token has a invalid iat claim in the future: "
            r1.<init>(r2)
            java.time.Instant r4 = r4.getIssuedAt()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        Lad:
            com.google.crypto.tink.jwt.JwtInvalidException r4 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r0 = "token does not have an iat claim"
            r4.<init>(r0)
            throw r4
        Lb5:
            return
    }

    private void validateTypeHeader(com.google.crypto.tink.jwt.RawJwt r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r2 = this;
            java.util.Optional<java.lang.String> r0 = r2.expectedTypeHeader
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L4f
            boolean r0 = r3.hasTypeHeader()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.getTypeHeader()
            java.util.Optional<java.lang.String> r1 = r2.expectedTypeHeader
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L62
        L1f:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r1 = r2.expectedTypeHeader
            java.lang.Object r1 = r1.get()
            java.lang.String r3 = r3.getTypeHeader()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.String r1 = "invalid JWT; expected type header %s, but got %s"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3)
            throw r0
        L39:
            com.google.crypto.tink.jwt.JwtInvalidException r3 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r0 = r2.expectedTypeHeader
            java.lang.Object r0 = r0.get()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "invalid JWT; missing expected type header %s."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
        L4f:
            boolean r3 = r3.hasTypeHeader()
            if (r3 == 0) goto L62
            boolean r3 = r2.ignoreTypeHeader
            if (r3 == 0) goto L5a
            goto L62
        L5a:
            com.google.crypto.tink.jwt.JwtInvalidException r3 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r0 = "invalid JWT; token has type header set, but validator not."
            r3.<init>(r0)
            throw r3
        L62:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Optional<java.lang.String> r1 = r4.expectedTypeHeader
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "expectedTypeHeader="
            r1.<init>(r2)
            java.util.Optional<java.lang.String> r2 = r4.expectedTypeHeader
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L27:
            boolean r1 = r4.ignoreTypeHeader
            if (r1 == 0) goto L30
            java.lang.String r1 = "ignoreTypeHeader"
            r0.add(r1)
        L30:
            java.util.Optional<java.lang.String> r1 = r4.expectedIssuer
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "expectedIssuer="
            r1.<init>(r2)
            java.util.Optional<java.lang.String> r2 = r4.expectedIssuer
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L52:
            boolean r1 = r4.ignoreIssuer
            if (r1 == 0) goto L5b
            java.lang.String r1 = "ignoreIssuer"
            r0.add(r1)
        L5b:
            java.util.Optional<java.lang.String> r1 = r4.expectedAudience
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L7d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "expectedAudience="
            r1.<init>(r2)
            java.util.Optional<java.lang.String> r2 = r4.expectedAudience
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L7d:
            boolean r1 = r4.ignoreAudiences
            if (r1 == 0) goto L86
            java.lang.String r1 = "ignoreAudiences"
            r0.add(r1)
        L86:
            boolean r1 = r4.allowMissingExpiration
            if (r1 == 0) goto L8f
            java.lang.String r1 = "allowMissingExpiration"
            r0.add(r1)
        L8f:
            boolean r1 = r4.expectIssuedInThePast
            if (r1 == 0) goto L98
            java.lang.String r1 = "expectIssuedInThePast"
            r0.add(r1)
        L98:
            java.time.Duration r1 = r4.clockSkew
            boolean r1 = r1.isZero()
            if (r1 != 0) goto Lb4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "clockSkew="
            r1.<init>(r2)
            java.time.Duration r2 = r4.clockSkew
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        Lb4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JwtValidator{"
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r2 = ""
        Lc1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Ld6
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ","
            goto Lc1
        Ld6:
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    com.google.crypto.tink.jwt.VerifiedJwt validate(com.google.crypto.tink.jwt.RawJwt r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            r1.validateTimestampClaims(r2)
            r1.validateTypeHeader(r2)
            r1.validateIssuer(r2)
            r1.validateAudiences(r2)
            com.google.crypto.tink.jwt.VerifiedJwt r0 = new com.google.crypto.tink.jwt.VerifiedJwt
            r0.<init>(r2)
            return r0
    }
}
