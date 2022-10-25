package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import org.lwjgl.opengl.GL11;

public class class_1491
extends class_2154 {
    protected void lllIIIllIIIIlllIlIIllIIll(class_0858 class_08582, float f, Block class_05492, int n) {
        int n2 = class_08582.llIIlIllIllllIlIIIIlIIlll();
        if (n2 > -1 && (float)n2 - f + 1.0f < 10.0f) {
            float f2 = 1.0f - ((float)n2 - f + 1.0f) / 10.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * 0.3f;
            GL11.glScalef((float)f3, (float)f3, (float)f3);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_08582, f, class_05492, n);
        if (n2 > -1 && n2 / 5 % 2 == 0) {
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)772);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)((1.0f - ((float)n2 - f + 1.0f) / 100.0f) * 0.8f));
            GL11.glPushMatrix();
            this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(Blocks.tnt, 0, 1.0f);
            GL11.glPopMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1860 class_18602, float f, Block class_05492, int n) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0858)class_18602, f, class_05492, n);
    }
}

