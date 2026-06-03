package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class IOExceptionList extends java.io.IOException implements java.lang.Iterable<java.lang.Throwable> {
    private static final long serialVersionUID = 1;
    private final java.util.List<? extends java.lang.Throwable> causeList;

    public IOExceptionList(java.lang.String r2, java.util.List<? extends java.lang.Throwable> r3) {
            r1 = this;
            if (r2 == 0) goto L3
            goto L7
        L3:
            java.lang.String r2 = toMessage(r3)
        L7:
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto Lf
            r0 = 0
            goto L16
        Lf:
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L16:
            r1.<init>(r2, r0)
            if (r3 != 0) goto L1f
            java.util.List r3 = java.util.Collections.emptyList()
        L1f:
            r1.causeList = r3
            return
    }

    public IOExceptionList(java.util.List<? extends java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = toMessage(r2)
            r1.<init>(r0, r2)
            return
    }

    public static void checkEmpty(java.util.List<? extends java.lang.Throwable> r2, java.lang.Object r3) throws org.apache.commons.io.IOExceptionList {
            boolean r0 = isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            org.apache.commons.io.IOExceptionList r0 = new org.apache.commons.io.IOExceptionList
            r1 = 0
            java.lang.String r3 = java.util.Objects.toString(r3, r1)
            r0.<init>(r3, r2)
            throw r0
    }

    private static boolean isEmpty(java.util.List<? extends java.lang.Throwable> r0) {
            int r0 = size(r0)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static int size(java.util.List<? extends java.lang.Throwable> r0) {
            if (r0 == 0) goto L7
            int r0 = r0.size()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private static java.lang.String toMessage(java.util.List<? extends java.lang.Throwable> r1) {
            int r0 = size(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "%,d exception(s): %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }

    public <T extends java.lang.Throwable> T getCause(int r2) {
            r1 = this;
            java.util.List<? extends java.lang.Throwable> r0 = r1.causeList
            java.lang.Object r2 = r0.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
    }

    public <T extends java.lang.Throwable> T getCause(int r1, java.lang.Class<T> r2) {
            r0 = this;
            java.lang.Throwable r1 = r0.getCause(r1)
            java.lang.Object r1 = r2.cast(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
    }

    public <T extends java.lang.Throwable> java.util.List<T> getCauseList() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<? extends java.lang.Throwable> r1 = r2.causeList
            r0.<init>(r1)
            return r0
    }

    public <T extends java.lang.Throwable> java.util.List<T> getCauseList(java.lang.Class<T> r2) {
            r1 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<? extends java.lang.Throwable> r0 = r1.causeList
            r2.<init>(r0)
            return r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.Throwable> iterator() {
            r1 = this;
            java.util.List r0 = r1.getCauseList()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
