package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CodecEncoding {
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final org.apache.commons.compress.harmony.pack200.BHSDCodec[] canonicalCodec = null;
    private static java.util.Map<org.apache.commons.compress.harmony.pack200.BHSDCodec, java.lang.Integer> canonicalCodecsToSpecifiers;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            org.apache.commons.compress.harmony.pack200.CodecEncoding.EMPTY_INT_ARRAY = r1
            r1 = 116(0x74, float:1.63E-43)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r1 = new org.apache.commons.compress.harmony.pack200.BHSDCodec[r1]
            r2 = 0
            r1[r0] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r3 = 1
            r4 = 256(0x100, float:3.59E-43)
            r2.<init>(r3, r4)
            r1[r3] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r3, r4, r3)
            r5 = 2
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r3, r4, r0, r3)
            r6 = 3
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r3, r4, r3, r3)
            r7 = 4
            r1[r7] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4)
            r8 = 5
            r1[r8] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4, r3)
            r9 = 6
            r1[r9] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4, r0, r3)
            r9 = 7
            r1[r9] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4, r3, r3)
            r9 = 8
            r1[r9] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r4)
            r10 = 9
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r4, r3)
            r10 = 10
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r4, r0, r3)
            r10 = 11
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r4, r3, r3)
            r10 = 12
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r7, r4)
            r10 = 13
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r7, r4, r3)
            r10 = 14
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r7, r4, r0, r3)
            r10 = 15
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r7, r4, r3, r3)
            r4 = 16
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r7)
            r10 = 17
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r7, r3)
            r10 = 18
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r7, r5)
            r10 = 19
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r4)
            r10 = 20
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r4, r3)
            r10 = 21
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r4, r5)
            r10 = 22
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r10 = 32
            r2.<init>(r8, r10)
            r11 = 23
            r1[r11] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r10, r3)
            r11 = 24
            r1[r11] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r10, r5)
            r11 = 25
            r1[r11] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r11 = 64
            r2.<init>(r8, r11)
            r12 = 26
            r1[r12] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r11, r3)
            r12 = 27
            r1[r12] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r11, r5)
            r12 = 28
            r1[r12] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r12 = 128(0x80, float:1.8E-43)
            r2.<init>(r8, r12)
            r13 = 29
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r12, r3)
            r13 = 30
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r12, r5)
            r13 = 31
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r7, r0, r3)
            r1[r10] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r7, r3, r3)
            r13 = 33
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r7, r5, r3)
            r13 = 34
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r4, r0, r3)
            r13 = 35
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r4, r3, r3)
            r13 = 36
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r4, r5, r3)
            r13 = 37
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r10, r0, r3)
            r13 = 38
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r10, r3, r3)
            r13 = 39
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r10, r5, r3)
            r13 = 40
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r11, r0, r3)
            r13 = 41
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r11, r3, r3)
            r13 = 42
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r11, r5, r3)
            r13 = 43
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r12, r0, r3)
            r13 = 44
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r12, r3, r3)
            r13 = 45
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r8, r12, r5, r3)
            r8 = 46
            r1[r8] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r8 = 192(0xc0, float:2.69E-43)
            r2.<init>(r5, r8)
            r13 = 47
            r1[r13] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r13 = 224(0xe0, float:3.14E-43)
            r2.<init>(r5, r13)
            r14 = 48
            r1[r14] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r14 = 240(0xf0, float:3.36E-43)
            r2.<init>(r5, r14)
            r15 = 49
            r1[r15] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r15 = 248(0xf8, float:3.48E-43)
            r2.<init>(r5, r15)
            r16 = 50
            r1[r16] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r7 = 252(0xfc, float:3.53E-43)
            r2.<init>(r5, r7)
            r17 = 51
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r9, r0, r3)
            r17 = 52
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r9, r3, r3)
            r17 = 53
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4, r0, r3)
            r17 = 54
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4, r3, r3)
            r17 = 55
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r10, r0, r3)
            r17 = 56
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r10, r3, r3)
            r17 = 57
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r11, r0, r3)
            r17 = 58
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r11, r3, r3)
            r17 = 59
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r12, r0, r3)
            r17 = 60
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r12, r3, r3)
            r17 = 61
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r8, r0, r3)
            r17 = 62
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r8, r3, r3)
            r17 = 63
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r13, r0, r3)
            r1[r11] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r13, r3, r3)
            r17 = 65
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r14, r0, r3)
            r17 = 66
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r14, r3, r3)
            r17 = 67
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r15, r0, r3)
            r17 = 68
            r1[r17] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r15, r3, r3)
            r5 = 69
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r8)
            r5 = 70
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r13)
            r5 = 71
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r14)
            r5 = 72
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r15)
            r5 = 73
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r7)
            r5 = 74
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r9, r0, r3)
            r5 = 75
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r9, r3, r3)
            r5 = 76
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r4, r0, r3)
            r5 = 77
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r4, r3, r3)
            r5 = 78
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r10, r0, r3)
            r5 = 79
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r10, r3, r3)
            r5 = 80
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r11, r0, r3)
            r5 = 81
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r11, r3, r3)
            r5 = 82
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r12, r0, r3)
            r5 = 83
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r12, r3, r3)
            r5 = 84
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r8, r0, r3)
            r5 = 85
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r8, r3, r3)
            r5 = 86
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r13, r0, r3)
            r5 = 87
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r13, r3, r3)
            r5 = 88
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r14, r0, r3)
            r5 = 89
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r14, r3, r3)
            r5 = 90
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r15, r0, r3)
            r5 = 91
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r6, r15, r3, r3)
            r5 = 92
            r1[r5] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r5 = 4
            r2.<init>(r5, r8)
            r6 = 93
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r13)
            r6 = 94
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r14)
            r6 = 95
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r15)
            r6 = 96
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r7)
            r6 = 97
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r9, r0, r3)
            r6 = 98
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r9, r3, r3)
            r6 = 99
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4, r0, r3)
            r6 = 100
            r1[r6] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r4, r3, r3)
            r4 = 101(0x65, float:1.42E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r10, r0, r3)
            r4 = 102(0x66, float:1.43E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r10, r3, r3)
            r4 = 103(0x67, float:1.44E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r11, r0, r3)
            r4 = 104(0x68, float:1.46E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r11, r3, r3)
            r4 = 105(0x69, float:1.47E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r12, r0, r3)
            r4 = 106(0x6a, float:1.49E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r12, r3, r3)
            r4 = 107(0x6b, float:1.5E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r8, r0, r3)
            r4 = 108(0x6c, float:1.51E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r8, r3, r3)
            r4 = 109(0x6d, float:1.53E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r13, r0, r3)
            r4 = 110(0x6e, float:1.54E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r13, r3, r3)
            r4 = 111(0x6f, float:1.56E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r14, r0, r3)
            r4 = 112(0x70, float:1.57E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r14, r3, r3)
            r4 = 113(0x71, float:1.58E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r15, r0, r3)
            r4 = 114(0x72, float:1.6E-43)
            r1[r4] = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2.<init>(r5, r15, r3, r3)
            r3 = 115(0x73, float:1.61E-43)
            r1[r3] = r2
            org.apache.commons.compress.harmony.pack200.CodecEncoding.canonicalCodec = r1
            java.util.HashMap r2 = new java.util.HashMap
            int r1 = r1.length
            r2.<init>(r1)
        L427:
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r1 = org.apache.commons.compress.harmony.pack200.CodecEncoding.canonicalCodec
            int r3 = r1.length
            if (r0 >= r3) goto L438
            r1 = r1[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r3)
            int r0 = r0 + 1
            goto L427
        L438:
            org.apache.commons.compress.harmony.pack200.CodecEncoding.canonicalCodecsToSpecifiers = r2
            return
    }

    public CodecEncoding() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.apache.commons.compress.harmony.pack200.BHSDCodec getCanonicalCodec(int r1) {
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CodecEncoding.canonicalCodec
            r1 = r0[r1]
            return r1
    }

    public static org.apache.commons.compress.harmony.pack200.Codec getCodec(int r8, java.io.InputStream r9, org.apache.commons.compress.harmony.pack200.Codec r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CodecEncoding.canonicalCodec
            int r1 = r0.length
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L12c
            if (r8 < 0) goto L124
            if (r8 != 0) goto Lc
            return r10
        Lc:
            r1 = 115(0x73, float:1.61E-43)
            if (r8 > r1) goto L13
            r8 = r0[r8]
            return r8
        L13:
            r0 = 3
            r1 = 1
            if (r8 != r2) goto L42
            int r8 = r9.read()
            java.lang.String r10 = "End of buffer read whilst trying to decode codec"
            r2 = -1
            if (r8 == r2) goto L3c
            r3 = r8 & 1
            int r4 = r8 >> 1
            r4 = r4 & r0
            int r8 = r8 >> r0
            r8 = r8 & 7
            int r8 = r8 + r1
            int r9 = r9.read()
            if (r9 == r2) goto L36
            int r9 = r9 + r1
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r10.<init>(r8, r9, r4, r3)
            return r10
        L36:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r10)
            throw r8
        L3c:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r10)
            throw r8
        L42:
            r2 = 117(0x75, float:1.64E-43)
            r3 = 0
            if (r8 < r2) goto L9e
            r4 = 140(0x8c, float:1.96E-43)
            if (r8 > r4) goto L9e
            int r8 = r8 - r2
            r2 = r8 & 3
            int r4 = r8 >> 2
            r4 = r4 & r1
            if (r4 != r1) goto L55
            r4 = r1
            goto L56
        L55:
            r4 = r3
        L56:
            int r5 = r8 >> 3
            r5 = r5 & r1
            if (r5 != r1) goto L5d
            r5 = r1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            int r8 = r8 >> 4
            r8 = r8 & r1
            if (r8 != r1) goto L64
            r3 = r1
        L64:
            if (r5 == 0) goto L71
            if (r3 != 0) goto L69
            goto L71
        L69:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r8 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r9 = "ADef and BDef should never both be true"
            r8.<init>(r9)
            throw r8
        L71:
            if (r4 == 0) goto L77
            int r0 = r9.read()
        L77:
            int r0 = r0 + r1
            r6 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r1 = (double) r2
            double r1 = java.lang.Math.pow(r6, r1)
            int r8 = (int) r1
            int r0 = r0 * r8
            if (r5 == 0) goto L85
            r8 = r10
            goto L8d
        L85:
            int r8 = r9.read()
            org.apache.commons.compress.harmony.pack200.Codec r8 = getCodec(r8, r9, r10)
        L8d:
            if (r3 == 0) goto L90
            goto L98
        L90:
            int r1 = r9.read()
            org.apache.commons.compress.harmony.pack200.Codec r10 = getCodec(r1, r9, r10)
        L98:
            org.apache.commons.compress.harmony.pack200.RunCodec r9 = new org.apache.commons.compress.harmony.pack200.RunCodec
            r9.<init>(r0, r8, r10)
            return r9
        L9e:
            r0 = 141(0x8d, float:1.98E-43)
            if (r8 < r0) goto L109
            r2 = 188(0xbc, float:2.63E-43)
            if (r8 > r2) goto L109
            int r8 = r8 - r0
            r0 = r8 & 1
            if (r0 != r1) goto Lad
            r0 = r1
            goto Lae
        Lad:
            r0 = r3
        Lae:
            int r2 = r8 >> 1
            r2 = r2 & r1
            if (r2 != r1) goto Lb5
            r2 = r1
            goto Lb6
        Lb5:
            r2 = r3
        Lb6:
            int r8 = r8 >> 2
            if (r8 == 0) goto Lbb
            goto Lbc
        Lbb:
            r1 = r3
        Lbc:
            r3 = 12
            int[] r3 = new int[r3]
            r3 = {x0134: FILL_ARRAY_DATA , data: [0, 4, 8, 16, 32, 64, 128, 192, 224, 240, 248, 252} // fill-array
            r8 = r3[r8]
            if (r1 == 0) goto Le4
            if (r0 == 0) goto Lcb
            r0 = r10
            goto Ld3
        Lcb:
            int r0 = r9.read()
            org.apache.commons.compress.harmony.pack200.Codec r0 = getCodec(r0, r9, r10)
        Ld3:
            if (r2 == 0) goto Ld6
            goto Lde
        Ld6:
            int r1 = r9.read()
            org.apache.commons.compress.harmony.pack200.Codec r10 = getCodec(r1, r9, r10)
        Lde:
            org.apache.commons.compress.harmony.pack200.PopulationCodec r9 = new org.apache.commons.compress.harmony.pack200.PopulationCodec
            r9.<init>(r0, r8, r10)
            return r9
        Le4:
            if (r0 == 0) goto Le8
            r8 = r10
            goto Lf0
        Le8:
            int r8 = r9.read()
            org.apache.commons.compress.harmony.pack200.Codec r8 = getCodec(r8, r9, r10)
        Lf0:
            int r0 = r9.read()
            org.apache.commons.compress.harmony.pack200.Codec r0 = getCodec(r0, r9, r10)
            if (r2 == 0) goto Lfb
            goto L103
        Lfb:
            int r1 = r9.read()
            org.apache.commons.compress.harmony.pack200.Codec r10 = getCodec(r1, r9, r10)
        L103:
            org.apache.commons.compress.harmony.pack200.PopulationCodec r9 = new org.apache.commons.compress.harmony.pack200.PopulationCodec
            r9.<init>(r8, r0, r10)
            return r9
        L109:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r9 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid codec encoding byte ("
            r10.<init>(r0)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r10 = ") found"
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L124:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Encoding cannot be less than zero"
            r8.<init>(r9)
            throw r8
        L12c:
            java.lang.Error r8 = new java.lang.Error
            java.lang.String r9 = "Canonical encodings have been incorrectly modified"
            r8.<init>(r9)
            throw r8
    }

    public static int[] getSpecifier(org.apache.commons.compress.harmony.pack200.Codec r9, org.apache.commons.compress.harmony.pack200.Codec r10) {
            java.util.Map<org.apache.commons.compress.harmony.pack200.BHSDCodec, java.lang.Integer> r0 = org.apache.commons.compress.harmony.pack200.CodecEncoding.canonicalCodecsToSpecifiers
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L19
            java.util.Map<org.apache.commons.compress.harmony.pack200.BHSDCodec, java.lang.Integer> r10 = org.apache.commons.compress.harmony.pack200.CodecEncoding.canonicalCodecsToSpecifiers
            java.lang.Object r9 = r10.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int[] r9 = new int[]{r9}
            return r9
        L19:
            boolean r0 = r9 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3f
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r9
            boolean r10 = r9.isDelta()
            int r0 = r9.getS()
            int r0 = r0 * r1
            int r10 = r10 + r0
            int r0 = r9.getB()
            int r0 = r0 - r2
            int r0 = r0 * 8
            int r10 = r10 + r0
            int r9 = r9.getH()
            int r9 = r9 - r2
            r0 = 116(0x74, float:1.63E-43)
            int[] r9 = new int[]{r0, r10, r9}
            return r9
        L3f:
            boolean r0 = r9 instanceof org.apache.commons.compress.harmony.pack200.RunCodec
            r3 = 256(0x100, float:3.59E-43)
            r4 = 0
            if (r0 == 0) goto Lc9
            org.apache.commons.compress.harmony.pack200.RunCodec r9 = (org.apache.commons.compress.harmony.pack200.RunCodec) r9
            int r0 = r9.getK()
            r5 = 3
            if (r0 > r3) goto L52
            int r0 = r0 - r2
            r3 = r4
            goto L66
        L52:
            r6 = 4096(0x1000, float:5.74E-42)
            if (r0 > r6) goto L5b
            int r0 = r0 / 16
            int r0 = r0 - r2
            r3 = r2
            goto L66
        L5b:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r7) goto L63
            int r0 = r0 / r3
            int r0 = r0 - r2
            r3 = r1
            goto L66
        L63:
            int r0 = r0 / r6
            int r0 = r0 - r2
            r3 = r5
        L66:
            org.apache.commons.compress.harmony.pack200.Codec r6 = r9.getACodec()
            org.apache.commons.compress.harmony.pack200.Codec r9 = r9.getBCodec()
            boolean r7 = r6.equals(r10)
            if (r7 == 0) goto L76
            r7 = r2
            goto L7f
        L76:
            boolean r7 = r9.equals(r10)
            if (r7 == 0) goto L7e
            r7 = r1
            goto L7f
        L7e:
            r7 = r4
        L7f:
            int r3 = r3 + 117
            if (r0 != r5) goto L85
            r8 = r4
            goto L86
        L85:
            r8 = 4
        L86:
            int r3 = r3 + r8
            int r8 = r7 * 8
            int r3 = r3 + r8
            if (r7 != r2) goto L8f
            int[] r6 = org.apache.commons.compress.harmony.pack200.CodecEncoding.EMPTY_INT_ARRAY
            goto L93
        L8f:
            int[] r6 = getSpecifier(r6, r10)
        L93:
            if (r7 != r1) goto L98
            int[] r9 = org.apache.commons.compress.harmony.pack200.CodecEncoding.EMPTY_INT_ARRAY
            goto L9c
        L98:
            int[] r9 = getSpecifier(r9, r10)
        L9c:
            if (r0 != r5) goto La0
            r10 = r4
            goto La1
        La0:
            r10 = r2
        La1:
            int r10 = r10 + r2
            int r7 = r6.length
            int r10 = r10 + r7
            int r7 = r9.length
            int r10 = r10 + r7
            int[] r10 = new int[r10]
            r10[r4] = r3
            if (r0 == r5) goto Laf
            r10[r2] = r0
            goto Lb0
        Laf:
            r1 = r2
        Lb0:
            int r0 = r6.length
            r3 = r4
        Lb2:
            if (r3 >= r0) goto Lbd
            r5 = r6[r3]
            r10[r1] = r5
            int r1 = r1 + 1
            int r3 = r3 + 1
            goto Lb2
        Lbd:
            int r0 = r9.length
        Lbe:
            if (r4 >= r0) goto Lc8
            r3 = r9[r4]
            r10[r1] = r3
            int r1 = r1 + r2
            int r4 = r4 + 1
            goto Lbe
        Lc8:
            return r10
        Lc9:
            boolean r0 = r9 instanceof org.apache.commons.compress.harmony.pack200.PopulationCodec
            if (r0 == 0) goto L165
            org.apache.commons.compress.harmony.pack200.PopulationCodec r9 = (org.apache.commons.compress.harmony.pack200.PopulationCodec) r9
            org.apache.commons.compress.harmony.pack200.Codec r0 = r9.getTokenCodec()
            org.apache.commons.compress.harmony.pack200.Codec r1 = r9.getFavouredCodec()
            org.apache.commons.compress.harmony.pack200.Codec r5 = r9.getUnfavouredCodec()
            boolean r6 = r1.equals(r10)
            boolean r7 = r5.equals(r10)
            int[] r9 = r9.getFavoured()
            if (r9 == 0) goto L110
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            if (r0 != r9) goto Lef
            r9 = r2
            goto L111
        Lef:
            boolean r9 = r0 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            if (r9 == 0) goto L110
            r9 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r9
            int r8 = r9.getS()
            if (r8 != 0) goto L110
            r8 = 11
            int[] r8 = new int[r8]
            r8 = {x0168: FILL_ARRAY_DATA , data: [4, 8, 16, 32, 64, 128, 192, 224, 240, 248, 252} // fill-array
            int r9 = r9.getH()
            int r3 = r3 - r9
            int r9 = java.util.Arrays.binarySearch(r8, r3)
            r3 = -1
            if (r9 == r3) goto L110
            goto L111
        L110:
            r9 = r4
        L111:
            int r3 = r6 + 141
            int r8 = r7 * 2
            int r3 = r3 + r8
            int r8 = r9 * 4
            int r3 = r3 + r8
            if (r6 != r2) goto L11e
            int[] r1 = org.apache.commons.compress.harmony.pack200.CodecEncoding.EMPTY_INT_ARRAY
            goto L122
        L11e:
            int[] r1 = getSpecifier(r1, r10)
        L122:
            if (r9 == 0) goto L127
            int[] r9 = org.apache.commons.compress.harmony.pack200.CodecEncoding.EMPTY_INT_ARRAY
            goto L12b
        L127:
            int[] r9 = getSpecifier(r0, r10)
        L12b:
            if (r7 != r2) goto L130
            int[] r10 = org.apache.commons.compress.harmony.pack200.CodecEncoding.EMPTY_INT_ARRAY
            goto L134
        L130:
            int[] r10 = getSpecifier(r5, r10)
        L134:
            int r0 = r1.length
            int r0 = r0 + r2
            int r5 = r10.length
            int r0 = r0 + r5
            int r5 = r9.length
            int r0 = r0 + r5
            int[] r0 = new int[r0]
            r0[r4] = r3
            int r3 = r1.length
            r6 = r2
            r5 = r4
        L141:
            if (r5 >= r3) goto L14c
            r7 = r1[r5]
            r0[r6] = r7
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L141
        L14c:
            int r1 = r9.length
            r3 = r4
        L14e:
            if (r3 >= r1) goto L159
            r5 = r9[r3]
            r0[r6] = r5
            int r6 = r6 + 1
            int r3 = r3 + 1
            goto L14e
        L159:
            int r9 = r10.length
        L15a:
            if (r4 >= r9) goto L164
            r1 = r10[r4]
            r0[r6] = r1
            int r6 = r6 + r2
            int r4 = r4 + 1
            goto L15a
        L164:
            return r0
        L165:
            r9 = 0
            return r9
    }

    public static int getSpecifierForDefaultCodec(org.apache.commons.compress.harmony.pack200.BHSDCodec r1) {
            r0 = 0
            int[] r1 = getSpecifier(r1, r0)
            r0 = 0
            r1 = r1[r0]
            return r1
    }
}
