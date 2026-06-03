package org.apache.commons.io.file.spi;

/* JADX INFO: loaded from: classes2.dex */
public class FileSystemProviders {
    private static final org.apache.commons.io.file.spi.FileSystemProviders INSTALLED = null;
    private final java.util.List<java.nio.file.spi.FileSystemProvider> providers;

    static {
            org.apache.commons.io.file.spi.FileSystemProviders r0 = new org.apache.commons.io.file.spi.FileSystemProviders
            java.util.List r1 = java.nio.file.spi.FileSystemProvider.installedProviders()
            r0.<init>(r1)
            org.apache.commons.io.file.spi.FileSystemProviders.INSTALLED = r0
            return
    }

    private FileSystemProviders(java.util.List<java.nio.file.spi.FileSystemProvider> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L6
            goto La
        L6:
            java.util.List r1 = java.util.Collections.emptyList()
        La:
            r0.providers = r1
            return
    }

    public static java.nio.file.spi.FileSystemProvider getFileSystemProvider(java.nio.file.Path r1) {
            java.lang.String r0 = "path"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileSystem r1 = r1.getFileSystem()
            java.nio.file.spi.FileSystemProvider r1 = r1.provider()
            return r1
    }

    public static org.apache.commons.io.file.spi.FileSystemProviders installed() {
            org.apache.commons.io.file.spi.FileSystemProviders r0 = org.apache.commons.io.file.spi.FileSystemProviders.INSTALLED
            return r0
    }

    static /* synthetic */ boolean lambda$getFileSystemProvider$0(java.lang.String r0, java.nio.file.spi.FileSystemProvider r1) {
            java.lang.String r1 = r1.getScheme()
            boolean r0 = r1.equalsIgnoreCase(r0)
            return r0
    }

    public java.nio.file.spi.FileSystemProvider getFileSystemProvider(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "scheme"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "file"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L16
            java.nio.file.FileSystem r3 = java.nio.file.FileSystems.getDefault()
            java.nio.file.spi.FileSystemProvider r3 = r3.provider()
            return r3
        L16:
            java.util.List<java.nio.file.spi.FileSystemProvider> r0 = r2.providers
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.file.spi.FileSystemProviders$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.file.spi.FileSystemProviders$$ExternalSyntheticLambda0
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.filter(r1)
            java.util.Optional r3 = r3.findFirst()
            r0 = 0
            java.lang.Object r3 = r3.orElse(r0)
            java.nio.file.spi.FileSystemProvider r3 = (java.nio.file.spi.FileSystemProvider) r3
            return r3
    }

    public java.nio.file.spi.FileSystemProvider getFileSystemProvider(java.net.URI r2) {
            r1 = this;
            java.lang.String r0 = "uri"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.net.URI r2 = (java.net.URI) r2
            java.lang.String r2 = r2.getScheme()
            java.nio.file.spi.FileSystemProvider r2 = r1.getFileSystemProvider(r2)
            return r2
    }

    public java.nio.file.spi.FileSystemProvider getFileSystemProvider(java.net.URL r2) {
            r1 = this;
            java.lang.String r0 = "url"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.net.URL r2 = (java.net.URL) r2
            java.lang.String r2 = r2.getProtocol()
            java.nio.file.spi.FileSystemProvider r2 = r1.getFileSystemProvider(r2)
            return r2
    }
}
