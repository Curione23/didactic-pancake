package org.apache.commons.lang3.exception;

/* JADX INFO: loaded from: classes2.dex */
public interface ExceptionContext {
    org.apache.commons.lang3.exception.ExceptionContext addContextValue(java.lang.String r1, java.lang.Object r2);

    java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries();

    java.util.Set<java.lang.String> getContextLabels();

    java.util.List<java.lang.Object> getContextValues(java.lang.String r1);

    java.lang.Object getFirstContextValue(java.lang.String r1);

    java.lang.String getFormattedExceptionMessage(java.lang.String r1);

    org.apache.commons.lang3.exception.ExceptionContext setContextValue(java.lang.String r1, java.lang.Object r2);
}
