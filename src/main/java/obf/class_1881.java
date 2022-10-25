package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;

import java.util.Map;

class class_1881
extends CacheLoader {
    final /* synthetic */ class_0030 lllIIIllIIIIlllIlIIllIIll;

    class_1881(class_0030 class_00302) {
        this.lllIIIllIIIIlllIlIIllIIll = class_00302;
    }

    public Map lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        return Minecraft.getMinecraft().lIIIlIIIlIlllIllIIIlIIIlI().getTextures(gameProfile, false);
    }

    public Object load(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((GameProfile)object);
    }
}

