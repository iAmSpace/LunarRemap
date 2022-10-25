package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0239
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/wolf/wolf.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/wolf/wolf_tame.png");
    private static final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/wolf/wolf_angry.png");
    private static final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("textures/entity/wolf/wolf_collar.png");

    public class_0239(class_1382 class_13822, class_1382 class_13823, float f) {
        super(class_13822, f);
        this.lllIIIllIIIIlllIlIIllIIll(class_13823);
    }

    protected float lllIIIllIIIIlllIlIIllIIll(class_1305 class_13052, float f) {
        return class_13052.IIlIlIIIlIIllIlIlIlIlIIll();
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1305 class_13052, int n, float f) {
        if (n == 0 && class_13052.IIlIlIlIIlllIIIlIIIIlIIIl()) {
            float f2 = class_13052.lllIlIIlIIIlIlIIIllIlllIl(f) * class_13052.IlIlIIlIlIllIIlIlIIllIIIl(f);
            this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            GL11.glColor3f((float)f2, (float)f2, (float)f2);
            return 1;
        }
        if (n == 1 && class_13052.lllIIIIlIIllIIIlIllIlllII()) {
            this.lllIIIllIIIIlllIlIIllIIll(IllIIlllllllIIlIIlIIIIlIl);
            int n2 = class_13052.IlIlIIlllIIlIlllllIlIIIIl();
            GL11.glColor3f((float)class_1317.lIIIlIllllIlllIIIIIllIIIl[n2][0], (float)class_1317.lIIIlIllllIlllIIIIIllIIIl[n2][1], (float)class_1317.lIIIlIllllIlllIIIIIllIIIl[n2][2]);
            return 1;
        }
        return -1;
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1305 class_13052) {
        return class_13052.lllIIIIlIIllIIIlIllIlllII() ? lIllllIIlIIIlIllllllIIIll : (class_13052.IIIIlllllIlllIIllIIIlIllI() ? IIIllIIlIIIIIIlIlIIllIIlI : lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1305)class_19652, n, f);
    }

    @Override
    protected float IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1305)class_19652, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1305)class_15212);
    }
}

