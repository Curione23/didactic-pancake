package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private java.lang.String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private com.google.gson.internal.Excluder excluder;
    private final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    private com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private com.google.gson.FormattingStyle formattingStyle;
    private boolean generateNonExecutableJson;
    private final java.util.List<com.google.gson.TypeAdapterFactory> hierarchyFactories;
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private com.google.gson.LongSerializationPolicy longSerializationPolicy;
    private com.google.gson.ToNumberStrategy numberToNumberStrategy;
    private com.google.gson.ToNumberStrategy objectToNumberStrategy;
    private final java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private com.google.gson.Strictness strictness;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
            r3 = this;
            r3.<init>()
            com.google.gson.internal.Excluder r0 = com.google.gson.internal.Excluder.DEFAULT
            r3.excluder = r0
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            r3.longSerializationPolicy = r0
            com.google.gson.FieldNamingPolicy r0 = com.google.gson.FieldNamingPolicy.IDENTITY
            r3.fieldNamingPolicy = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.instanceCreators = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.factories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.hierarchyFactories = r0
            r0 = 0
            r3.serializeNulls = r0
            java.lang.String r1 = com.google.gson.Gson.DEFAULT_DATE_PATTERN
            r3.datePattern = r1
            r1 = 2
            r3.dateStyle = r1
            r3.timeStyle = r1
            r3.complexMapKeySerialization = r0
            r3.serializeSpecialFloatingPointValues = r0
            r1 = 1
            r3.escapeHtmlChars = r1
            com.google.gson.FormattingStyle r2 = com.google.gson.Gson.DEFAULT_FORMATTING_STYLE
            r3.formattingStyle = r2
            r3.generateNonExecutableJson = r0
            com.google.gson.Strictness r0 = com.google.gson.Gson.DEFAULT_STRICTNESS
            r3.strictness = r0
            r3.useJdkUnsafe = r1
            com.google.gson.ToNumberStrategy r0 = com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY
            r3.objectToNumberStrategy = r0
            com.google.gson.ToNumberStrategy r0 = com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY
            r3.numberToNumberStrategy = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.reflectionFilters = r0
            return
    }

    GsonBuilder(com.google.gson.Gson r7) {
            r6 = this;
            r6.<init>()
            com.google.gson.internal.Excluder r0 = com.google.gson.internal.Excluder.DEFAULT
            r6.excluder = r0
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            r6.longSerializationPolicy = r0
            com.google.gson.FieldNamingPolicy r0 = com.google.gson.FieldNamingPolicy.IDENTITY
            r6.fieldNamingPolicy = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.instanceCreators = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.factories = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.hierarchyFactories = r2
            r3 = 0
            r6.serializeNulls = r3
            java.lang.String r4 = com.google.gson.Gson.DEFAULT_DATE_PATTERN
            r6.datePattern = r4
            r4 = 2
            r6.dateStyle = r4
            r6.timeStyle = r4
            r6.complexMapKeySerialization = r3
            r6.serializeSpecialFloatingPointValues = r3
            r4 = 1
            r6.escapeHtmlChars = r4
            com.google.gson.FormattingStyle r5 = com.google.gson.Gson.DEFAULT_FORMATTING_STYLE
            r6.formattingStyle = r5
            r6.generateNonExecutableJson = r3
            com.google.gson.Strictness r3 = com.google.gson.Gson.DEFAULT_STRICTNESS
            r6.strictness = r3
            r6.useJdkUnsafe = r4
            com.google.gson.ToNumberStrategy r3 = com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY
            r6.objectToNumberStrategy = r3
            com.google.gson.ToNumberStrategy r3 = com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY
            r6.numberToNumberStrategy = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r6.reflectionFilters = r3
            com.google.gson.internal.Excluder r4 = r7.excluder
            r6.excluder = r4
            com.google.gson.FieldNamingStrategy r4 = r7.fieldNamingStrategy
            r6.fieldNamingPolicy = r4
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r4 = r7.instanceCreators
            r0.putAll(r4)
            boolean r0 = r7.serializeNulls
            r6.serializeNulls = r0
            boolean r0 = r7.complexMapKeySerialization
            r6.complexMapKeySerialization = r0
            boolean r0 = r7.generateNonExecutableJson
            r6.generateNonExecutableJson = r0
            boolean r0 = r7.htmlSafe
            r6.escapeHtmlChars = r0
            com.google.gson.FormattingStyle r0 = r7.formattingStyle
            r6.formattingStyle = r0
            com.google.gson.Strictness r0 = r7.strictness
            r6.strictness = r0
            boolean r0 = r7.serializeSpecialFloatingPointValues
            r6.serializeSpecialFloatingPointValues = r0
            com.google.gson.LongSerializationPolicy r0 = r7.longSerializationPolicy
            r6.longSerializationPolicy = r0
            java.lang.String r0 = r7.datePattern
            r6.datePattern = r0
            int r0 = r7.dateStyle
            r6.dateStyle = r0
            int r0 = r7.timeStyle
            r6.timeStyle = r0
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r7.builderFactories
            r1.addAll(r0)
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r7.builderHierarchyFactories
            r2.addAll(r0)
            boolean r0 = r7.useJdkUnsafe
            r6.useJdkUnsafe = r0
            com.google.gson.ToNumberStrategy r0 = r7.objectToNumberStrategy
            r6.objectToNumberStrategy = r0
            com.google.gson.ToNumberStrategy r0 = r7.numberToNumberStrategy
            r6.numberToNumberStrategy = r0
            java.util.List<com.google.gson.ReflectionAccessFilter> r7 = r7.reflectionFilters
            r3.addAll(r7)
            return
    }

    private static void addTypeAdaptersForDate(java.lang.String r4, int r5, int r6, java.util.List<com.google.gson.TypeAdapterFactory> r7) {
            boolean r0 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            r1 = 0
            if (r4 == 0) goto L24
            java.lang.String r2 = r4.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L24
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r5 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r5 = r5.createAdapterFactory(r4)
            if (r0 == 0) goto L44
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r6 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r6.createAdapterFactory(r4)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r6 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r4 = r6.createAdapterFactory(r4)
            goto L45
        L24:
            r4 = 2
            if (r5 != r4) goto L2b
            if (r6 == r4) goto L2a
            goto L2b
        L2a:
            return
        L2b:
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r4 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r4 = r4.createAdapterFactory(r5, r6)
            if (r0 == 0) goto L43
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r1 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r1.createAdapterFactory(r5, r6)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r2 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r5 = r2.createAdapterFactory(r5, r6)
            r3 = r5
            r5 = r4
            r4 = r3
            goto L45
        L43:
            r5 = r4
        L44:
            r4 = r1
        L45:
            r7.add(r5)
            if (r0 == 0) goto L50
            r7.add(r1)
            r7.add(r4)
        L50:
            return
    }

    private static int checkDateFormatStyle(int r3) {
            if (r3 < 0) goto L6
            r0 = 3
            if (r3 > r0) goto L6
            return r3
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid style: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static boolean isTypeObjectOrJsonElement(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L14
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L12
            java.lang.Class<com.google.gson.JsonElement> r0 = com.google.gson.JsonElement.class
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L14
        L12:
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public com.google.gson.GsonBuilder addDeserializationExclusionStrategy(com.google.gson.ExclusionStrategy r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            com.google.gson.internal.Excluder r0 = r3.excluder
            r1 = 0
            r2 = 1
            com.google.gson.internal.Excluder r4 = r0.withExclusionStrategy(r4, r1, r2)
            r3.excluder = r4
            return r3
    }

    public com.google.gson.GsonBuilder addReflectionAccessFilter(com.google.gson.ReflectionAccessFilter r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> r0 = r1.reflectionFilters
            r0.addFirst(r2)
            return r1
    }

    public com.google.gson.GsonBuilder addSerializationExclusionStrategy(com.google.gson.ExclusionStrategy r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            com.google.gson.internal.Excluder r0 = r3.excluder
            r1 = 1
            r2 = 0
            com.google.gson.internal.Excluder r4 = r0.withExclusionStrategy(r4, r1, r2)
            r3.excluder = r4
            return r3
    }

    public com.google.gson.Gson create() {
            r26 = this;
            r0 = r26
            java.util.ArrayList r1 = new java.util.ArrayList
            r19 = r1
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.factories
            int r2 = r2.size()
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r0.hierarchyFactories
            int r3 = r3.size()
            int r2 = r2 + r3
            int r2 = r2 + 3
            r1.<init>(r2)
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.factories
            r1.addAll(r2)
            java.util.Collections.reverse(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r0.hierarchyFactories
            r2.<init>(r3)
            java.util.Collections.reverse(r2)
            r1.addAll(r2)
            java.lang.String r2 = r0.datePattern
            int r3 = r0.dateStyle
            int r4 = r0.timeStyle
            addTypeAdaptersForDate(r2, r3, r4, r1)
            com.google.gson.Gson r23 = new com.google.gson.Gson
            r1 = r23
            com.google.gson.internal.Excluder r2 = r0.excluder
            com.google.gson.FieldNamingStrategy r3 = r0.fieldNamingPolicy
            java.util.HashMap r5 = new java.util.HashMap
            r4 = r5
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r6 = r0.instanceCreators
            r5.<init>(r6)
            boolean r5 = r0.serializeNulls
            boolean r6 = r0.complexMapKeySerialization
            boolean r7 = r0.generateNonExecutableJson
            boolean r8 = r0.escapeHtmlChars
            com.google.gson.FormattingStyle r9 = r0.formattingStyle
            com.google.gson.Strictness r10 = r0.strictness
            boolean r11 = r0.serializeSpecialFloatingPointValues
            boolean r12 = r0.useJdkUnsafe
            com.google.gson.LongSerializationPolicy r13 = r0.longSerializationPolicy
            java.lang.String r14 = r0.datePattern
            int r15 = r0.dateStyle
            r24 = r1
            int r1 = r0.timeStyle
            r16 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r17 = r1
            r25 = r2
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.factories
            r1.<init>(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r18 = r1
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.hierarchyFactories
            r1.<init>(r2)
            com.google.gson.ToNumberStrategy r1 = r0.objectToNumberStrategy
            r20 = r1
            com.google.gson.ToNumberStrategy r1 = r0.numberToNumberStrategy
            r21 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r22 = r1
            java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> r2 = r0.reflectionFilters
            r1.<init>(r2)
            r1 = r24
            r2 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r23
    }

    public com.google.gson.GsonBuilder disableHtmlEscaping() {
            r1 = this;
            r0 = 0
            r1.escapeHtmlChars = r0
            return r1
    }

    public com.google.gson.GsonBuilder disableInnerClassSerialization() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r0 = r0.disableInnerClassSerialization()
            r1.excluder = r0
            return r1
    }

    public com.google.gson.GsonBuilder disableJdkUnsafe() {
            r1 = this;
            r0 = 0
            r1.useJdkUnsafe = r0
            return r1
    }

    public com.google.gson.GsonBuilder enableComplexMapKeySerialization() {
            r1 = this;
            r0 = 1
            r1.complexMapKeySerialization = r0
            return r1
    }

    public com.google.gson.GsonBuilder excludeFieldsWithModifiers(int... r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r2 = r0.withModifiers(r2)
            r1.excluder = r2
            return r1
    }

    public com.google.gson.GsonBuilder excludeFieldsWithoutExposeAnnotation() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r0 = r0.excludeFieldsWithoutExposeAnnotation()
            r1.excluder = r0
            return r1
    }

    public com.google.gson.GsonBuilder generateNonExecutableJson() {
            r1 = this;
            r0 = 1
            r1.generateNonExecutableJson = r0
            return r1
    }

    public com.google.gson.GsonBuilder registerTypeAdapter(java.lang.reflect.Type r4, java.lang.Object r5) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r5 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L16
            boolean r1 = r5 instanceof com.google.gson.JsonDeserializer
            if (r1 != 0) goto L16
            boolean r1 = r5 instanceof com.google.gson.InstanceCreator
            if (r1 != 0) goto L16
            boolean r1 = r5 instanceof com.google.gson.TypeAdapter
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = 1
        L17:
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r1)
            boolean r1 = isTypeObjectOrJsonElement(r4)
            if (r1 != 0) goto L53
            boolean r1 = r5 instanceof com.google.gson.InstanceCreator
            if (r1 == 0) goto L2c
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r3.instanceCreators
            r2 = r5
            com.google.gson.InstanceCreator r2 = (com.google.gson.InstanceCreator) r2
            r1.put(r4, r2)
        L2c:
            if (r0 != 0) goto L32
            boolean r0 = r5 instanceof com.google.gson.JsonDeserializer
            if (r0 == 0) goto L3f
        L32:
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r4)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r3.factories
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(r0, r5)
            r1.add(r0)
        L3f:
            boolean r0 = r5 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L52
            com.google.gson.reflect.TypeToken r4 = com.google.gson.reflect.TypeToken.get(r4)
            com.google.gson.TypeAdapter r5 = (com.google.gson.TypeAdapter) r5
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.bind.TypeAdapters.newFactory(r4, r5)
            java.util.List<com.google.gson.TypeAdapterFactory> r5 = r3.factories
            r5.add(r4)
        L52:
            return r3
        L53:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot override built-in adapter for "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public com.google.gson.GsonBuilder registerTypeAdapterFactory(com.google.gson.TypeAdapterFactory r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r1.factories
            r0.add(r2)
            return r1
    }

    public com.google.gson.GsonBuilder registerTypeHierarchyAdapter(java.lang.Class<?> r3, java.lang.Object r4) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            boolean r0 = r4 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L12
            boolean r1 = r4 instanceof com.google.gson.JsonDeserializer
            if (r1 != 0) goto L12
            boolean r1 = r4 instanceof com.google.gson.TypeAdapter
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r1)
            java.lang.Class<com.google.gson.JsonElement> r1 = com.google.gson.JsonElement.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto L3d
            boolean r1 = r4 instanceof com.google.gson.JsonDeserializer
            if (r1 != 0) goto L24
            if (r0 == 0) goto L2d
        L24:
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r2.hierarchyFactories
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(r3, r4)
            r0.add(r1)
        L2d:
            boolean r0 = r4 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L3c
            com.google.gson.TypeAdapter r4 = (com.google.gson.TypeAdapter) r4
            com.google.gson.TypeAdapterFactory r3 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(r3, r4)
            java.util.List<com.google.gson.TypeAdapterFactory> r4 = r2.factories
            r4.add(r3)
        L3c:
            return r2
        L3d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot override built-in adapter for "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public com.google.gson.GsonBuilder serializeNulls() {
            r1 = this;
            r0 = 1
            r1.serializeNulls = r0
            return r1
    }

    public com.google.gson.GsonBuilder serializeSpecialFloatingPointValues() {
            r1 = this;
            r0 = 1
            r1.serializeSpecialFloatingPointValues = r0
            return r1
    }

    @java.lang.Deprecated
    public com.google.gson.GsonBuilder setDateFormat(int r1) {
            r0 = this;
            int r1 = checkDateFormatStyle(r1)
            r0.dateStyle = r1
            r1 = 0
            r0.datePattern = r1
            return r0
    }

    public com.google.gson.GsonBuilder setDateFormat(int r1, int r2) {
            r0 = this;
            int r1 = checkDateFormatStyle(r1)
            r0.dateStyle = r1
            int r1 = checkDateFormatStyle(r2)
            r0.timeStyle = r1
            r1 = 0
            r0.datePattern = r1
            return r0
    }

    public com.google.gson.GsonBuilder setDateFormat(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L24
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.IllegalArgumentException -> L8
            r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L8
            goto L24
        L8:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The date pattern '"
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = "' is not valid"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r0)
            throw r1
        L24:
            r4.datePattern = r5
            return r4
    }

    public com.google.gson.GsonBuilder setExclusionStrategies(com.google.gson.ExclusionStrategy... r6) {
            r5 = this;
            java.util.Objects.requireNonNull(r6)
            int r0 = r6.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            r2 = r6[r1]
            com.google.gson.internal.Excluder r3 = r5.excluder
            r4 = 1
            com.google.gson.internal.Excluder r2 = r3.withExclusionStrategy(r2, r4, r4)
            r5.excluder = r2
            int r1 = r1 + 1
            goto L5
        L15:
            return r5
    }

    public com.google.gson.GsonBuilder setFieldNamingPolicy(com.google.gson.FieldNamingPolicy r1) {
            r0 = this;
            com.google.gson.GsonBuilder r1 = r0.setFieldNamingStrategy(r1)
            return r1
    }

    public com.google.gson.GsonBuilder setFieldNamingStrategy(com.google.gson.FieldNamingStrategy r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            com.google.gson.FieldNamingStrategy r1 = (com.google.gson.FieldNamingStrategy) r1
            r0.fieldNamingPolicy = r1
            return r0
    }

    public com.google.gson.GsonBuilder setFormattingStyle(com.google.gson.FormattingStyle r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            com.google.gson.FormattingStyle r1 = (com.google.gson.FormattingStyle) r1
            r0.formattingStyle = r1
            return r0
    }

    @java.lang.Deprecated
    public com.google.gson.GsonBuilder setLenient() {
            r1 = this;
            com.google.gson.Strictness r0 = com.google.gson.Strictness.LENIENT
            com.google.gson.GsonBuilder r0 = r1.setStrictness(r0)
            return r0
    }

    public com.google.gson.GsonBuilder setLongSerializationPolicy(com.google.gson.LongSerializationPolicy r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            com.google.gson.LongSerializationPolicy r1 = (com.google.gson.LongSerializationPolicy) r1
            r0.longSerializationPolicy = r1
            return r0
    }

    public com.google.gson.GsonBuilder setNumberToNumberStrategy(com.google.gson.ToNumberStrategy r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            com.google.gson.ToNumberStrategy r1 = (com.google.gson.ToNumberStrategy) r1
            r0.numberToNumberStrategy = r1
            return r0
    }

    public com.google.gson.GsonBuilder setObjectToNumberStrategy(com.google.gson.ToNumberStrategy r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            com.google.gson.ToNumberStrategy r1 = (com.google.gson.ToNumberStrategy) r1
            r0.objectToNumberStrategy = r1
            return r0
    }

    public com.google.gson.GsonBuilder setPrettyPrinting() {
            r1 = this;
            com.google.gson.FormattingStyle r0 = com.google.gson.FormattingStyle.PRETTY
            com.google.gson.GsonBuilder r0 = r1.setFormattingStyle(r0)
            return r0
    }

    public com.google.gson.GsonBuilder setStrictness(com.google.gson.Strictness r1) {
            r0 = this;
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            com.google.gson.Strictness r1 = (com.google.gson.Strictness) r1
            r0.strictness = r1
            return r0
    }

    public com.google.gson.GsonBuilder setVersion(double r4) {
            r3 = this;
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L15
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            com.google.gson.internal.Excluder r0 = r3.excluder
            com.google.gson.internal.Excluder r4 = r0.withVersion(r4)
            r3.excluder = r4
            return r3
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid version: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
