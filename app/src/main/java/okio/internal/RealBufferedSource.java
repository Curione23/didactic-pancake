package okio.internal;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", "offset", "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSource {
    public static final void commonClose(okio.RealBufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.closed
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r1 = r1.bufferField
            r1.clear()
            return
    }

    public static final boolean commonExhausted(okio.RealBufferedSource r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4.closed
            if (r0 != 0) goto L25
            okio.Buffer r0 = r4.bufferField
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L23
            okio.Source r0 = r4.source
            okio.Buffer r4 = r4.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r4, r1)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L23
            r4 = 1
            goto L24
        L23:
            r4 = 0
        L24:
            return r4
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public static final long commonIndexOf(okio.RealBufferedSource r9, byte r10, long r11, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r9.closed
            if (r0 != 0) goto L69
            r0 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 > 0) goto L46
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L46
        L13:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r7 = -1
            if (r0 >= 0) goto L45
            okio.Buffer r1 = r9.bufferField
            r2 = r10
            r3 = r11
            r5 = r13
            long r0 = r1.indexOf(r2, r3, r5)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L27
            return r0
        L27:
            okio.Buffer r0 = r9.bufferField
            long r0 = r0.size()
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 >= 0) goto L45
            okio.Source r2 = r9.source
            okio.Buffer r3 = r9.bufferField
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r3, r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L40
            goto L45
        L40:
            long r11 = java.lang.Math.max(r11, r0)
            goto L13
        L45:
            return r7
        L46:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "fromIndex="
            r9.<init>(r10)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r10 = " toIndex="
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L69:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    public static final long commonIndexOf(okio.RealBufferedSource r8, okio.ByteString r9, long r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            if (r0 != 0) goto L3e
        Le:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOf(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            return r0
        L1b:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L30
            return r2
        L30:
            int r2 = r9.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto Le
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    public static final long commonIndexOfElement(okio.RealBufferedSource r8, okio.ByteString r9, long r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            if (r0 != 0) goto L35
        Le:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1b
            return r0
        L1b:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L30
            return r2
        L30:
            long r10 = java.lang.Math.max(r10, r0)
            goto Le
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    public static final okio.BufferedSource commonPeek(okio.RealBufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.PeekSource r0 = new okio.PeekSource
            okio.BufferedSource r1 = (okio.BufferedSource) r1
            r0.<init>(r1)
            okio.Source r0 = (okio.Source) r0
            okio.BufferedSource r1 = okio.Okio.buffer(r0)
            return r1
    }

    public static final boolean commonRangeEquals(okio.RealBufferedSource r6, long r7, okio.ByteString r9, int r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r6.closed
            if (r0 != 0) goto L45
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L44
            if (r10 < 0) goto L44
            if (r11 < 0) goto L44
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L21
            goto L44
        L21:
            r0 = r1
        L22:
            if (r0 >= r11) goto L42
            long r2 = (long) r0
            long r2 = r2 + r7
            r4 = 1
            long r4 = r4 + r2
            boolean r4 = r6.request(r4)
            if (r4 != 0) goto L30
            return r1
        L30:
            okio.Buffer r4 = r6.bufferField
            byte r2 = r4.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L3f
            return r1
        L3f:
            int r0 = r0 + 1
            goto L22
        L42:
            r6 = 1
            return r6
        L44:
            return r1
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    public static final int commonRead(okio.RealBufferedSource r9, byte[] r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Buffer r12 = r9.bufferField
            long r0 = r12.size()
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L30
            okio.Source r12 = r9.source
            okio.Buffer r0 = r9.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r12.read(r0, r1)
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L30
            r9 = -1
            return r9
        L30:
            okio.Buffer r12 = r9.bufferField
            long r0 = r12.size()
            long r0 = java.lang.Math.min(r7, r0)
            int r12 = (int) r0
            okio.Buffer r9 = r9.bufferField
            int r9 = r9.read(r10, r11, r12)
            return r9
    }

    public static final long commonRead(okio.RealBufferedSource r4, okio.Buffer r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L4c
            boolean r2 = r4.closed
            if (r2 != 0) goto L40
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L2f
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            return r2
        L2f:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r6 = java.lang.Math.min(r6, r0)
            okio.Buffer r4 = r4.bufferField
            long r4 = r4.read(r5, r6)
            return r4
        L40:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "closed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "byteCount < 0: "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static final long commonReadAll(okio.RealBufferedSource r8, okio.Sink r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r2 = r0
        Ld:
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2e
            okio.Buffer r4 = r8.bufferField
            long r4 = r4.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto Ld
            long r2 = r2 + r4
            okio.Buffer r6 = r8.bufferField
            r9.write(r6, r4)
            goto Ld
        L2e:
            okio.Buffer r4 = r8.bufferField
            long r4 = r4.size()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4a
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            long r2 = r2 + r0
            okio.Buffer r0 = r8.bufferField
            okio.Buffer r8 = r8.bufferField
            long r4 = r8.size()
            r9.write(r0, r4)
        L4a:
            return r2
    }

    public static final byte commonReadByte(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            byte r2 = r2.readByte()
            return r2
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            byte[] r2 = r2.readByteArray()
            return r2
    }

    public static final byte[] commonReadByteArray(okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            byte[] r1 = r1.readByteArray(r2)
            return r1
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            okio.ByteString r2 = r2.readByteString()
            return r2
    }

    public static final okio.ByteString commonReadByteString(okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            okio.ByteString r1 = r1.readByteString(r2)
            return r1
    }

    public static final long commonReadDecimalLong(okio.RealBufferedSource r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L59
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L23
            r9 = 57
            if (r8 <= r9) goto L2c
        L23:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2e
            r5 = 45
            if (r8 == r5) goto L2c
            goto L2e
        L2c:
            r4 = r6
            goto Ld
        L2e:
            if (r4 == 0) goto L31
            goto L59
        L31:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            r0.<init>(r1)
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L59:
            okio.Buffer r10 = r10.bufferField
            long r0 = r10.readDecimalLong()
            return r0
    }

    public static final void commonReadFully(okio.RealBufferedSource r1, okio.Buffer r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.require(r3)     // Catch: java.io.EOFException -> L13
            okio.Buffer r1 = r1.bufferField
            r1.readFully(r2, r3)
            return
        L13:
            r3 = move-exception
            okio.Buffer r1 = r1.bufferField
            okio.Source r1 = (okio.Source) r1
            r2.writeAll(r1)
            throw r3
    }

    public static final void commonReadFully(okio.RealBufferedSource r6, byte[] r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.length     // Catch: java.io.EOFException -> L15
            long r0 = (long) r0     // Catch: java.io.EOFException -> L15
            r6.require(r0)     // Catch: java.io.EOFException -> L15
            okio.Buffer r6 = r6.bufferField
            r6.readFully(r7)
            return
        L15:
            r0 = move-exception
            r1 = 0
        L17:
            okio.Buffer r2 = r6.bufferField
            long r2 = r2.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L3b
            okio.Buffer r2 = r6.bufferField
            okio.Buffer r3 = r6.bufferField
            long r3 = r3.size()
            int r3 = (int) r3
            int r2 = r2.read(r7, r1, r3)
            r3 = -1
            if (r2 == r3) goto L35
            int r1 = r1 + r2
            goto L17
        L35:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L3b:
            throw r0
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            r5.require(r0)
            r0 = 0
        Lb:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L61
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L23
            r3 = 57
            if (r2 <= r3) goto L34
        L23:
            r3 = 97
            if (r2 < r3) goto L2b
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L34
        L2b:
            r3 = 65
            if (r2 < r3) goto L36
            r3 = 70
            if (r2 <= r3) goto L34
            goto L36
        L34:
            r0 = r1
            goto Lb
        L36:
            if (r0 == 0) goto L39
            goto L61
        L39:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L61:
            okio.Buffer r5 = r5.bufferField
            long r0 = r5.readHexadecimalUnsignedLong()
            return r0
    }

    public static final int commonReadInt(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readInt()
            return r2
    }

    public static final int commonReadIntLe(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            int r2 = r2.readIntLe()
            return r2
    }

    public static final long commonReadLong(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLong()
            return r0
    }

    public static final long commonReadLongLe(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 8
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            long r0 = r2.readLongLe()
            return r0
    }

    public static final short commonReadShort(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShort()
            return r2
    }

    public static final short commonReadShortLe(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 2
            r2.require(r0)
            okio.Buffer r2 = r2.bufferField
            short r2 = r2.readShortLe()
            return r2
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r2 = r2.bufferField
            java.lang.String r2 = r2.readUtf8()
            return r2
    }

    public static final java.lang.String commonReadUtf8(okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.require(r2)
            okio.Buffer r1 = r1.bufferField
            java.lang.String r1 = r1.readUtf8(r2)
            return r1
    }

    public static final int commonReadUtf8CodePoint(okio.RealBufferedSource r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.bufferField
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L1e
            r0 = 2
            r3.require(r0)
            goto L35
        L1e:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L2a
            r0 = 3
            r3.require(r0)
            goto L35
        L2a:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L35
            r0 = 4
            r3.require(r0)
        L35:
            okio.Buffer r3 = r3.bufferField
            int r3 = r3.readUtf8CodePoint()
            return r3
    }

    public static final java.lang.String commonReadUtf8Line(okio.RealBufferedSource r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L2a
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L28
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            java.lang.String r4 = r4.readUtf8(r0)
            goto L30
        L28:
            r4 = 0
            goto L30
        L2a:
            okio.Buffer r4 = r4.bufferField
            java.lang.String r4 = okio.internal.Buffer.readUtf8Line(r4, r0)
        L30:
            return r4
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.RealBufferedSource r13, long r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L18
            r5 = r0
            goto L1a
        L18:
            long r5 = r14 + r3
        L1a:
            r8 = 10
            r9 = 0
            r7 = r13
            r11 = r5
            long r7 = r7.indexOf(r8, r9, r11)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L31
            okio.Buffer r13 = r13.bufferField
            java.lang.String r13 = okio.internal.Buffer.readUtf8Line(r13, r7)
            return r13
        L31:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5f
            boolean r0 = r13.request(r5)
            if (r0 == 0) goto L5f
            okio.Buffer r0 = r13.bufferField
            long r1 = r5 - r3
            byte r0 = r0.getByte(r1)
            r1 = 13
            if (r0 != r1) goto L5f
            long r3 = r3 + r5
            boolean r0 = r13.request(r3)
            if (r0 == 0) goto L5f
            okio.Buffer r0 = r13.bufferField
            byte r0 = r0.getByte(r5)
            r1 = 10
            if (r0 != r1) goto L5f
            okio.Buffer r13 = r13.bufferField
            java.lang.String r13 = okio.internal.Buffer.readUtf8Line(r13, r5)
            return r13
        L5f:
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            okio.Buffer r0 = r13.bufferField
            okio.Buffer r1 = r13.bufferField
            long r1 = r1.size()
            r3 = 32
            long r3 = (long) r3
            long r4 = java.lang.Math.min(r3, r1)
            r2 = 0
            r1 = r6
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\\n not found: limit="
            r1.<init>(r2)
            okio.Buffer r13 = r13.bufferField
            long r2 = r13.size()
            long r13 = java.lang.Math.min(r2, r14)
            java.lang.StringBuilder r13 = r1.append(r13)
            java.lang.String r14 = " content="
            java.lang.StringBuilder r13 = r13.append(r14)
            okio.ByteString r14 = r6.readByteString()
            java.lang.String r14 = r14.hex()
            java.lang.StringBuilder r13 = r13.append(r14)
            r14 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        Lb0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "limit < 0: "
            r13.<init>(r0)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
    }

    public static final boolean commonRequest(okio.RealBufferedSource r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L39
            boolean r0 = r4.closed
            if (r0 != 0) goto L2d
        Lf:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2b
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lf
            r4 = 0
            return r4
        L2b:
            r4 = 1
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "closed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r4.<init>(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static final void commonRequire(okio.RealBufferedSource r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r1 = r1.request(r2)
            if (r1 == 0) goto Lc
            return
        Lc:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public static final int commonSelect(okio.RealBufferedSource r5, okio.Options r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.closed
            if (r0 != 0) goto L3e
        Le:
            okio.Buffer r0 = r5.bufferField
            r1 = 1
            int r0 = okio.internal.Buffer.selectPrefix(r0, r6, r1)
            r1 = -2
            r2 = -1
            if (r0 == r1) goto L2d
            if (r0 == r2) goto L2c
            okio.ByteString[] r6 = r6.getByteStrings$okio()
            r6 = r6[r0]
            int r6 = r6.size()
            okio.Buffer r5 = r5.bufferField
            long r1 = (long) r6
            r5.skip(r1)
            return r0
        L2c:
            return r2
        L2d:
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r3)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Le
            return r2
        L3e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public static final void commonSkip(okio.RealBufferedSource r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4.closed
            if (r0 != 0) goto L42
        L9:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L41
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L30
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2a
            goto L30
        L2a:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L30:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r5, r0)
            okio.Buffer r2 = r4.bufferField
            r2.skip(r0)
            long r5 = r5 - r0
            goto L9
        L41:
            return
        L42:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "closed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static final okio.Timeout commonTimeout(okio.RealBufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.Source r1 = r1.source
            okio.Timeout r1 = r1.timeout()
            return r1
    }

    public static final java.lang.String commonToString(okio.RealBufferedSource r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            okio.Source r2 = r2.source
            java.lang.StringBuilder r2 = r0.append(r2)
            r0 = 41
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }
}
