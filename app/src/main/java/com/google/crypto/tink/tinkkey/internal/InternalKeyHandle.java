package com.google.crypto.tink.tinkkey.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalKeyHandle extends com.google.crypto.tink.tinkkey.KeyHandle {
    public InternalKeyHandle(com.google.crypto.tink.tinkkey.TinkKey r1, com.google.crypto.tink.proto.KeyStatusType r2, int r3) {
            r0 = this;
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r2 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.fromProto(r2)
            r0.<init>(r1, r2, r3)
            return
    }
}
