package org.apache.commons.compress.changes;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeSetResults {
    private final java.util.List<java.lang.String> addedFromChangeSet;
    private final java.util.List<java.lang.String> addedFromStream;
    private final java.util.List<java.lang.String> deleted;

    public ChangeSetResults() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.addedFromChangeSet = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.addedFromStream = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.deleted = r0
            return
    }

    void addedFromChangeSet(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.addedFromChangeSet
            r0.add(r2)
            return
    }

    void addedFromStream(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.addedFromStream
            r0.add(r2)
            return
    }

    void deleted(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.deleted
            r0.add(r2)
            return
    }

    public java.util.List<java.lang.String> getAddedFromChangeSet() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.addedFromChangeSet
            return r0
    }

    public java.util.List<java.lang.String> getAddedFromStream() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.addedFromStream
            return r0
    }

    public java.util.List<java.lang.String> getDeleted() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.deleted
            return r0
    }

    boolean hasBeenAdded(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.addedFromChangeSet
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L13
            java.util.List<java.lang.String> r0 = r1.addedFromStream
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }
}
