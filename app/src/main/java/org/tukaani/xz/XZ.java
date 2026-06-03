package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class XZ {
    public static final int CHECK_CRC32 = 1;
    public static final int CHECK_CRC64 = 4;
    public static final int CHECK_NONE = 0;
    public static final int CHECK_SHA256 = 10;
    public static final byte[] FOOTER_MAGIC = null;
    public static final byte[] HEADER_MAGIC = null;

    static {
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [-3, 55, 122, 88, 90, 0} // fill-array
            org.tukaani.xz.XZ.HEADER_MAGIC = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [89, 90} // fill-array
            org.tukaani.xz.XZ.FOOTER_MAGIC = r0
            return
    }

    private XZ() {
            r0 = this;
            r0.<init>()
            return
    }
}
