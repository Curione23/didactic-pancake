package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private static final com.google.gson.TypeAdapterFactory TREE_TYPE_CLASS_DUMMY_FACTORY = null;
    private static final com.google.gson.TypeAdapterFactory TREE_TYPE_FIELD_DUMMY_FACTORY = null;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.gson.TypeAdapterFactory> adapterFactoryMap;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class DummyTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
        private DummyTypeAdapterFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DummyTypeAdapterFactory(com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r1, com.google.gson.reflect.TypeToken<T> r2) {
                r0 = this;
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "Factory should not be used"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory r0 = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory
            r1 = 0
            r0.<init>(r1)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.TREE_TYPE_CLASS_DUMMY_FACTORY = r0
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory r0 = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory
            r0.<init>(r1)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.TREE_TYPE_FIELD_DUMMY_FACTORY = r0
            return
    }

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.adapterFactoryMap = r1
            return
    }

    private static java.lang.Object createAdapter(com.google.gson.internal.ConstructorConstructor r0, java.lang.Class<?> r1) {
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.internal.ObjectConstructor r0 = r0.get(r1)
            java.lang.Object r0 = r0.construct()
            return r0
    }

    private static com.google.gson.annotations.JsonAdapter getAnnotation(java.lang.Class<?> r1) {
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r0 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            com.google.gson.annotations.JsonAdapter r1 = (com.google.gson.annotations.JsonAdapter) r1
            return r1
    }

    private com.google.gson.TypeAdapterFactory putFactoryAndGetCurrent(java.lang.Class<?> r2, com.google.gson.TypeAdapterFactory r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.gson.TypeAdapterFactory> r0 = r1.adapterFactoryMap
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            com.google.gson.TypeAdapterFactory r2 = (com.google.gson.TypeAdapterFactory) r2
            if (r2 == 0) goto Lb
            r3 = r2
        Lb:
            return r3
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r8, com.google.gson.reflect.TypeToken<T> r9) {
            r7 = this;
            java.lang.Class r0 = r9.getRawType()
            com.google.gson.annotations.JsonAdapter r5 = getAnnotation(r0)
            if (r5 != 0) goto Lc
            r8 = 0
            return r8
        Lc:
            com.google.gson.internal.ConstructorConstructor r2 = r7.constructorConstructor
            r6 = 1
            r1 = r7
            r3 = r8
            r4 = r9
            com.google.gson.TypeAdapter r8 = r1.getTypeAdapter(r2, r3, r4, r5, r6)
            return r8
    }

    com.google.gson.TypeAdapter<?> getTypeAdapter(com.google.gson.internal.ConstructorConstructor r8, com.google.gson.Gson r9, com.google.gson.reflect.TypeToken<?> r10, com.google.gson.annotations.JsonAdapter r11, boolean r12) {
            r7 = this;
            java.lang.Class r0 = r11.value()
            java.lang.Object r8 = createAdapter(r8, r0)
            boolean r6 = r11.nullSafe()
            boolean r11 = r8 instanceof com.google.gson.TypeAdapter
            if (r11 == 0) goto L14
            com.google.gson.TypeAdapter r8 = (com.google.gson.TypeAdapter) r8
            goto L86
        L14:
            boolean r11 = r8 instanceof com.google.gson.TypeAdapterFactory
            if (r11 == 0) goto L29
            com.google.gson.TypeAdapterFactory r8 = (com.google.gson.TypeAdapterFactory) r8
            if (r12 == 0) goto L24
            java.lang.Class r11 = r10.getRawType()
            com.google.gson.TypeAdapterFactory r8 = r7.putFactoryAndGetCurrent(r11, r8)
        L24:
            com.google.gson.TypeAdapter r8 = r8.create(r9, r10)
            goto L86
        L29:
            boolean r11 = r8 instanceof com.google.gson.JsonSerializer
            if (r11 != 0) goto L63
            boolean r0 = r8 instanceof com.google.gson.JsonDeserializer
            if (r0 == 0) goto L32
            goto L63
        L32:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            r11.<init>(r12)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r11.append(r8)
            java.lang.String r11 = " as a @JsonAdapter for "
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r10 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L63:
            r0 = 0
            if (r11 == 0) goto L6b
            r11 = r8
            com.google.gson.JsonSerializer r11 = (com.google.gson.JsonSerializer) r11
            r1 = r11
            goto L6c
        L6b:
            r1 = r0
        L6c:
            boolean r11 = r8 instanceof com.google.gson.JsonDeserializer
            if (r11 == 0) goto L74
            com.google.gson.JsonDeserializer r8 = (com.google.gson.JsonDeserializer) r8
            r2 = r8
            goto L75
        L74:
            r2 = r0
        L75:
            if (r12 == 0) goto L7a
            com.google.gson.TypeAdapterFactory r8 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.TREE_TYPE_CLASS_DUMMY_FACTORY
            goto L7c
        L7a:
            com.google.gson.TypeAdapterFactory r8 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.TREE_TYPE_FIELD_DUMMY_FACTORY
        L7c:
            r5 = r8
            com.google.gson.internal.bind.TreeTypeAdapter r8 = new com.google.gson.internal.bind.TreeTypeAdapter
            r0 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = 0
        L86:
            if (r8 == 0) goto L8e
            if (r6 == 0) goto L8e
            com.google.gson.TypeAdapter r8 = r8.nullSafe()
        L8e:
            return r8
    }

    public boolean isClassJsonAdapterFactory(com.google.gson.reflect.TypeToken<?> r5, com.google.gson.TypeAdapterFactory r6) {
            r4 = this;
            java.util.Objects.requireNonNull(r5)
            java.util.Objects.requireNonNull(r6)
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.TREE_TYPE_CLASS_DUMMY_FACTORY
            r1 = 1
            if (r6 != r0) goto Lc
            return r1
        Lc:
            java.lang.Class r5 = r5.getRawType()
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.gson.TypeAdapterFactory> r0 = r4.adapterFactoryMap
            java.lang.Object r0 = r0.get(r5)
            com.google.gson.TypeAdapterFactory r0 = (com.google.gson.TypeAdapterFactory) r0
            r2 = 0
            if (r0 == 0) goto L20
            if (r0 != r6) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            return r1
        L20:
            com.google.gson.annotations.JsonAdapter r0 = getAnnotation(r5)
            if (r0 != 0) goto L27
            return r2
        L27:
            java.lang.Class r0 = r0.value()
            java.lang.Class<com.google.gson.TypeAdapterFactory> r3 = com.google.gson.TypeAdapterFactory.class
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 != 0) goto L34
            return r2
        L34:
            com.google.gson.internal.ConstructorConstructor r3 = r4.constructorConstructor
            java.lang.Object r0 = createAdapter(r3, r0)
            com.google.gson.TypeAdapterFactory r0 = (com.google.gson.TypeAdapterFactory) r0
            com.google.gson.TypeAdapterFactory r5 = r4.putFactoryAndGetCurrent(r5, r0)
            if (r5 != r6) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            return r1
    }
}
