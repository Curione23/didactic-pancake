package org.apache.commons.compress.java.util.jar;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Pack200 {
    private static final java.lang.String SYSTEM_PROPERTY_PACKER = "java.util.jar.Pack200.Packer";
    private static final java.lang.String SYSTEM_PROPERTY_UNPACKER = "java.util.jar.Pack200.Unpacker";

    public interface Packer {
        public static final java.lang.String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
        public static final java.lang.String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
        public static final java.lang.String DEFLATE_HINT = "pack.deflate.hint";
        public static final java.lang.String EFFORT = "pack.effort";
        public static final java.lang.String ERROR = "error";
        public static final java.lang.String FALSE = "false";
        public static final java.lang.String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
        public static final java.lang.String KEEP = "keep";
        public static final java.lang.String KEEP_FILE_ORDER = "pack.keep.file.order";
        public static final java.lang.String LATEST = "latest";
        public static final java.lang.String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
        public static final java.lang.String MODIFICATION_TIME = "pack.modification.time";
        public static final java.lang.String PASS = "pass";
        public static final java.lang.String PASS_FILE_PFX = "pack.pass.file.";
        public static final java.lang.String PROGRESS = "pack.progress";
        public static final java.lang.String SEGMENT_LIMIT = "pack.segment.limit";
        public static final java.lang.String STRIP = "strip";
        public static final java.lang.String TRUE = "true";
        public static final java.lang.String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";

        void addPropertyChangeListener(java.beans.PropertyChangeListener r1);

        void pack(java.util.jar.JarFile r1, java.io.OutputStream r2) throws java.io.IOException;

        void pack(java.util.jar.JarInputStream r1, java.io.OutputStream r2) throws java.io.IOException;

        java.util.SortedMap<java.lang.String, java.lang.String> properties();

        void removePropertyChangeListener(java.beans.PropertyChangeListener r1);
    }

    public interface Unpacker {
        public static final java.lang.String DEFLATE_HINT = "unpack.deflate.hint";
        public static final java.lang.String FALSE = "false";
        public static final java.lang.String KEEP = "keep";
        public static final java.lang.String PROGRESS = "unpack.progress";
        public static final java.lang.String TRUE = "true";

        void addPropertyChangeListener(java.beans.PropertyChangeListener r1);

        java.util.SortedMap<java.lang.String, java.lang.String> properties();

        void removePropertyChangeListener(java.beans.PropertyChangeListener r1);

        void unpack(java.io.File r1, java.util.jar.JarOutputStream r2) throws java.io.IOException;

        void unpack(java.io.InputStream r1, java.util.jar.JarOutputStream r2) throws java.io.IOException;
    }

    private Pack200() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.Object lambda$newInstance$0(java.lang.String r2, java.lang.String r3) {
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            java.lang.Class<org.apache.commons.compress.java.util.jar.Pack200> r3 = org.apache.commons.compress.java.util.jar.Pack200.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L2a
            if (r3 != 0) goto L18
            java.lang.ClassLoader r3 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = "ClassLoader.getSystemClassLoader()"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r0)     // Catch: java.lang.Exception -> L2a
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3     // Catch: java.lang.Exception -> L2a
        L18:
            java.lang.Class r3 = r3.loadClass(r2)     // Catch: java.lang.Exception -> L2a
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Constructor r3 = r3.getConstructor(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2a
            java.lang.Object r2 = r3.newInstance(r0)     // Catch: java.lang.Exception -> L2a
            return r2
        L2a:
            r3 = move-exception
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "archive.3E"
            java.lang.String r2 = org.apache.commons.compress.harmony.archive.internal.nls.Messages.getString(r1, r2)
            r0.<init>(r2, r3)
            throw r0
    }

    static java.lang.Object newInstance(java.lang.String r1, java.lang.String r2) {
            org.apache.commons.compress.java.util.jar.Pack200$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.java.util.jar.Pack200$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            return r1
    }

    public static org.apache.commons.compress.java.util.jar.Pack200.Packer newPacker() {
            java.lang.String r0 = "java.util.jar.Pack200.Packer"
            java.lang.String r1 = "org.apache.commons.compress.harmony.pack200.Pack200PackerAdapter"
            java.lang.Object r0 = newInstance(r0, r1)
            org.apache.commons.compress.java.util.jar.Pack200$Packer r0 = (org.apache.commons.compress.java.util.jar.Pack200.Packer) r0
            return r0
    }

    public static org.apache.commons.compress.java.util.jar.Pack200.Unpacker newUnpacker() {
            java.lang.String r0 = "java.util.jar.Pack200.Unpacker"
            java.lang.String r1 = "org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter"
            java.lang.Object r0 = newInstance(r0, r1)
            org.apache.commons.compress.java.util.jar.Pack200$Unpacker r0 = (org.apache.commons.compress.java.util.jar.Pack200.Unpacker) r0
            return r0
    }
}
