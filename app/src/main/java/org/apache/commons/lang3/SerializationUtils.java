package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class SerializationUtils {

    static final class ClassLoaderAwareObjectInputStream extends java.io.ObjectInputStream {
        private final java.lang.ClassLoader classLoader;

        ClassLoaderAwareObjectInputStream(java.io.InputStream r1, java.lang.ClassLoader r2) throws java.io.IOException {
                r0 = this;
                r0.<init>(r1)
                r0.classLoader = r2
                return
        }

        @Override // java.io.ObjectInputStream
        protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass r3) throws java.io.IOException, java.lang.ClassNotFoundException {
                r2 = this;
                java.lang.String r3 = r3.getName()
                r0 = 0
                java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.ClassNotFoundException -> Lc
                java.lang.Class r3 = java.lang.Class.forName(r3, r0, r1)     // Catch: java.lang.ClassNotFoundException -> Lc
                return r3
            Lc:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.ClassLoader r1 = r1.getContextClassLoader()     // Catch: java.lang.ClassNotFoundException -> L19
                java.lang.Class r3 = java.lang.Class.forName(r3, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L19
                return r3
            L19:
                r0 = move-exception
                java.lang.Class r3 = org.apache.commons.lang3.ClassUtils.getPrimitiveClass(r3)
                if (r3 == 0) goto L21
                return r3
            L21:
                throw r0
        }
    }

    @java.lang.Deprecated
    public SerializationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends java.io.Serializable> T clone(T r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            byte[] r0 = serialize(r3)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            java.lang.Class r3 = org.apache.commons.lang3.ObjectUtils.getClass(r3)
            org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream r0 = new org.apache.commons.lang3.SerializationUtils$ClassLoaderAwareObjectInputStream     // Catch: java.io.IOException -> L32 java.lang.ClassNotFoundException -> L34
            java.lang.ClassLoader r2 = r3.getClassLoader()     // Catch: java.io.IOException -> L32 java.lang.ClassNotFoundException -> L34
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L32 java.lang.ClassNotFoundException -> L34
            java.lang.Object r1 = r0.readObject()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = r3.cast(r1)     // Catch: java.lang.Throwable -> L28
            java.io.Serializable r3 = (java.io.Serializable) r3     // Catch: java.lang.Throwable -> L28
            r0.close()     // Catch: java.io.IOException -> L32 java.lang.ClassNotFoundException -> L34
            return r3
        L28:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.io.IOException -> L32 java.lang.ClassNotFoundException -> L34
        L31:
            throw r3     // Catch: java.io.IOException -> L32 java.lang.ClassNotFoundException -> L34
        L32:
            r3 = move-exception
            goto L35
        L34:
            r3 = move-exception
        L35:
            org.apache.commons.lang3.SerializationException r0 = new org.apache.commons.lang3.SerializationException
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%s while reading cloned object data"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r3)
            throw r0
    }

    public static <T> T deserialize(java.io.InputStream r1) {
            java.lang.String r0 = "inputStream"
            java.util.Objects.requireNonNull(r1, r0)
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.NegativeArraySizeException -> L1c java.io.IOException -> L1e java.lang.ClassNotFoundException -> L20
            r0.<init>(r1)     // Catch: java.lang.NegativeArraySizeException -> L1c java.io.IOException -> L1e java.lang.ClassNotFoundException -> L20
            java.lang.Object r1 = r0.readObject()     // Catch: java.lang.Throwable -> L12
            r0.close()     // Catch: java.lang.NegativeArraySizeException -> L1c java.io.IOException -> L1e java.lang.ClassNotFoundException -> L20
            return r1
        L12:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.NegativeArraySizeException -> L1c java.io.IOException -> L1e java.lang.ClassNotFoundException -> L20
        L1b:
            throw r1     // Catch: java.lang.NegativeArraySizeException -> L1c java.io.IOException -> L1e java.lang.ClassNotFoundException -> L20
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = move-exception
            goto L21
        L20:
            r1 = move-exception
        L21:
            org.apache.commons.lang3.SerializationException r0 = new org.apache.commons.lang3.SerializationException
            r0.<init>(r1)
            throw r0
    }

    public static <T> T deserialize(byte[] r1) {
            java.lang.String r0 = "objectData"
            java.util.Objects.requireNonNull(r1, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            java.lang.Object r1 = deserialize(r0)
            return r1
    }

    public static <T extends java.io.Serializable> T roundtrip(T r0) {
            byte[] r0 = serialize(r0)
            java.lang.Object r0 = deserialize(r0)
            java.io.Serializable r0 = (java.io.Serializable) r0
            return r0
    }

    public static void serialize(java.io.Serializable r1, java.io.OutputStream r2) {
            java.lang.String r0 = "outputStream"
            java.util.Objects.requireNonNull(r2, r0)
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L1b
            r0.<init>(r2)     // Catch: java.io.IOException -> L1b
            r0.writeObject(r1)     // Catch: java.lang.Throwable -> L11
            r0.close()     // Catch: java.io.IOException -> L1b
            return
        L11:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.io.IOException -> L1b
        L1a:
            throw r1     // Catch: java.io.IOException -> L1b
        L1b:
            r1 = move-exception
            org.apache.commons.lang3.SerializationException r2 = new org.apache.commons.lang3.SerializationException
            r2.<init>(r1)
            throw r2
    }

    public static byte[] serialize(java.io.Serializable r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            serialize(r2, r0)
            byte[] r2 = r0.toByteArray()
            return r2
    }
}
