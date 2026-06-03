package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class LazilyParsedNumber extends java.lang.Number {
    private final java.lang.String value;

    public LazilyParsedNumber(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    private java.math.BigDecimal asBigDecimal() {
            r1 = this;
            java.lang.String r0 = r1.value
            java.math.BigDecimal r0 = com.google.gson.internal.NumberLimits.parseBigDecimal(r0)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is unsupported"
            r2.<init>(r0)
            throw r2
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            r1 = this;
            java.math.BigDecimal r0 = r1.asBigDecimal()
            return r0
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            java.lang.String r0 = r2.value
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.gson.internal.LazilyParsedNumber
            if (r0 == 0) goto L13
            com.google.gson.internal.LazilyParsedNumber r2 = (com.google.gson.internal.LazilyParsedNumber) r2
            java.lang.String r0 = r1.value
            java.lang.String r2 = r2.value
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // java.lang.Number
    public float floatValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.value
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> L7
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> Lf
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> Lf
            int r0 = (int) r0
            return r0
        Lf:
            java.math.BigDecimal r0 = r2.asBigDecimal()
            int r0 = r0.intValue()
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            java.lang.String r0 = r2.value     // Catch: java.lang.NumberFormatException -> L7
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.math.BigDecimal r0 = r2.asBigDecimal()
            long r0 = r0.longValue()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
