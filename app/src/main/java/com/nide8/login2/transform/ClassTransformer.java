package com.nide8.login2.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/transform/ClassTransformer.class */
public class ClassTransformer implements java.lang.instrument.ClassFileTransformer {
    public java.util.List<com.nide8.login2.transform.TransformUnit> units;
    public java.util.Set<java.lang.String> ignores;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/transform/ClassTransformer$TransformHandle.class */
    private static class TransformHandle {
        private boolean modified;
        private boolean currentModified;
        private java.lang.String className;
        private byte[] classBuffer;
        private com.nide8.login2.internal.org.objectweb.asm.ClassWriter pooledClassWriter;

        public TransformHandle(java.lang.String r4, byte[] r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.modified = r1
                r0 = r3
                r1 = r4
                r0.className = r1
                r0 = r3
                r1 = r5
                r0.classBuffer = r1
                return
        }

        public void accept(com.nide8.login2.transform.TransformUnit r7) {
                r6 = this;
                r0 = r6
                com.nide8.login2.internal.org.objectweb.asm.ClassWriter r0 = r0.pooledClassWriter
                if (r0 != 0) goto L13
                com.nide8.login2.internal.org.objectweb.asm.ClassWriter r0 = new com.nide8.login2.internal.org.objectweb.asm.ClassWriter
                r1 = r0
                r2 = 1
                r1.<init>(r2)
                r8 = r0
                goto L1d
            L13:
                r0 = r6
                com.nide8.login2.internal.org.objectweb.asm.ClassWriter r0 = r0.pooledClassWriter
                r8 = r0
                r0 = r6
                r1 = 0
                r0.pooledClassWriter = r1
            L1d:
                r0 = r7
                r1 = r6
                java.lang.String r1 = r1.className
                r2 = r8
                r3 = r6
                void r3 = () -> { // java.lang.Runnable.run():void
                    r3.lambda$accept$0();
                }
                java.util.Optional r0 = r0.transform(r1, r2, r3)
                r9 = r0
                r0 = r9
                boolean r0 = r0.isPresent()
                if (r0 == 0) goto L80
                r0 = r6
                r1 = 0
                r0.currentModified = r1
                com.nide8.login2.internal.org.objectweb.asm.ClassReader r0 = new com.nide8.login2.internal.org.objectweb.asm.ClassReader
                r1 = r0
                r2 = r6
                byte[] r2 = r2.classBuffer
                r1.<init>(r2)
                r10 = r0
                r0 = r10
                r1 = r9
                java.lang.Object r1 = r1.get()
                com.nide8.login2.internal.org.objectweb.asm.ClassVisitor r1 = (com.nide8.login2.internal.org.objectweb.asm.ClassVisitor) r1
                r2 = 0
                r0.accept(r1, r2)
                r0 = r6
                boolean r0 = r0.currentModified
                if (r0 == 0) goto L7d
                java.lang.String r0 = "已转换类 {0} 为 {1}"
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                java.lang.String r4 = r4.className
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                com.nide8.login2.util.Logging.info(r0, r1)
                r0 = r6
                r1 = 1
                r0.modified = r1
                r0 = r6
                r1 = r8
                byte[] r1 = r1.toByteArray()
                r0.classBuffer = r1
            L7d:
                goto L85
            L80:
                r0 = r6
                r1 = r8
                r0.pooledClassWriter = r1
            L85:
                return
        }

        public java.util.Optional<byte[]> getResult() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.modified
                if (r0 == 0) goto Lf
                r0 = r2
                byte[] r0 = r0.classBuffer
                java.util.Optional r0 = java.util.Optional.of(r0)
                return r0
            Lf:
                java.util.Optional r0 = java.util.Optional.empty()
                return r0
        }

        private /* synthetic */ void lambda$accept$0() {
                r3 = this;
                r0 = r3
                r1 = 1
                r0.currentModified = r1
                return
        }
    }

    public ClassTransformer() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.units = r1
            r0 = r4
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.ignores = r1
            return
    }

    public byte[] transform(java.lang.ClassLoader r7, java.lang.String r8, java.lang.Class<?> r9, java.security.ProtectionDomain r10, byte[] r11) throws java.lang.instrument.IllegalClassFormatException {
            r6 = this;
            r0 = r8
            if (r0 == 0) goto La9
            r0 = r11
            if (r0 == 0) goto La9
            r0 = r8
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L90
            r12 = r0
            r0 = r6
            java.util.Set<java.lang.String> r0 = r0.ignores     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L90
            r13 = r0
        L1e:
            r0 = r13
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L43
            r0 = r13
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L90
            r14 = r0
            r0 = r12
            r1 = r14
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L40
            r0 = 0
            return r0
        L40:
            goto L1e
        L43:
            com.nide8.login2.transform.ClassTransformer$TransformHandle r0 = new com.nide8.login2.transform.ClassTransformer$TransformHandle     // Catch: java.lang.Throwable -> L90
            r1 = r0
            r2 = r12
            r3 = r11
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L90
            r13 = r0
            r0 = r6
            java.util.List<com.nide8.login2.transform.TransformUnit> r0 = r0.units     // Catch: java.lang.Throwable -> L90
            r1 = r13
            r2 = r1
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L90
            byte[] r1 = r1::accept     // Catch: java.lang.Throwable -> L90
            r0.forEach(r1)     // Catch: java.lang.Throwable -> L90
            r0 = r13
            java.util.Optional r0 = r0.getResult()     // Catch: java.lang.Throwable -> L90
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L80
            r0 = r13
            java.util.Optional r0 = r0.getResult()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L90
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L90
            r14 = r0
            r0 = r14
            return r0
        L80:
            java.lang.String r0 = "{0} 无需转换"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L90
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4     // Catch: java.lang.Throwable -> L90
            com.nide8.login2.util.Logging.debug(r0, r1)     // Catch: java.lang.Throwable -> L90
            r0 = 0
            return r0
        L90:
            r12 = move-exception
            java.lang.String r0 = "无法转换 {0}: {1}"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r12
            r2[r3] = r4
            com.nide8.login2.util.Logging.error(r0, r1)
            r0 = r12
            r0.printStackTrace()
        La9:
            r0 = 0
            return r0
    }
}
