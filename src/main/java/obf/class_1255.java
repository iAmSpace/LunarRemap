package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class class_1255
extends class_1603 {
    private float lllIIIllIIIIlllIlIIllIIll;

    public class_1255(float f) {
        this.lllIIIllIIIIlllIlIIllIIll = f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1937 class_19372, double d, double d2, double d3, float f, float f2) {
        GL11.glPushMatrix();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_19372);
        GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
        GL11.glEnable((int)32826);
        float f3 = this.lllIIIllIIIIlllIlIIllIIll;
        GL11.glScalef((float)(f3 / 1.0f), (float)(f3 / 1.0f), (float)(f3 / 1.0f));
        IIcon class_21022 = Items.fire_charge.IlIllllllIIlIIllllIIlIIIl(0);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        float f4 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        float f5 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        float f6 = class_21022.IlIIIIIllllllIIlllIllllll();
        float f7 = class_21022.lIllllIIlIIIlIllllllIIIll();
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        GL11.glRotatef((float)(180.0f - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII), (float)1.0f, (float)0.0f, (float)0.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f9, 0.0f - f10, 0.0, f4, f7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f8 - f9, 0.0f - f10, 0.0, f5, f7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f8 - f9, 1.0f - f10, 0.0, f5, f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f9, 1.0f - f10, 0.0, f4, f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)32826);
        GL11.glPopMatrix();
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1937 class_19372) {
        return class_1511.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1937)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1937)class_15212, d, d2, d3, f, f2);
    }
}

