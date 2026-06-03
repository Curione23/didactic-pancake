package org.apache.commons.compress.compressors.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class Pack200Utils {
    private Pack200Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void normalize(java.io.File r1) throws java.io.IOException {
            r0 = 0
            normalize(r1, r1, r0)
            return
    }

    public static void normalize(java.io.File r1, java.io.File r2) throws java.io.IOException {
            r0 = 0
            normalize(r1, r2, r0)
            return
    }

    public static void normalize(java.io.File r5, java.io.File r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.io.IOException {
            if (r7 != 0) goto L7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
        L7:
            java.lang.String r0 = "pack.segment.limit"
            java.lang.String r1 = "-1"
            r7.put(r0, r1)
            java.lang.String r0 = "pack200normalize"
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r2 = new java.nio.file.attribute.FileAttribute[r1]
            java.lang.String r3 = "commons-compress"
            java.nio.file.Path r0 = java.nio.file.Files.createTempFile(r3, r0, r2)
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]     // Catch: java.lang.Throwable -> L7b
            java.io.OutputStream r2 = java.nio.file.Files.newOutputStream(r0, r2)     // Catch: java.lang.Throwable -> L7b
            java.util.jar.JarFile r3 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            org.apache.commons.compress.java.util.jar.Pack200$Packer r5 = org.apache.commons.compress.java.util.jar.Pack200.newPacker()     // Catch: java.lang.Throwable -> L65
            java.util.SortedMap r4 = r5.properties()     // Catch: java.lang.Throwable -> L65
            r4.putAll(r7)     // Catch: java.lang.Throwable -> L65
            r5.pack(r3, r2)     // Catch: java.lang.Throwable -> L65
            r3.close()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L3a
            r2.close()     // Catch: java.lang.Throwable -> L7b
        L3a:
            org.apache.commons.compress.java.util.jar.Pack200$Unpacker r5 = org.apache.commons.compress.java.util.jar.Pack200.newUnpacker()     // Catch: java.lang.Throwable -> L7b
            java.util.jar.JarOutputStream r7 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> L7b
            java.nio.file.Path r6 = r6.toPath()     // Catch: java.lang.Throwable -> L7b
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.lang.Throwable -> L7b
            java.io.OutputStream r6 = java.nio.file.Files.newOutputStream(r6, r1)     // Catch: java.lang.Throwable -> L7b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7b
            java.io.File r6 = r0.toFile()     // Catch: java.lang.Throwable -> L5b
            r5.unpack(r6, r7)     // Catch: java.lang.Throwable -> L5b
            r7.close()     // Catch: java.lang.Throwable -> L7b
            java.nio.file.Files.delete(r0)
            return
        L5b:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L60
            goto L64
        L60:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L7b
        L64:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L65:
            r5 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L6f
        L6e:
            throw r5     // Catch: java.lang.Throwable -> L6f
        L6f:
            r5 = move-exception
            if (r2 == 0) goto L7a
            r2.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L7b
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r5 = move-exception
            java.nio.file.Files.delete(r0)
            throw r5
    }

    public static void normalize(java.io.File r0, java.util.Map<java.lang.String, java.lang.String> r1) throws java.io.IOException {
            normalize(r0, r0, r1)
            return
    }
}
