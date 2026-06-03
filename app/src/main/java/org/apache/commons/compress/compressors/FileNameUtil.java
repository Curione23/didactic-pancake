package org.apache.commons.compress.compressors;

/* JADX INFO: loaded from: classes2.dex */
public class FileNameUtil {
    private final java.util.Map<java.lang.String, java.lang.String> compressSuffix;
    private final java.lang.String defaultExtension;
    private final int longestCompressedSuffix;
    private final int longestUncompressedSuffix;
    private final int shortestCompressedSuffix;
    private final int shortestUncompressedSuffix;
    private final java.util.Map<java.lang.String, java.lang.String> uncompressSuffix;

    public FileNameUtil(java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
            r9 = this;
            r9.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.compressSuffix = r0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r10)
            r9.uncompressSuffix = r0
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r1
            r3 = r2
            r1 = r0
        L20:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 <= r0) goto L39
            r0 = r5
        L39:
            if (r5 >= r2) goto L3c
            r2 = r5
        L3c:
            java.lang.Object r5 = r4.getValue()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.length()
            if (r6 <= 0) goto L20
            java.util.Map<java.lang.String, java.lang.String> r7 = r9.compressSuffix
            org.apache.commons.compress.compressors.FileNameUtil$$ExternalSyntheticLambda0 r8 = new org.apache.commons.compress.compressors.FileNameUtil$$ExternalSyntheticLambda0
            r8.<init>(r4)
            r7.computeIfAbsent(r5, r8)
            if (r6 <= r1) goto L55
            r1 = r6
        L55:
            if (r6 >= r3) goto L20
            r3 = r6
            goto L20
        L59:
            r9.longestCompressedSuffix = r0
            r9.longestUncompressedSuffix = r1
            r9.shortestCompressedSuffix = r2
            r9.shortestUncompressedSuffix = r3
            r9.defaultExtension = r11
            return
    }

    static /* synthetic */ java.lang.String lambda$new$0(java.util.Map.Entry r0, java.lang.String r1) {
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String getCompressedFileName(java.lang.String r7) {
            r6 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r7.toLowerCase(r0)
            int r1 = r0.length()
            int r2 = r6.shortestUncompressedSuffix
        Lc:
            int r3 = r6.longestUncompressedSuffix
            if (r2 > r3) goto L3c
            if (r2 >= r1) goto L3c
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.compressSuffix
            int r4 = r1 - r2
            java.lang.String r5 = r0.substring(r4)
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r7 = r7.substring(r1, r4)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            return r7
        L39:
            int r2 = r2 + 1
            goto Lc
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = r6.defaultExtension
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    @java.lang.Deprecated
    public java.lang.String getCompressedFilename(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.getCompressedFileName(r1)
            return r1
    }

    public java.lang.String getUncompressedFileName(java.lang.String r7) {
            r6 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r7.toLowerCase(r0)
            int r1 = r0.length()
            int r2 = r6.shortestCompressedSuffix
        Lc:
            int r3 = r6.longestCompressedSuffix
            if (r2 > r3) goto L3c
            if (r2 >= r1) goto L3c
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.uncompressSuffix
            int r4 = r1 - r2
            java.lang.String r5 = r0.substring(r4)
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r7 = r7.substring(r1, r4)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            return r7
        L39:
            int r2 = r2 + 1
            goto Lc
        L3c:
            return r7
    }

    @java.lang.Deprecated
    public java.lang.String getUncompressedFilename(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.getUncompressedFileName(r1)
            return r1
    }

    public boolean isCompressedFileName(java.lang.String r5) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            int r0 = r5.length()
            int r1 = r4.shortestCompressedSuffix
        Lc:
            int r2 = r4.longestCompressedSuffix
            if (r1 > r2) goto L25
            if (r1 >= r0) goto L25
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.uncompressSuffix
            int r3 = r0 - r1
            java.lang.String r3 = r5.substring(r3)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L22
            r5 = 1
            return r5
        L22:
            int r1 = r1 + 1
            goto Lc
        L25:
            r5 = 0
            return r5
    }

    @java.lang.Deprecated
    public boolean isCompressedFilename(java.lang.String r1) {
            r0 = this;
            boolean r1 = r0.isCompressedFileName(r1)
            return r1
    }
}
