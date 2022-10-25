package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_2162
extends class_1522 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/container/crafting_table.png");

    public class_2162(class_0503 class_05032, class_1334 class_13342, int n, int n2, int n3) {
        super(new class_0491(class_05032, class_13342, n, n2, n3));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("container.crafting", new Object[0]), 28, 6, 0x404040);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("container.inventory", new Object[0]), 8, this.lIIIIlIlIIlllllIIllIIlIII - 96 + 2, 0x404040);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        int n3 = (this.IlIlIIlllIIlIllIIIlllllIl - this.IllIIIllIIIIlIlIlIllIIlll) / 2;
        int n4 = (this.lIIlIIIIIlIlllIlIIlIlIlll - this.lIIIIlIlIIlllllIIllIIlIII) / 2;
        class_2162.lllIIIllIIIIlllIlIIllIIll(n3, n4, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
    }
}

