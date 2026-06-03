package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapCompat {

    static class Api27Impl {
        private Api27Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Bitmap copyBitmapIfHardware(android.graphics.Bitmap r3) {
                android.graphics.Bitmap$Config r0 = r3.getConfig()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
                if (r0 != r1) goto L19
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r1 < r2) goto L14
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r3)
            L14:
                r1 = 1
                android.graphics.Bitmap r3 = r3.copy(r0, r1)
            L19:
                return r3
        }

        static android.graphics.Bitmap createBitmapWithSourceColorspace(int r3, int r4, android.graphics.Bitmap r5, boolean r6) {
                android.graphics.Bitmap$Config r0 = r5.getConfig()
                android.graphics.ColorSpace r1 = r5.getColorSpace()
                android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
                if (r6 == 0) goto L1e
                android.graphics.ColorSpace r6 = r5.getColorSpace()
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L1e
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                r1 = r2
                goto L32
            L1e:
                android.graphics.Bitmap$Config r6 = r5.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
                if (r6 != r2) goto L32
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r6 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r6 < r2) goto L32
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r5)
            L32:
                boolean r5 = r5.hasAlpha()
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r0, r5, r1)
                return r3
        }

        static boolean isAlreadyF16AndLinear(android.graphics.Bitmap r3) {
                android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
                android.graphics.Bitmap$Config r1 = r3.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
                if (r1 != r2) goto L1a
                android.graphics.ColorSpace r3 = r3.getColorSpace()
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L1a
                r3 = 1
                goto L1b
            L1a:
                r3 = 0
            L1b:
                return r3
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setPaintBlendMode(android.graphics.Paint r1) {
                android.graphics.BlendMode r0 = android.graphics.BlendMode.SRC
                r1.setBlendMode(r0)
                return
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Bitmap.Config getHardwareBitmapConfig(android.graphics.Bitmap r1) {
                android.hardware.HardwareBuffer r1 = r1.getHardwareBuffer()
                int r1 = r1.getFormat()
                r0 = 22
                if (r1 != r0) goto Lf
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
                return r1
            Lf:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                return r1
        }
    }

    private BitmapCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap r22, int r23, int r24, android.graphics.Rect r25, boolean r26) {
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            if (r1 <= 0) goto L20a
            if (r2 <= 0) goto L20a
            if (r3 == 0) goto L35
            boolean r4 = r25.isEmpty()
            if (r4 != 0) goto L2d
            int r4 = r3.left
            if (r4 < 0) goto L2d
            int r4 = r3.right
            int r5 = r22.getWidth()
            if (r4 > r5) goto L2d
            int r4 = r3.top
            if (r4 < 0) goto L2d
            int r4 = r3.bottom
            int r5 = r22.getHeight()
            if (r4 > r5) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "srcRect must be contained by srcBm!"
            r0.<init>(r1)
            throw r0
        L35:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L40
            android.graphics.Bitmap r4 = androidx.core.graphics.BitmapCompat.Api27Impl.copyBitmapIfHardware(r22)
            goto L41
        L40:
            r4 = r0
        L41:
            if (r3 == 0) goto L48
            int r6 = r25.width()
            goto L4c
        L48:
            int r6 = r22.getWidth()
        L4c:
            if (r3 == 0) goto L53
            int r7 = r25.height()
            goto L57
        L53:
            int r7 = r22.getHeight()
        L57:
            float r8 = (float) r1
            float r9 = (float) r6
            float r8 = r8 / r9
            float r9 = (float) r2
            float r10 = (float) r7
            float r9 = r9 / r10
            if (r3 == 0) goto L62
            int r11 = r3.left
            goto L63
        L62:
            r11 = 0
        L63:
            if (r3 == 0) goto L68
            int r3 = r3.top
            goto L69
        L68:
            r3 = 0
        L69:
            r12 = 1
            if (r11 != 0) goto L8c
            if (r3 != 0) goto L8c
            int r13 = r22.getWidth()
            if (r1 != r13) goto L8c
            int r13 = r22.getHeight()
            if (r2 != r13) goto L8c
            boolean r1 = r22.isMutable()
            if (r1 == 0) goto L8b
            if (r0 != r4) goto L8b
            android.graphics.Bitmap$Config r1 = r22.getConfig()
            android.graphics.Bitmap r0 = r0.copy(r1, r12)
            return r0
        L8b:
            return r4
        L8c:
            android.graphics.Paint r13 = new android.graphics.Paint
            r13.<init>(r12)
            r13.setFilterBitmap(r12)
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 29
            if (r14 < r15) goto L9e
            androidx.core.graphics.BitmapCompat.Api29Impl.setPaintBlendMode(r13)
            goto La8
        L9e:
            android.graphics.PorterDuffXfermode r14 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r15 = android.graphics.PorterDuff.Mode.SRC
            r14.<init>(r15)
            r13.setXfermode(r14)
        La8:
            if (r6 != r1) goto Lc1
            if (r7 != r2) goto Lc1
            android.graphics.Bitmap$Config r0 = r4.getConfig()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = -r11
            float r2 = (float) r2
            int r3 = -r3
            float r3 = (float) r3
            r1.drawBitmap(r4, r2, r3, r13)
            return r0
        Lc1:
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.log(r14)
            r16 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r17 <= 0) goto Lda
            r18 = r11
            double r10 = (double) r8
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r14
            double r10 = java.lang.Math.ceil(r10)
            goto Le6
        Lda:
            r18 = r11
            double r10 = (double) r8
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r14
            double r10 = java.lang.Math.floor(r10)
        Le6:
            int r8 = (int) r10
            int r10 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r10 <= 0) goto Lf6
            double r9 = (double) r9
            double r9 = java.lang.Math.log(r9)
            double r9 = r9 / r14
            double r9 = java.lang.Math.ceil(r9)
            goto L100
        Lf6:
            double r9 = (double) r9
            double r9 = java.lang.Math.log(r9)
            double r9 = r9 / r14
            double r9 = java.lang.Math.floor(r9)
        L100:
            int r9 = (int) r9
            if (r26 == 0) goto L138
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r5) goto L138
            boolean r10 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r22)
            if (r10 != 0) goto L138
            if (r8 <= 0) goto L114
            int r10 = sizeAtStep(r6, r1, r12, r8)
            goto L115
        L114:
            r10 = r6
        L115:
            if (r9 <= 0) goto L11c
            int r11 = sizeAtStep(r7, r2, r12, r9)
            goto L11d
        L11c:
            r11 = r7
        L11d:
            android.graphics.Bitmap r10 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r10, r11, r0, r12)
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r10)
            r14 = r18
            int r14 = -r14
            float r14 = (float) r14
            int r3 = -r3
            float r3 = (float) r3
            r11.drawBitmap(r4, r14, r3, r13)
            r14 = r12
            r3 = 0
            r11 = 0
            r21 = r10
            r10 = r4
            r4 = r21
            goto L13d
        L138:
            r14 = r18
            r10 = 0
            r11 = r14
            r14 = 0
        L13d:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r11, r3, r6, r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11 = r8
            r16 = r9
        L14a:
            if (r11 != 0) goto L157
            if (r16 == 0) goto L14f
            goto L157
        L14f:
            if (r10 == r0) goto L156
            if (r10 == 0) goto L156
            r10.recycle()
        L156:
            return r4
        L157:
            if (r11 >= 0) goto L15c
            int r11 = r11 + 1
            goto L160
        L15c:
            if (r11 <= 0) goto L160
            int r11 = r11 + (-1)
        L160:
            if (r16 >= 0) goto L165
            int r16 = r16 + 1
            goto L169
        L165:
            if (r16 <= 0) goto L169
            int r16 = r16 + (-1)
        L169:
            r12 = r16
            int r5 = sizeAtStep(r6, r1, r11, r8)
            r18 = r13
            int r13 = sizeAtStep(r7, r2, r12, r9)
            r19 = r15
            r15 = 0
            r3.set(r15, r15, r5, r13)
            if (r11 != 0) goto L181
            if (r12 != 0) goto L181
            r5 = 1
            goto L182
        L181:
            r5 = r15
        L182:
            if (r10 == 0) goto L192
            int r13 = r10.getWidth()
            if (r13 != r1) goto L192
            int r13 = r10.getHeight()
            if (r13 != r2) goto L192
            r13 = 1
            goto L193
        L192:
            r13 = r15
        L193:
            if (r10 == 0) goto L1b5
            if (r10 == r0) goto L1b5
            if (r26 == 0) goto L1a8
            int r15 = android.os.Build.VERSION.SDK_INT
            r20 = r3
            r3 = 27
            if (r15 < r3) goto L1aa
            boolean r3 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r10)
            if (r3 == 0) goto L1b7
            goto L1aa
        L1a8:
            r20 = r3
        L1aa:
            if (r5 == 0) goto L1b1
            if (r13 == 0) goto L1b7
            if (r14 == 0) goto L1b1
            goto L1b7
        L1b1:
            r3 = r10
            r15 = 27
            goto L1ea
        L1b5:
            r20 = r3
        L1b7:
            if (r10 == r0) goto L1be
            if (r10 == 0) goto L1be
            r10.recycle()
        L1be:
            if (r11 <= 0) goto L1c2
            r3 = r14
            goto L1c3
        L1c2:
            r3 = r11
        L1c3:
            int r3 = sizeAtStep(r6, r1, r3, r8)
            if (r12 <= 0) goto L1cb
            r10 = r14
            goto L1cc
        L1cb:
            r10 = r12
        L1cc:
            int r10 = sizeAtStep(r7, r2, r10, r9)
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = 27
            if (r13 < r15) goto L1e2
            if (r26 == 0) goto L1dc
            if (r5 != 0) goto L1dc
            r5 = 1
            goto L1dd
        L1dc:
            r5 = 0
        L1dd:
            android.graphics.Bitmap r3 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r3, r10, r0, r5)
            goto L1ea
        L1e2:
            android.graphics.Bitmap$Config r5 = r4.getConfig()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r10, r5)
        L1ea:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            r10 = r18
            r13 = r19
            r15 = r20
            r5.drawBitmap(r4, r13, r15, r10)
            r13.set(r15)
            r16 = r12
            r5 = 27
            r12 = 1
            r21 = r4
            r4 = r3
            r3 = r15
            r15 = r13
            r13 = r10
            r10 = r21
            goto L14a
        L20a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "dstW and dstH must be > 0!"
            r0.<init>(r1)
            throw r0
    }

    public static int getAllocationByteCount(android.graphics.Bitmap r0) {
            int r0 = r0.getAllocationByteCount()
            return r0
    }

    public static boolean hasMipMap(android.graphics.Bitmap r0) {
            boolean r0 = r0.hasMipMap()
            return r0
    }

    public static void setHasMipMap(android.graphics.Bitmap r0, boolean r1) {
            r0.setHasMipMap(r1)
            return
    }

    static int sizeAtStep(int r1, int r2, int r3, int r4) {
            if (r3 != 0) goto L3
            return r2
        L3:
            r0 = 1
            if (r3 <= 0) goto Lb
            int r4 = r4 - r3
            int r2 = r0 << r4
            int r1 = r1 * r2
            return r1
        Lb:
            int r1 = -r3
            int r1 = r1 - r0
            int r1 = r2 << r1
            return r1
    }
}
