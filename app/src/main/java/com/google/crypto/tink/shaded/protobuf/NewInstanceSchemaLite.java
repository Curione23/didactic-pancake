package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class NewInstanceSchemaLite implements com.google.crypto.tink.shaded.protobuf.NewInstanceSchema {
    NewInstanceSchemaLite() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.NewInstanceSchema
    public java.lang.Object newInstance(java.lang.Object r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.newMutableInstance()
            return r1
    }
}
