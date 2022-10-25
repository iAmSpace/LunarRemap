package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.client.settings.Options;

import java.util.List;
import java.util.Map;

class class_0547
extends class_0579 {
    private final List lllIlIIlIIIlIlIIIllIlllIl;
    private final Map llIIllIllIlIIlIIllIllllll;
    final /* synthetic */ class_0671 lllIIIllIIIIlllIlIIllIIll;

    public class_0547(class_0671 class_06712) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06712;
        super(class_06712.lllllIlllIIllIlIIlIIIllII, class_06712.IlIlIIlllIIlIllIIIlllllIl, class_06712.lIIlIIIIIlIlllIlIIlIlIlll, 32, class_06712.lIIlIIIIIlIlllIlIIlIlIlll - 65 + 4, 18);
        this.lllIlIIlIIIlIlIIIllIlllIl = Lists.newArrayList();
        this.llIIllIllIlIIlIIllIllllll = Maps.newHashMap();
        for (class_1977 class_19772 : class_0671.lllIIIllIIIIlllIlIIllIIll(class_06712).lIlllIlllIIIIlIIlllIllIII()) {
            this.llIIllIllIlIIlIIllIllllll.put(class_19772.lllIIIllIIIIlllIlIIllIIll(), class_19772);
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_19772.lllIIIllIIIIlllIlIIllIIll());
        }
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
        class_1977 class_19772 = (class_1977)this.llIIllIllIlIIlIIllIllllll.get(this.lllIlIIlIIIlIlIIIllIlllIl.get(n));
        class_0671.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(class_19772);
        class_0671.lllIlIIlIIIlIlIIIllIlllIl((class_0671)this.lllIIIllIIIIlllIlIIllIIll).IllIIlIIlIIIIlIlIlIIlIlIl = class_19772.lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.IlIIIIIllllllIIlllIllllll();
        this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0671.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll() || class_0671.lllIlIIlIIIlIlIIIllIlllIl((class_0671)this.lllIIIllIIIIlllIlIIllIIll).lllIlIlIIIlIllllIlllIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0671.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).lllIlIIlIIIlIlIIIllIlllIl());
        class_0671.IlIllllllIIlIIllllIIlIIIl((class_0671)this.lllIIIllIIIIlllIlIIllIIll).IllIIlllllllIIlIIlIIIIlIl = class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0]);
        class_0671.lIlllIlllIIIIlIIlllIllIII((class_0671)this.lllIIIllIIIIlllIlIIllIIll).IllIIlllllllIIlIIlIIIIlIl = class_0671.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll).IlIllllllIIlIIllllIIlIIIl(Options.IlIlIIlllIllllllllIIIlIlI);
        class_0671.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll).IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return ((String)this.lllIlIIlIIIlIlIIIllIlllIl.get(n)).equals(class_0671.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    protected int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll() * 18;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, ((class_1977)this.llIIllIllIlIIlIIllIllllll.get(this.lllIlIIlIIIlIlIIIllIlllIl.get(n))).toString(), this.IlIllllllIIlIIllllIIlIIIl / 2, n3 + 1, 0xFFFFFF);
        this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0671.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll).IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl());
    }
}

