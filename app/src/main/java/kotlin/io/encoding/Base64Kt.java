package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003¨\u0006\u000f"}, d2 = {"base64DecodeMap", "", "getBase64DecodeMap$annotations", "()V", "base64EncodeMap", "", "getBase64EncodeMap$annotations", "base64UrlDecodeMap", "getBase64UrlDecodeMap$annotations", "base64UrlEncodeMap", "getBase64UrlEncodeMap$annotations", "isInMimeAlphabet", "", "symbol", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Base64Kt {
    private static final int[] base64DecodeMap = null;
    private static final byte[] base64EncodeMap = null;
    private static final int[] base64UrlDecodeMap = null;
    private static final byte[] base64UrlEncodeMap = null;

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            kotlin.io.encoding.Base64Kt.base64EncodeMap = r0
            r1 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r1]
            r6 = 6
            r7 = 0
            r3 = -1
            r4 = 0
            r5 = 0
            r2 = r1
            kotlin.collections.ArraysKt.fill$default(r2, r3, r4, r5, r6, r7)
            r2 = 61
            r3 = -2
            r1[r2] = r3
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r5 = r4
        L1f:
            if (r4 >= r2) goto L2b
            r6 = r0[r4]
            int r7 = r5 + 1
            r1[r6] = r5
            int r4 = r4 + 1
            r5 = r7
            goto L1f
        L2b:
            kotlin.io.encoding.Base64Kt.base64DecodeMap = r1
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x007e: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            kotlin.io.encoding.Base64Kt.base64UrlEncodeMap = r0
            r1 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r1]
            r8 = 6
            r9 = 0
            r5 = -1
            r6 = 0
            r7 = 0
            r4 = r1
            kotlin.collections.ArraysKt.fill$default(r4, r5, r6, r7, r8, r9)
            r2 = 61
            r4 = -2
            r1[r2] = r4
            int r2 = r0.length
            r4 = r3
        L4a:
            if (r3 >= r2) goto L56
            r5 = r0[r3]
            int r6 = r4 + 1
            r1[r5] = r4
            int r3 = r3 + 1
            r4 = r6
            goto L4a
        L56:
            kotlin.io.encoding.Base64Kt.base64UrlDecodeMap = r1
            return
    }

    public static final /* synthetic */ int[] access$getBase64DecodeMap$p() {
            int[] r0 = kotlin.io.encoding.Base64Kt.base64DecodeMap
            return r0
    }

    public static final /* synthetic */ byte[] access$getBase64EncodeMap$p() {
            byte[] r0 = kotlin.io.encoding.Base64Kt.base64EncodeMap
            return r0
    }

    public static final /* synthetic */ int[] access$getBase64UrlDecodeMap$p() {
            int[] r0 = kotlin.io.encoding.Base64Kt.base64UrlDecodeMap
            return r0
    }

    public static final /* synthetic */ byte[] access$getBase64UrlEncodeMap$p() {
            byte[] r0 = kotlin.io.encoding.Base64Kt.base64UrlEncodeMap
            return r0
    }

    private static /* synthetic */ void getBase64DecodeMap$annotations() {
            return
    }

    private static /* synthetic */ void getBase64EncodeMap$annotations() {
            return
    }

    private static /* synthetic */ void getBase64UrlDecodeMap$annotations() {
            return
    }

    private static /* synthetic */ void getBase64UrlEncodeMap$annotations() {
            return
    }

    public static final boolean isInMimeAlphabet(int r2) {
            if (r2 < 0) goto Le
            int[] r0 = kotlin.io.encoding.Base64Kt.base64DecodeMap
            int r1 = r0.length
            if (r2 >= r1) goto Le
            r2 = r0[r2]
            r0 = -1
            if (r2 == r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }
}
