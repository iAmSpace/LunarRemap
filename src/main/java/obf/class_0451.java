package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Calendar;
import org.lwjgl.opengl.GL11;

public class class_0451
extends class_2052 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/chest/trapped_double.png");
    private static final ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("textures/entity/chest/christmas_double.png");
    private static final ResourceLocation lIlllIlllIIIIlIIlllIllIII = new ResourceLocation("textures/entity/chest/normal_double.png");
    private static final ResourceLocation IlIIIIIllllllIIlllIllllll = new ResourceLocation("textures/entity/chest/trapped.png");
    private static final ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("textures/entity/chest/christmas.png");
    private static final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("textures/entity/chest/normal.png");
    private class_0686 IllIIlllllllIIlIIlIIIIlIl = new class_0686();
    private class_0686 IIIllIllIIlIlIlIlIllllIIl = new class_1542();
    private boolean IllIIIllIIIIlIlIlIllIIlll;

    public class_0451() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.IllIIIllIIIIlIlIlIllIIlll = true;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0071 class_00712, double d, double d2, double d3, float f) {
        Object object;
        int n;
        if (!class_00712.lllIlIIlIIIlIlIIIllIlllIl()) {
            n = 0;
        } else {
            object = class_00712.IIIllIIlIIIIIIlIlIIllIIlI();
            n = class_00712.lIlllIlllIIIIlIIlllIllIII();
            if (object instanceof class_1041 && n == 0) {
                ((class_1041)object).IllIIIllIIIIlIlIlIllIIlll(class_00712.IIIIIIIIlIllIIllIIlllIllI(), class_00712.lllIlIIlIIIlIlIIIllIlllIl, class_00712.IlIllllllIIlIIllllIIlIIIl, class_00712.lIlllIlllIIIIlIIlllIllIII);
                n = class_00712.lIlllIlllIIIIlIIlllIllIII();
            }
            class_00712.lllIIIllIIIIlllIlIIllIIll();
        }
        if (class_00712.IIIllIllIIlIlIlIlIllllIIl == null && class_00712.lIIIIlIlIIlllllIIllIIlIII == null) {
            float f2;
            if (class_00712.IllIIIllIIIIlIlIlIllIIlll == null && class_00712.llIIlllIllIllllIIIlIIIIII == null) {
                object = this.IllIIlllllllIIlIIlIIIIlIl;
                if (class_00712.lllIIlIIIllllllIIIIlIlIlI() == 1) {
                    this.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll);
                } else if (this.IllIIIllIIIIlIlIlIllIIlll) {
                    this.lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(IIIllIIlIIIIIIlIlIIllIIlI);
                }
            } else {
                object = this.IIIllIllIIlIlIlIlIllllIIl;
                if (class_00712.lllIIlIIIllllllIIIIlIlIlI() == 1) {
                    this.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
                } else if (this.IllIIIllIIIIlIlIlIllIIlll) {
                    this.lllIIIllIIIIlllIlIIllIIll(IlIllllllIIlIIllllIIlIIIl);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII);
                }
            }
            GL11.glPushMatrix();
            GL11.glEnable((int)32826);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glTranslatef((float)((float)d), (float)((float)d2 + 1.0f), (float)((float)d3 + 1.0f));
            GL11.glScalef((float)1.0f, (float)-1.0f, (float)-1.0f);
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            int n2 = 0;
            if (n == 2) {
                n2 = 180;
            }
            if (n == 3) {
                n2 = 0;
            }
            if (n == 4) {
                n2 = 90;
            }
            if (n == 5) {
                n2 = -90;
            }
            if (n == 2 && class_00712.IllIIIllIIIIlIlIlIllIIlll != null) {
                GL11.glTranslatef((float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (n == 5 && class_00712.llIIlllIllIllllIIIlIIIIII != null) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-1.0f);
            }
            GL11.glRotatef((float)n2, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            float f3 = class_00712.lllIIlIIIllllllIIIIlIlIlI + (class_00712.llIIllIllIlIIlIIllIllllll - class_00712.lllIIlIIIllllllIIIIlIlIlI) * f;
            if (class_00712.IIIllIllIIlIlIlIlIllllIIl != null && (f2 = class_00712.IIIllIllIIlIlIlIlIllllIIl.lllIIlIIIllllllIIIIlIlIlI + (class_00712.IIIllIllIIlIlIlIlIllllIIl.llIIllIllIlIIlIIllIllllll - class_00712.IIIllIllIIlIlIlIlIllllIIl.lllIIlIIIllllllIIIIlIlIlI) * f) > f3) {
                f3 = f2;
            }
            if (class_00712.lIIIIlIlIIlllllIIllIIlIII != null && (f2 = class_00712.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI + (class_00712.lIIIIlIlIIlllllIIllIIlIII.llIIllIllIlIIlIIllIllllll - class_00712.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI) * f) > f3) {
                f3 = f2;
            }
            f3 = 1.0f - f3;
            f3 = 1.0f - f3 * f3 * f3;
            object.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll = -(f3 * (float)Math.PI / 2.0f);
            ((class_0686)object).lllIIIllIIIIlllIlIIllIIll();
            GL11.glDisable((int)32826);
            GL11.glPopMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742, double d, double d2, double d3, float f) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0071)class_17742, d, d2, d3, f);
    }
}

