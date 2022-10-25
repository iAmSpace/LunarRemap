package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

class class_2028 {
    public class_2067 lllIIIllIIIIlllIlIIllIIll;
    public String lllIlIIlIIIlIlIIIllIlllIl;
    public long IlIllllllIIlIIllllIIlIIIl;
    public long lIlllIlllIIIIlIIlllIllIII = System.currentTimeMillis();
    public int IlIIIIIllllllIIlllIllllll = 2;
    public int lIllllIIlIIIlIllllllIIIll;
    public int IIIllIIlIIIIIIlIlIIllIIlI = 20;
    public int IllIIlllllllIIlIIlIIIIlIl = 0;
    final /* synthetic */ class_0738 IIIllIllIIlIlIlIlIllllIIl;

    class_2028(class_0738 class_07382, class_0321 class_03212, class_2067 class_20672, String string, long l) {
        this.IIIllIllIIlIlIlIlIllllIIl = class_07382;
        this.lllIIIllIIIIlllIlIIllIIll = class_20672;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = l;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_20672 == class_2067.IlIllllllIIlIIllllIIlIIIl ? 16 : 20;
        this.lIllllIIlIIIlIllllllIIIll = class_03212.lllIlIIlIIIlIlIIIllIlllIl() - 14 - this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IlIIIIIllllllIIlllIllllll = class_03212.lllIlIIlIIIlIlIIIllIlllIl() + this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.lIllllIIlIIIlIllllllIIIll != -1) {
            ++this.IllIIlllllllIIlIIlIIIIlIl;
            float f = (float)this.IllIIlllllllIIlIIlIIIIlIl * ((float)this.IllIIlllllllIIlIIlIIIIlIl / 5.0f) / 7.0f;
            if (this.IlIIIIIllllllIIlllIllllll > this.lIllllIIlIIIlIllllllIIIll) {
                if ((float)this.IlIIIIIllllllIIlllIllllll - f < (float)this.lIllllIIlIIIlIllllllIIIll) {
                    this.IlIIIIIllllllIIlllIllllll = this.lIllllIIlIIIlIllllllIIIll;
                    this.lIllllIIlIIIlIllllllIIIll = -1;
                } else {
                    this.IlIIIIIllllllIIlllIllllll = (int)((float)this.IlIIIIIllllllIIlllIllllll - f);
                }
            } else if (this.IlIIIIIllllllIIlllIllllll < this.lIllllIIlIIIlIllllllIIIll) {
                if ((float)this.IlIIIIIllllllIIlllIllllll + f > (float)this.lIllllIIlIIIlIllllllIIIll) {
                    this.IlIIIIIllllllIIlllIllllll = this.lIllllIIlIIIlIllllllIIIll;
                    this.lIllllIIlIIIlIllllllIIIll = -1;
                } else {
                    this.IlIIIIIllllllIIlllIllllll = (int)((float)this.IlIIIIIllllllIIlllIllllll + f);
                }
            } else if (this.IlIIIIIllllllIIlllIllllll == this.lIllllIIlIIIlIllllllIIIll) {
                this.lIllllIIlIIIlIllllllIIIll = -1;
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        LCFontRenderer class_09542 = LunarClient.getInstance().robotoLight16px;
        int n2 = this.IlIIIIIllllllIIlllIllllll;
        float f = class_09542.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl);
        int n3 = (int)(this.lllIIIllIIIIlllIlIIllIIll == class_2067.IlIllllllIIlIIllllIIlIIIl ? f + 10.0f : f + 30.0f);
        class_0210.lllIIIllIIIIlllIlIIllIIll(n - 5 - n3, n2, n - 5, n2 + this.IIIllIIlIIIIIIlIlIIllIIlI, -1358954496);
        switch (this.lllIIIllIIIIlllIlIIllIIll) {
            case lllIlIIlIIIlIlIIIllIlllIl: {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                class_0857.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/error-64.png"), 6.0f, (float)(n - 10 - n3 + 9), (float)(n2 + 4));
                class_0210.lllIIIllIIIIlllIlIIllIIll((float)(n - 10) - f - 4.5f, n2 + 4, (float)(n - 10) - f - 4.0f, n2 + this.IIIllIIlIIIIIIlIlIIllIIlI - 4, -1342177281);
                break;
            }
            case lllIIIllIIIIlllIlIIllIIll: {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.65f);
                class_0857.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/info-64.png"), 6.0f, (float)(n - 10 - n3 + 9), (float)(n2 + 4));
                class_0210.lllIIIllIIIIlllIlIIllIIll((float)(n - 10) - f - 4.5f, n2 + 4, (float)(n - 10) - f - 4.0f, n2 + this.IIIllIIlIIIIIIlIlIIllIIlI - 4, -1342177281);
            }
        }
        long l = this.IlIllllllIIlIIllllIIlIIIl - (this.lIlllIlllIIIIlIIlllIllIII + this.IlIllllllIIlIIllllIIlIIIl - System.currentTimeMillis());
        if (l > this.IlIllllllIIlIIllllIIlIIIl) {
            l = this.IlIllllllIIlIIllllIIlIIIl;
        }
        if (l < 0L) {
            l = 0L;
        }
        float f2 = f * ((float)l / (float)this.IlIllllllIIlIIllllIIlIIIl * 100.0f / 100.0f);
        class_0210.lllIIIllIIIIlllIlIIllIIll((float)(n - 10) - f, (float)(n2 + this.IIIllIIlIIIIIIlIlIIllIIlI) - 4.4f, (float)(n - 10) - f + f, n2 + this.IIIllIIlIIIIIIlIlIIllIIlI - 4, 0x30666666);
        class_0210.lllIIIllIIIIlllIlIIllIIll((float)(n - 10) - f, (float)(n2 + this.IIIllIIlIIIIIIlIlIIllIIlI) - 4.4f, (float)(n - 10) - f + f2, n2 + this.IIIllIIlIIIIIIlIlIIllIIlI - 4, -1878982912);
        class_09542.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, (float)(n - 10) - f, (float)(n2 + (this.lllIIIllIIIIlllIlIIllIIll == class_2067.IlIllllllIIlIIllllIIlIIIl ? 2 : 4)), -1);
    }
}

