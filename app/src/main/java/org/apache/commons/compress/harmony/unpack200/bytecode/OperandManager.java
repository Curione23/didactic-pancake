package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class OperandManager {
    int[] bcByte;
    int bcByteIndex;
    int[] bcCaseCount;
    int bcCaseCountIndex;
    int[] bcCaseValue;
    int bcCaseValueIndex;
    int[] bcClassRef;
    int bcClassRefIndex;
    int[] bcDoubleRef;
    int bcDoubleRefIndex;
    int[] bcFieldRef;
    int bcFieldRefIndex;
    int[] bcFloatRef;
    int bcFloatRefIndex;
    int[] bcIMethodRef;
    int bcIMethodRefIndex;
    int[] bcInitRef;
    int bcInitRefIndex;
    int[] bcIntRef;
    int bcIntRefIndex;
    int[] bcLabel;
    int bcLabelIndex;
    int[] bcLocal;
    int bcLocalIndex;
    int[] bcLongRef;
    int bcLongRefIndex;
    int[] bcMethodRef;
    int bcMethodRefIndex;
    int[] bcShort;
    int bcShortIndex;
    int[] bcStringRef;
    int bcStringRefIndex;
    int[] bcSuperField;
    int bcSuperFieldIndex;
    int[] bcSuperMethod;
    int bcSuperMethodIndex;
    int[] bcThisField;
    int bcThisFieldIndex;
    int[] bcThisMethod;
    int bcThisMethodIndex;
    java.lang.String currentClass;
    java.lang.String newClass;
    org.apache.commons.compress.harmony.unpack200.Segment segment;
    java.lang.String superClass;
    int wideByteCodeIndex;
    int[] wideByteCodes;

    public OperandManager(int[] r3, int[] r4, int[] r5, int[] r6, int[] r7, int[] r8, int[] r9, int[] r10, int[] r11, int[] r12, int[] r13, int[] r14, int[] r15, int[] r16, int[] r17, int[] r18, int[] r19, int[] r20, int[] r21, int[] r22, int[] r23) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.bcCaseCount = r1
            r1 = r4
            r0.bcCaseValue = r1
            r1 = r5
            r0.bcByte = r1
            r1 = r6
            r0.bcShort = r1
            r1 = r7
            r0.bcLocal = r1
            r1 = r8
            r0.bcLabel = r1
            r1 = r9
            r0.bcIntRef = r1
            r1 = r10
            r0.bcFloatRef = r1
            r1 = r11
            r0.bcLongRef = r1
            r1 = r12
            r0.bcDoubleRef = r1
            r1 = r13
            r0.bcStringRef = r1
            r1 = r14
            r0.bcClassRef = r1
            r1 = r15
            r0.bcFieldRef = r1
            r1 = r16
            r0.bcMethodRef = r1
            r1 = r17
            r0.bcIMethodRef = r1
            r1 = r18
            r0.bcThisField = r1
            r1 = r19
            r0.bcSuperField = r1
            r1 = r20
            r0.bcThisMethod = r1
            r1 = r21
            r0.bcSuperMethod = r1
            r1 = r22
            r0.bcInitRef = r1
            r1 = r23
            r0.wideByteCodes = r1
            return
    }

    public java.lang.String getCurrentClass() {
            r2 = this;
            java.lang.String r0 = r2.currentClass
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Current class not set yet"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getNewClass() {
            r2 = this;
            java.lang.String r0 = r2.newClass
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "New class not set yet"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getSuperClass() {
            r2 = this;
            java.lang.String r0 = r2.superClass
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "SuperClass not set yet"
            r0.<init>(r1)
            throw r0
    }

    public org.apache.commons.compress.harmony.unpack200.SegmentConstantPool globalConstantPool() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r1.segment
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r0 = r0.getConstantPool()
            return r0
    }

    public int nextByte() {
            r3 = this;
            int[] r0 = r3.bcByte
            int r1 = r3.bcByteIndex
            int r2 = r1 + 1
            r3.bcByteIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextCaseCount() {
            r3 = this;
            int[] r0 = r3.bcCaseCount
            int r1 = r3.bcCaseCountIndex
            int r2 = r1 + 1
            r3.bcCaseCountIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextCaseValues() {
            r3 = this;
            int[] r0 = r3.bcCaseValue
            int r1 = r3.bcCaseValueIndex
            int r2 = r1 + 1
            r3.bcCaseValueIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextClassRef() {
            r3 = this;
            int[] r0 = r3.bcClassRef
            int r1 = r3.bcClassRefIndex
            int r2 = r1 + 1
            r3.bcClassRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextDoubleRef() {
            r3 = this;
            int[] r0 = r3.bcDoubleRef
            int r1 = r3.bcDoubleRefIndex
            int r2 = r1 + 1
            r3.bcDoubleRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextFieldRef() {
            r3 = this;
            int[] r0 = r3.bcFieldRef
            int r1 = r3.bcFieldRefIndex
            int r2 = r1 + 1
            r3.bcFieldRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextFloatRef() {
            r3 = this;
            int[] r0 = r3.bcFloatRef
            int r1 = r3.bcFloatRefIndex
            int r2 = r1 + 1
            r3.bcFloatRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextIMethodRef() {
            r3 = this;
            int[] r0 = r3.bcIMethodRef
            int r1 = r3.bcIMethodRefIndex
            int r2 = r1 + 1
            r3.bcIMethodRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextInitRef() {
            r3 = this;
            int[] r0 = r3.bcInitRef
            int r1 = r3.bcInitRefIndex
            int r2 = r1 + 1
            r3.bcInitRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextIntRef() {
            r3 = this;
            int[] r0 = r3.bcIntRef
            int r1 = r3.bcIntRefIndex
            int r2 = r1 + 1
            r3.bcIntRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextLabel() {
            r3 = this;
            int[] r0 = r3.bcLabel
            int r1 = r3.bcLabelIndex
            int r2 = r1 + 1
            r3.bcLabelIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextLocal() {
            r3 = this;
            int[] r0 = r3.bcLocal
            int r1 = r3.bcLocalIndex
            int r2 = r1 + 1
            r3.bcLocalIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextLongRef() {
            r3 = this;
            int[] r0 = r3.bcLongRef
            int r1 = r3.bcLongRefIndex
            int r2 = r1 + 1
            r3.bcLongRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextMethodRef() {
            r3 = this;
            int[] r0 = r3.bcMethodRef
            int r1 = r3.bcMethodRefIndex
            int r2 = r1 + 1
            r3.bcMethodRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextShort() {
            r3 = this;
            int[] r0 = r3.bcShort
            int r1 = r3.bcShortIndex
            int r2 = r1 + 1
            r3.bcShortIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextStringRef() {
            r3 = this;
            int[] r0 = r3.bcStringRef
            int r1 = r3.bcStringRefIndex
            int r2 = r1 + 1
            r3.bcStringRefIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextSuperFieldRef() {
            r3 = this;
            int[] r0 = r3.bcSuperField
            int r1 = r3.bcSuperFieldIndex
            int r2 = r1 + 1
            r3.bcSuperFieldIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextSuperMethodRef() {
            r3 = this;
            int[] r0 = r3.bcSuperMethod
            int r1 = r3.bcSuperMethodIndex
            int r2 = r1 + 1
            r3.bcSuperMethodIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextThisFieldRef() {
            r3 = this;
            int[] r0 = r3.bcThisField
            int r1 = r3.bcThisFieldIndex
            int r2 = r1 + 1
            r3.bcThisFieldIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextThisMethodRef() {
            r3 = this;
            int[] r0 = r3.bcThisMethod
            int r1 = r3.bcThisMethodIndex
            int r2 = r1 + 1
            r3.bcThisMethodIndex = r2
            r0 = r0[r1]
            return r0
    }

    public int nextWideByteCode() {
            r3 = this;
            int[] r0 = r3.wideByteCodes
            int r1 = r3.wideByteCodeIndex
            int r2 = r1 + 1
            r3.wideByteCodeIndex = r2
            r0 = r0[r1]
            return r0
    }

    public void setCurrentClass(java.lang.String r1) {
            r0 = this;
            r0.currentClass = r1
            return
    }

    public void setNewClass(java.lang.String r1) {
            r0 = this;
            r0.newClass = r1
            return
    }

    public void setSegment(org.apache.commons.compress.harmony.unpack200.Segment r1) {
            r0 = this;
            r0.segment = r1
            return
    }

    public void setSuperClass(java.lang.String r1) {
            r0 = this;
            r0.superClass = r1
            return
    }
}
