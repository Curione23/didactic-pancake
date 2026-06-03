package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFW.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFW.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFW.class */
public class GLFW {
    private static boolean mGLFWInputPumping;
    private static boolean mGLFWWindowVisibleOnCreation;
    private static long glfwVulkanLoaderHandle;
    static java.nio.FloatBuffer joystickData;
    static java.nio.ByteBuffer buttonData;
    public static final int GLFW_VERSION_MAJOR = 3;
    public static final int GLFW_VERSION_MINOR = 4;
    public static final int GLFW_VERSION_REVISION = 0;
    public static final int GLFW_TRUE = 1;
    public static final int GLFW_FALSE = 0;
    public static final int GLFW_RELEASE = 0;
    public static final int GLFW_PRESS = 1;
    public static final int GLFW_REPEAT = 2;
    public static final int GLFW_HAT_CENTERED = 0;
    public static final int GLFW_HAT_UP = 1;
    public static final int GLFW_HAT_RIGHT = 2;
    public static final int GLFW_HAT_DOWN = 4;
    public static final int GLFW_HAT_LEFT = 8;
    public static final int GLFW_HAT_RIGHT_UP = 3;
    public static final int GLFW_HAT_RIGHT_DOWN = 6;
    public static final int GLFW_HAT_LEFT_UP = 9;
    public static final int GLFW_HAT_LEFT_DOWN = 12;
    public static final int GLFW_KEY_UNKNOWN = -1;
    public static final int GLFW_KEY_SPACE = 32;
    public static final int GLFW_KEY_APOSTROPHE = 39;
    public static final int GLFW_KEY_COMMA = 44;
    public static final int GLFW_KEY_MINUS = 45;
    public static final int GLFW_KEY_PERIOD = 46;
    public static final int GLFW_KEY_SLASH = 47;
    public static final int GLFW_KEY_0 = 48;
    public static final int GLFW_KEY_1 = 49;
    public static final int GLFW_KEY_2 = 50;
    public static final int GLFW_KEY_3 = 51;
    public static final int GLFW_KEY_4 = 52;
    public static final int GLFW_KEY_5 = 53;
    public static final int GLFW_KEY_6 = 54;
    public static final int GLFW_KEY_7 = 55;
    public static final int GLFW_KEY_8 = 56;
    public static final int GLFW_KEY_9 = 57;
    public static final int GLFW_KEY_SEMICOLON = 59;
    public static final int GLFW_KEY_EQUAL = 61;
    public static final int GLFW_KEY_A = 65;
    public static final int GLFW_KEY_B = 66;
    public static final int GLFW_KEY_C = 67;
    public static final int GLFW_KEY_D = 68;
    public static final int GLFW_KEY_E = 69;
    public static final int GLFW_KEY_F = 70;
    public static final int GLFW_KEY_G = 71;
    public static final int GLFW_KEY_H = 72;
    public static final int GLFW_KEY_I = 73;
    public static final int GLFW_KEY_J = 74;
    public static final int GLFW_KEY_K = 75;
    public static final int GLFW_KEY_L = 76;
    public static final int GLFW_KEY_M = 77;
    public static final int GLFW_KEY_N = 78;
    public static final int GLFW_KEY_O = 79;
    public static final int GLFW_KEY_P = 80;
    public static final int GLFW_KEY_Q = 81;
    public static final int GLFW_KEY_R = 82;
    public static final int GLFW_KEY_S = 83;
    public static final int GLFW_KEY_T = 84;
    public static final int GLFW_KEY_U = 85;
    public static final int GLFW_KEY_V = 86;
    public static final int GLFW_KEY_W = 87;
    public static final int GLFW_KEY_X = 88;
    public static final int GLFW_KEY_Y = 89;
    public static final int GLFW_KEY_Z = 90;
    public static final int GLFW_KEY_LEFT_BRACKET = 91;
    public static final int GLFW_KEY_BACKSLASH = 92;
    public static final int GLFW_KEY_RIGHT_BRACKET = 93;
    public static final int GLFW_KEY_GRAVE_ACCENT = 96;
    public static final int GLFW_KEY_WORLD_1 = 161;
    public static final int GLFW_KEY_WORLD_2 = 162;
    public static final int GLFW_KEY_ESCAPE = 256;
    public static final int GLFW_KEY_ENTER = 257;
    public static final int GLFW_KEY_TAB = 258;
    public static final int GLFW_KEY_BACKSPACE = 259;
    public static final int GLFW_KEY_INSERT = 260;
    public static final int GLFW_KEY_DELETE = 261;
    public static final int GLFW_KEY_RIGHT = 262;
    public static final int GLFW_KEY_LEFT = 263;
    public static final int GLFW_KEY_DOWN = 264;
    public static final int GLFW_KEY_UP = 265;
    public static final int GLFW_KEY_PAGE_UP = 266;
    public static final int GLFW_KEY_PAGE_DOWN = 267;
    public static final int GLFW_KEY_HOME = 268;
    public static final int GLFW_KEY_END = 269;
    public static final int GLFW_KEY_CAPS_LOCK = 280;
    public static final int GLFW_KEY_SCROLL_LOCK = 281;
    public static final int GLFW_KEY_NUM_LOCK = 282;
    public static final int GLFW_KEY_PRINT_SCREEN = 283;
    public static final int GLFW_KEY_PAUSE = 284;
    public static final int GLFW_KEY_F1 = 290;
    public static final int GLFW_KEY_F2 = 291;
    public static final int GLFW_KEY_F3 = 292;
    public static final int GLFW_KEY_F4 = 293;
    public static final int GLFW_KEY_F5 = 294;
    public static final int GLFW_KEY_F6 = 295;
    public static final int GLFW_KEY_F7 = 296;
    public static final int GLFW_KEY_F8 = 297;
    public static final int GLFW_KEY_F9 = 298;
    public static final int GLFW_KEY_F10 = 299;
    public static final int GLFW_KEY_F11 = 300;
    public static final int GLFW_KEY_F12 = 301;
    public static final int GLFW_KEY_F13 = 302;
    public static final int GLFW_KEY_F14 = 303;
    public static final int GLFW_KEY_F15 = 304;
    public static final int GLFW_KEY_F16 = 305;
    public static final int GLFW_KEY_F17 = 306;
    public static final int GLFW_KEY_F18 = 307;
    public static final int GLFW_KEY_F19 = 308;
    public static final int GLFW_KEY_F20 = 309;
    public static final int GLFW_KEY_F21 = 310;
    public static final int GLFW_KEY_F22 = 311;
    public static final int GLFW_KEY_F23 = 312;
    public static final int GLFW_KEY_F24 = 313;
    public static final int GLFW_KEY_F25 = 314;
    public static final int GLFW_KEY_KP_0 = 320;
    public static final int GLFW_KEY_KP_1 = 321;
    public static final int GLFW_KEY_KP_2 = 322;
    public static final int GLFW_KEY_KP_3 = 323;
    public static final int GLFW_KEY_KP_4 = 324;
    public static final int GLFW_KEY_KP_5 = 325;
    public static final int GLFW_KEY_KP_6 = 326;
    public static final int GLFW_KEY_KP_7 = 327;
    public static final int GLFW_KEY_KP_8 = 328;
    public static final int GLFW_KEY_KP_9 = 329;
    public static final int GLFW_KEY_KP_DECIMAL = 330;
    public static final int GLFW_KEY_KP_DIVIDE = 331;
    public static final int GLFW_KEY_KP_MULTIPLY = 332;
    public static final int GLFW_KEY_KP_SUBTRACT = 333;
    public static final int GLFW_KEY_KP_ADD = 334;
    public static final int GLFW_KEY_KP_ENTER = 335;
    public static final int GLFW_KEY_KP_EQUAL = 336;
    public static final int GLFW_KEY_LEFT_SHIFT = 340;
    public static final int GLFW_KEY_LEFT_CONTROL = 341;
    public static final int GLFW_KEY_LEFT_ALT = 342;
    public static final int GLFW_KEY_LEFT_SUPER = 343;
    public static final int GLFW_KEY_RIGHT_SHIFT = 344;
    public static final int GLFW_KEY_RIGHT_CONTROL = 345;
    public static final int GLFW_KEY_RIGHT_ALT = 346;
    public static final int GLFW_KEY_RIGHT_SUPER = 347;
    public static final int GLFW_KEY_MENU = 348;
    public static final int GLFW_KEY_LAST = 348;
    public static final int GLFW_MOD_SHIFT = 1;
    public static final int GLFW_MOD_CONTROL = 2;
    public static final int GLFW_MOD_ALT = 4;
    public static final int GLFW_MOD_SUPER = 8;
    public static final int GLFW_MOD_CAPS_LOCK = 16;
    public static final int GLFW_MOD_NUM_LOCK = 32;
    public static final int GLFW_MOUSE_BUTTON_1 = 0;
    public static final int GLFW_MOUSE_BUTTON_2 = 1;
    public static final int GLFW_MOUSE_BUTTON_3 = 2;
    public static final int GLFW_MOUSE_BUTTON_4 = 3;
    public static final int GLFW_MOUSE_BUTTON_5 = 4;
    public static final int GLFW_MOUSE_BUTTON_6 = 5;
    public static final int GLFW_MOUSE_BUTTON_7 = 6;
    public static final int GLFW_MOUSE_BUTTON_8 = 7;
    public static final int GLFW_MOUSE_BUTTON_LAST = 7;
    public static final int GLFW_MOUSE_BUTTON_LEFT = 0;
    public static final int GLFW_MOUSE_BUTTON_RIGHT = 1;
    public static final int GLFW_MOUSE_BUTTON_MIDDLE = 2;
    private static final int KEY_BUFFER_OFFSET = 31;
    private static final int KEY_BUFFER_SIZE = 318;
    public static final java.nio.ByteBuffer keyDownBuffer = null;
    public static final java.nio.ByteBuffer mouseDownBuffer = null;
    public static final int GLFW_JOYSTICK_1 = 0;
    public static final int GLFW_JOYSTICK_2 = 1;
    public static final int GLFW_JOYSTICK_3 = 2;
    public static final int GLFW_JOYSTICK_4 = 3;
    public static final int GLFW_JOYSTICK_5 = 4;
    public static final int GLFW_JOYSTICK_6 = 5;
    public static final int GLFW_JOYSTICK_7 = 6;
    public static final int GLFW_JOYSTICK_8 = 7;
    public static final int GLFW_JOYSTICK_9 = 8;
    public static final int GLFW_JOYSTICK_10 = 9;
    public static final int GLFW_JOYSTICK_11 = 10;
    public static final int GLFW_JOYSTICK_12 = 11;
    public static final int GLFW_JOYSTICK_13 = 12;
    public static final int GLFW_JOYSTICK_14 = 13;
    public static final int GLFW_JOYSTICK_15 = 14;
    public static final int GLFW_JOYSTICK_16 = 15;
    public static final int GLFW_JOYSTICK_LAST = 15;
    public static final int GLFW_GAMEPAD_BUTTON_A = 0;
    public static final int GLFW_GAMEPAD_BUTTON_B = 1;
    public static final int GLFW_GAMEPAD_BUTTON_X = 2;
    public static final int GLFW_GAMEPAD_BUTTON_Y = 3;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_BUMPER = 4;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER = 5;
    public static final int GLFW_GAMEPAD_BUTTON_BACK = 6;
    public static final int GLFW_GAMEPAD_BUTTON_START = 7;
    public static final int GLFW_GAMEPAD_BUTTON_GUIDE = 8;
    public static final int GLFW_GAMEPAD_BUTTON_LEFT_THUMB = 9;
    public static final int GLFW_GAMEPAD_BUTTON_RIGHT_THUMB = 10;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_UP = 11;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_RIGHT = 12;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_DOWN = 13;
    public static final int GLFW_GAMEPAD_BUTTON_DPAD_LEFT = 14;
    public static final int GLFW_GAMEPAD_BUTTON_LAST = 14;
    public static final int GLFW_GAMEPAD_BUTTON_CROSS = 0;
    public static final int GLFW_GAMEPAD_BUTTON_CIRCLE = 1;
    public static final int GLFW_GAMEPAD_BUTTON_SQUARE = 2;
    public static final int GLFW_GAMEPAD_BUTTON_TRIANGLE = 3;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_X = 0;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_Y = 1;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_X = 2;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_Y = 3;
    public static final int GLFW_GAMEPAD_AXIS_LEFT_TRIGGER = 4;
    public static final int GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5;
    public static final int GLFW_GAMEPAD_AXIS_LAST = 5;
    public static final int GLFW_NO_ERROR = 0;
    public static final int GLFW_NOT_INITIALIZED = 65537;
    public static final int GLFW_NO_CURRENT_CONTEXT = 65538;
    public static final int GLFW_INVALID_ENUM = 65539;
    public static final int GLFW_INVALID_VALUE = 65540;
    public static final int GLFW_OUT_OF_MEMORY = 65541;
    public static final int GLFW_API_UNAVAILABLE = 65542;
    public static final int GLFW_VERSION_UNAVAILABLE = 65543;
    public static final int GLFW_PLATFORM_ERROR = 65544;
    public static final int GLFW_FORMAT_UNAVAILABLE = 65545;
    public static final int GLFW_NO_WINDOW_CONTEXT = 65546;
    public static final int GLFW_CURSOR_UNAVAILABLE = 65547;
    public static final int GLFW_FEATURE_UNAVAILABLE = 65548;
    public static final int GLFW_FEATURE_UNIMPLEMENTED = 65549;
    public static final int GLFW_FOCUSED = 131073;
    public static final int GLFW_ICONIFIED = 131074;
    public static final int GLFW_RESIZABLE = 131075;
    public static final int GLFW_VISIBLE = 131076;
    public static final int GLFW_DECORATED = 131077;
    public static final int GLFW_AUTO_ICONIFY = 131078;
    public static final int GLFW_FLOATING = 131079;
    public static final int GLFW_MAXIMIZED = 131080;
    public static final int GLFW_CENTER_CURSOR = 131081;
    public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 131082;
    public static final int GLFW_HOVERED = 131083;
    public static final int GLFW_FOCUS_ON_SHOW = 131084;
    public static final int GLFW_CURSOR = 208897;
    public static final int GLFW_STICKY_KEYS = 208898;
    public static final int GLFW_STICKY_MOUSE_BUTTONS = 208899;
    public static final int GLFW_LOCK_KEY_MODS = 208900;
    public static final int GLFW_RAW_MOUSE_MOTION = 208901;
    public static final int GLFW_UNLIMITED_MOUSE_BUTTONS = 208902;
    public static final int GLFW_IME = 208903;
    public static final int GLFW_CURSOR_NORMAL = 212993;
    public static final int GLFW_CURSOR_HIDDEN = 212994;
    public static final int GLFW_CURSOR_DISABLED = 212995;
    public static final int GLFW_CURSOR_CAPTURED = 212996;
    public static final int GLFW_ARROW_CURSOR = 221185;
    public static final int GLFW_IBEAM_CURSOR = 221186;
    public static final int GLFW_CROSSHAIR_CURSOR = 221187;
    public static final int GLFW_POINTING_HAND_CURSOR = 221188;
    public static final int GLFW_RESIZE_EW_CURSOR = 221189;
    public static final int GLFW_RESIZE_NS_CURSOR = 221190;
    public static final int GLFW_RESIZE_NWSE_CURSOR = 221191;
    public static final int GLFW_RESIZE_NESW_CURSOR = 221192;
    public static final int GLFW_RESIZE_ALL_CURSOR = 221193;
    public static final int GLFW_NOT_ALLOWED_CURSOR = 221194;
    public static final int GLFW_HRESIZE_CURSOR = 221189;
    public static final int GLFW_VRESIZE_CURSOR = 221190;
    public static final int GLFW_HAND_CURSOR = 221188;
    public static final int GLFW_CONNECTED = 262145;
    public static final int GLFW_DISCONNECTED = 262146;
    public static final int GLFW_JOYSTICK_HAT_BUTTONS = 327681;
    public static final int GLFW_COCOA_CHDIR_RESOURCES = 331777;
    public static final int GLFW_COCOA_MENUBAR = 331778;
    public static final int GLFW_ANY_PLATFORM = 393216;
    public static final int GLFW_PLATFORM_WIN32 = 393217;
    public static final int GLFW_PLATFORM_COCOA = 393218;
    public static final int GLFW_PLATFORM_WAYLAND = 393219;
    public static final int GLFW_PLATFORM_X11 = 393220;
    public static final int GLFW_PLATFORM_NULL = 393221;
    public static final int GLFW_DONT_CARE = -1;
    public static final int GLFW_RED_BITS = 135169;
    public static final int GLFW_GREEN_BITS = 135170;
    public static final int GLFW_BLUE_BITS = 135171;
    public static final int GLFW_ALPHA_BITS = 135172;
    public static final int GLFW_DEPTH_BITS = 135173;
    public static final int GLFW_STENCIL_BITS = 135174;
    public static final int GLFW_ACCUM_RED_BITS = 135175;
    public static final int GLFW_ACCUM_GREEN_BITS = 135176;
    public static final int GLFW_ACCUM_BLUE_BITS = 135177;
    public static final int GLFW_ACCUM_ALPHA_BITS = 135178;
    public static final int GLFW_AUX_BUFFERS = 135179;
    public static final int GLFW_STEREO = 135180;
    public static final int GLFW_SAMPLES = 135181;
    public static final int GLFW_SRGB_CAPABLE = 135182;
    public static final int GLFW_REFRESH_RATE = 135183;
    public static final int GLFW_DOUBLEBUFFER = 135184;
    public static final int GLFW_CLIENT_API = 139265;
    public static final int GLFW_CONTEXT_VERSION_MAJOR = 139266;
    public static final int GLFW_CONTEXT_VERSION_MINOR = 139267;
    public static final int GLFW_CONTEXT_REVISION = 139268;
    public static final int GLFW_CONTEXT_ROBUSTNESS = 139269;
    public static final int GLFW_OPENGL_FORWARD_COMPAT = 139270;
    public static final int GLFW_OPENGL_DEBUG_CONTEXT = 139271;
    public static final int GLFW_OPENGL_PROFILE = 139272;
    public static final int GLFW_CONTEXT_RELEASE_BEHAVIOR = 139273;
    public static final int GLFW_CONTEXT_NO_ERROR = 139274;
    public static final int GLFW_CONTEXT_CREATION_API = 139275;
    public static final int GLFW_SCALE_TO_MONITOR = 139276;
    public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 143361;
    public static final int GLFW_COCOA_FRAME_NAME = 143362;
    public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 143363;
    public static final int GLFW_X11_CLASS_NAME = 147457;
    public static final int GLFW_X11_INSTANCE_NAME = 147458;
    public static final int GLFW_WIN32_KEYBOARD_MENU = 151553;
    public static final int GLFW_NO_API = 0;
    public static final int GLFW_OPENGL_API = 196609;
    public static final int GLFW_OPENGL_ES_API = 196610;
    public static final int GLFW_NO_ROBUSTNESS = 0;
    public static final int GLFW_NO_RESET_NOTIFICATION = 200705;
    public static final int GLFW_LOSE_CONTEXT_ON_RESET = 200706;
    public static final int GLFW_OPENGL_ANY_PROFILE = 0;
    public static final int GLFW_OPENGL_CORE_PROFILE = 204801;
    public static final int GLFW_OPENGL_COMPAT_PROFILE = 204802;
    public static final int GLFW_ANY_RELEASE_BEHAVIOR = 0;
    public static final int GLFW_RELEASE_BEHAVIOR_FLUSH = 217089;
    public static final int GLFW_RELEASE_BEHAVIOR_NONE = 217090;
    public static final int GLFW_NATIVE_CONTEXT_API = 221185;
    public static final int GLFW_EGL_CONTEXT_API = 221186;
    public static final int GLFW_OSMESA_CONTEXT_API = 221187;
    public static org.lwjgl.glfw.GLFWCharCallback mGLFWCharCallback;
    public static org.lwjgl.glfw.GLFWCharModsCallback mGLFWCharModsCallback;
    public static org.lwjgl.glfw.GLFWCursorEnterCallback mGLFWCursorEnterCallback;
    public static org.lwjgl.glfw.GLFWCursorPosCallback mGLFWCursorPosCallback;
    public static org.lwjgl.glfw.GLFWDropCallback mGLFWDropCallback;
    public static org.lwjgl.glfw.GLFWErrorCallback mGLFWErrorCallback;
    public static org.lwjgl.glfw.GLFWFramebufferSizeCallback mGLFWFramebufferSizeCallback;
    public static org.lwjgl.glfw.GLFWJoystickCallback mGLFWJoystickCallback;
    public static org.lwjgl.glfw.GLFWKeyCallback mGLFWKeyCallback;
    public static org.lwjgl.glfw.GLFWMonitorCallback mGLFWMonitorCallback;
    public static org.lwjgl.glfw.GLFWMouseButtonCallback mGLFWMouseButtonCallback;
    public static org.lwjgl.glfw.GLFWScrollCallback mGLFWScrollCallback;
    public static org.lwjgl.glfw.GLFWWindowCloseCallback mGLFWWindowCloseCallback;
    public static org.lwjgl.glfw.GLFWWindowContentScaleCallback mGLFWWindowContentScaleCallback;
    public static org.lwjgl.glfw.GLFWWindowFocusCallback mGLFWWindowFocusCallback;
    public static org.lwjgl.glfw.GLFWWindowIconifyCallback mGLFWWindowIconifyCallback;
    public static org.lwjgl.glfw.GLFWWindowMaximizeCallback mGLFWWindowMaximizeCallback;
    public static org.lwjgl.glfw.GLFWWindowPosCallback mGLFWWindowPosCallback;
    public static org.lwjgl.glfw.GLFWWindowRefreshCallback mGLFWWindowRefreshCallback;
    public static org.lwjgl.glfw.GLFWWindowSizeCallback mGLFWWindowSizeCallback;
    public static volatile int mGLFWWindowWidth;
    public static volatile int mGLFWWindowHeight;
    private static org.lwjgl.glfw.GLFWGammaRamp mGLFWGammaRamp;
    private static java.util.Map<java.lang.Integer, java.lang.String> mGLFWKeyCodes;
    private static org.lwjgl.glfw.GLFWVidMode mGLFWVideoMode;
    private static long mGLFWWindowMonitor;
    private static double mGLFWInitialTime;
    private static android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> mGLFWWindowMap;
    public static boolean mGLFWIsInputReady;
    private static final java.lang.String PROP_WINDOW_WIDTH = "glfwstub.windowWidth";
    private static final java.lang.String PROP_WINDOW_HEIGHT = "glfwstub.windowHeight";
    public static long mainContext;
    public static final org.lwjgl.system.SharedLibrary GLFW = null;
    static boolean isGLFWReady;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFW$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFW$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFW$Functions.class */
    public static final class Functions {
        public static final long Init = 0;
        public static final long CreateContext = 0;
        public static final long GetCurrentContext = 0;
        public static final long MakeContextCurrent = 0;
        public static final long Terminate = 0;
        public static final long SetWindowHint = 0;
        public static final long SwapBuffers = 0;
        public static final long SwapInterval = 0;
        public static final long PumpEvents = 0;
        public static final long StopPumping = 0;
        public static final long StartPumping = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavInit"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.Init = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavCreateContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.CreateContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavGetCurrentContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.GetCurrentContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavMakeCurrent"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.MakeContextCurrent = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavTerminate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.Terminate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavSetWindowHint"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.SetWindowHint = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavSwapBuffers"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.SwapBuffers = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavSwapInterval"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.SwapInterval = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavPumpEvents"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.PumpEvents = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavStopPumping"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.StopPumping = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
                java.lang.String r1 = "pojavStartPumping"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.glfw.GLFW.Functions.StartPumping = r0
                return
        }
    }

    private static java.nio.FloatBuffer flippedFloatBuffer(int r2) {
            r0 = r2
            java.nio.FloatBuffer r0 = java.nio.FloatBuffer.allocate(r0)
            r3 = r0
            r0 = r3
            java.nio.Buffer r0 = r0.flip()
            r0 = r3
            return r0
    }

    private static java.nio.ByteBuffer flippedByteBuffer(int r2) {
            r0 = r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3 = r0
            r0 = r3
            java.nio.Buffer r0 = r0.flip()
            r0 = r3
            return r0
    }

    private static native long nglfwSetCharCallback(long r0, long r2);

    private static native long nglfwSetCharModsCallback(long r0, long r2);

    private static native long nglfwSetCursorEnterCallback(long r0, long r2);

    private static native long nglfwSetCursorPosCallback(long r0, long r2);

    private static native long nglfwSetFramebufferSizeCallback(long r0, long r2);

    private static native long nglfwSetKeyCallback(long r0, long r2);

    private static native long nglfwSetMouseButtonCallback(long r0, long r2);

    private static native long nglfwSetScrollCallback(long r0, long r2);

    private static native long nglfwSetWindowSizeCallback(long r0, long r2);

    private static native void nglfwSetShowingWindow(long r0);

    protected GLFW() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.glfw.GLFW.GLFW
            return r0
    }

    public static void internalChangeMonitorSize(int r5, int r6) {
            r0 = r5
            org.lwjgl.glfw.GLFW.mGLFWWindowWidth = r0
            r0 = r6
            org.lwjgl.glfw.GLFW.mGLFWWindowHeight = r0
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            if (r0 != 0) goto Lf
            return
        Lf:
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.HEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static org.lwjgl.glfw.GLFWWindowProperties internalGetWindow(long r6) {
            android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMap
            r1 = r6
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            org.lwjgl.glfw.GLFWWindowProperties r0 = (org.lwjgl.glfw.GLFWWindowProperties) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L2d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "No window pointer found: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWCharCallback glfwSetCharCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWcharfun") org.lwjgl.glfw.GLFWCharCallbackI r7) {
            org.lwjgl.glfw.GLFWCharCallback r0 = org.lwjgl.glfw.GLFW.mGLFWCharCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWCharCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetCharCallback(r0, r1)
            org.lwjgl.glfw.GLFWCharCallback r0 = org.lwjgl.glfw.GLFWCharCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWCharCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWCharModsCallback glfwSetCharModsCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWcharmodsfun") org.lwjgl.glfw.GLFWCharModsCallbackI r7) {
            org.lwjgl.glfw.GLFWCharModsCallback r0 = org.lwjgl.glfw.GLFW.mGLFWCharModsCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWCharModsCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetCharModsCallback(r0, r1)
            org.lwjgl.glfw.GLFWCharModsCallback r0 = org.lwjgl.glfw.GLFWCharModsCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWCharModsCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWCursorEnterCallback glfwSetCursorEnterCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWcursorenterfun") org.lwjgl.glfw.GLFWCursorEnterCallbackI r7) {
            org.lwjgl.glfw.GLFWCursorEnterCallback r0 = org.lwjgl.glfw.GLFW.mGLFWCursorEnterCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWCursorEnterCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetCursorEnterCallback(r0, r1)
            org.lwjgl.glfw.GLFWCursorEnterCallback r0 = org.lwjgl.glfw.GLFWCursorEnterCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWCursorEnterCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWCursorPosCallback glfwSetCursorPosCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWcursorposfun") org.lwjgl.glfw.GLFWCursorPosCallbackI r7) {
            org.lwjgl.glfw.GLFWCursorPosCallback r0 = org.lwjgl.glfw.GLFW.mGLFWCursorPosCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWCursorPosCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetCursorPosCallback(r0, r1)
            org.lwjgl.glfw.GLFWCursorPosCallback r0 = org.lwjgl.glfw.GLFWCursorPosCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWCursorPosCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWDropCallback glfwSetDropCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWdropfun") org.lwjgl.glfw.GLFWDropCallbackI r4) {
            org.lwjgl.glfw.GLFWDropCallback r0 = org.lwjgl.glfw.GLFW.mGLFWDropCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWDropCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWDropCallback r0 = org.lwjgl.glfw.GLFWDropCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWDropCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWErrorCallback glfwSetErrorCallback(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWerrorfun") org.lwjgl.glfw.GLFWErrorCallbackI r2) {
            org.lwjgl.glfw.GLFWErrorCallback r0 = org.lwjgl.glfw.GLFW.mGLFWErrorCallback
            r3 = r0
            r0 = r2
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWErrorCallback = r0
            goto L16
        Lf:
            r0 = r2
            org.lwjgl.glfw.GLFWErrorCallback r0 = org.lwjgl.glfw.GLFWErrorCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWErrorCallback = r0
        L16:
            r0 = r3
            return r0
    }

    public static org.lwjgl.glfw.GLFWFramebufferSizeCallback glfwSetFramebufferSizeCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWframebuffersizefun") org.lwjgl.glfw.GLFWFramebufferSizeCallbackI r7) {
            org.lwjgl.glfw.GLFWFramebufferSizeCallback r0 = org.lwjgl.glfw.GLFW.mGLFWFramebufferSizeCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWFramebufferSizeCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetFramebufferSizeCallback(r0, r1)
            org.lwjgl.glfw.GLFWFramebufferSizeCallback r0 = org.lwjgl.glfw.GLFWFramebufferSizeCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWFramebufferSizeCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWJoystickCallback glfwSetJoystickCallback(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWjoystickfun") org.lwjgl.glfw.GLFWJoystickCallbackI r2) {
            org.lwjgl.glfw.GLFWJoystickCallback r0 = org.lwjgl.glfw.GLFW.mGLFWJoystickCallback
            r3 = r0
            r0 = r2
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWJoystickCallback = r0
            goto L16
        Lf:
            r0 = r2
            org.lwjgl.glfw.GLFWJoystickCallback r0 = org.lwjgl.glfw.GLFWJoystickCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWJoystickCallback = r0
        L16:
            r0 = r3
            return r0
    }

    public static org.lwjgl.glfw.GLFWKeyCallback glfwSetKeyCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWkeyfun") org.lwjgl.glfw.GLFWKeyCallbackI r7) {
            org.lwjgl.glfw.GLFWKeyCallback r0 = org.lwjgl.glfw.GLFW.mGLFWKeyCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWKeyCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetKeyCallback(r0, r1)
            org.lwjgl.glfw.GLFWKeyCallback r0 = org.lwjgl.glfw.GLFWKeyCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWKeyCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWMonitorCallback glfwSetMonitorCallback(@javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWmonitorfun") org.lwjgl.glfw.GLFWMonitorCallbackI r2) {
            org.lwjgl.glfw.GLFWMonitorCallback r0 = org.lwjgl.glfw.GLFW.mGLFWMonitorCallback
            r3 = r0
            r0 = r2
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWMonitorCallback = r0
            goto L16
        Lf:
            r0 = r2
            org.lwjgl.glfw.GLFWMonitorCallback r0 = org.lwjgl.glfw.GLFWMonitorCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWMonitorCallback = r0
        L16:
            r0 = r3
            return r0
    }

    public static org.lwjgl.glfw.GLFWMouseButtonCallback glfwSetMouseButtonCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWmousebuttonfun") org.lwjgl.glfw.GLFWMouseButtonCallbackI r7) {
            org.lwjgl.glfw.GLFWMouseButtonCallback r0 = org.lwjgl.glfw.GLFW.mGLFWMouseButtonCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWMouseButtonCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetMouseButtonCallback(r0, r1)
            org.lwjgl.glfw.GLFWMouseButtonCallback r0 = org.lwjgl.glfw.GLFWMouseButtonCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWMouseButtonCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWScrollCallback glfwSetScrollCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWscrollfun") org.lwjgl.glfw.GLFWScrollCallbackI r7) {
            org.lwjgl.glfw.GLFWScrollCallback r0 = org.lwjgl.glfw.GLFW.mGLFWScrollCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWScrollCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetScrollCallback(r0, r1)
            org.lwjgl.glfw.GLFWScrollCallback r0 = org.lwjgl.glfw.GLFWScrollCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWScrollCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowCloseCallback glfwSetWindowCloseCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowclosefun") org.lwjgl.glfw.GLFWWindowCloseCallbackI r4) {
            org.lwjgl.glfw.GLFWWindowCloseCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowCloseCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowCloseCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowCloseCallback r0 = org.lwjgl.glfw.GLFWWindowCloseCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowCloseCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowContentScaleCallback glfwSetWindowContentScaleCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowcontentscalefun") org.lwjgl.glfw.GLFWWindowContentScaleCallbackI r4) {
            org.lwjgl.glfw.GLFWWindowContentScaleCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowContentScaleCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowContentScaleCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowContentScaleCallback r0 = org.lwjgl.glfw.GLFWWindowContentScaleCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowContentScaleCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowFocusCallback glfwSetWindowFocusCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowfocusfun") org.lwjgl.glfw.GLFWWindowFocusCallbackI r4) {
            org.lwjgl.glfw.GLFWWindowFocusCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowFocusCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowFocusCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowFocusCallback r0 = org.lwjgl.glfw.GLFWWindowFocusCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowFocusCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowIconifyCallback glfwSetWindowIconifyCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowiconifyfun") org.lwjgl.glfw.GLFWWindowIconifyCallbackI r4) {
            org.lwjgl.glfw.GLFWWindowIconifyCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowIconifyCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowIconifyCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowIconifyCallback r0 = org.lwjgl.glfw.GLFWWindowIconifyCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowIconifyCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowMaximizeCallback glfwSetWindowMaximizeCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowmaximizefun") org.lwjgl.glfw.GLFWWindowMaximizeCallbackI r4) {
            org.lwjgl.glfw.GLFWWindowMaximizeCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMaximizeCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowMaximizeCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowMaximizeCallback r0 = org.lwjgl.glfw.GLFWWindowMaximizeCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowMaximizeCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowPosCallback glfwSetWindowPosCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowposfun") org.lwjgl.glfw.GLFWWindowPosCallbackI r4) {
            org.lwjgl.glfw.GLFWWindowPosCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowPosCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowPosCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowPosCallback r0 = org.lwjgl.glfw.GLFWWindowPosCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowPosCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowRefreshCallback glfwSetWindowRefreshCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowrefreshfun") org.lwjgl.glfw.GLFWWindowRefreshCallbackI r4) {
            org.lwjgl.glfw.GLFWWindowRefreshCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowRefreshCallback
            r5 = r0
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowRefreshCallback = r0
            goto L16
        Lf:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowRefreshCallback r0 = org.lwjgl.glfw.GLFWWindowRefreshCallback.create(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowRefreshCallback = r0
        L16:
            r0 = r5
            return r0
    }

    public static org.lwjgl.glfw.GLFWWindowSizeCallback glfwSetWindowSizeCallback(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWwindowsizefun") org.lwjgl.glfw.GLFWWindowSizeCallbackI r7) {
            org.lwjgl.glfw.GLFWWindowSizeCallback r0 = org.lwjgl.glfw.GLFW.mGLFWWindowSizeCallback
            r8 = r0
            r0 = r7
            if (r0 != 0) goto Lf
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWWindowSizeCallback = r0
            goto L1d
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nglfwSetWindowSizeCallback(r0, r1)
            org.lwjgl.glfw.GLFWWindowSizeCallback r0 = org.lwjgl.glfw.GLFWWindowSizeCallback.createSafe(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowSizeCallback = r0
        L1d:
            r0 = r8
            return r0
    }

    public static boolean glfwInit() {
            boolean r0 = org.lwjgl.glfw.GLFW.isGLFWReady
            if (r0 != 0) goto L20
            long r0 = java.lang.System.nanoTime()
            double r0 = (double) r0
            org.lwjgl.glfw.GLFW.mGLFWInitialTime = r0
            long r0 = org.lwjgl.glfw.GLFW.Functions.Init
            r3 = r0
            r0 = r3
            int r0 = org.lwjgl.system.JNI.invokeI(r0)
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            org.lwjgl.glfw.GLFW.isGLFWReady = r0
        L20:
            boolean r0 = org.lwjgl.glfw.GLFW.isGLFWReady
            return r0
    }

    public static void glfwTerminate() {
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWIsInputReady = r0
            r0 = 0
            boolean r0 = org.lwjgl.glfw.CallbackBridge.nativeSetInputReady(r0)
            long r0 = org.lwjgl.glfw.GLFW.Functions.Terminate
            r3 = r0
            r0 = r3
            org.lwjgl.system.JNI.invokeV(r0)
            return
    }

    public static void glfwInitHint(int r1, int r2) {
            return
    }

    public static int glfwGetPlatform() {
            r0 = 393220(0x60004, float:5.51019E-40)
            return r0
    }

    public static boolean glfwPlatformSupported(int r3) {
            r0 = r3
            r1 = 393220(0x60004, float:5.51019E-40)
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @org.lwjgl.system.NativeType("GLFWwindow *")
    public static long glfwGetCurrentContext() {
            long r0 = org.lwjgl.glfw.GLFW.Functions.GetCurrentContext
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    public static void glfwGetFramebufferSize(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r6
            r1 = r4
            org.lwjgl.glfw.GLFWWindowProperties r1 = internalGetWindow(r1)
            int r1 = r1.width
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            r1 = r4
            org.lwjgl.glfw.GLFWWindowProperties r1 = internalGetWindow(r1)
            int r1 = r1.height
            java.nio.IntBuffer r0 = r0.put(r1)
            return
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLFWmonitor **")
    public static org.lwjgl.PointerBuffer glfwGetMonitors() {
            r0 = 1
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.allocateDirect(r0)
            r4 = r0
            r0 = r4
            long r1 = glfwGetPrimaryMonitor()
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            return r0
    }

    public static long glfwGetPrimaryMonitor() {
            r0 = 1
            return r0
    }

    public static void glfwGetMonitorPos(@org.lwjgl.system.NativeType("GLFWmonitor *") long r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r5
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            return
    }

    public static void glfwGetMonitorWorkarea(@org.lwjgl.system.NativeType("GLFWmonitor *") long r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r5
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r8
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            java.nio.IntBuffer r0 = r0.put(r1)
            return
    }

    @org.lwjgl.system.NativeType("GLFWmonitor *")
    public static long glfwGetWindowMonitor(@org.lwjgl.system.NativeType("GLFWwindow *") long r3) {
            long r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMonitor
            return r0
    }

    public static void glfwSetWindowMonitor(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @org.lwjgl.system.NativeType("GLFWmonitor *") long r7, int r9, int r10, int r11, int r12, int r13) {
            r0 = r5
            r1 = r7
            long r0 = r0 * r1
            org.lwjgl.glfw.GLFW.mGLFWWindowMonitor = r0
            return
    }

    public static int glfwGetWindowAttrib(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, int r6) {
            r0 = r4
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.getOrDefault(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    public static void glfwSetWindowAttrib(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, int r6, int r7) {
            r0 = r4
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public static void glfwGetVersion(java.nio.IntBuffer r3, java.nio.IntBuffer r4, java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L15:
            r0 = r3
            r1 = 3
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = 4
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r5
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            return
    }

    public static java.lang.String glfwGetVersionString() {
            java.lang.String r0 = "3.4.0"
            return r0
    }

    public static int glfwGetError(@javax.annotation.Nullable org.lwjgl.PointerBuffer r2) {
            r0 = 0
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLFWvidmode const *")
    public static org.lwjgl.glfw.GLFWVidMode.Buffer glfwGetVideoModes(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r4
            org.lwjgl.glfw.GLFWVidMode r0 = glfwGetVideoMode(r0)     // Catch: java.lang.Throwable -> L22
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L22
            r8 = r0
            r0 = r8
            r1 = 1
            org.lwjgl.glfw.GLFWVidMode$Buffer r0 = org.lwjgl.glfw.GLFWVidMode.createSafe(r0, r1)     // Catch: java.lang.Throwable -> L22
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L22:
            r11 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWVidMode glfwGetVideoMode(long r2) {
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            return r0
    }

    public static org.lwjgl.glfw.GLFWGammaRamp glfwGetGammaRamp(@org.lwjgl.system.NativeType("GLFWmonitor *") long r2) {
            org.lwjgl.glfw.GLFWGammaRamp r0 = org.lwjgl.glfw.GLFW.mGLFWGammaRamp
            return r0
    }

    public static void glfwSetGammaRamp(@org.lwjgl.system.NativeType("GLFWmonitor *") long r2, @org.lwjgl.system.NativeType("const GLFWgammaramp *") org.lwjgl.glfw.GLFWGammaRamp r4) {
            r0 = r4
            org.lwjgl.glfw.GLFW.mGLFWGammaRamp = r0
            return
    }

    public static void glfwMakeContextCurrent(@org.lwjgl.system.NativeType("GLFWwindow *") long r5) {
            long r0 = org.lwjgl.glfw.GLFW.Functions.MakeContextCurrent
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void glfwSwapBuffers(@org.lwjgl.system.NativeType("GLFWwindow *") long r5) {
            long r0 = org.lwjgl.glfw.GLFW.Functions.SwapBuffers
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void glfwSwapInterval(int r4) {
            long r0 = org.lwjgl.glfw.GLFW.Functions.SwapInterval
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    public static double glfwGetTime() {
            long r0 = java.lang.System.nanoTime()
            double r0 = (double) r0
            double r1 = org.lwjgl.glfw.GLFW.mGLFWInitialTime
            double r0 = r0 - r1
            r1 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r1
            return r0
    }

    public static void glfwSetTime(double r5) {
            long r0 = java.lang.System.nanoTime()
            r1 = r5
            long r1 = (long) r1
            long r0 = r0 - r1
            double r0 = (double) r0
            org.lwjgl.glfw.GLFW.mGLFWInitialTime = r0
            return
    }

    public static long glfwGetTimerValue() {
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    public static long glfwGetTimerFrequency() {
            r0 = 60
            return r0
    }

    public static long nglfwCreateContext(long r5) {
            r0 = r5
            long r1 = org.lwjgl.glfw.GLFW.Functions.CreateContext
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static long glfwCreateWindow(int r8, int r9, java.lang.CharSequence r10, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            long r0 = mglfwCreateWindow(r0, r1, r2, r3, r4)
            return r0
    }

    public static long nglfwCreateWindow(int r8, int r9, long r10, long r12, long r14) {
            r0 = r8
            r1 = r9
            java.lang.String r2 = "Game"
            r3 = r12
            r4 = r14
            long r0 = mglfwCreateWindow(r0, r1, r2, r3, r4)
            return r0
    }

    private static long mglfwCreateWindow(int r5, int r6, java.lang.CharSequence r7, long r8, long r10) {
            r0 = r10
            long r0 = nglfwCreateContext(r0)
            r12 = r0
            org.lwjgl.glfw.GLFWWindowProperties r0 = new org.lwjgl.glfw.GLFWWindowProperties
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r14
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            r0.width = r1
            r0 = r14
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            r0.height = r1
            r0 = r14
            r1 = r7
            r0.title = r1
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 131075(0x20003, float:1.83675E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.inputModes
            r1 = 208897(0x33001, float:2.92727E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 212993(0x34001, float:2.98467E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.inputModes
            r1 = 208898(0x33002, float:2.92728E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.inputModes
            r1 = 208899(0x33003, float:2.9273E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.inputModes
            r1 = 208903(0x33007, float:2.92735E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 131083(0x2000b, float:1.83686E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 131076(0x20004, float:1.83677E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = 3
            r15 = r0
            r0 = 3
            r16 = r0
            java.lang.String r0 = "POJAV_RENDERER"
            java.lang.String r0 = java.lang.System.getenv(r0)
            r17 = r0
            java.lang.String r0 = "vulkan_zink"
            r1 = r17
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lde
            r0 = 4
            r15 = r0
            r0 = 6
            r16 = r0
            goto L100
        Lde:
            java.lang.String r0 = "gallium_virgl"
            r1 = r17
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lef
            r0 = 4
            r15 = r0
            goto L100
        Lef:
            java.lang.String r0 = "opengles3"
            r1 = r17
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L100
            r0 = 4
            r15 = r0
            r0 = 0
            r16 = r0
        L100:
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 139266(0x22002, float:1.95153E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r14
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 139267(0x22003, float:1.95155E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMap
            r1 = r12
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = r14
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r12
            org.lwjgl.glfw.GLFW.mainContext = r0
            boolean r0 = org.lwjgl.glfw.GLFW.mGLFWWindowVisibleOnCreation
            if (r0 != 0) goto L14b
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L150
        L14b:
            r0 = r12
            glfwShowWindow(r0)
        L150:
            r0 = r12
            return r0
    }

    public static void glfwDestroyWindow(long r5) {
            r0 = r5
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)     // Catch: java.lang.IllegalArgumentException -> L13
            android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMap     // Catch: java.lang.IllegalArgumentException -> L13
            r1 = r5
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L13
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.IllegalArgumentException -> L13
            goto L32
        L13:
            r7 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "GLFW: Warning: failed to remove window "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r7
            r0.printStackTrace()
        L32:
            android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMap
            int r0 = r0.size()
            if (r0 != 0) goto L3f
            r0 = 0
            goto L53
        L3f:
            android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMap
            android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> r1 = org.lwjgl.glfw.GLFW.mGLFWWindowMap
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.keyAt(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L53:
            nglfwSetShowingWindow(r0)
            return
    }

    public static java.lang.String glfwGetWindowTitle(long r3) {
            r0 = r3
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            java.lang.CharSequence r0 = r0.title
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void glfwDefaultWindowHints() {
            r0 = 1
            org.lwjgl.glfw.GLFW.mGLFWWindowVisibleOnCreation = r0
            return
    }

    public static void glfwGetWindowSize(long r4, java.nio.IntBuffer r6, java.nio.IntBuffer r7) {
            r0 = r6
            if (r0 == 0) goto L10
            r0 = r6
            r1 = r4
            org.lwjgl.glfw.GLFWWindowProperties r1 = internalGetWindow(r1)
            int r1 = r1.width
            java.nio.IntBuffer r0 = r0.put(r1)
        L10:
            r0 = r7
            if (r0 == 0) goto L20
            r0 = r7
            r1 = r4
            org.lwjgl.glfw.GLFWWindowProperties r1 = internalGetWindow(r1)
            int r1 = r1.height
            java.nio.IntBuffer r0 = r0.put(r1)
        L20:
            return
    }

    public static void glfwSetWindowSizeLimits(@org.lwjgl.system.NativeType("GLFWwindow *") long r1, int r3, int r4, int r5, int r6) {
            return
    }

    public static void glfwSetWindowPos(long r3, int r5, int r6) {
            r0 = r3
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r1 = r5
            r0.x = r1
            r0 = r3
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r1 = r6
            r0.y = r1
            return
    }

    public static void glfwSetWindowSize(long r5, int r7, int r8) {
            r0 = r5
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r1 = r7
            r0.width = r1
            r0 = r5
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r1 = r8
            r0.height = r1
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "GLFW: Set size for window "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", width="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", height="
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
    }

    public static void glfwShowWindow(long r4) {
            r0 = r4
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r6 = r0
            r0 = r6
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 131083(0x2000b, float:1.83686E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 131076(0x20004, float:1.83677E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            nglfwSetShowingWindow(r0)
            return
    }

    public static void glfwHideWindow(long r4) {
            r0 = r4
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r6 = r0
            r0 = r6
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 131083(0x2000b, float:1.83686E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.windowAttribs
            r1 = 131076(0x20004, float:1.83677E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public static void glfwFocusWindow(@org.lwjgl.system.NativeType("GLFWwindow *") long r1) {
            return
    }

    public static void glfwWindowHint(int r5, int r6) {
            r0 = r5
            r1 = 131076(0x20004, float:1.83677E-40)
            if (r0 != r1) goto L15
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            org.lwjgl.glfw.GLFW.mGLFWWindowVisibleOnCreation = r0
            return
        L15:
            long r0 = org.lwjgl.glfw.GLFW.Functions.SetWindowHint
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokeV(r0, r1, r2)
            return
    }

    public static void glfwWindowHintString(int r1, @org.lwjgl.system.NativeType("const char *") java.nio.ByteBuffer r2) {
            return
    }

    public static void glfwWindowHintString(int r1, @org.lwjgl.system.NativeType("const char *") java.lang.CharSequence r2) {
            return
    }

    public static boolean glfwWindowShouldClose(long r3) {
            r0 = r3
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            boolean r0 = r0.shouldClose
            return r0
    }

    public static void glfwSetWindowShouldClose(long r3, boolean r5) {
            r0 = r3
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r1 = r5
            r0.shouldClose = r1
            return
    }

    public static void glfwSetWindowTitle(@org.lwjgl.system.NativeType("GLFWwindow *") long r1, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            return
    }

    public static void glfwSetWindowTitle(@org.lwjgl.system.NativeType("GLFWwindow *") long r3, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5) {
            r0 = r3
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            r1 = r5
            r0.title = r1
            return
    }

    public static void glfwSetWindowIcon(@org.lwjgl.system.NativeType("GLFWwindow *") long r1, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLFWimage const *") org.lwjgl.glfw.GLFWImage.Buffer r3) {
            return
    }

    public static void glfwPollEvents() {
            boolean r0 = org.lwjgl.glfw.GLFW.mGLFWIsInputReady
            if (r0 != 0) goto Lf
            r0 = 1
            org.lwjgl.glfw.GLFW.mGLFWIsInputReady = r0
            r0 = 1
            boolean r0 = org.lwjgl.glfw.CallbackBridge.nativeSetInputReady(r0)
        Lf:
            boolean r0 = org.lwjgl.glfw.GLFW.mGLFWInputPumping
            if (r0 == 0) goto L16
            return
        L16:
            r0 = 1
            org.lwjgl.glfw.GLFW.mGLFWInputPumping = r0
            long r0 = org.lwjgl.glfw.GLFW.Functions.StartPumping
            org.lwjgl.system.JNI.callV(r0)
            android.util.ArrayMap<java.lang.Long, org.lwjgl.glfw.GLFWWindowProperties> r0 = org.lwjgl.glfw.GLFW.mGLFWWindowMap
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L2c:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4c
            r0 = r5
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r6 = r0
            r0 = r6
            long r0 = r0.longValue()
            long r1 = org.lwjgl.glfw.GLFW.Functions.PumpEvents
            org.lwjgl.system.JNI.callJV(r0, r1)
            goto L2c
        L4c:
            long r0 = org.lwjgl.glfw.GLFW.Functions.StopPumping
            org.lwjgl.system.JNI.callV(r0)
            r0 = 0
            org.lwjgl.glfw.GLFW.mGLFWInputPumping = r0
            return
    }

    public static void internalWindowSizeChanged(long r5, int r7, int r8) {
            r0 = r7
            r1 = r8
            internalChangeMonitorSize(r0, r1)     // Catch: java.lang.Exception -> L12
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth     // Catch: java.lang.Exception -> L12
            int r2 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight     // Catch: java.lang.Exception -> L12
            glfwSetWindowSize(r0, r1, r2)     // Catch: java.lang.Exception -> L12
            goto L19
        L12:
            r9 = move-exception
            r0 = r9
            r0.printStackTrace()
        L19:
            return
    }

    public static void glfwWaitEvents() {
            return
    }

    public static void glfwWaitEventsTimeout(double r1) {
            return
    }

    public static void glfwPostEmptyEvent() {
            return
    }

    public static int glfwGetInputMode(@org.lwjgl.system.NativeType("GLFWwindow *") long r3, int r5) {
            r0 = r3
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.inputModes
            r1 = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    public static void glfwSetInputMode(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, int r6, int r7) {
            r0 = r6
            r1 = 208897(0x33001, float:2.92727E-40)
            if (r0 != r1) goto L27
            r0 = r7
            switch(r0) {
                case 212995: goto L1c;
                default: goto L23;
            }
        L1c:
            r0 = 1
            org.lwjgl.glfw.CallbackBridge.nativeSetGrabbing(r0)
            goto L27
        L23:
            r0 = 0
            org.lwjgl.glfw.CallbackBridge.nativeSetGrabbing(r0)
        L27:
            r0 = r4
            org.lwjgl.glfw.GLFWWindowProperties r0 = internalGetWindow(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.inputModes
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public static java.lang.String glfwGetKeyName(int r3, int r4) {
            java.util.Map<java.lang.Integer, java.lang.String> r0 = org.lwjgl.glfw.GLFW.mGLFWKeyCodes
            r1 = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static int glfwGetKeyScancode(int r2) {
            r0 = 0
            return r0
    }

    public static int glfwGetKey(@org.lwjgl.system.NativeType("GLFWwindow *") long r3, int r5) {
            r0 = r5
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 0
            return r0
        L7:
            r0 = r5
            r1 = 31
            int r0 = r0 - r1
            r6 = r0
            r0 = r6
            if (r0 < 0) goto L1a
            r0 = r6
            java.nio.ByteBuffer r1 = org.lwjgl.glfw.GLFW.keyDownBuffer
            int r1 = r1.capacity()
            if (r0 < r1) goto L1c
        L1a:
            r0 = 0
            return r0
        L1c:
            java.nio.ByteBuffer r0 = org.lwjgl.glfw.GLFW.keyDownBuffer
            r1 = r6
            byte r0 = r0.get(r1)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public static int glfwGetMouseButton(@org.lwjgl.system.NativeType("GLFWwindow *") long r3, int r5) {
            r0 = r5
            if (r0 < 0) goto La
            r0 = r5
            r1 = 7
            if (r0 <= r1) goto Lc
        La:
            r0 = 0
            return r0
        Lc:
            r0 = r5
            java.nio.ByteBuffer r1 = org.lwjgl.glfw.GLFW.mouseDownBuffer
            int r1 = r1.capacity()
            if (r0 < r1) goto L18
            r0 = 0
            return r0
        L18:
            java.nio.ByteBuffer r0 = org.lwjgl.glfw.GLFW.mouseDownBuffer
            r1 = r5
            byte r0 = r0.get(r1)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public static void glfwGetCursorPos(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") java.nio.DoubleBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") java.nio.DoubleBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r5
            r1 = r7
            r2 = r8
            nglfwGetCursorPos(r0, r1, r2)
            return
    }

    public static native void nglfwGetCursorPos(@org.lwjgl.system.NativeType("GLFWwindow *") long r0, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") java.nio.DoubleBuffer r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") java.nio.DoubleBuffer r3);

    public static native void nglfwGetCursorPosA(@org.lwjgl.system.NativeType("GLFWwindow *") long r0, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") double[] r2, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") double[] r3);

    public static native void glfwSetCursorPos(@org.lwjgl.system.NativeType("GLFWwindow *") long r0, double r2, double r4);

    public static long glfwCreateCursor(@org.lwjgl.system.NativeType("const GLFWimage *") org.lwjgl.glfw.GLFWImage r3, int r4, int r5) {
            r0 = 4
            return r0
    }

    public static long glfwCreateStandardCursor(int r3) {
            r0 = 4
            return r0
    }

    public static void glfwDestroyCursor(@org.lwjgl.system.NativeType("GLFWcursor *") long r1) {
            return
    }

    public static void glfwSetCursor(@org.lwjgl.system.NativeType("GLFWwindow *") long r1, @org.lwjgl.system.NativeType("GLFWcursor *") long r3) {
            return
    }

    public static boolean glfwRawMouseMotionSupported() {
            r0 = 0
            return r0
    }

    public static void glfwSetClipboardString(@org.lwjgl.system.NativeType("GLFWwindow *") long r3, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r0 = r5
            int r0 = r0.remaining()
            byte[] r0 = new byte[r0]
            r6 = r0
            r0 = r5
            r1 = r6
            java.nio.ByteBuffer r0 = r0.get(r1)
            r0 = 2000(0x7d0, float:2.803E-42)
            r1 = r6
            java.lang.String r0 = org.lwjgl.glfw.CallbackBridge.nativeClipboard(r0, r1)
            return
    }

    public static void glfwSetClipboardString(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r6) {
            r0 = r4
            r1 = r6
            java.nio.ByteBuffer r1 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r1)
            glfwSetClipboardString(r0, r1)
            return
    }

    public static java.lang.String glfwGetClipboardString(@org.lwjgl.system.NativeType("GLFWwindow *") long r3) {
            r0 = 2001(0x7d1, float:2.804E-42)
            r1 = 0
            java.lang.String r0 = org.lwjgl.glfw.CallbackBridge.nativeClipboard(r0, r1)
            return r0
    }

    public static void glfwRequestWindowAttention(@org.lwjgl.system.NativeType("GLFWwindow *") long r1) {
            return
    }

    public static boolean glfwJoystickPresent(int r2) {
            r0 = r2
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.String glfwGetJoystickName(int r2) {
            r0 = r2
            if (r0 != 0) goto L8
            java.lang.String r0 = "AIC event bus controller"
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.nio.FloatBuffer glfwGetJoystickAxes(int r2) {
            r0 = r2
            if (r0 != 0) goto L8
            java.nio.FloatBuffer r0 = org.lwjgl.glfw.GLFW.joystickData
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.nio.ByteBuffer glfwGetJoystickButtons(int r2) {
            r0 = r2
            if (r0 != 0) goto L8
            java.nio.ByteBuffer r0 = org.lwjgl.glfw.GLFW.buttonData
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.nio.ByteBuffer glfwGetjoystickHats(int r2) {
            r0 = 0
            return r0
    }

    public static boolean glfwJoystickIsGamepad(int r2) {
            r0 = r2
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.String glfwGetJoystickGUID(int r2) {
            r0 = r2
            if (r0 != 0) goto L8
            java.lang.String r0 = "aio0"
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static long glfwGetJoystickUserPointer(int r3) {
            r0 = 0
            return r0
    }

    public static void glfwSetJoystickUserPointer(int r1, long r2) {
            return
    }

    public static boolean glfwUpdateGamepadMappings(java.nio.ByteBuffer r2) {
            r0 = 0
            return r0
    }

    public static java.lang.String glfwGetGamepadName(int r2) {
            r0 = 0
            return r0
    }

    public static boolean glfwGetGamepadState(int r2, org.lwjgl.glfw.GLFWGamepadState r3) {
            r0 = 0
            return r0
    }

    public static void glfwGetVersion(@javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L15:
            r0 = r4
            r1 = 0
            r2 = 3
            r0[r1] = r2
            r0 = r5
            r1 = 0
            r2 = 4
            r0[r1] = r2
            r0 = r6
            r1 = 0
            r2 = 0
            r0[r1] = r2
            return
    }

    public static void glfwGetMonitorPos(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r6
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r7
            r1 = 0
            r2 = 0
            r0[r1] = r2
            return
    }

    public static void glfwGetMonitorWorkarea(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r6
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r7
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r8
            r1 = 0
            int r2 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            r0[r1] = r2
            r0 = r9
            r1 = 0
            int r2 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            r0[r1] = r2
            return
    }

    public static void glfwGetMonitorContentScale(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r6
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r0 = r7
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            return
    }

    public static void glfwGetMonitorContentScale(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r6
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            r0 = r7
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            java.nio.FloatBuffer r0 = r0.put(r1, r2)
            return
    }

    public static void glfwGetWindowPos(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r6
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r7
            r1 = 0
            r2 = 0
            r0[r1] = r2
            return
    }

    public static void glfwGetWindowSize(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r7
            r1 = 0
            r2 = r5
            org.lwjgl.glfw.GLFWWindowProperties r2 = internalGetWindow(r2)
            int r2 = r2.width
            r0[r1] = r2
            r0 = r8
            r1 = 0
            r2 = r5
            org.lwjgl.glfw.GLFWWindowProperties r2 = internalGetWindow(r2)
            int r2 = r2.height
            r0[r1] = r2
            return
    }

    public static void glfwGetFramebufferSize(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r7
            r1 = 0
            r2 = r5
            org.lwjgl.glfw.GLFWWindowProperties r2 = internalGetWindow(r2)
            int r2 = r2.width
            r0[r1] = r2
            r0 = r8
            r1 = 0
            r2 = r5
            org.lwjgl.glfw.GLFWWindowProperties r2 = internalGetWindow(r2)
            int r2 = r2.height
            r0[r1] = r2
            return
    }

    public static void glfwGetWindowFrameSize(@org.lwjgl.system.NativeType("GLFWwindow *") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r9
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = 0
            r5 = r4; r4 = r3; r3 = r2; r2 = r5; 
            r3[r4] = r5
            r0[r1] = r2
            r0 = r11
            r1 = 0
            r2 = r7
            org.lwjgl.glfw.GLFWWindowProperties r2 = internalGetWindow(r2)
            int r2 = r2.width
            r0[r1] = r2
            r0 = r12
            r1 = 0
            r2 = r7
            org.lwjgl.glfw.GLFWWindowProperties r2 = internalGetWindow(r2)
            int r2 = r2.height
            r0[r1] = r2
            return
    }

    public static void glfwGetWindowContentScale(@org.lwjgl.system.NativeType("GLFWwindow *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("float *") float[] r7) {
            r0 = r6
            if (r0 == 0) goto L10
            r0 = r7
            if (r0 == 0) goto L10
            r0 = r6
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r0 = r7
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
        L10:
            return
    }

    public static void glfwGetCursorPos(@org.lwjgl.system.NativeType("GLFWwindow *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") double[] r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("double *") double[] r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r5
            r1 = r7
            r2 = r8
            nglfwGetCursorPosA(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("int")
    public static boolean glfwExtensionSupported(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r3) {
            r0 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r0 = org.lwjgl.opengl.GL20.glGetString(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L17
            r0 = r4
            r1 = r3
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public static void glfwGetMonitorPhysicalSize(@org.lwjgl.system.NativeType("GLFWmonitor *") long r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r6) {
            r0 = r5
            if (r0 == 0) goto L18
            r0 = r6
            if (r0 == 0) goto L18
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r6
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            java.nio.IntBuffer r0 = r0.put(r1)
        L18:
            return
    }

    public static void glfwGetMonitorPhysicalSize(@org.lwjgl.system.NativeType("GLFWmonitor *") long r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r7) {
            r0 = r6
            if (r0 == 0) goto L14
            r0 = r7
            if (r0 == 0) goto L14
            r0 = r6
            r1 = 0
            int r2 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            r0[r1] = r2
            r0 = r7
            r1 = 0
            int r2 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            r0[r1] = r2
        L14:
            return
    }

    public static void glfwMaximizeWindow(@org.lwjgl.system.NativeType("GLFWwindow *") long r1) {
            return
    }

    public static void glfwRestoreWindow(@org.lwjgl.system.NativeType("GLFWwindow *") long r1) {
            return
    }

    public static void glfwInitVulkanLoader(@javax.annotation.Nullable org.lwjgl.PointerBuffer r3) {
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            int r0 = r0.remaining()
            if (r0 <= 0) goto L16
            r0 = r3
            r1 = r3
            int r1 = r1.position()
            long r0 = r0.get(r1)
            org.lwjgl.glfw.GLFW.glfwVulkanLoaderHandle = r0
        L16:
            return
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const **")
    public static org.lwjgl.PointerBuffer glfwGetRequiredInstanceExtensions() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r3 = r0
            r0 = r3
            r1 = 2
            org.lwjgl.PointerBuffer r0 = r0.mallocPointer(r1)
            r4 = r0
            r0 = r4
            java.lang.String r1 = "VK_KHR_surface"
            java.nio.ByteBuffer r1 = org.lwjgl.system.MemoryUtil.memUTF8(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            java.lang.String r1 = "VK_KHR_android_surface"
            java.nio.ByteBuffer r1 = org.lwjgl.system.MemoryUtil.memUTF8(r1)
            org.lwjgl.PointerBuffer r0 = r0.put(r1)
            r0 = r4
            org.lwjgl.system.CustomBuffer r0 = r0.flip()
            r0 = r4
            return r0
    }

    public static boolean glfwVulkanSupported() {
            r0 = 1
            return r0
    }

    static {
            r0 = 1
            org.lwjgl.glfw.GLFW.mGLFWWindowVisibleOnCreation = r0
            r0 = 8
            java.nio.FloatBuffer r0 = flippedFloatBuffer(r0)
            org.lwjgl.glfw.GLFW.joystickData = r0
            r0 = 8
            java.nio.ByteBuffer r0 = flippedByteBuffer(r0)
            org.lwjgl.glfw.GLFW.buttonData = r0
            r0 = 318(0x13e, float:4.46E-43)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            org.lwjgl.glfw.GLFW.keyDownBuffer = r0
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            org.lwjgl.glfw.GLFW.mouseDownBuffer = r0
            r0 = 0
            org.lwjgl.glfw.GLFW.mainContext = r0
            java.lang.String r0 = "glfwstub.windowWidth"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r7 = r0
            java.lang.String r0 = "glfwstub.windowHeight"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L3f
            r0 = r8
            if (r0 != 0) goto L57
        L3f:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Warning: Property glfwstub.windowWidth or glfwstub.windowHeight not set, defaulting to 1280 and 720"
            r0.println(r1)
            r0 = 1280(0x500, float:1.794E-42)
            org.lwjgl.glfw.GLFW.mGLFWWindowWidth = r0
            r0 = 720(0x2d0, float:1.009E-42)
            org.lwjgl.glfw.GLFW.mGLFWWindowHeight = r0
            goto L65
        L57:
            r0 = r7
            int r0 = java.lang.Integer.parseInt(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowWidth = r0
            r0 = r8
            int r0 = java.lang.Integer.parseInt(r0)
            org.lwjgl.glfw.GLFW.mGLFWWindowHeight = r0
        L65:
            java.lang.String r0 = "pojavexec"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L6e
            goto L73
        L6e:
            r9 = move-exception
            r0 = r9
            r0.printStackTrace()
        L73:
            org.lwjgl.glfw.GLFWErrorCallback r0 = org.lwjgl.glfw.GLFWErrorCallback.createPrint()
            org.lwjgl.glfw.GLFW.mGLFWErrorCallback = r0
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r1 = r0
            r1.<init>()
            org.lwjgl.glfw.GLFW.mGLFWKeyCodes = r0
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r1 = r0
            r1.<init>()
            org.lwjgl.glfw.GLFW.mGLFWWindowMap = r0
            org.lwjgl.glfw.GLFWVidMode r0 = new org.lwjgl.glfw.GLFWVidMode
            r1 = r0
            int r2 = org.lwjgl.glfw.GLFWVidMode.SIZEOF
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            r1.<init>(r2)
            org.lwjgl.glfw.GLFW.mGLFWVideoMode = r0
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowWidth
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.HEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r1 = org.lwjgl.glfw.GLFW.mGLFWWindowHeight
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.REDBITS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.GREENBITS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.BLUEBITS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            long r0 = r0.address()
            org.lwjgl.glfw.GLFWVidMode r1 = org.lwjgl.glfw.GLFW.mGLFWVideoMode
            int r1 = org.lwjgl.glfw.GLFWVidMode.REFRESHRATE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 60
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            java.lang.Class<org.lwjgl.glfw.GLFW> r0 = org.lwjgl.glfw.GLFW.class
            java.lang.reflect.Field[] r0 = r0.getFields()
            r9 = r0
            r0 = r9
            r10 = r0
            r0 = r10
            int r0 = r0.length     // Catch: java.lang.IllegalAccessException -> L197
            r11 = r0
            r0 = 0
            r12 = r0
        L126:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L194
            r0 = r10
            r1 = r12
            r0 = r0[r1]     // Catch: java.lang.IllegalAccessException -> L197
            r13 = r0
            r0 = r13
            java.lang.String r0 = r0.getName()     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.String r1 = "GLFW_KEY_"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.IllegalAccessException -> L197
            if (r0 == 0) goto L18e
            java.util.Map<java.lang.Integer, java.lang.String> r0 = org.lwjgl.glfw.GLFW.mGLFWKeyCodes     // Catch: java.lang.IllegalAccessException -> L197
            r1 = r13
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.IllegalAccessException -> L197
            int r1 = r1.intValue()     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L197
            r3 = r2
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L197
            r3 = r13
            java.lang.String r3 = r3.getName()     // Catch: java.lang.IllegalAccessException -> L197
            r4 = 9
            r5 = 10
            java.lang.String r3 = r3.substring(r4, r5)     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.String r3 = r3.toUpperCase()     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> L197
            r3 = r13
            java.lang.String r3 = r3.getName()     // Catch: java.lang.IllegalAccessException -> L197
            r4 = 10
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.String r4 = "_"
            java.lang.String r5 = " "
            java.lang.String r3 = r3.replace(r4, r5)     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalAccessException -> L197
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.IllegalAccessException -> L197
        L18e:
            int r12 = r12 + 1
            goto L126
        L194:
            goto L198
        L197:
            r10 = move-exception
        L198:
            java.lang.Class<org.lwjgl.glfw.GLFW> r0 = org.lwjgl.glfw.GLFW.class
            java.lang.String r1 = "org.lwjgl.glfw"
            java.lang.String r2 = "libpojavexec.so"
            r3 = 1
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            org.lwjgl.glfw.GLFW.GLFW = r0
            return
    }
}
