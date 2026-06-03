package net.sourceforge.prograde.generator;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/generator/CodesourceComparator.class */
public class CodesourceComparator implements java.util.Comparator<java.security.CodeSource> {
    public CodesourceComparator() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.security.CodeSource r4, java.security.CodeSource r5) {
            r3 = this;
            r0 = r4
            java.net.URL r0 = r0.getLocation()
            java.lang.String r0 = r0.toString()
            r1 = r5
            java.net.URL r1 = r1.getLocation()
            java.lang.String r1 = r1.toString()
            int r0 = r0.compareTo(r1)
            return r0
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.security.CodeSource r5, java.security.CodeSource r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.security.CodeSource r1 = (java.security.CodeSource) r1
            r2 = r6
            java.security.CodeSource r2 = (java.security.CodeSource) r2
            int r0 = r0.compare2(r1, r2)
            return r0
    }
}
