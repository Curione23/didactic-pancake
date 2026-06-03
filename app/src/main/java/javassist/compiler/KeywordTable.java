package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/KeywordTable.class */
public final class KeywordTable extends java.util.HashMap<java.lang.String, java.lang.Integer> {
    private static final long serialVersionUID = 1;

    public KeywordTable() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public int lookup(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L16
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L17
        L16:
            r0 = -1
        L17:
            return r0
    }

    public void append(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }
}
