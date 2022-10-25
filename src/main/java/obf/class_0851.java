package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class class_0851
extends class_1194 {
    private final int lllIIlIIIllllllIIIIlIlIlI;
    protected final List lllIIIllIIIIlllIlIIllIIll;

    public class_0851(int n, float f, int n2, int n3, int n4, int n5) {
        super(f, n2, n3, n4, n5);
        this.lllIIlIIIllllllIIIIlIlIlI = n;
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        for (int i = 0; i < LunarClient.getInstance().getModuleManager().lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
            class_1665 class_16652 = (class_1665) LunarClient.getInstance().getModuleManager().lllIIIllIIIIlllIlIIllIIll.get(i);
            this.lllIIIllIIIIlllIlIIllIIll.add(new class_0129(this, n, class_16652, f));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.IllIIIllIIIIlIlIlIllIIlll = 25;
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
            class_0129 class_01292 = (class_0129)this.lllIIIllIIIIlllIlIIllIIll.get(i);
            class_01292.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + 4 + i * 20, this.lIllllIIlIIIlIllllllIIIll - 8, 18);
            class_01292.IlIllllllIIlIIllllIIlIIIl = this.IIIllIllIIlIlIlIlIllllIIl;
            class_01292.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            this.IllIIIllIIIIlIlIlIllIIlll += class_01292.lllIIIllIIIIlllIlIIllIIll();
        }
        this.IlIllllllIIlIIllllIIlIIIl(n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        for (class_0129 class_01292 : this.lllIIIllIIIIlllIlIIllIIll) {
            if (!class_01292.lllIIIllIIIIlllIlIIllIIll(n, n2)) continue;
            class_01292.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }
}

