package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONStringer.class */
public class JSONStringer extends org.json.JSONWriter {
    public JSONStringer() {
            r4 = this;
            r0 = r4
            java.io.StringWriter r1 = new java.io.StringWriter
            r2 = r1
            r2.<init>()
            r0.<init>(r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            char r0 = r0.mode
            r1 = 100
            if (r0 != r1) goto L13
            r0 = r3
            java.lang.Appendable r0 = r0.writer
            java.lang.String r0 = r0.toString()
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }
}
