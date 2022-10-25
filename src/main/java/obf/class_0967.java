package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;

import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_0967
extends class_1382 {
    class_0744 IIIllIIlIIIIIIlIlIIllIIlI;
    class_0744[] IllIIlllllllIIlIIlIIIIlIl = new class_0744[9];

    public class_0967() {
        int n = -16;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0744(this, 0, 0);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII += (float)(24 + n);
        Random random = new Random(1660L);
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            this.IllIIlllllllIIlIIlIIIIlIl[i] = new class_0744(this, 0, 0);
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f2 = ((float)(i / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n2 = random.nextInt(7) + 8;
            this.IllIIlllllllIIlIIlIIIIlIl[i].lllIIIllIIIIlllIlIIllIIll(-1.0f, 0.0f, -1.0f, 2, n2, 2);
            this.IllIIlllllllIIlIIlIIIIlIl[i].IlIllllllIIlIIllllIIlIIIl = f;
            this.IllIIlllllllIIlIIlIIIIlIl[i].IlIIIIIllllllIIlllIllllll = f2;
            this.IllIIlllllllIIlIIlIIIIlIl[i].lIlllIlllIIIIlIIlllIllIII = 31 + n;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, float f6, class_1521 class_15212) {
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            this.IllIIlllllllIIlIIlIIIIlIl[i].lIllllIIlIIIlIllllllIIIll = 0.2f * MathHelper.lllIIIllIIIIlllIlIIllIIll(f3 * 0.3f + (float)i) + 0.4f;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, f5, f6, class_15212);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f6);
        for (class_0744 class_07442 : this.IllIIlllllllIIlIIlIIIIlIl) {
            class_07442.lllIIIllIIIIlllIlIIllIIll(f6);
        }
        GL11.glPopMatrix();
    }
}

