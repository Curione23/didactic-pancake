package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteCodeForm {
    protected static final boolean WIDENED = true;
    protected static final org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm[] byteCodeArray = null;
    protected static final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm> byteCodesByName = null;
    private int firstOperandIndex;
    private final java.lang.String name;
    private final int opcode;
    private int operandLength;
    private final int[] rewrite;

    static {
            r0 = 256(0x100, float:3.59E-43)
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm.byteCodeArray = r0
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm.byteCodesByName = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            java.lang.String r2 = "nop"
            r3 = 0
            r1.<init>(r3, r2)
            r0[r3] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            java.lang.String r2 = "aconst_null"
            r4 = 1
            r1.<init>(r4, r2)
            r0[r4] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 2
            java.lang.String r5 = "iconst_m1"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 3
            java.lang.String r5 = "iconst_0"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 4
            java.lang.String r5 = "iconst_1"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 5
            java.lang.String r5 = "iconst_2"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 6
            java.lang.String r5 = "iconst_3"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 7
            java.lang.String r5 = "iconst_4"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 8
            java.lang.String r5 = "iconst_5"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 9
            java.lang.String r5 = "lconst_0"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 10
            java.lang.String r5 = "lconst_1"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 11
            java.lang.String r5 = "fconst_0"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 12
            java.lang.String r5 = "fconst_1"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 13
            java.lang.String r5 = "fconst_2"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 14
            java.lang.String r5 = "dconst_0"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 15
            java.lang.String r5 = "dconst_1"
            r1.<init>(r2, r5)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm
            r2 = 16
            r5 = -1
            int[] r6 = new int[]{r2, r5}
            java.lang.String r7 = "bipush"
            r1.<init>(r2, r7, r6)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm
            java.lang.String r2 = "sipush"
            r6 = 17
            int[] r7 = new int[]{r6, r5, r5}
            r1.<init>(r6, r2, r7)
            r0[r6] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm
            java.lang.String r2 = "ldc"
            r6 = 18
            int[] r7 = new int[]{r6, r5}
            r1.<init>(r6, r2, r7)
            r0[r6] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm
            java.lang.String r2 = "ldc_w"
            r7 = 19
            int[] r8 = new int[]{r7, r5, r5}
            r1.<init>(r7, r2, r8, r4)
            r0[r7] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm
            java.lang.String r2 = "ldc2_w"
            r8 = 20
            int[] r9 = new int[]{r8, r5, r5}
            r1.<init>(r8, r2, r9)
            r0[r8] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            java.lang.String r2 = "iload"
            r9 = 21
            int[] r10 = new int[]{r9, r5}
            r1.<init>(r9, r2, r10)
            r0[r9] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            java.lang.String r2 = "lload"
            r9 = 22
            int[] r10 = new int[]{r9, r5}
            r1.<init>(r9, r2, r10)
            r0[r9] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            java.lang.String r2 = "fload"
            r9 = 23
            int[] r10 = new int[]{r9, r5}
            r1.<init>(r9, r2, r10)
            r0[r9] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            java.lang.String r2 = "dload"
            r9 = 24
            int[] r10 = new int[]{r9, r5}
            r1.<init>(r9, r2, r10)
            r0[r9] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            java.lang.String r2 = "aload"
            r9 = 25
            int[] r10 = new int[]{r9, r5}
            r1.<init>(r9, r2, r10)
            r0[r9] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 26
            java.lang.String r9 = "iload_0"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 27
            java.lang.String r9 = "iload_1"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 28
            java.lang.String r9 = "iload_2"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 29
            java.lang.String r9 = "iload_3"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 30
            java.lang.String r9 = "lload_0"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 31
            java.lang.String r9 = "lload_1"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 32
            java.lang.String r9 = "lload_2"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 33
            java.lang.String r9 = "lload_3"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 34
            java.lang.String r9 = "fload_0"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 35
            java.lang.String r9 = "fload_1"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 36
            java.lang.String r9 = "fload_2"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 37
            java.lang.String r9 = "fload_3"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 38
            java.lang.String r9 = "dload_0"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 39
            java.lang.String r9 = "dload_1"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 40
            java.lang.String r9 = "dload_2"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 41
            java.lang.String r9 = "dload_3"
            r1.<init>(r2, r9)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            java.lang.String r2 = "aload_0"
            r9 = 42
            r1.<init>(r9, r2)
            r0[r9] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 43
            java.lang.String r10 = "aload_1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 44
            java.lang.String r10 = "aload_2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 45
            java.lang.String r10 = "aload_3"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 46
            java.lang.String r10 = "iaload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 47
            java.lang.String r10 = "laload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 48
            java.lang.String r10 = "faload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 49
            java.lang.String r10 = "daload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 50
            java.lang.String r10 = "aaload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 51
            java.lang.String r10 = "baload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 52
            java.lang.String r10 = "caload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 53
            java.lang.String r10 = "saload"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            java.lang.String r2 = "istore"
            r10 = 54
            int[] r11 = new int[]{r10, r5}
            r1.<init>(r10, r2, r11)
            r0[r10] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            r2 = 55
            int[] r2 = new int[]{r2, r5}
            r10 = 55
            java.lang.String r11 = "lstore"
            r1.<init>(r10, r11, r2)
            r2 = 55
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            r2 = 56
            int[] r2 = new int[]{r2, r5}
            r10 = 56
            java.lang.String r11 = "fstore"
            r1.<init>(r10, r11, r2)
            r2 = 56
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            r2 = 57
            int[] r2 = new int[]{r2, r5}
            r10 = 57
            java.lang.String r11 = "dstore"
            r1.<init>(r10, r11, r2)
            r2 = 57
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            r2 = 58
            int[] r2 = new int[]{r2, r5}
            r10 = 58
            java.lang.String r11 = "astore"
            r1.<init>(r10, r11, r2)
            r2 = 58
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 59
            java.lang.String r10 = "istore_0"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 60
            java.lang.String r10 = "istore_1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 61
            java.lang.String r10 = "istore_2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 62
            java.lang.String r10 = "istore_3"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 63
            java.lang.String r10 = "lstore_0"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 64
            java.lang.String r10 = "lstore_1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 65
            java.lang.String r10 = "lstore_2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 66
            java.lang.String r10 = "lstore_3"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 67
            java.lang.String r10 = "fstore_0"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 68
            java.lang.String r10 = "fstore_1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 69
            java.lang.String r10 = "fstore_2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 70
            java.lang.String r10 = "fstore_3"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 71
            java.lang.String r10 = "dstore_0"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 72
            java.lang.String r10 = "dstore_1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 73
            java.lang.String r10 = "dstore_2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 74
            java.lang.String r10 = "dstore_3"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 75
            java.lang.String r10 = "astore_0"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 76
            java.lang.String r10 = "astore_1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 77
            java.lang.String r10 = "astore_2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 78
            java.lang.String r10 = "astore_3"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 79
            java.lang.String r10 = "iastore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 80
            java.lang.String r10 = "lastore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 81
            java.lang.String r10 = "fastore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 82
            java.lang.String r10 = "dastore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 83
            java.lang.String r10 = "aastore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 84
            java.lang.String r10 = "bastore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 85
            java.lang.String r10 = "castore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 86
            java.lang.String r10 = "sastore"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 87
            java.lang.String r10 = "pop"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 88
            java.lang.String r10 = "pop2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 89
            java.lang.String r10 = "dup"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 90
            java.lang.String r10 = "dup_x1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 91
            java.lang.String r10 = "dup_x2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 92
            java.lang.String r10 = "dup2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 93
            java.lang.String r10 = "dup2_x1"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 94
            java.lang.String r10 = "dup2_x2"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 95
            java.lang.String r10 = "swap"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 96
            java.lang.String r10 = "iadd"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 97
            java.lang.String r10 = "ladd"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 98
            java.lang.String r10 = "fadd"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 99
            java.lang.String r10 = "dadd"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 100
            java.lang.String r10 = "isub"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r10 = "lsub"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r10 = "fsub"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 103(0x67, float:1.44E-43)
            java.lang.String r10 = "dsub"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 104(0x68, float:1.46E-43)
            java.lang.String r10 = "imul"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 105(0x69, float:1.47E-43)
            java.lang.String r10 = "lmul"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 106(0x6a, float:1.49E-43)
            java.lang.String r10 = "fmul"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 107(0x6b, float:1.5E-43)
            java.lang.String r10 = "dmul"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 108(0x6c, float:1.51E-43)
            java.lang.String r10 = "idiv"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 109(0x6d, float:1.53E-43)
            java.lang.String r10 = "ldiv"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 110(0x6e, float:1.54E-43)
            java.lang.String r10 = "fdiv"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 111(0x6f, float:1.56E-43)
            java.lang.String r10 = "ddiv"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 112(0x70, float:1.57E-43)
            java.lang.String r10 = "irem"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 113(0x71, float:1.58E-43)
            java.lang.String r10 = "lrem"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 114(0x72, float:1.6E-43)
            java.lang.String r10 = "frem"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 115(0x73, float:1.61E-43)
            java.lang.String r10 = "drem"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r10 = ""
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 117(0x75, float:1.64E-43)
            java.lang.String r10 = "lneg"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 118(0x76, float:1.65E-43)
            java.lang.String r10 = "fneg"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 119(0x77, float:1.67E-43)
            java.lang.String r10 = "dneg"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 120(0x78, float:1.68E-43)
            java.lang.String r10 = "ishl"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 121(0x79, float:1.7E-43)
            java.lang.String r10 = "lshl"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 122(0x7a, float:1.71E-43)
            java.lang.String r10 = "ishr"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 123(0x7b, float:1.72E-43)
            java.lang.String r10 = "lshr"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 124(0x7c, float:1.74E-43)
            java.lang.String r10 = "iushr"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r10 = "lushr"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 126(0x7e, float:1.77E-43)
            java.lang.String r10 = "iand"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 127(0x7f, float:1.78E-43)
            java.lang.String r10 = "land"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 128(0x80, float:1.8E-43)
            java.lang.String r10 = "ior"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 129(0x81, float:1.81E-43)
            java.lang.String r10 = "lor"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 130(0x82, float:1.82E-43)
            java.lang.String r10 = "ixor"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 131(0x83, float:1.84E-43)
            java.lang.String r10 = "lxor"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm
            r2 = 132(0x84, float:1.85E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 132(0x84, float:1.85E-43)
            java.lang.String r11 = "iinc"
            r1.<init>(r10, r11, r2)
            r2 = 132(0x84, float:1.85E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 133(0x85, float:1.86E-43)
            java.lang.String r10 = "i2l"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 134(0x86, float:1.88E-43)
            java.lang.String r10 = "i2f"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 135(0x87, float:1.89E-43)
            java.lang.String r10 = "i2d"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 136(0x88, float:1.9E-43)
            java.lang.String r10 = "l2i"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 137(0x89, float:1.92E-43)
            java.lang.String r10 = "l2f"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 138(0x8a, float:1.93E-43)
            java.lang.String r10 = "l2d"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 139(0x8b, float:1.95E-43)
            java.lang.String r10 = "f2i"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 140(0x8c, float:1.96E-43)
            java.lang.String r10 = "f2l"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 141(0x8d, float:1.98E-43)
            java.lang.String r10 = "f2d"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 142(0x8e, float:1.99E-43)
            java.lang.String r10 = "d2i"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 143(0x8f, float:2.0E-43)
            java.lang.String r10 = "d2l"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 144(0x90, float:2.02E-43)
            java.lang.String r10 = "d2f"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 145(0x91, float:2.03E-43)
            java.lang.String r10 = "i2b"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 146(0x92, float:2.05E-43)
            java.lang.String r10 = "i2c"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 147(0x93, float:2.06E-43)
            java.lang.String r10 = "i2s"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 148(0x94, float:2.07E-43)
            java.lang.String r10 = "lcmp"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 149(0x95, float:2.09E-43)
            java.lang.String r10 = "fcmpl"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 150(0x96, float:2.1E-43)
            java.lang.String r10 = "fcmpg"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 151(0x97, float:2.12E-43)
            java.lang.String r10 = "dcmpl"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 152(0x98, float:2.13E-43)
            java.lang.String r10 = "dcmpg"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 153(0x99, float:2.14E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 153(0x99, float:2.14E-43)
            java.lang.String r11 = "ifeq"
            r1.<init>(r10, r11, r2)
            r2 = 153(0x99, float:2.14E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 154(0x9a, float:2.16E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 154(0x9a, float:2.16E-43)
            java.lang.String r11 = "ifne"
            r1.<init>(r10, r11, r2)
            r2 = 154(0x9a, float:2.16E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 155(0x9b, float:2.17E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 155(0x9b, float:2.17E-43)
            java.lang.String r11 = "iflt"
            r1.<init>(r10, r11, r2)
            r2 = 155(0x9b, float:2.17E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 156(0x9c, float:2.19E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 156(0x9c, float:2.19E-43)
            java.lang.String r11 = "ifge"
            r1.<init>(r10, r11, r2)
            r2 = 156(0x9c, float:2.19E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 157(0x9d, float:2.2E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 157(0x9d, float:2.2E-43)
            java.lang.String r11 = "ifgt"
            r1.<init>(r10, r11, r2)
            r2 = 157(0x9d, float:2.2E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 158(0x9e, float:2.21E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 158(0x9e, float:2.21E-43)
            java.lang.String r11 = "ifle"
            r1.<init>(r10, r11, r2)
            r2 = 158(0x9e, float:2.21E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 159(0x9f, float:2.23E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 159(0x9f, float:2.23E-43)
            java.lang.String r11 = "if_icmpeq"
            r1.<init>(r10, r11, r2)
            r2 = 159(0x9f, float:2.23E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 160(0xa0, float:2.24E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 160(0xa0, float:2.24E-43)
            java.lang.String r11 = "if_icmpne"
            r1.<init>(r10, r11, r2)
            r2 = 160(0xa0, float:2.24E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 161(0xa1, float:2.26E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 161(0xa1, float:2.26E-43)
            java.lang.String r11 = "if_icmplt"
            r1.<init>(r10, r11, r2)
            r2 = 161(0xa1, float:2.26E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 162(0xa2, float:2.27E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 162(0xa2, float:2.27E-43)
            java.lang.String r11 = "if_icmpge"
            r1.<init>(r10, r11, r2)
            r2 = 162(0xa2, float:2.27E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 163(0xa3, float:2.28E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 163(0xa3, float:2.28E-43)
            java.lang.String r11 = "if_icmpgt"
            r1.<init>(r10, r11, r2)
            r2 = 163(0xa3, float:2.28E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 164(0xa4, float:2.3E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 164(0xa4, float:2.3E-43)
            java.lang.String r11 = "if_icmple"
            r1.<init>(r10, r11, r2)
            r2 = 164(0xa4, float:2.3E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 165(0xa5, float:2.31E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 165(0xa5, float:2.31E-43)
            java.lang.String r11 = "if_acmpeq"
            r1.<init>(r10, r11, r2)
            r2 = 165(0xa5, float:2.31E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 166(0xa6, float:2.33E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 166(0xa6, float:2.33E-43)
            java.lang.String r11 = "if_acmpne"
            r1.<init>(r10, r11, r2)
            r2 = 166(0xa6, float:2.33E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 167(0xa7, float:2.34E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 167(0xa7, float:2.34E-43)
            java.lang.String r11 = "goto"
            r1.<init>(r10, r11, r2)
            r2 = 167(0xa7, float:2.34E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 168(0xa8, float:2.35E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r10 = 168(0xa8, float:2.35E-43)
            java.lang.String r11 = "jsr"
            r1.<init>(r10, r11, r2)
            r2 = 168(0xa8, float:2.35E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm
            r2 = 169(0xa9, float:2.37E-43)
            int[] r2 = new int[]{r2, r5}
            r10 = 169(0xa9, float:2.37E-43)
            java.lang.String r11 = "ret"
            r1.<init>(r10, r11, r2)
            r2 = 169(0xa9, float:2.37E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm
            r2 = 170(0xaa, float:2.38E-43)
            java.lang.String r10 = "tableswitch"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm
            r2 = 171(0xab, float:2.4E-43)
            java.lang.String r10 = "lookupswitch"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 172(0xac, float:2.41E-43)
            java.lang.String r10 = "ireturn"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 173(0xad, float:2.42E-43)
            java.lang.String r10 = "lreturn"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 174(0xae, float:2.44E-43)
            java.lang.String r10 = "freturn"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 175(0xaf, float:2.45E-43)
            java.lang.String r10 = "dreturn"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 176(0xb0, float:2.47E-43)
            java.lang.String r10 = "areturn"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 177(0xb1, float:2.48E-43)
            java.lang.String r10 = "return"
            r1.<init>(r2, r10)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm
            java.lang.String r2 = "getstatic"
            r10 = 178(0xb2, float:2.5E-43)
            int[] r11 = new int[]{r10, r5, r5}
            r1.<init>(r10, r2, r11)
            r0[r10] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm
            java.lang.String r2 = "putstatic"
            r11 = 179(0xb3, float:2.51E-43)
            int[] r12 = new int[]{r11, r5, r5}
            r1.<init>(r11, r2, r12)
            r0[r11] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm
            java.lang.String r2 = "getfield"
            r12 = 180(0xb4, float:2.52E-43)
            int[] r13 = new int[]{r12, r5, r5}
            r1.<init>(r12, r2, r13)
            r0[r12] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm
            java.lang.String r2 = "putfield"
            r13 = 181(0xb5, float:2.54E-43)
            int[] r14 = new int[]{r13, r5, r5}
            r1.<init>(r13, r2, r14)
            r0[r13] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm
            java.lang.String r2 = "invokevirtual"
            r14 = 182(0xb6, float:2.55E-43)
            int[] r15 = new int[]{r14, r5, r5}
            r1.<init>(r14, r2, r15)
            r0[r14] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm
            java.lang.String r2 = "invokespecial"
            r15 = 183(0xb7, float:2.56E-43)
            int[] r8 = new int[]{r15, r5, r5}
            r1.<init>(r15, r2, r8)
            r0[r15] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm
            java.lang.String r2 = "invokestatic"
            r8 = 184(0xb8, float:2.58E-43)
            int[] r7 = new int[]{r8, r5, r5}
            r1.<init>(r8, r2, r7)
            r0[r8] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm
            r2 = 185(0xb9, float:2.59E-43)
            int[] r2 = new int[]{r2, r5, r5, r5, r3}
            r7 = 185(0xb9, float:2.59E-43)
            java.lang.String r3 = "invokeinterface"
            r1.<init>(r7, r3, r2)
            r2 = 185(0xb9, float:2.59E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 186(0xba, float:2.6E-43)
            java.lang.String r3 = "xxxunusedxxx"
            r1.<init>(r2, r3)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm
            r2 = 187(0xbb, float:2.62E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r3 = 187(0xbb, float:2.62E-43)
            java.lang.String r7 = "new"
            r1.<init>(r3, r7, r2)
            r2 = 187(0xbb, float:2.62E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm
            r2 = 188(0xbc, float:2.63E-43)
            int[] r2 = new int[]{r2, r5}
            r3 = 188(0xbc, float:2.63E-43)
            java.lang.String r7 = "newarray"
            r1.<init>(r3, r7, r2)
            r2 = 188(0xbc, float:2.63E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm
            r2 = 189(0xbd, float:2.65E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r3 = 189(0xbd, float:2.65E-43)
            java.lang.String r7 = "anewarray"
            r1.<init>(r3, r7, r2)
            r2 = 189(0xbd, float:2.65E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.String r3 = "arraylength"
            r1.<init>(r2, r3)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 191(0xbf, float:2.68E-43)
            java.lang.String r3 = "athrow"
            r1.<init>(r2, r3)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm
            r2 = 192(0xc0, float:2.69E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r3 = 192(0xc0, float:2.69E-43)
            java.lang.String r7 = "checkcast"
            r1.<init>(r3, r7, r2)
            r2 = 192(0xc0, float:2.69E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm
            r2 = 193(0xc1, float:2.7E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r3 = 193(0xc1, float:2.7E-43)
            java.lang.String r7 = "instanceof"
            r1.<init>(r3, r7, r2)
            r2 = 193(0xc1, float:2.7E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 194(0xc2, float:2.72E-43)
            java.lang.String r3 = "monitorenter"
            r1.<init>(r2, r3)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 195(0xc3, float:2.73E-43)
            java.lang.String r3 = "monitorexit"
            r1.<init>(r2, r3)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm
            r2 = 196(0xc4, float:2.75E-43)
            java.lang.String r3 = "wide"
            r1.<init>(r2, r3)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.MultiANewArrayForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.MultiANewArrayForm
            r2 = 197(0xc5, float:2.76E-43)
            int[] r2 = new int[]{r2, r5, r5, r5}
            r3 = 197(0xc5, float:2.76E-43)
            java.lang.String r7 = "multianewarray"
            r1.<init>(r3, r7, r2)
            r2 = 197(0xc5, float:2.76E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 198(0xc6, float:2.77E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r3 = 198(0xc6, float:2.77E-43)
            java.lang.String r7 = "ifnull"
            r1.<init>(r3, r7, r2)
            r2 = 198(0xc6, float:2.77E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 199(0xc7, float:2.79E-43)
            int[] r2 = new int[]{r2, r5, r5}
            r3 = 199(0xc7, float:2.79E-43)
            java.lang.String r7 = "ifnonnull"
            r1.<init>(r3, r7, r2)
            r2 = 199(0xc7, float:2.79E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 200(0xc8, float:2.8E-43)
            int[] r2 = new int[]{r2, r5, r5, r5, r5}
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.String r7 = "goto_w"
            r1.<init>(r3, r7, r2, r4)
            r2 = 200(0xc8, float:2.8E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm
            r2 = 201(0xc9, float:2.82E-43)
            int[] r2 = new int[]{r2, r5, r5, r5, r5}
            r3 = 201(0xc9, float:2.82E-43)
            java.lang.String r7 = "jsr_w"
            r1.<init>(r3, r7, r2, r4)
            r2 = 201(0xc9, float:2.82E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "getstatic_this"
            int[] r3 = new int[]{r10, r5, r5}
            r7 = 202(0xca, float:2.83E-43)
            r1.<init>(r7, r2, r3)
            r2 = 202(0xca, float:2.83E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "putstatic_this"
            int[] r3 = new int[]{r11, r5, r5}
            r7 = 203(0xcb, float:2.84E-43)
            r1.<init>(r7, r2, r3)
            r2 = 203(0xcb, float:2.84E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "getfield_this"
            int[] r3 = new int[]{r12, r5, r5}
            r7 = 204(0xcc, float:2.86E-43)
            r1.<init>(r7, r2, r3)
            r2 = 204(0xcc, float:2.86E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "putfield_this"
            int[] r3 = new int[]{r13, r5, r5}
            r7 = 205(0xcd, float:2.87E-43)
            r1.<init>(r7, r2, r3)
            r2 = 205(0xcd, float:2.87E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm
            java.lang.String r2 = "invokevirtual_this"
            int[] r3 = new int[]{r14, r5, r5}
            r7 = 206(0xce, float:2.89E-43)
            r1.<init>(r7, r2, r3)
            r2 = 206(0xce, float:2.89E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm
            java.lang.String r2 = "invokespecial_this"
            int[] r3 = new int[]{r15, r5, r5}
            r7 = 207(0xcf, float:2.9E-43)
            r1.<init>(r7, r2, r3)
            r2 = 207(0xcf, float:2.9E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm
            java.lang.String r2 = "invokestatic_this"
            int[] r3 = new int[]{r8, r5, r5}
            r7 = 208(0xd0, float:2.91E-43)
            r1.<init>(r7, r2, r3)
            r2 = 208(0xd0, float:2.91E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "aload_0_getstatic_this"
            int[] r3 = new int[]{r9, r10, r5, r5}
            r7 = 209(0xd1, float:2.93E-43)
            r1.<init>(r7, r2, r3)
            r2 = 209(0xd1, float:2.93E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "aload_0_putstatic_this"
            int[] r3 = new int[]{r9, r11, r5, r5}
            r7 = 210(0xd2, float:2.94E-43)
            r1.<init>(r7, r2, r3)
            r2 = 210(0xd2, float:2.94E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "aload_0_getfield_this"
            int[] r3 = new int[]{r9, r12, r5, r5}
            r7 = 211(0xd3, float:2.96E-43)
            r1.<init>(r7, r2, r3)
            r2 = 211(0xd3, float:2.96E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm
            java.lang.String r2 = "aload_0_putfield_this"
            int[] r3 = new int[]{r9, r13, r5, r5}
            r7 = 212(0xd4, float:2.97E-43)
            r1.<init>(r7, r2, r3)
            r2 = 212(0xd4, float:2.97E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm
            java.lang.String r2 = "aload_0_invokevirtual_this"
            int[] r3 = new int[]{r9, r14, r5, r5}
            r7 = 213(0xd5, float:2.98E-43)
            r1.<init>(r7, r2, r3)
            r2 = 213(0xd5, float:2.98E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm
            java.lang.String r2 = "aload_0_invokespecial_this"
            int[] r3 = new int[]{r9, r15, r5, r5}
            r7 = 214(0xd6, float:3.0E-43)
            r1.<init>(r7, r2, r3)
            r2 = 214(0xd6, float:3.0E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm
            java.lang.String r2 = "aload_0_invokestatic_this"
            int[] r3 = new int[]{r9, r8, r5, r5}
            r7 = 215(0xd7, float:3.01E-43)
            r1.<init>(r7, r2, r3)
            r2 = 215(0xd7, float:3.01E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "getstatic_super"
            int[] r3 = new int[]{r10, r5, r5}
            r7 = 216(0xd8, float:3.03E-43)
            r1.<init>(r7, r2, r3)
            r2 = 216(0xd8, float:3.03E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "putstatic_super"
            int[] r3 = new int[]{r11, r5, r5}
            r7 = 217(0xd9, float:3.04E-43)
            r1.<init>(r7, r2, r3)
            r2 = 217(0xd9, float:3.04E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "getfield_super"
            int[] r3 = new int[]{r12, r5, r5}
            r7 = 218(0xda, float:3.05E-43)
            r1.<init>(r7, r2, r3)
            r2 = 218(0xda, float:3.05E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "putfield_super"
            int[] r3 = new int[]{r13, r5, r5}
            r7 = 219(0xdb, float:3.07E-43)
            r1.<init>(r7, r2, r3)
            r2 = 219(0xdb, float:3.07E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm
            java.lang.String r2 = "invokevirtual_super"
            int[] r3 = new int[]{r14, r5, r5}
            r7 = 220(0xdc, float:3.08E-43)
            r1.<init>(r7, r2, r3)
            r2 = 220(0xdc, float:3.08E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm
            java.lang.String r2 = "invokespecial_super"
            int[] r3 = new int[]{r15, r5, r5}
            r7 = 221(0xdd, float:3.1E-43)
            r1.<init>(r7, r2, r3)
            r2 = 221(0xdd, float:3.1E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm
            java.lang.String r2 = "invokestatic_super"
            int[] r3 = new int[]{r8, r5, r5}
            r7 = 222(0xde, float:3.11E-43)
            r1.<init>(r7, r2, r3)
            r2 = 222(0xde, float:3.11E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "aload_0_getstatic_super"
            int[] r3 = new int[]{r9, r10, r5, r5}
            r7 = 223(0xdf, float:3.12E-43)
            r1.<init>(r7, r2, r3)
            r2 = 223(0xdf, float:3.12E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "aload_0_putstatic_super"
            int[] r3 = new int[]{r9, r11, r5, r5}
            r7 = 224(0xe0, float:3.14E-43)
            r1.<init>(r7, r2, r3)
            r2 = 224(0xe0, float:3.14E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "aload_0_getfield_super"
            int[] r3 = new int[]{r9, r12, r5, r5}
            r7 = 225(0xe1, float:3.15E-43)
            r1.<init>(r7, r2, r3)
            r2 = 225(0xe1, float:3.15E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm
            java.lang.String r2 = "aload_0_putfield_super"
            int[] r3 = new int[]{r9, r13, r5, r5}
            r7 = 226(0xe2, float:3.17E-43)
            r1.<init>(r7, r2, r3)
            r2 = 226(0xe2, float:3.17E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm
            java.lang.String r2 = "aload_0_invokevirtual_super"
            int[] r3 = new int[]{r9, r14, r5, r5}
            r7 = 227(0xe3, float:3.18E-43)
            r1.<init>(r7, r2, r3)
            r2 = 227(0xe3, float:3.18E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm
            java.lang.String r2 = "aload_0_invokespecial_super"
            int[] r3 = new int[]{r9, r15, r5, r5}
            r7 = 228(0xe4, float:3.2E-43)
            r1.<init>(r7, r2, r3)
            r2 = 228(0xe4, float:3.2E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm
            java.lang.String r2 = "aload_0_invokestatic_super"
            int[] r3 = new int[]{r9, r8, r5, r5}
            r7 = 229(0xe5, float:3.21E-43)
            r1.<init>(r7, r2, r3)
            r2 = 229(0xe5, float:3.21E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm
            java.lang.String r2 = "invokespecial_this_init"
            int[] r3 = new int[]{r15, r5, r5}
            r7 = 230(0xe6, float:3.22E-43)
            r1.<init>(r7, r2, r3)
            r2 = 230(0xe6, float:3.22E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm
            java.lang.String r2 = "invokespecial_super_init"
            int[] r3 = new int[]{r15, r5, r5}
            r7 = 231(0xe7, float:3.24E-43)
            r1.<init>(r7, r2, r3)
            r2 = 231(0xe7, float:3.24E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm
            java.lang.String r2 = "invokespecial_new_init"
            int[] r3 = new int[]{r15, r5, r5}
            r7 = 232(0xe8, float:3.25E-43)
            r1.<init>(r7, r2, r3)
            r2 = 232(0xe8, float:3.25E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm
            java.lang.String r2 = "cldc"
            int[] r3 = new int[]{r6, r5}
            r7 = 233(0xe9, float:3.27E-43)
            r1.<init>(r7, r2, r3)
            r2 = 233(0xe9, float:3.27E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm
            java.lang.String r2 = "ildc"
            int[] r3 = new int[]{r6, r5}
            r7 = 234(0xea, float:3.28E-43)
            r1.<init>(r7, r2, r3)
            r2 = 234(0xea, float:3.28E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm
            java.lang.String r2 = "fldc"
            int[] r3 = new int[]{r6, r5}
            r6 = 235(0xeb, float:3.3E-43)
            r1.<init>(r6, r2, r3)
            r2 = 235(0xeb, float:3.3E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm
            java.lang.String r2 = "cldc_w"
            r3 = 19
            int[] r6 = new int[]{r3, r5, r5}
            r7 = 236(0xec, float:3.31E-43)
            r1.<init>(r7, r2, r6, r4)
            r2 = 236(0xec, float:3.31E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm
            java.lang.String r2 = "ildc_w"
            int[] r6 = new int[]{r3, r5, r5}
            r7 = 237(0xed, float:3.32E-43)
            r1.<init>(r7, r2, r6, r4)
            r2 = 237(0xed, float:3.32E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm
            java.lang.String r2 = "fldc_w"
            int[] r3 = new int[]{r3, r5, r5}
            r6 = 238(0xee, float:3.34E-43)
            r1.<init>(r6, r2, r3, r4)
            r2 = 238(0xee, float:3.34E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm
            java.lang.String r2 = "dldc2_w"
            r3 = 20
            int[] r3 = new int[]{r3, r5, r5}
            r4 = 239(0xef, float:3.35E-43)
            r1.<init>(r4, r2, r3)
            r2 = 239(0xef, float:3.35E-43)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 254(0xfe, float:3.56E-43)
            java.lang.String r3 = "impdep1"
            r1.<init>(r2, r3)
            r0[r2] = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm
            r2 = 255(0xff, float:3.57E-43)
            java.lang.String r3 = "impdep2"
            r1.<init>(r2, r3)
            r0[r2] = r1
            int r1 = r0.length
            r3 = 0
        Lca8:
            if (r3 >= r1) goto Lcba
            r2 = r0[r3]
            if (r2 == 0) goto Lcb7
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm> r4 = org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm.byteCodesByName
            java.lang.String r5 = r2.getName()
            r4.put(r5, r2)
        Lcb7:
            int r3 = r3 + 1
            goto Lca8
        Lcba:
            return
    }

    public ByteCodeForm(int r2, java.lang.String r3) {
            r1 = this;
            int[] r0 = new int[]{r2}
            r1.<init>(r2, r3, r0)
            return
    }

    public ByteCodeForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>()
            r0.opcode = r1
            r0.name = r2
            r0.rewrite = r3
            r0.calculateOperandPosition()
            return
    }

    public static org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm get(int r1) {
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm[] r0 = org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm.byteCodeArray
            r1 = r0[r1]
            return r1
    }

    protected void calculateOperandPosition() {
            r4 = this;
            r0 = -1
            r4.firstOperandIndex = r0
            r4.operandLength = r0
            r1 = 0
        L6:
            int[] r2 = r4.rewrite
            int r3 = r2.length
            if (r1 >= r3) goto L16
            r3 = r2[r1]
            if (r3 >= 0) goto L13
            r4.firstOperandIndex = r1
            int r1 = r2.length
            goto L6
        L13:
            int r1 = r1 + 1
            goto L6
        L16:
            int r1 = r4.firstOperandIndex
            if (r1 != r0) goto L1b
            return
        L1b:
            int[] r2 = r4.rewrite
            int r3 = r2.length
            if (r1 >= r3) goto L28
            r2 = r2[r1]
            if (r2 >= 0) goto L25
            r0 = r1
        L25:
            int r1 = r1 + 1
            goto L1b
        L28:
            int r1 = r4.firstOperandIndex
            int r0 = r0 - r1
            if (r0 < 0) goto L32
            int r0 = r0 + 1
            r4.operandLength = r0
            return
        L32:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Logic error: not finding rewrite operands correctly"
            r0.<init>(r1)
            throw r0
    }

    public int firstOperandIndex() {
            r1 = this;
            int r0 = r1.firstOperandIndex
            return r0
    }

    public void fixUpByteCodeTargets(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute r2) {
            r0 = this;
            return
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int getOpcode() {
            r1 = this;
            int r0 = r1.opcode
            return r0
    }

    public int[] getRewrite() {
            r1 = this;
            int[] r0 = r1.rewrite
            return r0
    }

    public int[] getRewriteCopy() {
            r2 = this;
            int[] r0 = r2.rewrite
            int r1 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    public boolean hasMultipleByteCodes() {
            r5 = this;
            int[] r0 = r5.rewrite
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 <= r3) goto L12
            r1 = r0[r2]
            r4 = 42
            if (r1 != r4) goto L12
            r0 = r0[r3]
            if (r0 <= 0) goto L12
            r2 = r3
        L12:
            return r2
    }

    public boolean hasNoOperand() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean nestedMustStartClassPool() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int operandLength() {
            r1 = this;
            int r0 = r1.operandLength
            return r0
    }

    public abstract void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r2, int r3);

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
