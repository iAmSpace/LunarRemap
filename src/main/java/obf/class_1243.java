package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

final class class_1243
implements ProfileLookupCallback {
    final /* synthetic */ GameProfile[] lllIIIllIIIIlllIlIIllIIll;

    class_1243(GameProfile[] arrgameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll = arrgameProfile;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll[0] = gameProfile;
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        this.lllIIIllIIIIlllIlIIllIIll[0] = null;
    }
}

