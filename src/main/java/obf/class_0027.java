package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.ArrayList;

final class class_0027
implements ProfileLookupCallback {
    final /* synthetic */ class_0220 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ ArrayList lllIlIIlIIIlIlIIIllIlllIl;

    class_0027(class_0220 class_02202, ArrayList arrayList) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
        this.lllIlIIlIIIlIlIIIllIlllIl = arrayList;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.lllIIIllIIIIlllIlIIllIIll.IlIIllIlIlIllIIIlIIlIlIIl().lllIIIllIIIIlllIlIIllIIll(gameProfile);
        this.lllIlIIlIIIlIlIIIllIlllIl.add(gameProfile);
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        class_0470.lllIIIllIIIIlllIlIIllIIll().warn("Could not lookup user whitelist entry for " + gameProfile.getName(), (Throwable)exception);
    }
}

