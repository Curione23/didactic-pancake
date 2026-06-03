package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite;

/* JADX INFO: loaded from: classes2.dex */
final class FieldSet<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final com.google.crypto.tink.shaded.protobuf.FieldSet DEFAULT_INSTANCE = null;
    private final com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                r1 = 1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                r6 = 7
                int[] r7 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L54
                int r8 = r8.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7[r8] = r6     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                r7 = 8
                int[] r8 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L60
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r8[r9] = r7     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                r8 = 9
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L6c
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r9[r10] = r8     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L78
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r11 = 10
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L84
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r11 = 11
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L90
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r11 = 12
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L9c
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r11 = 13
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> La8
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r11 = 14
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r11 = 15
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r11 = 16
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r11 = 17
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld8
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r11 = 18
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType = r9
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT     // Catch: java.lang.NoSuchFieldError -> Le9
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le9
                r9[r10] = r1     // Catch: java.lang.NoSuchFieldError -> Le9
            Le9:
                int[] r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> Lf3
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG     // Catch: java.lang.NoSuchFieldError -> Lf3
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf3
                r1[r9] = r0     // Catch: java.lang.NoSuchFieldError -> Lf3
            Lf3:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> Lfd
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT     // Catch: java.lang.NoSuchFieldError -> Lfd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfd
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfd
            Lfd:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L107
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L107
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L107
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L107
            L107:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L111
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L111
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L111
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L111
            L111:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L11b
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING     // Catch: java.lang.NoSuchFieldError -> L11b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11b
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L11b
            L11b:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L125
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch: java.lang.NoSuchFieldError -> L125
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L125
                r0[r1] = r6     // Catch: java.lang.NoSuchFieldError -> L125
            L125:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L12f
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM     // Catch: java.lang.NoSuchFieldError -> L12f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12f
                r0[r1] = r7     // Catch: java.lang.NoSuchFieldError -> L12f
            L12f:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L139
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L139
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L139
                r0[r1] = r8     // Catch: java.lang.NoSuchFieldError -> L139
            L139:
                return
        }
    }

    static final class Builder<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
        private com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        private Builder() {
                r1 = this;
                r0 = 16
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r0)
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r1) {
                r0 = this;
                r0.<init>()
                r0.fields = r1
                r1 = 1
                r0.isMutable = r1
                return
        }

        private com.google.crypto.tink.shaded.protobuf.FieldSet<T> buildImpl(boolean r4) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Ld
                com.google.crypto.tink.shaded.protobuf.FieldSet r4 = com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet()
                return r4
            Ld:
                r0 = 0
                r3.isMutable = r0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
                boolean r2 = r3.hasNestedBuilders
                if (r2 == 0) goto L1d
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r1, r0)
                replaceBuilders(r1, r4)
            L1d:
                com.google.crypto.tink.shaded.protobuf.FieldSet r4 = new com.google.crypto.tink.shaded.protobuf.FieldSet
                r0 = 0
                r4.<init>(r1, r0)
                boolean r0 = r3.hasLazyField
                com.google.crypto.tink.shaded.protobuf.FieldSet.access$302(r4, r0)
                return r4
        }

        private void ensureIsMutable() {
                r2 = this;
                boolean r0 = r2.isMutable
                if (r0 != 0) goto Lf
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                r1 = 1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r0, r1)
                r2.fields = r0
                r2.isMutable = r1
            Lf:
                return
        }

        public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<T> fromFieldSet(com.google.crypto.tink.shaded.protobuf.FieldSet<T> r3) {
                com.google.crypto.tink.shaded.protobuf.FieldSet$Builder r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet$Builder
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                r2 = 1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r1, r2)
                r0.<init>(r1)
                boolean r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$300(r3)
                r0.hasLazyField = r3
                return r0
        }

        private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> r4) {
                r3 = this;
                java.lang.Object r0 = r4.getKey()
                com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
                java.lang.Object r4 = r4.getValue()
                boolean r1 = r4 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
                if (r1 == 0) goto L14
                com.google.crypto.tink.shaded.protobuf.LazyField r4 = (com.google.crypto.tink.shaded.protobuf.LazyField) r4
                com.google.crypto.tink.shaded.protobuf.MessageLite r4 = r4.getValue()
            L14:
                boolean r1 = r0.isRepeated()
                if (r1 == 0) goto L44
                java.lang.Object r1 = r3.getFieldAllowBuilders(r0)
                java.util.List r1 = (java.util.List) r1
                if (r1 != 0) goto L2c
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
                r2.put(r0, r1)
            L2c:
                java.util.List r4 = (java.util.List) r4
                java.util.Iterator r4 = r4.iterator()
            L32:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L87
                java.lang.Object r0 = r4.next()
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$700(r0)
                r1.add(r0)
                goto L32
            L44:
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                if (r1 != r2) goto L7e
                java.lang.Object r1 = r3.getFieldAllowBuilders(r0)
                if (r1 != 0) goto L5c
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
                java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$700(r4)
                r1.put(r0, r4)
                goto L87
            L5c:
                boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r2 == 0) goto L68
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite.Builder) r1
                com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
                r0.internalMergeFrom(r1, r4)
                goto L87
            L68:
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r1 = r1.toBuilder()
                com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r4 = r0.internalMergeFrom(r1, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r4 = r4.build()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
                r1.put(r0, r4)
                goto L87
            L7e:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
                java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$700(r4)
                r1.put(r0, r4)
            L87:
                return
        }

        private static java.lang.Object replaceBuilder(java.lang.Object r1, boolean r2) {
                boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 != 0) goto L5
                return r1
            L5:
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite.Builder) r1
                if (r2 == 0) goto Le
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r1.buildPartial()
                return r1
            Le:
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r1.build()
                return r1
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> java.lang.Object replaceBuilders(T r3, java.lang.Object r4, boolean r5) {
                if (r4 != 0) goto L3
                return r4
            L3:
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r3.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                if (r0 != r1) goto L56
                boolean r3 = r3.isRepeated()
                if (r3 == 0) goto L51
                boolean r3 = r4 instanceof java.util.List
                if (r3 == 0) goto L38
                r3 = r4
                java.util.List r3 = (java.util.List) r3
                r0 = 0
            L19:
                int r1 = r3.size()
                if (r0 >= r1) goto L37
                java.lang.Object r1 = r3.get(r0)
                java.lang.Object r2 = replaceBuilder(r1, r5)
                if (r2 == r1) goto L34
                if (r3 != r4) goto L31
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r3)
                r3 = r1
            L31:
                r3.set(r0, r2)
            L34:
                int r0 = r0 + 1
                goto L19
            L37:
                return r3
            L38:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r0 = "Repeated field should contains a List but actually contains type: "
                r5.<init>(r0)
                java.lang.Class r4 = r4.getClass()
                java.lang.StringBuilder r4 = r5.append(r4)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L51:
                java.lang.Object r3 = replaceBuilder(r4, r5)
                return r3
            L56:
                return r4
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r2, boolean r3) {
                r0 = 0
            L1:
                int r1 = r2.getNumArrayEntries()
                if (r0 >= r1) goto L11
                java.util.Map$Entry r1 = r2.getArrayEntryAt(r0)
                replaceBuilders(r1, r3)
                int r0 = r0 + 1
                goto L1
            L11:
                java.lang.Iterable r2 = r2.getOverflowEntries()
                java.util.Iterator r2 = r2.iterator()
            L19:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L29
                java.lang.Object r0 = r2.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                replaceBuilders(r0, r3)
                goto L19
            L29:
                return
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(java.util.Map.Entry<T, java.lang.Object> r2, boolean r3) {
                java.lang.Object r0 = r2.getKey()
                com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
                java.lang.Object r1 = r2.getValue()
                java.lang.Object r3 = replaceBuilders(r0, r1, r3)
                r2.setValue(r3)
                return
        }

        private void verifyType(T r3, java.lang.Object r4) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
                boolean r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$500(r0, r4)
                if (r0 != 0) goto L43
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                if (r0 != r1) goto L1b
                boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L1b
                return
            L1b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                int r1 = r3.getNumber()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = r3.getJavaType()
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getName()
                java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
                java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
                java.lang.String r3 = java.lang.String.format(r4, r3)
                r0.<init>(r3)
                throw r0
            L43:
                return
        }

        public void addRepeatedField(T r3, java.lang.Object r4) {
                r2 = this;
                r2.ensureIsMutable()
                boolean r0 = r3.isRepeated()
                if (r0 == 0) goto L31
                boolean r0 = r2.hasNestedBuilders
                if (r0 != 0) goto L14
                boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L12
                goto L14
            L12:
                r0 = 0
                goto L15
            L14:
                r0 = 1
            L15:
                r2.hasNestedBuilders = r0
                r2.verifyType(r3, r4)
                java.lang.Object r0 = r2.getFieldAllowBuilders(r3)
                if (r0 != 0) goto L2b
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
                r1.put(r3, r0)
                goto L2d
            L2b:
                java.util.List r0 = (java.util.List) r0
            L2d:
                r0.add(r4)
                return
            L31:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "addRepeatedField() can only be called on repeated fields."
                r3.<init>(r4)
                throw r3
        }

        public com.google.crypto.tink.shaded.protobuf.FieldSet<T> build() {
                r1 = this;
                r0 = 0
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r1.buildImpl(r0)
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldSet<T> buildPartial() {
                r1 = this;
                r0 = 1
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r1.buildImpl(r0)
                return r0
        }

        public void clearField(T r2) {
                r1 = this;
                r1.ensureIsMutable()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
                r0.remove(r2)
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r1.fields
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L13
                r2 = 0
                r1.hasLazyField = r2
            L13:
                return
        }

        public java.util.Map<T, java.lang.Object> getAllFields() {
                r2 = this;
                boolean r0 = r2.hasLazyField
                if (r0 == 0) goto L1c
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                r1 = 0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r0, r1)
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
                boolean r1 = r1.isImmutable()
                if (r1 == 0) goto L17
                r0.makeImmutable()
                goto L1b
            L17:
                r1 = 1
                replaceBuilders(r0, r1)
            L1b:
                return r0
            L1c:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L27
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                goto L2d
            L27:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            L2d:
                return r0
        }

        public java.lang.Object getField(T r3) {
                r2 = this;
                java.lang.Object r0 = r2.getFieldAllowBuilders(r3)
                r1 = 1
                java.lang.Object r3 = replaceBuilders(r3, r0, r1)
                return r3
        }

        java.lang.Object getFieldAllowBuilders(T r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
                java.lang.Object r2 = r0.get(r2)
                boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
                if (r0 == 0) goto L10
                com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r2.getValue()
            L10:
                return r2
        }

        public java.lang.Object getRepeatedField(T r2, int r3) {
                r1 = this;
                boolean r0 = r1.hasNestedBuilders
                if (r0 == 0) goto L7
                r1.ensureIsMutable()
            L7:
                java.lang.Object r2 = r1.getRepeatedFieldAllowBuilders(r2, r3)
                r3 = 1
                java.lang.Object r2 = replaceBuilder(r2, r3)
                return r2
        }

        java.lang.Object getRepeatedFieldAllowBuilders(T r2, int r3) {
                r1 = this;
                boolean r0 = r2.isRepeated()
                if (r0 == 0) goto L19
                java.lang.Object r2 = r1.getFieldAllowBuilders(r2)
                if (r2 == 0) goto L13
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r2 = r2.get(r3)
                return r2
            L13:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                r2.<init>()
                throw r2
            L19:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "getRepeatedField() can only be called on repeated fields."
                r2.<init>(r3)
                throw r2
        }

        public int getRepeatedFieldCount(T r2) {
                r1 = this;
                boolean r0 = r2.isRepeated()
                if (r0 == 0) goto L15
                java.lang.Object r2 = r1.getFieldAllowBuilders(r2)
                if (r2 != 0) goto Le
                r2 = 0
                return r2
            Le:
                java.util.List r2 = (java.util.List) r2
                int r2 = r2.size()
                return r2
            L15:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "getRepeatedFieldCount() can only be called on repeated fields."
                r2.<init>(r0)
                throw r2
        }

        public boolean hasField(T r2) {
                r1 = this;
                boolean r0 = r2.isRepeated()
                if (r0 != 0) goto L12
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
                java.lang.Object r2 = r0.get(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "hasField() can only be called on non-repeated fields."
                r2.<init>(r0)
                throw r2
        }

        public boolean isInitialized() {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
                int r2 = r2.getNumArrayEntries()
                if (r1 >= r2) goto L1a
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
                java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
                boolean r2 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$600(r2)
                if (r2 != 0) goto L17
                return r0
            L17:
                int r1 = r1 + 1
                goto L2
            L1a:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
                java.lang.Iterable r1 = r1.getOverflowEntries()
                java.util.Iterator r1 = r1.iterator()
            L24:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L37
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                boolean r2 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$600(r2)
                if (r2 != 0) goto L24
                return r0
            L37:
                r0 = 1
                return r0
        }

        public void mergeFrom(com.google.crypto.tink.shaded.protobuf.FieldSet<T> r3) {
                r2 = this;
                r2.ensureIsMutable()
                r0 = 0
            L4:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                int r1 = r1.getNumArrayEntries()
                if (r0 >= r1) goto L1c
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
                r2.mergeFromField(r1)
                int r0 = r0 + 1
                goto L4
            L1c:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                java.lang.Iterable r3 = r3.getOverflowEntries()
                java.util.Iterator r3 = r3.iterator()
            L28:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L38
                java.lang.Object r0 = r3.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r2.mergeFromField(r0)
                goto L28
            L38:
                return
        }

        public void setField(T r6, java.lang.Object r7) {
                r5 = this;
                r5.ensureIsMutable()
                boolean r0 = r6.isRepeated()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L40
                boolean r0 = r7 instanceof java.util.List
                if (r0 == 0) goto L38
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List r7 = (java.util.List) r7
                r0.<init>(r7)
                java.util.Iterator r7 = r0.iterator()
            L1a:
                boolean r3 = r7.hasNext()
                if (r3 == 0) goto L36
                java.lang.Object r3 = r7.next()
                r5.verifyType(r6, r3)
                boolean r4 = r5.hasNestedBuilders
                if (r4 != 0) goto L32
                boolean r3 = r3 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r3 == 0) goto L30
                goto L32
            L30:
                r3 = r1
                goto L33
            L32:
                r3 = r2
            L33:
                r5.hasNestedBuilders = r3
                goto L1a
            L36:
                r7 = r0
                goto L43
            L38:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Wrong object type used with protocol message reflection."
                r6.<init>(r7)
                throw r6
            L40:
                r5.verifyType(r6, r7)
            L43:
                boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
                if (r0 == 0) goto L49
                r5.hasLazyField = r2
            L49:
                boolean r0 = r5.hasNestedBuilders
                if (r0 != 0) goto L51
                boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L52
            L51:
                r1 = r2
            L52:
                r5.hasNestedBuilders = r1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r5.fields
                r0.put(r6, r7)
                return
        }

        public void setRepeatedField(T r2, int r3, java.lang.Object r4) {
                r1 = this;
                r1.ensureIsMutable()
                boolean r0 = r2.isRepeated()
                if (r0 == 0) goto L2c
                boolean r0 = r1.hasNestedBuilders
                if (r0 != 0) goto L14
                boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L12
                goto L14
            L12:
                r0 = 0
                goto L15
            L14:
                r0 = 1
            L15:
                r1.hasNestedBuilders = r0
                java.lang.Object r0 = r1.getFieldAllowBuilders(r2)
                if (r0 == 0) goto L26
                r1.verifyType(r2, r4)
                java.util.List r0 = (java.util.List) r0
                r0.set(r3, r4)
                return
            L26:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                r2.<init>()
                throw r2
            L2c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "getRepeatedField() can only be called on repeated fields."
                r2.<init>(r3)
                throw r2
        }
    }

    public interface FieldDescriptorLite<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> getEnumType();

        com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getLiteJavaType();

        com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2);

        boolean isPacked();

        boolean isRepeated();
    }

    static {
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet
            r1 = 1
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.FieldSet.DEFAULT_INSTANCE = r0
            return
    }

    private FieldSet() {
            r1 = this;
            r1.<init>()
            r0 = 16
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r0)
            r1.fields = r0
            return
    }

    private FieldSet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.fields = r1
            r0.makeImmutable()
            return
    }

    /* synthetic */ FieldSet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private FieldSet(boolean r1) {
            r0 = this;
            r1 = 0
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r1)
            r0.<init>(r1)
            r0.makeImmutable()
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap access$100(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0, boolean r1) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = cloneAllFieldsMap(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$300(com.google.crypto.tink.shaded.protobuf.FieldSet r0) {
            boolean r0 = r0.hasLazyField
            return r0
    }

    static /* synthetic */ boolean access$302(com.google.crypto.tink.shaded.protobuf.FieldSet r0, boolean r1) {
            r0.hasLazyField = r1
            return r1
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap access$400(com.google.crypto.tink.shaded.protobuf.FieldSet r0) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r0.fields
            return r0
    }

    static /* synthetic */ boolean access$500(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r0, java.lang.Object r1) {
            boolean r0 = isValidType(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$600(java.util.Map.Entry r0) {
            boolean r0 = isInitialized(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object access$700(java.lang.Object r0) {
            java.lang.Object r0 = cloneIfMutable(r0)
            return r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> cloneAllFieldsMap(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r3, boolean r4) {
            r0 = 16
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r0)
            r1 = 0
        L7:
            int r2 = r3.getNumArrayEntries()
            if (r1 >= r2) goto L17
            java.util.Map$Entry r2 = r3.getArrayEntryAt(r1)
            cloneFieldEntry(r0, r2, r4)
            int r1 = r1 + 1
            goto L7
        L17:
            java.lang.Iterable r3 = r3.getOverflowEntries()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            cloneFieldEntry(r0, r1, r4)
            goto L1f
        L2f:
            return r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void cloneFieldEntry(java.util.Map<T, java.lang.Object> r2, java.util.Map.Entry<T, java.lang.Object> r3, boolean r4) {
            java.lang.Object r0 = r3.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r3 = r3.getValue()
            boolean r1 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r1 == 0) goto L18
            com.google.crypto.tink.shaded.protobuf.LazyField r3 = (com.google.crypto.tink.shaded.protobuf.LazyField) r3
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r3.getValue()
            r2.put(r0, r3)
            goto L2c
        L18:
            if (r4 == 0) goto L29
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L29
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r3 = (java.util.List) r3
            r4.<init>(r3)
            r2.put(r0, r4)
            goto L2c
        L29:
            r2.put(r0, r3)
        L2c:
            return
    }

    private static java.lang.Object cloneIfMutable(java.lang.Object r3) {
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto Lf
            byte[] r3 = (byte[]) r3
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
        Lf:
            return r3
    }

    static int computeElementSize(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, int r2, java.lang.Object r3) {
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r2)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP
            if (r1 != r0) goto La
            int r2 = r2 * 2
        La:
            int r1 = computeElementSizeNoTag(r1, r3)
            int r2 = r2 + r1
            return r2
    }

    static int computeElementSizeNoTag(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, java.lang.Object r2) {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto Lee;
                case 2: goto Le3;
                case 3: goto Ld8;
                case 4: goto Lcd;
                case 5: goto Lc2;
                case 6: goto Lb7;
                case 7: goto Lac;
                case 8: goto La1;
                case 9: goto L9a;
                case 10: goto L88;
                case 11: goto L76;
                case 12: goto L64;
                case 13: goto L59;
                case 14: goto L4e;
                case 15: goto L43;
                case 16: goto L38;
                case 17: goto L2d;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "There is no way to get here, but the compiler thinks otherwise."
            r1.<init>(r2)
            throw r1
        L13:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r1 == 0) goto L22
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r2 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r2
            int r1 = r2.getNumber()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r1)
            return r1
        L22:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r1)
            return r1
        L2d:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r1)
            return r1
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r1)
            return r1
        L43:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(r1)
            return r1
        L4e:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(r1)
            return r1
        L59:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r1)
            return r1
        L64:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r1 == 0) goto L6f
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            return r1
        L6f:
            byte[] r2 = (byte[]) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeByteArraySizeNoTag(r2)
            return r1
        L76:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r1 == 0) goto L81
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            return r1
        L81:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSizeNoTag(r2)
            return r1
        L88:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r1 == 0) goto L93
            com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r2)
            return r1
        L93:
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSizeNoTag(r2)
            return r1
        L9a:
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSizeNoTag(r2)
            return r1
        La1:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSizeNoTag(r1)
            return r1
        Lac:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32SizeNoTag(r1)
            return r1
        Lb7:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64SizeNoTag(r1)
            return r1
        Lc2:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r1)
            return r1
        Lcd:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r1)
            return r1
        Ld8:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r1)
            return r1
        Le3:
            java.lang.Float r2 = (java.lang.Float) r2
            float r1 = r2.floatValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSizeNoTag(r1)
            return r1
        Lee:
            java.lang.Double r2 = (java.lang.Double) r2
            double r1 = r2.doubleValue()
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSizeNoTag(r1)
            return r1
    }

    public static int computeFieldSize(com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<?> r3, java.lang.Object r4) {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            int r1 = r3.getNumber()
            boolean r2 = r3.isRepeated()
            if (r2 == 0) goto L4d
            boolean r3 = r3.isPacked()
            r2 = 0
            if (r3 == 0) goto L36
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            int r4 = computeElementSizeNoTag(r0, r4)
            int r2 = r2 + r4
            goto L1b
        L2b:
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r3 = r3 + r2
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r3 = r3 + r4
            return r3
        L36:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            int r4 = computeElementSize(r0, r1, r4)
            int r2 = r2 + r4
            goto L3c
        L4c:
            return r2
        L4d:
            int r3 = computeElementSize(r0, r1, r4)
            return r3
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet<T> emptySet() {
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.DEFAULT_INSTANCE
            return r0
    }

    private int getMessageSetSerializedSize(java.util.Map.Entry<T, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r1 = r5.getValue()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r2 != r3) goto L44
            boolean r2 = r0.isRepeated()
            if (r2 != 0) goto L44
            boolean r2 = r0.isPacked()
            if (r2 != 0) goto L44
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r0 == 0) goto L33
            java.lang.Object r5 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r5 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r5
            int r5 = r5.getNumber()
            com.google.crypto.tink.shaded.protobuf.LazyField r1 = (com.google.crypto.tink.shaded.protobuf.LazyField) r1
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldMessageSetExtensionSize(r5, r1)
            return r5
        L33:
            java.lang.Object r5 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r5 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r5
            int r5 = r5.getNumber()
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            int r5 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSetExtensionSize(r5, r1)
            return r5
        L44:
            int r5 = computeFieldSize(r0, r1)
            return r5
    }

    static int getWireFormatForFieldType(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r0, boolean r1) {
            if (r1 == 0) goto L4
            r0 = 2
            return r0
        L4:
            int r0 = r0.getWireType()
            return r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> boolean isInitialized(java.util.Map.Entry<T, java.lang.Object> r3) {
            java.lang.Object r0 = r3.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r1 != r2) goto L39
            boolean r0 = r0.isRepeated()
            if (r0 == 0) goto L30
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r3.next()
            boolean r0 = isMessageFieldValueInitialized(r0)
            if (r0 != 0) goto L1e
            r3 = 0
            return r3
        L30:
            java.lang.Object r3 = r3.getValue()
            boolean r3 = isMessageFieldValueInitialized(r3)
            return r3
        L39:
            r3 = 1
            return r3
    }

    private static boolean isMessageFieldValueInitialized(java.lang.Object r1) {
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder r1 = (com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder) r1
            boolean r1 = r1.isInitialized()
            return r1
        Lb:
            boolean r1 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r1.<init>(r0)
            throw r1
    }

    private static boolean isValidType(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3)
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2b;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            return r1
        L15:
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            return r0
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L2a
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            return r0
        L2b:
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r2 != 0) goto L35
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            return r0
        L36:
            boolean r2 = r3 instanceof java.lang.String
            return r2
        L39:
            boolean r2 = r3 instanceof java.lang.Boolean
            return r2
        L3c:
            boolean r2 = r3 instanceof java.lang.Double
            return r2
        L3f:
            boolean r2 = r3 instanceof java.lang.Float
            return r2
        L42:
            boolean r2 = r3 instanceof java.lang.Long
            return r2
        L45:
            boolean r2 = r3 instanceof java.lang.Integer
            return r2
    }

    private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r5 = r5.getValue()
            boolean r1 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r1 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.LazyField r5 = (com.google.crypto.tink.shaded.protobuf.LazyField) r5
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = r5.getValue()
        L14:
            boolean r1 = r0.isRepeated()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r4.getField(r0)
            if (r1 != 0) goto L25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L25:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = cloneIfMutable(r2)
            r3.add(r2)
            goto L2b
        L40:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r5 = r4.fields
            r5.put(r0, r1)
            goto L7d
        L46:
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r1 != r2) goto L74
            java.lang.Object r1 = r4.getField(r0)
            if (r1 != 0) goto L5e
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.lang.Object r5 = cloneIfMutable(r5)
            r1.put(r0, r5)
            goto L7d
        L5e:
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r1 = r1.toBuilder()
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r5
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r5 = r0.internalMergeFrom(r1, r5)
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = r5.build()
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            r1.put(r0, r5)
            goto L7d
        L74:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.lang.Object r5 = cloneIfMutable(r5)
            r1.put(r0, r5)
        L7d:
            return
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<T> newBuilder() {
            com.google.crypto.tink.shaded.protobuf.FieldSet$Builder r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet<T> newFieldSet() {
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet
            r0.<init>()
            return r0
    }

    public static java.lang.Object readPrimitiveField(com.google.crypto.tink.shaded.protobuf.CodedInputStream r0, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, boolean r2) throws java.io.IOException {
            if (r2 == 0) goto L9
            com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.STRICT
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.readPrimitiveField(r0, r1, r2)
            return r0
        L9:
            com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LOOSE
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.readPrimitiveField(r0, r1, r2)
            return r0
    }

    private void verifyType(T r3, java.lang.Object r4) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            boolean r0 = isValidType(r0, r4)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.getNumber()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = r3.getJavaType()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
    }

    static void writeElement(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, int r3, java.lang.Object r4) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP
            if (r2 != r0) goto La
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
            r1.writeGroup(r3, r4)
            goto L15
        La:
            r0 = 0
            int r0 = getWireFormatForFieldType(r2, r0)
            r1.writeTag(r3, r0)
            writeElementNoTag(r1, r2, r4)
        L15:
            return
    }

    static void writeElementNoTag(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, java.lang.Object r3) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto Ld2;
                case 2: goto Lc8;
                case 3: goto Lbe;
                case 4: goto Lb4;
                case 5: goto Laa;
                case 6: goto La0;
                case 7: goto L96;
                case 8: goto L8c;
                case 9: goto L86;
                case 10: goto L80;
                case 11: goto L70;
                case 12: goto L5e;
                case 13: goto L53;
                case 14: goto L48;
                case 15: goto L3d;
                case 16: goto L32;
                case 17: goto L27;
                case 18: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Ldb
        Ld:
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r2 == 0) goto L1c
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r3 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r3
            int r2 = r3.getNumber()
            r1.writeEnumNoTag(r2)
            goto Ldb
        L1c:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeEnumNoTag(r2)
            goto Ldb
        L27:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeSInt64NoTag(r2)
            goto Ldb
        L32:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeSInt32NoTag(r2)
            goto Ldb
        L3d:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeSFixed64NoTag(r2)
            goto Ldb
        L48:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeSFixed32NoTag(r2)
            goto Ldb
        L53:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeUInt32NoTag(r2)
            goto Ldb
        L5e:
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r2 == 0) goto L69
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r1.writeBytesNoTag(r3)
            goto Ldb
        L69:
            byte[] r3 = (byte[]) r3
            r1.writeByteArrayNoTag(r3)
            goto Ldb
        L70:
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r2 == 0) goto L7a
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r1.writeBytesNoTag(r3)
            goto Ldb
        L7a:
            java.lang.String r3 = (java.lang.String) r3
            r1.writeStringNoTag(r3)
            goto Ldb
        L80:
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r1.writeMessageNoTag(r3)
            goto Ldb
        L86:
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r1.writeGroupNoTag(r3)
            goto Ldb
        L8c:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.writeBoolNoTag(r2)
            goto Ldb
        L96:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeFixed32NoTag(r2)
            goto Ldb
        La0:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeFixed64NoTag(r2)
            goto Ldb
        Laa:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.writeInt32NoTag(r2)
            goto Ldb
        Lb4:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeUInt64NoTag(r2)
            goto Ldb
        Lbe:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.writeInt64NoTag(r2)
            goto Ldb
        Lc8:
            java.lang.Float r3 = (java.lang.Float) r3
            float r2 = r3.floatValue()
            r1.writeFloatNoTag(r2)
            goto Ldb
        Ld2:
            java.lang.Double r3 = (java.lang.Double) r3
            double r2 = r3.doubleValue()
            r1.writeDoubleNoTag(r2)
        Ldb:
            return
    }

    public static void writeField(com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<?> r3, java.lang.Object r4, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            int r1 = r3.getNumber()
            boolean r2 = r3.isRepeated()
            if (r2 == 0) goto L56
            java.util.List r4 = (java.util.List) r4
            boolean r3 = r3.isPacked()
            if (r3 == 0) goto L44
            r3 = 2
            r5.writeTag(r1, r3)
            java.util.Iterator r3 = r4.iterator()
            r1 = 0
        L1f:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r3.next()
            int r2 = computeElementSizeNoTag(r0, r2)
            int r1 = r1 + r2
            goto L1f
        L2f:
            r5.writeUInt32NoTag(r1)
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r3.next()
            writeElementNoTag(r5, r0, r4)
            goto L36
        L44:
            java.util.Iterator r3 = r4.iterator()
        L48:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r3.next()
            writeElement(r5, r0, r1, r4)
            goto L48
        L56:
            boolean r3 = r4 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r3 == 0) goto L64
            com.google.crypto.tink.shaded.protobuf.LazyField r4 = (com.google.crypto.tink.shaded.protobuf.LazyField) r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r4.getValue()
            writeElement(r5, r0, r1, r3)
            goto L67
        L64:
            writeElement(r5, r0, r1, r4)
        L67:
            return
    }

    private void writeMessageSetTo(java.util.Map.Entry<T, java.lang.Object> r4, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5) throws java.io.IOException {
            r3 = this;
            java.lang.Object r0 = r4.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r1 != r2) goto L38
            boolean r1 = r0.isRepeated()
            if (r1 != 0) goto L38
            boolean r1 = r0.isPacked()
            if (r1 != 0) goto L38
            java.lang.Object r0 = r4.getValue()
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r1 == 0) goto L28
            com.google.crypto.tink.shaded.protobuf.LazyField r0 = (com.google.crypto.tink.shaded.protobuf.LazyField) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.getValue()
        L28:
            java.lang.Object r4 = r4.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r4 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r4
            int r4 = r4.getNumber()
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            r5.writeMessageSetExtension(r4, r0)
            goto L3f
        L38:
            java.lang.Object r4 = r4.getValue()
            writeField(r0, r4, r5)
        L3f:
            return
    }

    public void addRepeatedField(T r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r3.isRepeated()
            if (r0 == 0) goto L20
            r2.verifyType(r3, r4)
            java.lang.Object r0 = r2.getField(r3)
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            r1.put(r3, r0)
            goto L1c
        L1a:
            java.util.List r0 = (java.util.List) r0
        L1c:
            r0.add(r4)
            return
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "addRepeatedField() can only be called on repeated fields."
            r3.<init>(r4)
            throw r3
    }

    public void clear() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            r0.clear()
            r0 = 0
            r1.hasLazyField = r0
            return
    }

    public void clearField(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            r0.remove(r2)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r1.fields
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L10
            r2 = 0
            r1.hasLazyField = r2
        L10:
            return
    }

    public com.google.crypto.tink.shaded.protobuf.FieldSet<T> clone() {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = newFieldSet()
            r1 = 0
        L5:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            int r2 = r2.getNumArrayEntries()
            if (r1 >= r2) goto L23
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            r0.setField(r3, r2)
            int r1 = r1 + 1
            goto L5
        L23:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.lang.Iterable r1 = r1.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            r0.setField(r3, r2)
            goto L2d
        L47:
            boolean r1 = r4.hasLazyField
            r0.hasLazyField = r1
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m710clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r1.clone()
            return r0
    }

    java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator r0 = new com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Set r1 = r1.descendingEntrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Set r0 = r0.descendingEntrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.FieldSet
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.crypto.tink.shaded.protobuf.FieldSet r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet) r2
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r2.fields
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.util.Map<T, java.lang.Object> getAllFields() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L17
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            r1 = 0
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = cloneAllFieldsMap(r0, r1)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            boolean r1 = r1.isImmutable()
            if (r1 == 0) goto L16
            r0.makeImmutable()
        L16:
            return r0
        L17:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            boolean r0 = r0.isImmutable()
            if (r0 == 0) goto L22
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            goto L28
        L22:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L28:
            return r0
    }

    public java.lang.Object getField(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r0 == 0) goto L10
            com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r2.getValue()
        L10:
            return r2
    }

    public int getMessageSetSerializedSize() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            int r2 = r2.getNumArrayEntries()
            if (r0 >= r2) goto L18
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r0)
            int r2 = r3.getMessageSetSerializedSize(r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L18:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r3.getMessageSetSerializedSize(r2)
            int r1 = r1 + r2
            goto L22
        L34:
            return r1
    }

    public java.lang.Object getRepeatedField(T r2, int r3) {
            r1 = this;
            boolean r0 = r2.isRepeated()
            if (r0 == 0) goto L19
            java.lang.Object r2 = r1.getField(r2)
            if (r2 == 0) goto L13
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r3)
            return r2
        L13:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "getRepeatedField() can only be called on repeated fields."
            r2.<init>(r3)
            throw r2
    }

    public int getRepeatedFieldCount(T r2) {
            r1 = this;
            boolean r0 = r2.isRepeated()
            if (r0 == 0) goto L15
            java.lang.Object r2 = r1.getField(r2)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "getRepeatedField() can only be called on repeated fields."
            r2.<init>(r0)
            throw r2
    }

    public int getSerializedSize() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            int r2 = r2.getNumArrayEntries()
            if (r0 >= r2) goto L22
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r0)
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = computeFieldSize(r3, r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L22:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r4.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = computeFieldSize(r3, r2)
            int r1 = r1 + r2
            goto L2c
        L48:
            return r1
    }

    public boolean hasField(T r2) {
            r1 = this;
            boolean r0 = r2.isRepeated()
            if (r0 != 0) goto L12
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "hasField() can only be called on non-repeated fields."
            r2.<init>(r0)
            throw r2
    }

    public int hashCode() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            int r0 = r0.hashCode()
            return r0
    }

    boolean isEmpty() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            return r0
    }

    public boolean isInitialized() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            int r2 = r2.getNumArrayEntries()
            if (r1 >= r2) goto L1a
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
            boolean r2 = isInitialized(r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.lang.Iterable r1 = r1.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = isInitialized(r2)
            if (r2 != 0) goto L24
            return r0
        L37:
            r0 = 1
            return r0
    }

    public java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator r0 = new com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void makeImmutable() {
            r3 = this;
            boolean r0 = r3.isImmutable
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L28
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r2 == 0) goto L25
            java.lang.Object r1 = r1.getValue()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            r1.makeImmutable()
        L25:
            int r0 = r0 + 1
            goto L6
        L28:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            r0.makeImmutable()
            r0 = 1
            r3.isImmutable = r0
            return
    }

    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.FieldSet<T> r3) {
            r2 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L15
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.mergeFromField(r1)
            int r0 = r0 + 1
            goto L1
        L15:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r3.fields
            java.lang.Iterable r3 = r3.getOverflowEntries()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.mergeFromField(r0)
            goto L1f
        L2f:
            return
    }

    public void setField(T r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r3.isRepeated()
            if (r0 == 0) goto L30
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L28
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = (java.util.List) r4
            r0.addAll(r4)
            java.util.Iterator r4 = r0.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r4.next()
            r2.verifyType(r3, r1)
            goto L18
        L26:
            r4 = r0
            goto L33
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong object type used with protocol message reflection."
            r3.<init>(r4)
            throw r3
        L30:
            r2.verifyType(r3, r4)
        L33:
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r0 == 0) goto L3a
            r0 = 1
            r2.hasLazyField = r0
        L3a:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            r0.put(r3, r4)
            return
    }

    public void setRepeatedField(T r2, int r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r2.isRepeated()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.getField(r2)
            if (r0 == 0) goto L15
            r1.verifyType(r2, r4)
            java.util.List r0 = (java.util.List) r0
            r0.set(r3, r4)
            return
        L15:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "getRepeatedField() can only be called on repeated fields."
            r2.<init>(r3)
            throw r2
    }

    public void writeMessageSetTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L15
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.writeMessageSetTo(r1, r3)
            int r0 = r0 + 1
            goto L1
        L15:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r2.writeMessageSetTo(r1, r3)
            goto L1f
        L2f:
            return
    }

    public void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L1f
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            java.lang.Object r2 = r1.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            java.lang.Object r1 = r1.getValue()
            writeField(r2, r1, r4)
            int r0 = r0 + 1
            goto L1
        L1f:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            java.lang.Object r1 = r1.getValue()
            writeField(r2, r1, r4)
            goto L29
        L43:
            return
    }
}
