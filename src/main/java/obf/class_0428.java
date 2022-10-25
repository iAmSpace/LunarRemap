package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class class_0428
extends class_0164 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/witch.png");
    private final class_0654 lIllllIIlIIIlIllllllIIIll;

    public class_0428() {
        super(new class_0654(0.0f), 0.5f);
        this.lIllllIIlIIIlIllllllIIIll = (class_0654)this.llIIllIllIlIIlIIllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0066 class_00662, double d, double d2, double d3, float f, float f2) {
        ItemStack class_08972 = class_00662.lIIIIlIlIlIIIlIIllIIlIlIl();
        this.lIllllIIlIIIlIllllllIIIll.llIIllIllIlIIlIIllIllllll = class_08972 != null;
        super.lllIIIllIIIIlllIlIIllIIll(class_00662, d, d2, d3, f, f2);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0066 class_00662) {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0066 class_00662, float f) {
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_00662, f);
        ItemStack class_08972 = class_00662.lIIIIlIlIlIIIlIIllIIlIlIl();
        if (class_08972 != null) {
            float f2;
            GL11.glPushMatrix();
            if (this.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII) {
                f2 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.625f, (float)0.0f);
                GL11.glRotatef((float)-20.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)f2, (float)f2);
            }
            this.lIllllIIlIIIlIllllllIIIll.llIIlllIllIllllIIIlIIIIII.IlIllllllIIlIIllllIIlIIIl(0.0625f);
            GL11.glTranslatef((float)-0.0625f, (float)0.53125f, (float)0.21875f);
            if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1272 && class_1333.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII())) {
                f2 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)-0.3125f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(f2 *= 0.75f), (float)(-f2), (float)f2);
            } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bow) {
                f2 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.3125f);
                GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else if (class_08972.lllIIIllIIIIlllIlIIllIIll().IllIIlllllllIIlIIlIIIIlIl()) {
                f2 = 0.625f;
                if (class_08972.lllIIIllIIIIlllIlIIllIIll().IIIllIllIIlIlIlIlIllllIIl()) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.0f);
                }
                this.IlIllllllIIlIIllllIIlIIIl();
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                f2 = 0.375f;
                GL11.glTranslatef((float)0.25f, (float)0.1875f, (float)-0.1875f);
                GL11.glScalef((float)f2, (float)f2, (float)f2);
                GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GL11.glRotatef((float)-15.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_00662, class_08972, 0);
            if (class_08972.lllIIIllIIIIlllIlIIllIIll().IlIlIIlIlIllIIlIlIIllIIIl()) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_00662, class_08972, 1);
            }
            GL11.glPopMatrix();
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl() {
        GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)0.0f);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0066 class_00662, float f) {
        float f2 = 0.9375f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0066)class_03392, d, d2, d3, f, f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl((class_0066)class_19652, f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0066)class_19652, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0066)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0066)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0066)class_15212, d, d2, d3, f, f2);
    }
}

