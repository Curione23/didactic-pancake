package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/XMLParserConfiguration.class */
public class XMLParserConfiguration extends org.json.ParserConfiguration {
    public static final org.json.XMLParserConfiguration ORIGINAL = null;
    public static final org.json.XMLParserConfiguration KEEP_STRINGS = null;
    private java.lang.String cDataTagName;
    private boolean convertNilAttributeToNull;
    private java.util.Map<java.lang.String, org.json.XMLXsiTypeConverter<?>> xsiTypeMap;
    private java.util.Set<java.lang.String> forceList;

    public XMLParserConfiguration() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            java.lang.String r1 = "content"
            r0.cDataTagName = r1
            r0 = r3
            r1 = 0
            r0.convertNilAttributeToNull = r1
            r0 = r3
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.xsiTypeMap = r1
            r0 = r3
            java.util.Set r1 = java.util.Collections.emptySet()
            r0.forceList = r1
            return
    }

    @java.lang.Deprecated
    public XMLParserConfiguration(boolean r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "content"
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public XMLParserConfiguration(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = r6
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public XMLParserConfiguration(boolean r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 512(0x200, float:7.17E-43)
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.cDataTagName = r1
            r0 = r4
            r1 = 0
            r0.convertNilAttributeToNull = r1
            return
    }

    @java.lang.Deprecated
    public XMLParserConfiguration(boolean r5, java.lang.String r6, boolean r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 512(0x200, float:7.17E-43)
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.cDataTagName = r1
            r0 = r4
            r1 = r7
            r0.convertNilAttributeToNull = r1
            return
    }

    private XMLParserConfiguration(boolean r5, java.lang.String r6, boolean r7, java.util.Map<java.lang.String, org.json.XMLXsiTypeConverter<?>> r8, java.util.Set<java.lang.String> r9, int r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r10
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.cDataTagName = r1
            r0 = r4
            r1 = r7
            r0.convertNilAttributeToNull = r1
            r0 = r4
            r1 = r8
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.xsiTypeMap = r1
            r0 = r4
            r1 = r9
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.forceList = r1
            return
    }

    @Override // org.json.ParserConfiguration
    protected org.json.XMLParserConfiguration clone() {
            r9 = this;
            org.json.XMLParserConfiguration r0 = new org.json.XMLParserConfiguration
            r1 = r0
            r2 = r9
            boolean r2 = r2.keepStrings
            r3 = r9
            java.lang.String r3 = r3.cDataTagName
            r4 = r9
            boolean r4 = r4.convertNilAttributeToNull
            r5 = r9
            java.util.Map<java.lang.String, org.json.XMLXsiTypeConverter<?>> r5 = r5.xsiTypeMap
            r6 = r9
            java.util.Set<java.lang.String> r6 = r6.forceList
            r7 = r9
            int r7 = r7.maxNestingDepth
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // org.json.ParserConfiguration
    public org.json.XMLParserConfiguration withKeepStrings(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.ParserConfiguration r0 = super.withKeepStrings(r1)
            org.json.XMLParserConfiguration r0 = (org.json.XMLParserConfiguration) r0
            return r0
    }

    public java.lang.String getcDataTagName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.cDataTagName
            return r0
    }

    public org.json.XMLParserConfiguration withcDataTagName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            org.json.XMLParserConfiguration r0 = r0.clone()
            r5 = r0
            r0 = r5
            r1 = r4
            r0.cDataTagName = r1
            r0 = r5
            return r0
    }

    public boolean isConvertNilAttributeToNull() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.convertNilAttributeToNull
            return r0
    }

    public org.json.XMLParserConfiguration withConvertNilAttributeToNull(boolean r4) {
            r3 = this;
            r0 = r3
            org.json.XMLParserConfiguration r0 = r0.clone()
            r5 = r0
            r0 = r5
            r1 = r4
            r0.convertNilAttributeToNull = r1
            r0 = r5
            return r0
    }

    public java.util.Map<java.lang.String, org.json.XMLXsiTypeConverter<?>> getXsiTypeMap() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, org.json.XMLXsiTypeConverter<?>> r0 = r0.xsiTypeMap
            return r0
    }

    public org.json.XMLParserConfiguration withXsiTypeMap(java.util.Map<java.lang.String, org.json.XMLXsiTypeConverter<?>> r5) {
            r4 = this;
            r0 = r4
            org.json.XMLParserConfiguration r0 = r0.clone()
            r6 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = r7
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.xsiTypeMap = r1
            r0 = r6
            return r0
    }

    public java.util.Set<java.lang.String> getForceList() {
            r2 = this;
            r0 = r2
            java.util.Set<java.lang.String> r0 = r0.forceList
            return r0
    }

    public org.json.XMLParserConfiguration withForceList(java.util.Set<java.lang.String> r5) {
            r4 = this;
            r0 = r4
            org.json.XMLParserConfiguration r0 = r0.clone()
            r6 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = r7
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.forceList = r1
            r0 = r6
            return r0
    }

    @Override // org.json.ParserConfiguration
    public org.json.XMLParserConfiguration withMaxNestingDepth(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.ParserConfiguration r0 = super.withMaxNestingDepth(r1)
            org.json.XMLParserConfiguration r0 = (org.json.XMLParserConfiguration) r0
            return r0
    }

    @Override // org.json.ParserConfiguration
    public /* bridge */ /* synthetic */ org.json.ParserConfiguration withMaxNestingDepth(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.XMLParserConfiguration r0 = r0.withMaxNestingDepth(r1)
            return r0
    }

    @Override // org.json.ParserConfiguration
    public /* bridge */ /* synthetic */ org.json.ParserConfiguration withKeepStrings(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.json.XMLParserConfiguration r0 = r0.withKeepStrings(r1)
            return r0
    }

    @Override // org.json.ParserConfiguration
    protected /* bridge */ /* synthetic */ org.json.ParserConfiguration clone() {
            r2 = this;
            r0 = r2
            org.json.XMLParserConfiguration r0 = r0.clone()
            return r0
    }

    @Override // org.json.ParserConfiguration
    /* JADX INFO: renamed from: clone */
    protected /* bridge */ /* synthetic */ java.lang.Object mo2680clone() throws java.lang.CloneNotSupportedException {
            r2 = this;
            r0 = r2
            org.json.XMLParserConfiguration r0 = r0.clone()
            return r0
    }

    static {
            org.json.XMLParserConfiguration r0 = new org.json.XMLParserConfiguration
            r1 = r0
            r1.<init>()
            org.json.XMLParserConfiguration.ORIGINAL = r0
            org.json.XMLParserConfiguration r0 = new org.json.XMLParserConfiguration
            r1 = r0
            r1.<init>()
            r1 = 1
            org.json.XMLParserConfiguration r0 = r0.withKeepStrings(r1)
            org.json.XMLParserConfiguration.KEEP_STRINGS = r0
            return
    }
}
