package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private final java.util.List<android.os.Bundle> mActionExtrasList;
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private final android.os.Bundle mExtras;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;

    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder addAction(android.app.Notification.Builder r0, android.app.Notification.Action r1) {
                android.app.Notification$Builder r0 = r0.addAction(r1)
                return r0
        }

        static android.app.Notification.Action.Builder addExtras(android.app.Notification.Action.Builder r0, android.os.Bundle r1) {
                android.app.Notification$Action$Builder r0 = r0.addExtras(r1)
                return r0
        }

        static android.app.Notification.Action.Builder addRemoteInput(android.app.Notification.Action.Builder r0, android.app.RemoteInput r1) {
                android.app.Notification$Action$Builder r0 = r0.addRemoteInput(r1)
                return r0
        }

        static android.app.Notification.Action build(android.app.Notification.Action.Builder r0) {
                android.app.Notification$Action r0 = r0.build()
                return r0
        }

        static android.app.Notification.Action.Builder createBuilder(int r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        static java.lang.String getGroup(android.app.Notification r0) {
                java.lang.String r0 = r0.getGroup()
                return r0
        }

        static android.app.Notification.Builder setGroup(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setGroup(r1)
                return r0
        }

        static android.app.Notification.Builder setGroupSummary(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setGroupSummary(r1)
                return r0
        }

        static android.app.Notification.Builder setLocalOnly(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setLocalOnly(r1)
                return r0
        }

        static android.app.Notification.Builder setSortKey(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setSortKey(r1)
                return r0
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder addPerson(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.addPerson(r1)
                return r0
        }

        static android.app.Notification.Builder setCategory(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setCategory(r1)
                return r0
        }

        static android.app.Notification.Builder setColor(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setColor(r1)
                return r0
        }

        static android.app.Notification.Builder setPublicVersion(android.app.Notification.Builder r0, android.app.Notification r1) {
                android.app.Notification$Builder r0 = r0.setPublicVersion(r1)
                return r0
        }

        static android.app.Notification.Builder setSound(android.app.Notification.Builder r0, android.net.Uri r1, java.lang.Object r2) {
                android.media.AudioAttributes r2 = (android.media.AudioAttributes) r2
                android.app.Notification$Builder r0 = r0.setSound(r1, r2)
                return r0
        }

        static android.app.Notification.Builder setVisibility(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setVisibility(r1)
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Action.Builder createBuilder(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        static android.app.Notification.Builder setLargeIcon(android.app.Notification.Builder r0, android.graphics.drawable.Icon r1) {
                android.app.Notification$Builder r0 = r0.setLargeIcon(r1)
                return r0
        }

        static android.app.Notification.Builder setSmallIcon(android.app.Notification.Builder r0, java.lang.Object r1) {
                android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
                android.app.Notification$Builder r0 = r0.setSmallIcon(r1)
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Action.Builder setAllowGeneratedReplies(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setAllowGeneratedReplies(r1)
                return r0
        }

        static android.app.Notification.Builder setCustomBigContentView(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomBigContentView(r1)
                return r0
        }

        static android.app.Notification.Builder setCustomContentView(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomContentView(r1)
                return r0
        }

        static android.app.Notification.Builder setCustomHeadsUpContentView(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomHeadsUpContentView(r1)
                return r0
        }

        static android.app.Notification.Builder setRemoteInputHistory(android.app.Notification.Builder r0, java.lang.CharSequence[] r1) {
                android.app.Notification$Builder r0 = r0.setRemoteInputHistory(r1)
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder createBuilder(android.content.Context r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = new android.app.Notification$Builder
                r0.<init>(r1, r2)
                return r0
        }

        static android.app.Notification.Builder setBadgeIconType(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setBadgeIconType(r1)
                return r0
        }

        static android.app.Notification.Builder setColorized(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setColorized(r1)
                return r0
        }

        static android.app.Notification.Builder setGroupAlertBehavior(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setGroupAlertBehavior(r1)
                return r0
        }

        static android.app.Notification.Builder setSettingsText(android.app.Notification.Builder r0, java.lang.CharSequence r1) {
                android.app.Notification$Builder r0 = r0.setSettingsText(r1)
                return r0
        }

        static android.app.Notification.Builder setShortcutId(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setShortcutId(r1)
                return r0
        }

        static android.app.Notification.Builder setTimeoutAfter(android.app.Notification.Builder r0, long r1) {
                android.app.Notification$Builder r0 = r0.setTimeoutAfter(r1)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder addPerson(android.app.Notification.Builder r0, android.app.Person r1) {
                android.app.Notification$Builder r0 = r0.addPerson(r1)
                return r0
        }

        static android.app.Notification.Action.Builder setSemanticAction(android.app.Notification.Action.Builder r0, int r1) {
                android.app.Notification$Action$Builder r0 = r0.setSemanticAction(r1)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder setAllowSystemGeneratedContextualActions(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setAllowSystemGeneratedContextualActions(r1)
                return r0
        }

        static android.app.Notification.Builder setBubbleMetadata(android.app.Notification.Builder r0, android.app.Notification.BubbleMetadata r1) {
                android.app.Notification$Builder r0 = r0.setBubbleMetadata(r1)
                return r0
        }

        static android.app.Notification.Action.Builder setContextual(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setContextual(r1)
                return r0
        }

        static android.app.Notification.Builder setLocusId(android.app.Notification.Builder r0, java.lang.Object r1) {
                android.content.LocusId r1 = (android.content.LocusId) r1
                android.app.Notification$Builder r0 = r0.setLocusId(r1)
                return r0
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Action.Builder setAuthenticationRequired(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setAuthenticationRequired(r1)
                return r0
        }

        static android.app.Notification.Builder setForegroundServiceBehavior(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setForegroundServiceBehavior(r1)
                return r0
        }
    }

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder r14) {
            r13 = this;
            r13.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.mActionExtrasList = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r13.mExtras = r0
            r13.mBuilderCompat = r14
            android.content.Context r0 = r14.mContext
            r13.mContext = r0
            android.content.Context r1 = r14.mContext
            java.lang.String r2 = r14.mChannelId
            android.app.Notification$Builder r1 = androidx.core.app.NotificationCompatBuilder.Api26Impl.createBuilder(r1, r2)
            r13.mBuilder = r1
            android.app.Notification r2 = r14.mNotification
            long r3 = r2.when
            android.app.Notification$Builder r3 = r1.setWhen(r3)
            int r4 = r2.icon
            int r5 = r2.iconLevel
            android.app.Notification$Builder r3 = r3.setSmallIcon(r4, r5)
            android.widget.RemoteViews r4 = r2.contentView
            android.app.Notification$Builder r3 = r3.setContent(r4)
            java.lang.CharSequence r4 = r2.tickerText
            android.widget.RemoteViews r5 = r14.mTickerView
            android.app.Notification$Builder r3 = r3.setTicker(r4, r5)
            long[] r4 = r2.vibrate
            android.app.Notification$Builder r3 = r3.setVibrate(r4)
            int r4 = r2.ledARGB
            int r5 = r2.ledOnMS
            int r6 = r2.ledOffMS
            android.app.Notification$Builder r3 = r3.setLights(r4, r5, r6)
            int r4 = r2.flags
            r5 = 2
            r4 = r4 & r5
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L59
            r4 = r6
            goto L5a
        L59:
            r4 = r7
        L5a:
            android.app.Notification$Builder r3 = r3.setOngoing(r4)
            int r4 = r2.flags
            r4 = r4 & 8
            if (r4 == 0) goto L66
            r4 = r6
            goto L67
        L66:
            r4 = r7
        L67:
            android.app.Notification$Builder r3 = r3.setOnlyAlertOnce(r4)
            int r4 = r2.flags
            r4 = r4 & 16
            if (r4 == 0) goto L73
            r4 = r6
            goto L74
        L73:
            r4 = r7
        L74:
            android.app.Notification$Builder r3 = r3.setAutoCancel(r4)
            int r4 = r2.defaults
            android.app.Notification$Builder r3 = r3.setDefaults(r4)
            java.lang.CharSequence r4 = r14.mContentTitle
            android.app.Notification$Builder r3 = r3.setContentTitle(r4)
            java.lang.CharSequence r4 = r14.mContentText
            android.app.Notification$Builder r3 = r3.setContentText(r4)
            java.lang.CharSequence r4 = r14.mContentInfo
            android.app.Notification$Builder r3 = r3.setContentInfo(r4)
            android.app.PendingIntent r4 = r14.mContentIntent
            android.app.Notification$Builder r3 = r3.setContentIntent(r4)
            android.app.PendingIntent r4 = r2.deleteIntent
            android.app.Notification$Builder r3 = r3.setDeleteIntent(r4)
            android.app.PendingIntent r4 = r14.mFullScreenIntent
            int r8 = r2.flags
            r8 = r8 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto La6
            r8 = r6
            goto La7
        La6:
            r8 = r7
        La7:
            android.app.Notification$Builder r3 = r3.setFullScreenIntent(r4, r8)
            int r4 = r14.mNumber
            android.app.Notification$Builder r3 = r3.setNumber(r4)
            int r4 = r14.mProgressMax
            int r8 = r14.mProgress
            boolean r9 = r14.mProgressIndeterminate
            r3.setProgress(r4, r8, r9)
            androidx.core.graphics.drawable.IconCompat r3 = r14.mLargeIcon
            r4 = 0
            if (r3 != 0) goto Lc1
            r0 = r4
            goto Lc7
        Lc1:
            androidx.core.graphics.drawable.IconCompat r3 = r14.mLargeIcon
            android.graphics.drawable.Icon r0 = r3.toIcon(r0)
        Lc7:
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setLargeIcon(r1, r0)
            java.lang.CharSequence r0 = r14.mSubText
            android.app.Notification$Builder r0 = r1.setSubText(r0)
            boolean r1 = r14.mUseChronometer
            android.app.Notification$Builder r0 = r0.setUsesChronometer(r1)
            int r1 = r14.mPriority
            r0.setPriority(r1)
            androidx.core.app.NotificationCompat$Style r0 = r14.mStyle
            boolean r0 = r0 instanceof androidx.core.app.NotificationCompat.CallStyle
            if (r0 == 0) goto Lfd
            androidx.core.app.NotificationCompat$Style r0 = r14.mStyle
            androidx.core.app.NotificationCompat$CallStyle r0 = (androidx.core.app.NotificationCompat.CallStyle) r0
            java.util.ArrayList r0 = r0.getActionsListWithSystemActions()
            java.util.Iterator r0 = r0.iterator()
        Led:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L113
            java.lang.Object r1 = r0.next()
            androidx.core.app.NotificationCompat$Action r1 = (androidx.core.app.NotificationCompat.Action) r1
            r13.addAction(r1)
            goto Led
        Lfd:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r14.mActions
            java.util.Iterator r0 = r0.iterator()
        L103:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L113
            java.lang.Object r1 = r0.next()
            androidx.core.app.NotificationCompat$Action r1 = (androidx.core.app.NotificationCompat.Action) r1
            r13.addAction(r1)
            goto L103
        L113:
            android.os.Bundle r0 = r14.mExtras
            if (r0 == 0) goto L11e
            android.os.Bundle r0 = r13.mExtras
            android.os.Bundle r1 = r14.mExtras
            r0.putAll(r1)
        L11e:
            android.widget.RemoteViews r0 = r14.mContentView
            r13.mContentView = r0
            android.widget.RemoteViews r0 = r14.mBigContentView
            r13.mBigContentView = r0
            android.app.Notification$Builder r0 = r13.mBuilder
            boolean r1 = r14.mShowWhen
            r0.setShowWhen(r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            boolean r1 = r14.mLocalOnly
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setLocalOnly(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            java.lang.String r1 = r14.mGroupKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            java.lang.String r1 = r14.mSortKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setSortKey(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            boolean r1 = r14.mGroupSummary
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroupSummary(r0, r1)
            int r0 = r14.mGroupAlertBehavior
            r13.mGroupAlertBehavior = r0
            android.app.Notification$Builder r0 = r13.mBuilder
            java.lang.String r1 = r14.mCategory
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setCategory(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            int r1 = r14.mColor
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setColor(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            int r1 = r14.mVisibility
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setVisibility(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            android.app.Notification r1 = r14.mPublicVersion
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setPublicVersion(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            android.net.Uri r1 = r2.sound
            android.media.AudioAttributes r3 = r2.audioAttributes
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setSound(r0, r1, r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L185
            java.util.ArrayList<androidx.core.app.Person> r0 = r14.mPersonList
            java.util.List r0 = getPeople(r0)
            java.util.ArrayList<java.lang.String> r3 = r14.mPeople
            java.util.List r0 = combineLists(r0, r3)
            goto L187
        L185:
            java.util.ArrayList<java.lang.String> r0 = r14.mPeople
        L187:
            if (r0 == 0) goto L1a5
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L1a5
            java.util.Iterator r0 = r0.iterator()
        L193:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1a5
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            android.app.Notification$Builder r8 = r13.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api21Impl.addPerson(r8, r3)
            goto L193
        L1a5:
            android.widget.RemoteViews r0 = r14.mHeadsUpContentView
            r13.mHeadsUpContentView = r0
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r14.mInvisibleActions
            int r0 = r0.size()
            if (r0 <= 0) goto L1ff
            android.os.Bundle r0 = r14.getExtras()
            java.lang.String r3 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r3)
            if (r0 != 0) goto L1c2
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L1c2:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r0)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r10 = r7
        L1cd:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r11 = r14.mInvisibleActions
            int r11 = r11.size()
            if (r10 >= r11) goto L1eb
            java.lang.String r11 = java.lang.Integer.toString(r10)
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r12 = r14.mInvisibleActions
            java.lang.Object r12 = r12.get(r10)
            androidx.core.app.NotificationCompat$Action r12 = (androidx.core.app.NotificationCompat.Action) r12
            android.os.Bundle r12 = androidx.core.app.NotificationCompatJellybean.getBundleForAction(r12)
            r9.putBundle(r11, r12)
            int r10 = r10 + 1
            goto L1cd
        L1eb:
            java.lang.String r10 = "invisible_actions"
            r0.putBundle(r10, r9)
            r8.putBundle(r10, r9)
            android.os.Bundle r9 = r14.getExtras()
            r9.putBundle(r3, r0)
            android.os.Bundle r0 = r13.mExtras
            r0.putBundle(r3, r8)
        L1ff:
            java.lang.Object r0 = r14.mSmallIcon
            if (r0 == 0) goto L20a
            android.app.Notification$Builder r0 = r13.mBuilder
            java.lang.Object r3 = r14.mSmallIcon
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setSmallIcon(r0, r3)
        L20a:
            android.app.Notification$Builder r0 = r13.mBuilder
            android.os.Bundle r3 = r14.mExtras
            r0.setExtras(r3)
            android.app.Notification$Builder r0 = r13.mBuilder
            java.lang.CharSequence[] r3 = r14.mRemoteInputHistory
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setRemoteInputHistory(r0, r3)
            android.widget.RemoteViews r0 = r14.mContentView
            if (r0 == 0) goto L223
            android.app.Notification$Builder r0 = r13.mBuilder
            android.widget.RemoteViews r3 = r14.mContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomContentView(r0, r3)
        L223:
            android.widget.RemoteViews r0 = r14.mBigContentView
            if (r0 == 0) goto L22e
            android.app.Notification$Builder r0 = r13.mBuilder
            android.widget.RemoteViews r3 = r14.mBigContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomBigContentView(r0, r3)
        L22e:
            android.widget.RemoteViews r0 = r14.mHeadsUpContentView
            if (r0 == 0) goto L239
            android.app.Notification$Builder r0 = r13.mBuilder
            android.widget.RemoteViews r3 = r14.mHeadsUpContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomHeadsUpContentView(r0, r3)
        L239:
            android.app.Notification$Builder r0 = r13.mBuilder
            int r3 = r14.mBadgeIcon
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setBadgeIconType(r0, r3)
            android.app.Notification$Builder r0 = r13.mBuilder
            java.lang.CharSequence r3 = r14.mSettingsText
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setSettingsText(r0, r3)
            android.app.Notification$Builder r0 = r13.mBuilder
            java.lang.String r3 = r14.mShortcutId
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setShortcutId(r0, r3)
            android.app.Notification$Builder r0 = r13.mBuilder
            long r8 = r14.mTimeout
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setTimeoutAfter(r0, r8)
            android.app.Notification$Builder r0 = r13.mBuilder
            int r3 = r14.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r0, r3)
            boolean r0 = r14.mColorizedSet
            if (r0 == 0) goto L267
            android.app.Notification$Builder r0 = r13.mBuilder
            boolean r3 = r14.mColorized
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setColorized(r0, r3)
        L267:
            java.lang.String r0 = r14.mChannelId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L280
            android.app.Notification$Builder r0 = r13.mBuilder
            android.app.Notification$Builder r0 = r0.setSound(r4)
            android.app.Notification$Builder r0 = r0.setDefaults(r7)
            android.app.Notification$Builder r0 = r0.setLights(r7, r7, r7)
            r0.setVibrate(r4)
        L280:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L2a0
            java.util.ArrayList<androidx.core.app.Person> r0 = r14.mPersonList
            java.util.Iterator r0 = r0.iterator()
        L28a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a0
            java.lang.Object r1 = r0.next()
            androidx.core.app.Person r1 = (androidx.core.app.Person) r1
            android.app.Notification$Builder r3 = r13.mBuilder
            android.app.Person r1 = r1.toAndroidPerson()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.addPerson(r3, r1)
            goto L28a
        L2a0:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L2c7
            android.app.Notification$Builder r0 = r13.mBuilder
            boolean r1 = r14.mAllowSystemGeneratedContextualActions
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setAllowSystemGeneratedContextualActions(r0, r1)
            android.app.Notification$Builder r0 = r13.mBuilder
            androidx.core.app.NotificationCompat$BubbleMetadata r1 = r14.mBubbleMetadata
            android.app.Notification$BubbleMetadata r1 = androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(r1)
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setBubbleMetadata(r0, r1)
            androidx.core.content.LocusIdCompat r0 = r14.mLocusId
            if (r0 == 0) goto L2c7
            android.app.Notification$Builder r0 = r13.mBuilder
            androidx.core.content.LocusIdCompat r1 = r14.mLocusId
            android.content.LocusId r1 = r1.toLocusId()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setLocusId(r0, r1)
        L2c7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L2d8
            int r0 = r14.mFgsDeferBehavior
            if (r0 == 0) goto L2d8
            android.app.Notification$Builder r0 = r13.mBuilder
            int r1 = r14.mFgsDeferBehavior
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setForegroundServiceBehavior(r0, r1)
        L2d8:
            boolean r14 = r14.mSilent
            if (r14 == 0) goto L31c
            androidx.core.app.NotificationCompat$Builder r14 = r13.mBuilderCompat
            boolean r14 = r14.mGroupSummary
            if (r14 == 0) goto L2e5
            r13.mGroupAlertBehavior = r5
            goto L2e7
        L2e5:
            r13.mGroupAlertBehavior = r6
        L2e7:
            android.app.Notification$Builder r14 = r13.mBuilder
            r14.setVibrate(r4)
            android.app.Notification$Builder r14 = r13.mBuilder
            r14.setSound(r4)
            int r14 = r2.defaults
            r14 = r14 & (-2)
            r2.defaults = r14
            int r14 = r2.defaults
            r14 = r14 & (-3)
            r2.defaults = r14
            android.app.Notification$Builder r14 = r13.mBuilder
            int r0 = r2.defaults
            r14.setDefaults(r0)
            androidx.core.app.NotificationCompat$Builder r14 = r13.mBuilderCompat
            java.lang.String r14 = r14.mGroupKey
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L315
            android.app.Notification$Builder r14 = r13.mBuilder
            java.lang.String r0 = "silent"
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r14, r0)
        L315:
            android.app.Notification$Builder r14 = r13.mBuilder
            int r0 = r13.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r14, r0)
        L31c:
            return
    }

    private void addAction(androidx.core.app.NotificationCompat.Action r6) {
            r5 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r6.getIconCompat()
            if (r0 == 0) goto Lb
            android.graphics.drawable.Icon r0 = r0.toIcon()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.CharSequence r1 = r6.getTitle()
            android.app.PendingIntent r2 = r6.getActionIntent()
            android.app.Notification$Action$Builder r0 = androidx.core.app.NotificationCompatBuilder.Api23Impl.createBuilder(r0, r1, r2)
            androidx.core.app.RemoteInput[] r1 = r6.getRemoteInputs()
            if (r1 == 0) goto L32
            androidx.core.app.RemoteInput[] r1 = r6.getRemoteInputs()
            android.app.RemoteInput[] r1 = androidx.core.app.RemoteInput.fromCompat(r1)
            int r2 = r1.length
            r3 = 0
        L28:
            if (r3 >= r2) goto L32
            r4 = r1[r3]
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addRemoteInput(r0, r4)
            int r3 = r3 + 1
            goto L28
        L32:
            android.os.Bundle r1 = r6.getExtras()
            if (r1 == 0) goto L42
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r6.getExtras()
            r1.<init>(r2)
            goto L47
        L42:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L47:
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            boolean r3 = r6.getAllowGeneratedReplies()
            r1.putBoolean(r2, r3)
            boolean r2 = r6.getAllowGeneratedReplies()
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setAllowGeneratedReplies(r0, r2)
            java.lang.String r2 = "android.support.action.semanticAction"
            int r3 = r6.getSemanticAction()
            r1.putInt(r2, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L6d
            int r2 = r6.getSemanticAction()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.setSemanticAction(r0, r2)
        L6d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L7a
            boolean r2 = r6.isContextual()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setContextual(r0, r2)
        L7a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L87
            boolean r2 = r6.isAuthenticationRequired()
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setAuthenticationRequired(r0, r2)
        L87:
            java.lang.String r2 = "android.support.action.showsUserInterface"
            boolean r6 = r6.getShowsUserInterface()
            r1.putBoolean(r2, r6)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addExtras(r0, r1)
            android.app.Notification$Builder r6 = r5.mBuilder
            android.app.Notification$Action r0 = androidx.core.app.NotificationCompatBuilder.Api20Impl.build(r0)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addAction(r6, r0)
            return
    }

    private static java.util.List<java.lang.String> combineLists(java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
    }

    private static java.util.List<java.lang.String> getPeople(java.util.List<androidx.core.app.Person> r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            androidx.core.app.Person r1 = (androidx.core.app.Person) r1
            java.lang.String r1 = r1.resolveToLegacyUri()
            r0.add(r1)
            goto L11
        L25:
            return r0
    }

    private void removeSoundAndVibration(android.app.Notification r2) {
            r1 = this;
            r0 = 0
            r2.sound = r0
            r2.vibrate = r0
            int r0 = r2.defaults
            r0 = r0 & (-2)
            r2.defaults = r0
            int r0 = r2.defaults
            r0 = r0 & (-3)
            r2.defaults = r0
            return
    }

    public android.app.Notification build() {
            r3 = this;
            androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r0 = r0.mStyle
            if (r0 == 0) goto L9
            r0.apply(r3)
        L9:
            if (r0 == 0) goto L10
            android.widget.RemoteViews r1 = r0.makeContentView(r3)
            goto L11
        L10:
            r1 = 0
        L11:
            android.app.Notification r2 = r3.buildInternal()
            if (r1 == 0) goto L1a
            r2.contentView = r1
            goto L26
        L1a:
            androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilderCompat
            android.widget.RemoteViews r1 = r1.mContentView
            if (r1 == 0) goto L26
            androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilderCompat
            android.widget.RemoteViews r1 = r1.mContentView
            r2.contentView = r1
        L26:
            if (r0 == 0) goto L30
            android.widget.RemoteViews r1 = r0.makeBigContentView(r3)
            if (r1 == 0) goto L30
            r2.bigContentView = r1
        L30:
            if (r0 == 0) goto L3e
            androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r1 = r1.mStyle
            android.widget.RemoteViews r1 = r1.makeHeadsUpContentView(r3)
            if (r1 == 0) goto L3e
            r2.headsUpContentView = r1
        L3e:
            if (r0 == 0) goto L49
            android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r2)
            if (r1 == 0) goto L49
            r0.addCompatExtras(r1)
        L49:
            return r2
    }

    protected android.app.Notification buildInternal() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.mBuilder
            android.app.Notification r0 = r0.build()
            return r0
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.mBuilder
            return r0
    }

    android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }
}
