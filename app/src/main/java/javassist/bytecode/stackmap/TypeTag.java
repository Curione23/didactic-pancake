package javassist.bytecode.stackmap;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeTag.class */
public interface TypeTag {
    public static final java.lang.String TOP_TYPE = "*top*";
    public static final javassist.bytecode.stackmap.TypeData.BasicType TOP = null;
    public static final javassist.bytecode.stackmap.TypeData.BasicType INTEGER = null;
    public static final javassist.bytecode.stackmap.TypeData.BasicType FLOAT = null;
    public static final javassist.bytecode.stackmap.TypeData.BasicType DOUBLE = null;
    public static final javassist.bytecode.stackmap.TypeData.BasicType LONG = null;

    static {
            javassist.bytecode.stackmap.TypeData$BasicType r0 = new javassist.bytecode.stackmap.TypeData$BasicType
            r1 = r0
            java.lang.String r2 = "*top*"
            r3 = 0
            r4 = 32
            r1.<init>(r2, r3, r4)
            javassist.bytecode.stackmap.TypeTag.TOP = r0
            javassist.bytecode.stackmap.TypeData$BasicType r0 = new javassist.bytecode.stackmap.TypeData$BasicType
            r1 = r0
            java.lang.String r2 = "int"
            r3 = 1
            r4 = 73
            r1.<init>(r2, r3, r4)
            javassist.bytecode.stackmap.TypeTag.INTEGER = r0
            javassist.bytecode.stackmap.TypeData$BasicType r0 = new javassist.bytecode.stackmap.TypeData$BasicType
            r1 = r0
            java.lang.String r2 = "float"
            r3 = 2
            r4 = 70
            r1.<init>(r2, r3, r4)
            javassist.bytecode.stackmap.TypeTag.FLOAT = r0
            javassist.bytecode.stackmap.TypeData$BasicType r0 = new javassist.bytecode.stackmap.TypeData$BasicType
            r1 = r0
            java.lang.String r2 = "double"
            r3 = 3
            r4 = 68
            r1.<init>(r2, r3, r4)
            javassist.bytecode.stackmap.TypeTag.DOUBLE = r0
            javassist.bytecode.stackmap.TypeData$BasicType r0 = new javassist.bytecode.stackmap.TypeData$BasicType
            r1 = r0
            java.lang.String r2 = "long"
            r3 = 4
            r4 = 74
            r1.<init>(r2, r3, r4)
            javassist.bytecode.stackmap.TypeTag.LONG = r0
            return
    }
}
