package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Logging.class */
public class Logging {
    private static final java.util.logging.Logger fallbackLogger = null;
    private static volatile boolean loggingEnabled;

    @androidx.annotation.Nullable
    private static org.webrtc.Loggable loggable;
    private static org.webrtc.Logging.Severity loggableSeverity;

    /* JADX INFO: renamed from: org.webrtc.Logging$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Logging$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity = null;

        static {
                org.webrtc.Logging$Severity[] r0 = org.webrtc.Logging.Severity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity = r0
                int[] r0 = org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity     // Catch: java.lang.NoSuchFieldError -> L17
                org.webrtc.Logging$Severity r1 = org.webrtc.Logging.Severity.LS_ERROR     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity     // Catch: java.lang.NoSuchFieldError -> L26
                org.webrtc.Logging$Severity r1 = org.webrtc.Logging.Severity.LS_WARNING     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity     // Catch: java.lang.NoSuchFieldError -> L35
                org.webrtc.Logging$Severity r1 = org.webrtc.Logging.Severity.LS_INFO     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Logging$Severity.class */
    public enum Severity extends java.lang.Enum<org.webrtc.Logging.Severity> {
        public static final org.webrtc.Logging.Severity LS_VERBOSE = null;
        public static final org.webrtc.Logging.Severity LS_INFO = null;
        public static final org.webrtc.Logging.Severity LS_WARNING = null;
        public static final org.webrtc.Logging.Severity LS_ERROR = null;
        public static final org.webrtc.Logging.Severity LS_NONE = null;
        private static final /* synthetic */ org.webrtc.Logging.Severity[] $VALUES = null;

        public static org.webrtc.Logging.Severity[] values() {
                org.webrtc.Logging$Severity[] r0 = org.webrtc.Logging.Severity.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.Logging$Severity[] r0 = (org.webrtc.Logging.Severity[]) r0
                return r0
        }

        public static org.webrtc.Logging.Severity valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.Logging$Severity> r0 = org.webrtc.Logging.Severity.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.Logging$Severity r0 = (org.webrtc.Logging.Severity) r0
                return r0
        }

        Severity(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.Logging.Severity[] $values() {
                r0 = 5
                org.webrtc.Logging$Severity[] r0 = new org.webrtc.Logging.Severity[r0]
                r1 = r0
                r2 = 0
                org.webrtc.Logging$Severity r3 = org.webrtc.Logging.Severity.LS_VERBOSE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.Logging$Severity r3 = org.webrtc.Logging.Severity.LS_INFO
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.Logging$Severity r3 = org.webrtc.Logging.Severity.LS_WARNING
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.Logging$Severity r3 = org.webrtc.Logging.Severity.LS_ERROR
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.Logging$Severity r3 = org.webrtc.Logging.Severity.LS_NONE
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.Logging$Severity r0 = new org.webrtc.Logging$Severity
                r1 = r0
                java.lang.String r2 = "LS_VERBOSE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.Logging.Severity.LS_VERBOSE = r0
                org.webrtc.Logging$Severity r0 = new org.webrtc.Logging$Severity
                r1 = r0
                java.lang.String r2 = "LS_INFO"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.Logging.Severity.LS_INFO = r0
                org.webrtc.Logging$Severity r0 = new org.webrtc.Logging$Severity
                r1 = r0
                java.lang.String r2 = "LS_WARNING"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.Logging.Severity.LS_WARNING = r0
                org.webrtc.Logging$Severity r0 = new org.webrtc.Logging$Severity
                r1 = r0
                java.lang.String r2 = "LS_ERROR"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.Logging.Severity.LS_ERROR = r0
                org.webrtc.Logging$Severity r0 = new org.webrtc.Logging$Severity
                r1 = r0
                java.lang.String r2 = "LS_NONE"
                r3 = 4
                r1.<init>(r2, r3)
                org.webrtc.Logging.Severity.LS_NONE = r0
                org.webrtc.Logging$Severity[] r0 = $values()
                org.webrtc.Logging.Severity.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Logging$TraceLevel.class */
    @java.lang.Deprecated
    public enum TraceLevel extends java.lang.Enum<org.webrtc.Logging.TraceLevel> {
        public static final org.webrtc.Logging.TraceLevel TRACE_NONE = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_STATEINFO = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_WARNING = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_ERROR = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_CRITICAL = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_APICALL = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_DEFAULT = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_MODULECALL = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_MEMORY = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_TIMER = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_STREAM = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_DEBUG = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_INFO = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_TERSEINFO = null;
        public static final org.webrtc.Logging.TraceLevel TRACE_ALL = null;
        public final int level;
        private static final /* synthetic */ org.webrtc.Logging.TraceLevel[] $VALUES = null;

        public static org.webrtc.Logging.TraceLevel[] values() {
                org.webrtc.Logging$TraceLevel[] r0 = org.webrtc.Logging.TraceLevel.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.Logging$TraceLevel[] r0 = (org.webrtc.Logging.TraceLevel[]) r0
                return r0
        }

        public static org.webrtc.Logging.TraceLevel valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.Logging$TraceLevel> r0 = org.webrtc.Logging.TraceLevel.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.Logging$TraceLevel r0 = (org.webrtc.Logging.TraceLevel) r0
                return r0
        }

        TraceLevel(java.lang.String r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.level = r1
                return
        }

        private static /* synthetic */ org.webrtc.Logging.TraceLevel[] $values() {
                r0 = 15
                org.webrtc.Logging$TraceLevel[] r0 = new org.webrtc.Logging.TraceLevel[r0]
                r1 = r0
                r2 = 0
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_NONE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_STATEINFO
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_WARNING
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_ERROR
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_CRITICAL
                r1[r2] = r3
                r1 = r0
                r2 = 5
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_APICALL
                r1[r2] = r3
                r1 = r0
                r2 = 6
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_DEFAULT
                r1[r2] = r3
                r1 = r0
                r2 = 7
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_MODULECALL
                r1[r2] = r3
                r1 = r0
                r2 = 8
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_MEMORY
                r1[r2] = r3
                r1 = r0
                r2 = 9
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_TIMER
                r1[r2] = r3
                r1 = r0
                r2 = 10
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_STREAM
                r1[r2] = r3
                r1 = r0
                r2 = 11
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_DEBUG
                r1[r2] = r3
                r1 = r0
                r2 = 12
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_INFO
                r1[r2] = r3
                r1 = r0
                r2 = 13
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_TERSEINFO
                r1[r2] = r3
                r1 = r0
                r2 = 14
                org.webrtc.Logging$TraceLevel r3 = org.webrtc.Logging.TraceLevel.TRACE_ALL
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_NONE"
                r3 = 0
                r4 = 0
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_NONE = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_STATEINFO"
                r3 = 1
                r4 = 1
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_STATEINFO = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_WARNING"
                r3 = 2
                r4 = 2
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_WARNING = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_ERROR"
                r3 = 3
                r4 = 4
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_ERROR = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_CRITICAL"
                r3 = 4
                r4 = 8
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_CRITICAL = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_APICALL"
                r3 = 5
                r4 = 16
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_APICALL = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_DEFAULT"
                r3 = 6
                r4 = 255(0xff, float:3.57E-43)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_DEFAULT = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_MODULECALL"
                r3 = 7
                r4 = 32
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_MODULECALL = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_MEMORY"
                r3 = 8
                r4 = 256(0x100, float:3.59E-43)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_MEMORY = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_TIMER"
                r3 = 9
                r4 = 512(0x200, float:7.17E-43)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_TIMER = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_STREAM"
                r3 = 10
                r4 = 1024(0x400, float:1.435E-42)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_STREAM = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_DEBUG"
                r3 = 11
                r4 = 2048(0x800, float:2.87E-42)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_DEBUG = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_INFO"
                r3 = 12
                r4 = 4096(0x1000, float:5.74E-42)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_INFO = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_TERSEINFO"
                r3 = 13
                r4 = 8192(0x2000, float:1.148E-41)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_TERSEINFO = r0
                org.webrtc.Logging$TraceLevel r0 = new org.webrtc.Logging$TraceLevel
                r1 = r0
                java.lang.String r2 = "TRACE_ALL"
                r3 = 14
                r4 = 65535(0xffff, float:9.1834E-41)
                r1.<init>(r2, r3, r4)
                org.webrtc.Logging.TraceLevel.TRACE_ALL = r0
                org.webrtc.Logging$TraceLevel[] r0 = $values()
                org.webrtc.Logging.TraceLevel.$VALUES = r0
                return
        }
    }

    public Logging() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.util.logging.Logger createFallbackLogger() {
            java.lang.String r0 = "org.webrtc.Logging"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            r3 = r0
            r0 = r3
            java.util.logging.Level r1 = java.util.logging.Level.ALL
            r0.setLevel(r1)
            r0 = r3
            return r0
    }

    static void injectLoggable(org.webrtc.Loggable r2, org.webrtc.Logging.Severity r3) {
            r0 = r2
            if (r0 == 0) goto Lc
            r0 = r2
            org.webrtc.Logging.loggable = r0
            r0 = r3
            org.webrtc.Logging.loggableSeverity = r0
        Lc:
            return
    }

    static void deleteInjectedLoggable() {
            r0 = 0
            org.webrtc.Logging.loggable = r0
            return
    }

    public static void enableLogThreads() {
            nativeEnableLogThreads()
            return
    }

    public static void enableLogTimeStamps() {
            nativeEnableLogTimeStamps()
            return
    }

    @java.lang.Deprecated
    public static void enableTracing(java.lang.String r1, java.util.EnumSet<org.webrtc.Logging.TraceLevel> r2) {
            return
    }

    public static synchronized void enableLogToDebugOutput(org.webrtc.Logging.Severity r4) {
            org.webrtc.Loggable r0 = org.webrtc.Logging.loggable
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method."
            r1.<init>(r2)
            throw r0
        L10:
            r0 = r4
            int r0 = r0.ordinal()
            nativeEnableLogToDebugOutput(r0)
            r0 = 1
            org.webrtc.Logging.loggingEnabled = r0
            return
    }

    public static void log(org.webrtc.Logging.Severity r5, java.lang.String r6, java.lang.String r7) {
            r0 = r6
            if (r0 == 0) goto L8
            r0 = r7
            if (r0 != 0) goto L12
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Logging tag or message may not be null."
            r1.<init>(r2)
            throw r0
        L12:
            org.webrtc.Loggable r0 = org.webrtc.Logging.loggable
            if (r0 == 0) goto L32
            r0 = r5
            int r0 = r0.ordinal()
            org.webrtc.Logging$Severity r1 = org.webrtc.Logging.loggableSeverity
            int r1 = r1.ordinal()
            if (r0 >= r1) goto L26
            return
        L26:
            org.webrtc.Loggable r0 = org.webrtc.Logging.loggable
            r1 = r7
            r2 = r5
            r3 = r6
            r0.onLogMessage(r1, r2, r3)
            return
        L32:
            boolean r0 = org.webrtc.Logging.loggingEnabled
            if (r0 == 0) goto L42
            r0 = r5
            int r0 = r0.ordinal()
            r1 = r6
            r2 = r7
            nativeLog(r0, r1, r2)
            return
        L42:
            int[] r0 = org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity
            r1 = r5
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L64;
                case 2: goto L6b;
                case 3: goto L72;
                default: goto L79;
            }
        L64:
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            r8 = r0
            goto L7d
        L6b:
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r8 = r0
            goto L7d
        L72:
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            r8 = r0
            goto L7d
        L79:
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            r8 = r0
        L7d:
            java.util.logging.Logger r0 = org.webrtc.Logging.fallbackLogger
            r1 = r8
            r2 = r6
            r3 = r7
            java.lang.String r2 = r2 + ": " + r3
            r0.log(r1, r2)
            return
    }

    public static void d(java.lang.String r4, java.lang.String r5) {
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_INFO
            r1 = r4
            r2 = r5
            log(r0, r1, r2)
            return
    }

    public static void e(java.lang.String r4, java.lang.String r5) {
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_ERROR
            r1 = r4
            r2 = r5
            log(r0, r1, r2)
            return
    }

    public static void w(java.lang.String r4, java.lang.String r5) {
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_WARNING
            r1 = r4
            r2 = r5
            log(r0, r1, r2)
            return
    }

    public static void e(java.lang.String r4, java.lang.String r5, java.lang.Throwable r6) {
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_ERROR
            r1 = r4
            r2 = r5
            log(r0, r1, r2)
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_ERROR
            r1 = r4
            r2 = r6
            java.lang.String r2 = r2.toString()
            log(r0, r1, r2)
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_ERROR
            r1 = r4
            r2 = r6
            java.lang.String r2 = getStackTraceString(r2)
            log(r0, r1, r2)
            return
    }

    public static void w(java.lang.String r4, java.lang.String r5, java.lang.Throwable r6) {
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_WARNING
            r1 = r4
            r2 = r5
            log(r0, r1, r2)
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_WARNING
            r1 = r4
            r2 = r6
            java.lang.String r2 = r2.toString()
            log(r0, r1, r2)
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_WARNING
            r1 = r4
            r2 = r6
            java.lang.String r2 = getStackTraceString(r2)
            log(r0, r1, r2)
            return
    }

    public static void v(java.lang.String r4, java.lang.String r5) {
            org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_VERBOSE
            r1 = r4
            r2 = r5
            log(r0, r1, r2)
            return
    }

    private static java.lang.String getStackTraceString(java.lang.Throwable r4) {
            r0 = r4
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r5 = r0
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            r1 = r6
            r0.printStackTrace(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static native void nativeEnableLogToDebugOutput(int r0);

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeLog(int r0, java.lang.String r1, java.lang.String r2);

    static {
            java.util.logging.Logger r0 = createFallbackLogger()
            org.webrtc.Logging.fallbackLogger = r0
            return
    }
}
