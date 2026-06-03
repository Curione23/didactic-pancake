package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CompositeFormat extends java.text.Format {
    private static final long serialVersionUID = -4329119827877627683L;
    private final java.text.Format formatter;
    private final java.text.Format parser;

    public CompositeFormat(java.text.Format r1, java.text.Format r2) {
            r0 = this;
            r0.<init>()
            r0.parser = r1
            r0.formatter = r2
            return
    }

    @Override // java.text.Format
    public java.lang.StringBuffer format(java.lang.Object r2, java.lang.StringBuffer r3, java.text.FieldPosition r4) {
            r1 = this;
            java.text.Format r0 = r1.formatter
            java.lang.StringBuffer r2 = r0.format(r2, r3, r4)
            return r2
    }

    public java.text.Format getFormatter() {
            r1 = this;
            java.text.Format r0 = r1.formatter
            return r0
    }

    public java.text.Format getParser() {
            r1 = this;
            java.text.Format r0 = r1.parser
            return r0
    }

    @Override // java.text.Format
    public java.lang.Object parseObject(java.lang.String r2, java.text.ParsePosition r3) {
            r1 = this;
            java.text.Format r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2, r3)
            return r2
    }

    public java.lang.String reformat(java.lang.String r1) throws java.text.ParseException {
            r0 = this;
            java.lang.Object r1 = r0.parseObject(r1)
            java.lang.String r1 = r0.format(r1)
            return r1
    }
}
