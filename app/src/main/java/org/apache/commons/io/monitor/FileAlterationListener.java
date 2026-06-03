package org.apache.commons.io.monitor;

/* JADX INFO: loaded from: classes2.dex */
public interface FileAlterationListener {
    void onDirectoryChange(java.io.File r1);

    void onDirectoryCreate(java.io.File r1);

    void onDirectoryDelete(java.io.File r1);

    void onFileChange(java.io.File r1);

    void onFileCreate(java.io.File r1);

    void onFileDelete(java.io.File r1);

    void onStart(org.apache.commons.io.monitor.FileAlterationObserver r1);

    void onStop(org.apache.commons.io.monitor.FileAlterationObserver r1);
}
