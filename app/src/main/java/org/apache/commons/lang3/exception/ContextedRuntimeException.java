package org.apache.commons.lang3.exception;

/* JADX INFO: loaded from: classes2.dex */
public class ContextedRuntimeException extends java.lang.RuntimeException implements org.apache.commons.lang3.exception.ExceptionContext {
    private static final long serialVersionUID = 20110706;
    private final org.apache.commons.lang3.exception.ExceptionContext exceptionContext;

    public ContextedRuntimeException() {
            r1 = this;
            r1.<init>()
            org.apache.commons.lang3.exception.DefaultExceptionContext r0 = new org.apache.commons.lang3.exception.DefaultExceptionContext
            r0.<init>()
            r1.exceptionContext = r0
            return
    }

    public ContextedRuntimeException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            org.apache.commons.lang3.exception.DefaultExceptionContext r1 = new org.apache.commons.lang3.exception.DefaultExceptionContext
            r1.<init>()
            r0.exceptionContext = r1
            return
    }

    public ContextedRuntimeException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            org.apache.commons.lang3.exception.DefaultExceptionContext r1 = new org.apache.commons.lang3.exception.DefaultExceptionContext
            r1.<init>()
            r0.exceptionContext = r1
            return
    }

    public ContextedRuntimeException(java.lang.String r1, java.lang.Throwable r2, org.apache.commons.lang3.exception.ExceptionContext r3) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 != 0) goto La
            org.apache.commons.lang3.exception.DefaultExceptionContext r3 = new org.apache.commons.lang3.exception.DefaultExceptionContext
            r3.<init>()
        La:
            r0.exceptionContext = r3
            return
    }

    public ContextedRuntimeException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            org.apache.commons.lang3.exception.DefaultExceptionContext r1 = new org.apache.commons.lang3.exception.DefaultExceptionContext
            r1.<init>()
            r0.exceptionContext = r1
            return
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public org.apache.commons.lang3.exception.ContextedRuntimeException addContextValue(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.lang3.exception.ExceptionContext r0 = r1.exceptionContext
            r0.addContextValue(r2, r3)
            return r1
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.exception.ExceptionContext addContextValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            org.apache.commons.lang3.exception.ContextedRuntimeException r1 = r0.addContextValue(r1, r2)
            return r1
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
            r1 = this;
            org.apache.commons.lang3.exception.ExceptionContext r0 = r1.exceptionContext
            java.util.List r0 = r0.getContextEntries()
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.Set<java.lang.String> getContextLabels() {
            r1 = this;
            org.apache.commons.lang3.exception.ExceptionContext r0 = r1.exceptionContext
            java.util.Set r0 = r0.getContextLabels()
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.util.List<java.lang.Object> getContextValues(java.lang.String r2) {
            r1 = this;
            org.apache.commons.lang3.exception.ExceptionContext r0 = r1.exceptionContext
            java.util.List r2 = r0.getContextValues(r2)
            return r2
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.lang.Object getFirstContextValue(java.lang.String r2) {
            r1 = this;
            org.apache.commons.lang3.exception.ExceptionContext r0 = r1.exceptionContext
            java.lang.Object r2 = r0.getFirstContextValue(r2)
            return r2
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public java.lang.String getFormattedExceptionMessage(java.lang.String r2) {
            r1 = this;
            org.apache.commons.lang3.exception.ExceptionContext r0 = r1.exceptionContext
            java.lang.String r2 = r0.getFormattedExceptionMessage(r2)
            return r2
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = super.getMessage()
            java.lang.String r0 = r1.getFormattedExceptionMessage(r0)
            return r0
    }

    public java.lang.String getRawMessage() {
            r1 = this;
            java.lang.String r0 = super.getMessage()
            return r0
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public org.apache.commons.lang3.exception.ContextedRuntimeException setContextValue(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.lang3.exception.ExceptionContext r0 = r1.exceptionContext
            r0.setContextValue(r2, r3)
            return r1
    }

    @Override // org.apache.commons.lang3.exception.ExceptionContext
    public /* bridge */ /* synthetic */ org.apache.commons.lang3.exception.ExceptionContext setContextValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            org.apache.commons.lang3.exception.ContextedRuntimeException r1 = r0.setContextValue(r1, r2)
            return r1
    }
}
