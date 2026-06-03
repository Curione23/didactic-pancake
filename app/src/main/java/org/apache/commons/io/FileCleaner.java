package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class FileCleaner {
    private static final org.apache.commons.io.FileCleaningTracker INSTANCE = null;

    static {
            org.apache.commons.io.FileCleaningTracker r0 = new org.apache.commons.io.FileCleaningTracker
            r0.<init>()
            org.apache.commons.io.FileCleaner.INSTANCE = r0
            return
    }

    public FileCleaner() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static synchronized void exitWhenFinished() {
            java.lang.Class<org.apache.commons.io.FileCleaner> r0 = org.apache.commons.io.FileCleaner.class
            monitor-enter(r0)
            org.apache.commons.io.FileCleaningTracker r1 = org.apache.commons.io.FileCleaner.INSTANCE     // Catch: java.lang.Throwable -> La
            r1.exitWhenFinished()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public static org.apache.commons.io.FileCleaningTracker getInstance() {
            org.apache.commons.io.FileCleaningTracker r0 = org.apache.commons.io.FileCleaner.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static int getTrackCount() {
            org.apache.commons.io.FileCleaningTracker r0 = org.apache.commons.io.FileCleaner.INSTANCE
            int r0 = r0.getTrackCount()
            return r0
    }

    @java.lang.Deprecated
    public static void track(java.io.File r1, java.lang.Object r2) {
            org.apache.commons.io.FileCleaningTracker r0 = org.apache.commons.io.FileCleaner.INSTANCE
            r0.track(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void track(java.io.File r1, java.lang.Object r2, org.apache.commons.io.FileDeleteStrategy r3) {
            org.apache.commons.io.FileCleaningTracker r0 = org.apache.commons.io.FileCleaner.INSTANCE
            r0.track(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public static void track(java.lang.String r1, java.lang.Object r2) {
            org.apache.commons.io.FileCleaningTracker r0 = org.apache.commons.io.FileCleaner.INSTANCE
            r0.track(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void track(java.lang.String r1, java.lang.Object r2, org.apache.commons.io.FileDeleteStrategy r3) {
            org.apache.commons.io.FileCleaningTracker r0 = org.apache.commons.io.FileCleaner.INSTANCE
            r0.track(r1, r2, r3)
            return
    }
}
