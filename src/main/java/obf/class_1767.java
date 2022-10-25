package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_1767
extends class_2059 {
    private Minecraft lllIIIllIIIIlllIlIIllIIll = null;
    private static final ResourceLocation lllIlIIlIIIlIlIIIllIlllIl = new ResourceLocation("textures/misc/enchanted_item_glint.png");

    public class_1767(Minecraft class_06672) {
        super(class_06672);
        this.lllIIIllIIIIlllIlIIllIIll = class_06672;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, ItemStack class_08972, int n) {
        GL11.glPushMatrix();
        class_1682 class_16822 = this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII();
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
                this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_05492, class_08972.IllIIIllIIIIlIlIlIllIIlll(), 1.0f);
                GL11.glDepthMask((boolean)true);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_05492, class_08972.IllIIIllIIIIlIlIlIllIIlll(), 1.0f);
            }
        } else {
            boolean bl;
            IIcon class_21022 = class_19652.lllIIIllIIIIlllIlIIllIIll(class_08972, n);
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
            class_1767.lllIIIllIIIIlllIlIIllIIll(class_08682, f2, f3, f, f4, class_21022.lllIIIllIIIIlllIlIIllIIll(), class_21022.lllIlIIlIIIlIlIIIllIlllIl(), 0.0625f);
            boolean bl2 = bl = class_08972.IIlllIlIlllIllIIIlllIIlIl() && n == 0;
            if (bl && LunarClient.getInstance().getSettingsManager().lllIIIllIIIIlllIlIIllIIll()) {
                GL11.glDepthFunc((int)514);
                GL11.glDisable((int)2896);
                class_16822.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
                GL11.glEnable((int)3042);
                OpenGlHelper.glBlendFunc(768, 1, 1, 0);
                float f8 = 0.76f;
                GL11.glColor4f((float)(0.5f * f8), (float)(0.25f * f8), (float)(0.8f * f8), (float)1.0f);
                GL11.glMatrixMode((int)5890);
                GL11.glPushMatrix();
                float f9 = 0.125f;
                GL11.glScalef((float)f9, (float)f9, (float)f9);
                float f10 = (float)(Minecraft.getSystemTime() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef((float)f10, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_1767.lllIIIllIIIIlllIlIIllIIll(class_08682, 0.0f, 0.0f, 1.0f, 1.0f, 16, 16, 0.0625f);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)f9, (float)f9, (float)f9);
                f10 = (float)(Minecraft.getSystemTime() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef((float)(-f10), (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_1767.lllIIIllIIIIlllIlIIllIIll(class_08682, 0.0f, 0.0f, 1.0f, 1.0f, 16, 16, 0.0625f);
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

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.lllIIIllIIIIlllIlIIllIIll.theWorld.lllIIIllIIIIlllIlIIllIIll = true;
        super.lllIIIllIIIIlllIlIIllIIll(f);
        this.lllIIIllIIIIlllIlIIllIIll.theWorld.lllIIIllIIIIlllIlIIllIIll = false;
    }
}

