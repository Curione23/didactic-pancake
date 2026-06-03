package com.bytedance.android.bytehook;

/* JADX INFO: loaded from: classes.dex */
public class ByteHook {
    private static final int ERRNO_INIT_EXCEPTION = 101;
    private static final int ERRNO_LOAD_LIBRARY_EXCEPTION = 100;
    private static final int ERRNO_OK = 0;
    private static final int ERRNO_UNINIT = 1;
    private static final boolean defaultDebug = false;
    private static final com.bytedance.android.bytehook.ILibLoader defaultLibLoader = null;
    private static final int defaultMode = 0;
    private static final boolean defaultRecordable = false;
    private static long initCostMs = -1;
    private static int initStatus = 1;
    private static boolean inited = false;
    private static final java.lang.String libName = "bytehook";
    private static final int recordItemAll = 255;
    private static final int recordItemCallerLibName = 2;
    private static final int recordItemErrno = 64;
    private static final int recordItemLibName = 8;
    private static final int recordItemNewAddr = 32;
    private static final int recordItemOp = 4;
    private static final int recordItemStub = 128;
    private static final int recordItemSymName = 16;
    private static final int recordItemTimestamp = 1;

    /* JADX INFO: renamed from: com.bytedance.android.bytehook.ByteHook$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem = null;

        static {
                com.bytedance.android.bytehook.ByteHook$RecordItem[] r0 = com.bytedance.android.bytehook.ByteHook.RecordItem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.TIMESTAMP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.CALLER_LIB_NAME     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem     // Catch: java.lang.NoSuchFieldError -> L28
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.OP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem     // Catch: java.lang.NoSuchFieldError -> L33
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.LIB_NAME     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem     // Catch: java.lang.NoSuchFieldError -> L3e
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.SYM_NAME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem     // Catch: java.lang.NoSuchFieldError -> L49
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.NEW_ADDR     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem     // Catch: java.lang.NoSuchFieldError -> L54
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.ERRNO     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem     // Catch: java.lang.NoSuchFieldError -> L60
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.STUB     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    public static class Config {
        private boolean debug;
        private com.bytedance.android.bytehook.ILibLoader libLoader;
        private int mode;
        private boolean recordable;

        public Config() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean getDebug() {
                r1 = this;
                boolean r0 = r1.debug
                return r0
        }

        public com.bytedance.android.bytehook.ILibLoader getLibLoader() {
                r1 = this;
                com.bytedance.android.bytehook.ILibLoader r0 = r1.libLoader
                return r0
        }

        public int getMode() {
                r1 = this;
                int r0 = r1.mode
                return r0
        }

        public boolean getRecordable() {
                r1 = this;
                boolean r0 = r1.recordable
                return r0
        }

        public void setDebug(boolean r1) {
                r0 = this;
                r0.debug = r1
                return
        }

        public void setLibLoader(com.bytedance.android.bytehook.ILibLoader r1) {
                r0 = this;
                r0.libLoader = r1
                return
        }

        public void setMode(int r1) {
                r0 = this;
                r0.mode = r1
                return
        }

        public void setRecordable(boolean r1) {
                r0 = this;
                r0.recordable = r1
                return
        }
    }

    public static class ConfigBuilder {
        private boolean debug;
        private com.bytedance.android.bytehook.ILibLoader libLoader;
        private int mode;
        private boolean recordable;

        public ConfigBuilder() {
                r1 = this;
                r1.<init>()
                com.bytedance.android.bytehook.ILibLoader r0 = com.bytedance.android.bytehook.ByteHook.access$000()
                r1.libLoader = r0
                int r0 = com.bytedance.android.bytehook.ByteHook.access$100()
                r1.mode = r0
                r0 = 0
                r1.debug = r0
                r1.recordable = r0
                return
        }

        public com.bytedance.android.bytehook.ByteHook.Config build() {
                r2 = this;
                com.bytedance.android.bytehook.ByteHook$Config r0 = new com.bytedance.android.bytehook.ByteHook$Config
                r0.<init>()
                com.bytedance.android.bytehook.ILibLoader r1 = r2.libLoader
                r0.setLibLoader(r1)
                int r1 = r2.mode
                r0.setMode(r1)
                boolean r1 = r2.debug
                r0.setDebug(r1)
                boolean r1 = r2.recordable
                r0.setRecordable(r1)
                return r0
        }

        public com.bytedance.android.bytehook.ByteHook.ConfigBuilder setDebug(boolean r1) {
                r0 = this;
                r0.debug = r1
                return r0
        }

        public com.bytedance.android.bytehook.ByteHook.ConfigBuilder setLibLoader(com.bytedance.android.bytehook.ILibLoader r1) {
                r0 = this;
                r0.libLoader = r1
                return r0
        }

        public com.bytedance.android.bytehook.ByteHook.ConfigBuilder setMode(com.bytedance.android.bytehook.ByteHook.Mode r1) {
                r0 = this;
                int r1 = r1.getValue()
                r0.mode = r1
                return r0
        }

        public com.bytedance.android.bytehook.ByteHook.ConfigBuilder setRecordable(boolean r1) {
                r0 = this;
                r0.recordable = r1
                return r0
        }
    }

    public enum Mode extends java.lang.Enum<com.bytedance.android.bytehook.ByteHook.Mode> {
        private static final /* synthetic */ com.bytedance.android.bytehook.ByteHook.Mode[] $VALUES = null;
        public static final com.bytedance.android.bytehook.ByteHook.Mode AUTOMATIC = null;
        public static final com.bytedance.android.bytehook.ByteHook.Mode MANUAL = null;
        private final int value;

        private static /* synthetic */ com.bytedance.android.bytehook.ByteHook.Mode[] $values() {
                com.bytedance.android.bytehook.ByteHook$Mode r0 = com.bytedance.android.bytehook.ByteHook.Mode.AUTOMATIC
                com.bytedance.android.bytehook.ByteHook$Mode r1 = com.bytedance.android.bytehook.ByteHook.Mode.MANUAL
                com.bytedance.android.bytehook.ByteHook$Mode[] r0 = new com.bytedance.android.bytehook.ByteHook.Mode[]{r0, r1}
                return r0
        }

        static {
                com.bytedance.android.bytehook.ByteHook$Mode r0 = new com.bytedance.android.bytehook.ByteHook$Mode
                java.lang.String r1 = "AUTOMATIC"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.bytedance.android.bytehook.ByteHook.Mode.AUTOMATIC = r0
                com.bytedance.android.bytehook.ByteHook$Mode r0 = new com.bytedance.android.bytehook.ByteHook$Mode
                java.lang.String r1 = "MANUAL"
                r2 = 1
                r0.<init>(r1, r2, r2)
                com.bytedance.android.bytehook.ByteHook.Mode.MANUAL = r0
                com.bytedance.android.bytehook.ByteHook$Mode[] r0 = $values()
                com.bytedance.android.bytehook.ByteHook.Mode.$VALUES = r0
                return
        }

        Mode(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.bytedance.android.bytehook.ByteHook.Mode valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.android.bytehook.ByteHook$Mode> r0 = com.bytedance.android.bytehook.ByteHook.Mode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.android.bytehook.ByteHook$Mode r1 = (com.bytedance.android.bytehook.ByteHook.Mode) r1
                return r1
        }

        public static com.bytedance.android.bytehook.ByteHook.Mode[] values() {
                com.bytedance.android.bytehook.ByteHook$Mode[] r0 = com.bytedance.android.bytehook.ByteHook.Mode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bytedance.android.bytehook.ByteHook$Mode[] r0 = (com.bytedance.android.bytehook.ByteHook.Mode[]) r0
                return r0
        }

        int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    public enum RecordItem extends java.lang.Enum<com.bytedance.android.bytehook.ByteHook.RecordItem> {
        private static final /* synthetic */ com.bytedance.android.bytehook.ByteHook.RecordItem[] $VALUES = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem CALLER_LIB_NAME = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem ERRNO = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem LIB_NAME = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem NEW_ADDR = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem OP = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem STUB = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem SYM_NAME = null;
        public static final com.bytedance.android.bytehook.ByteHook.RecordItem TIMESTAMP = null;

        private static /* synthetic */ com.bytedance.android.bytehook.ByteHook.RecordItem[] $values() {
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = com.bytedance.android.bytehook.ByteHook.RecordItem.TIMESTAMP
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = com.bytedance.android.bytehook.ByteHook.RecordItem.CALLER_LIB_NAME
                com.bytedance.android.bytehook.ByteHook$RecordItem r2 = com.bytedance.android.bytehook.ByteHook.RecordItem.OP
                com.bytedance.android.bytehook.ByteHook$RecordItem r3 = com.bytedance.android.bytehook.ByteHook.RecordItem.LIB_NAME
                com.bytedance.android.bytehook.ByteHook$RecordItem r4 = com.bytedance.android.bytehook.ByteHook.RecordItem.SYM_NAME
                com.bytedance.android.bytehook.ByteHook$RecordItem r5 = com.bytedance.android.bytehook.ByteHook.RecordItem.NEW_ADDR
                com.bytedance.android.bytehook.ByteHook$RecordItem r6 = com.bytedance.android.bytehook.ByteHook.RecordItem.ERRNO
                com.bytedance.android.bytehook.ByteHook$RecordItem r7 = com.bytedance.android.bytehook.ByteHook.RecordItem.STUB
                com.bytedance.android.bytehook.ByteHook$RecordItem[] r0 = new com.bytedance.android.bytehook.ByteHook.RecordItem[]{r0, r1, r2, r3, r4, r5, r6, r7}
                return r0
        }

        static {
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "TIMESTAMP"
                r2 = 0
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.TIMESTAMP = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "CALLER_LIB_NAME"
                r2 = 1
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.CALLER_LIB_NAME = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "OP"
                r2 = 2
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.OP = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "LIB_NAME"
                r2 = 3
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.LIB_NAME = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "SYM_NAME"
                r2 = 4
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.SYM_NAME = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "NEW_ADDR"
                r2 = 5
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.NEW_ADDR = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "ERRNO"
                r2 = 6
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.ERRNO = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem r0 = new com.bytedance.android.bytehook.ByteHook$RecordItem
                java.lang.String r1 = "STUB"
                r2 = 7
                r0.<init>(r1, r2)
                com.bytedance.android.bytehook.ByteHook.RecordItem.STUB = r0
                com.bytedance.android.bytehook.ByteHook$RecordItem[] r0 = $values()
                com.bytedance.android.bytehook.ByteHook.RecordItem.$VALUES = r0
                return
        }

        RecordItem(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bytedance.android.bytehook.ByteHook.RecordItem valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.android.bytehook.ByteHook$RecordItem> r0 = com.bytedance.android.bytehook.ByteHook.RecordItem.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.android.bytehook.ByteHook$RecordItem r1 = (com.bytedance.android.bytehook.ByteHook.RecordItem) r1
                return r1
        }

        public static com.bytedance.android.bytehook.ByteHook.RecordItem[] values() {
                com.bytedance.android.bytehook.ByteHook$RecordItem[] r0 = com.bytedance.android.bytehook.ByteHook.RecordItem.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bytedance.android.bytehook.ByteHook$RecordItem[] r0 = (com.bytedance.android.bytehook.ByteHook.RecordItem[]) r0
                return r0
        }
    }

    static {
            com.bytedance.android.bytehook.ByteHook$Mode r0 = com.bytedance.android.bytehook.ByteHook.Mode.AUTOMATIC
            int r0 = r0.getValue()
            com.bytedance.android.bytehook.ByteHook.defaultMode = r0
            return
    }

    public ByteHook() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.bytedance.android.bytehook.ILibLoader access$000() {
            com.bytedance.android.bytehook.ILibLoader r0 = com.bytedance.android.bytehook.ByteHook.defaultLibLoader
            return r0
    }

    static /* synthetic */ int access$100() {
            int r0 = com.bytedance.android.bytehook.ByteHook.defaultMode
            return r0
    }

    public static int addIgnore(java.lang.String r1) {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L9
            int r1 = nativeAddIgnore(r1)
            return r1
        L9:
            return r0
    }

    public static java.lang.String getArch() {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L9
            java.lang.String r0 = nativeGetArch()
            return r0
        L9:
            java.lang.String r0 = "unknown"
            return r0
    }

    public static boolean getDebug() {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L9
            boolean r0 = nativeGetDebug()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static long getInitCostMs() {
            long r0 = com.bytedance.android.bytehook.ByteHook.initCostMs
            return r0
    }

    public static int getInitErrno() {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            return r0
    }

    public static com.bytedance.android.bytehook.ByteHook.Mode getMode() {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L16
            com.bytedance.android.bytehook.ByteHook$Mode r0 = com.bytedance.android.bytehook.ByteHook.Mode.AUTOMATIC
            int r0 = r0.getValue()
            int r1 = nativeGetMode()
            if (r0 != r1) goto L13
            com.bytedance.android.bytehook.ByteHook$Mode r0 = com.bytedance.android.bytehook.ByteHook.Mode.AUTOMATIC
            goto L15
        L13:
            com.bytedance.android.bytehook.ByteHook$Mode r0 = com.bytedance.android.bytehook.ByteHook.Mode.MANUAL
        L15:
            return r0
        L16:
            com.bytedance.android.bytehook.ByteHook$Mode r0 = com.bytedance.android.bytehook.ByteHook.Mode.AUTOMATIC
            return r0
    }

    public static boolean getRecordable() {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L9
            boolean r0 = nativeGetRecordable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static java.lang.String getRecords(com.bytedance.android.bytehook.ByteHook.RecordItem... r5) {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L3a
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L7:
            if (r1 >= r0) goto L31
            r3 = r5[r1]
            int[] r4 = com.bytedance.android.bytehook.ByteHook.AnonymousClass1.$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem
            int r3 = r3.ordinal()
            r3 = r4[r3]
            switch(r3) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L2e
        L17:
            r2 = r2 | 128(0x80, float:1.8E-43)
            goto L2e
        L1a:
            r2 = r2 | 64
            goto L2e
        L1d:
            r2 = r2 | 32
            goto L2e
        L20:
            r2 = r2 | 16
            goto L2e
        L23:
            r2 = r2 | 8
            goto L2e
        L26:
            r2 = r2 | 4
            goto L2e
        L29:
            r2 = r2 | 2
            goto L2e
        L2c:
            r2 = r2 | 1
        L2e:
            int r1 = r1 + 1
            goto L7
        L31:
            if (r2 != 0) goto L35
            r2 = 255(0xff, float:3.57E-43)
        L35:
            java.lang.String r5 = nativeGetRecords(r2)
            return r5
        L3a:
            r5 = 0
            return r5
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = nativeGetVersion()
            return r0
    }

    public static int init() {
            r0 = 0
            int r0 = init(r0)
            return r0
    }

    public static synchronized int init(com.bytedance.android.bytehook.ByteHook.Config r6) {
            java.lang.Class<com.bytedance.android.bytehook.ByteHook> r0 = com.bytedance.android.bytehook.ByteHook.class
            monitor-enter(r0)
            boolean r1 = com.bytedance.android.bytehook.ByteHook.inited     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto Lb
            int r6 = com.bytedance.android.bytehook.ByteHook.initStatus     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)
            return r6
        Lb:
            r1 = 1
            com.bytedance.android.bytehook.ByteHook.inited = r1     // Catch: java.lang.Throwable -> L6f
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6f
            if (r6 != 0) goto L1d
            com.bytedance.android.bytehook.ByteHook$ConfigBuilder r6 = new com.bytedance.android.bytehook.ByteHook$ConfigBuilder     // Catch: java.lang.Throwable -> L6f
            r6.<init>()     // Catch: java.lang.Throwable -> L6f
            com.bytedance.android.bytehook.ByteHook$Config r6 = r6.build()     // Catch: java.lang.Throwable -> L6f
        L1d:
            com.bytedance.android.bytehook.ILibLoader r3 = r6.getLibLoader()     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L29
            java.lang.String r3 = "bytehook"
            java.lang.System.loadLibrary(r3)     // Catch: java.lang.Throwable -> L60
            goto L32
        L29:
            com.bytedance.android.bytehook.ILibLoader r3 = r6.getLibLoader()     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = "bytehook"
            r3.loadLibrary(r4)     // Catch: java.lang.Throwable -> L60
        L32:
            r3 = 101(0x65, float:1.42E-43)
            int r4 = r6.getMode()     // Catch: java.lang.Throwable -> L43
            boolean r5 = r6.getDebug()     // Catch: java.lang.Throwable -> L43
            int r4 = nativeInit(r4, r5)     // Catch: java.lang.Throwable -> L43
            com.bytedance.android.bytehook.ByteHook.initStatus = r4     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            com.bytedance.android.bytehook.ByteHook.initStatus = r3     // Catch: java.lang.Throwable -> L6f
        L45:
            boolean r4 = r6.getRecordable()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L55
            boolean r6 = r6.getRecordable()     // Catch: java.lang.Throwable -> L53
            nativeSetRecordable(r6)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            com.bytedance.android.bytehook.ByteHook.initStatus = r3     // Catch: java.lang.Throwable -> L6f
        L55:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6f
            long r3 = r3 - r1
            com.bytedance.android.bytehook.ByteHook.initCostMs = r3     // Catch: java.lang.Throwable -> L6f
            int r6 = com.bytedance.android.bytehook.ByteHook.initStatus     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)
            return r6
        L60:
            r6 = 100
            com.bytedance.android.bytehook.ByteHook.initStatus = r6     // Catch: java.lang.Throwable -> L6f
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6f
            long r3 = r3 - r1
            com.bytedance.android.bytehook.ByteHook.initCostMs = r3     // Catch: java.lang.Throwable -> L6f
            int r6 = com.bytedance.android.bytehook.ByteHook.initStatus     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)
            return r6
        L6f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r6
    }

    private static native int nativeAddIgnore(java.lang.String r0);

    private static native java.lang.String nativeGetArch();

    private static native boolean nativeGetDebug();

    private static native int nativeGetMode();

    private static native boolean nativeGetRecordable();

    private static native java.lang.String nativeGetRecords(int r0);

    private static native java.lang.String nativeGetVersion();

    private static native int nativeInit(int r0, boolean r1);

    private static native void nativeSetDebug(boolean r0);

    private static native void nativeSetRecordable(boolean r0);

    public static void setDebug(boolean r1) {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L7
            nativeSetDebug(r1)
        L7:
            return
    }

    public static void setRecordable(boolean r1) {
            int r0 = com.bytedance.android.bytehook.ByteHook.initStatus
            if (r0 != 0) goto L7
            nativeSetRecordable(r1)
        L7:
            return
    }
}
