package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1350
extends class_1603 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/map/map_background.png");
    private final class_1333 lIllllIIlIIIlIllllllIIIll = new class_1333();
    private final Minecraft IIIllIIlIIIIIIlIlIIllIIlI = Minecraft.getMinecraft();
    private IIcon IllIIlllllllIIlIIlIIIIlIl;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_08872.lllIIIllIIIIlllIlIIllIIll("itemframe_background");
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1094 class_10942, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        double d4 = class_10942.IlIIlllllIIlIlIlllllIllll - d - 0.5;
        double d5 = class_10942.llIIlIlIlllIIllIlIlllIllI - d2 - 0.5;
        double d6 = class_10942.IllIIIIllIIllIllIlllIlIIl - d3 - 0.5;
        int n = class_10942.lllIlIIlIIIlIlIIIllIlllIl + class_1632.lllIIIllIIIIlllIlIIllIIll[class_10942.lllIIIllIIIIlllIlIIllIIll];
        int n2 = class_10942.IlIllllllIIlIIllllIIlIIIl;
        int n3 = class_10942.lIlllIlllIIIIlIIlllIllIII + class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_10942.lllIIIllIIIIlllIlIIllIIll];
        GL11.glTranslated((double)((double)n - d4), (double)((double)n2 - d5), (double)((double)n3 - d6));
        if (class_10942.lIllllIIlIIIlIllllllIIIll() != null && class_10942.lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll() == Items.IIIIIlllIIllllIlllIlllIIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_10942);
        } else {
            this.IlIllllllIIlIIllllIIlIIIl(class_10942);
        }
        this.lIlllIlllIIIIlIIlllIllIII(class_10942);
        GL11.glPopMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_10942, d + (double)((float)class_1632.lllIIIllIIIIlllIlIIllIIll[class_10942.lllIIIllIIIIlllIlIIllIIll] * 0.3f), d2 - 0.25, d3 + (double)((float)class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_10942.lllIIIllIIIIlllIlIIllIIll] * 0.3f));
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1094 class_10942) {
        return null;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1094 class_10942) {
        GL11.glPushMatrix();
        GL11.glRotatef((float)class_10942.IIIIlIllIlIIlIIlIllIlIlll, (float)0.0f, (float)1.0f, (float)0.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
        Block class_05492 = Blocks.lIllllIIlIIIlIllllllIIIll;
        float f = 0.0625f;
        float f2 = 1.0f;
        float f3 = f2 / 2.0f;
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3 + 0.0625f, 0.5f - f3 + 0.0625f, f, 0.5f + f3 - 0.0625f, 0.5f + f3 - 0.0625f);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
        this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
        GL11.glPopMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(Blocks.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(1, 2));
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3, 0.5f - f3, f + 1.0E-4f, f + 0.5f - f3, 0.5f + f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f + f3 - f, 0.5f - f3, f + 1.0E-4f, 0.5f + f3, 0.5f + f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3, 0.5f - f3, f, 0.5f + f3, f + 0.5f - f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3, 0.5f + f3 - f, f, 0.5f + f3, 0.5f + f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_1094 class_10942) {
        GL11.glPushMatrix();
        GL11.glRotatef((float)class_10942.IIIIlIllIlIIlIIlIllIlIlll, (float)0.0f, (float)1.0f, (float)0.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
        Block class_05492 = Blocks.lIllllIIlIIIlIllllllIIIll;
        float f = 0.0625f;
        float f2 = 0.75f;
        float f3 = f2 / 2.0f;
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3 + 0.0625f, 0.5f - f3 + 0.0625f, f * 0.5f, 0.5f + f3 - 0.0625f, 0.5f + f3 - 0.0625f);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
        this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
        GL11.glPopMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(Blocks.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(1, 2));
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3, 0.5f - f3, f + 1.0E-4f, f + 0.5f - f3, 0.5f + f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f + f3 - f, 0.5f - f3, f + 1.0E-4f, 0.5f + f3, 0.5f + f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3, 0.5f - f3, f, 0.5f + f3, f + 0.5f - f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.5f - f3, 0.5f + f3 - f, f, 0.5f + f3, 0.5f + f3);
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, 1.0f);
        GL11.glPopMatrix();
        this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
        this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
    }

    private void lIlllIlllIIIIlIIlllIllIII(class_1094 class_10942) {
        ItemStack class_08972 = class_10942.lIllllIIlIIIlIllllllIIIll();
        if (class_08972 != null) {
            class_1781 class_17812 = new class_1781(class_10942.lIlIllIIlIIlIIlIIlIIlIIll, 0.0, 0.0, 0.0, class_08972);
            Item class_06112 = class_17812.lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll();
            class_17812.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl = 1;
            class_17812.IlIllllllIIlIIllllIIlIIIl = 0.0f;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(-0.453125f * (float)class_1632.lllIIIllIIIIlllIlIIllIIll[class_10942.lllIIIllIIIIlllIlIIllIIll]), (float)-0.18f, (float)(-0.453125f * (float)class_1632.lllIlIIlIIIlIlIIIllIlllIl[class_10942.lllIIIllIIIIlllIlIIllIIll]));
            GL11.glRotatef((float)(180.0f + class_10942.IIIIlIllIlIIlIIlIllIlIlll), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-90 * class_10942.IllIIlllllllIIlIIlIIIIlIl()), (float)0.0f, (float)0.0f, (float)1.0f);
            switch (class_10942.IllIIlllllllIIlIIlIIIIlIl()) {
                case 1: {
                    GL11.glTranslatef((float)-0.16f, (float)-0.16f, (float)0.0f);
                    break;
                }
                case 2: {
                    GL11.glTranslatef((float)0.0f, (float)-0.32f, (float)0.0f);
                    break;
                }
                case 3: {
                    GL11.glTranslatef((float)0.16f, (float)-0.16f, (float)0.0f);
                }
            }
            if (class_06112 == Items.IIIIIlllIIllllIlllIlllIIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                float f = 0.0078125f;
                GL11.glScalef((float)f, (float)f, (float)f);
                switch (class_10942.IllIIlllllllIIlIIlIIIIlIl()) {
                    case 0: {
                        GL11.glTranslatef((float)-64.0f, (float)-87.0f, (float)-1.5f);
                        break;
                    }
                    case 1: {
                        GL11.glTranslatef((float)-66.5f, (float)-84.5f, (float)-1.5f);
                        break;
                    }
                    case 2: {
                        GL11.glTranslatef((float)-64.0f, (float)-82.0f, (float)-1.5f);
                        break;
                    }
                    case 3: {
                        GL11.glTranslatef((float)-61.5f, (float)-84.5f, (float)-1.5f);
                    }
                }
                GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
                class_0963 class_09632 = Items.IIIIIlllIIllllIlllIlllIIl.lllIIIllIIIIlllIlIIllIIll(class_17812.lIlllIlllIIIIlIIlllIllIII(), class_10942.lIlIllIIlIIlIIlIIlIIlIIll);
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-1.0f);
                if (class_09632 != null) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI.lIIlIIIIIlIlllIlIIlIlIlll.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(class_09632, true);
                }
            } else {
                Object object;
                if (class_06112 == Items.lllllllIlIIlIlIIIlIlIIlll) {
                    object = Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII();
                    ((class_1682)object).lllIIIllIIIIlllIlIIllIIll(class_1511.lllIlIIlIIIlIlIIIllIlllIl);
                    class_1585 class_15852 = ((class_1511)((class_1682)object).lllIlIIlIIIlIlIIIllIlllIl(class_1511.lllIlIIlIIIlIlIIIllIlllIl)).lllIlIIlIIIlIlIIIllIlllIl(Items.lllllllIlIIlIlIIIlIlIIlll.lllIIIllIIIIlllIlIIllIIll(class_17812.lIlllIlllIIIIlIIlllIllIII()).IIIllIIlIIIIIIlIlIIllIIlI());
                    if (class_15852 instanceof class_1328) {
                        class_1328 class_13282 = (class_1328)class_15852;
                        double d = class_13282.IlIlIIlIlIllIIlIlIIllIIIl;
                        double d2 = class_13282.lllllIlllIIllIlIIlIIIllII;
                        class_13282.IlIlIIlIlIllIIlIlIIllIIIl = 0.0;
                        class_13282.lllllIlllIIllIlIIlIIIllII = 0.0;
                        class_13282.lllIIIllIIIIlllIlIIllIIll(class_10942.lIlIllIIlIIlIIlIIlIIlIIll, class_10942.IlIIlllllIIlIlIlllllIllll, class_10942.IllIIIIllIIllIllIlllIlIIl, MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(180 + class_10942.lllIIIllIIIIlllIlIIllIIll * 90), false, true);
                        class_13282.IlIlIIlIlIllIIlIlIIllIIIl = d;
                        class_13282.lllllIlllIIllIlIIlIIIllII = d2;
                    }
                }
                class_1785.IIIllIIlIIIIIIlIlIIllIIlI = true;
                class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_17812, 0.0, 0.0, 0.0, 0.0f, 0.0f);
                class_1785.IIIllIIlIIIIIIlIlIIllIIlI = false;
                if (class_06112 == Items.lllllllIlIIlIlIIIlIlIIlll && ((class_1585)(object = ((class_1511) Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIlIIlIIIlIlIIIllIlllIl(class_1511.lllIlIIlIIIlIlIIIllIlllIl)).lllIlIIlIIIlIlIIIllIlllIl(Items.lllllllIlIIlIlIIIlIlIIlll.lllIIIllIIIIlllIlIIllIIll(class_17812.lIlllIlllIIIIlIIlllIllIII()).IIIllIIlIIIIIIlIlIIllIIlI()))).lIIIIlIlIIlllllIIllIIlIII() > 0) {
                    ((class_1585)object).IllIIIllIIIIlIlIlIllIIlll();
                }
            }
            GL11.glPopMatrix();
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1094 class_10942, double d, double d2, double d3) {
        if (Minecraft.llIllllIlIllIIIlIllIIlIlI() && class_10942.lIllllIIlIIIlIllllllIIIll() != null && class_10942.lIllllIIlIIIlIllllllIIIll().IlIIIlIIIIllIIIllIIIIIIll() && this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl == class_10942) {
            float f;
            float f2 = 1.6f;
            float f3 = 0.016666668f * f2;
            double d4 = class_10942.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl);
            float f4 = f = class_10942.IIlIIlIlIlIllIIlIlIIIIlll() ? 32.0f : 64.0f;
            if (d4 < (double)(f * f)) {
                String string = class_10942.lIllllIIlIIIlIllllllIIIll().lIIlIIIIIlIlllIlIIlIlIlll();
                if (class_10942.IIlIIlIlIlIllIIlIlIIIIlll()) {
                    class_1854 class_18542 = this.lllIlIIlIIIlIlIIIllIlllIl();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)((float)d + 0.0f), (float)((float)d2 + class_10942.lllIIIIlIlIIlIIlllIIIIIIl + 0.5f), (float)((float)d3));
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glScalef((float)(-f3), (float)(-f3), (float)f3);
                    GL11.glDisable((int)2896);
                    GL11.glTranslatef((float)0.0f, (float)(0.25f / f3), (float)0.0f);
                    GL11.glDepthMask((boolean)false);
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                    GL11.glDisable((int)3553);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    int n = class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2;
                    class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 0.25f);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n - 1), -1.0, 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(-n - 1), 8.0, 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1), 8.0, 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1), -1.0, 0.0);
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glEnable((int)3553);
                    GL11.glDepthMask((boolean)true);
                    class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, 0, 0x20FFFFFF);
                    GL11.glEnable((int)2896);
                    GL11.glDisable((int)3042);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glPopMatrix();
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_10942, string, d, d2, d3, 64);
                }
            }
        }
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1094)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1094)class_15212, d, d2, d3, f, f2);
    }
}

