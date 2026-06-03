package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class TouchControlData {
    public static final int MAX_ACTION_SLOTS = 4;
    public static final int SPECIAL_KEYBOARD = -1;
    public static final int SPECIAL_KEY_SENDER_KEYBOARD = -10;
    public static final int SPECIAL_MENU = -9;
    public static final int SPECIAL_MOUSE_LEFT = -3;
    public static final int SPECIAL_MOUSE_MIDDLE = -6;
    public static final int SPECIAL_MOUSE_RIGHT = -4;
    public static final int SPECIAL_SCROLL_DOWN = -8;
    public static final int SPECIAL_SCROLL_UP = -7;
    public static final int SPECIAL_TOGGLE_CONTROLS = -2;
    public static final int SPECIAL_VIRTUAL_MOUSE = -5;
    public java.lang.String action;
    public int backgroundColor;
    public float cornerRadius;
    public float height;
    public java.lang.String id;
    public boolean joystickAbsolute;
    public boolean joystickForwardLock;
    public int keyCode;
    public int[] keyCodes;
    public int[] keySlots;
    public java.lang.String label;
    public int mouseButton;
    public float opacity;
    public java.lang.String rawX;
    public java.lang.String rawY;
    public int scrollY;
    public float sizePercent;
    public int strokeColor;
    public float strokeWidth;
    public boolean toggle;
    public boolean visibleInGame;
    public boolean visibleInMenu;
    public boolean visibleWhenControlsHidden;
    public float width;
    public float x;
    public float y;

    public TouchControlData() {
            r2 = this;
            r2.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r2.id = r0
            java.lang.String r0 = "Button"
            r2.label = r0
            java.lang.String r0 = "key"
            r2.action = r0
            r0 = 32
            r2.keyCode = r0
            r0 = 0
            int[] r1 = new int[r0]
            r2.keyCodes = r1
            int[] r1 = new int[r0]
            r2.keySlots = r1
            r2.mouseButton = r0
            r2.scrollY = r0
            r0 = 1107296256(0x42000000, float:32.0)
            r2.x = r0
            r2.y = r0
            r0 = 1115684864(0x42800000, float:64.0)
            r2.width = r0
            r0 = 1111490560(0x42400000, float:48.0)
            r2.height = r0
            r0 = 1120403456(0x42c80000, float:100.0)
            r2.sizePercent = r0
            r0 = 1060655596(0x3f3851ec, float:0.72)
            r2.opacity = r0
            r0 = 1098907648(0x41800000, float:16.0)
            r2.cornerRadius = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r2.strokeWidth = r0
            r0 = -1711276033(0xffffffff99ffffff, float:-2.6469778E-23)
            r2.strokeColor = r0
            r0 = 1711276032(0x66000000, float:1.5111573E23)
            r2.backgroundColor = r0
            r0 = 1
            r2.visibleInGame = r0
            r2.visibleInMenu = r0
            return
    }

    private static int[] activeCodesFromSlots(int[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            r3 = 4
            int r4 = r5.length
            int r3 = java.lang.Math.min(r3, r4)
            if (r2 >= r3) goto L1d
            r3 = r5[r2]
            if (r3 == 0) goto L1a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
        L1a:
            int r2 = r2 + 1
            goto L7
        L1d:
            int r5 = r0.size()
            int[] r5 = new int[r5]
        L23:
            int r2 = r0.size()
            if (r1 >= r2) goto L38
            java.lang.Object r2 = r0.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5[r1] = r2
            int r1 = r1 + 1
            goto L23
        L38:
            return r5
    }

    private static void applyImportedKey(ca.dnamobile.javalauncher.controls.TouchControlData r3, int r4, int[] r5) {
            r0 = 1
            java.lang.String r1 = "scroll"
            java.lang.String r2 = "mouse"
            switch(r4) {
                case -10: goto L42;
                case -9: goto L3d;
                case -8: goto L37;
                case -7: goto L32;
                case -6: goto L2c;
                case -5: goto L27;
                case -4: goto L22;
                case -3: goto L1c;
                case -2: goto L17;
                case -1: goto L12;
                default: goto L8;
            }
        L8:
            java.lang.String r0 = "key"
            r3.action = r0
            r3.keyCode = r4
            r3.setKeyCodes(r5)
            return
        L12:
            java.lang.String r4 = "keyboard"
            r3.action = r4
            return
        L17:
            java.lang.String r4 = "toggle_controls"
            r3.action = r4
            return
        L1c:
            r3.action = r2
            r4 = 0
            r3.mouseButton = r4
            return
        L22:
            r3.action = r2
            r3.mouseButton = r0
            return
        L27:
            java.lang.String r4 = "virtual_mouse"
            r3.action = r4
            return
        L2c:
            r3.action = r2
            r4 = 2
            r3.mouseButton = r4
            return
        L32:
            r3.action = r1
            r3.scrollY = r0
            return
        L37:
            r3.action = r1
            r4 = -1
            r3.scrollY = r4
            return
        L3d:
            java.lang.String r4 = "menu"
            r3.action = r4
            return
        L42:
            java.lang.String r4 = "key_sender_keyboard"
            r3.action = r4
            return
    }

    private static float clampSizePercent(float r1) {
            r0 = 1132068864(0x437a0000, float:250.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 1106247680(0x41f00000, float:30.0)
            float r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static int firstUsableKey(int[] r3, int r4) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r3[r1]
            if (r2 == 0) goto L9
            return r2
        L9:
            int r1 = r1 + 1
            goto L2
        Lc:
            return r4
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlData fromJson(org.json.JSONObject r4) {
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r0.id
            java.lang.String r1 = r4.optString(r1, r2)
            java.lang.String r1 = sanitizeId(r1)
            r0.id = r1
            java.lang.String r1 = "name"
            java.lang.String r2 = r0.label
            java.lang.String r1 = r4.optString(r1, r2)
            java.lang.String r2 = "label"
            java.lang.String r1 = r4.optString(r2, r1)
            r0.label = r1
            java.lang.String r1 = "action"
            java.lang.String r2 = r0.action
            java.lang.String r1 = r4.optString(r1, r2)
            r0.action = r1
            java.lang.String r1 = "keyCode"
            int r2 = r0.keyCode
            int r1 = r4.optInt(r1, r2)
            r0.keyCode = r1
            java.lang.String r1 = "keySlots"
            org.json.JSONArray r1 = r4.optJSONArray(r1)
            java.lang.String r2 = "keyCodes"
            org.json.JSONArray r2 = r4.optJSONArray(r2)
            int r3 = r0.keyCode
            int[] r1 = readKeySlots(r1, r2, r3)
            r0.keySlots = r1
            int[] r1 = activeCodesFromSlots(r1)
            r0.keyCodes = r1
            r2 = 0
            int r1 = firstUsableKey(r1, r2)
            r0.keyCode = r1
            java.lang.String r1 = "mouseButton"
            int r2 = r0.mouseButton
            int r1 = r4.optInt(r1, r2)
            r0.mouseButton = r1
            java.lang.String r1 = "scrollY"
            int r2 = r0.scrollY
            int r1 = r4.optInt(r1, r2)
            r0.scrollY = r1
            float r1 = r0.x
            double r1 = (double) r1
            java.lang.String r3 = "x"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.x = r1
            float r1 = r0.y
            double r1 = (double) r1
            java.lang.String r3 = "y"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.y = r1
            float r1 = r0.width
            double r1 = (double) r1
            java.lang.String r3 = "width"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.width = r1
            float r1 = r0.height
            double r1 = (double) r1
            java.lang.String r3 = "height"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.height = r1
            float r1 = r0.sizePercent
            double r1 = (double) r1
            java.lang.String r3 = "sizePercent"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            float r1 = clampSizePercent(r1)
            r0.sizePercent = r1
            float r1 = r0.opacity
            double r1 = (double) r1
            java.lang.String r3 = "opacity"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.opacity = r1
            float r1 = r0.cornerRadius
            double r1 = (double) r1
            java.lang.String r3 = "cornerRadius"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.cornerRadius = r1
            float r1 = r0.strokeWidth
            double r1 = (double) r1
            java.lang.String r3 = "strokeWidth"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.strokeWidth = r1
            java.lang.String r1 = "strokeColor"
            int r2 = r0.strokeColor
            int r1 = r4.optInt(r1, r2)
            r0.strokeColor = r1
            java.lang.String r1 = "bgColor"
            int r2 = r0.backgroundColor
            int r1 = r4.optInt(r1, r2)
            java.lang.String r2 = "backgroundColor"
            int r1 = r4.optInt(r2, r1)
            r0.backgroundColor = r1
            java.lang.String r1 = "isToggle"
            boolean r2 = r0.toggle
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r2 = "toggle"
            boolean r1 = r4.optBoolean(r2, r1)
            r0.toggle = r1
            java.lang.String r1 = "displayInGame"
            boolean r2 = r0.visibleInGame
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r2 = "visibleInGame"
            boolean r1 = r4.optBoolean(r2, r1)
            r0.visibleInGame = r1
            java.lang.String r1 = "displayInMenu"
            boolean r2 = r0.visibleInMenu
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r2 = "visibleInMenu"
            boolean r1 = r4.optBoolean(r2, r1)
            r0.visibleInMenu = r1
            java.lang.String r1 = r0.action
            boolean r1 = readVisibleWhenControlsHidden(r4, r1)
            r0.visibleWhenControlsHidden = r1
            java.lang.String r1 = "absolute"
            boolean r2 = r0.joystickAbsolute
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r2 = "joystickAbsolute"
            boolean r1 = r4.optBoolean(r2, r1)
            r0.joystickAbsolute = r1
            java.lang.String r1 = "forwardLock"
            boolean r2 = r0.joystickForwardLock
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r2 = "joystickForwardLock"
            boolean r1 = r4.optBoolean(r2, r1)
            r0.joystickForwardLock = r1
            java.lang.String r1 = "dynamicX"
            r2 = 0
            java.lang.String r1 = optNullableString(r4, r1, r2)
            java.lang.String r3 = "rawX"
            java.lang.String r1 = optNullableString(r4, r3, r1)
            r0.rawX = r1
            java.lang.String r1 = "dynamicY"
            java.lang.String r1 = optNullableString(r4, r1, r2)
            java.lang.String r2 = "rawY"
            java.lang.String r4 = optNullableString(r4, r2, r1)
            r0.rawY = r4
            return r0
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlData fromPojavControl(org.json.JSONObject r4) {
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r0.id
            java.lang.String r1 = r4.optString(r1, r2)
            java.lang.String r1 = sanitizeId(r1)
            r0.id = r1
            java.lang.String r1 = "label"
            java.lang.String r2 = "Button"
            java.lang.String r1 = r4.optString(r1, r2)
            java.lang.String r2 = "name"
            java.lang.String r1 = r4.optString(r2, r1)
            r0.label = r1
            java.lang.String r1 = "width"
            r2 = 4634204016564240384(0x4050000000000000, double:64.0)
            double r1 = r4.optDouble(r1, r2)
            float r1 = (float) r1
            r0.width = r1
            java.lang.String r1 = "height"
            r2 = 4631952216750555136(0x4048000000000000, double:48.0)
            double r1 = r4.optDouble(r1, r2)
            float r1 = (float) r1
            r0.height = r1
            java.lang.String r1 = "opacity"
            r2 = 4604660403008689930(0x3fe70a3d70a3d70a, double:0.72)
            double r1 = r4.optDouble(r1, r2)
            float r1 = (float) r1
            r0.opacity = r1
            float r1 = r0.cornerRadius
            double r1 = (double) r1
            java.lang.String r3 = "cornerRadius"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.cornerRadius = r1
            float r1 = r0.strokeWidth
            double r1 = (double) r1
            java.lang.String r3 = "strokeWidth"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.strokeWidth = r1
            java.lang.String r1 = "strokeColor"
            int r2 = r0.strokeColor
            int r1 = r4.optInt(r1, r2)
            r0.strokeColor = r1
            java.lang.String r1 = "backgroundColor"
            int r2 = r0.backgroundColor
            int r1 = r4.optInt(r1, r2)
            java.lang.String r2 = "bgColor"
            int r1 = r4.optInt(r2, r1)
            r0.backgroundColor = r1
            java.lang.String r1 = "toggle"
            r2 = 0
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r2 = "isToggle"
            boolean r1 = r4.optBoolean(r2, r1)
            r0.toggle = r1
            java.lang.String r1 = "visibleInGame"
            r2 = 1
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r3 = "displayInGame"
            boolean r1 = r4.optBoolean(r3, r1)
            r0.visibleInGame = r1
            java.lang.String r1 = "visibleInMenu"
            boolean r1 = r4.optBoolean(r1, r2)
            java.lang.String r2 = "displayInMenu"
            boolean r1 = r4.optBoolean(r2, r1)
            r0.visibleInMenu = r1
            java.lang.String r1 = "rawX"
            r2 = 0
            java.lang.String r1 = optNullableString(r4, r1, r2)
            java.lang.String r3 = "dynamicX"
            java.lang.String r1 = optNullableString(r4, r3, r1)
            r0.rawX = r1
            java.lang.String r1 = "rawY"
            java.lang.String r1 = optNullableString(r4, r1, r2)
            java.lang.String r2 = "dynamicY"
            java.lang.String r1 = optNullableString(r4, r2, r1)
            r0.rawY = r1
            java.lang.String r1 = "keycodes"
            org.json.JSONArray r1 = r4.optJSONArray(r1)
            r2 = 32
            int[] r1 = readKeyCodes(r1, r2)
            int r2 = firstUsableKey(r1, r2)
            applyImportedKey(r0, r2, r1)
            java.lang.String r1 = r0.action
            boolean r1 = readVisibleWhenControlsHidden(r4, r1)
            r0.visibleWhenControlsHidden = r1
            float r1 = r0.x
            double r1 = (double) r1
            java.lang.String r3 = "x"
            double r1 = r4.optDouble(r3, r1)
            float r1 = (float) r1
            r0.x = r1
            float r1 = r0.y
            double r1 = (double) r1
            java.lang.String r3 = "y"
            double r1 = r4.optDouble(r3, r1)
            float r4 = (float) r1
            r0.y = r4
            return r0
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlData fromPojavJoystick(org.json.JSONObject r8) {
            java.lang.String r0 = "label"
            java.lang.String r1 = "Joystick"
            java.lang.String r0 = r8.optString(r0, r1)
            java.lang.String r1 = "name"
            java.lang.String r0 = r8.optString(r1, r0)
            java.lang.String r1 = "x"
            r2 = 4629700416936869888(0x4040000000000000, double:32.0)
            double r1 = r8.optDouble(r1, r2)
            float r1 = (float) r1
            java.lang.String r2 = "y"
            r3 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r2 = r8.optDouble(r2, r3)
            float r2 = (float) r2
            java.lang.String r3 = "width"
            r4 = 4638144666238189568(0x405e000000000000, double:120.0)
            double r6 = r8.optDouble(r3, r4)
            float r3 = (float) r6
            java.lang.String r6 = "height"
            double r4 = r8.optDouble(r6, r4)
            float r4 = (float) r4
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = joystick(r0, r1, r2, r3, r4)
            java.lang.String r1 = "id"
            java.lang.String r2 = r0.id
            java.lang.String r1 = r8.optString(r1, r2)
            java.lang.String r1 = sanitizeId(r1)
            r0.id = r1
            float r1 = r0.opacity
            double r1 = (double) r1
            java.lang.String r3 = "opacity"
            double r1 = r8.optDouble(r3, r1)
            float r1 = (float) r1
            r0.opacity = r1
            float r1 = r0.cornerRadius
            double r1 = (double) r1
            java.lang.String r3 = "cornerRadius"
            double r1 = r8.optDouble(r3, r1)
            float r1 = (float) r1
            r0.cornerRadius = r1
            float r1 = r0.strokeWidth
            double r1 = (double) r1
            java.lang.String r3 = "strokeWidth"
            double r1 = r8.optDouble(r3, r1)
            float r1 = (float) r1
            r0.strokeWidth = r1
            java.lang.String r1 = "strokeColor"
            int r2 = r0.strokeColor
            int r1 = r8.optInt(r1, r2)
            r0.strokeColor = r1
            java.lang.String r1 = "backgroundColor"
            int r2 = r0.backgroundColor
            int r1 = r8.optInt(r1, r2)
            java.lang.String r2 = "bgColor"
            int r1 = r8.optInt(r2, r1)
            r0.backgroundColor = r1
            java.lang.String r1 = "displayInGame"
            r2 = 1
            boolean r1 = r8.optBoolean(r1, r2)
            r0.visibleInGame = r1
            java.lang.String r1 = "displayInMenu"
            r2 = 0
            boolean r1 = r8.optBoolean(r1, r2)
            r0.visibleInMenu = r1
            java.lang.String r1 = r0.action
            boolean r1 = readVisibleWhenControlsHidden(r8, r1)
            r0.visibleWhenControlsHidden = r1
            java.lang.String r1 = "dynamicX"
            r3 = 0
            java.lang.String r1 = optNullableString(r8, r1, r3)
            r0.rawX = r1
            java.lang.String r1 = "dynamicY"
            java.lang.String r1 = optNullableString(r8, r1, r3)
            r0.rawY = r1
            java.lang.String r1 = "absolute"
            boolean r1 = r8.optBoolean(r1, r2)
            r0.joystickAbsolute = r1
            java.lang.String r1 = "forwardLock"
            boolean r8 = r8.optBoolean(r1, r2)
            r0.joystickForwardLock = r8
            return r0
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlData joystick(java.lang.String r1, float r2, float r3, float r4, float r5) {
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r0.<init>()
            r0.label = r1
            java.lang.String r1 = "joystick"
            r0.action = r1
            r0.x = r2
            r0.y = r3
            r0.width = r4
            r0.height = r5
            r1 = 1057803469(0x3f0ccccd, float:0.55)
            r0.opacity = r1
            r1 = 1
            r0.visibleInGame = r1
            r1 = 0
            r0.visibleInMenu = r1
            r1 = 1148829696(0x4479c000, float:999.0)
            r0.cornerRadius = r1
            return r0
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlData key(java.lang.String r1, int r2, float r3, float r4, float r5, float r6) {
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r0.<init>()
            r0.label = r1
            java.lang.String r1 = "key"
            r0.action = r1
            r0.keyCode = r2
            int[] r1 = new int[]{r2}
            r0.setKeyCodes(r1)
            r0.x = r3
            r0.y = r4
            r0.width = r5
            r0.height = r6
            return r0
    }

    public static ca.dnamobile.javalauncher.controls.TouchControlData mouse(java.lang.String r1, int r2, float r3, float r4) {
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r0.<init>()
            r0.label = r1
            java.lang.String r1 = "mouse"
            r0.action = r1
            r0.mouseButton = r2
            r0.x = r3
            r0.y = r4
            r1 = 1114112000(0x42680000, float:58.0)
            r0.width = r1
            r0.height = r1
            return r0
    }

    private static java.lang.String optNullableString(org.json.JSONObject r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L2c
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            goto L2c
        Ld:
            r0 = 0
            java.lang.String r1 = r1.optString(r2, r0)
            if (r1 == 0) goto L2c
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2c
            java.lang.String r2 = "null"
            java.lang.String r0 = r1.trim()
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r1
        L2c:
            return r3
    }

    private static int[] readKeyCodes(org.json.JSONArray r1, int r2) {
            int[] r1 = readRawCodes(r1)
            int r0 = r1.length
            if (r0 != 0) goto L14
            r1 = 0
            if (r2 != 0) goto Ld
            int[] r1 = new int[r1]
            goto L13
        Ld:
            r0 = 1
            int[] r0 = new int[r0]
            r0[r1] = r2
            r1 = r0
        L13:
            return r1
        L14:
            int[] r1 = activeCodesFromSlots(r1)
            return r1
    }

    private static int[] readKeySlots(org.json.JSONArray r1, org.json.JSONArray r2, int r3) {
            if (r1 == 0) goto L11
            int r0 = r1.length()
            if (r0 <= 0) goto L11
            int[] r1 = readRawCodes(r1)
            int[] r1 = toFixedSlots(r1, r3)
            return r1
        L11:
            int[] r1 = readKeyCodes(r2, r3)
            int[] r1 = toFixedSlots(r1, r3)
            return r1
    }

    private static int[] readRawCodes(org.json.JSONArray r5) {
            r0 = 0
            if (r5 == 0) goto L45
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L45
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r0
        L10:
            int r3 = r5.length()
            if (r2 >= r3) goto L29
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r5.optInt(r2, r3)
            if (r4 != r3) goto L1f
            goto L26
        L1f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r1.add(r3)
        L26:
            int r2 = r2 + 1
            goto L10
        L29:
            int r5 = r1.size()
            int[] r5 = new int[r5]
        L2f:
            int r2 = r1.size()
            if (r0 >= r2) goto L44
            java.lang.Object r2 = r1.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5[r0] = r2
            int r0 = r0 + 1
            goto L2f
        L44:
            return r5
        L45:
            int[] r5 = new int[r0]
            return r5
    }

    private static boolean readVisibleWhenControlsHidden(org.json.JSONObject r1, java.lang.String r2) {
            boolean r2 = shouldStayVisibleWhenControlsHiddenByDefault(r2)
            java.lang.String r0 = "alwaysVisible"
            boolean r2 = r1.optBoolean(r0, r2)
            java.lang.String r0 = "displayWhenHidden"
            boolean r2 = r1.optBoolean(r0, r2)
            java.lang.String r0 = "keepVisibleWhenHidden"
            boolean r2 = r1.optBoolean(r0, r2)
            java.lang.String r0 = "keepVisibleWhenControlsHidden"
            boolean r2 = r1.optBoolean(r0, r2)
            java.lang.String r0 = "visibleWhenControlsHidden"
            boolean r1 = r1.optBoolean(r0, r2)
            return r1
    }

    private static java.lang.String sanitizeId(java.lang.String r2) {
            if (r2 == 0) goto L1e
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
            java.lang.String r0 = "null"
            java.lang.String r1 = r2.trim()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L19
            goto L1e
        L19:
            java.lang.String r2 = r2.trim()
            return r2
        L1e:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static boolean shouldStayVisibleWhenControlsHiddenByDefault(java.lang.String r1) {
            java.lang.String r0 = "toggle_controls"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static int[] toFixedSlots(int[] r8, int r9) {
            r0 = 4
            int[] r1 = new int[r0]
            int r2 = r8.length
            r3 = 0
            if (r2 != r0) goto L11
        L7:
            if (r3 >= r0) goto L10
            r9 = r8[r3]
            r1[r3] = r9
            int r3 = r3 + 1
            goto L7
        L10:
            return r1
        L11:
            int r2 = r8.length
            r4 = r3
            r5 = r4
        L14:
            if (r4 >= r2) goto L26
            r6 = r8[r4]
            if (r5 < r0) goto L1b
            goto L26
        L1b:
            if (r6 != 0) goto L1e
            goto L23
        L1e:
            int r7 = r5 + 1
            r1[r5] = r6
            r5 = r7
        L23:
            int r4 = r4 + 1
            goto L14
        L26:
            if (r5 != 0) goto L2c
            if (r9 <= 0) goto L2c
            r1[r3] = r9
        L2c:
            return r1
    }

    public void clearKeySlot(int r2) {
            r1 = this;
            r0 = 0
            r1.setKeySlot(r2, r0)
            return
    }

    public ca.dnamobile.javalauncher.controls.TouchControlData copy() {
            r3 = this;
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = new ca.dnamobile.javalauncher.controls.TouchControlData
            r0.<init>()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.id = r1
            java.lang.String r1 = r3.label
            r0.label = r1
            java.lang.String r1 = r3.action
            r0.action = r1
            int r1 = r3.keyCode
            r0.keyCode = r1
            int[] r1 = r3.keyCodes
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            goto L29
        L27:
            int[] r1 = new int[r2]
        L29:
            r0.keyCodes = r1
            int[] r1 = r3.keySlots
            if (r1 == 0) goto L36
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            goto L38
        L36:
            int[] r1 = new int[r2]
        L38:
            r0.keySlots = r1
            int r1 = r3.mouseButton
            r0.mouseButton = r1
            int r1 = r3.scrollY
            r0.scrollY = r1
            float r1 = r3.x
            r0.x = r1
            float r1 = r3.y
            r0.y = r1
            float r1 = r3.width
            r0.width = r1
            float r1 = r3.height
            r0.height = r1
            float r1 = r3.sizePercent
            r0.sizePercent = r1
            float r1 = r3.opacity
            r0.opacity = r1
            float r1 = r3.cornerRadius
            r0.cornerRadius = r1
            float r1 = r3.strokeWidth
            r0.strokeWidth = r1
            int r1 = r3.strokeColor
            r0.strokeColor = r1
            int r1 = r3.backgroundColor
            r0.backgroundColor = r1
            boolean r1 = r3.toggle
            r0.toggle = r1
            boolean r1 = r3.visibleInGame
            r0.visibleInGame = r1
            boolean r1 = r3.visibleInMenu
            r0.visibleInMenu = r1
            boolean r1 = r3.visibleWhenControlsHidden
            r0.visibleWhenControlsHidden = r1
            boolean r1 = r3.joystickAbsolute
            r0.joystickAbsolute = r1
            boolean r1 = r3.joystickForwardLock
            r0.joystickForwardLock = r1
            java.lang.String r1 = r3.rawX
            r0.rawX = r1
            java.lang.String r1 = r3.rawY
            r0.rawY = r1
            return r0
    }

    public int getKeySlot(int r4) {
            r3 = this;
            r0 = 3
            int r4 = java.lang.Math.min(r0, r4)
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            int[] r1 = r3.normalizedKeySlots()
            int r2 = r1.length
            if (r4 >= r2) goto L13
            r0 = r1[r4]
        L13:
            return r0
    }

    public int[] normalizedKeyCodes() {
            r3 = this;
            int[] r0 = r3.keySlots
            r1 = 0
            if (r0 == 0) goto L11
            int r2 = r0.length
            if (r2 <= 0) goto L11
            int[] r0 = toFixedSlots(r0, r1)
            int[] r0 = activeCodesFromSlots(r0)
            return r0
        L11:
            int[] r0 = r3.keyCodes
            if (r0 == 0) goto L23
            int r2 = r0.length
            if (r2 <= 0) goto L23
            int r1 = r3.keyCode
            int[] r0 = toFixedSlots(r0, r1)
            int[] r0 = activeCodesFromSlots(r0)
            return r0
        L23:
            int r0 = r3.keyCode
            if (r0 != 0) goto L2a
            int[] r0 = new int[r1]
            goto L30
        L2a:
            r2 = 1
            int[] r2 = new int[r2]
            r2[r1] = r0
            r0 = r2
        L30:
            return r0
    }

    public int[] normalizedKeySlots() {
            r3 = this;
            int[] r0 = r3.keySlots
            r1 = 0
            if (r0 == 0) goto Ld
            int r2 = r0.length
            if (r2 <= 0) goto Ld
            int[] r0 = toFixedSlots(r0, r1)
            return r0
        Ld:
            int[] r0 = r3.keyCodes
            if (r0 == 0) goto L1b
            int r2 = r0.length
            if (r2 <= 0) goto L1b
            int r1 = r3.keyCode
            int[] r0 = toFixedSlots(r0, r1)
            return r0
        L1b:
            int r0 = r3.keyCode
            if (r0 != 0) goto L22
            int[] r1 = new int[r1]
            goto L28
        L22:
            r2 = 1
            int[] r2 = new int[r2]
            r2[r1] = r0
            r1 = r2
        L28:
            int[] r0 = toFixedSlots(r1, r0)
            return r0
    }

    public void setKeyCodes(int[] r2) {
            r1 = this;
            r0 = 0
            int[] r2 = toFixedSlots(r2, r0)
            r1.setKeySlots(r2)
            return
    }

    public void setKeySlot(int r2, int r3) {
            r1 = this;
            r0 = 3
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            int[] r0 = r1.normalizedKeySlots()
            r0[r2] = r3
            r1.setKeySlots(r0)
            return
    }

    public void setKeySlots(int[] r2) {
            r1 = this;
            r0 = 0
            int[] r2 = toFixedSlots(r2, r0)
            r1.keySlots = r2
            int[] r2 = activeCodesFromSlots(r2)
            r1.keyCodes = r2
            int r2 = firstUsableKey(r2, r0)
            r1.keyCode = r2
            return
    }

    public org.json.JSONObject toJson() throws java.lang.Exception {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r7.id
            r0.put(r1, r2)
            java.lang.String r1 = "label"
            java.lang.String r2 = r7.label
            r0.put(r1, r2)
            java.lang.String r1 = "action"
            java.lang.String r2 = r7.action
            r0.put(r1, r2)
            java.lang.String r1 = "keyCode"
            int r2 = r7.keyCode
            r0.put(r1, r2)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            int[] r2 = r7.normalizedKeyCodes()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L2d:
            if (r5 >= r3) goto L37
            r6 = r2[r5]
            r1.put(r6)
            int r5 = r5 + 1
            goto L2d
        L37:
            java.lang.String r2 = "keyCodes"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            int[] r2 = r7.normalizedKeySlots()
            int r3 = r2.length
        L46:
            if (r4 >= r3) goto L50
            r5 = r2[r4]
            r1.put(r5)
            int r4 = r4 + 1
            goto L46
        L50:
            java.lang.String r2 = "keySlots"
            r0.put(r2, r1)
            java.lang.String r1 = "mouseButton"
            int r2 = r7.mouseButton
            r0.put(r1, r2)
            java.lang.String r1 = "scrollY"
            int r2 = r7.scrollY
            r0.put(r1, r2)
            float r1 = r7.x
            double r1 = (double) r1
            java.lang.String r3 = "x"
            r0.put(r3, r1)
            float r1 = r7.y
            double r1 = (double) r1
            java.lang.String r3 = "y"
            r0.put(r3, r1)
            float r1 = r7.width
            double r1 = (double) r1
            java.lang.String r3 = "width"
            r0.put(r3, r1)
            float r1 = r7.height
            double r1 = (double) r1
            java.lang.String r3 = "height"
            r0.put(r3, r1)
            float r1 = r7.sizePercent
            double r1 = (double) r1
            java.lang.String r3 = "sizePercent"
            r0.put(r3, r1)
            float r1 = r7.opacity
            double r1 = (double) r1
            java.lang.String r3 = "opacity"
            r0.put(r3, r1)
            float r1 = r7.cornerRadius
            double r1 = (double) r1
            java.lang.String r3 = "cornerRadius"
            r0.put(r3, r1)
            float r1 = r7.strokeWidth
            double r1 = (double) r1
            java.lang.String r3 = "strokeWidth"
            r0.put(r3, r1)
            java.lang.String r1 = "strokeColor"
            int r2 = r7.strokeColor
            r0.put(r1, r2)
            java.lang.String r1 = "backgroundColor"
            int r2 = r7.backgroundColor
            r0.put(r1, r2)
            java.lang.String r1 = "toggle"
            boolean r2 = r7.toggle
            r0.put(r1, r2)
            java.lang.String r1 = "visibleInGame"
            boolean r2 = r7.visibleInGame
            r0.put(r1, r2)
            java.lang.String r1 = "visibleInMenu"
            boolean r2 = r7.visibleInMenu
            r0.put(r1, r2)
            java.lang.String r1 = "visibleWhenControlsHidden"
            boolean r2 = r7.visibleWhenControlsHidden
            r0.put(r1, r2)
            java.lang.String r1 = "joystickAbsolute"
            boolean r2 = r7.joystickAbsolute
            r0.put(r1, r2)
            java.lang.String r1 = "joystickForwardLock"
            boolean r2 = r7.joystickForwardLock
            r0.put(r1, r2)
            java.lang.String r1 = r7.rawX
            if (r1 == 0) goto Le4
            java.lang.String r2 = "rawX"
            r0.put(r2, r1)
        Le4:
            java.lang.String r1 = r7.rawY
            if (r1 == 0) goto Led
            java.lang.String r2 = "rawY"
            r0.put(r2, r1)
        Led:
            return r0
    }
}
