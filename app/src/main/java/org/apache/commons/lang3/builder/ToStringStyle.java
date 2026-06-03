package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ToStringStyle implements java.io.Serializable {
    public static final org.apache.commons.lang3.builder.ToStringStyle DEFAULT_STYLE = null;
    public static final org.apache.commons.lang3.builder.ToStringStyle JSON_STYLE = null;
    public static final org.apache.commons.lang3.builder.ToStringStyle MULTI_LINE_STYLE = null;
    public static final org.apache.commons.lang3.builder.ToStringStyle NO_CLASS_NAME_STYLE = null;
    public static final org.apache.commons.lang3.builder.ToStringStyle NO_FIELD_NAMES_STYLE = null;
    private static final java.lang.ThreadLocal<java.util.WeakHashMap<java.lang.Object, java.lang.Object>> REGISTRY = null;
    public static final org.apache.commons.lang3.builder.ToStringStyle SHORT_PREFIX_STYLE = null;
    public static final org.apache.commons.lang3.builder.ToStringStyle SIMPLE_STYLE = null;
    private static final long serialVersionUID = -2587890625525655916L;
    private boolean arrayContentDetail;
    private java.lang.String arrayEnd;
    private java.lang.String arraySeparator;
    private java.lang.String arrayStart;
    private java.lang.String contentEnd;
    private java.lang.String contentStart;
    private boolean defaultFullDetail;
    private java.lang.String fieldNameValueSeparator;
    private java.lang.String fieldSeparator;
    private boolean fieldSeparatorAtEnd;
    private boolean fieldSeparatorAtStart;
    private java.lang.String nullText;
    private java.lang.String sizeEndText;
    private java.lang.String sizeStartText;
    private java.lang.String summaryObjectEndText;
    private java.lang.String summaryObjectStartText;
    private boolean useClassName;
    private boolean useFieldNames;
    private boolean useIdentityHashCode;
    private boolean useShortClassName;

    private static final class DefaultToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1;

        DefaultToStringStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.DefaultToStringStyle.DEFAULT_STYLE
                return r0
        }
    }

    private static final class JsonToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final java.lang.String FIELD_NAME_QUOTE = "\"";
        private static final long serialVersionUID = 1;

        JsonToStringStyle() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.setUseClassName(r0)
                r2.setUseIdentityHashCode(r0)
                java.lang.String r0 = "{"
                r2.setContentStart(r0)
                java.lang.String r0 = "}"
                r2.setContentEnd(r0)
                java.lang.String r0 = "["
                r2.setArrayStart(r0)
                java.lang.String r0 = "]"
                r2.setArrayEnd(r0)
                java.lang.String r0 = ","
                r2.setFieldSeparator(r0)
                java.lang.String r0 = ":"
                r2.setFieldNameValueSeparator(r0)
                java.lang.String r0 = "null"
                r2.setNullText(r0)
                java.lang.String r0 = "\"<"
                r2.setSummaryObjectStartText(r0)
                java.lang.String r0 = ">\""
                r2.setSummaryObjectEndText(r0)
                java.lang.String r1 = "\"<size="
                r2.setSizeStartText(r1)
                r2.setSizeEndText(r0)
                return
        }

        private void appendValueAsString(java.lang.StringBuffer r2, java.lang.String r3) {
                r1 = this;
                r0 = 34
                java.lang.StringBuffer r2 = r2.append(r0)
                java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.escapeJson(r3)
                java.lang.StringBuffer r2 = r2.append(r3)
                r2.append(r0)
                return
        }

        private boolean isJsonArray(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = r1.getArrayStart()
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L16
                java.lang.String r0 = r1.getArrayEnd()
                boolean r2 = r2.endsWith(r0)
                if (r2 == 0) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }

        private boolean isJsonObject(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = r1.getContentStart()
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L16
                java.lang.String r0 = r1.getContentEnd()
                boolean r2 = r2.endsWith(r0)
                if (r2 == 0) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.JsonToStringStyle.JSON_STYLE
                return r0
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, java.lang.Object r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, byte[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, char[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, double[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, float[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, int[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, long[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, java.lang.Object[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, short[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void append(java.lang.StringBuffer r2, java.lang.String r3, boolean[] r4, java.lang.Boolean r5) {
                r1 = this;
                if (r3 == 0) goto L14
                boolean r0 = r1.isFullDetail(r5)
                if (r0 == 0) goto Lc
                super.append(r2, r3, r4, r5)
                return
            Lc:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "FullDetail must be true when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
            L14:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r3 = "Field names are mandatory when using JsonToStringStyle"
                r2.<init>(r3)
                throw r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, char r3) {
                r0 = this;
                java.lang.String r2 = java.lang.String.valueOf(r3)
                r0.appendValueAsString(r1, r2)
                return
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, java.lang.Object r5) {
                r2 = this;
                if (r5 != 0) goto L6
                r2.appendNullText(r3, r4)
                return
            L6:
                boolean r0 = r5 instanceof java.lang.String
                if (r0 != 0) goto L35
                boolean r0 = r5 instanceof java.lang.Character
                if (r0 == 0) goto Lf
                goto L35
            Lf:
                boolean r0 = r5 instanceof java.lang.Number
                if (r0 != 0) goto L31
                boolean r0 = r5 instanceof java.lang.Boolean
                if (r0 == 0) goto L18
                goto L31
            L18:
                java.lang.String r0 = r5.toString()
                boolean r1 = r2.isJsonObject(r0)
                if (r1 != 0) goto L2d
                boolean r1 = r2.isJsonArray(r0)
                if (r1 == 0) goto L29
                goto L2d
            L29:
                r2.appendDetail(r3, r4, r0)
                return
            L2d:
                r3.append(r5)
                return
            L31:
                r3.append(r5)
                return
            L35:
                java.lang.String r4 = r5.toString()
                r2.appendValueAsString(r3, r4)
                return
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        protected void appendDetail(java.lang.StringBuffer r4, java.lang.String r5, java.util.Collection<?> r6) {
                r3 = this;
                if (r6 == 0) goto L2d
                boolean r0 = r6.isEmpty()
                if (r0 != 0) goto L2d
                java.lang.String r0 = r3.getArrayStart()
                r4.append(r0)
                java.util.Iterator r6 = r6.iterator()
                r0 = 0
            L14:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r6.next()
                int r2 = r0 + 1
                r3.appendDetail(r4, r5, r0, r1)
                r0 = r2
                goto L14
            L25:
                java.lang.String r5 = r3.getArrayEnd()
                r4.append(r5)
                return
            L2d:
                r4.append(r6)
                return
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        protected void appendDetail(java.lang.StringBuffer r5, java.lang.String r6, java.util.Map<?, ?> r7) {
                r4 = this;
                if (r7 == 0) goto L50
                boolean r6 = r7.isEmpty()
                if (r6 != 0) goto L50
                java.lang.String r6 = r4.getContentStart()
                r5.append(r6)
                java.util.Set r6 = r7.entrySet()
                java.util.Iterator r6 = r6.iterator()
                r7 = 1
                r0 = r7
            L19:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L48
                java.lang.Object r1 = r6.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                r3 = 0
                java.lang.String r2 = java.util.Objects.toString(r2, r3)
                if (r2 == 0) goto L19
                if (r0 == 0) goto L34
                r0 = 0
                goto L37
            L34:
                r4.appendFieldEnd(r5, r2)
            L37:
                r4.appendFieldStart(r5, r2)
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L44
                r4.appendNullText(r5, r2)
                goto L19
            L44:
                r4.appendInternal(r5, r2, r1, r7)
                goto L19
            L48:
                java.lang.String r6 = r4.getContentEnd()
                r5.append(r6)
                return
            L50:
                r5.append(r7)
                return
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        protected void appendFieldStart(java.lang.StringBuffer r3, java.lang.String r4) {
                r2 = this;
                if (r4 == 0) goto L1d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "\""
                r0.<init>(r1)
                java.lang.String r4 = org.apache.commons.lang3.StringEscapeUtils.escapeJson(r4)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r4 = r4.toString()
                super.appendFieldStart(r3, r4)
                return
            L1d:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r4 = "Field names are mandatory when using JsonToStringStyle"
                r3.<init>(r4)
                throw r3
        }
    }

    private static final class MultiLineToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1;

        MultiLineToStringStyle() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "["
                r2.setContentStart(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = java.lang.System.lineSeparator()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "  "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setFieldSeparator(r0)
                r0 = 1
                r2.setFieldSeparatorAtStart(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = java.lang.System.lineSeparator()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setContentEnd(r0)
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.MultiLineToStringStyle.MULTI_LINE_STYLE
                return r0
        }
    }

    private static final class NoClassNameToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1;

        NoClassNameToStringStyle() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.setUseClassName(r0)
                r1.setUseIdentityHashCode(r0)
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.NoClassNameToStringStyle.NO_CLASS_NAME_STYLE
                return r0
        }
    }

    private static final class NoFieldNameToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1;

        NoFieldNameToStringStyle() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.setUseFieldNames(r0)
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.NoFieldNameToStringStyle.NO_FIELD_NAMES_STYLE
                return r0
        }
    }

    private static final class ShortPrefixToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1;

        ShortPrefixToStringStyle() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.setUseShortClassName(r0)
                r0 = 0
                r1.setUseIdentityHashCode(r0)
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.ShortPrefixToStringStyle.SHORT_PREFIX_STYLE
                return r0
        }
    }

    private static final class SimpleToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1;

        SimpleToStringStyle() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.setUseClassName(r0)
                r1.setUseIdentityHashCode(r0)
                r1.setUseFieldNames(r0)
                java.lang.String r0 = ""
                r1.setContentStart(r0)
                r1.setContentEnd(r0)
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.SimpleToStringStyle.SIMPLE_STYLE
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$MSb-ZIt9Svlzq1LgR6lqIQHlf6s, reason: not valid java name */
    public static /* synthetic */ java.util.WeakHashMap m2665$r8$lambda$MSbZIt9Svlzq1LgR6lqIQHlf6s() {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            return r0
    }

    static {
            org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle r0 = new org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle
            r0.<init>()
            org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE = r0
            org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle r0 = new org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle
            r0.<init>()
            org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE = r0
            org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle r0 = new org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle
            r0.<init>()
            org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE = r0
            org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle r0 = new org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle
            r0.<init>()
            org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE = r0
            org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle r0 = new org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle
            r0.<init>()
            org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE = r0
            org.apache.commons.lang3.builder.ToStringStyle$NoClassNameToStringStyle r0 = new org.apache.commons.lang3.builder.ToStringStyle$NoClassNameToStringStyle
            r0.<init>()
            org.apache.commons.lang3.builder.ToStringStyle.NO_CLASS_NAME_STYLE = r0
            org.apache.commons.lang3.builder.ToStringStyle$JsonToStringStyle r0 = new org.apache.commons.lang3.builder.ToStringStyle$JsonToStringStyle
            r0.<init>()
            org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE = r0
            org.apache.commons.lang3.builder.ToStringStyle$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.builder.ToStringStyle$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.apache.commons.lang3.builder.ToStringStyle.REGISTRY = r0
            return
    }

    protected ToStringStyle() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.useFieldNames = r0
            r3.useClassName = r0
            r3.useIdentityHashCode = r0
            java.lang.String r1 = "["
            r3.contentStart = r1
            java.lang.String r1 = "]"
            r3.contentEnd = r1
            java.lang.String r1 = "="
            r3.fieldNameValueSeparator = r1
            java.lang.String r1 = ","
            r3.fieldSeparator = r1
            java.lang.String r2 = "{"
            r3.arrayStart = r2
            r3.arraySeparator = r1
            r3.arrayContentDetail = r0
            java.lang.String r1 = "}"
            r3.arrayEnd = r1
            r3.defaultFullDetail = r0
            java.lang.String r0 = "<null>"
            r3.nullText = r0
            java.lang.String r0 = "<size="
            r3.sizeStartText = r0
            java.lang.String r0 = ">"
            r3.sizeEndText = r0
            java.lang.String r1 = "<"
            r3.summaryObjectStartText = r1
            r3.summaryObjectEndText = r0
            return
    }

    public static java.util.Map<java.lang.Object, java.lang.Object> getRegistry() {
            java.lang.ThreadLocal<java.util.WeakHashMap<java.lang.Object, java.lang.Object>> r0 = org.apache.commons.lang3.builder.ToStringStyle.REGISTRY
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    static boolean isRegistered(java.lang.Object r1) {
            java.util.Map r0 = getRegistry()
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    static void register(java.lang.Object r2) {
            if (r2 == 0) goto La
            java.util.Map r0 = getRegistry()
            r1 = 0
            r0.put(r2, r1)
        La:
            return
    }

    static void unregister(java.lang.Object r1) {
            if (r1 == 0) goto L14
            java.util.Map r0 = getRegistry()
            r0.remove(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L14
            java.lang.ThreadLocal<java.util.WeakHashMap<java.lang.Object, java.lang.Object>> r1 = org.apache.commons.lang3.builder.ToStringStyle.REGISTRY
            r1.remove()
        L14:
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, byte r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, char r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, double r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, float r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, java.lang.Object r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L10
        L9:
            boolean r4 = r0.isFullDetail(r4)
            r0.appendInternal(r1, r2, r3, r4)
        L10:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, short r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            r0.appendDetail(r1, r2, r3)
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, byte[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, char[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, double[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, float[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, int[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, long[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, short[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    public void append(java.lang.StringBuffer r1, java.lang.String r2, boolean[] r3, java.lang.Boolean r4) {
            r0 = this;
            r0.appendFieldStart(r1, r2)
            if (r3 != 0) goto L9
            r0.appendNullText(r1, r2)
            goto L16
        L9:
            boolean r4 = r0.isFullDetail(r4)
            if (r4 == 0) goto L13
            r0.appendDetail(r1, r2, r3)
            goto L16
        L13:
            r0.appendSummary(r1, r2, r3)
        L16:
            r0.appendFieldEnd(r1, r2)
            return
    }

    protected void appendClassName(java.lang.StringBuffer r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.useClassName
            if (r0 == 0) goto L24
            if (r3 == 0) goto L24
            register(r3)
            boolean r0 = r1.useShortClassName
            if (r0 == 0) goto L19
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r1.getShortClassName(r3)
            r2.append(r3)
            goto L24
        L19:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
        L24:
            return
    }

    protected void appendContentEnd(java.lang.StringBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.contentEnd
            r2.append(r0)
            return
    }

    protected void appendContentStart(java.lang.StringBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.contentStart
            r2.append(r0)
            return
    }

    protected void appendCyclicObject(java.lang.StringBuffer r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            org.apache.commons.lang3.ObjectUtils.identityToString(r1, r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, byte r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, char r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, double r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, float r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, int r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r0 = this;
            if (r3 <= 0) goto L7
            java.lang.String r3 = r0.arraySeparator
            r1.append(r3)
        L7:
            if (r4 != 0) goto Ld
            r0.appendNullText(r1, r2)
            goto L12
        Ld:
            boolean r3 = r0.arrayContentDetail
            r0.appendInternal(r1, r2, r4, r3)
        L12:
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, long r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, java.util.Collection<?> r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, java.util.Map<?, ?> r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, short r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r1.append(r3)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, byte[] r5) {
            r2 = this;
            java.lang.String r0 = r2.arrayStart
            r3.append(r0)
            r0 = 0
        L6:
            int r1 = r5.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r2.arraySeparator
            r3.append(r1)
        L10:
            r1 = r5[r0]
            r2.appendDetail(r3, r4, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r4 = r2.arrayEnd
            r3.append(r4)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, char[] r5) {
            r2 = this;
            java.lang.String r0 = r2.arrayStart
            r3.append(r0)
            r0 = 0
        L6:
            int r1 = r5.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r2.arraySeparator
            r3.append(r1)
        L10:
            char r1 = r5[r0]
            r2.appendDetail(r3, r4, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r4 = r2.arrayEnd
            r3.append(r4)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r4, java.lang.String r5, double[] r6) {
            r3 = this;
            java.lang.String r0 = r3.arrayStart
            r4.append(r0)
            r0 = 0
        L6:
            int r1 = r6.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r3.arraySeparator
            r4.append(r1)
        L10:
            r1 = r6[r0]
            r3.appendDetail(r4, r5, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r5 = r3.arrayEnd
            r4.append(r5)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, float[] r5) {
            r2 = this;
            java.lang.String r0 = r2.arrayStart
            r3.append(r0)
            r0 = 0
        L6:
            int r1 = r5.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r2.arraySeparator
            r3.append(r1)
        L10:
            r1 = r5[r0]
            r2.appendDetail(r3, r4, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r4 = r2.arrayEnd
            r3.append(r4)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, int[] r5) {
            r2 = this;
            java.lang.String r0 = r2.arrayStart
            r3.append(r0)
            r0 = 0
        L6:
            int r1 = r5.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r2.arraySeparator
            r3.append(r1)
        L10:
            r1 = r5[r0]
            r2.appendDetail(r3, r4, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r4 = r2.arrayEnd
            r3.append(r4)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r4, java.lang.String r5, long[] r6) {
            r3 = this;
            java.lang.String r0 = r3.arrayStart
            r4.append(r0)
            r0 = 0
        L6:
            int r1 = r6.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r3.arraySeparator
            r4.append(r1)
        L10:
            r1 = r6[r0]
            r3.appendDetail(r4, r5, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r5 = r3.arrayEnd
            r4.append(r5)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, java.lang.Object[] r5) {
            r2 = this;
            java.lang.String r0 = r2.arrayStart
            r3.append(r0)
            r0 = 0
        L6:
            int r1 = r5.length
            if (r0 >= r1) goto L11
            r1 = r5[r0]
            r2.appendDetail(r3, r4, r0, r1)
            int r0 = r0 + 1
            goto L6
        L11:
            java.lang.String r4 = r2.arrayEnd
            r3.append(r4)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, short[] r5) {
            r2 = this;
            java.lang.String r0 = r2.arrayStart
            r3.append(r0)
            r0 = 0
        L6:
            int r1 = r5.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r2.arraySeparator
            r3.append(r1)
        L10:
            short r1 = r5[r0]
            r2.appendDetail(r3, r4, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r4 = r2.arrayEnd
            r3.append(r4)
            return
    }

    protected void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, boolean[] r5) {
            r2 = this;
            java.lang.String r0 = r2.arrayStart
            r3.append(r0)
            r0 = 0
        L6:
            int r1 = r5.length
            if (r0 >= r1) goto L18
            if (r0 <= 0) goto L10
            java.lang.String r1 = r2.arraySeparator
            r3.append(r1)
        L10:
            boolean r1 = r5[r0]
            r2.appendDetail(r3, r4, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            java.lang.String r4 = r2.arrayEnd
            r3.append(r4)
            return
    }

    public void appendEnd(java.lang.StringBuffer r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.fieldSeparatorAtEnd
            if (r0 != 0) goto L7
            r1.removeLastFieldSeparator(r2)
        L7:
            r1.appendContentEnd(r2)
            unregister(r3)
            return
    }

    protected void appendFieldEnd(java.lang.StringBuffer r1, java.lang.String r2) {
            r0 = this;
            r0.appendFieldSeparator(r1)
            return
    }

    protected void appendFieldSeparator(java.lang.StringBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.fieldSeparator
            r2.append(r0)
            return
    }

    protected void appendFieldStart(java.lang.StringBuffer r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.useFieldNames
            if (r0 == 0) goto Le
            if (r3 == 0) goto Le
            r2.append(r3)
            java.lang.String r3 = r1.fieldNameValueSeparator
            r2.append(r3)
        Le:
            return
    }

    protected void appendIdentityHashCode(java.lang.StringBuffer r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isUseIdentityHashCode()
            if (r0 == 0) goto L17
            if (r3 == 0) goto L17
            register(r3)
            r0 = 64
            r2.append(r0)
            java.lang.String r3 = org.apache.commons.lang3.ObjectUtils.identityHashCodeHex(r3)
            r2.append(r3)
        L17:
            return
    }

    protected void appendInternal(java.lang.StringBuffer r2, java.lang.String r3, java.lang.Object r4, boolean r5) {
            r1 = this;
            boolean r0 = isRegistered(r4)
            if (r0 == 0) goto L16
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 != 0) goto L16
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 != 0) goto L16
            boolean r0 = r4 instanceof java.lang.Character
            if (r0 != 0) goto L16
            r1.appendCyclicObject(r2, r3, r4)
            return
        L16:
            register(r4)
            boolean r0 = r4 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L33
            if (r5 == 0) goto L27
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L27:
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L119
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L119
            r1.appendSummarySize(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L33:
            boolean r0 = r4 instanceof java.util.Map     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L4d
            if (r5 == 0) goto L41
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L41:
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L119
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L119
            r1.appendSummarySize(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L4d:
            boolean r0 = r4 instanceof long[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L63
            if (r5 == 0) goto L5b
            r5 = r4
            long[] r5 = (long[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L5b:
            r5 = r4
            long[] r5 = (long[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L63:
            boolean r0 = r4 instanceof int[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L79
            if (r5 == 0) goto L71
            r5 = r4
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L71:
            r5 = r4
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L79:
            boolean r0 = r4 instanceof short[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L8f
            if (r5 == 0) goto L87
            r5 = r4
            short[] r5 = (short[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L87:
            r5 = r4
            short[] r5 = (short[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L8f:
            boolean r0 = r4 instanceof byte[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto La5
            if (r5 == 0) goto L9d
            r5 = r4
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L9d:
            r5 = r4
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        La5:
            boolean r0 = r4 instanceof char[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto Lba
            if (r5 == 0) goto Lb3
            r5 = r4
            char[] r5 = (char[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Lb3:
            r5 = r4
            char[] r5 = (char[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Lba:
            boolean r0 = r4 instanceof double[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto Lce
            if (r5 == 0) goto Lc7
            r5 = r4
            double[] r5 = (double[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Lc7:
            r5 = r4
            double[] r5 = (double[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Lce:
            boolean r0 = r4 instanceof float[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto Le2
            if (r5 == 0) goto Ldb
            r5 = r4
            float[] r5 = (float[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Ldb:
            r5 = r4
            float[] r5 = (float[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Le2:
            boolean r0 = r4 instanceof boolean[]     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto Lf6
            if (r5 == 0) goto Lef
            r5 = r4
            boolean[] r5 = (boolean[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Lef:
            r5 = r4
            boolean[] r5 = (boolean[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        Lf6:
            boolean r0 = org.apache.commons.lang3.ObjectUtils.isArray(r4)     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L10c
            if (r5 == 0) goto L105
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendDetail(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L105:
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L119
            r1.appendSummary(r2, r3, r5)     // Catch: java.lang.Throwable -> L119
            goto L115
        L10c:
            if (r5 == 0) goto L112
            r1.appendDetail(r2, r3, r4)     // Catch: java.lang.Throwable -> L119
            goto L115
        L112:
            r1.appendSummary(r2, r3, r4)     // Catch: java.lang.Throwable -> L119
        L115:
            unregister(r4)
            return
        L119:
            r2 = move-exception
            unregister(r4)
            throw r2
    }

    protected void appendNullText(java.lang.StringBuffer r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = r0.nullText
            r1.append(r2)
            return
    }

    public void appendStart(java.lang.StringBuffer r1, java.lang.Object r2) {
            r0 = this;
            if (r2 == 0) goto L12
            r0.appendClassName(r1, r2)
            r0.appendIdentityHashCode(r1, r2)
            r0.appendContentStart(r1)
            boolean r2 = r0.fieldSeparatorAtStart
            if (r2 == 0) goto L12
            r0.appendFieldSeparator(r1)
        L12:
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            java.lang.String r2 = r0.summaryObjectStartText
            r1.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r0.getShortClassName(r2)
            r1.append(r2)
            java.lang.String r2 = r0.summaryObjectEndText
            r1.append(r2)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, byte[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, char[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, double[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, float[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, int[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, long[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, java.lang.Object[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, short[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummary(java.lang.StringBuffer r1, java.lang.String r2, boolean[] r3) {
            r0 = this;
            int r3 = r3.length
            r0.appendSummarySize(r1, r2, r3)
            return
    }

    protected void appendSummarySize(java.lang.StringBuffer r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.String r2 = r0.sizeStartText
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r0.sizeEndText
            r1.append(r2)
            return
    }

    public void appendSuper(java.lang.StringBuffer r1, java.lang.String r2) {
            r0 = this;
            r0.appendToString(r1, r2)
            return
    }

    public void appendToString(java.lang.StringBuffer r4, java.lang.String r5) {
            r3 = this;
            if (r5 == 0) goto L28
            java.lang.String r0 = r3.contentStart
            int r0 = r5.indexOf(r0)
            java.lang.String r1 = r3.contentStart
            int r1 = r1.length()
            int r0 = r0 + r1
            java.lang.String r1 = r3.contentEnd
            int r1 = r5.lastIndexOf(r1)
            if (r0 == r1) goto L28
            if (r0 < 0) goto L28
            if (r1 < 0) goto L28
            boolean r2 = r3.fieldSeparatorAtStart
            if (r2 == 0) goto L22
            r3.removeLastFieldSeparator(r4)
        L22:
            r4.append(r5, r0, r1)
            r3.appendFieldSeparator(r4)
        L28:
            return
    }

    protected java.lang.String getArrayEnd() {
            r1 = this;
            java.lang.String r0 = r1.arrayEnd
            return r0
    }

    protected java.lang.String getArraySeparator() {
            r1 = this;
            java.lang.String r0 = r1.arraySeparator
            return r0
    }

    protected java.lang.String getArrayStart() {
            r1 = this;
            java.lang.String r0 = r1.arrayStart
            return r0
    }

    protected java.lang.String getContentEnd() {
            r1 = this;
            java.lang.String r0 = r1.contentEnd
            return r0
    }

    protected java.lang.String getContentStart() {
            r1 = this;
            java.lang.String r0 = r1.contentStart
            return r0
    }

    protected java.lang.String getFieldNameValueSeparator() {
            r1 = this;
            java.lang.String r0 = r1.fieldNameValueSeparator
            return r0
    }

    protected java.lang.String getFieldSeparator() {
            r1 = this;
            java.lang.String r0 = r1.fieldSeparator
            return r0
    }

    protected java.lang.String getNullText() {
            r1 = this;
            java.lang.String r0 = r1.nullText
            return r0
    }

    protected java.lang.String getShortClassName(java.lang.Class<?> r1) {
            r0 = this;
            java.lang.String r1 = org.apache.commons.lang3.ClassUtils.getShortClassName(r1)
            return r1
    }

    protected java.lang.String getSizeEndText() {
            r1 = this;
            java.lang.String r0 = r1.sizeEndText
            return r0
    }

    protected java.lang.String getSizeStartText() {
            r1 = this;
            java.lang.String r0 = r1.sizeStartText
            return r0
    }

    protected java.lang.String getSummaryObjectEndText() {
            r1 = this;
            java.lang.String r0 = r1.summaryObjectEndText
            return r0
    }

    protected java.lang.String getSummaryObjectStartText() {
            r1 = this;
            java.lang.String r0 = r1.summaryObjectStartText
            return r0
    }

    protected boolean isArrayContentDetail() {
            r1 = this;
            boolean r0 = r1.arrayContentDetail
            return r0
    }

    protected boolean isDefaultFullDetail() {
            r1 = this;
            boolean r0 = r1.defaultFullDetail
            return r0
    }

    protected boolean isFieldSeparatorAtEnd() {
            r1 = this;
            boolean r0 = r1.fieldSeparatorAtEnd
            return r0
    }

    protected boolean isFieldSeparatorAtStart() {
            r1 = this;
            boolean r0 = r1.fieldSeparatorAtStart
            return r0
    }

    protected boolean isFullDetail(java.lang.Boolean r1) {
            r0 = this;
            if (r1 != 0) goto L5
            boolean r1 = r0.defaultFullDetail
            return r1
        L5:
            boolean r1 = r1.booleanValue()
            return r1
    }

    protected boolean isUseClassName() {
            r1 = this;
            boolean r0 = r1.useClassName
            return r0
    }

    protected boolean isUseFieldNames() {
            r1 = this;
            boolean r0 = r1.useFieldNames
            return r0
    }

    protected boolean isUseIdentityHashCode() {
            r1 = this;
            boolean r0 = r1.useIdentityHashCode
            return r0
    }

    protected boolean isUseShortClassName() {
            r1 = this;
            boolean r0 = r1.useShortClassName
            return r0
    }

    protected void reflectionAppendArrayDetail(java.lang.StringBuffer r4, java.lang.String r5, java.lang.Object r6) {
            r3 = this;
            java.lang.String r0 = r3.arrayStart
            r4.append(r0)
            int r0 = java.lang.reflect.Array.getLength(r6)
            r1 = 0
        La:
            if (r1 >= r0) goto L16
            java.lang.Object r2 = java.lang.reflect.Array.get(r6, r1)
            r3.appendDetail(r4, r5, r1, r2)
            int r1 = r1 + 1
            goto La
        L16:
            java.lang.String r5 = r3.arrayEnd
            r4.append(r5)
            return
    }

    protected void removeLastFieldSeparator(java.lang.StringBuffer r3) {
            r2 = this;
            java.lang.String r0 = r2.fieldSeparator
            boolean r0 = org.apache.commons.lang3.StringUtils.endsWith(r3, r0)
            if (r0 == 0) goto L16
            int r0 = r3.length()
            java.lang.String r1 = r2.fieldSeparator
            int r1 = r1.length()
            int r0 = r0 - r1
            r3.setLength(r0)
        L16:
            return
    }

    protected void setArrayContentDetail(boolean r1) {
            r0 = this;
            r0.arrayContentDetail = r1
            return
    }

    protected void setArrayEnd(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.arrayEnd = r1
            return
    }

    protected void setArraySeparator(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.arraySeparator = r1
            return
    }

    protected void setArrayStart(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.arrayStart = r1
            return
    }

    protected void setContentEnd(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.contentEnd = r1
            return
    }

    protected void setContentStart(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.contentStart = r1
            return
    }

    protected void setDefaultFullDetail(boolean r1) {
            r0 = this;
            r0.defaultFullDetail = r1
            return
    }

    protected void setFieldNameValueSeparator(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.fieldNameValueSeparator = r1
            return
    }

    protected void setFieldSeparator(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.fieldSeparator = r1
            return
    }

    protected void setFieldSeparatorAtEnd(boolean r1) {
            r0 = this;
            r0.fieldSeparatorAtEnd = r1
            return
    }

    protected void setFieldSeparatorAtStart(boolean r1) {
            r0 = this;
            r0.fieldSeparatorAtStart = r1
            return
    }

    protected void setNullText(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.nullText = r1
            return
    }

    protected void setSizeEndText(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.sizeEndText = r1
            return
    }

    protected void setSizeStartText(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.sizeStartText = r1
            return
    }

    protected void setSummaryObjectEndText(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.summaryObjectEndText = r1
            return
    }

    protected void setSummaryObjectStartText(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.summaryObjectStartText = r1
            return
    }

    protected void setUseClassName(boolean r1) {
            r0 = this;
            r0.useClassName = r1
            return
    }

    protected void setUseFieldNames(boolean r1) {
            r0 = this;
            r0.useFieldNames = r1
            return
    }

    protected void setUseIdentityHashCode(boolean r1) {
            r0 = this;
            r0.useIdentityHashCode = r1
            return
    }

    protected void setUseShortClassName(boolean r1) {
            r0 = this;
            r0.useShortClassName = r1
            return
    }
}
