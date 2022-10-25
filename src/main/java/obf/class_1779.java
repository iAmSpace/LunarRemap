package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class class_1779
extends class_1603 {
    private Item lllIIIllIIIIlllIlIIllIIll;
    private int lIllllIIlIIIlIllllllIIIll;

    public class_1779(Item class_06112, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06112;
        this.lIllllIIlIIIlIllllllIIIll = n;
    }

    public class_1779(Item class_06112) {
        this(class_06112, 0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        class_2102 class_21022 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lIllllIIlIIIlIllllllIIIll);
        if (class_21022 != null) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
            GL11.glEnable((int)32826);
            GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_15212);
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            if (class_21022 == class_0483.lIlllIlllIIIIlIIlllIllIII("bottle_splash")) {
                int n = class_0668.lllIIIllIIIIlllIlIIllIIll(((class_0426)class_15212).lIllllIIlIIIlIllllllIIIll(), false);
                float f3 = (float)(n >> 16 & 0xFF) / 255.0f;
                float f4 = (float)(n >> 8 & 0xFF) / 255.0f;
                float f5 = (float)(n & 0xFF) / 255.0f;
                GL11.glColor3f((float)f3, (float)f4, (float)f5);
                GL11.glPushMatrix();
                this.lllIIIllIIIIlllIlIIllIIll(class_08682, class_0483.lIlllIlllIIIIlIIlllIllIII("overlay"));
                GL11.glPopMatrix();
                GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_08682, class_21022);
            GL11.glDisable((int)32826);
            GL11.glPopMatrix();
        }
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return class_1511.lllIlIIlIIIlIlIIIllIlllIl;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, class_2102 class_21022) {
        float f = class_21022.IlIllllllIIlIIllllIIlIIIl();
        float f2 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        float f3 = class_21022.IlIIIIIllllllIIlllIllllll();
        float f4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        float f5 = 1.0f;
        float f6 = 0.5f;
        float f7 = 0.25f;
        GL11.glRotatef((float)(180.0f - this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII), (float)1.0f, (float)0.0f, (float)0.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f6, 0.0f - f7, 0.0, f, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5 - f6, 0.0f - f7, 0.0, f2, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f5 - f6, f5 - f7, 0.0, f2, f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0f - f6, f5 - f7, 0.0, f, f3);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }
}

