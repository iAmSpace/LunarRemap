package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_1917
extends class_1665 {
    public class_1917() {
        super("Boss bar");
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll("Boss Bar", 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_1217.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(true);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1217 class_12172) {
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_12172.lllIIIllIIIIlllIlIIllIIll());
        if (class_0178.IlIllllllIIlIIllllIIlIIIl == null || class_0178.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
            String string;
            this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.lllIIlIIIllllllIIIIlIlIlI);
            class_1854 class_18542 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll;
            class_0321 class_03212 = new class_0321(this.lIIlIIIIIlIlllIlIIlIlIlll, this.lIIlIIIIIlIlllIlIIlIlIlll.displayWidth, this.lIIlIIIIIlIlllIlIIlIlIlll.displayHeight);
            int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
            int n2 = 182;
            int n3 = 0;
            float f = 1.0f;
            int n4 = (int)(f * (float)(n2 + 1));
            int n5 = 13;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.25f);
            class_0210.lllIIIllIIIIlllIlIIllIIll(n3, n5, 0, 74, n2, 5);
            class_0210.lllIIIllIIIIlllIlIIllIIll(n3, n5, 0, 74, n2, 5);
            if (n4 > 0) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n3, n5, 0, 79, n4, 5);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            String string2 = string = "Wither";
            class_18542.lllIIIllIIIIlllIlIIllIIll(string2, this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(class_18542.lllIIIllIIIIlllIlIIllIIll(string2) / 2), (float)(n5 - 10), 0xFFFFFF);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.lllIIlIIIllllllIIIIlIlIlI);
            this.IlIllllllIIlIIllllIIlIIIl(182.0f, 20.0f);
        }
        GL11.glPopMatrix();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        GL11.glPushMatrix();
        this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
        if (class_0178.IlIllllllIIlIIllllIIlIIIl != null && class_0178.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_0210.lllIIlIIIllllllIIIIlIlIlI);
            --class_0178.lllIlIIlIIIlIlIIIllIlllIl;
            class_1854 class_18542 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll;
            class_0321 class_03212 = new class_0321(this.lIIlIIIIIlIlllIlIIlIlIlll, this.lIIlIIIIIlIlllIlIIlIlIlll.displayWidth, this.lIIlIIIIIlIlllIlIIlIlIlll.displayHeight);
            int n = class_03212.lllIIIllIIIIlllIlIIllIIll();
            int n2 = 182;
            int n3 = 0;
            int n4 = (int)(class_0178.lllIIIllIIIIlllIlIIllIIll * (float)(n2 + 1));
            int n5 = 12;
            class_0210.lllIIIllIIIIlllIlIIllIIll(n3, n5, 0, 74, n2, 5);
            class_0210.lllIIIllIIIIlllIlIIllIIll(n3, n5, 0, 74, n2, 5);
            if (n4 > 0) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(n3, n5, 0, 79, n4, 5);
            }
            String string = class_0178.IlIllllllIIlIIllllIIlIIIl;
            class_18542.lllIIIllIIIIlllIlIIllIIll(string, this.llIllllIlIllIIIlIllIIlIlI / 2.0f - (float)(class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2), (float)(n5 - 10), 0xFFFFFF);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.IlIllllllIIlIIllllIIlIIIl(182.0f, 20.0f);
        }
        GL11.glPopMatrix();
    }
}

