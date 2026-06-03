package org.apache.commons.lang3.arch;

/* JADX INFO: loaded from: classes2.dex */
public class Processor {
    private final org.apache.commons.lang3.arch.Processor.Arch arch;
    private final org.apache.commons.lang3.arch.Processor.Type type;

    public enum Arch extends java.lang.Enum<org.apache.commons.lang3.arch.Processor.Arch> {
        private static final /* synthetic */ org.apache.commons.lang3.arch.Processor.Arch[] $VALUES = null;
        public static final org.apache.commons.lang3.arch.Processor.Arch BIT_32 = null;
        public static final org.apache.commons.lang3.arch.Processor.Arch BIT_64 = null;
        public static final org.apache.commons.lang3.arch.Processor.Arch UNKNOWN = null;
        private final java.lang.String label;

        private static /* synthetic */ org.apache.commons.lang3.arch.Processor.Arch[] $values() {
                org.apache.commons.lang3.arch.Processor$Arch r0 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
                org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
                org.apache.commons.lang3.arch.Processor$Arch r2 = org.apache.commons.lang3.arch.Processor.Arch.UNKNOWN
                org.apache.commons.lang3.arch.Processor$Arch[] r0 = new org.apache.commons.lang3.arch.Processor.Arch[]{r0, r1, r2}
                return r0
        }

        static {
                org.apache.commons.lang3.arch.Processor$Arch r0 = new org.apache.commons.lang3.arch.Processor$Arch
                r1 = 0
                java.lang.String r2 = "32-bit"
                java.lang.String r3 = "BIT_32"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Arch.BIT_32 = r0
                org.apache.commons.lang3.arch.Processor$Arch r0 = new org.apache.commons.lang3.arch.Processor$Arch
                r1 = 1
                java.lang.String r2 = "64-bit"
                java.lang.String r3 = "BIT_64"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Arch.BIT_64 = r0
                org.apache.commons.lang3.arch.Processor$Arch r0 = new org.apache.commons.lang3.arch.Processor$Arch
                r1 = 2
                java.lang.String r2 = "Unknown"
                java.lang.String r3 = "UNKNOWN"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Arch.UNKNOWN = r0
                org.apache.commons.lang3.arch.Processor$Arch[] r0 = $values()
                org.apache.commons.lang3.arch.Processor.Arch.$VALUES = r0
                return
        }

        Arch(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.label = r3
                return
        }

        public static org.apache.commons.lang3.arch.Processor.Arch valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.arch.Processor$Arch> r0 = org.apache.commons.lang3.arch.Processor.Arch.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.arch.Processor$Arch r1 = (org.apache.commons.lang3.arch.Processor.Arch) r1
                return r1
        }

        public static org.apache.commons.lang3.arch.Processor.Arch[] values() {
                org.apache.commons.lang3.arch.Processor$Arch[] r0 = org.apache.commons.lang3.arch.Processor.Arch.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.arch.Processor$Arch[] r0 = (org.apache.commons.lang3.arch.Processor.Arch[]) r0
                return r0
        }

        public java.lang.String getLabel() {
                r1 = this;
                java.lang.String r0 = r1.label
                return r0
        }
    }

    public enum Type extends java.lang.Enum<org.apache.commons.lang3.arch.Processor.Type> {
        private static final /* synthetic */ org.apache.commons.lang3.arch.Processor.Type[] $VALUES = null;
        public static final org.apache.commons.lang3.arch.Processor.Type AARCH_64 = null;
        public static final org.apache.commons.lang3.arch.Processor.Type IA_64 = null;
        public static final org.apache.commons.lang3.arch.Processor.Type PPC = null;
        public static final org.apache.commons.lang3.arch.Processor.Type RISC_V = null;
        public static final org.apache.commons.lang3.arch.Processor.Type UNKNOWN = null;
        public static final org.apache.commons.lang3.arch.Processor.Type X86 = null;
        private final java.lang.String label;

        private static /* synthetic */ org.apache.commons.lang3.arch.Processor.Type[] $values() {
                org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.AARCH_64
                org.apache.commons.lang3.arch.Processor$Type r1 = org.apache.commons.lang3.arch.Processor.Type.X86
                org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.IA_64
                org.apache.commons.lang3.arch.Processor$Type r3 = org.apache.commons.lang3.arch.Processor.Type.PPC
                org.apache.commons.lang3.arch.Processor$Type r4 = org.apache.commons.lang3.arch.Processor.Type.RISC_V
                org.apache.commons.lang3.arch.Processor$Type r5 = org.apache.commons.lang3.arch.Processor.Type.UNKNOWN
                org.apache.commons.lang3.arch.Processor$Type[] r0 = new org.apache.commons.lang3.arch.Processor.Type[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                org.apache.commons.lang3.arch.Processor$Type r0 = new org.apache.commons.lang3.arch.Processor$Type
                r1 = 0
                java.lang.String r2 = "AArch64"
                java.lang.String r3 = "AARCH_64"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Type.AARCH_64 = r0
                org.apache.commons.lang3.arch.Processor$Type r0 = new org.apache.commons.lang3.arch.Processor$Type
                r1 = 1
                java.lang.String r2 = "x86"
                java.lang.String r3 = "X86"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Type.X86 = r0
                org.apache.commons.lang3.arch.Processor$Type r0 = new org.apache.commons.lang3.arch.Processor$Type
                r1 = 2
                java.lang.String r2 = "IA-64"
                java.lang.String r3 = "IA_64"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Type.IA_64 = r0
                org.apache.commons.lang3.arch.Processor$Type r0 = new org.apache.commons.lang3.arch.Processor$Type
                java.lang.String r1 = "PPC"
                r2 = 3
                r0.<init>(r1, r2, r1)
                org.apache.commons.lang3.arch.Processor.Type.PPC = r0
                org.apache.commons.lang3.arch.Processor$Type r0 = new org.apache.commons.lang3.arch.Processor$Type
                r1 = 4
                java.lang.String r2 = "RISC-V"
                java.lang.String r3 = "RISC_V"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Type.RISC_V = r0
                org.apache.commons.lang3.arch.Processor$Type r0 = new org.apache.commons.lang3.arch.Processor$Type
                r1 = 5
                java.lang.String r2 = "Unknown"
                java.lang.String r3 = "UNKNOWN"
                r0.<init>(r3, r1, r2)
                org.apache.commons.lang3.arch.Processor.Type.UNKNOWN = r0
                org.apache.commons.lang3.arch.Processor$Type[] r0 = $values()
                org.apache.commons.lang3.arch.Processor.Type.$VALUES = r0
                return
        }

        Type(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.label = r3
                return
        }

        public static org.apache.commons.lang3.arch.Processor.Type valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.arch.Processor$Type> r0 = org.apache.commons.lang3.arch.Processor.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.arch.Processor$Type r1 = (org.apache.commons.lang3.arch.Processor.Type) r1
                return r1
        }

        public static org.apache.commons.lang3.arch.Processor.Type[] values() {
                org.apache.commons.lang3.arch.Processor$Type[] r0 = org.apache.commons.lang3.arch.Processor.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.arch.Processor$Type[] r0 = (org.apache.commons.lang3.arch.Processor.Type[]) r0
                return r0
        }

        public java.lang.String getLabel() {
                r1 = this;
                java.lang.String r0 = r1.label
                return r0
        }
    }

    public Processor(org.apache.commons.lang3.arch.Processor.Arch r1, org.apache.commons.lang3.arch.Processor.Type r2) {
            r0 = this;
            r0.<init>()
            r0.arch = r1
            r0.type = r2
            return
    }

    public org.apache.commons.lang3.arch.Processor.Arch getArch() {
            r1 = this;
            org.apache.commons.lang3.arch.Processor$Arch r0 = r1.arch
            return r0
    }

    public org.apache.commons.lang3.arch.Processor.Type getType() {
            r1 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = r1.type
            return r0
    }

    public boolean is32Bit() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Arch r0 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Arch r1 = r2.arch
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean is64Bit() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Arch r0 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Arch r1 = r2.arch
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isAarch64() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.AARCH_64
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isIA64() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.IA_64
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isPPC() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.PPC
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isRISCV() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.RISC_V
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isX86() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.X86
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.apache.commons.lang3.arch.Processor$Type r1 = r3.type
            java.lang.String r1 = r1.getLabel()
            java.lang.StringBuilder r1 = r0.append(r1)
            r2 = 32
            java.lang.StringBuilder r1 = r1.append(r2)
            org.apache.commons.lang3.arch.Processor$Arch r2 = r3.arch
            java.lang.String r2 = r2.getLabel()
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
