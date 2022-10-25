package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_2237
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/bat.png");
    private int lIllllIIlIIIlIllllllIIIll;

    public class_2237() {
        super(new class_0500(), 0.25f);
        this.lIllllIIlIIIlIllllllIIIll = ((class_0500)this.llIIllIllIlIIlIIllIllllll).lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0453 class_04532, double d, double d2, double d3, float f, float f2) {
        int n = ((class_0500)this.llIIllIllIlIIlIIllIllllll).lllIIIllIIIIlllIlIIllIIll();
        if (n != this.lIllllIIlIIIlIllllllIIIll) {
            this.lIllllIIlIIIlIllllllIIIll = n;
            this.llIIllIllIlIIlIIllIllllll = new class_0500();
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_04532, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0453 class_04532) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0453 class_04532, float f) {
        GL11.glScalef((float)0.35f, (float)0.35f, (float)0.35f);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0453 class_04532, double d, double d2, double d3) {
        super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_04532, d, d2, d3);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0453 class_04532, float f, float f2, float f3) {
        if (!class_04532.IlIIIIIllllllIIlllIllllll()) {
            GL11.glTranslatef((float)0.0f, (float)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * 0.3f) * 0.1f), (float)0.0f);
        } else {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
        }
        super.lllIIIllIIIIlllIlIIllIIll((class_1965)class_04532, f, f2, f3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0453)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0453)class_19652, f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0453)class_19652, f, f2, f3);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0453)class_19652, d, d2, d3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0453)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0453)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0453)class_15212, d, d2, d3, f, f2);
    }
}

