package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class FileSystemUtils {
    @java.lang.Deprecated
    public FileSystemUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static long freeSpace(java.lang.String r2) throws java.io.IOException {
            long r0 = getFreeSpace(r2)
            return r0
    }

    @java.lang.Deprecated
    public static long freeSpaceKb() throws java.io.IOException {
            r0 = -1
            long r0 = freeSpaceKb(r0)
            return r0
    }

    @java.lang.Deprecated
    public static long freeSpaceKb(long r1) throws java.io.IOException {
            java.io.File r0 = org.apache.commons.io.FileUtils.current()
            java.lang.String r0 = r0.getAbsolutePath()
            long r1 = freeSpaceKb(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static long freeSpaceKb(java.lang.String r2) throws java.io.IOException {
            r0 = -1
            long r0 = freeSpaceKb(r2, r0)
            return r0
    }

    @java.lang.Deprecated
    public static long freeSpaceKb(java.lang.String r2, long r3) throws java.io.IOException {
            long r2 = getFreeSpace(r2)
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r0
            return r2
    }

    static long getFreeSpace(java.lang.String r2) throws java.io.IOException {
            java.lang.String r0 = "pathStr"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.nio.file.Path r2 = java.nio.file.Paths.get(r2, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r0 = java.nio.file.Files.exists(r2, r0)
            if (r0 == 0) goto L24
            java.nio.file.Path r2 = r2.toAbsolutePath()
            java.nio.file.FileStore r2 = java.nio.file.Files.getFileStore(r2)
            long r0 = r2.getUsableSpace()
            return r0
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
