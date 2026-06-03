package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class CustomSupport {
    private static final java.lang.String TAG = "CustomSupport";

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = null;

        static {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public CustomSupport() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int clamp(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    public static void setInterpolatedValue(androidx.constraintlayout.widget.ConstraintAttribute r16, android.view.View r17, float[] r18) {
            r1 = r17
            java.lang.String r2 = "\""
            java.lang.String r3 = " on View \""
            java.lang.String r4 = "CustomSupport"
            java.lang.String r0 = "unable to interpolate strings "
            java.lang.Class r5 = r17.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "set"
            r6.<init>(r7)
            java.lang.String r7 = r16.getName()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            int[] r7 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r8 = r16.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r8 = r8.ordinal()     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r7 = r7[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r8 = 3
            r9 = 2
            r10 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            r12 = 1132396544(0x437f0000, float:255.0)
            r13 = 1
            r14 = 0
            switch(r7) {
                case 1: goto L14e;
                case 2: goto L136;
                case 3: goto Le0;
                case 4: goto L8e;
                case 5: goto L77;
                case 6: goto L56;
                case 7: goto L3d;
                default: goto L3b;
            }     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
        L3b:
            goto L1b9
        L3d:
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0[r14] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r5 = r18[r14]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            goto L1b9
        L56:
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0[r14] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r5 = r18[r14]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r7 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L69
            goto L6a
        L69:
            r13 = r14
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            goto L1b9
        L77:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r7.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.String r0 = r16.getName()     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.StringBuilder r0 = r7.append(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.String r0 = r0.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r5.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            throw r5     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
        L8e:
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0[r14] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r5 = r18[r14]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r14 = (double) r5     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r14 = java.lang.Math.pow(r14, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r5 = (float) r14     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r5 = r5 * r12
            int r5 = (int) r5     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r5 = clamp(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r7 = r18[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r13 = (double) r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r13 = java.lang.Math.pow(r13, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r7 = (float) r13     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r7 = r7 * r12
            int r7 = (int) r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r7 = clamp(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r9 = r18[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r13 = (double) r9     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r9 = java.lang.Math.pow(r13, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r9 = (float) r9     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r9 = r9 * r12
            int r9 = (int) r9     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r9 = clamp(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r8 = r18[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r8 = r8 * r12
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r8 = clamp(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r8 = r8 << 24
            int r5 = r5 << 16
            r5 = r5 | r8
            int r7 = r7 << 8
            r5 = r5 | r7
            r5 = r5 | r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            goto L1b9
        Le0:
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            r0[r14] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r5 = r18[r14]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r14 = (double) r5     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r14 = java.lang.Math.pow(r14, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r5 = (float) r14     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r5 = r5 * r12
            int r5 = (int) r5     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r5 = clamp(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r7 = r18[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r13 = (double) r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r13 = java.lang.Math.pow(r13, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r7 = (float) r13     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r7 = r7 * r12
            int r7 = (int) r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r7 = clamp(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r9 = r18[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r13 = (double) r9     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            double r9 = java.lang.Math.pow(r13, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r9 = (float) r9     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r9 = r9 * r12
            int r9 = (int) r9     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r9 = clamp(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r8 = r18[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            float r8 = r8 * r12
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r8 = clamp(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r8 = r8 << 24
            int r5 = r5 << 16
            r5 = r5 | r8
            int r7 = r7 << 8
            r5 = r5 | r7
            r5 = r5 | r9
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r7.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r7.setColor(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r5 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            goto L1b9
        L136:
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0[r14] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r5 = r18[r14]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            goto L1b9
        L14e:
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0[r14] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r5 = r18[r14]     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            int r5 = (int) r5     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            r0.invoke(r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L167 java.lang.IllegalAccessException -> L16c java.lang.NoSuchMethodException -> L193
            goto L1b9
        L167:
            r0 = move-exception
            r0.printStackTrace()
            goto L1b9
        L16c:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "cannot access method "
            r5.<init>(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getName(r17)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r4, r1)
            r0.printStackTrace()
            goto L1b9
        L193:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "no method "
            r5.<init>(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getName(r17)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r4, r1)
            r0.printStackTrace()
        L1b9:
            return
    }
}
