package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1198
extends class_2052 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/enchanting_table_book.png");
    private class_2157 IlIllllllIIlIIllllIIlIIIl = new class_2157();

    public void lllIIIllIIIIlllIlIIllIIll(class_2014 class_20142, double d, double d2, double d3, float f) {
        float f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d + 0.5f), (float)((float)d2 + 0.75f), (float)((float)d3 + 0.5f));
        float f3 = (float)class_20142.IllIIlllllllIIlIIlIIIIlIl + f;
        GL11.glTranslatef((float)0.0f, (float)(0.1f + MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.1f) * 0.01f), (float)0.0f);
        for (f2 = class_20142.IlIlllIIIIIIlIIllIIllIlll - class_20142.IlIlIIlIlIllIIlIlIIllIIIl; f2 >= (float)Math.PI; f2 -= (float)Math.PI * 2) {
        }
        while (f2 < (float)(-Math.PI)) {
            f2 += (float)Math.PI * 2;
        }
        float f4 = class_20142.IlIlIIlIlIllIIlIlIIllIIIl + f2 * f;
        GL11.glRotatef((float)(-f4 * 180.0f / (float)Math.PI), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)80.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        float f5 = class_20142.IllIIIllIIIIlIlIlIllIIlll + (class_20142.IIIllIllIIlIlIlIlIllllIIl - class_20142.IllIIIllIIIIlIlIlIllIIlll) * f + 0.25f;
        float f6 = class_20142.IllIIIllIIIIlIlIlIllIIlll + (class_20142.IIIllIllIIlIlIlIlIllllIIl - class_20142.IllIIIllIIIIlIlIlIllIIlll) * f + 0.75f;
        f5 = (f5 - (float) MathHelper.lllIlIIlIIIlIlIIIllIlllIl((double)f5)) * 1.6f - 0.3f;
        f6 = (f6 - (float) MathHelper.lllIlIIlIIIlIlIIIllIlllIl((double)f6)) * 1.6f - 0.3f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = class_20142.lllIIlIIIllllllIIIIlIlIlI + (class_20142.llIIllIllIlIIlIIllIllllll - class_20142.lllIIlIIIllllllIIIIlIlIlI) * f;
        GL11.glEnable((int)2884);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(null, f3, f5, f6, f7, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2014)class_17742, d, d2, d3, f);
    }
}

