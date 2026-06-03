package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AccountPicker {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class AccountChooserOptions {
        private android.accounts.Account zza;
        private java.util.ArrayList zzb;
        private java.util.ArrayList zzc;
        private boolean zzd;
        private java.lang.String zze;
        private android.os.Bundle zzf;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public static class Builder {
            private android.accounts.Account zza;
            private java.util.ArrayList zzb;
            private java.util.ArrayList zzc;
            private boolean zzd;
            private java.lang.String zze;
            private android.os.Bundle zzf;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.zzd = r0
                    return
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions build() {
                    r2 = this;
                    java.lang.String r0 = "We only support hostedDomain filter for account chip styled account picker"
                    r1 = 1
                    com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                    java.lang.String r0 = "Consent is only valid for account chip styled account picker"
                    com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                    com.google.android.gms.common.AccountPicker$AccountChooserOptions r0 = new com.google.android.gms.common.AccountPicker$AccountChooserOptions
                    r0.<init>()
                    java.util.ArrayList r1 = r2.zzc
                    r0.zzf(r1)
                    java.util.ArrayList r1 = r2.zzb
                    r0.zzd(r1)
                    boolean r1 = r2.zzd
                    r0.zzh(r1)
                    android.os.Bundle r1 = r2.zzf
                    r0.zzl(r1)
                    android.accounts.Account r1 = r2.zza
                    r0.zzb(r1)
                    java.lang.String r1 = r2.zze
                    r0.zzj(r1)
                    return r0
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccounts(java.util.List<android.accounts.Account> r2) {
                    r1 = this;
                    if (r2 != 0) goto L4
                    r2 = 0
                    goto La
                L4:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r2)
                    r2 = r0
                La:
                    r1.zzb = r2
                    return r1
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccountsTypes(java.util.List<java.lang.String> r2) {
                    r1 = this;
                    if (r2 != 0) goto L4
                    r2 = 0
                    goto La
                L4:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r2)
                    r2 = r0
                La:
                    r1.zzc = r2
                    return r1
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAlwaysShowAccountPicker(boolean r1) {
                    r0 = this;
                    r0.zzd = r1
                    return r0
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setOptionsForAddingAccount(android.os.Bundle r1) {
                    r0 = this;
                    r0.zzf = r1
                    return r0
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setSelectedAccount(android.accounts.Account r1) {
                    r0 = this;
                    r0.zza = r1
                    return r0
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setTitleOverrideText(java.lang.String r1) {
                    r0 = this;
                    r0.zze = r1
                    return r0
            }
        }

        public AccountChooserOptions() {
                r0 = this;
                r0.<init>()
                return
        }

        final /* synthetic */ android.accounts.Account zza() {
                r1 = this;
                android.accounts.Account r0 = r1.zza
                return r0
        }

        final /* synthetic */ void zzb(android.accounts.Account r1) {
                r0 = this;
                r0.zza = r1
                return
        }

        final /* synthetic */ java.util.ArrayList zzc() {
                r1 = this;
                java.util.ArrayList r0 = r1.zzb
                return r0
        }

        final /* synthetic */ void zzd(java.util.ArrayList r1) {
                r0 = this;
                r0.zzb = r1
                return
        }

        final /* synthetic */ java.util.ArrayList zze() {
                r1 = this;
                java.util.ArrayList r0 = r1.zzc
                return r0
        }

        final /* synthetic */ void zzf(java.util.ArrayList r1) {
                r0 = this;
                r0.zzc = r1
                return
        }

        final /* synthetic */ boolean zzg() {
                r1 = this;
                boolean r0 = r1.zzd
                return r0
        }

        final /* synthetic */ void zzh(boolean r1) {
                r0 = this;
                r0.zzd = r1
                return
        }

        final /* synthetic */ java.lang.String zzi() {
                r1 = this;
                java.lang.String r0 = r1.zze
                return r0
        }

        final /* synthetic */ void zzj(java.lang.String r1) {
                r0 = this;
                r0.zze = r1
                return
        }

        final /* synthetic */ android.os.Bundle zzk() {
                r1 = this;
                android.os.Bundle r0 = r1.zzf
                return r0
        }

        final /* synthetic */ void zzl(android.os.Bundle r1) {
                r0 = this;
                r0.zzf = r1
                return
        }
    }

    private AccountPicker() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static android.content.Intent newChooseAccountIntent(android.accounts.Account r3, java.util.ArrayList<android.accounts.Account> r4, java.lang.String[] r5, boolean r6, java.lang.String r7, java.lang.String r8, java.lang.String[] r9, android.os.Bundle r10) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 1
            java.lang.String r2 = "We only support hostedDomain filter for account chip styled account picker"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
            java.lang.String r1 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT"
            r0.setAction(r1)
            java.lang.String r1 = "com.google.android.gms"
            r0.setPackage(r1)
            java.lang.String r1 = "allowableAccounts"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "allowableAccountTypes"
            r0.putExtra(r4, r5)
            java.lang.String r4 = "addAccountOptions"
            r0.putExtra(r4, r10)
            java.lang.String r4 = "selectedAccount"
            r0.putExtra(r4, r3)
            java.lang.String r3 = "alwaysPromptForAccount"
            r0.putExtra(r3, r6)
            java.lang.String r3 = "descriptionTextOverride"
            r0.putExtra(r3, r7)
            java.lang.String r3 = "authTokenType"
            r0.putExtra(r3, r8)
            java.lang.String r3 = "addAccountRequiredFeatures"
            r0.putExtra(r3, r9)
            java.lang.String r3 = "setGmsCoreAccount"
            r4 = 0
            r0.putExtra(r3, r4)
            java.lang.String r3 = "overrideTheme"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "overrideCustomTheme"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "hostedDomainFilter"
            r4 = 0
            r0.putExtra(r3, r4)
            return r0
    }

    public static android.content.Intent newChooseAccountIntent(com.google.android.gms.common.AccountPicker.AccountChooserOptions r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "We only support hostedDomain filter for account chip styled account picker"
            r2 = 1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r1)
            java.lang.String r1 = "Consent is only valid for account chip styled account picker"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r1)
            java.lang.String r1 = "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r1)
            java.lang.String r1 = "com.google.android.gms.common.account.CHOOSE_ACCOUNT"
            r0.setAction(r1)
            java.lang.String r1 = "com.google.android.gms"
            r0.setPackage(r1)
            java.lang.String r1 = "allowableAccounts"
            java.util.ArrayList r2 = r4.zzc()
            r0.putExtra(r1, r2)
            java.util.ArrayList r1 = r4.zze()
            r2 = 0
            if (r1 == 0) goto L40
            java.util.ArrayList r1 = r4.zze()
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r3 = "allowableAccountTypes"
            r0.putExtra(r3, r1)
        L40:
            android.os.Bundle r1 = r4.zzk()
            java.lang.String r3 = "addAccountOptions"
            r0.putExtra(r3, r1)
            android.accounts.Account r1 = r4.zza()
            java.lang.String r3 = "selectedAccount"
            r0.putExtra(r3, r1)
            java.lang.String r1 = "selectedAccountIsNotClickable"
            r0.putExtra(r1, r2)
            boolean r1 = r4.zzg()
            java.lang.String r3 = "alwaysPromptForAccount"
            r0.putExtra(r3, r1)
            java.lang.String r4 = r4.zzi()
            java.lang.String r1 = "descriptionTextOverride"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "setGmsCoreAccount"
            r0.putExtra(r4, r2)
            java.lang.String r4 = "realClientPackage"
            r1 = 0
            r0.putExtra(r4, r1)
            java.lang.String r4 = "overrideTheme"
            r0.putExtra(r4, r2)
            java.lang.String r4 = "overrideCustomTheme"
            r0.putExtra(r4, r2)
            java.lang.String r4 = "hostedDomainFilter"
            r0.putExtra(r4, r1)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L93
            java.lang.String r1 = "first_party_options_bundle"
            r0.putExtra(r1, r4)
        L93:
            return r0
    }
}
