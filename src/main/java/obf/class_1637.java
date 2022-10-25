package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1637
extends class_0164 {
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/villager/villager.png");
    private static final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/villager/farmer.png");
    private static final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("textures/entity/villager/librarian.png");
    private static final ResourceLocation IIIllIllIIlIlIlIlIllllIIl = new ResourceLocation("textures/entity/villager/priest.png");
    private static final ResourceLocation IllIIIllIIIIlIlIlIllIIlll = new ResourceLocation("textures/entity/villager/smith.png");
    private static final ResourceLocation lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation("textures/entity/villager/butcher.png");
    protected class_1782 lllIIIllIIIIlllIlIIllIIll;

    public class_1637() {
        super(new class_1782(0.0f), 0.5f);
        this.lllIIIllIIIIlllIlIIllIIll = (class_1782)this.llIIllIllIlIIlIIllIllllll;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(class_1817 class_18172, int n, float f) {
        return -1;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1817 class_18172, double d, double d2, double d3, float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_18172, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1817 class_18172) {
        switch (class_18172.lllIIIlIllIlllIlIIllIllIl()) {
            case 0: {
                return IIIllIIlIIIIIIlIlIIllIIlI;
            }
            case 1: {
                return IllIIlllllllIIlIIlIIIIlIl;
            }
            case 2: {
                return IIIllIllIIlIlIlIlIllllIIl;
            }
            case 3: {
                return IllIIIllIIIIlIlIlIllIIlll;
            }
            case 4: {
                return lIIIIlIlIIlllllIIllIIlIII;
            }
        }
        return lIllllIIlIIIlIllllllIIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1817 class_18172, float f) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_18172, f);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1817 class_18172, float f) {
        float f2 = 0.9375f;
        if (class_18172.u_() < 0) {
            f2 = (float)((double)f2 * 0.5);
            this.lIlllIlllIIIIlIIlllIllIII = 0.25f;
        } else {
            this.lIlllIlllIIIIlIIlllIllIII = 0.5f;
        }
        GL11.glScalef((float)f2, (float)f2, (float)f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1817)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl((class_1817)class_19652, f);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, int n, float f) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1817)class_19652, n, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1817)class_19652, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1817)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1817)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1817)class_15212, d, d2, d3, f, f2);
    }
}

