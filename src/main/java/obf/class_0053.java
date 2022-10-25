package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class class_0053
extends class_1708 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/spider/cave_spider.png");

    public class_0053() {
        this.lIlllIlllIIIIlIIlllIllIII *= 0.7f;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0249 class_02492, float f) {
        GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0249 class_02492) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1051 class_10512) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0249)class_10512);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0249)class_19652, f);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0249)class_15212);
    }
}

