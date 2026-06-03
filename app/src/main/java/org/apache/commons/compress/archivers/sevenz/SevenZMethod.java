package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
public enum SevenZMethod extends java.lang.Enum<org.apache.commons.compress.archivers.sevenz.SevenZMethod> {
    private static final /* synthetic */ org.apache.commons.compress.archivers.sevenz.SevenZMethod[] $VALUES = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod AES256SHA256 = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod BCJ_ARM_FILTER = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod BCJ_ARM_THUMB_FILTER = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod BCJ_IA64_FILTER = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod BCJ_PPC_FILTER = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod BCJ_SPARC_FILTER = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod BCJ_X86_FILTER = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod BZIP2 = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod COPY = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod DEFLATE = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod DEFLATE64 = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod DELTA_FILTER = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod LZMA = null;
    public static final org.apache.commons.compress.archivers.sevenz.SevenZMethod LZMA2 = null;
    private final byte[] id;

    private static /* synthetic */ org.apache.commons.compress.archivers.sevenz.SevenZMethod[] $values() {
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r2 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r5 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r7 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_X86_FILTER
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r8 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r9 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_IA64_FILTER
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r10 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r11 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r12 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_SPARC_FILTER
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r13 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER
            org.apache.commons.compress.archivers.sevenz.SevenZMethod[] r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            return r0
    }

    static {
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            r1 = 1
            byte[] r2 = new byte[r1]
            r3 = 0
            r2[r3] = r3
            java.lang.String r4 = "COPY"
            r0.<init>(r4, r3, r2)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            r2 = 3
            byte[] r4 = new byte[r2]
            r4 = {x00de: FILL_ARRAY_DATA , data: [3, 1, 1} // fill-array
            java.lang.String r5 = "LZMA"
            r0.<init>(r5, r1, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r1]
            r5 = 33
            r4[r3] = r5
            java.lang.String r5 = "LZMA2"
            r6 = 2
            r0.<init>(r5, r6, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2 = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r2]
            r4 = {x00e4: FILL_ARRAY_DATA , data: [4, 1, 8} // fill-array
            java.lang.String r5 = "DEFLATE"
            r0.<init>(r5, r2, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r2]
            r4 = {x00ea: FILL_ARRAY_DATA , data: [4, 1, 9} // fill-array
            java.lang.String r5 = "DEFLATE64"
            r6 = 4
            r0.<init>(r5, r6, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r2]
            r4 = {x00f0: FILL_ARRAY_DATA , data: [4, 2, 2} // fill-array
            java.lang.String r5 = "BZIP2"
            r7 = 5
            r0.<init>(r5, r7, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2 = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r6]
            r4 = {x00f6: FILL_ARRAY_DATA , data: [6, -15, 7, 1} // fill-array
            java.lang.String r5 = "AES256SHA256"
            r7 = 6
            r0.<init>(r5, r7, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256 = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r6]
            r4 = {x00fc: FILL_ARRAY_DATA , data: [3, 3, 1, 3} // fill-array
            java.lang.String r5 = "BCJ_X86_FILTER"
            r7 = 7
            r0.<init>(r5, r7, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_X86_FILTER = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r6]
            r4 = {x0102: FILL_ARRAY_DATA , data: [3, 3, 2, 5} // fill-array
            java.lang.String r5 = "BCJ_PPC_FILTER"
            r7 = 8
            r0.<init>(r5, r7, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r6]
            r4 = {x0108: FILL_ARRAY_DATA , data: [3, 3, 4, 1} // fill-array
            java.lang.String r5 = "BCJ_IA64_FILTER"
            r7 = 9
            r0.<init>(r5, r7, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_IA64_FILTER = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r6]
            r4 = {x010e: FILL_ARRAY_DATA , data: [3, 3, 5, 1} // fill-array
            java.lang.String r5 = "BCJ_ARM_FILTER"
            r7 = 10
            r0.<init>(r5, r7, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r6]
            r4 = {x0114: FILL_ARRAY_DATA , data: [3, 3, 7, 1} // fill-array
            java.lang.String r5 = "BCJ_ARM_THUMB_FILTER"
            r7 = 11
            r0.<init>(r5, r7, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r4 = new byte[r6]
            r4 = {x011a: FILL_ARRAY_DATA , data: [3, 3, 8, 5} // fill-array
            java.lang.String r5 = "BCJ_SPARC_FILTER"
            r6 = 12
            r0.<init>(r5, r6, r4)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_SPARC_FILTER = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethod
            byte[] r1 = new byte[r1]
            r1[r3] = r2
            java.lang.String r2 = "DELTA_FILTER"
            r3 = 13
            r0.<init>(r2, r3, r1)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethod[] r0 = $values()
            org.apache.commons.compress.archivers.sevenz.SevenZMethod.$VALUES = r0
            return
    }

    SevenZMethod(java.lang.String r1, int r2, byte[] r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.id = r3
            return
    }

    static org.apache.commons.compress.archivers.sevenz.SevenZMethod byId(byte[] r5) {
            java.lang.Class<org.apache.commons.compress.archivers.sevenz.SevenZMethod> r0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.class
            java.lang.Object[] r0 = r0.getEnumConstants()
            org.apache.commons.compress.archivers.sevenz.SevenZMethod[] r0 = (org.apache.commons.compress.archivers.sevenz.SevenZMethod[]) r0
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1a
            r3 = r0[r2]
            byte[] r4 = r3.id
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L17
            return r3
        L17:
            int r2 = r2 + 1
            goto La
        L1a:
            r5 = 0
            return r5
    }

    public static org.apache.commons.compress.archivers.sevenz.SevenZMethod valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.compress.archivers.sevenz.SevenZMethod> r0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r1 = (org.apache.commons.compress.archivers.sevenz.SevenZMethod) r1
            return r1
    }

    public static org.apache.commons.compress.archivers.sevenz.SevenZMethod[] values() {
            org.apache.commons.compress.archivers.sevenz.SevenZMethod[] r0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.compress.archivers.sevenz.SevenZMethod[] r0 = (org.apache.commons.compress.archivers.sevenz.SevenZMethod[]) r0
            return r0
    }

    byte[] getId() {
            r2 = this;
            byte[] r0 = r2.id
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }
}
