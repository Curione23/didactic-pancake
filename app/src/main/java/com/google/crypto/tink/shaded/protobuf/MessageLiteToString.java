package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class MessageLiteToString {
    private static final java.lang.String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final java.lang.String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER = null;
    private static final java.lang.String LIST_SUFFIX = "List";
    private static final java.lang.String MAP_SUFFIX = "Map";

    static {
            r0 = 80
            char[] r0 = new char[r0]
            com.google.crypto.tink.shaded.protobuf.MessageLiteToString.INDENT_BUFFER = r0
            r1 = 32
            java.util.Arrays.fill(r0, r1)
            return
    }

    private MessageLiteToString() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void indent(int r3, java.lang.StringBuilder r4) {
        L0:
            if (r3 <= 0) goto L10
            char[] r0 = com.google.crypto.tink.shaded.protobuf.MessageLiteToString.INDENT_BUFFER
            int r1 = r0.length
            if (r3 <= r1) goto L9
            int r1 = r0.length
            goto La
        L9:
            r1 = r3
        La:
            r2 = 0
            r4.append(r0, r2, r1)
            int r3 = r3 - r1
            goto L0
        L10:
            return
    }

    private static boolean isDefaultValue(java.lang.Object r7) {
            boolean r0 = r7 instanceof java.lang.Boolean
            r1 = 1
            if (r0 == 0) goto Ld
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r1
            return r7
        Ld:
            boolean r0 = r7 instanceof java.lang.Integer
            r2 = 0
            if (r0 == 0) goto L1d
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L30
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            if (r7 != 0) goto L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            return r1
        L30:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L47
            java.lang.Double r7 = (java.lang.Double) r7
            double r3 = r7.doubleValue()
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L45
            goto L46
        L45:
            r1 = r2
        L46:
            return r1
        L47:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L52
            java.lang.String r0 = ""
            boolean r7 = r7.equals(r0)
            return r7
        L52:
            boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L5d
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            boolean r7 = r7.equals(r0)
            return r7
        L5d:
            boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite
            if (r0 == 0) goto L6d
            r0 = r7
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.getDefaultInstanceForType()
            if (r7 != r0) goto L6b
            goto L6c
        L6b:
            r1 = r2
        L6c:
            return r1
        L6d:
            boolean r0 = r7 instanceof java.lang.Enum
            if (r0 == 0) goto L7c
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L7a
            goto L7b
        L7a:
            r1 = r2
        L7b:
            return r1
        L7c:
            return r2
    }

    private static java.lang.String pascalCaseToSnakeCase(java.lang.String r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            return r4
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r1 = r4.charAt(r1)
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.append(r1)
            r1 = 1
        L19:
            int r2 = r4.length()
            if (r1 >= r2) goto L38
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 == 0) goto L2e
            java.lang.String r3 = "_"
            r0.append(r3)
        L2e:
            char r2 = java.lang.Character.toLowerCase(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L19
        L38:
            java.lang.String r4 = r0.toString()
            return r4
    }

    static void printField(java.lang.StringBuilder r4, int r5, java.lang.String r6, java.lang.Object r7) {
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L19
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        La:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r7.next()
            printField(r4, r5, r6, r0)
            goto La
        L18:
            return
        L19:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L38
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L27:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            printField(r4, r5, r6, r0)
            goto L27
        L37:
            return
        L38:
            r0 = 10
            r4.append(r0)
            indent(r5, r4)
            java.lang.String r6 = pascalCaseToSnakeCase(r6)
            r4.append(r6)
            boolean r6 = r7 instanceof java.lang.String
            r0 = 34
            java.lang.String r1 = ": \""
            if (r6 == 0) goto L61
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r5 = com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeText(r7)
            java.lang.StringBuilder r4 = r4.append(r5)
            r4.append(r0)
            goto Lc5
        L61:
            boolean r6 = r7 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r6 == 0) goto L77
            java.lang.StringBuilder r4 = r4.append(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r7 = (com.google.crypto.tink.shaded.protobuf.ByteString) r7
            java.lang.String r5 = com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeBytes(r7)
            java.lang.StringBuilder r4 = r4.append(r5)
            r4.append(r0)
            goto Lc5
        L77:
            boolean r6 = r7 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            java.lang.String r0 = "}"
            java.lang.String r1 = "\n"
            java.lang.String r2 = " {"
            if (r6 == 0) goto L95
            r4.append(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r7 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r7
            int r6 = r5 + 2
            reflectivePrintWithIndent(r7, r4, r6)
            r4.append(r1)
            indent(r5, r4)
            r4.append(r0)
            goto Lc5
        L95:
            boolean r6 = r7 instanceof java.util.Map.Entry
            if (r6 == 0) goto Lbc
            r4.append(r2)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            int r6 = r5 + 2
            java.lang.String r2 = "key"
            java.lang.Object r3 = r7.getKey()
            printField(r4, r6, r2, r3)
            java.lang.String r2 = "value"
            java.lang.Object r7 = r7.getValue()
            printField(r4, r6, r2, r7)
            r4.append(r1)
            indent(r5, r4)
            r4.append(r0)
            goto Lc5
        Lbc:
            java.lang.String r5 = ": "
            java.lang.StringBuilder r4 = r4.append(r5)
            r4.append(r7)
        Lc5:
            return
    }

    private static void reflectivePrintWithIndent(com.google.crypto.tink.shaded.protobuf.MessageLite r16, java.lang.StringBuilder r17, int r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r16.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r9 = 0
        L1f:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L8b
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L35
            goto L88
        L35:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r13) goto L40
            goto L88
        L40:
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L52
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L88
        L52:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 != 0) goto L5d
            goto L88
        L5d:
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 == 0) goto L65
            goto L88
        L65:
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L77
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L88
        L77:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L88
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L88:
            int r9 = r9 + 1
            goto L1f
        L8b:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L93:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1b7
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto Leb
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto Leb
            boolean r15 = r9.equals(r14)
            if (r15 != 0) goto Leb
            java.lang.Object r15 = r7.getValue()
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto Leb
            java.lang.Class r13 = r15.getReturnType()
            java.lang.Class<java.util.List> r8 = java.util.List.class
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto Leb
            int r7 = r9.length()
            int r8 = r14.length()
            int r7 = r7 - r8
            r8 = 0
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r15, r0, r9)
            printField(r1, r2, r7, r8)
            goto L14a
        Leb:
            java.lang.String r8 = "Map"
            boolean r13 = r9.endsWith(r8)
            if (r13 == 0) goto L137
            boolean r13 = r9.equals(r8)
            if (r13 != 0) goto L137
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L137
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L137
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L137
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L137
            int r7 = r9.length()
            int r8 = r8.length()
            int r7 = r7 - r8
            r8 = 0
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r13, r0, r9)
            printField(r1, r2, r7, r8)
            goto L14a
        L137:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r12)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L14d
        L14a:
            r13 = 3
            goto L93
        L14d:
            java.lang.String r8 = "Bytes"
            boolean r13 = r9.endsWith(r8)
            if (r13 == 0) goto L177
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r10)
            int r14 = r9.length()
            int r8 = r8.length()
            int r14 = r14 - r8
            r8 = 0
            java.lang.String r14 = r9.substring(r8, r14)
            java.lang.StringBuilder r8 = r13.append(r14)
            java.lang.String r8 = r8.toString()
            boolean r8 = r5.containsKey(r8)
            if (r8 == 0) goto L177
            goto L14a
        L177:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r11)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r4.get(r8)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r7 == 0) goto L14a
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r7, r0, r14)
            if (r8 != 0) goto L1a5
            boolean r8 = isDefaultValue(r7)
            if (r8 != 0) goto L1a3
            r8 = 1
            goto L1b1
        L1a3:
            r8 = r13
            goto L1b1
        L1a5:
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r8, r0, r14)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
        L1b1:
            if (r8 == 0) goto L14a
            printField(r1, r2, r9, r7)
            goto L14a
        L1b7:
            boolean r3 = r0 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage
            if (r3 == 0) goto L1f7
            r3 = r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r3 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r3
            com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r3 = r3.extensions
            java.util.Iterator r3 = r3.iterator()
        L1c4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1f7
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "["
            r5.<init>(r6)
            java.lang.Object r6 = r4.getKey()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r6 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r6
            int r6 = r6.getNumber()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "]"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r4 = r4.getValue()
            printField(r1, r2, r5, r4)
            goto L1c4
        L1f7:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = r0.unknownFields
            if (r3 == 0) goto L202
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r0.unknownFields
            r0.printWithIndent(r1, r2)
        L202:
            return
    }

    static java.lang.String toString(com.google.crypto.tink.shaded.protobuf.MessageLite r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "# "
            java.lang.StringBuilder r1 = r0.append(r1)
            r1.append(r3)
            r3 = 0
            reflectivePrintWithIndent(r2, r0, r3)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
