package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class UninitializedMessageException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final java.util.List<java.lang.String> missingFields;

    public UninitializedMessageException(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
            r0 = this;
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            r1 = 0
            r0.missingFields = r1
            return
    }

    public UninitializedMessageException(java.util.List<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = buildDescription(r2)
            r1.<init>(r0)
            r1.missingFields = r2
            return
    }

    private static java.lang.String buildDescription(java.util.List<java.lang.String> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Message missing required fields: "
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
            r1 = 1
        Lc:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r1 == 0) goto L1c
            r1 = 0
            goto L21
        L1c:
            java.lang.String r3 = ", "
            r0.append(r3)
        L21:
            r0.append(r2)
            goto Lc
        L25:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            return r0
    }

    public java.util.List<java.lang.String> getMissingFields() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.missingFields
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
