package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveEntry extends java.util.zip.ZipEntry implements org.apache.commons.compress.archivers.ArchiveEntry, org.apache.commons.compress.archivers.EntryStreamOffsets {
    public static final int CRC_UNKNOWN = -1;
    static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] EMPTY_ARRAY = null;
    static java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> EMPTY_LINKED_LIST = null;
    public static final int PLATFORM_FAT = 0;
    public static final int PLATFORM_UNIX = 3;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_SHIFT = 16;
    private static final java.lang.String ZIP_DIR_SEP = "/";
    private int alignment;
    private org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource;
    private long dataOffset;
    private long diskNumberStart;
    private long externalAttributes;
    private final java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> extraFieldFactory;
    private org.apache.commons.compress.archivers.zip.ZipExtraField[] extraFields;
    private org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit;
    private int internalAttributes;
    private boolean isStreamContiguous;
    private boolean lastModifiedDateSet;
    private long localHeaderOffset;
    private int method;
    private java.lang.String name;
    private org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource;
    private int platform;
    private int rawFlag;
    private byte[] rawName;
    private long size;
    private long time;
    private org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtra;
    private int versionMadeBy;
    private int versionRequired;


    public enum CommentSource extends java.lang.Enum<org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource> {
        private static final /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource COMMENT = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource UNICODE_EXTRA_FIELD = null;

        private static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource[] $values() {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource[] r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource[]{r0, r1}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource
                java.lang.String r1 = "COMMENT"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource
                java.lang.String r1 = "UNICODE_EXTRA_FIELD"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource[] r0 = $values()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.$VALUES = r0
                return
        }

        CommentSource(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource> r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r1 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource[] values() {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource[] r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource[]) r0
                return r0
        }
    }

    public enum ExtraFieldParsingMode extends java.lang.Enum<org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode> implements org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior {
        private static final /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode BEST_EFFORT = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode DRACONIC = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode ONLY_PARSEABLE_LENIENT = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode ONLY_PARSEABLE_STRICT = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode STRICT_FOR_KNOW_EXTRA_FIELDS = null;
        private final org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField onUnparseableData;



        private static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode[] $values() {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r3 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode[] r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$1 r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$1
                r1 = 0
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ
                java.lang.String r3 = "BEST_EFFORT"
                r0.<init>(r3, r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode
                r1 = 1
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ
                java.lang.String r3 = "STRICT_FOR_KNOW_EXTRA_FIELDS"
                r0.<init>(r3, r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$2 r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode$2
                r1 = 2
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP
                java.lang.String r3 = "ONLY_PARSEABLE_LENIENT"
                r0.<init>(r3, r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode
                r1 = 3
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP
                java.lang.String r3 = "ONLY_PARSEABLE_STRICT"
                r0.<init>(r3, r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode
                r1 = 4
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW
                java.lang.String r3 = "DRACONIC"
                r0.<init>(r3, r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode[] r0 = $values()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.$VALUES = r0
                return
        }

        ExtraFieldParsingMode(java.lang.String r1, int r2, org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.onUnparseableData = r3
                return
        }

        /* synthetic */ ExtraFieldParsingMode(java.lang.String r1, int r2, org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField r3, org.apache.commons.compress.archivers.zip.ZipArchiveEntry.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipExtraField access$100(org.apache.commons.compress.archivers.zip.ZipExtraField r0, byte[] r1, int r2, int r3, boolean r4) {
                org.apache.commons.compress.archivers.zip.ZipExtraField r0 = fillAndMakeUnrecognizedOnError(r0, r1, r2, r3, r4)
                return r0
        }

        private static org.apache.commons.compress.archivers.zip.ZipExtraField fillAndMakeUnrecognizedOnError(org.apache.commons.compress.archivers.zip.ZipExtraField r1, byte[] r2, int r3, int r4, boolean r5) {
                org.apache.commons.compress.archivers.zip.ZipExtraField r1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField(r1, r2, r3, r4, r5)     // Catch: java.util.zip.ZipException -> L5
                return r1
            L5:
                org.apache.commons.compress.archivers.zip.UnrecognizedExtraField r0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField
                r0.<init>()
                org.apache.commons.compress.archivers.zip.ZipShort r1 = r1.getHeaderId()
                r0.setHeaderId(r1)
                if (r5 == 0) goto L1c
                int r4 = r4 + r3
                byte[] r1 = java.util.Arrays.copyOfRange(r2, r3, r4)
                r0.setLocalFileDataData(r1)
                goto L24
            L1c:
                int r4 = r4 + r3
                byte[] r1 = java.util.Arrays.copyOfRange(r2, r3, r4)
                r0.setCentralDirectoryData(r1)
            L24:
                return r0
        }

        public static org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode> r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r1 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode[] values() {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode[] r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode[]) r0
                return r0
        }

        @Override // org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
        public org.apache.commons.compress.archivers.zip.ZipExtraField createExtraField(org.apache.commons.compress.archivers.zip.ZipShort r1) {
                r0 = this;
                org.apache.commons.compress.archivers.zip.ZipExtraField r1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(r1)
                return r1
        }

        @Override // org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior
        public org.apache.commons.compress.archivers.zip.ZipExtraField fill(org.apache.commons.compress.archivers.zip.ZipExtraField r1, byte[] r2, int r3, int r4, boolean r5) throws java.util.zip.ZipException {
                r0 = this;
                org.apache.commons.compress.archivers.zip.ZipExtraField r1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField(r1, r2, r3, r4, r5)
                return r1
        }

        @Override // org.apache.commons.compress.archivers.zip.UnparseableExtraFieldBehavior
        public org.apache.commons.compress.archivers.zip.ZipExtraField onUnparseableExtraField(byte[] r7, int r8, int r9, boolean r10, int r11) throws java.util.zip.ZipException {
                r6 = this;
                org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField r0 = r6.onUnparseableData
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                org.apache.commons.compress.archivers.zip.ZipExtraField r7 = r0.onUnparseableExtraField(r1, r2, r3, r4, r5)
                return r7
        }
    }

    public enum NameSource extends java.lang.Enum<org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource> {
        private static final /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource NAME = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource NAME_WITH_EFS_FLAG = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource UNICODE_EXTRA_FIELD = null;

        private static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource[] $values() {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource[] r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource[]{r0, r1, r2}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource
                java.lang.String r1 = "NAME"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource
                java.lang.String r1 = "NAME_WITH_EFS_FLAG"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource
                java.lang.String r1 = "UNICODE_EXTRA_FIELD"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource[] r0 = $values()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.$VALUES = r0
                return
        }

        NameSource(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource> r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r1 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource[] values() {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource[] r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource[]) r0
                return r0
        }
    }

    public static /* synthetic */ boolean $r8$lambda$OQ5ZnjzeKkoNsCvZViNw4jrec6A(java.lang.Class r0, java.lang.Object r1) {
            boolean r0 = r0.isInstance(r1)
            return r0
    }

    static {
            r0 = 0
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry[r0]
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.EMPTY_ARRAY = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry.EMPTY_LINKED_LIST = r0
            return
    }

    protected ZipArchiveEntry() {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            return
    }

    public ZipArchiveEntry(java.io.File r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public ZipArchiveEntry(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = r0
            java.util.function.Function r1 = (java.util.function.Function) r1
            r2.<init>(r0, r3)
            return
    }

    public ZipArchiveEntry(java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3, r4)
            return
    }

    private ZipArchiveEntry(java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> r3, java.io.File r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r5 = toEntryName(r4, r5)
            r2.<init>(r3, r5)
            java.nio.file.Path r3 = r4.toPath()     // Catch: java.io.IOException -> L12
            r5 = 0
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r5]     // Catch: java.io.IOException -> L12
            r2.setAttributes(r3, r5)     // Catch: java.io.IOException -> L12
            goto L26
        L12:
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L1f
            long r0 = r4.length()
            r2.setSize(r0)
        L1f:
            long r3 = r4.lastModified()
            r2.setTime(r3)
        L26:
            return
    }

    private ZipArchiveEntry(java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> r4, java.lang.String r5) {
            r3 = this;
            r3.<init>(r5)
            r0 = -1
            r3.method = r0
            r0 = -1
            r3.size = r0
            r2 = 0
            r3.platform = r2
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r2 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit
            r2.<init>()
            r3.generalPurposeBit = r2
            r3.localHeaderOffset = r0
            r3.dataOffset = r0
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME
            r3.nameSource = r2
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT
            r3.commentSource = r2
            r3.time = r0
            r3.extraFieldFactory = r4
            r3.setName(r5)
            return
    }

    private ZipArchiveEntry(java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> r1, java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r0 = this;
            java.lang.String r3 = toEntryName(r2, r3, r4)
            r0.<init>(r1, r3)
            r0.setAttributes(r2, r4)
            return
    }

    private ZipArchiveEntry(java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> r4, java.util.zip.ZipEntry r5) throws java.util.zip.ZipException {
            r3 = this;
            r3.<init>(r5)
            r0 = -1
            r3.method = r0
            r0 = -1
            r3.size = r0
            r2 = 0
            r3.platform = r2
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r2 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit
            r2.<init>()
            r3.generalPurposeBit = r2
            r3.localHeaderOffset = r0
            r3.dataOffset = r0
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME
            r3.nameSource = r2
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT
            r3.commentSource = r2
            r3.time = r0
            r3.extraFieldFactory = r4
            java.lang.String r4 = r5.getName()
            r3.setName(r4)
            byte[] r4 = r5.getExtra()
            if (r4 == 0) goto L3c
            r0 = 1
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r4 = r3.parseExtraFields(r4, r0, r1)
            r3.setExtraFields(r4)
            goto L3f
        L3c:
            r3.setExtra()
        L3f:
            int r4 = r5.getMethod()
            r3.setMethod(r4)
            long r4 = r5.getSize()
            r3.size = r4
            return
    }

    public ZipArchiveEntry(java.util.zip.ZipEntry r2) throws java.util.zip.ZipException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public ZipArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3) throws java.util.zip.ZipException {
            r2 = this;
            r2.<init>(r3)
            int r0 = r3.getInternalAttributes()
            r2.setInternalAttributes(r0)
            long r0 = r3.getExternalAttributes()
            r2.setExternalAttributes(r0)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r3.getAllExtraFieldsNoCopy()
            r2.setExtraFields(r0)
            int r0 = r3.getPlatform()
            r2.setPlatform(r0)
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r3 = r3.getGeneralPurposeBit()
            if (r3 != 0) goto L27
            r3 = 0
            goto L2d
        L27:
            java.lang.Object r3 = r3.clone()
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r3 = (org.apache.commons.compress.archivers.zip.GeneralPurposeBit) r3
        L2d:
            r2.setGeneralPurposeBit(r3)
            return
    }

    static /* synthetic */ java.util.function.Function access$200(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0) {
            java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> r0 = r0.extraFieldFactory
            return r0
    }

    private void addInfoZipExtendedTimestamp(java.nio.file.attribute.FileTime r2, java.nio.file.attribute.FileTime r3, java.nio.file.attribute.FileTime r4) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp r0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp
            r0.<init>()
            if (r2 == 0) goto La
            r0.setModifyFileTime(r2)
        La:
            if (r3 == 0) goto Lf
            r0.setAccessFileTime(r3)
        Lf:
            if (r4 == 0) goto L14
            r0.setCreateFileTime(r4)
        L14:
            r1.internalAddExtraField(r0)
            return
    }

    private void addNTFSTimestamp(java.nio.file.attribute.FileTime r2, java.nio.file.attribute.FileTime r3, java.nio.file.attribute.FileTime r4) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.X000A_NTFS r0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS
            r0.<init>()
            if (r2 == 0) goto La
            r0.setModifyFileTime(r2)
        La:
            if (r3 == 0) goto Lf
            r0.setAccessFileTime(r3)
        Lf:
            if (r4 == 0) goto L14
            r0.setCreateFileTime(r4)
        L14:
            r1.internalAddExtraField(r0)
            return
    }

    private static boolean canConvertToInfoZipExtendedTimestamp(java.nio.file.attribute.FileTime r0, java.nio.file.attribute.FileTime r1, java.nio.file.attribute.FileTime r2) {
            boolean r0 = org.apache.commons.io.file.attribute.FileTimes.isUnixTime(r0)
            if (r0 == 0) goto L14
            boolean r0 = org.apache.commons.io.file.attribute.FileTimes.isUnixTime(r1)
            if (r0 == 0) goto L14
            boolean r0 = org.apache.commons.io.file.attribute.FileTimes.isUnixTime(r2)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] copyOf(org.apache.commons.compress.archivers.zip.ZipExtraField[] r1, int r2) {
            r0 = this;
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = (org.apache.commons.compress.archivers.zip.ZipExtraField[]) r1
            return r1
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField findMatching(org.apache.commons.compress.archivers.zip.ZipShort r2, java.util.List<org.apache.commons.compress.archivers.zip.ZipExtraField> r3) {
            r1 = this;
            java.util.stream.Stream r3 = r3.stream()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$$ExternalSyntheticLambda0
            r0.<init>(r2)
            java.util.stream.Stream r2 = r3.filter(r0)
            java.util.Optional r2 = r2.findFirst()
            r3 = 0
            java.lang.Object r2 = r2.orElse(r3)
            org.apache.commons.compress.archivers.zip.ZipExtraField r2 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r2
            return r2
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField findUnparseable(java.util.List<org.apache.commons.compress.archivers.zip.ZipExtraField> r3) {
            r2 = this;
            java.util.stream.Stream r3 = r3.stream()
            java.lang.Class<org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData> r0 = org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.class
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$$ExternalSyntheticLambda1 r1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$$ExternalSyntheticLambda1
            r1.<init>(r0)
            java.util.stream.Stream r3 = r3.filter(r1)
            java.util.Optional r3 = r3.findFirst()
            r0 = 0
            java.lang.Object r3 = r3.orElse(r0)
            org.apache.commons.compress.archivers.zip.ZipExtraField r3 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r3
            return r3
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] getAllExtraFields() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r2.getAllExtraFieldsNoCopy()
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = r2.extraFields
            if (r0 != r1) goto Ld
            int r1 = r0.length
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r2.copyOf(r0, r1)
        Ld:
            return r0
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] getAllExtraFieldsNoCopy() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r2.extraFields
            if (r0 != 0) goto L9
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r2.getUnparseableOnly()
            return r0
        L9:
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r1 = r2.unparseableExtra
            if (r1 == 0) goto L11
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r2.getMergedFields()
        L11:
            return r0
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] getMergedFields() {
            r3 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r3.extraFields
            int r1 = r0.length
            int r1 = r1 + 1
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r3.copyOf(r0, r1)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = r3.extraFields
            int r1 = r1.length
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r2 = r3.unparseableExtra
            r0[r1] = r2
            return r0
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] getParseableExtraFields() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r2.getParseableExtraFieldsNoCopy()
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = r2.extraFields
            if (r0 != r1) goto Ld
            int r1 = r0.length
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r2.copyOf(r0, r1)
        Ld:
            return r0
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] getParseableExtraFieldsNoCopy() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r1.extraFields
            if (r0 != 0) goto L6
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY
        L6:
            return r0
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] getUnparseableOnly() {
            r3 = this;
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r0 = r3.unparseableExtra
            if (r0 != 0) goto L7
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY
            goto Le
        L7:
            r1 = 1
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = new org.apache.commons.compress.archivers.zip.ZipExtraField[r1]
            r2 = 0
            r1[r2] = r0
            r0 = r1
        Le:
            return r0
    }

    private void internalAddExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
            if (r0 == 0) goto L9
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r4 = (org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData) r4
            r3.unparseableExtra = r4
            goto L35
        L9:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r3.extraFields
            r1 = 1
            if (r0 != 0) goto L16
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = new org.apache.commons.compress.archivers.zip.ZipExtraField[r1]
            r1 = 0
            r0[r1] = r4
            r3.extraFields = r0
            goto L35
        L16:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r4.getHeaderId()
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r3.getExtraField(r0)
            if (r0 == 0) goto L27
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r4.getHeaderId()
            r3.internalRemoveExtraField(r0)
        L27:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r3.extraFields
            int r2 = r0.length
            int r2 = r2 + r1
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r3.copyOf(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r4
            r3.extraFields = r0
        L35:
            return
    }

    private void internalRemoveExtraField(org.apache.commons.compress.archivers.zip.ZipShort r7) {
            r6 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r6.extraFields
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = r6.extraFields
            int r2 = r1.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L22
            r4 = r1[r3]
            org.apache.commons.compress.archivers.zip.ZipShort r5 = r4.getHeaderId()
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L1f
            r0.add(r4)
        L1f:
            int r3 = r3 + 1
            goto Le
        L22:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r7 = r6.extraFields
            int r7 = r7.length
            int r1 = r0.size()
            if (r7 != r1) goto L2c
            return
        L2c:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY
            java.lang.Object[] r7 = r0.toArray(r7)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r7 = (org.apache.commons.compress.archivers.zip.ZipExtraField[]) r7
            r6.extraFields = r7
            return
    }

    private void internalSetLastModifiedTime(java.nio.file.attribute.FileTime r3) {
            r2 = this;
            super.setLastModifiedTime(r3)
            long r0 = r3.toMillis()
            r2.time = r0
            r3 = 1
            r2.lastModifiedDateSet = r3
            return
    }

    private static boolean isDirectoryEntryName(java.lang.String r1) {
            java.lang.String r0 = "/"
            boolean r1 = r1.endsWith(r0)
            return r1
    }

    static /* synthetic */ boolean lambda$findMatching$0(org.apache.commons.compress.archivers.zip.ZipShort r0, org.apache.commons.compress.archivers.zip.ZipExtraField r1) {
            org.apache.commons.compress.archivers.zip.ZipShort r1 = r1.getHeaderId()
            boolean r0 = r0.equals(r1)
            return r0
    }

    private void mergeExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[] r8, boolean r9) {
            r7 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r7.extraFields
            if (r0 != 0) goto L8
            r7.setExtraFields(r8)
            goto L6e
        L8:
            int r0 = r8.length
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L6b
            r3 = r8[r2]
            boolean r4 = r3 instanceof org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
            if (r4 == 0) goto L16
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r4 = r7.unparseableExtra
            goto L1e
        L16:
            org.apache.commons.compress.archivers.zip.ZipShort r4 = r3.getHeaderId()
            org.apache.commons.compress.archivers.zip.ZipExtraField r4 = r7.getExtraField(r4)
        L1e:
            if (r4 != 0) goto L24
            r7.internalAddExtraField(r3)
            goto L68
        L24:
            if (r9 == 0) goto L2b
            byte[] r3 = r3.getLocalFileDataData()
            goto L2f
        L2b:
            byte[] r3 = r3.getCentralDirectoryData()
        L2f:
            if (r9 == 0) goto L36
            int r5 = r3.length     // Catch: java.util.zip.ZipException -> L3b
            r4.parseFromLocalFileData(r3, r1, r5)     // Catch: java.util.zip.ZipException -> L3b
            goto L68
        L36:
            int r5 = r3.length     // Catch: java.util.zip.ZipException -> L3b
            r4.parseFromCentralDirectoryData(r3, r1, r5)     // Catch: java.util.zip.ZipException -> L3b
            goto L68
        L3b:
            org.apache.commons.compress.archivers.zip.UnrecognizedExtraField r5 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField
            r5.<init>()
            org.apache.commons.compress.archivers.zip.ZipShort r6 = r4.getHeaderId()
            r5.setHeaderId(r6)
            if (r9 == 0) goto L54
            r5.setLocalFileDataData(r3)
            byte[] r3 = r4.getCentralDirectoryData()
            r5.setCentralDirectoryData(r3)
            goto L5e
        L54:
            byte[] r6 = r4.getLocalFileDataData()
            r5.setLocalFileDataData(r6)
            r5.setCentralDirectoryData(r3)
        L5e:
            org.apache.commons.compress.archivers.zip.ZipShort r3 = r4.getHeaderId()
            r7.internalRemoveExtraField(r3)
            r7.internalAddExtraField(r5)
        L68:
            int r2 = r2 + 1
            goto Lb
        L6b:
            r7.setExtra()
        L6e:
            return
    }

    private org.apache.commons.compress.archivers.zip.ZipExtraField[] parseExtraFields(byte[] r2, boolean r3, org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior r4) throws java.util.zip.ZipException {
            r1 = this;
            java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> r0 = r1.extraFieldFactory
            if (r0 == 0) goto Le
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$1 r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry$1
            r0.<init>(r1, r4)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(r2, r3, r0)
            return r2
        Le:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(r2, r3, r4)
            return r2
    }

    private boolean requiresExtraTimeFields() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.getLastAccessTime()
            if (r0 != 0) goto L10
            java.nio.file.attribute.FileTime r0 = r1.getCreationTime()
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            boolean r0 = r1.lastModifiedDateSet
            return r0
        L10:
            r0 = 1
            return r0
    }

    private void setAttributes(java.nio.file.Path r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r2 = this;
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r3 = java.nio.file.Files.readAttributes(r3, r0, r4)
            boolean r4 = r3.isRegularFile()
            if (r4 == 0) goto L13
            long r0 = r3.size()
            r2.setSize(r0)
        L13:
            java.nio.file.attribute.FileTime r4 = r3.lastModifiedTime()
            super.setLastModifiedTime(r4)
            java.nio.file.attribute.FileTime r4 = r3.creationTime()
            super.setCreationTime(r4)
            java.nio.file.attribute.FileTime r3 = r3.lastAccessTime()
            super.setLastAccessTime(r3)
            r2.setExtraTimeFields()
            return
    }

    private void setExtraTimeFields() {
            r4 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r4.getExtraField(r0)
            if (r0 == 0) goto Ld
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID
            r4.internalRemoveExtraField(r0)
        Ld:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X000A_NTFS.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r4.getExtraField(r0)
            if (r0 == 0) goto L1a
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X000A_NTFS.HEADER_ID
            r4.internalRemoveExtraField(r0)
        L1a:
            boolean r0 = r4.requiresExtraTimeFields()
            if (r0 == 0) goto L38
            java.nio.file.attribute.FileTime r0 = r4.getLastModifiedTime()
            java.nio.file.attribute.FileTime r1 = r4.getLastAccessTime()
            java.nio.file.attribute.FileTime r2 = r4.getCreationTime()
            boolean r3 = canConvertToInfoZipExtendedTimestamp(r0, r1, r2)
            if (r3 == 0) goto L35
            r4.addInfoZipExtendedTimestamp(r0, r1, r2)
        L35:
            r4.addNTFSTimestamp(r0, r1, r2)
        L38:
            r4.setExtra()
            return
    }

    private static java.lang.String toDirectoryEntryName(java.lang.String r1) {
            boolean r0 = isDirectoryEntryName(r1)
            if (r0 == 0) goto L7
            goto L1a
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "/"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
        L1a:
            return r1
    }

    private static java.lang.String toEntryName(java.io.File r0, java.lang.String r1) {
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto La
            java.lang.String r1 = toDirectoryEntryName(r1)
        La:
            return r1
    }

    private static java.lang.String toEntryName(java.nio.file.Path r0, java.lang.String r1, java.nio.file.LinkOption... r2) {
            boolean r0 = java.nio.file.Files.isDirectory(r0, r2)
            if (r0 == 0) goto La
            java.lang.String r1 = toDirectoryEntryName(r1)
        La:
            return r1
    }

    private void updateTimeFieldsFromExtraFields() {
            r0 = this;
            r0.updateTimeFromExtendedTimestampField()
            r0.updateTimeFromNtfsField()
            return
    }

    private void updateTimeFromExtendedTimestampField() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r2.getExtraField(r0)
            boolean r1 = r0 instanceof org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp
            if (r1 == 0) goto L39
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp r0 = (org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp) r0
            boolean r1 = r0.isBit0_modifyTimePresent()
            if (r1 == 0) goto L1b
            java.nio.file.attribute.FileTime r1 = r0.getModifyFileTime()
            if (r1 == 0) goto L1b
            r2.internalSetLastModifiedTime(r1)
        L1b:
            boolean r1 = r0.isBit1_accessTimePresent()
            if (r1 == 0) goto L2a
            java.nio.file.attribute.FileTime r1 = r0.getAccessFileTime()
            if (r1 == 0) goto L2a
            super.setLastAccessTime(r1)
        L2a:
            boolean r1 = r0.isBit2_createTimePresent()
            if (r1 == 0) goto L39
            java.nio.file.attribute.FileTime r0 = r0.getCreateFileTime()
            if (r0 == 0) goto L39
            super.setCreationTime(r0)
        L39:
            return
    }

    private void updateTimeFromNtfsField() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X000A_NTFS.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r2.getExtraField(r0)
            boolean r1 = r0 instanceof org.apache.commons.compress.archivers.zip.X000A_NTFS
            if (r1 == 0) goto L27
            org.apache.commons.compress.archivers.zip.X000A_NTFS r0 = (org.apache.commons.compress.archivers.zip.X000A_NTFS) r0
            java.nio.file.attribute.FileTime r1 = r0.getModifyFileTime()
            if (r1 == 0) goto L15
            r2.internalSetLastModifiedTime(r1)
        L15:
            java.nio.file.attribute.FileTime r1 = r0.getAccessFileTime()
            if (r1 == 0) goto L1e
            super.setLastAccessTime(r1)
        L1e:
            java.nio.file.attribute.FileTime r0 = r0.getCreateFileTime()
            if (r0 == 0) goto L27
            super.setCreationTime(r0)
        L27:
            return
    }

    public void addAsFirstExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField r5) {
            r4 = this;
            boolean r0 = r5 instanceof org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
            if (r0 == 0) goto L9
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r5 = (org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData) r5
            r4.unparseableExtra = r5
            goto L31
        L9:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r5.getHeaderId()
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r4.getExtraField(r0)
            if (r0 == 0) goto L1a
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r5.getHeaderId()
            r4.internalRemoveExtraField(r0)
        L1a:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r4.extraFields
            r1 = 1
            if (r0 == 0) goto L22
            int r2 = r0.length
            int r2 = r2 + r1
            goto L23
        L22:
            r2 = r1
        L23:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r2 = new org.apache.commons.compress.archivers.zip.ZipExtraField[r2]
            r4.extraFields = r2
            r3 = 0
            r2[r3] = r5
            if (r0 == 0) goto L31
            int r5 = r2.length
            int r5 = r5 - r1
            java.lang.System.arraycopy(r0, r3, r2, r1, r5)
        L31:
            r4.setExtra()
            return
    }

    public void addExtraField(org.apache.commons.compress.archivers.zip.ZipExtraField r1) {
            r0 = this;
            r0.internalAddExtraField(r1)
            r0.setExtra()
            return
    }

    @Override // java.util.zip.ZipEntry
    public java.lang.Object clone() {
            r3 = this;
            java.lang.Object r0 = super.clone()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r0
            int r1 = r3.getInternalAttributes()
            r0.setInternalAttributes(r1)
            long r1 = r3.getExternalAttributes()
            r0.setExternalAttributes(r1)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = r3.getAllExtraFieldsNoCopy()
            r0.setExtraFields(r1)
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto Leb
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto Leb
        L13:
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r7 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r7
            java.lang.String r2 = r6.getName()
            java.lang.String r3 = r7.getName()
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L24
            return r1
        L24:
            java.lang.String r2 = r6.getComment()
            java.lang.String r3 = r7.getComment()
            java.lang.String r4 = ""
            if (r2 != 0) goto L31
            r2 = r4
        L31:
            if (r3 != 0) goto L34
            r3 = r4
        L34:
            java.nio.file.attribute.FileTime r4 = r6.getLastModifiedTime()
            java.nio.file.attribute.FileTime r5 = r7.getLastModifiedTime()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto Le9
            java.nio.file.attribute.FileTime r4 = r6.getLastAccessTime()
            java.nio.file.attribute.FileTime r5 = r7.getLastAccessTime()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto Le9
            java.nio.file.attribute.FileTime r4 = r6.getCreationTime()
            java.nio.file.attribute.FileTime r5 = r7.getCreationTime()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto Le9
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Le9
            int r2 = r6.getInternalAttributes()
            int r3 = r7.getInternalAttributes()
            if (r2 != r3) goto Le9
            int r2 = r6.getPlatform()
            int r3 = r7.getPlatform()
            if (r2 != r3) goto Le9
            long r2 = r6.getExternalAttributes()
            long r4 = r7.getExternalAttributes()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Le9
            int r2 = r6.getMethod()
            int r3 = r7.getMethod()
            if (r2 != r3) goto Le9
            long r2 = r6.getSize()
            long r4 = r7.getSize()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Le9
            long r2 = r6.getCrc()
            long r4 = r7.getCrc()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Le9
            long r2 = r6.getCompressedSize()
            long r4 = r7.getCompressedSize()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Le9
            byte[] r2 = r6.getCentralDirectoryExtra()
            byte[] r3 = r7.getCentralDirectoryExtra()
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto Le9
            byte[] r2 = r6.getLocalFileDataExtra()
            byte[] r3 = r7.getLocalFileDataExtra()
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto Le9
            long r2 = r6.localHeaderOffset
            long r4 = r7.localHeaderOffset
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Le9
            long r2 = r6.dataOffset
            long r4 = r7.dataOffset
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Le9
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r2 = r6.generalPurposeBit
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r7 = r7.generalPurposeBit
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto Le9
            goto Lea
        Le9:
            r0 = r1
        Lea:
            return r0
        Leb:
            return r1
    }

    protected int getAlignment() {
            r1 = this;
            int r0 = r1.alignment
            return r0
    }

    public byte[] getCentralDirectoryExtra() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r1.getAllExtraFieldsNoCopy()
            byte[] r0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(r0)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource getCommentSource() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r0 = r1.commentSource
            return r0
    }

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public long getDataOffset() {
            r2 = this;
            long r0 = r2.dataOffset
            return r0
    }

    public long getDiskNumberStart() {
            r2 = this;
            long r0 = r2.diskNumberStart
            return r0
    }

    public long getExternalAttributes() {
            r2 = this;
            long r0 = r2.externalAttributes
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipExtraField getExtraField(org.apache.commons.compress.archivers.zip.ZipShort r6) {
            r5 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r5.extraFields
            if (r0 == 0) goto L18
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            org.apache.commons.compress.archivers.zip.ZipShort r4 = r3.getHeaderId()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L15
            return r3
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            r6 = 0
            return r6
    }

    public org.apache.commons.compress.archivers.zip.ZipExtraField[] getExtraFields() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r1.getParseableExtraFields()
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipExtraField[] getExtraFields(org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior r8) throws java.util.zip.ZipException {
            r7 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT
            r1 = 1
            if (r8 != r0) goto La
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r8 = r7.getExtraFields(r1)
            return r8
        La:
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT
            r2 = 0
            if (r8 != r0) goto L14
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r8 = r7.getExtraFields(r2)
            return r8
        L14:
            byte[] r0 = r7.getExtra()
            java.util.ArrayList r3 = new java.util.ArrayList
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r7.parseExtraFields(r0, r1, r8)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.<init>(r0)
            byte[] r0 = r7.getCentralDirectoryExtra()
            java.util.ArrayList r1 = new java.util.ArrayList
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r8 = r7.parseExtraFields(r0, r2, r8)
            java.util.List r8 = java.util.Arrays.asList(r8)
            r1.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r3.iterator()
        L3f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r0.next()
            org.apache.commons.compress.archivers.zip.ZipExtraField r3 = (org.apache.commons.compress.archivers.zip.ZipExtraField) r3
            boolean r4 = r3 instanceof org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
            if (r4 == 0) goto L54
            org.apache.commons.compress.archivers.zip.ZipExtraField r4 = r7.findUnparseable(r1)
            goto L5c
        L54:
            org.apache.commons.compress.archivers.zip.ZipShort r4 = r3.getHeaderId()
            org.apache.commons.compress.archivers.zip.ZipExtraField r4 = r7.findMatching(r4, r1)
        L5c:
            if (r4 == 0) goto L6e
            byte[] r5 = r4.getCentralDirectoryData()
            if (r5 == 0) goto L6b
            int r6 = r5.length
            if (r6 <= 0) goto L6b
            int r6 = r5.length
            r3.parseFromCentralDirectoryData(r5, r2, r6)
        L6b:
            r1.remove(r4)
        L6e:
            r8.add(r3)
            goto L3f
        L72:
            r8.addAll(r1)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY
            java.lang.Object[] r8 = r8.toArray(r0)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r8 = (org.apache.commons.compress.archivers.zip.ZipExtraField[]) r8
            return r8
    }

    public org.apache.commons.compress.archivers.zip.ZipExtraField[] getExtraFields(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = r0.getAllExtraFields()
            goto Lb
        L7:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r1 = r0.getParseableExtraFields()
        Lb:
            return r1
    }

    public org.apache.commons.compress.archivers.zip.GeneralPurposeBit getGeneralPurposeBit() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r0 = r1.generalPurposeBit
            return r0
    }

    public int getInternalAttributes() {
            r1 = this;
            int r0 = r1.internalAttributes
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.util.Date getLastModifiedDate() {
            r3 = this;
            java.util.Date r0 = new java.util.Date
            long r1 = r3.getTime()
            r0.<init>(r1)
            return r0
    }

    public byte[] getLocalFileDataExtra() {
            r1 = this;
            byte[] r0 = r1.getExtra()
            if (r0 == 0) goto L7
            goto L9
        L7:
            byte[] r0 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
        L9:
            return r0
    }

    public long getLocalHeaderOffset() {
            r2 = this;
            long r0 = r2.localHeaderOffset
            return r0
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
            r1 = this;
            int r0 = r1.method
            return r0
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.compress.archivers.ArchiveEntry
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            if (r0 != 0) goto L8
            java.lang.String r0 = super.getName()
        L8:
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource getNameSource() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r0 = r1.nameSource
            return r0
    }

    public int getPlatform() {
            r1 = this;
            int r0 = r1.platform
            return r0
    }

    public int getRawFlag() {
            r1 = this;
            int r0 = r1.rawFlag
            return r0
    }

    public byte[] getRawName() {
            r2 = this;
            byte[] r0 = r2.rawName
            if (r0 == 0) goto La
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // java.util.zip.ZipEntry
    public long getTime() {
            r4 = this;
            boolean r0 = r4.lastModifiedDateSet
            if (r0 == 0) goto Ld
            java.nio.file.attribute.FileTime r0 = r4.getLastModifiedTime()
            long r0 = r0.toMillis()
            return r0
        Ld:
            long r0 = r4.time
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L16
            goto L1a
        L16:
            long r0 = super.getTime()
        L1a:
            return r0
    }

    public int getUnixMode() {
            r4 = this;
            int r0 = r4.platform
            r1 = 3
            if (r0 == r1) goto L7
            r0 = 0
            goto L13
        L7:
            long r0 = r4.getExternalAttributes()
            r2 = 16
            long r0 = r0 >> r2
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            int r0 = (int) r0
        L13:
            return r0
    }

    public org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData getUnparseableExtraFieldData() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r0 = r1.unparseableExtra
            return r0
    }

    public int getVersionMadeBy() {
            r1 = this;
            int r0 = r1.versionMadeBy
            return r0
    }

    public int getVersionRequired() {
            r1 = this;
            int r0 = r1.versionRequired
            return r0
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.zip.ZipEntry, org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            boolean r0 = isDirectoryEntryName(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public boolean isStreamContiguous() {
            r1 = this;
            boolean r0 = r1.isStreamContiguous
            return r0
    }

    public boolean isUnixSymlink() {
            r2 = this;
            int r0 = r2.getUnixMode()
            r1 = 61440(0xf000, float:8.6096E-41)
            r0 = r0 & r1
            r1 = 40960(0xa000, float:5.7397E-41)
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public void removeExtraField(org.apache.commons.compress.archivers.zip.ZipShort r2) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r1.getExtraField(r2)
            if (r0 == 0) goto Ld
            r1.internalRemoveExtraField(r2)
            r1.setExtra()
            return
        Ld:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    public void removeUnparseableExtraFieldData() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r0 = r1.unparseableExtra
            if (r0 == 0) goto Lb
            r0 = 0
            r1.unparseableExtra = r0
            r1.setExtra()
            return
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public void setAlignment(int r4) {
            r3 = this;
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 != 0) goto Ld
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r0) goto Ld
            r3.alignment = r4
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid value for alignment, must be power of two and no bigger than 65535 but is "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setCentralDirectoryExtra(byte[] r3) {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT     // Catch: java.util.zip.ZipException -> Lb
            r1 = 0
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r3 = r2.parseExtraFields(r3, r1, r0)     // Catch: java.util.zip.ZipException -> Lb
            r2.mergeExtraFields(r3, r1)     // Catch: java.util.zip.ZipException -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
    }

    public void setCommentSource(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource r1) {
            r0 = this;
            r0.commentSource = r1
            return
    }

    @Override // java.util.zip.ZipEntry
    public java.util.zip.ZipEntry setCreationTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            super.setCreationTime(r1)
            r0.setExtraTimeFields()
            return r0
    }

    protected void setDataOffset(long r1) {
            r0 = this;
            r0.dataOffset = r1
            return
    }

    public void setDiskNumberStart(long r1) {
            r0 = this;
            r0.diskNumberStart = r1
            return
    }

    public void setExternalAttributes(long r1) {
            r0 = this;
            r0.externalAttributes = r1
            return
    }

    protected void setExtra() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r0 = r1.getAllExtraFieldsNoCopy()
            byte[] r0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(r0)
            super.setExtra(r0)
            r1.updateTimeFieldsFromExtraFields()
            return
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] r4) throws java.lang.RuntimeException {
            r3 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$ExtraFieldParsingMode r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT     // Catch: java.util.zip.ZipException -> Lb
            r1 = 1
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r4 = r3.parseExtraFields(r4, r1, r0)     // Catch: java.util.zip.ZipException -> Lb
            r3.mergeExtraFields(r4, r1)     // Catch: java.util.zip.ZipException -> Lb
            return
        Lb:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error parsing extra fields for entry: "
            r1.<init>(r2)
            java.lang.String r2 = r3.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " - "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    public void setExtraFields(org.apache.commons.compress.archivers.zip.ZipExtraField[] r6) {
            r5 = this;
            r0 = 0
            r5.unparseableExtra = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L1f
            int r1 = r6.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1f
            r3 = r6[r2]
            boolean r4 = r3 instanceof org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData
            if (r4 == 0) goto L19
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData r3 = (org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData) r3
            r5.unparseableExtra = r3
            goto L1c
        L19:
            r0.add(r3)
        L1c:
            int r2 = r2 + 1
            goto Lc
        L1f:
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY
            java.lang.Object[] r6 = r0.toArray(r6)
            org.apache.commons.compress.archivers.zip.ZipExtraField[] r6 = (org.apache.commons.compress.archivers.zip.ZipExtraField[]) r6
            r5.extraFields = r6
            r5.setExtra()
            return
    }

    public void setGeneralPurposeBit(org.apache.commons.compress.archivers.zip.GeneralPurposeBit r1) {
            r0 = this;
            r0.generalPurposeBit = r1
            return
    }

    public void setInternalAttributes(int r1) {
            r0 = this;
            r0.internalAttributes = r1
            return
    }

    @Override // java.util.zip.ZipEntry
    public java.util.zip.ZipEntry setLastAccessTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            super.setLastAccessTime(r1)
            r0.setExtraTimeFields()
            return r0
    }

    @Override // java.util.zip.ZipEntry
    public java.util.zip.ZipEntry setLastModifiedTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.internalSetLastModifiedTime(r1)
            r0.setExtraTimeFields()
            return r0
    }

    protected void setLocalHeaderOffset(long r1) {
            r0 = this;
            r0.localHeaderOffset = r1
            return
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int r4) {
            r3 = this;
            if (r4 < 0) goto L5
            r3.method = r4
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ZIP compression method can not be negative: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    protected void setName(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L18
            int r0 = r2.getPlatform()
            if (r0 != 0) goto L18
            java.lang.String r0 = "/"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L18
            r0 = 92
            r1 = 47
            java.lang.String r3 = r3.replace(r0, r1)
        L18:
            r2.name = r3
            return
    }

    protected void setName(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.setName(r1)
            r0.rawName = r2
            return
    }

    public void setNameSource(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource r1) {
            r0 = this;
            r0.nameSource = r1
            return
    }

    protected void setPlatform(int r1) {
            r0 = this;
            r0.platform = r1
            return
    }

    public void setRawFlag(int r1) {
            r0 = this;
            r0.rawFlag = r1
            return
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            r2.size = r3
            return
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid entry size"
            r3.<init>(r4)
            throw r3
    }

    protected void setStreamContiguous(boolean r1) {
            r0 = this;
            r0.isStreamContiguous = r1
            return
    }

    @Override // java.util.zip.ZipEntry
    public void setTime(long r2) {
            r1 = this;
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime(r2)
            if (r0 == 0) goto L12
            super.setTime(r2)
            r1.time = r2
            r2 = 0
            r1.lastModifiedDateSet = r2
            r1.setExtraTimeFields()
            goto L19
        L12:
            java.nio.file.attribute.FileTime r2 = java.nio.file.attribute.FileTime.fromMillis(r2)
            r1.setLastModifiedTime(r2)
        L19:
            return
    }

    public void setTime(java.nio.file.attribute.FileTime r3) {
            r2 = this;
            long r0 = r3.toMillis()
            r2.setTime(r0)
            return
    }

    public void setUnixMode(int r3) {
            r2 = this;
            int r0 = r3 << 16
            r3 = r3 & 128(0x80, float:1.8E-43)
            r1 = 0
            if (r3 != 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = r1
        La:
            r3 = r3 | r0
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L13
            r1 = 16
        L13:
            r3 = r3 | r1
            long r0 = (long) r3
            r2.setExternalAttributes(r0)
            r3 = 3
            r2.platform = r3
            return
    }

    public void setVersionMadeBy(int r1) {
            r0 = this;
            r0.versionMadeBy = r1
            return
    }

    public void setVersionRequired(int r1) {
            r0 = this;
            r0.versionRequired = r1
            return
    }
}
