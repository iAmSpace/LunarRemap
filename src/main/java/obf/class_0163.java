package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class class_0163
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/snowman.png");
    private class_0792 lIllllIIlIIIlIllllllIIIll;

    public class_0163() {
        super(new class_0792(), 0.5f);
        this.lIllllIIlIIIlIllllllIIIll = (class_0792)this.llIIllIllIlIIlIIllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1405 class_14052, float f) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_14052, f);
        ItemStack class_08972 = new ItemStack(Blocks.lIlIIlllllIlllllIlIIIllll, 1);
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1272) {
            GL11.glPushMatrix();
            this.lIllllIIlIIIlIllllllIIIll.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl(0.0625f);
            if (class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII())) {
                float f2 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)-0.34375f, (float)0.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_14052, class_08972, 0);
            GL11.glPopMatrix();
        }
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1405 class_14052) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1405)class_19652, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1405)class_15212);
    }
}

