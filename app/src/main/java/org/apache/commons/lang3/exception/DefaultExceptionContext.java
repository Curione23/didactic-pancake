package org.apache.commons.lang3.exception;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultExceptionContext implements org.apache.commons.lang3.exception.ExceptionContext, java.io.Serializable {
    private static final long serialVersionUID = 20110706;
    private final java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> contextValues;

    public DefaultExceptionContext() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.contextValues = r0
            return
    }

    static /* synthetic */ boolean lambda$getContextValues$0(java.lang.String r0, org.apache.commons.lang3.tuple.Pair r1) {
            java.lang.Object r1 = r1.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = org.apache.commons.lang3.StringUtils.equals(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$getFirstContextValue$1(java.lang.String r0, org.apache.commons.lang3.tuple.Pair r1) {
            java.lang.Object r1 = r1.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = org.apache.commons.lang3.StringUtils.equals(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$setContextValue$2(java.lang.String r0, org.apache.commons.lang3.tuple.Pair r1) {
            java.lang.Object r1 = r1.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = org.apache.commons.lang3.StringUtils.equals(r0, r1)
            return r0
    }

    private java.util.stream.Stream<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> stream() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r1.contextValues
            java.util.stream.Stream r0 = r0.stream()
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public org.apache.commons.lang3.exception.DefaultExceptionContext addContextValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r2.contextValues
            org.apache.commons.lang3.tuple.ImmutablePair r1 = new org.apache.commons.lang3.tuple.ImmutablePair
            r1.<init>(r3, r4)
            r0.add(r1)
            return r2
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.exception.ExceptionContext addContextValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            org.apache.commons.lang3.exception.DefaultExceptionContext r1 = r0.addContextValue(r1, r2)
            return r1
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
            r1 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r1.contextValues
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.Set<java.lang.String> getContextLabels() {
            r2 = this;
            java.util.stream.Stream r0 = r2.stream()
            org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda3 r1 = new org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda3
            r1.<init>()
            java.util.stream.Stream r0 = r0.map(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toSet()
            java.lang.Object r0 = r0.collect(r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.List<java.lang.Object> getContextValues(java.lang.String r3) {
            r2 = this;
            java.util.stream.Stream r0 = r2.stream()
            org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda0
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.filter(r1)
            org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda1
            r0.<init>()
            java.util.stream.Stream r3 = r3.map(r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r3 = r3.collect(r0)
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.lang.Object getFirstContextValue(java.lang.String r3) {
            r2 = this;
            java.util.stream.Stream r0 = r2.stream()
            org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda4 r1 = new org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda4
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.filter(r1)
            java.util.Optional r3 = r3.findFirst()
            org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda1
            r0.<init>()
            java.util.Optional r3 = r3.map(r0)
            r0 = 0
            java.lang.Object r3 = r3.orElse(r0)
            return r3
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.lang.String getFormattedExceptionMessage(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            if (r5 == 0) goto Lc
            r0.append(r5)
        Lc:
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r5 = r4.contextValues
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L78
            int r5 = r0.length()
            if (r5 <= 0) goto L1f
            r5 = 10
            r0.append(r5)
        L1f:
            java.lang.String r5 = "Exception Context:\n"
            r0.append(r5)
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r5 = r4.contextValues
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L2b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r5.next()
            org.apache.commons.lang3.tuple.Pair r2 = (org.apache.commons.lang3.tuple.Pair) r2
            java.lang.String r3 = "\t["
            r0.append(r3)
            int r1 = r1 + 1
            r0.append(r1)
            r3 = 58
            r0.append(r3)
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = "="
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.util.Objects.toString(r2)     // Catch: java.lang.Exception -> L60
            r0.append(r2)     // Catch: java.lang.Exception -> L60
            goto L6d
        L60:
            r2 = move-exception
            java.lang.String r3 = "Exception thrown on toString(): "
            r0.append(r3)
            java.lang.String r2 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(r2)
            r0.append(r2)
        L6d:
            java.lang.String r2 = "]\n"
            r0.append(r2)
            goto L2b
        L73:
            java.lang.String r5 = "---------------------------------"
            r0.append(r5)
        L78:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public org.apache.commons.lang3.exception.DefaultExceptionContext setContextValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> r0 = r2.contextValues
            org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda2 r1 = new org.apache.commons.lang3.exception.DefaultExceptionContext$$ExternalSyntheticLambda2
            r1.<init>(r3)
            r0.removeIf(r1)
            r2.addContextValue(r3, r4)
            return r2
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.exception.ExceptionContext setContextValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            org.apache.commons.lang3.exception.DefaultExceptionContext r1 = r0.setContextValue(r1, r2)
            return r1
    }
}
