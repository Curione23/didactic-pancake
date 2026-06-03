package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static java.lang.reflect.Field sContextField;
    private static java.lang.reflect.Method sGnssRequestBuilderBuildMethod;
    private static java.lang.Class<?> sGnssRequestBuilderClass;
    static final java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> sLocationListeners = null;
    private static java.lang.reflect.Method sRegisterGnssMeasurementsCallbackMethod;

    static class Api19Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean tryRequestLocationUpdates(android.location.LocationManager r7, java.lang.String r8, androidx.core.location.LocationRequestCompat r9, androidx.core.location.LocationListenerCompat r10, android.os.Looper r11) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L3f
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L3f
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.Throwable -> L3f
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L3f
                r2 = 1
                if (r1 != 0) goto L2f
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r3 = "requestLocationUpdates"
                r4 = 3
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3f
                java.lang.Class<?> r5 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L3f
                r4[r0] = r5     // Catch: java.lang.Throwable -> L3f
                java.lang.Class<android.location.LocationListener> r5 = android.location.LocationListener.class
                r4[r2] = r5     // Catch: java.lang.Throwable -> L3f
                java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
                r6 = 2
                r4[r6] = r5     // Catch: java.lang.Throwable -> L3f
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L3f
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.Throwable -> L3f
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L3f
            L2f:
                android.location.LocationRequest r8 = r9.toLocationRequest(r8)     // Catch: java.lang.Throwable -> L3f
                if (r8 == 0) goto L3f
                java.lang.reflect.Method r9 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L3f
                java.lang.Object[] r8 = new java.lang.Object[]{r8, r10, r11}     // Catch: java.lang.Throwable -> L3f
                r9.invoke(r7, r8)     // Catch: java.lang.Throwable -> L3f
                return r2
            L3f:
                return r0
        }

        static boolean tryRequestLocationUpdates(android.location.LocationManager r7, java.lang.String r8, androidx.core.location.LocationRequestCompat r9, androidx.core.location.LocationManagerCompat.LocationListenerTransport r10) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L4d
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4d
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.Throwable -> L4d
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L4d
                r2 = 1
                if (r1 != 0) goto L2f
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r3 = "requestLocationUpdates"
                r4 = 3
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L4d
                java.lang.Class<?> r5 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L4d
                r4[r0] = r5     // Catch: java.lang.Throwable -> L4d
                java.lang.Class<android.location.LocationListener> r5 = android.location.LocationListener.class
                r4[r2] = r5     // Catch: java.lang.Throwable -> L4d
                java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
                r6 = 2
                r4[r6] = r5     // Catch: java.lang.Throwable -> L4d
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L4d
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.Throwable -> L4d
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L4d
            L2f:
                android.location.LocationRequest r8 = r9.toLocationRequest(r8)     // Catch: java.lang.Throwable -> L4d
                if (r8 == 0) goto L4d
                java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r9 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L4d
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L4d
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L4a
                android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L4a
                java.lang.Object[] r8 = new java.lang.Object[]{r8, r10, r3}     // Catch: java.lang.Throwable -> L4a
                r1.invoke(r7, r8)     // Catch: java.lang.Throwable -> L4a
                androidx.core.location.LocationManagerCompat.registerLocationListenerTransport(r7, r10)     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L4a
                return r2
            L4a:
                r7 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L4a
                throw r7     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4d java.lang.Throwable -> L4d java.lang.Throwable -> L4d java.lang.Throwable -> L4d
            L4d:
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager r0, android.location.GnssMeasurementsEvent.Callback r1) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1)
                return r0
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager r0, android.location.GnssMeasurementsEvent.Callback r1, android.os.Handler r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        static boolean registerGnssStatusCallback(android.location.LocationManager r4, android.os.Handler r5, java.util.concurrent.Executor r6, androidx.core.location.GnssStatusCompat.Callback r7) {
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L6
                r2 = r0
                goto L7
            L6:
                r2 = r1
            L7:
                androidx.core.util.Preconditions.checkArgument(r2)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r2)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r3 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L32
                java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L32
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r3     // Catch: java.lang.Throwable -> L32
                if (r3 != 0) goto L1d
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport     // Catch: java.lang.Throwable -> L32
                r3.<init>(r7)     // Catch: java.lang.Throwable -> L32
                goto L20
            L1d:
                r3.unregister()     // Catch: java.lang.Throwable -> L32
            L20:
                r3.register(r6)     // Catch: java.lang.Throwable -> L32
                boolean r4 = r4.registerGnssStatusCallback(r3, r5)     // Catch: java.lang.Throwable -> L32
                if (r4 == 0) goto L30
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r4 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L32
                r4.put(r7, r3)     // Catch: java.lang.Throwable -> L32
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
                return r0
            L30:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
                return r1
            L32:
                r4 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
                throw r4
        }

        static void unregisterGnssMeasurementsCallback(android.location.LocationManager r0, android.location.GnssMeasurementsEvent.Callback r1) {
                r0.unregisterGnssMeasurementsCallback(r1)
                return
        }

        static void unregisterGnssStatusCallback(android.location.LocationManager r1, java.lang.Object r2) {
                boolean r0 = r2 instanceof androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport
                if (r0 == 0) goto La
                r0 = r2
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r0
                r0.unregister()
            La:
                android.location.GnssStatus$Callback r2 = (android.location.GnssStatus.Callback) r2
                r1.unregisterGnssStatusCallback(r2)
                return
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getGnssHardwareModelName(android.location.LocationManager r0) {
                java.lang.String r0 = r0.getGnssHardwareModelName()
                return r0
        }

        static int getGnssYearOfHardware(android.location.LocationManager r0) {
                int r0 = r0.getGnssYearOfHardware()
                return r0
        }

        static boolean isLocationEnabled(android.location.LocationManager r0) {
                boolean r0 = r0.isLocationEnabled()
                return r0
        }
    }

    private static class Api30Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void getCurrentLocation(android.location.LocationManager r1, java.lang.String r2, android.os.CancellationSignal r3, java.util.concurrent.Executor r4, androidx.core.util.Consumer<android.location.Location> r5) {
                java.util.Objects.requireNonNull(r5)
                androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0 r0 = new androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0
                r0.<init>(r5)
                r1.getCurrentLocation(r2, r3, r4, r0)
                return
        }

        public static boolean registerGnssStatusCallback(android.location.LocationManager r1, android.os.Handler r2, java.util.concurrent.Executor r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r2)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L23
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L23
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) r0     // Catch: java.lang.Throwable -> L23
                if (r0 != 0) goto L12
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r0 = new androidx.core.location.LocationManagerCompat$GnssStatusTransport     // Catch: java.lang.Throwable -> L23
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L23
            L12:
                boolean r1 = r1.registerGnssStatusCallback(r3, r0)     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto L20
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L23
                r1.put(r4, r0)     // Catch: java.lang.Throwable -> L23
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
                r1 = 1
                return r1
            L20:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
                r1 = 0
                return r1
            L23:
                r1 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
                throw r1
        }

        public static boolean tryRequestLocationUpdates(android.location.LocationManager r7, java.lang.String r8, androidx.core.location.LocationRequestCompat r9, java.util.concurrent.Executor r10, androidx.core.location.LocationListenerCompat r11) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                r2 = 0
                if (r0 < r1) goto L45
                java.lang.Class<?> r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L45
                if (r0 != 0) goto L13
                java.lang.String r0 = "android.location.LocationRequest"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L45
                androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass = r0     // Catch: java.lang.Throwable -> L45
            L13:
                java.lang.reflect.Method r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.Throwable -> L45
                r1 = 1
                if (r0 != 0) goto L35
                java.lang.Class<android.location.LocationManager> r0 = android.location.LocationManager.class
                java.lang.String r3 = "requestLocationUpdates"
                r4 = 3
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L45
                java.lang.Class<?> r5 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L45
                r4[r2] = r5     // Catch: java.lang.Throwable -> L45
                java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
                r4[r1] = r5     // Catch: java.lang.Throwable -> L45
                java.lang.Class<android.location.LocationListener> r5 = android.location.LocationListener.class
                r6 = 2
                r4[r6] = r5     // Catch: java.lang.Throwable -> L45
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L45
                androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod = r0     // Catch: java.lang.Throwable -> L45
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L45
            L35:
                android.location.LocationRequest r8 = r9.toLocationRequest(r8)     // Catch: java.lang.Throwable -> L45
                if (r8 == 0) goto L45
                java.lang.reflect.Method r9 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.Throwable -> L45
                java.lang.Object[] r8 = new java.lang.Object[]{r8, r10, r11}     // Catch: java.lang.Throwable -> L45
                r9.invoke(r7, r8)     // Catch: java.lang.Throwable -> L45
                return r1
            L45:
                return r2
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean hasProvider(android.location.LocationManager r0, java.lang.String r1) {
                boolean r0 = r0.hasProvider(r1)
                return r0
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager r0, java.util.concurrent.Executor r1, android.location.GnssMeasurementsEvent.Callback r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        static void requestLocationUpdates(android.location.LocationManager r0, java.lang.String r1, android.location.LocationRequest r2, java.util.concurrent.Executor r3, android.location.LocationListener r4) {
                r0.requestLocationUpdates(r1, r2, r3, r4)
                return
        }
    }

    private static final class CancellableLocationListener implements android.location.LocationListener {
        private androidx.core.util.Consumer<android.location.Location> mConsumer;
        private final java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;
        private final android.os.Handler mTimeoutHandler;
        java.lang.Runnable mTimeoutRunnable;
        private boolean mTriggered;

        CancellableLocationListener(android.location.LocationManager r1, java.util.concurrent.Executor r2, androidx.core.util.Consumer<android.location.Location> r3) {
                r0 = this;
                r0.<init>()
                r0.mLocationManager = r1
                r0.mExecutor = r2
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.mTimeoutHandler = r1
                r0.mConsumer = r3
                return
        }

        private void cleanup() {
                r3 = this;
                r0 = 0
                r3.mConsumer = r0
                android.location.LocationManager r1 = r3.mLocationManager
                r1.removeUpdates(r3)
                java.lang.Runnable r1 = r3.mTimeoutRunnable
                if (r1 == 0) goto L13
                android.os.Handler r2 = r3.mTimeoutHandler
                r2.removeCallbacks(r1)
                r3.mTimeoutRunnable = r0
            L13:
                return
        }

        static /* synthetic */ void lambda$onLocationChanged$1(androidx.core.util.Consumer r0, android.location.Location r1) {
                r0.accept(r1)
                return
        }

        public void cancel() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.mTriggered     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                return
            L7:
                r0 = 1
                r1.mTriggered = r0     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                r1.cleanup()
                return
            Lf:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                throw r0
        }

        /* JADX INFO: renamed from: lambda$startTimeout$0$androidx-core-location-LocationManagerCompat$CancellableLocationListener, reason: not valid java name */
        /* synthetic */ void m26x40ccd759() {
                r2 = this;
                r0 = 0
                r2.mTimeoutRunnable = r0
                r1 = r0
                android.location.Location r1 = (android.location.Location) r1
                r2.onLocationChanged(r0)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r4) {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.mTriggered     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                return
            L7:
                r0 = 1
                r3.mTriggered = r0     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                androidx.core.util.Consumer<android.location.Location> r0 = r3.mConsumer
                java.util.concurrent.Executor r1 = r3.mExecutor
                androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1 r2 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1
                r2.<init>(r0, r4)
                r1.execute(r2)
                r3.cleanup()
                return
            L1b:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                throw r4
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r2) {
                r1 = this;
                r2 = 0
                r0 = r2
                android.location.Location r0 = (android.location.Location) r0
                r1.onLocationChanged(r2)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void startTimeout(long r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.mTriggered     // Catch: java.lang.Throwable -> L15
                if (r0 == 0) goto L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                return
            L7:
                androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0 r0 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L15
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L15
                r2.mTimeoutRunnable = r0     // Catch: java.lang.Throwable -> L15
                android.os.Handler r1 = r2.mTimeoutHandler     // Catch: java.lang.Throwable -> L15
                r1.postDelayed(r0, r3)     // Catch: java.lang.Throwable -> L15
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                throw r3
        }
    }

    private static class GnssListenersHolder {
        static final androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent.Callback, android.location.GnssMeasurementsEvent.Callback> sGnssMeasurementListeners = null;
        static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> sGnssStatusListeners = null;

        static {
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners = r0
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners = r0
                return
        }

        private GnssListenersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class GnssMeasurementsTransport extends android.location.GnssMeasurementsEvent.Callback {
        final android.location.GnssMeasurementsEvent.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;

        GnssMeasurementsTransport(android.location.GnssMeasurementsEvent.Callback r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mExecutor = r2
                return
        }

        /* JADX INFO: renamed from: lambda$onGnssMeasurementsReceived$0$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m27xb1484c70(java.util.concurrent.Executor r2, android.location.GnssMeasurementsEvent r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r2 = r1.mCallback
                r2.onGnssMeasurementsReceived(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$1$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m28xdc872524(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r2 = r1.mCallback
                r2.onStatusChanged(r3)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    private static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onFirstFix(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                androidx.core.location.GnssStatusCompat r2 = androidx.core.location.GnssStatusCompat.wrap(r2)
                r0.onSatelliteStatusChanged(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStarted()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStopped()
                return
        }
    }

    private static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;

        GpsStatusTransport(android.location.LocationManager r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mLocationManager = r3
                r2.mCallback = r4
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$0$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m29x75e92221(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStarted()
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$1$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m30xc3a89a22(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStopped()
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$2$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m31x11681223(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onFirstFix(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$3$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m32x5f278a24(java.util.concurrent.Executor r2, androidx.core.location.GnssStatusCompat r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onSatelliteStatusChanged(r3)
                return
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int r4) {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 1
                if (r4 == r1) goto L46
                r1 = 2
                if (r4 == r1) goto L3d
                r1 = 3
                r2 = 0
                if (r4 == r1) goto L28
                r1 = 4
                if (r4 == r1) goto L13
                goto L4e
            L13:
                android.location.LocationManager r4 = r3.mLocationManager
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L4e
                androidx.core.location.GnssStatusCompat r4 = androidx.core.location.GnssStatusCompat.wrap(r4)
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
                goto L4e
            L28:
                android.location.LocationManager r4 = r3.mLocationManager
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L4e
                int r4 = r4.getTimeToFirstFix()
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
                goto L4e
            L3d:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1 r4 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1
                r4.<init>(r3, r0)
                r0.execute(r4)
                goto L4e
            L46:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0 r4 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
                r4.<init>(r3, r0)
                r0.execute(r4)
            L4e:
                return
        }

        public void register(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                androidx.core.util.Preconditions.checkState(r0)
                r1.mExecutor = r2
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    private static final class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        InlineHandlerExecutor(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.mHandler = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r3) {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = r2.mHandler
                android.os.Looper r1 = r1.getLooper()
                if (r0 != r1) goto L10
                r3.run()
                goto L1e
            L10:
                android.os.Handler r0 = r2.mHandler
                java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto L1f
            L1e:
                return
            L1f:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.mHandler
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " is shutting down"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    private static class LocationListenerKey {
        final androidx.core.location.LocationListenerCompat mListener;
        final java.lang.String mProvider;

        LocationListenerKey(java.lang.String r2, androidx.core.location.LocationListenerCompat r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "invalid null provider"
                java.lang.Object r2 = androidx.core.util.ObjectsCompat.requireNonNull(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.mProvider = r2
                java.lang.String r2 = "invalid null listener"
                java.lang.Object r2 = androidx.core.util.ObjectsCompat.requireNonNull(r3, r2)
                androidx.core.location.LocationListenerCompat r2 = (androidx.core.location.LocationListenerCompat) r2
                r1.mListener = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.core.location.LocationManagerCompat.LocationListenerKey
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.core.location.LocationManagerCompat$LocationListenerKey r4 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r4
                java.lang.String r0 = r3.mProvider
                java.lang.String r2 = r4.mProvider
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                androidx.core.location.LocationListenerCompat r0 = r3.mListener
                androidx.core.location.LocationListenerCompat r4 = r4.mListener
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.mProvider
                androidx.core.location.LocationListenerCompat r1 = r2.mListener
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    private static class LocationListenerTransport implements android.location.LocationListener {
        final java.util.concurrent.Executor mExecutor;
        volatile androidx.core.location.LocationManagerCompat.LocationListenerKey mKey;

        LocationListenerTransport(androidx.core.location.LocationManagerCompat.LocationListenerKey r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mKey = r1
                r0.mExecutor = r2
                return
        }

        public androidx.core.location.LocationManagerCompat.LocationListenerKey getKey() {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                java.lang.Object r0 = androidx.core.util.ObjectsCompat.requireNonNull(r0)
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r0
                return r0
        }

        /* JADX INFO: renamed from: lambda$onFlushComplete$2$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m33xf04cfe9d(int r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onFlushComplete(r2)
                return
        }

        /* JADX INFO: renamed from: lambda$onLocationChanged$0$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m34xa8d50b3d(android.location.Location r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onLocationChanged(r2)
                return
        }

        /* JADX INFO: renamed from: lambda$onLocationChanged$1$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m35x2b1fc01c(java.util.List r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onLocationChanged(r2)
                return
        }

        /* JADX INFO: renamed from: lambda$onProviderDisabled$5$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m36x442abc92(java.lang.String r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onProviderDisabled(r2)
                return
        }

        /* JADX INFO: renamed from: lambda$onProviderEnabled$4$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m37x5a2a7b08(java.lang.String r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onProviderEnabled(r2)
                return
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$3$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m38xdbe6a717(java.lang.String r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onStatusChanged(r2, r3, r4)
                return
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(int r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(java.util.List<android.location.Location> r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r3, int r4, android.os.Bundle r5) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mKey = r0
                return
        }
    }

    private static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;

        PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        /* JADX INFO: renamed from: lambda$onFirstFix$2$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m39x4191f1e(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onFirstFix(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onSatelliteStatusChanged$3$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m40xdecf6cdb(java.util.concurrent.Executor r2, android.location.GnssStatus r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                androidx.core.location.GnssStatusCompat r3 = androidx.core.location.GnssStatusCompat.wrap(r3)
                r2.onSatelliteStatusChanged(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onStarted$0$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m41x7ba12b9c(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStarted()
                return
        }

        /* JADX INFO: renamed from: lambda$onStopped$1$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m42x80a5cd6f(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStopped()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        public void register(java.util.concurrent.Executor r5) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L6
                r2 = r0
                goto L7
            L6:
                r2 = r1
            L7:
                java.lang.String r3 = "invalid null executor"
                androidx.core.util.Preconditions.checkArgument(r2, r3)
                java.util.concurrent.Executor r2 = r4.mExecutor
                if (r2 != 0) goto L11
                goto L12
            L11:
                r0 = r1
            L12:
                androidx.core.util.Preconditions.checkState(r0)
                r4.mExecutor = r5
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.location.LocationManagerCompat.sLocationListeners = r0
            return
    }

    private LocationManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void getCurrentLocation(android.location.LocationManager r8, java.lang.String r9, android.os.CancellationSignal r10, java.util.concurrent.Executor r11, androidx.core.util.Consumer<android.location.Location> r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.location.LocationManagerCompat.Api30Impl.getCurrentLocation(r8, r9, r10, r11, r12)
            return
        La:
            if (r10 == 0) goto Lf
            r10.throwIfCanceled()
        Lf:
            android.location.Location r0 = r8.getLastKnownLocation(r9)
            if (r0 == 0) goto L2d
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = androidx.core.location.LocationCompat.getElapsedRealtimeMillis(r0)
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2d
            androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0 r8 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0
            r8.<init>(r12, r0)
            r11.execute(r8)
            return
        L2d:
            androidx.core.location.LocationManagerCompat$CancellableLocationListener r0 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener
            r0.<init>(r8, r11, r12)
            r5 = 0
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r3 = 0
            r1 = r8
            r2 = r9
            r6 = r0
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            if (r10 == 0) goto L4c
            java.util.Objects.requireNonNull(r0)
            androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1 r8 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1
            r8.<init>(r0)
            r10.setOnCancelListener(r8)
        L4c:
            r8 = 30000(0x7530, double:1.4822E-319)
            r0.startTimeout(r8)
            return
    }

    @java.lang.Deprecated
    public static void getCurrentLocation(android.location.LocationManager r0, java.lang.String r1, androidx.core.os.CancellationSignal r2, java.util.concurrent.Executor r3, androidx.core.util.Consumer<android.location.Location> r4) {
            if (r2 == 0) goto L9
            java.lang.Object r2 = r2.getCancellationSignalObject()
            android.os.CancellationSignal r2 = (android.os.CancellationSignal) r2
            goto La
        L9:
            r2 = 0
        La:
            getCurrentLocation(r0, r1, r2, r3, r4)
            return
    }

    public static java.lang.String getGnssHardwareModelName(android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r2 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssHardwareModelName(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int getGnssYearOfHardware(android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssYearOfHardware(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean hasProvider(android.location.LocationManager r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api31Impl.hasProvider(r2, r3)
            return r2
        Lb:
            java.util.List r0 = r2.getAllProviders()
            boolean r0 = r0.contains(r3)
            r1 = 1
            if (r0 == 0) goto L17
            return r1
        L17:
            r0 = 0
            android.location.LocationProvider r2 = r2.getProvider(r3)     // Catch: java.lang.SecurityException -> L21
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r1 = r0
        L20:
            return r1
        L21:
            return r0
    }

    public static boolean isLocationEnabled(android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api28Impl.isLocationEnabled(r2)
            return r2
        Lb:
            java.lang.String r0 = "network"
            boolean r0 = r2.isProviderEnabled(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "gps"
            boolean r2 = r2.isProviderEnabled(r0)
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = 0
            goto L1f
        L1e:
            r2 = 1
        L1f:
            return r2
    }

    static /* synthetic */ void lambda$getCurrentLocation$0(androidx.core.util.Consumer r0, android.location.Location r1) {
            r0.accept(r1)
            return
    }

    static /* synthetic */ java.lang.Boolean lambda$registerGnssStatusCallback$1(android.location.LocationManager r0, androidx.core.location.LocationManagerCompat.GpsStatusTransport r1) throws java.lang.Exception {
            boolean r0 = r0.addGpsStatusListener(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager r2, android.location.GnssMeasurementsEvent.Callback r3, android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r3, r4)
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L18
            java.util.concurrent.Executor r4 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r2 = registerGnssMeasurementsCallbackOnR(r2, r4, r3)
            return r2
        L18:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            unregisterGnssMeasurementsCallback(r2, r3)     // Catch: java.lang.Throwable -> L2f
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r3, r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L2c
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners     // Catch: java.lang.Throwable -> L2f
            r2.put(r3, r3)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            return r2
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            return r2
        L2f:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r2
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager r2, java.util.concurrent.Executor r3, android.location.GnssMeasurementsEvent.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api31Impl.registerGnssMeasurementsCallback(r2, r3, r4)
            return r2
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L14
            boolean r2 = registerGnssMeasurementsCallbackOnR(r2, r3, r4)
            return r2
        L14:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport r1 = new androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport     // Catch: java.lang.Throwable -> L30
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L30
            unregisterGnssMeasurementsCallback(r2, r4)     // Catch: java.lang.Throwable -> L30
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r1)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L2d
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners     // Catch: java.lang.Throwable -> L30
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r2 = 1
            return r2
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r2 = 0
            return r2
        L30:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    private static boolean registerGnssMeasurementsCallbackOnR(android.location.LocationManager r7, java.util.concurrent.Executor r8, android.location.GnssMeasurementsEvent.Callback r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L78
            r0 = 0
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L13
            java.lang.String r1 = "android.location.GnssRequest$Builder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L77
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass = r1     // Catch: java.lang.Throwable -> L77
        L13:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.Throwable -> L77
            r2 = 1
            if (r1 != 0) goto L27
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = "build"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L77
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L77
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod = r1     // Catch: java.lang.Throwable -> L77
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L77
        L27:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L4c
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            java.lang.String r3 = "registerGnssMeasurementsCallback"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = "android.location.GnssRequest"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L77
            r4[r0] = r5     // Catch: java.lang.Throwable -> L77
            java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
            r4[r2] = r5     // Catch: java.lang.Throwable -> L77
            java.lang.Class<android.location.GnssMeasurementsEvent$Callback> r5 = android.location.GnssMeasurementsEvent.Callback.class
            r6 = 2
            r4[r6] = r5     // Catch: java.lang.Throwable -> L77
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L77
            androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod = r1     // Catch: java.lang.Throwable -> L77
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L77
        L4c:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.Throwable -> L77
            java.lang.reflect.Method r3 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.Throwable -> L77
            java.lang.Class<?> r4 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L77
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L77
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L77
            java.lang.Object r4 = r4.newInstance(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L77
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r8, r9}     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r1.invoke(r7, r8)     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L77
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L77
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L77
            r0 = r2
        L77:
            return r0
        L78:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
    }

    private static boolean registerGnssStatusCallback(android.location.LocationManager r2, android.os.Handler r3, java.util.concurrent.Executor r4, androidx.core.location.GnssStatusCompat.Callback r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api30Impl.registerGnssStatusCallback(r2, r3, r4, r5)
            return r2
        Lb:
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssStatusCallback(r2, r3, r4, r5)
            return r2
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager r2, androidx.core.location.GnssStatusCompat.Callback r3, android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            java.util.concurrent.Executor r4 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r2 = registerGnssStatusCallback(r2, r4, r3)
            return r2
        Lf:
            androidx.core.location.LocationManagerCompat$InlineHandlerExecutor r0 = new androidx.core.location.LocationManagerCompat$InlineHandlerExecutor
            r0.<init>(r4)
            boolean r2 = registerGnssStatusCallback(r2, r0, r3)
            return r2
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager r2, java.util.concurrent.Executor r3, androidx.core.location.GnssStatusCompat.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            r0 = 0
            boolean r2 = registerGnssStatusCallback(r2, r0, r3, r4)
            return r2
        Lc:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L16:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            boolean r2 = registerGnssStatusCallback(r2, r1, r3, r4)
            return r2
    }

    static void registerLocationListenerTransport(android.location.LocationManager r3, androidx.core.location.LocationManagerCompat.LocationListenerTransport r4) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            androidx.core.location.LocationManagerCompat$LocationListenerKey r1 = r4.getKey()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            java.lang.Object r4 = r0.put(r1, r2)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            if (r4 == 0) goto L1a
            java.lang.Object r4 = r4.get()
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r4 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r4
            goto L1b
        L1a:
            r4 = 0
        L1b:
            if (r4 == 0) goto L23
            r4.unregister()
            r3.removeUpdates(r4)
        L23:
            return
    }

    public static void removeUpdates(android.location.LocationManager r6, androidx.core.location.LocationListenerCompat r7) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r0)
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L57
            r2 = 0
        Lc:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L57
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L57
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r3 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r3     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L21
            goto Lc
        L21:
            androidx.core.location.LocationManagerCompat$LocationListenerKey r4 = r3.getKey()     // Catch: java.lang.Throwable -> L57
            androidx.core.location.LocationListenerCompat r5 = r4.mListener     // Catch: java.lang.Throwable -> L57
            if (r5 != r7) goto Lc
            if (r2 != 0) goto L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57
            r2.<init>()     // Catch: java.lang.Throwable -> L57
        L30:
            r2.add(r4)     // Catch: java.lang.Throwable -> L57
            r3.unregister()     // Catch: java.lang.Throwable -> L57
            r6.removeUpdates(r3)     // Catch: java.lang.Throwable -> L57
            goto Lc
        L3a:
            if (r2 == 0) goto L52
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L57
        L40:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L57
            androidx.core.location.LocationManagerCompat$LocationListenerKey r2 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r2     // Catch: java.lang.Throwable -> L57
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r3 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L57
            r3.remove(r2)     // Catch: java.lang.Throwable -> L57
            goto L40
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            r6.removeUpdates(r7)
            return
        L57:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r6
    }

    public static void requestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, androidx.core.location.LocationListenerCompat r11, android.os.Looper r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            android.location.LocationRequest r10 = r10.toLocationRequest()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r12)
            java.util.concurrent.Executor r12 = androidx.core.os.ExecutorCompat.create(r0)
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r8, r9, r10, r12, r11)
            return
        L17:
            boolean r0 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L1e
            return
        L1e:
            long r3 = r10.getIntervalMillis()
            float r5 = r10.getMinUpdateDistanceMeters()
            r1 = r8
            r2 = r9
            r6 = r11
            r7 = r12
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            return
    }

    public static void requestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, java.util.concurrent.Executor r11, androidx.core.location.LocationListenerCompat r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Le
            android.location.LocationRequest r10 = r10.toLocationRequest()
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r8, r9, r10, r11, r12)
            return
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1b
            boolean r0 = androidx.core.location.LocationManagerCompat.Api30Impl.tryRequestLocationUpdates(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L1b
            return
        L1b:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r0 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport
            androidx.core.location.LocationManagerCompat$LocationListenerKey r1 = new androidx.core.location.LocationManagerCompat$LocationListenerKey
            r1.<init>(r9, r12)
            r0.<init>(r1, r11)
            boolean r11 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r8, r9, r10, r0)
            if (r11 == 0) goto L2c
            return
        L2c:
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r11 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r11)
            long r3 = r10.getIntervalMillis()     // Catch: java.lang.Throwable -> L46
            float r5 = r10.getMinUpdateDistanceMeters()     // Catch: java.lang.Throwable -> L46
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L46
            r1 = r8
            r2 = r9
            r6 = r0
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            registerLocationListenerTransport(r8, r0)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r8 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L46
            throw r8
    }

    public static void unregisterGnssMeasurementsCallback(android.location.LocationManager r2, android.location.GnssMeasurementsEvent.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(r2, r3)
            goto L25
        La:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L26
            android.location.GnssMeasurementsEvent$Callback r3 = (android.location.GnssMeasurementsEvent.Callback) r3     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L24
            boolean r1 = r3 instanceof androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L21
            r1 = r3
            androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport r1 = (androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport) r1     // Catch: java.lang.Throwable -> L26
            r1.unregister()     // Catch: java.lang.Throwable -> L26
        L21:
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(r2, r3)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
        L25:
            return
        L26:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r2
    }

    public static void unregisterGnssStatusCallback(android.location.LocationManager r2, androidx.core.location.GnssStatusCompat.Callback r3) {
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r0)
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto Le
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssStatusCallback(r2, r3)     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }
}
