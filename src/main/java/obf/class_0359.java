package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.HashMap;

class class_0359
implements Runnable {
    final /* synthetic */ HashMap lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1895 lllIlIIlIIIlIlIIIllIlllIl;

    class_0359(class_1895 class_18952, HashMap hashMap) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_18952;
        this.lllIIIllIIIIlllIlIIllIIll = hashMap;
    }

    @Override
    public void run() {
        if (this.lllIIIllIIIIlllIlIIllIIll.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((MinecraftProfileTexture)this.lllIIIllIIIIlllIlIIllIIll.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.containsKey((Object)MinecraftProfileTexture.Type.CAPE)) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((MinecraftProfileTexture)this.lllIIIllIIIIlllIlIIllIIll.get((Object)MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl);
        }
    }
}

