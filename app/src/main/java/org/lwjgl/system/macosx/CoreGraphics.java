package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreGraphics.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreGraphics.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreGraphics.class */
public class CoreGraphics {
    private static final org.lwjgl.system.SharedLibrary COREGRAPHICS = null;
    public static final int kCGErrorSuccess = 0;
    public static final int kCGErrorFailure = 1000;
    public static final int kCGErrorIllegalArgument = 1001;
    public static final int kCGErrorInvalidConnection = 1002;
    public static final int kCGErrorInvalidContext = 1003;
    public static final int kCGErrorCannotComplete = 1004;
    public static final int kCGErrorNotImplemented = 1006;
    public static final int kCGErrorRangeCheck = 1007;
    public static final int kCGErrorTypeCheck = 1008;
    public static final int kCGErrorInvalidOperation = 1010;
    public static final int kCGErrorNoneAvailable = 1011;
    public static final int kCGEventNull = 0;
    public static final int kCGEventLeftMouseDown = 1;
    public static final int kCGEventLeftMouseUp = 2;
    public static final int kCGEventRightMouseDown = 3;
    public static final int kCGEventRightMouseUp = 4;
    public static final int kCGEventMouseMoved = 5;
    public static final int kCGEventLeftMouseDragged = 6;
    public static final int kCGEventRightMouseDragged = 7;
    public static final int kCGEventKeyDown = 10;
    public static final int kCGEventKeyUp = 11;
    public static final int kCGEventFlagsChanged = 12;
    public static final int kCGEventScrollWheel = 22;
    public static final int kCGEventTabletPointer = 23;
    public static final int kCGEventTabletProximity = 24;
    public static final int kCGEventOtherMouseDown = 25;
    public static final int kCGEventOtherMouseUp = 26;
    public static final int kCGEventOtherMouseDragged = 27;
    public static final int kCGEventTapDisabledByTimeout = -2;
    public static final int kCGEventTapDisabledByUserInput = -1;
    public static final int kCGMouseButtonLeft = 0;
    public static final int kCGMouseButtonRight = 1;
    public static final int kCGMouseButtonCenter = 2;
    public static final int kCGHIDEventTap = 0;
    public static final int kCGSessionEventTap = 1;
    public static final int kCGAnnotatedSessionEventTap = 2;
    public static final int kCGScrollEventUnitPixel = 0;
    public static final int kCGScrollEventUnitLine = 1;
    public static final int kCGMouseEventNumber = 0;
    public static final int kCGMouseEventClickState = 1;
    public static final int kCGMouseEventPressure = 2;
    public static final int kCGMouseEventButtonNumber = 3;
    public static final int kCGMouseEventDeltaX = 4;
    public static final int kCGMouseEventDeltaY = 5;
    public static final int kCGMouseEventInstantMouser = 6;
    public static final int kCGMouseEventSubtype = 7;
    public static final int kCGKeyboardEventAutorepeat = 8;
    public static final int kCGKeyboardEventKeycode = 9;
    public static final int kCGKeyboardEventKeyboardType = 10;
    public static final int kCGScrollWheelEventDeltaAxis1 = 11;
    public static final int kCGScrollWheelEventDeltaAxis2 = 12;
    public static final int kCGScrollWheelEventDeltaAxis3 = 13;
    public static final int kCGScrollWheelEventFixedPtDeltaAxis1 = 93;
    public static final int kCGScrollWheelEventFixedPtDeltaAxis2 = 94;
    public static final int kCGScrollWheelEventFixedPtDeltaAxis3 = 95;
    public static final int kCGScrollWheelEventPointDeltaAxis1 = 96;
    public static final int kCGScrollWheelEventPointDeltaAxis2 = 97;
    public static final int kCGScrollWheelEventPointDeltaAxis3 = 98;
    public static final int kCGScrollWheelEventScrollPhase = 99;
    public static final int kCGScrollWheelEventScrollCount = 100;
    public static final int kCGScrollWheelEventMomentumPhase = 123;
    public static final int kCGScrollWheelEventInstantMouser = 14;
    public static final int kCGTabletEventPointX = 15;
    public static final int kCGTabletEventPointY = 16;
    public static final int kCGTabletEventPointZ = 17;
    public static final int kCGTabletEventPointButtons = 18;
    public static final int kCGTabletEventPointPressure = 19;
    public static final int kCGTabletEventTiltX = 20;
    public static final int kCGTabletEventTiltY = 21;
    public static final int kCGTabletEventRotation = 22;
    public static final int kCGTabletEventTangentialPressure = 23;
    public static final int kCGTabletEventDeviceID = 24;
    public static final int kCGTabletEventVendor1 = 25;
    public static final int kCGTabletEventVendor2 = 26;
    public static final int kCGTabletEventVendor3 = 27;
    public static final int kCGTabletProximityEventVendorID = 28;
    public static final int kCGTabletProximityEventTabletID = 29;
    public static final int kCGTabletProximityEventPointerID = 30;
    public static final int kCGTabletProximityEventDeviceID = 31;
    public static final int kCGTabletProximityEventSystemTabletID = 32;
    public static final int kCGTabletProximityEventVendorPointerType = 33;
    public static final int kCGTabletProximityEventVendorPointerSerialNumber = 34;
    public static final int kCGTabletProximityEventVendorUniqueID = 35;
    public static final int kCGTabletProximityEventCapabilityMask = 36;
    public static final int kCGTabletProximityEventPointerType = 37;
    public static final int kCGTabletProximityEventEnterProximity = 38;
    public static final int kCGEventTargetProcessSerialNumber = 39;
    public static final int kCGEventTargetUnixProcessID = 40;
    public static final int kCGEventSourceUnixProcessID = 41;
    public static final int kCGEventSourceUserData = 42;
    public static final int kCGEventSourceUserID = 43;
    public static final int kCGEventSourceGroupID = 44;
    public static final int kCGEventSourceStateID = 45;
    public static final int kCGScrollWheelEventIsContinuous = 88;
    public static final int kCGMouseEventWindowUnderMousePointer = 91;
    public static final int kCGMouseEventWindowUnderMousePointerThatCanHandleThisEvent = 92;
    public static final int kCGEventMouseSubtypeDefault = 0;
    public static final int kCGEventMouseSubtypeTabletPoint = 1;
    public static final int kCGEventMouseSubtypeTabletProximity = 2;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreGraphics$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreGraphics$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CoreGraphics$Functions.class */
    public static final class Functions {
        public static final long EventGetTypeID = 0;
        public static final long EventCreate = 0;
        public static final long EventCreateData = 0;
        public static final long EventCreateFromData = 0;
        public static final long EventCreateMouseEvent = 0;
        public static final long EventCreateKeyboardEvent = 0;
        public static final long EventCreateScrollWheelEvent = 0;
        public static final long EventCreateScrollWheelEvent2 = 0;
        public static final long EventCreateCopy = 0;
        public static final long EventCreateSourceFromEvent = 0;
        public static final long EventSetSource = 0;
        public static final long EventGetType = 0;
        public static final long EventSetType = 0;
        public static final long EventGetTimestamp = 0;
        public static final long EventSetTimestamp = 0;
        public static final long EventGetLocation = 0;
        public static final long EventGetUnflippedLocation = 0;
        public static final long EventSetLocation = 0;
        public static final long EventGetFlags = 0;
        public static final long EventSetFlags = 0;
        public static final long EventKeyboardGetUnicodeString = 0;
        public static final long EventKeyboardSetUnicodeString = 0;
        public static final long EventGetIntegerValueField = 0;
        public static final long EventSetIntegerValueField = 0;
        public static final long EventGetDoubleValueField = 0;
        public static final long EventSetDoubleValueField = 0;
        public static final long EventTapCreate = 0;
        public static final long EventTapCreateForPid = 0;
        public static final long EventTapEnable = 0;
        public static final long EventTapIsEnabled = 0;
        public static final long EventTapPostEvent = 0;
        public static final long EventPost = 0;
        public static final long EventPostToPid = 0;
        public static final long GetEventTapList = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetTypeID"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetTypeID = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateData"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateData = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateFromData"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateFromData = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateMouseEvent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateMouseEvent = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateKeyboardEvent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateKeyboardEvent = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateScrollWheelEvent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateScrollWheelEvent = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateScrollWheelEvent2"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateScrollWheelEvent2 = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateCopy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateCopy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventCreateSourceFromEvent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateSourceFromEvent = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventSetSource"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetSource = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventSetType"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetType = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetTimestamp"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetTimestamp = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventSetTimestamp"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetTimestamp = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetLocation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetLocation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetUnflippedLocation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetUnflippedLocation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventSetLocation"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetLocation = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetFlags"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetFlags = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventSetFlags"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetFlags = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventKeyboardGetUnicodeString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventKeyboardGetUnicodeString = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventKeyboardSetUnicodeString"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventKeyboardSetUnicodeString = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetIntegerValueField"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetIntegerValueField = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventSetIntegerValueField"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetIntegerValueField = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventGetDoubleValueField"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetDoubleValueField = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventSetDoubleValueField"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetDoubleValueField = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventTapCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventTapCreateForPid"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapCreateForPid = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventTapEnable"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapEnable = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventTapIsEnabled"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapIsEnabled = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventTapPostEvent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapPostEvent = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventPost"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventPost = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGEventPostToPid"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.EventPostToPid = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.access$000()
                java.lang.String r1 = "CGGetEventTapList"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.macosx.CoreGraphics.Functions.GetEventTapList = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.COREGRAPHICS
            return r0
    }

    protected CoreGraphics() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("CFTypeID")
    public static long CGEventGetTypeID() {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetTypeID
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeJ(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreate(@org.lwjgl.system.NativeType("CGEventSourceRef") long r5) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreate
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CFDataRef")
    public static long CGEventCreateData(@org.lwjgl.system.NativeType("CFAllocatorRef") long r7, @org.lwjgl.system.NativeType("CGEventRef") long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateData
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreateFromData(@org.lwjgl.system.NativeType("CFAllocatorRef") long r7, @org.lwjgl.system.NativeType("CFDataRef") long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateFromData
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    public static native long nCGEventCreateMouseEvent(long r0, int r2, long r3, int r5, long r6);

    public static long nCGEventCreateMouseEvent(long r9, int r11, long r12, int r14) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateMouseEvent
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            long r0 = nCGEventCreateMouseEvent(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreateMouseEvent(@org.lwjgl.system.NativeType("CGEventSourceRef") long r7, @org.lwjgl.system.NativeType("CGEventType") int r9, org.lwjgl.system.macosx.CGPoint r10, @org.lwjgl.system.NativeType("CGMouseButton") int r11) {
            r0 = r7
            r1 = r9
            r2 = r10
            long r2 = r2.address()
            r3 = r11
            long r0 = nCGEventCreateMouseEvent(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreateKeyboardEvent(@org.lwjgl.system.NativeType("CGEventSourceRef") long r7, @org.lwjgl.system.NativeType("CGKeyCode") short r9, @org.lwjgl.system.NativeType("bool") boolean r10) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateKeyboardEvent
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.invokePCP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent(@org.lwjgl.system.NativeType("CGEventSourceRef") long r8, @org.lwjgl.system.NativeType("CGScrollEventUnit") int r10, @org.lwjgl.system.NativeType("uint32_t") int r11, @org.lwjgl.system.NativeType("int32_t") int r12) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateScrollWheelEvent
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent(@org.lwjgl.system.NativeType("CGEventSourceRef") long r8, @org.lwjgl.system.NativeType("CGScrollEventUnit") int r10, @org.lwjgl.system.NativeType("int32_t") int r11) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateScrollWheelEvent
            r12 = r0
            r0 = r8
            r1 = r10
            r2 = 1
            r3 = r11
            r4 = r12
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreateScrollWheelEvent2(@org.lwjgl.system.NativeType("CGEventSourceRef") long r10, @org.lwjgl.system.NativeType("CGScrollEventUnit") int r12, @org.lwjgl.system.NativeType("uint32_t") int r13, @org.lwjgl.system.NativeType("int32_t") int r14, @org.lwjgl.system.NativeType("int32_t") int r15, @org.lwjgl.system.NativeType("int32_t") int r16) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateScrollWheelEvent2
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L11:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventRef")
    public static long CGEventCreateCopy(@org.lwjgl.system.NativeType("CGEventRef") long r5) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateCopy
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("CGEventSourceRef")
    public static long CGEventCreateSourceFromEvent(@org.lwjgl.system.NativeType("CGEventRef") long r5) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventCreateSourceFromEvent
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static void CGEventSetSource(@org.lwjgl.system.NativeType("CGEventRef") long r7, @org.lwjgl.system.NativeType("CGEventSourceRef") long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetSource
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("CGEventType")
    public static int CGEventGetType(@org.lwjgl.system.NativeType("CGEventRef") long r5) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetType
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static void CGEventSetType(@org.lwjgl.system.NativeType("CGEventRef") long r6, @org.lwjgl.system.NativeType("CGEventType") int r8) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetType
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("CGEventTimestamp")
    public static long CGEventGetTimestamp(@org.lwjgl.system.NativeType("CGEventRef") long r5) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetTimestamp
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePJ(r0, r1)
            return r0
    }

    public static void CGEventSetTimestamp(@org.lwjgl.system.NativeType("CGEventRef") long r7, @org.lwjgl.system.NativeType("CGEventTimestamp") long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetTimestamp
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePJV(r0, r1, r2)
            return
    }

    public static native void nCGEventGetLocation(long r0, long r2, long r4);

    public static void nCGEventGetLocation(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetLocation
            r11 = r0
            r0 = r7
            r1 = r11
            r2 = r9
            nCGEventGetLocation(r0, r1, r2)
            return
    }

    public static org.lwjgl.system.macosx.CGPoint CGEventGetLocation(@org.lwjgl.system.NativeType("CGEventRef") long r5, org.lwjgl.system.macosx.CGPoint r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nCGEventGetLocation(r0, r1)
            r0 = r7
            return r0
    }

    public static native void nCGEventGetUnflippedLocation(long r0, long r2, long r4);

    public static void nCGEventGetUnflippedLocation(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetUnflippedLocation
            r11 = r0
            r0 = r7
            r1 = r11
            r2 = r9
            nCGEventGetUnflippedLocation(r0, r1, r2)
            return
    }

    public static org.lwjgl.system.macosx.CGPoint CGEventGetUnflippedLocation(@org.lwjgl.system.NativeType("CGEventRef") long r5, org.lwjgl.system.macosx.CGPoint r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nCGEventGetUnflippedLocation(r0, r1)
            r0 = r7
            return r0
    }

    public static native void nCGEventSetLocation(long r0, long r2, long r4);

    public static void nCGEventSetLocation(long r7, long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetLocation
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            nCGEventSetLocation(r0, r1, r2)
            return
    }

    public static void CGEventSetLocation(@org.lwjgl.system.NativeType("CGEventRef") long r5, org.lwjgl.system.macosx.CGPoint r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nCGEventSetLocation(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("CGEventFlags")
    public static long CGEventGetFlags(@org.lwjgl.system.NativeType("CGEventRef") long r5) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetFlags
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePJ(r0, r1)
            return r0
    }

    public static void CGEventSetFlags(@org.lwjgl.system.NativeType("CGEventRef") long r7, @org.lwjgl.system.NativeType("CGEventFlags") long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetFlags
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePJV(r0, r1, r2)
            return
    }

    public static void nCGEventKeyboardGetUnicodeString(long r11, long r13, long r15, long r17) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventKeyboardGetUnicodeString
            r19 = r0
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            org.lwjgl.system.JNI.invokePNPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void CGEventKeyboardGetUnicodeString(@org.lwjgl.system.NativeType("CGEventRef") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("UniCharCount *") org.lwjgl.CLongBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("UniChar *") java.nio.ShortBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r9
            r1 = r12
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            long r1 = (long) r1
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nCGEventKeyboardGetUnicodeString(r0, r1, r2, r3)
            return
    }

    public static void nCGEventKeyboardSetUnicodeString(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventKeyboardSetUnicodeString
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePNPV(r0, r1, r2, r3)
            return
    }

    public static void CGEventKeyboardSetUnicodeString(@org.lwjgl.system.NativeType("CGEventRef") long r7, @org.lwjgl.system.NativeType("UniChar const *") java.nio.ShortBuffer r9) {
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nCGEventKeyboardSetUnicodeString(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("int64_t")
    public static long CGEventGetIntegerValueField(@org.lwjgl.system.NativeType("CGEventRef") long r6, @org.lwjgl.system.NativeType("CGEventField") int r8) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetIntegerValueField
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePJ(r0, r1, r2)
            return r0
    }

    public static void CGEventSetIntegerValueField(@org.lwjgl.system.NativeType("CGEventRef") long r8, @org.lwjgl.system.NativeType("CGEventField") int r10, @org.lwjgl.system.NativeType("int64_t") long r11) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetIntegerValueField
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            org.lwjgl.system.JNI.invokePJV(r0, r1, r2, r3)
            return
    }

    public static double CGEventGetDoubleValueField(@org.lwjgl.system.NativeType("CGEventRef") long r6, @org.lwjgl.system.NativeType("CGEventField") int r8) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventGetDoubleValueField
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            double r0 = org.lwjgl.system.JNI.invokePD(r0, r1, r2)
            return r0
    }

    public static void CGEventSetDoubleValueField(@org.lwjgl.system.NativeType("CGEventRef") long r8, @org.lwjgl.system.NativeType("CGEventField") int r10, double r11) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventSetDoubleValueField
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    public static long nCGEventTapCreate(int r12, int r13, int r14, long r15, long r17, long r19) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapCreate
            r21 = r0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r19
            r6 = r21
            long r0 = org.lwjgl.system.JNI.invokeJPPP(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("CFMachPortRef")
    public static long CGEventTapCreate(@org.lwjgl.system.NativeType("CGEventTapLocation") int r10, @org.lwjgl.system.NativeType("CGEventTapPlacement") int r11, @org.lwjgl.system.NativeType("CGEventTapOptions") int r12, @org.lwjgl.system.NativeType("CGEventMask") long r13, @org.lwjgl.system.NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)") org.lwjgl.system.macosx.CGEventTapCallBackI r15, @org.lwjgl.system.NativeType("void *") long r16) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            long r4 = r4.address()
            r5 = r16
            long r0 = nCGEventTapCreate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static long nCGEventTapCreateForPid(long r13, int r15, int r16, long r17, long r19, long r21) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapCreateForPid
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r23
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L16:
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r21
            r6 = r23
            long r0 = org.lwjgl.system.JNI.invokePJPPP(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.lwjgl.system.NativeType("CFMachPortRef")
    public static long CGEventTapCreateForPid(@org.lwjgl.system.NativeType("pid_t") long r11, @org.lwjgl.system.NativeType("CGEventTapPlacement") int r13, @org.lwjgl.system.NativeType("CGEventTapOptions") int r14, @org.lwjgl.system.NativeType("CGEventMask") long r15, @org.lwjgl.system.NativeType("CGEventRef (*) (CGEventTapProxy, CGEventType, CGEventRef, void *)") org.lwjgl.system.macosx.CGEventTapCallBackI r17, @org.lwjgl.system.NativeType("void *") long r18) {
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            long r4 = r4.address()
            r5 = r18
            long r0 = nCGEventTapCreateForPid(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void CGEventTapEnable(@org.lwjgl.system.NativeType("CFMachPortRef") long r6, @org.lwjgl.system.NativeType("bool") boolean r8) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapEnable
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean CGEventTapIsEnabled(@org.lwjgl.system.NativeType("CFMachPortRef") long r5) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapIsEnabled
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    public static void CGEventTapPostEvent(@org.lwjgl.system.NativeType("CGEventTapProxy") long r7, @org.lwjgl.system.NativeType("CGEventRef") long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventTapPostEvent
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void CGEventPost(@org.lwjgl.system.NativeType("CGEventTapLocation") int r6, @org.lwjgl.system.NativeType("CGEventRef") long r7) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventPost
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    public static void CGEventPostToPid(@org.lwjgl.system.NativeType("pid_t") long r7, @org.lwjgl.system.NativeType("CGEventRef") long r9) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventPostToPid
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L16:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static int nCGGetEventTapList(int r8, long r9, long r11) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.GetEventTapList
            r13 = r0
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("CGError")
    public static int CGGetEventTapList(@javax.annotation.Nullable @org.lwjgl.system.NativeType("CGEventTapInformation *") org.lwjgl.system.macosx.CGEventTapInformation.Buffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r6
            int r0 = org.lwjgl.system.Checks.remainingSafe(r0)
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            int r0 = nCGGetEventTapList(r0, r1, r2)
            return r0
    }

    public static void CGEventKeyboardGetUnicodeString(@org.lwjgl.system.NativeType("CGEventRef") long r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("UniCharCount *") org.lwjgl.CLongBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("UniChar *") short[] r13) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventKeyboardGetUnicodeString
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r10
            r1 = r13
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            long r1 = (long) r1
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r13
            r4 = r14
            org.lwjgl.system.JNI.invokePNPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void CGEventKeyboardSetUnicodeString(@org.lwjgl.system.NativeType("CGEventRef") long r8, @org.lwjgl.system.NativeType("UniChar const *") short[] r10) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.EventKeyboardSetUnicodeString
            r11 = r0
            r0 = r8
            r1 = r10
            int r1 = r1.length
            long r1 = (long) r1
            r2 = r10
            r3 = r11
            org.lwjgl.system.JNI.invokePNPV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("CGError")
    public static int CGGetEventTapList(@javax.annotation.Nullable @org.lwjgl.system.NativeType("CGEventTapInformation *") org.lwjgl.system.macosx.CGEventTapInformation.Buffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t *") int[] r8) {
            long r0 = org.lwjgl.system.macosx.CoreGraphics.Functions.GetEventTapList
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lf:
            r0 = r7
            int r0 = org.lwjgl.system.Checks.remainingSafe(r0)
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r8
            r3 = r9
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.CoreGraphics.COREGRAPHICS
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.system.macosx.CoreGraphics> r0 = org.lwjgl.system.macosx.CoreGraphics.class
            java.lang.String r1 = "org.lwjgl"
            java.lang.String r2 = "/System/Library/Frameworks/CoreGraphics.framework"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            org.lwjgl.system.macosx.CoreGraphics.COREGRAPHICS = r0
            return
    }
}
