package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import org.lwjgl.opengl.GL11;

public class class_0599
extends class_2052 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/sign.png");
    private final class_1620 IlIllllllIIlIIllllIIlIIIl = new class_1620();

    public void lllIIIllIIIIlllIlIIllIIll(class_2219 class_22192, double d, double d2, double d3, float f) {
        float f2;
        Block class_05492 = class_22192.IIIllIIlIIIIIIlIlIIllIIlI();
        GL11.glPushMatrix();
        float f3 = 0.6666667f;
        if (class_05492 == Blocks.IlIlIllIIlIIIIlllIlIllIlI) {
            GL11.glTranslatef((float)((float)d + 0.5f), (float)((float)d2 + 0.75f * f3), (float)((float)d3 + 0.5f));
            float f4 = (float)(class_22192.lIlllIlllIIIIlIIlllIllIII() * 360) / 16.0f;
            GL11.glRotatef((float)(-f4), (float)0.0f, (float)1.0f, (float)0.0f);
            this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = true;
        } else {
            int n = class_22192.lIlllIlllIIIIlIIlllIllIII();
            f2 = 0.0f;
            if (n == 2) {
                f2 = 180.0f;
            }
            if (n == 4) {
                f2 = 90.0f;
            }
            if (n == 5) {
                f2 = -90.0f;
            }
            GL11.glTranslatef((float)((float)d + 0.5f), (float)((float)d2 + 0.75f * f3), (float)((float)d3 + 0.5f));
            GL11.glRotatef((float)(-f2), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)0.0f, (float)-0.3125f, (float)-0.4375f);
            this.IlIllllllIIlIIllllIIlIIIl.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        GL11.glPushMatrix();
        GL11.glScalef((float)f3, (float)(-f3), (float)(-f3));
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
        GL11.glPopMatrix();
        class_1854 class_18542 = this.lllIIIllIIIIlllIlIIllIIll();
        f2 = 0.016666668f * f3;
        GL11.glTranslatef((float)0.0f, (float)(0.5f * f3), (float)(0.07f * f3));
        GL11.glScalef((float)f2, (float)(-f2), (float)f2);
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(-1.0f * f2));
        GL11.glDepthMask((boolean)false);
        int n = 0;
        for (int i = 0; i < class_22192.IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            String string = class_22192.IllIIlllllllIIlIIlIIIIlIl[i];
            if (i == class_22192.IIIllIllIIlIlIlIlIllllIIl) {
                string = "> " + string + " <";
                class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, i * 10 - class_22192.IllIIlllllllIIlIIlIIIIlIl.length * 5, n);
                continue;
            }
            class_18542.lllIlIIlIIIlIlIIIllIlllIl(string, -class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2, i * 10 - class_22192.IllIIlllllllIIlIIlIIIIlIl.length * 5, n);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2219)class_17742, d, d2, d3, f);
    }
}

