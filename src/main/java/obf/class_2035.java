package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.Arrays;

import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.ArrayUtils;

public class class_2035
extends class_0079 {
    private final class_1681 lllIIIllIIIIlllIlIIllIIll;
    private final Minecraft lllIlIIlIIIlIlIIIllIlllIl;
    private final class_0677[] llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI = 0;

    public class_2035(class_1681 class_16812, Minecraft class_06672) {
        super(class_06672, class_16812.IlIlIIlllIIlIllIIIlllllIl, class_16812.lIIlIIIIIlIlllIlIIlIlIlll, 63, class_16812.lIIlIIIIIlIlllIlIIlIlIlll - 32, 20);
        this.lllIIIllIIIIlllIlIIllIIll = class_16812;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06672;
        Object[] arrobject = (class_1335[])ArrayUtils.clone((Object[])class_06672.gameSettings.llIlllllIIlIIlIIllllIllll);
        this.llIIllIllIlIIlIIllIllllll = new class_0677[arrobject.length + class_1335.IlIllllllIIlIIllllIIlIIIl().size()];
        Arrays.sort(arrobject);
        int n = 0;
        String string = null;
        Object[] arrobject2 = arrobject;
        int n2 = arrobject.length;
        for (int i = 0; i < n2; ++i) {
            int n3;
            Object object = arrobject2[i];
            String string2 = ((class_1335)object).IlIIIIIllllllIIlllIllllll();
            if (!string2.equals(string)) {
                string = string2;
                this.llIIllIllIlIIlIIllIllllll[n++] = new class_1836(this, string2);
            }
            if ((n3 = class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0616.lllIIIllIIIIlllIlIIllIIll(((class_1335)object).IIIllIIlIIIIIIlIlIIllIIlI(), new Object[0]))) > this.lllIIlIIIllllllIIIIlIlIlI) {
                this.lllIIlIIIllllllIIIIlIlIlI = n3;
            }
            this.llIIllIllIlIIlIIllIllllll[n++] = new class_1285(this, (class_1335)object, null);
        }
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.llIIllIllIlIIlIIllIllllll.length;
    }

    @Override
    public class_0677 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.llIIllIllIlIIlIIllIllllll[n];
    }

    @Override
    protected int lIlllIlllIIIIlIIlllIllIII() {
        return super.lIlllIlllIIIIlIIlllIllIII() + 15;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return super.IlIIIIIllllllIIlllIllllll() + 32;
    }

    static /* synthetic */ Minecraft lllIIIllIIIIlllIlIIllIIll(class_2035 class_20352) {
        return class_20352.lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ class_1681 lllIlIIlIIIlIlIIIllIlllIl(class_2035 class_20352) {
        return class_20352.lllIIIllIIIIlllIlIIllIIll;
    }

    static /* synthetic */ int IlIllllllIIlIIllllIIlIIIl(class_2035 class_20352) {
        return class_20352.lllIIlIIIllllllIIIIlIlIlI;
    }
}

