package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
final class ByteBufferCleaner {
    private static final org.apache.commons.io.input.ByteBufferCleaner.Cleaner INSTANCE = null;

    /* JADX INFO: renamed from: org.apache.commons.io.input.ByteBufferCleaner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private interface Cleaner {
        void clean(java.nio.ByteBuffer r1) throws java.lang.ReflectiveOperationException;
    }

    private static final class Java8Cleaner implements org.apache.commons.io.input.ByteBufferCleaner.Cleaner {
        private final java.lang.reflect.Method cleanMethod;
        private final java.lang.reflect.Method cleanerMethod;

        private Java8Cleaner() throws java.lang.ReflectiveOperationException, java.lang.SecurityException {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = "sun.misc.Cleaner"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                r1 = 0
                java.lang.Class[] r2 = new java.lang.Class[r1]
                java.lang.String r3 = "clean"
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                r4.cleanMethod = r0
                java.lang.String r0 = "sun.nio.ch.DirectBuffer"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                java.lang.String r2 = "cleaner"
                java.lang.Class[] r1 = new java.lang.Class[r1]
                java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
                r4.cleanerMethod = r0
                return
        }

        /* synthetic */ Java8Cleaner(org.apache.commons.io.input.ByteBufferCleaner.AnonymousClass1 r1) throws java.lang.ReflectiveOperationException, java.lang.SecurityException {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.input.ByteBufferCleaner.Cleaner
        public void clean(java.nio.ByteBuffer r4) throws java.lang.ReflectiveOperationException {
                r3 = this;
                java.lang.reflect.Method r0 = r3.cleanerMethod
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Object r4 = r0.invoke(r4, r2)
                if (r4 == 0) goto L12
                java.lang.reflect.Method r0 = r3.cleanMethod
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r0.invoke(r4, r1)
            L12:
                return
        }
    }

    private static final class Java9Cleaner implements org.apache.commons.io.input.ByteBufferCleaner.Cleaner {
        private final java.lang.reflect.Method invokeCleaner;
        private final java.lang.Object theUnsafe;

        private Java9Cleaner() throws java.lang.ReflectiveOperationException, java.lang.SecurityException {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = "sun.misc.Unsafe"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                java.lang.String r1 = "theUnsafe"
                java.lang.reflect.Field r1 = r0.getDeclaredField(r1)
                r2 = 1
                r1.setAccessible(r2)
                r3 = 0
                java.lang.Object r1 = r1.get(r3)
                r4.theUnsafe = r1
                java.lang.Class[] r1 = new java.lang.Class[r2]
                r2 = 0
                java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
                r1[r2] = r3
                java.lang.String r2 = "invokeCleaner"
                java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
                r4.invokeCleaner = r0
                return
        }

        /* synthetic */ Java9Cleaner(org.apache.commons.io.input.ByteBufferCleaner.AnonymousClass1 r1) throws java.lang.ReflectiveOperationException, java.lang.SecurityException {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.input.ByteBufferCleaner.Cleaner
        public void clean(java.nio.ByteBuffer r3) throws java.lang.ReflectiveOperationException {
                r2 = this;
                java.lang.reflect.Method r0 = r2.invokeCleaner
                java.lang.Object r1 = r2.theUnsafe
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                r0.invoke(r1, r3)
                return
        }
    }

    static {
            org.apache.commons.io.input.ByteBufferCleaner$Cleaner r0 = getCleaner()
            org.apache.commons.io.input.ByteBufferCleaner.INSTANCE = r0
            return
    }

    ByteBufferCleaner() {
            r0 = this;
            r0.<init>()
            return
    }

    static void clean(java.nio.ByteBuffer r2) {
            org.apache.commons.io.input.ByteBufferCleaner$Cleaner r0 = org.apache.commons.io.input.ByteBufferCleaner.INSTANCE     // Catch: java.lang.Exception -> L6
            r0.clean(r2)     // Catch: java.lang.Exception -> L6
            return
        L6:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to clean direct buffer."
            r0.<init>(r1, r2)
            throw r0
    }

    private static org.apache.commons.io.input.ByteBufferCleaner.Cleaner getCleaner() {
            r0 = 0
            org.apache.commons.io.input.ByteBufferCleaner$Java8Cleaner r1 = new org.apache.commons.io.input.ByteBufferCleaner$Java8Cleaner     // Catch: java.lang.Exception -> L7
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7
            return r1
        L7:
            r1 = move-exception
            org.apache.commons.io.input.ByteBufferCleaner$Java9Cleaner r2 = new org.apache.commons.io.input.ByteBufferCleaner$Java9Cleaner     // Catch: java.lang.Exception -> Le
            r2.<init>(r0)     // Catch: java.lang.Exception -> Le
            return r2
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to initialize a Cleaner."
            r0.<init>(r2, r1)
            throw r0
    }

    static boolean isSupported() {
            org.apache.commons.io.input.ByteBufferCleaner$Cleaner r0 = org.apache.commons.io.input.ByteBufferCleaner.INSTANCE
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
