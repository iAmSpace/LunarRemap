package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.Options;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class class_0382
extends class_0229 {
    private final class_0229 lllIIIllIIIIlllIlIIllIIll;
    private final GameSettings lllIlIIlIIIlIlIIIllIlllIl;
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private final List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    private String IlIIIIIllllllIIlllIllllll;
    private String[] lIllllIIlIIIlIllllllIIIll;
    private class_2087 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1197 IllIIlllllllIIlIIlIIIIlIl;

    public class_0382(class_0229 class_02292, GameSettings class_17512) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02292;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_17512;
    }

    @Override
    public void n_() {
        this.IlIIIIIllllllIIlllIllllll = class_0616.lllIIIllIIIIlllIlIIllIIll("options.snooper.title", new Object[0]);
        String string = class_0616.lllIIIllIIIIlllIlIIllIIll("options.snooper.desc", new Object[0]);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(string, this.IlIlIIlllIIlIllIIIlllllIl - 30)) {
            arrayList.add(string2);
        }
        this.lIllllIIlIIIlIllllllIIIll = arrayList.toArray(new String[0]);
        this.IlIllllllIIlIIllllIIlIIIl.clear();
        this.lIlllIlllIIIIlIIlllIllIII.clear();
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 152, this.lIIlIIIIIlIlllIlIIlIlIlll - 30, 150, 20, this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(Options.SNOOPER_ENABLED));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIlllllllIIlIIlIIIIlIl);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 30, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
        boolean bl = this.lllllIlllIIllIlIIlIIIllII.getIntegratedServer() != null && this.lllllIlllIIllIlIIlIIIllII.getIntegratedServer().IlIIIlIllIIIllIIIIlIIlIll() != null;
        for (Map.Entry entry : new TreeMap(this.lllllIlllIIllIlIIlIIIllII.IIllIllIIllIIlllIIIlIlllI().IlIllllllIIlIIllllIIlIIIl()).entrySet()) {
            this.IlIllllllIIlIIllllIIlIIIl.add((bl ? "C " : "") + (String)entry.getKey());
            this.lIlllIlllIIIIlIIlllIllIII.add(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IlIlIIlllIIlIllIIIlllllIl - 220));
        }
        if (bl) {
            for (Map.Entry entry : new TreeMap(this.lllllIlllIIllIlIIlIIIllII.getIntegratedServer().IlIIIlIllIIIllIIIIlIIlIll().IlIllllllIIlIIllllIIlIIIl()).entrySet()) {
                this.IlIllllllIIlIIllllIIlIIIl.add("S " + (String)entry.getKey());
                this.lIlllIlllIIIIlIIlllIllIII.add(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((String)entry.getValue(), this.IlIlIIlllIIlIllIIIlllllIl - 220));
            }
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_2087(this);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl();
                this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(Options.SNOOPER_ENABLED, 1);
                this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl = this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl(Options.SNOOPER_ENABLED);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIIIIllllllIIlllIllllll, this.IlIlIIlllIIlIllIIIlllllIl / 2, 8, 0xFFFFFF);
        int n3 = 22;
        for (String string : this.lIllllIIlIIIlIllllllIIIll) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, string, this.IlIlIIlllIIlIllIIIlllllIl / 2, n3, 0x808080);
            n3 += this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll;
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    static /* synthetic */ List lllIIIllIIIIlllIlIIllIIll(class_0382 class_03822) {
        return class_03822.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ List lllIlIIlIIIlIlIIIllIlllIl(class_0382 class_03822) {
        return class_03822.lIlllIlllIIIIlIIlllIllIII;
    }
}

