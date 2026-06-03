package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONMLParserConfiguration.class */
public class JSONMLParserConfiguration extends org.json.ParserConfiguration {
    public static final int DEFAULT_MAXIMUM_NESTING_DEPTH = 512;
    public static final org.json.JSONMLParserConfiguration ORIGINAL = null;
    public static final org.json.JSONMLParserConfiguration KEEP_STRINGS = null;

    public JSONMLParserConfiguration() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 512(0x200, float:7.17E-43)
            r0.maxNestingDepth = r1
            return
    }

    protected JSONMLParserConfiguration(boolean r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // org.json.ParserConfiguration
    protected org.json.JSONMLParserConfiguration clone() {
            r5 = this;
            org.json.JSONMLParserConfiguration r0 = new org.json.JSONMLParserConfiguration
            r1 = r0
            r2 = r5
            boolean r2 = r2.keepStrings
            r3 = r5
            int r3 = r3.maxNestingDepth
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.json.ParserConfiguration
    public org.json.JSONMLParserConfiguration withKeepStrings(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.ParserConfiguration r0 = super.withKeepStrings(r1)
            org.json.JSONMLParserConfiguration r0 = (org.json.JSONMLParserConfiguration) r0
            return r0
    }

    @Override // org.json.ParserConfiguration
    public org.json.JSONMLParserConfiguration withMaxNestingDepth(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.ParserConfiguration r0 = super.withMaxNestingDepth(r1)
            org.json.JSONMLParserConfiguration r0 = (org.json.JSONMLParserConfiguration) r0
            return r0
    }

    @Override // org.json.ParserConfiguration
    public /* bridge */ /* synthetic */ org.json.ParserConfiguration withMaxNestingDepth(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.JSONMLParserConfiguration r0 = r0.withMaxNestingDepth(r1)
            return r0
    }

    @Override // org.json.ParserConfiguration
    public /* bridge */ /* synthetic */ org.json.ParserConfiguration withKeepStrings(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.JSONMLParserConfiguration r0 = r0.withKeepStrings(r1)
            return r0
    }

    @Override // org.json.ParserConfiguration
    protected /* bridge */ /* synthetic */ org.json.ParserConfiguration clone() {
            r2 = this;
            r0 = r2
            org.json.JSONMLParserConfiguration r0 = r0.clone()
            return r0
    }

    @Override // org.json.ParserConfiguration
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    protected /* bridge */ /* synthetic */ java.lang.Object mo2680clone() throws java.lang.CloneNotSupportedException {
            r2 = this;
            r0 = r2
            org.json.JSONMLParserConfiguration r0 = r0.clone()
            return r0
    }

    static {
            org.json.JSONMLParserConfiguration r0 = new org.json.JSONMLParserConfiguration
            r1 = r0
            r1.<init>()
            org.json.JSONMLParserConfiguration.ORIGINAL = r0
            org.json.JSONMLParserConfiguration r0 = new org.json.JSONMLParserConfiguration
            r1 = r0
            r1.<init>()
            r1 = 1
            org.json.JSONMLParserConfiguration r0 = r0.withKeepStrings(r1)
            org.json.JSONMLParserConfiguration.KEEP_STRINGS = r0
            return
    }
}
