package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  org.lwjgl.opengl.GL11
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0619
extends class_2052 {
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/entity/skeleton/skeleton.png");
    private static final ResourceLocation lIlllIlllIIIIlIIlllIllIII = new ResourceLocation("textures/entity/skeleton/wither_skeleton.png");
    private static final ResourceLocation IlIIIIIllllllIIlllIllllll = new ResourceLocation("textures/entity/zombie/zombie.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/creeper/creeper.png");
    public static class_0619 lllIIIllIIIIlllIlIIllIIll;
    private class_1777 IIIllIIlIIIIIIlIlIIllIIlI = new class_1777(0, 0, 64, 32);
    private class_1777 IllIIlllllllIIlIIlIIIIlIl = new class_1777(0, 0, 64, 64);

    public void lllIIIllIIIIlllIlIIllIIll(class_0090 class_00902, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((float)d, (float)d2, (float)d3, class_00902.lIlllIlllIIIIlIIlllIllIII() & 7, (float)(class_00902.lllIIlIIIllllllIIIIlIlIlI() * 360) / 16.0f, class_00902.IlIIIIIllllllIIlllIllllll(), class_00902.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1683 class_16832) {
        super.lllIIIllIIIIlllIlIIllIIll(class_16832);
        lllIIIllIIIIlllIlIIllIIll = this;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, int n, float f4, int n2, GameProfile gameProfile) {
        class_1777 class_17772 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        switch (n2) {
            default: {
                this.lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
                break;
            }
            case 1: {
                this.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII);
                break;
            }
            case 2: {
                this.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
                class_17772 = this.IllIIlllllllIIlIIlIIIIlIl;
                break;
            }
            case 3: {
                Minecraft class_06672;
                Map map;
                ResourceLocation class_17732 = class_2174.lllIIIllIIIIlllIlIIllIIll;
                if (gameProfile != null && (map = (class_06672 = Minecraft.getMinecraft()).lIIlIlllIllIlIlllIIIIIIII().lllIIIllIIIIlllIlIIllIIll(gameProfile)).containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
                    class_17732 = class_06672.lIIlIlllIllIlIlllIIIIIIII().lllIIIllIIIIlllIlIIllIIll((MinecraftProfileTexture)map.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
                }
                this.lllIIIllIIIIlllIlIIllIIll(class_17732);
                break;
            }
            case 4: {
                this.lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
            }
        }
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        if (n != 1) {
            switch (n) {
                case 2: {
                    GL11.glTranslatef((float)(f + 0.5f), (float)(f2 + 0.25f), (float)(f3 + 0.74f));
                    break;
                }
                case 3: {
                    GL11.glTranslatef((float)(f + 0.5f), (float)(f2 + 0.25f), (float)(f3 + 0.26f));
                    f4 = 180.0f;
                    break;
                }
                case 4: {
                    GL11.glTranslatef((float)(f + 0.74f), (float)(f2 + 0.25f), (float)(f3 + 0.5f));
                    f4 = 270.0f;
                    break;
                }
                default: {
                    GL11.glTranslatef((float)(f + 0.26f), (float)(f2 + 0.25f), (float)(f3 + 0.5f));
                    f4 = 90.0f;
                    break;
                }
            }
        } else {
            GL11.glTranslatef((float)(f + 0.5f), (float)f2, (float)(f3 + 0.5f));
        }
        float f5 = 0.0625f;
        GL11.glEnable((int)32826);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        GL11.glEnable((int)3008);
        class_17772.lllIIIllIIIIlllIlIIllIIll(null, 0.0f, 0.0f, 0.0f, f4, 0.0f, f5);
        GL11.glPopMatrix();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0090)class_17742, d, d2, d3, f);
    }
}

