package okhttp3.internal.http2;

/* JADX INFO: compiled from: ErrorCode.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http2/ErrorCode;", "", "httpCode", "", "(Ljava/lang/String;II)V", "getHttpCode", "()I", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", "CANCEL", "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ErrorCode extends java.lang.Enum<okhttp3.internal.http2.ErrorCode> {
    private static final /* synthetic */ okhttp3.internal.http2.ErrorCode[] $VALUES = null;
    public static final okhttp3.internal.http2.ErrorCode CANCEL = null;
    public static final okhttp3.internal.http2.ErrorCode COMPRESSION_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode CONNECT_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode.Companion Companion = null;
    public static final okhttp3.internal.http2.ErrorCode ENHANCE_YOUR_CALM = null;
    public static final okhttp3.internal.http2.ErrorCode FLOW_CONTROL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode FRAME_SIZE_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode HTTP_1_1_REQUIRED = null;
    public static final okhttp3.internal.http2.ErrorCode INADEQUATE_SECURITY = null;
    public static final okhttp3.internal.http2.ErrorCode INTERNAL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode NO_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode PROTOCOL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode REFUSED_STREAM = null;
    public static final okhttp3.internal.http2.ErrorCode SETTINGS_TIMEOUT = null;
    public static final okhttp3.internal.http2.ErrorCode STREAM_CLOSED = null;
    private final int httpCode;

    /* JADX INFO: compiled from: ErrorCode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/ErrorCode$Companion;", "", "()V", "fromHttp2", "Lokhttp3/internal/http2/ErrorCode;", "code", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        public final okhttp3.internal.http2.ErrorCode fromHttp2(int r6) {
                r5 = this;
                okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L14
                r3 = r0[r2]
                int r4 = r3.getHttpCode()
                if (r4 != r6) goto L11
                goto L15
            L11:
                int r2 = r2 + 1
                goto L6
            L14:
                r3 = 0
            L15:
                return r3
        }
    }

    private static final /* synthetic */ okhttp3.internal.http2.ErrorCode[] $values() {
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.NO_ERROR
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
            okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.SETTINGS_TIMEOUT
            okhttp3.internal.http2.ErrorCode r5 = okhttp3.internal.http2.ErrorCode.STREAM_CLOSED
            okhttp3.internal.http2.ErrorCode r6 = okhttp3.internal.http2.ErrorCode.FRAME_SIZE_ERROR
            okhttp3.internal.http2.ErrorCode r7 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            okhttp3.internal.http2.ErrorCode r8 = okhttp3.internal.http2.ErrorCode.CANCEL
            okhttp3.internal.http2.ErrorCode r9 = okhttp3.internal.http2.ErrorCode.COMPRESSION_ERROR
            okhttp3.internal.http2.ErrorCode r10 = okhttp3.internal.http2.ErrorCode.CONNECT_ERROR
            okhttp3.internal.http2.ErrorCode r11 = okhttp3.internal.http2.ErrorCode.ENHANCE_YOUR_CALM
            okhttp3.internal.http2.ErrorCode r12 = okhttp3.internal.http2.ErrorCode.INADEQUATE_SECURITY
            okhttp3.internal.http2.ErrorCode r13 = okhttp3.internal.http2.ErrorCode.HTTP_1_1_REQUIRED
            okhttp3.internal.http2.ErrorCode[] r0 = new okhttp3.internal.http2.ErrorCode[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            return r0
    }

    static {
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "NO_ERROR"
            r2 = 0
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.NO_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "PROTOCOL_ERROR"
            r2 = 1
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "INTERNAL_ERROR"
            r2 = 2
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "FLOW_CONTROL_ERROR"
            r2 = 3
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "SETTINGS_TIMEOUT"
            r2 = 4
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.SETTINGS_TIMEOUT = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "STREAM_CLOSED"
            r2 = 5
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.STREAM_CLOSED = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "FRAME_SIZE_ERROR"
            r2 = 6
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.FRAME_SIZE_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "REFUSED_STREAM"
            r2 = 7
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.REFUSED_STREAM = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "CANCEL"
            r2 = 8
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.CANCEL = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "COMPRESSION_ERROR"
            r2 = 9
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.COMPRESSION_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "CONNECT_ERROR"
            r2 = 10
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.CONNECT_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "ENHANCE_YOUR_CALM"
            r2 = 11
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.ENHANCE_YOUR_CALM = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "INADEQUATE_SECURITY"
            r2 = 12
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.INADEQUATE_SECURITY = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "HTTP_1_1_REQUIRED"
            r2 = 13
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.HTTP_1_1_REQUIRED = r0
            okhttp3.internal.http2.ErrorCode[] r0 = $values()
            okhttp3.internal.http2.ErrorCode.$VALUES = r0
            okhttp3.internal.http2.ErrorCode$Companion r0 = new okhttp3.internal.http2.ErrorCode$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.ErrorCode.Companion = r0
            return
    }

    ErrorCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.httpCode = r3
            return
    }

    public static okhttp3.internal.http2.ErrorCode valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.internal.http2.ErrorCode> r0 = okhttp3.internal.http2.ErrorCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.internal.http2.ErrorCode r1 = (okhttp3.internal.http2.ErrorCode) r1
            return r1
    }

    public static okhttp3.internal.http2.ErrorCode[] values() {
            okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.internal.http2.ErrorCode[] r0 = (okhttp3.internal.http2.ErrorCode[]) r0
            return r0
    }

    public final int getHttpCode() {
            r1 = this;
            int r0 = r1.httpCode
            return r0
    }
}
