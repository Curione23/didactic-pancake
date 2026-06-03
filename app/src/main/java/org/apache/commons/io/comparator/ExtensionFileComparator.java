package org.apache.commons.io.comparator;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionFileComparator extends org.apache.commons.io.comparator.AbstractFileComparator implements java.io.Serializable {
    public static final java.util.Comparator<java.io.File> EXTENSION_COMPARATOR = null;
    public static final java.util.Comparator<java.io.File> EXTENSION_INSENSITIVE_COMPARATOR = null;
    public static final java.util.Comparator<java.io.File> EXTENSION_INSENSITIVE_REVERSE = null;
    public static final java.util.Comparator<java.io.File> EXTENSION_REVERSE = null;
    public static final java.util.Comparator<java.io.File> EXTENSION_SYSTEM_COMPARATOR = null;
    public static final java.util.Comparator<java.io.File> EXTENSION_SYSTEM_REVERSE = null;
    private static final long serialVersionUID = 1928235200184222815L;
    private final org.apache.commons.io.IOCase ioCase;

    static {
            org.apache.commons.io.comparator.ExtensionFileComparator r0 = new org.apache.commons.io.comparator.ExtensionFileComparator
            r0.<init>()
            org.apache.commons.io.comparator.ExtensionFileComparator.EXTENSION_COMPARATOR = r0
            org.apache.commons.io.comparator.ReverseFileComparator r1 = new org.apache.commons.io.comparator.ReverseFileComparator
            r1.<init>(r0)
            org.apache.commons.io.comparator.ExtensionFileComparator.EXTENSION_REVERSE = r1
            org.apache.commons.io.comparator.ExtensionFileComparator r0 = new org.apache.commons.io.comparator.ExtensionFileComparator
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.INSENSITIVE
            r0.<init>(r1)
            org.apache.commons.io.comparator.ExtensionFileComparator.EXTENSION_INSENSITIVE_COMPARATOR = r0
            org.apache.commons.io.comparator.ReverseFileComparator r1 = new org.apache.commons.io.comparator.ReverseFileComparator
            r1.<init>(r0)
            org.apache.commons.io.comparator.ExtensionFileComparator.EXTENSION_INSENSITIVE_REVERSE = r1
            org.apache.commons.io.comparator.ExtensionFileComparator r0 = new org.apache.commons.io.comparator.ExtensionFileComparator
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.SYSTEM
            r0.<init>(r1)
            org.apache.commons.io.comparator.ExtensionFileComparator.EXTENSION_SYSTEM_COMPARATOR = r0
            org.apache.commons.io.comparator.ReverseFileComparator r1 = new org.apache.commons.io.comparator.ReverseFileComparator
            r1.<init>(r0)
            org.apache.commons.io.comparator.ExtensionFileComparator.EXTENSION_SYSTEM_REVERSE = r1
            return
    }

    public ExtensionFileComparator() {
            r1 = this;
            r1.<init>()
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.ioCase = r0
            return
    }

    public ExtensionFileComparator(org.apache.commons.io.IOCase r2) {
            r1 = this;
            r1.<init>()
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.value(r2, r0)
            r1.ioCase = r2
            return
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.io.File r2, java.io.File r3) {
            r1 = this;
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = org.apache.commons.io.FilenameUtils.getExtension(r2)
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = org.apache.commons.io.FilenameUtils.getExtension(r3)
            org.apache.commons.io.IOCase r0 = r1.ioCase
            int r2 = r0.checkCompareTo(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            java.io.File r2 = (java.io.File) r2
            int r1 = r0.compare2(r1, r2)
            return r1
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ java.util.List sort(java.util.List r1) {
            r0 = this;
            java.util.List r1 = super.sort(r1)
            return r1
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ java.io.File[] sort(java.io.File[] r1) {
            r0 = this;
            java.io.File[] r1 = super.sort(r1)
            return r1
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[ioCase="
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.io.IOCase r1 = r2.ioCase
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
