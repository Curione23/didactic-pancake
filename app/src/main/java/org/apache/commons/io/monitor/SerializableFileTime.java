package org.apache.commons.io.monitor;

/* JADX INFO: loaded from: classes2.dex */
final class SerializableFileTime implements java.io.Serializable {
    static final org.apache.commons.io.monitor.SerializableFileTime EPOCH = null;
    private static final long serialVersionUID = 1;
    private java.nio.file.attribute.FileTime fileTime;

    static {
            org.apache.commons.io.monitor.SerializableFileTime r0 = new org.apache.commons.io.monitor.SerializableFileTime
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.EPOCH
            r0.<init>(r1)
            org.apache.commons.io.monitor.SerializableFileTime.EPOCH = r0
            return
    }

    public SerializableFileTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.nio.file.attribute.FileTime r1 = (java.nio.file.attribute.FileTime) r1
            r0.fileTime = r1
            return
    }

    private void readObject(java.io.ObjectInputStream r1) throws java.lang.ClassNotFoundException, java.io.IOException {
            r0 = this;
            java.lang.Object r1 = r1.readObject()
            java.time.Instant r1 = (java.time.Instant) r1
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.from(r1)
            r0.fileTime = r1
            return
    }

    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.fileTime
            java.time.Instant r0 = r0.toInstant()
            r2.writeObject(r0)
            return
    }

    public int compareTo(java.nio.file.attribute.FileTime r2) {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.fileTime
            int r2 = r0.compareTo(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.apache.commons.io.monitor.SerializableFileTime
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.apache.commons.io.monitor.SerializableFileTime r2 = (org.apache.commons.io.monitor.SerializableFileTime) r2
            java.nio.file.attribute.FileTime r0 = r1.fileTime
            java.nio.file.attribute.FileTime r2 = r2.fileTime
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.fileTime
            int r0 = r0.hashCode()
            return r0
    }

    long to(java.util.concurrent.TimeUnit r3) {
            r2 = this;
            java.nio.file.attribute.FileTime r0 = r2.fileTime
            long r0 = r0.to(r3)
            return r0
    }

    java.time.Instant toInstant() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.fileTime
            java.time.Instant r0 = r0.toInstant()
            return r0
    }

    long toMillis() {
            r2 = this;
            java.nio.file.attribute.FileTime r0 = r2.fileTime
            long r0 = r0.toMillis()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.fileTime
            java.lang.String r0 = r0.toString()
            return r0
    }

    java.nio.file.attribute.FileTime unwrap() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.fileTime
            return r0
    }
}
