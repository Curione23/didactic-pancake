package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyStatusTypeProtoConverter {

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.KeyStatusTypeProtoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType = null;

        static {
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType = r0
                r1 = 1
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r2 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r3 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r4 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.google.crypto.tink.proto.KeyStatusType[] r3 = com.google.crypto.tink.proto.KeyStatusType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType = r3
                com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L4d
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                return
        }
    }

    private KeyStatusTypeProtoConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType fromProto(com.google.crypto.tink.proto.KeyStatusType r1) {
            int[] r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r1 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED
            return r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown key status type."
            r1.<init>(r0)
            throw r1
        L1c:
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r1 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED
            return r1
        L1f:
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r1 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED
            return r1
    }

    public static com.google.crypto.tink.proto.KeyStatusType toProto(com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType r1) {
            int[] r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED
            return r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown key status type."
            r1.<init>(r0)
            throw r1
        L1c:
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DISABLED
            return r1
        L1f:
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            return r1
    }
}
