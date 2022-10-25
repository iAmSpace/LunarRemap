package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_2059 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/map/map_background.png");
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/misc/underwater.png");
    private Minecraft lIlllIlllIIIIlIIlllIllIII;
    private ItemStack IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1333 IllIIlllllllIIlIIlIIIIlIl = new class_1333();
    private int IIIllIllIIlIlIlIlIllllIIl = -1;

    public class_2059(Minecraft class_06672) {
        this.lIlllIlllIIIIlIIlllIllIII = class_06672;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, ItemStack class_08972, int n) {
        GL11.glPushMatrix();
        class_1682 class_16822 = this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII();
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(class_06112);
        if (class_08972 != null && class_05492 != null && class_05492.lllllIlllIIllIlIIlIIIllII() != 0) {
            GL11.glEnable((int)3042);
            GL11.glEnable((int)2884);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        }
        if (class_08972.IlIllllllIIlIIllllIIlIIIl() == 0 && class_06112 instanceof class_1272 && class_1333.lllIIIllIIIIlllIlIIllIIll(class_05492.lIIIIlIlIIlllllIIllIIlIII())) {
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_16822.lllIIIllIIIIlllIlIIllIIll(0));
            if (class_08972 != null && class_05492 != null && class_05492.lllllIlllIIllIlIIlIIIllII() != 0) {
                GL11.glDepthMask((boolean)false);
                this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(class_05492, class_08972.IllIIIllIIIIlIlIlIllIIlll(), 1.0f);
                GL11.glDepthMask((boolean)true);
            } else {
                this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(class_05492, class_08972.IllIIIllIIIIlIlIlIllIIlll(), 1.0f);
            }
        } else {
            class_2102 class_21022 = class_19652.lllIIIllIIIIlllIlIIllIIll(class_08972, n);
            if (class_21022 == null) {
                GL11.glPopMatrix();
                return;
            }
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_16822.lllIIIllIIIIlllIlIIllIIll(class_08972.IlIllllllIIlIIllllIIlIIIl()));
            class_0231.lllIIIllIIIIlllIlIIllIIll(false, false, 1.0f);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            float f = class_21022.IlIllllllIIlIIllllIIlIIIl();
            float f2 = class_21022.lIlllIlllIIIIlIIlllIllIII();
            float f3 = class_21022.IlIIIIIllllllIIlllIllllll();
            float f4 = class_21022.lIllllIIlIIIlIllllllIIIll();
            float f5 = 0.0f;
            float f6 = 0.3f;
            GL11.glEnable((int)32826);
            GL11.glTranslatef((float)(-f5), (float)(-f6), (float)0.0f);
            float f7 = 1.5f;
            GL11.glScalef((float)f7, (float)f7, (float)f7);
            GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)335.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-0.9375f, (float)-0.0625f, (float)0.0f);
            class_2059.lllIIIllIIIIlllIlIIllIIll(class_08682, f2, f3, f, f4, class_21022.lllIIIllIIIIlllIlIIllIIll(), class_21022.lllIlIIlIIIlIlIIIllIlllIl(), 0.0625f);
            if (class_08972.IIlllIlIlllIllIIIlllIIlIl() && n == 0 && LunarClient.getInstance().getSettingsManager().lllIIIllIIIIlllIlIIllIIll()) {
                GL11.glDepthFunc((int)514);
                GL11.glDisable((int)2896);
                class_16822.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(768, 1, 1, 0);
                float f8 = 0.76f;
                GL11.glColor4f((float)(0.5f * f8), (float)(0.25f * f8), (float)(0.8f * f8), (float)1.0f);
                GL11.glMatrixMode((int)5890);
                GL11.glPushMatrix();
                float f9 = 0.125f;
                GL11.glScalef((float)f9, (float)f9, (float)f9);
                float f10 = (float)(Minecraft.llllllIlIllllIlIlIlIIIIlI() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef((float)f10, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_2059.lllIIIllIIIIlllIlIIllIIll(class_08682, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)f9, (float)f9, (float)f9);
                f10 = (float)(Minecraft.llllllIlIllllIlIlIlIIIIlI() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef((float)(-f10), (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_2059.lllIIIllIIIIlllIlIIllIIll(class_08682, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glMatrixMode((int)5888);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)2896);
                GL11.glDepthFunc((int)515);
            }
            GL11.glDisable((int)32826);
            class_16822.lllIIIllIIIIlllIlIIllIIll(class_16822.lllIIIllIIIIlllIlIIllIIll(class_08972.IlIllllllIIlIIllllIIlIIIl()));
            class_0231.lllIlIIlIIIlIlIIIllIlllIl();
        }
        if (class_08972 != null && class_05492 != null && class_05492.lllllIlllIIllIlIIlIIIllII() != 0) {
            GL11.glDisable((int)3042);
        }
        GL11.glPopMatrix();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, int n, int n2, float f5) {
        float f6;
        float f7;
        float f8;
        int n3;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, f, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 0.0, 0.0, f3, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, 0.0, f3, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 1.0, 0.0, f, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 1.0, 0.0f - f5, f, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 1.0, 0.0f - f5, f3, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, 0.0, 0.0f - f5, f3, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0f - f5, f, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        float f9 = 0.5f * (f - f3) / (float)n;
        float f10 = 0.5f * (f4 - f2) / (float)n2;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
        for (n3 = 0; n3 < n; ++n3) {
            f8 = (float)n3 / (float)n;
            f7 = f + (f3 - f) * f8 - f9;
            class_08682.lllIIIllIIIIlllIlIIllIIll(f8, 0.0, 0.0f - f5, f7, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f8, 0.0, 0.0, f7, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f8, 1.0, 0.0, f7, f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f8, 1.0, 0.0f - f5, f7, f2);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
        for (n3 = 0; n3 < n; ++n3) {
            f8 = (float)n3 / (float)n;
            f7 = f + (f3 - f) * f8 - f9;
            f6 = f8 + 1.0f / (float)n;
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, 1.0, 0.0f - f5, f7, f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, 1.0, 0.0, f7, f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, 0.0, 0.0, f7, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, 0.0, 0.0f - f5, f7, f4);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
        for (n3 = 0; n3 < n2; ++n3) {
            f8 = (float)n3 / (float)n2;
            f7 = f4 + (f2 - f4) * f8 - f10;
            f6 = f8 + 1.0f / (float)n2;
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f6, 0.0, f, f7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, f6, 0.0, f3, f7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, f6, 0.0f - f5, f3, f7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f6, 0.0f - f5, f, f7);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
        for (n3 = 0; n3 < n2; ++n3) {
            f8 = (float)n3 / (float)n2;
            f7 = f4 + (f2 - f4) * f8 - f10;
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, f8, 0.0, f3, f7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f8, 0.0, f, f7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, f8, 0.0f - f5, f, f7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0, f8, 0.0f - f5, f3, f7);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        float f2;
        float f3;
        float f4;
        class_1488 class_14882 = LunarClient.getInstance().getModuleManager().IlIIIlIIIIllIIIllIIIIIIll;
        float f5 = class_14882.lllIIIllIIIIlllIlIIllIIll ? this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll - class_14882.lllIlIIlIIIlIlIIIllIlllIl : 0.0f;
        float f6 = this.IIIllIIlIIIIIIlIlIIllIIlI + (this.lIllllIIlIIIlIllllllIIIll - this.IIIllIIlIIIIIIlIlIIllIIlI) * f;
        class_1389 class_13892 = this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII;
        float f7 = class_13892.llIIIIllIIIIIIIlIIIlIIIIl + (class_13892.IlIlIIlllIllllllllIIIlIlI - class_13892.llIIIIllIIIIIIIlIIIlIIIIl) * f;
        GL11.glPushMatrix();
        GL11.glRotatef((float)f7, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)(class_13892.llllIIIIlIIIlIIIIIIlIllll + (class_13892.IIIIlIllIlIIlIIlIllIlIlll - class_13892.llllIIIIlIIIlIIIIIIlIllll) * f), (float)0.0f, (float)1.0f, (float)0.0f);
        class_0624.lllIlIIlIIIlIlIIIllIlllIl();
        GL11.glPopMatrix();
        class_1389 class_13893 = class_13892;
        float f8 = class_13893.lIIIIlIlIIlllllIIllIIlIII + (class_13893.IIIllIllIIlIlIlIlIllllIIl - class_13893.lIIIIlIlIIlllllIIllIIlIII) * f;
        float f9 = class_13893.IllIIIllIIIIlIlIlIllIIlll + (class_13893.IllIIlllllllIIlIIlIIIIlIl - class_13893.IllIIIllIIIIlIlIlIllIIlll) * f + f5 * 10.0f;
        GL11.glRotatef((float)((class_13892.IlIlIIlllIllllllllIIIlIlI - f8) * 0.1f), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)((class_13892.IIIIlIllIlIIlIIlIllIlIlll - f9) * 0.1f), (float)0.0f, (float)1.0f, (float)0.0f);
        ItemStack class_08972 = this.IlIIIIIllllllIIlllIllllll;
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_2266) {
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        }
        int n = this.lIlllIlllIIIIlIIlllIllIII.theWorld.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_13892.IllIIIIllIIllIllIlllIlIIl), 0);
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.lllIIIllIIIIlllIlIIllIIll(OpenGlHelper.IlIllllllIIlIIllllIIlIIIl, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (class_08972 != null) {
            int n4 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, 0);
            f4 = (float)(n4 >> 16 & 0xFF) / 255.0f;
            f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
            f2 = (float)(n4 & 0xFF) / 255.0f;
            GL11.glColor4f((float)f4, (float)f3, (float)f2, (float)1.0f);
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IIIIIlllIIllllIlllIlllIIl) {
            float f10;
            int n5;
            GL11.glPushMatrix();
            float f11 = 0.8f;
            f4 = class_13892.llIIllIllIlIIlIIllIllllll(f);
            f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4 * (float)Math.PI);
            f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI);
            GL11.glTranslatef((float)(-f2 * 0.4f), (float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI * 2.0f) * 0.2f), (float)(-f3 * 0.2f));
            f4 = 1.0f - f7 / 45.0f + 0.1f;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            f4 = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f4 * (float)Math.PI) * 0.5f + 0.5f;
            GL11.glTranslatef((float)0.0f, (float)(0.0f * f11 - (1.0f - f6) * 1.2f - f4 * 0.5f + 0.04f), (float)(-0.9f * f11));
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(f4 * -85.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glEnable((int)32826);
            this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_13892.IlIIIIIllllllIIlllIllllll());
            for (int i = 0; i < 2; ++i) {
                n5 = i * 2 - 1;
                GL11.glPushMatrix();
                GL11.glTranslatef((float)-0.0f, (float)-0.6f, (float)(1.1f * (float)n5));
                GL11.glRotatef((float)(-45 * n5), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)59.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)(-65 * n5), (float)0.0f, (float)1.0f, (float)0.0f);
                class_1603 class_16032 = class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII);
                class_0831 class_08312 = (class_0831)class_16032;
                f10 = 1.0f;
                GL11.glScalef((float)f10, (float)f10, (float)f10);
                class_08312.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII);
                GL11.glPopMatrix();
            }
            f3 = class_13892.llIIllIllIlIIlIIllIllllll(f);
            f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * f3 * (float)Math.PI);
            float f12 = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f3) * (float)Math.PI);
            GL11.glRotatef((float)(-f2 * 20.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-f12 * 20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(-f12 * 80.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            float f13 = 0.38f;
            GL11.glScalef((float)f13, (float)f13, (float)f13);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glTranslatef((float)-1.0f, (float)-1.0f, (float)0.0f);
            f10 = 0.015625f;
            GL11.glScalef((float)f10, (float)f10, (float)f10);
            this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            n5 = 7;
            class_08682.lllIIIllIIIIlllIlIIllIIll(0 - n5, 128 + n5, 0.0, 0.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(128 + n5, 128 + n5, 0.0, 1.0, 1.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(128 + n5, 0 - n5, 0.0, 1.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0 - n5, 0 - n5, 0.0, 0.0, 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_0963 class_09632 = Items.IIIIIlllIIllllIlllIlllIIl.lllIIIllIIIIlllIlIIllIIll(class_08972, this.lIlllIlllIIIIlIIlllIllIII.theWorld);
            if (class_09632 != null) {
                this.lIlllIlllIIIIlIIlllIllIII.lIIlIIIIIlIlllIlIIlIlIlll.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(class_09632, false);
            }
            GL11.glPopMatrix();
        } else if (class_08972 != null) {
            float f14;
            float f15;
            GL11.glPushMatrix();
            float f16 = 0.8f;
            if (class_13892.IllIlllIIIlllllIllIIlIlIl() > 0) {
                class_1484 class_14842 = class_08972.IlIlllIIIIIIlIIllIIllIlll();
                if (class_14842 == class_1484.lllIlIIlIIIlIlIIIllIlllIl || class_14842 == class_1484.IlIllllllIIlIIllllIIlIIIl) {
                    f3 = (float)class_13892.IllIlllIIIlllllIllIIlIlIl() - f + 1.0f;
                    f2 = 1.0f - f3 / (float)class_08972.lllIIlIIIllllllIIIIlIlIlI();
                    float f17 = 1.0f - f2;
                    f17 = f17 * f17 * f17;
                    f17 = f17 * f17 * f17;
                    f17 = f17 * f17 * f17;
                    float f18 = 1.0f - f17;
                    GL11.glTranslatef((float)0.0f, (float)(MathHelper.IlIIIIIllllllIIlllIllllll(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3 / 4.0f * (float)Math.PI) * 0.1f) * (float)((double)f2 > 0.2 ? 1 : 0)), (float)0.0f);
                    GL11.glTranslatef((float)(f18 * 0.6f), (float)(-f18 * 0.5f), (float)0.0f);
                    GL11.glRotatef((float)(f18 * 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(f18 * 10.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(f18 * 30.0f), (float)0.0f, (float)0.0f, (float)1.0f);
                }
            } else {
                f4 = class_13892.llIIllIllIlIIlIIllIllllll(f);
                f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4 * (float)Math.PI);
                f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI);
                GL11.glTranslatef((float)(-f2 * 0.4f), (float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI * 2.0f) * 0.2f), (float)(-f3 * 0.2f));
            }
            GL11.glTranslatef((float)(0.7f * f16), (float)(-0.65f * f16 - (1.0f - f6) * 0.6f), (float)(-0.9f * f16));
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glEnable((int)32826);
            f4 = class_13892.llIIllIllIlIIlIIllIllllll(f);
            f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4 * f4 * (float)Math.PI);
            f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI);
            GL11.glRotatef((float)(-f3 * 20.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-f2 * 20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(-f2 * 80.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            float f19 = 0.4f;
            GL11.glScalef((float)f19, (float)f19, (float)f19);
            if (class_13892.IllIlllIIIlllllIllIIlIlIl() > 0) {
                class_1484 class_14843 = class_08972.IlIlllIIIIIIlIIllIIllIlll();
                if (class_14843 == class_1484.lIlllIlllIIIIlIIlllIllIII) {
                    GL11.glTranslatef((float)-0.5f, (float)0.2f, (float)0.0f);
                    GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                } else if (class_14843 == class_1484.IlIIIIIllllllIIlllIllllll) {
                    GL11.glRotatef((float)-18.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)-12.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)-8.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glTranslatef((float)-0.9f, (float)0.2f, (float)0.0f);
                    f15 = (float)class_08972.lllIIlIIIllllllIIIIlIlIlI() - ((float)class_13892.IllIlllIIIlllllIllIIlIlIl() - f + 1.0f);
                    float f20 = f15 / 20.0f;
                    f20 = (f20 * f20 + f20 * 2.0f) / 3.0f;
                    if (f20 > 1.0f) {
                        f20 = 1.0f;
                    }
                    if (f20 > 0.1f) {
                        GL11.glTranslatef((float)0.0f, (float)(MathHelper.lllIIIllIIIIlllIlIIllIIll((f15 - 0.1f) * 1.3f) * 0.01f * (f20 - 0.1f)), (float)0.0f);
                    }
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(f20 * 0.1f));
                    GL11.glRotatef((float)-335.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glTranslatef((float)0.0f, (float)0.5f, (float)0.0f);
                    f14 = 1.0f + f20 * 0.2f;
                    GL11.glScalef((float)1.0f, (float)1.0f, (float)f14);
                    GL11.glTranslatef((float)0.0f, (float)-0.5f, (float)0.0f);
                    GL11.glRotatef((float)50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)335.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
            }
            if (class_08972.lllIIIllIIIIlllIlIIllIIll().IIIllIllIIlIlIlIlIllllIIl()) {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (class_08972.lllIIIllIIIIlllIlIIllIIll().IlIlIIlIlIllIIlIlIIllIIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13892, class_08972, 0);
                int n6 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, 1);
                f15 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f21 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                f14 = (float)(n6 & 0xFF) / 255.0f;
                GL11.glColor4f((float)(1.0f * f15), (float)(1.0f * f21), (float)(1.0f * f14), (float)1.0f);
                this.lllIIIllIIIIlllIlIIllIIll(class_13892, class_08972, 1);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(class_13892, class_08972, 0);
            }
            GL11.glPopMatrix();
        } else if (!class_13892.lIIlIlIIllIIIlIIlIlIIIlII()) {
            GL11.glPushMatrix();
            float f22 = 0.8f;
            f4 = class_13892.llIIllIllIlIIlIIllIllllll(f);
            f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4 * (float)Math.PI);
            f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI);
            GL11.glTranslatef((float)(-f2 * 0.3f), (float)(MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI * 2.0f) * 0.4f), (float)(-f3 * 0.4f));
            GL11.glTranslatef((float)(0.8f * f22), (float)(-0.75f * f22 - (1.0f - f6) * 0.6f), (float)(-0.9f * f22));
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glEnable((int)32826);
            f4 = class_13892.llIIllIllIlIIlIIllIllllll(f);
            f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4 * f4 * (float)Math.PI);
            f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(f4) * (float)Math.PI);
            GL11.glRotatef((float)(f2 * 70.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-f3 * 20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_13892.IlIIIIIllllllIIlllIllllll());
            GL11.glTranslatef((float)-1.0f, (float)3.6f, (float)3.5f);
            GL11.glRotatef((float)120.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)200.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)5.6f, (float)0.0f, (float)0.0f);
            class_1603 class_16033 = class_2114.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII);
            class_0831 class_08313 = (class_0831)class_16033;
            float f23 = 1.0f;
            GL11.glScalef((float)f23, (float)f23, (float)f23);
            class_08313.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII);
            GL11.glPopMatrix();
        }
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_2266) {
            GL11.glDisable((int)3042);
        }
        GL11.glDisable((int)32826);
        class_0624.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        GL11.glDisable((int)3008);
        if (this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.llIIIIIlIIlIIIIllIIIlIIII()) {
            this.lIlllIlllIIIIlIIlllIllIII(f);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IlllIIIllllIIllIllIlIIlIl() && !LunarClient.getInstance().getModuleManager().lIIlIIIIIlIlllIlIIlIlIlll.lIllllIIlIIIlIllllllIIIll()) {
            int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll);
            int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI);
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl);
            Block class_05492 = this.lIlllIlllIIIIlIIlllIllIII.theWorld.a_(n, n2, n3);
            if (this.lIlllIlllIIIIlIIlllIllIII.theWorld.a_(n, n2, n3).IIIllIllIIlIlIlIlIllllIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(f, class_05492.lIlllIlllIIIIlIIlllIllIII(2));
            } else {
                for (int i = 0; i < 8; ++i) {
                    int n4;
                    int n5;
                    float f2 = ((float)((i >> 0) % 2) - 0.5f) * this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IIIIlIlIIlIIIIlIlllIlIIII * 0.9f;
                    float f3 = ((float)((i >> 1) % 2) - 0.5f) * this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.lllIIIIlIlIIlIIlllIIIIIIl * 0.2f;
                    float f4 = ((float)((i >> 2) % 2) - 0.5f) * this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IIIIlIlIIlIIIIlIlllIlIIII * 0.9f;
                    int n6 = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n + f2);
                    if (!this.lIlllIlllIIIIlIIlllIllIII.theWorld.a_(n6, n5 = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n2 + f3), n4 = MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n3 + f4)).IIIllIllIIlIlIlIlIllllIIl()) continue;
                    class_05492 = this.lIlllIlllIIIIlIIlllIllIII.theWorld.a_(n6, n5, n4);
                }
            }
            if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                this.lllIIIllIIIIlllIlIIllIIll(f, class_05492.lIlllIlllIIIIlIIlllIllIII(2));
            }
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl)) {
            this.IlIllllllIIlIIllllIIlIIIl(f);
        }
        GL11.glEnable((int)3008);
    }

    private void lllIIIllIIIIlllIlIIllIIll(float f, class_2102 class_21022) {
        this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        float f2 = 0.1f;
        GL11.glColor4f((float)f2, (float)f2, (float)f2, (float)0.5f);
        GL11.glPushMatrix();
        float f3 = -1.0f;
        float f4 = 1.0f;
        float f5 = -1.0f;
        float f6 = 1.0f;
        float f7 = -0.5f;
        float f8 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        float f9 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        float f10 = class_21022.IlIIIIIllllllIIlllIllllll();
        float f11 = class_21022.lIllllIIlIIIlIllllllIIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(f3, f5, f7, f9, f11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f4, f5, f7, f8, f11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f4, f6, f7, f8, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f3, f6, f7, f9, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void IlIllllllIIlIIllllIIlIIIl(float f) {
        this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        float f2 = this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(f);
        GL11.glColor4f((float)f2, (float)f2, (float)f2, (float)0.5f);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glPushMatrix();
        float f3 = 4.0f;
        float f4 = -1.0f;
        float f5 = 1.0f;
        float f6 = -1.0f;
        float f7 = 1.0f;
        float f8 = -0.5f;
        float f9 = -this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IIIIlIllIlIIlIIlIllIlIlll / 64.0f;
        float f10 = this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlllIllllllllIIIlIlI / 64.0f;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(f4, f6, f8, f3 + f9, f3 + f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5, f6, f8, 0.0f + f9, f3 + f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5, f7, f8, 0.0f + f9, 0.0f + f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f4, f7, f8, f3 + f9, 0.0f + f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
    }

    private void lIlllIlllIIIIlIIlllIllIII(float f) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        float f2 = 1.0f;
        for (int i = 0; i < 2; ++i) {
            GL11.glPushMatrix();
            class_2102 class_21022 = Blocks.lIIlIlllIllIlIlllIIIIIIII.IllIIlllllllIIlIIlIIIIlIl(1);
            this.lIlllIlllIIIIlIIlllIllIII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_1511.lllIIIllIIIIlllIlIIllIIll);
            float f3 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            float f4 = class_21022.lIlllIlllIIIIlIIlllIllIII();
            float f5 = class_21022.IlIIIIIllllllIIlllIllllll();
            float f6 = class_21022.lIllllIIlIIIlIllllllIIIll();
            float f7 = (0.0f - f2) / 2.0f;
            float f8 = f7 + f2;
            float f9 = 0.0f - f2 / 2.0f;
            float f10 = f9 + f2;
            float f11 = -0.5f;
            GL11.glTranslatef((float)((float)(-(i * 2 - 1)) * 0.24f), (float)-0.3f, (float)0.0f);
            GL11.glRotatef((float)((float)(i * 2 - 1) * 10.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(f7, f9, f11, f4, f6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f8, f9, f11, f3, f6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f8, f10, f11, f3, f5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f7, f10, f11, f4, f5);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glPopMatrix();
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        float f;
        float f2;
        float f3;
        boolean bl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIllllIIlIIIlIllllllIIIll;
        class_1389 class_13892 = this.lIlllIlllIIIIlIIlllIllIII.lIIIIlIlIIlllllIIllIIlIII;
        ItemStack class_08972 = class_13892.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        boolean bl2 = bl = this.IIIllIllIIlIlIlIlIllllIIl == class_13892.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl && class_08972 == this.IlIIIIIllllllIIlllIllllll;
        if (this.IlIIIIIllllllIIlllIllllll == null && class_08972 == null) {
            bl = true;
        }
        if (class_08972 != null && this.IlIIIIIllllllIIlllIllllll != null && class_08972 != this.IlIIIIIllllllIIlllIllllll && class_08972.lllIIIllIIIIlllIlIIllIIll() == this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll() && class_08972.IllIIIllIIIIlIlIlIllIIlll() == this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll()) {
            this.IlIIIIIllllllIIlllIllllll = class_08972;
            bl = true;
        }
        if ((f3 = (f2 = bl ? 1.0f : 0.0f) - this.lIllllIIlIIIlIllllllIIIll) < -(f = 0.4f)) {
            f3 = -f;
        }
        if (f3 > f) {
            f3 = f;
        }
        this.lIllllIIlIIIlIllllllIIIll += f3;
        if (this.lIllllIIlIIIlIllllllIIIll < 0.1f) {
            this.IlIIIIIllllllIIlllIllllll = class_08972;
            this.IIIllIllIIlIlIlIlIllllIIl = class_13892.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl;
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIllllIIlIIIlIllllllIIIll = 0.0f;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lIllllIIlIIIlIllllllIIIll = 0.0f;
    }
}

