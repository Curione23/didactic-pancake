package okhttp3.internal.tls;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final okhttp3.internal.tls.OkHostnameVerifier INSTANCE = null;

    static {
            okhttp3.internal.tls.OkHostnameVerifier r0 = new okhttp3.internal.tls.OkHostnameVerifier
            r0.<init>()
            okhttp3.internal.tls.OkHostnameVerifier.INSTANCE = r0
            return
    }

    private OkHostnameVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String asciiToLowercase(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isAscii(r3)
            if (r0 == 0) goto L16
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
        L16:
            return r3
    }

    private final java.util.List<java.lang.String> getSubjectAltNames(java.security.cert.X509Certificate r5, int r6) {
            r4 = this;
            java.util.Collection r5 = r5.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L4a
            if (r5 != 0) goto Lb
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.security.cert.CertificateParsingException -> L4a
            return r5
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L4a
            r0.<init>()     // Catch: java.security.cert.CertificateParsingException -> L4a
            java.util.List r0 = (java.util.List) r0     // Catch: java.security.cert.CertificateParsingException -> L4a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.security.cert.CertificateParsingException -> L4a
        L16:
            boolean r1 = r5.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L4a
            if (r1 == 0) goto L49
            java.lang.Object r1 = r5.next()     // Catch: java.security.cert.CertificateParsingException -> L4a
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L4a
            if (r1 == 0) goto L16
            int r2 = r1.size()     // Catch: java.security.cert.CertificateParsingException -> L4a
            r3 = 2
            if (r2 >= r3) goto L2c
            goto L16
        L2c:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L4a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.security.cert.CertificateParsingException -> L4a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L4a
            if (r2 == 0) goto L16
            r2 = 1
            java.lang.Object r1 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L4a
            if (r1 != 0) goto L43
            goto L16
        L43:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateParsingException -> L4a
            r0.add(r1)     // Catch: java.security.cert.CertificateParsingException -> L4a
            goto L16
        L49:
            return r0
        L4a:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            return r5
    }

    private final boolean isAscii(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 3
            r2 = 0
            r3 = 0
            long r1 = okio.Utf8.size$default(r5, r3, r3, r1, r2)
            int r5 = (int) r1
            if (r0 != r5) goto Lf
            r3 = 1
        Lf:
            return r3
    }

    private final boolean verifyHostname(java.lang.String r13, java.lang.String r14) {
            r12 = this;
            r0 = r13
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            if (r0 == 0) goto Ld9
            int r0 = r0.length()
            if (r0 != 0) goto Le
            goto Ld9
        Le:
            java.lang.String r0 = "."
            r2 = 2
            r3 = 0
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r13, r0, r1, r2, r3)
            if (r4 != 0) goto Ld9
            java.lang.String r4 = ".."
            boolean r5 = kotlin.text.StringsKt.endsWith$default(r13, r4, r1, r2, r3)
            if (r5 == 0) goto L22
            goto Ld9
        L22:
            r5 = r14
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto Ld9
            int r5 = r5.length()
            if (r5 != 0) goto L2f
            goto Ld9
        L2f:
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r14, r0, r1, r2, r3)
            if (r5 != 0) goto Ld9
            boolean r4 = kotlin.text.StringsKt.endsWith$default(r14, r4, r1, r2, r3)
            if (r4 == 0) goto L3d
            goto Ld9
        L3d:
            boolean r4 = kotlin.text.StringsKt.endsWith$default(r13, r0, r1, r2, r3)
            r5 = 46
            if (r4 != 0) goto L56
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r13 = r4.append(r13)
            java.lang.StringBuilder r13 = r13.append(r5)
            java.lang.String r13 = r13.toString()
        L56:
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r14, r0, r1, r2, r3)
            if (r0 != 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r14 = r0.append(r14)
            java.lang.StringBuilder r14 = r14.append(r5)
            java.lang.String r14 = r14.toString()
        L6d:
            java.lang.String r14 = r12.asciiToLowercase(r14)
            r4 = r14
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r0 = "*"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.contains$default(r4, r0, r1, r2, r3)
            if (r0 != 0) goto L83
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r14)
            return r13
        L83:
            java.lang.String r0 = "*."
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r14, r0, r1, r2, r3)
            if (r5 == 0) goto Ld9
            r8 = 4
            r9 = 0
            r5 = 42
            r6 = 1
            r7 = 0
            int r4 = kotlin.text.StringsKt.indexOf$default(r4, r5, r6, r7, r8, r9)
            r5 = -1
            if (r4 == r5) goto L99
            goto Ld9
        L99:
            int r4 = r13.length()
            int r6 = r14.length()
            if (r4 >= r6) goto La4
            return r1
        La4:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r14)
            if (r0 == 0) goto Lab
            return r1
        Lab:
            r0 = 1
            java.lang.String r14 = r14.substring(r0)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r4)
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r13, r14, r1, r2, r3)
            if (r2 != 0) goto Lbc
            return r1
        Lbc:
            int r2 = r13.length()
            int r14 = r14.length()
            int r2 = r2 - r14
            if (r2 <= 0) goto Ld8
            r6 = r13
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r8 = r2 + (-1)
            r10 = 4
            r11 = 0
            r7 = 46
            r9 = 0
            int r13 = kotlin.text.StringsKt.lastIndexOf$default(r6, r7, r8, r9, r10, r11)
            if (r13 == r5) goto Ld8
            return r1
        Ld8:
            return r0
        Ld9:
            return r1
    }

    private final boolean verifyHostname(java.lang.String r4, java.security.cert.X509Certificate r5) {
            r3 = this;
            java.lang.String r4 = r3.asciiToLowercase(r4)
            r0 = 2
            java.util.List r5 = r3.getSubjectAltNames(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            goto L33
        L1a:
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            okhttp3.internal.tls.OkHostnameVerifier r2 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            boolean r0 = r2.verifyHostname(r4, r0)
            if (r0 == 0) goto L1e
            r1 = 1
        L33:
            return r1
    }

    private final boolean verifyIpAddress(java.lang.String r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.lang.String r3 = okhttp3.internal.HostnamesKt.toCanonicalHost(r3)
            r0 = 7
            java.util.List r4 = r2.getSubjectAltNames(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            goto L35
        L1a:
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L1e
            r1 = 1
        L35:
            return r1
    }

    public final java.util.List<java.lang.String> allSubjectAltNames(java.security.cert.X509Certificate r3) {
            r2 = this;
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 7
            java.util.List r0 = r2.getSubjectAltNames(r3, r0)
            r1 = 2
            java.util.List r3 = r2.getSubjectAltNames(r3, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.plus(r0, r3)
            return r3
    }

    public final boolean verify(java.lang.String r2, java.security.cert.X509Certificate r3) {
            r1 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r2)
            if (r0 == 0) goto L15
            boolean r2 = r1.verifyIpAddress(r2, r3)
            goto L19
        L15:
            boolean r2 = r1.verifyHostname(r2, r3)
        L19:
            return r2
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r3, javax.net.ssl.SSLSession r4) {
            r2 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "session"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r2.isAscii(r3)
            r1 = 0
            if (r0 != 0) goto L12
            goto L24
        L12:
            java.security.cert.Certificate[] r4 = r4.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L24
            r4 = r4[r1]     // Catch: javax.net.ssl.SSLException -> L24
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)     // Catch: javax.net.ssl.SSLException -> L24
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: javax.net.ssl.SSLException -> L24
            boolean r3 = r2.verify(r3, r4)     // Catch: javax.net.ssl.SSLException -> L24
            r1 = r3
        L24:
            return r1
    }
}
