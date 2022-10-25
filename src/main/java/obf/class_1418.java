package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1418
extends class_1603 {
    private final class_1333 lllIIIllIIIIlllIlIIllIIll = new class_1333();

    public class_1418() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.5f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0543 class_05432, double d, double d2, double d3, float f, float f2) {
        class_1334 class_13342 = class_05432.IlIllllllIIlIIllllIIlIIIl();
        Block class_05492 = class_05432.lIlllIlllIIIIlIIlllIllIII();
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_05432.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_05432.llIIlIlIlllIIllIlIlllIllI);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_05432.IllIIIIllIIllIllIlllIlIIl);
        if (class_05492 != null && class_05492 != class_13342.a_(n, n2, n3)) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)d), (float)((float)d2), (float)((float)d3));
            this.lllIlIIlIIIlIlIIIllIlllIl(class_05432);
            GL11.glDisable((int)2896);
            if (class_05492 instanceof class_0628) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_13342;
                class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.lllIlIIlIIIlIlIIIllIlllIl((double)((float)(-n) - 0.5f), (double)((float)(-n2) - 0.5f), (double)((float)(-n3) - 0.5f));
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((class_0628)class_05492, n, n2, n3, class_05432.lllIIIllIIIIlllIlIIllIIll);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            } else if (class_05492 instanceof class_1141) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_13342;
                class_0868 class_08683 = class_0868.IlIIIIIllllllIIlllIllllll;
                class_08683.lllIlIIlIIIlIlIIIllIlllIl();
                class_08683.lllIlIIlIIIlIlIIIllIlllIl((double)((float)(-n) - 0.5f), (double)((float)(-n2) - 0.5f), (double)((float)(-n3) - 0.5f));
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((class_1141)class_05492, n, n2, n3);
                class_08683.lllIlIIlIIIlIlIIIllIlllIl(0.0, 0.0, 0.0);
                class_08683.lllIIIllIIIIlllIlIIllIIll();
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_05492);
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, class_13342, n, n2, n3, class_05432.lllIIIllIIIIlllIlIIllIIll);
            }
            GL11.glEnable((int)2896);
            GL11.glPopMatrix();
        }
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0543 class_05432) {
        return class_1511.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0543)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0543)class_15212, d, d2, d3, f, f2);
    }
}

