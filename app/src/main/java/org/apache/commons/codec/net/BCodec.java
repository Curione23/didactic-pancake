package org.apache.commons.codec.net;

/* JADX INFO: loaded from: classes2.dex */
public class BCodec extends org.apache.commons.codec.net.RFC1522Codec implements org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder {
    private static final org.apache.commons.codec.CodecPolicy DECODING_POLICY_DEFAULT = null;
    private final org.apache.commons.codec.CodecPolicy decodingPolicy;

    static {
            org.apache.commons.codec.CodecPolicy r0 = org.apache.commons.codec.CodecPolicy.LENIENT
            org.apache.commons.codec.net.BCodec.DECODING_POLICY_DEFAULT = r0
            return
    }

    public BCodec() {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0)
            return
    }

    public BCodec(java.lang.String r1) {
            r0 = this;
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r1)
            return
    }

    public BCodec(java.nio.charset.Charset r2) {
            r1 = this;
            org.apache.commons.codec.CodecPolicy r0 = org.apache.commons.codec.net.BCodec.DECODING_POLICY_DEFAULT
            r1.<init>(r2, r0)
            return
    }

    public BCodec(java.nio.charset.Charset r1, org.apache.commons.codec.CodecPolicy r2) {
            r0 = this;
            r0.<init>(r1)
            r0.decodingPolicy = r2
            return
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object r4) throws org.apache.commons.codec.DecoderException {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r3.decode(r4)
            return r4
        Lf:
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Objects of type "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " cannot be decoded using BCodec"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.codec.StringDecoder
    public java.lang.String decode(java.lang.String r3) throws org.apache.commons.codec.DecoderException {
            r2 = this;
            java.lang.String r3 = r2.decodeText(r3)     // Catch: java.lang.IllegalArgumentException -> L5 java.io.UnsupportedEncodingException -> L7
            return r3
        L5:
            r3 = move-exception
            goto L8
        L7:
            r3 = move-exception
        L8:
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doDecoding(byte[] r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            org.apache.commons.codec.binary.Base64 r0 = new org.apache.commons.codec.binary.Base64
            byte[] r1 = org.apache.commons.codec.binary.BaseNCodec.getChunkSeparator()
            org.apache.commons.codec.CodecPolicy r2 = r4.decodingPolicy
            r3 = 0
            r0.<init>(r3, r1, r3, r2)
            byte[] r5 = r0.decode(r5)
            return r5
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doEncoding(byte[] r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            byte[] r1 = org.apache.commons.codec.binary.Base64.encodeBase64(r1)
            return r1
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r4) throws org.apache.commons.codec.EncoderException {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r3.encode(r4)
            return r4
        Lf:
            org.apache.commons.codec.EncoderException r0 = new org.apache.commons.codec.EncoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Objects of type "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " cannot be encoded using BCodec"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            java.nio.charset.Charset r0 = r1.getCharset()
            java.lang.String r2 = r1.encode(r2, r0)
            return r2
    }

    public java.lang.String encode(java.lang.String r2, java.lang.String r3) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            java.lang.String r2 = r1.encodeText(r2, r3)     // Catch: java.nio.charset.UnsupportedCharsetException -> L5
            return r2
        L5:
            r2 = move-exception
            org.apache.commons.codec.EncoderException r3 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = r2.getMessage()
            r3.<init>(r0, r2)
            throw r3
    }

    public java.lang.String encode(java.lang.String r1, java.nio.charset.Charset r2) throws org.apache.commons.codec.EncoderException {
            r0 = this;
            java.lang.String r1 = r0.encodeText(r1, r2)
            return r1
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public /* bridge */ /* synthetic */ java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = super.getCharset()
            return r0
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    public /* bridge */ /* synthetic */ java.lang.String getDefaultCharset() {
            r1 = this;
            java.lang.String r0 = super.getDefaultCharset()
            return r0
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected java.lang.String getEncoding() {
            r1 = this;
            java.lang.String r0 = "B"
            return r0
    }

    public boolean isStrictDecoding() {
            r2 = this;
            org.apache.commons.codec.CodecPolicy r0 = r2.decodingPolicy
            org.apache.commons.codec.CodecPolicy r1 = org.apache.commons.codec.CodecPolicy.STRICT
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
