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
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0831
extends class_1518 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/steve.png");
    private class_1931 lIllllIIlIIIlIllllllIIIll;
    private class_1931 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1931 IllIIlllllllIIlIIlIIIIlIl;

    public class_0831() {
        super(new class_1931(0.0f), 0.5f);
        this.lIllllIIlIIIlIllllllIIIll = (class_1931)this.llIIllIllIlIIlIIllIllllll;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1931(1.0f);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1931(0.5f);
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, int n, float f) {
        Item class_06112;
        ItemStack class_08972 = class_21742.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(3 - n);
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

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_2174 class_21742, int n, float f) {
        Item class_06112;
        ItemStack class_08972 = class_21742.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(3 - n);
        if (class_08972 != null && (class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll()) instanceof ItemArmor) {
            this.lllIIIllIIIIlllIlIIllIIll(class_0796.lllIlIIlIIIlIlIIIllIlllIl((ItemArmor)class_06112, n));
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, double d, double d2, double d3, float f, float f2) {
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        ItemStack class_08972 = class_21742.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII = class_08972 != null ? 1 : 0;
        this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII = this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllllIlllIIllIlIIlIIIllII = this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII;
        if (class_08972 != null && class_21742.IllIlllIIIlllllIllIIlIlIl() > 0) {
            class_1484 class_14842 = class_08972.IlIlllIIIIIIlIIllIIllIlll();
            if (class_14842 == class_1484.lIlllIlllIIIIlIIlllIllIII) {
                this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII = 3;
                this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII = 3;
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllllIlllIIllIlIIlIIIllII = 3;
            } else if (class_14842 == class_1484.IlIIIIIllllllIIlllIllllll) {
                this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll = true;
                this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll = true;
                this.IIIllIIlIIIIIIlIlIIllIIlI.lIIlIIIIIlIlllIlIIlIlIlll = true;
            }
        }
        this.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIIlIllIIIlllllIl = this.lIllllIIlIIIlIllllllIIIll.IlIlIIlllIIlIllIIIlllllIl = class_21742.IIlIIlIlIlIllIIlIlIIIIlll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIIlIllIIIlllllIl = this.lIllllIIlIIIlIllllllIIIll.IlIlIIlllIIlIllIIIlllllIl;
        double d4 = d2 - (double)class_21742.llllIlIIIIIIIIIlllIIlIIIl;
        if (class_21742.IIlIIlIlIlIllIIlIlIIIIlll() && !(class_21742 instanceof class_0139)) {
            d4 -= 0.125;
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_21742, d, d4, d3, f, f2);
        this.lIllllIIlIIIlIllllllIIIll.lIIlIIIIIlIlllIlIIlIlIlll = false;
        this.IllIIlllllllIIlIIlIIIIlIl.lIIlIIIIIlIlllIlIIlIlIlll = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIIlIIIIIlIlllIlIIlIlIlll = false;
        this.lIllllIIlIIIlIllllllIIIll.IlIlIIlllIIlIllIIIlllllIl = false;
        this.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIIlIllIIIlllllIl = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIIlIllIIIlllllIl = false;
        this.lIllllIIlIIIlIllllllIIIll.lllllIlllIIllIlIIlIIIllII = 0;
        this.IllIIlllllllIIlIIlIIIIlIl.lllllIlllIIllIlIIlIIIllII = 0;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllllIlllIIllIlIIlIIIllII = 0;
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl = false;
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl = false;
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742) {
        return class_21742.IlIIIIIllllllIIlllIllllll();
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, float f) {
        ItemStack class_08972;
        boolean bl;
        float f2;
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_21742, f);
        super.IlIIIIIllllllIIlllIllllll(class_21742, f);
        ItemStack class_08973 = class_21742.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(3);
        if (class_08973 != null) {
            GL11.glPushMatrix();
            this.lIllllIIlIIIlIllllllIIIll.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(0.0625f);
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() instanceof class_1272) {
                if (class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_08973.lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII())) {
                    f2 = 0.625f;
                    GL11.glTranslatef((float)0.0f, (float)-0.25f, (float)0.0f);
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glScalef((float)f2, (float)(-f2), (float)(-f2));
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_21742, class_08973, 0);
            } else if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.skull) {
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
        if ((bl = class_21742.IlIllllllIIlIIllllIIlIIIl()) && !class_21742.lIIlIlIIllIIIlIIlIlIIIlII() && !class_21742.IlIllIIIIllllIIllIllIIIIl()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_21742.lIllllIIlIIIlIllllllIIIll());
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.125f);
            double d = class_21742.lIIIlllllllIlllIIllllllll + (class_21742.lIlIlllIllllIIlllIlllIIIl - class_21742.lIIIlllllllIlllIIllllllll) * (double)f - (class_21742.llIIlIllIllllIlIIIIlIIlll + (class_21742.IlIIlllllIIlIlIlllllIllll - class_21742.llIIlIllIllllIlIIIIlIIlll) * (double)f);
            double d2 = class_21742.IIllllIIlIlIlIlllIIIllIIl + (class_21742.lIlIllllIlIIIIIllIIIIlIlI - class_21742.IIllllIIlIlIlIlllIIIllIIl) * (double)f - (class_21742.llIllllIlIllIIIlIllIIlIlI + (class_21742.llIIlIlIlllIIllIlIlllIllI - class_21742.llIllllIlIllIIIlIllIIlIlI) * (double)f);
            double d3 = class_21742.IIIllIIIlIlllllllIIIlllll + (class_21742.IIlllllIIlIIlIlIIlIIlIlII - class_21742.IIIllIIIlIlllllllIIIlllll) * (double)f - (class_21742.lIlllIlllIlIIIIlllIlIlIIl + (class_21742.IllIIIIllIIllIllIlllIlIIl - class_21742.lIlllIlllIlIIIIlllIlIlIIl) * (double)f);
            float f3 = class_21742.lIIllIlIllIlIlIIlIlIIIIll + (class_21742.lllllIllllIIIIllIIlIlIlII - class_21742.lIIllIlIllIlIlIIlIlIIIIll) * f;
            double d4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * (float)Math.PI / 180.0f);
            double d5 = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 * (float)Math.PI / 180.0f);
            float f4 = (float)d2 * 10.0f;
            if (f4 < -6.0f) {
                f4 = -6.0f;
            }
            if (f4 > 32.0f) {
                f4 = 32.0f;
            }
            float f5 = (float)(d * d4 + d3 * d5) * 100.0f;
            float f6 = (float)(d * d5 - d3 * d4) * 100.0f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            float f7 = class_21742.lIIlIIIlIlIIlllIlIllIllIl + (class_21742.lIIlIlIIIIIllIIIIllIlIlII - class_21742.lIIlIIIlIlIIlllIlIllIllIl) * f;
            f4 += MathHelper.lllIIIllIIIIlllIlIIllIIll((class_21742.llIlIIlllIIIIIllIIlIlIIII + (class_21742.IllIIIlllllIlIlllIlllllII - class_21742.llIlIIlllIIIIIllIIlIlIIII) * f) * 6.0f) * 32.0f * f7;
            if (class_21742.IIlIIlIlIlIllIIlIlIIIIlll()) {
                f4 += 25.0f;
            }
            GL11.glRotatef((float)(6.0f + f5 / 2.0f + f4), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(f6 / 2.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(-f6 / 2.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0625f);
            GL11.glPopMatrix();
        }
        if ((class_08972 = class_21742.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll()) != null) {
            GL11.glPushMatrix();
            this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl(0.0625f);
            GL11.glTranslatef((float)-0.0625f, (float)0.4375f, (float)0.0625f);
            if (class_21742.IIlIlIIIIlIlllIIlIIlIIIII != null) {
                class_08972 = new ItemStack(Items.llIllllIlIllIIIlIllIIlIlI);
            }
            class_1484 class_14842 = null;
            if (class_21742.IllIlllIIIlllllIllIIlIlIl() > 0) {
                class_14842 = class_08972.IlIlllIIIIIIlIIllIIllIlll();
            }
            if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1272 && class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII())) {
                f2 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)-0.3125f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(-(f2 *= 0.75f)), (float)(-f2), (float)f2);
            } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bow) {
                f2 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.3125f);
                GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else if (class_08972.lllIIIllIIIIlllIlIIllIIll().IllIIlllllllIIlIIlIIIIlIl()) {
                f2 = 0.625f;
                if (class_08972.lllIIIllIIIIlllIlIIllIIll().IIIllIllIIlIlIlIlIllllIIl()) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.0f);
                }
                if (class_21742.IllIlllIIIlllllIllIIlIlIl() > 0 && class_14842 == class_1484.lIlllIlllIIIIlIIlllIllIII) {
                    GL11.glTranslatef((float)0.05f, (float)0.0f, (float)-0.1f);
                    GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)0.0f);
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
                    float f8 = (float)(n >> 16 & 0xFF) / 255.0f;
                    float f9 = (float)(n >> 8 & 0xFF) / 255.0f;
                    float f10 = (float)(n & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f8, (float)f9, (float)f10, (float)1.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_21742, class_08972, i);
                }
            } else {
                int n = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, 0);
                float f11 = (float)(n >> 16 & 0xFF) / 255.0f;
                float f12 = (float)(n >> 8 & 0xFF) / 255.0f;
                float f13 = (float)(n & 0xFF) / 255.0f;
                GL11.glColor4f((float)f11, (float)f12, (float)f13, (float)1.0f);
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_21742, class_08972, 0);
            }
            GL11.glPopMatrix();
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_2174 class_21742, float f) {
        float f2 = 0.9375f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, double d, double d2, double d3, String string, float f, double d4) {
        class_0141 class_01412;
        class_0693 class_06932;
        if (d4 < 100.0 && (class_06932 = (class_01412 = class_21742.lIlIlIIllIlIIIIIlIIlllIlI()).lllIIIllIIIIlllIlIIllIIll(2)) != null) {
            class_0678 class_06782 = class_01412.lllIIIllIIIIlllIlIIllIIll(class_21742.llllIIIIlIIIlIIIIIIlIllll(), class_06932);
            if (class_21742.IIIIIllIIlIlIlIIlIlIlIllI()) {
                this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_21742, class_06782.lllIlIIlIIIlIlIIIllIlllIl() + " " + class_06932.lIlllIlllIIIIlIIlllIllIII(), d, d2 - 1.5, d3, 64);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_21742, class_06782.lllIlIIlIIIlIlIIIllIlllIl() + " " + class_06932.lIlllIlllIIIIlIIlllIllIII(), d, d2, d3, 64);
            }
            d2 += (double)((float)this.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll * 1.15f * f);
        }
        super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_21742, d, d2, d3, string, f, d4);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        float f = 1.0f;
        GL11.glColor3f((float)f, (float)f, (float)f);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll = 0.0f;
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, class_08142);
        this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(0.0625f);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, double d, double d2, double d3) {
        if (class_21742.IlllIIlllllllIIllIlIllllI() && class_21742.IIIIIllIIlIlIlIIlIlIlIllI()) {
            super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_21742, d + (double)class_21742.lIllIIlIlllIllIlIlIlIllII, d2 + (double)class_21742.IIIIIllIIlIlIlIIlIlIlIllI, d3 + (double)class_21742.lIlIIlIIlIIIIllIIlIllIlll);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_21742, d, d2, d3);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742, float f, float f2, float f3) {
        if (class_21742.IlllIIlllllllIIllIlIllllI() && class_21742.IIIIIllIIlIlIlIIlIlIlIllI()) {
            GL11.glRotatef((float)class_21742.IIIlIIllIIlIlIIlIIllIIIIl(), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)this.lllIlIIlIIIlIlIIIllIlllIl(class_21742), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)270.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_21742, f, f2, f3);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, String string, float f, double d4) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_19652, d, d2, d3, string, f, d4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl((class_2174)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, int n, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl((class_2174)class_19652, n, f);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_19652, n, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_19652, f, f2, f3);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_19652, d, d2, d3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2174)class_15212, d, d2, d3, f, f2);
    }
}

