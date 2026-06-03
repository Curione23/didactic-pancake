package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public enum StandardDeleteOption extends java.lang.Enum<org.apache.commons.io.file.StandardDeleteOption> implements org.apache.commons.io.file.DeleteOption {
    private static final /* synthetic */ org.apache.commons.io.file.StandardDeleteOption[] $VALUES = null;
    public static final org.apache.commons.io.file.StandardDeleteOption OVERRIDE_READ_ONLY = null;

    private static /* synthetic */ org.apache.commons.io.file.StandardDeleteOption[] $values() {
            org.apache.commons.io.file.StandardDeleteOption r0 = org.apache.commons.io.file.StandardDeleteOption.OVERRIDE_READ_ONLY
            org.apache.commons.io.file.StandardDeleteOption[] r0 = new org.apache.commons.io.file.StandardDeleteOption[]{r0}
            return r0
    }

    static {
            org.apache.commons.io.file.StandardDeleteOption r0 = new org.apache.commons.io.file.StandardDeleteOption
            java.lang.String r1 = "OVERRIDE_READ_ONLY"
            r2 = 0
            r0.<init>(r1, r2)
            org.apache.commons.io.file.StandardDeleteOption.OVERRIDE_READ_ONLY = r0
            org.apache.commons.io.file.StandardDeleteOption[] r0 = $values()
            org.apache.commons.io.file.StandardDeleteOption.$VALUES = r0
            return
    }

    StandardDeleteOption(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ boolean lambda$overrideReadOnly$0(org.apache.commons.io.file.DeleteOption r1) {
            org.apache.commons.io.file.StandardDeleteOption r0 = org.apache.commons.io.file.StandardDeleteOption.OVERRIDE_READ_ONLY
            if (r0 != r1) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean overrideReadOnly(org.apache.commons.io.file.DeleteOption[] r1) {
            int r0 = org.apache.commons.io.IOUtils.length(r1)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            org.apache.commons.io.file.StandardDeleteOption$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.file.StandardDeleteOption$$ExternalSyntheticLambda0
            r0.<init>()
            boolean r1 = r1.anyMatch(r0)
            return r1
    }

    public static org.apache.commons.io.file.StandardDeleteOption valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.io.file.StandardDeleteOption> r0 = org.apache.commons.io.file.StandardDeleteOption.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.io.file.StandardDeleteOption r1 = (org.apache.commons.io.file.StandardDeleteOption) r1
            return r1
    }

    public static org.apache.commons.io.file.StandardDeleteOption[] values() {
            org.apache.commons.io.file.StandardDeleteOption[] r0 = org.apache.commons.io.file.StandardDeleteOption.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.io.file.StandardDeleteOption[] r0 = (org.apache.commons.io.file.StandardDeleteOption[]) r0
            return r0
    }
}
