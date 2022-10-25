package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_1270
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/sheep/sheep_fur.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/sheep/sheep.png");

    public class_1270(class_1382 class_13822, class_1382 class_13823, float f) {
        super(class_13822, f);
        this.lllIIIllIIIIlllIlIIllIIll(class_13823);
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1317 class_13172, int n, float f) {
        if (n == 0 && !class_13172.lllIIIIlIIllIIIlIllIlllII()) {
            this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            if (class_13172.IllIlIlIIIlIllIlIlIIlllII() && "jeb_".equals(class_13172.llllIIllllIllIlllllIIlIlI())) {
                boolean bl = true;
                int n2 = class_13172.IlllIIIllllIIllIllIlIIlIl / 25 + class_13172.llllllIlIllllIlIlIlIIIIlI();
                int n3 = n2 % class_1317.lIIIlIllllIlllIIIIIllIIIl.length;
                int n4 = (n2 + 1) % class_1317.lIIIlIllllIlllIIIIIllIIIl.length;
                float f2 = ((float)(class_13172.IlllIIIllllIIllIllIlIIlIl % 25) + f) / 25.0f;
                GL11.glColor3f((float)(class_1317.lIIIlIllllIlllIIIIIllIIIl[n3][0] * (1.0f - f2) + class_1317.lIIIlIllllIlllIIIIIllIIIl[n4][0] * f2), (float)(class_1317.lIIIlIllllIlllIIIIIllIIIl[n3][1] * (1.0f - f2) + class_1317.lIIIlIllllIlllIIIIIllIIIl[n4][1] * f2), (float)(class_1317.lIIIlIllllIlllIIIIIllIIIl[n3][2] * (1.0f - f2) + class_1317.lIIIlIllllIlllIIIIIllIIIl[n4][2] * f2));
            } else {
                int n5 = class_13172.IIlIlIlIIlllIIIlIIIIlIIIl();
                GL11.glColor3f((float)class_1317.lIIIlIllllIlllIIIIIllIIIl[n5][0], (float)class_1317.lIIIlIllllIlllIIIIIllIIIl[n5][1], (float)class_1317.lIIIlIllllIlllIIIIIllIIIl[n5][2]);
            }
            return 1;
        }
        return -1;
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1317 class_13172) {
        return lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1317)class_19652, n, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1317)class_15212);
    }
}

