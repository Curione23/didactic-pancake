package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class SevenZFileOptions {
    public static final org.apache.commons.compress.archivers.sevenz.SevenZFileOptions DEFAULT = null;
    private final int maxMemoryLimitKb;
    private final boolean tryToRecoverBrokenArchives;
    private final boolean useDefaultNameForUnnamedEntries;

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.sevenz.SevenZFileOptions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private int maxMemoryLimitKb;
        private boolean tryToRecoverBrokenArchives;
        private boolean useDefaultNameForUnnamedEntries;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.maxMemoryLimitKb = r0
                r0 = 0
                r1.useDefaultNameForUnnamedEntries = r0
                r1.tryToRecoverBrokenArchives = r0
                return
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFileOptions build() {
                r5 = this;
                org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions
                int r1 = r5.maxMemoryLimitKb
                boolean r2 = r5.useDefaultNameForUnnamedEntries
                boolean r3 = r5.tryToRecoverBrokenArchives
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder withMaxMemoryLimitInKb(int r1) {
                r0 = this;
                r0.maxMemoryLimitKb = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder withTryToRecoverBrokenArchives(boolean r1) {
                r0 = this;
                r0.tryToRecoverBrokenArchives = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder withUseDefaultNameForUnnamedEntries(boolean r1) {
                r0 = this;
                r0.useDefaultNameForUnnamedEntries = r1
                return r0
        }
    }

    static {
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT = r0
            return
    }

    private SevenZFileOptions(int r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.maxMemoryLimitKb = r1
            r0.useDefaultNameForUnnamedEntries = r2
            r0.tryToRecoverBrokenArchives = r3
            return
    }

    /* synthetic */ SevenZFileOptions(int r1, boolean r2, boolean r3, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder() {
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions$Builder r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions$Builder
            r0.<init>()
            return r0
    }

    public int getMaxMemoryLimitInKb() {
            r1 = this;
            int r0 = r1.maxMemoryLimitKb
            return r0
    }

    public boolean getTryToRecoverBrokenArchives() {
            r1 = this;
            boolean r0 = r1.tryToRecoverBrokenArchives
            return r0
    }

    public boolean getUseDefaultNameForUnnamedEntries() {
            r1 = this;
            boolean r0 = r1.useDefaultNameForUnnamedEntries
            return r0
    }
}
