package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0226
extends class_1522 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/container/brewing_stand.png");
    private class_0647 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0226(class_0503 class_05032, class_0647 class_06472) {
        super(new class_0177(class_05032, class_06472));
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06472;
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
        class_0226.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        int n5 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
        if (n5 > 0) {
            int n6 = (int)(28.0f * (1.0f - (float)n5 / 400.0f));
            if (n6 > 0) {
                class_0226.lllIIIllIIIIlllIlIIllIIll(n3 + 97, n4 + 16, 176, 0, 9, n6);
            }
            int n7 = n5 / 2 % 7;
            switch (n7) {
                case 0: {
                    n6 = 29;
                    break;
                }
                case 1: {
                    n6 = 24;
                    break;
                }
                case 2: {
                    n6 = 20;
                    break;
                }
                case 3: {
                    n6 = 16;
                    break;
                }
                case 4: {
                    n6 = 11;
                    break;
                }
                case 5: {
                    n6 = 6;
                    break;
                }
                case 6: {
                    n6 = 0;
                }
            }
            if (n6 > 0) {
                class_0226.lllIIIllIIIIlllIlIIllIIll(n3 + 65, n4 + 14 + 29 - n6, 185, 29 - n6, 12, n6);
            }
        }
    }
}

