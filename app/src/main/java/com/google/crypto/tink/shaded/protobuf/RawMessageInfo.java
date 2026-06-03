package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class RawMessageInfo implements com.google.crypto.tink.shaded.protobuf.MessageInfo {
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] objects;

    RawMessageInfo(com.google.crypto.tink.shaded.protobuf.MessageLite r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.defaultInstance = r4
            r3.info = r5
            r3.objects = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
            r3.flags = r4
            goto L30
        L16:
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
            r1 = 1
        L1b:
            int r2 = r1 + 1
            char r1 = r5.charAt(r1)
            if (r1 < r6) goto L2b
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r0
            r4 = r4 | r1
            int r0 = r0 + 13
            r1 = r2
            goto L1b
        L2b:
            int r5 = r1 << r0
            r4 = r4 | r5
            r3.flags = r4
        L30:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstance() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.defaultInstance
            return r0
    }

    java.lang.Object[] getObjects() {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            return r0
    }

    java.lang.String getStringInfo() {
            r1 = this;
            java.lang.String r0 = r1.info
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public com.google.crypto.tink.shaded.protobuf.ProtoSyntax getSyntax() {
            r2 = this;
            int r0 = r2.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L9
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO2
            goto Lb
        L9:
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
        Lb:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
            r2 = this;
            int r0 = r2.flags
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
