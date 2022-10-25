package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecureTextureException
 */
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

class class_1895
implements Runnable {
    final /* synthetic */ GameProfile lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ boolean lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0169 IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ class_0030 lIlllIlllIIIIlIIlllIllIII;

    class_1895(class_0030 class_00302, GameProfile gameProfile, boolean bl, class_0169 class_01692) {
        this.lIlllIlllIIIIlIIlllIllIII = class_00302;
        this.lllIIIllIIIIlllIlIIllIIll = gameProfile;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
        this.IlIllllllIIlIIllllIIlIIIl = class_01692;
    }

    @Override
    public void run() {
        HashMap hashMap = Maps.newHashMap();
        try {
            hashMap.putAll(class_0030.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII).getTextures(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl));
        }
        catch (InsecureTextureException insecureTextureException) {
            // empty catch block
        }
        if (hashMap.isEmpty() && this.lllIIIllIIIIlllIlIIllIIll.getId().equals(Minecraft.getMinecraft().getSession().func_148256_e().getId())) {
            hashMap.putAll(class_0030.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII).getTextures(class_0030.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII).fillProfileProperties(this.lllIIIllIIIIlllIlIIllIIll, false), false));
        }
        Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_0359(this, hashMap));
    }
}

