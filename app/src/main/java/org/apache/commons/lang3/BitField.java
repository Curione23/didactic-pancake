package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class BitField {
    private final int mask;
    private final int shiftCount;

    public BitField(int r1) {
            r0 = this;
            r0.<init>()
            r0.mask = r1
            if (r1 != 0) goto L9
            r1 = 0
            goto Ld
        L9:
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
        Ld:
            r0.shiftCount = r1
            return
    }

    public int clear(int r2) {
            r1 = this;
            int r0 = r1.mask
            int r0 = ~r0
            r2 = r2 & r0
            return r2
    }

    public byte clearByte(byte r1) {
            r0 = this;
            int r1 = r0.clear(r1)
            byte r1 = (byte) r1
            return r1
    }

    public short clearShort(short r1) {
            r0 = this;
            int r1 = r0.clear(r1)
            short r1 = (short) r1
            return r1
    }

    public int getRawValue(int r2) {
            r1 = this;
            int r0 = r1.mask
            r2 = r2 & r0
            return r2
    }

    public short getShortRawValue(short r1) {
            r0 = this;
            int r1 = r0.getRawValue(r1)
            short r1 = (short) r1
            return r1
    }

    public short getShortValue(short r1) {
            r0 = this;
            int r1 = r0.getValue(r1)
            short r1 = (short) r1
            return r1
    }

    public int getValue(int r2) {
            r1 = this;
            int r2 = r1.getRawValue(r2)
            int r0 = r1.shiftCount
            int r2 = r2 >> r0
            return r2
    }

    public boolean isAllSet(int r2) {
            r1 = this;
            int r0 = r1.mask
            r2 = r2 & r0
            if (r2 != r0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public boolean isSet(int r2) {
            r1 = this;
            int r0 = r1.mask
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public int set(int r2) {
            r1 = this;
            int r0 = r1.mask
            r2 = r2 | r0
            return r2
    }

    public int setBoolean(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            int r1 = r0.set(r1)
            goto Lb
        L7:
            int r1 = r0.clear(r1)
        Lb:
            return r1
    }

    public byte setByte(byte r1) {
            r0 = this;
            int r1 = r0.set(r1)
            byte r1 = (byte) r1
            return r1
    }

    public byte setByteBoolean(byte r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            byte r1 = r0.setByte(r1)
            goto Lb
        L7:
            byte r1 = r0.clearByte(r1)
        Lb:
            return r1
    }

    public short setShort(short r1) {
            r0 = this;
            int r1 = r0.set(r1)
            short r1 = (short) r1
            return r1
    }

    public short setShortBoolean(short r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            short r1 = r0.setShort(r1)
            goto Lb
        L7:
            short r1 = r0.clearShort(r1)
        Lb:
            return r1
    }

    public short setShortValue(short r1, short r2) {
            r0 = this;
            int r1 = r0.setValue(r1, r2)
            short r1 = (short) r1
            return r1
    }

    public int setValue(int r3, int r4) {
            r2 = this;
            int r0 = r2.mask
            int r1 = ~r0
            r3 = r3 & r1
            int r1 = r2.shiftCount
            int r4 = r4 << r1
            r4 = r4 & r0
            r3 = r3 | r4
            return r3
    }
}
