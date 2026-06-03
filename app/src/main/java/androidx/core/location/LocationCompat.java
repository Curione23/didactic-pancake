package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationCompat {
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final java.lang.String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static java.lang.reflect.Field sFieldsMaskField;
    private static java.lang.Integer sHasBearingAccuracyMask;
    private static java.lang.Integer sHasSpeedAccuracyMask;
    private static java.lang.Integer sHasVerticalAccuracyMask;
    private static java.lang.reflect.Method sSetIsFromMockProviderMethod;

    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getBearingAccuracyDegrees(android.location.Location r0) {
                float r0 = r0.getBearingAccuracyDegrees()
                return r0
        }

        static float getSpeedAccuracyMetersPerSecond(android.location.Location r0) {
                float r0 = r0.getSpeedAccuracyMetersPerSecond()
                return r0
        }

        static float getVerticalAccuracyMeters(android.location.Location r0) {
                float r0 = r0.getVerticalAccuracyMeters()
                return r0
        }

        static boolean hasBearingAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasBearingAccuracy()
                return r0
        }

        static boolean hasSpeedAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasSpeedAccuracy()
                return r0
        }

        static boolean hasVerticalAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasVerticalAccuracy()
                return r0
        }

        static void removeBearingAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = androidx.core.location.LocationCompat.getHasBearingAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                return
            L17:
                r2 = move-exception
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
            L21:
                r2 = move-exception
                java.lang.NoSuchFieldError r0 = new java.lang.NoSuchFieldError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        static void removeSpeedAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = androidx.core.location.LocationCompat.getHasSpeedAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                return
            L17:
                r2 = move-exception
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
            L21:
                r2 = move-exception
                java.lang.NoSuchFieldError r0 = new java.lang.NoSuchFieldError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        static void removeVerticalAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = androidx.core.location.LocationCompat.getHasVerticalAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                return
            L17:
                r2 = move-exception
                goto L1a
            L19:
                r2 = move-exception
            L1a:
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        static void setBearingAccuracyDegrees(android.location.Location r0, float r1) {
                r0.setBearingAccuracyDegrees(r1)
                return
        }

        static void setSpeedAccuracyMetersPerSecond(android.location.Location r0, float r1) {
                r0.setSpeedAccuracyMetersPerSecond(r1)
                return
        }

        static void setVerticalAccuracyMeters(android.location.Location r0, float r1) {
                r0.setVerticalAccuracyMeters(r1)
                return
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void removeBearingAccuracy(android.location.Location r24) {
                r0 = r24
                boolean r1 = r24.hasBearingAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r24.getProvider()
                long r2 = r24.getTime()
                long r4 = r24.getElapsedRealtimeNanos()
                double r6 = r24.getLatitude()
                double r8 = r24.getLongitude()
                boolean r10 = r24.hasAltitude()
                double r11 = r24.getAltitude()
                boolean r13 = r24.hasSpeed()
                float r14 = r24.getSpeed()
                boolean r15 = r24.hasBearing()
                r16 = r15
                float r15 = r24.getBearing()
                boolean r17 = r24.hasAccuracy()
                r18 = r15
                float r15 = r24.getAccuracy()
                boolean r19 = r24.hasVerticalAccuracy()
                r20 = r15
                float r15 = r24.getVerticalAccuracyMeters()
                boolean r21 = r24.hasSpeedAccuracy()
                r22 = r15
                float r15 = r24.getSpeedAccuracyMetersPerSecond()
                r23 = r15
                android.os.Bundle r15 = r24.getExtras()
                r24.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r10 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r13 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r16 == 0) goto L7e
                r1 = r18
                r0.setBearing(r1)
            L7e:
                if (r17 == 0) goto L85
                r1 = r20
                r0.setAccuracy(r1)
            L85:
                if (r19 == 0) goto L8c
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
            L8c:
                if (r21 == 0) goto L93
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L93:
                if (r15 == 0) goto L98
                r0.setExtras(r15)
            L98:
                return
        }

        static void removeSpeedAccuracy(android.location.Location r24) {
                r0 = r24
                boolean r1 = r24.hasSpeedAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r24.getProvider()
                long r2 = r24.getTime()
                long r4 = r24.getElapsedRealtimeNanos()
                double r6 = r24.getLatitude()
                double r8 = r24.getLongitude()
                boolean r10 = r24.hasAltitude()
                double r11 = r24.getAltitude()
                boolean r13 = r24.hasSpeed()
                float r14 = r24.getSpeed()
                boolean r15 = r24.hasBearing()
                r16 = r15
                float r15 = r24.getBearing()
                boolean r17 = r24.hasAccuracy()
                r18 = r15
                float r15 = r24.getAccuracy()
                boolean r19 = r24.hasVerticalAccuracy()
                r20 = r15
                float r15 = r24.getVerticalAccuracyMeters()
                boolean r21 = r24.hasBearingAccuracy()
                r22 = r15
                float r15 = r24.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r24.getExtras()
                r24.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r10 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r13 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r16 == 0) goto L7e
                r1 = r18
                r0.setBearing(r1)
            L7e:
                if (r17 == 0) goto L85
                r1 = r20
                r0.setAccuracy(r1)
            L85:
                if (r19 == 0) goto L8c
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
            L8c:
                if (r21 == 0) goto L93
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L93:
                if (r15 == 0) goto L98
                r0.setExtras(r15)
            L98:
                return
        }

        static void removeVerticalAccuracy(android.location.Location r24) {
                r0 = r24
                boolean r1 = r24.hasVerticalAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r24.getProvider()
                long r2 = r24.getTime()
                long r4 = r24.getElapsedRealtimeNanos()
                double r6 = r24.getLatitude()
                double r8 = r24.getLongitude()
                boolean r10 = r24.hasAltitude()
                double r11 = r24.getAltitude()
                boolean r13 = r24.hasSpeed()
                float r14 = r24.getSpeed()
                boolean r15 = r24.hasBearing()
                r16 = r15
                float r15 = r24.getBearing()
                boolean r17 = r24.hasAccuracy()
                r18 = r15
                float r15 = r24.getAccuracy()
                boolean r19 = r24.hasSpeedAccuracy()
                r20 = r15
                float r15 = r24.getSpeedAccuracyMetersPerSecond()
                boolean r21 = r24.hasBearingAccuracy()
                r22 = r15
                float r15 = r24.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r24.getExtras()
                r24.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r10 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r13 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r16 == 0) goto L7e
                r1 = r18
                r0.setBearing(r1)
            L7e:
                if (r17 == 0) goto L85
                r1 = r20
                r0.setAccuracy(r1)
            L85:
                if (r19 == 0) goto L8c
                r1 = r22
                r0.setSpeedAccuracyMetersPerSecond(r1)
            L8c:
                if (r21 == 0) goto L93
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L93:
                if (r15 == 0) goto L98
                r0.setExtras(r15)
            L98:
                return
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void removeBearingAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasBearingAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        static void removeSpeedAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasSpeedAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        static void removeVerticalAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasVerticalAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void removeBearingAccuracy(android.location.Location r0) {
                r0.removeBearingAccuracy()
                return
        }

        static void removeSpeedAccuracy(android.location.Location r0) {
                r0.removeSpeedAccuracy()
                return
        }

        static void removeVerticalAccuracy(android.location.Location r0) {
                r0.removeVerticalAccuracy()
                return
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getMslAltitudeAccuracyMeters(android.location.Location r0) {
                float r0 = r0.getMslAltitudeAccuracyMeters()
                return r0
        }

        static double getMslAltitudeMeters(android.location.Location r2) {
                double r0 = r2.getMslAltitudeMeters()
                return r0
        }

        static boolean hasMslAltitude(android.location.Location r0) {
                boolean r0 = r0.hasMslAltitude()
                return r0
        }

        static boolean hasMslAltitudeAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasMslAltitudeAccuracy()
                return r0
        }

        static void removeMslAltitude(android.location.Location r0) {
                r0.removeMslAltitude()
                return
        }

        static void removeMslAltitudeAccuracy(android.location.Location r0) {
                r0.removeMslAltitudeAccuracy()
                return
        }

        static void setMslAltitudeAccuracyMeters(android.location.Location r0, float r1) {
                r0.setMslAltitudeAccuracyMeters(r1)
                return
        }

        static void setMslAltitudeMeters(android.location.Location r0, double r1) {
                r0.setMslAltitudeMeters(r1)
                return
        }
    }

    private LocationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean containsExtra(android.location.Location r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto Le
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static float getBearingAccuracyDegrees(android.location.Location r0) {
            float r0 = androidx.core.location.LocationCompat.Api26Impl.getBearingAccuracyDegrees(r0)
            return r0
    }

    public static long getElapsedRealtimeMillis(android.location.Location r3) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.getElapsedRealtimeNanos()
            long r0 = r0.toMillis(r1)
            return r0
    }

    public static long getElapsedRealtimeNanos(android.location.Location r2) {
            long r0 = r2.getElapsedRealtimeNanos()
            return r0
    }

    static java.lang.reflect.Field getFieldsMaskField() throws java.lang.NoSuchFieldException {
            java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.sFieldsMaskField
            if (r0 != 0) goto L12
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "mFieldsMask"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            androidx.core.location.LocationCompat.sFieldsMaskField = r0
            r1 = 1
            r0.setAccessible(r1)
        L12:
            java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.sFieldsMaskField
            return r0
    }

    static int getHasBearingAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasBearingAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_BEARING_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.core.location.LocationCompat.sHasBearingAccuracyMask = r0
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasBearingAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    static int getHasSpeedAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasSpeedAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_SPEED_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.core.location.LocationCompat.sHasSpeedAccuracyMask = r0
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasSpeedAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    static int getHasVerticalAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasVerticalAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_VERTICAL_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.core.location.LocationCompat.sHasVerticalAccuracyMask = r0
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasVerticalAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    public static float getMslAltitudeAccuracyMeters(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeAccuracyMeters(r2)
            return r2
        Lb:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            float r2 = r2.getFloat(r0)
            return r2
    }

    public static double getMslAltitudeMeters(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            double r0 = androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeMeters(r2)
            return r0
        Lb:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            double r0 = r2.getDouble(r0)
            return r0
    }

    private static android.os.Bundle getOrCreateExtras(android.location.Location r1) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 != 0) goto L12
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.setExtras(r0)
            android.os.Bundle r0 = r1.getExtras()
        L12:
            return r0
    }

    private static java.lang.reflect.Method getSetIsFromMockProviderMethod() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            if (r0 != 0) goto L19
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r2[r3] = r4
            java.lang.String r3 = "setIsFromMockProvider"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod = r0
            r0.setAccessible(r1)
        L19:
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            return r0
    }

    public static float getSpeedAccuracyMetersPerSecond(android.location.Location r0) {
            float r0 = androidx.core.location.LocationCompat.Api26Impl.getSpeedAccuracyMetersPerSecond(r0)
            return r0
    }

    public static float getVerticalAccuracyMeters(android.location.Location r0) {
            float r0 = androidx.core.location.LocationCompat.Api26Impl.getVerticalAccuracyMeters(r0)
            return r0
    }

    public static boolean hasBearingAccuracy(android.location.Location r0) {
            boolean r0 = androidx.core.location.LocationCompat.Api26Impl.hasBearingAccuracy(r0)
            return r0
    }

    public static boolean hasMslAltitude(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api34Impl.hasMslAltitude(r2)
            return r2
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasMslAltitudeAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api34Impl.hasMslAltitudeAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasSpeedAccuracy(android.location.Location r0) {
            boolean r0 = androidx.core.location.LocationCompat.Api26Impl.hasSpeedAccuracy(r0)
            return r0
    }

    public static boolean hasVerticalAccuracy(android.location.Location r0) {
            boolean r0 = androidx.core.location.LocationCompat.Api26Impl.hasVerticalAccuracy(r0)
            return r0
    }

    public static boolean isMock(android.location.Location r0) {
            boolean r0 = r0.isFromMockProvider()
            return r0
    }

    public static void removeBearingAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeBearingAccuracy(r2)
            goto L21
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            androidx.core.location.LocationCompat.Api29Impl.removeBearingAccuracy(r2)
            goto L21
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(r2)
            goto L21
        L1e:
            androidx.core.location.LocationCompat.Api26Impl.removeBearingAccuracy(r2)
        L21:
            return
    }

    private static void removeExtra(android.location.Location r1, java.lang.String r2) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 == 0) goto L13
            r0.remove(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            r2 = 0
            r1.setExtras(r2)
        L13:
            return
    }

    public static void removeMslAltitude(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitude(r2)
            goto Lf
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            removeExtra(r2, r0)
        Lf:
            return
    }

    public static void removeMslAltitudeAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitudeAccuracy(r2)
            goto Lf
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            removeExtra(r2, r0)
        Lf:
            return
    }

    public static void removeSpeedAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeSpeedAccuracy(r2)
            goto L21
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            androidx.core.location.LocationCompat.Api29Impl.removeSpeedAccuracy(r2)
            goto L21
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(r2)
            goto L21
        L1e:
            androidx.core.location.LocationCompat.Api26Impl.removeSpeedAccuracy(r2)
        L21:
            return
    }

    public static void removeVerticalAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeVerticalAccuracy(r2)
            goto L21
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            androidx.core.location.LocationCompat.Api29Impl.removeVerticalAccuracy(r2)
            goto L21
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(r2)
            goto L21
        L1e:
            androidx.core.location.LocationCompat.Api26Impl.removeVerticalAccuracy(r2)
        L21:
            return
    }

    public static void setBearingAccuracyDegrees(android.location.Location r0, float r1) {
            androidx.core.location.LocationCompat.Api26Impl.setBearingAccuracyDegrees(r0, r1)
            return
    }

    public static void setMock(android.location.Location r1, boolean r2) {
            java.lang.reflect.Method r0 = getSetIsFromMockProviderMethod()     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L17 java.lang.NoSuchMethodException -> L21
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L17 java.lang.NoSuchMethodException -> L21
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L17 java.lang.NoSuchMethodException -> L21
            r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L17 java.lang.NoSuchMethodException -> L21
            return
        L10:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L17:
            r1 = move-exception
            java.lang.IllegalAccessError r2 = new java.lang.IllegalAccessError
            r2.<init>()
            r2.initCause(r1)
            throw r2
        L21:
            r1 = move-exception
            java.lang.NoSuchMethodError r2 = new java.lang.NoSuchMethodError
            r2.<init>()
            r2.initCause(r1)
            throw r2
    }

    public static void setMslAltitudeAccuracyMeters(android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeAccuracyMeters(r2, r3)
            goto L13
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            r2.putFloat(r0, r3)
        L13:
            return
    }

    public static void setMslAltitudeMeters(android.location.Location r2, double r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeMeters(r2, r3)
            goto L13
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            r2.putDouble(r0, r3)
        L13:
            return
    }

    public static void setSpeedAccuracyMetersPerSecond(android.location.Location r0, float r1) {
            androidx.core.location.LocationCompat.Api26Impl.setSpeedAccuracyMetersPerSecond(r0, r1)
            return
    }

    public static void setVerticalAccuracyMeters(android.location.Location r0, float r1) {
            androidx.core.location.LocationCompat.Api26Impl.setVerticalAccuracyMeters(r0, r1)
            return
    }
}
