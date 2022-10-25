package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import com.moonsworth.lunar.client.util.cosmetic.Cosmetic;
import net.minecraft.client.Minecraft;
import optifine.Config;

public abstract class class_2174
extends class_0814
implements class_0169 {
    public static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/steve.png");
    private ResourceLocation lllIlIIlIIIlIlIIIllIlllIl;
    private ResourceLocation IlIllllllIIlIIllllIIlIIIl;
    private ResourceLocation lIlllIlllIIIIlIIlllIllIII = null;
    private String IlIIIIIllllllIIlllIllllll = null;

    public class_2174(class_1334 class_13342, GameProfile gameProfile) {
        super(class_13342, gameProfile);
        Object object;
        String string = this.llllIIIIlIIIlIIIIIIlIllll();
        if (!string.isEmpty()) {
            object = Minecraft.getMinecraft().lIIlIlllIllIlIlllIIIIIIII();
            ((class_0030)object).lllIIIllIIIIlllIlIIllIIll(gameProfile, this, true);
        }
        this.IlIIIIIllllllIIlllIllllll = gameProfile.getName();
        if (this.IlIIIIIllllllIIlllIllllll != null && !this.IlIIIIIllllllIIlllIllllll.isEmpty()) {
            this.IlIIIIIllllllIIlllIllllll = class_1911.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        }
        object = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(this.lIIlllIIlIlIlIIIlIlllIIll());
        Cosmetic class_04332 = LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl(this.lIIlllIIlIlIlIIIlIlllIIll());
        LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll(this);
        if (object == null) {
            class_1214.lllIIIllIIIIlllIlIIllIIll(this, this.lIIlIlllIIlIIIIlIlIIIIlll().getId());
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(((Cosmetic)object).getLocation());
            this.lllIIIllIIIIlllIlIIllIIll((Cosmetic)object);
        }
        if (class_04332 != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_04332);
        }
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return Config.lllllllIlIIlIlIIIlIlIIlll() && (this.lIlllIlllIIIIlIIlllIllIII != null || this.IlIllllllIIlIIllllIIlIIIl != null);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    public ResourceLocation IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == null ? lllIIIllIIIIlllIlIIllIIll : this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public ResourceLocation lIllllIIlIIIlIllllllIIIll() {
        return !Config.lllllllIlIIlIlIIIlIlIIlll() ? null : (this.lIlllIlllIIIIlIIlllIllIII != null ? this.lIlllIlllIIIIlIIlllIllIII : this.IlIllllllIIlIIllllIIlIIIl);
    }

    public static class_1085 lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, String string) {
        class_1682 class_16822 = Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII();
        class_0211 class_02112 = class_16822.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
        if (class_02112 == null) {
            class_02112 = new class_1085(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", class_1911.lllIIIllIIIIlllIlIIllIIll(string)), lllIIIllIIIIlllIlIIllIIll, new class_1193());
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_17732, class_02112);
        }
        return (class_1085)class_02112;
    }

    public static ResourceLocation lllIIIllIIIIlllIlIIllIIll(String string) {
        return new ResourceLocation("skins/" + class_1911.lllIIIllIIIIlllIlIIllIIll(string));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(MinecraftProfileTexture.Type type, ResourceLocation class_17732) {
        switch (class_1765.lllIIIllIIIIlllIlIIllIIll[type.ordinal()]) {
            case 1: {
                this.lllIlIIlIIIlIlIIIllIlllIl = class_17732;
                break;
            }
            case 2: {
                this.IlIllllllIIlIIllllIIlIIIl = class_17732;
            }
        }
    }

    public String c_() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public ResourceLocation IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        this.lIlllIlllIIIIlIIlllIllIII = class_17732;
    }
}

