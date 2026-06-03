package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard.class */
public class Keyboard {
    public static final int EVENT_SIZE = 18;
    public static final int CHAR_NONE = 0;
    public static final int KEY_NONE = 0;
    public static final int KEY_ESCAPE = 1;
    public static final int KEY_1 = 2;
    public static final int KEY_2 = 3;
    public static final int KEY_3 = 4;
    public static final int KEY_4 = 5;
    public static final int KEY_5 = 6;
    public static final int KEY_6 = 7;
    public static final int KEY_7 = 8;
    public static final int KEY_8 = 9;
    public static final int KEY_9 = 10;
    public static final int KEY_0 = 11;
    public static final int KEY_MINUS = 12;
    public static final int KEY_EQUALS = 13;
    public static final int KEY_BACK = 14;
    public static final int KEY_TAB = 15;
    public static final int KEY_Q = 16;
    public static final int KEY_W = 17;
    public static final int KEY_E = 18;
    public static final int KEY_R = 19;
    public static final int KEY_T = 20;
    public static final int KEY_Y = 21;
    public static final int KEY_U = 22;
    public static final int KEY_I = 23;
    public static final int KEY_O = 24;
    public static final int KEY_P = 25;
    public static final int KEY_LBRACKET = 26;
    public static final int KEY_RBRACKET = 27;
    public static final int KEY_RETURN = 28;
    public static final int KEY_LCONTROL = 29;
    public static final int KEY_A = 30;
    public static final int KEY_S = 31;
    public static final int KEY_D = 32;
    public static final int KEY_F = 33;
    public static final int KEY_G = 34;
    public static final int KEY_H = 35;
    public static final int KEY_J = 36;
    public static final int KEY_K = 37;
    public static final int KEY_L = 38;
    public static final int KEY_SEMICOLON = 39;
    public static final int KEY_APOSTROPHE = 40;
    public static final int KEY_GRAVE = 41;
    public static final int KEY_LSHIFT = 42;
    public static final int KEY_BACKSLASH = 43;
    public static final int KEY_Z = 44;
    public static final int KEY_X = 45;
    public static final int KEY_C = 46;
    public static final int KEY_V = 47;
    public static final int KEY_B = 48;
    public static final int KEY_N = 49;
    public static final int KEY_M = 50;
    public static final int KEY_COMMA = 51;
    public static final int KEY_PERIOD = 52;
    public static final int KEY_SLASH = 53;
    public static final int KEY_RSHIFT = 54;
    public static final int KEY_MULTIPLY = 55;
    public static final int KEY_LMENU = 56;
    public static final int KEY_SPACE = 57;
    public static final int KEY_CAPITAL = 58;
    public static final int KEY_F1 = 59;
    public static final int KEY_F2 = 60;
    public static final int KEY_F3 = 61;
    public static final int KEY_F4 = 62;
    public static final int KEY_F5 = 63;
    public static final int KEY_F6 = 64;
    public static final int KEY_F7 = 65;
    public static final int KEY_F8 = 66;
    public static final int KEY_F9 = 67;
    public static final int KEY_F10 = 68;
    public static final int KEY_NUMLOCK = 69;
    public static final int KEY_SCROLL = 70;
    public static final int KEY_NUMPAD7 = 71;
    public static final int KEY_NUMPAD8 = 72;
    public static final int KEY_NUMPAD9 = 73;
    public static final int KEY_SUBTRACT = 74;
    public static final int KEY_NUMPAD4 = 75;
    public static final int KEY_NUMPAD5 = 76;
    public static final int KEY_NUMPAD6 = 77;
    public static final int KEY_ADD = 78;
    public static final int KEY_NUMPAD1 = 79;
    public static final int KEY_NUMPAD2 = 80;
    public static final int KEY_NUMPAD3 = 81;
    public static final int KEY_NUMPAD0 = 82;
    public static final int KEY_DECIMAL = 83;
    public static final int KEY_F11 = 87;
    public static final int KEY_F12 = 88;
    public static final int KEY_F13 = 100;
    public static final int KEY_F14 = 101;
    public static final int KEY_F15 = 102;
    public static final int KEY_F16 = 103;
    public static final int KEY_F17 = 104;
    public static final int KEY_F18 = 105;
    public static final int KEY_KANA = 112;
    public static final int KEY_F19 = 113;
    public static final int KEY_CONVERT = 121;
    public static final int KEY_NOCONVERT = 123;
    public static final int KEY_YEN = 125;
    public static final int KEY_NUMPADEQUALS = 141;
    public static final int KEY_CIRCUMFLEX = 144;
    public static final int KEY_AT = 145;
    public static final int KEY_COLON = 146;
    public static final int KEY_UNDERLINE = 147;
    public static final int KEY_KANJI = 148;
    public static final int KEY_STOP = 149;
    public static final int KEY_AX = 150;
    public static final int KEY_UNLABELED = 151;
    public static final int KEY_NUMPADENTER = 156;
    public static final int KEY_RCONTROL = 157;
    public static final int KEY_SECTION = 167;
    public static final int KEY_NUMPADCOMMA = 179;
    public static final int KEY_DIVIDE = 181;
    public static final int KEY_SYSRQ = 183;
    public static final int KEY_RMENU = 184;
    public static final int KEY_FUNCTION = 196;
    public static final int KEY_PAUSE = 197;
    public static final int KEY_HOME = 199;
    public static final int KEY_UP = 200;
    public static final int KEY_PRIOR = 201;
    public static final int KEY_LEFT = 203;
    public static final int KEY_RIGHT = 205;
    public static final int KEY_END = 207;
    public static final int KEY_DOWN = 208;
    public static final int KEY_NEXT = 209;
    public static final int KEY_INSERT = 210;
    public static final int KEY_DELETE = 211;
    public static final int KEY_CLEAR = 218;
    public static final int KEY_LMETA = 219;
    public static final int KEY_LWIN = 219;
    public static final int KEY_RMETA = 220;
    public static final int KEY_RWIN = 220;
    public static final int KEY_APPS = 221;
    public static final int KEY_POWER = 222;
    public static final int KEY_SLEEP = 223;
    public static final int KEYBOARD_SIZE = 256;
    private static final int BUFFER_SIZE = 50;
    private static final java.lang.String[] keyName = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> keyMap = null;
    private static int counter;
    private static final int keyCount = 0;
    private static boolean created;
    private static boolean repeat_enabled;
    private static final java.nio.ByteBuffer keyDownBuffer = null;
    private static java.nio.ByteBuffer readBuffer;
    private static org.lwjgl.input.Keyboard.KeyEvent current_event;
    private static org.lwjgl.input.Keyboard.KeyEvent tmp_event;
    private static boolean initialized;
    private static org.lwjgl.opengl.InputImplementation implementation;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.input.Keyboard$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard$KeyEvent.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard$KeyEvent.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Keyboard$KeyEvent.class */
    private static final class KeyEvent {
        private int character;
        private int key;
        private boolean state;
        private long nanos;
        private boolean repeat;

        private KeyEvent() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        private void reset() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.character = r1
                r0 = r3
                r1 = 0
                r0.key = r1
                r0 = r3
                r1 = 0
                r0.state = r1
                r0 = r3
                r1 = 0
                r0.repeat = r1
                return
        }

        /* synthetic */ KeyEvent(org.lwjgl.input.Keyboard.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static /* synthetic */ void access$100(org.lwjgl.input.Keyboard.KeyEvent r2) {
                r0 = r2
                r0.reset()
                return
        }

        static /* synthetic */ boolean access$200(org.lwjgl.input.Keyboard.KeyEvent r2) {
                r0 = r2
                boolean r0 = r0.repeat
                return r0
        }

        static /* synthetic */ int access$302(org.lwjgl.input.Keyboard.KeyEvent r4, int r5) {
                r0 = r4
                r1 = r5
                r2 = r1; r1 = r0; r0 = r2; 
                r1.key = r2
                return r0
        }

        static /* synthetic */ boolean access$402(org.lwjgl.input.Keyboard.KeyEvent r4, boolean r5) {
                r0 = r4
                r1 = r5
                r2 = r1; r1 = r0; r0 = r2; 
                r1.state = r2
                return r0
        }

        static /* synthetic */ int access$502(org.lwjgl.input.Keyboard.KeyEvent r4, int r5) {
                r0 = r4
                r1 = r5
                r2 = r1; r1 = r0; r0 = r2; 
                r1.character = r2
                return r0
        }

        static /* synthetic */ long access$602(org.lwjgl.input.Keyboard.KeyEvent r6, long r7) {
                r0 = r6
                r1 = r7
                r2 = r1; r1 = r0; r0 = r2; 
                r1.nanos = r2
                return r0
        }

        static /* synthetic */ boolean access$202(org.lwjgl.input.Keyboard.KeyEvent r4, boolean r5) {
                r0 = r4
                r1 = r5
                r2 = r1; r1 = r0; r0 = r2; 
                r1.repeat = r2
                return r0
        }

        static /* synthetic */ int access$500(org.lwjgl.input.Keyboard.KeyEvent r2) {
                r0 = r2
                int r0 = r0.character
                return r0
        }

        static /* synthetic */ int access$300(org.lwjgl.input.Keyboard.KeyEvent r2) {
                r0 = r2
                int r0 = r0.key
                return r0
        }

        static /* synthetic */ boolean access$400(org.lwjgl.input.Keyboard.KeyEvent r2) {
                r0 = r2
                boolean r0 = r0.state
                return r0
        }

        static /* synthetic */ long access$600(org.lwjgl.input.Keyboard.KeyEvent r3) {
                r0 = r3
                long r0 = r0.nanos
                return r0
        }
    }

    private Keyboard() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static void initialize() {
            boolean r0 = org.lwjgl.input.Keyboard.initialized
            if (r0 == 0) goto L7
            return
        L7:
            org.lwjgl.Sys.initialize()
            r0 = 1
            org.lwjgl.input.Keyboard.initialized = r0
            return
    }

    private static void create(org.lwjgl.opengl.InputImplementation r2) throws org.lwjgl.LWJGLException {
            boolean r0 = org.lwjgl.input.Keyboard.created
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = org.lwjgl.input.Keyboard.initialized
            if (r0 != 0) goto L10
            initialize()
        L10:
            r0 = r2
            org.lwjgl.input.Keyboard.implementation = r0
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Keyboard.implementation
            r0.createKeyboard()
            r0 = 1
            org.lwjgl.input.Keyboard.created = r0
            r0 = 900(0x384, float:1.261E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            org.lwjgl.input.Keyboard.readBuffer = r0
            reset()
            return
    }

    public static void create() throws org.lwjgl.LWJGLException {
            boolean r0 = org.lwjgl.opengl.Display.isCreated()
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Display must be created."
            r1.<init>(r2)
            throw r0
        L10:
            org.lwjgl.input.GLFWInputImplementation r0 = org.lwjgl.input.GLFWInputImplementation.singleton
            create(r0)
            return
    }

    private static void reset() {
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.readBuffer
            r1 = 0
            java.nio.Buffer r0 = r0.limit(r1)
            r0 = 0
            r4 = r0
        La:
            r0 = r4
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.keyDownBuffer
            int r1 = r1.remaining()
            if (r0 >= r1) goto L23
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.keyDownBuffer
            r1 = r4
            r2 = 0
            java.nio.ByteBuffer r0 = r0.put(r1, r2)
            int r4 = r4 + 1
            goto La
        L23:
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            org.lwjgl.input.Keyboard.KeyEvent.access$100(r0)
            return
    }

    public static boolean isCreated() {
            boolean r0 = org.lwjgl.input.Keyboard.created
            return r0
    }

    public static void destroy() {
            boolean r0 = org.lwjgl.input.Keyboard.created
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            org.lwjgl.input.Keyboard.created = r0
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Keyboard.implementation
            r0.destroyKeyboard()
            reset()
            return
    }

    public static void poll() {
            boolean r0 = org.lwjgl.input.Keyboard.created
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Keyboard must be created before you can poll the device"
            r1.<init>(r2)
            throw r0
        L10:
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Keyboard.implementation
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.keyDownBuffer
            r0.pollKeyboard(r1)
            read()
            return
    }

    private static void read() {
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.readBuffer
            java.nio.ByteBuffer r0 = r0.compact()
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Keyboard.implementation
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.readBuffer
            r0.readKeyboard(r1)
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.readBuffer
            java.nio.Buffer r0 = r0.flip()
            return
    }

    public static boolean isKeyDown(int r4) {
            boolean r0 = org.lwjgl.input.Keyboard.created
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Keyboard must be created before you can query key state"
            r1.<init>(r2)
            throw r0
        L10:
            r0 = r4
            if (r0 < 0) goto L1e
            r0 = r4
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.keyDownBuffer
            int r1 = r1.limit()
            if (r0 < r1) goto L20
        L1e:
            r0 = 0
            return r0
        L20:
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.keyDownBuffer
            r1 = r4
            byte r0 = r0.get(r1)
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    public static synchronized java.lang.String getKeyName(int r3) {
            java.lang.String[] r0 = org.lwjgl.input.Keyboard.keyName
            r1 = r3
            r0 = r0[r1]
            return r0
    }

    public static synchronized int getKeyIndex(java.lang.String r3) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = org.lwjgl.input.Keyboard.keyMap
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r4
            int r0 = r0.intValue()
            return r0
    }

    public static int getNumKeyboardEvents() {
            boolean r0 = org.lwjgl.input.Keyboard.created
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Keyboard must be created before you can read events"
            r1.<init>(r2)
            throw r0
        L10:
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.readBuffer
            int r0 = r0.position()
            r4 = r0
            r0 = 0
            r5 = r0
        L19:
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.tmp_event
            boolean r0 = readNext(r0)
            if (r0 == 0) goto L37
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.tmp_event
            boolean r0 = org.lwjgl.input.Keyboard.KeyEvent.access$200(r0)
            if (r0 == 0) goto L31
            boolean r0 = org.lwjgl.input.Keyboard.repeat_enabled
            if (r0 == 0) goto L37
        L31:
            int r5 = r5 + 1
            goto L19
        L37:
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.readBuffer
            r1 = r4
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r5
            return r0
    }

    public static boolean next() {
            boolean r0 = org.lwjgl.input.Keyboard.created
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Keyboard must be created before you can read events"
            r1.<init>(r2)
            throw r0
        L10:
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            boolean r0 = readNext(r0)
            r1 = r0
            r4 = r1
            if (r0 == 0) goto L2d
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            boolean r0 = org.lwjgl.input.Keyboard.KeyEvent.access$200(r0)
            if (r0 == 0) goto L2d
            boolean r0 = org.lwjgl.input.Keyboard.repeat_enabled
            if (r0 != 0) goto L2d
            goto L10
        L2d:
            r0 = r4
            return r0
    }

    public static void enableRepeatEvents(boolean r2) {
            r0 = r2
            org.lwjgl.input.Keyboard.repeat_enabled = r0
            return
    }

    public static boolean areRepeatEventsEnabled() {
            boolean r0 = org.lwjgl.input.Keyboard.repeat_enabled
            return r0
    }

    private static boolean readNext(org.lwjgl.input.Keyboard.KeyEvent r4) {
            java.nio.ByteBuffer r0 = org.lwjgl.input.Keyboard.readBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L57
            r0 = r4
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.readBuffer
            int r1 = r1.getInt()
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r0 = org.lwjgl.input.Keyboard.KeyEvent.access$302(r0, r1)
            r0 = r4
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.readBuffer
            byte r1 = r1.get()
            if (r1 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            boolean r0 = org.lwjgl.input.Keyboard.KeyEvent.access$402(r0, r1)
            r0 = r4
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.readBuffer
            int r1 = r1.getInt()
            int r0 = org.lwjgl.input.Keyboard.KeyEvent.access$502(r0, r1)
            r0 = r4
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.readBuffer
            long r1 = r1.getLong()
            long r0 = org.lwjgl.input.Keyboard.KeyEvent.access$602(r0, r1)
            r0 = r4
            java.nio.ByteBuffer r1 = org.lwjgl.input.Keyboard.readBuffer
            byte r1 = r1.get()
            r2 = 1
            if (r1 != r2) goto L50
            r1 = 1
            goto L51
        L50:
            r1 = 0
        L51:
            boolean r0 = org.lwjgl.input.Keyboard.KeyEvent.access$202(r0, r1)
            r0 = 1
            return r0
        L57:
            r0 = 0
            return r0
    }

    public static int getKeyCount() {
            int r0 = org.lwjgl.input.Keyboard.keyCount
            return r0
    }

    public static char getEventCharacter() {
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            int r0 = org.lwjgl.input.Keyboard.KeyEvent.access$500(r0)
            char r0 = (char) r0
            return r0
    }

    public static int getEventKey() {
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            int r0 = org.lwjgl.input.Keyboard.KeyEvent.access$300(r0)
            return r0
    }

    public static boolean getEventKeyState() {
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            boolean r0 = org.lwjgl.input.Keyboard.KeyEvent.access$400(r0)
            return r0
    }

    public static long getEventNanoseconds() {
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            long r0 = org.lwjgl.input.Keyboard.KeyEvent.access$600(r0)
            return r0
    }

    public static boolean isRepeatEvent() {
            org.lwjgl.input.Keyboard$KeyEvent r0 = org.lwjgl.input.Keyboard.current_event
            boolean r0 = org.lwjgl.input.Keyboard.KeyEvent.access$200(r0)
            return r0
    }

    static {
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            org.lwjgl.input.Keyboard.keyName = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 253(0xfd, float:3.55E-43)
            r1.<init>(r2)
            org.lwjgl.input.Keyboard.keyMap = r0
            java.lang.Class<org.lwjgl.input.Keyboard> r0 = org.lwjgl.input.Keyboard.class
            java.lang.reflect.Field[] r0 = r0.getFields()
            r4 = r0
            r0 = r4
            r5 = r0
            r0 = r5
            int r0 = r0.length     // Catch: java.lang.Exception -> Lb2
            r6 = r0
            r0 = 0
            r7 = r0
        L23:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto Laf
            r0 = r5
            r1 = r7
            r0 = r0[r1]     // Catch: java.lang.Exception -> Lb2
            r8 = r0
            r0 = r8
            int r0 = r0.getModifiers()     // Catch: java.lang.Exception -> Lb2
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La9
            r0 = r8
            int r0 = r0.getModifiers()     // Catch: java.lang.Exception -> Lb2
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La9
            r0 = r8
            int r0 = r0.getModifiers()     // Catch: java.lang.Exception -> Lb2
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La9
            r0 = r8
            java.lang.Class r0 = r0.getType()     // Catch: java.lang.Exception -> Lb2
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lb2
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La9
            r0 = r8
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r1 = "KEY_"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto La9
            r0 = r8
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r1 = "WIN"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Exception -> Lb2
            if (r0 != 0) goto La9
            r0 = r8
            r1 = 0
            int r0 = r0.getInt(r1)     // Catch: java.lang.Exception -> Lb2
            r9 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lb2
            r1 = 4
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> Lb2
            r10 = r0
            java.lang.String[] r0 = org.lwjgl.input.Keyboard.keyName     // Catch: java.lang.Exception -> Lb2
            r1 = r9
            r2 = r10
            r0[r1] = r2     // Catch: java.lang.Exception -> Lb2
            java.util.Map<java.lang.String, java.lang.Integer> r0 = org.lwjgl.input.Keyboard.keyMap     // Catch: java.lang.Exception -> Lb2
            r1 = r10
            r2 = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Exception -> Lb2
            int r0 = org.lwjgl.input.Keyboard.counter     // Catch: java.lang.Exception -> Lb2
            r1 = 1
            int r0 = r0 + r1
            org.lwjgl.input.Keyboard.counter = r0     // Catch: java.lang.Exception -> Lb2
        La9:
            int r7 = r7 + 1
            goto L23
        Laf:
            goto Lb3
        Lb2:
            r5 = move-exception
        Lb3:
            int r0 = org.lwjgl.input.Keyboard.counter
            org.lwjgl.input.Keyboard.keyCount = r0
            r0 = 256(0x100, float:3.59E-43)
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            org.lwjgl.input.Keyboard.keyDownBuffer = r0
            org.lwjgl.input.Keyboard$KeyEvent r0 = new org.lwjgl.input.Keyboard$KeyEvent
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.input.Keyboard.current_event = r0
            org.lwjgl.input.Keyboard$KeyEvent r0 = new org.lwjgl.input.Keyboard$KeyEvent
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.input.Keyboard.tmp_event = r0
            return
    }
}
