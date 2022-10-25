package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;

import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_1471
extends class_1716 {
    private final class_0869 IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_0806 IllIIlllllllIIlIIlIIIIlIl;
    private final class_1326 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0806 IllIIIllIIIIlIlIlIllIIlll;
    private final int lIIIIlIlIIlllllIIllIIlIII = 12;
    private String llIIlllIllIllllIIIlIIIIII;

    public class_1471() {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0869(LunarClient.getInstance().robotoMedium13px, "", 0x2FFFFFFF, 0x6FFFFFFF);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll(256);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0806("SEND");
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1326(this);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0806("X");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f + 2.0f, f2 + f4 - 15.0f, f3 - 40.0f, 13.0f);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f + f3 - 37.0f, f2 + f4 - 15.0f, 35.0f, 13.0f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f + f3 - 6.0f, f2 + 12.0f + 3.0f, 4.0f, f4 - 32.0f);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f + f3 - 12.0f, f2 + 2.0f, 10.0f, 10.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(f, f2);
        class_0210.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, 0.5f, -16777216, -15395563);
        GL11.glPushMatrix();
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl - 0.5f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, -1357572843);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + 0.5f, -1357572843);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("Admin Console", this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 3.0f, -1);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 12.0f + 3.0f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 17.0f, -1356783327);
        this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll(f, f2, bl);
        try {
            if (LunarClient.getInstance().IlIIIlIIIIllIIIllIIIIIIll()) {
                GL11.glPushMatrix();
                GL11.glEnable((int)3089);
                class_0713 class_07132 = class_0713.IlIlllIIIIIIlIIllIIllIlll();
                class_0857.lllIIIllIIIIlllIlIIllIIll((int)(this.lllIIIllIIIIlllIlIIllIIll + 2.0f), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + 12.0f + 3.0f), (int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 2.0f), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 17.0f), (float)((int)((float)class_07132.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * class_07132.IlIIIIIllllllIIlllIllllll())), (int)class_07132.IIIllIIlIIIIIIlIlIIllIIlI());
                List list = LunarClient.getInstance().lIlIllIIlIIlIIlIIlIIlIIll();
                int n = 0;
                for (int i = list.size() - 1; i >= 0; --i) {
                    String string = (String)list.get(i);
                    String[] arrstring = LunarClient.getInstance().robotoMedium13px.lllIlIIlIIIlIlIIIllIlllIl(string, this.IlIllllllIIlIIllllIIlIIIl - 10.0f).split("\n");
                    n += arrstring.length * 10;
                    int n2 = 0;
                    for (String string2 : arrstring) {
                        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(string2, this.lllIIIllIIIIlllIlIIllIIll + 6.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 19.0f - (float)n + (float)(n2 * 10), -1);
                        ++n2;
                    }
                }
                this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll(n + 4);
                GL11.glDisable((int)3089);
                GL11.glPopMatrix();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII(f, f2, bl);
        GL11.glPopMatrix();
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll();
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl();
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllllIlllIIllIlIIlIIIllII()) {
            if (!this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl().equals("") && n == 28) {
                this.IllIIIllIIIIlIlIlIllIIlll();
            } else if (this.llIIlllIllIllllIIIlIIIIII != null && n == 200) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII);
            }
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(c, n);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2) && this.IIIllIIlIIIIIIlIlIIllIIlI.lllllIlllIIllIlIIlIIIllII()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(false);
        }
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        if (!bl) {
            return false;
        }
        if (!this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl().equals("") && this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IllIIIllIIIIlIlIlIllIIlll();
        }
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        if (this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + 12.0f) {
            this.IlIllllllIIlIIllllIIlIIIl(f, f2);
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            class_0713.IlIlllIIIIIIlIIllIIllIlll().IlIllllllIIlIIllllIIlIIIl(this);
            return true;
        }
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl();
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        String string;
        this.llIIlllIllIllllIIIlIIIIII = string = this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl();
        if (string.equals("clear") || string.equals("cls")) {
            LunarClient.getInstance().lIlIllIIlIIlIIlIIlIIlIIll().clear();
        } else {
            LunarClient.getInstance().lIlIllIIlIIlIIlIIlIIlIIll().add((Object)((Object)class_1227.IllIIlllllllIIlIIlIIIIlIl) + "> " + string);
            LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll((class_0688)new class_0375(string));
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("");
        this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, bl);
        return false;
    }

    public class_0869 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

