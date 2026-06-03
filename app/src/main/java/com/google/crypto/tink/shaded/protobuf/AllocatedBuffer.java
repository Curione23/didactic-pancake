package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class AllocatedBuffer {



    AllocatedBuffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(java.nio.ByteBuffer r1) {
            java.lang.String r0 = "buffer"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r1, r0)
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$1 r0 = new com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$1
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = wrapNoCheck(r2, r0, r1)
            return r2
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(byte[] r2, int r3, int r4) {
            if (r3 < 0) goto Le
            if (r4 < 0) goto Le
            int r0 = r3 + r4
            int r1 = r2.length
            if (r0 > r1) goto Le
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer r2 = wrapNoCheck(r2, r3, r4)
            return r2
        Le:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r3 = "bytes.length=%d, offset=%d, length=%d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
    }

    private static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrapNoCheck(byte[] r1, int r2, int r3) {
            com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$2 r0 = new com.google.crypto.tink.shaded.protobuf.AllocatedBuffer$2
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract java.nio.ByteBuffer nioBuffer();

    public abstract int position();

    public abstract com.google.crypto.tink.shaded.protobuf.AllocatedBuffer position(int r1);

    public abstract int remaining();
}
