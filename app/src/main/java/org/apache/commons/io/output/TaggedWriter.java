package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class TaggedWriter extends org.apache.commons.io.output.ProxyWriter {
    private final java.io.Serializable tag;

    public TaggedWriter(java.io.Writer r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r0.tag = r1
            return
    }

    @Override // org.apache.commons.io.output.ProxyWriter
    protected void handleIOException(java.io.IOException r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.TaggedIOException r0 = new org.apache.commons.io.TaggedIOException
            java.io.Serializable r1 = r2.tag
            r0.<init>(r3, r1)
            throw r0
    }

    public boolean isCauseOf(java.lang.Exception r2) {
            r1 = this;
            java.io.Serializable r0 = r1.tag
            boolean r2 = org.apache.commons.io.TaggedIOException.isTaggedWith(r2, r0)
            return r2
    }

    public void throwIfCauseOf(java.lang.Exception r2) throws java.io.IOException {
            r1 = this;
            java.io.Serializable r0 = r1.tag
            org.apache.commons.io.TaggedIOException.throwCauseIfTaggedWith(r2, r0)
            return
    }
}
