package okio;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "source", "inflater", "Ljava/util/zip/Inflater;", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "bufferBytesHeldByInflater", "", "closed", "", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "readOrInflate", "refill", "releaseBytesAfterInflate", "timeout", "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InflaterSource implements okio.Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final java.util.zip.Inflater inflater;
    private final okio.BufferedSource source;

    public InflaterSource(okio.BufferedSource r2, java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.inflater = r3
            return
    }

    public InflaterSource(okio.Source r2, java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            r1.<init>(r2, r3)
            return
    }

    private final void releaseBytesAfterInflate() {
            r4 = this;
            int r0 = r4.bufferBytesHeldByInflater
            if (r0 != 0) goto L5
            return
        L5:
            java.util.zip.Inflater r1 = r4.inflater
            int r1 = r1.getRemaining()
            int r0 = r0 - r1
            int r1 = r4.bufferBytesHeldByInflater
            int r1 = r1 - r0
            r4.bufferBytesHeldByInflater = r1
            okio.BufferedSource r1 = r4.source
            long r2 = (long) r0
            r1.skip(r2)
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.inflater
            r0.end()
            r0 = 1
            r1.closed = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        L5:
            long r0 = r4.readOrInflate(r5, r6)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L10
            return r0
        L10:
            java.util.zip.Inflater r0 = r4.inflater
            boolean r0 = r0.finished()
            if (r0 != 0) goto L32
            java.util.zip.Inflater r0 = r4.inflater
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L21
            goto L32
        L21:
            okio.BufferedSource r0 = r4.source
            boolean r0 = r0.exhausted()
            if (r0 != 0) goto L2a
            goto L5
        L2a:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "source exhausted prematurely"
            r5.<init>(r6)
            throw r5
        L32:
            r5 = -1
            return r5
    }

    public final long readOrInflate(okio.Buffer r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L67
            boolean r3 = r5.closed
            if (r3 != 0) goto L5b
            if (r2 != 0) goto L12
            return r0
        L12:
            r2 = 1
            okio.Segment r2 = r6.writableSegment$okio(r2)     // Catch: java.util.zip.DataFormatException -> L52
            int r3 = r2.limit     // Catch: java.util.zip.DataFormatException -> L52
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.util.zip.DataFormatException -> L52
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.util.zip.DataFormatException -> L52
            int r7 = (int) r7     // Catch: java.util.zip.DataFormatException -> L52
            r5.refill()     // Catch: java.util.zip.DataFormatException -> L52
            java.util.zip.Inflater r8 = r5.inflater     // Catch: java.util.zip.DataFormatException -> L52
            byte[] r3 = r2.data     // Catch: java.util.zip.DataFormatException -> L52
            int r4 = r2.limit     // Catch: java.util.zip.DataFormatException -> L52
            int r7 = r8.inflate(r3, r4, r7)     // Catch: java.util.zip.DataFormatException -> L52
            r5.releaseBytesAfterInflate()     // Catch: java.util.zip.DataFormatException -> L52
            if (r7 <= 0) goto L42
            int r8 = r2.limit     // Catch: java.util.zip.DataFormatException -> L52
            int r8 = r8 + r7
            r2.limit = r8     // Catch: java.util.zip.DataFormatException -> L52
            long r0 = r6.size()     // Catch: java.util.zip.DataFormatException -> L52
            long r7 = (long) r7     // Catch: java.util.zip.DataFormatException -> L52
            long r0 = r0 + r7
            r6.setSize$okio(r0)     // Catch: java.util.zip.DataFormatException -> L52
            return r7
        L42:
            int r7 = r2.pos     // Catch: java.util.zip.DataFormatException -> L52
            int r8 = r2.limit     // Catch: java.util.zip.DataFormatException -> L52
            if (r7 != r8) goto L51
            okio.Segment r7 = r2.pop()     // Catch: java.util.zip.DataFormatException -> L52
            r6.head = r7     // Catch: java.util.zip.DataFormatException -> L52
            okio.SegmentPool.recycle(r2)     // Catch: java.util.zip.DataFormatException -> L52
        L51:
            return r0
        L52:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r7.<init>(r6)
            throw r7
        L5b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public final boolean refill() throws java.io.IOException {
            r5 = this;
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.needsInput()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            okio.BufferedSource r0 = r5.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            r5.bufferBytesHeldByInflater = r2
            java.util.zip.Inflater r2 = r5.inflater
            byte[] r3 = r0.data
            int r0 = r0.pos
            int r4 = r5.bufferBytesHeldByInflater
            r2.setInput(r3, r0, r4)
            return r1
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
