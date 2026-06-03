package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class Pack200UnpackerAdapter extends org.apache.commons.compress.harmony.pack200.Pack200Adapter implements org.apache.commons.compress.java.util.jar.Pack200.Unpacker {
    public Pack200UnpackerAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    static org.apache.commons.io.input.BoundedInputStream newBoundedInputStream(java.io.File r0) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            org.apache.commons.io.input.BoundedInputStream r0 = newBoundedInputStream(r0)
            return r0
    }

    private static org.apache.commons.io.input.BoundedInputStream newBoundedInputStream(java.io.FileInputStream r1) throws java.io.IOException {
            java.lang.String r1 = readPathString(r1)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            org.apache.commons.io.input.BoundedInputStream r1 = newBoundedInputStream(r1, r0)
            return r1
    }

    static org.apache.commons.io.input.BoundedInputStream newBoundedInputStream(java.io.InputStream r1) throws java.io.IOException {
            boolean r0 = r1 instanceof org.apache.commons.io.input.BoundedInputStream
            if (r0 == 0) goto L7
            org.apache.commons.io.input.BoundedInputStream r1 = (org.apache.commons.io.input.BoundedInputStream) r1
            return r1
        L7:
            boolean r0 = r1 instanceof org.apache.commons.io.input.CloseShieldInputStream
            if (r0 == 0) goto L1e
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setInputStream(r1)
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = (org.apache.commons.io.input.BoundedInputStream.Builder) r1
            org.apache.commons.io.input.BoundedInputStream r1 = r1.get()
            org.apache.commons.io.input.BoundedInputStream r1 = newBoundedInputStream(r1)
            return r1
        L1e:
            boolean r0 = r1 instanceof java.io.FilterInputStream
            if (r0 == 0) goto L2d
            java.io.FilterInputStream r1 = (java.io.FilterInputStream) r1
            java.io.InputStream r1 = unwrap(r1)
            org.apache.commons.io.input.BoundedInputStream r1 = newBoundedInputStream(r1)
            return r1
        L2d:
            boolean r0 = r1 instanceof java.io.FileInputStream
            if (r0 == 0) goto L38
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            org.apache.commons.io.input.BoundedInputStream r1 = newBoundedInputStream(r1)
            return r1
        L38:
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r0.setInputStream(r1)
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = (org.apache.commons.io.input.BoundedInputStream.Builder) r1
            org.apache.commons.io.input.BoundedInputStream r1 = r1.get()
            org.apache.commons.io.input.BoundedInputStream r1 = newBoundedInputStream(r1)
            return r1
    }

    static org.apache.commons.io.input.BoundedInputStream newBoundedInputStream(java.lang.String r0, java.lang.String... r1) throws java.io.IOException {
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            org.apache.commons.io.input.BoundedInputStream r0 = newBoundedInputStream(r0)
            return r0
    }

    static org.apache.commons.io.input.BoundedInputStream newBoundedInputStream(java.net.URL r0) throws java.io.IOException, java.net.URISyntaxException {
            java.net.URI r0 = r0.toURI()
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0)
            org.apache.commons.io.input.BoundedInputStream r0 = newBoundedInputStream(r0)
            return r0
    }

    static org.apache.commons.io.input.BoundedInputStream newBoundedInputStream(java.nio.file.Path r5) throws java.io.IOException {
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r2 = 0
            java.nio.file.OpenOption[] r3 = new java.nio.file.OpenOption[r2]
            java.io.InputStream r3 = java.nio.file.Files.newInputStream(r5, r3)
            r1.<init>(r3)
            org.apache.commons.io.build.AbstractOriginSupplier r0 = r0.setInputStream(r1)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            long r3 = java.nio.file.Files.size(r5)
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r5 = r0.setMaxCount(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r5 = (org.apache.commons.io.input.BoundedInputStream.Builder) r5
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r5 = r5.setPropagateClose(r2)
            org.apache.commons.io.input.BoundedInputStream$Builder r5 = (org.apache.commons.io.input.BoundedInputStream.Builder) r5
            org.apache.commons.io.input.BoundedInputStream r5 = r5.get()
            return r5
    }

    private static <T> T readField(java.lang.Object r1, java.lang.String r2) {
            r0 = 1
            java.lang.Object r1 = org.apache.commons.lang3.reflect.FieldUtils.readField(r1, r2, r0)     // Catch: java.lang.IllegalAccessException -> L6
            return r1
        L6:
            r1 = 0
            return r1
    }

    static java.lang.String readPathString(java.io.FileInputStream r1) {
            java.lang.String r0 = "path"
            java.lang.Object r1 = readField(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    static java.io.InputStream unwrap(java.io.FilterInputStream r1) {
            java.lang.String r0 = "in"
            java.lang.Object r1 = readField(r1, r0)
            java.io.InputStream r1 = (java.io.InputStream) r1
            return r1
    }

    static java.io.InputStream unwrap(java.io.InputStream r1) {
            boolean r0 = r1 instanceof java.io.FilterInputStream
            if (r0 == 0) goto La
            java.io.FilterInputStream r1 = (java.io.FilterInputStream) r1
            java.io.InputStream r1 = unwrap(r1)
        La:
            return r1
    }

    @Override // org.apache.commons.compress.java.util.jar.Pack200.Unpacker
    public void unpack(java.io.File r5, java.util.jar.JarOutputStream r6) throws java.io.IOException {
            r4 = this;
            if (r5 == 0) goto L39
            if (r6 == 0) goto L39
            long r0 = r5.length()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L16
            r2 = 8192(0x2000, double:4.0474E-320)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L16
            int r0 = (int) r0
            goto L18
        L16:
            r0 = 8192(0x2000, float:1.148E-41)
        L18:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            java.nio.file.Path r5 = r5.toPath()
            r2 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]
            java.io.InputStream r5 = java.nio.file.Files.newInputStream(r5, r2)
            r1.<init>(r5, r0)
            r4.unpack(r1, r6)     // Catch: java.lang.Throwable -> L2f
            r1.close()
            return
        L2f:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r6 = move-exception
            r5.addSuppressed(r6)
        L38:
            throw r5
        L39:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Must specify both input and output streams"
            r5.<init>(r6)
            throw r5
    }

    @Override // org.apache.commons.compress.java.util.jar.Pack200.Unpacker
    public void unpack(java.io.InputStream r3, java.util.jar.JarOutputStream r4) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L2d
            if (r4 == 0) goto L2d
            r0 = 0
            r2.completed(r0)
            org.apache.commons.compress.harmony.unpack200.Archive r0 = new org.apache.commons.compress.harmony.unpack200.Archive     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L17
            r0.<init>(r3, r4)     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L17
            r0.unpack()     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L17
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.completed(r3)
            return
        L17:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to unpack Jar:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L2d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Must specify both input and output streams"
            r3.<init>(r4)
            throw r3
    }
}
