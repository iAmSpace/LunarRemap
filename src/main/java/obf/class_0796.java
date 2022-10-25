package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.lwjgl.opengl.GL11
 */
import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class class_0796
extends class_0164 {
    protected class_1931 lllIIIllIIIIlllIlIIllIIll;
    protected float lIllllIIlIIIlIllllllIIIll;
    protected class_1931 IIIllIIlIIIIIIlIlIIllIIlI;
    protected class_1931 IllIIlllllllIIlIIlIIIIlIl;
    private static final ResourceLocation[] IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation[]{new ResourceLocation("textures/models/armor/leather_layer_1.png"), new ResourceLocation("textures/models/armor/leather_layer_2.png"), new ResourceLocation("textures/models/armor/chainmail_layer_1.png"), new ResourceLocation("textures/models/armor/chainmail_layer_2.png"), new ResourceLocation("textures/models/armor/iron_layer_1.png"), new ResourceLocation("textures/models/armor/iron_layer_2.png"), new ResourceLocation("textures/models/armor/diamond_layer_1.png"), new ResourceLocation("textures/models/armor/diamond_layer_2.png"), new ResourceLocation("textures/models/armor/gold_layer_1.png"), new ResourceLocation("textures/models/armor/gold_layer_2.png"), new ResourceLocation("textures/models/armor/leather_layer_1_overlay.png"), new ResourceLocation("textures/models/armor/leather_layer_2_overlay.png")};
    private static final String[] IllIIIllIIIIlIlIlIllIIlll = new String[]{"leather", "chainmail", "iron", "diamond", "gold"};

    public class_0796(class_1931 class_19312, float f) {
        this(class_19312, f, 1.0f);
    }

    public class_0796(class_1931 class_19312, float f, float f2) {
        super(class_19312, f);
        this.lllIIIllIIIIlllIlIIllIIll = class_19312;
        this.lIllllIIlIIIlIllllllIIIll = f2;
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1931(1.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1931(0.5f);
    }

    public static ResourceLocation lllIIIllIIIIlllIlIIllIIll(ItemArmor class_09812, int n) {
        return IIIllIllIIlIlIlIlIllllIIl[(class_09812.llIIlllIllIllllIIIlIIIIII << 1) + (n == 2 ? 1 : 0)];
    }

    public static ResourceLocation lllIlIIlIIIlIlIIIllIlllIl(ItemArmor class_09812, int n) {
        return IIIllIllIIlIlIlIlIllllIIl[(class_09812.llIIlllIllIllllIIIlIIIIII << 1) + (n == 2 ? 11 : 10)];
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, int n, float f) {
        Item class_06112;
        ItemStack class_08972 = class_03392.lIIIIlIlIIlllllIIllIIlIII(3 - n);
        if (class_08972 != null && (class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll()) instanceof ItemArmor) {
            ItemArmor class_09812 = (ItemArmor)class_06112;
            this.lllIIIllIIIIlllIlIIllIIll(class_0796.lllIIIllIIIIlllIlIIllIIll(class_09812, n));
            class_1931 class_19312 = n == 2 ? this.IllIIlllllllIIlIIlIIIIlIl : this.IIIllIIlIIIIIIlIlIIllIIlI;
            class_19312.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll = n == 0;
            class_19312.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = n == 0;
            class_19312.IIIllIllIIlIlIlIlIllllIIl.IllIIIllIIIIlIlIlIllIIlll = n == 1 || n == 2;
            class_19312.IllIIIllIIIIlIlIlIllIIlll.IllIIIllIIIIlIlIlIllIIlll = n == 1;
            class_19312.lIIIIlIlIIlllllIIllIIlIII.IllIIIllIIIIlIlIlIllIIlll = n == 1;
            class_19312.llIIlllIllIllllIIIlIIIIII.IllIIIllIIIIlIlIlIllIIlll = n == 2 || n == 3;
            class_19312.llIIllIllIlIIlIIllIllllll.IllIIIllIIIIlIlIlIllIIlll = n == 2 || n == 3;
            this.lllIIIllIIIIlllIlIIllIIll(class_19312);
            class_19312.lllIIIllIIIIlllIlIIllIIll = this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll;
            class_19312.lllIlIIlIIIlIlIIIllIlllIl = this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl;
            class_19312.lIlllIlllIIIIlIIlllIllIII = this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII;
            if (class_09812.IlIIIlIIIIllIIIllIIIIIIll() == ArmorMaterial.CLOTH) {
                int n2 = class_09812.lllIIlIIIllllllIIIIlIlIlI(class_08972);
                float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n2 & 0xFF) / 255.0f;
                GL11.glColor3f((float)f2, (float)f3, (float)f4);
                if (class_08972.llIllllIlIllIIIlIllIIlIlI()) {
                    return 31;
                }
                return 16;
            }
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            if (class_08972.llIllllIlIllIIIlIllIIlIlI()) {
                return 15;
            }
            return 1;
        }
        return -1;
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0339 class_03392, int n, float f) {
        Item class_06112;
        ItemStack class_08972 = class_03392.lIIIIlIlIIlllllIIllIIlIII(3 - n);
        if (class_08972 != null && (class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll()) instanceof ItemArmor) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0796.lllIlIIlIIIlIlIIIllIlllIl((ItemArmor)class_06112, n));
            float f2 = 1.0f;
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        ItemStack class_08972 = class_03392.lIIIIlIlIlIIIlIIllIIlIlIl();
        this.lllIIIllIIIIlllIlIIllIIll(class_03392, class_08972);
        double d4 = d2 - (double)class_03392.llllIlIIIIIIIIIlllIIlIIIl;
        if (class_03392.IIlIIlIlIlIllIIlIlIIIIlll()) {
            d4 -= 0.125;
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_03392, d, d4, d3, f, f2);
        this.lllIIIllIIIIlllIlIIllIIll.lIIlIIIIIlIlllIlIIlIlIlll = false;
        this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIIlIIIIIlIlllIlIIlIlIlll = false;
        this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIIlIllIIIlllllIl = false;
        this.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIIlIllIIIlllllIl = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIIlIllIIIlllllIl = false;
        this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII = 0;
        this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII = 0;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllllIlllIIllIlIIlIIIllII = 0;
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392) {
        return null;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII = class_08972 != null ? 1 : 0;
        this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII = this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllllIlllIIllIlIIlIIIllII = this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII;
        this.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIIlIllIIIlllllIl = this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIIlIllIIIlllllIl = class_03392.IIlIIlIlIlIllIIlIlIIIIlll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIIlIllIIIlllllIl = this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIIlIllIIIlllllIl;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, float f) {
        float f2;
        Item class_06112;
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_03392, f);
        ItemStack class_08972 = class_03392.lIIIIlIlIlIIIlIIllIIlIlIl();
        ItemStack class_08973 = class_03392.lIIIIlIlIIlllllIIllIIlIII(3);
        if (class_08973 != null) {
            GL11.glPushMatrix();
            this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(0.0625f);
            class_06112 = class_08973.lllIIIllIIIIlllIlIIllIIll();
            if (class_06112 instanceof class_1272) {
                if (class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_06112).lIIIIlIlIIlllllIIllIIlIII())) {
                    f2 = 0.625f;
                    GL11.glTranslatef((float)0.0f, (float)-0.25f, (float)0.0f);
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glScalef((float)f2, (float)(-f2), (float)(-f2));
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_03392, class_08973, 0);
            } else if (class_06112 == Items.skull) {
                f2 = 1.0625f;
                GL11.glScalef((float)f2, (float)(-f2), (float)(-f2));
                GameProfile gameProfile = null;
                if (class_08973.IlIlIIlIlIllIIlIlIIllIIIl()) {
                    class_0775 class_07752 = class_08973.lllllIlllIIllIlIIlIIIllII();
                    if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SkullOwner", 10)) {
                        gameProfile = class_0860.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("SkullOwner"));
                    } else if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SkullOwner", 8) && !class_1911.lllIlIIlIIIlIlIIIllIlllIl(class_07752.IllIIIllIIIIlIlIlIllIIlll("SkullOwner"))) {
                        gameProfile = new GameProfile((UUID)null, class_07752.IllIIIllIIIIlIlIlIllIIlll("SkullOwner"));
                    }
                }
                class_0619.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(-0.5f, 0.0f, -0.5f, 1, 180.0f, class_08973.IllIIIllIIIIlIlIlIllIIlll(), gameProfile);
            }
            GL11.glPopMatrix();
        }
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() != null) {
            class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPushMatrix();
            if (this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII) {
                f2 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.625f, (float)0.0f);
                GL11.glRotatef((float)-20.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)f2, (float)f2);
            }
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl(0.0625f);
            GL11.glTranslatef((float)-0.0625f, (float)0.4375f, (float)0.0625f);
            if (class_06112 instanceof class_1272 && class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_06112).lIIIIlIlIIlllllIIllIIlIII())) {
                f2 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)-0.3125f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(-(f2 *= 0.75f)), (float)(-f2), (float)f2);
            } else if (class_06112 == Items.bow) {
                f2 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.3125f);
                GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else if (class_06112.IllIIlllllllIIlIIlIIIIlIl()) {
                f2 = 0.625f;
                if (class_06112.IIIllIllIIlIlIlIlIllllIIl()) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.0f);
                }
                this.lIlllIlllIIIIlIIlllIllIII();
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                f2 = 0.375f;
                GL11.glTranslatef((float)0.25f, (float)0.1875f, (float)-0.1875f);
                GL11.glScalef((float)f2, (float)f2, (float)f2);
                GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (class_08972.lllIIIllIIIIlllIlIIllIIll().IlIlIIlIlIllIIlIlIIllIIIl()) {
                for (int i = 0; i <= 1; ++i) {
                    int n = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, i);
                    float f3 = (float)(n >> 16 & 0xFF) / 255.0f;
                    float f4 = (float)(n >> 8 & 0xFF) / 255.0f;
                    float f5 = (float)(n & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)1.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_03392, class_08972, i);
                }
            } else {
                int n = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, 0);
                float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
                float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
                float f8 = (float)(n & 0xFF) / 255.0f;
                GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)1.0f);
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_03392, class_08972, 0);
            }
            GL11.glPopMatrix();
        }
    }

    protected void lIlllIlllIIIIlIIlllIllIII() {
        GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)0.0f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, int n, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl((class_0339)class_19652, n, f);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0339)class_19652, n, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0339)class_19652, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0339)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0339)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0339)class_15212, d, d2, d3, f, f2);
    }
}

