package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public class PrimitiveRegistry {
    private final java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> primitiveConstructorMap;
    private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> primitiveWrapperMap;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.PrimitiveRegistry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> primitiveConstructorMap;
        private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> primitiveWrapperMap;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.primitiveConstructorMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.primitiveWrapperMap = r0
                return
        }

        public Builder(com.google.crypto.tink.internal.PrimitiveRegistry r3) {
                r2 = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r1 = com.google.crypto.tink.internal.PrimitiveRegistry.access$000(r3)
                r0.<init>(r1)
                r2.primitiveConstructorMap = r0
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map r3 = com.google.crypto.tink.internal.PrimitiveRegistry.access$100(r3)
                r0.<init>(r3)
                r2.primitiveWrapperMap = r0
                return
        }

        static /* synthetic */ java.util.Map access$400(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r0) {
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r0 = r0.primitiveConstructorMap
                return r0
        }

        static /* synthetic */ java.util.Map access$500(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r0) {
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r0.primitiveWrapperMap
                return r0
        }

        com.google.crypto.tink.internal.PrimitiveRegistry build() {
                r2 = this;
                com.google.crypto.tink.internal.PrimitiveRegistry r0 = new com.google.crypto.tink.internal.PrimitiveRegistry
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public <KeyT extends com.google.crypto.tink.Key, PrimitiveT> com.google.crypto.tink.internal.PrimitiveRegistry.Builder registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT> r5) throws java.security.GeneralSecurityException {
                r4 = this;
                if (r5 == 0) goto L48
                com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex r0 = new com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex
                java.lang.Class r1 = r5.getKeyClass()
                java.lang.Class r2 = r5.getPrimitiveClass()
                r3 = 0
                r0.<init>(r1, r2, r3)
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r4.primitiveConstructorMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L42
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r4.primitiveConstructorMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.internal.PrimitiveConstructor r1 = (com.google.crypto.tink.internal.PrimitiveConstructor) r1
                boolean r2 = r1.equals(r5)
                if (r2 == 0) goto L2d
                boolean r5 = r5.equals(r1)
                if (r5 == 0) goto L2d
                goto L47
            L2d:
                java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L42:
                java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r1 = r4.primitiveConstructorMap
                r1.put(r0, r5)
            L47:
                return r4
            L48:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "primitive constructor must be non-null"
                r5.<init>(r0)
                throw r5
        }

        public <InputPrimitiveT, WrapperPrimitiveT> com.google.crypto.tink.internal.PrimitiveRegistry.Builder registerPrimitiveWrapper(com.google.crypto.tink.PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> r4) throws java.security.GeneralSecurityException {
                r3 = this;
                if (r4 == 0) goto L3e
                java.lang.Class r0 = r4.getPrimitiveClass()
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r1 = r3.primitiveWrapperMap
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L38
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r1 = r3.primitiveWrapperMap
                java.lang.Object r1 = r1.get(r0)
                com.google.crypto.tink.PrimitiveWrapper r1 = (com.google.crypto.tink.PrimitiveWrapper) r1
                boolean r2 = r1.equals(r4)
                if (r2 == 0) goto L23
                boolean r4 = r4.equals(r1)
                if (r4 == 0) goto L23
                goto L3d
            L23:
                java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L38:
                java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r1 = r3.primitiveWrapperMap
                r1.put(r0, r4)
            L3d:
                return r3
            L3e:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "wrapper must be non-null"
                r4.<init>(r0)
                throw r4
        }
    }

    private static final class PrimitiveConstructorIndex {
        private final java.lang.Class<?> keyClass;
        private final java.lang.Class<?> primitiveClass;

        private PrimitiveConstructorIndex(java.lang.Class<?> r1, java.lang.Class<?> r2) {
                r0 = this;
                r0.<init>()
                r0.keyClass = r1
                r0.primitiveClass = r2
                return
        }

        /* synthetic */ PrimitiveConstructorIndex(java.lang.Class r1, java.lang.Class r2, com.google.crypto.tink.internal.PrimitiveRegistry.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex r4 = (com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex) r4
                java.lang.Class<?> r0 = r4.keyClass
                java.lang.Class<?> r2 = r3.keyClass
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                java.lang.Class<?> r4 = r4.primitiveClass
                java.lang.Class<?> r0 = r3.primitiveClass
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<?> r0 = r2.keyClass
                java.lang.Class<?> r1 = r2.primitiveClass
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class<?> r1 = r2.keyClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " with primitive type: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Class<?> r1 = r2.primitiveClass
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private PrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.crypto.tink.internal.PrimitiveRegistry.Builder.access$400(r3)
            r0.<init>(r1)
            r2.primitiveConstructorMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r3 = com.google.crypto.tink.internal.PrimitiveRegistry.Builder.access$500(r3)
            r0.<init>(r3)
            r2.primitiveWrapperMap = r0
            return
    }

    /* synthetic */ PrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder r1, com.google.crypto.tink.internal.PrimitiveRegistry.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.util.Map access$000(com.google.crypto.tink.internal.PrimitiveRegistry r0) {
            java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r0 = r0.primitiveConstructorMap
            return r0
    }

    static /* synthetic */ java.util.Map access$100(com.google.crypto.tink.internal.PrimitiveRegistry r0) {
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r0.primitiveWrapperMap
            return r0
    }

    public java.lang.Class<?> getInputPrimitiveClass(java.lang.Class<?> r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r3.primitiveWrapperMap
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r3.primitiveWrapperMap
            java.lang.Object r4 = r0.get(r4)
            com.google.crypto.tink.PrimitiveWrapper r4 = (com.google.crypto.tink.PrimitiveWrapper) r4
            java.lang.Class r4 = r4.getInputPrimitiveClass()
            return r4
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No input primitive class for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " available"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public <KeyT extends com.google.crypto.tink.Key, PrimitiveT> PrimitiveT getPrimitive(KeyT r4, java.lang.Class<PrimitiveT> r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex r0 = new com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r5 = r3.primitiveConstructorMap
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L1f
            java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry$PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> r5 = r3.primitiveConstructorMap
            java.lang.Object r5 = r5.get(r0)
            com.google.crypto.tink.internal.PrimitiveConstructor r5 = (com.google.crypto.tink.internal.PrimitiveConstructor) r5
            java.lang.Object r4 = r5.constructPrimitive(r4)
            return r4
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "No PrimitiveConstructor for "
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = " available"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT wrap(com.google.crypto.tink.PrimitiveSet<InputPrimitiveT> r3, java.lang.Class<WrapperPrimitiveT> r4) throws java.security.GeneralSecurityException {
            r2 = this;
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r2.primitiveWrapperMap
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L39
            java.util.Map<java.lang.Class<?>, com.google.crypto.tink.PrimitiveWrapper<?, ?>> r0 = r2.primitiveWrapperMap
            java.lang.Object r4 = r0.get(r4)
            com.google.crypto.tink.PrimitiveWrapper r4 = (com.google.crypto.tink.PrimitiveWrapper) r4
            java.lang.Class r0 = r3.getPrimitiveClass()
            java.lang.Class r1 = r4.getInputPrimitiveClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            java.lang.Class r0 = r4.getInputPrimitiveClass()
            java.lang.Class r1 = r3.getPrimitiveClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            java.lang.Object r3 = r4.wrap(r3)
            return r3
        L31:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r3.<init>(r4)
            throw r3
        L39:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No wrapper found for "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }
}
