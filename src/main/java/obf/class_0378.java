package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0378
extends class_1522 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/container/furnace.png");
    private class_1587 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0378(class_0503 class_05032, class_1587 class_15872) {
        super(new class_1370(class_05032, class_15872));
        this.lllIlIIlIIIlIlIIIllIlllIl = class_15872;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        String string = this.lllIlIIlIIIlIlIIIllIlllIl.IIlllIlIlllIllIIIlllIIlIl() ? this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll() : class_0616.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll(), new Object[0]);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(string, this.IllIIIllIIIIlIlIlIllIIlll / 2 - this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string) / 2, 6, 0x404040);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("container.inventory", new Object[0]), 8, this.lIIIIlIlIIlllllIIllIIlIII - 96 + 2, 0x404040);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_0378.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll()) {
            int n5 = this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(13);
            class_0378.lllIIIllIIIIlllIlIIllIIll(n3 + 56, n4 + 36 + 12 - n5, 176, 12 - n5, 14, n5 + 1);
            n5 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(24);
            class_0378.lllIIIllIIIIlllIlIIllIIll(n3 + 79, n4 + 34, 176, 14, n5 + 1, 16);
        }
    }
}

