package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class TouchControlsLayoutData {
    private static final float DEFAULT_IMPORTED_SOURCE_HEIGHT = 480.0f;
    private static final float DEFAULT_IMPORTED_SOURCE_WIDTH = 854.0f;
    public static final java.lang.String UNIT_DP = "dp";
    public static final java.lang.String UNIT_PX = "px";
    public final java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> controls;
    public java.lang.String coordinateUnit;
    public java.lang.String name;
    public float preferredScale;
    public float sourceHeight;
    public float sourceWidth;
    public int version;

    public TouchControlsLayoutData() {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.version = r0
            java.lang.String r0 = "Touch Controls"
            r1.name = r0
            r0 = 1120403456(0x42c80000, float:100.0)
            r1.preferredScale = r0
            java.lang.String r0 = "dp"
            r1.coordinateUnit = r0
            r0 = 0
            r1.sourceWidth = r0
            r1.sourceHeight = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.controls = r0
            return
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlsLayoutData defaultLayout() {
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = new ca.dnamobile.javalauncher.controls.TouchControlsLayoutData
            r0.<init>()
            java.lang.String r1 = "Default Touch Controls"
            r0.name = r1
            java.lang.String r1 = "dp"
            r0.coordinateUnit = r1
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r1.<init>()
            java.lang.String r2 = "Keyboard"
            r1.label = r2
            java.lang.String r2 = "keyboard"
            r1.action = r2
            r2 = 1117782016(0x42a00000, float:80.0)
            r1.width = r2
            r3 = 1106247680(0x41f00000, float:30.0)
            r1.height = r3
            java.lang.String r4 = "${margin} * 3 + ${width} * 2"
            r1.rawX = r4
            java.lang.String r5 = "${margin}"
            r1.rawY = r5
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r6 = r0.controls
            r6.add(r1)
            r11 = 1117782016(0x42a00000, float:80.0)
            r12 = 1106247680(0x41f00000, float:30.0)
            java.lang.String r7 = "Chat"
            r8 = 84
            r9 = 0
            r10 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r7, r8, r9, r10, r11, r12)
            java.lang.String r6 = "${margin} * 2 + ${width}"
            r1.rawX = r6
            r1.rawY = r5
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r7 = r0.controls
            r7.add(r1)
            r12 = 1117782016(0x42a00000, float:80.0)
            r13 = 1106247680(0x41f00000, float:30.0)
            java.lang.String r8 = "Debug"
            r9 = 292(0x124, float:4.09E-43)
            r11 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r8, r9, r10, r11, r12, r13)
            r1.rawX = r5
            java.lang.String r7 = "${margin} * 2 + ${height}"
            r1.rawY = r7
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r8 = r0.controls
            r8.add(r1)
            r13 = 1117782016(0x42a00000, float:80.0)
            r14 = 1106247680(0x41f00000, float:30.0)
            java.lang.String r9 = "3rd"
            r10 = 294(0x126, float:4.12E-43)
            r12 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r9, r10, r11, r12, r13, r14)
            r1.rawX = r6
            r1.rawY = r7
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r7 = r0.controls
            r7.add(r1)
            r12 = 1117782016(0x42a00000, float:80.0)
            r13 = 1106247680(0x41f00000, float:30.0)
            java.lang.String r8 = "Esc"
            r9 = 256(0x100, float:3.59E-43)
            r10 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r8, r9, r10, r11, r12, r13)
            r1.rawX = r5
            r1.rawY = r5
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r7 = r0.controls
            r7.add(r1)
            r12 = 1112014848(0x42480000, float:50.0)
            r13 = 1112014848(0x42480000, float:50.0)
            java.lang.String r8 = "▲"
            r9 = 87
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r8, r9, r10, r11, r12, r13)
            r1.rawX = r6
            java.lang.String r7 = "${bottom} - ${margin} * 3 - ${height} * 2"
            r1.rawY = r7
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r7 = r0.controls
            r7.add(r1)
            java.lang.String r8 = "◀"
            r9 = 65
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r8, r9, r10, r11, r12, r13)
            r1.rawX = r5
            java.lang.String r7 = "${bottom} - ${margin} * 2 - ${height}"
            r1.rawY = r7
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r8 = r0.controls
            r8.add(r1)
            r14 = 1112014848(0x42480000, float:50.0)
            java.lang.String r9 = "▼"
            r10 = 83
            r12 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r9, r10, r11, r12, r13, r14)
            r1.rawX = r6
            java.lang.String r8 = "${bottom} - ${margin}"
            r1.rawY = r8
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r9 = r0.controls
            r9.add(r1)
            r15 = 1112014848(0x42480000, float:50.0)
            java.lang.String r10 = "▶"
            r11 = 68
            r13 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r10, r11, r12, r13, r14, r15)
            r1.rawX = r4
            r1.rawY = r7
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r4 = r0.controls
            r4.add(r1)
            r13 = 1112014848(0x42480000, float:50.0)
            java.lang.String r9 = "◇"
            r10 = 340(0x154, float:4.76E-43)
            r11 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r9, r10, r11, r12, r13, r14)
            r4 = 1
            r1.toggle = r4
            r1.rawX = r6
            java.lang.String r6 = "${bottom} - ${margin} * 4 - ${height} * 3"
            r1.rawY = r6
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r9 = r0.controls
            r9.add(r1)
            java.lang.String r10 = "⬛"
            r11 = 32
            r13 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r10, r11, r12, r13, r14, r15)
            java.lang.String r9 = "${right} - ${margin} * 2 - ${width}"
            r1.rawX = r9
            r1.rawY = r7
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r7 = r0.controls
            r7.add(r1)
            r13 = 1112014848(0x42480000, float:50.0)
            java.lang.String r9 = "Inv"
            r10 = 69
            r11 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r9, r10, r11, r12, r13, r14)
            java.lang.String r7 = "${right} - ${margin}"
            r1.rawX = r7
            r1.rawY = r8
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r8 = r0.controls
            r8.add(r1)
            java.lang.String r1 = "Hit"
            r8 = 0
            r9 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.mouse(r1, r8, r9, r9)
            java.lang.String r8 = "${right} - ${margin} * 3 - ${width} * 2"
            r1.rawX = r8
            r1.rawY = r6
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r8 = r0.controls
            r8.add(r1)
            java.lang.String r1 = "Use"
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = ca.dnamobile.javalauncher.controls.TouchControlData.mouse(r1, r4, r9, r9)
            r1.rawX = r7
            r1.rawY = r6
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r4 = r0.controls
            r4.add(r1)
            ca.dnamobile.javalauncher.controls.TouchControlData r1 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r1.<init>()
            java.lang.String r4 = "Mouse"
            r1.label = r4
            java.lang.String r4 = "virtual_mouse"
            r1.action = r4
            r1.width = r2
            r1.height = r3
            java.lang.String r2 = "${right}"
            r1.rawX = r2
            r1.rawY = r5
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r2 = r0.controls
            r2.add(r1)
            return r0
    }

    private static float firstPositiveFloat(org.json.JSONObject r7, java.lang.String... r8) {
            int r0 = r8.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L2e
            r2 = r8[r1]
            boolean r3 = r7.has(r2)
            if (r3 == 0) goto L2b
            boolean r3 = r7.isNull(r2)
            if (r3 == 0) goto L13
            goto L2b
        L13:
            r3 = 0
            double r5 = r7.optDouble(r2, r3)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r5)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isInfinite(r5)
            if (r2 != 0) goto L2b
            float r7 = (float) r5
            return r7
        L2b:
            int r1 = r1 + 1
            goto L2
        L2e:
            r7 = 0
            return r7
    }

    private static java.lang.String firstString(org.json.JSONObject r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            java.lang.String r2 = ""
            if (r1 >= r0) goto L2d
            r3 = r6[r1]
            boolean r4 = r5.has(r3)
            if (r4 == 0) goto L2a
            boolean r4 = r5.isNull(r3)
            if (r4 == 0) goto L15
            goto L2a
        L15:
            java.lang.String r2 = r5.optString(r3, r2)
            if (r2 == 0) goto L2a
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2a
            java.lang.String r5 = r2.trim()
            return r5
        L2a:
            int r1 = r1 + 1
            goto L2
        L2d:
            return r2
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlsLayoutData fromJson(org.json.JSONObject r13) throws java.lang.Exception {
            java.lang.String r0 = "controls"
            boolean r1 = r13.has(r0)
            java.lang.String r2 = "dp"
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r5 = "scaledAt"
            java.lang.String r6 = "preferredScale"
            java.lang.String r7 = "name"
            r8 = 3
            r9 = 0
            java.lang.String r10 = "px"
            r11 = 1
            if (r1 == 0) goto L9d
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = new ca.dnamobile.javalauncher.controls.TouchControlsLayoutData
            r1.<init>()
            java.lang.String r12 = "version"
            int r12 = r13.optInt(r12, r11)
            r1.version = r12
            java.lang.String r12 = "Touch Controls"
            java.lang.String r7 = r13.optString(r7, r12)
            r1.name = r7
            double r3 = r13.optDouble(r5, r3)
            double r3 = r13.optDouble(r6, r3)
            float r3 = (float) r3
            r1.preferredScale = r3
            boolean r3 = hasCoordinateUnit(r13)
            java.lang.String r2 = readCoordinateUnit(r13, r2)
            r1.coordinateUnit = r2
            readSourceCanvas(r13, r1)
            org.json.JSONArray r13 = r13.optJSONArray(r0)
            if (r13 == 0) goto L63
            r0 = r9
        L4b:
            int r2 = r13.length()
            if (r0 >= r2) goto L63
            org.json.JSONObject r2 = r13.optJSONObject(r0)
            if (r2 == 0) goto L60
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r4 = r1.controls
            ca.dnamobile.javalauncher.controls.TouchControlData r2 = ca.dnamobile.javalauncher.controls.TouchControlData.fromJson(r2)
            r4.add(r2)
        L60:
            int r0 = r0 + 1
            goto L4b
        L63:
            boolean r13 = looksLikeImportedCanvasLayout(r1)
            if (r13 == 0) goto L75
            if (r3 == 0) goto L6f
            int r0 = r1.version
            if (r0 >= r8) goto L75
        L6f:
            r1.coordinateUnit = r10
            inferPixelSourceCanvasIfNeeded(r1, r11)
            goto L86
        L75:
            if (r3 != 0) goto L83
            boolean r0 = looksLikePixelAuthoredLayout(r1)
            if (r0 == 0) goto L83
            r1.coordinateUnit = r10
            inferPixelSourceCanvasIfNeeded(r1, r11)
            goto L86
        L83:
            inferPixelSourceCanvasIfNeeded(r1, r9)
        L86:
            boolean r0 = r1.usesPixelCoordinates()
            if (r0 == 0) goto L96
            if (r13 == 0) goto L96
            int r13 = r1.version
            int r13 = java.lang.Math.max(r13, r8)
            r1.version = r13
        L96:
            normalizeSuspiciousImportedSourceCanvas(r1)
            normalizeOutOfBoundsPixelCanvas(r1)
            return r1
        L9d:
            java.lang.String r0 = "mControlDataList"
            boolean r0 = r13.has(r0)
            if (r0 != 0) goto L14c
            java.lang.String r0 = "mJoystickDataList"
            boolean r0 = r13.has(r0)
            if (r0 != 0) goto L14c
            java.lang.String r0 = "mDrawerDataList"
            boolean r0 = r13.has(r0)
            if (r0 == 0) goto Lb7
            goto L14c
        Lb7:
            java.lang.String r0 = "buttons"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L144
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r1 = new ca.dnamobile.javalauncher.controls.TouchControlsLayoutData
            r1.<init>()
            java.lang.String r12 = "Imported Controls"
            java.lang.String r7 = r13.optString(r7, r12)
            r1.name = r7
            double r3 = r13.optDouble(r5, r3)
            double r3 = r13.optDouble(r6, r3)
            float r3 = (float) r3
            r1.preferredScale = r3
            boolean r3 = hasCoordinateUnit(r13)
            boolean r4 = hasSourceCanvas(r13)
            if (r4 == 0) goto Le2
            r2 = r10
        Le2:
            java.lang.String r2 = readCoordinateUnit(r13, r2)
            r1.coordinateUnit = r2
            readSourceCanvas(r13, r1)
            org.json.JSONArray r13 = r13.optJSONArray(r0)
            if (r13 == 0) goto L10a
            r0 = r9
        Lf2:
            int r2 = r13.length()
            if (r0 >= r2) goto L10a
            org.json.JSONObject r2 = r13.optJSONObject(r0)
            if (r2 == 0) goto L107
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r4 = r1.controls
            ca.dnamobile.javalauncher.controls.TouchControlData r2 = ca.dnamobile.javalauncher.controls.TouchControlData.fromJson(r2)
            r4.add(r2)
        L107:
            int r0 = r0 + 1
            goto Lf2
        L10a:
            boolean r13 = looksLikeImportedCanvasLayout(r1)
            if (r13 == 0) goto L11c
            if (r3 == 0) goto L116
            int r0 = r1.version
            if (r0 >= r8) goto L11c
        L116:
            r1.coordinateUnit = r10
            inferPixelSourceCanvasIfNeeded(r1, r11)
            goto L12d
        L11c:
            if (r3 != 0) goto L12a
            boolean r0 = looksLikePixelAuthoredLayout(r1)
            if (r0 == 0) goto L12a
            r1.coordinateUnit = r10
            inferPixelSourceCanvasIfNeeded(r1, r11)
            goto L12d
        L12a:
            inferPixelSourceCanvasIfNeeded(r1, r9)
        L12d:
            boolean r0 = r1.usesPixelCoordinates()
            if (r0 == 0) goto L13d
            if (r13 == 0) goto L13d
            int r13 = r1.version
            int r13 = java.lang.Math.max(r13, r8)
            r1.version = r13
        L13d:
            normalizeSuspiciousImportedSourceCanvas(r1)
            normalizeOutOfBoundsPixelCanvas(r1)
            return r1
        L144:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported touch control layout format."
            r13.<init>(r0)
            throw r13
        L14c:
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r13 = fromPojavLikeJson(r13)
            return r13
    }

    private static ca.dnamobile.javalauncher.controls.TouchControlsLayoutData fromPojavLikeJson(org.json.JSONObject r7) {
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r0 = new ca.dnamobile.javalauncher.controls.TouchControlsLayoutData
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "Imported Pojav/Zalith Controls"
            java.lang.String r1 = r7.optString(r1, r2)
            r0.name = r1
            java.lang.String r1 = "preferredScale"
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r7.optDouble(r1, r2)
            java.lang.String r3 = "scaledAt"
            double r1 = r7.optDouble(r3, r1)
            float r1 = (float) r1
            r0.preferredScale = r1
            java.lang.String r1 = "px"
            r0.coordinateUnit = r1
            readSourceCanvas(r7, r0)
            java.lang.String r1 = "mControlDataList"
            org.json.JSONArray r1 = r7.optJSONArray(r1)
            r2 = 0
            if (r1 == 0) goto L49
            r3 = r2
        L31:
            int r4 = r1.length()
            if (r3 >= r4) goto L49
            org.json.JSONObject r4 = r1.optJSONObject(r3)
            if (r4 == 0) goto L46
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r5 = r0.controls
            ca.dnamobile.javalauncher.controls.TouchControlData r4 = ca.dnamobile.javalauncher.controls.TouchControlData.fromPojavControl(r4)
            r5.add(r4)
        L46:
            int r3 = r3 + 1
            goto L31
        L49:
            java.lang.String r1 = "mJoystickDataList"
            org.json.JSONArray r1 = r7.optJSONArray(r1)
            if (r1 == 0) goto L6a
            r3 = r2
        L52:
            int r4 = r1.length()
            if (r3 >= r4) goto L6a
            org.json.JSONObject r4 = r1.optJSONObject(r3)
            if (r4 == 0) goto L67
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r5 = r0.controls
            ca.dnamobile.javalauncher.controls.TouchControlData r4 = ca.dnamobile.javalauncher.controls.TouchControlData.fromPojavJoystick(r4)
            r5.add(r4)
        L67:
            int r3 = r3 + 1
            goto L52
        L6a:
            java.lang.String r1 = "mDrawerDataList"
            org.json.JSONArray r7 = r7.optJSONArray(r1)
            if (r7 == 0) goto Lb5
            r1 = r2
        L73:
            int r3 = r7.length()
            if (r1 >= r3) goto Lb5
            org.json.JSONObject r3 = r7.optJSONObject(r1)
            if (r3 != 0) goto L80
            goto Lb2
        L80:
            java.lang.String r4 = "properties"
            org.json.JSONObject r4 = r3.optJSONObject(r4)
            if (r4 == 0) goto L91
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r5 = r0.controls
            ca.dnamobile.javalauncher.controls.TouchControlData r4 = ca.dnamobile.javalauncher.controls.TouchControlData.fromPojavControl(r4)
            r5.add(r4)
        L91:
            java.lang.String r4 = "buttonProperties"
            org.json.JSONArray r3 = r3.optJSONArray(r4)
            if (r3 == 0) goto Lb2
            r4 = r2
        L9a:
            int r5 = r3.length()
            if (r4 >= r5) goto Lb2
            org.json.JSONObject r5 = r3.optJSONObject(r4)
            if (r5 == 0) goto Laf
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r6 = r0.controls
            ca.dnamobile.javalauncher.controls.TouchControlData r5 = ca.dnamobile.javalauncher.controls.TouchControlData.fromPojavControl(r5)
            r6.add(r5)
        Laf:
            int r4 = r4 + 1
            goto L9a
        Lb2:
            int r1 = r1 + 1
            goto L73
        Lb5:
            r7 = 1
            inferPixelSourceCanvasIfNeeded(r0, r7)
            normalizeSuspiciousImportedSourceCanvas(r0)
            normalizeOutOfBoundsPixelCanvas(r0)
            return r0
    }

    private static boolean hasCoordinateUnit(org.json.JSONObject r1) {
            java.lang.String r0 = "coordinateUnit"
            boolean r0 = r1.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "coordinate_unit"
            boolean r0 = r1.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "layoutUnit"
            boolean r0 = r1.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "layout_unit"
            boolean r0 = r1.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "units"
            boolean r0 = r1.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "unit"
            boolean r1 = r1.has(r0)
            if (r1 == 0) goto L31
            goto L33
        L31:
            r1 = 0
            goto L34
        L33:
            r1 = 1
        L34:
            return r1
    }

    private static boolean hasSourceCanvas(org.json.JSONObject r21) {
            r0 = r21
            r1 = 17
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "sourceWidth"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "source_width"
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "baseWidth"
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = "base_width"
            r7 = 3
            r2[r7] = r3
            java.lang.String r3 = "canvasWidth"
            r8 = 4
            r2[r8] = r3
            java.lang.String r3 = "canvas_width"
            r9 = 5
            r2[r9] = r3
            java.lang.String r3 = "layoutWidth"
            r10 = 6
            r2[r10] = r3
            java.lang.String r3 = "layout_width"
            r11 = 7
            r2[r11] = r3
            java.lang.String r3 = "screenWidth"
            r12 = 8
            r2[r12] = r3
            java.lang.String r3 = "screen_width"
            r13 = 9
            r2[r13] = r3
            java.lang.String r3 = "displayWidth"
            r14 = 10
            r2[r14] = r3
            java.lang.String r3 = "display_width"
            r15 = 11
            r2[r15] = r3
            java.lang.String r3 = "deviceWidth"
            r16 = 12
            r2[r16] = r3
            java.lang.String r3 = "device_width"
            r17 = 13
            r2[r17] = r3
            java.lang.String r3 = "physicalWidth"
            r18 = 14
            r2[r18] = r3
            java.lang.String r3 = "physical_width"
            r19 = 15
            r2[r19] = r3
            java.lang.String r3 = "width"
            r20 = 16
            r2[r20] = r3
            float r2 = firstPositiveFloat(r0, r2)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lbc
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "sourceHeight"
            r1[r4] = r2
            java.lang.String r2 = "source_height"
            r1[r5] = r2
            java.lang.String r2 = "baseHeight"
            r1[r6] = r2
            java.lang.String r2 = "base_height"
            r1[r7] = r2
            java.lang.String r2 = "canvasHeight"
            r1[r8] = r2
            java.lang.String r2 = "canvas_height"
            r1[r9] = r2
            java.lang.String r2 = "layoutHeight"
            r1[r10] = r2
            java.lang.String r2 = "layout_height"
            r1[r11] = r2
            java.lang.String r2 = "screenHeight"
            r1[r12] = r2
            java.lang.String r2 = "screen_height"
            r1[r13] = r2
            java.lang.String r2 = "displayHeight"
            r1[r14] = r2
            java.lang.String r2 = "display_height"
            r1[r15] = r2
            java.lang.String r2 = "deviceHeight"
            r1[r16] = r2
            java.lang.String r2 = "device_height"
            r1[r17] = r2
            java.lang.String r2 = "physicalHeight"
            r1[r18] = r2
            java.lang.String r2 = "physical_height"
            r1[r19] = r2
            java.lang.String r2 = "height"
            r1[r20] = r2
            float r0 = firstPositiveFloat(r0, r1)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lbc
            r4 = r5
        Lbc:
            return r4
    }

    private static float inferCanvasAxis(float r20, float r21, boolean r22, boolean r23) {
            r0 = r21
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r1 > 0) goto Ld
            if (r22 == 0) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
        Ld:
            if (r22 == 0) goto L14
            int r1 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r1 > 0) goto L14
            return r0
        L14:
            r1 = 1098907648(0x41800000, float:16.0)
            float r1 = r20 + r1
            r2 = 1158086656(0x45070000, float:2160.0)
            r4 = 11
            r5 = 1153957888(0x44c80000, float:1600.0)
            r6 = 10
            r7 = 1152647168(0x44b40000, float:1440.0)
            r8 = 9
            r9 = 8
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 4
            r14 = 1144258560(0x44340000, float:720.0)
            r15 = 3
            r16 = 2
            r17 = 1
            r18 = 0
            if (r23 == 0) goto L7d
            r3 = 16
            float[] r3 = new float[r3]
            r3[r18] = r14
            r14 = 1146454016(0x44558000, float:854.0)
            r3[r17] = r14
            r14 = 1148190720(0x44700000, float:960.0)
            r3[r16] = r14
            r14 = 1149239296(0x44800000, float:1024.0)
            r3[r15] = r14
            r14 = 1151336448(0x44a00000, float:1280.0)
            r3[r13] = r14
            r13 = 1152040960(0x44aac000, float:1366.0)
            r3[r12] = r13
            r3[r11] = r7
            r3[r10] = r5
            r5 = 1156579328(0x44f00000, float:1920.0)
            r3[r9] = r5
            r3[r8] = r2
            r2 = 1158823936(0x45124000, float:2340.0)
            r3[r6] = r2
            r2 = 1159069696(0x45160000, float:2400.0)
            r3[r4] = r2
            r2 = 1159725056(0x45200000, float:2560.0)
            r4 = 12
            r3[r4] = r2
            r2 = 1160708096(0x452f0000, float:2800.0)
            r4 = 13
            r3[r4] = r2
            r2 = 14
            r4 = 1162346496(0x45480000, float:3200.0)
            r3[r2] = r4
            r2 = 15
            r4 = 1164967936(0x45700000, float:3840.0)
            r3[r2] = r4
            goto Laf
        L7d:
            r3 = 13
            float[] r3 = new float[r3]
            r19 = 1139802112(0x43f00000, float:480.0)
            r3[r18] = r19
            r19 = 1141309440(0x44070000, float:540.0)
            r3[r17] = r19
            r17 = 1142292480(0x44160000, float:600.0)
            r3[r16] = r17
            r3[r15] = r14
            r14 = 1145044992(0x44400000, float:768.0)
            r3[r13] = r14
            r13 = 1145569280(0x44480000, float:800.0)
            r3[r12] = r13
            r12 = 1147207680(0x44610000, float:900.0)
            r3[r11] = r12
            r11 = 1149698048(0x44870000, float:1080.0)
            r3[r10] = r11
            r10 = 1150681088(0x44960000, float:1200.0)
            r3[r9] = r10
            r3[r8] = r7
            r3[r6] = r5
            r5 = 1155596288(0x44e10000, float:1800.0)
            r3[r4] = r5
            r4 = 12
            r3[r4] = r2
        Laf:
            int r2 = r3.length
            r4 = r18
        Lb2:
            if (r4 >= r2) goto Lbe
            r5 = r3[r4]
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 < 0) goto Lbb
            return r5
        Lbb:
            int r4 = r4 + 1
            goto Lb2
        Lbe:
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static void inferPixelSourceCanvasIfNeeded(ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r8, boolean r9) {
            boolean r0 = r8.usesPixelCoordinates()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r0 = r8.controls
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
            r3 = r2
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r0.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r4 = (ca.dnamobile.javalauncher.controls.TouchControlData) r4
            java.lang.String r5 = r4.rawX
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 != 0) goto L2f
            float r5 = r4.x
            float r7 = r4.width
            float r7 = java.lang.Math.max(r6, r7)
            float r5 = r5 + r7
            float r2 = java.lang.Math.max(r2, r5)
        L2f:
            java.lang.String r5 = r4.rawY
            if (r5 != 0) goto L10
            float r5 = r4.y
            float r4 = r4.height
            float r4 = java.lang.Math.max(r6, r4)
            float r5 = r5 + r4
            float r3 = java.lang.Math.max(r3, r5)
            goto L10
        L41:
            float r0 = r8.sourceWidth
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L51
            r0 = 1146454016(0x44558000, float:854.0)
            r4 = 1
            float r0 = inferCanvasAxis(r2, r0, r9, r4)
            r8.sourceWidth = r0
        L51:
            float r0 = r8.sourceHeight
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L60
            r0 = 1139802112(0x43f00000, float:480.0)
            r1 = 0
            float r9 = inferCanvasAxis(r3, r0, r9, r1)
            r8.sourceHeight = r9
        L60:
            return
    }

    private static boolean looksLikeImportedCanvasLayout(ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r7) {
            java.lang.String r0 = r7.name
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto L11
        L7:
            java.lang.String r0 = r0.trim()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
        L11:
            java.lang.String r1 = "pojav"
            boolean r1 = r0.contains(r1)
            r2 = 0
            if (r1 != 0) goto L34
            java.lang.String r1 = "zalith"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L34
            java.lang.String r1 = "mojo"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L34
            java.lang.String r1 = "amethyst"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L33
            goto L34
        L33:
            return r2
        L34:
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r7 = r7.controls
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = r0
        L3c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r7.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = (ca.dnamobile.javalauncher.controls.TouchControlData) r3
            java.lang.String r4 = r3.rawX
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L5b
            float r4 = r3.x
            float r6 = r3.width
            float r6 = java.lang.Math.max(r5, r6)
            float r4 = r4 + r6
            float r0 = java.lang.Math.max(r0, r4)
        L5b:
            java.lang.String r4 = r3.rawY
            if (r4 != 0) goto L3c
            float r4 = r3.y
            float r3 = r3.height
            float r3 = java.lang.Math.max(r5, r3)
            float r4 = r4 + r3
            float r1 = java.lang.Math.max(r1, r4)
            goto L3c
        L6d:
            r7 = 1140457472(0x43fa0000, float:500.0)
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L79
            r7 = 1132068864(0x437a0000, float:250.0)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 < 0) goto L7a
        L79:
            r2 = 1
        L7a:
            return r2
    }

    private static boolean looksLikePixelAuthoredLayout(ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r8) {
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r8 = r8.controls
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        La:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r4 = (ca.dnamobile.javalauncher.controls.TouchControlData) r4
            float r5 = r4.width
            float r1 = java.lang.Math.max(r1, r5)
            float r5 = r4.height
            float r2 = java.lang.Math.max(r2, r5)
            java.lang.String r5 = r4.rawX
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 != 0) goto L35
            float r5 = r4.x
            float r7 = r4.width
            float r7 = java.lang.Math.max(r6, r7)
            float r5 = r5 + r7
            float r0 = java.lang.Math.max(r0, r5)
        L35:
            java.lang.String r5 = r4.rawY
            if (r5 != 0) goto La
            float r5 = r4.y
            float r4 = r4.height
            float r4 = java.lang.Math.max(r6, r4)
            float r5 = r5 + r4
            float r3 = java.lang.Math.max(r3, r5)
            goto La
        L47:
            r8 = 1148846080(0x447a0000, float:1000.0)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 > 0) goto L62
            r8 = 1143930880(0x442f0000, float:700.0)
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 > 0) goto L62
            r8 = 1132593152(0x43820000, float:260.0)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 > 0) goto L62
            r8 = 1127481344(0x43340000, float:180.0)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 <= 0) goto L60
            goto L62
        L60:
            r8 = 0
            goto L63
        L62:
            r8 = 1
        L63:
            return r8
    }

    private static java.lang.String normalizeCoordinateUnit(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "pixel"
            boolean r0 = r0.equals(r2)
            java.lang.String r1 = "px"
            if (r0 != 0) goto L26
            java.lang.String r0 = "pixels"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L26
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L23
            goto L26
        L23:
            java.lang.String r2 = "dp"
            return r2
        L26:
            return r1
    }

    private static void normalizeOutOfBoundsPixelCanvas(ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r12) {
            boolean r0 = r12.usesPixelCoordinates()
            if (r0 == 0) goto Lf3
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r0 = r12.controls
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            goto Lf3
        L10:
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r0 = r12.controls
            java.util.Iterator r0 = r0.iterator()
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
            r3 = r1
        L1f:
            boolean r7 = r0.hasNext()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r0.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r7 = (ca.dnamobile.javalauncher.controls.TouchControlData) r7
            java.lang.String r9 = r7.rawX
            r10 = 1
            if (r9 != 0) goto L46
            float r4 = r7.width
            float r4 = java.lang.Math.max(r8, r4)
            float r9 = r7.x
            float r1 = java.lang.Math.min(r1, r9)
            float r9 = r7.x
            float r9 = r9 + r4
            float r5 = java.lang.Math.max(r5, r9)
            r4 = r10
        L46:
            java.lang.String r9 = r7.rawY
            if (r9 != 0) goto L1f
            float r4 = r7.height
            float r4 = java.lang.Math.max(r8, r4)
            float r8 = r7.y
            float r3 = java.lang.Math.min(r3, r8)
            float r7 = r7.y
            float r7 = r7 + r4
            float r6 = java.lang.Math.max(r6, r7)
            r4 = r10
            goto L1f
        L5f:
            if (r4 != 0) goto L62
            return
        L62:
            float r0 = r12.sourceWidth
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L69
            goto L70
        L69:
            r0 = 1146454016(0x44558000, float:854.0)
            float r0 = java.lang.Math.max(r0, r5)
        L70:
            float r4 = r12.sourceHeight
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 <= 0) goto L77
            goto L7d
        L77:
            r4 = 1139802112(0x43f00000, float:480.0)
            float r4 = java.lang.Math.max(r4, r6)
        L7d:
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 >= 0) goto L83
            float r1 = -r1
            goto L84
        L83:
            r1 = r2
        L84:
            int r7 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r7 >= 0) goto L8a
            float r3 = -r3
            goto L8b
        L8a:
            r3 = r2
        L8b:
            float r7 = r0 + r1
            float r9 = r5 + r1
            float r7 = java.lang.Math.max(r7, r9)
            float r9 = r4 + r3
            float r10 = r6 + r3
            float r9 = java.lang.Math.max(r9, r10)
            int r10 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r10 > 0) goto Lad
            int r11 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r11 > 0) goto Lad
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto Lad
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lac
            goto Lad
        Lac:
            return
        Lad:
            if (r10 > 0) goto Lb3
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lde
        Lb3:
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r0 = r12.controls
            java.util.Iterator r0 = r0.iterator()
        Lb9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lde
            java.lang.Object r4 = r0.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r4 = (ca.dnamobile.javalauncher.controls.TouchControlData) r4
            if (r10 <= 0) goto Ld0
            java.lang.String r5 = r4.rawX
            if (r5 != 0) goto Ld0
            float r5 = r4.x
            float r5 = r5 + r1
            r4.x = r5
        Ld0:
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 <= 0) goto Lb9
            java.lang.String r5 = r4.rawY
            if (r5 != 0) goto Lb9
            float r5 = r4.y
            float r5 = r5 + r3
            r4.y = r5
            goto Lb9
        Lde:
            float r0 = java.lang.Math.max(r8, r7)
            r12.sourceWidth = r0
            float r0 = java.lang.Math.max(r8, r9)
            r12.sourceHeight = r0
            int r0 = r12.version
            r1 = 4
            int r0 = java.lang.Math.max(r0, r1)
            r12.version = r0
        Lf3:
            return
    }

    private static void normalizeSuspiciousImportedSourceCanvas(ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r7) {
            boolean r0 = r7.usesPixelCoordinates()
            if (r0 == 0) goto L7e
            boolean r0 = looksLikeImportedCanvasLayout(r7)
            if (r0 != 0) goto Le
            goto L7e
        Le:
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r0 = r7.controls
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L16:
            boolean r3 = r0.hasNext()
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L47
            java.lang.Object r3 = r0.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = (ca.dnamobile.javalauncher.controls.TouchControlData) r3
            java.lang.String r5 = r3.rawX
            if (r5 != 0) goto L35
            float r5 = r3.x
            float r6 = r3.width
            float r6 = java.lang.Math.max(r4, r6)
            float r5 = r5 + r6
            float r1 = java.lang.Math.max(r1, r5)
        L35:
            java.lang.String r5 = r3.rawY
            if (r5 != 0) goto L16
            float r5 = r3.y
            float r3 = r3.height
            float r3 = java.lang.Math.max(r4, r3)
            float r5 = r5 + r3
            float r2 = java.lang.Math.max(r2, r5)
            goto L16
        L47:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L63
            r0 = 1148190720(0x44700000, float:960.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L63
            float r0 = r7.sourceWidth
            r5 = 1148846080(0x447a0000, float:1000.0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L63
            r0 = 1146454016(0x44558000, float:854.0)
            float r0 = inferCanvasAxis(r1, r0, r3, r3)
            r7.sourceWidth = r0
        L63:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7e
            r0 = 1141309440(0x44070000, float:540.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L7e
            float r0 = r7.sourceHeight
            r1 = 1143930880(0x442f0000, float:700.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L7e
            r0 = 1139802112(0x43f00000, float:480.0)
            r1 = 0
            float r0 = inferCanvasAxis(r2, r0, r3, r1)
            r7.sourceHeight = r0
        L7e:
            return
    }

    private static java.lang.String readCoordinateUnit(org.json.JSONObject r3, java.lang.String r4) {
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "coordinateUnit"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "coordinate_unit"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "layoutUnit"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "layout_unit"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "units"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "unit"
            r0[r1] = r2
            java.lang.String r3 = firstString(r3, r0)
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L34
            java.lang.String r3 = normalizeCoordinateUnit(r4)
            return r3
        L34:
            java.lang.String r3 = normalizeCoordinateUnit(r3)
            return r3
    }

    private static void readSourceCanvas(org.json.JSONObject r22, ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r23) {
            r0 = r22
            r1 = r23
            r2 = 17
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "sourceWidth"
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "source_width"
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "baseWidth"
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = "base_width"
            r8 = 3
            r3[r8] = r4
            java.lang.String r4 = "canvasWidth"
            r9 = 4
            r3[r9] = r4
            java.lang.String r4 = "canvas_width"
            r10 = 5
            r3[r10] = r4
            java.lang.String r4 = "layoutWidth"
            r11 = 6
            r3[r11] = r4
            java.lang.String r4 = "layout_width"
            r12 = 7
            r3[r12] = r4
            java.lang.String r4 = "screenWidth"
            r13 = 8
            r3[r13] = r4
            java.lang.String r4 = "screen_width"
            r14 = 9
            r3[r14] = r4
            java.lang.String r4 = "displayWidth"
            r15 = 10
            r3[r15] = r4
            java.lang.String r4 = "display_width"
            r16 = 11
            r3[r16] = r4
            java.lang.String r4 = "deviceWidth"
            r17 = 12
            r3[r17] = r4
            java.lang.String r4 = "device_width"
            r18 = 13
            r3[r18] = r4
            java.lang.String r4 = "physicalWidth"
            r19 = 14
            r3[r19] = r4
            java.lang.String r4 = "physical_width"
            r20 = 15
            r3[r20] = r4
            java.lang.String r4 = "width"
            r21 = 16
            r3[r21] = r4
            float r3 = firstPositiveFloat(r0, r3)
            r1.sourceWidth = r3
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "sourceHeight"
            r2[r5] = r3
            java.lang.String r3 = "source_height"
            r2[r6] = r3
            java.lang.String r3 = "baseHeight"
            r2[r7] = r3
            java.lang.String r3 = "base_height"
            r2[r8] = r3
            java.lang.String r3 = "canvasHeight"
            r2[r9] = r3
            java.lang.String r3 = "canvas_height"
            r2[r10] = r3
            java.lang.String r3 = "layoutHeight"
            r2[r11] = r3
            java.lang.String r3 = "layout_height"
            r2[r12] = r3
            java.lang.String r3 = "screenHeight"
            r2[r13] = r3
            java.lang.String r3 = "screen_height"
            r2[r14] = r3
            java.lang.String r3 = "displayHeight"
            r2[r15] = r3
            java.lang.String r3 = "display_height"
            r2[r16] = r3
            java.lang.String r3 = "deviceHeight"
            r2[r17] = r3
            java.lang.String r3 = "device_height"
            r2[r18] = r3
            java.lang.String r3 = "physicalHeight"
            r2[r19] = r3
            java.lang.String r3 = "physical_height"
            r2[r20] = r3
            java.lang.String r3 = "height"
            r2[r21] = r3
            float r0 = firstPositiveFloat(r0, r2)
            r1.sourceHeight = r0
            return
    }

    public float resolvedSourceHeight(float r3) {
            r2 = this;
            float r0 = r2.sourceHeight
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L8
            goto Le
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r3)
        Le:
            return r0
    }

    public float resolvedSourceWidth(float r3) {
            r2 = this;
            float r0 = r2.sourceWidth
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L8
            goto Le
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r3)
        Le:
            return r0
    }

    public org.json.JSONObject toJson() throws java.lang.Exception {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "format"
            java.lang.String r2 = "JavaLauncherTouchControls"
            r0.put(r1, r2)
            java.lang.String r1 = "version"
            int r2 = r6.version
            r0.put(r1, r2)
            java.lang.String r1 = "name"
            java.lang.String r2 = r6.name
            r0.put(r1, r2)
            float r1 = r6.preferredScale
            double r1 = (double) r1
            java.lang.String r3 = "preferredScale"
            r0.put(r3, r1)
            java.lang.String r1 = r6.coordinateUnit
            java.lang.String r1 = normalizeCoordinateUnit(r1)
            java.lang.String r2 = "coordinateUnit"
            r0.put(r2, r1)
            float r1 = r6.sourceWidth
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3a
            java.lang.String r3 = "sourceWidth"
            double r4 = (double) r1
            r0.put(r3, r4)
        L3a:
            float r1 = r6.sourceHeight
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L46
            java.lang.String r2 = "sourceHeight"
            double r3 = (double) r1
            r0.put(r2, r3)
        L46:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List<ca.dnamobile.javalauncher.controls.TouchControlData> r2 = r6.controls
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()
            ca.dnamobile.javalauncher.controls.TouchControlData r3 = (ca.dnamobile.javalauncher.controls.TouchControlData) r3
            org.json.JSONObject r3 = r3.toJson()
            r1.put(r3)
            goto L51
        L65:
            java.lang.String r2 = "controls"
            r0.put(r2, r1)
            return r0
    }

    public boolean usesPixelCoordinates() {
            r2 = this;
            java.lang.String r0 = r2.coordinateUnit
            java.lang.String r0 = normalizeCoordinateUnit(r0)
            java.lang.String r1 = "px"
            boolean r0 = r1.equals(r0)
            return r0
    }
}
