package ca.dnamobile.javalauncher.input;

/* JADX INFO: loaded from: classes.dex */
public final class GamepadMappingStore {
    private static final java.lang.String ACTIVE_PROFILE = "active_profile";
    private static final int CURRENT_PREF_VERSION = 10;
    private static final int DEFAULT_MOUSE_DPI_SCALE = 100;
    private static final java.lang.String DEFAULT_PROFILE = "default";
    private static final int DEFAULT_SENSITIVITY = 100;
    private static final java.lang.String FORCE_GAME_MODE = "force_game_mode";
    private static final java.lang.String GAME_CAMERA_SENSITIVITY = "game_camera_sensitivity";
    private static final java.lang.String GAME_PREFIX = "game.";
    private static final java.lang.String HARDWARE_MOUSE_DPI_SCALE = "hardware_mouse_dpi_scale";
    private static final java.lang.String KNOWN_PROFILES = "known_profiles";
    public static final int MAX_ACTION_SLOTS = 4;
    public static final int MAX_MOUSE_DPI_SCALE = 300;
    public static final int MAX_SENSITIVITY = 200;
    private static final java.lang.String MENU_CURSOR_SENSITIVITY = "menu_cursor_sensitivity";
    private static final java.lang.String MENU_PREFIX = "menu.";
    public static final int MIN_MOUSE_DPI_SCALE = 25;
    public static final int MIN_SENSITIVITY = 25;
    private static final java.lang.String PREFS_NAME = "gamepad_mapping";
    private static final java.lang.String PREF_VERSION = "pref_version";
    private static final java.lang.String PROFILE_NAME_PREFIX = "profile_name.";
    private static final java.lang.String PROFILE_PREFIX = "profile.";
    private static final java.lang.String SHOW_CURSOR_OVERLAY = "show_cursor_overlay";
    private static volatile ca.dnamobile.javalauncher.input.GamepadMappingStore instance;
    private final android.content.SharedPreferences prefs;

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.input.GamepadMappingStore$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton = null;

        static {
                ca.dnamobile.javalauncher.input.GamepadButton[] r0 = ca.dnamobile.javalauncher.input.GamepadButton.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton = r0
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_A     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L1d
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_B     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L28
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_X     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L33
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_Y     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L3e
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_L1     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L49
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_R1     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L54
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_L2     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L60
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_R2     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L6c
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_THUMBL     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L78
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_THUMBR     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L84
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_START     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L90
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_SELECT     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L9c
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_UP     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> La8
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_DOWN     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> Lb4
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_LEFT     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> Lc0
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_RIGHT     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> Lcc
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_CENTER     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                return
        }
    }

    private GamepadMappingStore(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "gamepad_mapping"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.prefs = r3
            r2.migrateIfNeeded()
            return
    }

    private static int clampActionSlot(int r1) {
            r0 = 3
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static int clampMouseDpiScale(int r1) {
            r0 = 300(0x12c, float:4.2E-43)
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 25
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static int clampSensitivity(int r1) {
            r0 = 200(0xc8, float:2.8E-43)
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 25
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static ca.dnamobile.javalauncher.input.GamepadAction defaultActionSlot(ca.dnamobile.javalauncher.input.GamepadButton r0, boolean r1, int r2) {
            if (r2 > 0) goto Le
            if (r1 == 0) goto L9
            ca.dnamobile.javalauncher.input.GamepadAction r0 = defaultGameAction(r0)
            goto Ld
        L9:
            ca.dnamobile.javalauncher.input.GamepadAction r0 = defaultMenuAction(r0)
        Ld:
            return r0
        Le:
            if (r1 != 0) goto L1a
            ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_Y
            if (r0 != r1) goto L1a
            r0 = 1
            if (r2 != r0) goto L1a
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.MOUSE_LEFT
            return r0
        L1a:
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            return r0
    }

    private static ca.dnamobile.javalauncher.input.GamepadAction defaultGameAction(ca.dnamobile.javalauncher.input.GamepadButton r1) {
            int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L2f;
                case 7: goto L2c;
                case 8: goto L29;
                case 9: goto L26;
                case 10: goto L23;
                case 11: goto L20;
                case 12: goto L1d;
                case 13: goto L1a;
                case 14: goto L17;
                case 15: goto L14;
                case 16: goto L11;
                case 17: goto Le;
                default: goto Lb;
            }
        Lb:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            return r1
        Le:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            return r1
        L11:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.KEY_T
            return r1
        L14:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.KEY_J
            return r1
        L17:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.F3
            return r1
        L1a:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.F5
            return r1
        L1d:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.TAB
            return r1
        L20:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.ESCAPE
            return r1
        L23:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.SNEAK
            return r1
        L26:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.SPRINT
            return r1
        L29:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.MOUSE_LEFT
            return r1
        L2c:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.MOUSE_RIGHT
            return r1
        L2f:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.SCROLL_DOWN
            return r1
        L32:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.SCROLL_UP
            return r1
        L35:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.OFFHAND
            return r1
        L38:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.INVENTORY
            return r1
        L3b:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.DROP
            return r1
        L3e:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.JUMP
            return r1
    }

    private static ca.dnamobile.javalauncher.input.GamepadAction defaultMenuAction(ca.dnamobile.javalauncher.input.GamepadButton r1) {
            int[] r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L29;
                case 2: goto L26;
                case 3: goto L23;
                case 4: goto L20;
                case 5: goto L1d;
                case 6: goto L1a;
                case 7: goto L23;
                case 8: goto L29;
                case 9: goto L20;
                case 10: goto Lb;
                case 11: goto L26;
                case 12: goto L26;
                case 13: goto L17;
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                case 17: goto L29;
                default: goto Lb;
            }
        Lb:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            return r1
        Le:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.ARROW_RIGHT
            return r1
        L11:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.ARROW_LEFT
            return r1
        L14:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.ARROW_DOWN
            return r1
        L17:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.ARROW_UP
            return r1
        L1a:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.SCROLL_DOWN
            return r1
        L1d:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.SCROLL_UP
            return r1
        L20:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.LEFT_SHIFT
            return r1
        L23:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.MOUSE_RIGHT
            return r1
        L26:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.ESCAPE
            return r1
        L29:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.MOUSE_LEFT
            return r1
    }

    private static java.lang.String displayNameForDevice(android.view.InputDevice r3) {
            java.lang.String r0 = r3.getName()
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
        L10:
            java.lang.String r0 = "Controller"
        L12:
            int r1 = r3.getVendorId()
            int r3 = r3.getProductId()
            if (r1 > 0) goto L20
            if (r3 <= 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private org.json.JSONObject exportModeToJson(java.lang.String r10, boolean r11) throws java.lang.Exception {
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            ca.dnamobile.javalauncher.input.GamepadButton[] r1 = ca.dnamobile.javalauncher.input.GamepadButton.values()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L31
            r5 = r1[r4]
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r7 = r3
        L16:
            r8 = 4
            if (r7 >= r8) goto L27
            ca.dnamobile.javalauncher.input.GamepadAction r8 = r9.getButtonActionSlot(r5, r11, r10, r7)
            java.lang.String r8 = r8.name()
            r6.put(r8)
            int r7 = r7 + 1
            goto L16
        L27:
            java.lang.String r5 = r5.name()
            r0.put(r5, r6)
            int r4 = r4 + 1
            goto Lc
        L31:
            return r0
    }

    public static ca.dnamobile.javalauncher.input.GamepadMappingStore get(android.content.Context r2) {
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.instance
            if (r0 != 0) goto L17
            java.lang.Class<ca.dnamobile.javalauncher.input.GamepadMappingStore> r1 = ca.dnamobile.javalauncher.input.GamepadMappingStore.class
            monitor-enter(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = ca.dnamobile.javalauncher.input.GamepadMappingStore.instance     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L12
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = new ca.dnamobile.javalauncher.input.GamepadMappingStore     // Catch: java.lang.Throwable -> L14
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14
            ca.dnamobile.javalauncher.input.GamepadMappingStore.instance = r0     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
        L17:
            return r0
    }

    private ca.dnamobile.javalauncher.input.GamepadAction getPrimaryButtonAction(ca.dnamobile.javalauncher.input.GamepadButton r4, boolean r5, java.lang.String r6) {
            r3 = this;
            boolean r0 = isValidProfileKey(r6)
            java.lang.String r1 = "default"
            if (r0 == 0) goto L9
            goto La
        L9:
            r6 = r1
        La:
            java.lang.String r0 = keyFor(r6, r4, r5)
            ca.dnamobile.javalauncher.input.GamepadAction r0 = r3.readStoredAction(r0)
            if (r0 == 0) goto L15
            return r0
        L15:
            java.lang.String r0 = r3.getActiveProfileKey()
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L30
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L30
            java.lang.String r0 = keyFor(r0, r4, r5)
            ca.dnamobile.javalauncher.input.GamepadAction r0 = r3.readStoredAction(r0)
            if (r0 == 0) goto L30
            return r0
        L30:
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L41
            java.lang.String r6 = keyFor(r4, r5)
            ca.dnamobile.javalauncher.input.GamepadAction r6 = r3.readStoredAction(r6)
            if (r6 == 0) goto L41
            return r6
        L41:
            if (r5 == 0) goto L48
            ca.dnamobile.javalauncher.input.GamepadAction r4 = defaultGameAction(r4)
            goto L4c
        L48:
            ca.dnamobile.javalauncher.input.GamepadAction r4 = defaultMenuAction(r4)
        L4c:
            return r4
    }

    private void importButtonActionsFromJson(android.content.SharedPreferences.Editor r15, java.lang.Object r16, java.lang.String r17, ca.dnamobile.javalauncher.input.GamepadButton r18, boolean r19) throws java.lang.Exception {
            r14 = this;
            r0 = r16
            if (r0 == 0) goto L9b
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r0 != r1) goto La
            goto L9b
        La:
            boolean r1 = r0 instanceof org.json.JSONArray
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L38
            org.json.JSONArray r0 = (org.json.JSONArray) r0
        L12:
            if (r3 >= r2) goto L37
            int r1 = r0.length()
            if (r3 >= r1) goto L23
            java.lang.Object r1 = r0.opt(r3)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = parseImportedAction(r1)
            goto L25
        L23:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
        L25:
            r10 = r1
            if (r10 == 0) goto L34
            r4 = r14
            r5 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r3
            r4.putButtonActionSlot(r5, r6, r7, r8, r9, r10)
        L34:
            int r3 = r3 + 1
            goto L12
        L37:
            return
        L38:
            boolean r1 = r0 instanceof org.json.JSONObject
            if (r1 == 0) goto L89
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "slots"
            org.json.JSONArray r6 = r0.optJSONArray(r1)
            if (r6 == 0) goto L52
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r4.importButtonActionsFromJson(r5, r6, r7, r8, r9)
            return
        L52:
            if (r3 >= r2) goto L88
            if (r3 != 0) goto L59
            java.lang.String r1 = "primary"
            goto L68
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "slot"
            r1.<init>(r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        L68:
            boolean r4 = r0.has(r1)
            if (r4 != 0) goto L6f
            goto L85
        L6f:
            java.lang.Object r1 = r0.opt(r1)
            ca.dnamobile.javalauncher.input.GamepadAction r13 = parseImportedAction(r1)
            if (r13 == 0) goto L85
            r7 = r14
            r8 = r15
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r3
            r7.putButtonActionSlot(r8, r9, r10, r11, r12, r13)
        L85:
            int r3 = r3 + 1
            goto L52
        L88:
            return
        L89:
            ca.dnamobile.javalauncher.input.GamepadAction r10 = parseImportedAction(r16)
            if (r10 == 0) goto L9b
            r9 = 0
            r4 = r14
            r5 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r4.putButtonActionSlot(r5, r6, r7, r8, r9, r10)
        L9b:
            return
    }

    private void importModeFromJson(android.content.SharedPreferences.Editor r10, org.json.JSONObject r11, java.lang.String r12, boolean r13) throws java.lang.Exception {
            r9 = this;
            if (r11 != 0) goto L3
            return
        L3:
            ca.dnamobile.javalauncher.input.GamepadButton[] r0 = ca.dnamobile.javalauncher.input.GamepadButton.values()
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L2a
            r7 = r0[r2]
            java.lang.String r3 = r7.name()
            boolean r3 = r11.has(r3)
            if (r3 != 0) goto L18
            goto L27
        L18:
            java.lang.String r3 = r7.name()
            java.lang.Object r5 = r11.opt(r3)
            r3 = r9
            r4 = r10
            r6 = r12
            r8 = r13
            r3.importButtonActionsFromJson(r4, r5, r6, r7, r8)
        L27:
            int r2 = r2 + 1
            goto L9
        L2a:
            return
    }

    private static boolean isValidProfileKey(java.lang.String r0) {
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static java.lang.String keyFor(ca.dnamobile.javalauncher.input.GamepadButton r1, boolean r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r2 == 0) goto La
            java.lang.String r2 = "game."
            goto Lc
        La:
            java.lang.String r2 = "menu."
        Lc:
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r1 = r1.name()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private static java.lang.String keyFor(java.lang.String r2, ca.dnamobile.javalauncher.input.GamepadButton r3, boolean r4) {
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            java.lang.String r2 = keyFor(r3, r4)
            return r2
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "profile."
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "."
            java.lang.StringBuilder r2 = r2.append(r0)
            if (r4 == 0) goto L23
            java.lang.String r4 = "game."
            goto L25
        L23:
            java.lang.String r4 = "menu."
        L25:
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static java.lang.String keyForSafeProfile(java.lang.String r1, ca.dnamobile.javalauncher.input.GamepadButton r2, boolean r3) {
            boolean r0 = isValidProfileKey(r1)
            if (r0 == 0) goto L7
            goto L9
        L7:
            java.lang.String r1 = "default"
        L9:
            java.lang.String r1 = keyFor(r1, r2, r3)
            return r1
    }

    private static java.lang.String keyForSlot(java.lang.String r1, ca.dnamobile.javalauncher.input.GamepadButton r2, boolean r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = keyFor(r1, r2, r3)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = ".slot"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = clampActionSlot(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private void migrateIfNeeded() {
            r7 = this;
            android.content.SharedPreferences r0 = r7.prefs
            java.lang.String r1 = "pref_version"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r3 = 10
            if (r0 < r3) goto Le
            return
        Le:
            android.content.SharedPreferences r0 = r7.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            ca.dnamobile.javalauncher.input.GamepadButton r4 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_A
            java.lang.String r4 = keyFor(r4, r2)
            r0.remove(r4)
            ca.dnamobile.javalauncher.input.GamepadButton r4 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_R2
            java.lang.String r4 = keyFor(r4, r2)
            r0.remove(r4)
            ca.dnamobile.javalauncher.input.GamepadButton r4 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_CENTER
            java.lang.String r4 = keyFor(r4, r2)
            r0.remove(r4)
            ca.dnamobile.javalauncher.input.GamepadButton r4 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_A
            java.lang.String r5 = "default"
            java.lang.String r4 = keyFor(r5, r4, r2)
            r0.remove(r4)
            ca.dnamobile.javalauncher.input.GamepadButton r4 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_R2
            java.lang.String r4 = keyFor(r5, r4, r2)
            r0.remove(r4)
            ca.dnamobile.javalauncher.input.GamepadButton r4 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_CENTER
            java.lang.String r2 = keyFor(r5, r4, r2)
            r0.remove(r2)
            r7.removeLegacyMenuDpadCursorMapping(r0, r5)
            r7.removeOldRequestedDefaultMappings(r0, r5)
            android.content.SharedPreferences r2 = r7.prefs
            java.lang.String r4 = "known_profiles"
            java.util.Set r6 = java.util.Collections.emptySet()
            java.util.Set r2 = r2.getStringSet(r4, r6)
            if (r2 == 0) goto L77
            java.util.Iterator r2 = r2.iterator()
        L64:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r7.removeLegacyMenuDpadCursorMapping(r0, r4)
            r7.removeOldRequestedDefaultMappings(r0, r4)
            goto L64
        L77:
            android.content.SharedPreferences r2 = r7.prefs
            r4 = 1
            java.lang.String r6 = "show_cursor_overlay"
            boolean r2 = r2.getBoolean(r6, r4)
            r0.putBoolean(r6, r2)
            android.content.SharedPreferences r2 = r7.prefs
            java.lang.String r4 = "menu_cursor_sensitivity"
            r6 = 100
            int r2 = r2.getInt(r4, r6)
            int r2 = clampSensitivity(r2)
            r0.putInt(r4, r2)
            android.content.SharedPreferences r2 = r7.prefs
            java.lang.String r4 = "game_camera_sensitivity"
            int r2 = r2.getInt(r4, r6)
            int r2 = clampSensitivity(r2)
            r0.putInt(r4, r2)
            android.content.SharedPreferences r2 = r7.prefs
            java.lang.String r4 = "hardware_mouse_dpi_scale"
            int r2 = r2.getInt(r4, r6)
            int r2 = clampMouseDpiScale(r2)
            r0.putInt(r4, r2)
            android.content.SharedPreferences r2 = r7.prefs
            java.lang.String r4 = "active_profile"
            java.lang.String r2 = r2.getString(r4, r5)
            r0.putString(r4, r2)
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    private static ca.dnamobile.javalauncher.input.GamepadAction parseImportedAction(java.lang.Object r2) {
            r0 = 0
            if (r2 == 0) goto L22
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r2 != r1) goto L8
            goto L22
        L8:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r2.trim()
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L17
            return r0
        L17:
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.IllegalArgumentException -> L22
            java.lang.String r2 = r2.toUpperCase(r1)     // Catch: java.lang.IllegalArgumentException -> L22
            ca.dnamobile.javalauncher.input.GamepadAction r2 = ca.dnamobile.javalauncher.input.GamepadAction.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L22
            return r2
        L22:
            return r0
    }

    private void putButtonActionSlot(android.content.SharedPreferences.Editor r1, java.lang.String r2, ca.dnamobile.javalauncher.input.GamepadButton r3, boolean r4, int r5, ca.dnamobile.javalauncher.input.GamepadAction r6) {
            r0 = this;
            int r5 = clampActionSlot(r5)
            if (r5 != 0) goto Lb
            java.lang.String r2 = keyFor(r2, r3, r4)
            goto Lf
        Lb:
            java.lang.String r2 = keyForSlot(r2, r3, r4, r5)
        Lf:
            java.lang.String r3 = r6.name()
            r1.putString(r2, r3)
            return
    }

    private ca.dnamobile.javalauncher.input.GamepadAction readStoredAction(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.prefs
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 != 0) goto La
            return r1
        La:
            ca.dnamobile.javalauncher.input.GamepadAction r3 = ca.dnamobile.javalauncher.input.GamepadAction.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> Lf
            return r3
        Lf:
            return r1
    }

    private void rememberImportedProfile(android.content.SharedPreferences.Editor r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L9
            return
        L9:
            android.content.SharedPreferences r0 = r3.prefs
            java.util.Set r1 = java.util.Collections.emptySet()
            java.lang.String r2 = "known_profiles"
            java.util.Set r0 = r0.getStringSet(r2, r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            if (r0 == 0) goto L1f
            r1.addAll(r0)
        L1f:
            r1.add(r5)
            r4.putStringSet(r2, r1)
            if (r6 == 0) goto L47
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "profile_name."
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r6.trim()
            r4.putString(r5, r6)
        L47:
            return
    }

    private void removeIfStoredAction(android.content.SharedPreferences.Editor r3, java.lang.String r4, ca.dnamobile.javalauncher.input.GamepadAction r5) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.prefs
            r1 = 0
            java.lang.String r0 = r0.getString(r4, r1)
            java.lang.String r5 = r5.name()
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L14
            r3.remove(r4)
        L14:
            return
    }

    private void removeLegacyMenuDpadCursorMapping(android.content.SharedPreferences.Editor r4, java.lang.String r5) {
            r3 = this;
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_UP
            r1 = 0
            java.lang.String r0 = keyForSafeProfile(r5, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadAction r2 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_UP
            r3.removeIfStoredAction(r4, r0, r2)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_DOWN
            java.lang.String r0 = keyForSafeProfile(r5, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadAction r2 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_DOWN
            r3.removeIfStoredAction(r4, r0, r2)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_LEFT
            java.lang.String r0 = keyForSafeProfile(r5, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadAction r2 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_LEFT
            r3.removeIfStoredAction(r4, r0, r2)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_RIGHT
            java.lang.String r5 = keyForSafeProfile(r5, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_RIGHT
            r3.removeIfStoredAction(r4, r5, r0)
            return
    }

    private void removeOldRequestedDefaultMappings(android.content.SharedPreferences.Editor r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = isValidProfileKey(r6)
            if (r0 == 0) goto L7
            goto L9
        L7:
            java.lang.String r6 = "default"
        L9:
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_Y
            r1 = 0
            java.lang.String r0 = keyFor(r6, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadAction r2 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            r4.removeIfStoredAction(r5, r0, r2)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_Y
            r2 = 1
            java.lang.String r0 = keyForSlot(r6, r0, r1, r2)
            ca.dnamobile.javalauncher.input.GamepadAction r3 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            r4.removeIfStoredAction(r5, r0, r3)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_THUMBL
            java.lang.String r0 = keyFor(r6, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            r4.removeIfStoredAction(r5, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_UP
            java.lang.String r0 = keyFor(r6, r0, r2)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.SNEAK
            r4.removeIfStoredAction(r5, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_DOWN
            java.lang.String r0 = keyFor(r6, r0, r2)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.KEY_O
            r4.removeIfStoredAction(r5, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_RIGHT
            java.lang.String r6 = keyFor(r6, r0, r2)
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.KEY_K
            r4.removeIfStoredAction(r5, r6, r0)
            return
    }

    public void clearButtonActionSlot(ca.dnamobile.javalauncher.input.GamepadButton r7, boolean r8, java.lang.String r9, int r10) {
            r6 = this;
            ca.dnamobile.javalauncher.input.GamepadAction r2 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.setButtonActionSlot(r1, r2, r3, r4, r5)
            return
    }

    public org.json.JSONObject exportProfileToJson(java.lang.String r6) throws java.lang.Exception {
            r5 = this;
            boolean r0 = isValidProfileKey(r6)
            if (r0 == 0) goto L7
            goto Lb
        L7:
            java.lang.String r6 = r5.getActiveProfileKey()
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "format"
            java.lang.String r2 = "droidbridge.gamepad.profile"
            r0.put(r1, r2)
            java.lang.String r1 = "version"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "profileKey"
            r0.put(r1, r6)
            java.lang.String r1 = "profileName"
            java.lang.String r3 = r5.getProfileDisplayName(r6)
            r0.put(r1, r3)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "showCursorOverlay"
            boolean r4 = r5.isShowCursorOverlay()
            r1.put(r3, r4)
            java.lang.String r3 = "menuCursorSensitivity"
            int r4 = r5.getMenuCursorSensitivity()
            r1.put(r3, r4)
            java.lang.String r3 = "gameCameraSensitivity"
            int r4 = r5.getGameCameraSensitivity()
            r1.put(r3, r4)
            java.lang.String r3 = "hardwareMouseDpiScale"
            int r4 = r5.getHardwareMouseDpiScale()
            r1.put(r3, r4)
            java.lang.String r3 = "settings"
            r0.put(r3, r1)
            r1 = 0
            org.json.JSONObject r1 = r5.exportModeToJson(r6, r1)
            java.lang.String r3 = "menu"
            r0.put(r3, r1)
            java.lang.String r1 = "game"
            org.json.JSONObject r6 = r5.exportModeToJson(r6, r2)
            r0.put(r1, r6)
            return r0
    }

    public java.lang.String getActiveProfileKey() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "active_profile"
            java.lang.String r2 = "default"
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = isValidProfileKey(r0)
            if (r1 == 0) goto L11
            r2 = r0
        L11:
            return r2
    }

    public ca.dnamobile.javalauncher.input.GamepadAction getButtonAction(ca.dnamobile.javalauncher.input.GamepadButton r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = r2.getActiveProfileKey()
            r1 = 0
            ca.dnamobile.javalauncher.input.GamepadAction r3 = r2.getButtonActionSlot(r3, r4, r0, r1)
            return r3
    }

    public ca.dnamobile.javalauncher.input.GamepadAction getButtonAction(ca.dnamobile.javalauncher.input.GamepadButton r2, boolean r3, android.view.InputDevice r4) {
            r1 = this;
            java.lang.String r4 = r1.profileKeyForDevice(r4)
            r0 = 0
            ca.dnamobile.javalauncher.input.GamepadAction r2 = r1.getButtonActionSlot(r2, r3, r4, r0)
            return r2
    }

    public ca.dnamobile.javalauncher.input.GamepadAction getButtonAction(ca.dnamobile.javalauncher.input.GamepadButton r2, boolean r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            ca.dnamobile.javalauncher.input.GamepadAction r2 = r1.getButtonActionSlot(r2, r3, r4, r0)
            return r2
    }

    public ca.dnamobile.javalauncher.input.GamepadAction getButtonActionSlot(ca.dnamobile.javalauncher.input.GamepadButton r4, boolean r5, java.lang.String r6, int r7) {
            r3 = this;
            int r7 = clampActionSlot(r7)
            if (r7 != 0) goto Lb
            ca.dnamobile.javalauncher.input.GamepadAction r4 = r3.getPrimaryButtonAction(r4, r5, r6)
            return r4
        Lb:
            boolean r0 = isValidProfileKey(r6)
            java.lang.String r1 = "default"
            if (r0 == 0) goto L14
            goto L15
        L14:
            r6 = r1
        L15:
            java.lang.String r0 = keyForSlot(r6, r4, r5, r7)
            ca.dnamobile.javalauncher.input.GamepadAction r0 = r3.readStoredAction(r0)
            if (r0 == 0) goto L20
            return r0
        L20:
            java.lang.String r0 = r3.getActiveProfileKey()
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L3b
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L3b
            java.lang.String r0 = keyForSlot(r0, r4, r5, r7)
            ca.dnamobile.javalauncher.input.GamepadAction r0 = r3.readStoredAction(r0)
            if (r0 == 0) goto L3b
            return r0
        L3b:
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L4c
            java.lang.String r6 = keyForSlot(r1, r4, r5, r7)
            ca.dnamobile.javalauncher.input.GamepadAction r6 = r3.readStoredAction(r6)
            if (r6 == 0) goto L4c
            return r6
        L4c:
            ca.dnamobile.javalauncher.input.GamepadAction r4 = defaultActionSlot(r4, r5, r7)
            return r4
    }

    public ca.dnamobile.javalauncher.input.GamepadAction[] getButtonActions(ca.dnamobile.javalauncher.input.GamepadButton r1, boolean r2, android.view.InputDevice r3) {
            r0 = this;
            java.lang.String r3 = r0.profileKeyForDevice(r3)
            ca.dnamobile.javalauncher.input.GamepadAction[] r1 = r0.getButtonActions(r1, r2, r3)
            return r1
    }

    public ca.dnamobile.javalauncher.input.GamepadAction[] getButtonActions(ca.dnamobile.javalauncher.input.GamepadButton r5, boolean r6, java.lang.String r7) {
            r4 = this;
            r0 = 4
            ca.dnamobile.javalauncher.input.GamepadAction[] r1 = new ca.dnamobile.javalauncher.input.GamepadAction[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto Lf
            ca.dnamobile.javalauncher.input.GamepadAction r3 = r4.getButtonActionSlot(r5, r6, r7, r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        Lf:
            return r1
    }

    public java.lang.String getDefaultProfileKey() {
            r1 = this;
            java.lang.String r0 = "default"
            return r0
    }

    public int getGameCameraSensitivity() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "game_camera_sensitivity"
            r2 = 100
            int r0 = r0.getInt(r1, r2)
            int r0 = clampSensitivity(r0)
            return r0
    }

    public float getGameCameraSensitivityMultiplier() {
            r2 = this;
            int r0 = r2.getGameCameraSensitivity()
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            return r0
    }

    public int getHardwareMouseDpiScale() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "hardware_mouse_dpi_scale"
            r2 = 100
            int r0 = r0.getInt(r1, r2)
            int r0 = clampMouseDpiScale(r0)
            return r0
    }

    public float getHardwareMouseDpiScaleMultiplier() {
            r2 = this;
            int r0 = r2.getHardwareMouseDpiScale()
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            return r0
    }

    public java.util.Set<java.lang.String> getKnownProfileKeys() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "known_profiles"
            java.util.Set r2 = java.util.Collections.emptySet()
            java.util.Set r0 = r0.getStringSet(r1, r2)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.lang.String r2 = "default"
            r1.add(r2)
            if (r0 == 0) goto L1b
            r1.addAll(r0)
        L1b:
            return r1
    }

    public int getMenuCursorSensitivity() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "menu_cursor_sensitivity"
            r2 = 100
            int r0 = r0.getInt(r1, r2)
            int r0 = clampSensitivity(r0)
            return r0
    }

    public float getMenuCursorSensitivityMultiplier() {
            r2 = this;
            int r0 = r2.getMenuCursorSensitivity()
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            return r0
    }

    public java.lang.String getProfileDisplayName(java.lang.String r4) {
            r3 = this;
            boolean r0 = isValidProfileKey(r4)
            if (r0 == 0) goto L41
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lf
            goto L41
        Lf:
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "profile_name."
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L31
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L40
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Controller "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = r4.toString()
        L40:
            return r0
        L41:
            java.lang.String r4 = "Default controller"
            return r4
    }

    public void importProfileFromJson(org.json.JSONObject r4, java.lang.String r5) throws java.lang.Exception {
            r3 = this;
            boolean r0 = isValidProfileKey(r5)
            if (r0 == 0) goto L7
            goto Lb
        L7:
            java.lang.String r5 = r3.getActiveProfileKey()
        Lb:
            java.lang.String r0 = "profileName"
            r1 = 0
            java.lang.String r0 = r4.optString(r0, r1)
            android.content.SharedPreferences r1 = r3.prefs
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r3.rememberImportedProfile(r1, r5, r0)
            java.lang.String r0 = "menu"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            r2 = 0
            r3.importModeFromJson(r1, r0, r5, r2)
            java.lang.String r0 = "game"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            r2 = 1
            r3.importModeFromJson(r1, r0, r5, r2)
            java.lang.String r5 = "settings"
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            if (r4 == 0) goto L89
            java.lang.String r5 = "showCursorOverlay"
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L48
            java.lang.String r0 = "show_cursor_overlay"
            boolean r5 = r4.optBoolean(r5, r2)
            r1.putBoolean(r0, r5)
        L48:
            java.lang.String r5 = "menuCursorSensitivity"
            boolean r0 = r4.has(r5)
            r2 = 100
            if (r0 == 0) goto L5f
            int r5 = r4.optInt(r5, r2)
            int r5 = clampSensitivity(r5)
            java.lang.String r0 = "menu_cursor_sensitivity"
            r1.putInt(r0, r5)
        L5f:
            java.lang.String r5 = "gameCameraSensitivity"
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L74
            int r5 = r4.optInt(r5, r2)
            int r5 = clampSensitivity(r5)
            java.lang.String r0 = "game_camera_sensitivity"
            r1.putInt(r0, r5)
        L74:
            java.lang.String r5 = "hardwareMouseDpiScale"
            boolean r0 = r4.has(r5)
            if (r0 == 0) goto L89
            int r4 = r4.optInt(r5, r2)
            int r4 = clampMouseDpiScale(r4)
            java.lang.String r5 = "hardware_mouse_dpi_scale"
            r1.putInt(r5, r4)
        L89:
            r1.apply()
            return
    }

    public boolean isForceGameMode() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "force_game_mode"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public boolean isShowCursorOverlay() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "show_cursor_overlay"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public java.lang.String profileKeyForDevice(android.view.InputDevice r5) {
            r4 = this;
            java.lang.String r0 = "default"
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r5.getDescriptor()
            if (r1 == 0) goto L15
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L40
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r3 = r5.getVendorId()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            int r5 = r5.getProductId()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = r5.toString()
        L40:
            if (r1 == 0) goto L65
            java.lang.String r5 = r1.trim()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4d
            goto L65
        L4d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "device_"
            r5.<init>(r0)
            int r0 = r1.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
        L65:
            return r0
    }

    public void registerDevice(android.view.InputDevice r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r4.profileKeyForDevice(r5)
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L10
            return
        L10:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            java.util.Set r2 = r4.getKnownProfileKeys()
            r1.<init>(r2)
            r1.add(r0)
            android.content.SharedPreferences r2 = r4.prefs
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "known_profiles"
            android.content.SharedPreferences$Editor r1 = r2.putStringSet(r3, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "profile_name."
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = displayNameForDevice(r5)
            android.content.SharedPreferences$Editor r5 = r1.putString(r0, r5)
            r5.apply()
            return
    }

    public void rememberDevice(android.view.InputDevice r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.registerDevice(r1)
            java.lang.String r1 = r0.profileKeyForDevice(r1)
            r0.setActiveProfileKey(r1)
            return
    }

    public void resetDefaults() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            java.lang.String r1 = "pref_version"
            r2 = 10
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            java.lang.String r1 = "show_cursor_overlay"
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            java.lang.String r1 = "active_profile"
            java.lang.String r2 = "default"
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            java.lang.String r1 = "menu_cursor_sensitivity"
            r2 = 100
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            java.lang.String r1 = "game_camera_sensitivity"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            java.lang.String r1 = "hardware_mouse_dpi_scale"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            r0.apply()
            return
    }

    public void setActiveProfileKey(java.lang.String r3) {
            r2 = this;
            boolean r0 = isValidProfileKey(r3)
            if (r0 == 0) goto L7
            goto L9
        L7:
            java.lang.String r3 = "default"
        L9:
            android.content.SharedPreferences r0 = r2.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "active_profile"
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            r3.apply()
            return
    }

    public void setButtonAction(ca.dnamobile.javalauncher.input.GamepadButton r7, ca.dnamobile.javalauncher.input.GamepadAction r8, boolean r9) {
            r6 = this;
            java.lang.String r4 = r6.getActiveProfileKey()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.setButtonActionSlot(r1, r2, r3, r4, r5)
            return
    }

    public void setButtonAction(ca.dnamobile.javalauncher.input.GamepadButton r7, ca.dnamobile.javalauncher.input.GamepadAction r8, boolean r9, java.lang.String r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.setButtonActionSlot(r1, r2, r3, r4, r5)
            return
    }

    public void setButtonActionSlot(ca.dnamobile.javalauncher.input.GamepadButton r2, ca.dnamobile.javalauncher.input.GamepadAction r3, boolean r4, java.lang.String r5, int r6) {
            r1 = this;
            boolean r0 = isValidProfileKey(r5)
            if (r0 == 0) goto L7
            goto L9
        L7:
            java.lang.String r5 = "default"
        L9:
            int r6 = clampActionSlot(r6)
            if (r6 != 0) goto L14
            java.lang.String r2 = keyFor(r5, r2, r4)
            goto L18
        L14:
            java.lang.String r2 = keyForSlot(r5, r2, r4, r6)
        L18:
            android.content.SharedPreferences r4 = r1.prefs
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r3 = r3.name()
            android.content.SharedPreferences$Editor r2 = r4.putString(r2, r3)
            r2.apply()
            return
    }

    public void setForceGameMode(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "force_game_mode"
            android.content.SharedPreferences$Editor r3 = r0.putBoolean(r1, r3)
            r3.apply()
            return
    }

    public void setGameCameraSensitivity(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "game_camera_sensitivity"
            int r3 = clampSensitivity(r3)
            android.content.SharedPreferences$Editor r3 = r0.putInt(r1, r3)
            r3.apply()
            return
    }

    public void setHardwareMouseDpiScale(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "hardware_mouse_dpi_scale"
            int r3 = clampMouseDpiScale(r3)
            android.content.SharedPreferences$Editor r3 = r0.putInt(r1, r3)
            r3.apply()
            return
    }

    public void setMenuCursorSensitivity(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "menu_cursor_sensitivity"
            int r3 = clampSensitivity(r3)
            android.content.SharedPreferences$Editor r3 = r0.putInt(r1, r3)
            r3.apply()
            return
    }

    public void setShowCursorOverlay(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.prefs
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "show_cursor_overlay"
            android.content.SharedPreferences$Editor r3 = r0.putBoolean(r1, r3)
            r3.apply()
            return
    }
}
