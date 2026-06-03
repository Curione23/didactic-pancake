package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/TypeReference.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/TypeReference.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/TypeReference.class */
public class TypeReference {
    public static final int CLASS_TYPE_PARAMETER = 0;
    public static final int METHOD_TYPE_PARAMETER = 1;
    public static final int CLASS_EXTENDS = 16;
    public static final int CLASS_TYPE_PARAMETER_BOUND = 17;
    public static final int METHOD_TYPE_PARAMETER_BOUND = 18;
    public static final int FIELD = 19;
    public static final int METHOD_RETURN = 20;
    public static final int METHOD_RECEIVER = 21;
    public static final int METHOD_FORMAL_PARAMETER = 22;
    public static final int THROWS = 23;
    public static final int LOCAL_VARIABLE = 64;
    public static final int RESOURCE_VARIABLE = 65;
    public static final int EXCEPTION_PARAMETER = 66;
    public static final int INSTANCEOF = 67;
    public static final int NEW = 68;
    public static final int CONSTRUCTOR_REFERENCE = 69;
    public static final int METHOD_REFERENCE = 70;
    public static final int CAST = 71;
    public static final int CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT = 72;
    public static final int METHOD_INVOCATION_TYPE_ARGUMENT = 73;
    public static final int CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT = 74;
    public static final int METHOD_REFERENCE_TYPE_ARGUMENT = 75;
    private int a;

    public TypeReference(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.a = r1
            return
    }

    public static org.objectweb.asm.TypeReference newTypeReference(int r5) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r5
            r3 = 24
            int r2 = r2 << r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTypeParameterReference(int r6, int r7) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r6
            r3 = 24
            int r2 = r2 << r3
            r3 = r7
            r4 = 16
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTypeParameterBoundReference(int r6, int r7, int r8) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r6
            r3 = 24
            int r2 = r2 << r3
            r3 = r7
            r4 = 16
            int r3 = r3 << r4
            r2 = r2 | r3
            r3 = r8
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newSuperTypeReference(int r6) {
            r0 = r6
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r6 = r0
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r6
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newFormalParameterReference(int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 369098752(0x16000000, float:1.0339758E-25)
            r3 = r6
            r4 = 16
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newExceptionReference(int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 385875968(0x17000000, float:4.135903E-25)
            r3 = r6
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTryCatchReference(int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = 1107296256(0x42000000, float:32.0)
            r3 = r6
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public static org.objectweb.asm.TypeReference newTypeArgumentReference(int r5, int r6) {
            org.objectweb.asm.TypeReference r0 = new org.objectweb.asm.TypeReference
            r1 = r0
            r2 = r5
            r3 = 24
            int r2 = r2 << r3
            r3 = r6
            r2 = r2 | r3
            r1.<init>(r2)
            return r0
    }

    public int getSort() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public int getTypeParameterIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >> r1
            return r0
    }

    public int getTypeParameterBoundIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            return r0
    }

    public int getSuperTypeIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            short r0 = (short) r0
            return r0
    }

    public int getFormalParameterIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            r1 = 16
            int r0 = r0 >> r1
            return r0
    }

    public int getExceptionIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            return r0
    }

    public int getTryCatchBlockIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 16776960(0xffff00, float:2.3509528E-38)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 >> r1
            return r0
    }

    public int getTypeArgumentIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.a
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public int getValue() {
            r2 = this;
            r0 = r2
            int r0 = r0.a
            return r0
    }
}
