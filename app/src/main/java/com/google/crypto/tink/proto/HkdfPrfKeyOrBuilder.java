package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public interface HkdfPrfKeyOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.shaded.protobuf.ByteString getKeyValue();

    com.google.crypto.tink.proto.HkdfPrfParams getParams();

    int getVersion();

    boolean hasParams();
}
