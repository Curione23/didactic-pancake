package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
public class CLI {

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.sevenz.CLI$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private enum Mode extends java.lang.Enum<org.apache.commons.compress.archivers.sevenz.CLI.Mode> {
        private static final /* synthetic */ org.apache.commons.compress.archivers.sevenz.CLI.Mode[] $VALUES = null;
        public static final org.apache.commons.compress.archivers.sevenz.CLI.Mode LIST = null;
        private final java.lang.String message;


        private static /* synthetic */ org.apache.commons.compress.archivers.sevenz.CLI.Mode[] $values() {
                org.apache.commons.compress.archivers.sevenz.CLI$Mode r0 = org.apache.commons.compress.archivers.sevenz.CLI.Mode.LIST
                org.apache.commons.compress.archivers.sevenz.CLI$Mode[] r0 = new org.apache.commons.compress.archivers.sevenz.CLI.Mode[]{r0}
                return r0
        }

        static {
                org.apache.commons.compress.archivers.sevenz.CLI$Mode$1 r0 = new org.apache.commons.compress.archivers.sevenz.CLI$Mode$1
                r1 = 0
                java.lang.String r2 = "Analysing"
                java.lang.String r3 = "LIST"
                r0.<init>(r3, r1, r2)
                org.apache.commons.compress.archivers.sevenz.CLI.Mode.LIST = r0
                org.apache.commons.compress.archivers.sevenz.CLI$Mode[] r0 = $values()
                org.apache.commons.compress.archivers.sevenz.CLI.Mode.$VALUES = r0
                return
        }

        Mode(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.message = r3
                return
        }

        /* synthetic */ Mode(java.lang.String r1, int r2, java.lang.String r3, org.apache.commons.compress.archivers.sevenz.CLI.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static org.apache.commons.compress.archivers.sevenz.CLI.Mode valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.compress.archivers.sevenz.CLI$Mode> r0 = org.apache.commons.compress.archivers.sevenz.CLI.Mode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.compress.archivers.sevenz.CLI$Mode r1 = (org.apache.commons.compress.archivers.sevenz.CLI.Mode) r1
                return r1
        }

        public static org.apache.commons.compress.archivers.sevenz.CLI.Mode[] values() {
                org.apache.commons.compress.archivers.sevenz.CLI$Mode[] r0 = org.apache.commons.compress.archivers.sevenz.CLI.Mode.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.compress.archivers.sevenz.CLI$Mode[] r0 = (org.apache.commons.compress.archivers.sevenz.CLI.Mode[]) r0
                return r0
        }

        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.message
                return r0
        }

        public abstract void takeAction(org.apache.commons.compress.archivers.sevenz.SevenZFile r1, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2) throws java.io.IOException;
    }

    public CLI() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.apache.commons.compress.archivers.sevenz.CLI.Mode grabMode(java.lang.String[] r2) {
            int r0 = r2.length
            r1 = 2
            if (r0 >= r1) goto L7
            org.apache.commons.compress.archivers.sevenz.CLI$Mode r2 = org.apache.commons.compress.archivers.sevenz.CLI.Mode.LIST
            return r2
        L7:
            java.lang.Class<org.apache.commons.compress.archivers.sevenz.CLI$Mode> r0 = org.apache.commons.compress.archivers.sevenz.CLI.Mode.class
            r1 = 1
            r2 = r2[r1]
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r1)
            java.lang.Enum r2 = java.lang.Enum.valueOf(r0, r2)
            org.apache.commons.compress.archivers.sevenz.CLI$Mode r2 = (org.apache.commons.compress.archivers.sevenz.CLI.Mode) r2
            return r2
    }

    public static void main(java.lang.String[] r5) throws java.lang.Exception {
            int r0 = r5.length
            if (r0 != 0) goto L7
            usage()
            return
        L7:
            org.apache.commons.compress.archivers.sevenz.CLI$Mode r0 = grabMode(r5)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 0
            r4 = r5[r3]
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            java.io.File r1 = new java.io.File
            r5 = r5[r3]
            r1.<init>(r5)
            boolean r5 = r1.isFile()
            if (r5 != 0) goto L53
            java.io.PrintStream r5 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = " doesn't exist or is a directory"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.println(r2)
        L53:
            org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder r5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r5 = r5.setFile(r1)
            org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder r5 = (org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder) r5
            org.apache.commons.compress.archivers.sevenz.SevenZFile r5 = r5.get()
        L61:
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r1 = r5.getNextEntry()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L6b
            r0.takeAction(r5, r1)     // Catch: java.lang.Throwable -> L71
            goto L61
        L6b:
            if (r5 == 0) goto L70
            r5.close()
        L70:
            return
        L71:
            r0 = move-exception
            if (r5 == 0) goto L7c
            r5.close()     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r5 = move-exception
            r0.addSuppressed(r5)
        L7c:
            throw r0
    }

    private static void usage() {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Parameters: archive-name [list]"
            r0.println(r1)
            return
    }
}
