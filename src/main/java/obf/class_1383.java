package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Collections;

public class class_1383
implements class_1251 {
    class_2013 lllIIIllIIIIlllIlIIllIIll;
    public ArrayList lllIlIIlIIIlIlIIIllIlllIl;

    public class_1383(class_2013 class_20132) {
        this.lllIIIllIIIIlllIlIIllIIll = class_20132;
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    }

    @Override
    public ArrayList lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.clear();
        for (int i = -1; i <= 1; ++i) {
            Object object = "notLoaded";
            Object object2 = null;
            try {
                object2 = class_1163.lllIIIllIIIIlllIlIIllIIll(i);
            }
            catch (Exception exception) {
                object2 = null;
            }
            if (object2 == null) continue;
            try {
                object = ((class_1163)object2).llIIlllIllIllllIIIlIIIIII();
            }
            catch (Exception exception) {
                object = "failedToLoad";
            }
            Object object3 = new class_1149((String)object, i);
            this.lllIlIIlIIIlIlIIIllIlllIl.add(object3);
        }
        for (Object object : this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI().lllIIIllIIIIlllIlIIllIIll()) {
            for (Object object3 : ((class_0368)object).IllIIlllllllIIlIIlIIIIlIl) {
                if (this.lllIIIllIIIIlllIlIIllIIll((Integer)object3) != null) continue;
                String string = "notLoaded";
                class_1163 class_11632 = null;
                try {
                    class_11632 = class_1163.lllIIIllIIIIlllIlIIllIIll((Integer)object3);
                }
                catch (Exception exception) {
                    class_11632 = null;
                }
                if (class_11632 == null) continue;
                try {
                    string = class_11632.llIIlllIllIllllIIIlIIIIII();
                }
                catch (Exception exception) {
                    string = "failedToLoad";
                }
                class_1149 class_11492 = new class_1149(string, (Integer)object3);
                this.lllIlIIlIIIlIlIIIllIlllIl.add(class_11492);
            }
        }
        Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, new class_2021(this));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        class_1149 class_11492 = this.lllIIIllIIIIlllIlIIllIIll(n);
        if (class_11492 == null) {
            class_11492 = new class_1149("notLoaded", n);
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_11492);
            Collections.sort(this.lllIlIIlIIIlIlIIIllIlllIl, new class_1393(this));
        }
        if (class_11492.lllIIIllIIIIlllIlIIllIIll.equals("notLoaded") || class_11492.lllIIIllIIIIlllIlIIllIIll.equals("failedToLoad")) {
            try {
                class_11492.lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft().theWorld.IlIlIIlllIIlIllIIIlllllIl.llIIlllIllIllllIIIlIIIIII();
            }
            catch (Exception exception) {
                class_11492.lllIIIllIIIIlllIlIIllIIll = "dimension " + n + "(" + Minecraft.getMinecraft().theWorld.IlIlIIlllIIlIllIIIlllllIl.getClass().getSimpleName() + ")";
            }
        }
    }

    @Override
    public class_1149 lllIIIllIIIIlllIlIIllIIll(int n) {
        for (class_1149 class_11492 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_11492.lllIlIIlIIIlIlIIIllIlllIl != n) continue;
            return class_11492;
        }
        return null;
    }

    public class_1149 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (class_1149 class_11492 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (!class_11492.lllIIIllIIIIlllIlIIllIIll.equals(string)) continue;
            return class_11492;
        }
        return null;
    }
}

