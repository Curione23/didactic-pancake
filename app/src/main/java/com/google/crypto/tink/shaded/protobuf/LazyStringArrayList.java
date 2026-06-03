package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class LazyStringArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.String> implements com.google.crypto.tink.shaded.protobuf.LazyStringList, java.util.RandomAccess {
    public static final com.google.crypto.tink.shaded.protobuf.LazyStringList EMPTY = null;
    private static final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList EMPTY_LIST = null;
    private final java.util.List<java.lang.Object> list;

    private static class ByteArrayListView extends java.util.AbstractList<byte[]> implements java.util.RandomAccess {
        private final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList list;

        ByteArrayListView(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
                r0 = this;
                byte[] r2 = (byte[]) r2
                r0.add(r1, r2)
                return
        }

        public void add(int r2, byte[] r3) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$200(r0, r2, r3)
                int r2 = r1.modCount
                int r2 = r2 + 1
                r1.modCount = r2
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                byte[] r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                byte[] r2 = r0.getByteArray(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
                r0 = this;
                byte[] r1 = r0.remove(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                java.lang.String r2 = r0.remove(r2)
                int r0 = r1.modCount
                int r0 = r0 + 1
                r1.modCount = r0
                byte[] r2 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$100(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                byte[] r2 = (byte[]) r2
                byte[] r1 = r0.set(r1, r2)
                return r1
        }

        public byte[] set(int r2, byte[] r3) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$000(r0, r2, r3)
                int r3 = r1.modCount
                int r3 = r3 + 1
                r1.modCount = r3
                byte[] r2 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$100(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                int r0 = r0.size()
                return r0
        }
    }

    private static class ByteStringListView extends java.util.AbstractList<com.google.crypto.tink.shaded.protobuf.ByteString> implements java.util.RandomAccess {
        private final com.google.crypto.tink.shaded.protobuf.LazyStringArrayList list;

        ByteStringListView(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                return
        }

        public void add(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$500(r0, r2, r3)
                int r2 = r1.modCount
                int r2 = r2 + 1
                r1.modCount = r2
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                r0.add(r1, r2)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.crypto.tink.shaded.protobuf.ByteString get(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getByteString(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public com.google.crypto.tink.shaded.protobuf.ByteString remove(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                java.lang.String r2 = r0.remove(r2)
                int r0 = r1.modCount
                int r0 = r0 + 1
                r1.modCount = r0
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$400(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.remove(r1)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.ByteString set(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$300(r0, r2, r3)
                int r3 = r1.modCount
                int r3 = r3 + 1
                r1.modCount = r3
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.access$400(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.set(r1, r2)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = r1.list
                int r0 = r0.size()
                return r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY_LIST = r0
            r0.makeImmutable()
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY = r0
            return
    }

    public LazyStringArrayList() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public LazyStringArrayList(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public LazyStringArrayList(com.google.crypto.tink.shaded.protobuf.LazyStringList r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            r2.list = r0
            r2.addAll(r3)
            return
    }

    private LazyStringArrayList(java.util.ArrayList<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.list = r1
            return
    }

    public LazyStringArrayList(java.util.List<java.lang.String> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    static /* synthetic */ java.lang.Object access$000(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0, int r1, byte[] r2) {
            java.lang.Object r0 = r0.setAndReturn(r1, r2)
            return r0
    }

    static /* synthetic */ byte[] access$100(java.lang.Object r0) {
            byte[] r0 = asByteArray(r0)
            return r0
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0, int r1, byte[] r2) {
            r0.add(r1, r2)
            return
    }

    static /* synthetic */ java.lang.Object access$300(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0, int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            java.lang.Object r0 = r0.setAndReturn(r1, r2)
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.ByteString access$400(java.lang.Object r0) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = asByteString(r0)
            return r0
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0, int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r0.add(r1, r2)
            return
    }

    private void add(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    private void add(int r2, byte[] r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    private static byte[] asByteArray(java.lang.Object r1) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto L7
            byte[] r1 = (byte[]) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r1 = (java.lang.String) r1
            byte[] r1 = com.google.crypto.tink.shaded.protobuf.Internal.toByteArray(r1)
            return r1
        L12:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            byte[] r1 = r1.toByteArray()
            return r1
    }

    private static com.google.crypto.tink.shaded.protobuf.ByteString asByteString(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L7
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            return r1
        L7:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r1 = (java.lang.String) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r1)
            return r1
        L12:
            byte[] r1 = (byte[]) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r1)
            return r1
    }

    private static java.lang.String asString(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L7
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L7:
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L12
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            java.lang.String r1 = r1.toStringUtf8()
            return r1
        L12:
            byte[] r1 = (byte[]) r1
            java.lang.String r1 = com.google.crypto.tink.shaded.protobuf.Internal.toStringUtf8(r1)
            return r1
    }

    static com.google.crypto.tink.shaded.protobuf.LazyStringArrayList emptyList() {
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r0 = com.google.crypto.tink.shaded.protobuf.LazyStringArrayList.EMPTY_LIST
            return r0
    }

    private java.lang.Object setAndReturn(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    private java.lang.Object setAndReturn(int r2, byte[] r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r1, r2)
            return
    }

    public void add(int r2, java.lang.String r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(byte[] r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.add(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends java.lang.String> r3) {
            r1 = this;
            r1.ensureIsMutable()
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            if (r0 == 0) goto Ld
            com.google.crypto.tink.shaded.protobuf.LazyStringList r3 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r3
            java.util.List r3 = r3.getUnderlyingElements()
        Ld:
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
            r1 = this;
            int r0 = r1.size()
            boolean r2 = r1.addAll(r0, r2)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteArray(java.util.Collection<byte[]> r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.addAll(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteString(java.util.Collection<? extends com.google.crypto.tink.shaded.protobuf.ByteString> r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            boolean r2 = r0.addAll(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<byte[]> asByteArrayList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteArrayListView r0 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteArrayListView
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ProtocolStringList
    public java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> asByteStringList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteStringListView r0 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList$ByteStringListView
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.list
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r1 == 0) goto L23
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            java.lang.String r1 = r0.toStringUtf8()
            boolean r0 = r0.isValidUtf8()
            if (r0 == 0) goto L22
            java.util.List<java.lang.Object> r0 = r2.list
            r0.set(r3, r1)
        L22:
            return r1
        L23:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = com.google.crypto.tink.shaded.protobuf.Internal.toStringUtf8(r0)
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Internal.isValidUtf8(r0)
            if (r0 == 0) goto L34
            java.util.List<java.lang.Object> r0 = r2.list
            r0.set(r3, r1)
        L34:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public byte[] getByteArray(int r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.list
            java.lang.Object r0 = r0.get(r3)
            byte[] r1 = asByteArray(r0)
            if (r1 == r0) goto L11
            java.util.List<java.lang.Object> r0 = r2.list
            r0.set(r3, r1)
        L11:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.ByteString getByteString(int r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.list
            java.lang.Object r0 = r0.get(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = asByteString(r0)
            if (r1 == r0) goto L11
            java.util.List<java.lang.Object> r0 = r2.list
            r0.set(r3, r1)
        L11:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.lang.Object getRaw(int r2) {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public com.google.crypto.tink.shaded.protobuf.LazyStringList getUnmodifiableView() {
            r1 = this;
            boolean r0 = r1.isModifiable()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList r0 = new com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList
            r0.<init>(r1)
            return r0
        Lc:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
            r1 = this;
            boolean r0 = super.isModifiable()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.LazyStringList r4) {
            r3 = this;
            r3.ensureIsMutable()
            java.util.List r4 = r4.getUnderlyingElements()
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r4.next()
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L26
            byte[] r0 = (byte[]) r0
            java.util.List<java.lang.Object> r1 = r3.list
            int r2 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            r1.add(r0)
            goto Lb
        L26:
            java.util.List<java.lang.Object> r1 = r3.list
            r1.add(r0)
            goto Lb
        L2c:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList mutableCopyWithCapacity(int r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public com.google.crypto.tink.shaded.protobuf.LazyStringArrayList mutableCopyWithCapacity(int r2) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List<java.lang.Object> r2 = r1.list
            r0.addAll(r2)
            com.google.crypto.tink.shaded.protobuf.LazyStringArrayList r2 = new com.google.crypto.tink.shaded.protobuf.LazyStringArrayList
            r2.<init>(r0)
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.String r1 = r0.remove(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.String remove(int r2) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.remove(r2)
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            java.lang.String r2 = asString(r2)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection r1) {
            r0 = this;
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r0.set(r1, r2)
            return r1
    }

    public java.lang.String set(int r2, java.lang.String r3) {
            r1 = this;
            r1.ensureIsMutable()
            java.util.List<java.lang.Object> r0 = r1.list
            java.lang.Object r2 = r0.set(r2, r3)
            java.lang.String r2 = asString(r2)
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r0 = this;
            r0.setAndReturn(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int r1, byte[] r2) {
            r0 = this;
            r0.setAndReturn(r1, r2)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.list
            int r0 = r0.size()
            return r0
    }
}
