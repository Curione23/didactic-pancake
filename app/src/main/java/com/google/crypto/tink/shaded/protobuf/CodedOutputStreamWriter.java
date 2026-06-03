package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class CodedOutputStreamWriter implements com.google.crypto.tink.shaded.protobuf.Writer {
    private final com.google.crypto.tink.shaded.protobuf.CodedOutputStream output;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                return
        }
    }

    private CodedOutputStreamWriter(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "output"
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2 = (com.google.crypto.tink.shaded.protobuf.CodedOutputStream) r2
            r1.output = r2
            r2.wrapper = r1
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter forCodedOutput(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1) {
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
            if (r0 == 0) goto L7
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r1 = r1.wrapper
            return r1
        L7:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r0 = new com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter
            r0.<init>(r1)
            return r0
    }

    private <V> void writeDeterministicBooleanMapEntry(int r3, boolean r4, V r5, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Boolean, V> r6) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = 2
            r0.writeTag(r3, r1)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            int r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r6, r0, r5)
            r3.writeUInt32NoTag(r0)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r3, r6, r4, r5)
            return
    }

    private <V> void writeDeterministicIntegerMap(int r8, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Integer, V> r9, java.util.Map<java.lang.Integer, V> r10) throws java.io.IOException {
            r7 = this;
            int r0 = r10.size()
            int[] r1 = new int[r0]
            java.util.Set r2 = r10.keySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L10:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L26
            java.lang.Object r5 = r2.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r4 + 1
            r1[r4] = r5
            r4 = r6
            goto L10
        L26:
            java.util.Arrays.sort(r1)
        L29:
            if (r3 >= r0) goto L54
            r2 = r1[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r10.get(r4)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r7.output
            r6 = 2
            r5.writeTag(r8, r6)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r7.output
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            int r6 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r9, r6, r4)
            r5.writeUInt32NoTag(r6)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r7.output
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r5, r9, r2, r4)
            int r3 = r3 + 1
            goto L29
        L54:
            return
    }

    private <V> void writeDeterministicLongMap(int r9, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.Long, V> r10, java.util.Map<java.lang.Long, V> r11) throws java.io.IOException {
            r8 = this;
            int r0 = r11.size()
            long[] r1 = new long[r0]
            java.util.Set r2 = r11.keySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L10:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L26
            java.lang.Object r5 = r2.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = r4 + 1
            r1[r4] = r5
            r4 = r7
            goto L10
        L26:
            java.util.Arrays.sort(r1)
        L29:
            if (r3 >= r0) goto L54
            r4 = r1[r3]
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object r2 = r11.get(r2)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            r7 = 2
            r6.writeTag(r9, r7)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            int r7 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r10, r7, r2)
            r6.writeUInt32NoTag(r7)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r8.output
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r6, r10, r4, r2)
            int r3 = r3 + 1
            goto L29
        L54:
            return
    }

    private <K, V> void writeDeterministicMap(int r3, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r4, java.util.Map<K, V> r5) throws java.io.IOException {
            r2 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = r4.keyType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L30;
                case 2: goto L2c;
                case 3: goto L2c;
                case 4: goto L2c;
                case 5: goto L2c;
                case 6: goto L2c;
                case 7: goto L28;
                case 8: goto L28;
                case 9: goto L28;
                case 10: goto L28;
                case 11: goto L28;
                case 12: goto L24;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "does not support key type: "
            r5.<init>(r0)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r4.keyType
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L24:
            r2.writeDeterministicStringMap(r3, r4, r5)
            goto L48
        L28:
            r2.writeDeterministicLongMap(r3, r4, r5)
            goto L48
        L2c:
            r2.writeDeterministicIntegerMap(r3, r4, r5)
            goto L48
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L3c
            r1 = 0
            r2.writeDeterministicBooleanMapEntry(r3, r1, r0, r4)
        L3c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r5 = r5.get(r0)
            if (r5 == 0) goto L48
            r0 = 1
            r2.writeDeterministicBooleanMapEntry(r3, r0, r5, r4)
        L48:
            return
    }

    private <V> void writeDeterministicStringMap(int r8, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<java.lang.String, V> r9, java.util.Map<java.lang.String, V> r10) throws java.io.IOException {
            r7 = this;
            int r0 = r10.size()
            java.lang.String[] r1 = new java.lang.String[r0]
            java.util.Set r2 = r10.keySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L10:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r4 + 1
            r1[r4] = r5
            r4 = r6
            goto L10
        L22:
            java.util.Arrays.sort(r1)
        L25:
            if (r3 >= r0) goto L44
            r2 = r1[r3]
            java.lang.Object r4 = r10.get(r2)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r7.output
            r6 = 2
            r5.writeTag(r8, r6)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r7.output
            int r6 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r9, r2, r4)
            r5.writeUInt32NoTag(r6)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r7.output
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r5, r9, r2, r4)
            int r3 = r3 + 1
            goto L25
        L44:
            return
    }

    private void writeLazyString(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            java.lang.String r3 = (java.lang.String) r3
            r0.writeString(r2, r3)
            goto L13
        Lc:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r0.writeBytes(r2, r3)
        L13:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder fieldOrder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.ASCENDING
            return r0
    }

    public int getTotalBytesWritten() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            int r0 = r0.getTotalBytesWritten()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBool(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeBool(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBoolList(int r3, java.util.List<java.lang.Boolean> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r3.writeBoolNoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5.writeBool(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytes(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeBytes(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeBytesList(int r4, java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L15
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r3.output
            java.lang.Object r2 = r5.get(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            r1.writeBytes(r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDouble(int r2, double r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeDouble(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeDoubleList(int r4, java.util.List<java.lang.Double> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            r1 = 2
            r6.writeTag(r4, r1)
            r4 = r0
            r6 = r4
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSizeNoTag(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            r4.writeUInt32NoTag(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            java.lang.Object r6 = r5.get(r0)
            java.lang.Double r6 = (java.lang.Double) r6
            double r1 = r6.doubleValue()
            r4.writeDoubleNoTag(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            java.lang.Object r1 = r5.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r6.writeDouble(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeEndGroup(int r3) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = 4
            r0.writeTag(r3, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnum(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeEnum(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeEnumList(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.writeEnumNoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.writeEnum(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeFixed32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed32List(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32SizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.writeFixed32NoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.writeFixed32(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeFixed64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFixed64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            r1 = 2
            r6.writeTag(r4, r1)
            r4 = r0
            r6 = r4
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64SizeNoTag(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            r4.writeUInt32NoTag(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.writeFixed64NoTag(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.writeFixed64(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloat(int r2, float r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeFloat(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeFloatList(int r3, java.util.List<java.lang.Float> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r3.writeFloatNoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r5.writeFloat(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroup(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0.writeGroup(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroup(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0.writeGroup(r2, r3, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeGroupList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeGroupList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeGroup(r3, r1, r5)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeInt32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt32List(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.writeInt32NoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.writeInt32(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeInt64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeInt64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            r1 = 2
            r6.writeTag(r4, r1)
            r4 = r0
            r6 = r4
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            r4.writeUInt32NoTag(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.writeInt64NoTag(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.writeInt64(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int r5, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r6, java.util.Map<K, V> r7) throws java.io.IOException {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r4.output
            boolean r0 = r0.isSerializationDeterministic()
            if (r0 == 0) goto Lc
            r4.writeDeterministicMap(r5, r6, r7)
            return
        Lc:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            r2 = 2
            r1.writeTag(r5, r2)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r6, r2, r3)
            r1.writeUInt32NoTag(r2)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1 = r4.output
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r1, r6, r2, r0)
            goto L14
        L45:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0.writeMessage(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessage(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Schema r4) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0.writeMessage(r2, r3, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int r3, java.util.List<?> r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeMessageList(int r3, java.util.List<?> r4, com.google.crypto.tink.shaded.protobuf.Schema r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r4.get(r0)
            r2.writeMessage(r3, r1, r5)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r0.writeRawMessageSetExtension(r2, r3)
            goto L13
        Lc:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r0.writeMessageSetExtension(r2, r3)
        L13:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSFixed32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed32List(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.writeSFixed32NoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.writeSFixed32(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSFixed64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSFixed64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            r1 = 2
            r6.writeTag(r4, r1)
            r4 = r0
            r6 = r4
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            r4.writeUInt32NoTag(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.writeSFixed64NoTag(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.writeSFixed64(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSInt32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt32List(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.writeSInt32NoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.writeSInt32(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeSInt64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeSInt64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            r1 = 2
            r6.writeTag(r4, r1)
            r4 = r0
            r6 = r4
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            r4.writeUInt32NoTag(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.writeSInt64NoTag(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.writeSInt64(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @java.lang.Deprecated
    public void writeStartGroup(int r3) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r2.output
            r1 = 3
            r0.writeTag(r3, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeString(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeStringList(int r4, java.util.List<java.lang.String> r5) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.LazyStringList r0 = (com.google.crypto.tink.shaded.protobuf.LazyStringList) r0
        L8:
            int r2 = r5.size()
            if (r1 >= r2) goto L2c
            java.lang.Object r2 = r0.getRaw(r1)
            r3.writeLazyString(r4, r2)
            int r1 = r1 + 1
            goto L8
        L18:
            int r0 = r5.size()
            if (r1 >= r0) goto L2c
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r3.output
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.writeString(r4, r2)
            int r1 = r1 + 1
            goto L18
        L2c:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeUInt32(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt32List(int r3, java.util.List<java.lang.Integer> r4, boolean r5) throws java.io.IOException {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            r1 = 2
            r5.writeTag(r3, r1)
            r3 = r0
            r5 = r3
        Lb:
            int r1 = r4.size()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r4.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r1)
            int r5 = r5 + r1
            int r3 = r3 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            r3.writeUInt32NoTag(r5)
        L28:
            int r3 = r4.size()
            if (r0 >= r3) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3 = r2.output
            java.lang.Object r5 = r4.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.writeUInt32NoTag(r5)
            int r0 = r0 + 1
            goto L28
        L40:
            int r5 = r4.size()
            if (r0 >= r5) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r2.output
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.writeUInt32(r3, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r0 = r1.output
            r0.writeUInt64(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void writeUInt64List(int r4, java.util.List<java.lang.Long> r5, boolean r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L40
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            r1 = 2
            r6.writeTag(r4, r1)
            r4 = r0
            r6 = r4
        Lb:
            int r1 = r5.size()
            if (r4 >= r1) goto L23
            java.lang.Object r1 = r5.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r1)
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto Lb
        L23:
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            r4.writeUInt32NoTag(r6)
        L28:
            int r4 = r5.size()
            if (r0 >= r4) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4 = r3.output
            java.lang.Object r6 = r5.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            r4.writeUInt64NoTag(r1)
            int r0 = r0 + 1
            goto L28
        L40:
            int r6 = r5.size()
            if (r0 >= r6) goto L58
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6 = r3.output
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.writeUInt64(r4, r1)
            int r0 = r0 + 1
            goto L40
        L58:
            return
    }
}
