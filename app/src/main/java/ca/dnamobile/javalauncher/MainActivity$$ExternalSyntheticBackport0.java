package ca.dnamobile.javalauncher;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticBackport0 {
    public static /* synthetic */ boolean m(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L19
            int r3 = r5.codePointAt(r2)
            boolean r4 = java.lang.Character.isWhitespace(r3)
            if (r4 != 0) goto L13
            return r1
        L13:
            int r3 = java.lang.Character.charCount(r3)
            int r2 = r2 + r3
            goto L6
        L19:
            r5 = 1
            return r5
    }
}
