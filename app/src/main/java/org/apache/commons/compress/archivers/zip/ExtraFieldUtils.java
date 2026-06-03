package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ExtraFieldUtils {
    static final org.apache.commons.compress.archivers.zip.ZipExtraField[] EMPTY_ZIP_EXTRA_FIELD_ARRAY = null;
    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.compress.archivers.zip.ZipShort, java.util.function.Supplier<org.apache.commons.compress.archivers.zip.ZipExtraField>> IMPLEMENTATIONS = null;
    private static final int WORD = 4;


    public static final class UnparseableExtraField implements org.apache.commons.compress.archivers.zip.UnparseableExtraFieldBehavior {
        public static final org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField READ = null;
        public static final int READ_KEY = 2;
        public static final org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField SKIP = null;
        public static final int SKIP_KEY = 1;
        public static final org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField THROW = null;
        public static final int THROW_KEY = 0;
        private final int key;

        static {
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r0 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField
                r1 = 0
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW = r0
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r0 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField
                r1 = 1
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP = r0
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r0 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField
                r1 = 2
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ = r0
                return
        }

        private UnparseableExtraField(int r1) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                return
        }

        public int getKey() {
                r1 = this;
                int r0 = r1.key
                return r0
        }

        @Override // org.apache.commons.compress.archivers.zip.UnparseableExtraFieldBehavior
        public org.apache.commons.compress.archivers.zip.ZipExtraField onUnparseableExtraField(byte[] r2, int r3, int r4, boolean r5, int r6) throws java.util.zip.ZipException {
                r1 = this;
                int r0 = r1.key
                if (r0 == 0) goto L32
                r6 = 1
                if (r0 == r6) goto L30
                r6 = 2
                if (r0 != r6) goto L19
                org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r6 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
                r6.<init>()
                if (r5 == 0) goto L15
                r6.parseFromLocalFileData(r2, r3, r4)
                goto L18
            L15:
                r6.parseFromCentralDirectoryData(r2, r3, r4)
            L18:
                return r6
            L19:
                java.util.zip.ZipException r2 = new java.util.zip.ZipException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unknown UnparseableExtraField key: "
                r3.<init>(r4)
                int r4 = r1.key
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L30:
                r2 = 0
                return r2
            L32:
                java.util.zip.ZipException r2 = new java.util.zip.ZipException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r0 = "Bad extra field starting at "
                r5.<init>(r0)
                java.lang.StringBuilder r3 = r5.append(r3)
                java.lang.String r5 = ".  Block length of "
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r5 = " bytes exceeds remaining data of "
                java.lang.StringBuilder r3 = r3.append(r5)
                int r4 = r4 + (-4)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " bytes."
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils.IMPLEMENTATIONS = r0
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.AsiExtraField.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda0 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda0
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda10 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda10
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda11 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda11
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.JarMarker.ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda12 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda12
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda13 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda13
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda14 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda14
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda1 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda1
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X000A_NTFS.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda2 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda2
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X0014_X509Certificates.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda3 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda3
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda4 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda4
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda6 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda6
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda7 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda7
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.HEADER_ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda8 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda8
            r2.<init>()
            r0.put(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda9 r2 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda9
            r2.<init>()
            r0.put(r1, r2)
            r0 = 0
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = new org.apache.commons.compress.archivers.zip.ZipExtraField[r0]
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY = r0
            return
    }

    public ExtraFieldUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.apache.commons.compress.archivers.zip.ZipExtraField createExtraField(org.apache.commons.compress.archivers.zip.ZipShort r1) {
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = createExtraFieldNoDefault(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            org.apache.commons.compress.archivers.zip.UnrecognizedExtraField r0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField
            r0.<init>()
            r0.setHeaderId(r1)
            return r0
    }

    public static org.apache.commons.compress.archivers.zip.ZipExtraField createExtraFieldNoDefault(org.apache.commons.compress.archivers.zip.ZipShort r1) {
            java.util.concurrent.ConcurrentMap<org.apache.commons.compress.archivers.zip.ZipShort, java.util.function.Supplier<org.apache.commons.compress.archivers.zip.ZipExtraField>> r0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.IMPLEMENTATIONS
            java.lang.Object r1 = r0.get(r1)
            java.util.function.Supplier r1 = (java.util.function.Supplier) r1
            if (r1 == 0) goto L11
            java.lang.Object r1 = r1.get()
            org.apache.commons.compress.archivers.zip.ZipExtraField r1 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public static org.apache.commons.compress.archivers.zip.ZipExtraField fillExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField r0, byte[] r1, int r2, int r3, boolean r4) throws java.util.zip.ZipException {
            if (r4 == 0) goto L6
            r0.parseFromLocalFileData(r1, r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La
            goto L9
        L6:
            r0.parseFromCentralDirectoryData(r1, r2, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La
        L9:
            return r0
        La:
            r1 = move-exception
            java.util.zip.ZipException r2 = new java.util.zip.ZipException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse corrupt ZIP extra field of type "
            r3.<init>(r4)
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r0.getHeaderId()
            int r0 = r0.getValue()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            java.lang.Throwable r0 = r2.initCause(r1)
            java.util.zip.ZipException r0 = (java.util.zip.ZipException) r0
            throw r0
    }

    static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipExtraField lambda$register$0(java.lang.reflect.Constructor r1, java.lang.Class r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.ReflectiveOperationException -> La
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.ReflectiveOperationException -> La
            org.apache.commons.compress.archivers.zip.ZipExtraField r1 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r1     // Catch: java.lang.ReflectiveOperationException -> La
            return r1
        La:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
    }

    public static byte[] mergeCentralDirectoryData(org.apache.commons.compress.archivers.zip.ZipExtraField[] r11) {
            int r0 = r11.length
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Lf
            int r3 = r0 + (-1)
            r3 = r11[r3]
            boolean r3 = r3 instanceof org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
            if (r3 == 0) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r2
        L10:
            if (r3 == 0) goto L15
            int r4 = r0 + (-1)
            goto L16
        L15:
            r4 = r0
        L16:
            int r5 = r4 * 4
            int r6 = r11.length
            r7 = r2
        L1a:
            if (r7 >= r6) goto L2a
            r8 = r11[r7]
            org.apache.commons.compress.archivers.zip.ZipShort r8 = r8.getCentralDirectoryLength()
            int r8 = r8.getValue()
            int r5 = r5 + r8
            int r7 = r7 + 1
            goto L1a
        L2a:
            byte[] r5 = new byte[r5]
            r6 = r2
            r7 = r6
        L2e:
            if (r6 >= r4) goto L60
            r8 = r11[r6]
            org.apache.commons.compress.archivers.zip.ZipShort r8 = r8.getHeaderId()
            byte[] r8 = r8.getBytes()
            r9 = 2
            java.lang.System.arraycopy(r8, r2, r5, r7, r9)
            r8 = r11[r6]
            org.apache.commons.compress.archivers.zip.ZipShort r8 = r8.getCentralDirectoryLength()
            byte[] r8 = r8.getBytes()
            int r10 = r7 + 2
            java.lang.System.arraycopy(r8, r2, r5, r10, r9)
            int r7 = r7 + 4
            r8 = r11[r6]
            byte[] r8 = r8.getCentralDirectoryData()
            if (r8 == 0) goto L5d
            int r9 = r8.length
            java.lang.System.arraycopy(r8, r2, r5, r7, r9)
            int r8 = r8.length
            int r7 = r7 + r8
        L5d:
            int r6 = r6 + 1
            goto L2e
        L60:
            if (r3 == 0) goto L6f
            int r0 = r0 - r1
            r11 = r11[r0]
            byte[] r11 = r11.getCentralDirectoryData()
            if (r11 == 0) goto L6f
            int r0 = r11.length
            java.lang.System.arraycopy(r11, r2, r5, r7, r0)
        L6f:
            return r5
    }

    public static byte[] mergeLocalFileDataData(org.apache.commons.compress.archivers.zip.ZipExtraField[] r11) {
            int r0 = r11.length
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Lf
            int r3 = r0 + (-1)
            r3 = r11[r3]
            boolean r3 = r3 instanceof org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
            if (r3 == 0) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r2
        L10:
            if (r3 == 0) goto L15
            int r4 = r0 + (-1)
            goto L16
        L15:
            r4 = r0
        L16:
            int r5 = r4 * 4
            int r6 = r11.length
            r7 = r2
        L1a:
            if (r7 >= r6) goto L2a
            r8 = r11[r7]
            org.apache.commons.compress.archivers.zip.ZipShort r8 = r8.getLocalFileDataLength()
            int r8 = r8.getValue()
            int r5 = r5 + r8
            int r7 = r7 + 1
            goto L1a
        L2a:
            byte[] r5 = new byte[r5]
            r6 = r2
            r7 = r6
        L2e:
            if (r6 >= r4) goto L60
            r8 = r11[r6]
            org.apache.commons.compress.archivers.zip.ZipShort r8 = r8.getHeaderId()
            byte[] r8 = r8.getBytes()
            r9 = 2
            java.lang.System.arraycopy(r8, r2, r5, r7, r9)
            r8 = r11[r6]
            org.apache.commons.compress.archivers.zip.ZipShort r8 = r8.getLocalFileDataLength()
            byte[] r8 = r8.getBytes()
            int r10 = r7 + 2
            java.lang.System.arraycopy(r8, r2, r5, r10, r9)
            int r7 = r7 + 4
            r8 = r11[r6]
            byte[] r8 = r8.getLocalFileDataData()
            if (r8 == 0) goto L5d
            int r9 = r8.length
            java.lang.System.arraycopy(r8, r2, r5, r7, r9)
            int r8 = r8.length
            int r7 = r7 + r8
        L5d:
            int r6 = r6 + 1
            goto L2e
        L60:
            if (r3 == 0) goto L6f
            int r0 = r0 - r1
            r11 = r11[r0]
            byte[] r11 = r11.getLocalFileDataData()
            if (r11 == 0) goto L6f
            int r0 = r11.length
            java.lang.System.arraycopy(r11, r2, r5, r7, r0)
        L6f:
            return r5
    }

    public static org.apache.commons.compress.archivers.zip.ZipExtraField[] parse(byte[] r2) throws java.util.zip.ZipException {
            r0 = 1
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r2 = parse(r2, r0, r1)
            return r2
    }

    public static org.apache.commons.compress.archivers.zip.ZipExtraField[] parse(byte[] r1, boolean r2) throws java.util.zip.ZipException {
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = parse(r1, r2, r0)
            return r1
    }

    public static org.apache.commons.compress.archivers.zip.ZipExtraField[] parse(byte[] r13, boolean r14, org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior r15) throws java.util.zip.ZipException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r13.length
            r2 = 0
            r5 = r2
        L8:
            int r2 = r1 + (-4)
            if (r5 > r2) goto L69
            org.apache.commons.compress.archivers.zip.ZipShort r2 = new org.apache.commons.compress.archivers.zip.ZipShort
            r2.<init>(r13, r5)
            org.apache.commons.compress.archivers.zip.ZipShort r3 = new org.apache.commons.compress.archivers.zip.ZipShort
            int r4 = r5 + 2
            r3.<init>(r13, r4)
            int r12 = r3.getValue()
            int r9 = r5 + 4
            int r3 = r9 + r12
            if (r3 <= r1) goto L32
            int r6 = r1 - r5
            r3 = r15
            r4 = r13
            r7 = r14
            r8 = r12
            org.apache.commons.compress.archivers.zip.ZipExtraField r13 = r3.onUnparseableExtraField(r4, r5, r6, r7, r8)
            if (r13 == 0) goto L69
            r0.add(r13)
            goto L69
        L32:
            org.apache.commons.compress.archivers.zip.ZipExtraField r2 = r15.createExtraField(r2)     // Catch: java.lang.IllegalAccessException -> L56 java.lang.InstantiationException -> L58
            java.lang.String r3 = "createExtraField must not return null"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r3)     // Catch: java.lang.IllegalAccessException -> L56 java.lang.InstantiationException -> L58
            r7 = r2
            org.apache.commons.compress.archivers.zip.ZipExtraField r7 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r7     // Catch: java.lang.IllegalAccessException -> L56 java.lang.InstantiationException -> L58
            r6 = r15
            r8 = r13
            r10 = r12
            r11 = r14
            org.apache.commons.compress.archivers.zip.ZipExtraField r2 = r6.fill(r7, r8, r9, r10, r11)     // Catch: java.lang.IllegalAccessException -> L56 java.lang.InstantiationException -> L58
            java.lang.String r3 = "fill must not return null"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r3)     // Catch: java.lang.IllegalAccessException -> L56 java.lang.InstantiationException -> L58
            org.apache.commons.compress.archivers.zip.ZipExtraField r2 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r2     // Catch: java.lang.IllegalAccessException -> L56 java.lang.InstantiationException -> L58
            r0.add(r2)     // Catch: java.lang.IllegalAccessException -> L56 java.lang.InstantiationException -> L58
            int r12 = r12 + 4
            int r5 = r5 + r12
            goto L8
        L56:
            r13 = move-exception
            goto L59
        L58:
            r13 = move-exception
        L59:
            java.util.zip.ZipException r14 = new java.util.zip.ZipException
            java.lang.String r15 = r13.getMessage()
            r14.<init>(r15)
            java.lang.Throwable r13 = r14.initCause(r13)
            java.util.zip.ZipException r13 = (java.util.zip.ZipException) r13
            throw r13
        L69:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY
            java.lang.Object[] r13 = r0.toArray(r13)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r13 = (org.apache.commons.compress.archivers.zip.ZipExtraField[]) r13
            return r13
    }

    public static org.apache.commons.compress.archivers.zip.ZipExtraField[] parse(byte[] r1, boolean r2, org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField r3) throws java.util.zip.ZipException {
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$1 r0 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$1
            r0.<init>(r3)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = parse(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static void register(java.lang.Class<?> r4) {
            java.lang.Class<org.apache.commons.compress.archivers.zip.ZipExtraField> r0 = org.apache.commons.compress.archivers.zip.ZipExtraField.class
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch: java.lang.ReflectiveOperationException -> L30
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L30
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.ReflectiveOperationException -> L30
            java.lang.Class<org.apache.commons.compress.archivers.zip.ZipExtraField> r2 = org.apache.commons.compress.archivers.zip.ZipExtraField.class
            java.lang.Class r2 = r4.asSubclass(r2)     // Catch: java.lang.ReflectiveOperationException -> L30
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L30
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.ReflectiveOperationException -> L30
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L30
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L30
            org.apache.commons.compress.archivers.zip.ZipExtraField r1 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r1     // Catch: java.lang.ReflectiveOperationException -> L30
            java.util.concurrent.ConcurrentMap<org.apache.commons.compress.archivers.zip.ZipShort, java.util.function.Supplier<org.apache.commons.compress.archivers.zip.ZipExtraField>> r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.IMPLEMENTATIONS     // Catch: java.lang.ReflectiveOperationException -> L30
            org.apache.commons.compress.archivers.zip.ZipShort r1 = r1.getHeaderId()     // Catch: java.lang.ReflectiveOperationException -> L30
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda5 r3 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils$$ExternalSyntheticLambda5     // Catch: java.lang.ReflectiveOperationException -> L30
            r3.<init>(r0, r4)     // Catch: java.lang.ReflectiveOperationException -> L30
            r2.put(r1, r3)     // Catch: java.lang.ReflectiveOperationException -> L30
            return
        L30:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r0)
            throw r1
    }
}
