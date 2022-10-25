package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_1744
extends class_1522 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/container/generic_54.png");
    private class_0850 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0850 IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_1744(class_0850 class_08502, class_0850 class_08503) {
        super(new class_0965(class_08502, class_08503));
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08502;
        this.IlIllllllIIlIIllllIIlIIIl = class_08503;
        this.IIlllIlIlllIllIIIlllIIlIl = false;
        int n = 222;
        int n2 = n - 108;
        this.lIlllIlllIIIIlIIlllIllIII = class_08503.IlIIIIIllllllIIlllIllllll() / 9;
        this.lIIIIlIlIIlllllIIllIIlIII = n2 + this.lIlllIlllIIIIlIIlllIllIII * 18;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl() ? this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll() : class_0616.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll(), new Object[0]), 8, 6, 0x404040);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.IIlllIlIlllIllIIIlllIIlIl() ? this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll() : class_0616.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll(), new Object[0]), 8, this.lIIIIlIlIIlllllIIllIIlIII - 96 + 2, 0x404040);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_1744.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIlllIlllIIIIlIIlllIllIII * 18 + 17);
        class_1744.lllIIIllIIIIlllIlIIllIIll(n3, n4 + this.lIlllIlllIIIIlIIlllIllIII * 18 + 17, 0, 126, this.IllIIIllIIIIlIlIlIllIIlll, 96);
    }
}

