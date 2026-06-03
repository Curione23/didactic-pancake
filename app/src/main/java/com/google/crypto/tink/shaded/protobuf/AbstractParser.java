package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractParser<MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> implements com.google.crypto.tink.shaded.protobuf.Parser<MessageType> {
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = null;

    static {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY = r0
            return
    }

    public AbstractParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private MessageType checkMessageInitialized(MessageType r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            if (r2 == 0) goto L16
            boolean r0 = r2.isInitialized()
            if (r0 == 0) goto L9
            goto L16
        L9:
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = r1.newUninitializedMessageException(r2)
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = r0.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r0.setUnfinishedMessage(r2)
            throw r2
        L16:
            return r2
    }

    private com.google.crypto.tink.shaded.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r2 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r2
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r2 = r2.newUninitializedMessageException()
            return r2
        Lb:
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parseDelimitedFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialDelimitedFrom(r1, r2)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.checkMessageInitialized(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseDelimitedFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseDelimitedFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseDelimitedFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.checkMessageInitialized(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            java.lang.Object r1 = r0.parsePartialFrom(r1, r2)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.checkMessageInitialized(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.checkMessageInitialized(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r2)
            java.lang.Object r3 = r1.parsePartialFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0 = 0
            r2.checkLastTagWas(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L13
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.checkMessageInitialized(r3)
            return r2
        L13:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r3)
            throw r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parseFrom(r2, r3, r4, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2, r3, r4)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.checkMessageInitialized(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r2.parseFrom(r3, r0, r1, r4)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2, r3)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parsePartialDelimitedFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            int r0 = r3.read()     // Catch: java.io.IOException -> L17
            r1 = -1
            if (r0 != r1) goto L9
            r3 = 0
            return r3
        L9:
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(r0, r3)     // Catch: java.io.IOException -> L17
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream r1 = new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream
            r1.<init>(r3, r0)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r2.parsePartialFrom(r1, r4)
            return r3
        L17:
            r3 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r4.<init>(r3)
            throw r4
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialDelimitedFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialDelimitedFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialDelimitedFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parsePartialFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r2.newCodedInput()
            java.lang.Object r3 = r1.parsePartialFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0 = 0
            r2.checkLastTagWas(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lf
            return r3
        Lf:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r3)
            throw r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            java.lang.Object r2 = r1.parsePartialFrom(r2, r0)
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parsePartialFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r2)
            java.lang.Object r3 = r1.parsePartialFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0 = 0
            r2.checkLastTagWas(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lf
            return r3
        Lf:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r3)
            throw r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r3 = this;
            int r0 = r4.length
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            r2 = 0
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = r3.parsePartialFrom(r4, r2, r0, r1)
            return r4
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r1.parsePartialFrom(r2, r3, r4, r0)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r1, r2, r3)
            java.lang.Object r2 = r0.parsePartialFrom(r1, r4)
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            r3 = 0
            r1.checkLastTagWas(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lf
            return r2
        Lf:
            r1 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = r1.setUnfinishedMessage(r2)
            throw r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r2.parsePartialFrom(r3, r0, r1, r4)
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2, r3)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            return r1
    }
}
