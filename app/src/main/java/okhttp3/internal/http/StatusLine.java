package okhttp3.internal.http;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", "message", "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StatusLine {
    public static final okhttp3.internal.http.StatusLine.Companion Companion = null;
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final java.lang.String message;
    public final okhttp3.Protocol protocol;

    /* JADX INFO: compiled from: StatusLine.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "()V", "HTTP_CONTINUE", "", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.http.StatusLine get(okhttp3.Response r4) {
                r3 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.internal.http.StatusLine r0 = new okhttp3.internal.http.StatusLine
                okhttp3.Protocol r1 = r4.protocol()
                int r2 = r4.code()
                java.lang.String r4 = r4.message()
                r0.<init>(r1, r2, r4)
                return r0
        }

        public final okhttp3.internal.http.StatusLine parse(java.lang.String r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "statusLine"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "HTTP/1."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r9, r0, r1, r2, r3)
                r4 = 32
                r5 = 4
                java.lang.String r6 = "Unexpected status line: "
                if (r0 == 0) goto L5d
                int r0 = r9.length()
                r1 = 9
                if (r0 < r1) goto L4a
                r0 = 8
                char r0 = r9.charAt(r0)
                if (r0 != r4) goto L4a
                r0 = 7
                char r0 = r9.charAt(r0)
                int r0 = r0 + (-48)
                if (r0 == 0) goto L47
                r2 = 1
                if (r0 != r2) goto L34
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                goto L68
            L34:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r6)
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            L47:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                goto L68
            L4a:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r6)
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            L5d:
                java.lang.String r0 = "ICY "
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r9, r0, r1, r2, r3)
                if (r0 == 0) goto Ld5
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                r1 = r5
            L68:
                int r2 = r9.length()
                int r3 = r1 + 3
                if (r2 < r3) goto Lc2
                java.lang.String r2 = r9.substring(r1, r3)     // Catch: java.lang.NumberFormatException -> Laf
                java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)     // Catch: java.lang.NumberFormatException -> Laf
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Laf
                int r7 = r9.length()
                if (r7 <= r3) goto La7
                char r3 = r9.charAt(r3)
                if (r3 != r4) goto L94
                int r1 = r1 + r5
                java.lang.String r9 = r9.substring(r1)
                java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
                goto La9
            L94:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r6)
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            La7:
                java.lang.String r9 = ""
            La9:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine
                r1.<init>(r0, r2, r9)
                return r1
            Laf:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r6)
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            Lc2:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r6)
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            Ld5:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r6)
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
        }
    }

    static {
            okhttp3.internal.http.StatusLine$Companion r0 = new okhttp3.internal.http.StatusLine$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.StatusLine.Companion = r0
            return
    }

    public StatusLine(okhttp3.Protocol r2, int r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.protocol = r2
            r1.code = r3
            r1.message = r4
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Protocol r1 = r4.protocol
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_0
            if (r1 != r2) goto L11
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L16
        L11:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L16:
            r1 = 32
            java.lang.StringBuilder r2 = r0.append(r1)
            int r3 = r4.code
            r2.append(r3)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = r4.message
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
