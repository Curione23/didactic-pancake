package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class ExtensionRegistryFactory {
    static final java.lang.Class<?> EXTENSION_REGISTRY_CLASS = null;
    static final java.lang.String FULL_REGISTRY_CLASS_NAME = "com.google.crypto.tink.shaded.protobuf.ExtensionRegistry";

    static {
            java.lang.Class r0 = reflectExtensionRegistry()
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS = r0
            return
    }

    ExtensionRegistryFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite create() {
            java.lang.String r0 = "newInstance"
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = invokeSubclassFactory(r0)
            if (r0 == 0) goto L9
            goto Le
        L9:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite
            r0.<init>()
        Le:
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite createEmpty() {
            java.lang.String r0 = "getEmptyRegistry"
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = invokeSubclassFactory(r0)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE
        Lb:
            return r0
    }

    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite invokeSubclassFactory(java.lang.String r4) {
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L16
            java.lang.Object r4 = r4.invoke(r1, r0)     // Catch: java.lang.Exception -> L16
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4 = (com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite) r4     // Catch: java.lang.Exception -> L16
            return r4
        L16:
            return r1
    }

    static boolean isFullRegistry(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1) {
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS
            if (r0 == 0) goto L10
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    static java.lang.Class<?> reflectExtensionRegistry() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.ExtensionRegistry"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}
