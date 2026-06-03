package org.json;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:org/json/JSONException.class */
public class JSONException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 0;

    public JSONException(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public JSONException(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public JSONException(java.lang.Throwable r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getMessage()
            r2 = r5
            r0.<init>(r1, r2)
            return
    }
}
