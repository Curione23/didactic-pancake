package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0002\b#J.\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "()V", "BINARY", "", "", "[Ljava/lang/String;", "CONNECTION_PREFACE", "Lokio/ByteString;", "FLAGS", "FLAG_ACK", "", "FLAG_COMPRESSED", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_END_STREAM", "FLAG_NONE", "FLAG_PADDED", "FLAG_PRIORITY", "FRAME_NAMES", "INITIAL_MAX_FRAME_SIZE", "TYPE_CONTINUATION", "TYPE_DATA", "TYPE_GOAWAY", "TYPE_HEADERS", "TYPE_PING", "TYPE_PRIORITY", "TYPE_PUSH_PROMISE", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_WINDOW_UPDATE", "formatFlags", "type", "flags", "formattedType", "formattedType$okhttp", "frameLog", "inbound", "", "streamId", "length", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2 {
    private static final java.lang.String[] BINARY = null;
    public static final okio.ByteString CONNECTION_PREFACE = null;
    private static final java.lang.String[] FLAGS = null;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final java.lang.String[] FRAME_NAMES = null;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final okhttp3.internal.http2.Http2 INSTANCE = null;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
            okhttp3.internal.http2.Http2 r0 = new okhttp3.internal.http2.Http2
            r0.<init>()
            okhttp3.internal.http2.Http2.INSTANCE = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Http2.CONNECTION_PREFACE = r0
            r0 = 10
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "DATA"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "HEADERS"
            r3 = 1
            r0[r3] = r1
            r1 = 2
            java.lang.String r4 = "PRIORITY"
            r0[r1] = r4
            java.lang.String r1 = "RST_STREAM"
            r5 = 3
            r0[r5] = r1
            java.lang.String r1 = "SETTINGS"
            r6 = 4
            r0[r6] = r1
            r1 = 5
            java.lang.String r7 = "PUSH_PROMISE"
            r0[r1] = r7
            r1 = 6
            java.lang.String r7 = "PING"
            r0[r1] = r7
            r1 = 7
            java.lang.String r7 = "GOAWAY"
            r0[r1] = r7
            java.lang.String r1 = "WINDOW_UPDATE"
            r7 = 8
            r0[r7] = r1
            r1 = 9
            java.lang.String r8 = "CONTINUATION"
            r0[r1] = r8
            okhttp3.internal.http2.Http2.FRAME_NAMES = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            okhttp3.internal.http2.Http2.FLAGS = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r8 = r2
        L56:
            if (r8 >= r0) goto L7c
            java.lang.String r9 = java.lang.Integer.toBinaryString(r8)
            java.lang.String r10 = "toBinaryString(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "%8s"
            java.lang.String r11 = okhttp3.internal.Util.format(r10, r9)
            r15 = 4
            r16 = 0
            r12 = 32
            r13 = 48
            r14 = 0
            java.lang.String r9 = kotlin.text.StringsKt.replace$default(r11, r12, r13, r14, r15, r16)
            r1[r8] = r9
            int r8 = r8 + 1
            goto L56
        L7c:
            okhttp3.internal.http2.Http2.BINARY = r1
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String r1 = "END_STREAM"
            r0[r3] = r1
            int[] r1 = new int[]{r3}
            java.lang.String r3 = "PADDED"
            r0[r7] = r3
            r3 = r1[r2]
            r8 = r3 | 8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r3 = r0[r3]
            java.lang.StringBuilder r3 = r9.append(r3)
            java.lang.String r9 = "|PADDED"
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            r0[r8] = r3
            java.lang.String r3 = "END_HEADERS"
            r0[r6] = r3
            r3 = 32
            r0[r3] = r4
            java.lang.String r4 = "END_HEADERS|PRIORITY"
            r8 = 36
            r0[r8] = r4
            int[] r0 = new int[]{r6, r3, r8}
            r3 = r2
        Lbe:
            if (r3 >= r5) goto L108
            r4 = r0[r3]
            r6 = r1[r2]
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.FLAGS
            r10 = r6 | r4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = r8[r6]
            java.lang.StringBuilder r11 = r11.append(r12)
            r12 = 124(0x7c, float:1.74E-43)
            java.lang.StringBuilder r11 = r11.append(r12)
            r13 = r8[r4]
            java.lang.StringBuilder r11 = r11.append(r13)
            java.lang.String r11 = r11.toString()
            r8[r10] = r11
            r10 = r10 | r7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r6 = r8[r6]
            java.lang.StringBuilder r6 = r11.append(r6)
            java.lang.StringBuilder r6 = r6.append(r12)
            r4 = r8[r4]
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.String r4 = r4.toString()
            r8[r10] = r4
            int r3 = r3 + 1
            goto Lbe
        L108:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r0 = r0.length
        L10b:
            if (r2 >= r0) goto L11c
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            r3 = r1[r2]
            if (r3 != 0) goto L119
            java.lang.String[] r3 = okhttp3.internal.http2.Http2.BINARY
            r3 = r3[r2]
            r1[r2] = r3
        L119:
            int r2 = r2 + 1
            goto L10b
        L11c:
            return
    }

    private Http2() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String formatFlags(int r8, int r9) {
            r7 = this;
            if (r9 != 0) goto L5
            java.lang.String r8 = ""
            return r8
        L5:
            r0 = 2
            if (r8 == r0) goto L58
            r0 = 3
            if (r8 == r0) goto L58
            r0 = 4
            if (r8 == r0) goto L4d
            r0 = 6
            if (r8 == r0) goto L4d
            r0 = 7
            if (r8 == r0) goto L58
            r0 = 8
            if (r8 == r0) goto L58
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r1 = r0.length
            if (r9 >= r1) goto L23
            r0 = r0[r9]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            goto L27
        L23:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.BINARY
            r0 = r0[r9]
        L27:
            r1 = r0
            r0 = 5
            if (r8 != r0) goto L3b
            r0 = r9 & 4
            if (r0 == 0) goto L3b
            r5 = 4
            r6 = 0
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PUSH_PROMISE"
            r4 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            goto L4c
        L3b:
            if (r8 != 0) goto L4c
            r8 = r9 & 32
            if (r8 == 0) goto L4c
            r5 = 4
            r6 = 0
            java.lang.String r2 = "PRIORITY"
            java.lang.String r3 = "COMPRESSED"
            r4 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
        L4c:
            return r1
        L4d:
            r8 = 1
            if (r9 != r8) goto L53
            java.lang.String r8 = "ACK"
            goto L57
        L53:
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.BINARY
            r8 = r8[r9]
        L57:
            return r8
        L58:
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.BINARY
            r8 = r8[r9]
            return r8
    }

    public final java.lang.String formattedType$okhttp(int r3) {
            r2 = this;
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FRAME_NAMES
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            goto L16
        L8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "0x%02x"
            java.lang.String r3 = okhttp3.internal.Util.format(r0, r3)
        L16:
            return r3
    }

    public final java.lang.String frameLog(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = r1.formattedType$okhttp(r5)
            java.lang.String r5 = r1.formatFlags(r5, r6)
            if (r2 == 0) goto Ld
            java.lang.String r2 = "<<"
            goto Lf
        Ld:
            java.lang.String r2 = ">>"
        Lf:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r0, r5}
            java.lang.String r3 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r2 = okhttp3.internal.Util.format(r3, r2)
            return r2
    }
}
