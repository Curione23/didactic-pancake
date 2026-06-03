package okhttp3.internal.ws;

/* JADX INFO: compiled from: WebSocketReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "isClient", "", "source", "Lokio/BufferedSource;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "perMessageDeflate", "noContextTakeover", "(ZLokio/BufferedSource;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "closed", "controlFrameBuffer", "Lokio/Buffer;", "frameLength", "", "isControlFrame", "isFinalFrame", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", "", "messageFrameBuffer", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "opcode", "", "readingCompressedMessage", "getSource", "()Lokio/BufferedSource;", "close", "", "processNextFrame", "readControlFrame", "readHeader", "readMessage", "readMessageFrame", "readUntilNonControlFrame", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketReader implements java.io.Closeable {
    private boolean closed;
    private final okio.Buffer controlFrameBuffer;
    private final okhttp3.internal.ws.WebSocketReader.FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final okio.Buffer messageFrameBuffer;
    private okhttp3.internal.ws.MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: WebSocketReader.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "onReadClose", "", "code", "", "reason", "", "onReadMessage", "text", "bytes", "Lokio/ByteString;", "onReadPing", "payload", "onReadPong", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FrameCallback {
        void onReadClose(int r1, java.lang.String r2);

        void onReadMessage(java.lang.String r1) throws java.io.IOException;

        void onReadMessage(okio.ByteString r1) throws java.io.IOException;

        void onReadPing(okio.ByteString r1);

        void onReadPong(okio.ByteString r1);
    }

    public WebSocketReader(boolean r2, okio.BufferedSource r3, okhttp3.internal.ws.WebSocketReader.FrameCallback r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "frameCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.isClient = r2
            r1.source = r3
            r1.frameCallback = r4
            r1.perMessageDeflate = r5
            r1.noContextTakeover = r6
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r1.controlFrameBuffer = r3
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r1.messageFrameBuffer = r3
            r3 = 0
            if (r2 == 0) goto L2a
            r4 = r3
            goto L2d
        L2a:
            r4 = 4
            byte[] r4 = new byte[r4]
        L2d:
            r1.maskKey = r4
            if (r2 == 0) goto L32
            goto L37
        L32:
            okio.Buffer$UnsafeCursor r3 = new okio.Buffer$UnsafeCursor
            r3.<init>()
        L37:
            r1.maskCursor = r3
            return
    }

    private final void readControlFrame() throws java.io.IOException {
            r6 = this;
            long r0 = r6.frameLength
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L33
            okio.BufferedSource r4 = r6.source
            okio.Buffer r5 = r6.controlFrameBuffer
            r4.readFully(r5, r0)
            boolean r0 = r6.isClient
            if (r0 != 0) goto L33
            okio.Buffer r0 = r6.controlFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r6.maskCursor
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r6.maskCursor
            r0.seek(r2)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r6.maskCursor
            byte[] r4 = r6.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r0.toggleMask(r1, r4)
            okio.Buffer$UnsafeCursor r0 = r6.maskCursor
            r0.close()
        L33:
            int r0 = r6.opcode
            switch(r0) {
                case 8: goto L6b;
                case 9: goto L5f;
                case 10: goto L53;
                default: goto L38;
            }
        L38:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown control opcode: "
            r1.<init>(r2)
            int r2 = r6.opcode
            java.lang.String r2 = okhttp3.internal.Util.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L53:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r6.frameCallback
            okio.Buffer r1 = r6.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPong(r1)
            goto La2
        L5f:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r6.frameCallback
            okio.Buffer r1 = r6.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPing(r1)
            goto La2
        L6b:
            okio.Buffer r0 = r6.controlFrameBuffer
            long r0 = r0.size()
            r4 = 1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto La3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L96
            okio.Buffer r0 = r6.controlFrameBuffer
            short r0 = r0.readShort()
            okio.Buffer r1 = r6.controlFrameBuffer
            java.lang.String r1 = r1.readUtf8()
            okhttp3.internal.ws.WebSocketProtocol r2 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            java.lang.String r2 = r2.closeCodeExceptionMessage(r0)
            if (r2 != 0) goto L90
            goto L9a
        L90:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r2)
            throw r0
        L96:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r1 = ""
        L9a:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r2 = r6.frameCallback
            r2.onReadClose(r0, r1)
            r0 = 1
            r6.closed = r0
        La2:
            return
        La3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Malformed close payload length of 1."
            r0.<init>(r1)
            throw r0
    }

    private final void readHeader() throws java.io.IOException, java.net.ProtocolException {
            r8 = this;
            boolean r0 = r8.closed
            if (r0 != 0) goto L136
            okio.BufferedSource r0 = r8.source
            okio.Timeout r0 = r0.timeout()
            long r0 = r0.timeoutNanos()
            okio.BufferedSource r2 = r8.source
            okio.Timeout r2 = r2.timeout()
            r2.clearTimeout()
            okio.BufferedSource r2 = r8.source     // Catch: java.lang.Throwable -> L129
            byte r2 = r2.readByte()     // Catch: java.lang.Throwable -> L129
            r3 = 255(0xff, float:3.57E-43)
            int r2 = okhttp3.internal.Util.and(r2, r3)     // Catch: java.lang.Throwable -> L129
            okio.BufferedSource r4 = r8.source
            okio.Timeout r4 = r4.timeout()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r0, r5)
            r0 = r2 & 15
            r8.opcode = r0
            r1 = r2 & 128(0x80, float:1.8E-43)
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L3a
            r1 = r5
            goto L3b
        L3a:
            r1 = r4
        L3b:
            r8.isFinalFrame = r1
            r6 = r2 & 8
            if (r6 == 0) goto L43
            r6 = r5
            goto L44
        L43:
            r6 = r4
        L44:
            r8.isControlFrame = r6
            if (r6 == 0) goto L53
            if (r1 == 0) goto L4b
            goto L53
        L4b:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frames must be final."
            r0.<init>(r1)
            throw r0
        L53:
            r1 = r2 & 64
            if (r1 == 0) goto L59
            r1 = r5
            goto L5a
        L59:
            r1 = r4
        L5a:
            java.lang.String r6 = "Unexpected rsv1 flag"
            if (r0 == r5) goto L6a
            r7 = 2
            if (r0 == r7) goto L6a
            if (r1 != 0) goto L64
            goto L7b
        L64:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L6a:
            if (r1 == 0) goto L78
            boolean r0 = r8.perMessageDeflate
            if (r0 == 0) goto L72
            r0 = r5
            goto L79
        L72:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r6)
            throw r0
        L78:
            r0 = r4
        L79:
            r8.readingCompressedMessage = r0
        L7b:
            r0 = r2 & 32
            if (r0 != 0) goto L121
            r0 = r2 & 16
            if (r0 != 0) goto L119
            okio.BufferedSource r0 = r8.source
            byte r0 = r0.readByte()
            int r0 = okhttp3.internal.Util.and(r0, r3)
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L92
            r4 = r5
        L92:
            boolean r1 = r8.isClient
            if (r4 != r1) goto La5
            java.net.ProtocolException r0 = new java.net.ProtocolException
            boolean r1 = r8.isClient
            if (r1 == 0) goto L9f
            java.lang.String r1 = "Server-sent frames must not be masked."
            goto La1
        L9f:
            java.lang.String r1 = "Client-sent frames must be masked."
        La1:
            r0.<init>(r1)
            throw r0
        La5:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            r8.frameLength = r0
            r2 = 126(0x7e, double:6.23E-322)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lc1
            okio.BufferedSource r0 = r8.source
            short r0 = r0.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = okhttp3.internal.Util.and(r0, r1)
            long r0 = (long) r0
            r8.frameLength = r0
            goto Lf7
        Lc1:
            r2 = 127(0x7f, double:6.27E-322)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lf7
            okio.BufferedSource r0 = r8.source
            long r0 = r0.readLong()
            r8.frameLength = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Ld6
            goto Lf7
        Ld6:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Frame length 0x"
            r1.<init>(r2)
            long r2 = r8.frameLength
            java.lang.String r2 = okhttp3.internal.Util.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " > 0x7FFFFFFFFFFFFFFF"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lf7:
            boolean r0 = r8.isControlFrame
            if (r0 == 0) goto L10c
            long r0 = r8.frameLength
            r2 = 125(0x7d, double:6.2E-322)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L104
            goto L10c
        L104:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frame must be less than 125B."
            r0.<init>(r1)
            throw r0
        L10c:
            if (r4 == 0) goto L118
            okio.BufferedSource r0 = r8.source
            byte[] r1 = r8.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.readFully(r1)
        L118:
            return
        L119:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv3 flag"
            r0.<init>(r1)
            throw r0
        L121:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unexpected rsv2 flag"
            r0.<init>(r1)
            throw r0
        L129:
            r2 = move-exception
            okio.BufferedSource r3 = r8.source
            okio.Timeout r3 = r3.timeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.timeout(r0, r4)
            throw r2
        L136:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private final void readMessage() throws java.io.IOException {
            r5 = this;
        L0:
            boolean r0 = r5.closed
            if (r0 != 0) goto L68
            long r0 = r5.frameLength
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L40
            okio.BufferedSource r2 = r5.source
            okio.Buffer r3 = r5.messageFrameBuffer
            r2.readFully(r3, r0)
            boolean r0 = r5.isClient
            if (r0 != 0) goto L40
            okio.Buffer r0 = r5.messageFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            okio.Buffer r1 = r5.messageFrameBuffer
            long r1 = r1.size()
            long r3 = r5.frameLength
            long r1 = r1 - r3
            r0.seek(r1)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            byte[] r2 = r5.maskKey
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0.toggleMask(r1, r2)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            r0.close()
        L40:
            boolean r0 = r5.isFinalFrame
            if (r0 != 0) goto L67
            r5.readUntilNonControlFrame()
            int r0 = r5.opcode
            if (r0 != 0) goto L4c
            goto L0
        L4c:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected continuation opcode. Got: "
            r1.<init>(r2)
            int r2 = r5.opcode
            java.lang.String r2 = okhttp3.internal.Util.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L67:
            return
        L68:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private final void readMessageFrame() throws java.io.IOException {
            r4 = this;
            int r0 = r4.opcode
            r1 = 1
            if (r0 == r1) goto L22
            r2 = 2
            if (r0 != r2) goto L9
            goto L22
        L9:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown opcode: "
            r2.<init>(r3)
            java.lang.String r0 = okhttp3.internal.Util.toHexString(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L22:
            r4.readMessage()
            boolean r2 = r4.readingCompressedMessage
            if (r2 == 0) goto L3b
            okhttp3.internal.ws.MessageInflater r2 = r4.messageInflater
            if (r2 != 0) goto L36
            okhttp3.internal.ws.MessageInflater r2 = new okhttp3.internal.ws.MessageInflater
            boolean r3 = r4.noContextTakeover
            r2.<init>(r3)
            r4.messageInflater = r2
        L36:
            okio.Buffer r3 = r4.messageFrameBuffer
            r2.inflate(r3)
        L3b:
            if (r0 != r1) goto L49
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r4.frameCallback
            okio.Buffer r1 = r4.messageFrameBuffer
            java.lang.String r1 = r1.readUtf8()
            r0.onReadMessage(r1)
            goto L54
        L49:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r4.frameCallback
            okio.Buffer r1 = r4.messageFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadMessage(r1)
        L54:
            return
    }

    private final void readUntilNonControlFrame() throws java.io.IOException {
            r1 = this;
        L0:
            boolean r0 = r1.closed
            if (r0 != 0) goto L10
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            r1.readControlFrame()
            goto L0
        L10:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.ws.MessageInflater r0 = r1.messageInflater
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    public final okio.BufferedSource getSource() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }

    public final void processNextFrame() throws java.io.IOException {
            r1 = this;
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 == 0) goto Lb
            r1.readControlFrame()
            goto Le
        Lb:
            r1.readMessageFrame()
        Le:
            return
    }
}
