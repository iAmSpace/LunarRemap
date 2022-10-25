package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.util.ArrayList;
import java.util.List;

public class class_0708
extends class_1716 {
    private final class_1326 IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_0115 IllIIlllllllIIlIIlIIIIlIl;
    private final class_0806 IIIllIllIIlIlIlIlIllllIIl;
    private final class_1746 IllIIIllIIIIlIlIlIllIIlll;
    private List lIIIIlIlIIlllllIIllIIlIII = new ArrayList();

    public class_0708(class_0115 class_01152) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1326(this);
        this.IllIIlllllllIIlIIlIIIIlIl = class_01152;
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0806("X");
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1746(1500L);
        this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl();
        this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl();
        new class_1024(this).start();
    }

    private float lIIIIlIlIIlllllIIllIIlIII() {
        return this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl() * 2.0f - 1.0f;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f + f3 - 4.0f, f2, 4.0f, f4);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(f4);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f + f3 - 12.0f, f2 + 2.0f, 10.0f, 10.0f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(f, f2);
        this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl(f, f2, bl);
        class_0210.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, 0.5f, -16777216, -14869219);
        LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f, -1);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 3.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 15.0f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 3.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 15.5f, 0x2FFFFFFF);
        if (this.lIIIIlIlIIlllllIIllIIlIII.isEmpty()) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 9.0f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 5.0f, -13158601);
            float f3 = this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f - 10.0f + (this.IlIllllllIIlIIllllIIlIIIl - 28.0f) * this.lIIIIlIlIIlllllIIllIIlIII() / 2.0f;
            class_0210.lllIIIllIIIIlllIlIIllIIll(f3, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 9.0f, f3 + 20.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII - 5.0f, -4180940);
        }
        int n = 0;
        for (String string : this.lIIIIlIlIIlllllIIllIIlIII) {
            LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(string, this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 18.0f + (float)(n * 10), -1);
            ++n;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        if (this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            class_0713.IlIlllIIIIIIlIIllIIllIlll().IlIllllllIIlIIllllIIlIIIl(this);
            return true;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIllllllIIlIIllllIIlIIIl(f, f2);
        }
        return false;
    }

    public class_0115 IIIllIllIIlIlIlIlIllllIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public List IllIIIllIIIIlIlIlIllIIlll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.lIIIIlIlIIlllllIIllIIlIII = list;
    }
}

