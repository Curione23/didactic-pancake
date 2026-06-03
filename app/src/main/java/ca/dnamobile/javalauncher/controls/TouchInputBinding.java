package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
final class TouchInputBinding {
    private static final ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] EMPTY_OPTIONS = null;
    private static final ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] KEY_OPTIONS = null;
    private static final ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] MOUSE_OPTIONS = null;
    private static final ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] SCROLL_OPTIONS = null;

    static final class Option {
        final java.lang.String label;
        final int value;

        Option(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.label = r1
                r0.value = r2
                return
        }
    }

    static {
            r0 = 92
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = new ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[r0]
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r3 = "None"
            r4 = 0
            r2.<init>(r3, r4)
            r1[r4] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r3 = "Mouse left click / Attack"
            r5 = -3
            r2.<init>(r3, r5)
            r3 = 1
            r1[r3] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r5 = "Mouse right click / Use"
            r6 = -4
            r2.<init>(r5, r6)
            r5 = 2
            r1[r5] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r6 = "Mouse middle click / Pick block"
            r7 = -6
            r2.<init>(r6, r7)
            r6 = 3
            r1[r6] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Mouse wheel up"
            r8 = -7
            r2.<init>(r7, r8)
            r7 = 4
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Mouse wheel down"
            r8 = -8
            r2.<init>(r7, r8)
            r7 = 5
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Open Android keyboard"
            r8 = -1
            r2.<init>(r7, r8)
            r7 = 6
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Open key sender keyboard"
            r9 = -10
            r2.<init>(r7, r9)
            r7 = 7
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Open launcher menu"
            r9 = -9
            r2.<init>(r7, r9)
            r7 = 8
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Show / hide touch controls"
            r9 = -2
            r2.<init>(r7, r9)
            r7 = 9
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Toggle virtual cursor"
            r9 = -5
            r2.<init>(r7, r9)
            r7 = 10
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "W / Forward"
            r9 = 87
            r2.<init>(r7, r9)
            r7 = 11
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "A / Left"
            r10 = 65
            r2.<init>(r7, r10)
            r7 = 12
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "S / Back"
            r11 = 83
            r2.<init>(r7, r11)
            r7 = 13
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "D / Right"
            r12 = 68
            r2.<init>(r7, r12)
            r7 = 14
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Space / Jump"
            r13 = 32
            r2.<init>(r7, r13)
            r7 = 15
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Left Shift / Sneak"
            r14 = 340(0x154, float:4.76E-43)
            r2.<init>(r7, r14)
            r7 = 16
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Left Ctrl / Sprint"
            r14 = 341(0x155, float:4.78E-43)
            r2.<init>(r7, r14)
            r7 = 17
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Left Alt"
            r14 = 342(0x156, float:4.79E-43)
            r2.<init>(r7, r14)
            r7 = 18
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Right Shift"
            r14 = 344(0x158, float:4.82E-43)
            r2.<init>(r7, r14)
            r7 = 19
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Right Ctrl"
            r14 = 345(0x159, float:4.83E-43)
            r2.<init>(r7, r14)
            r7 = 20
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Right Alt"
            r14 = 346(0x15a, float:4.85E-43)
            r2.<init>(r7, r14)
            r7 = 21
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Escape / Pause"
            r14 = 256(0x100, float:3.59E-43)
            r2.<init>(r7, r14)
            r7 = 22
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Tab / Player List"
            r14 = 258(0x102, float:3.62E-43)
            r2.<init>(r7, r14)
            r7 = 23
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Enter"
            r14 = 257(0x101, float:3.6E-43)
            r2.<init>(r7, r14)
            r7 = 24
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Backspace"
            r14 = 259(0x103, float:3.63E-43)
            r2.<init>(r7, r14)
            r7 = 25
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Insert"
            r14 = 260(0x104, float:3.64E-43)
            r2.<init>(r7, r14)
            r7 = 26
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Delete"
            r14 = 261(0x105, float:3.66E-43)
            r2.<init>(r7, r14)
            r7 = 27
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Home"
            r14 = 268(0x10c, float:3.76E-43)
            r2.<init>(r7, r14)
            r7 = 28
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "End"
            r14 = 269(0x10d, float:3.77E-43)
            r2.<init>(r7, r14)
            r7 = 29
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Page Up"
            r14 = 266(0x10a, float:3.73E-43)
            r2.<init>(r7, r14)
            r7 = 30
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Page Down"
            r14 = 267(0x10b, float:3.74E-43)
            r2.<init>(r7, r14)
            r7 = 31
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Menu Key"
            r14 = 348(0x15c, float:4.88E-43)
            r2.<init>(r7, r14)
            r1[r13] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Arrow Up"
            r13 = 265(0x109, float:3.71E-43)
            r2.<init>(r7, r13)
            r7 = 33
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Arrow Down"
            r13 = 264(0x108, float:3.7E-43)
            r2.<init>(r7, r13)
            r7 = 34
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Arrow Left"
            r13 = 263(0x107, float:3.69E-43)
            r2.<init>(r7, r13)
            r7 = 35
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Arrow Right"
            r13 = 262(0x106, float:3.67E-43)
            r2.<init>(r7, r13)
            r7 = 36
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "E / Inventory"
            r13 = 69
            r2.<init>(r7, r13)
            r7 = 37
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "Q / Drop"
            r14 = 81
            r2.<init>(r7, r14)
            r7 = 38
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r7 = "F / Swap Offhand"
            r15 = 70
            r2.<init>(r7, r15)
            r7 = 39
            r1[r7] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r8 = "T / Chat"
            r5 = 84
            r2.<init>(r8, r5)
            r8 = 40
            r1[r8] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r8 = "Slash / Command"
            r3 = 47
            r2.<init>(r8, r3)
            r8 = 41
            r1[r8] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r8 = "B"
            r4 = 66
            r2.<init>(r8, r4)
            r8 = 42
            r1[r8] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r8 = "C"
            r6 = 67
            r2.<init>(r8, r6)
            r8 = 43
            r1[r8] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r8 = "G"
            r7 = 71
            r2.<init>(r8, r7)
            r8 = 44
            r1[r8] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r8 = "H"
            r9 = 72
            r2.<init>(r8, r9)
            r8 = 45
            r1[r8] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r2 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r9 = "I"
            r0 = 73
            r2.<init>(r9, r0)
            r0 = 46
            r1[r0] = r2
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "J"
            r9 = 74
            r0.<init>(r2, r9)
            r1[r3] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "K"
            r3 = 75
            r0.<init>(r2, r3)
            r2 = 48
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "L"
            r3 = 76
            r0.<init>(r2, r3)
            r2 = 49
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "M"
            r3 = 77
            r0.<init>(r2, r3)
            r2 = 50
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "N"
            r3 = 78
            r0.<init>(r2, r3)
            r2 = 51
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "O"
            r3 = 79
            r0.<init>(r2, r3)
            r2 = 52
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "P"
            r3 = 80
            r0.<init>(r2, r3)
            r2 = 53
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "R"
            r3 = 82
            r0.<init>(r2, r3)
            r2 = 54
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "U"
            r3 = 85
            r0.<init>(r2, r3)
            r2 = 55
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "V"
            r3 = 86
            r0.<init>(r2, r3)
            r2 = 56
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "X"
            r3 = 88
            r0.<init>(r2, r3)
            r2 = 57
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Y"
            r3 = 89
            r0.<init>(r2, r3)
            r2 = 58
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Z"
            r3 = 90
            r0.<init>(r2, r3)
            r2 = 59
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "1 / Hotbar 1"
            r3 = 49
            r0.<init>(r2, r3)
            r2 = 60
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "2 / Hotbar 2"
            r3 = 50
            r0.<init>(r2, r3)
            r2 = 61
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "3 / Hotbar 3"
            r3 = 51
            r0.<init>(r2, r3)
            r2 = 62
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "4 / Hotbar 4"
            r3 = 52
            r0.<init>(r2, r3)
            r2 = 63
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "5 / Hotbar 5"
            r3 = 53
            r0.<init>(r2, r3)
            r2 = 64
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "6 / Hotbar 6"
            r3 = 54
            r0.<init>(r2, r3)
            r1[r10] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "7 / Hotbar 7"
            r3 = 55
            r0.<init>(r2, r3)
            r1[r4] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "8 / Hotbar 8"
            r3 = 56
            r0.<init>(r2, r3)
            r1[r6] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "9 / Hotbar 9"
            r3 = 57
            r0.<init>(r2, r3)
            r1[r12] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "0"
            r3 = 48
            r0.<init>(r2, r3)
            r1[r13] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F1"
            r3 = 290(0x122, float:4.06E-43)
            r0.<init>(r2, r3)
            r1[r15] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F2 / Screenshot"
            r3 = 291(0x123, float:4.08E-43)
            r0.<init>(r2, r3)
            r1[r7] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F3 / Debug"
            r3 = 292(0x124, float:4.09E-43)
            r0.<init>(r2, r3)
            r2 = 72
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F4"
            r3 = 293(0x125, float:4.1E-43)
            r0.<init>(r2, r3)
            r2 = 73
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F5 / Perspective"
            r3 = 294(0x126, float:4.12E-43)
            r0.<init>(r2, r3)
            r2 = 74
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F6"
            r3 = 295(0x127, float:4.13E-43)
            r0.<init>(r2, r3)
            r2 = 75
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F7"
            r3 = 296(0x128, float:4.15E-43)
            r0.<init>(r2, r3)
            r2 = 76
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F8"
            r3 = 297(0x129, float:4.16E-43)
            r0.<init>(r2, r3)
            r2 = 77
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F9"
            r3 = 298(0x12a, float:4.18E-43)
            r0.<init>(r2, r3)
            r2 = 78
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F10"
            r3 = 299(0x12b, float:4.19E-43)
            r0.<init>(r2, r3)
            r2 = 79
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F11"
            r3 = 300(0x12c, float:4.2E-43)
            r0.<init>(r2, r3)
            r2 = 80
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "F12"
            r3 = 301(0x12d, float:4.22E-43)
            r0.<init>(r2, r3)
            r1[r14] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Minus / -"
            r0.<init>(r2, r8)
            r2 = 82
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Equals / ="
            r3 = 61
            r0.<init>(r2, r3)
            r1[r11] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Left bracket / ["
            r3 = 91
            r0.<init>(r2, r3)
            r1[r5] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Right bracket / ]"
            r3 = 93
            r0.<init>(r2, r3)
            r2 = 85
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Backslash / \\"
            r3 = 92
            r0.<init>(r2, r3)
            r2 = 86
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Semicolon / ;"
            r3 = 59
            r0.<init>(r2, r3)
            r2 = 87
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Apostrophe / '"
            r3 = 39
            r0.<init>(r2, r3)
            r2 = 88
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Grave / `"
            r3 = 96
            r0.<init>(r2, r3)
            r2 = 89
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Comma / ,"
            r3 = 44
            r0.<init>(r2, r3)
            r2 = 90
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Period / ."
            r3 = 46
            r0.<init>(r2, r3)
            r2 = 91
            r1[r2] = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding.KEY_OPTIONS = r1
            r0 = 3
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[r0]
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r1 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Left click / Attack"
            r3 = 0
            r1.<init>(r2, r3)
            r0[r3] = r1
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r1 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Right click / Use"
            r3 = 1
            r1.<init>(r2, r3)
            r0[r3] = r1
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r1 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Middle click / Pick block"
            r4 = 2
            r1.<init>(r2, r4)
            r0[r4] = r1
            ca.dnamobile.javalauncher.controls.TouchInputBinding.MOUSE_OPTIONS = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[r4]
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r1 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r2 = "Scroll up"
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r1 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r4 = "Scroll down"
            r5 = -1
            r1.<init>(r4, r5)
            r0[r3] = r1
            ca.dnamobile.javalauncher.controls.TouchInputBinding.SCROLL_OPTIONS = r0
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r0 = new ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[r3]
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option r1 = new ca.dnamobile.javalauncher.controls.TouchInputBinding$Option
            java.lang.String r3 = "No extra binding needed"
            r1.<init>(r3, r2)
            r0[r2] = r1
            ca.dnamobile.javalauncher.controls.TouchInputBinding.EMPTY_OPTIONS = r0
            return
    }

    private TouchInputBinding() {
            r0 = this;
            r0.<init>()
            return
    }

    static int actionIndex(java.lang.String r4) {
            java.lang.String[] r0 = actionValues()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.length
            if (r2 >= r3) goto L15
            r3 = r0[r2]
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L12
            return r2
        L12:
            int r2 = r2 + 1
            goto L6
        L15:
            return r1
    }

    static java.lang.String[] actionLabels() {
            r0 = 9
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "Keyboard / mouse slots"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "Single mouse button"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "Single scroll wheel"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "Open launcher menu"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "Show / hide touch controls"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "Open Android keyboard"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "Open key sender keyboard"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "Joystick / WASD"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "Toggle virtual cursor"
            r0[r1] = r2
            return r0
    }

    static java.lang.String[] actionValues() {
            r0 = 9
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "key"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "mouse"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "scroll"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "menu"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "toggle_controls"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "keyboard"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "key_sender_keyboard"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "joystick"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "virtual_mouse"
            r0[r1] = r2
            return r0
    }

    static void applyOption(ca.dnamobile.javalauncher.controls.TouchControlData r1, java.lang.String r2, ca.dnamobile.javalauncher.controls.TouchInputBinding.Option r3) {
            r1.action = r2
            java.lang.String r0 = "key"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            int r2 = r3.value
            r0 = 0
            if (r2 <= 0) goto L12
            int r2 = r3.value
            goto L13
        L12:
            r2 = r0
        L13:
            r1.keyCode = r2
            int r2 = r3.value
            if (r2 != 0) goto L1c
            int[] r2 = new int[r0]
            goto L23
        L1c:
            r2 = 1
            int[] r2 = new int[r2]
            int r3 = r3.value
            r2[r0] = r3
        L23:
            r1.setKeyCodes(r2)
            goto L40
        L27:
            java.lang.String r0 = "mouse"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L34
            int r2 = r3.value
            r1.mouseButton = r2
            goto L40
        L34:
            java.lang.String r0 = "scroll"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L40
            int r2 = r3.value
            r1.scrollY = r2
        L40:
            return
    }

    static java.lang.String friendlyKeyCombo(int[] r6) {
            int r0 = r6.length
            java.lang.String r1 = "No bindings"
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r6.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L29
            r4 = r6[r3]
            if (r4 != 0) goto L14
            goto L26
        L14:
            int r5 = r0.length()
            if (r5 <= 0) goto L1f
            java.lang.String r5 = " + "
            r0.append(r5)
        L1f:
            java.lang.String r4 = labelForKeyCode(r4)
            r0.append(r4)
        L26:
            int r3 = r3 + 1
            goto Ld
        L29:
            int r6 = r0.length()
            if (r6 != 0) goto L30
            goto L34
        L30:
            java.lang.String r1 = r0.toString()
        L34:
            return r1
    }

    static java.lang.String labelForKeyCode(int r5) {
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r0 = ca.dnamobile.javalauncher.controls.TouchInputBinding.KEY_OPTIONS
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.value
            if (r4 != r5) goto Lf
            java.lang.String r5 = r3.label
            return r5
        Lf:
            int r2 = r2 + 1
            goto L4
        L12:
            r0 = 65
            if (r5 < r0) goto L20
            r0 = 90
            if (r5 > r0) goto L20
            char r5 = (char) r5
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
        L20:
            r0 = 48
            if (r5 < r0) goto L2e
            r0 = 57
            if (r5 > r0) goto L2e
            char r5 = (char) r5
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
        L2e:
            r0 = 32
            if (r5 == r0) goto L10d
            r0 = 39
            if (r5 == r0) goto L10a
            r0 = 59
            if (r5 == r0) goto L107
            r0 = 61
            if (r5 == r0) goto L104
            r0 = 96
            if (r5 == r0) goto L101
            r0 = 348(0x15c, float:4.88E-43)
            if (r5 == r0) goto Lfe
            switch(r5) {
                case -10: goto Lfb;
                case -9: goto Lf8;
                case -8: goto Lf5;
                case -7: goto Lf2;
                case -6: goto Lef;
                case -5: goto Lec;
                case -4: goto Le9;
                case -3: goto Le6;
                case -2: goto Le3;
                case -1: goto Le0;
                default: goto L49;
            }
        L49:
            switch(r5) {
                case 44: goto Ldd;
                case 45: goto Lda;
                case 46: goto Ld7;
                case 47: goto Ld4;
                default: goto L4c;
            }
        L4c:
            switch(r5) {
                case 91: goto Ld1;
                case 92: goto Lce;
                case 93: goto Lcb;
                default: goto L4f;
            }
        L4f:
            switch(r5) {
                case 256: goto Lc8;
                case 257: goto Lc5;
                case 258: goto Lc2;
                case 259: goto Lbf;
                case 260: goto Lbc;
                case 261: goto Lb9;
                case 262: goto Lb6;
                case 263: goto Lb3;
                case 264: goto Lb0;
                case 265: goto Lad;
                case 266: goto Laa;
                case 267: goto La7;
                case 268: goto La4;
                case 269: goto La1;
                default: goto L52;
            }
        L52:
            switch(r5) {
                case 290: goto L9e;
                case 291: goto L9b;
                case 292: goto L98;
                case 293: goto L95;
                case 294: goto L92;
                case 295: goto L8f;
                case 296: goto L8c;
                case 297: goto L89;
                case 298: goto L86;
                case 299: goto L83;
                case 300: goto L80;
                case 301: goto L7d;
                default: goto L55;
            }
        L55:
            switch(r5) {
                case 340: goto L7a;
                case 341: goto L77;
                case 342: goto L74;
                default: goto L58;
            }
        L58:
            switch(r5) {
                case 344: goto L71;
                case 345: goto L6e;
                case 346: goto L6b;
                default: goto L5b;
            }
        L5b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            return r5
        L6b:
            java.lang.String r5 = "Right Alt"
            return r5
        L6e:
            java.lang.String r5 = "Right Ctrl"
            return r5
        L71:
            java.lang.String r5 = "Right Shift"
            return r5
        L74:
            java.lang.String r5 = "Left Alt"
            return r5
        L77:
            java.lang.String r5 = "Left Ctrl / Sprint"
            return r5
        L7a:
            java.lang.String r5 = "Left Shift / Sneak"
            return r5
        L7d:
            java.lang.String r5 = "F12"
            return r5
        L80:
            java.lang.String r5 = "F11"
            return r5
        L83:
            java.lang.String r5 = "F10"
            return r5
        L86:
            java.lang.String r5 = "F9"
            return r5
        L89:
            java.lang.String r5 = "F8"
            return r5
        L8c:
            java.lang.String r5 = "F7"
            return r5
        L8f:
            java.lang.String r5 = "F6"
            return r5
        L92:
            java.lang.String r5 = "F5 / Perspective"
            return r5
        L95:
            java.lang.String r5 = "F4"
            return r5
        L98:
            java.lang.String r5 = "F3 / Debug"
            return r5
        L9b:
            java.lang.String r5 = "F2 / Screenshot"
            return r5
        L9e:
            java.lang.String r5 = "F1"
            return r5
        La1:
            java.lang.String r5 = "End"
            return r5
        La4:
            java.lang.String r5 = "Home"
            return r5
        La7:
            java.lang.String r5 = "Page Down"
            return r5
        Laa:
            java.lang.String r5 = "Page Up"
            return r5
        Lad:
            java.lang.String r5 = "Arrow Up"
            return r5
        Lb0:
            java.lang.String r5 = "Arrow Down"
            return r5
        Lb3:
            java.lang.String r5 = "Arrow Left"
            return r5
        Lb6:
            java.lang.String r5 = "Arrow Right"
            return r5
        Lb9:
            java.lang.String r5 = "Delete"
            return r5
        Lbc:
            java.lang.String r5 = "Insert"
            return r5
        Lbf:
            java.lang.String r5 = "Backspace"
            return r5
        Lc2:
            java.lang.String r5 = "Tab / Player List"
            return r5
        Lc5:
            java.lang.String r5 = "Enter"
            return r5
        Lc8:
            java.lang.String r5 = "Escape / Pause"
            return r5
        Lcb:
            java.lang.String r5 = "Right bracket / ]"
            return r5
        Lce:
            java.lang.String r5 = "Backslash / \\"
            return r5
        Ld1:
            java.lang.String r5 = "Left bracket / ["
            return r5
        Ld4:
            java.lang.String r5 = "Slash / Command"
            return r5
        Ld7:
            java.lang.String r5 = "Period / ."
            return r5
        Lda:
            java.lang.String r5 = "Minus / -"
            return r5
        Ldd:
            java.lang.String r5 = "Comma / ,"
            return r5
        Le0:
            java.lang.String r5 = "Open Android keyboard"
            return r5
        Le3:
            java.lang.String r5 = "Show / hide touch controls"
            return r5
        Le6:
            java.lang.String r5 = "Mouse left click / Attack"
            return r5
        Le9:
            java.lang.String r5 = "Mouse right click / Use"
            return r5
        Lec:
            java.lang.String r5 = "Toggle virtual cursor"
            return r5
        Lef:
            java.lang.String r5 = "Mouse middle click / Pick block"
            return r5
        Lf2:
            java.lang.String r5 = "Mouse wheel up"
            return r5
        Lf5:
            java.lang.String r5 = "Mouse wheel down"
            return r5
        Lf8:
            java.lang.String r5 = "Open launcher menu"
            return r5
        Lfb:
            java.lang.String r5 = "Open key sender keyboard"
            return r5
        Lfe:
            java.lang.String r5 = "Menu Key"
            return r5
        L101:
            java.lang.String r5 = "Grave / `"
            return r5
        L104:
            java.lang.String r5 = "Equals / ="
            return r5
        L107:
            java.lang.String r5 = "Semicolon / ;"
            return r5
        L10a:
            java.lang.String r5 = "Apostrophe / '"
            return r5
        L10d:
            java.lang.String r5 = "Space / Jump"
            return r5
    }

    static java.lang.String[] optionLabels(ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r3) {
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L10
            r2 = r3[r1]
            java.lang.String r2 = r2.label
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L10:
            return r0
    }

    static ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] optionsForAction(java.lang.String r1) {
            java.lang.String r0 = "mouse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.MOUSE_OPTIONS
            return r1
        Lb:
            java.lang.String r0 = "scroll"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.SCROLL_OPTIONS
            return r1
        L16:
            java.lang.String r0 = "key"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.KEY_OPTIONS
            return r1
        L21:
            java.lang.String r0 = "joystick"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.EMPTY_OPTIONS
            return r1
        L2c:
            java.lang.String r0 = "key_sender_keyboard"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.EMPTY_OPTIONS
            return r1
        L37:
            java.lang.String r0 = "virtual_mouse"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L42
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.EMPTY_OPTIONS
            return r1
        L42:
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r1 = ca.dnamobile.javalauncher.controls.TouchInputBinding.EMPTY_OPTIONS
            return r1
    }

    static int selectedKeyOptionIndex(int r1) {
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r0 = ca.dnamobile.javalauncher.controls.TouchInputBinding.KEY_OPTIONS
            int r1 = selectedOptionIndexForValue(r0, r1)
            return r1
    }

    static int selectedOptionIndex(java.lang.String r2, ca.dnamobile.javalauncher.controls.TouchControlData r3) {
            int r0 = r3.keyCode
            java.lang.String r1 = "mouse"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc
            int r0 = r3.mouseButton
        Lc:
            java.lang.String r1 = "scroll"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L16
            int r0 = r3.scrollY
        L16:
            ca.dnamobile.javalauncher.controls.TouchInputBinding$Option[] r2 = optionsForAction(r2)
            int r2 = selectedOptionIndexForValue(r2, r0)
            return r2
    }

    private static int selectedOptionIndexForValue(ca.dnamobile.javalauncher.controls.TouchInputBinding.Option[] r3, int r4) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.length
            if (r1 >= r2) goto Lf
            r2 = r3[r1]
            int r2 = r2.value
            if (r2 != r4) goto Lc
            return r1
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return r0
    }
}
