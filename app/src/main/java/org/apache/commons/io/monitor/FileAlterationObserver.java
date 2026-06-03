package org.apache.commons.io.monitor;

/* JADX INFO: loaded from: classes2.dex */
public class FileAlterationObserver implements java.io.Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final java.util.Comparator<java.io.File> comparator;
    private final transient java.io.FileFilter fileFilter;
    private final transient java.util.List<org.apache.commons.io.monitor.FileAlterationListener> listeners;
    private final org.apache.commons.io.monitor.FileEntry rootEntry;

    /* JADX INFO: renamed from: org.apache.commons.io.monitor.FileAlterationObserver$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$io$IOCase = null;

        static {
                org.apache.commons.io.IOCase[] r0 = org.apache.commons.io.IOCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.io.monitor.FileAlterationObserver.AnonymousClass1.$SwitchMap$org$apache$commons$io$IOCase = r0
                org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.SYSTEM     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.io.monitor.FileAlterationObserver.AnonymousClass1.$SwitchMap$org$apache$commons$io$IOCase     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.INSENSITIVE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$4i7LXVdy_8VMAS2oB7MOo7Fq3k4(org.apache.commons.io.monitor.FileAlterationObserver r0, org.apache.commons.io.monitor.FileEntry r1) {
            r0.fireOnCreate(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$JAdsFmxoSUL1HbrcvD-rWBLAaTc, reason: not valid java name */
    public static /* synthetic */ boolean m2638$r8$lambda$JAdsFmxoSUL1HbrcvDrWBLAaTc(org.apache.commons.io.monitor.FileAlterationListener r0, java.lang.Object r1) {
            boolean r0 = r0.equals(r1)
            return r0
    }

    public FileAlterationObserver(java.io.File r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FileAlterationObserver(java.io.File r2, java.io.FileFilter r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FileAlterationObserver(java.io.File r2, java.io.FileFilter r3, org.apache.commons.io.IOCase r4) {
            r1 = this;
            org.apache.commons.io.monitor.FileEntry r0 = new org.apache.commons.io.monitor.FileEntry
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    public FileAlterationObserver(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public FileAlterationObserver(java.lang.String r2, java.io.FileFilter r3) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    public FileAlterationObserver(java.lang.String r2, java.io.FileFilter r3, org.apache.commons.io.IOCase r4) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    private FileAlterationObserver(org.apache.commons.io.monitor.FileEntry r3, java.io.FileFilter r4, java.util.Comparator<java.io.File> r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.listeners = r0
            java.lang.String r0 = "rootEntry"
            java.util.Objects.requireNonNull(r3, r0)
            java.io.File r0 = r3.getFile()
            java.lang.String r1 = "rootEntry.getFile()"
            java.util.Objects.requireNonNull(r0, r1)
            r2.rootEntry = r3
            if (r4 == 0) goto L1d
            goto L1f
        L1d:
            org.apache.commons.io.filefilter.IOFileFilter r4 = org.apache.commons.io.filefilter.TrueFileFilter.INSTANCE
        L1f:
            r2.fileFilter = r4
            java.lang.String r3 = "comparator"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r5, r3)
            java.util.Comparator r3 = (java.util.Comparator) r3
            r2.comparator = r3
            return
    }

    protected FileAlterationObserver(org.apache.commons.io.monitor.FileEntry r1, java.io.FileFilter r2, org.apache.commons.io.IOCase r3) {
            r0 = this;
            java.util.Comparator r3 = toComparator(r3)
            r0.<init>(r1, r2, r3)
            return
    }

    private void checkAndFire(org.apache.commons.io.monitor.FileEntry r9, org.apache.commons.io.monitor.FileEntry[] r10, java.io.File[] r11) {
            r8 = this;
            int r0 = r11.length
            if (r0 <= 0) goto L7
            int r0 = r11.length
            org.apache.commons.io.monitor.FileEntry[] r0 = new org.apache.commons.io.monitor.FileEntry[r0]
            goto L9
        L7:
            org.apache.commons.io.monitor.FileEntry[] r0 = org.apache.commons.io.monitor.FileEntry.EMPTY_FILE_ENTRY_ARRAY
        L9:
            int r1 = r10.length
            r2 = 0
            r3 = r2
        Lc:
            if (r2 >= r1) goto L66
            r4 = r10[r2]
        L10:
            int r5 = r11.length
            if (r3 >= r5) goto L2f
            java.util.Comparator<java.io.File> r5 = r8.comparator
            java.io.File r6 = r4.getFile()
            r7 = r11[r3]
            int r5 = r5.compare(r6, r7)
            if (r5 <= 0) goto L2f
            r5 = r11[r3]
            org.apache.commons.io.monitor.FileEntry r5 = r8.createFileEntry(r9, r5)
            r0[r3] = r5
            r8.fireOnCreate(r5)
            int r3 = r3 + 1
            goto L10
        L2f:
            int r5 = r11.length
            if (r3 >= r5) goto L57
            java.util.Comparator<java.io.File> r5 = r8.comparator
            java.io.File r6 = r4.getFile()
            r7 = r11[r3]
            int r5 = r5.compare(r6, r7)
            if (r5 != 0) goto L57
            r5 = r11[r3]
            r8.fireOnChange(r4, r5)
            org.apache.commons.io.monitor.FileEntry[] r5 = r4.getChildren()
            r6 = r11[r3]
            java.io.File[] r6 = r8.listFiles(r6)
            r8.checkAndFire(r4, r5, r6)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L63
        L57:
            org.apache.commons.io.monitor.FileEntry[] r5 = r4.getChildren()
            java.io.File[] r6 = org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY
            r8.checkAndFire(r4, r5, r6)
            r8.fireOnDelete(r4)
        L63:
            int r2 = r2 + 1
            goto Lc
        L66:
            int r10 = r11.length
            if (r3 >= r10) goto L77
            r10 = r11[r3]
            org.apache.commons.io.monitor.FileEntry r10 = r8.createFileEntry(r9, r10)
            r0[r3] = r10
            r8.fireOnCreate(r10)
            int r3 = r3 + 1
            goto L66
        L77:
            r9.setChildren(r0)
            return
    }

    private org.apache.commons.io.monitor.FileEntry createFileEntry(org.apache.commons.io.monitor.FileEntry r1, java.io.File r2) {
            r0 = this;
            org.apache.commons.io.monitor.FileEntry r1 = r1.newChildInstance(r2)
            r1.refresh(r2)
            org.apache.commons.io.monitor.FileEntry[] r2 = r0.listFileEntries(r2, r1)
            r1.setChildren(r2)
            return r1
    }

    private void fireOnChange(org.apache.commons.io.monitor.FileEntry r3, java.io.File r4) {
            r2 = this;
            boolean r0 = r3.refresh(r4)
            if (r0 == 0) goto L10
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r0 = r2.listeners
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda1 r1 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda1
            r1.<init>(r3, r4)
            r0.forEach(r1)
        L10:
            return
    }

    private void fireOnCreate(org.apache.commons.io.monitor.FileEntry r3) {
            r2 = this;
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r0 = r2.listeners
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda4 r1 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda4
            r1.<init>(r3)
            r0.forEach(r1)
            org.apache.commons.io.monitor.FileEntry[] r3 = r3.getChildren()
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda5
            r0.<init>(r2)
            r3.forEach(r0)
            return
    }

    private void fireOnDelete(org.apache.commons.io.monitor.FileEntry r3) {
            r2 = this;
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r0 = r2.listeners
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda8 r1 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda8
            r1.<init>(r3)
            r0.forEach(r1)
            return
    }

    static /* synthetic */ void lambda$fireOnChange$2(org.apache.commons.io.monitor.FileEntry r0, java.io.File r1, org.apache.commons.io.monitor.FileAlterationListener r2) {
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto La
            r2.onDirectoryChange(r1)
            goto Ld
        La:
            r2.onFileChange(r1)
        Ld:
            return
    }

    static /* synthetic */ void lambda$fireOnCreate$3(org.apache.commons.io.monitor.FileEntry r1, org.apache.commons.io.monitor.FileAlterationListener r2) {
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto Le
            java.io.File r1 = r1.getFile()
            r2.onDirectoryCreate(r1)
            goto L15
        Le:
            java.io.File r1 = r1.getFile()
            r2.onFileCreate(r1)
        L15:
            return
    }

    static /* synthetic */ void lambda$fireOnDelete$4(org.apache.commons.io.monitor.FileEntry r1, org.apache.commons.io.monitor.FileAlterationListener r2) {
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto Le
            java.io.File r1 = r1.getFile()
            r2.onDirectoryDelete(r1)
            goto L15
        Le:
            java.io.File r1 = r1.getFile()
            r2.onFileDelete(r1)
        L15:
            return
    }

    static /* synthetic */ org.apache.commons.io.monitor.FileEntry[] lambda$listFileEntries$6(int r0) {
            org.apache.commons.io.monitor.FileEntry[] r0 = new org.apache.commons.io.monitor.FileEntry[r0]
            return r0
    }

    private org.apache.commons.io.monitor.FileEntry[] listFileEntries(java.io.File r2, org.apache.commons.io.monitor.FileEntry r3) {
            r1 = this;
            java.io.File[] r2 = r1.listFiles(r2)
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda2
            r0.<init>(r1, r3)
            java.util.stream.Stream r2 = r2.map(r0)
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda3 r3 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda3
            r3.<init>()
            java.lang.Object[] r2 = r2.toArray(r3)
            org.apache.commons.io.monitor.FileEntry[] r2 = (org.apache.commons.io.monitor.FileEntry[]) r2
            return r2
    }

    private java.io.File[] listFiles(java.io.File r2) {
            r1 = this;
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L11
            java.io.FileFilter r0 = r1.fileFilter
            java.io.File[] r2 = r2.listFiles(r0)
            java.io.File[] r2 = r1.sort(r2)
            goto L13
        L11:
            java.io.File[] r2 = org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY
        L13:
            return r2
    }

    private java.io.File[] sort(java.io.File[] r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.io.File[] r3 = org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY
            return r3
        L5:
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto Le
            java.util.Comparator<java.io.File> r0 = r2.comparator
            java.util.Arrays.sort(r3, r0)
        Le:
            return r3
    }

    private static java.util.Comparator<java.io.File> toComparator(org.apache.commons.io.IOCase r2) {
            int[] r0 = org.apache.commons.io.monitor.FileAlterationObserver.AnonymousClass1.$SwitchMap$org$apache$commons$io$IOCase
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.SYSTEM
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.value(r2, r1)
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1a
            r0 = 2
            if (r2 == r0) goto L17
            java.util.Comparator<java.io.File> r2 = org.apache.commons.io.comparator.NameFileComparator.NAME_COMPARATOR
            return r2
        L17:
            java.util.Comparator<java.io.File> r2 = org.apache.commons.io.comparator.NameFileComparator.NAME_INSENSITIVE_COMPARATOR
            return r2
        L1a:
            java.util.Comparator<java.io.File> r2 = org.apache.commons.io.comparator.NameFileComparator.NAME_SYSTEM_COMPARATOR
            return r2
    }

    public void addListener(org.apache.commons.io.monitor.FileAlterationListener r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r0 = r1.listeners
            r0.add(r2)
        L7:
            return
    }

    public void checkAndNotify() {
            r3 = this;
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r0 = r3.listeners
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda6 r1 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda6
            r1.<init>(r3)
            r0.forEach(r1)
            org.apache.commons.io.monitor.FileEntry r0 = r3.rootEntry
            java.io.File r0 = r0.getFile()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L24
            org.apache.commons.io.monitor.FileEntry r1 = r3.rootEntry
            org.apache.commons.io.monitor.FileEntry[] r2 = r1.getChildren()
            java.io.File[] r0 = r3.listFiles(r0)
            r3.checkAndFire(r1, r2, r0)
            goto L37
        L24:
            org.apache.commons.io.monitor.FileEntry r0 = r3.rootEntry
            boolean r0 = r0.isExists()
            if (r0 == 0) goto L37
            org.apache.commons.io.monitor.FileEntry r0 = r3.rootEntry
            org.apache.commons.io.monitor.FileEntry[] r1 = r0.getChildren()
            java.io.File[] r2 = org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY
            r3.checkAndFire(r0, r1, r2)
        L37:
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r0 = r3.listeners
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda7 r1 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda7
            r1.<init>(r3)
            r0.forEach(r1)
            return
    }

    public void destroy() throws java.lang.Exception {
            r0 = this;
            return
    }

    public java.io.File getDirectory() {
            r1 = this;
            org.apache.commons.io.monitor.FileEntry r0 = r1.rootEntry
            java.io.File r0 = r0.getFile()
            return r0
    }

    public java.io.FileFilter getFileFilter() {
            r1 = this;
            java.io.FileFilter r0 = r1.fileFilter
            return r0
    }

    public java.lang.Iterable<org.apache.commons.io.monitor.FileAlterationListener> getListeners() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r1 = r2.listeners
            r0.<init>(r1)
            return r0
    }

    public void initialize() throws java.lang.Exception {
            r3 = this;
            org.apache.commons.io.monitor.FileEntry r0 = r3.rootEntry
            java.io.File r1 = r0.getFile()
            r0.refresh(r1)
            org.apache.commons.io.monitor.FileEntry r0 = r3.rootEntry
            java.io.File r1 = r0.getFile()
            org.apache.commons.io.monitor.FileEntry r2 = r3.rootEntry
            org.apache.commons.io.monitor.FileEntry[] r1 = r3.listFileEntries(r1, r2)
            r0.setChildren(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$checkAndNotify$0$org-apache-commons-io-monitor-FileAlterationObserver, reason: not valid java name */
    /* synthetic */ void m2639x2d975733(org.apache.commons.io.monitor.FileAlterationListener r1) {
            r0 = this;
            r1.onStart(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$checkAndNotify$1$org-apache-commons-io-monitor-FileAlterationObserver, reason: not valid java name */
    /* synthetic */ void m2640x47b2d5d2(org.apache.commons.io.monitor.FileAlterationListener r1) {
            r0 = this;
            r1.onStop(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$listFileEntries$5$org-apache-commons-io-monitor-FileAlterationObserver, reason: not valid java name */
    /* synthetic */ org.apache.commons.io.monitor.FileEntry m2641xd1c1b90a(org.apache.commons.io.monitor.FileEntry r1, java.io.File r2) {
            r0 = this;
            org.apache.commons.io.monitor.FileEntry r1 = r0.createFileEntry(r1, r2)
            return r1
    }

    public void removeListener(org.apache.commons.io.monitor.FileAlterationListener r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r0 = r2.listeners
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.removeIf(r1)
        Lf:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "[file='"
            r0.append(r1)
            java.io.File r1 = r2.getDirectory()
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = "', "
            r0.append(r1)
            java.io.FileFilter r1 = r2.fileFilter
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", listeners="
            r0.append(r1)
            java.util.List<org.apache.commons.io.monitor.FileAlterationListener> r1 = r2.listeners
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
