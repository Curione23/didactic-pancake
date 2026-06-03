package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/User32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/User32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/User32.class */
public class User32 {
    private static final org.lwjgl.system.SharedLibrary USER32 = null;
    public static final int WS_OVERLAPPED = 0;
    public static final int WS_POPUP = Integer.MIN_VALUE;
    public static final int WS_CHILD = 1073741824;
    public static final int WS_MINIMIZE = 536870912;
    public static final int WS_VISIBLE = 268435456;
    public static final int WS_DISABLED = 134217728;
    public static final int WS_CLIPSIBLINGS = 67108864;
    public static final int WS_CLIPCHILDREN = 33554432;
    public static final int WS_MAXIMIZE = 16777216;
    public static final int WS_CAPTION = 12582912;
    public static final int WS_BORDER = 8388608;
    public static final int WS_DLGFRAME = 4194304;
    public static final int WS_VSCROLL = 2097152;
    public static final int WS_HSCROLL = 1048576;
    public static final int WS_SYSMENU = 524288;
    public static final int WS_THICKFRAME = 262144;
    public static final int WS_GROUP = 131072;
    public static final int WS_TABSTOP = 65536;
    public static final int WS_MINIMIZEBOX = 131072;
    public static final int WS_MAXIMIZEBOX = 65536;
    public static final int WS_OVERLAPPEDWINDOW = 13565952;
    public static final int WS_POPUPWINDOW = -2138570752;
    public static final int WS_CHILDWINDOW = 1073741824;
    public static final int WS_TILED = 0;
    public static final int WS_ICONIC = 536870912;
    public static final int WS_SIZEBOX = 262144;
    public static final int WS_TILEDWINDOW = 13565952;
    public static final int WS_EX_DLGMODALFRAME = 1;
    public static final int WS_EX_NOPARENTNOTIFY = 4;
    public static final int WS_EX_TOPMOST = 8;
    public static final int WS_EX_ACCEPTFILES = 16;
    public static final int WS_EX_TRANSPARENT = 32;
    public static final int WS_EX_MDICHILD = 64;
    public static final int WS_EX_TOOLWINDOW = 128;
    public static final int WS_EX_WINDOWEDGE = 256;
    public static final int WS_EX_CLIENTEDGE = 512;
    public static final int WS_EX_CONTEXTHELP = 1024;
    public static final int WS_EX_RIGHT = 4096;
    public static final int WS_EX_LEFT = 0;
    public static final int WS_EX_RTLREADING = 8192;
    public static final int WS_EX_LTRREADING = 0;
    public static final int WS_EX_LEFTSCROLLBAR = 16384;
    public static final int WS_EX_RIGHTSCROLLBAR = 0;
    public static final int WS_EX_CONTROLPARENT = 65536;
    public static final int WS_EX_STATICEDGE = 131072;
    public static final int WS_EX_APPWINDOW = 262144;
    public static final int WS_EX_OVERLAPPEDWINDOW = 768;
    public static final int WS_EX_PALETTEWINDOW = 392;
    public static final int WS_EX_LAYERED = 524288;
    public static final int WS_EX_NOINHERITLAYOUT = 1048576;
    public static final int WS_EX_LAYOUTRTL = 4194304;
    public static final int WS_EX_COMPOSITED = 33554432;
    public static final int WS_EX_NOACTIVATE = 134217728;
    public static final int CW_USEDEFAULT = Integer.MIN_VALUE;
    public static final int CS_VREDRAW = 1;
    public static final int CS_HREDRAW = 2;
    public static final int CS_DBLCLKS = 8;
    public static final int CS_OWNDC = 32;
    public static final int CS_CLASSDC = 64;
    public static final int CS_PARENTDC = 128;
    public static final int CS_NOCLOSE = 512;
    public static final int CS_SAVEBITS = 2048;
    public static final int CS_BYTEALIGNCLIENT = 4096;
    public static final int CS_BYTEALIGNWINDOW = 8192;
    public static final int CS_GLOBALCLASS = 16384;
    public static final int CS_IME = 65536;
    public static final int CS_DROPSHADOW = 131072;
    public static final int WM_NULL = 0;
    public static final int WM_CREATE = 1;
    public static final int WM_DESTROY = 2;
    public static final int WM_MOVE = 3;
    public static final int WM_SIZE = 5;
    public static final int WM_ACTIVATE = 6;
    public static final int WM_SETFOCUS = 7;
    public static final int WM_KILLFOCUS = 8;
    public static final int WM_ENABLE = 10;
    public static final int WM_SETREDRAW = 11;
    public static final int WM_SETTEXT = 12;
    public static final int WM_GETTEXT = 13;
    public static final int WM_GETTEXTLENGTH = 14;
    public static final int WM_PAINT = 15;
    public static final int WM_CLOSE = 16;
    public static final int WM_QUERYENDSESSION = 17;
    public static final int WM_QUERYOPEN = 19;
    public static final int WM_ENDSESSION = 22;
    public static final int WM_QUIT = 18;
    public static final int WM_ERASEBKGND = 20;
    public static final int WM_SYSCOLORCHANGE = 21;
    public static final int WM_SHOWWINDOW = 24;
    public static final int WM_WININICHANGE = 26;
    public static final int WM_SETTINGCHANGE = 26;
    public static final int WM_DEVMODECHANGE = 27;
    public static final int WM_ACTIVATEAPP = 28;
    public static final int WM_FONTCHANGE = 29;
    public static final int WM_TIMECHANGE = 30;
    public static final int WM_CANCELMODE = 31;
    public static final int WM_SETCURSOR = 32;
    public static final int WM_MOUSEACTIVATE = 33;
    public static final int WM_CHILDACTIVATE = 34;
    public static final int WM_QUEUESYNC = 35;
    public static final int WM_GETMINMAXINFO = 36;
    public static final int WM_PAINTICON = 38;
    public static final int WM_ICONERASEBKGND = 39;
    public static final int WM_NEXTDLGCTL = 40;
    public static final int WM_SPOOLERSTATUS = 42;
    public static final int WM_DRAWITEM = 43;
    public static final int WM_MEASUREITEM = 44;
    public static final int WM_DELETEITEM = 45;
    public static final int WM_VKEYTOITEM = 46;
    public static final int WM_CHARTOITEM = 47;
    public static final int WM_SETFONT = 48;
    public static final int WM_GETFONT = 49;
    public static final int WM_SETHOTKEY = 50;
    public static final int WM_GETHOTKEY = 51;
    public static final int WM_QUERYDRAGICON = 55;
    public static final int WM_COMPAREITEM = 57;
    public static final int WM_GETOBJECT = 61;
    public static final int WM_COMPACTING = 65;
    public static final int WM_COMMNOTIFY = 68;
    public static final int WM_WINDOWPOSCHANGING = 70;
    public static final int WM_WINDOWPOSCHANGED = 71;
    public static final int WM_POWER = 72;
    public static final int WM_COPYDATA = 74;
    public static final int WM_CANCELJOURNAL = 75;
    public static final int WM_NOTIFY = 78;
    public static final int WM_INPUTLANGCHANGEREQUEST = 80;
    public static final int WM_INPUTLANGCHANGE = 81;
    public static final int WM_TCARD = 82;
    public static final int WM_HELP = 83;
    public static final int WM_USERCHANGED = 84;
    public static final int WM_NOTIFYFORMAT = 85;
    public static final int WM_CONTEXTMENU = 123;
    public static final int WM_STYLECHANGING = 124;
    public static final int WM_STYLECHANGED = 125;
    public static final int WM_DISPLAYCHANGE = 126;
    public static final int WM_GETICON = 127;
    public static final int WM_SETICON = 128;
    public static final int WM_NCCREATE = 129;
    public static final int WM_NCDESTROY = 130;
    public static final int WM_NCCALCSIZE = 131;
    public static final int WM_NCHITTEST = 132;
    public static final int WM_NCPAINT = 133;
    public static final int WM_NCACTIVATE = 134;
    public static final int WM_GETDLGCODE = 135;
    public static final int WM_SYNCPAINT = 136;
    public static final int WM_NCMOUSEMOVE = 160;
    public static final int WM_NCLBUTTONDOWN = 161;
    public static final int WM_NCLBUTTONUP = 162;
    public static final int WM_NCLBUTTONDBLCLK = 163;
    public static final int WM_NCRBUTTONDOWN = 164;
    public static final int WM_NCRBUTTONUP = 165;
    public static final int WM_NCRBUTTONDBLCLK = 166;
    public static final int WM_NCMBUTTONDOWN = 167;
    public static final int WM_NCMBUTTONUP = 168;
    public static final int WM_NCMBUTTONDBLCLK = 169;
    public static final int WM_NCXBUTTONDOWN = 171;
    public static final int WM_NCXBUTTONUP = 172;
    public static final int WM_NCXBUTTONDBLCLK = 173;
    public static final int WM_INPUT_DEVICE_CHANGE = 254;
    public static final int WM_INPUT = 255;
    public static final int WM_KEYFIRST = 256;
    public static final int WM_KEYDOWN = 256;
    public static final int WM_KEYUP = 257;
    public static final int WM_CHAR = 258;
    public static final int WM_DEADCHAR = 259;
    public static final int WM_SYSKEYDOWN = 260;
    public static final int WM_SYSKEYUP = 261;
    public static final int WM_SYSCHAR = 262;
    public static final int WM_SYSDEADCHAR = 263;
    public static final int WM_UNICHAR = 265;
    public static final int UNICODE_NOCHAR = 65535;
    public static final int WM_IME_STARTCOMPOSITION = 269;
    public static final int WM_IME_ENDCOMPOSITION = 270;
    public static final int WM_IME_COMPOSITION = 271;
    public static final int WM_IME_KEYLAST = 271;
    public static final int WM_INITDIALOG = 272;
    public static final int WM_COMMAND = 273;
    public static final int WM_SYSCOMMAND = 274;
    public static final int WM_TIMER = 275;
    public static final int WM_HSCROLL = 276;
    public static final int WM_VSCROLL = 277;
    public static final int WM_INITMENU = 278;
    public static final int WM_INITMENUPOPUP = 279;
    public static final int WM_GESTURE = 281;
    public static final int WM_GESTURENOTIFY = 282;
    public static final int WM_MENUSELECT = 287;
    public static final int WM_MENUCHAR = 288;
    public static final int WM_ENTERIDLE = 289;
    public static final int WM_MENURBUTTONUP = 290;
    public static final int WM_MENUDRAG = 291;
    public static final int WM_MENUGETOBJECT = 292;
    public static final int WM_UNINITMENUPOPUP = 293;
    public static final int WM_MENUCOMMAND = 294;
    public static final int WM_CHANGEUISTATE = 295;
    public static final int WM_UPDATEUISTATE = 296;
    public static final int WM_QUERYUISTATE = 297;
    public static final int WM_CTLCOLORMSGBOX = 306;
    public static final int WM_CTLCOLOREDIT = 307;
    public static final int WM_CTLCOLORLISTBOX = 308;
    public static final int WM_CTLCOLORBTN = 309;
    public static final int WM_CTLCOLORDLG = 310;
    public static final int WM_CTLCOLORSCROLLBAR = 311;
    public static final int WM_CTLCOLORSTATIC = 312;
    public static final int MN_GETHMENU = 481;
    public static final int WM_MOUSEFIRST = 512;
    public static final int WM_MOUSEMOVE = 512;
    public static final int WM_LBUTTONDOWN = 513;
    public static final int WM_LBUTTONUP = 514;
    public static final int WM_LBUTTONDBLCLK = 515;
    public static final int WM_RBUTTONDOWN = 516;
    public static final int WM_RBUTTONUP = 517;
    public static final int WM_RBUTTONDBLCLK = 518;
    public static final int WM_MBUTTONDOWN = 519;
    public static final int WM_MBUTTONUP = 520;
    public static final int WM_MBUTTONDBLCLK = 521;
    public static final int WM_MOUSEWHEEL = 522;
    public static final int WM_XBUTTONDOWN = 523;
    public static final int WM_XBUTTONUP = 524;
    public static final int WM_XBUTTONDBLCLK = 525;
    public static final int WM_MOUSEHWHEEL = 526;
    public static final int WM_PARENTNOTIFY = 528;
    public static final int WM_ENTERMENULOOP = 529;
    public static final int WM_EXITMENULOOP = 530;
    public static final int WM_NEXTMENU = 531;
    public static final int WM_SIZING = 532;
    public static final int WM_CAPTURECHANGED = 533;
    public static final int WM_MOVING = 534;
    public static final int WM_POWERBROADCAST = 536;
    public static final int WM_DEVICECHANGE = 537;
    public static final int WM_MDICREATE = 544;
    public static final int WM_MDIDESTROY = 545;
    public static final int WM_MDIACTIVATE = 546;
    public static final int WM_MDIRESTORE = 547;
    public static final int WM_MDINEXT = 548;
    public static final int WM_MDIMAXIMIZE = 549;
    public static final int WM_MDITILE = 550;
    public static final int WM_MDICASCADE = 551;
    public static final int WM_MDIICONARRANGE = 552;
    public static final int WM_MDIGETACTIVE = 553;
    public static final int WM_MDISETMENU = 560;
    public static final int WM_ENTERSIZEMOVE = 561;
    public static final int WM_EXITSIZEMOVE = 562;
    public static final int WM_DROPFILES = 563;
    public static final int WM_MDIREFRESHMENU = 564;
    public static final int WM_TOUCH = 576;
    public static final int WM_IME_SETCONTEXT = 641;
    public static final int WM_IME_NOTIFY = 642;
    public static final int WM_IME_CONTROL = 643;
    public static final int WM_IME_COMPOSITIONFULL = 644;
    public static final int WM_IME_SELECT = 645;
    public static final int WM_IME_CHAR = 646;
    public static final int WM_IME_REQUEST = 648;
    public static final int WM_IME_KEYDOWN = 656;
    public static final int WM_IME_KEYUP = 657;
    public static final int WM_MOUSEHOVER = 673;
    public static final int WM_MOUSELEAVE = 675;
    public static final int WM_NCMOUSEHOVER = 672;
    public static final int WM_NCMOUSELEAVE = 674;
    public static final int WM_WTSSESSION_CHANGE = 689;
    public static final int WM_TABLET_FIRST = 704;
    public static final int WM_TABLET_LAST = 735;
    public static final int WM_CUT = 768;
    public static final int WM_COPY = 769;
    public static final int WM_PASTE = 770;
    public static final int WM_CLEAR = 771;
    public static final int WM_UNDO = 772;
    public static final int WM_RENDERFORMAT = 773;
    public static final int WM_RENDERALLFORMATS = 774;
    public static final int WM_DESTROYCLIPBOARD = 775;
    public static final int WM_DRAWCLIPBOARD = 776;
    public static final int WM_PAINTCLIPBOARD = 777;
    public static final int WM_VSCROLLCLIPBOARD = 778;
    public static final int WM_SIZECLIPBOARD = 779;
    public static final int WM_ASKCBFORMATNAME = 780;
    public static final int WM_CHANGECBCHAIN = 781;
    public static final int WM_HSCROLLCLIPBOARD = 782;
    public static final int WM_QUERYNEWPALETTE = 783;
    public static final int WM_PALETTEISCHANGING = 784;
    public static final int WM_PALETTECHANGED = 785;
    public static final int WM_HOTKEY = 786;
    public static final int WM_PRINT = 791;
    public static final int WM_PRINTCLIENT = 792;
    public static final int WM_APPCOMMAND = 793;
    public static final int WM_THEMECHANGED = 794;
    public static final int WM_CLIPBOARDUPDATE = 797;
    public static final int WM_DWMCOMPOSITIONCHANGED = 798;
    public static final int WM_DWMNCRENDERINGCHANGED = 799;
    public static final int WM_DWMCOLORIZATIONCOLORCHANGED = 800;
    public static final int WM_DWMWINDOWMAXIMIZEDCHANGE = 801;
    public static final int WM_DWMSENDICONICTHUMBNAIL = 803;
    public static final int WM_DWMSENDICONICLIVEPREVIEWBITMAP = 806;
    public static final int WM_GETTITLEBARINFOEX = 831;
    public static final int WM_HANDHELDFIRST = 856;
    public static final int WM_HANDHELDLAST = 863;
    public static final int WM_AFXFIRST = 864;
    public static final int WM_AFXLAST = 895;
    public static final int WM_PENWINFIRST = 896;
    public static final int WM_PENWINLAST = 911;
    public static final int WM_APP = 32768;
    public static final int WM_USER = 1024;
    public static final int WA_ACTIVE = 1;
    public static final int WA_CLICKACTIVE = 2;
    public static final int WA_INACTIVE = 0;
    public static final int SIZE_RESTORED = 0;
    public static final int SIZE_MINIMIZED = 1;
    public static final int SIZE_MAXIMIZED = 2;
    public static final int SIZE_MAXSHOW = 3;
    public static final int SIZE_MAXHIDE = 4;
    public static final int DBT_APPYBEGIN = 0;
    public static final int DBT_APPYEND = 1;
    public static final int DBT_DEVNODES_CHANGED = 7;
    public static final int DBT_QUERYCHANGECONFIG = 23;
    public static final int DBT_CONFIGCHANGED = 24;
    public static final int DBT_CONFIGCHANGECANCELED = 25;
    public static final int DBT_MONITORCHANGE = 27;
    public static final int SC_SIZE = 61440;
    public static final int SC_MOVE = 61456;
    public static final int SC_MINIMIZE = 61472;
    public static final int SC_MAXIMIZE = 61488;
    public static final int SC_NEXTWINDOW = 61504;
    public static final int SC_PREVWINDOW = 61520;
    public static final int SC_CLOSE = 61536;
    public static final int SC_VSCROLL = 61552;
    public static final int SC_HSCROLL = 61568;
    public static final int SC_MOUSEMENU = 61584;
    public static final int SC_KEYMENU = 61696;
    public static final int SC_ARRANGE = 61712;
    public static final int SC_RESTORE = 61728;
    public static final int SC_TASKLIST = 61744;
    public static final int SC_SCREENSAVE = 61760;
    public static final int SC_HOTKEY = 61776;
    public static final int SC_DEFAULT = 61792;
    public static final int SC_MONITORPOWER = 61808;
    public static final int SC_CONTEXTHELP = 61824;
    public static final int SC_SEPARATOR = 61455;
    public static final int MK_LBUTTON = 1;
    public static final int MK_RBUTTON = 2;
    public static final int MK_SHIFT = 4;
    public static final int MK_CONTROL = 8;
    public static final int MK_MBUTTON = 16;
    public static final int MK_XBUTTON1 = 32;
    public static final int MK_XBUTTON2 = 64;
    public static final int HTERROR = -2;
    public static final int HTTRANSPARENT = -1;
    public static final int HTNOWHERE = 0;
    public static final int HTCLIENT = 1;
    public static final int HTCAPTION = 2;
    public static final int HTSYSMENU = 3;
    public static final int HTGROWBOX = 4;
    public static final int HTSIZE = 4;
    public static final int HTMENU = 5;
    public static final int HTHSCROLL = 6;
    public static final int HTVSCROLL = 7;
    public static final int HTMINBUTTON = 8;
    public static final int HTMAXBUTTON = 9;
    public static final int HTLEFT = 10;
    public static final int HTRIGHT = 11;
    public static final int HTTOP = 12;
    public static final int HTTOPLEFT = 13;
    public static final int HTTOPRIGHT = 14;
    public static final int HTBOTTOM = 15;
    public static final int HTBOTTOMLEFT = 16;
    public static final int HTBOTTOMRIGHT = 17;
    public static final int HTBORDER = 18;
    public static final int HTREDUCE = 8;
    public static final int HTZOOM = 9;
    public static final int HTSIZEFIRST = 10;
    public static final int HTSIZELAST = 17;
    public static final int HTOBJECT = 19;
    public static final int HTCLOSE = 20;
    public static final int HTHELP = 21;
    public static final int GWL_WNDPROC = -4;
    public static final int GWL_HINSTANCE = -6;
    public static final int GWL_HWNDPARENT = -8;
    public static final int GWL_STYLE = -16;
    public static final int GWL_EXSTYLE = -20;
    public static final int GWL_USERDATA = -21;
    public static final int GWL_ID = -12;
    public static final int SW_HIDE = 0;
    public static final int SW_SHOWNORMAL = 1;
    public static final int SW_NORMAL = 1;
    public static final int SW_SHOWMINIMIZED = 2;
    public static final int SW_SHOWMAXIMIZED = 3;
    public static final int SW_MAXIMIZE = 3;
    public static final int SW_SHOWNOACTIVATE = 4;
    public static final int SW_SHOW = 5;
    public static final int SW_MINIMIZE = 6;
    public static final int SW_SHOWMINNOACTIVE = 7;
    public static final int SW_SHOWNA = 8;
    public static final int SW_RESTORE = 9;
    public static final int SW_SHOWDEFAULT = 10;
    public static final int SW_FORCEMINIMIZE = 11;
    public static final int SW_MAX = 11;
    public static final long HWND_TOP = 0;
    public static final long HWND_BOTTOM = 1;
    public static final long HWND_TOPMOST = -1;
    public static final long HWND_NOTOPMOST = -2;
    public static final long HWND_BROADCAST = 65535;
    public static final int SWP_NOSIZE = 1;
    public static final int SWP_NOMOVE = 2;
    public static final int SWP_NOZORDER = 4;
    public static final int SWP_NOREDRAW = 8;
    public static final int SWP_NOACTIVATE = 16;
    public static final int SWP_FRAMECHANGED = 32;
    public static final int SWP_SHOWWINDOW = 64;
    public static final int SWP_HIDEWINDOW = 128;
    public static final int SWP_NOCOPYBITS = 256;
    public static final int SWP_NOOWNERZORDER = 512;
    public static final int SWP_NOSENDCHANGING = 1024;
    public static final int SWP_DRAWFRAME = 32;
    public static final int SWP_NOREPOSITION = 512;
    public static final int SWP_DEFERERASE = 8192;
    public static final int SWP_ASYNCWINDOWPOS = 16384;
    public static final int IDI_APPLICATION = 32512;
    public static final int IDI_HAND = 32513;
    public static final int IDI_QUESTION = 32514;
    public static final int IDI_EXCLAMATION = 32515;
    public static final int IDI_ASTERISK = 32516;
    public static final int IDI_WINLOGO = 32517;
    public static final int IDI_SHIELD = 32518;
    public static final int IDI_WARNING = 32515;
    public static final int IDI_ERROR = 32513;
    public static final int IDI_INFORMATION = 32516;
    public static final int IDC_ARROW = 32512;
    public static final int IDC_IBEAM = 32513;
    public static final int IDC_WAIT = 32514;
    public static final int IDC_CROSS = 32515;
    public static final int IDC_UPARROW = 32516;
    public static final int IDC_SIZE = 32640;
    public static final int IDC_ICON = 32641;
    public static final int IDC_SIZENWSE = 32642;
    public static final int IDC_SIZENESW = 32643;
    public static final int IDC_SIZEWE = 32644;
    public static final int IDC_SIZENS = 32645;
    public static final int IDC_SIZEALL = 32646;
    public static final int IDC_NO = 32648;
    public static final int IDC_HAND = 32649;
    public static final int IDC_APPSTARTING = 32650;
    public static final int IDC_HELP = 32651;
    public static final int GCL_MENUNAME = -8;
    public static final int GCL_HBRBACKGROUND = -10;
    public static final int GCL_HCURSOR = -12;
    public static final int GCL_HICON = -14;
    public static final int GCL_HMODULE = -16;
    public static final int GCL_CBWNDEXTRA = -18;
    public static final int GCL_CBCLSEXTRA = -20;
    public static final int GCL_WNDPROC = -24;
    public static final int GCL_STYLE = -26;
    public static final int GCW_ATOM = -32;
    public static final int GCL_HICONSM = -34;
    public static final int QS_KEY = 1;
    public static final int QS_MOUSEMOVE = 2;
    public static final int QS_MOUSEBUTTON = 4;
    public static final int QS_POSTMESSAGE = 8;
    public static final int QS_TIMER = 16;
    public static final int QS_PAINT = 32;
    public static final int QS_SENDMESSAGE = 64;
    public static final int QS_HOTKEY = 128;
    public static final int QS_ALLPOSTMESSAGE = 256;
    public static final int QS_RAWINPUT = 1024;
    public static final int QS_MOUSE = 6;
    public static final int QS_INPUT = 7;
    public static final int QS_ALLEVENTS = 191;
    public static final int QS_ALLINPUT = 255;
    public static final int PM_NOREMOVE = 0;
    public static final int PM_REMOVE = 1;
    public static final int PM_NOYIELD = 2;
    public static final int PM_QS_INPUT = 458752;
    public static final int PM_QS_POSTMESSAGE = 9961472;
    public static final int PM_QS_PAINT = 2097152;
    public static final int PM_QS_SENDMESSAGE = 4194304;
    public static final int VK_LBUTTON = 1;
    public static final int VK_RBUTTON = 2;
    public static final int VK_CANCEL = 3;
    public static final int VK_MBUTTON = 4;
    public static final int VK_XBUTTON1 = 5;
    public static final int VK_XBUTTON2 = 6;
    public static final int VK_BACK = 8;
    public static final int VK_TAB = 9;
    public static final int VK_CLEAR = 12;
    public static final int VK_RETURN = 13;
    public static final int VK_SHIFT = 16;
    public static final int VK_CONTROL = 17;
    public static final int VK_MENU = 18;
    public static final int VK_PAUSE = 19;
    public static final int VK_CAPITAL = 20;
    public static final int VK_KANA = 21;
    public static final int VK_HANGEUL = 21;
    public static final int VK_HANGUL = 21;
    public static final int VK_JUNJA = 23;
    public static final int VK_FINAL = 24;
    public static final int VK_HANJA = 25;
    public static final int VK_KANJI = 25;
    public static final int VK_ESCAPE = 27;
    public static final int VK_CONVERT = 28;
    public static final int VK_NONCONVERT = 29;
    public static final int VK_ACCEPT = 30;
    public static final int VK_MODECHANGE = 31;
    public static final int VK_SPACE = 32;
    public static final int VK_PRIOR = 33;
    public static final int VK_NEXT = 34;
    public static final int VK_END = 35;
    public static final int VK_HOME = 36;
    public static final int VK_LEFT = 37;
    public static final int VK_UP = 38;
    public static final int VK_RIGHT = 39;
    public static final int VK_DOWN = 40;
    public static final int VK_SELECT = 41;
    public static final int VK_PRINT = 42;
    public static final int VK_EXECUTE = 43;
    public static final int VK_SNAPSHOT = 44;
    public static final int VK_INSERT = 45;
    public static final int VK_DELETE = 46;
    public static final int VK_HELP = 47;
    public static final int VK_LWIN = 91;
    public static final int VK_RWIN = 92;
    public static final int VK_APPS = 93;
    public static final int VK_SLEEP = 95;
    public static final int VK_NUMPAD0 = 96;
    public static final int VK_NUMPAD1 = 97;
    public static final int VK_NUMPAD2 = 98;
    public static final int VK_NUMPAD3 = 99;
    public static final int VK_NUMPAD4 = 100;
    public static final int VK_NUMPAD5 = 101;
    public static final int VK_NUMPAD6 = 102;
    public static final int VK_NUMPAD7 = 103;
    public static final int VK_NUMPAD8 = 104;
    public static final int VK_NUMPAD9 = 105;
    public static final int VK_MULTIPLY = 106;
    public static final int VK_ADD = 107;
    public static final int VK_SEPARATOR = 108;
    public static final int VK_SUBTRACT = 109;
    public static final int VK_DECIMAL = 110;
    public static final int VK_DIVIDE = 111;
    public static final int VK_F1 = 112;
    public static final int VK_F2 = 113;
    public static final int VK_F3 = 114;
    public static final int VK_F4 = 115;
    public static final int VK_F5 = 116;
    public static final int VK_F6 = 117;
    public static final int VK_F7 = 118;
    public static final int VK_F8 = 119;
    public static final int VK_F9 = 120;
    public static final int VK_F10 = 121;
    public static final int VK_F11 = 122;
    public static final int VK_F12 = 123;
    public static final int VK_F13 = 124;
    public static final int VK_F14 = 125;
    public static final int VK_F15 = 126;
    public static final int VK_F16 = 127;
    public static final int VK_F17 = 128;
    public static final int VK_F18 = 129;
    public static final int VK_F19 = 130;
    public static final int VK_F20 = 131;
    public static final int VK_F21 = 132;
    public static final int VK_F22 = 133;
    public static final int VK_F23 = 134;
    public static final int VK_F24 = 135;
    public static final int VK_NUMLOCK = 144;
    public static final int VK_SCROLL = 145;
    public static final int VK_OEM_NEC_EQUAL = 146;
    public static final int VK_OEM_FJ_JISHO = 146;
    public static final int VK_OEM_FJ_MASSHOU = 147;
    public static final int VK_OEM_FJ_TOUROKU = 148;
    public static final int VK_OEM_FJ_LOYA = 149;
    public static final int VK_OEM_FJ_ROYA = 150;
    public static final int VK_LSHIFT = 160;
    public static final int VK_RSHIFT = 161;
    public static final int VK_LCONTROL = 162;
    public static final int VK_RCONTROL = 163;
    public static final int VK_LMENU = 164;
    public static final int VK_RMENU = 165;
    public static final int VK_BROWSER_BACK = 166;
    public static final int VK_BROWSER_FORWARD = 167;
    public static final int VK_BROWSER_REFRESH = 168;
    public static final int VK_BROWSER_STOP = 169;
    public static final int VK_BROWSER_SEARCH = 170;
    public static final int VK_BROWSER_FAVORITES = 171;
    public static final int VK_BROWSER_HOME = 172;
    public static final int VK_VOLUME_MUTE = 173;
    public static final int VK_VOLUME_DOWN = 174;
    public static final int VK_VOLUME_UP = 175;
    public static final int VK_MEDIA_NEXT_TRACK = 176;
    public static final int VK_MEDIA_PREV_TRACK = 177;
    public static final int VK_MEDIA_STOP = 178;
    public static final int VK_MEDIA_PLAY_PAUSE = 179;
    public static final int VK_LAUNCH_MAIL = 180;
    public static final int VK_LAUNCH_MEDIA_SELECT = 181;
    public static final int VK_LAUNCH_APP1 = 182;
    public static final int VK_LAUNCH_APP2 = 183;
    public static final int VK_OEM_1 = 186;
    public static final int VK_OEM_PLUS = 187;
    public static final int VK_OEM_COMMA = 188;
    public static final int VK_OEM_MINUS = 189;
    public static final int VK_OEM_PERIOD = 190;
    public static final int VK_OEM_2 = 191;
    public static final int VK_OEM_3 = 192;
    public static final int VK_OEM_4 = 219;
    public static final int VK_OEM_5 = 220;
    public static final int VK_OEM_6 = 221;
    public static final int VK_OEM_7 = 222;
    public static final int VK_OEM_8 = 223;
    public static final int VK_OEM_AX = 225;
    public static final int VK_OEM_102 = 226;
    public static final int VK_ICO_HELP = 227;
    public static final int VK_ICO_00 = 228;
    public static final int VK_PROCESSKEY = 229;
    public static final int VK_ICO_CLEAR = 230;
    public static final int VK_PACKET = 231;
    public static final int VK_OEM_RESET = 233;
    public static final int VK_OEM_JUMP = 234;
    public static final int VK_OEM_PA1 = 235;
    public static final int VK_OEM_PA2 = 236;
    public static final int VK_OEM_PA3 = 237;
    public static final int VK_OEM_WSCTRL = 238;
    public static final int VK_OEM_CUSEL = 239;
    public static final int VK_OEM_ATTN = 240;
    public static final int VK_OEM_FINISH = 241;
    public static final int VK_OEM_COPY = 242;
    public static final int VK_OEM_AUTO = 243;
    public static final int VK_OEM_ENLW = 244;
    public static final int VK_OEM_BACKTAB = 245;
    public static final int VK_ATTN = 246;
    public static final int VK_CRSEL = 247;
    public static final int VK_EXSEL = 248;
    public static final int VK_EREOF = 249;
    public static final int VK_PLAY = 250;
    public static final int VK_ZOOM = 251;
    public static final int VK_NONAME = 252;
    public static final int VK_PA1 = 253;
    public static final int VK_OEM_CLEAR = 254;
    public static final int XBUTTON1 = 1;
    public static final int XBUTTON2 = 2;
    public static final int WHEEL_DELTA = 120;
    public static final int DPI_AWARENESS_INVALID = -1;
    public static final int DPI_AWARENESS_UNAWARE = 0;
    public static final int DPI_AWARENESS_SYSTEM_AWARE = 1;
    public static final int DPI_AWARENESS_PER_MONITOR_AWARE = 2;
    public static final long DPI_AWARENESS_CONTEXT_UNAWARE = -1;
    public static final long DPI_AWARENESS_CONTEXT_SYSTEM_AWARE = -2;
    public static final long DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE = -3;
    public static final long DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2 = -4;
    public static final int WPF_SETMINPOSITION = 1;
    public static final int WPF_RESTORETOMAXIMIZED = 2;
    public static final int WPF_ASYNCWINDOWPLACEMENT = 4;
    public static final int LWA_COLORKEY = 1;
    public static final int LWA_ALPHA = 2;
    public static final int SM_CXSCREEN = 0;
    public static final int SM_CYSCREEN = 1;
    public static final int SM_CXVSCROLL = 2;
    public static final int SM_CYHSCROLL = 3;
    public static final int SM_CYCAPTION = 4;
    public static final int SM_CXBORDER = 5;
    public static final int SM_CYBORDER = 6;
    public static final int SM_CXDLGFRAME = 7;
    public static final int SM_CYDLGFRAME = 8;
    public static final int SM_CYVTHUMB = 9;
    public static final int SM_CXHTHUMB = 10;
    public static final int SM_CXICON = 11;
    public static final int SM_CYICON = 12;
    public static final int SM_CXCURSOR = 13;
    public static final int SM_CYCURSOR = 14;
    public static final int SM_CYMENU = 15;
    public static final int SM_CXFULLSCREEN = 16;
    public static final int SM_CYFULLSCREEN = 17;
    public static final int SM_CYKANJIWINDOW = 18;
    public static final int SM_MOUSEPRESENT = 19;
    public static final int SM_CYVSCROLL = 20;
    public static final int SM_CXHSCROLL = 21;
    public static final int SM_DEBUG = 22;
    public static final int SM_SWAPBUTTON = 23;
    public static final int SM_RESERVED1 = 24;
    public static final int SM_RESERVED2 = 25;
    public static final int SM_RESERVED3 = 26;
    public static final int SM_RESERVED4 = 27;
    public static final int SM_CXMIN = 28;
    public static final int SM_CYMIN = 29;
    public static final int SM_CXSIZE = 30;
    public static final int SM_CYSIZE = 31;
    public static final int SM_CXFRAME = 32;
    public static final int SM_CYFRAME = 33;
    public static final int SM_CXMINTRACK = 34;
    public static final int SM_CYMINTRACK = 35;
    public static final int SM_CXDOUBLECLK = 36;
    public static final int SM_CYDOUBLECLK = 37;
    public static final int SM_CXICONSPACING = 38;
    public static final int SM_CYICONSPACING = 39;
    public static final int SM_MENUDROPALIGNMENT = 40;
    public static final int SM_PENWINDOWS = 41;
    public static final int SM_DBCSENABLED = 42;
    public static final int SM_CMOUSEBUTTONS = 43;
    public static final int SM_CXFIXEDFRAME = 7;
    public static final int SM_CYFIXEDFRAME = 8;
    public static final int SM_CXSIZEFRAME = 32;
    public static final int SM_CYSIZEFRAME = 33;
    public static final int SM_SECURE = 44;
    public static final int SM_CXEDGE = 45;
    public static final int SM_CYEDGE = 46;
    public static final int SM_CXMINSPACING = 47;
    public static final int SM_CYMINSPACING = 48;
    public static final int SM_CXSMICON = 49;
    public static final int SM_CYSMICON = 50;
    public static final int SM_CYSMCAPTION = 51;
    public static final int SM_CXSMSIZE = 52;
    public static final int SM_CYSMSIZE = 53;
    public static final int SM_CXMENUSIZE = 54;
    public static final int SM_CYMENUSIZE = 55;
    public static final int SM_ARRANGE = 56;
    public static final int SM_CXMINIMIZED = 57;
    public static final int SM_CYMINIMIZED = 58;
    public static final int SM_CXMAXTRACK = 59;
    public static final int SM_CYMAXTRACK = 60;
    public static final int SM_CXMAXIMIZED = 61;
    public static final int SM_CYMAXIMIZED = 62;
    public static final int SM_NETWORK = 63;
    public static final int SM_CLEANBOOT = 67;
    public static final int SM_CXDRAG = 68;
    public static final int SM_CYDRAG = 69;
    public static final int SM_SHOWSOUNDS = 70;
    public static final int SM_CXMENUCHECK = 71;
    public static final int SM_CYMENUCHECK = 72;
    public static final int SM_SLOWMACHINE = 73;
    public static final int SM_MIDEASTENABLED = 74;
    public static final int SM_MOUSEWHEELPRESENT = 75;
    public static final int SM_XVIRTUALSCREEN = 76;
    public static final int SM_YVIRTUALSCREEN = 77;
    public static final int SM_CXVIRTUALSCREEN = 78;
    public static final int SM_CYVIRTUALSCREEN = 79;
    public static final int SM_CMONITORS = 80;
    public static final int SM_SAMEDISPLAYFORMAT = 81;
    public static final int SM_IMMENABLED = 82;
    public static final int SM_REMOTESESSION = 4096;
    public static final int SM_SHUTTINGDOWN = 8192;
    public static final int SM_REMOTECONTROL = 8193;
    public static final int SM_CARETBLINKINGENABLED = 8194;
    public static final int SM_CXFOCUSBORDER = 83;
    public static final int SM_CYFOCUSBORDER = 84;
    public static final int SM_TABLETPC = 86;
    public static final int SM_MEDIACENTER = 87;
    public static final int SM_STARTER = 88;
    public static final int SM_SERVERR2 = 89;
    public static final int SM_MOUSEHORIZONTALWHEELPRESENT = 91;
    public static final int SM_CXPADDEDBORDER = 92;
    public static final int SM_DIGITIZER = 94;
    public static final int SM_MAXIMUMTOUCHES = 95;
    public static final int TWF_FINETOUCH = 1;
    public static final int TWF_WANTPALM = 2;
    public static final int TOUCHEVENTF_MOVE = 1;
    public static final int TOUCHEVENTF_DOWN = 2;
    public static final int TOUCHEVENTF_UP = 4;
    public static final int TOUCHEVENTF_INRANGE = 8;
    public static final int TOUCHEVENTF_PRIMARY = 16;
    public static final int TOUCHEVENTF_NOCOALESCE = 32;
    public static final int TOUCHEVENTF_PEN = 64;
    public static final int TOUCHEVENTF_PALM = 128;
    public static final int TOUCHINPUTMASKF_TIMEFROMSYSTEM = 1;
    public static final int TOUCHINPUTMASKF_EXTRAINFO = 2;
    public static final int TOUCHINPUTMASKF_CONTACTAREA = 4;
    public static final int MONITOR_DEFAULTTONULL = 0;
    public static final int MONITOR_DEFAULTTOPRIMARY = 1;
    public static final int MONITOR_DEFAULTTONEAREST = 2;
    public static final int MONITORINFOF_PRIMARY = 1;
    public static final int EDD_GET_DEVICE_INTERFACE_NAME = 1;
    public static final int ENUM_CURRENT_SETTINGS = -1;
    public static final int ENUM_REGISTRY_SETTINGS = -2;
    public static final int EDS_RAWMODE = 2;
    public static final int EDS_ROTATEDMODE = 4;
    public static final int CDS_UPDATEREGISTRY = 1;
    public static final int CDS_TEST = 2;
    public static final int CDS_FULLSCREEN = 4;
    public static final int CDS_GLOBAL = 8;
    public static final int CDS_SET_PRIMARY = 16;
    public static final int CDS_VIDEOPARAMETERS = 32;
    public static final int CDS_ENABLE_UNSAFE_MODES = 256;
    public static final int CDS_DISABLE_UNSAFE_MODES = 512;
    public static final int CDS_RESET = 1073741824;
    public static final int CDS_RESET_EX = 536870912;
    public static final int CDS_NORESET = 268435456;
    public static final int DISP_CHANGE_SUCCESSFUL = 0;
    public static final int DISP_CHANGE_RESTART = 1;
    public static final int DISP_CHANGE_FAILED = -1;
    public static final int DISP_CHANGE_BADMODE = -2;
    public static final int DISP_CHANGE_NOTUPDATED = -3;
    public static final int DISP_CHANGE_BADFLAGS = -4;
    public static final int DISP_CHANGE_BADPARAM = -5;
    public static final int DISP_CHANGE_BADDUALVIEW = -6;
    public static final int INPUT_MOUSE = 0;
    public static final int INPUT_KEYBOARD = 1;
    public static final int INPUT_HARDWARE = 2;
    public static final int MOUSEEVENTF_ABSOLUTE = 32768;
    public static final int MOUSEEVENTF_HWHEEL = 4096;
    public static final int MOUSEEVENTF_MOVE = 1;
    public static final int MOUSEEVENTF_MOVE_NOCOALESCE = 8192;
    public static final int MOUSEEVENTF_LEFTDOWN = 2;
    public static final int MOUSEEVENTF_LEFTUP = 4;
    public static final int MOUSEEVENTF_RIGHTDOWN = 8;
    public static final int MOUSEEVENTF_RIGHTUP = 16;
    public static final int MOUSEEVENTF_MIDDLEDOWN = 32;
    public static final int MOUSEEVENTF_MIDDLEUP = 64;
    public static final int MOUSEEVENTF_VIRTUALDESK = 16384;
    public static final int MOUSEEVENTF_WHEEL = 2048;
    public static final int MOUSEEVENTF_XDOWN = 128;
    public static final int MOUSEEVENTF_XUP = 256;
    public static final int KEYEVENTF_EXTENDEDKEY = 1;
    public static final int KEYEVENTF_KEYUP = 2;
    public static final int KEYEVENTF_SCANCODE = 8;
    public static final int KEYEVENTF_UNICODE = 4;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/User32$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/User32$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/User32$Functions.class */
    public static final class Functions {
        public static final long RegisterClassEx = 0;
        public static final long UnregisterClass = 0;
        public static final long CreateWindowEx = 0;
        public static final long DestroyWindow = 0;
        public static final long DefWindowProc = 0;
        public static final long CallWindowProc = 0;
        public static final long ShowWindow = 0;
        public static final long UpdateWindow = 0;
        public static final long SetWindowPos = 0;
        public static final long SetWindowText = 0;
        public static final long GetMessage = 0;
        public static final long PeekMessage = 0;
        public static final long TranslateMessage = 0;
        public static final long WaitMessage = 0;
        public static final long DispatchMessage = 0;
        public static final long PostMessage = 0;
        public static final long SendMessage = 0;
        public static final long AdjustWindowRectEx = 0;
        public static final long GetWindowRect = 0;
        public static final long MoveWindow = 0;
        public static final long GetWindowPlacement = 0;
        public static final long SetWindowPlacement = 0;
        public static final long IsWindowVisible = 0;
        public static final long IsIconic = 0;
        public static final long IsZoomed = 0;
        public static final long BringWindowToTop = 0;
        public static final long SetWindowLongPtr = 0;
        public static final long GetWindowLongPtr = 0;
        public static final long SetClassLongPtr = 0;
        public static final long GetClassLongPtr = 0;
        public static final long SetLayeredWindowAttributes = 0;
        public static final long LoadIcon = 0;
        public static final long LoadCursor = 0;
        public static final long GetDC = 0;
        public static final long ReleaseDC = 0;
        public static final long GetSystemMetrics = 0;
        public static final long RegisterTouchWindow = 0;
        public static final long UnregisterTouchWindow = 0;
        public static final long IsTouchWindow = 0;
        public static final long GetTouchInputInfo = 0;
        public static final long CloseTouchInputHandle = 0;
        public static final long MonitorFromWindow = 0;
        public static final long GetMonitorInfo = 0;
        public static final long EnumDisplayDevices = 0;
        public static final long EnumDisplaySettingsEx = 0;
        public static final long ChangeDisplaySettingsEx = 0;
        public static final long GetCursorPos = 0;
        public static final long SetCursorPos = 0;
        public static final long ClipCursor = 0;
        public static final long ShowCursor = 0;
        public static final long SetCursor = 0;
        public static final long ClientToScreen = 0;
        public static final long GetAsyncKeyState = 0;
        public static final long GetMessageExtraInfo = 0;
        public static final long SendInput = 0;
        public static final long GetDpiForSystem = 0;
        public static final long GetDpiForWindow = 0;
        public static final long GetAwarenessFromDpiAwarenessContext = 0;
        public static final long GetThreadDpiAwarenessContext = 0;
        public static final long GetWindowDpiAwarenessContext = 0;
        public static final long IsValidDpiAwarenessContext = 0;
        public static final long SetThreadDpiAwarenessContext = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "RegisterClassExW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.RegisterClassEx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "UnregisterClassW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.UnregisterClass = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "CreateWindowExW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.CreateWindowEx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "DestroyWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.DestroyWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "DefWindowProcW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.DefWindowProc = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "CallWindowProcW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.CallWindowProc = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "ShowWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.ShowWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "UpdateWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.UpdateWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SetWindowPos"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetWindowPos = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SetWindowTextW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetWindowText = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetMessageW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetMessage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "PeekMessageW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.PeekMessage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "TranslateMessage"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.TranslateMessage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "WaitMessage"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.WaitMessage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "DispatchMessageW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.DispatchMessage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "PostMessageW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.PostMessage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SendMessageW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SendMessage = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "AdjustWindowRectEx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.AdjustWindowRectEx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetWindowRect"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetWindowRect = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "MoveWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.MoveWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetWindowPlacement"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetWindowPlacement = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SetWindowPlacement"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetWindowPlacement = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "IsWindowVisible"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.IsWindowVisible = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "IsIconic"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.IsIconic = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "IsZoomed"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.IsZoomed = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "BringWindowToTop"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.BringWindowToTop = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                boolean r1 = org.lwjgl.system.Pointer.BITS64
                if (r1 == 0) goto L12c
                java.lang.String r1 = "SetWindowLongPtrW"
                goto L12e
            L12c:
                java.lang.String r1 = "SetWindowLongW"
            L12e:
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetWindowLongPtr = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                boolean r1 = org.lwjgl.system.Pointer.BITS64
                if (r1 == 0) goto L142
                java.lang.String r1 = "GetWindowLongPtrW"
                goto L144
            L142:
                java.lang.String r1 = "GetWindowLongW"
            L144:
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetWindowLongPtr = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                boolean r1 = org.lwjgl.system.Pointer.BITS64
                if (r1 == 0) goto L158
                java.lang.String r1 = "SetClassLongPtrW"
                goto L15a
            L158:
                java.lang.String r1 = "SetClassLongW"
            L15a:
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetClassLongPtr = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                boolean r1 = org.lwjgl.system.Pointer.BITS64
                if (r1 == 0) goto L16e
                java.lang.String r1 = "GetClassLongPtrW"
                goto L170
            L16e:
                java.lang.String r1 = "GetClassLongW"
            L170:
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetClassLongPtr = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SetLayeredWindowAttributes"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetLayeredWindowAttributes = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "LoadIconW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.LoadIcon = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "LoadCursorW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.LoadCursor = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetDC"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetDC = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "ReleaseDC"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.ReleaseDC = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetSystemMetrics"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetSystemMetrics = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "RegisterTouchWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.RegisterTouchWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "UnregisterTouchWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.UnregisterTouchWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "IsTouchWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.IsTouchWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetTouchInputInfo"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetTouchInputInfo = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "CloseTouchInputHandle"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.CloseTouchInputHandle = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "MonitorFromWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.MonitorFromWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetMonitorInfoW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetMonitorInfo = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "EnumDisplayDevicesW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.EnumDisplayDevices = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "EnumDisplaySettingsExW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.EnumDisplaySettingsEx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "ChangeDisplaySettingsExW"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.ChangeDisplaySettingsEx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetCursorPos"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetCursorPos = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SetCursorPos"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetCursorPos = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "ClipCursor"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.ClipCursor = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "ShowCursor"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.ShowCursor = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SetCursor"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetCursor = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "ClientToScreen"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.ClientToScreen = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetAsyncKeyState"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetAsyncKeyState = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetMessageExtraInfo"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetMessageExtraInfo = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SendInput"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SendInput = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetDpiForSystem"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetDpiForSystem = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetDpiForWindow"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetDpiForWindow = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetAwarenessFromDpiAwarenessContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetAwarenessFromDpiAwarenessContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetThreadDpiAwarenessContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetThreadDpiAwarenessContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "GetWindowDpiAwarenessContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.GetWindowDpiAwarenessContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "IsValidDpiAwarenessContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.IsValidDpiAwarenessContext = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.access$000()
                java.lang.String r1 = "SetThreadDpiAwarenessContext"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddressOptional(r0, r1)
                org.lwjgl.system.windows.User32.Functions.SetThreadDpiAwarenessContext = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.USER32
            return r0
    }

    protected User32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native short nRegisterClassEx(long r0, long r2);

    public static short nRegisterClassEx(long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.RegisterClassEx
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r5
            org.lwjgl.system.windows.WNDCLASSEX.validate(r0)
        Le:
            r0 = r5
            r1 = r7
            short r0 = nRegisterClassEx(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ATOM")
    public static short RegisterClassEx(@org.lwjgl.system.NativeType("WNDCLASSEX const *") org.lwjgl.system.windows.WNDCLASSEX r3) {
            r0 = r3
            long r0 = r0.address()
            short r0 = nRegisterClassEx(r0)
            return r0
    }

    public static native int nUnregisterClass(long r0, long r2, long r4);

    public static int nUnregisterClass(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.UnregisterClass
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nUnregisterClass(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean UnregisterClass(@org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("HINSTANCE") long r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT2(r0)
        La:
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r0 = nUnregisterClass(r0, r1)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean UnregisterClass(@org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r5, @org.lwjgl.system.NativeType("HINSTANCE") long r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r5
            r2 = 1
            int r0 = r0.nUTF16(r1, r2)     // Catch: java.lang.Throwable -> L30
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r10
            r1 = r6
            int r0 = nUnregisterClass(r0, r1)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native long nCreateWindowEx(int r0, long r1, long r3, int r5, int r6, int r7, int r8, int r9, long r10, long r12, long r14, long r16, long r18);

    public static long nCreateWindowEx(int r21, long r22, long r24, int r26, int r27, int r28, int r29, int r30, long r31, long r33, long r35, long r37) {
            long r0 = org.lwjgl.system.windows.User32.Functions.CreateWindowEx
            r39 = r0
            r0 = r21
            r1 = r22
            r2 = r24
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r33
            r10 = r35
            r11 = r37
            r12 = r39
            long r0 = nCreateWindowEx(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    @org.lwjgl.system.NativeType("HWND")
    public static long CreateWindowEx(@org.lwjgl.system.NativeType("DWORD") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r21, @org.lwjgl.system.NativeType("DWORD") int r22, int r23, int r24, int r25, int r26, @org.lwjgl.system.NativeType("HWND") long r27, @org.lwjgl.system.NativeType("HMENU") long r29, @org.lwjgl.system.NativeType("HINSTANCE") long r31, @org.lwjgl.system.NativeType("LPVOID") long r33) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r20
            org.lwjgl.system.Checks.checkNT2Safe(r0)
            r0 = r21
            org.lwjgl.system.Checks.checkNT2Safe(r0)
        Le:
            r0 = r19
            r1 = r20
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r21
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r29
            r10 = r31
            r11 = r33
            long r0 = nCreateWindowEx(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    @org.lwjgl.system.NativeType("HWND")
    public static long CreateWindowEx(@org.lwjgl.system.NativeType("DWORD") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r20, @javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r21, @org.lwjgl.system.NativeType("DWORD") int r22, int r23, int r24, int r25, int r26, @org.lwjgl.system.NativeType("HWND") long r27, @org.lwjgl.system.NativeType("HMENU") long r29, @org.lwjgl.system.NativeType("HINSTANCE") long r31, @org.lwjgl.system.NativeType("LPVOID") long r33) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r35 = r0
            r0 = r35
            int r0 = r0.getPointer()
            r36 = r0
            r0 = r35
            r1 = r20
            r2 = 1
            int r0 = r0.nUTF16Safe(r1, r2)     // Catch: java.lang.Throwable -> L5f
            r0 = r20
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r35
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L5f
        L21:
            r37 = r0
            r0 = r35
            r1 = r21
            r2 = 1
            int r0 = r0.nUTF16Safe(r1, r2)     // Catch: java.lang.Throwable -> L5f
            r0 = r21
            if (r0 != 0) goto L33
            r0 = 0
            goto L38
        L33:
            r0 = r35
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L5f
        L38:
            r39 = r0
            r0 = r19
            r1 = r37
            r2 = r39
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r29
            r10 = r31
            r11 = r33
            long r0 = nCreateWindowEx(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5f
            r41 = r0
            r0 = r35
            r1 = r36
            r0.setPointer(r1)
            r0 = r41
            return r0
        L5f:
            r43 = move-exception
            r0 = r35
            r1 = r36
            r0.setPointer(r1)
            r0 = r43
            throw r0
    }

    public static native int nDestroyWindow(long r0, long r2);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean DestroyWindow(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.DestroyWindow
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = nDestroyWindow(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("LRESULT")
    public static long DefWindowProc(@org.lwjgl.system.NativeType("HWND") long r10, @org.lwjgl.system.NativeType("UINT") int r12, @org.lwjgl.system.NativeType("WPARAM") long r13, @org.lwjgl.system.NativeType("LPARAM") long r15) {
            long r0 = org.lwjgl.system.windows.User32.Functions.DefWindowProc
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4)
            return r0
    }

    public static long nCallWindowProc(long r12, long r14, int r16, long r17, long r19) {
            long r0 = org.lwjgl.system.windows.User32.Functions.CallWindowProc
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r21
            long r0 = org.lwjgl.system.JNI.callPPPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("LRESULT")
    public static long CallWindowProc(@org.lwjgl.system.NativeType("WNDPROC") org.lwjgl.system.windows.WindowProcI r10, @org.lwjgl.system.NativeType("HWND") long r11, @org.lwjgl.system.NativeType("UINT") int r13, @org.lwjgl.system.NativeType("WPARAM") long r14, @org.lwjgl.system.NativeType("LPARAM") long r16) {
            r0 = r10
            long r0 = r0.address()
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            long r0 = nCallWindowProc(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean ShowWindow(@org.lwjgl.system.NativeType("HWND") long r6, int r8) {
            long r0 = org.lwjgl.system.windows.User32.Functions.ShowWindow
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean UpdateWindow(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.UpdateWindow
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    public static native int nSetWindowPos(long r0, long r2, int r4, int r5, int r6, int r7, int r8, long r9);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SetWindowPos(@org.lwjgl.system.NativeType("HWND") long r12, @org.lwjgl.system.NativeType("HWND") long r14, int r16, int r17, int r18, int r19, @org.lwjgl.system.NativeType("UINT") int r20) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetWindowPos
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            int r0 = nSetWindowPos(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    public static native int nSetWindowText(long r0, long r2, long r4);

    public static int nSetWindowText(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetWindowText
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nSetWindowText(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SetWindowText(@org.lwjgl.system.NativeType("HWND") long r5, @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nSetWindowText(r0, r1)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SetWindowText(@org.lwjgl.system.NativeType("HWND") long r5, @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF16(r1, r2)     // Catch: java.lang.Throwable -> L30
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L30
            r10 = r0
            r0 = r5
            r1 = r10
            int r0 = nSetWindowText(r0, r1)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L30:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native int nGetMessage(long r0, long r2, int r4, int r5, long r6);

    public static int nGetMessage(long r9, long r11, int r13, int r14) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetMessage
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            int r0 = nGetMessage(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean GetMessage(@org.lwjgl.system.NativeType("LPMSG") org.lwjgl.system.windows.MSG r7, @org.lwjgl.system.NativeType("HWND") long r8, @org.lwjgl.system.NativeType("UINT") int r10, @org.lwjgl.system.NativeType("UINT") int r11) {
            r0 = r7
            long r0 = r0.address()
            r1 = r8
            r2 = r10
            r3 = r11
            int r0 = nGetMessage(r0, r1, r2, r3)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static int nPeekMessage(long r10, long r12, int r14, int r15, int r16) {
            long r0 = org.lwjgl.system.windows.User32.Functions.PeekMessage
            r17 = r0
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean PeekMessage(@org.lwjgl.system.NativeType("LPMSG") org.lwjgl.system.windows.MSG r8, @org.lwjgl.system.NativeType("HWND") long r9, @org.lwjgl.system.NativeType("UINT") int r11, @org.lwjgl.system.NativeType("UINT") int r12, @org.lwjgl.system.NativeType("UINT") int r13) {
            r0 = r8
            long r0 = r0.address()
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = nPeekMessage(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public static int nTranslateMessage(long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.TranslateMessage
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean TranslateMessage(@org.lwjgl.system.NativeType("MSG const *") org.lwjgl.system.windows.MSG r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nTranslateMessage(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static native int nWaitMessage(long r0);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean WaitMessage() {
            long r0 = org.lwjgl.system.windows.User32.Functions.WaitMessage
            r3 = r0
            r0 = r3
            int r0 = nWaitMessage(r0)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static long nDispatchMessage(long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.DispatchMessage
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("LRESULT")
    public static long DispatchMessage(@org.lwjgl.system.NativeType("MSG const *") org.lwjgl.system.windows.MSG r3) {
            r0 = r3
            long r0 = r0.address()
            long r0 = nDispatchMessage(r0)
            return r0
    }

    public static native int nPostMessage(long r0, int r2, long r3, long r5, long r7);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean PostMessage(@org.lwjgl.system.NativeType("HWND") long r10, @org.lwjgl.system.NativeType("UINT") int r12, @org.lwjgl.system.NativeType("WPARAM") long r13, @org.lwjgl.system.NativeType("LPARAM") long r15) {
            long r0 = org.lwjgl.system.windows.User32.Functions.PostMessage
            r17 = r0
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = nPostMessage(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public static native int nSendMessage(long r0, int r2, long r3, long r5, long r7);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SendMessage(@org.lwjgl.system.NativeType("HWND") long r10, @org.lwjgl.system.NativeType("UINT") int r12, @org.lwjgl.system.NativeType("WPARAM") long r13, @org.lwjgl.system.NativeType("LPARAM") long r15) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SendMessage
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            int r0 = nSendMessage(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public static native int nAdjustWindowRectEx(long r0, int r2, int r3, int r4, long r5);

    public static int nAdjustWindowRectEx(long r8, int r10, int r11, int r12) {
            long r0 = org.lwjgl.system.windows.User32.Functions.AdjustWindowRectEx
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = nAdjustWindowRectEx(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean AdjustWindowRectEx(@org.lwjgl.system.NativeType("LPRECT") org.lwjgl.system.windows.RECT r6, @org.lwjgl.system.NativeType("DWORD") int r7, @org.lwjgl.system.NativeType("BOOL") boolean r8, @org.lwjgl.system.NativeType("DWORD") int r9) {
            r0 = r6
            long r0 = r0.address()
            r1 = r7
            r2 = r8
            if (r2 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            r3 = r9
            int r0 = nAdjustWindowRectEx(r0, r1, r2, r3)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public static native int nGetWindowRect(long r0, long r2, long r4);

    public static int nGetWindowRect(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetWindowRect
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nGetWindowRect(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean GetWindowRect(@org.lwjgl.system.NativeType("HWND") long r5, @org.lwjgl.system.NativeType("LPRECT") org.lwjgl.system.windows.RECT r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nGetWindowRect(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static native int nMoveWindow(long r0, int r2, int r3, int r4, int r5, int r6, long r7);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean MoveWindow(@org.lwjgl.system.NativeType("HWND") long r10, int r12, int r13, int r14, int r15, @org.lwjgl.system.NativeType("BOOL") boolean r16) {
            long r0 = org.lwjgl.system.windows.User32.Functions.MoveWindow
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            r6 = r17
            int r0 = nMoveWindow(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }

    public static native int nGetWindowPlacement(long r0, long r2, long r4);

    public static int nGetWindowPlacement(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetWindowPlacement
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nGetWindowPlacement(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean GetWindowPlacement(@org.lwjgl.system.NativeType("HWND") long r5, @org.lwjgl.system.NativeType("WINDOWPLACEMENT *") org.lwjgl.system.windows.WINDOWPLACEMENT r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nGetWindowPlacement(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static native int nSetWindowPlacement(long r0, long r2, long r4);

    public static int nSetWindowPlacement(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetWindowPlacement
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nSetWindowPlacement(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SetWindowPlacement(@org.lwjgl.system.NativeType("HWND") long r5, @org.lwjgl.system.NativeType("WINDOWPLACEMENT const *") org.lwjgl.system.windows.WINDOWPLACEMENT r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nSetWindowPlacement(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean IsWindowVisible(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.IsWindowVisible
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean IsIconic(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.IsIconic
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean IsZoomed(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.IsZoomed
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean BringWindowToTop(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.BringWindowToTop
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    public static native long nSetWindowLongPtr(long r0, int r2, long r3, long r5);

    @org.lwjgl.system.NativeType("LONG_PTR")
    public static long SetWindowLongPtr(@org.lwjgl.system.NativeType("HWND") long r8, int r10, @org.lwjgl.system.NativeType("LONG_PTR") long r11) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetWindowLongPtr
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            long r0 = nSetWindowLongPtr(r0, r1, r2, r3)
            return r0
    }

    public static native long nGetWindowLongPtr(long r0, int r2, long r3);

    @org.lwjgl.system.NativeType("LONG_PTR")
    public static long GetWindowLongPtr(@org.lwjgl.system.NativeType("HWND") long r6, int r8) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetWindowLongPtr
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = nGetWindowLongPtr(r0, r1, r2)
            return r0
    }

    public static native long nSetClassLongPtr(long r0, int r2, long r3, long r5);

    @org.lwjgl.system.NativeType("LONG_PTR")
    public static long SetClassLongPtr(@org.lwjgl.system.NativeType("HWND") long r8, int r10, @org.lwjgl.system.NativeType("LONG_PTR") long r11) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetClassLongPtr
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            long r0 = nSetClassLongPtr(r0, r1, r2, r3)
            return r0
    }

    public static native long nGetClassLongPtr(long r0, int r2, long r3);

    @org.lwjgl.system.NativeType("LONG_PTR")
    public static long GetClassLongPtr(@org.lwjgl.system.NativeType("HWND") long r6, int r8) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetClassLongPtr
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = nGetClassLongPtr(r0, r1, r2)
            return r0
    }

    public static native int nSetLayeredWindowAttributes(long r0, int r2, byte r3, int r4, long r5);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SetLayeredWindowAttributes(@org.lwjgl.system.NativeType("HWND") long r8, @org.lwjgl.system.NativeType("COLORREF") int r10, @org.lwjgl.system.NativeType("BYTE") byte r11, @org.lwjgl.system.NativeType("DWORD") int r12) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetLayeredWindowAttributes
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = nSetLayeredWindowAttributes(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public static native long nLoadIcon(long r0, long r2, long r4);

    public static long nLoadIcon(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.LoadIcon
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = nLoadIcon(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("HICON")
    public static long LoadIcon(@org.lwjgl.system.NativeType("HINSTANCE") long r5, @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nLoadIcon(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("HICON")
    public static long LoadIcon(@org.lwjgl.system.NativeType("HINSTANCE") long r5, @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF16(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nLoadIcon(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native long nLoadCursor(long r0, long r2, long r4);

    public static long nLoadCursor(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.LoadCursor
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = nLoadCursor(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("HCURSOR")
    public static long LoadCursor(@org.lwjgl.system.NativeType("HINSTANCE") long r5, @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nLoadCursor(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("HCURSOR")
    public static long LoadCursor(@org.lwjgl.system.NativeType("HINSTANCE") long r5, @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF16(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nLoadCursor(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    @org.lwjgl.system.NativeType("HDC")
    public static long GetDC(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetDC
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean ReleaseDC(@org.lwjgl.system.NativeType("HWND") long r7, @org.lwjgl.system.NativeType("HDC") long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.ReleaseDC
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    public static int GetSystemMetrics(int r4) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetSystemMetrics
            r5 = r0
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.system.JNI.callI(r0, r1)
            return r0
    }

    public static native int nRegisterTouchWindow(long r0, int r2, long r3);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean RegisterTouchWindow(@org.lwjgl.system.NativeType("HWND") long r6, @org.lwjgl.system.NativeType("ULONG") int r8) {
            long r0 = org.lwjgl.system.windows.User32.Functions.RegisterTouchWindow
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = nRegisterTouchWindow(r0, r1, r2)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public static native int nUnregisterTouchWindow(long r0, long r2);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean UnregisterTouchWindow(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.UnregisterTouchWindow
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            int r0 = nUnregisterTouchWindow(r0, r1)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    public static int nIsTouchWindow(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.IsTouchWindow
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean IsTouchWindow(@org.lwjgl.system.NativeType("HWND") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("PULONG") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            int r0 = nIsTouchWindow(r0, r1)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public static native int nGetTouchInputInfo(long r0, int r2, long r3, int r5, long r6);

    public static int nGetTouchInputInfo(long r9, int r11, long r12, int r14) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetTouchInputInfo
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L16:
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = nGetTouchInputInfo(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean GetTouchInputInfo(@org.lwjgl.system.NativeType("HTOUCHINPUT") long r7, @org.lwjgl.system.NativeType("PTOUCHINPUT") org.lwjgl.system.windows.TOUCHINPUT.Buffer r9, int r10) {
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            int r0 = nGetTouchInputInfo(r0, r1, r2, r3)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public static native int nCloseTouchInputHandle(long r0, long r2);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean CloseTouchInputHandle(@org.lwjgl.system.NativeType("HTOUCHINPUT") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.CloseTouchInputHandle
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            int r0 = nCloseTouchInputHandle(r0, r1)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @org.lwjgl.system.NativeType("HMONITOR")
    public static long MonitorFromWindow(@org.lwjgl.system.NativeType("HWND") long r6, @org.lwjgl.system.NativeType("DWORD") int r8) {
            long r0 = org.lwjgl.system.windows.User32.Functions.MonitorFromWindow
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1, r2)
            return r0
    }

    public static int nGetMonitorInfo(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetMonitorInfo
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean GetMonitorInfo(@org.lwjgl.system.NativeType("HMONITOR") long r5, @org.lwjgl.system.NativeType("LPMONITORINFOEX") org.lwjgl.system.windows.MONITORINFOEX r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nGetMonitorInfo(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static int nEnumDisplayDevices(long r9, int r11, long r12, int r14) {
            long r0 = org.lwjgl.system.windows.User32.Functions.EnumDisplayDevices
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean EnumDisplayDevices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("DWORD") int r8, @org.lwjgl.system.NativeType("PDISPLAY_DEVICE") org.lwjgl.system.windows.DISPLAY_DEVICE r9, @org.lwjgl.system.NativeType("DWORD") int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2Safe(r0)
        La:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            int r0 = nEnumDisplayDevices(r0, r1, r2, r3)
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean EnumDisplayDevices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("DWORD") int r8, @org.lwjgl.system.NativeType("PDISPLAY_DEVICE") org.lwjgl.system.windows.DISPLAY_DEVICE r9, @org.lwjgl.system.NativeType("DWORD") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF16Safe(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0 = r7
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L42
        L21:
            r13 = r0
            r0 = r13
            r1 = r8
            r2 = r9
            long r2 = r2.address()     // Catch: java.lang.Throwable -> L42
            r3 = r10
            int r0 = nEnumDisplayDevices(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L42:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static int nEnumDisplaySettingsEx(long r9, int r11, long r12, int r14) {
            long r0 = org.lwjgl.system.windows.User32.Functions.EnumDisplaySettingsEx
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean EnumDisplaySettingsEx(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("DWORD") int r8, @org.lwjgl.system.NativeType("DEVMODE *") org.lwjgl.system.windows.DEVMODE r9, @org.lwjgl.system.NativeType("DWORD") int r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT2Safe(r0)
        La:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r8
            r2 = r9
            long r2 = r2.address()
            r3 = r10
            int r0 = nEnumDisplaySettingsEx(r0, r1, r2, r3)
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean EnumDisplaySettingsEx(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("DWORD") int r8, @org.lwjgl.system.NativeType("DEVMODE *") org.lwjgl.system.windows.DEVMODE r9, @org.lwjgl.system.NativeType("DWORD") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r7
            r2 = 1
            int r0 = r0.nUTF16Safe(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0 = r7
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L42
        L21:
            r13 = r0
            r0 = r13
            r1 = r8
            r2 = r9
            long r2 = r2.address()     // Catch: java.lang.Throwable -> L42
            r3 = r10
            int r0 = nEnumDisplaySettingsEx(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L42:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static int nChangeDisplaySettingsEx(long r12, long r14, long r16, int r18, long r19) {
            long r0 = org.lwjgl.system.windows.User32.Functions.ChangeDisplaySettingsEx
            r21 = r0
            r0 = r12
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r21
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("LONG")
    public static int ChangeDisplaySettingsEx(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("DEVMODE *") org.lwjgl.system.windows.DEVMODE r11, @org.lwjgl.system.NativeType("HWND") long r12, @org.lwjgl.system.NativeType("DWORD") int r14, @org.lwjgl.system.NativeType("LPVOID") long r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r10
            org.lwjgl.system.Checks.checkNT2Safe(r0)
        La:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = nChangeDisplaySettingsEx(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("LONG")
    public static int ChangeDisplaySettingsEx(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("DEVMODE *") org.lwjgl.system.windows.DEVMODE r11, @org.lwjgl.system.NativeType("HWND") long r12, @org.lwjgl.system.NativeType("DWORD") int r14, @org.lwjgl.system.NativeType("LPVOID") long r15) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF16Safe(r1, r2)     // Catch: java.lang.Throwable -> L3d
            r0 = r10
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r17
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L3d
        L21:
            r19 = r0
            r0 = r19
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)     // Catch: java.lang.Throwable -> L3d
            r2 = r12
            r3 = r14
            r4 = r15
            int r0 = nChangeDisplaySettingsEx(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3d
            r21 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r21
            return r0
        L3d:
            r22 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    public static int nGetCursorPos(long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetCursorPos
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean GetCursorPos(@org.lwjgl.system.NativeType("LPPOINT") org.lwjgl.system.windows.POINT r3) {
            r0 = r3
            long r0 = r0.address()
            int r0 = nGetCursorPos(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean SetCursorPos(int r5, int r6) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetCursorPos
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            int r0 = org.lwjgl.system.JNI.callI(r0, r1, r2)
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static int nClipCursor(long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.ClipCursor
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean ClipCursor(@javax.annotation.Nullable @org.lwjgl.system.NativeType("RECT const *") org.lwjgl.system.windows.RECT r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            int r0 = nClipCursor(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static int ShowCursor(@org.lwjgl.system.NativeType("BOOL") boolean r4) {
            long r0 = org.lwjgl.system.windows.User32.Functions.ShowCursor
            r5 = r0
            r0 = r4
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r1 = r5
            int r0 = org.lwjgl.system.JNI.callI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("HCURSOR")
    public static long SetCursor(@org.lwjgl.system.NativeType("HCURSOR") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetCursor
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    public static int nClientToScreen(long r7, long r9) {
            long r0 = org.lwjgl.system.windows.User32.Functions.ClientToScreen
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean ClientToScreen(@org.lwjgl.system.NativeType("HWND") long r5, @org.lwjgl.system.NativeType("LPPOINT") org.lwjgl.system.windows.POINT r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            int r0 = nClientToScreen(r0, r1)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @org.lwjgl.system.NativeType("SHORT")
    public static short GetAsyncKeyState(int r4) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetAsyncKeyState
            r5 = r0
            r0 = r4
            r1 = r5
            short r0 = org.lwjgl.system.JNI.callS(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("LPARAM")
    public static long GetMessageExtraInfo() {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetMessageExtraInfo
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }

    public static int nSendInput(int r7, long r8, int r10) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SendInput
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public static int SendInput(@org.lwjgl.system.NativeType("PINPUT") org.lwjgl.system.windows.INPUT.Buffer r5, int r6) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = r5
            long r1 = r1.address()
            r2 = r6
            int r0 = nSendInput(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public static int GetDpiForSystem() {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetDpiForSystem
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r3
            int r0 = org.lwjgl.system.JNI.callI(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("UINT")
    public static int GetDpiForWindow(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetDpiForWindow
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("DPI_AWARENESS")
    public static int GetAwarenessFromDpiAwarenessContext(@org.lwjgl.system.NativeType("DPI_AWARENESS_CONTEXT") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetAwarenessFromDpiAwarenessContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("DPI_AWARENESS_CONTEXT")
    public static long GetThreadDpiAwarenessContext() {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetThreadDpiAwarenessContext
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DPI_AWARENESS_CONTEXT")
    public static long GetWindowDpiAwarenessContext(@org.lwjgl.system.NativeType("HWND") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.GetWindowDpiAwarenessContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean IsValidDpiAwarenessContext(@org.lwjgl.system.NativeType("DPI_AWARENESS_CONTEXT") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.IsValidDpiAwarenessContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("DPI_AWARENESS_CONTEXT")
    public static long SetThreadDpiAwarenessContext(@org.lwjgl.system.NativeType("DPI_AWARENESS_CONTEXT") long r5) {
            long r0 = org.lwjgl.system.windows.User32.Functions.SetThreadDpiAwarenessContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean IsTouchWindow(@org.lwjgl.system.NativeType("HWND") long r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("PULONG") int[] r8) {
            long r0 = org.lwjgl.system.windows.User32.Functions.IsTouchWindow
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L19:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.windows.User32.USER32
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.system.windows.User32> r0 = org.lwjgl.system.windows.User32.class
            java.lang.String r1 = "org.lwjgl"
            java.lang.String r2 = "user32"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            org.lwjgl.system.windows.User32.USER32 = r0
            return
    }
}
