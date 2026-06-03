package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class StrMatcher {
    private static final org.apache.commons.lang3.text.StrMatcher COMMA_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher DOUBLE_QUOTE_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher NONE_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher QUOTE_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher SINGLE_QUOTE_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher SPACE_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher SPLIT_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher TAB_MATCHER = null;
    private static final org.apache.commons.lang3.text.StrMatcher TRIM_MATCHER = null;

    static final class CharMatcher extends org.apache.commons.lang3.text.StrMatcher {
        private final char ch;

        CharMatcher(char r1) {
                r0 = this;
                r0.<init>()
                r0.ch = r1
                return
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] r1, int r2, int r3, int r4) {
                r0 = this;
                char r3 = r0.ch
                char r1 = r1[r2]
                if (r3 != r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }
    }

    static final class CharSetMatcher extends org.apache.commons.lang3.text.StrMatcher {
        private final char[] chars;

        CharSetMatcher(char[] r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = r1.clone()
                char[] r1 = (char[]) r1
                char[] r1 = org.apache.commons.lang3.ArraySorter.sort(r1)
                r0.chars = r1
                return
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] r1, int r2, int r3, int r4) {
                r0 = this;
                char[] r3 = r0.chars
                char r1 = r1[r2]
                int r1 = java.util.Arrays.binarySearch(r3, r1)
                if (r1 < 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    static final class NoMatcher extends org.apache.commons.lang3.text.StrMatcher {
        NoMatcher() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] r1, int r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static final class StringMatcher extends org.apache.commons.lang3.text.StrMatcher {
        private final char[] chars;

        StringMatcher(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                char[] r1 = r1.toCharArray()
                r0.chars = r1
                return
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] r4, int r5, int r6, int r7) {
                r3 = this;
                char[] r6 = r3.chars
                int r6 = r6.length
                int r0 = r5 + r6
                r1 = 0
                if (r0 <= r7) goto L9
                return r1
            L9:
                r7 = r1
            La:
                char[] r0 = r3.chars
                int r2 = r0.length
                if (r7 >= r2) goto L1b
                char r0 = r0[r7]
                char r2 = r4[r5]
                if (r0 == r2) goto L16
                return r1
            L16:
                int r7 = r7 + 1
                int r5 = r5 + 1
                goto La
            L1b:
                return r6
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 32
                java.lang.StringBuilder r0 = r0.append(r1)
                char[] r1 = r2.chars
                java.lang.String r1 = java.util.Arrays.toString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class TrimMatcher extends org.apache.commons.lang3.text.StrMatcher {
        TrimMatcher() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.StrMatcher
        public int isMatch(char[] r1, int r2, int r3, int r4) {
                r0 = this;
                char r1 = r1[r2]
                r2 = 32
                if (r1 > r2) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }
    }

    static {
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r1 = 44
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrMatcher.COMMA_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r1 = 9
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrMatcher.TAB_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r1 = 32
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrMatcher.SPACE_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharSetMatcher
            java.lang.String r1 = " \t\n\r\f"
            char[] r1 = r1.toCharArray()
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrMatcher.SPLIT_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$TrimMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$TrimMatcher
            r0.<init>()
            org.apache.commons.lang3.text.StrMatcher.TRIM_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r1 = 39
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrMatcher.SINGLE_QUOTE_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r1 = 34
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrMatcher.DOUBLE_QUOTE_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharSetMatcher
            java.lang.String r1 = "'\""
            char[] r1 = r1.toCharArray()
            r0.<init>(r1)
            org.apache.commons.lang3.text.StrMatcher.QUOTE_MATCHER = r0
            org.apache.commons.lang3.text.StrMatcher$NoMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$NoMatcher
            r0.<init>()
            org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER = r0
            return
    }

    protected StrMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.apache.commons.lang3.text.StrMatcher charMatcher(char r1) {
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r0.<init>(r1)
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(java.lang.String r2) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            org.apache.commons.lang3.text.StrMatcher r2 = org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER
            return r2
        L9:
            int r0 = r2.length()
            r1 = 1
            if (r0 != r1) goto L1b
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r1 = 0
            char r2 = r2.charAt(r1)
            r0.<init>(r2)
            return r0
        L1b:
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharSetMatcher
            char[] r2 = r2.toCharArray()
            r0.<init>(r2)
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher charSetMatcher(char... r2) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            org.apache.commons.lang3.text.StrMatcher r2 = org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER
            return r2
        L9:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L16
            org.apache.commons.lang3.text.StrMatcher$CharMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharMatcher
            r1 = 0
            char r2 = r2[r1]
            r0.<init>(r2)
            return r0
        L16:
            org.apache.commons.lang3.text.StrMatcher$CharSetMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$CharSetMatcher
            r0.<init>(r2)
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher commaMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.COMMA_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher doubleQuoteMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.DOUBLE_QUOTE_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher noneMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher quoteMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.QUOTE_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher singleQuoteMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.SINGLE_QUOTE_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher spaceMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.SPACE_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher splitMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.SPLIT_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher stringMatcher(java.lang.String r1) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.NONE_MATCHER
            return r1
        L9:
            org.apache.commons.lang3.text.StrMatcher$StringMatcher r0 = new org.apache.commons.lang3.text.StrMatcher$StringMatcher
            r0.<init>(r1)
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher tabMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.TAB_MATCHER
            return r0
    }

    public static org.apache.commons.lang3.text.StrMatcher trimMatcher() {
            org.apache.commons.lang3.text.StrMatcher r0 = org.apache.commons.lang3.text.StrMatcher.TRIM_MATCHER
            return r0
    }

    public int isMatch(char[] r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.isMatch(r3, r4, r0, r1)
            return r3
    }

    public abstract int isMatch(char[] r1, int r2, int r3, int r4);
}
