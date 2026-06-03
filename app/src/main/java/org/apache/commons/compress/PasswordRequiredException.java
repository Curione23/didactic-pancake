package org.apache.commons.compress;

/* JADX INFO: loaded from: classes2.dex */
public class PasswordRequiredException extends java.io.IOException {
    private static final long serialVersionUID = 1391070005491684483L;

    public PasswordRequiredException(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot read encrypted content from "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " without a password."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            return
    }
}
