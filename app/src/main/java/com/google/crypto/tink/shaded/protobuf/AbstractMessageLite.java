package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite<MessageType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.google.crypto.tink.shaded.protobuf.MessageLite {
    protected int memoizedHashCode;

    public static abstract class Builder<MessageType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType>> implements com.google.crypto.tink.shaded.protobuf.MessageLite.Builder {

        static final class LimitedInputStream extends java.io.FilterInputStream {
            private int limit;

            LimitedInputStream(java.io.InputStream r1, int r2) {
                    r0 = this;
                    r0.<init>(r1)
                    r0.limit = r2
                    return
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws java.io.IOException {
                    r2 = this;
                    int r0 = super.available()
                    int r1 = r2.limit
                    int r0 = java.lang.Math.min(r0, r1)
                    return r0
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                    r2 = this;
                    int r0 = r2.limit
                    if (r0 > 0) goto L6
                    r0 = -1
                    return r0
                L6:
                    int r0 = super.read()
                    if (r0 < 0) goto L12
                    int r1 = r2.limit
                    int r1 = r1 + (-1)
                    r2.limit = r1
                L12:
                    return r0
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                    r1 = this;
                    int r0 = r1.limit
                    if (r0 > 0) goto L6
                    r2 = -1
                    return r2
                L6:
                    int r4 = java.lang.Math.min(r4, r0)
                    int r2 = super.read(r2, r3, r4)
                    if (r2 < 0) goto L15
                    int r3 = r1.limit
                    int r3 = r3 - r2
                    r1.limit = r3
                L15:
                    return r2
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long r3) throws java.io.IOException {
                    r2 = this;
                    int r0 = r2.limit
                    long r0 = (long) r0
                    long r3 = java.lang.Math.min(r3, r0)
                    long r3 = super.skip(r3)
                    int r3 = (int) r3
                    if (r3 < 0) goto L13
                    int r4 = r2.limit
                    int r4 = r4 - r3
                    r2.limit = r4
                L13:
                    long r3 = (long) r3
                    return r3
            }
        }

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        protected static <T> void addAll(java.lang.Iterable<T> r0, java.util.Collection<? super T> r1) {
                java.util.List r1 = (java.util.List) r1
                addAll(r0, r1)
                return
        }

        protected static <T> void addAll(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
                com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3)
                boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
                if (r0 == 0) goto L62
                com.google.crypto.tink.shaded.protobuf.LazyStringList r3 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r3
                java.util.List r3 = r3.getUnderlyingElements()
                r0 = r4
                com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
                int r4 = r4.size()
                java.util.Iterator r3 = r3.iterator()
            L18:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L6f
                java.lang.Object r1 = r3.next()
                if (r1 != 0) goto L52
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r1 = "Element at index "
                r3.<init>(r1)
                int r1 = r0.size()
                int r1 = r1 - r4
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r1 = " is null."
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r3 = r3.toString()
                int r1 = r0.size()
                int r1 = r1 + (-1)
            L44:
                if (r1 < r4) goto L4c
                r0.remove(r1)
                int r1 = r1 + (-1)
                goto L44
            L4c:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                r4.<init>(r3)
                throw r4
            L52:
                boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
                if (r2 == 0) goto L5c
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
                r0.add(r1)
                goto L18
            L5c:
                java.lang.String r1 = (java.lang.String) r1
                r0.add(r1)
                goto L18
            L62:
                boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection
                if (r0 == 0) goto L6c
                java.util.Collection r3 = (java.util.Collection) r3
                r4.addAll(r3)
                goto L6f
            L6c:
                addAllCheckingNulls(r3, r4)
            L6f:
                return
        }

        private static <T> void addAllCheckingNulls(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
                boolean r0 = r4 instanceof java.util.ArrayList
                if (r0 == 0) goto L1a
                boolean r0 = r3 instanceof java.util.Collection
                if (r0 == 0) goto L1a
                r0 = r4
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r1 = r4.size()
                r2 = r3
                java.util.Collection r2 = (java.util.Collection) r2
                int r2 = r2.size()
                int r1 = r1 + r2
                r0.ensureCapacity(r1)
            L1a:
                int r0 = r4.size()
                java.util.Iterator r3 = r3.iterator()
            L22:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L60
                java.lang.Object r1 = r3.next()
                if (r1 != 0) goto L5c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r1 = "Element at index "
                r3.<init>(r1)
                int r1 = r4.size()
                int r1 = r1 - r0
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r1 = " is null."
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r3 = r3.toString()
                int r1 = r4.size()
                int r1 = r1 + (-1)
            L4e:
                if (r1 < r0) goto L56
                r4.remove(r1)
                int r1 = r1 + (-1)
                goto L4e
            L56:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                r4.<init>(r3)
                throw r4
            L5c:
                r4.add(r1)
                goto L22
            L60:
                return
        }

        private java.lang.String getReadingExceptionMessage(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Reading "
                r0.<init>(r1)
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " from a "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r0 = " threw an IOException (should never happen)."
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                return r3
        }

        protected static com.google.crypto.tink.shaded.protobuf.UninitializedMessageException newUninitializedMessageException(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public abstract BuilderType clone();

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r1.clone()
                return r0
        }

        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ java.lang.Object mo709clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r0 = r1.clone()
                return r0
        }

        protected abstract BuilderType internalMergeFrom(MessageType r1);

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                boolean r2 = r1.mergeDelimitedFrom(r2, r0)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(java.io.InputStream r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                int r0 = r3.read()
                r1 = -1
                if (r0 != r1) goto L9
                r3 = 0
                return r3
            L9:
                int r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(r0, r3)
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream r1 = new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream
                r1.<init>(r3, r0)
                r2.mergeFrom(r1, r4)
                r3 = 1
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = r3.newCodedInput()     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r2.mergeFrom(r3)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r0 = 0
                r3.checkLastTagWas(r0)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r2
            Lc:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "ByteString"
                java.lang.String r1 = r2.getReadingExceptionMessage(r1)
                r0.<init>(r1, r3)
                throw r0
            L19:
                r3 = move-exception
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = r2.newCodedInput()     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r1.mergeFrom(r2, r3)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r3 = 0
                r2.checkLastTagWas(r3)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r1
            Lc:
                r2 = move-exception
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r0 = "ByteString"
                java.lang.String r0 = r1.getReadingExceptionMessage(r0)
                r3.<init>(r0, r2)
                throw r3
            L19:
                r2 = move-exception
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r2 = r1.mergeFrom(r2, r0)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.getDefaultInstanceForType()
                java.lang.Class r0 = r0.getClass()
                boolean r0 = r0.isInstance(r2)
                if (r0 == 0) goto L15
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r2 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r2
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r2 = r1.internalMergeFrom(r2)
                return r2
            L15:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "mergeFrom(MessageLite) can only merge messages of the same type."
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream r2) throws java.io.IOException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r2)
                r1.mergeFrom(r2)
                r0 = 0
                r2.checkLastTagWas(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r1)
                r0.mergeFrom(r1, r2)
                r2 = 0
                r1.checkLastTagWas(r2)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                r0 = 0
                int r1 = r3.length
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r3 = r2.mergeFrom(r3, r0, r1)
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r1, r2, r3)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r0.mergeFrom(r1)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r2 = 0
                r1.checkLastTagWas(r2)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r0
            Lc:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "byte array"
                java.lang.String r3 = r0.getReadingExceptionMessage(r3)
                r2.<init>(r3, r1)
                throw r2
            L19:
                r1 = move-exception
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r1, r2, r3)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r0.mergeFrom(r1, r4)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                r2 = 0
                r1.checkLastTagWas(r2)     // Catch: java.io.IOException -> Lc com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L19
                return r0
            Lc:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "byte array"
                java.lang.String r3 = r0.getReadingExceptionMessage(r3)
                r2.<init>(r3, r1)
                throw r2
            L19:
                r1 = move-exception
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                r0 = 0
                int r1 = r3.length
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r3 = r2.mergeFrom(r3, r0, r1, r4)
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }
    }

    protected interface InternalOneOfEnum {
        int getNumber();
    }

    public AbstractMessageLite() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.memoizedHashCode = r0
            return
    }

    @java.lang.Deprecated
    protected static <T> void addAll(java.lang.Iterable<T> r0, java.util.Collection<? super T> r1) {
            java.util.List r1 = (java.util.List) r1
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder.addAll(r0, r1)
            return
    }

    protected static <T> void addAll(java.lang.Iterable<T> r0, java.util.List<? super T> r1) {
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder.addAll(r0, r1)
            return
    }

    protected static void checkByteStringIsUtf8(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws java.lang.IllegalArgumentException {
            boolean r1 = r1.isValidUtf8()
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Byte string is not UTF-8."
            r1.<init>(r0)
            throw r1
    }

    private java.lang.String getSerializingExceptionMessage(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Serializing "
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " to a "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " threw an IOException (should never happen)."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    int getMemoizedSerializedSize() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    int getSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema r3) {
            r2 = this;
            int r0 = r2.getMemoizedSerializedSize()
            r1 = -1
            if (r0 != r1) goto Le
            int r0 = r3.getSerializedSize(r2)
            r2.setMemoizedSerializedSize(r0)
        Le:
            return r0
    }

    com.google.crypto.tink.shaded.protobuf.UninitializedMessageException newUninitializedMessageException() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException
            r0.<init>(r1)
            return r0
    }

    void setMemoizedSerializedSize(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public byte[] toByteArray() {
            r3 = this;
            int r0 = r3.getSerializedSize()     // Catch: java.io.IOException -> L11
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L11
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.newInstance(r0)     // Catch: java.io.IOException -> L11
            r3.writeTo(r1)     // Catch: java.io.IOException -> L11
            r1.checkNoSpaceLeft()     // Catch: java.io.IOException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "byte array"
            java.lang.String r2 = r3.getSerializingExceptionMessage(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public com.google.crypto.tink.shaded.protobuf.ByteString toByteString() {
            r3 = this;
            int r0 = r3.getSerializedSize()     // Catch: java.io.IOException -> L14
            com.google.crypto.tink.shaded.protobuf.ByteString$CodedBuilder r0 = com.google.crypto.tink.shaded.protobuf.ByteString.newCodedBuilder(r0)     // Catch: java.io.IOException -> L14
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r0.getCodedOutput()     // Catch: java.io.IOException -> L14
            r3.writeTo(r1)     // Catch: java.io.IOException -> L14
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.build()     // Catch: java.io.IOException -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "ByteString"
            java.lang.String r2 = r3.getSerializingExceptionMessage(r2)
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeDelimitedTo(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.getSerializedSize()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r0)
            int r1 = r1 + r0
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computePreferredBufferSize(r1)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.newInstance(r3, r1)
            r3.writeUInt32NoTag(r0)
            r2.writeTo(r3)
            r3.flush()
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeTo(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.getSerializedSize()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computePreferredBufferSize(r0)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.newInstance(r2, r0)
            r1.writeTo(r2)
            r2.flush()
            return
    }
}
