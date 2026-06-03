package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 22\u00020\u0001:\u00012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J \u0010 \u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J5\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J=\u0010&\u001a\u0002H'\"\f\b\u0000\u0010'*\u00060(j\u0002`)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u0002H'2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010*J\"\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J%\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b-J(\u0010.\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J \u00101\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u00063"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "(ZZ)V", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "bytesToStringImpl", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "charsToBytesImpl", "", "startIndex", "", "endIndex", "charsToBytesImpl$kotlin_stdlib", "checkDestinationBounds", "", "destinationSize", "destinationOffset", "capacityNeeded", "checkSourceBounds", "sourceSize", "checkSourceBounds$kotlin_stdlib", "decode", "decodeImpl", "destination", "decodeIntoByteArray", "decodeSize", "encode", "encodeIntoByteArray", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "skipIllegalSymbolsIfMime", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Base64 {
    public static final kotlin.io.encoding.Base64.Default Default = null;
    private static final kotlin.io.encoding.Base64 Mime = null;
    private static final kotlin.io.encoding.Base64 UrlSafe = null;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    private static final byte[] mimeLineSeparatorSymbols = null;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;

    /* JADX INFO: compiled from: Base64.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends kotlin.io.encoding.Base64 {
        private Default() {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
        }

        public /* synthetic */ Default(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final kotlin.io.encoding.Base64 getMime() {
                r1 = this;
                kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.access$getMime$cp()
                return r0
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
                r1 = this;
                byte[] r0 = kotlin.io.encoding.Base64.access$getMimeLineSeparatorSymbols$cp()
                return r0
        }

        public final kotlin.io.encoding.Base64 getUrlSafe() {
                r1 = this;
                kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.access$getUrlSafe$cp()
                return r0
        }
    }

    static {
            kotlin.io.encoding.Base64$Default r0 = new kotlin.io.encoding.Base64$Default
            r1 = 0
            r0.<init>(r1)
            kotlin.io.encoding.Base64.Default = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            kotlin.io.encoding.Base64.mimeLineSeparatorSymbols = r0
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.encoding.Base64.UrlSafe = r0
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            r0.<init>(r2, r1)
            kotlin.io.encoding.Base64.Mime = r0
            return
    }

    private Base64(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.isUrlSafe = r1
            r0.isMimeScheme = r2
            if (r1 == 0) goto L18
            if (r2 != 0) goto Lc
            goto L18
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L18:
            return
    }

    public /* synthetic */ Base64(boolean r1, boolean r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ kotlin.io.encoding.Base64 access$getMime$cp() {
            kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.Mime
            return r0
    }

    public static final /* synthetic */ byte[] access$getMimeLineSeparatorSymbols$cp() {
            byte[] r0 = kotlin.io.encoding.Base64.mimeLineSeparatorSymbols
            return r0
    }

    public static final /* synthetic */ kotlin.io.encoding.Base64 access$getUrlSafe$cp() {
            kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.UrlSafe
            return r0
    }

    private final void checkDestinationBounds(int r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = ", destination size: "
            if (r6 < 0) goto L34
            if (r6 > r5) goto L34
            int r1 = r6 + r7
            if (r1 < 0) goto Ld
            if (r1 > r5) goto Ld
            return
        Ld:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The destination array does not have enough capacity, destination offset: "
            r2.<init>(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = ", capacity needed: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L34:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "destination offset: "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r7.<init>(r5)
            throw r7
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 r0, java.lang.CharSequence r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L14
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lf
            int r3 = r1.length()
        Lf:
            byte[] r0 = r0.decode(r1, r2, r3)
            return r0
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decode"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.decode(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decode"
            r0.<init>(r1)
            throw r0
    }

    private final int decodeImpl(byte[] r19, byte[] r20, int r21, int r22, int r23) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r23
            boolean r3 = r0.isUrlSafe
            if (r3 == 0) goto Lf
            int[] r3 = kotlin.io.encoding.Base64Kt.access$getBase64UrlDecodeMap$p()
            goto L13
        Lf:
            int[] r3 = kotlin.io.encoding.Base64Kt.access$getBase64DecodeMap$p()
        L13:
            r4 = -8
            r5 = 0
            r8 = r21
            r7 = r4
            r6 = r5
            r5 = r22
        L1b:
            java.lang.String r9 = ") at index "
            java.lang.String r10 = "toString(this, checkRadix(radix))"
            java.lang.String r11 = "'("
            r13 = -2
            if (r5 >= r2) goto Ld2
            if (r7 != r4) goto L6b
            int r15 = r5 + 3
            if (r15 >= r2) goto L6b
            int r15 = r5 + 1
            r4 = r1[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r3[r4]
            int r16 = r5 + 2
            r15 = r1[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r15 = r3[r15]
            int r17 = r5 + 3
            r14 = r1[r16]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r3[r14]
            int r16 = r5 + 4
            r12 = r1[r17]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r3[r12]
            int r4 = r4 << 18
            int r15 = r15 << 12
            r4 = r4 | r15
            int r14 = r14 << 6
            r4 = r4 | r14
            r4 = r4 | r12
            if (r4 < 0) goto L6b
            int r5 = r8 + 1
            int r9 = r4 >> 16
            byte r9 = (byte) r9
            r20[r8] = r9
            int r9 = r8 + 2
            int r10 = r4 >> 8
            byte r10 = (byte) r10
            r20[r5] = r10
            int r8 = r8 + 3
            byte r4 = (byte) r4
            r20[r9] = r4
            r5 = r16
            goto Lcf
        L6b:
            r4 = r1[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r12 = r3[r4]
            if (r12 >= 0) goto Lb4
            if (r12 != r13) goto L7a
            int r5 = r0.handlePaddingSymbol(r1, r5, r2, r7)
            goto Ld2
        L7a:
            boolean r12 = r0.isMimeScheme
            if (r12 == 0) goto L81
            int r5 = r5 + 1
            goto Lcf
        L81:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid symbol '"
            r2.<init>(r3)
            char r3 = (char) r4
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            r3 = 8
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r3 = java.lang.Integer.toString(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r10)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lb4:
            int r5 = r5 + 1
            int r4 = r6 << 6
            r6 = r4 | r12
            int r4 = r7 + 6
            if (r4 < 0) goto Lce
            int r9 = r8 + 1
            int r10 = r6 >>> r4
            byte r10 = (byte) r10
            r20[r8] = r10
            r8 = 1
            int r4 = r8 << r4
            int r4 = r4 - r8
            r6 = r6 & r4
            int r7 = r7 + (-2)
            r8 = r9
            goto Lcf
        Lce:
            r7 = r4
        Lcf:
            r4 = -8
            goto L1b
        Ld2:
            if (r7 == r13) goto L11c
            int r3 = r0.skipIllegalSymbolsIfMime(r1, r5, r2)
            if (r3 < r2) goto Ldd
            int r8 = r8 - r21
            return r8
        Ldd:
            r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Symbol '"
            r4.<init>(r5)
            char r5 = (char) r1
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r11)
            r5 = 8
            int r5 = kotlin.text.CharsKt.checkRadix(r5)
            java.lang.String r1 = java.lang.Integer.toString(r1, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r10)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r9)
            r4 = 1
            int r3 = r3 - r4
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " is prohibited after the pad character"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L11c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The last unit of input does not have enough bits"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 r7, java.lang.CharSequence r8, byte[] r9, int r10, int r11, int r12, int r13, java.lang.Object r14) {
            if (r14 != 0) goto L22
            r14 = r13 & 4
            r0 = 0
            if (r14 == 0) goto L9
            r4 = r0
            goto La
        L9:
            r4 = r10
        La:
            r10 = r13 & 8
            if (r10 == 0) goto L10
            r5 = r0
            goto L11
        L10:
            r5 = r11
        L11:
            r10 = r13 & 16
            if (r10 == 0) goto L19
            int r12 = r8.length()
        L19:
            r6 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r1.decodeIntoByteArray(r2, r3, r4, r5, r6)
            return r7
        L22:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Super calls with default arguments not supported in this target, function: decodeIntoByteArray"
            r7.<init>(r8)
            throw r7
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 r7, byte[] r8, byte[] r9, int r10, int r11, int r12, int r13, java.lang.Object r14) {
            if (r14 != 0) goto L1f
            r14 = r13 & 4
            r0 = 0
            if (r14 == 0) goto L9
            r4 = r0
            goto La
        L9:
            r4 = r10
        La:
            r10 = r13 & 8
            if (r10 == 0) goto L10
            r5 = r0
            goto L11
        L10:
            r5 = r11
        L11:
            r10 = r13 & 16
            if (r10 == 0) goto L16
            int r12 = r8.length
        L16:
            r6 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r1.decodeIntoByteArray(r2, r3, r4, r5, r6)
            return r7
        L1f:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Super calls with default arguments not supported in this target, function: decodeIntoByteArray"
            r7.<init>(r8)
            throw r7
    }

    private final int decodeSize(byte[] r4, int r5, int r6) {
            r3 = this;
            int r0 = r6 - r5
            if (r0 != 0) goto L6
            r4 = 0
            return r4
        L6:
            r1 = 1
            if (r0 == r1) goto L44
            boolean r1 = r3.isMimeScheme
            if (r1 == 0) goto L26
        Ld:
            if (r5 >= r6) goto L3a
            r1 = r4[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[] r2 = kotlin.io.encoding.Base64Kt.access$getBase64DecodeMap$p()
            r1 = r2[r1]
            if (r1 >= 0) goto L23
            r2 = -2
            if (r1 != r2) goto L21
            int r6 = r6 - r5
            int r0 = r0 - r6
            goto L3a
        L21:
            int r0 = r0 + (-1)
        L23:
            int r5 = r5 + 1
            goto Ld
        L26:
            int r5 = r6 + (-1)
            r5 = r4[r5]
            r1 = 61
            if (r5 != r1) goto L3a
            int r5 = r0 + (-1)
            int r6 = r6 + (-2)
            r4 = r4[r6]
            if (r4 != r1) goto L39
            int r0 = r0 + (-2)
            goto L3a
        L39:
            r0 = r5
        L3a:
            long r4 = (long) r0
            r6 = 6
            long r0 = (long) r6
            long r4 = r4 * r0
            r6 = 8
            long r0 = (long) r6
            long r4 = r4 / r0
            int r4 = (int) r4
            return r4
        L44:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Input should have at list 2 symbols for Base64 decoding, startIndex: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = ", endIndex: "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static /* synthetic */ java.lang.String encode$default(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            java.lang.String r0 = r0.encode(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encode"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int encodeIntoByteArray$default(kotlin.io.encoding.Base64 r7, byte[] r8, byte[] r9, int r10, int r11, int r12, int r13, java.lang.Object r14) {
            if (r14 != 0) goto L1f
            r14 = r13 & 4
            r0 = 0
            if (r14 == 0) goto L9
            r4 = r0
            goto La
        L9:
            r4 = r10
        La:
            r10 = r13 & 8
            if (r10 == 0) goto L10
            r5 = r0
            goto L11
        L10:
            r5 = r11
        L11:
            r10 = r13 & 16
            if (r10 == 0) goto L16
            int r12 = r8.length
        L16:
            r6 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r1.encodeIntoByteArray(r2, r3, r4, r5, r6)
            return r7
        L1f:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Super calls with default arguments not supported in this target, function: encodeIntoByteArray"
            r7.<init>(r8)
            throw r7
    }

    private final int encodeSize(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int r2 = r2 / 3
            boolean r0 = r1.isMimeScheme
            if (r0 == 0) goto Ld
            int r0 = r2 + (-1)
            int r0 = r0 / 19
            goto Le
        Ld:
            r0 = 0
        Le:
            int r2 = r2 * 4
            int r0 = r0 * 2
            int r2 = r2 + r0
            if (r2 < 0) goto L16
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Input is too big"
            r2.<init>(r0)
            throw r2
    }

    public static /* synthetic */ java.lang.Appendable encodeToAppendable$default(kotlin.io.encoding.Base64 r0, byte[] r1, java.lang.Appendable r2, int r3, int r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L11
            r6 = r5 & 4
            if (r6 == 0) goto L7
            r3 = 0
        L7:
            r5 = r5 & 8
            if (r5 == 0) goto Lc
            int r4 = r1.length
        Lc:
            java.lang.Appendable r0 = r0.encodeToAppendable(r1, r2, r3, r4)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encodeToAppendable"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.encodeToByteArray(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encodeToByteArray"
            r0.<init>(r1)
            throw r0
    }

    private final int handlePaddingSymbol(byte[] r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = -8
            if (r5 == r0) goto L40
            r0 = -6
            if (r5 == r0) goto L3d
            r0 = -4
            if (r5 == r0) goto L19
            r2 = -2
            if (r5 != r2) goto Ld
            goto L3d
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unreachable"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L19:
            int r3 = r3 + 1
            int r3 = r1.skipIllegalSymbolsIfMime(r2, r3, r4)
            if (r3 == r4) goto L28
            r2 = r2[r3]
            r4 = 61
            if (r2 != r4) goto L28
            goto L3d
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Missing one pad character at index "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            int r3 = r3 + 1
            return r3
        L40:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Redundant pad character at index "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private final int skipIllegalSymbolsIfMime(byte[] r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.isMimeScheme
            if (r0 != 0) goto L5
            return r4
        L5:
            if (r4 >= r5) goto L18
            r0 = r3[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int[] r1 = kotlin.io.encoding.Base64Kt.access$getBase64DecodeMap$p()
            r0 = r1[r0]
            r1 = -1
            if (r0 == r1) goto L15
            return r4
        L15:
            int r4 = r4 + 1
            goto L5
        L18:
            return r4
    }

    public final java.lang.String bytesToStringImpl$kotlin_stdlib(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L18
            r3 = r5[r2]
            char r3 = (char) r3
            r0.append(r3)
            int r2 = r2 + 1
            goto Ld
        L18:
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "stringBuilder.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(java.lang.CharSequence r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length()
            r4.checkSourceBounds$kotlin_stdlib(r0, r6, r7)
            int r0 = r7 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
        L11:
            if (r6 >= r7) goto L2c
            char r2 = r5.charAt(r6)
            r3 = 255(0xff, float:3.57E-43)
            if (r2 > r3) goto L22
            int r3 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = r3
            goto L29
        L22:
            int r2 = r1 + 1
            r3 = 63
            r0[r1] = r3
            r1 = r2
        L29:
            int r6 = r6 + 1
            goto L11
        L2c:
            return r0
    }

    public final void checkSourceBounds$kotlin_stdlib(int r2, int r3, int r4) {
            r1 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            r0.checkBoundsIndexes$kotlin_stdlib(r3, r4, r2)
            return
    }

    public final byte[] decode(java.lang.CharSequence r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L2c
            int r0 = r7.length()
            r6.checkSourceBounds$kotlin_stdlib(r0, r8, r9)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.nio.charset.Charset r8 = kotlin.text.Charsets.ISO_8859_1
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r9)
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            goto L30
        L2c:
            byte[] r7 = r6.charsToBytesImpl$kotlin_stdlib(r7, r8, r9)
        L30:
            r1 = r7
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            byte[] r7 = decode$default(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public final byte[] decode(byte[] r9, int r10, int r11) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r9.length
            r8.checkSourceBounds$kotlin_stdlib(r0, r10, r11)
            int r0 = r8.decodeSize(r9, r10, r11)
            byte[] r7 = new byte[r0]
            r4 = 0
            r1 = r8
            r2 = r9
            r3 = r7
            r5 = r10
            r6 = r11
            int r9 = r1.decodeImpl(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L1c
            return r7
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    public final int decodeIntoByteArray(java.lang.CharSequence r9, byte[] r10, int r11, int r12, int r13) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L31
            int r0 = r9.length()
            r8.checkSourceBounds$kotlin_stdlib(r0, r12, r13)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r12, r13)
            java.lang.String r12 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r12)
            java.nio.charset.Charset r12 = kotlin.text.Charsets.ISO_8859_1
            java.lang.String r13 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r13)
            byte[] r9 = r9.getBytes(r12)
            java.lang.String r12 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r12)
            goto L35
        L31:
            byte[] r9 = r8.charsToBytesImpl$kotlin_stdlib(r9, r12, r13)
        L35:
            r1 = r9
            r6 = 24
            r7 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r10
            r3 = r11
            int r9 = decodeIntoByteArray$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public final int decodeIntoByteArray(byte[] r3, byte[] r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length
            r2.checkSourceBounds$kotlin_stdlib(r0, r6, r7)
            int r0 = r4.length
            int r1 = r2.decodeSize(r3, r6, r7)
            r2.checkDestinationBounds(r0, r5, r1)
            int r3 = r2.decodeImpl(r3, r4, r5, r6, r7)
            return r3
    }

    public final java.lang.String encode(byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r1.encodeToByteArrayImpl$kotlin_stdlib(r2, r3, r4)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.ISO_8859_1
            r3.<init>(r2, r4)
            return r3
    }

    public final int encodeIntoByteArray(byte[] r2, byte[] r3, int r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r2 = r1.encodeIntoByteArrayImpl$kotlin_stdlib(r2, r3, r4, r5, r6)
            return r2
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] r18, byte[] r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r6 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            int r6 = r1.length
            r0.checkSourceBounds$kotlin_stdlib(r6, r4, r5)
            int r6 = r2.length
            int r7 = r5 - r4
            int r7 = r0.encodeSize(r7)
            r0.checkDestinationBounds(r6, r3, r7)
            boolean r6 = r0.isUrlSafe
            if (r6 == 0) goto L2d
            byte[] r6 = kotlin.io.encoding.Base64Kt.access$getBase64UrlEncodeMap$p()
            goto L31
        L2d:
            byte[] r6 = kotlin.io.encoding.Base64Kt.access$getBase64EncodeMap$p()
        L31:
            boolean r7 = r0.isMimeScheme
            if (r7 == 0) goto L38
            r7 = 19
            goto L3b
        L38:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L3b:
            r8 = r3
        L3c:
            int r9 = r4 + 2
            r10 = 1
            if (r9 >= r5) goto L9f
            int r9 = r5 - r4
            int r9 = r9 / 3
            int r9 = java.lang.Math.min(r9, r7)
            r11 = 0
            r12 = r11
        L4b:
            if (r12 >= r9) goto L8c
            int r13 = r4 + 1
            r14 = r1[r4]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r4 + 2
            r13 = r1[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r15 = r1[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 16
            int r13 = r13 << 8
            r13 = r13 | r14
            r13 = r13 | r15
            int r14 = r8 + 1
            int r15 = r13 >>> 18
            r15 = r6[r15]
            r2[r8] = r15
            int r15 = r8 + 2
            int r16 = r13 >>> 12
            r16 = r16 & 63
            r16 = r6[r16]
            r2[r14] = r16
            int r14 = r8 + 3
            int r16 = r13 >>> 6
            r16 = r16 & 63
            r16 = r6[r16]
            r2[r15] = r16
            int r8 = r8 + 4
            r13 = r13 & 63
            r13 = r6[r13]
            r2[r14] = r13
            int r12 = r12 + 1
            goto L4b
        L8c:
            if (r9 != r7) goto L3c
            if (r4 == r5) goto L3c
            int r9 = r8 + 1
            byte[] r12 = kotlin.io.encoding.Base64.mimeLineSeparatorSymbols
            r11 = r12[r11]
            r2[r8] = r11
            int r8 = r8 + 2
            r10 = r12[r10]
            r2[r9] = r10
            goto L3c
        L9f:
            int r7 = r5 - r4
            r9 = 61
            if (r7 == r10) goto Ld8
            r10 = 2
            if (r7 == r10) goto La9
            goto Lf9
        La9:
            int r7 = r4 + 1
            r11 = r1[r4]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 2
            r1 = r1[r7]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r7 = r11 << 10
            int r1 = r1 << r10
            r1 = r1 | r7
            int r7 = r8 + 1
            int r10 = r1 >>> 12
            r10 = r6[r10]
            r2[r8] = r10
            int r10 = r8 + 2
            int r11 = r1 >>> 6
            r11 = r11 & 63
            r11 = r6[r11]
            r2[r7] = r11
            int r7 = r8 + 3
            r1 = r1 & 63
            r1 = r6[r1]
            r2[r10] = r1
            int r8 = r8 + 4
            r2[r7] = r9
            goto Lf9
        Ld8:
            int r7 = r4 + 1
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            int r4 = r8 + 1
            int r10 = r1 >>> 6
            r10 = r6[r10]
            r2[r8] = r10
            int r10 = r8 + 2
            r1 = r1 & 63
            r1 = r6[r1]
            r2[r4] = r1
            int r1 = r8 + 3
            r2[r10] = r9
            int r8 = r8 + 4
            r2[r1] = r9
            r4 = r7
        Lf9:
            if (r4 != r5) goto Lfd
            int r8 = r8 - r3
            return r8
        Lfd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final <A extends java.lang.Appendable> A encodeToAppendable(byte[] r2, A r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r2 = r1.encodeToByteArrayImpl$kotlin_stdlib(r2, r4, r5)
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = kotlin.text.Charsets.ISO_8859_1
            r4.<init>(r2, r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.append(r4)
            return r3
    }

    public final byte[] encodeToByteArray(byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r1.encodeToByteArrayImpl$kotlin_stdlib(r2, r3, r4)
            return r2
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            r7.checkSourceBounds$kotlin_stdlib(r0, r9, r10)
            int r0 = r10 - r9
            int r0 = r7.encodeSize(r0)
            byte[] r0 = new byte[r0]
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r0
            r5 = r9
            r6 = r10
            r1.encodeIntoByteArrayImpl$kotlin_stdlib(r2, r3, r4, r5, r6)
            return r0
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isMimeScheme
            return r0
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isUrlSafe
            return r0
    }
}
