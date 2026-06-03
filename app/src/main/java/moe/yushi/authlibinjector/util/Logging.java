package moe.yushi.authlibinjector.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/util/Logging.class */
public final class Logging {
    private static final java.util.regex.Pattern CONTROL_CHARACTERS_FILTER = null;
    private static final java.io.PrintStream out = null;
    private static final java.nio.channels.FileChannel logfile = null;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/util/Logging$Level.class */
    public enum Level extends java.lang.Enum<moe.yushi.authlibinjector.util.Logging.Level> {
        public static final moe.yushi.authlibinjector.util.Logging.Level DEBUG = null;
        public static final moe.yushi.authlibinjector.util.Logging.Level INFO = null;
        public static final moe.yushi.authlibinjector.util.Logging.Level WARNING = null;
        public static final moe.yushi.authlibinjector.util.Logging.Level ERROR = null;
        private static final /* synthetic */ moe.yushi.authlibinjector.util.Logging.Level[] $VALUES = null;

        public static moe.yushi.authlibinjector.util.Logging.Level[] values() {
                moe.yushi.authlibinjector.util.Logging$Level[] r0 = moe.yushi.authlibinjector.util.Logging.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                moe.yushi.authlibinjector.util.Logging$Level[] r0 = (moe.yushi.authlibinjector.util.Logging.Level[]) r0
                return r0
        }

        public static moe.yushi.authlibinjector.util.Logging.Level valueOf(java.lang.String r3) {
                java.lang.Class<moe.yushi.authlibinjector.util.Logging$Level> r0 = moe.yushi.authlibinjector.util.Logging.Level.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                moe.yushi.authlibinjector.util.Logging$Level r0 = (moe.yushi.authlibinjector.util.Logging.Level) r0
                return r0
        }

        Level(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ moe.yushi.authlibinjector.util.Logging.Level[] $values() {
                r0 = 4
                moe.yushi.authlibinjector.util.Logging$Level[] r0 = new moe.yushi.authlibinjector.util.Logging.Level[r0]
                r1 = r0
                r2 = 0
                moe.yushi.authlibinjector.util.Logging$Level r3 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
                r1[r2] = r3
                r1 = r0
                r2 = 1
                moe.yushi.authlibinjector.util.Logging$Level r3 = moe.yushi.authlibinjector.util.Logging.Level.INFO
                r1[r2] = r3
                r1 = r0
                r2 = 2
                moe.yushi.authlibinjector.util.Logging$Level r3 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
                r1[r2] = r3
                r1 = r0
                r2 = 3
                moe.yushi.authlibinjector.util.Logging$Level r3 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
                r1[r2] = r3
                return r0
        }

        static {
                moe.yushi.authlibinjector.util.Logging$Level r0 = new moe.yushi.authlibinjector.util.Logging$Level
                r1 = r0
                java.lang.String r2 = "DEBUG"
                r3 = 0
                r1.<init>(r2, r3)
                moe.yushi.authlibinjector.util.Logging.Level.DEBUG = r0
                moe.yushi.authlibinjector.util.Logging$Level r0 = new moe.yushi.authlibinjector.util.Logging$Level
                r1 = r0
                java.lang.String r2 = "INFO"
                r3 = 1
                r1.<init>(r2, r3)
                moe.yushi.authlibinjector.util.Logging.Level.INFO = r0
                moe.yushi.authlibinjector.util.Logging$Level r0 = new moe.yushi.authlibinjector.util.Logging$Level
                r1 = r0
                java.lang.String r2 = "WARNING"
                r3 = 2
                r1.<init>(r2, r3)
                moe.yushi.authlibinjector.util.Logging.Level.WARNING = r0
                moe.yushi.authlibinjector.util.Logging$Level r0 = new moe.yushi.authlibinjector.util.Logging$Level
                r1 = r0
                java.lang.String r2 = "ERROR"
                r3 = 3
                r1.<init>(r2, r3)
                moe.yushi.authlibinjector.util.Logging.Level.ERROR = r0
                moe.yushi.authlibinjector.util.Logging$Level[] r0 = $values()
                moe.yushi.authlibinjector.util.Logging.Level.$VALUES = r0
                return
        }
    }

    private Logging() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.nio.channels.FileChannel openLogFile() {
            java.lang.String r0 = "authlibinjector.noLogFile"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L12
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO
            java.lang.String r1 = "Logging to file is disabled"
            log(r0, r1)
            r0 = 0
            return r0
        L12:
            java.lang.String r0 = "authlib-injector.log"
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            java.nio.file.Path r0 = r0.toAbsolutePath()
            r6 = r0
            r0 = r6
            r1 = 2
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.io.IOException -> La6
            r2 = r1
            r3 = 0
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE     // Catch: java.io.IOException -> La6
            r2[r3] = r4     // Catch: java.io.IOException -> La6
            r2 = r1
            r3 = 1
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.WRITE     // Catch: java.io.IOException -> La6
            r2[r3] = r4     // Catch: java.io.IOException -> La6
            java.nio.channels.FileChannel r0 = java.nio.channels.FileChannel.open(r0, r1)     // Catch: java.io.IOException -> La6
            r7 = r0
            r0 = r7
            java.nio.channels.FileLock r0 = r0.tryLock()     // Catch: java.io.IOException -> La6
            if (r0 != 0) goto L5d
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING     // Catch: java.io.IOException -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La6
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> La6
            java.lang.String r2 = "Couldn't lock log file ["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> La6
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> La6
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> La6
            log(r0, r1)     // Catch: java.io.IOException -> La6
            r0 = 0
            return r0
        L5d:
            r0 = r7
            r1 = 0
            java.nio.channels.FileChannel r0 = r0.truncate(r1)     // Catch: java.io.IOException -> La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La6
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> La6
            java.lang.String r1 = "Logging started at "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> La6
            java.time.Instant r1 = java.time.Instant.now()     // Catch: java.io.IOException -> La6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> La6
            java.lang.String r1 = java.lang.System.lineSeparator()     // Catch: java.io.IOException -> La6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> La6
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> La6
            r8 = r0
            r0 = r7
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch: java.io.IOException -> La6
            r2 = r8
            java.nio.ByteBuffer r1 = r1.encode(r2)     // Catch: java.io.IOException -> La6
            int r0 = r0.write(r1)     // Catch: java.io.IOException -> La6
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO     // Catch: java.io.IOException -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La6
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> La6
            java.lang.String r2 = "Logging file: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> La6
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> La6
            log(r0, r1)     // Catch: java.io.IOException -> La6
            r0 = r7
            return r0
        La6:
            r7 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Couldn't open log file ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            log(r0, r1)
            r0 = 0
            return r0
    }

    public static void log(moe.yushi.authlibinjector.util.Logging.Level r4, java.lang.String r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            log(r0, r1, r2)
            return
    }

    public static void log(moe.yushi.authlibinjector.util.Logging.Level r5, java.lang.String r6, java.lang.Throwable r7) {
            r0 = r5
            moe.yushi.authlibinjector.util.Logging$Level r1 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            if (r0 != r1) goto Le
            boolean r0 = moe.yushi.authlibinjector.Config.verboseLogging
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "[authlib-injector] ["
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L6a
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r9 = r0
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r0.println()
            r0 = r7
            r1 = r10
            r0.printStackTrace(r1)
            r0 = r10
            r0.close()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
        L6a:
            java.util.regex.Pattern r0 = moe.yushi.authlibinjector.util.Logging.CONTROL_CHARACTERS_FILTER
            r1 = r8
            java.util.regex.Matcher r0 = r0.matcher(r1)
            java.lang.String r1 = ""
            java.lang.String r0 = r0.replaceAll(r1)
            r8 = r0
            java.io.PrintStream r0 = moe.yushi.authlibinjector.util.Logging.out
            r1 = r8
            r0.println(r1)
            java.nio.channels.FileChannel r0 = moe.yushi.authlibinjector.util.Logging.logfile
            if (r0 == 0) goto Lc4
            java.nio.channels.FileChannel r0 = moe.yushi.authlibinjector.util.Logging.logfile     // Catch: java.io.IOException -> La8
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch: java.io.IOException -> La8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La8
            r3 = r2
            r3.<init>()     // Catch: java.io.IOException -> La8
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> La8
            java.lang.String r3 = java.lang.System.lineSeparator()     // Catch: java.io.IOException -> La8
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> La8
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> La8
            java.nio.ByteBuffer r1 = r1.encode(r2)     // Catch: java.io.IOException -> La8
            int r0 = r0.write(r1)     // Catch: java.io.IOException -> La8
            goto Lc4
        La8:
            r9 = move-exception
            java.io.PrintStream r0 = moe.yushi.authlibinjector.util.Logging.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[authlib-injector] [ERROR] Error writing to log file: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        Lc4:
            return
    }

    static {
            java.lang.String r0 = "[\\p{Cc}&&[^\r\n\t]]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            moe.yushi.authlibinjector.util.Logging.CONTROL_CHARACTERS_FILTER = r0
            java.io.PrintStream r0 = java.lang.System.err
            moe.yushi.authlibinjector.util.Logging.out = r0
            java.nio.channels.FileChannel r0 = openLogFile()
            moe.yushi.authlibinjector.util.Logging.logfile = r0
            return
    }
}
