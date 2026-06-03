package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public interface RsaSsaPssKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    int getModulusSizeInBits();

    com.google.crypto.tink.proto.RsaSsaPssParams getParams();

    com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent();

    boolean hasParams();
}
