package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRegistryLite {
    static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite EMPTY_REGISTRY_LITE = null;
    static final java.lang.String EXTENSION_CLASS_NAME = "com.google.crypto.tink.shaded.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite emptyRegistry;
    private final java.util.Map<com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    private static class ExtensionClassHolder {
        static final java.lang.Class<?> INSTANCE = null;

        static {
                java.lang.Class r0 = resolveExtensionClass()
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ExtensionClassHolder.INSTANCE = r0
                return
        }

        private ExtensionClassHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.Class<?> resolveExtensionClass() {
                java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.Extension"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }
    }

    private static final class ObjectIntPair {
        private final int number;
        private final java.lang.Object object;

        ObjectIntPair(java.lang.Object r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.object = r1
                r0.number = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair r4 = (com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ObjectIntPair) r4
                java.lang.Object r0 = r3.object
                java.lang.Object r2 = r4.object
                if (r0 != r2) goto L15
                int r0 = r3.number
                int r4 = r4.number
                if (r0 != r4) goto L15
                r1 = 1
            L15:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.object
                int r0 = java.lang.System.identityHashCode(r0)
                r1 = 65535(0xffff, float:9.1834E-41)
                int r0 = r0 * r1
                int r1 = r2.number
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite
            r1 = 1
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE = r0
            return
    }

    ExtensionRegistryLite() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.extensionsByNumber = r0
            return
    }

    ExtensionRegistryLite(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE
            if (r2 != r0) goto Le
            java.util.Map r2 = java.util.Collections.emptyMap()
            r1.extensionsByNumber = r2
            goto L16
        Le:
            java.util.Map<com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension<?, ?>> r2 = r2.extensionsByNumber
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.extensionsByNumber = r2
        L16:
            return
    }

    ExtensionRegistryLite(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.extensionsByNumber = r1
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite getEmptyRegistry() {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.emptyRegistry
            if (r0 != 0) goto L1d
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite> r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.class
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.emptyRegistry     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L18
            boolean r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.doFullRuntimeInheritanceCheck     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.createEmpty()     // Catch: java.lang.Throwable -> L1a
            goto L16
        L14:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE     // Catch: java.lang.Throwable -> L1a
        L16:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.emptyRegistry = r0     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0
        L1d:
            return r0
    }

    public static boolean isEagerlyParseMessageSets() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.eagerlyParseMessageSets
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite newInstance() {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.doFullRuntimeInheritanceCheck
            if (r0 == 0) goto L9
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.create()
            goto Le
        L9:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite
            r0.<init>()
        Le:
            return r0
    }

    public static void setEagerlyParseMessageSets(boolean r0) {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.eagerlyParseMessageSets = r0
            return
    }

    public final void add(com.google.crypto.tink.shaded.protobuf.ExtensionLite<?, ?> r6) {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension.class
            java.lang.Class r1 = r6.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L12
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r0
            r5.add(r0)
        L12:
            boolean r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.doFullRuntimeInheritanceCheck
            if (r0 == 0) goto L47
            boolean r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.isFullRegistry(r5)
            if (r0 == 0) goto L47
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = "add"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L36
            java.lang.Class<?> r3 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.ExtensionClassHolder.INSTANCE     // Catch: java.lang.Exception -> L36
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L36
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L36
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L36
            r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L36
            goto L47
        L36:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Could not invoke ExtensionRegistry#add for %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = java.lang.String.format(r2, r6)
            r1.<init>(r6, r0)
            throw r1
        L47:
            return
    }

    public final void add(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r5) {
            r4 = this;
            java.util.Map<com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension<?, ?>> r0 = r4.extensionsByNumber
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair r1 = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r5.getContainingTypeDefaultInstance()
            int r3 = r5.getNumber()
            r1.<init>(r2, r3)
            r0.put(r1, r5)
            return
    }

    public <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType r3, int r4) {
            r2 = this;
            java.util.Map<com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension<?, ?>> r0 = r2.extensionsByNumber
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair r1 = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite$ObjectIntPair
            r1.<init>(r3, r4)
            java.lang.Object r3 = r0.get(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r3
            return r3
    }

    public com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite getUnmodifiable() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite
            r0.<init>(r1)
            return r0
    }
}
