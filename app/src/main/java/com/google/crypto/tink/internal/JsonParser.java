package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonParser {
    private static final com.google.crypto.tink.internal.JsonParser.JsonElementTypeAdapter JSON_ELEMENT = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.JsonParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    private static final class JsonElementTypeAdapter extends com.google.gson.TypeAdapter<com.google.gson.JsonElement> {
        private static final int RECURSION_LIMIT = 100;

        private JsonElementTypeAdapter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ JsonElementTypeAdapter(com.google.crypto.tink.internal.JsonParser.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private com.google.gson.JsonElement readTerminal(com.google.gson.stream.JsonReader r3, com.google.gson.stream.JsonToken r4) throws java.io.IOException {
                r2 = this;
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken
                int r1 = r4.ordinal()
                r0 = r0[r1]
                r1 = 3
                if (r0 == r1) goto L4c
                r1 = 4
                if (r0 == r1) goto L3d
                r1 = 5
                if (r0 == r1) goto L2f
                r1 = 6
                if (r0 != r1) goto L1a
                r3.nextNull()
                com.google.gson.JsonNull r3 = com.google.gson.JsonNull.INSTANCE
                return r3
            L1a:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unexpected token: "
                r0.<init>(r1)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L2f:
                com.google.gson.JsonPrimitive r4 = new com.google.gson.JsonPrimitive
                boolean r3 = r3.nextBoolean()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r4.<init>(r3)
                return r4
            L3d:
                java.lang.String r3 = r3.nextString()
                com.google.gson.JsonPrimitive r4 = new com.google.gson.JsonPrimitive
                com.google.crypto.tink.internal.JsonParser$LazilyParsedNumber r0 = new com.google.crypto.tink.internal.JsonParser$LazilyParsedNumber
                r0.<init>(r3)
                r4.<init>(r0)
                return r4
            L4c:
                java.lang.String r3 = r3.nextString()
                boolean r4 = com.google.crypto.tink.internal.JsonParser.isValidString(r3)
                if (r4 == 0) goto L5c
                com.google.gson.JsonPrimitive r4 = new com.google.gson.JsonPrimitive
                r4.<init>(r3)
                return r4
            L5c:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r4 = "illegal characters in string"
                r3.<init>(r4)
                throw r3
        }

        @javax.annotation.Nullable
        private com.google.gson.JsonElement tryBeginNesting(com.google.gson.stream.JsonReader r2, com.google.gson.stream.JsonToken r3) throws java.io.IOException {
                r1 = this;
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken
                int r3 = r3.ordinal()
                r3 = r0[r3]
                r0 = 1
                if (r3 == r0) goto L19
                r0 = 2
                if (r3 == r0) goto L10
                r2 = 0
                return r2
            L10:
                r2.beginObject()
                com.google.gson.JsonObject r2 = new com.google.gson.JsonObject
                r2.<init>()
                return r2
            L19:
                r2.beginArray()
                com.google.gson.JsonArray r2 = new com.google.gson.JsonArray
                r2.<init>()
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public com.google.gson.JsonElement read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
                r7 = this;
                com.google.gson.stream.JsonToken r0 = r8.peek()
                com.google.gson.JsonElement r1 = r7.tryBeginNesting(r8, r0)
                if (r1 != 0) goto Lf
                com.google.gson.JsonElement r8 = r7.readTerminal(r8, r0)
                return r8
            Lf:
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
            L14:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L88
                boolean r2 = r1 instanceof com.google.gson.JsonObject
                if (r2 == 0) goto L31
                java.lang.String r2 = r8.nextName()
                boolean r3 = com.google.crypto.tink.internal.JsonParser.isValidString(r2)
                if (r3 == 0) goto L29
                goto L32
            L29:
                java.io.IOException r8 = new java.io.IOException
                java.lang.String r0 = "illegal characters in string"
                r8.<init>(r0)
                throw r8
            L31:
                r2 = 0
            L32:
                com.google.gson.stream.JsonToken r3 = r8.peek()
                com.google.gson.JsonElement r4 = r7.tryBeginNesting(r8, r3)
                if (r4 == 0) goto L3e
                r5 = 1
                goto L3f
            L3e:
                r5 = 0
            L3f:
                if (r4 != 0) goto L45
                com.google.gson.JsonElement r4 = r7.readTerminal(r8, r3)
            L45:
                boolean r3 = r1 instanceof com.google.gson.JsonArray
                if (r3 == 0) goto L50
                r2 = r1
                com.google.gson.JsonArray r2 = (com.google.gson.JsonArray) r2
                r2.add(r4)
                goto L5c
            L50:
                r3 = r1
                com.google.gson.JsonObject r3 = (com.google.gson.JsonObject) r3
                boolean r6 = r3.has(r2)
                if (r6 != 0) goto L73
                r3.add(r2, r4)
            L5c:
                if (r5 == 0) goto L14
                r0.addLast(r1)
                int r1 = r0.size()
                r2 = 100
                if (r1 > r2) goto L6b
                r1 = r4
                goto L14
            L6b:
                java.io.IOException r8 = new java.io.IOException
                java.lang.String r0 = "too many recursions"
                r8.<init>(r0)
                throw r8
            L73:
                java.io.IOException r8 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "duplicate key: "
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L88:
                boolean r2 = r1 instanceof com.google.gson.JsonArray
                if (r2 == 0) goto L90
                r8.endArray()
                goto L93
            L90:
                r8.endObject()
            L93:
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L9a
                return r1
            L9a:
                java.lang.Object r1 = r0.removeLast()
                com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
                goto L14
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ com.google.gson.JsonElement read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                com.google.gson.JsonElement r1 = r0.read(r1)
                return r1
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(com.google.gson.stream.JsonWriter r1, com.google.gson.JsonElement r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "write is not supported"
                r1.<init>(r2)
                throw r1
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, com.google.gson.JsonElement r2) throws java.io.IOException {
                r0 = this;
                com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
                r0.write2(r1, r2)
                return
        }
    }

    private static final class LazilyParsedNumber extends java.lang.Number {
        private final java.lang.String value;

        public LazilyParsedNumber(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        private void readObject(java.io.ObjectInputStream r2) throws java.io.NotSerializableException {
                r1 = this;
                java.io.NotSerializableException r2 = new java.io.NotSerializableException
                java.lang.String r0 = "serialization is not supported"
                r2.<init>(r0)
                throw r2
        }

        private java.lang.Object writeReplace() throws java.io.NotSerializableException {
                r2 = this;
                java.io.NotSerializableException r0 = new java.io.NotSerializableException
                java.lang.String r1 = "serialization is not supported"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.lang.Number
        public double doubleValue() {
                r2 = this;
                java.lang.String r0 = r2.value
                double r0 = java.lang.Double.parseDouble(r0)
                return r0
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber
                if (r0 == 0) goto L13
                com.google.crypto.tink.internal.JsonParser$LazilyParsedNumber r2 = (com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber) r2
                java.lang.String r0 = r1.value
                java.lang.String r2 = r2.value
                boolean r2 = r0.equals(r2)
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // java.lang.Number
        public float floatValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                float r0 = java.lang.Float.parseFloat(r0)
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.value
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.lang.Number
        public int intValue() {
                r2 = this;
                java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> L7
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7
                return r0
            L7:
                java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> Lf
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lf
                int r0 = (int) r0
                return r0
            Lf:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                java.lang.String r1 = r2.value
                r0.<init>(r1)
                int r0 = r0.intValue()
                return r0
        }

        @Override // java.lang.Number
        public long longValue() {
                r2 = this;
                java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> L7
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
                return r0
            L7:
                java.math.BigDecimal r0 = new java.math.BigDecimal
                java.lang.String r1 = r2.value
                r0.<init>(r1)
                long r0 = r0.longValue()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    static {
            com.google.crypto.tink.internal.JsonParser$JsonElementTypeAdapter r0 = new com.google.crypto.tink.internal.JsonParser$JsonElementTypeAdapter
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.internal.JsonParser.JSON_ELEMENT = r0
            return
    }

    private JsonParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getParsedNumberAsLongOrThrow(com.google.gson.JsonElement r2) {
            java.lang.Number r0 = r2.getAsNumber()
            boolean r0 = r0 instanceof com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber
            if (r0 == 0) goto L15
            java.lang.Number r2 = r2.getAsNumber()
            java.lang.String r2 = r2.toString()
            long r0 = java.lang.Long.parseLong(r2)
            return r0
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "does not contain a parsed number."
            r2.<init>(r0)
            throw r2
    }

    public static boolean isValidString(java.lang.String r6) {
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 != r0) goto La
            r6 = 1
            return r6
        La:
            char r3 = r6.charAt(r2)
            int r4 = r2 + 1
            boolean r5 = java.lang.Character.isSurrogate(r3)
            if (r5 == 0) goto L2d
            boolean r3 = java.lang.Character.isLowSurrogate(r3)
            if (r3 != 0) goto L2c
            if (r4 == r0) goto L2c
            char r3 = r6.charAt(r4)
            boolean r3 = java.lang.Character.isLowSurrogate(r3)
            if (r3 != 0) goto L29
            goto L2c
        L29:
            int r2 = r2 + 2
            goto L6
        L2c:
            return r1
        L2d:
            r2 = r4
            goto L6
    }

    public static com.google.gson.JsonElement parse(java.lang.String r2) throws java.io.IOException {
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.NumberFormatException -> L15
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.NumberFormatException -> L15
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L15
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L15
            r2 = 0
            r0.setLenient(r2)     // Catch: java.lang.NumberFormatException -> L15
            com.google.crypto.tink.internal.JsonParser$JsonElementTypeAdapter r2 = com.google.crypto.tink.internal.JsonParser.JSON_ELEMENT     // Catch: java.lang.NumberFormatException -> L15
            com.google.gson.JsonElement r2 = r2.read(r0)     // Catch: java.lang.NumberFormatException -> L15
            return r2
        L15:
            r2 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
    }
}
