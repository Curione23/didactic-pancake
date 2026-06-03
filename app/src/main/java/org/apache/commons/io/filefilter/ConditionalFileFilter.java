package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public interface ConditionalFileFilter {
    void addFileFilter(org.apache.commons.io.filefilter.IOFileFilter r1);

    java.util.List<org.apache.commons.io.filefilter.IOFileFilter> getFileFilters();

    boolean removeFileFilter(org.apache.commons.io.filefilter.IOFileFilter r1);

    void setFileFilters(java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r1);
}
