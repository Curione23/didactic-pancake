package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/ParserConfiguration.class */
public class ParserConfiguration {
    public static final int UNDEFINED_MAXIMUM_NESTING_DEPTH = -1;
    public static final int DEFAULT_MAXIMUM_NESTING_DEPTH = 512;
    protected boolean keepStrings;
    protected int maxNestingDepth;

    public ParserConfiguration() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.keepStrings = r1
            r0 = r3
            r1 = 512(0x200, float:7.17E-43)
            r0.maxNestingDepth = r1
            return
    }

    protected ParserConfiguration(boolean r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.keepStrings = r1
            r0 = r3
            r1 = r5
            r0.maxNestingDepth = r1
            return
    }

    protected org.json.ParserConfiguration clone() {
            r5 = this;
            org.json.ParserConfiguration r0 = new org.json.ParserConfiguration
            r1 = r0
            r2 = r5
            boolean r2 = r2.keepStrings
            r3 = r5
            int r3 = r3.maxNestingDepth
            r1.<init>(r2, r3)
            return r0
    }

    public boolean isKeepStrings() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.keepStrings
            return r0
    }

    public <T extends org.json.ParserConfiguration> T withKeepStrings(boolean r4) {
            r3 = this;
            r0 = r3
            org.json.ParserConfiguration r0 = r0.clone()
            r5 = r0
            r0 = r5
            r1 = r4
            r0.keepStrings = r1
            r0 = r5
            return r0
    }

    public int getMaxNestingDepth() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxNestingDepth
            return r0
    }

    public <T extends org.json.ParserConfiguration> T withMaxNestingDepth(int r4) {
            r3 = this;
            r0 = r3
            org.json.ParserConfiguration r0 = r0.clone()
            r5 = r0
            r0 = r4
            r1 = -1
            if (r0 <= r1) goto L12
            r0 = r5
            r1 = r4
            r0.maxNestingDepth = r1
            goto L17
        L12:
            r0 = r5
            r1 = -1
            r0.maxNestingDepth = r1
        L17:
            r0 = r5
            return r0
    }

    /* JADX INFO: renamed from: clone */
    protected /* bridge */ /* synthetic */ java.lang.Object mo2680clone() throws java.lang.CloneNotSupportedException {
            r2 = this;
            r0 = r2
            org.json.ParserConfiguration r0 = r0.clone()
            return r0
    }
}
