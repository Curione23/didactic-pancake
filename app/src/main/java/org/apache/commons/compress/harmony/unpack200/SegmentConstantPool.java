package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class SegmentConstantPool {
    public static final int ALL = 0;
    public static final int CP_CLASS = 7;
    public static final int CP_DESCR = 9;
    public static final int CP_DOUBLE = 5;
    public static final int CP_FIELD = 10;
    public static final int CP_FLOAT = 3;
    public static final int CP_IMETHOD = 12;
    public static final int CP_INT = 2;
    public static final int CP_LONG = 4;
    public static final int CP_METHOD = 11;
    public static final int CP_STRING = 6;
    protected static final java.lang.String INITSTRING = "<init>";
    protected static final java.lang.String REGEX_MATCH_ALL = ".*";
    protected static final java.lang.String REGEX_MATCH_INIT = "^<init>.*";
    public static final int SIGNATURE = 8;
    public static final int UTF_8 = 1;
    private final org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache arrayCache;
    private final org.apache.commons.compress.harmony.unpack200.CpBands bands;

    public SegmentConstantPool(org.apache.commons.compress.harmony.unpack200.CpBands r2) {
            r1 = this;
            r1.<init>()
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache r0 = new org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache
            r0.<init>()
            r1.arrayCache = r0
            r1.bands = r2
            return
    }

    protected static boolean regexMatches(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = ".*"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La
            r3 = 1
            return r3
        La:
            java.lang.String r0 = "^<init>.*"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2d
            int r3 = r4.length()
            java.lang.String r0 = "<init>"
            int r1 = r0.length()
            r2 = 0
            if (r3 >= r1) goto L20
            return r2
        L20:
            int r3 = r0.length()
            java.lang.String r3 = r4.substring(r2, r3)
            boolean r3 = r0.equals(r3)
            return r3
        L2d:
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "regex trying to match a pattern I don't know: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry getClassPoolEntry(java.lang.String r4) {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r3.bands
            java.lang.String[] r0 = r0.getCpClass()
            r1 = 0
            int r4 = r3.matchSpecificPoolEntryIndex(r0, r4, r1)
            r0 = -1
            if (r4 != r0) goto L10
            r4 = 0
            return r4
        L10:
            r0 = 7
            long r1 = (long) r4
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r4 = r3.getConstantPoolEntry(r0, r1)     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L17
            return r4
        L17:
            java.lang.Error r4 = new java.lang.Error
            java.lang.String r0 = "Error getting class pool entry"
            r4.<init>(r0)
            throw r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry getClassSpecificPoolEntry(int r1, long r2, java.lang.String r4) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            int r2 = (int) r2
            switch(r1) {
                case 10: goto L27;
                case 11: goto L20;
                case 12: goto L19;
                default: goto L4;
            }
        L4:
            java.lang.Error r2 = new java.lang.Error
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Don't know how to handle "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L19:
            org.apache.commons.compress.harmony.unpack200.CpBands r3 = r0.bands
            java.lang.String[] r3 = r3.getCpIMethodClass()
            goto L2d
        L20:
            org.apache.commons.compress.harmony.unpack200.CpBands r3 = r0.bands
            java.lang.String[] r3 = r3.getCpMethodClass()
            goto L2d
        L27:
            org.apache.commons.compress.harmony.unpack200.CpBands r3 = r0.bands
            java.lang.String[] r3 = r3.getCpFieldClass()
        L2d:
            int r2 = r0.matchSpecificPoolEntryIndex(r3, r4, r2)
            long r2 = (long) r2
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r1 = r0.getConstantPoolEntry(r1, r2)
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry getConstantPoolEntry(int r1, long r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            int r2 = (int) r2
            r3 = -1
            if (r2 != r3) goto L6
            r1 = 0
            return r1
        L6:
            if (r2 < 0) goto L69
            switch(r1) {
                case 1: goto L62;
                case 2: goto L5b;
                case 3: goto L54;
                case 4: goto L4d;
                case 5: goto L46;
                case 6: goto L3f;
                case 7: goto L38;
                case 8: goto L30;
                case 9: goto L28;
                case 10: goto L21;
                case 11: goto L1a;
                case 12: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "Get value incomplete"
            r1.<init>(r2)
            throw r1
        L13:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef r1 = r1.cpIMethodValue(r2)
            return r1
        L1a:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef r1 = r1.cpMethodValue(r2)
            return r1
        L21:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef r1 = r1.cpFieldValue(r2)
            return r1
        L28:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "I don't know what to do with descriptors yet"
            r1.<init>(r2)
            throw r1
        L30:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "I don't know what to do with signatures yet"
            r1.<init>(r2)
            throw r1
        L38:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r1.cpClassValue(r2)
            return r1
        L3f:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPString r1 = r1.cpStringValue(r2)
            return r1
        L46:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble r1 = r1.cpDoubleValue(r2)
            return r1
        L4d:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong r1 = r1.cpLongValue(r2)
            return r1
        L54:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat r1 = r1.cpFloatValue(r2)
            return r1
        L5b:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger r1 = r1.cpIntegerValue(r2)
            return r1
        L62:
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r0.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r1.cpUTF8Value(r2)
            return r1
        L69:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r1 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r2 = "Cannot have a negative range"
            r1.<init>(r2)
            throw r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry getInitMethodPoolEntry(int r8, long r9, java.lang.String r11) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            r0 = 11
            if (r8 != r0) goto L1f
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r7.bands
            java.lang.String[] r2 = r0.getCpMethodClass()
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r7.bands
            java.lang.String[] r3 = r0.getCpMethodDescriptor()
            java.lang.String r5 = "^<init>.*"
            int r6 = (int) r9
            r1 = r7
            r4 = r11
            int r9 = r1.matchSpecificPoolEntryIndex(r2, r3, r4, r5, r6)
            long r9 = (long) r9
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r8 = r7.getConstantPoolEntry(r8, r9)
            return r8
        L1f:
            java.lang.Error r8 = new java.lang.Error
            java.lang.String r9 = "Nothing but CP_METHOD can be an <init>"
            r8.<init>(r9)
            throw r8
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry getValue(int r2, long r3) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            int r3 = (int) r3
            r4 = -1
            if (r3 != r4) goto L6
            r2 = 0
            return r2
        L6:
            if (r3 < 0) goto L5f
            switch(r2) {
                case 1: goto L58;
                case 2: goto L51;
                case 3: goto L4a;
                case 4: goto L43;
                case 5: goto L3c;
                case 6: goto L35;
                case 7: goto L2e;
                case 8: goto L27;
                case 9: goto L20;
                default: goto Lb;
            }
        Lb:
            java.lang.Error r3 = new java.lang.Error
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Tried to get a value I don't know about: "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L20:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r2.cpNameAndTypeValue(r3)
            return r2
        L27:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r2.cpSignatureValue(r3)
            return r2
        L2e:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r2.cpClassValue(r3)
            return r2
        L35:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPString r2 = r2.cpStringValue(r3)
            return r2
        L3c:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble r2 = r2.cpDoubleValue(r3)
            return r2
        L43:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong r2 = r2.cpLongValue(r3)
            return r2
        L4a:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat r2 = r2.cpFloatValue(r3)
            return r2
        L51:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger r2 = r2.cpIntegerValue(r3)
            return r2
        L58:
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r1.bands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r2.cpUTF8Value(r3)
            return r2
        L5f:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r2 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r3 = "Cannot have a negative range"
            r2.<init>(r3)
            throw r2
    }

    protected int matchSpecificPoolEntryIndex(java.lang.String[] r7, java.lang.String r8, int r9) {
            r6 = this;
            java.lang.String r4 = ".*"
            r0 = r6
            r1 = r7
            r2 = r7
            r3 = r8
            r5 = r9
            int r7 = r0.matchSpecificPoolEntryIndex(r1, r2, r3, r4, r5)
            return r7
    }

    protected int matchSpecificPoolEntryIndex(java.lang.String[] r4, java.lang.String[] r5, java.lang.String r6, java.lang.String r7, int r8) {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache r0 = r3.arrayCache
            java.util.List r4 = r0.indexesForArrayKey(r4, r6)
            boolean r6 = r4.isEmpty()
            r0 = -1
            if (r6 == 0) goto Le
            return r0
        Le:
            java.util.Iterator r4 = r4.iterator()
            r6 = r0
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r5[r1]
            boolean r2 = regexMatches(r7, r2)
            if (r2 == 0) goto L13
            int r6 = r6 + 1
            if (r6 != r8) goto L13
            return r1
        L30:
            return r0
    }
}
