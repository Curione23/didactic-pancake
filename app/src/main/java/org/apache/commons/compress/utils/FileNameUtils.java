package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class FileNameUtils {
    public FileNameUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static java.lang.String getBaseName(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r1 = org.apache.commons.io.FilenameUtils.removeExtension(r1)
            return r1
    }

    public static java.lang.String getBaseName(java.nio.file.Path r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.nio.file.Path r1 = r1.getFileName()
            if (r1 == 0) goto L12
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = org.apache.commons.io.FilenameUtils.removeExtension(r1)
        L12:
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getExtension(java.lang.String r0) {
            java.lang.String r0 = org.apache.commons.io.FilenameUtils.getExtension(r0)
            return r0
    }

    public static java.lang.String getExtension(java.nio.file.Path r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.nio.file.Path r1 = r1.getFileName()
            if (r1 == 0) goto L12
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = org.apache.commons.io.FilenameUtils.getExtension(r1)
        L12:
            return r0
    }
}
